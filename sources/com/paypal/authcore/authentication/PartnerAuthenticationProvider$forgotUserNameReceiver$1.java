package com.paypal.authcore.authentication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class PartnerAuthenticationProvider$forgotUserNameReceiver$1 extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ PartnerAuthenticationProvider f37470a;

    public PartnerAuthenticationProvider$forgotUserNameReceiver$1(PartnerAuthenticationProvider partnerAuthenticationProvider) {
        this.f37470a = partnerAuthenticationProvider;
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            PartnerAuthenticationProvider partnerAuthenticationProvider = this.f37470a;
            PartnerAuthenticationProvider.m28569b(partnerAuthenticationProvider, partnerAuthenticationProvider.f37463g, true);
        }
    }
}
