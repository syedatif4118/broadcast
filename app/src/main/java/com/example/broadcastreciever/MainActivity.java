package com.example.broadcast;
import androidx.appcompat.app.AppCompatActivity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    MyBroadcastReceiver myBroadcastReceiver;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tv);
        myBroadcastReceiver=new MyBroadcastReceiver(tv);
    }
    @Override
    protected void onStart(){
        registerReceiver(myBroadcastReceiver,new
                IntentFilter(Intent.ACTION_BATTERY_CHANGED));
        super.onStart();
    }
    @Override
    protected void onStop(){
        unregisterReceiver(myBroadcastReceiver);
        super.onStop();
    }
}