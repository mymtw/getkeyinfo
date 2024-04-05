package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

public final class CustomTabMainActivity$onCreate$redirectReceiver$1 extends BroadcastReceiver {
    public final /* synthetic */ CustomTabMainActivity this$0;

    public CustomTabMainActivity$onCreate$redirectReceiver$1(CustomTabMainActivity customTabMainActivity) {
        this.this$0 = customTabMainActivity;
    }

    public void onReceive(Context context, Intent intent) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(intent, "intent");
        Intent intent2 = new Intent(this.this$0, CustomTabMainActivity.class);
        intent2.setAction(CustomTabMainActivity.REFRESH_ACTION);
        String str = CustomTabMainActivity.EXTRA_URL;
        intent2.putExtra(str, intent.getStringExtra(str));
        intent2.addFlags(603979776);
        this.this$0.startActivity(intent2);
    }
}
