package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {
    @FXML TextField txtTexto;
    @FXML ListView listaEjer;
    @FXML Label lblResultado;
    @FXML protected void initialize(){
        listaEjer.getItems().addAll("Ejercicio 1", "Ejercicio 2", "Ejercicio 3", "Ejercicio 4", "Ejercicio 5", "Ejercicio 6", "Ejercicio 7", "Ejercicio 8", "Ejercicio 9", "Ejercicio 10", "Ejercicio 11", "Ejercicio 13", "Ejercicio 14", "Ejercicio 15", "Ejercicio 16", "Ejercicio 17", "Ejercicio 18", "Ejercicio 19");
    }
    public void procesar(ActionEvent event){
        int seleccion = listaEjer.getSelectionModel().getSelectedIndex();
        String texto = txtTexto.getText();
        String expresion="";
        switch (seleccion){
            case 0:{
                expresion="[^db]";
                break;
            }
            case 1: {
                expresion="[count]$";
                break;
            }
            case 2: {
                expresion="";
                break;
            }
            case 3: {
                expresion="[a-zA-Z0-9]{12}";
                break;
            }
            case 4: {
                expresion="^[A-Z][a-bA-Z]$";
                break;
            }
            case 5: {
                expresion="[0-1]{8}";
                break;
            }
            case 6: {
                expresion="[A-F0-9]";
                break;
            }
            case 7: {
                expresion="";
                break;
            }
            case 8: {
                expresion="^[18CG][0-9]{8}";
                break;
            }
            case 9: {
                expresion="";
                break;
            }
            case 10: {
                expresion="^[$][0-9]";
                break;
            }
            case 11: {
                expresion="[0-9]{16}";
                break;
            }
            case 12: {
                expresion="^[<][a-z][>]$";
                break;
            }
            case 13: {
                expresion="^[#][A-F0-9]{7}";
                break;
            }
            case 14: {
                expresion="^[https://][a-zA-Z0-9][.com]$";
                break;
            }
            case 15: {
                expresion="";
                break;
            }
            case 16: {
                expresion="";
                break;
            }
            case 17: {
                expresion="";
                break;
            }
            case 18: {
                expresion="^[https://www.youtube.com/watch?][a-zA-Z0-9]%7B13%7D$";
                break;
            }
        }
        Pattern patron=Pattern.compile(expresion);
        Matcher matcher=patron.matcher(texto);
        if (matcher.matches()){
            lblResultado.setText("SI CUMPLE");
        }else{
            lblResultado.setText("NO CUMPLE");
        }
    }
}
