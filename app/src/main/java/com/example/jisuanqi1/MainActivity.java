package com.example.jisuanqi1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    String z,b;
    double d,b1,b2;
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn00;
    Button point,add,minus,multiply,divide,equal;
    Button ac,del,sqrt,x2,sin,cos,tan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //添加控件
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btn0=(Button)findViewById(R.id.btn0);
        btn00=(Button)findViewById(R.id.btn00);
        point=(Button)findViewById(R.id.point);
        add=(Button)findViewById(R.id.add);
        minus=(Button)findViewById(R.id.minus);
        multiply=(Button)findViewById(R.id.multiply);
        divide=(Button)findViewById(R.id.divide);
        equal=(Button)findViewById(R.id.equal);
        ac=(Button)findViewById(R.id.ac);
        del=(Button)findViewById(R.id.del);
        sqrt=(Button)findViewById(R.id.sqrt);
        x2=(Button)findViewById(R.id.x2);
        sin=(Button)findViewById(R.id.sin);
        cos=(Button)findViewById(R.id.cos);
        tan=(Button)findViewById(R.id.tan);

        tv=findViewById(R.id.t1);
//        re=findViewById(R.id.re);



        //事件监听
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"0");
            }
        });

        btn00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"00");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"5");

            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"6");

            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"7");

            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"8");

            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"9");

            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //字符串没有点时追加点
                String str= (String) tv.getText();
                if(!str.contains(".")){
                    tv.setText(tv.getText()+".");
                }
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                x= (String) tv.getText();
//                y="+";
//                tv.setText("");
                String x=tv.getText().toString();
                if(x.endsWith("+")||x.endsWith("-")||x.endsWith("×")||x.endsWith("÷")){//
                    x= x.substring(0,x.length()-1);
                    tv.setText(x+"+");
                }
                else{
                    tv.setText(tv.getText()+"+");
                }

            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                x= (String) tv.getText();
//                y="-";
//                tv.setText("");
                String x=tv.getText().toString();
                if(x.endsWith("+")||x.endsWith("-")||x.endsWith("×")||x.endsWith("÷")){
                    x= x.substring(0,x.length()-1);
                    tv.setText(x+"-");
                }
                else{
                    tv.setText(tv.getText()+"-");
                }

            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                x= (String) tv.getText();
//                y="*";
//                tv.setText("");
                String x=tv.getText().toString();
                if(x.endsWith("+")||x.endsWith("-")||x.endsWith("×")||x.endsWith("÷")){     //判断最后一个字符
                    x= x.substring(0,x.length()-1);
                    tv.setText(x+"×");
                }
                else{
                    tv.setText(tv.getText()+"×");
                }

            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                x= (String) tv.getText();
//                y="/";
//                tv.setText("");
                String x=tv.getText().toString();
                if(x.endsWith("+")||x.endsWith("-")||x.endsWith("×")||x.endsWith("÷")){
                    x= x.substring(0,x.length()-1);
                    tv.setText(x+"÷");
                }
                else{
                    tv.setText(tv.getText()+"÷");
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                z=tv.getText().toString();
                caluate();

            }
        });

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("");
            }
        });

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String x=tv.getText().toString();
                if(x!=""){
                    x=x.substring(0,x.length()-1);
                    tv.setText(x);
                }

            }
        });

        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1=Double.parseDouble((String) tv.getText());
                b2 = Math.toRadians(b1);
                z=String.valueOf(Math.sin(b2));
                tv.setText(z);
            }
        });

        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1=Double.parseDouble((String) tv.getText());
                b2 = Math.toRadians(b1);
//                re.setText(b2+"");
                z=String.valueOf(Math.cos(b2));
                tv.setText(z);
            }
        });

        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1=Double.parseDouble((String) tv.getText());
                b2 = Math.toRadians(b1);
                z=String.valueOf(Math.tan(b2));
                tv.setText(z);
            }
        });

        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1=Double.parseDouble((String) tv.getText());
                b1=Math.sqrt(b1);
                z=String.valueOf(b1);
                tv.setText(z);
            }
        });

        x2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1=Double.parseDouble((String) tv.getText());
                b1=Math.pow(b1,2);
                z=String.valueOf(b1);
                tv.setText(z);
            }
        });


    }

    private void caluate(){
        if(z.contains("×")&&z.contains("+")) {
            StringTokenizer st1 = new StringTokenizer(z,"+");//字符串分词器，用于将字符串进行分割和遍历
            double d1,d2 = 0;
            double d3=0;
            d1 = Double.parseDouble(st1.nextToken());//5
            while(st1.hasMoreTokens()){//判断是否已经到结尾6*7
                StringTokenizer st2 = new StringTokenizer(st1.nextToken(),"*");
                d2 = Double.parseDouble(st2.nextToken());
                while(st2.hasMoreTokens()){//判断是否已经到结尾
                    StringTokenizer st3 = new StringTokenizer(st2.nextToken(),"=");
                    d3 = Double.parseDouble(st3.nextToken());
                }
            }
            d=d1+d2*d3;
            b=String.valueOf(d);
            tv.setText(b);

        }

        if(z.contains("÷")) {
            StringTokenizer st1 = new StringTokenizer(z,"÷");
            double d1,d2 = 0;
            d1 = Double.parseDouble(st1.nextToken());
            while(st1.hasMoreTokens()){             //判断是否到结尾
                StringTokenizer st2 = new StringTokenizer(st1.nextToken(),"=");
                d2 = Double.parseDouble(st2.nextToken());
            }
            if(d2!=0){
                d=d1/d2;
                b=String.valueOf(d);
                tv.setText(b);
            }
            else{
                tv.setText("除数不能为0");
            }

        }

        if(z.contains("+")) {						//字符串分割
            StringTokenizer st1 = new StringTokenizer(z,"+");
            double d1,d2 = 0;
            d1 = Double.parseDouble(st1.nextToken());
            while(st1.hasMoreTokens()){
                StringTokenizer st2 = new StringTokenizer(st1.nextToken(),"=");
                d2 = Double.parseDouble(st2.nextToken());
            }
            d=d1+d2;
            b=String.valueOf(d);
            tv.setText(b);

        }

        if(z.contains("-")) {
            StringTokenizer st1 = new StringTokenizer(z,"-");
            double d1,d2 = 0;
            d1 = Double.parseDouble(st1.nextToken());
            while(st1.hasMoreTokens()){
                StringTokenizer st2 = new StringTokenizer(st1.nextToken(),"=");
                d2 = Double.parseDouble(st2.nextToken());
            }
            d=d1-d2;
            b=String.valueOf(d);
            tv.setText(b);
        }
    }

}