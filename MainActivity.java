package com.example.user.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText op1,op2;
    TextView results;
    Button btnadd,btnsub,btnmul,btndiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        op1=findViewById(R.id.op1);
        op2=findViewById(R.id.op2);
        results=findViewById(R.id.results);
        btnadd=findViewById(R.id.add);
        btnsub=findViewById(R.id.sub);
        btnmul=findViewById(R.id.mul);
        btndiv=findViewById(R.id.div);

    }

    public void add(View view) {
        String op1str=op1.getText().toString();
        String op2str=op2.getText().toString();

        if(!op1str.equals("")&& !op2str.equals(""))
        {

            double operand1=Double.parseDouble(op1str);
            double operand2=Double.parseDouble(op2str);

            double res=operand1+operand2;
            results.setText("result is: "+res);



        }
        else
            results.setText("Please enter the values");
    }

    public void sub(View view) {
        String op1str=op1.getText().toString();
        String op2str=op2.getText().toString();

        if(!op1str.equals("")&& !op2str.equals(""))
        {

            double operand1=Double.parseDouble(op1str);
            double operand2=Double.parseDouble(op2str);

            double res=operand1-operand2;
            results.setText("result is: "+res);



        }
        else
            results.setText("Please enter the values");
    }

    public void mul(View view) {
        String op1str=op1.getText().toString();
        String op2str=op2.getText().toString();

        if(!op1str.equals("")&& !op2str.equals(""))
        {

            double operand1=Double.parseDouble(op1str);
            double operand2=Double.parseDouble(op2str);

            double res=operand1*operand2;
            results.setText("result is: "+res);



        }
        else
            results.setText("Please enter the values");
    }

    public void div(View view) {
        String op1str=op1.getText().toString();
        String op2str=op2.getText().toString();

        if(!op1str.equals("")&& !op2str.equals(""))
        {

            double operand1=Double.parseDouble(op1str);
            double operand2=Double.parseDouble(op2str);

            double res=operand1/operand2;
            results.setText("result is: "+res);



        }
        else
            results.setText("Please enter the values");
    }
}
