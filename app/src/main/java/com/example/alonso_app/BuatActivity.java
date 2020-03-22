package com.example.alonso_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BuatActivity extends Activity {
    private  EditText nameTask;
    public static final String EXTRA_REPLY = "com.example.android.tasklistsql.REPLY";

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activty_buat);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activty_buat);

        //---get the EditText view---
        nameTask = (EditText)findViewById(R.id.editText2);
        EditText detailTask = (EditText)findViewById(R.id.editText);

        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent replyIntent = new Intent();
                if (TextUtils.isEmpty(nameTask.getText())) {
                    setResult(RESULT_CANCELED, replyIntent);
                } else {
                    String task = nameTask.getText().toString();
                    replyIntent.putExtra(EXTRA_REPLY, task);
                    setResult(RESULT_OK, replyIntent);
                }
                finish();
            }
        });
    }
//    public void onClick(View view) {
//        Intent data = new Intent();
////---get the EditText view---
//        EditText nameTask = (EditText)findViewById(R.id.editText2);
//        EditText detailTask = (EditText)findViewById(R.id.editText);
////---set the data to pass back---
//        String name = nameTask.getText().toString();
//        String detail = detailTask.getText().toString();
//
//        Bundle bundle = new Bundle();
//        bundle.putString("aName",name);
//        bundle.putString("aDetail",detail);
//
//        data.putExtras(bundle);
//        setResult(RESULT_OK, data);
////---closes the activity---
//        finish();
//    }
}
