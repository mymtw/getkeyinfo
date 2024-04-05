package p247t8;

import androidx.preference.C3039b;
import com.cardinalcommerce.shared.p065cs.p069e.C6272b;
import com.cardinalcommerce.shared.p065cs.p069e.C6276i;
import p257u8.C8171a;

/* renamed from: t8.c */
public final class C8045c {

    /* renamed from: a */
    public C6272b f17541a;

    /* renamed from: b */
    public C6276i f17542b = new C6276i();

    /* renamed from: c */
    public char[] f17543c;

    /* renamed from: d */
    public char[] f17544d;

    /* renamed from: e */
    public char[] f17545e;

    /* renamed from: f */
    public char[] f17546f;

    /* renamed from: g */
    public char[] f17547g;

    /* renamed from: h */
    public char[] f17548h;

    /* renamed from: i */
    public char[] f17549i;

    /* renamed from: j */
    public boolean f17550j;

    /* renamed from: k */
    public char[] f17551k;

    /* renamed from: l */
    public char[] f17552l;

    /* renamed from: m */
    public char[] f17553m;

    /* renamed from: n */
    public char[] f17554n;

    /* renamed from: o */
    public char[] f17555o;

    /* renamed from: p */
    public char[] f17556p;

    /* renamed from: q */
    public char[] f17557q;

    /* renamed from: r */
    public char[] f17558r;

    public C8045c(C6272b bVar, C8046d dVar) {
        this.f17541a = bVar;
        this.f17543c = C3039b.m7190y(bVar.mo17770a());
        this.f17544d = C3039b.m7190y(bVar.mo17771b());
        this.f17552l = C3039b.m7190y(bVar.mo17790u());
        this.f17548h = C3039b.m7190y("CReq");
        this.f17549i = C3039b.m7190y(bVar.mo17786q());
        if (!C3039b.m7186u(dVar.f17559a)) {
            this.f17545e = dVar.f17559a;
        } else {
            boolean z = false;
            if (!C3039b.m7186u(dVar.f17560b)) {
                char[] cArr = dVar.f17560b;
                if (cArr.length <= 45) {
                    this.f17546f = cArr;
                } else {
                    this.f17542b.mo17804a(false, "challengeDataEntry");
                }
            } else if (!C3039b.m7186u(dVar.f17561c)) {
                char[] cArr2 = dVar.f17561c;
                if (cArr2.length <= 256) {
                    this.f17547g = cArr2;
                } else {
                    this.f17542b.mo17804a(false, "challengeHTMLDataEntry");
                }
            } else if (!C3039b.m7186u(dVar.f17563e)) {
                this.f17551k = dVar.f17563e;
            } else if (bVar.mo17786q().equalsIgnoreCase("2.2.0")) {
                if (!this.f17541a.mo17774e().equals("05") && !this.f17541a.mo17774e().equals("04")) {
                    z = true;
                }
                if (z) {
                    this.f17555o = C8171a.f17930c;
                }
            }
        }
        char[] cArr3 = dVar.f17564f;
        if (cArr3 != null && !C3039b.m7186u(cArr3)) {
            this.f17553m = dVar.f17564f;
        }
        if (dVar.f17562d) {
            this.f17550j = true;
        }
    }
}
