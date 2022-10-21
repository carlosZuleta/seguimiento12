package com.example.seguimientosemana12;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {

    private String operacion = "";
    @FXML
    private Label welcomeText;

    @FXML
    private TextField operacionText;

    @FXML
    private TextArea historialTextArea;

    @FXML
    private TextField resultText;

    @FXML
    private void onClick1(){

        operacion = operacion + " "+ "1";
        operacionText.setText(operacion);
    }
    @FXML
    private void onClick2(){
        operacion = operacion + " "+ "2";
        operacionText.setText(operacion);
    }
    @FXML
    private void onClick3(){
        operacion = operacion + " "+ "3";
        operacionText.setText(operacion);
    }
    @FXML
    private void onClick4(){
        operacion = operacion + " "+ "4";
        operacionText.setText(operacion);
    }
    @FXML
    private void onClick5(){
        operacion = operacion + " "+ "5";
        operacionText.setText(operacion);
    }
    @FXML
    private void onClick6(){
        operacion = operacion + " "+ "6";
        operacionText.setText(operacion);
    }
    @FXML
    private void onClick7(){
        operacion = operacion + " "+ "7";
        operacionText.setText(operacion);
    }
    @FXML
    private void onClick8() {
        operacion = operacion + " "+ "8";
        operacionText.setText(operacion);
    }
    @FXML
    private void onClick9(){
        operacion = operacion + " "+ "9";
        operacionText.setText(operacion);
    }
    @FXML
    private void onClick0(){
        operacion = operacion + " "+ "0";
        operacionText.setText(operacion);
    }
    @FXML
    private void onClickX(){operacion = operacion + " "+ "*";
        operacionText.setText(operacion);}
    @FXML
    private void onClickSum(){operacion = operacion + " "+ "+";
        operacionText.setText(operacion);}
    @FXML
    private void onClickRes(){operacion = operacion + " "+ "-";
        operacionText.setText(operacion);}
    @FXML
    private void onClickDiv(){operacion = operacion + " "+ "/";
        operacionText.setText(operacion);}



    @FXML
    private void onClickCalcular(){
        resultText.setText("operando...");


    }



}