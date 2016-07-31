package com.example.hackbunu.myapplication;


// импорты классов для работы и каких то действий с ними
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;




public class  MainActivity extends  Activity {
    private  TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener(){
           @Override
            public void  onClick(View v) {
               textView.setText("Че-по-чем?");
           }

        });
    }

    public void  sayHello(View view) {

        textView.setText("ЙО!");

    }
}