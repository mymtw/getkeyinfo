package androidx.compose.p015ui.input.nestedscroll;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import p098f0.C6764b;
import p098f0.C6765c;
import p098f0.C6766d;
import p098f0.C6767e;
import p288y.C8343c;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal */
public final class NestedScrollModifierLocal implements C6764b, C6765c<NestedScrollModifierLocal>, C1617a {

    /* renamed from: e */
    public static final /* synthetic */ int f3596e = 0;

    /* renamed from: b */
    public final NestedScrollDispatcher f3597b;

    /* renamed from: c */
    public final C1617a f3598c;

    /* renamed from: d */
    public final ParcelableSnapshotMutableState f3599d = C0761x.m1751w0((Object) null, C1351n1.f2948a);

    public NestedScrollModifierLocal(NestedScrollDispatcher nestedScrollDispatcher, C1617a aVar) {
        C19383o.m32797g(aVar, "connection");
        this.f3597b = nestedScrollDispatcher;
        this.f3598c = aVar;
        nestedScrollDispatcher.f3593a = new C19846a<C19525d0>(this) {
            public final /* synthetic */ NestedScrollModifierLocal this$0;

            {
                this.this$0 = r1;
            }

            public final C19525d0 invoke() {
                NestedScrollModifierLocal nestedScrollModifierLocal = this.this$0;
                int i = NestedScrollModifierLocal.f3596e;
                return nestedScrollModifierLocal.mo6541g();
            }
        };
    }

    /* renamed from: M */
    public final void mo3622M(C6766d dVar) {
        C19383o.m32797g(dVar, "scope");
        this.f3599d.setValue((NestedScrollModifierLocal) dVar.mo6818a(NestedScrollModifierLocalKt.f3600a));
        this.f3597b.f3595c = mo6542h();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo3814a(long r16, long r18, kotlin.coroutines.C19340c<? super p174m0.C7294l> r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r20
            boolean r2 = r1 instanceof androidx.compose.p015ui.input.nestedscroll.NestedScrollModifierLocal$onPostFling$1
            if (r2 == 0) goto L_0x0016
            r2 = r1
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPostFling$1 r2 = (androidx.compose.p015ui.input.nestedscroll.NestedScrollModifierLocal$onPostFling$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001b
        L_0x0016:
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPostFling$1 r2 = new androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPostFling$1
            r2.<init>(r15, r1)
        L_0x001b:
            java.lang.Object r1 = r2.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r9 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r2.label
            r10 = 2
            r4 = 1
            if (r3 == 0) goto L_0x0045
            if (r3 == r4) goto L_0x0037
            if (r3 != r10) goto L_0x002f
            long r2 = r2.J$0
            androidx.compose.foundation.layout.C0761x.m1684O0(r1)
            goto L_0x0088
        L_0x002f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0037:
            long r3 = r2.J$1
            long r5 = r2.J$0
            java.lang.Object r7 = r2.L$0
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal r7 = (androidx.compose.p015ui.input.nestedscroll.NestedScrollModifierLocal) r7
            androidx.compose.foundation.layout.C0761x.m1684O0(r1)
            r13 = r3
            r11 = r5
            goto L_0x0063
        L_0x0045:
            androidx.compose.foundation.layout.C0761x.m1684O0(r1)
            androidx.compose.ui.input.nestedscroll.a r3 = r0.f3598c
            r2.L$0 = r0
            r11 = r16
            r2.J$0 = r11
            r13 = r18
            r2.J$1 = r13
            r2.label = r4
            r4 = r16
            r6 = r18
            r8 = r2
            java.lang.Object r1 = r3.mo3814a(r4, r6, r8)
            if (r1 != r9) goto L_0x0062
            return r9
        L_0x0062:
            r7 = r0
        L_0x0063:
            m0.l r1 = (p174m0.C7294l) r1
            long r4 = r1.f16178a
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal r3 = r7.mo6542h()
            if (r3 == 0) goto L_0x008e
            long r6 = p174m0.C7294l.m14007e(r11, r4)
            long r11 = p174m0.C7294l.m14006d(r13, r4)
            r1 = 0
            r2.L$0 = r1
            r2.J$0 = r4
            r2.label = r10
            r13 = r4
            r4 = r6
            r6 = r11
            r8 = r2
            java.lang.Object r1 = r3.mo3814a(r4, r6, r8)
            if (r1 != r9) goto L_0x0087
            return r9
        L_0x0087:
            r2 = r13
        L_0x0088:
            m0.l r1 = (p174m0.C7294l) r1
            long r4 = r1.f16178a
            r13 = r2
            goto L_0x0093
        L_0x008e:
            r13 = r4
            int r1 = p174m0.C7294l.f16177c
            long r4 = p174m0.C7294l.f16176b
        L_0x0093:
            long r1 = p174m0.C7294l.m14007e(r13, r4)
            m0.l r3 = new m0.l
            r3.<init>(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.input.nestedscroll.NestedScrollModifierLocal.mo3814a(long, long, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: b */
    public final long mo4012b(int i, long j) {
        long j2;
        NestedScrollModifierLocal h = mo6542h();
        if (h != null) {
            j2 = h.mo4012b(i, j);
        } else {
            int i2 = C8343c.f18298e;
            j2 = C8343c.f18295b;
        }
        return C8343c.m16645f(j2, this.f3598c.mo4012b(i, C8343c.m16644e(j, j2)));
    }

    /* renamed from: d */
    public final long mo3815d(long j, long j2, int i) {
        long j3;
        long d = this.f3598c.mo3815d(j, j2, i);
        NestedScrollModifierLocal h = mo6542h();
        if (h != null) {
            j3 = h.mo3815d(C8343c.m16645f(j, d), C8343c.m16644e(j2, d), i);
        } else {
            int i2 = C8343c.f18298e;
            j3 = C8343c.f18295b;
        }
        return C8343c.m16645f(d, j3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0075 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo4013e(long r9, kotlin.coroutines.C19340c<? super p174m0.C7294l> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof androidx.compose.p015ui.input.nestedscroll.NestedScrollModifierLocal$onPreFling$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPreFling$1 r0 = (androidx.compose.p015ui.input.nestedscroll.NestedScrollModifierLocal$onPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPreFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPreFling$1
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            long r9 = r0.J$0
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            goto L_0x0076
        L_0x002c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0034:
            long r9 = r0.J$0
            java.lang.Object r2 = r0.L$0
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal r2 = (androidx.compose.p015ui.input.nestedscroll.NestedScrollModifierLocal) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            goto L_0x0055
        L_0x003e:
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal r11 = r8.mo6542h()
            if (r11 == 0) goto L_0x005a
            r0.L$0 = r8
            r0.J$0 = r9
            r0.label = r4
            java.lang.Object r11 = r11.mo4013e(r9, r0)
            if (r11 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r2 = r8
        L_0x0055:
            m0.l r11 = (p174m0.C7294l) r11
            long r4 = r11.f16178a
            goto L_0x005f
        L_0x005a:
            int r11 = p174m0.C7294l.f16177c
            long r4 = p174m0.C7294l.f16176b
            r2 = r8
        L_0x005f:
            r6 = r9
            r9 = r4
            r4 = r6
            androidx.compose.ui.input.nestedscroll.a r11 = r2.f3598c
            long r4 = p174m0.C7294l.m14006d(r4, r9)
            r2 = 0
            r0.L$0 = r2
            r0.J$0 = r9
            r0.label = r3
            java.lang.Object r11 = r11.mo4013e(r4, r0)
            if (r11 != r1) goto L_0x0076
            return r1
        L_0x0076:
            m0.l r11 = (p174m0.C7294l) r11
            long r0 = r11.f16178a
            long r9 = p174m0.C7294l.m14007e(r9, r0)
            m0.l r11 = new m0.l
            r11.<init>(r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.input.nestedscroll.NestedScrollModifierLocal.mo4013e(long, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: g */
    public final C19525d0 mo6541g() {
        C19525d0 d0Var;
        NestedScrollModifierLocal h = mo6542h();
        if ((h != null && (d0Var = h.mo6541g()) != null) || (d0Var = this.f3597b.f3594b) != null) {
            return d0Var;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final C6767e<NestedScrollModifierLocal> getKey() {
        return NestedScrollModifierLocalKt.f3600a;
    }

    public final Object getValue() {
        return this;
    }

    /* renamed from: h */
    public final NestedScrollModifierLocal mo6542h() {
        return (NestedScrollModifierLocal) this.f3599d.getValue();
    }
}
