package com.paypal.android.platform.authsdk.otplogin.p533ui;

import com.paypal.android.platform.authsdk.authcommon.Challenge;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.paypal.android.platform.authsdk.otplogin.ui.OTPLoginHandler", mo70541f = "OTPLoginHandler.kt", mo70542l = {324}, mo70543m = "handleChallenge")
/* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.OTPLoginHandler$handleChallenge$1 */
public final class OTPLoginHandler$handleChallenge$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ OTPLoginHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OTPLoginHandler$handleChallenge$1(OTPLoginHandler oTPLoginHandler, C19340c<? super OTPLoginHandler$handleChallenge$1> cVar) {
        super(cVar);
        this.this$0 = oTPLoginHandler;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.handleChallenge((Challenge) null, this);
    }
}
