package com.alife.plugintest1746;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        TextView tv = new TextView(this);
        tv.setText("hello from plugin");
        tv.setTextSize(32);
        setContentView(tv);
    }
}
