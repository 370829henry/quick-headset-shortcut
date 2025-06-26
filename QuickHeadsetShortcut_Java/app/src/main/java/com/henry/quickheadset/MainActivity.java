package com.henry.quickheadset;

import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;
import android.os.Bundle;
import android.content.ComponentName;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.bluetooth.MiuiHeadsetActivity"));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
        } catch (Exception e) {
            Toast.makeText(this, "耳机设置未能打开，请先手动打开一次以激活界面。", Toast.LENGTH_LONG).show();
            finish();
        }
    }
}