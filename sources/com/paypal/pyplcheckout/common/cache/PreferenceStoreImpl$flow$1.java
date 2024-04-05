package com.paypal.pyplcheckout.common.cache;

import androidx.compose.foundation.layout.C0761x;
import androidx.datastore.preferences.core.C2493b;
import androidx.datastore.preferences.core.MutablePreferences;
import java.io.IOException;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C19600e;
import p744gq.C19060c;
import p753kq.C19862q;

@C19060c(mo70540c = "com.paypal.pyplcheckout.common.cache.PreferenceStoreImpl$flow$1", mo70541f = "PreferenceStoreImpl.kt", mo70542l = {102}, mo70543m = "invokeSuspend")
public final class PreferenceStoreImpl$flow$1 extends SuspendLambda implements C19862q<C19600e<? super C2493b>, Throwable, C19340c<? super C19394m>, Object> {
    private /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public PreferenceStoreImpl$flow$1(C19340c<? super PreferenceStoreImpl$flow$1> cVar) {
        super(3, cVar);
    }

    public final Object invoke(C19600e<? super C2493b> eVar, Throwable th, C19340c<? super C19394m> cVar) {
        PreferenceStoreImpl$flow$1 preferenceStoreImpl$flow$1 = new PreferenceStoreImpl$flow$1(cVar);
        preferenceStoreImpl$flow$1.L$0 = eVar;
        preferenceStoreImpl$flow$1.L$1 = th;
        return preferenceStoreImpl$flow$1.invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19600e eVar = (C19600e) this.L$0;
            Throwable th = (Throwable) this.L$1;
            if (th instanceof IOException) {
                MutablePreferences mutablePreferences = new MutablePreferences(true, 1);
                this.L$0 = null;
                this.label = 1;
                if (eVar.emit(mutablePreferences, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                throw th;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}
