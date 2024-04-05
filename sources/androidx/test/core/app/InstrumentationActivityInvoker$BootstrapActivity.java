package androidx.test.core.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import androidx.test.internal.platform.ThreadChecker;
import androidx.test.internal.util.Checks;

public class InstrumentationActivityInvoker$BootstrapActivity extends Activity {
    private static final String IS_TARGET_ACTIVITY_STARTED_KEY = "IS_TARGET_ACTIVITY_STARTED_KEY";
    private static final String TAG = "androidx.test.core.app.InstrumentationActivityInvoker$BootstrapActivity";
    private boolean isTargetActivityStarted;
    private final BroadcastReceiver receiver = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            InstrumentationActivityInvoker$BootstrapActivity.this.finishActivity(0);
            InstrumentationActivityInvoker$BootstrapActivity.this.finish();
        }
    };

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 0) {
            Intent intent2 = new Intent("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_RECEIVED");
            intent2.putExtra("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_CODE_KEY", i2);
            if (intent != null) {
                intent2.putExtra("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_DATA_KEY", intent);
            }
            sendBroadcast(intent2);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        registerReceiver(this.receiver, new IntentFilter("androidx.test.core.app.InstrumentationActivityInvoker.FINISH_BOOTSTRAP_ACTIVITY"));
        this.isTargetActivityStarted = bundle != null && bundle.getBoolean(IS_TARGET_ACTIVITY_STARTED_KEY, false);
        overridePendingTransition(0, 0);
    }

    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.receiver);
    }

    public void onResume() {
        super.onResume();
        if (!this.isTargetActivityStarted) {
            this.isTargetActivityStarted = true;
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("androidx.test.core.app.InstrumentationActivityInvoker.START_TARGET_ACTIVITY_INTENT_KEY");
            ThreadChecker threadChecker = Checks.f7689a;
            pendingIntent.getClass();
            Bundle bundleExtra = getIntent().getBundleExtra("androidx.test.core.app.InstrumentationActivityInvoker.TARGET_ACTIVITY_OPTIONS_BUNDLE_KEY");
            if (bundleExtra != null) {
                try {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 0, (Intent) null, 268435456, 0, 0, bundleExtra);
                } catch (IntentSender.SendIntentException e) {
                    Log.e(TAG, "Failed to start target activity.", e);
                    throw new RuntimeException(e);
                }
            } else {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 0, (Intent) null, 268435456, 0, 0);
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(IS_TARGET_ACTIVITY_STARTED_KEY, this.isTargetActivityStarted);
    }
}
