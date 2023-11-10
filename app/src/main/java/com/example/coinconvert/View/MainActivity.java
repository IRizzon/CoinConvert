package com.example.coinconvert.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

import com.example.coinconvert.Controller.ConvertControll;
import com.example.coinconvert.Model.Value;
import com.example.coinconvert.R;

public class MainActivity extends AppCompatActivity {

    ConvertControll controll;

    Value value;

    EditText idValue;
    EditText idResult;

    Button idConvert;
    Button idClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        controll = new ConvertControll(MainActivity.this);
        controll.toString();

        value = new Value();

        idValue = findViewById(R.id.idValue);
        idResult = findViewById(R.id.idResult);

        idClear = findViewById(R.id.idClear);
        idConvert = findViewById(R.id.idConvert);

        idClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                idValue.setText("");
                controll.Clear(value);

            }
        });

        idConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                value.setValue(idValue.getText().toString());
                controll.Convert(value);
                controll.Search(value);

            }
        });
    }
}