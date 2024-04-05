package p297z;

import androidx.activity.C0114h;
import androidx.compose.p015ui.graphics.C1521g;
import androidx.compose.p015ui.graphics.C1537o;
import p288y.C8343c;
import p288y.C8347f;

/* renamed from: z.b */
public final class C8409b {

    /* renamed from: a */
    public final /* synthetic */ C8411d f18432a;

    public C8409b(C8411d dVar) {
        this.f18432a = dVar;
    }

    /* renamed from: a */
    public final void mo20994a(C1521g gVar, int i) {
        this.f18432a.mo20991a().mo6259k(gVar, i);
    }

    /* renamed from: b */
    public final void mo20995b(float f, float f2, float f3, float f4, int i) {
        this.f18432a.mo20991a().mo6258j(f, f2, f3, f4, i);
    }

    /* renamed from: c */
    public final void mo20996c(float f, float f2, float f3, float f4) {
        C1537o a = this.f18432a.mo20991a();
        C8411d dVar = this.f18432a;
        long t = C0114h.m319t(C8347f.m16656d(dVar.mo20992b()) - (f3 + f), C8347f.m16654b(this.f18432a.mo20992b()) - (f4 + f2));
        if (C8347f.m16656d(t) >= 0.0f && C8347f.m16654b(t) >= 0.0f) {
            dVar.mo20993c(t);
            a.mo6260l(f, f2);
            return;
        }
        throw new IllegalArgumentException("Width and height must be greater than or equal to zero".toString());
    }

    /* renamed from: d */
    public final void mo20997d(long j) {
        C1537o a = this.f18432a.mo20991a();
        a.mo6260l(C8343c.m16642c(j), C8343c.m16643d(j));
        a.mo6268v();
        a.mo6260l(-C8343c.m16642c(j), -C8343c.m16643d(j));
    }

    /* renamed from: e */
    public final void mo20998e(float f, long j, float f2) {
        C1537o a = this.f18432a.mo20991a();
        a.mo6260l(C8343c.m16642c(j), C8343c.m16643d(j));
        a.mo6251b(f, f2);
        a.mo6260l(-C8343c.m16642c(j), -C8343c.m16643d(j));
    }

    /* renamed from: f */
    public final void mo20999f(float[] fArr) {
        this.f18432a.mo20991a().mo6266t(fArr);
    }

    /* renamed from: g */
    public final void mo21000g(float f, float f2) {
        this.f18432a.mo20991a().mo6260l(f, f2);
    }
}
