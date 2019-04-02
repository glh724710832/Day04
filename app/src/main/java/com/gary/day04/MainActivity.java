package com.gary.day04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bt_come;
    Button bt_test;
    EditText idtext;
    EditText pw;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view();
    }

    private void view() {
        bt_come= findViewById(R.id.bt_come);
        bt_test= findViewById(R.id.bt_test);
        idtext = findViewById(R.id.idtext);
        pw = findViewById(R.id.pw);


        bt_come.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      if (TextUtils.isEmpty(idtext.getText().toString())) {
                                          Toast.makeText(getApplicationContext(), "请输入账号", Toast.LENGTH_SHORT).show();
                                      } else if (TextUtils.isEmpty(pw.getText().toString())) {
                                          Toast.makeText(getApplicationContext(), "请输入密码", Toast.LENGTH_SHORT).show();
                                      } else {
                                          if (idtext.getText().toString().length() != 11) {
                                              Toast.makeText(getApplicationContext(), "请输入正确的11位账号", Toast.LENGTH_SHORT).show();
                                          } else if (pw.getText().toString().length() < 6) {
                                              Toast.makeText(getApplicationContext(), "请输入6位以上数字或密码", Toast.LENGTH_SHORT).show();
                                          } else {
                                              Intent a = new Intent(MainActivity.this, OneActivity.class);
                                              startActivity(a);

                                          }
                                      }

                                  }
                              }

        );

        bt_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this,OneActivity.class);
                startActivity(a);
            }
        });
    }
}

