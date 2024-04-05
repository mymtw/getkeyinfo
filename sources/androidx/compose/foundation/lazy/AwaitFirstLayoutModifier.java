package androidx.compose.foundation.lazy;

import androidx.compose.p015ui.layout.C1674c0;
import androidx.compose.p015ui.layout.C1689j;
import kotlin.C19394m;
import kotlin.Result;
import kotlin.coroutines.C19343e;
import kotlin.jvm.internal.C19383o;

public final class AwaitFirstLayoutModifier implements C1674c0 {

    /* renamed from: b */
    public boolean f1572b;

    /* renamed from: c */
    public C19343e f1573c;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo4168a(kotlin.coroutines.C19340c<? super kotlin.C19394m> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.lazy.AwaitFirstLayoutModifier$waitForFirstLayout$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            androidx.compose.foundation.lazy.AwaitFirstLayoutModifier$waitForFirstLayout$1 r0 = (androidx.compose.foundation.lazy.AwaitFirstLayoutModifier$waitForFirstLayout$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.lazy.AwaitFirstLayoutModifier$waitForFirstLayout$1 r0 = new androidx.compose.foundation.lazy.AwaitFirstLayoutModifier$waitForFirstLayout$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r1 = r0.L$1
            kotlin.coroutines.c r1 = (kotlin.coroutines.C19340c) r1
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.lazy.AwaitFirstLayoutModifier r0 = (androidx.compose.foundation.lazy.AwaitFirstLayoutModifier) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)
            goto L_0x0059
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)
            boolean r5 = r4.f1572b
            if (r5 != 0) goto L_0x0064
            kotlin.coroutines.e r5 = r4.f1573c
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            kotlin.coroutines.e r2 = new kotlin.coroutines.e
            kotlin.coroutines.c r0 = kotlin.jvm.internal.C19388s.m32873m0(r0)
            r2.<init>(r0)
            r4.f1573c = r2
            java.lang.Object r0 = r2.mo71808a()
            if (r0 != r1) goto L_0x0058
            return r1
        L_0x0058:
            r1 = r5
        L_0x0059:
            if (r1 == 0) goto L_0x0064
            kotlin.m r5 = kotlin.C19394m.f43287a
            java.lang.Object r5 = kotlin.Result.m35480constructorimpl(r5)
            r1.resumeWith(r5)
        L_0x0064:
            kotlin.m r5 = kotlin.C19394m.f43287a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.AwaitFirstLayoutModifier.mo4168a(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: x0 */
    public final void mo3878x0(C1689j jVar) {
        C19383o.m32797g(jVar, "coordinates");
        if (!this.f1572b) {
            this.f1572b = true;
            C19343e eVar = this.f1573c;
            if (eVar != null) {
                eVar.resumeWith(Result.m35480constructorimpl(C19394m.f43287a));
            }
            this.f1573c = null;
        }
    }
}
