package com.example.modsexplorer;

/**
 * Created by Roelle on 7/22/2015.
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;


public class MyBroadcastReceiver extends BroadcastReceiver {
    public MyBroadcastReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {


        if (intent.getAction().equals("org.example.ecoscapes")) {
            Intent i = new Intent(context, MODSExplorerMap.class);
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(i);
        }
    }

}
