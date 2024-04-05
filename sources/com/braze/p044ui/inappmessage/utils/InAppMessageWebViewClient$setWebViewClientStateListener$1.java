package com.braze.p044ui.inappmessage.utils;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.C19764o1;
import kotlinx.coroutines.internal.C19729m;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;
import p768rq.C20153b;

@C19060c(mo70540c = "com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$setWebViewClientStateListener$1", mo70541f = "InAppMessageWebViewClient.kt", mo70542l = {106}, mo70543m = "invokeSuspend")
/* renamed from: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$setWebViewClientStateListener$1 */
public final class InAppMessageWebViewClient$setWebViewClientStateListener$1 extends SuspendLambda implements C19857l<C19340c<? super C19394m>, Object> {
    public int label;
    public final /* synthetic */ InAppMessageWebViewClient this$0;

    @C19060c(mo70540c = "com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$setWebViewClientStateListener$1$1", mo70541f = "InAppMessageWebViewClient.kt", mo70542l = {}, mo70543m = "invokeSuspend")
    /* renamed from: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$setWebViewClientStateListener$1$1 */
    public static final class C56931 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C56931(inAppMessageWebViewClient, cVar);
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C56931) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                C0761x.m1684O0(obj);
                inAppMessageWebViewClient.markPageFinished();
                return C19394m.f43287a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InAppMessageWebViewClient$setWebViewClientStateListener$1(InAppMessageWebViewClient inAppMessageWebViewClient, C19340c<? super InAppMessageWebViewClient$setWebViewClientStateListener$1> cVar) {
        super(1, cVar);
        this.this$0 = inAppMessageWebViewClient;
    }

    public final C19340c<C19394m> create(C19340c<?> cVar) {
        return new InAppMessageWebViewClient$setWebViewClientStateListener$1(this.this$0, cVar);
    }

    public final Object invoke(C19340c<? super C19394m> cVar) {
        return ((InAppMessageWebViewClient$setWebViewClientStateListener$1) create(cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C20153b bVar = C19760n0.f43719a;
            C19764o1 o1Var = C19729m.f43681a;
            final InAppMessageWebViewClient inAppMessageWebViewClient = this.this$0;
            C56931 r1 = new C56931((C19340c<? super C56931>) null);
            this.label = 1;
            if (C19697g.m33471i(this, o1Var, r1) == coroutineSingletons) {
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
