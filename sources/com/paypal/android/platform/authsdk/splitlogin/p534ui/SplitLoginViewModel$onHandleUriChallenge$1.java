package com.paypal.android.platform.authsdk.splitlogin.p534ui;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.android.platform.authsdk.splitlogin.p534ui.SplitLoginViewModel;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.channels.C19499d;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel$onHandleUriChallenge$1", mo70541f = "SplitLoginViewModel.kt", mo70542l = {183}, mo70543m = "invokeSuspend")
/* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel$onHandleUriChallenge$1 */
public final class SplitLoginViewModel$onHandleUriChallenge$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ String $challengeData;
    public int label;
    public final /* synthetic */ SplitLoginViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SplitLoginViewModel$onHandleUriChallenge$1(SplitLoginViewModel splitLoginViewModel, String str, C19340c<? super SplitLoginViewModel$onHandleUriChallenge$1> cVar) {
        super(2, cVar);
        this.this$0 = splitLoginViewModel;
        this.$challengeData = str;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new SplitLoginViewModel$onHandleUriChallenge$1(this.this$0, this.$challengeData, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((SplitLoginViewModel$onHandleUriChallenge$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19499d access$getEventsChannel$p = this.this$0.eventsChannel;
            SplitLoginViewModel.Event.UNHANDLED unhandled = new SplitLoginViewModel.Event.UNHANDLED((Error) null, this.$challengeData);
            this.label = 1;
            if (access$getEventsChannel$p.mo72188E(unhandled, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}
