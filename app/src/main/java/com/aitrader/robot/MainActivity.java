package com.aitrader.robot;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(30, 30, 30, 30);
        layout.setBackgroundColor(Color.rgb(15, 23, 42));

        TextView title = new TextView(this);
        title.setText("AI TRADE ROBOT");
        title.setTextSize(28);
        title.setTextColor(Color.WHITE);
        title.setGravity(Gravity.CENTER);

        TextView status = new TextView(this);
        status.setText("\nTrading Assistant Ready\n\nMarket Status: Waiting\n\nRobot Status: Offline");
        status.setTextSize(18);
        status.setTextColor(Color.GREEN);
        status.setGravity(Gravity.CENTER);

        layout.addView(title);
        layout.addView(status);

        setContentView(layout);
    }
  }
