package androidx.compose.foundation.gestures;

import androidx.compose.foundation.C1030w;
import androidx.compose.p015ui.input.nestedscroll.C1617a;
import androidx.compose.p015ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1342k1;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p288y.C8343c;

public final class ScrollingLogic {

    /* renamed from: a */
    public final Orientation f1344a;

    /* renamed from: b */
    public final boolean f1345b;

    /* renamed from: c */
    public final C1342k1<NestedScrollDispatcher> f1346c;

    /* renamed from: d */
    public final C0615m f1347d;

    /* renamed from: e */
    public final C0608f f1348e;

    /* renamed from: f */
    public final C1030w f1349f;

    public ScrollingLogic(Orientation orientation, boolean z, C1338j0 j0Var, C0615m mVar, C0608f fVar, C1030w wVar) {
        C19383o.m32797g(orientation, "orientation");
        C19383o.m32797g(j0Var, "nestedScrollDispatcher");
        C19383o.m32797g(mVar, "scrollableState");
        C19383o.m32797g(fVar, "flingBehavior");
        this.f1344a = orientation;
        this.f1345b = z;
        this.f1346c = j0Var;
        this.f1347d = mVar;
        this.f1348e = fVar;
        this.f1349f = wVar;
    }

    /* renamed from: a */
    public final long mo3817a(C0614l lVar, long j, C8343c cVar, int i) {
        long j2;
        long j3;
        C0614l lVar2 = lVar;
        long j4 = j;
        C19383o.m32797g(lVar2, "$this$dispatchScroll");
        C1030w wVar = this.f1349f;
        if (wVar == null || !wVar.isEnabled()) {
            C8343c cVar2 = cVar;
            j2 = C8343c.f18295b;
        } else {
            j2 = this.f1349f.mo3580d(j4, cVar);
        }
        long e = C8343c.m16644e(j4, j2);
        NestedScrollDispatcher value = this.f1346c.getValue();
        C1617a aVar = value.f3595c;
        if (aVar != null) {
            j3 = aVar.mo4012b(i, e);
        } else {
            int i2 = i;
            j3 = C8343c.f18295b;
        }
        long e2 = C8343c.m16644e(e, j3);
        long e3 = mo3821e(lVar2.mo3737a(mo3820d(this.f1345b ? C8343c.m16646g(e2, -1.0f) : e2)));
        if (this.f1345b) {
            e3 = C8343c.m16646g(e3, -1.0f);
        }
        long j5 = e3;
        long e4 = C8343c.m16644e(e2, j5);
        long b = value.mo6536b(j5, e4, i);
        C1030w wVar2 = this.f1349f;
        if (wVar2 != null && wVar2.isEnabled()) {
            this.f1349f.mo3582f(e2, C8343c.m16644e(e4, b), cVar, i);
        }
        return e4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo3818b(long r12, kotlin.coroutines.C19340c<? super p174m0.C7294l> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = (androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            r0.<init>(r11, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r12 = r0.L$0
            kotlin.jvm.internal.Ref$LongRef r12 = (kotlin.jvm.internal.Ref$LongRef) r12
            androidx.compose.foundation.layout.C0761x.m1684O0(r14)
            goto L_0x0055
        L_0x002b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0033:
            androidx.compose.foundation.layout.C0761x.m1684O0(r14)
            kotlin.jvm.internal.Ref$LongRef r14 = new kotlin.jvm.internal.Ref$LongRef
            r14.<init>()
            r14.element = r12
            androidx.compose.foundation.gestures.m r2 = r11.f1347d
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2 r10 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2
            r9 = 0
            r4 = r10
            r5 = r11
            r6 = r14
            r7 = r12
            r4.<init>(r5, r6, r7, r9)
            r0.L$0 = r14
            r0.label = r3
            java.lang.Object r12 = r2.mo3690a(androidx.compose.foundation.MutatePriority.Default, r10, r0)
            if (r12 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r12 = r14
        L_0x0055:
            long r12 = r12.element
            m0.l r14 = new m0.l
            r14.<init>(r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.mo3818b(long, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0103 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo3819c(float r16, kotlin.coroutines.C19340c<? super kotlin.C19394m> r17) {
        /*
            r15 = this;
            r0 = r15
            r1 = r17
            boolean r2 = r1 instanceof androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1
            if (r2 == 0) goto L_0x0016
            r2 = r1
            androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1 r2 = (androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001b
        L_0x0016:
            androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1 r2 = new androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1
            r2.<init>(r15, r1)
        L_0x001b:
            java.lang.Object r1 = r2.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r9 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r2.label
            r10 = 0
            r11 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L_0x0070
            if (r3 == r7) goto L_0x0062
            if (r3 == r6) goto L_0x0057
            if (r3 == r5) goto L_0x004b
            if (r3 == r4) goto L_0x0040
            if (r3 != r11) goto L_0x0038
            androidx.compose.foundation.layout.C0761x.m1684O0(r1)
            goto L_0x0138
        L_0x0038:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0040:
            long r3 = r2.J$0
            java.lang.Object r5 = r2.L$0
            androidx.compose.foundation.gestures.ScrollingLogic r5 = (androidx.compose.foundation.gestures.ScrollingLogic) r5
            androidx.compose.foundation.layout.C0761x.m1684O0(r1)
            goto L_0x0106
        L_0x004b:
            long r5 = r2.J$0
            java.lang.Object r3 = r2.L$0
            androidx.compose.foundation.gestures.ScrollingLogic r3 = (androidx.compose.foundation.gestures.ScrollingLogic) r3
            androidx.compose.foundation.layout.C0761x.m1684O0(r1)
            r12 = r3
            goto L_0x00e3
        L_0x0057:
            long r6 = r2.J$0
            java.lang.Object r3 = r2.L$0
            androidx.compose.foundation.gestures.ScrollingLogic r3 = (androidx.compose.foundation.gestures.ScrollingLogic) r3
            androidx.compose.foundation.layout.C0761x.m1684O0(r1)
            goto L_0x00cc
        L_0x0062:
            float r3 = r2.F$0
            java.lang.Object r7 = r2.L$1
            androidx.compose.foundation.gestures.ScrollingLogic r7 = (androidx.compose.foundation.gestures.ScrollingLogic) r7
            java.lang.Object r8 = r2.L$0
            androidx.compose.foundation.gestures.ScrollingLogic r8 = (androidx.compose.foundation.gestures.ScrollingLogic) r8
            androidx.compose.foundation.layout.C0761x.m1684O0(r1)
            goto L_0x0096
        L_0x0070:
            androidx.compose.foundation.layout.C0761x.m1684O0(r1)
            androidx.compose.foundation.w r1 = r0.f1349f
            if (r1 == 0) goto L_0x00aa
            boolean r1 = r1.isEnabled()
            if (r1 == 0) goto L_0x00aa
            androidx.compose.foundation.w r1 = r0.f1349f
            long r12 = r15.mo3822f(r16)
            r2.L$0 = r0
            r2.L$1 = r0
            r3 = r16
            r2.F$0 = r3
            r2.label = r7
            m0.l r1 = r1.mo3577a(r12)
            if (r1 != r9) goto L_0x0094
            return r9
        L_0x0094:
            r7 = r0
            r8 = r7
        L_0x0096:
            m0.l r1 = (p174m0.C7294l) r1
            long r12 = r1.f16178a
            androidx.compose.foundation.gestures.Orientation r1 = r7.f1344a
            androidx.compose.foundation.gestures.Orientation r7 = androidx.compose.foundation.gestures.Orientation.Horizontal
            if (r1 != r7) goto L_0x00a5
            float r1 = p174m0.C7294l.m14004b(r12)
            goto L_0x00ae
        L_0x00a5:
            float r1 = p174m0.C7294l.m14005c(r12)
            goto L_0x00ae
        L_0x00aa:
            r3 = r16
            r1 = 0
            r8 = r0
        L_0x00ae:
            float r3 = r3 - r1
            long r12 = r8.mo3822f(r3)
            androidx.compose.runtime.k1<androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher> r1 = r8.f1346c
            java.lang.Object r1 = r1.getValue()
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r1 = (androidx.compose.p015ui.input.nestedscroll.NestedScrollDispatcher) r1
            r2.L$0 = r8
            r2.L$1 = r10
            r2.J$0 = r12
            r2.label = r6
            java.lang.Object r1 = r1.mo6537c(r12, r2)
            if (r1 != r9) goto L_0x00ca
            return r9
        L_0x00ca:
            r3 = r8
            r6 = r12
        L_0x00cc:
            m0.l r1 = (p174m0.C7294l) r1
            long r12 = r1.f16178a
            long r6 = p174m0.C7294l.m14006d(r6, r12)
            r2.L$0 = r3
            r2.J$0 = r6
            r2.label = r5
            java.lang.Object r1 = r3.mo3818b(r6, r2)
            if (r1 != r9) goto L_0x00e1
            return r9
        L_0x00e1:
            r12 = r3
            r5 = r6
        L_0x00e3:
            m0.l r1 = (p174m0.C7294l) r1
            long r13 = r1.f16178a
            androidx.compose.runtime.k1<androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher> r1 = r12.f1346c
            java.lang.Object r1 = r1.getValue()
            r3 = r1
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r3 = (androidx.compose.p015ui.input.nestedscroll.NestedScrollDispatcher) r3
            long r5 = p174m0.C7294l.m14006d(r5, r13)
            r2.L$0 = r12
            r2.J$0 = r13
            r2.label = r4
            r4 = r5
            r6 = r13
            r8 = r2
            java.lang.Object r1 = r3.mo6535a(r4, r6, r8)
            if (r1 != r9) goto L_0x0104
            return r9
        L_0x0104:
            r5 = r12
            r3 = r13
        L_0x0106:
            m0.l r1 = (p174m0.C7294l) r1
            long r6 = r1.f16178a
            long r3 = p174m0.C7294l.m14006d(r3, r6)
            androidx.compose.foundation.w r1 = r5.f1349f
            if (r1 == 0) goto L_0x013b
            boolean r1 = r1.isEnabled()
            if (r1 == 0) goto L_0x013b
            androidx.compose.foundation.w r1 = r5.f1349f
            androidx.compose.foundation.gestures.Orientation r6 = r5.f1344a
            androidx.compose.foundation.gestures.Orientation r7 = androidx.compose.foundation.gestures.Orientation.Horizontal
            if (r6 != r7) goto L_0x0125
            float r3 = p174m0.C7294l.m14004b(r3)
            goto L_0x0129
        L_0x0125:
            float r3 = p174m0.C7294l.m14005c(r3)
        L_0x0129:
            long r3 = r5.mo3822f(r3)
            r2.L$0 = r10
            r2.label = r11
            kotlin.m r1 = r1.mo3579c(r3)
            if (r1 != r9) goto L_0x0138
            return r9
        L_0x0138:
            kotlin.m r1 = kotlin.C19394m.f43287a
            return r1
        L_0x013b:
            kotlin.m r1 = kotlin.C19394m.f43287a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.mo3819c(float, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: d */
    public final float mo3820d(long j) {
        return this.f1344a == Orientation.Horizontal ? C8343c.m16642c(j) : C8343c.m16643d(j);
    }

    /* renamed from: e */
    public final long mo3821e(float f) {
        if (!(f == 0.0f)) {
            return this.f1344a == Orientation.Horizontal ? C19421p.m32952q(f, 0.0f) : C19421p.m32952q(0.0f, f);
        }
        int i = C8343c.f18298e;
        return C8343c.f18295b;
    }

    /* renamed from: f */
    public final long mo3822f(float f) {
        return this.f1344a == Orientation.Horizontal ? C1993m.m4370p(f, 0.0f) : C1993m.m4370p(0.0f, f);
    }
}
