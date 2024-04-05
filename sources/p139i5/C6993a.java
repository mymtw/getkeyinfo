package p139i5;

import p103f5.C6787b;
import p103f5.C6789d;
import p257u8.C8171a;
import p257u8.C8172b;
import p257u8.C8174c;
import p257u8.C8176e;

/* renamed from: i5.a */
public final class C6993a extends C8172b {

    /* renamed from: f */
    public static volatile C6993a f15531f;

    public C6993a() {
        if (f15531f == null) {
            C8172b.f17937b = true;
            return;
        }
        throw new RuntimeException("Use getInstance() method to get the single instance.");
    }

    /* renamed from: g */
    public static C6993a m13555g() {
        if (f15531f == null) {
            synchronized (C6993a.class) {
                if (f15531f == null) {
                    f15531f = new C6993a();
                }
            }
        }
        return f15531f;
    }

    /* renamed from: a */
    public final void mo19175a(String str, String str2, String str3) {
        if (C8172b.f17937b) {
            C6787b.m13170a().getClass();
            C8172b.f17938c = C6787b.m13172j();
            C8172b.f17939d = "CardinalLoggerV1";
            super.mo19175a(str, str2, str3);
        }
    }

    /* renamed from: c */
    public final C8174c mo19176c() {
        return super.mo19176c();
    }

    /* renamed from: d */
    public final void mo19177d(String str, String str2, String str3) {
        if (C8172b.f17937b) {
            C6787b.m13170a().getClass();
            C8172b.f17938c = C6787b.m13172j();
            C8172b.f17939d = "CardinalLoggerV1";
            super.mo19177d(str, str2, str3);
        }
    }

    /* renamed from: e */
    public final void mo19178e() {
        super.mo19178e();
    }

    /* renamed from: h */
    public final void mo19179h(C6789d dVar, String str) {
        mo19177d(String.valueOf(dVar.f14947a), dVar.f14948b, str);
    }

    /* renamed from: i */
    public final void mo19180i(String str) {
        String str2;
        if (C8172b.f17937b) {
            String a = C8172b.f17937b ? new C8176e().mo20805a() : null;
            if (str != null) {
                char[] cArr = C8171a.f17928a;
                if (str.equals("STAGING")) {
                    str2 = "https://cmsdk.cardinalcommerce.com/stag_logs";
                    new C8172b.C8173a(a, str2).execute(new Void[0]);
                }
            }
            str2 = "https://cmsdk.cardinalcommerce.com/prod_logs";
            new C8172b.C8173a(a, str2).execute(new Void[0]);
        }
    }
}
