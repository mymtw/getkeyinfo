package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.appboy.Constants;
import kotlin.jvm.internal.C19383o;
import p251u1.C8115a;
import p365hg.C12851e0;
import p365hg.C12869i0;

public final class CustomTabMainActivity extends Activity {
    public static final C12180a Companion = new C12180a();
    public static final String EXTRA_ACTION = "CustomTabMainActivity.extra_action";
    public static final String EXTRA_CHROME_PACKAGE = "CustomTabMainActivity.extra_chromePackage";
    public static final String EXTRA_PARAMS = "CustomTabMainActivity.extra_params";
    public static final String EXTRA_TARGET_APP = "CustomTabMainActivity.extra_targetApp";
    public static final String EXTRA_URL = "CustomTabMainActivity.extra_url";
    public static final String NO_ACTIVITY_EXCEPTION = "CustomTabMainActivity.no_activity_exception";
    public static final String REFRESH_ACTION = "CustomTabMainActivity.action_refresh";
    private BroadcastReceiver redirectReceiver;
    private boolean shouldCloseCustomTab = true;

    /* renamed from: com.facebook.CustomTabMainActivity$a */
    public static final class C12180a {
    }

    private final void sendResult(int i, Intent intent) {
        Bundle bundle;
        BroadcastReceiver broadcastReceiver = this.redirectReceiver;
        if (broadcastReceiver != null) {
            C8115a.m16322a(this).mo20710d(broadcastReceiver);
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra(EXTRA_URL);
            if (stringExtra != null) {
                Companion.getClass();
                Uri parse = Uri.parse(stringExtra);
                C19383o.m32796f(parse, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
                bundle = C12869i0.m20554J(parse.getQuery());
                bundle.putAll(C12869i0.m20554J(parse.getFragment()));
            } else {
                bundle = new Bundle();
            }
            Intent intent2 = getIntent();
            C19383o.m32796f(intent2, "intent");
            Intent e = C12851e0.m20506e(intent2, bundle, (FacebookException) null);
            if (e != null) {
                intent = e;
            }
            setResult(i, intent);
        } else {
            Intent intent3 = getIntent();
            C19383o.m32796f(intent3, "intent");
            setResult(i, C12851e0.m20506e(intent3, (Bundle) null, (FacebookException) null));
        }
        finish();
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x013d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            super.onCreate(r11)
            java.lang.String r0 = com.facebook.CustomTabActivity.CUSTOM_TAB_REDIRECT_ACTION
            android.content.Intent r1 = r10.getIntent()
            java.lang.String r2 = "intent"
            kotlin.jvm.internal.C19383o.m32796f(r1, r2)
            java.lang.String r1 = r1.getAction()
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r0, r1)
            r1 = 0
            if (r0 == 0) goto L_0x0020
            r10.setResult(r1)
            r10.finish()
            return
        L_0x0020:
            if (r11 != 0) goto L_0x0152
            android.content.Intent r11 = r10.getIntent()
            java.lang.String r0 = EXTRA_ACTION
            java.lang.String r11 = r11.getStringExtra(r0)
            if (r11 == 0) goto L_0x0152
            android.content.Intent r0 = r10.getIntent()
            java.lang.String r2 = EXTRA_PARAMS
            android.os.Bundle r0 = r0.getBundleExtra(r2)
            android.content.Intent r2 = r10.getIntent()
            java.lang.String r3 = EXTRA_CHROME_PACKAGE
            java.lang.String r2 = r2.getStringExtra(r3)
            com.facebook.login.LoginTargetApp$a r3 = com.facebook.login.LoginTargetApp.Companion
            android.content.Intent r4 = r10.getIntent()
            java.lang.String r5 = EXTRA_TARGET_APP
            java.lang.String r4 = r4.getStringExtra(r5)
            r3.getClass()
            com.facebook.login.LoginTargetApp[] r3 = com.facebook.login.LoginTargetApp.values()
            int r5 = r3.length
            r6 = r1
        L_0x0057:
            if (r6 >= r5) goto L_0x0069
            r7 = r3[r6]
            java.lang.String r8 = r7.toString()
            boolean r8 = kotlin.jvm.internal.C19383o.m32792b(r8, r4)
            if (r8 == 0) goto L_0x0066
            goto L_0x006b
        L_0x0066:
            int r6 = r6 + 1
            goto L_0x0057
        L_0x0069:
            com.facebook.login.LoginTargetApp r7 = com.facebook.login.LoginTargetApp.FACEBOOK
        L_0x006b:
            int[] r3 = p453tf.C13416h.f29380a
            int r4 = r7.ordinal()
            r3 = r3[r4]
            r4 = 1
            if (r3 == r4) goto L_0x007c
            hg.d r3 = new hg.d
            r3.<init>(r11, r0)
            goto L_0x0081
        L_0x007c:
            hg.x r3 = new hg.x
            r3.<init>(r11, r0)
        L_0x0081:
            boolean r11 = p401mg.C13080a.m20762b(r3)
            if (r11 == 0) goto L_0x0089
            goto L_0x0127
        L_0x0089:
            com.facebook.login.CustomTabPrefetchHelper$a r11 = com.facebook.login.CustomTabPrefetchHelper.Companion     // Catch:{ all -> 0x0123 }
            r11.getClass()     // Catch:{ all -> 0x0123 }
            java.util.concurrent.locks.ReentrantLock r11 = com.facebook.login.CustomTabPrefetchHelper.lock     // Catch:{ all -> 0x0123 }
            r11.lock()     // Catch:{ all -> 0x0123 }
            k.g r11 = com.facebook.login.CustomTabPrefetchHelper.session     // Catch:{ all -> 0x0123 }
            r0 = 0
            com.facebook.login.CustomTabPrefetchHelper.session = r0     // Catch:{ all -> 0x0123 }
            java.util.concurrent.locks.ReentrantLock r5 = com.facebook.login.CustomTabPrefetchHelper.lock     // Catch:{ all -> 0x0123 }
            r5.unlock()     // Catch:{ all -> 0x0123 }
            android.content.Intent r5 = new android.content.Intent     // Catch:{ all -> 0x0123 }
            java.lang.String r6 = "android.intent.action.VIEW"
            r5.<init>(r6)     // Catch:{ all -> 0x0123 }
            k.a r6 = new k.a     // Catch:{ all -> 0x0123 }
            r6.<init>()     // Catch:{ all -> 0x0123 }
            java.lang.String r7 = "android.support.customtabs.extra.SESSION"
            if (r11 == 0) goto L_0x00d7
            android.content.ComponentName r8 = r11.f15945c     // Catch:{ all -> 0x0123 }
            java.lang.String r8 = r8.getPackageName()     // Catch:{ all -> 0x0123 }
            r5.setPackage(r8)     // Catch:{ all -> 0x0123 }
            android.support.customtabs.ICustomTabsCallback r8 = r11.f15944b     // Catch:{ all -> 0x0123 }
            android.os.IBinder r8 = r8.asBinder()     // Catch:{ all -> 0x0123 }
            android.app.PendingIntent r11 = r11.f15946d     // Catch:{ all -> 0x0123 }
            android.os.Bundle r9 = new android.os.Bundle     // Catch:{ all -> 0x0123 }
            r9.<init>()     // Catch:{ all -> 0x0123 }
            r9.putBinder(r7, r8)     // Catch:{ all -> 0x0123 }
            if (r11 == 0) goto L_0x00d4
            java.lang.String r8 = "android.support.customtabs.extra.SESSION_ID"
            r9.putParcelable(r8, r11)     // Catch:{ all -> 0x0123 }
        L_0x00d4:
            r5.putExtras(r9)     // Catch:{ all -> 0x0123 }
        L_0x00d7:
            boolean r11 = r5.hasExtra(r7)     // Catch:{ all -> 0x0123 }
            if (r11 != 0) goto L_0x00e8
            android.os.Bundle r11 = new android.os.Bundle     // Catch:{ all -> 0x0123 }
            r11.<init>()     // Catch:{ all -> 0x0123 }
            r11.putBinder(r7, r0)     // Catch:{ all -> 0x0123 }
            r5.putExtras(r11)     // Catch:{ all -> 0x0123 }
        L_0x00e8:
            java.lang.String r11 = "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS"
            r5.putExtra(r11, r4)     // Catch:{ all -> 0x0123 }
            java.lang.Integer r11 = r6.f15925a     // Catch:{ all -> 0x0123 }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0123 }
            r0.<init>()     // Catch:{ all -> 0x0123 }
            if (r11 == 0) goto L_0x00ff
            int r11 = r11.intValue()     // Catch:{ all -> 0x0123 }
            java.lang.String r6 = "android.support.customtabs.extra.TOOLBAR_COLOR"
            r0.putInt(r6, r11)     // Catch:{ all -> 0x0123 }
        L_0x00ff:
            r5.putExtras(r0)     // Catch:{ all -> 0x0123 }
            java.lang.String r11 = "androidx.browser.customtabs.extra.SHARE_STATE"
            r5.putExtra(r11, r1)     // Catch:{ all -> 0x0123 }
            k.e r11 = new k.e     // Catch:{ all -> 0x0123 }
            r11.<init>(r5)     // Catch:{ all -> 0x0123 }
            android.content.Intent r0 = r11.f15936a     // Catch:{ all -> 0x0123 }
            r0.setPackage(r2)     // Catch:{ all -> 0x0123 }
            android.net.Uri r0 = r3.f28339a     // Catch:{ ActivityNotFoundException -> 0x0127 }
            android.content.Intent r2 = r11.f15936a     // Catch:{ ActivityNotFoundException -> 0x0127 }
            r2.setData(r0)     // Catch:{ ActivityNotFoundException -> 0x0127 }
            android.content.Intent r0 = r11.f15936a     // Catch:{ ActivityNotFoundException -> 0x0127 }
            android.os.Bundle r11 = r11.f15937b     // Catch:{ ActivityNotFoundException -> 0x0127 }
            java.lang.Object r2 = p260v0.C8184a.f17966a     // Catch:{ ActivityNotFoundException -> 0x0127 }
            p260v0.C8184a.C8185a.m16461b(r10, r0, r11)     // Catch:{ ActivityNotFoundException -> 0x0127 }
            r11 = r4
            goto L_0x0128
        L_0x0123:
            r11 = move-exception
            p401mg.C13080a.m20761a(r3, r11)
        L_0x0127:
            r11 = r1
        L_0x0128:
            r10.shouldCloseCustomTab = r1
            if (r11 != 0) goto L_0x013d
            android.content.Intent r11 = r10.getIntent()
            java.lang.String r0 = NO_ACTIVITY_EXCEPTION
            android.content.Intent r11 = r11.putExtra(r0, r4)
            r10.setResult(r1, r11)
            r10.finish()
            return
        L_0x013d:
            com.facebook.CustomTabMainActivity$onCreate$redirectReceiver$1 r11 = new com.facebook.CustomTabMainActivity$onCreate$redirectReceiver$1
            r11.<init>(r10)
            r10.redirectReceiver = r11
            u1.a r0 = p251u1.C8115a.m16322a(r10)
            android.content.IntentFilter r1 = new android.content.IntentFilter
            java.lang.String r2 = com.facebook.CustomTabActivity.CUSTOM_TAB_REDIRECT_ACTION
            r1.<init>(r2)
            r0.mo20708b(r11, r1)
        L_0x0152:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.CustomTabMainActivity.onCreate(android.os.Bundle):void");
    }

    public void onNewIntent(Intent intent) {
        C19383o.m32797g(intent, "intent");
        super.onNewIntent(intent);
        if (C19383o.m32792b(REFRESH_ACTION, intent.getAction())) {
            C8115a.m16322a(this).mo20709c(new Intent(CustomTabActivity.DESTROY_ACTION));
            sendResult(-1, intent);
        } else if (C19383o.m32792b(CustomTabActivity.CUSTOM_TAB_REDIRECT_ACTION, intent.getAction())) {
            sendResult(-1, intent);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.shouldCloseCustomTab) {
            sendResult(0, (Intent) null);
        }
        this.shouldCloseCustomTab = true;
    }
}
