package com.jnu.student;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.text_view_hello_world);
        Context context=this.getApplicationContext();
        String resname="hello_android";
        int helloandroidID=context.getResources().getIdentifier(resname,"string",context.getPackageName());
        textView.setText(this.getString(helloandroidID));

    }
}
