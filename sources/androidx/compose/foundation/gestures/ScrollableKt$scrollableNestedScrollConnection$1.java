package androidx.compose.foundation.gestures;

import androidx.compose.p015ui.input.nestedscroll.C1617a;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1342k1;
import p288y.C8343c;

public final class ScrollableKt$scrollableNestedScrollConnection$1 implements C1617a {

    /* renamed from: b */
    public final /* synthetic */ boolean f1342b;

    /* renamed from: c */
    public final /* synthetic */ C1342k1<ScrollingLogic> f1343c;

    public ScrollableKt$scrollableNestedScrollConnection$1(boolean z, C1338j0 j0Var) {
        this.f1342b = z;
        this.f1343c = j0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo3814a(long r3, long r5, kotlin.coroutines.C19340c<? super p174m0.C7294l> r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1
            if (r3 == 0) goto L_0x0013
            r3 = r7
            androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 r3 = (androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1) r3
            int r4 = r3.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L_0x0013
            int r4 = r4 - r0
            r3.label = r4
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 r3 = new androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1
            r3.<init>(r2, r7)
        L_0x0018:
            java.lang.Object r4 = r3.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 != r1) goto L_0x0029
            long r5 = r3.J$0
            androidx.compose.foundation.layout.C0761x.m1684O0(r4)
            goto L_0x004b
        L_0x0029:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L_0x0031:
            androidx.compose.foundation.layout.C0761x.m1684O0(r4)
            boolean r4 = r2.f1342b
            if (r4 == 0) goto L_0x0054
            androidx.compose.runtime.k1<androidx.compose.foundation.gestures.ScrollingLogic> r4 = r2.f1343c
            java.lang.Object r4 = r4.getValue()
            androidx.compose.foundation.gestures.ScrollingLogic r4 = (androidx.compose.foundation.gestures.ScrollingLogic) r4
            r3.J$0 = r5
            r3.label = r1
            java.lang.Object r4 = r4.mo3818b(r5, r3)
            if (r4 != r7) goto L_0x004b
            return r7
        L_0x004b:
            m0.l r4 = (p174m0.C7294l) r4
            long r3 = r4.f16178a
            long r3 = p174m0.C7294l.m14006d(r5, r3)
            goto L_0x0058
        L_0x0054:
            int r3 = p174m0.C7294l.f16177c
            long r3 = p174m0.C7294l.f16176b
        L_0x0058:
            m0.l r5 = new m0.l
            r5.<init>(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1.mo3814a(long, long, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: d */
    public final long mo3815d(long j, long j2, int i) {
        if (!this.f1342b) {
            return C8343c.f18295b;
        }
        ScrollingLogic value = this.f1343c.getValue();
        if (value.f1347d.mo3691b()) {
            return C8343c.f18295b;
        }
        C0615m mVar = value.f1347d;
        float d = value.mo3820d(j2);
        if (value.f1345b) {
            d *= (float) -1;
        }
        float d2 = mVar.mo3692d(d);
        if (value.f1345b) {
            d2 *= (float) -1;
        }
        return value.mo3821e(d2);
    }
}
