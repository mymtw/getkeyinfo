package com.paypal.pyplcheckout.common.cache;

import androidx.compose.foundation.layout.C0761x;
import androidx.datastore.preferences.core.C2493b;
import androidx.datastore.preferences.core.MutablePreferences;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.pyplcheckout.common.cache.PreferenceStoreImpl$setInt$2", mo70541f = "PreferenceStoreImpl.kt", mo70542l = {}, mo70543m = "invokeSuspend")
public final class PreferenceStoreImpl$setInt$2 extends SuspendLambda implements C19861p<MutablePreferences, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ int $intVal;

    /* renamed from: $t */
    public final /* synthetic */ C2493b.C2494a<Integer> f37720$t;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreferenceStoreImpl$setInt$2(C2493b.C2494a<Integer> aVar, int i, C19340c<? super PreferenceStoreImpl$setInt$2> cVar) {
        super(2, cVar);
        this.f37720$t = aVar;
        this.$intVal = i;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        PreferenceStoreImpl$setInt$2 preferenceStoreImpl$setInt$2 = new PreferenceStoreImpl$setInt$2(this.f37720$t, this.$intVal, cVar);
        preferenceStoreImpl$setInt$2.L$0 = obj;
        return preferenceStoreImpl$setInt$2;
    }

    public final Object invoke(MutablePreferences mutablePreferences, C19340c<? super C19394m> cVar) {
        return ((PreferenceStoreImpl$setInt$2) create(mutablePreferences, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
            C2493b.C2494a<Integer> aVar = this.f37720$t;
            Integer num = new Integer(this.$intVal);
            mutablePreferences.getClass();
            C19383o.m32797g(aVar, "key");
            mutablePreferences.mo9353d(aVar, num);
            return C19394m.f43287a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
