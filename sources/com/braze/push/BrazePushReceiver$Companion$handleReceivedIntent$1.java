package com.braze.push;

import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.layout.C0761x;
import com.braze.push.BrazePushReceiver;
import com.braze.support.BrazeLogger;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.braze.push.BrazePushReceiver$Companion$handleReceivedIntent$1", mo70541f = "BrazePushReceiver.kt", mo70542l = {}, mo70543m = "invokeSuspend")
public final class BrazePushReceiver$Companion$handleReceivedIntent$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Intent $intent;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazePushReceiver$Companion$handleReceivedIntent$1(Context context, Intent intent, C19340c<? super BrazePushReceiver$Companion$handleReceivedIntent$1> cVar) {
        super(2, cVar);
        this.$context = context;
        this.$intent = intent;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new BrazePushReceiver$Companion$handleReceivedIntent$1(this.$context, this.$intent, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((BrazePushReceiver$Companion$handleReceivedIntent$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            BrazePushReceiver.Companion companion = BrazePushReceiver.Companion;
            Context applicationContext = this.$context.getApplicationContext();
            C19383o.m32796f(applicationContext, "context.applicationContext");
            Intent intent = this.$intent;
            companion.getClass();
            String action = intent.getAction();
            try {
                BrazePushReceiver.Companion.m11212d(applicationContext, intent, action);
            } catch (Exception e) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, companion, BrazeLogger.Priority.E, e, new BrazePushReceiver$Companion$handlePush$1(action, intent), 4);
            }
            return C19394m.f43287a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
