package androidx.compose.p015ui.node;

import androidx.compose.p015ui.graphics.C1516e;
import androidx.compose.p015ui.graphics.C1537o;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.graphics.C1549v;
import androidx.compose.p015ui.layout.C1665a;
import androidx.compose.p015ui.layout.C1678e0;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.node.LayoutNode;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p174m0.C7282b;
import p219r.C7734e;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.node.d */
public final class C1737d extends LayoutNodeWrapper implements C7282b {

    /* renamed from: D */
    public static final C1516e f3902D;

    /* renamed from: C */
    public final /* synthetic */ C1713x f3903C;

    static {
        C1516e eVar = new C1516e();
        eVar.mo6241e(C1545s.f3359d);
        eVar.mo6334t(1.0f);
        eVar.mo6335u(1);
        f3902D = eVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1737d(LayoutNode layoutNode) {
        super(layoutNode);
        C19383o.m32797g(layoutNode, "layoutNode");
        this.f3903C = layoutNode.f3833r;
    }

    /* renamed from: A */
    public final long mo3788A(long j) {
        return this.f3903C.mo3788A(j);
    }

    /* renamed from: B0 */
    public final float mo3789B0(float f) {
        return this.f3903C.mo3789B0(f);
    }

    /* renamed from: D */
    public final int mo6664D(int i) {
        C1738e eVar = this.f3850f.f3831p;
        C1711v a = eVar.mo6896a();
        LayoutNode layoutNode = eVar.f3904a;
        return a.mo3259a(layoutNode.f3833r, layoutNode.mo6764u(), i);
    }

    /* renamed from: E0 */
    public final int mo3790E0(long j) {
        return this.f3903C.mo3790E0(j);
    }

    /* renamed from: J */
    public final C1686i0 mo6665J(long j) {
        mo6679y0(j);
        C7734e<LayoutNode> y = this.f3850f.mo6768y();
        int i = y.f17157d;
        if (i > 0) {
            int i2 = 0;
            T[] tArr = y.f17155b;
            do {
                LayoutNode layoutNode = (LayoutNode) tArr[i2];
                LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
                layoutNode.getClass();
                C19383o.m32797g(usageByParent, "<set-?>");
                layoutNode.f3841z = usageByParent;
                i2++;
            } while (i2 < i);
        }
        LayoutNode layoutNode2 = this.f3850f;
        C1712w b = layoutNode2.f3830o.mo3260b(layoutNode2.f3833r, layoutNode2.mo6764u(), j);
        LayoutNode layoutNode3 = this.f3850f;
        layoutNode3.getClass();
        C19383o.m32797g(b, "measureResult");
        layoutNode3.f3800D.mo6805p1(b);
        mo6801l1();
        return this;
    }

    /* renamed from: R0 */
    public final int mo6781R0(C1665a aVar) {
        C19383o.m32797g(aVar, "alignmentLine");
        LayoutNode layoutNode = this.f3850f;
        if (!layoutNode.f3801E.f3878j) {
            if (layoutNode.f3825j == LayoutNode.LayoutState.Measuring) {
                C1740g gVar = layoutNode.f3836u;
                gVar.f3913f = true;
                if (gVar.f3909b) {
                    layoutNode.f3815S = true;
                }
            } else {
                layoutNode.f3836u.f3914g = true;
            }
        }
        layoutNode.mo6743G();
        Integer num = (Integer) layoutNode.f3836u.f3916i.get(aVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: V */
    public final int mo3791V(float f) {
        return this.f3903C.mo3791V(f);
    }

    /* renamed from: a1 */
    public final C1713x mo6790a1() {
        return this.f3850f.f3833r;
    }

    /* renamed from: b0 */
    public final float mo3793b0(long j) {
        return this.f3903C.mo3793b0(j);
    }

    /* renamed from: e */
    public final float mo3794e(long j) {
        return this.f3903C.mo3794e(j);
    }

    public final float getDensity() {
        return this.f3903C.getDensity();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* renamed from: h1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends androidx.compose.p015ui.node.C1742i<T, M>, C, M extends androidx.compose.p015ui.C1436d> void mo6797h1(androidx.compose.p015ui.node.LayoutNodeWrapper.C1729c<T, C, M> r19, long r20, androidx.compose.p015ui.node.C1734c<C> r22, boolean r23, boolean r24) {
        /*
            r18 = this;
            r0 = r18
            r8 = r19
            r9 = r20
            r11 = r22
            java.lang.String r1 = "hitTestSource"
            kotlin.jvm.internal.C19383o.m32797g(r8, r1)
            java.lang.String r1 = "hitTestResult"
            kotlin.jvm.internal.C19383o.m32797g(r11, r1)
            androidx.compose.ui.node.LayoutNode r1 = r0.f3850f
            boolean r1 = r8.mo6814d(r1)
            r13 = 1
            if (r1 == 0) goto L_0x0043
            boolean r1 = r0.mo6810u1(r9)
            if (r1 == 0) goto L_0x0025
            r14 = r24
            r1 = r13
            goto L_0x0046
        L_0x0025:
            if (r23 == 0) goto L_0x0043
            long r1 = r18.mo6791b1()
            float r1 = r0.mo6784U0(r9, r1)
            boolean r2 = java.lang.Float.isInfinite(r1)
            if (r2 != 0) goto L_0x003d
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x003d
            r1 = r13
            goto L_0x003e
        L_0x003d:
            r1 = 0
        L_0x003e:
            if (r1 == 0) goto L_0x0043
            r1 = r13
            r14 = 0
            goto L_0x0046
        L_0x0043:
            r14 = r24
            r1 = 0
        L_0x0046:
            if (r1 == 0) goto L_0x00b6
            int r15 = r11.f3893d
            androidx.compose.ui.node.LayoutNode r1 = r0.f3850f
            r.e r1 = r1.mo6767x()
            int r2 = r1.f17157d
            if (r2 <= 0) goto L_0x00b4
            int r2 = r2 - r13
            T[] r7 = r1.f17155b
            r16 = r2
        L_0x0059:
            r1 = r7[r16]
            r6 = r1
            androidx.compose.ui.node.LayoutNode r6 = (androidx.compose.p015ui.node.LayoutNode) r6
            boolean r1 = r6.f3837v
            if (r1 == 0) goto L_0x00a7
            r1 = r19
            r2 = r6
            r3 = r20
            r5 = r22
            r12 = r6
            r6 = r23
            r17 = r7
            r7 = r14
            r1.mo6811a(r2, r3, r5, r6, r7)
            long r1 = r22.mo6834a()
            r3 = 32
            long r3 = r1 >> r3
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x008c
            boolean r1 = kotlin.jvm.internal.C19382n.m32764p0(r1)
            if (r1 == 0) goto L_0x008c
            r1 = r13
            goto L_0x008d
        L_0x008c:
            r1 = 0
        L_0x008d:
            if (r1 != 0) goto L_0x0090
            goto L_0x00a0
        L_0x0090:
            androidx.compose.ui.node.OuterMeasurablePlaceable r1 = r12.f3801E
            androidx.compose.ui.node.LayoutNodeWrapper r1 = r1.f3875g
            boolean r1 = r1.mo6806q1()
            if (r1 == 0) goto L_0x00a2
            int r1 = r11.f3894e
            int r1 = r1 + -1
            r11.f3893d = r1
        L_0x00a0:
            r1 = r13
            goto L_0x00a3
        L_0x00a2:
            r1 = 0
        L_0x00a3:
            if (r1 != 0) goto L_0x00a9
            r1 = r13
            goto L_0x00aa
        L_0x00a7:
            r17 = r7
        L_0x00a9:
            r1 = 0
        L_0x00aa:
            if (r1 != 0) goto L_0x00b4
            int r16 = r16 + -1
            if (r16 >= 0) goto L_0x00b1
            goto L_0x00b4
        L_0x00b1:
            r7 = r17
            goto L_0x0059
        L_0x00b4:
            r11.f3893d = r15
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.node.C1737d.mo6797h1(androidx.compose.ui.node.LayoutNodeWrapper$c, long, androidx.compose.ui.node.c, boolean, boolean):void");
    }

    /* renamed from: i */
    public final int mo6667i(int i) {
        C1738e eVar = this.f3850f.f3831p;
        C1711v a = eVar.mo6896a();
        LayoutNode layoutNode = eVar.f3904a;
        return a.mo3262d(layoutNode.f3833r, layoutNode.mo6764u(), i);
    }

    /* renamed from: n1 */
    public final void mo6803n1(C1537o oVar) {
        C19383o.m32797g(oVar, "canvas");
        C1750p L0 = C15588c1.m25291L0(this.f3850f);
        C7734e<LayoutNode> x = this.f3850f.mo6767x();
        int i = x.f17157d;
        if (i > 0) {
            int i2 = 0;
            T[] tArr = x.f17155b;
            do {
                LayoutNode layoutNode = (LayoutNode) tArr[i2];
                if (layoutNode.f3837v) {
                    layoutNode.f3801E.f3875g.mo6785V0(oVar);
                }
                i2++;
            } while (i2 < i);
        }
        if (L0.getShowLayoutBounds()) {
            mo6786W0(oVar, f3902D);
        }
    }

    /* renamed from: p */
    public final float mo3797p(int i) {
        return this.f3903C.mo3797p(i);
    }

    /* renamed from: q */
    public final float mo3798q(float f) {
        return this.f3903C.mo3798q(f);
    }

    /* renamed from: q0 */
    public final void mo6662q0(long j, float f, C19857l<? super C1549v, C19394m> lVar) {
        super.mo6662q0(j, f, lVar);
        LayoutNodeWrapper layoutNodeWrapper = this.f3851g;
        boolean z = false;
        if (!(layoutNodeWrapper != null && layoutNodeWrapper.f3862r)) {
            for (T t = this.f3864t[4]; t != null; t = t.f3921d) {
                ((C1678e0) ((C1756u) t).f3920c).mo3725D(this);
            }
            LayoutNode layoutNode = this.f3850f;
            LayoutNode w = layoutNode.mo6766w();
            C1737d dVar = layoutNode.f3800D;
            float f2 = dVar.f3861q;
            LayoutNodeWrapper layoutNodeWrapper2 = layoutNode.f3801E.f3875g;
            while (!C19383o.m32792b(layoutNodeWrapper2, dVar)) {
                C1745k kVar = (C1745k) layoutNodeWrapper2;
                f2 += kVar.f3861q;
                layoutNodeWrapper2 = kVar.f3933C;
            }
            if (!(f2 == layoutNode.f3802F)) {
                layoutNode.f3802F = f2;
                if (w != null) {
                    w.mo6749N();
                }
                if (w != null) {
                    w.mo6740C();
                }
            }
            if (!layoutNode.f3837v) {
                if (w != null) {
                    w.mo6740C();
                }
                layoutNode.mo6744H();
            }
            if (w == null) {
                layoutNode.f3838w = 0;
            } else if (!layoutNode.f3813Q && w.f3825j == LayoutNode.LayoutState.LayingOut) {
                if (layoutNode.f3838w == Integer.MAX_VALUE) {
                    z = true;
                }
                if (z) {
                    int i = w.f3840y;
                    layoutNode.f3838w = i;
                    w.f3840y = i + 1;
                } else {
                    throw new IllegalStateException("Place was called on a node which was placed already".toString());
                }
            }
            layoutNode.mo6743G();
        }
    }

    /* renamed from: s */
    public final int mo6668s(int i) {
        C1738e eVar = this.f3850f.f3831p;
        C1711v a = eVar.mo6896a();
        LayoutNode layoutNode = eVar.f3904a;
        return a.mo3263e(layoutNode.f3833r, layoutNode.mo6764u(), i);
    }

    /* renamed from: w */
    public final long mo3799w(long j) {
        return this.f3903C.mo3799w(j);
    }

    /* renamed from: w0 */
    public final float mo3800w0() {
        return this.f3903C.mo3800w0();
    }

    /* renamed from: z */
    public final int mo6669z(int i) {
        C1738e eVar = this.f3850f.f3831p;
        C1711v a = eVar.mo6896a();
        LayoutNode layoutNode = eVar.f3904a;
        return a.mo3261c(layoutNode.f3833r, layoutNode.mo6764u(), i);
    }
}
