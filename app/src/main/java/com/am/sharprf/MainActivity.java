package com.am.sharprf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   // EditText e1,e2;
    String s1,s2;
    SharedPreferences  sharedPreferences;
    SharedPreferences.Editor editor;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     ///   e1=findViewById(R.id.editTextTextPersonName);
       /// e2=findViewById(R.id.editTextTextPersonName2);
        textView=findViewById(R.id.textView);
        sharedPreferences=getSharedPreferences("test",MODE_PRIVATE);
        editor=sharedPreferences.edit();

        s1= sharedPreferences.getString("data1","def val");
        s2= sharedPreferences.getString("data2","def val");

        textView.setText(s1+"\n"+s2);


    }

  //  public void sf(View view) {
       // s1=e1.getText().toString();
       //// s2=e2.getText().toString();
        //editor.putString("data2",s2);
        //editor.commit();
   //     Toast.makeText(this, "Data saved!!", Toast.LENGTH_SHORT).show();
   // }
}