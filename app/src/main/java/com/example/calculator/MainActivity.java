package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    static Integer n=0;
    static float fin=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Character> symbolList=new ArrayList<>();
        ArrayList<Integer> numList= new ArrayList<>();
        TextView output=findViewById(R.id.outputView);

        findViewById(R.id.num0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n=(Integer) n * 10+0;
                output.setText(""+n);

            }
        });
        findViewById(R.id.num1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n=(Integer) n * 10+1;
                output.setText(""+n);

            }
        });
        findViewById(R.id.num2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n=(Integer) n * 10+2;
                output.setText(""+n);
            }
        });
        findViewById(R.id.num3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n=(Integer) n * 10+3;
                output.setText(""+n);
            }
        });
        findViewById(R.id.num4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<Float> store=new ArrayList<Float>();
                n=(Integer) n * 10+4;
                output.setText(""+n);
            }
        });
        findViewById(R.id.num5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n=(Integer) n * 10+5;
                output.setText(""+n);
            }
        });
        findViewById(R.id.num6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n=(Integer) n * 10+6;
                output.setText(""+n);
            }
        });
        findViewById(R.id.num7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n=(Integer) n * 10+7;
                output.setText(""+n);
            }
        });
        findViewById(R.id.num8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n=(Integer) n * 10+8;
                output.setText(""+n);
            }
        });
        findViewById(R.id.num9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n= (Integer) n * 10+9;
                output.setText(""+n);
            }
        });
        findViewById(R.id.ACButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n=0;
                for(int i=0;i<numList.size();i++){
                    numList.remove(i);
                }
                output.setText(""+n);
            }
        });
        findViewById(R.id.multiplyButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                numList.add( (Integer) n);
                symbolList.add('X');
                n=0;
                output.setText(""+n);

            }
        });
        findViewById(R.id.plusButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numList.add( (Integer) n);
                symbolList.add('+');n=0;
                output.setText(""+n);
            }
        });
        findViewById(R.id.minusButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numList.add( (Integer) n);
                symbolList.add('-');n=0;
                output.setText(""+n);
            }
        });
        findViewById(R.id.divideButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numList.add( (Integer) n);
                symbolList.add('%');n=0;
                output.setText(""+n);
            }
        });
        findViewById(R.id.cButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n = (int) n/10;
                output.setText(""+n);
            }
        });
        findViewById(R.id.leftBracket).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        findViewById(R.id.rightBracket).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        findViewById(R.id.dotButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        findViewById(R.id.equalButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int out=0;
                int c=0;
                    for(int i :numList){
                        if(symbolList.get(c)=='+'){
                            out=out+i;
                        }
                        if(symbolList.get(c)=='X'){
                            out=out*i;
                        }
                        if(symbolList.get(c)=='%'){
                            out=out/i;
                        }if(symbolList.get(c)=='-'){
                            out=out-i;
                        }
                        c+=1;
                    }output.setText(""+out);
            }
        });

    }
}