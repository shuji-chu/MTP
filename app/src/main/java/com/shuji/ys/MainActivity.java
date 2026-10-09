package com.shuji.ys;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private boolean connected = false;
    private TextView statusText, statusSub;
    private ImageView statusIcon;
    private LinearLayout statusCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputLink = findViewById(R.id.inputLink);
        Button btnConnect = findViewById(R.id.btnConnect);
        statusText = findViewById(R.id.statusText);
        statusSub = findViewById(R.id.statusSub);
        statusIcon = findViewById(R.id.statusIcon);
        statusCard = findViewById(R.id.statusCard);

        btnConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String link = inputLink.getText().toString().trim();
                if (link.isEmpty()) {
                    statusText.setText("请先粘贴链接");
                    statusSub.setText("未连接");
                    return;
                }
                if (!link.startsWith("tg://proxy")) {
                    statusText.setText("链接格式错误");
                    statusSub.setText("应以 tg://proxy 开头");
                    return;
                }
                connected = !connected;
                if (connected) {
                    statusText.setText("已连接");
                    statusSub.setText("MTP 代理运行中");
                    statusIcon.setImageResource(android.R.drawable.presence_online);
                    btnConnect.setText("断开");
                } else {
                    statusText.setText("已停止");
                    statusSub.setText("点此启动");
                    statusIcon.setImageResource(android.R.drawable.ic_menu_close_clear_cancel);
                    btnConnect.setText("连接");
                }
            }
        });
    }
}
