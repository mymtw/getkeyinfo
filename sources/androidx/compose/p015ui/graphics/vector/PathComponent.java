package androidx.compose.p015ui.graphics.vector;

import androidx.compose.p015ui.graphics.C1492b0;
import androidx.compose.p015ui.graphics.C1515d0;
import androidx.compose.p015ui.graphics.C1521g;
import androidx.compose.p015ui.graphics.C1533m;
import java.util.List;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.C19383o;
import p297z.C8412e;
import p297z.C8416i;
import p628nj.C18263b;

/* renamed from: androidx.compose.ui.graphics.vector.PathComponent */
public final class PathComponent extends C1578f {

    /* renamed from: b */
    public C1533m f3370b;

    /* renamed from: c */
    public float f3371c = 1.0f;

    /* renamed from: d */
    public List<? extends C1556d> f3372d = C1583j.f3538a;

    /* renamed from: e */
    public float f3373e = 1.0f;

    /* renamed from: f */
    public float f3374f;

    /* renamed from: g */
    public C1533m f3375g;

    /* renamed from: h */
    public int f3376h = 0;

    /* renamed from: i */
    public int f3377i = 0;

    /* renamed from: j */
    public float f3378j = 4.0f;

    /* renamed from: k */
    public float f3379k;

    /* renamed from: l */
    public float f3380l = 1.0f;

    /* renamed from: m */
    public float f3381m;

    /* renamed from: n */
    public boolean f3382n = true;

    /* renamed from: o */
    public boolean f3383o = true;

    /* renamed from: p */
    public boolean f3384p = true;

    /* renamed from: q */
    public C8416i f3385q;

    /* renamed from: r */
    public final C1521g f3386r = C18263b.m30838d();

    /* renamed from: s */
    public final C1521g f3387s = C18263b.m30838d();

    /* renamed from: t */
    public final C19285c f3388t = C19350d.m32676a(LazyThreadSafetyMode.NONE, PathComponent$pathMeasure$2.INSTANCE);

    /* renamed from: u */
    public final C1576e f3389u = new C1576e();

    /* renamed from: a */
    public final void mo6401a(C8412e eVar) {
        C19383o.m32797g(eVar, "<this>");
        if (this.f3382n) {
            this.f3389u.f3519a.clear();
            this.f3386r.reset();
            C1576e eVar2 = this.f3389u;
            List<? extends C1556d> list = this.f3372d;
            eVar2.getClass();
            C19383o.m32797g(list, "nodes");
            eVar2.f3519a.addAll(list);
            eVar2.mo6505c(this.f3386r);
            mo6402e();
        } else if (this.f3384p) {
            mo6402e();
        }
        this.f3382n = false;
        this.f3384p = false;
        C1533m mVar = this.f3370b;
        if (mVar != null) {
            C8412e.m16784J0(eVar, this.f3387s, mVar, this.f3371c, (C8416i) null, 56);
        }
        C1533m mVar2 = this.f3375g;
        if (mVar2 != null) {
            C8416i iVar = this.f3385q;
            if (this.f3383o || iVar == null) {
                iVar = new C8416i(this.f3374f, this.f3378j, this.f3376h, this.f3377i, 16);
                this.f3385q = iVar;
                this.f3383o = false;
            }
            C8412e eVar3 = eVar;
            C8412e.m16784J0(eVar3, this.f3387s, mVar2, this.f3373e, iVar, 48);
        }
    }

    /* renamed from: e */
    public final void mo6402e() {
        this.f3387s.reset();
        boolean z = false;
        if (this.f3379k == 0.0f) {
            if (this.f3380l == 1.0f) {
                z = true;
            }
            if (z) {
                C1492b0.m3195i(this.f3387s, this.f3386r);
                return;
            }
        }
        ((C1515d0) this.f3388t.getValue()).mo6324b(this.f3386r);
        float length = ((C1515d0) this.f3388t.getValue()).getLength();
        float f = this.f3379k;
        float f2 = this.f3381m;
        float f3 = ((f + f2) % 1.0f) * length;
        float f4 = ((this.f3380l + f2) % 1.0f) * length;
        if (f3 > f4) {
            ((C1515d0) this.f3388t.getValue()).mo6323a(f3, length, this.f3387s);
            ((C1515d0) this.f3388t.getValue()).mo6323a(0.0f, f4, this.f3387s);
            return;
        }
        ((C1515d0) this.f3388t.getValue()).mo6323a(f3, f4, this.f3387s);
    }

    public final String toString() {
        return this.f3386r.toString();
    }
}
