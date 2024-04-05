package com.paypal.pyplcheckout.threeds;

import android.app.Activity;
import android.content.Context;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;

public final class ThreeDS20 {
    private final ThreeDs20Info threeDs20Info;

    public ThreeDS20(ThreeDs20Info threeDs20Info2) {
        C19383o.m32797g(threeDs20Info2, "threeDs20Info");
        this.threeDs20Info = threeDs20Info2;
    }

    public final void configure(Context context, boolean z, boolean z2) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this.threeDs20Info.setUp(context, z, z2);
    }

    public final Object continueChallenge(String str, String str2, Activity activity, C19340c<? super ValidateResponseAlias> cVar) {
        return this.threeDs20Info.continueChallenge(str, str2, activity, cVar);
    }
}
