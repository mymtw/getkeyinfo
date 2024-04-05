package com.paypal.android.platform.authsdk.splitlogin.p534ui;

import com.paypal.android.platform.authsdk.authcommon.Challenge;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginHandler", mo70541f = "SplitLoginHandler.kt", mo70542l = {405}, mo70543m = "handleChallenge")
/* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginHandler$handleChallenge$1 */
public final class SplitLoginHandler$handleChallenge$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SplitLoginHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SplitLoginHandler$handleChallenge$1(SplitLoginHandler splitLoginHandler, C19340c<? super SplitLoginHandler$handleChallenge$1> cVar) {
        super(cVar);
        this.this$0 = splitLoginHandler;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.handleChallenge((Challenge) null, this);
    }
}
