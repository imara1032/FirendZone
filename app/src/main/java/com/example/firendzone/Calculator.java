package com.example.firendzone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculator extends AppCompatActivity {

    private EditText display;
    private Button ac,plusOrMin,magin,division,
        zero,one,two,three,four,five,six,seven,eight,nine,multiply,minus,plus,equal,dot;
    private double lastNum;
    private int operation=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        setButtonsAndDisplay();
        //setOnClickLitsners();
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText("0");
            }
        });

        plusOrMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double cal= Double.parseDouble(display.getText().toString());
                if(cal!=0) {
                    cal = cal * -1;
                    display.setText(Double.toString(cal));
                }
                else
                    display.setText("0");
            }
        });

        magin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double cal= Double.parseDouble(display.getText().toString());
                if(cal!=0){
                    cal=cal/100;
                    display.setText(Double.toString(cal));
                }
                else
                    display.setText("0");
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double cal=Double.parseDouble(display.getText().toString());
                if(cal!=0) {
                    lastNum = cal;
                    operation=1;
                }
                else
                    lastNum=0;
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double cal=Double.parseDouble(display.getText().toString());
                if(cal!=0) {
                    lastNum = cal;
                    operation=2;
                }
                else
                    lastNum=0;
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double cal=Double.parseDouble(display.getText().toString());
                if(cal!=0) {
                    lastNum = cal;
                    operation=3;
                }
                else
                    lastNum=0;
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double cal=Double.parseDouble(display.getText().toString());
                if(cal!=0) {
                    lastNum = cal;
                    operation=4;
                }
                else
                    lastNum=0;
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double cal=Double.parseDouble(display.getText().toString());
                if(lastNum==0 || cal==0 )
                    display.setText("0");
                if(cal==0)
                    display.setText("Error");
                else{
                    switch (operation){
                        case 1:
                            System.out.println("operation "+ lastNum + " "+operation+ " "+cal +" = "+ lastNum/cal);
                            cal=lastNum/cal;
                            display.setText(Double.toString(cal));
                            lastNum=0;
                            operation=0;
                            break;
                        case 2:
                            System.out.println("operation "+ lastNum + " "+operation+ " "+cal +" = "+ lastNum*cal);
                            cal=lastNum*cal;
                            display.setText(Double.toString(cal));
                            lastNum=0;
                            operation=0;
                            break;
                        case 3:
                            System.out.println("operation "+ lastNum + " "+operation+ " "+cal +" = "+ (lastNum-cal));
                            cal=lastNum-cal;
                            display.setText(Double.toString(cal));
                            lastNum=0;
                            operation=0;
                            break;
                        case 4:
                            System.out.println("operation "+ lastNum + " "+operation+ " "+cal +" = "+ (lastNum+cal));
                            cal=lastNum+cal;
                            display.setText(Double.toString(cal));
                            lastNum=0;
                            operation=0;
                            break;
                    }
                    }
                }

        });

        //Setup Numbers
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operation!=0)
                    display.setText("0");
                else {
                    lastNum=Double.parseDouble(display.getText().toString());
                    display.setText("0");
                }
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp=display.getText().toString();
                if(!temp.equals("0")&&(temp.contains(".") || operation==0)){
                  temp=temp+"1";
                  display.setText(temp);
                }
                else {
                    lastNum=Double.parseDouble(display.getText().toString());
                    display.setText("1");
                }
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp=display.getText().toString();
                if(!temp.equals("0")&&(temp.contains(".") || operation==0)){
                    temp=temp+"2";
                    display.setText(temp);
                }
                else {
                    lastNum=Double.parseDouble(display.getText().toString());
                    display.setText("2");

                }
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp=display.getText().toString();
                if(!temp.equals("0")&&(temp.contains(".") || operation==0)){
                    temp=temp+"3";
                    display.setText(temp);
                }
                else {
                    lastNum = Double.parseDouble(display.getText().toString());
                    display.setText("3");

                }
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp=display.getText().toString();
                if(!temp.equals("0")&&(temp.contains(".") || operation==0)){
                    temp=temp+"4";
                    display.setText(temp);
                }
                else {
                    lastNum=Double.parseDouble(display.getText().toString());
                    display.setText("4");
                }
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp=display.getText().toString();
                if(!temp.equals("0")&&(temp.contains(".") || operation==0)){
                    temp=temp+"5";
                    display.setText(temp);
                }
                else {
                    lastNum=Double.parseDouble(display.getText().toString());
                    display.setText("5");
                }
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp=display.getText().toString();
                if(!temp.equals("0")&&(temp.contains(".") || operation==0)){
                    temp=temp+"6";
                    display.setText(temp);
                }
                else {
                    lastNum=Double.parseDouble(display.getText().toString());
                    display.setText("6");
                }
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp=display.getText().toString();
                if(!temp.equals("0")&&(temp.contains(".") || operation==0)){
                    temp=temp+"7";
                    display.setText(temp);
                }
                else {
                    lastNum=Double.parseDouble(display.getText().toString());
                    display.setText("7");
                }
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp=display.getText().toString();
                if(!temp.equals("0")&&(temp.contains(".") || operation==0)){
                    temp=temp+"8";
                    display.setText(temp);
                }
                else {
                    lastNum=Double.parseDouble(display.getText().toString());
                    display.setText("8");
                }
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp=display.getText().toString();
                if(!temp.equals("0")&&(temp.contains(".") || operation==0)){
                    temp=temp+"9";
                    display.setText(temp);
                }
                else {
                    lastNum=Double.parseDouble(display.getText().toString());
                    display.setText("9");
                }
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cal=Integer.parseInt(display.getText().toString());
                if(cal!=0) {
                    String temp = display.getText().toString() + ".";
                    display.setText(temp);
                }
            }
        });


    }
    private void setOnClickLitsners(){
    }
    private void setButtonsAndDisplay(){
        display=findViewById(R.id.display);
        ac=findViewById(R.id.ac);
        plusOrMin=findViewById(R.id.plusOrMin);
        magin=findViewById(R.id.margin);
        division=findViewById(R.id.division);
        multiply=findViewById(R.id.multiply);
        minus=findViewById(R.id.minus);
        plus=findViewById(R.id.plus);
        equal=findViewById(R.id.equal);

        zero=findViewById(R.id.n0);
        one=findViewById(R.id.n1);
        two=findViewById(R.id.n2);
        three=findViewById(R.id.n3);
        four=findViewById(R.id.n4);
        five=findViewById(R.id.n5);
        six=findViewById(R.id.n6);
        seven=findViewById(R.id.n7);
        eight=findViewById(R.id.n8);
        nine=findViewById(R.id.n9);
        dot=findViewById(R.id.dot);


    }
}
