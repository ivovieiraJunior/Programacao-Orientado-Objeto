package controles;

import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.Produto;

public class MainApp extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;
    
   private ObservableList<Produto> produto = FXCollections.observableArrayList();
   
   public MainApp() {
	   
	   	produto.add(new Produto("teste1", 2.3, 1));
		produto.add(new Produto("teste2", 2.4, 1));
		produto.add(new Produto("teste3", 1.2, 1));
		produto.add(new Produto("teste4", 3.4, 1));
		produto.add(new Produto("teste5", 3.2, 1));
		produto.add(new Produto("teste6", 1.2, 1));
		produto.add(new Produto("teste7", 2.2, 1));
   
   }
	
	public ObservableList<Produto> getProdutos(){
		return produto;
	}
	
    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Minha Busca Produto");

        initRootLayout();

        showPersonOverview();
    }
    
    /**
     * Inicializa o root layout (layout base).
     */
    public void initRootLayout() {
        try {
            // Carrega o root layout do arquivo fxml.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("../view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();
            
            // Mostra a scene (cena) contendo o root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            //e.printStackTrace();
        }
    }

    /**
     * Mostra o person overview dentro do root layout.
     */
    public void showPersonOverview() {
        try {
            // Carrega o person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("../view/ProdutoView.fxml"));
            AnchorPane produtoview = (AnchorPane) loader.load();
            rootLayout.setCenter(produtoview);
            
            // Define o person overview dentro do root layout.
            ProdutoControles controller = loader.getController();
            controller.setMainApp(this);
            
           } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    /**
     * Retorna o palco principal.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }

}