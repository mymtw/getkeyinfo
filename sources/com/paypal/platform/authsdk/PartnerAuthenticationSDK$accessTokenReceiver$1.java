package com.paypal.platform.authsdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.android.platform.authsdk.authinterface.AuthenticationState;
import java.io.Serializable;
import p716xo.C18830c;
import p716xo.C18834f;

public final class PartnerAuthenticationSDK$accessTokenReceiver$1 extends BroadcastReceiver {
    public final /* synthetic */ C18830c this$0;

    public PartnerAuthenticationSDK$accessTokenReceiver$1(C18830c cVar) {
        this.this$0 = cVar;
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            C18830c cVar = this.this$0;
            cVar.f41701d.f41705a = intent.getStringExtra(UriChallengeConstantKt.ACCESS_TOKEN);
            Serializable serializableExtra = intent.getSerializableExtra("authenticationState");
            if (serializableExtra != null && (serializableExtra instanceof AuthenticationState)) {
                C18834f fVar = cVar.f41701d;
                fVar.getClass();
                fVar.f41706b = (AuthenticationState) serializableExtra;
            }
            C18834f fVar2 = cVar.f41701d;
            intent.getLongExtra("tokenExpireTime", -1);
            fVar2.getClass();
        }
    }
}
