package com.example.august2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class calculator extends AppCompatActivity {
    EditText firstvalue, secondvalue;
    TextView answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        firstvalue= findViewById(R.id.first_value);
        secondvalue=findViewById(R.id.second_value);
        answer=findViewById(R.id.answer_box);
    }
    public void docalculation(View view)
    {
        String firstvalueString=firstvalue.getText().toString();
        String secondvalueString=secondvalue.getText().toString();

        if(firstvalueString.isEmpty() || secondvalueString.isEmpty() )
        {
            Toast.makeText(calculator.this,"invalid input", Toast.LENGTH_LONG).show();
        }else{
            try {
                int firstvalueInt=Integer.parseInt(firstvalueString);
                int secondvalueInt=Integer.parseInt(secondvalueString);
                int answerInt=0;

                switch (view.getId()){
                    case R.id.addition_button:
                       answerInt=firstvalueInt+secondvalueInt;
                       break;
                    case R.id.substraction_button:
                        answerInt=firstvalueInt-secondvalueInt;
                        break;
                    case R.id.multiply_button:
                        answerInt=firstvalueInt*secondvalueInt;
                        break;
                    default:
                        answerInt=firstvalueInt/secondvalueInt;
                        break;


                }
                String answerString= String.valueOf(answerInt);
                answer.setText("answer is"+answerString);
                
            }catch (Exception e){
                Toast.makeText(calculator.this,"use your brain", Toast.LENGTH_LONG).show();
            }
        }



    }





}