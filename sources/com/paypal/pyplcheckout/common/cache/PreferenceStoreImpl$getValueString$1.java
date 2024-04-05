package com.paypal.pyplcheckout.common.cache;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.C19597d;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.pyplcheckout.common.cache.PreferenceStoreImpl$getValueString$1", mo70541f = "PreferenceStoreImpl.kt", mo70542l = {130, 130}, mo70543m = "invokeSuspend")
public final class PreferenceStoreImpl$getValueString$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super String>, Object> {

    /* renamed from: $t */
    public final /* synthetic */ String f37718$t;
    public int label;
    public final /* synthetic */ PreferenceStoreImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreferenceStoreImpl$getValueString$1(PreferenceStoreImpl preferenceStoreImpl, String str, C19340c<? super PreferenceStoreImpl$getValueString$1> cVar) {
        super(2, cVar);
        this.this$0 = preferenceStoreImpl;
        this.f37718$t = str;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new PreferenceStoreImpl$getValueString$1(this.this$0, this.f37718$t, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super String> cVar) {
        return ((PreferenceStoreImpl$getValueString$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            PreferenceStoreImpl preferenceStoreImpl = this.this$0;
            String str = this.f37718$t;
            this.label = 1;
            obj = preferenceStoreImpl.getPreferenceString(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else if (i == 2) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.label = 2;
        obj = FlowKt__ReduceKt.m33371a((C19597d) obj, this);
        return obj == coroutineSingletons ? coroutineSingletons : obj;
    }
}
