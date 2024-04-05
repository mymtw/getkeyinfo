package androidx.compose.p015ui.graphics.vector;

import android.support.p013v4.media.C0072d;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.graphics.C1521g;
import java.util.ArrayList;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p297z.C8406a;
import p297z.C8409b;
import p297z.C8412e;
import p628nj.C18263b;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.graphics.vector.b */
public final class C1552b extends C1578f {

    /* renamed from: b */
    public float[] f3412b;

    /* renamed from: c */
    public final ArrayList f3413c = new ArrayList();

    /* renamed from: d */
    public List<? extends C1556d> f3414d = C1583j.f3538a;

    /* renamed from: e */
    public boolean f3415e = true;

    /* renamed from: f */
    public C1521g f3416f;

    /* renamed from: g */
    public C1576e f3417g;

    /* renamed from: h */
    public C19846a<C19394m> f3418h;

    /* renamed from: i */
    public String f3419i = "";

    /* renamed from: j */
    public float f3420j;

    /* renamed from: k */
    public float f3421k;

    /* renamed from: l */
    public float f3422l;

    /* renamed from: m */
    public float f3423m = 1.0f;

    /* renamed from: n */
    public float f3424n = 1.0f;

    /* renamed from: o */
    public float f3425o;

    /* renamed from: p */
    public float f3426p;

    /* renamed from: q */
    public boolean f3427q = true;

    /* renamed from: a */
    public final void mo6401a(C8412e eVar) {
        C8412e eVar2 = eVar;
        C19383o.m32797g(eVar2, "<this>");
        if (this.f3427q) {
            float[] fArr = this.f3412b;
            if (fArr == null) {
                fArr = C0761x.m1671I();
                this.f3412b = fArr;
            } else {
                C0761x.m1666F0(fArr);
            }
            C0761x.m1702X0(fArr, this.f3421k + this.f3425o, this.f3422l + this.f3426p);
            double d = (((double) this.f3420j) * 3.141592653589793d) / 180.0d;
            float cos = (float) Math.cos(d);
            float sin = (float) Math.sin(d);
            float f = fArr[0];
            float f2 = fArr[4];
            float f3 = (sin * f2) + (cos * f);
            float f4 = -sin;
            float f5 = (f2 * cos) + (f * f4);
            float f6 = fArr[1];
            float f7 = fArr[5];
            float f8 = (sin * f7) + (cos * f6);
            float f9 = (f7 * cos) + (f6 * f4);
            float f10 = fArr[2];
            float f11 = fArr[6];
            float f12 = (sin * f11) + (cos * f10);
            float f13 = (f11 * cos) + (f10 * f4);
            float f14 = fArr[3];
            float f15 = fArr[7];
            float f16 = (sin * f15) + (cos * f14);
            float f17 = (cos * f15) + (f4 * f14);
            fArr[0] = f3;
            fArr[1] = f8;
            fArr[2] = f12;
            fArr[3] = f16;
            fArr[4] = f5;
            fArr[5] = f9;
            fArr[6] = f13;
            fArr[7] = f17;
            float f18 = this.f3423m;
            float f19 = this.f3424n;
            fArr[0] = f3 * f18;
            fArr[1] = f8 * f18;
            fArr[2] = f12 * f18;
            fArr[3] = f16 * f18;
            fArr[4] = f5 * f19;
            fArr[5] = f9 * f19;
            fArr[6] = f13 * f19;
            fArr[7] = f17 * f19;
            fArr[8] = fArr[8] * 1.0f;
            fArr[9] = fArr[9] * 1.0f;
            fArr[10] = fArr[10] * 1.0f;
            fArr[11] = fArr[11] * 1.0f;
            C0761x.m1702X0(fArr, -this.f3421k, -this.f3422l);
            this.f3427q = false;
        }
        if (this.f3415e) {
            if (!this.f3414d.isEmpty()) {
                C1576e eVar3 = this.f3417g;
                if (eVar3 == null) {
                    eVar3 = new C1576e();
                    this.f3417g = eVar3;
                } else {
                    eVar3.f3519a.clear();
                }
                C1521g gVar = this.f3416f;
                if (gVar == null) {
                    gVar = C18263b.m30838d();
                    this.f3416f = gVar;
                } else {
                    gVar.reset();
                }
                List<? extends C1556d> list = this.f3414d;
                C19383o.m32797g(list, "nodes");
                eVar3.f3519a.addAll(list);
                eVar3.mo6505c(gVar);
            }
            this.f3415e = false;
        }
        C8406a.C8408b C0 = eVar.mo6900C0();
        long b = C0.mo20992b();
        C0.mo20991a().mo6264r();
        C8409b bVar = C0.f18430a;
        float[] fArr2 = this.f3412b;
        if (fArr2 != null) {
            bVar.mo20999f(fArr2);
        }
        C1521g gVar2 = this.f3416f;
        if ((!this.f3414d.isEmpty()) && gVar2 != null) {
            bVar.mo20994a(gVar2, 1);
        }
        ArrayList arrayList = this.f3413c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C1578f) arrayList.get(i)).mo6401a(eVar2);
        }
        C0.mo20991a().mo6261m();
        C0.mo20993c(b);
    }

    /* renamed from: b */
    public final C19846a<C19394m> mo6439b() {
        return this.f3418h;
    }

    /* renamed from: d */
    public final void mo6440d(C19846a<C19394m> aVar) {
        this.f3418h = aVar;
        ArrayList arrayList = this.f3413c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C1578f) arrayList.get(i)).mo6440d(aVar);
        }
    }

    /* renamed from: e */
    public final void mo6441e(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (i < this.f3413c.size()) {
                ((C1578f) this.f3413c.get(i)).mo6440d((C19846a<C19394m>) null);
                this.f3413c.remove(i);
            }
        }
        mo6510c();
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("VGroup: ");
        h.append(this.f3419i);
        ArrayList arrayList = this.f3413c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            h.append("\t");
            h.append(((C1578f) arrayList.get(i)).toString());
            h.append("\n");
        }
        String sb = h.toString();
        C19383o.m32796f(sb, "sb.toString()");
        return sb;
    }
}
