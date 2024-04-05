package androidx.test.core.app;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class InstrumentationActivityInvoker$EmptyFloatingActivity extends Activity {
    private final BroadcastReceiver receiver = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            InstrumentationActivityInvoker$EmptyFloatingActivity.this.finish();
        }
    };

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        registerReceiver(this.receiver, new IntentFilter("androidx.test.core.app.InstrumentationActivityInvoker.FINISH_EMPTY_ACTIVITIES"));
        overridePendingTransition(0, 0);
    }

    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.receiver);
    }

    public void onResume() {
        super.onResume();
        sendBroadcast(new Intent("androidx.test.core.app.InstrumentationActivityInvoker.EMPTY_FLOATING_ACTIVITY_RESUMED"));
    }
}
