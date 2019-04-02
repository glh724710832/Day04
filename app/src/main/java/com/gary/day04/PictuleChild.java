package com.gary.day04;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class PictuleChild extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pictule_mr_child);
        view();

    }

    void view(){
        LinearLayout layout_mr_child = findViewById(R.id.layout_mr_child);
        layout_mr_child.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PictuleChild.this,PictuleStuday1.class);
                startActivity(intent);
            }
        });
    }
}
