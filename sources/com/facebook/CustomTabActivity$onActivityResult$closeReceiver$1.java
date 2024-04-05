package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

public final class CustomTabActivity$onActivityResult$closeReceiver$1 extends BroadcastReceiver {
    public final /* synthetic */ CustomTabActivity this$0;

    public CustomTabActivity$onActivityResult$closeReceiver$1(CustomTabActivity customTabActivity) {
        this.this$0 = customTabActivity;
    }

    public void onReceive(Context context, Intent intent) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(intent, "intent");
        this.this$0.finish();
    }
}
