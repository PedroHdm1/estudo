/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import br.edu.ifro.model.Carro;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author 04262487245
 */
public class PrincipalController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField txtn1;
    @FXML
    private TextField txtn2;
    @FXML
    private TextField txtresult;
    @FXML
    private Button soma;
    @FXML
    private Button subtrair;
    @FXML
    private Button multiplicar;
    @FXML
    private Button divisao;
    @FXML
    private TextField txtano;
    @FXML
    private TextField txtcor;
    @FXML
    private TextField txtmodelo;
    @FXML
    private Button gravar;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
   
            
    }    

    @FXML
    private void soma(ActionEvent event) {
           Double n1, n2, res;
        n1 = Double.parseDouble(txtn1.getText());
        n2 = Double.parseDouble(txtn2.getText());
        
        res= n1 + n2;
        
         txtresult.setText(res.toString());
            
    }
    @FXML
    private void subtrair (ActionEvent event) {
           Double n1, n2, res;
           
        n1 = Double.parseDouble(txtn1.getText());
        n2 = Double.parseDouble(txtn2.getText());
        
        res= n1 - n2;
        
         txtresult.setText(res.toString());
            
    }
    @FXML
       private void multiplicar (ActionEvent event) {
           Double n1, n2, res;
        n1 = Double.parseDouble(txtn1.getText());
        n2 = Double.parseDouble(txtn2.getText());
        
        res= n1 * n2;
        
         txtresult.setText(res.toString());
            
    }
       @FXML
        private void divisao (ActionEvent event) {
           Double n1, n2, res;
        n1 = Double.parseDouble(txtn1.getText());
        n2 = Double.parseDouble(txtn2.getText());
        
        res= n1 / n2;
        
         txtresult.setText(res.toString());
}
        
               @FXML
        private void gravar (ActionEvent event) {
                   EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
                   EntityManeger em = emf.createEntityManager();
                   
                   Carro carro = new carro();
                   carro.setAno(Integer.parseInt(txtano.getText()));
                   carro.setCor (txtcor.getText());
                   carro.setModelo(txtmodelo.getText());
                   
                    em.getTransaction().begin();
                    em.persist(carro);
}
}
