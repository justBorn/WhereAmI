package com.whereami;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class OutgoingCallInterceptor extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        final String originalNumber = intent.getStringExtra(Intent.EXTRA_PHONE_NUMBER);

        if(originalNumber.equals("0009")){
        	this.setResultData(null);
        	/*Intent i = new Intent();
        	i.setClassName("com.whereami", "com.whereami.UserSettingActivity");
            context.startActivity(i);*/
            
            
            Intent intentone = new Intent(context.getApplicationContext(), UserSettingActivity.class);
            intentone.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intentone);
 
        }
        else
        Toast.makeText(context, "stai chiamando il numero: "+originalNumber, Toast.LENGTH_LONG).show();

    }

}