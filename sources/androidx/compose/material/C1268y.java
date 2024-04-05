package androidx.compose.material;

import androidx.compose.animation.C0483r;
import androidx.compose.animation.core.C0424f;
import androidx.compose.animation.core.C0448r;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.state.ToggleableState;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1342k1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.material.y */
public final class C1268y implements C1226r {

    /* renamed from: a */
    public final long f2656a;

    /* renamed from: b */
    public final long f2657b;

    /* renamed from: c */
    public final long f2658c;

    /* renamed from: d */
    public final long f2659d;

    /* renamed from: e */
    public final long f2660e;

    /* renamed from: f */
    public final long f2661f;

    /* renamed from: g */
    public final long f2662g;

    /* renamed from: h */
    public final long f2663h;

    /* renamed from: i */
    public final long f2664i;

    /* renamed from: j */
    public final long f2665j;

    /* renamed from: k */
    public final long f2666k;

    /* renamed from: androidx.compose.material.y$a */
    public /* synthetic */ class C1269a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2667a;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            iArr[ToggleableState.On.ordinal()] = 1;
            iArr[ToggleableState.Indeterminate.ordinal()] = 2;
            iArr[ToggleableState.Off.ordinal()] = 3;
            f2667a = iArr;
        }
    }

    public C1268y(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11) {
        this.f2656a = j;
        this.f2657b = j2;
        this.f2658c = j3;
        this.f2659d = j4;
        this.f2660e = j5;
        this.f2661f = j6;
        this.f2662g = j7;
        this.f2663h = j8;
        this.f2664i = j9;
        this.f2665j = j10;
        this.f2666k = j11;
    }

    /* renamed from: a */
    public final C1342k1 mo5298a(boolean z, ToggleableState toggleableState, C1302d dVar) {
        long j;
        C1342k1 k1Var;
        C19383o.m32797g(toggleableState, "state");
        dVar.mo5465u(840901029);
        if (z) {
            int i = C1269a.f2667a[toggleableState.ordinal()];
            if (i == 1 || i == 2) {
                j = this.f2658c;
            } else if (i == 3) {
                j = this.f2659d;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            int i2 = C1269a.f2667a[toggleableState.ordinal()];
            if (i2 == 1) {
                j = this.f2660e;
            } else if (i2 == 2) {
                j = this.f2662g;
            } else if (i2 == 3) {
                j = this.f2661f;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (z) {
            dVar.mo5465u(-2010643579);
            k1Var = C0483r.m1263a(j, C0761x.m1706Z0(toggleableState == ToggleableState.Off ? 100 : 50, 0, (C0448r) null, 6), dVar, 0);
            dVar.mo5406H();
        } else {
            dVar.mo5465u(-2010643393);
            k1Var = C0761x.m1664E0(new C1545s(j), dVar);
            dVar.mo5406H();
        }
        dVar.mo5406H();
        return k1Var;
    }

    /* renamed from: b */
    public final C0424f mo5299b(ToggleableState toggleableState, C1302d dVar) {
        C19383o.m32797g(toggleableState, "state");
        dVar.mo5465u(544656267);
        ToggleableState toggleableState2 = ToggleableState.Off;
        C0424f a = C0483r.m1263a(toggleableState == toggleableState2 ? this.f2657b : this.f2656a, C0761x.m1706Z0(toggleableState == toggleableState2 ? 100 : 50, 0, (C0448r) null, 6), dVar, 0);
        dVar.mo5406H();
        return a;
    }

    /* renamed from: c */
    public final C1342k1 mo5300c(boolean z, ToggleableState toggleableState, C1302d dVar) {
        long j;
        C1342k1 k1Var;
        C19383o.m32797g(toggleableState, "state");
        dVar.mo5465u(-1568341342);
        if (z) {
            int i = C1269a.f2667a[toggleableState.ordinal()];
            if (i == 1 || i == 2) {
                j = this.f2663h;
            } else if (i == 3) {
                j = this.f2664i;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            int i2 = C1269a.f2667a[toggleableState.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    j = this.f2666k;
                } else if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            j = this.f2665j;
        }
        if (z) {
            dVar.mo5465u(-796405338);
            k1Var = C0483r.m1263a(j, C0761x.m1706Z0(toggleableState == ToggleableState.Off ? 100 : 50, 0, (C0448r) null, 6), dVar, 0);
            dVar.mo5406H();
        } else {
            dVar.mo5465u(-796405152);
            k1Var = C0761x.m1664E0(new C1545s(j), dVar);
            dVar.mo5406H();
        }
        dVar.mo5406H();
        return k1Var;
    }
}
