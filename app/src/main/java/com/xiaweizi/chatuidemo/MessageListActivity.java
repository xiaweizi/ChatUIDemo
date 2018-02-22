package com.xiaweizi.chatuidemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import cn.jiguang.imui.messages.MessageList;
import cn.jiguang.imui.messages.MsgListAdapter;

public class MessageListActivity extends AppCompatActivity {

    private MessageList mMessageList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_list);
        mMessageList = findViewById(R.id.msg_list);

        initMessageList();
    }

    private void initMessageList() {
        mMessageList.setShowSenderDisplayName(true);
        mMessageList.setShowReceiverDisplayName(true);
        MsgListAdapter.HoldersConfig holdersConfig = new MsgListAdapter.HoldersConfig();
        MsgListAdapter adapter = new MsgListAdapter<>("0", holdersConfig, null);
        mMessageList.setAdapter(adapter);
        MyMessage myMessage = new MyMessage("fda", 2);
        adapter.addToStart(myMessage, true);
        adapter.addToStart(myMessage, true);
        adapter.addToStart(myMessage, false);
    }
}
