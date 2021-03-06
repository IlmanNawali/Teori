package com.example.tugasteori3;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Layout1Controller implements Initializable {
    @FXML
    private TableView<Student> tab1;

    @FXML
    private TableColumn<Student, String> col1;

    @FXML
    private TableColumn<Student, String> col2;

    @FXML
    private TableColumn<Student, String> col3;

    @FXML
    private TableColumn<Student, String> col4;

    @FXML
    private TableColumn<Student, String> col5;

    private ObservableList<Student> students;

    private ObservableList<Float> KAT;
    private ObservableList<Float> UTS;
    private ObservableList<Float> UAS;
    private ObservableList<Float> RATA;

    public void buttonAction(ActionEvent actionEvent) throws IOException {
        Stage new_stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("layout2.fxml"));
        Parent root = fxmlLoader.load();
        Layout2Controller l2 = fxmlLoader.getController();
        l2.setController(this);

        Scene new_scene = new Scene(root);
        new_stage.setScene(new_scene);
        new_stage.initModality(Modality.APPLICATION_MODAL);
        new_stage.setTitle("Page 2");
        new_stage.show();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        students = FXCollections.observableArrayList();
        KAT = FXCollections.observableArrayList();
        UTS = FXCollections.observableArrayList();
        UAS = FXCollections.observableArrayList();
        RATA = FXCollections.observableArrayList();
        tab1.setItems(students);
        col1.setCellValueFactory(data->  new SimpleStringProperty(String.valueOf(data.getValue().getNama())));
        col2.setCellValueFactory(data->  new SimpleStringProperty(String.valueOf(data.getValue().getKAT())));
        col3.setCellValueFactory(data->  new SimpleStringProperty(String.valueOf(data.getValue().getUTS())));
        col4.setCellValueFactory(data->  new SimpleStringProperty(String.valueOf(data.getValue().getUAS())));
        col5.setCellValueFactory(data->  new SimpleStringProperty(String.valueOf(data.getValue().getRata())));
    }
    public ObservableList<Student> getStudents() {
        return students;
    }
}