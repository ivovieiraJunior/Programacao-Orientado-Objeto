package controles;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.beans.binding.BooleanBinding;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import model.Produto;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ProdutoControles implements Initializable {
	@FXML
	private TableView<Produto> tabelaProduto;
	@FXML
	private TableView<Produto> tabelaCarrinho;
	@FXML
	private TableColumn<Produto, String> colunaProdutoCarrinho;
	@FXML
	private TableColumn<Produto, String> colunaPrecoCarrinho;
	@FXML
	private TableColumn<Produto, String> colunaMercadoCarrinho;
	@FXML
	private TableColumn<Produto, String> colunaProduto;
	@FXML
	private TableColumn<Produto, String> colunaPreco;
	@FXML
	private TableColumn<Produto, Integer> colunaMercado;
	@FXML
	private Button buscar;
	@FXML
	private Button botaoAdicionar;
	@FXML
	private Button botaoDeletar;
	@FXML
	private Button botaoInserir;
	@FXML
	private TextField TextFieldBusca;
	@FXML
	private TextField TextFieldNome;
	@FXML
	private TextField TextFieldPreco;
	@FXML
	private TextField TextFieldMercado;
	@FXML
	private Label ValorDaCompra;
	
	private MainApp mainApp;
	
	private ProdutoControles controle;
	
	private ObservableList<Produto> produtoBusca = FXCollections.observableArrayList();
	
	private ObservableList<Produto> Carrinho = FXCollections.observableArrayList();
	
	private double CarrinhoValorTotal = 0.0; 
	
	//daoPt = DaoProduto- para busca um observerList
	DaoProduto daoPt = new DaoProduto();
	
	public ProdutoControles() {
		
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		controle = new ProdutoControles();
		configuraColunas();
		configuraBindings();
		//atualizaDadosTabela();
	}
	

	private void configuraBindings() {
		BooleanBinding algoSelecionado = tabelaProduto.getSelectionModel().selectedItemProperty().isNull();
		BooleanBinding algoSelecionado2 = tabelaCarrinho.getSelectionModel().selectedItemProperty().isNull();
		
	}
	
	@FXML
	public void buscarProduto() {
		String busca = TextFieldBusca.getText();
		
		produtoBusca = daoPt.BuscaProduto(busca);
		
		AtualizarTabela(produtoBusca);
		
	}
	
	@FXML
	public void inserir() {
		tabelaProduto.setItems(null);
//            TextFieldNome.setText();
//            TextFieldPreco.setText();
//            TextFieldNome.setText();
       
    }
		
//	public boolean InserirProduto() {
//		String errorMessage = "";
//		String nome = "";
//		int idMercado = 0;
//		double preco = 0.0;
//		if (TextFieldNome.getText() == null || TextFieldNome.getText().length() == 0) {
//            errorMessage += "Entre com Nome do Produto!\n";
//        }else {
//        	nome = TextFieldNome.getText();
//        }
//		if (TextFieldPreco.getText() == null || TextFieldPreco.getText().length() == 0) {
//	         errorMessage += "Entre com o Preço!\n";
//	    }else {
//	    	 try {
//	    		 preco = TextFieldPreco.getBaselineOffset();
//	         } catch (NumberFormatException e) {
//	        	 errorMessage += "Dados Invalidos somente numeros !!\n";
//	         }	    			
//	    }
//		if (TextFieldMercado.getText() == null || TextFieldMercado.getText().length() == 0) {
//            errorMessage += "Dados Invalidos somente numeros !!\n";
//        } else {
//            // try to parse the postal code into an int.
//            try {
//                idMercado = Integer.parseInt(TextFieldMercado.getText());
//            } catch (NumberFormatException e) {
//                errorMessage += "Dados Invalidos somente numeros!!\n";
//            }
//        }
//		 if (errorMessage.length() == 0) {
//			 	System.out.println("Inserido Com Sucesso!!");
//			 	Produto produto = new Produto(nome,preco,idMercado);
////			 	chamar a class pra add o produto
//			 	daoPt.addProduto(produto);
//			 return true;
//	        } else {
//	            // Show the error message.
//	            Alert alert = new Alert(AlertType.ERROR);
//	            //alert.initOwner(dialogStage);
//	            alert.setTitle("Erros Encontrados");
//	            alert.setHeaderText("Corriga os Apontamentos");
//	            alert.setContentText(errorMessage);
//
//	            alert.showAndWait();
//	            
//	            return false;
//	        }		
//			
//	}


	//Cuidado aos nomes as colunas = igual da classe declarada**
	private void configuraColunas() {
		colunaProduto.setCellValueFactory(new PropertyValueFactory<>("nome"));
		colunaPreco.setCellValueFactory(new PropertyValueFactory<>("preco"));
		colunaMercado.setCellValueFactory(new PropertyValueFactory<>("Mercado"));

		colunaProdutoCarrinho.setCellValueFactory(new PropertyValueFactory<>("nome"));
		colunaPrecoCarrinho.setCellValueFactory(new PropertyValueFactory<>("preco"));
		colunaMercadoCarrinho.setCellValueFactory(new PropertyValueFactory<>("Mercado"));
	}
	
	private void AtualizarTabela(ObservableList<Produto> resuldadoBanco) {
		if(resuldadoBanco != null) {
			
			tabelaProduto.setItems(resuldadoBanco);
			
			//limpar(); emplementar depois
			
		}else {
			Alert alert = new Alert(AlertType.INFORMATION);
            alert.initOwner(mainApp.getPrimaryStage());
            alert.setTitle("Falta o Nome de Produto foi inserido");
            alert.setHeaderText("Não foi inserido o Nome de nenhum Produto");
            alert.setContentText("Por Favor inserir um nome de produto.");
            alert.showAndWait();
            }

	}
	@FXML
	public void adicionar() {
		
		if (tabelaProduto.getSelectionModel().getSelectedItem() != null) {
			//Pega o Valor
			PegaValor(tabelaProduto.getSelectionModel().getSelectedItem().getPreco());
			// adiciona objeto
			Carrinho.add(tabelaProduto.getSelectionModel().getSelectedItem());
			
			atualizarCarrinho(Carrinho);
			
			atualizarValorCompra();
  
        } else {
            // Nothing selected.
            Alert alert = new Alert(AlertType.WARNING);
            alert.initOwner(mainApp.getPrimaryStage());
            alert.setTitle("Nenhum Produto Selecionado");
            alert.setHeaderText("Nenhum Produto Selecionada");
            alert.setContentText("Por Favor selecione um produto da tabela.");
            alert.showAndWait();
        }
    }
		
	private void atualizarCarrinho(ObservableList<Produto> carrinho) {
		if(carrinho != null) {
			
			tabelaCarrinho.setItems(carrinho);
			
			//limpar(); emplementar depois
			
		}else {
			colunaProduto.setText("Erro");
			colunaPreco.setText(" ");
			colunaMercado.setText(" ");
		}
		
	}


	private void atualizarValorCompra() {
//		Atualiza o valor Total da compra
//		PegaValor(tabelaProduto.getSelectionModel().getSelectedItem().getPreco());
		
//		Carrinho.add(tabelaProduto.getSelectionModel().getSelectedItem());
//		atualizarCarrinho(Carrinho);
		String valor = "R$ " + CarrinhoValorTotal;
		ValorDaCompra.setText(valor);
		
	}

	
	
	private void PegaValor(double valor) {
		CarrinhoValorTotal += valor;
//		System.out.println(valor + valor);
		
	}
	
	@FXML
	public void deletar() {
			
		if (tabelaCarrinho.getSelectionModel().getSelectedItem() != null) {
			// Retira o valor do Total
			float valor = tabelaCarrinho.getSelectionModel().getSelectedItem().getPreco();
			CarrinhoValorTotal = CarrinhoValorTotal -valor;
			// Remove o objeto 
			boolean removido = Carrinho.remove(tabelaCarrinho.getSelectionModel().getSelectedItem());
			// Atualizar a Tabela Carrinho
			atualizarCarrinho(Carrinho);
			// Atuliza o valor da compra
			atualizarValorCompra();
  
        } else {
            // Nothing selected.
            Alert alert = new Alert(AlertType.WARNING);
            alert.initOwner(mainApp.getPrimaryStage());
            alert.setTitle("Nenhum Produto Selecionado");
            alert.setHeaderText("Nenhum Produto Selecionada");
            alert.setContentText("Por Favor selecione um produto da tabela.");

            alert.showAndWait();
        }
	}

	public static ProdutoControles getInstancia() {
		return new ProdutoControles();
	}

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
		
		//ta setando os dados da observelist do main
		tabelaProduto.setItems(mainApp.getProdutos());
		tabelaCarrinho.setItems(mainApp.getProdutos());
	}

	
}
