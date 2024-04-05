package p303z5;

import java.math.BigInteger;
import java.util.Hashtable;
import p152j6.C7148f;
import p152j6.C7149g;
import p152j6.C7150h;
import p209p6.C7676c;
import p244t5.C7959a;
import p267v7.C8217e;
import p276w7.C8260c;

/* renamed from: z5.a */
public final class C8452a {

    /* renamed from: a */
    public static C8453a f18473a = new C8453a();

    /* renamed from: b */
    public static C8454b f18474b = new C8454b();

    /* renamed from: c */
    public static final Hashtable f18475c;

    /* renamed from: d */
    public static final Hashtable f18476d;

    /* renamed from: e */
    public static final Hashtable f18477e;

    /* renamed from: z5.a$a */
    public static class C8453a extends C7149g {
        /* renamed from: a */
        public final C7148f mo18905a() {
            BigInteger a = C8452a.m16895a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF");
            BigInteger a2 = C8452a.m16895a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFC");
            BigInteger a3 = C8452a.m16895a("28E9FA9E9D9F5E344D5A9E4BCF6509A7F39789F515AB8F92DDBCBD414D940E93");
            BigInteger a4 = C8452a.m16895a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFF7203DF6B21C6052B53BBF40939D54123");
            BigInteger valueOf = BigInteger.valueOf(1);
            C7676c.C7680d dVar = new C7676c.C7680d(a, a2, a3, a4, valueOf);
            return new C7148f((C7676c) dVar, new C7150h((C7676c) dVar, C8260c.m16545a("0432C4AE2C1F1981195F9904466A39C9948FE30BBFF2660BE1715A4589334C74C7BC3736A2F4F6779C59BDCEE36B692153D0A9877CC62A474002DF32E52139F0A0")), a4, valueOf, (byte[]) null);
        }
    }

    /* renamed from: z5.a$b */
    public static class C8454b extends C7149g {
        /* renamed from: a */
        public final C7148f mo18905a() {
            BigInteger a = C8452a.m16895a("BDB6F4FE3E8B1D9E0DA8C0D46F4C318CEFE4AFE3B6B8551F");
            BigInteger a2 = C8452a.m16895a("BB8E5E8FBC115E139FE6A814FE48AAA6F0ADA1AA5DF91985");
            BigInteger a3 = C8452a.m16895a("1854BEBDC31B21B7AEFC80AB0ECD10D5B1B3308E6DBF11C1");
            BigInteger a4 = C8452a.m16895a("BDB6F4FE3E8B1D9E0DA8C0D40FC962195DFAE76F56564677");
            BigInteger valueOf = BigInteger.valueOf(1);
            C7676c.C7680d dVar = new C7676c.C7680d(a, a2, a3, a4, valueOf);
            return new C7148f((C7676c) dVar, new C7150h((C7676c) dVar, C8260c.m16545a("044AD5F7048DE709AD51236DE65E4D4B482C836DC6E410664002BB3A02D4AAADACAE24817A4CA3A1B014B5270432DB27D2")), a4, valueOf, (byte[]) null);
        }
    }

    static {
        Hashtable hashtable = new Hashtable();
        f18475c = hashtable;
        Hashtable hashtable2 = new Hashtable();
        f18476d = hashtable2;
        Hashtable hashtable3 = new Hashtable();
        f18477e = hashtable3;
        C7959a aVar = C8455b.f18479b;
        C8454b bVar = f18474b;
        hashtable.put(C8217e.m16510b("wapip192v1"), aVar);
        hashtable3.put(aVar, "wapip192v1");
        hashtable2.put(aVar, bVar);
        C7959a aVar2 = C8455b.f18478a;
        C8453a aVar3 = f18473a;
        hashtable.put(C8217e.m16510b("sm2p256v1"), aVar2);
        hashtable3.put(aVar2, "sm2p256v1");
        hashtable2.put(aVar2, aVar3);
    }

    /* renamed from: a */
    public static BigInteger m16895a(String str) {
        return new BigInteger(1, C8260c.m16545a(str));
    }
}
