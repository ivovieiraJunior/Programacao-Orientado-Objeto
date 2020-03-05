package view;

import controler.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Pessoa;

public class PersonOverViewController {

	@FXML
	private TableView<Pessoa> personTable;

	@FXML
	private TableColumn<Pessoa, String> colunaFtName;

	@FXML
	private TableColumn<Pessoa, String> colunaUtName;

	@FXML
	private Label ftNameLabel;

	@FXML
	private Label utNameLabel;

	@FXML
	private Label StreetLabel;

	@FXML
	private Label postalCodeLabel;

	@FXML
	private Label cityLabel;

	private MainApp mainApp;

	public PersonOverViewController(){

	}

	private void initialize(){
		colunaFtName.setCellValueFactory(cellData -> cellData.getValue().getFirstName());
		colunaUtName.setCellValueFactory(cellData -> cellData.getValue().getLastname());

		showPersonDetails(null);

		personTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> showPersonDetails(newValue));
	}

	private void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;

		personTable.setItems(mainApp.getPerson());
	}


	private void showPersonDetails(Object object) {
		// TODO Auto-generated method stub

	}

}
