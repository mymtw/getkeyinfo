package androidx.compose.material;

import androidx.compose.p015ui.input.nestedscroll.C1617a;
import kotlin.reflect.C19421p;
import p288y.C8343c;

public final class SwipeableKt$PreUpPostDownNestedScrollConnection$1 implements C1617a {

    /* renamed from: b */
    public final /* synthetic */ SwipeableState<Object> f2277b;

    public SwipeableKt$PreUpPostDownNestedScrollConnection$1(SwipeableState<Object> swipeableState) {
        this.f2277b = swipeableState;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo3814a(long r5, long r7, kotlin.coroutines.C19340c<? super p174m0.C7294l> r9) {
        /*
            r4 = this;
            boolean r5 = r9 instanceof androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1
            if (r5 == 0) goto L_0x0013
            r5 = r9
            androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 r5 = (androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1) r5
            int r6 = r5.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r6 & r0
            if (r1 == 0) goto L_0x0013
            int r6 = r6 - r0
            r5.label = r6
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 r5 = new androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1
            r5.<init>(r4, r9)
        L_0x0018:
            java.lang.Object r6 = r5.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r9 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r0 = r5.label
            r1 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 != r1) goto L_0x0029
            long r7 = r5.J$0
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            goto L_0x0051
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            androidx.compose.material.SwipeableState<java.lang.Object> r6 = r4.f2277b
            float r0 = p174m0.C7294l.m14004b(r7)
            float r2 = p174m0.C7294l.m14005c(r7)
            long r2 = kotlin.reflect.C19421p.m32952q(r0, r2)
            float r0 = p288y.C8343c.m16643d(r2)
            r5.J$0 = r7
            r5.label = r1
            java.lang.Object r5 = r6.mo5119g(r0, r5)
            if (r5 != r9) goto L_0x0051
            return r9
        L_0x0051:
            m0.l r5 = new m0.l
            r5.<init>(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1.mo3814a(long, long, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: b */
    public final long mo4012b(int i, long j) {
        float d = C8343c.m16643d(j);
        if (d < 0.0f) {
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            if (z) {
                return C19421p.m32952q(0.0f, this.f2277b.mo5118f(d));
            }
        }
        int i2 = C8343c.f18298e;
        return C8343c.f18295b;
    }

    /* renamed from: d */
    public final long mo3815d(long j, long j2, int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z) {
            return C19421p.m32952q(0.0f, this.f2277b.mo5118f(C8343c.m16643d(j2)));
        }
        int i2 = C8343c.f18298e;
        return C8343c.f18295b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo4013e(long r7, kotlin.coroutines.C19340c<? super p174m0.C7294l> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 r0 = (androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 r0 = new androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            long r7 = r0.J$0
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)
            goto L_0x006c
        L_0x0029:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0031:
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)
            float r9 = p174m0.C7294l.m14004b(r7)
            float r2 = p174m0.C7294l.m14005c(r7)
            long r4 = kotlin.reflect.C19421p.m32952q(r9, r2)
            float r9 = p288y.C8343c.m16643d(r4)
            r2 = 0
            int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x006a
            androidx.compose.material.SwipeableState<java.lang.Object> r2 = r6.f2277b
            androidx.compose.runtime.ParcelableSnapshotMutableState r2 = r2.f2282e
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            androidx.compose.material.SwipeableState<java.lang.Object> r4 = r6.f2277b
            float r5 = r4.f2288k
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x006a
            r0.J$0 = r7
            r0.label = r3
            java.lang.Object r9 = r4.mo5119g(r9, r0)
            if (r9 != r1) goto L_0x006c
            return r1
        L_0x006a:
            long r7 = p174m0.C7294l.f16176b
        L_0x006c:
            m0.l r9 = new m0.l
            r9.<init>(r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1.mo4013e(long, kotlin.coroutines.c):java.lang.Object");
    }
}
