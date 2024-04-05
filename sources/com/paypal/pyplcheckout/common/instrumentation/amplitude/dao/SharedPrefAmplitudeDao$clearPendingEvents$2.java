package com.paypal.pyplcheckout.common.instrumentation.amplitude.dao;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.pyplcheckout.common.instrumentation.amplitude.dao.SharedPrefAmplitudeDao$clearPendingEvents$2", mo70541f = "SharedPrefAmplitudeDao.kt", mo70542l = {}, mo70543m = "invokeSuspend")
public final class SharedPrefAmplitudeDao$clearPendingEvents$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super Boolean>, Object> {
    public int label;
    public final /* synthetic */ SharedPrefAmplitudeDao this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharedPrefAmplitudeDao$clearPendingEvents$2(SharedPrefAmplitudeDao sharedPrefAmplitudeDao, C19340c<? super SharedPrefAmplitudeDao$clearPendingEvents$2> cVar) {
        super(2, cVar);
        this.this$0 = sharedPrefAmplitudeDao;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new SharedPrefAmplitudeDao$clearPendingEvents$2(this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super Boolean> cVar) {
        return ((SharedPrefAmplitudeDao$clearPendingEvents$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            this.this$0.internalEvents = null;
            return Boolean.valueOf(this.this$0.sharedPreferences.edit().remove(SharedPrefAmplitudeDaoKt.PENDING_EVENTS).commit());
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
