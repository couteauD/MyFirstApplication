package com.jnu.student;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EditTextActivity extends AppCompatActivity {

    private Button button_change_language;
    private EditText editText_country;
    private TextView textView_language;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edittext);
        button_change_language=findViewById(R.id.button_change_language);
        editText_country=findViewById(R.id.edit_text_country);
        textView_language=findViewById(R.id.text_view_language);

        button_change_language.setOnClickListener(new onChangeListener());
    }

    private class onChangeListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            if(editText_country.getText().toString().equals("cn")){
                textView_language.setText(R.string.language_cn);
                button_change_language.setText(R.string.change_language_cn);
            }
            else if(editText_country.getText().toString().equals("jp")){
                textView_language.setText(R.string.language_jp);
                button_change_language.setText(R.string.change_language_jp);
            }
            else if(editText_country.getText().toString().equals("kr")){
                textView_language.setText(R.string.language_kr);
                button_change_language.setText(R.string.change_language_kr);
            }
            else{
                textView_language.setText(R.string.language_en);
                button_change_language.setText(R.string.change_language_en);
            }
        }
    }
}
