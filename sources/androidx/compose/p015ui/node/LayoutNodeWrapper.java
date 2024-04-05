package androidx.compose.p015ui.node;

import androidx.activity.C0114h;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1516e;
import androidx.compose.p015ui.graphics.C1517e0;
import androidx.compose.p015ui.graphics.C1520f0;
import androidx.compose.p015ui.graphics.C1524h0;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.p015ui.graphics.C1537o;
import androidx.compose.p015ui.graphics.C1540p0;
import androidx.compose.p015ui.graphics.C1549v;
import androidx.compose.p015ui.graphics.C1603w;
import androidx.compose.p015ui.input.pointer.C1650u;
import androidx.compose.p015ui.input.pointer.C1651v;
import androidx.compose.p015ui.layout.C1665a;
import androidx.compose.p015ui.layout.C1680f0;
import androidx.compose.p015ui.layout.C1684h0;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1689j;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.semantics.C1903j;
import androidx.compose.p015ui.semantics.C1904k;
import androidx.compose.p015ui.semantics.C1905l;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.snapshots.C1385f;
import androidx.compose.runtime.snapshots.SnapshotKt;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.LinkedHashMap;
import kotlin.C19394m;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p174m0.C7282b;
import p174m0.C7287g;
import p174m0.C7290i;
import p288y.C8342b;
import p288y.C8343c;
import p288y.C8345d;
import p288y.C8347f;
import p568fn.C17782b;
import p628nj.C18263b;
import p753kq.C19846a;
import p753kq.C19857l;
import p772tq.C20203a;

/* renamed from: androidx.compose.ui.node.LayoutNodeWrapper */
public abstract class LayoutNodeWrapper extends C1686i0 implements C1710u, C1689j, C1752q, C19857l<C1537o, C19394m> {

    /* renamed from: A */
    public static final C1727a f3845A = new C1727a();

    /* renamed from: B */
    public static final C1728b f3846B = new C1728b();

    /* renamed from: x */
    public static final C19857l<LayoutNodeWrapper, C19394m> f3847x = LayoutNodeWrapper$Companion$onCommitAffectingLayerParams$1.INSTANCE;

    /* renamed from: y */
    public static final C19857l<LayoutNodeWrapper, C19394m> f3848y = LayoutNodeWrapper$Companion$onCommitAffectingLayer$1.INSTANCE;

    /* renamed from: z */
    public static final C1524h0 f3849z = new C1524h0();

    /* renamed from: f */
    public final LayoutNode f3850f;

    /* renamed from: g */
    public LayoutNodeWrapper f3851g;

    /* renamed from: h */
    public boolean f3852h;

    /* renamed from: i */
    public C19857l<? super C1549v, C19394m> f3853i;

    /* renamed from: j */
    public C7282b f3854j;

    /* renamed from: k */
    public LayoutDirection f3855k;

    /* renamed from: l */
    public float f3856l = 0.8f;

    /* renamed from: m */
    public boolean f3857m;

    /* renamed from: n */
    public C1712w f3858n;

    /* renamed from: o */
    public LinkedHashMap f3859o;

    /* renamed from: p */
    public long f3860p;

    /* renamed from: q */
    public float f3861q;

    /* renamed from: r */
    public boolean f3862r;

    /* renamed from: s */
    public C8342b f3863s;

    /* renamed from: t */
    public final C1742i<?, ?>[] f3864t;

    /* renamed from: u */
    public final C19846a<C19394m> f3865u;

    /* renamed from: v */
    public boolean f3866v;

    /* renamed from: w */
    public C1749o f3867w;

    /* renamed from: androidx.compose.ui.node.LayoutNodeWrapper$a */
    public static final class C1727a implements C1729c<C1753r, C1650u, C1651v> {
        /* renamed from: a */
        public final void mo6811a(LayoutNode layoutNode, long j, C1734c<C1650u> cVar, boolean z, boolean z2) {
            C19383o.m32797g(cVar, "hitTestResult");
            layoutNode.mo6738A(j, cVar, z, z2);
        }

        /* renamed from: b */
        public final int mo6812b() {
            return 1;
        }

        /* renamed from: c */
        public final Object mo6813c(C1742i iVar) {
            C1753r rVar = (C1753r) iVar;
            C19383o.m32797g(rVar, "entity");
            return ((C1651v) rVar.f3920c).mo6547q0();
        }

        /* renamed from: d */
        public final boolean mo6814d(LayoutNode layoutNode) {
            C19383o.m32797g(layoutNode, "parentLayoutNode");
            return true;
        }

        /* renamed from: e */
        public final boolean mo6815e(C1742i iVar) {
            C1753r rVar = (C1753r) iVar;
            C19383o.m32797g(rVar, "entity");
            return ((C1651v) rVar.f3920c).mo6547q0().mo6560R0();
        }
    }

    /* renamed from: androidx.compose.ui.node.LayoutNodeWrapper$b */
    public static final class C1728b implements C1729c<C1904k, C1904k, C1905l> {
        /* renamed from: a */
        public final void mo6811a(LayoutNode layoutNode, long j, C1734c<C1904k> cVar, boolean z, boolean z2) {
            C19383o.m32797g(cVar, "hitTestResult");
            layoutNode.f3801E.f3875g.mo6796g1(LayoutNodeWrapper.f3846B, layoutNode.f3801E.f3875g.mo6788Y0(j), cVar, true, z2);
        }

        /* renamed from: b */
        public final int mo6812b() {
            return 2;
        }

        /* renamed from: c */
        public final Object mo6813c(C1742i iVar) {
            C1904k kVar = (C1904k) iVar;
            C19383o.m32797g(kVar, "entity");
            return kVar;
        }

        /* renamed from: d */
        public final boolean mo6814d(LayoutNode layoutNode) {
            C1903j c;
            C19383o.m32797g(layoutNode, "parentLayoutNode");
            C1904k T = C18263b.m30825T(layoutNode);
            boolean z = false;
            if (!(T == null || (c = T.mo7349c()) == null || !c.f4248d)) {
                z = true;
            }
            return !z;
        }

        /* renamed from: e */
        public final boolean mo6815e(C1742i iVar) {
            C19383o.m32797g((C1904k) iVar, "entity");
            return false;
        }
    }

    /* renamed from: androidx.compose.ui.node.LayoutNodeWrapper$c */
    public interface C1729c<T extends C1742i<T, M>, C, M extends C1436d> {
        /* renamed from: a */
        void mo6811a(LayoutNode layoutNode, long j, C1734c<C> cVar, boolean z, boolean z2);

        /* renamed from: b */
        int mo6812b();

        /* renamed from: c */
        C mo6813c(T t);

        /* renamed from: d */
        boolean mo6814d(LayoutNode layoutNode);

        /* renamed from: e */
        boolean mo6815e(T t);
    }

    public LayoutNodeWrapper(LayoutNode layoutNode) {
        C19383o.m32797g(layoutNode, "layoutNode");
        this.f3850f = layoutNode;
        this.f3854j = layoutNode.f3832q;
        this.f3855k = layoutNode.f3834s;
        int i = C7287g.f16165c;
        this.f3860p = C7287g.f16164b;
        this.f3864t = new C1742i[6];
        this.f3865u = new LayoutNodeWrapper$invalidateParentLayer$1(this);
    }

    /* renamed from: M */
    public final int mo6661M(C1665a aVar) {
        int R0;
        C19383o.m32797g(aVar, "alignmentLine");
        if ((this.f3858n != null) && (R0 = mo6781R0(aVar)) != Integer.MIN_VALUE) {
            return C7287g.m13992b(mo6674X()) + R0;
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: N0 */
    public final void mo6779N0(LayoutNodeWrapper layoutNodeWrapper, C8342b bVar, boolean z) {
        if (layoutNodeWrapper != this) {
            LayoutNodeWrapper layoutNodeWrapper2 = this.f3851g;
            if (layoutNodeWrapper2 != null) {
                layoutNodeWrapper2.mo6779N0(layoutNodeWrapper, bVar, z);
            }
            long j = this.f3860p;
            int i = C7287g.f16165c;
            float f = (float) ((int) (j >> 32));
            bVar.f18291a -= f;
            bVar.f18293c -= f;
            float b = (float) C7287g.m13992b(j);
            bVar.f18292b -= b;
            bVar.f18294d -= b;
            C1749o oVar = this.f3867w;
            if (oVar != null) {
                oVar.mapBounds(bVar, true);
                if (this.f3852h && z) {
                    long j2 = this.f3724d;
                    bVar.mo20920a(0.0f, 0.0f, (float) ((int) (j2 >> 32)), (float) C7290i.m13995b(j2));
                }
            }
        }
    }

    /* renamed from: O */
    public final LayoutNodeWrapper mo6682O() {
        if (mo6685c()) {
            return this.f3850f.f3801E.f3875g.f3851g;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    /* renamed from: P */
    public final long mo6683P(long j) {
        if (mo6685c()) {
            for (LayoutNodeWrapper layoutNodeWrapper = this; layoutNodeWrapper != null; layoutNodeWrapper = layoutNodeWrapper.f3851g) {
                j = layoutNodeWrapper.mo6808s1(j);
            }
            return j;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    /* renamed from: P0 */
    public final long mo6780P0(LayoutNodeWrapper layoutNodeWrapper, long j) {
        if (layoutNodeWrapper == this) {
            return j;
        }
        LayoutNodeWrapper layoutNodeWrapper2 = this.f3851g;
        return (layoutNodeWrapper2 == null || C19383o.m32792b(layoutNodeWrapper, layoutNodeWrapper2)) ? mo6788Y0(j) : mo6788Y0(layoutNodeWrapper2.mo6780P0(layoutNodeWrapper, j));
    }

    /* renamed from: R0 */
    public abstract int mo6781R0(C1665a aVar);

    /* renamed from: S0 */
    public final long mo6782S0(long j) {
        return C0114h.m319t(Math.max(0.0f, (C8347f.m16656d(j) - ((float) mo6676o0())) / 2.0f), Math.max(0.0f, (C8347f.m16654b(j) - ((float) mo6675i0())) / 2.0f));
    }

    /* renamed from: T0 */
    public final void mo6783T0() {
        for (T t : this.f3864t) {
            while (t != null) {
                t.mo6919b();
                t = t.f3921d;
            }
        }
        this.f3857m = false;
        mo6800k1(this.f3853i);
        LayoutNode w = this.f3850f.mo6766w();
        if (w != null) {
            w.mo6740C();
        }
    }

    /* renamed from: U0 */
    public final float mo6784U0(long j, long j2) {
        if (((float) mo6676o0()) >= C8347f.m16656d(j2) && ((float) mo6675i0()) >= C8347f.m16654b(j2)) {
            return Float.POSITIVE_INFINITY;
        }
        long S0 = mo6782S0(j2);
        float d = C8347f.m16656d(S0);
        float b = C8347f.m16654b(S0);
        float c = C8343c.m16642c(j);
        float max = Math.max(0.0f, c < 0.0f ? -c : c - ((float) mo6676o0()));
        float d2 = C8343c.m16643d(j);
        long q = C19421p.m32952q(max, Math.max(0.0f, d2 < 0.0f ? -d2 : d2 - ((float) mo6675i0())));
        if ((d <= 0.0f && b <= 0.0f) || C8343c.m16642c(q) > d || C8343c.m16643d(q) > b) {
            return Float.POSITIVE_INFINITY;
        }
        return (C8343c.m16643d(q) * C8343c.m16643d(q)) + (C8343c.m16642c(q) * C8343c.m16642c(q));
    }

    /* renamed from: V0 */
    public final void mo6785V0(C1537o oVar) {
        C19383o.m32797g(oVar, "canvas");
        C1749o oVar2 = this.f3867w;
        if (oVar2 != null) {
            oVar2.drawLayer(oVar);
            return;
        }
        long j = this.f3860p;
        float f = (float) ((int) (j >> 32));
        float b = (float) C7287g.m13992b(j);
        oVar.mo6260l(f, b);
        DrawEntity drawEntity = (DrawEntity) this.f3864t[0];
        if (drawEntity == null) {
            mo6803n1(oVar);
        } else {
            drawEntity.mo6736c(oVar);
        }
        oVar.mo6260l(-f, -b);
    }

    /* renamed from: W0 */
    public final void mo6786W0(C1537o oVar, C1516e eVar) {
        C19383o.m32797g(oVar, "canvas");
        C19383o.m32797g(eVar, "paint");
        long j = this.f3724d;
        oVar.mo6380c(new C8345d(0.5f, 0.5f, ((float) ((int) (j >> 32))) - 0.5f, ((float) C7290i.m13995b(j)) - 0.5f), eVar);
    }

    /* renamed from: X0 */
    public final LayoutNodeWrapper mo6787X0(LayoutNodeWrapper layoutNodeWrapper) {
        C19383o.m32797g(layoutNodeWrapper, "other");
        LayoutNode layoutNode = layoutNodeWrapper.f3850f;
        LayoutNode layoutNode2 = this.f3850f;
        if (layoutNode == layoutNode2) {
            LayoutNodeWrapper layoutNodeWrapper2 = layoutNode2.f3801E.f3875g;
            LayoutNodeWrapper layoutNodeWrapper3 = this;
            while (layoutNodeWrapper3 != layoutNodeWrapper2 && layoutNodeWrapper3 != layoutNodeWrapper) {
                layoutNodeWrapper3 = layoutNodeWrapper3.f3851g;
                C19383o.m32794d(layoutNodeWrapper3);
            }
            return layoutNodeWrapper3 == layoutNodeWrapper ? layoutNodeWrapper : this;
        }
        while (layoutNode.f3824i > layoutNode2.f3824i) {
            layoutNode = layoutNode.mo6766w();
            C19383o.m32794d(layoutNode);
        }
        while (layoutNode2.f3824i > layoutNode.f3824i) {
            layoutNode2 = layoutNode2.mo6766w();
            C19383o.m32794d(layoutNode2);
        }
        while (layoutNode != layoutNode2) {
            layoutNode = layoutNode.mo6766w();
            layoutNode2 = layoutNode2.mo6766w();
            if (layoutNode != null) {
                if (layoutNode2 == null) {
                }
            }
            throw new IllegalArgumentException("layouts are not part of the same hierarchy");
        }
        return layoutNode2 == this.f3850f ? this : layoutNode == layoutNodeWrapper.f3850f ? layoutNodeWrapper : layoutNode.f3800D;
    }

    /* renamed from: Y0 */
    public final long mo6788Y0(long j) {
        long j2 = this.f3860p;
        float c = C8343c.m16642c(j);
        int i = C7287g.f16165c;
        long q = C19421p.m32952q(c - ((float) ((int) (j2 >> 32))), C8343c.m16643d(j) - ((float) C7287g.m13992b(j2)));
        C1749o oVar = this.f3867w;
        return oVar != null ? oVar.m34778mapOffset8S9VItk(q, true) : q;
    }

    /* renamed from: Z0 */
    public final C1712w mo6789Z0() {
        C1712w wVar = this.f3858n;
        if (wVar != null) {
            return wVar;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier".toString());
    }

    /* renamed from: a */
    public final long mo6684a() {
        return this.f3724d;
    }

    /* renamed from: a1 */
    public abstract C1713x mo6790a1();

    /* renamed from: b1 */
    public final long mo6791b1() {
        return this.f3854j.mo3799w(this.f3850f.f3835t.mo6772d());
    }

    /* renamed from: c */
    public final boolean mo6685c() {
        if (!this.f3857m || this.f3850f.mo6696c()) {
            return this.f3857m;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: c1 */
    public final Object mo6792c1(C1756u<C1684h0> uVar) {
        if (uVar != null) {
            return ((C1684h0) uVar.f3920c).mo3274o0(mo6790a1(), mo6792c1((C1756u) uVar.f3921d));
        }
        LayoutNodeWrapper d1 = mo6793d1();
        if (d1 != null) {
            return d1.mo6722f();
        }
        return null;
    }

    /* renamed from: d1 */
    public LayoutNodeWrapper mo6793d1() {
        return null;
    }

    /* renamed from: e1 */
    public final <T extends C1742i<T, M>, C, M extends C1436d> void mo6794e1(T t, C1729c<T, C, M> cVar, long j, C1734c<C> cVar2, boolean z, boolean z2) {
        if (t == null) {
            mo6797h1(cVar, j, cVar2, z, z2);
            return;
        }
        C c = cVar.mo6813c(t);
        LayoutNodeWrapper$hit$1 layoutNodeWrapper$hit$1 = new LayoutNodeWrapper$hit$1(this, t, cVar, j, cVar2, z, z2);
        cVar2.getClass();
        cVar2.mo6839c(c, -1.0f, z2, layoutNodeWrapper$hit$1);
    }

    /* renamed from: f */
    public final Object mo6722f() {
        return mo6792c1((C1756u) this.f3864t[3]);
    }

    /* renamed from: f1 */
    public final <T extends C1742i<T, M>, C, M extends C1436d> void mo6795f1(T t, C1729c<T, C, M> cVar, long j, C1734c<C> cVar2, boolean z, boolean z2, float f) {
        if (t == null) {
            mo6797h1(cVar, j, cVar2, z, z2);
            return;
        }
        C c = cVar.mo6813c(t);
        LayoutNodeWrapper$hitNear$1 layoutNodeWrapper$hitNear$1 = new LayoutNodeWrapper$hitNear$1(this, t, cVar, j, cVar2, z, z2, f);
        cVar2.mo6839c(c, f, z2, layoutNodeWrapper$hitNear$1);
    }

    /* renamed from: g1 */
    public final <T extends C1742i<T, M>, C, M extends C1436d> void mo6796g1(C1729c<T, C, M> cVar, long j, C1734c<C> cVar2, boolean z, boolean z2) {
        long j2 = j;
        C1734c<C> cVar3 = cVar2;
        C19383o.m32797g(cVar, "hitTestSource");
        C19383o.m32797g(cVar3, "hitTestResult");
        C1742i<?, ?> iVar = this.f3864t[cVar.mo6812b()];
        boolean z3 = false;
        boolean z4 = true;
        if (!mo6810u1(j2)) {
            if (z) {
                float U0 = mo6784U0(j2, mo6791b1());
                if (!Float.isInfinite(U0) && !Float.isNaN(U0)) {
                    if (cVar3.f3893d != C17782b.m29859Y(cVar2)) {
                        if (C19382n.m32731S(cVar2.mo6834a(), C18263b.m30858o(U0, false)) > 0) {
                            z3 = true;
                        }
                        z4 = z3;
                    }
                    if (z4) {
                        mo6795f1(iVar, cVar, j, cVar2, z, false, U0);
                    }
                }
            }
        } else if (iVar == null) {
            mo6797h1(cVar, j, cVar2, z, z2);
        } else {
            float c = C8343c.m16642c(j);
            float d = C8343c.m16643d(j);
            if (c >= 0.0f && d >= 0.0f && c < ((float) mo6676o0()) && d < ((float) mo6675i0())) {
                mo6794e1(iVar, cVar, j, cVar2, z, z2);
                return;
            }
            float U02 = !z ? Float.POSITIVE_INFINITY : mo6784U0(j2, mo6791b1());
            if (!Float.isInfinite(U02) && !Float.isNaN(U02)) {
                if (cVar3.f3893d == C17782b.m29859Y(cVar2)) {
                    boolean z5 = z2;
                } else {
                    if (C19382n.m32731S(cVar2.mo6834a(), C18263b.m30858o(U02, z2)) > 0) {
                        z3 = true;
                    }
                    z4 = z3;
                }
                if (z4) {
                    mo6795f1(iVar, cVar, j, cVar2, z, z2, U02);
                    return;
                }
            } else {
                boolean z6 = z2;
            }
            mo6807r1(iVar, cVar, j, cVar2, z, z2, U02);
        }
    }

    /* renamed from: h1 */
    public <T extends C1742i<T, M>, C, M extends C1436d> void mo6797h1(C1729c<T, C, M> cVar, long j, C1734c<C> cVar2, boolean z, boolean z2) {
        C19383o.m32797g(cVar, "hitTestSource");
        C19383o.m32797g(cVar2, "hitTestResult");
        LayoutNodeWrapper d1 = mo6793d1();
        if (d1 != null) {
            d1.mo6796g1(cVar, d1.mo6788Y0(j), cVar2, z, z2);
        }
    }

    /* renamed from: i1 */
    public final void mo6798i1() {
        C1749o oVar = this.f3867w;
        if (oVar != null) {
            oVar.invalidate();
            return;
        }
        LayoutNodeWrapper layoutNodeWrapper = this.f3851g;
        if (layoutNodeWrapper != null) {
            layoutNodeWrapper.mo6798i1();
        }
    }

    public final Object invoke(Object obj) {
        C1537o oVar = (C1537o) obj;
        C19383o.m32797g(oVar, "canvas");
        LayoutNode layoutNode = this.f3850f;
        if (layoutNode.f3837v) {
            C15588c1.m25291L0(layoutNode).getSnapshotObserver().mo6824b(this, f3848y, new LayoutNodeWrapper$invoke$1(this, oVar));
            this.f3866v = false;
        } else {
            this.f3866v = true;
        }
        return C19394m.f43287a;
    }

    public final boolean isValid() {
        return this.f3867w != null;
    }

    /* renamed from: j1 */
    public final boolean mo6799j1() {
        if (this.f3867w != null && this.f3856l <= 0.0f) {
            return true;
        }
        LayoutNodeWrapper layoutNodeWrapper = this.f3851g;
        if (layoutNodeWrapper != null) {
            return layoutNodeWrapper.mo6799j1();
        }
        return false;
    }

    /* renamed from: k1 */
    public final void mo6800k1(C19857l<? super C1549v, C19394m> lVar) {
        LayoutNode layoutNode;
        C1750p pVar;
        boolean z = (this.f3853i == lVar && C19383o.m32792b(this.f3854j, this.f3850f.f3832q) && this.f3855k == this.f3850f.f3834s) ? false : true;
        this.f3853i = lVar;
        LayoutNode layoutNode2 = this.f3850f;
        this.f3854j = layoutNode2.f3832q;
        this.f3855k = layoutNode2.f3834s;
        if (!mo6685c() || lVar == null) {
            C1749o oVar = this.f3867w;
            if (oVar != null) {
                oVar.destroy();
                this.f3850f.f3805I = true;
                this.f3865u.invoke();
                if (mo6685c() && (pVar = layoutNode.f3823h) != null) {
                    pVar.onLayoutChange((layoutNode = this.f3850f));
                }
            }
            this.f3867w = null;
            this.f3866v = false;
        } else if (this.f3867w == null) {
            C1749o createLayer = C15588c1.m25291L0(this.f3850f).createLayer(this, this.f3865u);
            createLayer.m34780resizeozmzZPI(this.f3724d);
            createLayer.m34779movegyyYBs(this.f3860p);
            this.f3867w = createLayer;
            mo6809t1();
            this.f3850f.f3805I = true;
            this.f3865u.invoke();
        } else if (z) {
            mo6809t1();
        }
    }

    /* renamed from: l1 */
    public final void mo6801l1() {
        C1385f i;
        if (C20203a.m34521D(this.f3864t, 5)) {
            C1385f g = SnapshotKt.m2908g((C1385f) SnapshotKt.f2988b.mo5886c(), (C19857l<Object, C19394m>) null, false);
            try {
                i = g.mo6001i();
                for (T t = this.f3864t[5]; t != null; t = t.f3921d) {
                    ((C1680f0) ((C1756u) t).f3920c).mo3730z(this.f3724d);
                }
                C19394m mVar = C19394m.f43287a;
                C1385f.m2974o(i);
                g.mo5930c();
            } catch (Throwable th) {
                g.mo5930c();
                throw th;
            }
        }
    }

    /* renamed from: m */
    public final long mo6686m(C1689j jVar, long j) {
        C19383o.m32797g(jVar, "sourceCoordinates");
        LayoutNodeWrapper layoutNodeWrapper = (LayoutNodeWrapper) jVar;
        LayoutNodeWrapper X0 = mo6787X0(layoutNodeWrapper);
        while (layoutNodeWrapper != X0) {
            j = layoutNodeWrapper.mo6808s1(j);
            layoutNodeWrapper = layoutNodeWrapper.f3851g;
            C19383o.m32794d(layoutNodeWrapper);
        }
        return mo6780P0(X0, j);
    }

    /* renamed from: m1 */
    public void mo6802m1() {
        C1749o oVar = this.f3867w;
        if (oVar != null) {
            oVar.invalidate();
        }
    }

    /* renamed from: n1 */
    public void mo6803n1(C1537o oVar) {
        C19383o.m32797g(oVar, "canvas");
        LayoutNodeWrapper d1 = mo6793d1();
        if (d1 != null) {
            d1.mo6785V0(oVar);
        }
    }

    /* renamed from: o1 */
    public final void mo6804o1(C8342b bVar, boolean z, boolean z2) {
        C1749o oVar = this.f3867w;
        if (oVar != null) {
            if (this.f3852h) {
                if (z2) {
                    long b1 = mo6791b1();
                    float d = C8347f.m16656d(b1) / 2.0f;
                    float b = C8347f.m16654b(b1) / 2.0f;
                    long j = this.f3724d;
                    bVar.mo20920a(-d, -b, ((float) ((int) (j >> 32))) + d, ((float) C7290i.m13995b(j)) + b);
                } else if (z) {
                    long j2 = this.f3724d;
                    bVar.mo20920a(0.0f, 0.0f, (float) ((int) (j2 >> 32)), (float) C7290i.m13995b(j2));
                }
                if (bVar.mo20921b()) {
                    return;
                }
            }
            oVar.mapBounds(bVar, false);
        }
        long j3 = this.f3860p;
        int i = C7287g.f16165c;
        float f = (float) ((int) (j3 >> 32));
        bVar.f18291a += f;
        bVar.f18293c += f;
        float b2 = (float) C7287g.m13992b(j3);
        bVar.f18292b += b2;
        bVar.f18294d += b2;
    }

    /* renamed from: p1 */
    public final void mo6805p1(C1712w wVar) {
        LayoutNode w;
        C19383o.m32797g(wVar, "value");
        C1712w wVar2 = this.f3858n;
        if (wVar != wVar2) {
            this.f3858n = wVar;
            if (!(wVar2 != null && wVar.getWidth() == wVar2.getWidth() && wVar.getHeight() == wVar2.getHeight())) {
                int width = wVar.getWidth();
                int height = wVar.getHeight();
                C1749o oVar = this.f3867w;
                if (oVar != null) {
                    oVar.m34780resizeozmzZPI(C0761x.m1707a(width, height));
                } else {
                    LayoutNodeWrapper layoutNodeWrapper = this.f3851g;
                    if (layoutNodeWrapper != null) {
                        layoutNodeWrapper.mo6798i1();
                    }
                }
                LayoutNode layoutNode = this.f3850f;
                C1750p pVar = layoutNode.f3823h;
                if (pVar != null) {
                    pVar.onLayoutChange(layoutNode);
                }
                mo6678x0(C0761x.m1707a(width, height));
                for (T t = this.f3864t[0]; t != null; t = t.f3921d) {
                    ((DrawEntity) t).f3787h = true;
                }
            }
            LinkedHashMap linkedHashMap = this.f3859o;
            if ((!(linkedHashMap == null || linkedHashMap.isEmpty()) || (!wVar.mo4345d().isEmpty())) && !C19383o.m32792b(wVar.mo4345d(), this.f3859o)) {
                LayoutNodeWrapper d1 = mo6793d1();
                if (C19383o.m32792b(d1 != null ? d1.f3850f : null, this.f3850f)) {
                    LayoutNode w2 = this.f3850f.mo6766w();
                    if (w2 != null) {
                        w2.mo6747L();
                    }
                    LayoutNode layoutNode2 = this.f3850f;
                    C1740g gVar = layoutNode2.f3836u;
                    if (gVar.f3910c) {
                        LayoutNode w3 = layoutNode2.mo6766w();
                        if (w3 != null) {
                            w3.mo6754S(false);
                        }
                    } else if (gVar.f3911d && (w = layoutNode2.mo6766w()) != null) {
                        w.mo6753R(false);
                    }
                } else {
                    this.f3850f.mo6747L();
                }
                this.f3850f.f3836u.f3909b = true;
                LinkedHashMap linkedHashMap2 = this.f3859o;
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap();
                    this.f3859o = linkedHashMap2;
                }
                linkedHashMap2.clear();
                linkedHashMap2.putAll(wVar.mo4345d());
            }
        }
    }

    /* renamed from: q0 */
    public void mo6662q0(long j, float f, C19857l<? super C1549v, C19394m> lVar) {
        mo6800k1(lVar);
        long j2 = this.f3860p;
        int i = C7287g.f16165c;
        if (!(j2 == j)) {
            this.f3860p = j;
            C1749o oVar = this.f3867w;
            if (oVar != null) {
                oVar.m34779movegyyYBs(j);
            } else {
                LayoutNodeWrapper layoutNodeWrapper = this.f3851g;
                if (layoutNodeWrapper != null) {
                    layoutNodeWrapper.mo6798i1();
                }
            }
            LayoutNodeWrapper d1 = mo6793d1();
            if (!C19383o.m32792b(d1 != null ? d1.f3850f : null, this.f3850f)) {
                this.f3850f.mo6747L();
            } else {
                LayoutNode w = this.f3850f.mo6766w();
                if (w != null) {
                    w.mo6747L();
                }
            }
            LayoutNode layoutNode = this.f3850f;
            C1750p pVar = layoutNode.f3823h;
            if (pVar != null) {
                pVar.onLayoutChange(layoutNode);
            }
        }
        this.f3861q = f;
    }

    /* renamed from: q1 */
    public final boolean mo6806q1() {
        C1753r rVar = (C1753r) this.f3864t[1];
        if (rVar != null && rVar.mo6982c()) {
            return true;
        }
        LayoutNodeWrapper d1 = mo6793d1();
        return d1 != null && d1.mo6806q1();
    }

    /* renamed from: r */
    public final long mo6687r(long j) {
        if (mo6685c()) {
            C1689j Y = C0114h.m294Y(this);
            return mo6686m(Y, C8343c.m16644e(C15588c1.m25291L0(this.f3850f).m34782calculateLocalPositionMKHz9U(j), C0114h.m320t0(Y)));
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    /* renamed from: r1 */
    public final <T extends C1742i<T, M>, C, M extends C1436d> void mo6807r1(T t, C1729c<T, C, M> cVar, long j, C1734c<C> cVar2, boolean z, boolean z2, float f) {
        T t2 = t;
        C1729c<T, C, M> cVar3 = cVar;
        C1734c<C> cVar4 = cVar2;
        boolean z3 = z2;
        float f2 = f;
        if (t2 == null) {
            mo6797h1(cVar, j, cVar2, z, z2);
        } else if (cVar3.mo6815e(t2)) {
            C c = cVar3.mo6813c(t2);
            LayoutNodeWrapper$speculativeHit$1 layoutNodeWrapper$speculativeHit$1 = new LayoutNodeWrapper$speculativeHit$1(this, t, cVar, j, cVar2, z, z2, f);
            cVar2.getClass();
            if (cVar4.f3893d == C17782b.m29859Y(cVar2)) {
                cVar4.mo6839c(c, f2, z3, layoutNodeWrapper$speculativeHit$1);
                if (cVar4.f3893d + 1 == C17782b.m29859Y(cVar2)) {
                    cVar2.mo6843e();
                    return;
                }
                return;
            }
            long a = cVar2.mo6834a();
            int i = cVar4.f3893d;
            cVar4.f3893d = C17782b.m29859Y(cVar2);
            cVar4.mo6839c(c, f2, z3, layoutNodeWrapper$speculativeHit$1);
            if (cVar4.f3893d + 1 < C17782b.m29859Y(cVar2) && C19382n.m32731S(a, cVar2.mo6834a()) > 0) {
                int i2 = cVar4.f3893d + 1;
                int i3 = i + 1;
                Object[] objArr = cVar4.f3891b;
                C19318k.m32603U0(objArr, i3, objArr, i2, cVar4.f3894e);
                long[] jArr = cVar4.f3892c;
                int i4 = cVar4.f3894e;
                C19383o.m32797g(jArr, "<this>");
                System.arraycopy(jArr, i2, jArr, i3, i4 - i2);
                cVar4.f3893d = ((cVar4.f3894e + i) - cVar4.f3893d) - 1;
            }
            cVar2.mo6843e();
            cVar4.f3893d = i;
        } else {
            mo6807r1(t2.f3921d, cVar, j, cVar2, z, z2, f);
        }
    }

    /* renamed from: s1 */
    public final long mo6808s1(long j) {
        C1749o oVar = this.f3867w;
        if (oVar != null) {
            j = oVar.m34778mapOffset8S9VItk(j, false);
        }
        long j2 = this.f3860p;
        float c = C8343c.m16642c(j);
        int i = C7287g.f16165c;
        return C19421p.m32952q(c + ((float) ((int) (j2 >> 32))), C8343c.m16643d(j) + ((float) C7287g.m13992b(j2)));
    }

    /* renamed from: t */
    public final long mo6688t(long j) {
        return C15588c1.m25291L0(this.f3850f).m34783calculatePositionInWindowMKHz9U(mo6683P(j));
    }

    /* renamed from: t1 */
    public final void mo6809t1() {
        LayoutNodeWrapper layoutNodeWrapper;
        C1749o oVar = this.f3867w;
        boolean z = false;
        if (oVar != null) {
            C19857l<? super C1549v, C19394m> lVar = this.f3853i;
            if (lVar != null) {
                C1524h0 h0Var = f3849z;
                h0Var.f3302b = 1.0f;
                h0Var.f3303c = 1.0f;
                h0Var.f3304d = 1.0f;
                h0Var.f3305e = 0.0f;
                h0Var.f3306f = 0.0f;
                h0Var.f3307g = 0.0f;
                long j = C1603w.f3569a;
                h0Var.f3308h = j;
                h0Var.f3309i = j;
                h0Var.f3310j = 0.0f;
                h0Var.f3311k = 0.0f;
                h0Var.f3312l = 0.0f;
                h0Var.f3313m = 8.0f;
                h0Var.f3314n = C1540p0.f3337b;
                h0Var.f3315o = C1517e0.f3292a;
                h0Var.f3316p = false;
                h0Var.f3318r = null;
                C7282b bVar = this.f3850f.f3832q;
                C19383o.m32797g(bVar, "<set-?>");
                h0Var.f3317q = bVar;
                C15588c1.m25291L0(this.f3850f).getSnapshotObserver().mo6824b(this, f3847x, new LayoutNodeWrapper$updateLayerParameters$1(lVar));
                float f = h0Var.f3302b;
                float f2 = h0Var.f3303c;
                float f3 = h0Var.f3304d;
                float f4 = h0Var.f3305e;
                float f5 = h0Var.f3306f;
                float f6 = h0Var.f3307g;
                long j2 = h0Var.f3308h;
                long j3 = h0Var.f3309i;
                float f7 = h0Var.f3310j;
                float f8 = h0Var.f3311k;
                float f9 = h0Var.f3312l;
                float f10 = h0Var.f3313m;
                long j4 = h0Var.f3314n;
                C1530k0 k0Var = h0Var.f3315o;
                float f11 = f;
                float f12 = f2;
                C1524h0 h0Var2 = h0Var;
                boolean z2 = h0Var.f3316p;
                C1520f0 f0Var = h0Var2.f3318r;
                LayoutNode layoutNode = this.f3850f;
                oVar.m34781updateLayerPropertiesNHXXZp8(f11, f12, f3, f4, f5, f6, f7, f8, f9, f10, j4, k0Var, z2, f0Var, j2, j3, layoutNode.f3834s, layoutNode.f3832q);
                layoutNodeWrapper = this;
                layoutNodeWrapper.f3852h = h0Var2.f3316p;
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            layoutNodeWrapper = this;
            if (layoutNodeWrapper.f3853i == null) {
                z = true;
            }
            if (!z) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        layoutNodeWrapper.f3856l = f3849z.f3304d;
        LayoutNode layoutNode2 = layoutNodeWrapper.f3850f;
        C1750p pVar = layoutNode2.f3823h;
        if (pVar != null) {
            pVar.onLayoutChange(layoutNode2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0032  */
    /* renamed from: u1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo6810u1(long r5) {
        /*
            r4 = this;
            float r0 = p288y.C8343c.m16642c(r5)
            boolean r1 = java.lang.Float.isInfinite(r0)
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0014
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x0014
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r3
        L_0x0015:
            if (r0 == 0) goto L_0x002e
            float r0 = p288y.C8343c.m16643d(r5)
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L_0x0029
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x0029
            r0 = r2
            goto L_0x002a
        L_0x0029:
            r0 = r3
        L_0x002a:
            if (r0 == 0) goto L_0x002e
            r0 = r2
            goto L_0x002f
        L_0x002e:
            r0 = r3
        L_0x002f:
            if (r0 != 0) goto L_0x0032
            return r3
        L_0x0032:
            androidx.compose.ui.node.o r0 = r4.f3867w
            if (r0 == 0) goto L_0x0042
            boolean r1 = r4.f3852h
            if (r1 == 0) goto L_0x0042
            boolean r5 = r0.m34777isInLayerk4lQ0M(r5)
            if (r5 == 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r2 = r3
        L_0x0042:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.node.LayoutNodeWrapper.mo6810u1(long):boolean");
    }

    /* renamed from: v */
    public final C8345d mo6689v(C1689j jVar, boolean z) {
        C19383o.m32797g(jVar, "sourceCoordinates");
        if (!mo6685c()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
        } else if (jVar.mo6685c()) {
            LayoutNodeWrapper layoutNodeWrapper = (LayoutNodeWrapper) jVar;
            LayoutNodeWrapper X0 = mo6787X0(layoutNodeWrapper);
            C8342b bVar = this.f3863s;
            if (bVar == null) {
                bVar = new C8342b();
                this.f3863s = bVar;
            }
            bVar.f18291a = 0.0f;
            bVar.f18292b = 0.0f;
            bVar.f18293c = (float) ((int) (jVar.mo6684a() >> 32));
            bVar.f18294d = (float) C7290i.m13995b(jVar.mo6684a());
            while (layoutNodeWrapper != X0) {
                layoutNodeWrapper.mo6804o1(bVar, z, false);
                if (bVar.mo20921b()) {
                    return C8345d.f18300e;
                }
                layoutNodeWrapper = layoutNodeWrapper.f3851g;
                C19383o.m32794d(layoutNodeWrapper);
            }
            mo6779N0(X0, bVar, z);
            return new C8345d(bVar.f18291a, bVar.f18292b, bVar.f18293c, bVar.f18294d);
        } else {
            throw new IllegalStateException(("LayoutCoordinates " + jVar + " is not attached!").toString());
        }
    }
}
