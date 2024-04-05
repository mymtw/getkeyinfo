package com.paypal.pyplcheckout.common.cache;

import androidx.datastore.preferences.core.C2493b;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.C19597d;
import kotlinx.coroutines.flow.C19600e;

public final class PreferenceStoreImpl$getPreferenceInt$suspendImpl$$inlined$map$1 implements C19597d<Integer> {
    public final /* synthetic */ C2493b.C2494a $key$inlined;
    public final /* synthetic */ C19597d $this_unsafeTransform$inlined;

    public PreferenceStoreImpl$getPreferenceInt$suspendImpl$$inlined$map$1(C19597d dVar, C2493b.C2494a aVar) {
        this.$this_unsafeTransform$inlined = dVar;
        this.$key$inlined = aVar;
    }

    public Object collect(final C19600e eVar, C19340c cVar) {
        C19597d dVar = this.$this_unsafeTransform$inlined;
        final C2493b.C2494a aVar = this.$key$inlined;
        Object collect = dVar.collect(new C19600e() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.C19340c r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.paypal.pyplcheckout.common.cache.PreferenceStoreImpl$getPreferenceInt$suspendImpl$$inlined$map$1.C172072.C172081
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.paypal.pyplcheckout.common.cache.PreferenceStoreImpl$getPreferenceInt$suspendImpl$$inlined$map$1$2$1 r0 = (com.paypal.pyplcheckout.common.cache.PreferenceStoreImpl$getPreferenceInt$suspendImpl$$inlined$map$1.C172072.C172081) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.paypal.pyplcheckout.common.cache.PreferenceStoreImpl$getPreferenceInt$suspendImpl$$inlined$map$1$2$1 r0 = new com.paypal.pyplcheckout.common.cache.PreferenceStoreImpl$getPreferenceInt$suspendImpl$$inlined$map$1$2$1
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.result
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x002f
                    if (r2 != r3) goto L_0x0027
                    androidx.compose.foundation.layout.C0761x.m1684O0(r6)
                    goto L_0x0045
                L_0x0027:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x002f:
                    androidx.compose.foundation.layout.C0761x.m1684O0(r6)
                    kotlinx.coroutines.flow.e r6 = r4
                    androidx.datastore.preferences.core.b r5 = (androidx.datastore.preferences.core.C2493b) r5
                    androidx.datastore.preferences.core.b$a r2 = r2
                    java.lang.Object r5 = r5.mo9351b(r2)
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0045
                    return r1
                L_0x0045:
                    kotlin.m r5 = kotlin.C19394m.f43287a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.common.cache.PreferenceStoreImpl$getPreferenceInt$suspendImpl$$inlined$map$1.C172072.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : C19394m.f43287a;
    }
}
