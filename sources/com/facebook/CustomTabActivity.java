package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import kotlin.jvm.internal.C19383o;
import p251u1.C8115a;

public final class CustomTabActivity extends Activity {
    public static final String CUSTOM_TAB_REDIRECT_ACTION = "CustomTabActivity.action_customTabRedirect";
    private static final int CUSTOM_TAB_REDIRECT_REQUEST_CODE = 2;
    public static final C12179a Companion = new C12179a();
    public static final String DESTROY_ACTION = "CustomTabActivity.action_destroy";
    private BroadcastReceiver closeReceiver;

    /* renamed from: com.facebook.CustomTabActivity$a */
    public static final class C12179a {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            Intent intent2 = new Intent(CUSTOM_TAB_REDIRECT_ACTION);
            String str = CustomTabMainActivity.EXTRA_URL;
            Intent intent3 = getIntent();
            C19383o.m32796f(intent3, "intent");
            intent2.putExtra(str, intent3.getDataString());
            C8115a.m16322a(this).mo20709c(intent2);
            CustomTabActivity$onActivityResult$closeReceiver$1 customTabActivity$onActivityResult$closeReceiver$1 = new CustomTabActivity$onActivityResult$closeReceiver$1(this);
            C8115a.m16322a(this).mo20708b(customTabActivity$onActivityResult$closeReceiver$1, new IntentFilter(DESTROY_ACTION));
            this.closeReceiver = customTabActivity$onActivityResult$closeReceiver$1;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, CustomTabMainActivity.class);
        intent.setAction(CUSTOM_TAB_REDIRECT_ACTION);
        String str = CustomTabMainActivity.EXTRA_URL;
        Intent intent2 = getIntent();
        C19383o.m32796f(intent2, "getIntent()");
        intent.putExtra(str, intent2.getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    public void onDestroy() {
        BroadcastReceiver broadcastReceiver = this.closeReceiver;
        if (broadcastReceiver != null) {
            C8115a.m16322a(this).mo20710d(broadcastReceiver);
        }
        super.onDestroy();
    }
}
