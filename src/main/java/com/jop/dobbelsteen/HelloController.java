package com.jop.dobbelsteen;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    private TextField textfieldies;

    @FXML
    private Circle A;
    @FXML
    private Circle B;
    @FXML
    private Circle C;
    @FXML
    private Circle D;
    @FXML
    private Circle E;
    @FXML
    private Circle F;
    @FXML
    private Circle G;

    @FXML
    protected void Confirm() {
        int rand = (int) (Math.random()*6+1);
        if(rand == 1){
            Thrown_one();
        }else if(rand == 2){
            Thrown_two();
        }else if (rand == 3){
            Thrown_three();
        }else if (rand == 4){
            Thrown_four();
        }else if (rand == 5){
            Thrown_five();
        }else if(rand == 6){
            Thrown_six();
        }

    }


    private void Thrown_one(){
        textfieldies.setText("1");
        A.setVisible(false);
        B.setVisible(false);
        C.setVisible(false);
        D.setVisible(true);
        E.setVisible(false);
        F.setVisible(false);
        G.setVisible(false);
    }
    private void Thrown_two(){
        textfieldies.setText("2");
        A.setVisible(true);
        B.setVisible(false);
        C.setVisible(false);
        D.setVisible(false);
        E.setVisible(false);
        F.setVisible(false);
        G.setVisible(true);
    }
    private void Thrown_three(){
        textfieldies.setText("3");
        A.setVisible(true);
        B.setVisible(false);
        C.setVisible(false);
        D.setVisible(true);
        E.setVisible(false);
        F.setVisible(false);
        G.setVisible(true);
    }
    private void Thrown_four(){
        textfieldies.setText("4");
        A.setVisible(true);
        B.setVisible(false);
        C.setVisible(true);
        D.setVisible(false);
        E.setVisible(true);
        F.setVisible(false);
        G.setVisible(true);
    }
    private void Thrown_five(){
        textfieldies.setText("5");
        A.setVisible(true);
        B.setVisible(false);
        C.setVisible(true);
        D.setVisible(true);
        E.setVisible(true);
        F.setVisible(false);
        G.setVisible(true);
    }
    private void Thrown_six(){
        textfieldies.setText("6");
        A.setVisible(true);
        B.setVisible(true);
        C.setVisible(true);
        D.setVisible(false);
        E.setVisible(true);
        F.setVisible(true);
        G.setVisible(true);
    }
}