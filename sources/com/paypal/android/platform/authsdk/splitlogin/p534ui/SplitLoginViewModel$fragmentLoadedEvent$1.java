package com.paypal.android.platform.authsdk.splitlogin.p534ui;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.android.platform.authsdk.splitlogin.p534ui.SplitLoginEvent;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.channels.C19499d;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel$fragmentLoadedEvent$1", mo70541f = "SplitLoginViewModel.kt", mo70542l = {248}, mo70543m = "invokeSuspend")
/* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel$fragmentLoadedEvent$1 */
public final class SplitLoginViewModel$fragmentLoadedEvent$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public int label;
    public final /* synthetic */ SplitLoginViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SplitLoginViewModel$fragmentLoadedEvent$1(SplitLoginViewModel splitLoginViewModel, C19340c<? super SplitLoginViewModel$fragmentLoadedEvent$1> cVar) {
        super(2, cVar);
        this.this$0 = splitLoginViewModel;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new SplitLoginViewModel$fragmentLoadedEvent$1(this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((SplitLoginViewModel$fragmentLoadedEvent$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19499d access$getAnalyticsEventsChannel$p = this.this$0.analyticsEventsChannel;
            SplitLoginEvent.Load load = new SplitLoginEvent.Load();
            this.label = 1;
            if (access$getAnalyticsEventsChannel$p.mo72188E(load, this) == coroutineSingletons) {
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
