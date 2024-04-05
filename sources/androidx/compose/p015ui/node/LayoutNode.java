package androidx.compose.p015ui.node;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.activity.C0114h;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.input.pointer.C1650u;
import androidx.compose.p015ui.layout.C1669b0;
import androidx.compose.p015ui.layout.C1674c0;
import androidx.compose.p015ui.layout.C1678e0;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1690j0;
import androidx.compose.p015ui.layout.C1695m;
import androidx.compose.p015ui.layout.C1704r;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.node.C1750p;
import androidx.compose.p015ui.node.OuterMeasurablePlaceable;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1338j0;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.common.api.Api;
import java.util.List;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p098f0.C6764b;
import p098f0.C6765c;
import p098f0.C6767e;
import p174m0.C7280a;
import p174m0.C7282b;
import p174m0.C7283c;
import p174m0.C7286f;
import p219r.C7734e;
import p628nj.C18263b;
import p753kq.C19846a;
import p753kq.C19857l;
import p772tq.C20203a;

/* renamed from: androidx.compose.ui.node.LayoutNode */
public final class LayoutNode implements C1710u, C1690j0, C1752q, C1695m, ComposeUiNode, C1750p.C1751a {

    /* renamed from: V */
    public static final C1721b f3792V = new C1721b();

    /* renamed from: W */
    public static final C19846a<LayoutNode> f3793W = LayoutNode$Companion$Constructor$1.INSTANCE;

    /* renamed from: X */
    public static final C1720a f3794X = new C1720a();

    /* renamed from: Y */
    public static final C6767e f3795Y = C19543e0.m33309b0(LayoutNode$Companion$ModifierLocalNothing$1.INSTANCE);

    /* renamed from: Z */
    public static final C1722c f3796Z = new C1722c();

    /* renamed from: A */
    public UsageByParent f3797A;

    /* renamed from: B */
    public UsageByParent f3798B;

    /* renamed from: C */
    public boolean f3799C;

    /* renamed from: D */
    public final C1737d f3800D;

    /* renamed from: E */
    public final OuterMeasurablePlaceable f3801E;

    /* renamed from: F */
    public float f3802F;

    /* renamed from: G */
    public C1704r f3803G;

    /* renamed from: H */
    public LayoutNodeWrapper f3804H;

    /* renamed from: I */
    public boolean f3805I;

    /* renamed from: J */
    public final C1746l f3806J;

    /* renamed from: K */
    public C1746l f3807K;

    /* renamed from: L */
    public C1436d f3808L;

    /* renamed from: M */
    public C19857l<? super C1750p, C19394m> f3809M;

    /* renamed from: N */
    public C19857l<? super C1750p, C19394m> f3810N;

    /* renamed from: O */
    public C7734e<Pair<LayoutNodeWrapper, C1674c0>> f3811O;

    /* renamed from: P */
    public boolean f3812P;

    /* renamed from: Q */
    public boolean f3813Q;

    /* renamed from: R */
    public boolean f3814R;

    /* renamed from: S */
    public boolean f3815S;

    /* renamed from: T */
    public final C1739f f3816T;

    /* renamed from: b */
    public final boolean f3817b;

    /* renamed from: c */
    public int f3818c;

    /* renamed from: d */
    public final C7734e<LayoutNode> f3819d;

    /* renamed from: e */
    public C7734e<LayoutNode> f3820e;

    /* renamed from: f */
    public boolean f3821f;

    /* renamed from: g */
    public LayoutNode f3822g;

    /* renamed from: h */
    public C1750p f3823h;

    /* renamed from: i */
    public int f3824i;

    /* renamed from: j */
    public LayoutState f3825j;

    /* renamed from: k */
    public C7734e<C1745k> f3826k;

    /* renamed from: l */
    public boolean f3827l;

    /* renamed from: m */
    public final C7734e<LayoutNode> f3828m;

    /* renamed from: n */
    public boolean f3829n;

    /* renamed from: o */
    public C1711v f3830o;

    /* renamed from: p */
    public final C1738e f3831p;

    /* renamed from: q */
    public C7282b f3832q;

    /* renamed from: r */
    public final C1725f f3833r;

    /* renamed from: s */
    public LayoutDirection f3834s;

    /* renamed from: t */
    public C1843j1 f3835t;

    /* renamed from: u */
    public final C1740g f3836u;

    /* renamed from: v */
    public boolean f3837v;

    /* renamed from: w */
    public int f3838w;

    /* renamed from: x */
    public int f3839x;

    /* renamed from: y */
    public int f3840y;

    /* renamed from: z */
    public UsageByParent f3841z;

    /* renamed from: androidx.compose.ui.node.LayoutNode$LayoutState */
    public enum LayoutState {
        Measuring,
        LayingOut,
        Idle
    }

    /* renamed from: androidx.compose.ui.node.LayoutNode$UsageByParent */
    public enum UsageByParent {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    /* renamed from: androidx.compose.ui.node.LayoutNode$a */
    public static final class C1720a implements C1843j1 {
        /* renamed from: a */
        public final long mo6769a() {
            return 300;
        }

        /* renamed from: b */
        public final void mo6770b() {
        }

        /* renamed from: c */
        public final long mo6771c() {
            return 400;
        }

        /* renamed from: d */
        public final long mo6772d() {
            int i = C7286f.f16162d;
            return C7286f.f16160b;
        }

        /* renamed from: e */
        public final float mo6773e() {
            return 16.0f;
        }
    }

    /* renamed from: androidx.compose.ui.node.LayoutNode$b */
    public static final class C1721b extends C1723d {
        public C1721b() {
            super("Undefined intrinsics block and it is required");
        }

        /* renamed from: b */
        public final C1712w mo3260b(C1713x xVar, List list, long j) {
            C19383o.m32797g(xVar, "$this$measure");
            C19383o.m32797g(list, "measurables");
            throw new IllegalStateException("Undefined measure and it is required".toString());
        }
    }

    /* renamed from: androidx.compose.ui.node.LayoutNode$c */
    public static final class C1722c implements C6765c {
        public final C6767e getKey() {
            return LayoutNode.f3795Y;
        }

        public final Object getValue() {
            throw new IllegalStateException("Sentinel ModifierLocal shouldn't be read".toString());
        }
    }

    /* renamed from: androidx.compose.ui.node.LayoutNode$d */
    public static abstract class C1723d implements C1711v {

        /* renamed from: a */
        public final String f3842a;

        public C1723d(String str) {
            C19383o.m32797g(str, "error");
            this.f3842a = str;
        }

        /* renamed from: a */
        public final int mo3259a(C1725f fVar, List list, int i) {
            C19383o.m32797g(fVar, "<this>");
            throw new IllegalStateException(this.f3842a.toString());
        }

        /* renamed from: c */
        public final int mo3261c(C1725f fVar, List list, int i) {
            C19383o.m32797g(fVar, "<this>");
            throw new IllegalStateException(this.f3842a.toString());
        }

        /* renamed from: d */
        public final int mo3262d(C1725f fVar, List list, int i) {
            C19383o.m32797g(fVar, "<this>");
            throw new IllegalStateException(this.f3842a.toString());
        }

        /* renamed from: e */
        public final int mo3263e(C1725f fVar, List list, int i) {
            C19383o.m32797g(fVar, "<this>");
            throw new IllegalStateException(this.f3842a.toString());
        }
    }

    /* renamed from: androidx.compose.ui.node.LayoutNode$e */
    public /* synthetic */ class C1724e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3843a;

        static {
            int[] iArr = new int[LayoutState.values().length];
            iArr[LayoutState.Idle.ordinal()] = 1;
            f3843a = iArr;
        }
    }

    /* renamed from: androidx.compose.ui.node.LayoutNode$f */
    public static final class C1725f implements C1713x, C7282b {

        /* renamed from: b */
        public final /* synthetic */ LayoutNode f3844b;

        public C1725f(LayoutNode layoutNode) {
            this.f3844b = layoutNode;
        }

        public final float getDensity() {
            return this.f3844b.f3832q.getDensity();
        }

        public final LayoutDirection getLayoutDirection() {
            return this.f3844b.f3834s;
        }

        /* renamed from: w0 */
        public final float mo3800w0() {
            return this.f3844b.f3832q.mo3800w0();
        }
    }

    public LayoutNode() {
        this(false);
    }

    /* renamed from: m */
    public static final void m3668m(LayoutNode layoutNode, C6764b bVar, C1746l lVar, C7734e eVar) {
        int i;
        ModifierLocalConsumerEntity modifierLocalConsumerEntity;
        layoutNode.getClass();
        int i2 = eVar.f17157d;
        if (i2 > 0) {
            T[] tArr = eVar.f17155b;
            i = 0;
            while (true) {
                if (((ModifierLocalConsumerEntity) tArr[i]).f3871c == bVar) {
                    break;
                }
                i++;
                if (i >= i2) {
                    break;
                }
            }
            i = -1;
        } else {
            i = -1;
        }
        if (i < 0) {
            modifierLocalConsumerEntity = new ModifierLocalConsumerEntity(lVar, bVar);
        } else {
            modifierLocalConsumerEntity = (ModifierLocalConsumerEntity) eVar.mo20243q(i);
            modifierLocalConsumerEntity.getClass();
            C19383o.m32797g(lVar, "<set-?>");
            modifierLocalConsumerEntity.f3870b = lVar;
        }
        lVar.f3942g.mo20232c(modifierLocalConsumerEntity);
    }

    /* renamed from: n */
    public static final C1746l m3669n(LayoutNode layoutNode, C6765c cVar, C1746l lVar) {
        layoutNode.getClass();
        C1746l lVar2 = lVar.f3939d;
        while (lVar2 != null && lVar2.f3938c != cVar) {
            lVar2 = lVar2.f3939d;
        }
        if (lVar2 == null) {
            lVar2 = new C1746l(layoutNode, cVar);
        } else {
            C1746l lVar3 = lVar2.f3940e;
            if (lVar3 != null) {
                lVar3.f3939d = lVar2.f3939d;
            }
            C1746l lVar4 = lVar2.f3939d;
            if (lVar4 != null) {
                lVar4.f3940e = lVar3;
            }
        }
        lVar2.f3939d = lVar.f3939d;
        C1746l lVar5 = lVar.f3939d;
        if (lVar5 != null) {
            lVar5.f3940e = lVar2;
        }
        lVar.f3939d = lVar2;
        lVar2.f3940e = lVar;
        return lVar2;
    }

    /* renamed from: A */
    public final void mo6738A(long j, C1734c<C1650u> cVar, boolean z, boolean z2) {
        C19383o.m32797g(cVar, "hitTestResult");
        this.f3801E.f3875g.mo6796g1(LayoutNodeWrapper.f3845A, this.f3801E.f3875g.mo6788Y0(j), cVar, z, z2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [androidx.compose.ui.node.LayoutNodeWrapper] */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6739B(int r7, androidx.compose.p015ui.node.LayoutNode r8) {
        /*
            r6 = this;
            java.lang.String r0 = "instance"
            kotlin.jvm.internal.C19383o.m32797g(r8, r0)
            androidx.compose.ui.node.LayoutNode r0 = r8.f3822g
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x000d
            r0 = r1
            goto L_0x000e
        L_0x000d:
            r0 = r2
        L_0x000e:
            r3 = 0
            java.lang.String r4 = " Other tree: "
            java.lang.String r5 = "Cannot insert "
            if (r0 != 0) goto L_0x0048
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            r7.append(r8)
            java.lang.String r0 = " because it already has a parent. This tree: "
            r7.append(r0)
            java.lang.String r0 = r6.mo6761r(r2)
            r7.append(r0)
            r7.append(r4)
            androidx.compose.ui.node.LayoutNode r8 = r8.f3822g
            if (r8 == 0) goto L_0x0037
            java.lang.String r3 = r8.mo6761r(r2)
        L_0x0037:
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L_0x0048:
            androidx.compose.ui.node.p r0 = r8.f3823h
            if (r0 != 0) goto L_0x004e
            r0 = r1
            goto L_0x004f
        L_0x004e:
            r0 = r2
        L_0x004f:
            if (r0 == 0) goto L_0x00af
            r8.f3822g = r6
            r.e<androidx.compose.ui.node.LayoutNode> r0 = r6.f3819d
            r0.mo20231a(r7, r8)
            r6.mo6749N()
            boolean r7 = r8.f3817b
            if (r7 == 0) goto L_0x0076
            boolean r7 = r6.f3817b
            r7 = r7 ^ r1
            if (r7 == 0) goto L_0x006a
            int r7 = r6.f3818c
            int r7 = r7 + r1
            r6.f3818c = r7
            goto L_0x0076
        L_0x006a:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Virtual LayoutNode can't be added into a virtual parent"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L_0x0076:
            r6.mo6742F()
            androidx.compose.ui.node.OuterMeasurablePlaceable r7 = r8.f3801E
            androidx.compose.ui.node.LayoutNodeWrapper r7 = r7.f3875g
            boolean r0 = r6.f3817b
            if (r0 == 0) goto L_0x0088
            androidx.compose.ui.node.LayoutNode r0 = r6.f3822g
            if (r0 == 0) goto L_0x008a
            androidx.compose.ui.node.d r3 = r0.f3800D
            goto L_0x008a
        L_0x0088:
            androidx.compose.ui.node.d r3 = r6.f3800D
        L_0x008a:
            r7.f3851g = r3
            boolean r7 = r8.f3817b
            if (r7 == 0) goto L_0x00a7
            r.e<androidx.compose.ui.node.LayoutNode> r7 = r8.f3819d
            int r0 = r7.f17157d
            if (r0 <= 0) goto L_0x00a7
            T[] r7 = r7.f17155b
        L_0x0098:
            r3 = r7[r2]
            androidx.compose.ui.node.LayoutNode r3 = (androidx.compose.p015ui.node.LayoutNode) r3
            androidx.compose.ui.node.OuterMeasurablePlaceable r3 = r3.f3801E
            androidx.compose.ui.node.LayoutNodeWrapper r3 = r3.f3875g
            androidx.compose.ui.node.d r4 = r6.f3800D
            r3.f3851g = r4
            int r2 = r2 + r1
            if (r2 < r0) goto L_0x0098
        L_0x00a7:
            androidx.compose.ui.node.p r7 = r6.f3823h
            if (r7 == 0) goto L_0x00ae
            r8.mo6758o(r7)
        L_0x00ae:
            return
        L_0x00af:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            r7.append(r8)
            java.lang.String r0 = " because it already has an owner. This tree: "
            r7.append(r0)
            java.lang.String r0 = r6.mo6761r(r2)
            r7.append(r0)
            r7.append(r4)
            java.lang.String r8 = r8.mo6761r(r2)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.node.LayoutNode.mo6739B(int, androidx.compose.ui.node.LayoutNode):void");
    }

    /* renamed from: C */
    public final void mo6740C() {
        if (this.f3805I) {
            LayoutNodeWrapper layoutNodeWrapper = this.f3800D;
            LayoutNodeWrapper layoutNodeWrapper2 = this.f3801E.f3875g.f3851g;
            this.f3804H = null;
            while (true) {
                if (C19383o.m32792b(layoutNodeWrapper, layoutNodeWrapper2)) {
                    break;
                }
                if ((layoutNodeWrapper != null ? layoutNodeWrapper.f3867w : null) != null) {
                    this.f3804H = layoutNodeWrapper;
                    break;
                }
                layoutNodeWrapper = layoutNodeWrapper != null ? layoutNodeWrapper.f3851g : null;
            }
        }
        LayoutNodeWrapper layoutNodeWrapper3 = this.f3804H;
        if (layoutNodeWrapper3 != null && layoutNodeWrapper3.f3867w == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (layoutNodeWrapper3 != null) {
            layoutNodeWrapper3.mo6798i1();
        } else {
            LayoutNode w = mo6766w();
            if (w != null) {
                w.mo6740C();
            }
        }
    }

    /* renamed from: D */
    public final int mo6664D(int i) {
        return this.f3801E.mo6664D(i);
    }

    /* renamed from: E */
    public final void mo6741E() {
        LayoutNodeWrapper layoutNodeWrapper = this.f3801E.f3875g;
        C1737d dVar = this.f3800D;
        while (!C19383o.m32792b(layoutNodeWrapper, dVar)) {
            C1745k kVar = (C1745k) layoutNodeWrapper;
            C1749o oVar = kVar.f3867w;
            if (oVar != null) {
                oVar.invalidate();
            }
            layoutNodeWrapper = kVar.f3933C;
        }
        C1749o oVar2 = this.f3800D.f3867w;
        if (oVar2 != null) {
            oVar2.invalidate();
        }
    }

    /* renamed from: F */
    public final void mo6742F() {
        LayoutNode w;
        if (this.f3818c > 0) {
            this.f3821f = true;
        }
        if (this.f3817b && (w = mo6766w()) != null) {
            w.f3821f = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6743G() {
        /*
            r10 = this;
            androidx.compose.ui.node.g r0 = r10.f3836u
            r0.mo6899c()
            boolean r0 = r10.f3815S
            r1 = 0
            if (r0 == 0) goto L_0x0050
            r.e r0 = r10.mo6768y()
            int r2 = r0.f17157d
            if (r2 <= 0) goto L_0x0050
            T[] r0 = r0.f17155b
            r3 = r1
        L_0x0015:
            r4 = r0[r3]
            androidx.compose.ui.node.LayoutNode r4 = (androidx.compose.p015ui.node.LayoutNode) r4
            boolean r5 = r4.f3814R
            if (r5 == 0) goto L_0x004c
            androidx.compose.ui.node.LayoutNode$UsageByParent r5 = r4.f3841z
            androidx.compose.ui.node.LayoutNode$UsageByParent r6 = androidx.compose.p015ui.node.LayoutNode.UsageByParent.InMeasureBlock
            if (r5 != r6) goto L_0x004c
            androidx.compose.ui.node.OuterMeasurablePlaceable r5 = r4.f3801E
            boolean r6 = r5.f3876h
            if (r6 == 0) goto L_0x0031
            long r5 = r5.f3725e
            m0.a r7 = new m0.a
            r7.<init>(r5)
            goto L_0x0032
        L_0x0031:
            r7 = 0
        L_0x0032:
            if (r7 == 0) goto L_0x0046
            androidx.compose.ui.node.LayoutNode$UsageByParent r5 = r4.f3797A
            androidx.compose.ui.node.LayoutNode$UsageByParent r6 = androidx.compose.p015ui.node.LayoutNode.UsageByParent.NotUsed
            if (r5 != r6) goto L_0x003d
            r4.mo6759p()
        L_0x003d:
            androidx.compose.ui.node.OuterMeasurablePlaceable r4 = r4.f3801E
            long r5 = r7.f16152a
            boolean r4 = r4.mo6822P0(r5)
            goto L_0x0047
        L_0x0046:
            r4 = r1
        L_0x0047:
            if (r4 == 0) goto L_0x004c
            r10.mo6754S(r1)
        L_0x004c:
            int r3 = r3 + 1
            if (r3 < r2) goto L_0x0015
        L_0x0050:
            boolean r0 = r10.f3815S
            if (r0 == 0) goto L_0x0073
            r10.f3815S = r1
            androidx.compose.ui.node.LayoutNode$LayoutState r0 = androidx.compose.p015ui.node.LayoutNode.LayoutState.LayingOut
            r10.f3825j = r0
            androidx.compose.ui.node.p r0 = com.google.android.play.core.assetpacks.C15588c1.m25291L0(r10)
            androidx.compose.ui.node.OwnerSnapshotObserver r0 = r0.getSnapshotObserver()
            androidx.compose.ui.node.LayoutNode$layoutChildren$1 r2 = new androidx.compose.ui.node.LayoutNode$layoutChildren$1
            r2.<init>(r10)
            r0.getClass()
            kq.l<androidx.compose.ui.node.LayoutNode, kotlin.m> r3 = r0.f3887c
            r0.mo6824b(r10, r3, r2)
            androidx.compose.ui.node.LayoutNode$LayoutState r0 = androidx.compose.p015ui.node.LayoutNode.LayoutState.Idle
            r10.f3825j = r0
        L_0x0073:
            androidx.compose.ui.node.g r0 = r10.f3836u
            boolean r2 = r0.f3911d
            r3 = 1
            if (r2 == 0) goto L_0x007c
            r0.f3912e = r3
        L_0x007c:
            boolean r2 = r0.f3909b
            if (r2 == 0) goto L_0x0130
            r0.mo6899c()
            androidx.compose.ui.node.LayoutNode r0 = r0.f3915h
            if (r0 == 0) goto L_0x0088
            goto L_0x0089
        L_0x0088:
            r3 = r1
        L_0x0089:
            if (r3 == 0) goto L_0x0130
            androidx.compose.ui.node.g r0 = r10.f3836u
            java.util.HashMap r2 = r0.f3916i
            r2.clear()
            androidx.compose.ui.node.LayoutNode r2 = r0.f3908a
            r.e r2 = r2.mo6768y()
            int r3 = r2.f17157d
            if (r3 <= 0) goto L_0x011d
            T[] r2 = r2.f17155b
            r4 = r1
        L_0x009f:
            r5 = r2[r4]
            androidx.compose.ui.node.LayoutNode r5 = (androidx.compose.p015ui.node.LayoutNode) r5
            boolean r6 = r5.f3837v
            if (r6 == 0) goto L_0x0119
            androidx.compose.ui.node.g r6 = r5.f3836u
            boolean r6 = r6.f3909b
            if (r6 == 0) goto L_0x00b0
            r5.mo6743G()
        L_0x00b0:
            androidx.compose.ui.node.g r6 = r5.f3836u
            java.util.HashMap r6 = r6.f3916i
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x00bc:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00de
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r8 = r7.getKey()
            androidx.compose.ui.layout.a r8 = (androidx.compose.p015ui.layout.C1665a) r8
            java.lang.Object r7 = r7.getValue()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            androidx.compose.ui.node.d r9 = r5.f3800D
            androidx.compose.p015ui.node.C1740g.m3827b(r0, r8, r7, r9)
            goto L_0x00bc
        L_0x00de:
            androidx.compose.ui.node.d r5 = r5.f3800D
            androidx.compose.ui.node.LayoutNodeWrapper r5 = r5.f3851g
            kotlin.jvm.internal.C19383o.m32794d(r5)
        L_0x00e5:
            androidx.compose.ui.node.LayoutNode r6 = r0.f3908a
            androidx.compose.ui.node.d r6 = r6.f3800D
            boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r5, r6)
            if (r6 != 0) goto L_0x0119
            androidx.compose.ui.layout.w r6 = r5.mo6789Z0()
            java.util.Map r6 = r6.mo4345d()
            java.util.Set r6 = r6.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x00ff:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0113
            java.lang.Object r7 = r6.next()
            androidx.compose.ui.layout.a r7 = (androidx.compose.p015ui.layout.C1665a) r7
            int r8 = r5.mo6661M(r7)
            androidx.compose.p015ui.node.C1740g.m3827b(r0, r7, r8, r5)
            goto L_0x00ff
        L_0x0113:
            androidx.compose.ui.node.LayoutNodeWrapper r5 = r5.f3851g
            kotlin.jvm.internal.C19383o.m32794d(r5)
            goto L_0x00e5
        L_0x0119:
            int r4 = r4 + 1
            if (r4 < r3) goto L_0x009f
        L_0x011d:
            java.util.HashMap r2 = r0.f3916i
            androidx.compose.ui.node.LayoutNode r3 = r0.f3908a
            androidx.compose.ui.node.d r3 = r3.f3800D
            androidx.compose.ui.layout.w r3 = r3.mo6789Z0()
            java.util.Map r3 = r3.mo4345d()
            r2.putAll(r3)
            r0.f3909b = r1
        L_0x0130:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.node.LayoutNode.mo6743G():void");
    }

    /* renamed from: H */
    public final void mo6744H() {
        this.f3837v = true;
        LayoutNodeWrapper layoutNodeWrapper = this.f3801E.f3875g;
        this.f3800D.getClass();
        while (!C19383o.m32792b(layoutNodeWrapper, (Object) null) && layoutNodeWrapper != null) {
            if (layoutNodeWrapper.f3866v) {
                layoutNodeWrapper.mo6798i1();
            }
            layoutNodeWrapper = layoutNodeWrapper.mo6793d1();
        }
        C7734e<LayoutNode> y = mo6768y();
        int i = y.f17157d;
        if (i > 0) {
            int i2 = 0;
            T[] tArr = y.f17155b;
            do {
                LayoutNode layoutNode = (LayoutNode) tArr[i2];
                if (layoutNode.f3838w != Integer.MAX_VALUE) {
                    layoutNode.mo6744H();
                    if (C1724e.f3843a[layoutNode.f3825j.ordinal()] != 1) {
                        StringBuilder h = C0072d.m201h("Unexpected state ");
                        h.append(layoutNode.f3825j);
                        throw new IllegalStateException(h.toString());
                    } else if (layoutNode.f3814R) {
                        layoutNode.mo6754S(true);
                    } else if (layoutNode.f3815S) {
                        layoutNode.mo6753R(true);
                    }
                }
                i2++;
            } while (i2 < i);
        }
    }

    /* renamed from: I */
    public final void mo6745I() {
        if (this.f3837v) {
            int i = 0;
            this.f3837v = false;
            C7734e<LayoutNode> y = mo6768y();
            int i2 = y.f17157d;
            if (i2 > 0) {
                T[] tArr = y.f17155b;
                do {
                    ((LayoutNode) tArr[i]).mo6745I();
                    i++;
                } while (i < i2);
            }
        }
    }

    /* renamed from: J */
    public final C1686i0 mo6665J(long j) {
        if (this.f3797A == UsageByParent.NotUsed) {
            mo6759p();
        }
        OuterMeasurablePlaceable outerMeasurablePlaceable = this.f3801E;
        outerMeasurablePlaceable.mo6665J(j);
        return outerMeasurablePlaceable;
    }

    /* renamed from: K */
    public final void mo6746K(int i, int i2, int i3) {
        if (i != i2) {
            for (int i4 = 0; i4 < i3; i4++) {
                this.f3819d.mo20231a(i > i2 ? i2 + i4 : (i2 + i3) - 2, this.f3819d.mo20243q(i > i2 ? i + i4 : i));
            }
            mo6749N();
            mo6742F();
            mo6754S(false);
        }
    }

    /* renamed from: L */
    public final void mo6747L() {
        C1740g gVar = this.f3836u;
        if (!gVar.f3909b) {
            gVar.f3909b = true;
            LayoutNode w = mo6766w();
            if (w != null) {
                C1740g gVar2 = this.f3836u;
                if (gVar2.f3910c) {
                    w.mo6754S(false);
                } else if (gVar2.f3912e) {
                    w.mo6753R(false);
                }
                if (this.f3836u.f3913f) {
                    mo6754S(false);
                }
                if (this.f3836u.f3914g) {
                    w.mo6753R(false);
                }
                w.mo6747L();
            }
        }
    }

    /* renamed from: M */
    public final void mo6748M(LayoutNode layoutNode) {
        if (this.f3823h != null) {
            layoutNode.mo6762t();
        }
        layoutNode.f3822g = null;
        layoutNode.f3801E.f3875g.f3851g = null;
        if (layoutNode.f3817b) {
            this.f3818c--;
            C7734e<LayoutNode> eVar = layoutNode.f3819d;
            int i = eVar.f17157d;
            if (i > 0) {
                int i2 = 0;
                T[] tArr = eVar.f17155b;
                do {
                    ((LayoutNode) tArr[i2]).f3801E.f3875g.f3851g = null;
                    i2++;
                } while (i2 < i);
            }
        }
        mo6742F();
        mo6749N();
    }

    /* renamed from: N */
    public final void mo6749N() {
        if (this.f3817b) {
            LayoutNode w = mo6766w();
            if (w != null) {
                w.mo6749N();
                return;
            }
            return;
        }
        this.f3829n = true;
    }

    /* renamed from: O */
    public final void mo6750O() {
        for (int i = this.f3819d.f17157d - 1; -1 < i; i--) {
            mo6748M((LayoutNode) this.f3819d.f17155b[i]);
        }
        this.f3819d.mo20235g();
    }

    /* renamed from: P */
    public final void mo6751P(int i, int i2) {
        if (i2 >= 0) {
            int i3 = (i2 + i) - 1;
            if (i <= i3) {
                while (true) {
                    mo6748M(this.f3819d.mo20243q(i3));
                    if (i3 != i) {
                        i3--;
                    } else {
                        return;
                    }
                }
            }
        } else {
            throw new IllegalArgumentException(C0069a.m175f("count (", i2, ") must be greater than 0").toString());
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: Q */
    public final void mo6752Q() {
        if (this.f3797A == UsageByParent.NotUsed) {
            mo6760q();
        }
        try {
            this.f3813Q = true;
            OuterMeasurablePlaceable outerMeasurablePlaceable = this.f3801E;
            if (outerMeasurablePlaceable.f3877i) {
                outerMeasurablePlaceable.mo6662q0(outerMeasurablePlaceable.f3879k, outerMeasurablePlaceable.f3881m, outerMeasurablePlaceable.f3880l);
                this.f3813Q = false;
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        } catch (Throwable th) {
            this.f3813Q = false;
            throw th;
        }
    }

    /* renamed from: R */
    public final void mo6753R(boolean z) {
        C1750p pVar;
        if (!this.f3817b && (pVar = this.f3823h) != null) {
            pVar.onRequestRelayout(this, z);
        }
    }

    /* renamed from: S */
    public final void mo6754S(boolean z) {
        C1750p pVar;
        LayoutNode w;
        if (!this.f3827l && !this.f3817b && (pVar = this.f3823h) != null) {
            pVar.onRequestMeasure(this, z);
            OuterMeasurablePlaceable outerMeasurablePlaceable = this.f3801E;
            LayoutNode w2 = outerMeasurablePlaceable.f3874f.mo6766w();
            UsageByParent usageByParent = outerMeasurablePlaceable.f3874f.f3797A;
            if (w2 != null && usageByParent != UsageByParent.NotUsed) {
                while (w2.f3797A == usageByParent && (w = w2.mo6766w()) != null) {
                    w2 = w;
                }
                int i = OuterMeasurablePlaceable.C1731a.f3884b[usageByParent.ordinal()];
                if (i == 1) {
                    w2.mo6754S(z);
                } else if (i == 2) {
                    w2.mo6753R(z);
                } else {
                    throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                }
            }
        }
    }

    /* renamed from: T */
    public final void mo6755T() {
        C7734e<LayoutNode> y = mo6768y();
        int i = y.f17157d;
        if (i > 0) {
            int i2 = 0;
            T[] tArr = y.f17155b;
            do {
                LayoutNode layoutNode = (LayoutNode) tArr[i2];
                UsageByParent usageByParent = layoutNode.f3798B;
                layoutNode.f3797A = usageByParent;
                if (usageByParent != UsageByParent.NotUsed) {
                    layoutNode.mo6755T();
                }
                i2++;
            } while (i2 < i);
        }
    }

    /* renamed from: U */
    public final boolean mo6756U() {
        LayoutNodeWrapper layoutNodeWrapper = this.f3801E.f3875g;
        this.f3800D.getClass();
        while (!C19383o.m32792b(layoutNodeWrapper, (Object) null) && layoutNodeWrapper != null) {
            if (layoutNodeWrapper.f3867w != null) {
                return false;
            }
            if (C20203a.m34521D(layoutNodeWrapper.f3864t, 0)) {
                return true;
            }
            layoutNodeWrapper = layoutNodeWrapper.mo6793d1();
        }
        return true;
    }

    /* renamed from: a */
    public final List<C1669b0> mo6695a() {
        int i;
        C7734e eVar = new C7734e(new C1669b0[16]);
        LayoutNodeWrapper layoutNodeWrapper = this.f3801E.f3875g;
        C1737d dVar = this.f3800D;
        while (true) {
            i = 0;
            if (C19383o.m32792b(layoutNodeWrapper, dVar)) {
                break;
            }
            C1745k kVar = (C1745k) layoutNodeWrapper;
            C1749o oVar = kVar.f3867w;
            eVar.mo20232c(new C1669b0(kVar.f3934D, kVar, oVar));
            T[] tArr = kVar.f3864t;
            int length = tArr.length;
            while (i < length) {
                for (T t = tArr[i]; t != null; t = t.f3921d) {
                    eVar.mo20232c(new C1669b0(t.f3920c, kVar, oVar));
                }
                i++;
            }
            layoutNodeWrapper = kVar.f3933C;
        }
        T[] tArr2 = this.f3800D.f3864t;
        int length2 = tArr2.length;
        while (i < length2) {
            for (T t2 = tArr2[i]; t2 != null; t2 = t2.f3921d) {
                M m = t2.f3920c;
                C1737d dVar2 = this.f3800D;
                eVar.mo20232c(new C1669b0(m, dVar2, dVar2.f3867w));
            }
            i++;
        }
        C7734e.C7735a aVar = eVar.f17156c;
        if (aVar != null) {
            return aVar;
        }
        C7734e.C7735a aVar2 = new C7734e.C7735a(eVar);
        eVar.f17156c = aVar2;
        return aVar2;
    }

    /* renamed from: b */
    public final void mo6690b() {
        mo6754S(false);
        OuterMeasurablePlaceable outerMeasurablePlaceable = this.f3801E;
        C7280a aVar = outerMeasurablePlaceable.f3876h ? new C7280a(outerMeasurablePlaceable.f3725e) : null;
        if (aVar != null) {
            C1750p pVar = this.f3823h;
            if (pVar != null) {
                pVar.m34784measureAndLayout0kLqBqw(this, aVar.f16152a);
                return;
            }
            return;
        }
        C1750p pVar2 = this.f3823h;
        if (pVar2 != null) {
            pVar2.measureAndLayout(true);
        }
    }

    /* renamed from: c */
    public final boolean mo6696c() {
        return this.f3823h != null;
    }

    /* renamed from: d */
    public final void mo6725d(C1843j1 j1Var) {
        C19383o.m32797g(j1Var, "<set-?>");
        this.f3835t = j1Var;
    }

    /* renamed from: e */
    public final void mo6726e(LayoutDirection layoutDirection) {
        C19383o.m32797g(layoutDirection, "value");
        if (this.f3834s != layoutDirection) {
            this.f3834s = layoutDirection;
            mo6754S(false);
            LayoutNode w = mo6766w();
            if (w != null) {
                w.mo6740C();
            }
            mo6741E();
        }
    }

    /* renamed from: f */
    public final Object mo6666f() {
        return this.f3801E.f3882n;
    }

    /* renamed from: g */
    public final void mo6727g(C7282b bVar) {
        C19383o.m32797g(bVar, "value");
        if (!C19383o.m32792b(this.f3832q, bVar)) {
            this.f3832q = bVar;
            mo6754S(false);
            LayoutNode w = mo6766w();
            if (w != null) {
                w.mo6740C();
            }
            mo6741E();
        }
    }

    public final int getHeight() {
        return this.f3801E.f3723c;
    }

    public final int getWidth() {
        return this.f3801E.f3722b;
    }

    /* renamed from: h */
    public final void mo6757h() {
        for (T t = this.f3800D.f3864t[4]; t != null; t = t.f3921d) {
            ((C1678e0) ((C1756u) t).f3920c).mo3725D(this.f3800D);
        }
    }

    /* renamed from: i */
    public final int mo6667i(int i) {
        return this.f3801E.mo6667i(i);
    }

    public final boolean isValid() {
        return mo6696c();
    }

    /* renamed from: j */
    public final void mo6728j(C1711v vVar) {
        C19383o.m32797g(vVar, "value");
        if (!C19383o.m32792b(this.f3830o, vVar)) {
            this.f3830o = vVar;
            C1738e eVar = this.f3831p;
            eVar.getClass();
            C1338j0<C1711v> j0Var = eVar.f3905b;
            if (j0Var != null) {
                j0Var.setValue(vVar);
            } else {
                eVar.f3906c = vVar;
            }
            mo6754S(false);
        }
    }

    /* renamed from: k */
    public final void mo6729k(C1436d dVar) {
        LayoutNode w;
        LayoutNode w2;
        C1750p pVar;
        C19383o.m32797g(dVar, "value");
        if (!C19383o.m32792b(dVar, this.f3808L)) {
            if (C19383o.m32792b(this.f3808L, C1436d.C1437a.f3125b) || (!this.f3817b)) {
                this.f3808L = dVar;
                boolean U = mo6756U();
                LayoutNodeWrapper layoutNodeWrapper = this.f3801E.f3875g;
                C1737d dVar2 = this.f3800D;
                while (!C19383o.m32792b(layoutNodeWrapper, dVar2)) {
                    C1745k kVar = (C1745k) layoutNodeWrapper;
                    this.f3826k.mo20232c(kVar);
                    layoutNodeWrapper = kVar.f3933C;
                }
                LayoutNodeWrapper layoutNodeWrapper2 = this.f3801E.f3875g;
                this.f3800D.getClass();
                while (true) {
                    if (C19383o.m32792b(layoutNodeWrapper2, (Object) null) || layoutNodeWrapper2 == null) {
                        C7734e<C1745k> eVar = this.f3826k;
                        int i = eVar.f17157d;
                    } else {
                        T[] tArr = layoutNodeWrapper2.f3864t;
                        for (T t : tArr) {
                            while (t != null) {
                                if (t.f3922e) {
                                    t.mo6919b();
                                }
                                t = t.f3921d;
                            }
                        }
                        int length = tArr.length;
                        for (int i2 = 0; i2 < length; i2++) {
                            tArr[i2] = null;
                        }
                        layoutNodeWrapper2 = layoutNodeWrapper2.mo6793d1();
                    }
                }
                C7734e<C1745k> eVar2 = this.f3826k;
                int i3 = eVar2.f17157d;
                if (i3 > 0) {
                    T[] tArr2 = eVar2.f17155b;
                    int i4 = 0;
                    do {
                        ((C1745k) tArr2[i4]).f3935E = false;
                        i4++;
                    } while (i4 < i3);
                }
                dVar.mo6119i(C19394m.f43287a, new LayoutNode$markReusedModifiers$2(this));
                LayoutNodeWrapper layoutNodeWrapper3 = this.f3801E.f3875g;
                if (C18263b.m30825T(this) != null && mo6696c()) {
                    C1750p pVar2 = this.f3823h;
                    C19383o.m32794d(pVar2);
                    pVar2.onSemanticsChange();
                }
                boolean booleanValue = ((Boolean) this.f3808L.mo6120m(Boolean.FALSE, new LayoutNode$hasNewPositioningCallback$1(this.f3811O))).booleanValue();
                C7734e<Pair<LayoutNodeWrapper, C1674c0>> eVar3 = this.f3811O;
                if (eVar3 != null) {
                    eVar3.mo20235g();
                }
                C1749o oVar = this.f3800D.f3867w;
                if (oVar != null) {
                    oVar.invalidate();
                }
                LayoutNodeWrapper layoutNodeWrapper4 = (LayoutNodeWrapper) this.f3808L.mo6120m(this.f3800D, new LayoutNode$modifier$outerWrapper$1(this));
                C7734e eVar4 = new C7734e(new ModifierLocalConsumerEntity[16]);
                for (C1746l lVar = this.f3806J; lVar != null; lVar = lVar.f3939d) {
                    eVar4.mo20233e(eVar4.f17157d, lVar.f3942g);
                    lVar.f3942g.mo20235g();
                }
                C1746l lVar2 = (C1746l) dVar.mo6119i(this.f3806J, new LayoutNode$setModifierLocals$1(this, eVar4));
                this.f3807K = lVar2;
                lVar2.f3939d = null;
                if (mo6696c()) {
                    int i5 = eVar4.f17157d;
                    if (i5 > 0) {
                        T[] tArr3 = eVar4.f17155b;
                        int i6 = 0;
                        do {
                            ModifierLocalConsumerEntity modifierLocalConsumerEntity = (ModifierLocalConsumerEntity) tArr3[i6];
                            modifierLocalConsumerEntity.f3871c.mo3622M(ModifierLocalConsumerEntity.f3869g);
                            modifierLocalConsumerEntity.f3873e = false;
                            i6++;
                        } while (i6 < i5);
                    }
                    for (C1746l lVar3 = lVar2.f3939d; lVar3 != null; lVar3 = lVar3.f3939d) {
                        lVar3.mo6931a();
                    }
                    for (C1746l lVar4 = this.f3806J; lVar4 != null; lVar4 = lVar4.f3939d) {
                        lVar4.f3941f = true;
                        C1750p pVar3 = lVar4.f3937b.f3823h;
                        if (pVar3 != null) {
                            pVar3.registerOnEndApplyChangesListener(lVar4);
                        }
                        C7734e<ModifierLocalConsumerEntity> eVar5 = lVar4.f3942g;
                        int i7 = eVar5.f17157d;
                        if (i7 > 0) {
                            T[] tArr4 = eVar5.f17155b;
                            int i8 = 0;
                            do {
                                ModifierLocalConsumerEntity modifierLocalConsumerEntity2 = (ModifierLocalConsumerEntity) tArr4[i8];
                                modifierLocalConsumerEntity2.f3873e = true;
                                C1750p pVar4 = modifierLocalConsumerEntity2.f3870b.f3937b.f3823h;
                                if (pVar4 != null) {
                                    pVar4.registerOnEndApplyChangesListener(modifierLocalConsumerEntity2);
                                }
                                i8++;
                            } while (i8 < i7);
                        }
                    }
                }
                LayoutNode w3 = mo6766w();
                layoutNodeWrapper4.f3851g = w3 != null ? w3.f3800D : null;
                OuterMeasurablePlaceable outerMeasurablePlaceable = this.f3801E;
                outerMeasurablePlaceable.getClass();
                outerMeasurablePlaceable.f3875g = layoutNodeWrapper4;
                if (mo6696c()) {
                    C7734e<C1745k> eVar6 = this.f3826k;
                    int i9 = eVar6.f17157d;
                    if (i9 > 0) {
                        T[] tArr5 = eVar6.f17155b;
                        int i10 = 0;
                        do {
                            ((C1745k) tArr5[i10]).mo6783T0();
                            i10++;
                        } while (i10 < i9);
                    }
                    LayoutNodeWrapper layoutNodeWrapper5 = this.f3801E.f3875g;
                    this.f3800D.getClass();
                    while (!C19383o.m32792b(layoutNodeWrapper5, (Object) null) && layoutNodeWrapper5 != null) {
                        if (!layoutNodeWrapper5.mo6685c()) {
                            layoutNodeWrapper5.f3857m = true;
                            layoutNodeWrapper5.mo6800k1(layoutNodeWrapper5.f3853i);
                            for (T t2 : layoutNodeWrapper5.f3864t) {
                                while (t2 != null) {
                                    t2.mo6735a();
                                    t2 = t2.f3921d;
                                }
                            }
                        } else {
                            for (T t3 : layoutNodeWrapper5.f3864t) {
                                while (t3 != null) {
                                    t3.mo6735a();
                                    t3 = t3.f3921d;
                                }
                            }
                        }
                        layoutNodeWrapper5 = layoutNodeWrapper5.mo6793d1();
                    }
                }
                this.f3826k.mo20235g();
                LayoutNodeWrapper layoutNodeWrapper6 = this.f3801E.f3875g;
                this.f3800D.getClass();
                while (!C19383o.m32792b(layoutNodeWrapper6, (Object) null) && layoutNodeWrapper6 != null) {
                    layoutNodeWrapper6.mo6802m1();
                    layoutNodeWrapper6 = layoutNodeWrapper6.mo6793d1();
                }
                if (!C19383o.m32792b(layoutNodeWrapper3, this.f3800D) || !C19383o.m32792b(layoutNodeWrapper4, this.f3800D)) {
                    mo6754S(false);
                } else if (this.f3825j == LayoutState.Idle && !this.f3814R && booleanValue) {
                    mo6754S(false);
                } else if (C20203a.m34521D(this.f3800D.f3864t, 4) && (pVar = this.f3823h) != null) {
                    pVar.registerOnLayoutCompletedListener(this);
                }
                OuterMeasurablePlaceable outerMeasurablePlaceable2 = this.f3801E;
                Object obj = outerMeasurablePlaceable2.f3882n;
                outerMeasurablePlaceable2.f3882n = outerMeasurablePlaceable2.f3875g.mo6722f();
                if (!C19383o.m32792b(obj, this.f3801E.f3882n) && (w2 = mo6766w()) != null) {
                    w2.mo6754S(false);
                }
                if ((U || mo6756U()) && (w = mo6766w()) != null) {
                    w.mo6740C();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes".toString());
        }
    }

    /* renamed from: l */
    public final C1737d mo6699l() {
        return this.f3800D;
    }

    /* renamed from: o */
    public final void mo6758o(C1750p pVar) {
        C19383o.m32797g(pVar, ResponseConstants.OWNER);
        if (this.f3823h == null) {
            LayoutNode layoutNode = this.f3822g;
            String str = null;
            if (!(layoutNode == null || C19383o.m32792b(layoutNode.f3823h, pVar))) {
                StringBuilder sb = new StringBuilder();
                sb.append("Attaching to a different owner(");
                sb.append(pVar);
                sb.append(") than the parent's owner(");
                LayoutNode w = mo6766w();
                sb.append(w != null ? w.f3823h : null);
                sb.append("). This tree: ");
                sb.append(mo6761r(0));
                sb.append(" Parent tree: ");
                LayoutNode layoutNode2 = this.f3822g;
                if (layoutNode2 != null) {
                    str = layoutNode2.mo6761r(0);
                }
                sb.append(str);
                throw new IllegalStateException(sb.toString().toString());
            }
            LayoutNode w2 = mo6766w();
            if (w2 == null) {
                this.f3837v = true;
            }
            this.f3823h = pVar;
            this.f3824i = (w2 != null ? w2.f3824i : -1) + 1;
            if (C18263b.m30825T(this) != null) {
                pVar.onSemanticsChange();
            }
            pVar.onAttach(this);
            C7734e<LayoutNode> eVar = this.f3819d;
            int i = eVar.f17157d;
            if (i > 0) {
                T[] tArr = eVar.f17155b;
                int i2 = 0;
                do {
                    ((LayoutNode) tArr[i2]).mo6758o(pVar);
                    i2++;
                } while (i2 < i);
            }
            mo6754S(false);
            if (w2 != null) {
                w2.mo6754S(false);
            }
            LayoutNodeWrapper layoutNodeWrapper = this.f3801E.f3875g;
            this.f3800D.getClass();
            while (!C19383o.m32792b(layoutNodeWrapper, (Object) null) && layoutNodeWrapper != null) {
                layoutNodeWrapper.f3857m = true;
                layoutNodeWrapper.mo6800k1(layoutNodeWrapper.f3853i);
                for (T t : layoutNodeWrapper.f3864t) {
                    while (t != null) {
                        t.mo6735a();
                        t = t.f3921d;
                    }
                }
                layoutNodeWrapper = layoutNodeWrapper.mo6793d1();
            }
            for (C1746l lVar = this.f3806J; lVar != null; lVar = lVar.f3939d) {
                lVar.f3941f = true;
                lVar.mo6933c(lVar.f3938c.getKey(), false);
                C7734e<ModifierLocalConsumerEntity> eVar2 = lVar.f3942g;
                int i3 = eVar2.f17157d;
                if (i3 > 0) {
                    T[] tArr2 = eVar2.f17155b;
                    int i4 = 0;
                    do {
                        ModifierLocalConsumerEntity modifierLocalConsumerEntity = (ModifierLocalConsumerEntity) tArr2[i4];
                        modifierLocalConsumerEntity.f3873e = true;
                        modifierLocalConsumerEntity.mo6819b();
                        i4++;
                    } while (i4 < i3);
                }
            }
            C19857l<? super C1750p, C19394m> lVar2 = this.f3809M;
            if (lVar2 != null) {
                lVar2.invoke(pVar);
                return;
            }
            return;
        }
        throw new IllegalStateException(("Cannot attach " + this + " as it already is attached.  Tree: " + mo6761r(0)).toString());
    }

    /* renamed from: p */
    public final void mo6759p() {
        this.f3798B = this.f3797A;
        this.f3797A = UsageByParent.NotUsed;
        C7734e<LayoutNode> y = mo6768y();
        int i = y.f17157d;
        if (i > 0) {
            int i2 = 0;
            T[] tArr = y.f17155b;
            do {
                LayoutNode layoutNode = (LayoutNode) tArr[i2];
                if (layoutNode.f3797A != UsageByParent.NotUsed) {
                    layoutNode.mo6759p();
                }
                i2++;
            } while (i2 < i);
        }
    }

    /* renamed from: q */
    public final void mo6760q() {
        this.f3798B = this.f3797A;
        this.f3797A = UsageByParent.NotUsed;
        C7734e<LayoutNode> y = mo6768y();
        int i = y.f17157d;
        if (i > 0) {
            int i2 = 0;
            T[] tArr = y.f17155b;
            do {
                LayoutNode layoutNode = (LayoutNode) tArr[i2];
                if (layoutNode.f3797A == UsageByParent.InLayoutBlock) {
                    layoutNode.mo6760q();
                }
                i2++;
            } while (i2 < i);
        }
    }

    /* renamed from: r */
    public final String mo6761r(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append(10);
        C7734e<LayoutNode> y = mo6768y();
        int i3 = y.f17157d;
        if (i3 > 0) {
            T[] tArr = y.f17155b;
            int i4 = 0;
            do {
                sb.append(((LayoutNode) tArr[i4]).mo6761r(i + 1));
                i4++;
            } while (i4 < i3);
        }
        String sb2 = sb.toString();
        C19383o.m32796f(sb2, "tree.toString()");
        if (i != 0) {
            return sb2;
        }
        String substring = sb2.substring(0, sb2.length() - 1);
        C19383o.m32796f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: s */
    public final int mo6668s(int i) {
        return this.f3801E.mo6668s(i);
    }

    /* renamed from: t */
    public final void mo6762t() {
        C1750p pVar = this.f3823h;
        String str = null;
        if (pVar == null) {
            StringBuilder h = C0072d.m201h("Cannot detach node that is already detached!  Tree: ");
            LayoutNode w = mo6766w();
            if (w != null) {
                str = w.mo6761r(0);
            }
            h.append(str);
            throw new IllegalStateException(h.toString().toString());
        }
        LayoutNode w2 = mo6766w();
        if (w2 != null) {
            w2.mo6740C();
            w2.mo6754S(false);
        }
        C1740g gVar = this.f3836u;
        gVar.f3909b = true;
        gVar.f3910c = false;
        gVar.f3912e = false;
        gVar.f3911d = false;
        gVar.f3913f = false;
        gVar.f3914g = false;
        gVar.f3915h = null;
        C19857l<? super C1750p, C19394m> lVar = this.f3810N;
        if (lVar != null) {
            lVar.invoke(pVar);
        }
        for (C1746l lVar2 = this.f3806J; lVar2 != null; lVar2 = lVar2.f3939d) {
            lVar2.mo6931a();
        }
        LayoutNodeWrapper layoutNodeWrapper = this.f3801E.f3875g;
        this.f3800D.getClass();
        while (!C19383o.m32792b(layoutNodeWrapper, (Object) null) && layoutNodeWrapper != null) {
            layoutNodeWrapper.mo6783T0();
            layoutNodeWrapper = layoutNodeWrapper.mo6793d1();
        }
        if (C18263b.m30825T(this) != null) {
            pVar.onSemanticsChange();
        }
        pVar.onDetach(this);
        this.f3823h = null;
        this.f3824i = 0;
        C7734e<LayoutNode> eVar = this.f3819d;
        int i = eVar.f17157d;
        if (i > 0) {
            T[] tArr = eVar.f17155b;
            int i2 = 0;
            do {
                ((LayoutNode) tArr[i2]).mo6762t();
                i2++;
            } while (i2 < i);
        }
        this.f3838w = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f3839x = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f3837v = false;
    }

    public final String toString() {
        return C0114h.m328x0(this) + " children: " + ((C7734e.C7735a) mo6764u()).f17158b.f17157d + " measurePolicy: " + this.f3830o;
    }

    /* renamed from: u */
    public final List<LayoutNode> mo6764u() {
        C7734e<LayoutNode> y = mo6768y();
        C7734e.C7735a aVar = y.f17156c;
        if (aVar != null) {
            return aVar;
        }
        C7734e.C7735a aVar2 = new C7734e.C7735a(y);
        y.f17156c = aVar2;
        return aVar2;
    }

    /* renamed from: v */
    public final List<LayoutNode> mo6765v() {
        C7734e<LayoutNode> eVar = this.f3819d;
        C7734e.C7735a aVar = eVar.f17156c;
        if (aVar != null) {
            return aVar;
        }
        C7734e.C7735a aVar2 = new C7734e.C7735a(eVar);
        eVar.f17156c = aVar2;
        return aVar2;
    }

    /* renamed from: w */
    public final LayoutNode mo6766w() {
        LayoutNode layoutNode = this.f3822g;
        boolean z = true;
        if (layoutNode == null || !layoutNode.f3817b) {
            z = false;
        }
        if (!z) {
            return layoutNode;
        }
        if (layoutNode != null) {
            return layoutNode.mo6766w();
        }
        return null;
    }

    /* renamed from: x */
    public final C7734e<LayoutNode> mo6767x() {
        if (this.f3829n) {
            this.f3828m.mo20235g();
            C7734e<LayoutNode> eVar = this.f3828m;
            eVar.mo20233e(eVar.f17157d, mo6768y());
            this.f3828m.mo20244s(this.f3816T);
            this.f3829n = false;
        }
        return this.f3828m;
    }

    /* renamed from: y */
    public final C7734e<LayoutNode> mo6768y() {
        if (this.f3818c == 0) {
            return this.f3819d;
        }
        if (this.f3821f) {
            int i = 0;
            this.f3821f = false;
            C7734e<LayoutNode> eVar = this.f3820e;
            if (eVar == null) {
                C7734e<LayoutNode> eVar2 = new C7734e<>(new LayoutNode[16]);
                this.f3820e = eVar2;
                eVar = eVar2;
            }
            eVar.mo20235g();
            C7734e<LayoutNode> eVar3 = this.f3819d;
            int i2 = eVar3.f17157d;
            if (i2 > 0) {
                T[] tArr = eVar3.f17155b;
                do {
                    LayoutNode layoutNode = (LayoutNode) tArr[i];
                    if (layoutNode.f3817b) {
                        eVar.mo20233e(eVar.f17157d, layoutNode.mo6768y());
                    } else {
                        eVar.mo20232c(layoutNode);
                    }
                    i++;
                } while (i < i2);
            }
        }
        C7734e<LayoutNode> eVar4 = this.f3820e;
        C19383o.m32794d(eVar4);
        return eVar4;
    }

    /* renamed from: z */
    public final int mo6669z(int i) {
        return this.f3801E.mo6669z(i);
    }

    public LayoutNode(boolean z) {
        this.f3817b = z;
        this.f3819d = new C7734e<>(new LayoutNode[16]);
        this.f3825j = LayoutState.Idle;
        this.f3826k = new C7734e<>(new C1745k[16]);
        this.f3828m = new C7734e<>(new LayoutNode[16]);
        this.f3829n = true;
        this.f3830o = f3792V;
        this.f3831p = new C1738e(this);
        this.f3832q = new C7283c(1.0f, 1.0f);
        this.f3833r = new C1725f(this);
        this.f3834s = LayoutDirection.Ltr;
        this.f3835t = f3794X;
        this.f3836u = new C1740g(this);
        this.f3838w = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f3839x = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        UsageByParent usageByParent = UsageByParent.NotUsed;
        this.f3841z = usageByParent;
        this.f3797A = usageByParent;
        this.f3798B = usageByParent;
        C1737d dVar = new C1737d(this);
        this.f3800D = dVar;
        this.f3801E = new OuterMeasurablePlaceable(this, dVar);
        this.f3805I = true;
        C1746l lVar = new C1746l(this, f3796Z);
        this.f3806J = lVar;
        this.f3807K = lVar;
        this.f3808L = C1436d.C1437a.f3125b;
        this.f3816T = new C1739f(0);
    }
}
