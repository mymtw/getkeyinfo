package androidx.compose.foundation.lazy;

import androidx.activity.C0114h;
import androidx.compose.foundation.gestures.C0615m;
import androidx.compose.foundation.gestures.DefaultScrollableState;
import androidx.compose.foundation.interaction.C0641k;
import androidx.compose.foundation.layout.C0761x;
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
import p174m0.C7280a;
import p174m0.C7283c;
import p753kq.C19857l;

public final class LazyListState implements C0615m {

    /* renamed from: s */
    public static final C1374h f1600s = C1365a.m2862a(LazyListState$Companion$Saver$1.INSTANCE, LazyListState$Companion$Saver$2.INSTANCE);

    /* renamed from: a */
    public final C0861t f1601a;

    /* renamed from: b */
    public final ParcelableSnapshotMutableState f1602b;

    /* renamed from: c */
    public final C0641k f1603c;

    /* renamed from: d */
    public float f1604d;

    /* renamed from: e */
    public final ParcelableSnapshotMutableState f1605e;

    /* renamed from: f */
    public final DefaultScrollableState f1606f;

    /* renamed from: g */
    public boolean f1607g;

    /* renamed from: h */
    public int f1608h;

    /* renamed from: i */
    public C0845h.C0846a f1609i;

    /* renamed from: j */
    public boolean f1610j;

    /* renamed from: k */
    public final ParcelableSnapshotMutableState f1611k;

    /* renamed from: l */
    public final C0771a f1612l;

    /* renamed from: m */
    public final AwaitFirstLayoutModifier f1613m;

    /* renamed from: n */
    public final ParcelableSnapshotMutableState f1614n;

    /* renamed from: o */
    public final ParcelableSnapshotMutableState f1615o;

    /* renamed from: p */
    public boolean f1616p;

    /* renamed from: q */
    public boolean f1617q;

    /* renamed from: r */
    public final C0845h f1618r;

    /* renamed from: androidx.compose.foundation.lazy.LazyListState$a */
    public static final class C0771a implements C1692k0 {

        /* renamed from: b */
        public final /* synthetic */ LazyListState f1619b;

        public C0771a(LazyListState lazyListState) {
            this.f1619b = lazyListState;
        }

        /* renamed from: O */
        public final void mo4229O(LayoutNode layoutNode) {
            C19383o.m32797g(layoutNode, "remeasurement");
            this.f1619b.f1611k.setValue(layoutNode);
        }
    }

    public LazyListState(int i, int i2) {
        this.f1601a = new C0861t(i, i2);
        this.f1602b = C0761x.m1751w0(C0775b.f1621a, C1351n1.f2948a);
        this.f1603c = new C0641k();
        this.f1605e = C0761x.m1751w0(new C7283c(1.0f, 1.0f), C1351n1.f2948a);
        this.f1606f = new DefaultScrollableState(new LazyListState$scrollableState$1(this));
        this.f1607g = true;
        this.f1608h = -1;
        this.f1611k = C0761x.m1751w0((Object) null, C1351n1.f2948a);
        this.f1612l = new C0771a(this);
        this.f1613m = new AwaitFirstLayoutModifier();
        this.f1614n = C0761x.m1751w0((Object) null, C1351n1.f2948a);
        this.f1615o = C0761x.m1751w0(new C7280a(C0114h.m315r(0, 0, 15)), C1351n1.f2948a);
        this.f1618r = new C0845h();
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
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.LazyListState$scroll$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.foundation.lazy.LazyListState$scroll$1 r0 = (androidx.compose.foundation.lazy.LazyListState$scroll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.lazy.LazyListState$scroll$1 r0 = new androidx.compose.foundation.lazy.LazyListState$scroll$1
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
            androidx.compose.foundation.lazy.LazyListState r2 = (androidx.compose.foundation.lazy.LazyListState) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            goto L_0x0058
        L_0x0043:
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            androidx.compose.foundation.lazy.AwaitFirstLayoutModifier r8 = r5.f1613m
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
            androidx.compose.foundation.gestures.DefaultScrollableState r8 = r2.f1606f
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListState.mo3690a(androidx.compose.foundation.MutatePriority, kq.p, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: b */
    public final boolean mo3691b() {
        return this.f1606f.mo3691b();
    }

    /* renamed from: d */
    public final float mo3692d(float f) {
        return this.f1606f.mo3692d(f);
    }

    /* renamed from: e */
    public final int mo4224e() {
        return ((C0774a) this.f1601a.f1847a.getValue()).f1620a;
    }

    /* renamed from: f */
    public final int mo4225f() {
        return ((Number) this.f1601a.f1848b.getValue()).intValue();
    }

    /* renamed from: g */
    public final C0852m mo4226g() {
        return (C0852m) this.f1602b.getValue();
    }

    /* renamed from: h */
    public final void mo4227h(int i, int i2) {
        C0861t tVar = this.f1601a;
        tVar.mo4400a(i, i2);
        tVar.f1850d = null;
        LazyListItemPlacementAnimator lazyListItemPlacementAnimator = (LazyListItemPlacementAnimator) this.f1614n.getValue();
        if (lazyListItemPlacementAnimator != null) {
            lazyListItemPlacementAnimator.f1576c.clear();
            lazyListItemPlacementAnimator.f1577d = C19294b0.m32559p0();
            lazyListItemPlacementAnimator.f1578e = -1;
            lazyListItemPlacementAnimator.f1579f = 0;
            lazyListItemPlacementAnimator.f1580g = -1;
            lazyListItemPlacementAnimator.f1581h = 0;
        }
        C1690j0 j0Var = (C1690j0) this.f1611k.getValue();
        if (j0Var != null) {
            j0Var.mo6690b();
        }
    }

    /* renamed from: i */
    public final void mo4228i(C0829l lVar) {
        C1385f i;
        C19383o.m32797g(lVar, "itemProvider");
        C0861t tVar = this.f1601a;
        tVar.getClass();
        C1385f g = SnapshotKt.m2908g((C1385f) SnapshotKt.f2988b.mo5886c(), (C19857l<Object, C19394m>) null, false);
        try {
            i = g.mo6001i();
            Object obj = tVar.f1850d;
            int i2 = ((C0774a) tVar.f1847a.getValue()).f1620a;
            if (obj != null) {
                if (i2 >= lVar.getItemCount() || !C19383o.m32792b(obj, lVar.mo4201e(i2))) {
                    Integer num = lVar.mo4200d().get(obj);
                    if (num != null) {
                        i2 = num.intValue();
                    }
                }
            }
            tVar.mo4400a(i2, ((Number) tVar.f1848b.getValue()).intValue());
            C19394m mVar = C19394m.f43287a;
            C1385f.m2974o(i);
            g.mo5930c();
        } catch (Throwable th) {
            g.mo5930c();
            throw th;
        }
    }

    public LazyListState() {
        this(0, 0);
    }
}
