package com.shuji.ys;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputLink = findViewById(R.id.inputLink);
        Button btnConnect = findViewById(R.id.btnConnect);
        TextView tvStatus = findViewById(R.id.tvStatus);

        btnConnect.setOnClickListener(v -> {
            String link = inputLink.getText().toString().trim();
            if (link.isEmpty()) {
                tvStatus.setText("请粘贴 MTP 链接");
                return;
            }
            tvStatus.setText("已接收到链接，功能开发中");
        });
    }
}
