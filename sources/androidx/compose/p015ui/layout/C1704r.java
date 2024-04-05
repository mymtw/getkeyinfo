package androidx.compose.p015ui.layout;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.layout.C1698n0;
import androidx.compose.p015ui.node.C1757v;
import androidx.compose.p015ui.node.LayoutNode;
import androidx.compose.p015ui.platform.C1886w1;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1320f;
import androidx.compose.runtime.C1324g;
import androidx.compose.runtime.C1337j;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.C1385f;
import androidx.compose.runtime.snapshots.SnapshotKt;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p219r.C7734e;
import p504ai.C13983i;
import p628nj.C18263b;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.layout.r */
public final class C1704r {

    /* renamed from: a */
    public final LayoutNode f3739a;

    /* renamed from: b */
    public C1324g f3740b;

    /* renamed from: c */
    public C1698n0 f3741c;

    /* renamed from: d */
    public int f3742d;

    /* renamed from: e */
    public final LinkedHashMap f3743e = new LinkedHashMap();

    /* renamed from: f */
    public final LinkedHashMap f3744f = new LinkedHashMap();

    /* renamed from: g */
    public final C1706b f3745g = new C1706b();

    /* renamed from: h */
    public final LinkedHashMap f3746h = new LinkedHashMap();

    /* renamed from: i */
    public final C1698n0.C1699a f3747i = new C1698n0.C1699a(0);

    /* renamed from: j */
    public int f3748j;

    /* renamed from: k */
    public int f3749k;

    /* renamed from: l */
    public final String f3750l = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing,, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    /* renamed from: androidx.compose.ui.layout.r$a */
    public static final class C1705a {

        /* renamed from: a */
        public Object f3751a;

        /* renamed from: b */
        public C19861p<? super C1302d, ? super Integer, C19394m> f3752b;

        /* renamed from: c */
        public C1320f f3753c;

        /* renamed from: d */
        public boolean f3754d;

        /* renamed from: e */
        public final ParcelableSnapshotMutableState f3755e;

        public C1705a() {
            throw null;
        }

        public C1705a(Object obj, ComposableLambdaImpl composableLambdaImpl) {
            C19383o.m32797g(composableLambdaImpl, ResponseConstants.CONTENT);
            this.f3751a = obj;
            this.f3752b = composableLambdaImpl;
            this.f3753c = null;
            this.f3755e = C0761x.m1751w0(Boolean.TRUE, C1351n1.f2948a);
        }
    }

    /* renamed from: androidx.compose.ui.layout.r$b */
    public final class C1706b implements C1696m0 {

        /* renamed from: b */
        public LayoutDirection f3756b = LayoutDirection.Rtl;

        /* renamed from: c */
        public float f3757c;

        /* renamed from: d */
        public float f3758d;

        public C1706b() {
        }

        /* renamed from: T */
        public final List<C1710u> mo6700T(Object obj, C19861p<? super C1302d, ? super Integer, C19394m> pVar) {
            C19383o.m32797g(pVar, ResponseConstants.CONTENT);
            C1704r rVar = C1704r.this;
            rVar.getClass();
            rVar.mo6719b();
            LayoutNode.LayoutState layoutState = rVar.f3739a.f3825j;
            if (layoutState == LayoutNode.LayoutState.Measuring || layoutState == LayoutNode.LayoutState.LayingOut) {
                LinkedHashMap linkedHashMap = rVar.f3744f;
                Object obj2 = linkedHashMap.get(obj);
                if (obj2 == null) {
                    obj2 = (LayoutNode) rVar.f3746h.remove(obj);
                    if (obj2 != null) {
                        int i = rVar.f3749k;
                        if (i > 0) {
                            rVar.f3749k = i - 1;
                        } else {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    } else {
                        obj2 = rVar.mo6721d(obj);
                        if (obj2 == null) {
                            int i2 = rVar.f3742d;
                            LayoutNode layoutNode = new LayoutNode(true);
                            LayoutNode layoutNode2 = rVar.f3739a;
                            layoutNode2.f3827l = true;
                            layoutNode2.mo6739B(i2, layoutNode);
                            layoutNode2.f3827l = false;
                            obj2 = layoutNode;
                        }
                    }
                    linkedHashMap.put(obj, obj2);
                }
                LayoutNode layoutNode3 = (LayoutNode) obj2;
                int indexOf = ((C7734e.C7735a) rVar.f3739a.mo6765v()).indexOf(layoutNode3);
                int i3 = rVar.f3742d;
                if (indexOf >= i3) {
                    if (i3 != indexOf) {
                        LayoutNode layoutNode4 = rVar.f3739a;
                        layoutNode4.f3827l = true;
                        layoutNode4.mo6746K(indexOf, i3, 1);
                        layoutNode4.f3827l = false;
                    }
                    rVar.f3742d++;
                    rVar.mo6720c(layoutNode3, obj, pVar);
                    return layoutNode3.mo6764u();
                }
                throw new IllegalArgumentException(C13983i.m21494m("Key ", obj, " was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item."));
            }
            throw new IllegalStateException("subcompose can only be used inside the measure or layout blocks".toString());
        }

        public final float getDensity() {
            return this.f3757c;
        }

        public final LayoutDirection getLayoutDirection() {
            return this.f3756b;
        }

        /* renamed from: w0 */
        public final float mo3800w0() {
            return this.f3758d;
        }
    }

    public C1704r(LayoutNode layoutNode, C1698n0 n0Var) {
        C19383o.m32797g(layoutNode, "root");
        C19383o.m32797g(n0Var, "slotReusePolicy");
        this.f3739a = layoutNode;
        this.f3741c = n0Var;
    }

    /* renamed from: a */
    public final void mo6718a(int i) {
        this.f3748j = 0;
        int i2 = (((C7734e.C7735a) this.f3739a.mo6765v()).f17158b.f17157d - this.f3749k) - 1;
        if (i <= i2) {
            this.f3747i.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    C1698n0.C1699a aVar = this.f3747i;
                    Object obj = this.f3743e.get((LayoutNode) ((C7734e.C7735a) this.f3739a.mo6765v()).get(i3));
                    C19383o.m32794d(obj);
                    aVar.f3737b.add(((C1705a) obj).f3751a);
                    if (i3 == i2) {
                        break;
                    }
                    i3++;
                }
            }
            this.f3741c.mo12a(this.f3747i);
            while (i2 >= i) {
                LayoutNode layoutNode = (LayoutNode) ((C7734e.C7735a) this.f3739a.mo6765v()).get(i2);
                Object obj2 = this.f3743e.get(layoutNode);
                C19383o.m32794d(obj2);
                C1705a aVar2 = (C1705a) obj2;
                Object obj3 = aVar2.f3751a;
                if (this.f3747i.contains(obj3)) {
                    LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
                    layoutNode.getClass();
                    C19383o.m32797g(usageByParent, "<set-?>");
                    layoutNode.f3841z = usageByParent;
                    this.f3748j++;
                    aVar2.f3755e.setValue(Boolean.FALSE);
                } else {
                    LayoutNode layoutNode2 = this.f3739a;
                    layoutNode2.f3827l = true;
                    this.f3743e.remove(layoutNode);
                    C1320f fVar = aVar2.f3753c;
                    if (fVar != null) {
                        fVar.dispose();
                    }
                    this.f3739a.mo6751P(i2, 1);
                    layoutNode2.f3827l = false;
                }
                this.f3744f.remove(obj3);
                i2--;
            }
        }
        mo6719b();
    }

    /* renamed from: b */
    public final void mo6719b() {
        boolean z = true;
        if (this.f3743e.size() == ((C7734e.C7735a) this.f3739a.mo6765v()).f17158b.f17157d) {
            if ((((C7734e.C7735a) this.f3739a.mo6765v()).f17158b.f17157d - this.f3748j) - this.f3749k >= 0) {
                if (this.f3746h.size() != this.f3749k) {
                    z = false;
                }
                if (!z) {
                    StringBuilder h = C0072d.m201h("Incorrect state. Precomposed children ");
                    h.append(this.f3749k);
                    h.append(". Map size ");
                    h.append(this.f3746h.size());
                    throw new IllegalArgumentException(h.toString().toString());
                }
                return;
            }
            StringBuilder h2 = C0072d.m201h("Incorrect state. Total children ");
            h2.append(((C7734e.C7735a) this.f3739a.mo6765v()).f17158b.f17157d);
            h2.append(". Reusable children ");
            h2.append(this.f3748j);
            h2.append(". Precomposed children ");
            h2.append(this.f3749k);
            throw new IllegalArgumentException(h2.toString().toString());
        }
        StringBuilder h3 = C0072d.m201h("Inconsistency between the count of nodes tracked by the state (");
        h3.append(this.f3743e.size());
        h3.append(") and the children count on the SubcomposeLayout (");
        throw new IllegalArgumentException(C0071c.m191c(h3, ((C7734e.C7735a) this.f3739a.mo6765v()).f17158b.f17157d, "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
    }

    /* renamed from: c */
    public final void mo6720c(LayoutNode layoutNode, Object obj, C19861p<? super C1302d, ? super Integer, C19394m> pVar) {
        C1385f i;
        LinkedHashMap linkedHashMap = this.f3743e;
        Object obj2 = linkedHashMap.get(layoutNode);
        if (obj2 == null) {
            obj2 = new C1705a(obj, ComposableSingletons$SubcomposeLayoutKt.f3697a);
            linkedHashMap.put(layoutNode, obj2);
        }
        C1705a aVar = (C1705a) obj2;
        C1320f fVar = aVar.f3753c;
        boolean n = fVar != null ? fVar.mo5797n() : true;
        if (aVar.f3752b != pVar || n || aVar.f3754d) {
            C19383o.m32797g(pVar, "<set-?>");
            aVar.f3752b = pVar;
            C1385f g = SnapshotKt.m2908g((C1385f) SnapshotKt.f2988b.mo5886c(), (C19857l<Object, C19394m>) null, false);
            try {
                i = g.mo6001i();
                LayoutNode layoutNode2 = this.f3739a;
                layoutNode2.f3827l = true;
                C19861p<? super C1302d, ? super Integer, C19394m> pVar2 = aVar.f3752b;
                C1320f fVar2 = aVar.f3753c;
                C1324g gVar = this.f3740b;
                if (gVar != null) {
                    ComposableLambdaImpl B = C18263b.m30807B(new LayoutNodeSubcompositionsState$subcompose$2$1$1(aVar, pVar2), -34810602, true);
                    if (fVar2 == null || fVar2.isDisposed()) {
                        ViewGroup.LayoutParams layoutParams = C1886w1.f4166a;
                        fVar2 = C1337j.m2819a(new C1757v(layoutNode), gVar);
                    }
                    fVar2.mo5795f(B);
                    aVar.f3753c = fVar2;
                    layoutNode2.f3827l = false;
                    C19394m mVar = C19394m.f43287a;
                    C1385f.m2974o(i);
                    g.mo5930c();
                    aVar.f3754d = false;
                    return;
                }
                throw new IllegalStateException("parent composition reference not set".toString());
            } catch (Throwable th) {
                g.mo5930c();
                throw th;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: androidx.compose.ui.node.LayoutNode} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p015ui.node.LayoutNode mo6721d(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.f3748j
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            androidx.compose.ui.node.LayoutNode r0 = r9.f3739a
            java.util.List r0 = r0.mo6765v()
            r.e$a r0 = (p219r.C7734e.C7735a) r0
            r.e<T> r0 = r0.f17158b
            int r0 = r0.f17157d
            int r2 = r9.f3749k
            int r0 = r0 - r2
            int r2 = r9.f3748j
            int r2 = r0 - r2
            r3 = 1
            int r0 = r0 - r3
            r4 = r0
        L_0x001c:
            r5 = -1
            if (r4 < r2) goto L_0x0045
            androidx.compose.ui.node.LayoutNode r6 = r9.f3739a
            java.util.List r6 = r6.mo6765v()
            r.e$a r6 = (p219r.C7734e.C7735a) r6
            java.lang.Object r6 = r6.get(r4)
            androidx.compose.ui.node.LayoutNode r6 = (androidx.compose.p015ui.node.LayoutNode) r6
            java.util.LinkedHashMap r7 = r9.f3743e
            java.lang.Object r6 = r7.get(r6)
            kotlin.jvm.internal.C19383o.m32794d(r6)
            androidx.compose.ui.layout.r$a r6 = (androidx.compose.p015ui.layout.C1704r.C1705a) r6
            java.lang.Object r6 = r6.f3751a
            boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r6, r10)
            if (r6 == 0) goto L_0x0042
            r6 = r4
            goto L_0x0046
        L_0x0042:
            int r4 = r4 + -1
            goto L_0x001c
        L_0x0045:
            r6 = r5
        L_0x0046:
            if (r6 != r5) goto L_0x0076
        L_0x0048:
            if (r0 < r2) goto L_0x0075
            androidx.compose.ui.node.LayoutNode r4 = r9.f3739a
            java.util.List r4 = r4.mo6765v()
            r.e$a r4 = (p219r.C7734e.C7735a) r4
            java.lang.Object r4 = r4.get(r0)
            androidx.compose.ui.node.LayoutNode r4 = (androidx.compose.p015ui.node.LayoutNode) r4
            java.util.LinkedHashMap r7 = r9.f3743e
            java.lang.Object r4 = r7.get(r4)
            kotlin.jvm.internal.C19383o.m32794d(r4)
            androidx.compose.ui.layout.r$a r4 = (androidx.compose.p015ui.layout.C1704r.C1705a) r4
            androidx.compose.ui.layout.n0 r7 = r9.f3741c
            java.lang.Object r8 = r4.f3751a
            boolean r7 = r7.mo18g(r10, r8)
            if (r7 == 0) goto L_0x0072
            r4.f3751a = r10
            r4 = r0
            r6 = r4
            goto L_0x0076
        L_0x0072:
            int r0 = r0 + -1
            goto L_0x0048
        L_0x0075:
            r4 = r0
        L_0x0076:
            if (r6 != r5) goto L_0x0079
            goto L_0x00c9
        L_0x0079:
            r10 = 0
            if (r4 == r2) goto L_0x0085
            androidx.compose.ui.node.LayoutNode r0 = r9.f3739a
            r0.f3827l = r3
            r0.mo6746K(r4, r2, r3)
            r0.f3827l = r10
        L_0x0085:
            int r0 = r9.f3748j
            int r0 = r0 + r5
            r9.f3748j = r0
            androidx.compose.ui.node.LayoutNode r0 = r9.f3739a
            java.util.List r0 = r0.mo6765v()
            r.e$a r0 = (p219r.C7734e.C7735a) r0
            java.lang.Object r0 = r0.get(r2)
            r1 = r0
            androidx.compose.ui.node.LayoutNode r1 = (androidx.compose.p015ui.node.LayoutNode) r1
            java.util.LinkedHashMap r0 = r9.f3743e
            java.lang.Object r0 = r0.get(r1)
            kotlin.jvm.internal.C19383o.m32794d(r0)
            androidx.compose.ui.layout.r$a r0 = (androidx.compose.p015ui.layout.C1704r.C1705a) r0
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = r0.f3755e
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.setValue(r2)
            java.lang.Object r0 = androidx.compose.runtime.snapshots.SnapshotKt.f2989c
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference<androidx.compose.runtime.snapshots.GlobalSnapshot> r2 = androidx.compose.runtime.snapshots.SnapshotKt.f2995i     // Catch:{ all -> 0x00ca }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x00ca }
            androidx.compose.runtime.snapshots.GlobalSnapshot r2 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r2     // Catch:{ all -> 0x00ca }
            java.util.Set<androidx.compose.runtime.snapshots.w> r2 = r2.f3012g     // Catch:{ all -> 0x00ca }
            if (r2 == 0) goto L_0x00c2
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x00ca }
            r2 = r2 ^ r3
            if (r2 != r3) goto L_0x00c2
            goto L_0x00c3
        L_0x00c2:
            r3 = r10
        L_0x00c3:
            monitor-exit(r0)
            if (r3 == 0) goto L_0x00c9
            androidx.compose.runtime.snapshots.SnapshotKt.m2902a()
        L_0x00c9:
            return r1
        L_0x00ca:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.layout.C1704r.mo6721d(java.lang.Object):androidx.compose.ui.node.LayoutNode");
    }
}
