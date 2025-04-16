package controller;


import java.time.temporal.TemporalAmount;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;

public class ControllerCalculadora {

    @FXML
    private Button bt0;

    @FXML
    private Button bt1;

    @FXML
    private Button bt2;

    @FXML
    private Button bt3;

    @FXML
    private Button bt4;

    @FXML
    private Button bt5;

    @FXML
    private Button bt6;

    @FXML
    private Button bt7;

    @FXML
    private Button bt8;

    @FXML
    private Button bt9;
    
    @FXML
    private Button btLimpar;

    @FXML
    private Button btbarra;

    @FXML
    private Button btigual;

    @FXML
    private Button btmais;

    @FXML
    private Button btmenos;

    @FXML
    private Button btmult;
    
    @FXML
    private Label lbMostrar;
    String val1 = "";
    String val2 = "";
    String operacao = "";
    boolean limpar = false;
   
    @FXML
    void action0(ActionEvent event) {
    	if(operacao.equals("")) {
    		val1 = val1 + "0";
    		lbMostrar.setText(lbMostrar.getText()+ "0");
    	}else {
    		val2 = val2 + "0";
    		lbMostrar.setText(lbMostrar.getText()+ "0");
    	}
    	System.out.println("O  primeiro numero é: "+val1);
    	System.out.println("O segundo numero é: "+val2);

    }

    @FXML
    void action1(ActionEvent event) {
    	if(operacao.equals("")) {
    		val1 = val1 + "1";
    		lbMostrar.setText(lbMostrar.getText()+ "1");
    	}else {
    		val2 = val2 + "1";
    		lbMostrar.setText(lbMostrar.getText()+ "1");
    	}
    	System.out.println("O  primeiro numero é: "+val1);
    	System.out.println("O segundo numero é: "+val2);

    }

    @FXML
    void action2(ActionEvent event) {
       	if(operacao.equals("")) {
    		val1 = val1 + "2";
    		lbMostrar.setText(lbMostrar.getText()+ "2");
    	}else {
    		val2 = val2 + "2";
    		lbMostrar.setText(lbMostrar.getText()+ "2");
    	}
    	System.out.println("O  primeiro numero é: "+val1);
    	System.out.println("O segundo numero é: "+val2);
    }

    @FXML
    void action3(ActionEvent event) {
       	if(operacao.equals("")) {
    		val1 = val1 + "3";
    		lbMostrar.setText(lbMostrar.getText()+ "3");
    	}else {
    		val2 = val2 + "3";
    		lbMostrar.setText(lbMostrar.getText()+ "3");
    	}
    	System.out.println("O  primeiro numero é: "+val1);
    	System.out.println("O segundo numero é: "+val2);

    }

    @FXML
    void action4(ActionEvent event) {
       	if(operacao.equals("")) {
    		val1 = val1 + "4";
    		lbMostrar.setText(lbMostrar.getText()+ "4");
    	}else {
    		val2 = val2 + "4";
    		lbMostrar.setText(lbMostrar.getText()+ "4");
    	}
    	System.out.println("O  primeiro numero é: "+val1);
    	System.out.println("O segundo numero é: "+val2);
    }

    @FXML
    void action5(ActionEvent event) {
       	if(operacao.equals("")) {
    		val1 = val1 + "5";
    		lbMostrar.setText(lbMostrar.getText()+ "5");
    	}else {
    		val2 = val2 + "5";
    		lbMostrar.setText(lbMostrar.getText()+ "5");
    	}
    	System.out.println("O  primeiro numero é: "+val1);
    	System.out.println("O segundo numero é: "+val2);
    }

    @FXML
    void action6(ActionEvent event) {
       	if(operacao.equals("")) {
    		val1 = val1 + "6";
    		lbMostrar.setText(lbMostrar.getText()+ "6");
    	}else {
    		val2 = val2 + "6";
    		lbMostrar.setText(lbMostrar.getText()+ "6");
    	}
    	System.out.println("O numero é: "+val1);
    	System.out.println("O segundo numero é: "+val2);
    }

    @FXML
    void action7(ActionEvent event) {
       	if(operacao.equals("")) {
    		val1 = val1 + "7";
    		lbMostrar.setText(lbMostrar.getText()+ "7");
    	}else {
    		val2 = val2 + "7";
    		lbMostrar.setText(lbMostrar.getText()+ "7");
    	}
    	System.out.println("O numero é: "+val1);
    	System.out.println("O segundo numero é: "+val2);
    }

    @FXML
    void action8(ActionEvent event) {
       	if(operacao.equals("")) {
    		val1 = val1 + "8";
    		lbMostrar.setText(lbMostrar.getText()+ "8");
    	}else {
    		val2 = val2 + "8";
    		lbMostrar.setText(lbMostrar.getText()+ "8");
    	}
    	System.out.println("O numero é: "+val1);
    	System.out.println("O segundo numero é: "+val2);
    }

    @FXML
    void action9(ActionEvent event) {
       	if(operacao.equals("")) {
    		val1 = val1 + "9";
    		lbMostrar.setText(lbMostrar.getText()+ "9");
    	}else {
    		val2 = val2 + "9";
    		lbMostrar.setText(lbMostrar.getText()+ "9");
    	}
    	System.out.println("O numero é: "+val1);
    	System.out.println("O segundo numero é: "+val2);
    }
    
    //operação a ser feita no botão de igual
    @FXML
    void actionIgual(ActionEvent event) {
	    
	    
	    if(val1.equals("0") && operacao.equals("/")) {
	    	Alert mensagem = new Alert(AlertType.ERROR);
        	mensagem.setTitle("Erro!");
        	mensagem.setHeaderText("Escolha outro número!");
        	mensagem.setContentText("Não existem números divididos por 0");
        	mensagem.show();
        	lbMostrar.setText("");
    		operacao = "";
    		val1 = "";
    		val2 = "";
	    }else if(val2.equals("0") && operacao.equals("/")){
	    	Alert mensagem = new Alert(AlertType.ERROR);
        	mensagem.setTitle("Erro!");
        	mensagem.setHeaderText("Escolha outro número!");
        	mensagem.setContentText("Não existem números divididos por 0");
        	mensagem.show();
        	lbMostrar.setText("");
    		operacao = "";
    		val1 = "";
    		val2 = "";
	    }else if(val2.equals("")) {
    		Alert mensagem = new Alert(AlertType.ERROR);
        	mensagem.setTitle("Erro!");
        	mensagem.setHeaderText("Escolha outro número!");
        	mensagem.setContentText("Clique em outro número para fazer a operação.");
        	mensagem.show();
        	lbMostrar.setText("");
    		operacao = "";
    		val1 = "";
    		val2 = "";
    	}else if(val1.equals("") && val2.equals("")) {
    		Alert mensagem = new Alert(AlertType.ERROR);
        	mensagem.setTitle("Erro!");
        	mensagem.setHeaderText("Escolha os números!");
        	mensagem.setContentText("Clique nos números para fazer a operação.");
        	mensagem.show();
        	lbMostrar.setText("");
    		operacao = "";
    		val1 = "";
    		val2 = "";
    	}else {
    		
    		Double valor1 = Double.parseDouble(val1);
    	    Double valor2 = Double.parseDouble(val2);
    	    
    	    Double resultado = 0.00 ;
	    
		    if(operacao == "+") {
		    	resultado = valor1 + valor2;
		    	limpar = true;
		    }else if(operacao == "-") {
		    	resultado = valor1 - valor2;
		    	limpar = true;
		    }else if(operacao == "*") {
		    	resultado = valor1 * valor2;
		    	limpar = true;
		    }else if(operacao == "/") {
		    	resultado = valor1 / valor2;
		    	limpar = true;
		    }
		    
		    
		lbMostrar.setText(resultado.toString());
		
		System.out.println("O resultado da operação é: "+ resultado);
    	}
    }
    

    @FXML
    void actionLimpar(ActionEvent event) {
    	if(limpar == true) {
    		lbMostrar.setText("");
    		operacao = "";
    		val1 = "";
    		val2 = "";
    	}
    }

    @FXML
    void actionMais(ActionEvent event) {
    	operacao = "+";
		lbMostrar.setText(lbMostrar.getText()+ "+");
		
    }

    @FXML
    void actionMenos(ActionEvent event) {
    	operacao = "-";
		lbMostrar.setText(lbMostrar.getText()+ "-");
    	
    }

    @FXML
    void actionMult(ActionEvent event) {
    	operacao = "*";
		lbMostrar.setText(lbMostrar.getText()+ "*");
		
    }

    @FXML
    void actionSub(ActionEvent event) {
    	operacao = "/";
		lbMostrar.setText(lbMostrar.getText()+ "/");
		
    }

}
