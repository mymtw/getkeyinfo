package com.paypal.pyplcheckout.common.cache;

import androidx.compose.foundation.layout.C0761x;
import androidx.datastore.preferences.core.C2493b;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.pyplcheckout.common.cache.PreferenceStoreImpl$setValueBoolean$1", mo70541f = "PreferenceStoreImpl.kt", mo70542l = {116}, mo70543m = "invokeSuspend")
public final class PreferenceStoreImpl$setValueBoolean$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ boolean $booleanVal;

    /* renamed from: $t */
    public final /* synthetic */ C2493b.C2494a<Boolean> f37722$t;
    public int label;
    public final /* synthetic */ PreferenceStoreImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreferenceStoreImpl$setValueBoolean$1(PreferenceStoreImpl preferenceStoreImpl, C2493b.C2494a<Boolean> aVar, boolean z, C19340c<? super PreferenceStoreImpl$setValueBoolean$1> cVar) {
        super(2, cVar);
        this.this$0 = preferenceStoreImpl;
        this.f37722$t = aVar;
        this.$booleanVal = z;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new PreferenceStoreImpl$setValueBoolean$1(this.this$0, this.f37722$t, this.$booleanVal, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((PreferenceStoreImpl$setValueBoolean$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            PreferenceStoreImpl preferenceStoreImpl = this.this$0;
            C2493b.C2494a<Boolean> aVar = this.f37722$t;
            boolean z = this.$booleanVal;
            this.label = 1;
            if (preferenceStoreImpl.setBoolean(aVar, z, this) == coroutineSingletons) {
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
