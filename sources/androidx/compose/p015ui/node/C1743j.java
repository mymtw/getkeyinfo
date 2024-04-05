package androidx.compose.p015ui.node;

import androidx.compose.p015ui.node.C1750p;
import androidx.compose.p015ui.node.LayoutNode;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import p174m0.C7280a;
import p219r.C7734e;

/* renamed from: androidx.compose.ui.node.j */
public final class C1743j {

    /* renamed from: a */
    public final LayoutNode f3923a;

    /* renamed from: b */
    public final C1733b f3924b = new C1733b();

    /* renamed from: c */
    public boolean f3925c;

    /* renamed from: d */
    public final C1748n f3926d = new C1748n();

    /* renamed from: e */
    public final C7734e<C1750p.C1751a> f3927e = new C7734e<>(new C1750p.C1751a[16]);

    /* renamed from: f */
    public long f3928f = 1;

    /* renamed from: g */
    public final ArrayList f3929g = new ArrayList();

    /* renamed from: h */
    public C7280a f3930h;

    /* renamed from: androidx.compose.ui.node.j$a */
    public /* synthetic */ class C1744a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3931a;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 1;
            iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 2;
            iArr[LayoutNode.LayoutState.Idle.ordinal()] = 3;
            f3931a = iArr;
        }
    }

    public C1743j(LayoutNode layoutNode) {
        C19383o.m32797g(layoutNode, "root");
        this.f3923a = layoutNode;
    }

    /* renamed from: a */
    public final void mo6920a(boolean z) {
        if (z) {
            C1748n nVar = this.f3926d;
            LayoutNode layoutNode = this.f3923a;
            nVar.getClass();
            C19383o.m32797g(layoutNode, "rootNode");
            nVar.f3944a.mo20235g();
            nVar.f3944a.mo20232c(layoutNode);
            layoutNode.f3812P = true;
        }
        C1748n nVar2 = this.f3926d;
        nVar2.f3944a.mo20244s(C1747m.f3943b);
        C7734e<LayoutNode> eVar = nVar2.f3944a;
        int i = eVar.f17157d;
        if (i > 0) {
            int i2 = i - 1;
            T[] tArr = eVar.f17155b;
            do {
                LayoutNode layoutNode2 = (LayoutNode) tArr[i2];
                if (layoutNode2.f3812P) {
                    C1748n.m3885a(layoutNode2);
                }
                i2--;
            } while (i2 >= 0);
        }
        nVar2.f3944a.mo20235g();
    }

    /* renamed from: b */
    public final boolean mo6921b(LayoutNode layoutNode, C7280a aVar) {
        boolean z;
        if (aVar != null) {
            if (layoutNode.f3797A == LayoutNode.UsageByParent.NotUsed) {
                layoutNode.mo6759p();
            }
            z = layoutNode.f3801E.mo6822P0(aVar.f16152a);
        } else {
            OuterMeasurablePlaceable outerMeasurablePlaceable = layoutNode.f3801E;
            C7280a aVar2 = outerMeasurablePlaceable.f3876h ? new C7280a(outerMeasurablePlaceable.f3725e) : null;
            if (aVar2 != null) {
                if (layoutNode.f3797A == LayoutNode.UsageByParent.NotUsed) {
                    layoutNode.mo6759p();
                }
                z = layoutNode.f3801E.mo6822P0(aVar2.f16152a);
            } else {
                z = false;
            }
        }
        LayoutNode w = layoutNode.mo6766w();
        if (z && w != null) {
            LayoutNode.UsageByParent usageByParent = layoutNode.f3841z;
            if (usageByParent == LayoutNode.UsageByParent.InMeasureBlock) {
                mo6927h(w, false);
            } else if (usageByParent == LayoutNode.UsageByParent.InLayoutBlock) {
                mo6926g(w, false);
            }
        }
        return z;
    }

    /* renamed from: c */
    public final void mo6922c(LayoutNode layoutNode) {
        C19383o.m32797g(layoutNode, "layoutNode");
        if (!this.f3924b.f3890b.isEmpty()) {
            if (!this.f3925c) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!layoutNode.f3814R) {
                C7734e<LayoutNode> y = layoutNode.mo6768y();
                int i = y.f17157d;
                if (i > 0) {
                    int i2 = 0;
                    T[] tArr = y.f17155b;
                    do {
                        LayoutNode layoutNode2 = (LayoutNode) tArr[i2];
                        if (layoutNode2.f3814R && this.f3924b.mo6832b(layoutNode2)) {
                            mo6925f(layoutNode2);
                        }
                        if (!layoutNode2.f3814R) {
                            mo6922c(layoutNode2);
                        }
                        i2++;
                    } while (i2 < i);
                }
                if (layoutNode.f3814R && this.f3924b.mo6832b(layoutNode)) {
                    mo6925f(layoutNode);
                }
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r1v2, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo6923d(p753kq.C19846a<kotlin.C19394m> r8) {
        /*
            r7 = this;
            androidx.compose.ui.node.LayoutNode r0 = r7.f3923a
            boolean r0 = r0.mo6696c()
            java.lang.String r1 = "Failed requirement."
            if (r0 == 0) goto L_0x008b
            androidx.compose.ui.node.LayoutNode r0 = r7.f3923a
            boolean r0 = r0.f3837v
            if (r0 == 0) goto L_0x0081
            boolean r0 = r7.f3925c
            r2 = 1
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x0077
            m0.a r0 = r7.f3930h
            r1 = 0
            if (r0 == 0) goto L_0x005e
            r7.f3925c = r2
            androidx.compose.ui.node.b r0 = r7.f3924b     // Catch:{ all -> 0x005a }
            androidx.compose.ui.node.TreeSet<androidx.compose.ui.node.LayoutNode> r0 = r0.f3890b     // Catch:{ all -> 0x005a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x005a }
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x0056
            androidx.compose.ui.node.b r0 = r7.f3924b     // Catch:{ all -> 0x005a }
            r3 = r1
        L_0x002b:
            androidx.compose.ui.node.TreeSet<androidx.compose.ui.node.LayoutNode> r4 = r0.f3890b     // Catch:{ all -> 0x005a }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x005a }
            r4 = r4 ^ r2
            if (r4 == 0) goto L_0x0050
            androidx.compose.ui.node.TreeSet<androidx.compose.ui.node.LayoutNode> r4 = r0.f3890b     // Catch:{ all -> 0x005a }
            java.lang.Object r4 = r4.first()     // Catch:{ all -> 0x005a }
            androidx.compose.ui.node.LayoutNode r4 = (androidx.compose.p015ui.node.LayoutNode) r4     // Catch:{ all -> 0x005a }
            java.lang.String r5 = "node"
            kotlin.jvm.internal.C19383o.m32796f(r4, r5)     // Catch:{ all -> 0x005a }
            r0.mo6832b(r4)     // Catch:{ all -> 0x005a }
            boolean r5 = r7.mo6925f(r4)     // Catch:{ all -> 0x005a }
            androidx.compose.ui.node.LayoutNode r6 = r7.f3923a     // Catch:{ all -> 0x005a }
            if (r4 != r6) goto L_0x002b
            if (r5 == 0) goto L_0x002b
            r3 = r2
            goto L_0x002b
        L_0x0050:
            if (r8 == 0) goto L_0x0057
            r8.invoke()     // Catch:{ all -> 0x005a }
            goto L_0x0057
        L_0x0056:
            r3 = r1
        L_0x0057:
            r7.f3925c = r1
            goto L_0x005f
        L_0x005a:
            r8 = move-exception
            r7.f3925c = r1
            throw r8
        L_0x005e:
            r3 = r1
        L_0x005f:
            r.e<androidx.compose.ui.node.p$a> r8 = r7.f3927e
            int r0 = r8.f17157d
            if (r0 <= 0) goto L_0x0071
            T[] r8 = r8.f17155b
        L_0x0067:
            r4 = r8[r1]
            androidx.compose.ui.node.p$a r4 = (androidx.compose.p015ui.node.C1750p.C1751a) r4
            r4.mo6757h()
            int r1 = r1 + r2
            if (r1 < r0) goto L_0x0067
        L_0x0071:
            r.e<androidx.compose.ui.node.p$a> r8 = r7.f3927e
            r8.mo20235g()
            return r3
        L_0x0077:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r1.toString()
            r8.<init>(r0)
            throw r8
        L_0x0081:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r1.toString()
            r8.<init>(r0)
            throw r8
        L_0x008b:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r1.toString()
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.node.C1743j.mo6923d(kq.a):boolean");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r2v2, types: [int] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6924e(androidx.compose.p015ui.node.LayoutNode r4, long r5) {
        /*
            r3 = this;
            java.lang.String r0 = "layoutNode"
            kotlin.jvm.internal.C19383o.m32797g(r4, r0)
            androidx.compose.ui.node.LayoutNode r0 = r3.f3923a
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r4, r0)
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "Failed requirement."
            if (r0 == 0) goto L_0x008c
            androidx.compose.ui.node.LayoutNode r0 = r3.f3923a
            boolean r0 = r0.mo6696c()
            if (r0 == 0) goto L_0x0082
            androidx.compose.ui.node.LayoutNode r0 = r3.f3923a
            boolean r0 = r0.f3837v
            if (r0 == 0) goto L_0x0078
            boolean r0 = r3.f3925c
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x006e
            m0.a r0 = r3.f3930h
            r2 = 0
            if (r0 == 0) goto L_0x0056
            r3.f3925c = r1
            androidx.compose.ui.node.b r0 = r3.f3924b     // Catch:{ all -> 0x0052 }
            r0.mo6832b(r4)     // Catch:{ all -> 0x0052 }
            m0.a r0 = new m0.a     // Catch:{ all -> 0x0052 }
            r0.<init>(r5)     // Catch:{ all -> 0x0052 }
            r3.mo6921b(r4, r0)     // Catch:{ all -> 0x0052 }
            boolean r5 = r4.f3815S     // Catch:{ all -> 0x0052 }
            if (r5 == 0) goto L_0x004f
            boolean r5 = r4.f3837v     // Catch:{ all -> 0x0052 }
            if (r5 == 0) goto L_0x004f
            r4.mo6752Q()     // Catch:{ all -> 0x0052 }
            androidx.compose.ui.node.n r5 = r3.f3926d     // Catch:{ all -> 0x0052 }
            r5.getClass()     // Catch:{ all -> 0x0052 }
            r.e<androidx.compose.ui.node.LayoutNode> r5 = r5.f3944a     // Catch:{ all -> 0x0052 }
            r5.mo20232c(r4)     // Catch:{ all -> 0x0052 }
            r4.f3812P = r1     // Catch:{ all -> 0x0052 }
        L_0x004f:
            r3.f3925c = r2
            goto L_0x0056
        L_0x0052:
            r4 = move-exception
            r3.f3925c = r2
            throw r4
        L_0x0056:
            r.e<androidx.compose.ui.node.p$a> r4 = r3.f3927e
            int r5 = r4.f17157d
            if (r5 <= 0) goto L_0x0068
            T[] r4 = r4.f17155b
        L_0x005e:
            r6 = r4[r2]
            androidx.compose.ui.node.p$a r6 = (androidx.compose.p015ui.node.C1750p.C1751a) r6
            r6.mo6757h()
            int r2 = r2 + r1
            if (r2 < r5) goto L_0x005e
        L_0x0068:
            r.e<androidx.compose.ui.node.p$a> r4 = r3.f3927e
            r4.mo20235g()
            return
        L_0x006e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r2.toString()
            r4.<init>(r5)
            throw r4
        L_0x0078:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r2.toString()
            r4.<init>(r5)
            throw r4
        L_0x0082:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r2.toString()
            r4.<init>(r5)
            throw r4
        L_0x008c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r2.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.node.C1743j.mo6924e(androidx.compose.ui.node.LayoutNode, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if ((r0.f3915h != null) != false) goto L_0x001e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0023  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo6925f(androidx.compose.p015ui.node.LayoutNode r9) {
        /*
            r8 = this;
            boolean r0 = r9.f3837v
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0031
            boolean r0 = r9.f3814R
            if (r0 == 0) goto L_0x0020
            androidx.compose.ui.node.LayoutNode$UsageByParent r0 = r9.f3841z
            androidx.compose.ui.node.LayoutNode$UsageByParent r3 = androidx.compose.p015ui.node.LayoutNode.UsageByParent.InMeasureBlock
            if (r0 == r3) goto L_0x001e
            androidx.compose.ui.node.g r0 = r9.f3836u
            r0.mo6899c()
            androidx.compose.ui.node.LayoutNode r0 = r0.f3915h
            if (r0 == 0) goto L_0x001b
            r0 = r1
            goto L_0x001c
        L_0x001b:
            r0 = r2
        L_0x001c:
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = r1
            goto L_0x0021
        L_0x0020:
            r0 = r2
        L_0x0021:
            if (r0 != 0) goto L_0x0031
            androidx.compose.ui.node.g r0 = r9.f3836u
            r0.mo6899c()
            androidx.compose.ui.node.LayoutNode r0 = r0.f3915h
            if (r0 == 0) goto L_0x002e
            r0 = r1
            goto L_0x002f
        L_0x002e:
            r0 = r2
        L_0x002f:
            if (r0 == 0) goto L_0x00b3
        L_0x0031:
            boolean r0 = r9.f3814R
            if (r0 == 0) goto L_0x0045
            androidx.compose.ui.node.LayoutNode r0 = r8.f3923a
            if (r9 != r0) goto L_0x003f
            m0.a r0 = r8.f3930h
            kotlin.jvm.internal.C19383o.m32794d(r0)
            goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            boolean r0 = r8.mo6921b(r9, r0)
            goto L_0x0046
        L_0x0045:
            r0 = r2
        L_0x0046:
            boolean r3 = r9.f3815S
            if (r3 == 0) goto L_0x0089
            boolean r3 = r9.f3837v
            if (r3 == 0) goto L_0x0089
            androidx.compose.ui.node.LayoutNode r3 = r8.f3923a
            if (r9 != r3) goto L_0x007a
            androidx.compose.ui.node.LayoutNode$UsageByParent r3 = r9.f3797A
            androidx.compose.ui.node.LayoutNode$UsageByParent r4 = androidx.compose.p015ui.node.LayoutNode.UsageByParent.NotUsed
            if (r3 != r4) goto L_0x005b
            r9.mo6760q()
        L_0x005b:
            androidx.compose.ui.layout.i0$a$a r3 = androidx.compose.p015ui.layout.C1686i0.C1687a.f3726a
            androidx.compose.ui.node.OuterMeasurablePlaceable r4 = r9.f3801E
            int r4 = r4.mo6676o0()
            androidx.compose.ui.unit.LayoutDirection r5 = r9.f3834s
            r3.getClass()
            int r6 = androidx.compose.p015ui.layout.C1686i0.C1687a.f3728c
            androidx.compose.ui.unit.LayoutDirection r7 = androidx.compose.p015ui.layout.C1686i0.C1687a.f3727b
            androidx.compose.p015ui.layout.C1686i0.C1687a.f3728c = r4
            androidx.compose.p015ui.layout.C1686i0.C1687a.f3727b = r5
            androidx.compose.ui.node.OuterMeasurablePlaceable r4 = r9.f3801E
            androidx.compose.p015ui.layout.C1686i0.C1687a.m3583e(r3, r4, r2, r2)
            androidx.compose.p015ui.layout.C1686i0.C1687a.f3728c = r6
            androidx.compose.p015ui.layout.C1686i0.C1687a.f3727b = r7
            goto L_0x007d
        L_0x007a:
            r9.mo6752Q()
        L_0x007d:
            androidx.compose.ui.node.n r3 = r8.f3926d
            r3.getClass()
            r.e<androidx.compose.ui.node.LayoutNode> r3 = r3.f3944a
            r3.mo20232c(r9)
            r9.f3812P = r1
        L_0x0089:
            java.util.ArrayList r9 = r8.f3929g
            boolean r9 = r9.isEmpty()
            r9 = r9 ^ r1
            if (r9 == 0) goto L_0x00b2
            java.util.ArrayList r9 = r8.f3929g
            int r1 = r9.size()
            r3 = r2
        L_0x0099:
            if (r3 >= r1) goto L_0x00ad
            java.lang.Object r4 = r9.get(r3)
            androidx.compose.ui.node.LayoutNode r4 = (androidx.compose.p015ui.node.LayoutNode) r4
            boolean r5 = r4.mo6696c()
            if (r5 == 0) goto L_0x00aa
            r8.mo6927h(r4, r2)
        L_0x00aa:
            int r3 = r3 + 1
            goto L_0x0099
        L_0x00ad:
            java.util.ArrayList r9 = r8.f3929g
            r9.clear()
        L_0x00b2:
            r2 = r0
        L_0x00b3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.node.C1743j.mo6925f(androidx.compose.ui.node.LayoutNode):boolean");
    }

    /* renamed from: g */
    public final boolean mo6926g(LayoutNode layoutNode, boolean z) {
        C19383o.m32797g(layoutNode, "layoutNode");
        int i = C1744a.f3931a[layoutNode.f3825j.ordinal()];
        if (i == 1 || i == 2) {
            return false;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        } else if ((layoutNode.f3814R || layoutNode.f3815S) && !z) {
            return false;
        } else {
            layoutNode.f3815S = true;
            if (layoutNode.f3837v) {
                LayoutNode w = layoutNode.mo6766w();
                if (!(w != null && w.f3815S)) {
                    if (!(w != null && w.f3814R)) {
                        this.f3924b.mo6831a(layoutNode);
                    }
                }
            }
            return !this.f3925c;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        if (r6 == false) goto L_0x0054;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo6927h(androidx.compose.p015ui.node.LayoutNode r5, boolean r6) {
        /*
            r4 = this;
            java.lang.String r0 = "layoutNode"
            kotlin.jvm.internal.C19383o.m32797g(r5, r0)
            androidx.compose.ui.node.LayoutNode$LayoutState r0 = r5.f3825j
            int[] r1 = androidx.compose.p015ui.node.C1743j.C1744a.f3931a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0065
            r3 = 2
            if (r0 == r3) goto L_0x0060
            r3 = 3
            if (r0 != r3) goto L_0x005a
            boolean r0 = r5.f3814R
            if (r0 == 0) goto L_0x0020
            if (r6 != 0) goto L_0x0020
            goto L_0x0065
        L_0x0020:
            r5.f3814R = r2
            boolean r6 = r5.f3837v
            if (r6 != 0) goto L_0x0040
            androidx.compose.ui.node.LayoutNode$UsageByParent r6 = r5.f3841z
            androidx.compose.ui.node.LayoutNode$UsageByParent r0 = androidx.compose.p015ui.node.LayoutNode.UsageByParent.InMeasureBlock
            if (r6 == r0) goto L_0x003d
            androidx.compose.ui.node.g r6 = r5.f3836u
            r6.mo6899c()
            androidx.compose.ui.node.LayoutNode r6 = r6.f3915h
            if (r6 == 0) goto L_0x0037
            r6 = r2
            goto L_0x0038
        L_0x0037:
            r6 = r1
        L_0x0038:
            if (r6 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r6 = r1
            goto L_0x003e
        L_0x003d:
            r6 = r2
        L_0x003e:
            if (r6 == 0) goto L_0x0054
        L_0x0040:
            androidx.compose.ui.node.LayoutNode r6 = r5.mo6766w()
            if (r6 == 0) goto L_0x004c
            boolean r6 = r6.f3814R
            if (r6 != r2) goto L_0x004c
            r6 = r2
            goto L_0x004d
        L_0x004c:
            r6 = r1
        L_0x004d:
            if (r6 != 0) goto L_0x0054
            androidx.compose.ui.node.b r6 = r4.f3924b
            r6.mo6831a(r5)
        L_0x0054:
            boolean r5 = r4.f3925c
            if (r5 != 0) goto L_0x0065
            r1 = r2
            goto L_0x0065
        L_0x005a:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L_0x0060:
            java.util.ArrayList r6 = r4.f3929g
            r6.add(r5)
        L_0x0065:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.node.C1743j.mo6927h(androidx.compose.ui.node.LayoutNode, boolean):boolean");
    }

    /* renamed from: i */
    public final void mo6928i(long j) {
        C7280a aVar = this.f3930h;
        if (aVar == null ? false : C7280a.m13957b(aVar.f16152a, j)) {
            return;
        }
        if (!this.f3925c) {
            this.f3930h = new C7280a(j);
            LayoutNode layoutNode = this.f3923a;
            layoutNode.f3814R = true;
            this.f3924b.mo6831a(layoutNode);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
