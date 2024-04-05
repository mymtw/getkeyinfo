package androidx.compose.p015ui.graphics.vector;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.graphics.C1546t;
import androidx.compose.p015ui.graphics.painter.Painter;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1320f;
import androidx.compose.runtime.C1324g;
import androidx.compose.runtime.C1337j;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.C1415u;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p288y.C8347f;
import p297z.C8406a;
import p297z.C8412e;
import p628nj.C18263b;
import p753kq.C19863r;

/* renamed from: androidx.compose.ui.graphics.vector.VectorPainter */
public final class VectorPainter extends Painter {

    /* renamed from: f */
    public final ParcelableSnapshotMutableState f3399f = C0761x.m1751w0(new C8347f(C8347f.f18313b), C1351n1.f2948a);

    /* renamed from: g */
    public final ParcelableSnapshotMutableState f3400g = C0761x.m1751w0(Boolean.FALSE, C1351n1.f2948a);

    /* renamed from: h */
    public final VectorComponent f3401h;

    /* renamed from: i */
    public C1320f f3402i;

    /* renamed from: j */
    public final ParcelableSnapshotMutableState f3403j;

    /* renamed from: k */
    public float f3404k;

    /* renamed from: l */
    public C1546t f3405l;

    public VectorPainter() {
        VectorComponent vectorComponent = new VectorComponent();
        vectorComponent.f3393e = new VectorPainter$vector$1$1(this);
        this.f3401h = vectorComponent;
        this.f3403j = C0761x.m1751w0(Boolean.TRUE, C1351n1.f2948a);
        this.f3404k = 1.0f;
    }

    /* renamed from: a */
    public final boolean mo6388a(float f) {
        this.f3404k = f;
        return true;
    }

    /* renamed from: b */
    public final boolean mo6389b(C1546t tVar) {
        this.f3405l = tVar;
        return true;
    }

    /* renamed from: c */
    public final long mo6390c() {
        return ((C8347f) this.f3399f.getValue()).f18316a;
    }

    /* renamed from: d */
    public final void mo6391d(C8412e eVar) {
        C19383o.m32797g(eVar, "<this>");
        VectorComponent vectorComponent = this.f3401h;
        C1546t tVar = this.f3405l;
        if (tVar == null) {
            tVar = (C1546t) vectorComponent.f3394f.getValue();
        }
        if (!((Boolean) this.f3400g.getValue()).booleanValue() || eVar.getLayoutDirection() != LayoutDirection.Rtl) {
            vectorComponent.mo6404e(eVar, this.f3404k, tVar);
        } else {
            long K0 = eVar.mo6907K0();
            C8406a.C8408b C0 = eVar.mo6900C0();
            long b = C0.mo20992b();
            C0.mo20991a().mo6264r();
            C0.f18430a.mo20998e(-1.0f, K0, 1.0f);
            vectorComponent.mo6404e(eVar, this.f3404k, tVar);
            C0.mo20991a().mo6261m();
            C0.mo20993c(b);
        }
        if (((Boolean) this.f3403j.getValue()).booleanValue()) {
            this.f3403j.setValue(Boolean.FALSE);
        }
    }

    /* renamed from: e */
    public final void mo6432e(String str, float f, float f2, C19863r<? super Float, ? super Float, ? super C1302d, ? super Integer, C19394m> rVar, C1302d dVar, int i) {
        C19383o.m32797g(str, "name");
        C19383o.m32797g(rVar, ResponseConstants.CONTENT);
        ComposerImpl h = dVar.mo5440h(1264894527);
        VectorComponent vectorComponent = this.f3401h;
        vectorComponent.getClass();
        C1552b bVar = vectorComponent.f3390b;
        bVar.getClass();
        bVar.f3419i = str;
        bVar.mo6510c();
        boolean z = false;
        if (!(vectorComponent.f3395g == f)) {
            vectorComponent.f3395g = f;
            vectorComponent.f3391c = true;
            vectorComponent.f3393e.invoke();
        }
        if (vectorComponent.f3396h == f2) {
            z = true;
        }
        if (!z) {
            vectorComponent.f3396h = f2;
            vectorComponent.f3391c = true;
            vectorComponent.f3393e.invoke();
        }
        C1324g m0 = C0005b.m50m0(h);
        C1320f fVar = this.f3402i;
        if (fVar == null || fVar.isDisposed()) {
            fVar = C1337j.m2819a(new C1579g(this.f3401h.f3390b), m0);
        }
        this.f3402i = fVar;
        fVar.mo5795f(C18263b.m30807B(new VectorPainter$composeVector$1(rVar, this), -1916507005, true));
        C1415u.m3028b(fVar, new VectorPainter$RenderVector$2(fVar), h);
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new VectorPainter$RenderVector$3(this, str, f, f2, rVar, i);
        }
    }
}
