package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p453tf.C13401c;
import p453tf.C13418j;

public final class CurrentAccessTokenExpirationBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(intent, "intent");
        if (C19383o.m32792b("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED", intent.getAction()) && C13418j.m21113i()) {
            C13401c a = C13401c.f29349g.mo46082a();
            AccessToken accessToken = a.f29350a;
            a.mo46080c(accessToken, accessToken);
        }
    }
}
