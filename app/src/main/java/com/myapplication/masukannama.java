package com.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class masukannama extends AppCompatActivity implements View.OnClickListener {

    EditText edtInput;
    Button btnEnter;

    public static final int RESULT_CODE = 110;
    public static final String EXTRA_VALUE = "extra_value";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masukannama);

        edtInput = findViewById(R.id.edt_name);
        btnEnter = findViewById(R.id.btn_enter);

        btnEnter.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_enter) {
            String name = edtInput.getText().toString();

            Intent intent = new Intent();
            intent.putExtra(EXTRA_VALUE, name);
            setResult(RESULT_CODE, intent);
            finish();
        }
    }
}
