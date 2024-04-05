package com.braze.push;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.braze.C5382c;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;

public final class NotificationTrampolineActivity extends Activity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, NotificationTrampolineActivity$onCreate$1.INSTANCE, 6);
    }

    public void onPause() {
        super.onPause();
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, NotificationTrampolineActivity$onPause$1.INSTANCE, 6);
        finish();
    }

    public void onResume() {
        super.onResume();
        try {
            Intent intent = getIntent();
            if (intent == null) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, NotificationTrampolineActivity$onResume$1.INSTANCE, 7);
                finish();
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, NotificationTrampolineActivity$onResume$2.INSTANCE, 7);
                finish();
                return;
            }
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new NotificationTrampolineActivity$onResume$3(intent), 6);
            Intent intent2 = new Intent(action).setClass(this, BrazeNotificationUtils.m11200b());
            C19383o.m32796f(intent2, "Intent(action).setClass(…otificationReceiverClass)");
            Bundle extras = intent.getExtras();
            if (extras != null) {
                intent2.putExtras(extras);
            }
            if (C5382c.f11528a) {
                BrazePushReceiver.Companion.mo16059f(this, intent2, true);
            } else {
                BrazePushReceiver.Companion.mo16059f(this, intent2, false);
            }
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, NotificationTrampolineActivity$onResume$6.INSTANCE, 6);
            BrazeCoroutineScope brazeCoroutineScope = BrazeCoroutineScope.f11696b;
            BrazeCoroutineScope.m11007c(200, new NotificationTrampolineActivity$onResume$7(this, (C19340c<? super NotificationTrampolineActivity$onResume$7>) null));
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, NotificationTrampolineActivity$onResume$5.INSTANCE, 4);
        }
    }
}
