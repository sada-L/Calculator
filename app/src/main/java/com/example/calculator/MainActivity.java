package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonOut;
    Button buttonOne;
    Button buttonTwo;
    Button buttonThree;
    Button buttonFour;
    Button buttonFive;
    Button buttonSix;
    Button buttonSeven;
    Button buttonEight;
    Button buttonNine;
    Button buttonZero;
    Button buttonComma;
    Button buttonCE;
    Button buttonDelete;
    Button buttonPlus;
    Button buttonMinus;
    Button buttonMult;
    Button buttonDivide;
    Button buttonEqual;

    String Num = " ";
    String Temp = " ";
    String Oper = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        buttonOut = findViewById(R.id.buttonOut);
        buttonOne = findViewById(R.id.buttonOne);
        buttonTwo = findViewById(R.id.buttonTwo);
        buttonThree = findViewById(R.id.buttonThree);
        buttonFour = findViewById(R.id.buttonFour);
        buttonFive = findViewById(R.id.buttonFive);
        buttonSix = findViewById(R.id.buttonSix);
        buttonSeven = findViewById(R.id.buttonSeven);
        buttonEight = findViewById(R.id.buttonEight);
        buttonNine = findViewById(R.id.buttonNine);
        buttonZero = findViewById(R.id.buttonZero);
        buttonComma = findViewById(R.id.buttonComma);
        buttonCE = findViewById(R.id.buttonCE);
        buttonDelete = findViewById(R.id.buttonDelete);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonMult = findViewById(R.id.buttonMult);
        buttonDivide = findViewById(R.id.buttonDivide);
        buttonEqual = findViewById(R.id.buttonEqual);

        buttonOut.setOnClickListener(clickListener);
        buttonOne.setOnClickListener(clickListener);
        buttonTwo.setOnClickListener(clickListener);
        buttonThree.setOnClickListener(clickListener);
        buttonFour.setOnClickListener(clickListener);
        buttonFive.setOnClickListener(clickListener);
        buttonSix.setOnClickListener(clickListener);
        buttonSeven.setOnClickListener(clickListener);
        buttonEight.setOnClickListener(clickListener);
        buttonNine.setOnClickListener(clickListener);
        buttonZero.setOnClickListener(clickListener);
        buttonComma.setOnClickListener(clickListener);
        buttonCE.setOnClickListener(clickListener);
        buttonDelete.setOnClickListener(clickListener);
        buttonPlus.setOnClickListener(clickListener);
        buttonMinus.setOnClickListener(clickListener);
        buttonMult.setOnClickListener(clickListener);
        buttonDivide.setOnClickListener(clickListener);
        buttonEqual.setOnClickListener(clickListener);

    }
    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(v.getId() == R.id.buttonOne){
                if (Oper == null) {
                    Num += "1";
                    buttonOut.setText(Num);
                }
                else {
                    Temp += "1";
                    buttonOut.setText(Temp);
                }
            }
            if(v.getId() == R.id.buttonTwo){
                if (Oper == null) {
                    Num += "2";
                    buttonOut.setText(Num);
                }
                else {
                    Temp += "2";
                    buttonOut.setText(Temp);
                }
            }
            if(v.getId() == R.id.buttonThree){
                if (Oper == null) {
                    Num += "3";
                    buttonOut.setText(Num);
                }
                else {
                    Temp += "3";
                    buttonOut.setText(Temp);
                }
            }
            if(v.getId() == R.id.buttonFour){
                if (Oper == null) {
                    Num += "4";
                    buttonOut.setText(Num);
                }
                else {
                    Temp += "4";
                    buttonOut.setText(Temp);
                }
            }
            if(v.getId() == R.id.buttonFive){
                if (Oper == null) {
                    Num += "5";
                    buttonOut.setText(Num);
                }
                else {
                    Temp += "5";
                    buttonOut.setText(Temp);
                }
            }
            if(v.getId() == R.id.buttonSix){
                if (Oper == null) {
                    Num += "6";
                    buttonOut.setText(Num);
                }
                else {
                    Temp += "6";
                    buttonOut.setText(Temp);
                }
            }
            if(v.getId() == R.id.buttonSeven){
                if (Oper == null) {
                    Num += "7";
                    buttonOut.setText(Num);
                }
                else {
                    Temp += "7";
                    buttonOut.setText(Temp);
                }
            }
            if(v.getId() == R.id.buttonEight){
                if (Oper == null) {
                    Num += "8";
                    buttonOut.setText(Num);
                }
                else {
                    Temp += "8";
                    buttonOut.setText(Temp);
                }
            }
            if(v.getId() == R.id.buttonNine){
                if (Oper == null) {
                    Num += "9";
                    buttonOut.setText(Num);
                }
                else {
                    Temp += "9";
                    buttonOut.setText(Temp);
                }
            }
            if(v.getId() == R.id.buttonZero){
                if (Oper == null) {
                    Num += "0";
                    buttonOut.setText(Num);
                }
                else {
                    Temp += "0";
                    buttonOut.setText(Temp);
                }
            }
            if(v.getId() == R.id.buttonComma){
                if (Oper == null) {
                    Num += ".";
                    buttonOut.setText(Num);
                }
                else {
                    Temp += ".";
                    buttonOut.setText(Temp);
                }
            }

            if(v.getId() == R.id.buttonCE){
                Num = " ";
                Temp = " ";
                Oper = null;
                buttonOut.setText(null);
            }
            if(v.getId() == R.id.buttonDelete){
                if (Oper == null) {
                    if(Num.length() > 0)
                        Num = Num.substring(0,Num.length()-1);
                    buttonOut.setText(Num);
                }
                else {
                    if(Num.length() > 0)
                        Temp = Temp.substring(0,Temp.length() - 1);
                    buttonOut.setText(Temp);
                }
            }

            if(v.getId() == R.id.buttonPlus){
                Oper = "plus";
                buttonOut.setText("+");
            }
            if(v.getId() == R.id.buttonMinus){
                Oper = "minus";
                buttonOut.setText("-");
            }
            if(v.getId() == R.id.buttonMult){
                Oper = "mult";
                buttonOut.setText("*");
            }
            if(v.getId() == R.id.buttonDivide){
                Oper = "divide";
                buttonOut.setText("/");
            }
            if(v.getId() == R.id.buttonEqual) {
                Num = String.valueOf(Calculation(Oper));
                buttonOut.setText(Num);
                Temp = "";
            }
        }
    };
    private double Calculation(String s){
        double eql = 0;
        switch (s){
            case "plus":
                eql = Double.parseDouble(Num) + Double.parseDouble(Temp);
                break;
            case "minus":
                eql = Double.parseDouble(Num) - Double.parseDouble(Temp);
                break;
            case "mult":
                eql = Double.parseDouble(Num) * Double.parseDouble(Temp);
                break;
            case "divide":
                eql = Double.parseDouble(Num) / Double.parseDouble(Temp);
                break;
        }
        return eql;
    }
}