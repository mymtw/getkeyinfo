package androidx.compose.p015ui.node;

import android.support.p013v4.media.C0072d;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.graphics.C1549v;
import androidx.compose.p015ui.layout.C1665a;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.node.LayoutNode;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import org.apache.commons.lang3.ClassUtils;
import p174m0.C7280a;
import p174m0.C7287g;
import p174m0.C7290i;
import p219r.C7734e;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.node.OuterMeasurablePlaceable */
public final class OuterMeasurablePlaceable extends C1686i0 implements C1710u {

    /* renamed from: f */
    public final LayoutNode f3874f;

    /* renamed from: g */
    public LayoutNodeWrapper f3875g;

    /* renamed from: h */
    public boolean f3876h;

    /* renamed from: i */
    public boolean f3877i;

    /* renamed from: j */
    public boolean f3878j;

    /* renamed from: k */
    public long f3879k = C7287g.f16164b;

    /* renamed from: l */
    public C19857l<? super C1549v, C19394m> f3880l;

    /* renamed from: m */
    public float f3881m;

    /* renamed from: n */
    public Object f3882n;

    /* renamed from: androidx.compose.ui.node.OuterMeasurablePlaceable$a */
    public /* synthetic */ class C1731a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3883a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f3884b;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 1;
            iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 2;
            f3883a = iArr;
            int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
            iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
            iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
            f3884b = iArr2;
        }
    }

    public OuterMeasurablePlaceable(LayoutNode layoutNode, C1737d dVar) {
        C19383o.m32797g(layoutNode, "layoutNode");
        this.f3874f = layoutNode;
        this.f3875g = dVar;
    }

    /* renamed from: D */
    public final int mo6664D(int i) {
        mo6821N0();
        return this.f3875g.mo6664D(i);
    }

    /* renamed from: J */
    public final C1686i0 mo6665J(long j) {
        LayoutNode.UsageByParent usageByParent;
        LayoutNode w = this.f3874f.mo6766w();
        if (w != null) {
            LayoutNode layoutNode = this.f3874f;
            if (layoutNode.f3841z == LayoutNode.UsageByParent.NotUsed || layoutNode.f3799C) {
                int i = C1731a.f3883a[w.f3825j.ordinal()];
                if (i == 1) {
                    usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                } else if (i == 2) {
                    usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
                } else {
                    StringBuilder h = C0072d.m201h("Measurable could be only measured from the parent's measure or layout block.Parents state is ");
                    h.append(w.f3825j);
                    throw new IllegalStateException(h.toString());
                }
                C19383o.m32797g(usageByParent, "<set-?>");
                layoutNode.f3841z = usageByParent;
            } else {
                StringBuilder h2 = C0072d.m201h("measure() may not be called multiple times on the same Measurable. Current state ");
                h2.append(this.f3874f.f3841z);
                h2.append(". Parent state ");
                h2.append(w.f3825j);
                h2.append(ClassUtils.PACKAGE_SEPARATOR_CHAR);
                throw new IllegalStateException(h2.toString().toString());
            }
        } else {
            LayoutNode layoutNode2 = this.f3874f;
            LayoutNode.UsageByParent usageByParent2 = LayoutNode.UsageByParent.NotUsed;
            layoutNode2.getClass();
            C19383o.m32797g(usageByParent2, "<set-?>");
            layoutNode2.f3841z = usageByParent2;
        }
        mo6822P0(j);
        return this;
    }

    /* renamed from: M */
    public final int mo6661M(C1665a aVar) {
        C19383o.m32797g(aVar, "alignmentLine");
        LayoutNode w = this.f3874f.mo6766w();
        LayoutNode.LayoutState layoutState = null;
        if ((w != null ? w.f3825j : null) == LayoutNode.LayoutState.Measuring) {
            this.f3874f.f3836u.f3910c = true;
        } else {
            LayoutNode w2 = this.f3874f.mo6766w();
            if (w2 != null) {
                layoutState = w2.f3825j;
            }
            if (layoutState == LayoutNode.LayoutState.LayingOut) {
                this.f3874f.f3836u.f3911d = true;
            }
        }
        this.f3878j = true;
        int M = this.f3875g.mo6661M(aVar);
        this.f3878j = false;
        return M;
    }

    /* renamed from: N0 */
    public final void mo6821N0() {
        this.f3874f.mo6754S(false);
        LayoutNode w = this.f3874f.mo6766w();
        if (w != null) {
            LayoutNode layoutNode = this.f3874f;
            if (layoutNode.f3797A == LayoutNode.UsageByParent.NotUsed) {
                int i = C1731a.f3883a[w.f3825j.ordinal()];
                LayoutNode.UsageByParent usageByParent = i != 1 ? i != 2 ? w.f3797A : LayoutNode.UsageByParent.InLayoutBlock : LayoutNode.UsageByParent.InMeasureBlock;
                C19383o.m32797g(usageByParent, "<set-?>");
                layoutNode.f3797A = usageByParent;
            }
        }
    }

    /* renamed from: P0 */
    public final boolean mo6822P0(long j) {
        C1750p L0 = C15588c1.m25291L0(this.f3874f);
        LayoutNode w = this.f3874f.mo6766w();
        LayoutNode layoutNode = this.f3874f;
        boolean z = true;
        layoutNode.f3799C = layoutNode.f3799C || (w != null && w.f3799C);
        if (layoutNode.f3814R || !C7280a.m13957b(this.f3725e, j)) {
            LayoutNode layoutNode2 = this.f3874f;
            layoutNode2.f3836u.f3913f = false;
            C7734e<LayoutNode> y = layoutNode2.mo6768y();
            int i = y.f17157d;
            if (i > 0) {
                T[] tArr = y.f17155b;
                int i2 = 0;
                do {
                    ((LayoutNode) tArr[i2]).f3836u.f3910c = false;
                    i2++;
                } while (i2 < i);
            }
            this.f3876h = true;
            long j2 = this.f3875g.f3724d;
            mo6679y0(j);
            LayoutNode layoutNode3 = this.f3874f;
            layoutNode3.getClass();
            LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.Measuring;
            layoutNode3.f3825j = layoutState;
            layoutNode3.f3814R = false;
            OwnerSnapshotObserver snapshotObserver = C15588c1.m25291L0(layoutNode3).getSnapshotObserver();
            LayoutNode$performMeasure$1 layoutNode$performMeasure$1 = new LayoutNode$performMeasure$1(layoutNode3, j);
            snapshotObserver.getClass();
            snapshotObserver.mo6824b(layoutNode3, snapshotObserver.f3886b, layoutNode$performMeasure$1);
            if (layoutNode3.f3825j == layoutState) {
                layoutNode3.f3815S = true;
                layoutNode3.f3825j = LayoutNode.LayoutState.Idle;
            }
            if (C7290i.m13994a(this.f3875g.f3724d, j2)) {
                LayoutNodeWrapper layoutNodeWrapper = this.f3875g;
                if (layoutNodeWrapper.f3722b == this.f3722b && layoutNodeWrapper.f3723c == this.f3723c) {
                    z = false;
                }
            }
            LayoutNodeWrapper layoutNodeWrapper2 = this.f3875g;
            mo6678x0(C0761x.m1707a(layoutNodeWrapper2.f3722b, layoutNodeWrapper2.f3723c));
            return z;
        }
        L0.forceMeasureTheSubtree(this.f3874f);
        this.f3874f.mo6755T();
        return false;
    }

    /* renamed from: f */
    public final Object mo6722f() {
        return this.f3882n;
    }

    /* renamed from: i */
    public final int mo6667i(int i) {
        mo6821N0();
        return this.f3875g.mo6667i(i);
    }

    /* renamed from: i0 */
    public final int mo6675i0() {
        return this.f3875g.mo6675i0();
    }

    /* renamed from: o0 */
    public final int mo6676o0() {
        return this.f3875g.mo6676o0();
    }

    /* renamed from: q0 */
    public final void mo6662q0(long j, float f, C19857l<? super C1549v, C19394m> lVar) {
        this.f3879k = j;
        this.f3881m = f;
        this.f3880l = lVar;
        LayoutNodeWrapper layoutNodeWrapper = this.f3875g;
        LayoutNodeWrapper layoutNodeWrapper2 = layoutNodeWrapper.f3851g;
        if (layoutNodeWrapper2 != null && layoutNodeWrapper2.f3862r) {
            C1686i0.C1687a.C1688a aVar = C1686i0.C1687a.f3726a;
            if (lVar == null) {
                aVar.getClass();
                C1686i0.C1687a.m3582d(layoutNodeWrapper, j, f);
                return;
            }
            aVar.getClass();
            C1686i0.C1687a.m3587i(layoutNodeWrapper, j, f, lVar);
            return;
        }
        this.f3877i = true;
        LayoutNode layoutNode = this.f3874f;
        layoutNode.f3836u.f3914g = false;
        OwnerSnapshotObserver snapshotObserver = C15588c1.m25291L0(layoutNode).getSnapshotObserver();
        LayoutNode layoutNode2 = this.f3874f;
        OuterMeasurablePlaceable$placeAt$1 outerMeasurablePlaceable$placeAt$1 = new OuterMeasurablePlaceable$placeAt$1(this, j, f, lVar);
        snapshotObserver.getClass();
        C19383o.m32797g(layoutNode2, "node");
        snapshotObserver.mo6824b(layoutNode2, snapshotObserver.f3888d, outerMeasurablePlaceable$placeAt$1);
    }

    /* renamed from: s */
    public final int mo6668s(int i) {
        mo6821N0();
        return this.f3875g.mo6668s(i);
    }

    /* renamed from: z */
    public final int mo6669z(int i) {
        mo6821N0();
        return this.f3875g.mo6669z(i);
    }
}
