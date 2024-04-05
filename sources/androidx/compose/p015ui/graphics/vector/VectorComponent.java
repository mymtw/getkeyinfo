package androidx.compose.p015ui.graphics.vector;

import android.support.p013v4.media.C0073e;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.graphics.C1491b;
import androidx.compose.p015ui.graphics.C1514d;
import androidx.compose.p015ui.graphics.C1537o;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.graphics.C1546t;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.C19394m;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p174m0.C7282b;
import p174m0.C7290i;
import p288y.C8347f;
import p297z.C8406a;
import p297z.C8412e;
import p297z.C8413f;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.graphics.vector.VectorComponent */
public final class VectorComponent extends C1578f {

    /* renamed from: b */
    public final C1552b f3390b;

    /* renamed from: c */
    public boolean f3391c = true;

    /* renamed from: d */
    public final C1551a f3392d = new C1551a();

    /* renamed from: e */
    public C19846a<C19394m> f3393e = VectorComponent$invalidateCallback$1.INSTANCE;

    /* renamed from: f */
    public final ParcelableSnapshotMutableState f3394f = C0761x.m1751w0((Object) null, C1351n1.f2948a);

    /* renamed from: g */
    public float f3395g;

    /* renamed from: h */
    public float f3396h;

    /* renamed from: i */
    public long f3397i = C8347f.f18314c;

    /* renamed from: j */
    public final C19857l<C8412e, C19394m> f3398j = new VectorComponent$drawVectorBlock$1(this);

    public VectorComponent() {
        C1552b bVar = new C1552b();
        bVar.f3421k = 0.0f;
        bVar.f3427q = true;
        bVar.mo6510c();
        bVar.f3422l = 0.0f;
        bVar.f3427q = true;
        bVar.mo6510c();
        bVar.mo6440d(new VectorComponent$root$1$1(this));
        this.f3390b = bVar;
    }

    /* renamed from: a */
    public final void mo6401a(C8412e eVar) {
        C19383o.m32797g(eVar, "<this>");
        mo6404e(eVar, 1.0f, (C1546t) null);
    }

    /* renamed from: e */
    public final void mo6404e(C8412e eVar, float f, C1546t tVar) {
        boolean z;
        C8412e eVar2 = eVar;
        C19383o.m32797g(eVar2, "<this>");
        C1546t tVar2 = tVar != null ? tVar : (C1546t) this.f3394f.getValue();
        if (this.f3391c || !C8347f.m16653a(this.f3397i, eVar.mo6913b())) {
            C1552b bVar = this.f3390b;
            bVar.f3423m = C8347f.m16656d(eVar.mo6913b()) / this.f3395g;
            bVar.f3427q = true;
            bVar.mo6510c();
            C1552b bVar2 = this.f3390b;
            bVar2.f3424n = C8347f.m16654b(eVar.mo6913b()) / this.f3396h;
            bVar2.f3427q = true;
            bVar2.mo6510c();
            C1551a aVar = this.f3392d;
            long a = C0761x.m1707a((int) ((float) Math.ceil((double) C8347f.m16656d(eVar.mo6913b()))), (int) ((float) Math.ceil((double) C8347f.m16654b(eVar.mo6913b()))));
            LayoutDirection layoutDirection = eVar.getLayoutDirection();
            C19857l<C8412e, C19394m> lVar = this.f3398j;
            aVar.getClass();
            C19383o.m32797g(layoutDirection, "layoutDirection");
            C19383o.m32797g(lVar, "block");
            aVar.f3409c = eVar2;
            C1514d dVar = aVar.f3407a;
            C1491b bVar3 = aVar.f3408b;
            if (dVar == null || bVar3 == null || ((int) (a >> 32)) > dVar.getWidth() || C7290i.m13995b(a) > dVar.getHeight()) {
                dVar = C19421p.m32947n((int) (a >> 32), C7290i.m13995b(a), 0, 28);
                bVar3 = C19382n.m32742d(dVar);
                aVar.f3407a = dVar;
                aVar.f3408b = bVar3;
            }
            aVar.f3410d = a;
            C8406a aVar2 = aVar.f3411e;
            long V0 = C0761x.m1698V0(a);
            C8406a.C8407a aVar3 = aVar2.f18422b;
            C7282b bVar4 = aVar3.f18426a;
            LayoutDirection layoutDirection2 = aVar3.f18427b;
            C1537o oVar = aVar3.f18428c;
            long j = aVar3.f18429d;
            aVar3.f18426a = eVar2;
            aVar3.f18427b = layoutDirection;
            aVar3.f18428c = bVar3;
            aVar3.f18429d = V0;
            bVar3.mo6264r();
            C1537o oVar2 = oVar;
            C8412e.m16785N(aVar2, C1545s.f3357b, 0, 0, 0.0f, 62);
            lVar.invoke(aVar2);
            bVar3.mo6261m();
            C8406a.C8407a aVar4 = aVar2.f18422b;
            aVar4.getClass();
            C19383o.m32797g(bVar4, "<set-?>");
            aVar4.f18426a = bVar4;
            aVar4.mo20987a(layoutDirection2);
            C19383o.m32797g(oVar2, "<set-?>");
            aVar4.f18428c = oVar2;
            aVar4.f18429d = j;
            dVar.mo6319a();
            z = false;
            this.f3391c = false;
            this.f3397i = eVar.mo6913b();
        } else {
            z = false;
        }
        C1551a aVar5 = this.f3392d;
        aVar5.getClass();
        C1514d dVar2 = aVar5.f3407a;
        if (dVar2 != null) {
            z = true;
        }
        if (z) {
            C8412e.m16786S(eVar, dVar2, 0, aVar5.f3410d, 0, 0, f, (C8413f) null, tVar2, 0, 0, 858);
            return;
        }
        throw new IllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination".toString());
    }

    public final String toString() {
        StringBuilder k = C0073e.m211k("Params: ", "\tname: ");
        k.append(this.f3390b.f3419i);
        k.append("\n");
        k.append("\tviewportWidth: ");
        k.append(this.f3395g);
        k.append("\n");
        k.append("\tviewportHeight: ");
        k.append(this.f3396h);
        k.append("\n");
        String sb = k.toString();
        C19383o.m32796f(sb, "StringBuilder().apply(builderAction).toString()");
        return sb;
    }
}
