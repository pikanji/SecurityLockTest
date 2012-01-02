package net.pikanji.securitylocktest;

import android.app.Activity;
import android.os.Bundle;
import android.provider.Settings;
import android.view.MotionEvent;
import android.widget.Toast;
import android.provider.Settings.System;

public class SecurityLockTestActivity extends Activity {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
    }

    /* (non-Javadoc)
     * @see android.app.Activity#onTouchEvent(android.view.MotionEvent)
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_UP) {
            //System.putInt(getContentResolver(), Settings.System.LOCK_PATTERN_ENABLED, 1); // 2.2-
            System.putInt(getContentResolver(), Settings.Secure.LOCK_PATTERN_ENABLED, 1); // 2.2+
            Toast.makeText(this, "LOCK_PATTERN_ENABLED set", Toast.LENGTH_SHORT).show();
        }
        return super.onTouchEvent(event);
    }

}