package com.xiaweizi.chatuidemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void messageList(View view) {
        startActivity(new Intent(this, MessageListActivity.class));
    }

    public void chatInput(View view) {
        startActivity(new Intent(this, ChatInputActivity.class));
    }
}
