package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.C1011g;
import androidx.compose.p015ui.focus.C1478l;
import androidx.compose.p015ui.layout.C1689j;
import androidx.compose.p015ui.platform.C1822c1;
import androidx.compose.p015ui.platform.C1827e0;
import androidx.compose.p015ui.platform.TextToolbarStatus;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p020b0.C3449a;
import p288y.C8343c;
import p288y.C8345d;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19862q;
import p753kq.C19864s;

public final class SelectionManager {

    /* renamed from: a */
    public final C1020n f2065a;

    /* renamed from: b */
    public final ParcelableSnapshotMutableState f2066b = C0761x.m1751w0((Object) null, C1351n1.f2948a);

    /* renamed from: c */
    public C19857l<? super C1011g, C19394m> f2067c = SelectionManager$onSelectionChange$1.INSTANCE;

    /* renamed from: d */
    public C3449a f2068d;

    /* renamed from: e */
    public C1827e0 f2069e;

    /* renamed from: f */
    public C1822c1 f2070f;

    /* renamed from: g */
    public C1478l f2071g = new C1478l();

    /* renamed from: h */
    public final ParcelableSnapshotMutableState f2072h = C0761x.m1751w0(Boolean.FALSE, C1351n1.f2948a);

    /* renamed from: i */
    public C8343c f2073i;

    /* renamed from: j */
    public C1689j f2074j;

    /* renamed from: k */
    public final ParcelableSnapshotMutableState f2075k;

    /* renamed from: l */
    public final ParcelableSnapshotMutableState f2076l;

    /* renamed from: m */
    public final ParcelableSnapshotMutableState f2077m;

    /* renamed from: n */
    public final ParcelableSnapshotMutableState f2078n;

    /* renamed from: o */
    public final ParcelableSnapshotMutableState f2079o;

    /* renamed from: p */
    public final ParcelableSnapshotMutableState f2080p;

    public SelectionManager(C1020n nVar) {
        C19383o.m32797g(nVar, "selectionRegistrar");
        this.f2065a = nVar;
        long j = C8343c.f18295b;
        this.f2075k = C0761x.m1751w0(new C8343c(j), C1351n1.f2948a);
        this.f2076l = C0761x.m1751w0(new C8343c(j), C1351n1.f2948a);
        this.f2077m = C0761x.m1751w0((Object) null, C1351n1.f2948a);
        this.f2078n = C0761x.m1751w0((Object) null, C1351n1.f2948a);
        this.f2079o = C0761x.m1751w0((Object) null, C1351n1.f2948a);
        this.f2080p = C0761x.m1751w0((Object) null, C1351n1.f2948a);
        nVar.f2140e = new C19857l<Long, C19394m>(this) {
            public final /* synthetic */ SelectionManager this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return C19394m.f43287a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
                r0 = r0.f2121a;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void invoke(long r6) {
                /*
                    r5 = this;
                    androidx.compose.foundation.text.selection.SelectionManager r0 = r5.this$0
                    androidx.compose.foundation.text.selection.g r0 = r0.mo4612d()
                    r1 = 1
                    r2 = 0
                    if (r0 == 0) goto L_0x0016
                    androidx.compose.foundation.text.selection.g$a r0 = r0.f2121a
                    if (r0 == 0) goto L_0x0016
                    long r3 = r0.f2126c
                    int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                    if (r0 != 0) goto L_0x0016
                    r0 = r1
                    goto L_0x0017
                L_0x0016:
                    r0 = r2
                L_0x0017:
                    if (r0 != 0) goto L_0x002f
                    androidx.compose.foundation.text.selection.SelectionManager r0 = r5.this$0
                    androidx.compose.foundation.text.selection.g r0 = r0.mo4612d()
                    if (r0 == 0) goto L_0x002c
                    androidx.compose.foundation.text.selection.g$a r0 = r0.f2122b
                    if (r0 == 0) goto L_0x002c
                    long r3 = r0.f2126c
                    int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                    if (r6 != 0) goto L_0x002c
                    goto L_0x002d
                L_0x002c:
                    r1 = r2
                L_0x002d:
                    if (r1 == 0) goto L_0x004d
                L_0x002f:
                    androidx.compose.foundation.text.selection.SelectionManager r6 = r5.this$0
                    r6.mo4619k()
                    androidx.compose.foundation.text.selection.SelectionManager r6 = r5.this$0
                    boolean r7 = r6.mo4611c()
                    if (r7 == 0) goto L_0x004d
                    androidx.compose.ui.platform.c1 r7 = r6.f2070f
                    if (r7 == 0) goto L_0x0045
                    androidx.compose.ui.platform.TextToolbarStatus r7 = r7.getStatus()
                    goto L_0x0046
                L_0x0045:
                    r7 = 0
                L_0x0046:
                    androidx.compose.ui.platform.TextToolbarStatus r0 = androidx.compose.p015ui.platform.TextToolbarStatus.Shown
                    if (r7 != r0) goto L_0x004d
                    r6.mo4618j()
                L_0x004d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionManager.C09801.invoke(long):void");
            }
        };
        nVar.f2141f = new C19862q<C1689j, C8343c, SelectionAdjustment, C19394m>(this) {
            public final /* synthetic */ SelectionManager this$0;

            {
                this.this$0 = r1;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                m34722invoked4ec7I((C1689j) obj, ((C8343c) obj2).f18299a, (SelectionAdjustment) obj3);
                return C19394m.f43287a;
            }

            /* renamed from: invoke-d-4ec7I  reason: not valid java name */
            public final void m34722invoked4ec7I(C1689j jVar, long j, SelectionAdjustment selectionAdjustment) {
                C19383o.m32797g(jVar, "layoutCoordinates");
                C19383o.m32797g(selectionAdjustment, "selectionMode");
                C8343c a = this.this$0.mo4609a(jVar, j);
                if (a != null) {
                    SelectionManager selectionManager = this.this$0;
                    long j2 = a.f18299a;
                    selectionManager.mo4620l(j2, j2, (C8343c) null, false, selectionAdjustment);
                    this.this$0.f2071g.mo6218a();
                    this.this$0.mo4613e();
                }
            }
        };
        nVar.f2142g = new C19857l<Long, C19394m>(this) {
            public final /* synthetic */ SelectionManager this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return C19394m.f43287a;
            }

            public final void invoke(long j) {
                C3449a aVar;
                SelectionManager selectionManager = this.this$0;
                C1011g d = selectionManager.mo4612d();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ArrayList k = selectionManager.f2065a.mo4723k(selectionManager.mo4615g());
                int size = k.size();
                C1011g gVar = null;
                for (int i = 0; i < size; i++) {
                    C1010f fVar = (C1010f) k.get(i);
                    C1011g f = fVar.mo4699e() == j ? fVar.mo4700f() : null;
                    if (f != null) {
                        linkedHashMap.put(Long.valueOf(fVar.mo4699e()), f);
                    }
                    gVar = C1016k.m2110c(gVar, f);
                }
                if (!C19383o.m32792b(gVar, d) && (aVar = selectionManager.f2068d) != null) {
                    aVar.mo12970a();
                }
                Pair pair = new Pair(gVar, linkedHashMap);
                C1011g gVar2 = (C1011g) pair.component1();
                Map map = (Map) pair.component2();
                if (!C19383o.m32792b(gVar2, this.this$0.mo4612d())) {
                    C1020n nVar = this.this$0.f2065a;
                    nVar.getClass();
                    C19383o.m32797g(map, "<set-?>");
                    nVar.f2147l.setValue(map);
                    this.this$0.f2067c.invoke(gVar2);
                }
                this.this$0.f2071g.mo6218a();
                this.this$0.mo4613e();
            }
        };
        nVar.f2143h = new C19864s<C1689j, C8343c, C8343c, Boolean, SelectionAdjustment, Boolean>(this) {
            public final /* synthetic */ SelectionManager this$0;

            {
                this.this$0 = r1;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return m34723invoke5iVPX68((C1689j) obj, ((C8343c) obj2).f18299a, ((C8343c) obj3).f18299a, ((Boolean) obj4).booleanValue(), (SelectionAdjustment) obj5);
            }

            /* renamed from: invoke-5iVPX68  reason: not valid java name */
            public final Boolean m34723invoke5iVPX68(C1689j jVar, long j, long j2, boolean z, SelectionAdjustment selectionAdjustment) {
                C19383o.m32797g(jVar, "layoutCoordinates");
                C19383o.m32797g(selectionAdjustment, "selectionMode");
                return Boolean.valueOf(this.this$0.mo4621m(this.this$0.mo4609a(jVar, j), this.this$0.mo4609a(jVar, j2), z, selectionAdjustment));
            }
        };
        nVar.f2144i = new C19846a<C19394m>(this) {
            public final /* synthetic */ SelectionManager this$0;

            {
                this.this$0 = r1;
            }

            public final void invoke() {
                this.this$0.mo4618j();
                this.this$0.mo4617i((Handle) null);
                this.this$0.mo4616h((C8343c) null);
            }
        };
        nVar.f2145j = new C19857l<Long, C19394m>(this) {
            public final /* synthetic */ SelectionManager this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return C19394m.f43287a;
            }

            public final void invoke(long j) {
                if (this.this$0.f2065a.mo4713b().containsKey(Long.valueOf(j))) {
                    this.this$0.mo4614f();
                    this.this$0.f2066b.setValue(null);
                }
            }
        };
        nVar.f2146k = new C19857l<Long, C19394m>(this) {
            public final /* synthetic */ SelectionManager this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return C19394m.f43287a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
                r0 = r0.f2121a;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void invoke(long r6) {
                /*
                    r5 = this;
                    androidx.compose.foundation.text.selection.SelectionManager r0 = r5.this$0
                    androidx.compose.foundation.text.selection.g r0 = r0.mo4612d()
                    r1 = 1
                    r2 = 0
                    if (r0 == 0) goto L_0x0016
                    androidx.compose.foundation.text.selection.g$a r0 = r0.f2121a
                    if (r0 == 0) goto L_0x0016
                    long r3 = r0.f2126c
                    int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                    if (r0 != 0) goto L_0x0016
                    r0 = r1
                    goto L_0x0017
                L_0x0016:
                    r0 = r2
                L_0x0017:
                    if (r0 != 0) goto L_0x002f
                    androidx.compose.foundation.text.selection.SelectionManager r0 = r5.this$0
                    androidx.compose.foundation.text.selection.g r0 = r0.mo4612d()
                    if (r0 == 0) goto L_0x002c
                    androidx.compose.foundation.text.selection.g$a r0 = r0.f2122b
                    if (r0 == 0) goto L_0x002c
                    long r3 = r0.f2126c
                    int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                    if (r6 != 0) goto L_0x002c
                    goto L_0x002d
                L_0x002c:
                    r1 = r2
                L_0x002d:
                    if (r1 == 0) goto L_0x003e
                L_0x002f:
                    androidx.compose.foundation.text.selection.SelectionManager r6 = r5.this$0
                    r7 = 0
                    androidx.compose.runtime.ParcelableSnapshotMutableState r6 = r6.f2077m
                    r6.setValue(r7)
                    androidx.compose.foundation.text.selection.SelectionManager r6 = r5.this$0
                    androidx.compose.runtime.ParcelableSnapshotMutableState r6 = r6.f2078n
                    r6.setValue(r7)
                L_0x003e:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionManager.C09867.invoke(long):void");
            }
        };
    }

    /* renamed from: a */
    public final C8343c mo4609a(C1689j jVar, long j) {
        C1689j jVar2 = this.f2074j;
        if (jVar2 == null || !jVar2.mo6685c()) {
            return null;
        }
        return new C8343c(mo4615g().mo6686m(jVar, j));
    }

    /* renamed from: b */
    public final C1010f mo4610b(C1011g.C1012a aVar) {
        C19383o.m32797g(aVar, "anchor");
        return (C1010f) this.f2065a.f2138c.get(Long.valueOf(aVar.f2126c));
    }

    /* renamed from: c */
    public final boolean mo4611c() {
        return ((Boolean) this.f2072h.getValue()).booleanValue();
    }

    /* renamed from: d */
    public final C1011g mo4612d() {
        return (C1011g) this.f2066b.getValue();
    }

    /* renamed from: e */
    public final void mo4613e() {
        C1822c1 c1Var;
        if (mo4611c()) {
            C1822c1 c1Var2 = this.f2070f;
            if ((c1Var2 != null ? c1Var2.getStatus() : null) == TextToolbarStatus.Shown && (c1Var = this.f2070f) != null) {
                c1Var.mo7106b();
            }
        }
    }

    /* renamed from: f */
    public final void mo4614f() {
        C1020n nVar = this.f2065a;
        Map p0 = C19294b0.m32559p0();
        nVar.getClass();
        nVar.f2147l.setValue(p0);
        mo4613e();
        if (mo4612d() != null) {
            this.f2067c.invoke(null);
            C3449a aVar = this.f2068d;
            if (aVar != null) {
                aVar.mo12970a();
            }
        }
    }

    /* renamed from: g */
    public final C1689j mo4615g() {
        C1689j jVar = this.f2074j;
        if (!(jVar != null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (jVar.mo6685c()) {
            return jVar;
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: h */
    public final void mo4616h(C8343c cVar) {
        this.f2080p.setValue(cVar);
    }

    /* renamed from: i */
    public final void mo4617i(Handle handle) {
        this.f2079o.setValue(handle);
    }

    /* renamed from: j */
    public final void mo4618j() {
        C1822c1 c1Var;
        C1822c1 c1Var2;
        C8345d dVar;
        C8345d dVar2;
        C1689j c;
        C1689j c2;
        if (mo4611c() && mo4612d() != null && (c1Var = this.f2070f) != null) {
            C1011g d = mo4612d();
            if (d == null) {
                dVar = C8345d.f18300e;
                c1Var2 = c1Var;
            } else {
                C1010f b = mo4610b(d.f2121a);
                C1010f b2 = mo4610b(d.f2122b);
                if (b == null || (c = b.mo4697c()) == null) {
                    c1Var2 = c1Var;
                    dVar2 = C8345d.f18300e;
                } else if (b2 == null || (c2 = b2.mo4697c()) == null) {
                    c1Var2 = c1Var;
                    dVar2 = C8345d.f18300e;
                } else {
                    C1689j jVar = this.f2074j;
                    if (jVar == null || !jVar.mo6685c()) {
                        c1Var2 = c1Var;
                        dVar2 = C8345d.f18300e;
                    } else {
                        long m = jVar.mo6686m(c, b.mo4698d(d, true));
                        long m2 = jVar.mo6686m(c2, b2.mo4698d(d, false));
                        long P = jVar.mo6683P(m);
                        long P2 = jVar.mo6683P(m2);
                        float min = Math.min(C8343c.m16642c(P), C8343c.m16642c(P2));
                        float max = Math.max(C8343c.m16642c(P), C8343c.m16642c(P2));
                        c1Var2 = c1Var;
                        long m3 = jVar.mo6686m(c, C19421p.m32952q(0.0f, b.mo4695a(d.f2121a.f2125b).f18302b));
                        long m4 = jVar.mo6686m(c2, C19421p.m32952q(0.0f, b2.mo4695a(d.f2122b.f2125b).f18302b));
                        dVar = new C8345d(min, Math.min(C8343c.m16643d(jVar.mo6683P(m3)), C8343c.m16643d(jVar.mo6683P(m4))), max, Math.max(C8343c.m16643d(P), C8343c.m16643d(P2)) + ((float) (((double) C1014i.f2130b) * 4.0d)));
                    }
                }
                dVar = dVar2;
            }
            c1Var2.mo7105a(dVar, new SelectionManager$showSelectionToolbar$1$1(this), (C19846a<C19394m>) null, (C19846a<C19394m>) null, (C19846a<C19394m>) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r3 = r0.f2121a;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4619k() {
        /*
            r9 = this;
            androidx.compose.foundation.text.selection.g r0 = r9.mo4612d()
            androidx.compose.ui.layout.j r1 = r9.f2074j
            r2 = 0
            if (r0 == 0) goto L_0x0012
            androidx.compose.foundation.text.selection.g$a r3 = r0.f2121a
            if (r3 == 0) goto L_0x0012
            androidx.compose.foundation.text.selection.f r3 = r9.mo4610b(r3)
            goto L_0x0013
        L_0x0012:
            r3 = r2
        L_0x0013:
            if (r0 == 0) goto L_0x001e
            androidx.compose.foundation.text.selection.g$a r4 = r0.f2122b
            if (r4 == 0) goto L_0x001e
            androidx.compose.foundation.text.selection.f r4 = r9.mo4610b(r4)
            goto L_0x001f
        L_0x001e:
            r4 = r2
        L_0x001f:
            if (r3 == 0) goto L_0x0026
            androidx.compose.ui.layout.j r5 = r3.mo4697c()
            goto L_0x0027
        L_0x0026:
            r5 = r2
        L_0x0027:
            if (r4 == 0) goto L_0x002e
            androidx.compose.ui.layout.j r6 = r4.mo4697c()
            goto L_0x002f
        L_0x002e:
            r6 = r2
        L_0x002f:
            if (r0 == 0) goto L_0x0077
            if (r1 == 0) goto L_0x0077
            boolean r7 = r1.mo6685c()
            if (r7 == 0) goto L_0x0077
            if (r5 == 0) goto L_0x0077
            if (r6 != 0) goto L_0x003e
            goto L_0x0077
        L_0x003e:
            r7 = 1
            long r7 = r3.mo4698d(r0, r7)
            long r7 = r1.mo6686m(r5, r7)
            r3 = 0
            long r3 = r4.mo4698d(r0, r3)
            long r3 = r1.mo6686m(r6, r3)
            y.d r0 = androidx.compose.foundation.text.selection.C1016k.m2111d(r1)
            boolean r1 = androidx.compose.foundation.text.selection.C1016k.m2109b(r7, r0)
            if (r1 == 0) goto L_0x0060
            y.c r1 = new y.c
            r1.<init>(r7)
            goto L_0x0061
        L_0x0060:
            r1 = r2
        L_0x0061:
            androidx.compose.runtime.ParcelableSnapshotMutableState r5 = r9.f2077m
            r5.setValue(r1)
            boolean r0 = androidx.compose.foundation.text.selection.C1016k.m2109b(r3, r0)
            if (r0 == 0) goto L_0x0071
            y.c r2 = new y.c
            r2.<init>(r3)
        L_0x0071:
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = r9.f2078n
            r0.setValue(r2)
            return
        L_0x0077:
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = r9.f2077m
            r0.setValue(r2)
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = r9.f2078n
            r0.setValue(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionManager.mo4619k():void");
    }

    /* renamed from: l */
    public final boolean mo4620l(long j, long j2, C8343c cVar, boolean z, SelectionAdjustment selectionAdjustment) {
        C8343c cVar2;
        C19383o.m32797g(selectionAdjustment, "adjustment");
        mo4617i(z ? Handle.SelectionStart : Handle.SelectionEnd);
        if (z) {
            cVar2 = new C8343c(j);
            long j3 = j2;
        } else {
            long j4 = j;
            cVar2 = new C8343c(j2);
        }
        mo4616h(cVar2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList k = this.f2065a.mo4723k(mo4615g());
        int size = k.size();
        C1011g gVar = null;
        int i = 0;
        boolean z2 = false;
        while (i < size) {
            C1010f fVar = (C1010f) k.get(i);
            int i2 = i;
            C1011g gVar2 = gVar;
            int i3 = size;
            ArrayList arrayList = k;
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            Pair<C1011g, Boolean> b = fVar.mo4696b(j, j2, cVar, z, mo4615g(), selectionAdjustment, this.f2065a.mo4713b().get(Long.valueOf(fVar.mo4699e())));
            C1011g component1 = b.component1();
            z2 = z2 || b.component2().booleanValue();
            if (component1 != null) {
                linkedHashMap2.put(Long.valueOf(fVar.mo4699e()), component1);
            }
            gVar = C1016k.m2110c(gVar2, component1);
            i = i2 + 1;
            SelectionAdjustment selectionAdjustment2 = selectionAdjustment;
            linkedHashMap = linkedHashMap2;
            k = arrayList;
            size = i3;
            long j5 = j;
        }
        C1011g gVar3 = gVar;
        LinkedHashMap linkedHashMap3 = linkedHashMap;
        if (!C19383o.m32792b(gVar3, mo4612d())) {
            C3449a aVar = this.f2068d;
            if (aVar != null) {
                aVar.mo12970a();
            }
            C1020n nVar = this.f2065a;
            nVar.getClass();
            nVar.f2147l.setValue(linkedHashMap3);
            this.f2067c.invoke(gVar3);
        }
        return z2;
    }

    /* renamed from: m */
    public final boolean mo4621m(C8343c cVar, C8343c cVar2, boolean z, SelectionAdjustment selectionAdjustment) {
        C1011g d;
        C8343c cVar3;
        C19383o.m32797g(selectionAdjustment, "adjustment");
        if (!(cVar == null || (d = mo4612d()) == null)) {
            C1010f fVar = (C1010f) this.f2065a.f2138c.get(Long.valueOf(z ? d.f2122b.f2126c : d.f2121a.f2126c));
            if (fVar == null) {
                cVar3 = null;
            } else {
                C1689j c = fVar.mo4697c();
                C19383o.m32794d(c);
                cVar3 = mo4609a(c, C1014i.m2103a(fVar.mo4698d(d, !z)));
            }
            if (cVar3 != null) {
                long j = cVar3.f18299a;
                return mo4620l(z ? cVar.f18299a : j, z ? j : cVar.f18299a, cVar2, z, selectionAdjustment);
            }
        }
        return false;
    }
}
