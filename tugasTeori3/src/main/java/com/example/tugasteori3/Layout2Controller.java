package com.example.tugasteori3;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;

import java.io.IOException;



public class Layout2Controller {
    @FXML
    private Button but1;

    @FXML
    private TextField txtNama;

    @FXML
    private TextField txtUAS;

    @FXML
    private TextField txtKAT;

    @FXML
    private TextField txtUTS;

    private Student student;

    private Layout1Controller controller;

    public void setController (Layout1Controller controller){
        this.controller = controller;
    }



    public void buttonAction2(ActionEvent actionEvent) throws IOException {
        Student student = new Student();
        student.setNama(txtNama.getText());
        student.setKAT(Float.parseFloat(txtKAT.getText()));
        student.setUAS(Float.parseFloat(txtUAS.getText()));
        student.setUTS(Float.parseFloat(txtUTS.getText()));
        controller.getStudents().add(student);
        txtNama.setText("");
        txtKAT.setText("");
        txtUAS.setText("");
        txtUTS.setText("");
        ((Node) actionEvent.getSource()).getScene().getWindow().hide();

    }

}
