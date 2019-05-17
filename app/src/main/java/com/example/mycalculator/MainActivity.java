package com.example.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnadd,btnsub,btnmul,btndiv,btnequal,btndot;
    Button btnclear;
    EditText ed1;
    float res1,res2;
    boolean add,sub,mul,div,decimal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btn0 = (Button)findViewById(R.id.btn0);
        btnadd = (Button)findViewById(R.id.btnadd);
        btnsub = (Button)findViewById(R.id.btnsub);
        btnmul = (Button)findViewById(R.id.btnmul);
        btndiv = (Button)findViewById(R.id.btndiv);
        btnequal = (Button)findViewById(R.id.btnequal);
        btndot = (Button)findViewById(R.id.btndot);
        btnclear = (Button)findViewById(R.id.btnclear);
        ed1 = (EditText)findViewById(R.id.editText);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"0");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(decimal)
                {
                    Toast.makeText(MainActivity.this, "It's 0.1", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    ed1.setText(ed1.getText() + ".");
                    decimal = true;
                }
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this, "Input tidak valid", Toast.LENGTH_SHORT).show();
                }
                else{
                    res1=Float.parseFloat(ed1.getText() +"");
                    add = true;
                    decimal = false;
                    ed1.setText(null);
                }
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this, "Input tidak valid", Toast.LENGTH_SHORT).show();
                }
                else{
                    res1=Float.parseFloat(ed1.getText() +"");
                    sub = true;
                    decimal = false;
                    ed1.setText(null);
                }
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this, "Input tidak valid", Toast.LENGTH_SHORT).show();
                }
                else{
                    res1=Float.parseFloat(ed1.getText() +"");
                    mul = true;
                    decimal = false;
                    ed1.setText(null);
                }
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().equals(""))
                {
                   // ed1.setText("");
                    Toast.makeText(MainActivity.this, "Input tidak valid", Toast.LENGTH_SHORT).show();
                }
                else{
                    res1=Float.parseFloat(ed1.getText() +"");
                    div = true;
                    decimal = false;
                    ed1.setText(null);
                }
            }
        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this, "Input tidak valid", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    res2 = Float.parseFloat(ed1.getText() + "");
                    if (add == true)
                    {
                        ed1.setText(res1 + res2 + "");
                        add = false;
                    }
                    else if (sub == true)
                    {
                        ed1.setText(res1 - res2 + "");
                        sub = false;
                    }
                    else if (mul == true)
                    {
                        ed1.setText(res1 * res2 + "");
                        mul = false;
                    }
                    else if (div == true)
                    {
                        if(res1 == 0 && res2 == 0)
                        {
                            Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                        }
                        else if(res2 == 0)
                        {
                            Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            ed1.setText(res1 / res2 + "");
                            div = false;
                        }
                    }
                }
            }
        });
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
            }
        });
    }
}
