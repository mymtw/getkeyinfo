package com.etsy.android.p327ui.search.interstitial;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.C19597d;
import kotlinx.coroutines.flow.C19600e;
import kotlinx.coroutines.flow.StateFlowImpl;

/* renamed from: com.etsy.android.ui.search.interstitial.SearchInterstitialViewModel$setupCompositeAutoComplete$1$invokeSuspend$$inlined$map$1 */
public final class C10869x17f8723d implements C19597d<String> {

    /* renamed from: b */
    public final /* synthetic */ C19597d f24127b;

    /* renamed from: c */
    public final /* synthetic */ SearchInterstitialViewModel f24128c;

    public C10869x17f8723d(StateFlowImpl stateFlowImpl, SearchInterstitialViewModel searchInterstitialViewModel) {
        this.f24127b = stateFlowImpl;
        this.f24128c = searchInterstitialViewModel;
    }

    public final Object collect(final C19600e eVar, C19340c cVar) {
        C19597d dVar = this.f24127b;
        final SearchInterstitialViewModel searchInterstitialViewModel = this.f24128c;
        Object collect = dVar.collect(new C19600e() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.C19340c r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.etsy.android.p327ui.search.interstitial.C10869x17f8723d.C108702.C108711
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.etsy.android.ui.search.interstitial.SearchInterstitialViewModel$setupCompositeAutoComplete$1$invokeSuspend$$inlined$map$1$2$1 r0 = (com.etsy.android.p327ui.search.interstitial.C10869x17f8723d.C108702.C108711) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.etsy.android.ui.search.interstitial.SearchInterstitialViewModel$setupCompositeAutoComplete$1$invokeSuspend$$inlined$map$1$2$1 r0 = new com.etsy.android.ui.search.interstitial.SearchInterstitialViewModel$setupCompositeAutoComplete$1$invokeSuspend$$inlined$map$1$2$1
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.result
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x002f
                    if (r2 != r3) goto L_0x0027
                    androidx.compose.foundation.layout.C0761x.m1684O0(r6)
                    goto L_0x0058
                L_0x0027:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x002f:
                    androidx.compose.foundation.layout.C0761x.m1684O0(r6)
                    kotlinx.coroutines.flow.e r6 = r4
                    java.lang.String r5 = (java.lang.String) r5
                    com.etsy.android.ui.search.interstitial.SearchInterstitialViewModel r2 = r2
                    y9.d r2 = r2.f24121h
                    java.util.Locale r2 = r2.mo46718b()
                    java.lang.String r5 = r5.toLowerCase(r2)
                    java.lang.String r2 = "this as java.lang.String).toLowerCase(locale)"
                    kotlin.jvm.internal.C19383o.m32796f(r5, r2)
                    java.lang.CharSequence r5 = kotlin.text.C19459m.m33035H1(r5)
                    java.lang.String r5 = r5.toString()
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0058
                    return r1
                L_0x0058:
                    kotlin.m r5 = kotlin.C19394m.f43287a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.interstitial.C10869x17f8723d.C108702.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : C19394m.f43287a;
    }
}
