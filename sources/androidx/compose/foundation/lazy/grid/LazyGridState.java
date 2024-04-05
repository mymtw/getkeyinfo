package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.C0615m;
import androidx.compose.foundation.gestures.DefaultScrollableState;
import androidx.compose.foundation.interaction.C0641k;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.foundation.lazy.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.C0845h;
import androidx.compose.p015ui.layout.C1690j0;
import androidx.compose.p015ui.layout.C1692k0;
import androidx.compose.p015ui.node.LayoutNode;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.saveable.C1365a;
import androidx.compose.runtime.saveable.C1374h;
import androidx.compose.runtime.snapshots.C1385f;
import androidx.compose.runtime.snapshots.SnapshotKt;
import kotlin.C19394m;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p174m0.C7283c;
import p219r.C7734e;
import p753kq.C19857l;

public final class LazyGridState implements C0615m {

    /* renamed from: u */
    public static final C1374h f1672u = C1365a.m2862a(LazyGridState$Companion$Saver$1.INSTANCE, LazyGridState$Companion$Saver$2.INSTANCE);

    /* renamed from: a */
    public final C0815q f1673a;

    /* renamed from: b */
    public final ParcelableSnapshotMutableState f1674b;

    /* renamed from: c */
    public final C0641k f1675c;

    /* renamed from: d */
    public float f1676d;

    /* renamed from: e */
    public final ParcelableSnapshotMutableState f1677e;

    /* renamed from: f */
    public final ParcelableSnapshotMutableState f1678f;

    /* renamed from: g */
    public final ParcelableSnapshotMutableState f1679g;

    /* renamed from: h */
    public final DefaultScrollableState f1680h;

    /* renamed from: i */
    public boolean f1681i;

    /* renamed from: j */
    public int f1682j;

    /* renamed from: k */
    public final C7734e<C0845h.C0846a> f1683k;

    /* renamed from: l */
    public boolean f1684l;

    /* renamed from: m */
    public final ParcelableSnapshotMutableState f1685m;

    /* renamed from: n */
    public final C0795a f1686n;

    /* renamed from: o */
    public final AwaitFirstLayoutModifier f1687o;

    /* renamed from: p */
    public final ParcelableSnapshotMutableState f1688p;

    /* renamed from: q */
    public final ParcelableSnapshotMutableState f1689q;

    /* renamed from: r */
    public boolean f1690r;

    /* renamed from: s */
    public boolean f1691s;

    /* renamed from: t */
    public final C0845h f1692t;

    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridState$a */
    public static final class C0795a implements C1692k0 {

        /* renamed from: b */
        public final /* synthetic */ LazyGridState f1693b;

        public C0795a(LazyGridState lazyGridState) {
            this.f1693b = lazyGridState;
        }

        /* renamed from: O */
        public final void mo4229O(LayoutNode layoutNode) {
            C19383o.m32797g(layoutNode, "remeasurement");
            this.f1693b.f1685m.setValue(layoutNode);
        }
    }

    public LazyGridState(int i, int i2) {
        this.f1673a = new C0815q(i, i2);
        this.f1674b = C0761x.m1751w0(C0798a.f1694a, C1351n1.f2948a);
        this.f1675c = new C0641k();
        this.f1677e = C0761x.m1751w0(0, C1351n1.f2948a);
        this.f1678f = C0761x.m1751w0(new C7283c(1.0f, 1.0f), C1351n1.f2948a);
        this.f1679g = C0761x.m1751w0(Boolean.TRUE, C1351n1.f2948a);
        this.f1680h = new DefaultScrollableState(new LazyGridState$scrollableState$1(this));
        this.f1681i = true;
        this.f1682j = -1;
        this.f1683k = new C7734e<>(new C0845h.C0846a[16]);
        this.f1685m = C0761x.m1751w0((Object) null, C1351n1.f2948a);
        this.f1686n = new C0795a(this);
        this.f1687o = new AwaitFirstLayoutModifier();
        this.f1688p = C0761x.m1751w0(LazyGridState$prefetchInfoRetriever$2.INSTANCE, C1351n1.f2948a);
        this.f1689q = C0761x.m1751w0((Object) null, C1351n1.f2948a);
        this.f1692t = new C0845h();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: kq.p<? super androidx.compose.foundation.gestures.l, ? super kotlin.coroutines.c<? super kotlin.m>, ? extends java.lang.Object>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo3690a(androidx.compose.foundation.MutatePriority r6, p753kq.C19861p<? super androidx.compose.foundation.gestures.C0614l, ? super kotlin.coroutines.C19340c<? super kotlin.C19394m>, ? extends java.lang.Object> r7, kotlin.coroutines.C19340c<? super kotlin.C19394m> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1 r0 = (androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1 r0 = new androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0043
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            goto L_0x006a
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            java.lang.Object r6 = r0.L$2
            r7 = r6
            kq.p r7 = (p753kq.C19861p) r7
            java.lang.Object r6 = r0.L$1
            androidx.compose.foundation.MutatePriority r6 = (androidx.compose.foundation.MutatePriority) r6
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.lazy.grid.LazyGridState r2 = (androidx.compose.foundation.lazy.grid.LazyGridState) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            goto L_0x0058
        L_0x0043:
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            androidx.compose.foundation.lazy.AwaitFirstLayoutModifier r8 = r5.f1687o
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r8 = r8.mo4168a(r0)
            if (r8 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r2 = r5
        L_0x0058:
            androidx.compose.foundation.gestures.DefaultScrollableState r8 = r2.f1680h
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r6 = r8.mo3690a(r6, r7, r0)
            if (r6 != r1) goto L_0x006a
            return r1
        L_0x006a:
            kotlin.m r6 = kotlin.C19394m.f43287a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridState.mo3690a(androidx.compose.foundation.MutatePriority, kq.p, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: b */
    public final boolean mo3691b() {
        return this.f1680h.mo3691b();
    }

    /* renamed from: d */
    public final float mo3692d(float f) {
        return this.f1680h.mo3692d(f);
    }

    /* renamed from: e */
    public final int mo4313e() {
        return ((C0802d) this.f1673a.f1736a.getValue()).f1701a;
    }

    /* renamed from: f */
    public final int mo4314f() {
        return ((Number) this.f1673a.f1737b.getValue()).intValue();
    }

    /* renamed from: g */
    public final C0811m mo4315g() {
        return (C0811m) this.f1674b.getValue();
    }

    /* renamed from: h */
    public final void mo4316h(int i, int i2) {
        C0815q qVar = this.f1673a;
        qVar.mo4350a(i, i2);
        qVar.f1739d = null;
        LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator = (LazyGridItemPlacementAnimator) this.f1689q.getValue();
        if (lazyGridItemPlacementAnimator != null) {
            lazyGridItemPlacementAnimator.f1638d.clear();
            lazyGridItemPlacementAnimator.f1639e = C19294b0.m32559p0();
            lazyGridItemPlacementAnimator.f1640f = -1;
            lazyGridItemPlacementAnimator.f1641g = 0;
            lazyGridItemPlacementAnimator.f1642h = -1;
            lazyGridItemPlacementAnimator.f1643i = 0;
        }
        C1690j0 j0Var = (C1690j0) this.f1685m.getValue();
        if (j0Var != null) {
            j0Var.mo6690b();
        }
    }

    /* renamed from: i */
    public final void mo4317i(C0807i iVar) {
        C1385f i;
        C19383o.m32797g(iVar, "itemProvider");
        C0815q qVar = this.f1673a;
        qVar.getClass();
        C1385f g = SnapshotKt.m2908g((C1385f) SnapshotKt.f2988b.mo5886c(), (C19857l<Object, C19394m>) null, false);
        try {
            i = g.mo6001i();
            Object obj = qVar.f1739d;
            int i2 = ((C0802d) qVar.f1736a.getValue()).f1701a;
            if (obj != null) {
                if (i2 >= iVar.getItemCount() || !C19383o.m32792b(obj, iVar.mo4201e(i2))) {
                    Integer num = iVar.mo4200d().get(obj);
                    if (num != null) {
                        i2 = num.intValue();
                    }
                }
            }
            qVar.mo4350a(i2, ((Number) qVar.f1737b.getValue()).intValue());
            C19394m mVar = C19394m.f43287a;
            C1385f.m2974o(i);
            g.mo5930c();
        } catch (Throwable th) {
            g.mo5930c();
            throw th;
        }
    }

    public LazyGridState() {
        this(0, 0);
    }
}
