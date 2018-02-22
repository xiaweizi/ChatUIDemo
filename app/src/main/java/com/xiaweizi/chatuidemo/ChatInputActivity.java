package com.xiaweizi.chatuidemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

import cn.jiguang.imui.chatinput.ChatInputView;
import cn.jiguang.imui.chatinput.listener.OnMenuClickListener;
import cn.jiguang.imui.chatinput.model.FileItem;

public class ChatInputActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_input);
        ChatInputView chatInputView = findViewById(R.id.chat_input);
        chatInputView.setMenuContainerHeight(240);
        chatInputView.setMenuClickListener(new OnMenuClickListener() {
            @Override
            public boolean onSendTextMessage(CharSequence input) {
                // 输入框输入文字后，点击发送按钮事件
                return false;
            }

            @Override
            public void onSendFiles(List<FileItem> list) {

            }


            @Override
            public boolean switchToMicrophoneMode() {
                // 点击语音按钮触发事件，显示录音界面前触发此事件
                // 返回 true 表示使用默认的界面，若返回 false 应该自己实现界面
                return true;
            }

            @Override
            public boolean switchToGalleryMode() {
                // 点击图片按钮触发事件，显示图片选择界面前触发此事件
                // 返回 true 表示使用默认的界面
                return true;
            }

            @Override
            public boolean switchToCameraMode() {
                // 点击拍照按钮触发事件，显示拍照界面前触发此事件
                // 返回 true 表示使用默认的界面
                return true;
            }

            @Override
            public boolean switchToEmojiMode() {
                return false;
            }
        });

    }
}
