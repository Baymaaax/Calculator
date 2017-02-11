package com.nnnyt.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {
    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnPoint;
    private Button btnC;
    private Button btnDel;
    private Button btnAdd;
    private Button btnMinus;
    private Button btnMultiply;
    private Button btnDivide;
    private Button btnEqual;
    private EditText etInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0= (Button) findViewById(R.id.btn_0);
        btn1= (Button) findViewById(R.id.btn_1);
        btn2= (Button) findViewById(R.id.btn_2);
        btn3= (Button) findViewById(R.id.btn_3);
        btn4= (Button) findViewById(R.id.btn_4);
        btn5= (Button) findViewById(R.id.btn_5);
        btn6= (Button) findViewById(R.id.btn_6);
        btn7= (Button) findViewById(R.id.btn_7);
        btn8= (Button) findViewById(R.id.btn_8);
        btn9= (Button) findViewById(R.id.btn_9);
        btnPoint= (Button) findViewById(R.id.btn_point);
        btnAdd= (Button) findViewById(R.id.btn_add);
        btnMinus= (Button) findViewById(R.id.btn_minus);
        btnMultiply= (Button) findViewById(R.id.btn_multiply);
        btnDivide= (Button) findViewById(R.id.btn_divide);
        btnC= (Button) findViewById(R.id.btn_c);
        btnDel=(Button)findViewById(R.id.btn_del);
        btnEqual= (Button) findViewById(R.id.btn_equal);
        etInput= (EditText) findViewById(R.id.et_input);
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnPoint.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnC.setOnClickListener(this);
        btnDel.setOnClickListener(this);
        btnEqual.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        String str=etInput.getText().toString();
        switch (v.getId()) {
            case R.id.btn_0:etInput.setText(str+((Button)v).getText());break;
            case R.id.btn_1:etInput.setText(str+((Button)v).getText());break;
            case R.id.btn_2:etInput.setText(str+((Button)v).getText());break;
            case R.id.btn_3:etInput.setText(str+((Button)v).getText());break;
            case R.id.btn_4:etInput.setText(str+((Button)v).getText());break;
            case R.id.btn_5:etInput.setText(str+((Button)v).getText());break;
            case R.id.btn_6:etInput.setText(str+((Button)v).getText());break;
            case R.id.btn_7:etInput.setText(str+((Button)v).getText());break;
            case R.id.btn_8:etInput.setText(str+((Button)v).getText());break;
            case R.id.btn_9:etInput.setText(str+((Button)v).getText());break;
            case R.id.btn_point:etInput.setText(str+((Button)v).getText());break;
            case R.id.btn_c:etInput.setText("");break;
            case R.id.btn_del:if(str!=null&&!str.equals("")){
                etInput.setText(str.substring(0,str.length()-1));
            }
            case R.id.btn_add:etInput.setText(str+" "+((Button)v).getText()+" ");
            case R.id.btn_minus:etInput.setText(str+" "+((Button)v).getText()+" ");
            case R.id.btn_multiply:etInput.setText(str+" "+((Button)v).getText()+" ");
            case R.id.btn_divide:etInput.setText(str+" "+((Button)v).getText()+" ");

        }
    }
}
