package com.paypal.pyplcheckout.common.cache;

import androidx.compose.foundation.layout.C0761x;
import androidx.datastore.core.C2478e;
import androidx.datastore.preferences.core.C2493b;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.PreferencesKt;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.pyplcheckout.common.cache.PreferenceStoreImpl$clear$1", mo70541f = "PreferenceStoreImpl.kt", mo70542l = {149}, mo70543m = "invokeSuspend")
public final class PreferenceStoreImpl$clear$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {

    /* renamed from: $t */
    public final /* synthetic */ String f37715$t;
    public int label;
    public final /* synthetic */ PreferenceStoreImpl this$0;

    @C19060c(mo70540c = "com.paypal.pyplcheckout.common.cache.PreferenceStoreImpl$clear$1$1", mo70541f = "PreferenceStoreImpl.kt", mo70542l = {}, mo70543m = "invokeSuspend")
    /* renamed from: com.paypal.pyplcheckout.common.cache.PreferenceStoreImpl$clear$1$1 */
    public static final class C172121 extends SuspendLambda implements C19861p<MutablePreferences, C19340c<? super C19394m>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C172121 r0 = new C172121(aVar, cVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(MutablePreferences mutablePreferences, C19340c<? super C19394m> cVar) {
            return ((C172121) create(mutablePreferences, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                C0761x.m1684O0(obj);
                MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
                C2493b.C2494a<?> aVar = aVar;
                if (aVar != null) {
                    mutablePreferences.getClass();
                    mutablePreferences.mo9352c();
                    mutablePreferences.f5761a.remove(aVar);
                }
                return C19394m.f43287a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreferenceStoreImpl$clear$1(PreferenceStoreImpl preferenceStoreImpl, String str, C19340c<? super PreferenceStoreImpl$clear$1> cVar) {
        super(2, cVar);
        this.this$0 = preferenceStoreImpl;
        this.f37715$t = str;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new PreferenceStoreImpl$clear$1(this.this$0, this.f37715$t, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((PreferenceStoreImpl$clear$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            final C2493b.C2494a aVar = this.this$0.getHashData().get(this.f37715$t);
            PreferenceStoreImpl preferenceStoreImpl = this.this$0;
            C2478e access$getDataStore = preferenceStoreImpl.getDataStore(preferenceStoreImpl.context);
            C172121 r3 = new C172121((C19340c<? super C172121>) null);
            this.label = 1;
            if (PreferencesKt.m5473a(access$getDataStore, r3, this) == coroutineSingletons) {
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
