package com.example.broadcastreciever;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;
import android.widget.TextView;
public class MyBroadcast extends BroadcastReceiver {
    TextView tv; public MyBroadcast(TextView tv){
        this.tv = tv;
    }
    @Override
    public void onReceive(Context context, Intent intent) {
        int percentage = intent.getIntExtra(BatteryManager.EXTRA_LEVEL,0);
        tv.setText("Battery Level:"+percentage);
    }
}