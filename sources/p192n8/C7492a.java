package p192n8;

import p154j8.C7155a;
import p257u8.C8172b;
import p257u8.C8174c;

/* renamed from: n8.a */
public final class C7492a extends C8172b {

    /* renamed from: f */
    public static volatile C7492a f16703f;

    public C7492a() {
        if (f16703f != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance.");
        }
    }

    /* renamed from: g */
    public static C7492a m14431g() {
        if (f16703f == null) {
            synchronized (C7492a.class) {
                if (f16703f == null) {
                    f16703f = new C7492a();
                }
            }
        }
        return f16703f;
    }

    /* renamed from: c */
    public final C8174c mo19176c() {
        return super.mo19176c();
    }

    /* renamed from: e */
    public final void mo19178e() {
        super.mo19178e();
    }

    /* renamed from: h */
    public final void mo19848h(String str) {
        if (C8172b.f17937b) {
            C8172b.f17938c = new C7155a().f15921a;
            C8172b.f17939d = "EMVCoLoggerV1";
            mo19175a("EMVCoTransaction", str, (String) null);
        }
    }

    /* renamed from: i */
    public final void mo19849i(String str, String str2) {
        if (C8172b.f17937b) {
            C8172b.f17938c = new C7155a().f15921a;
            C8172b.f17939d = "EMVCoLoggerV1";
            mo19177d(str, str2, (String) null);
        }
    }
}
