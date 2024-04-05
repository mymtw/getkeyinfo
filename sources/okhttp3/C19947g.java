package okhttp3;

import android.support.p013v4.media.C0072d;
import com.appboy.Constants;
import java.util.Comparator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;

/* renamed from: okhttp3.g */
public final class C19947g {

    /* renamed from: b */
    public static final C19948a f44019b = new C19948a();

    /* renamed from: c */
    public static final LinkedHashMap f44020c = new LinkedHashMap();

    /* renamed from: d */
    public static final C19947g f44021d;

    /* renamed from: e */
    public static final C19947g f44022e;

    /* renamed from: f */
    public static final C19947g f44023f;

    /* renamed from: g */
    public static final C19947g f44024g;

    /* renamed from: h */
    public static final C19947g f44025h;

    /* renamed from: i */
    public static final C19947g f44026i;

    /* renamed from: j */
    public static final C19947g f44027j;

    /* renamed from: k */
    public static final C19947g f44028k;

    /* renamed from: l */
    public static final C19947g f44029l;

    /* renamed from: m */
    public static final C19947g f44030m;

    /* renamed from: n */
    public static final C19947g f44031n;

    /* renamed from: o */
    public static final C19947g f44032o;

    /* renamed from: p */
    public static final C19947g f44033p;

    /* renamed from: q */
    public static final C19947g f44034q;

    /* renamed from: r */
    public static final C19947g f44035r;

    /* renamed from: s */
    public static final C19947g f44036s;

    /* renamed from: t */
    public static final C19949b f44037t;

    /* renamed from: a */
    public final String f44038a;

    /* renamed from: okhttp3.g$a */
    public static final class C19948a implements Comparator<String> {
        public final int compare(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            C19383o.m32797g(str, Constants.APPBOY_PUSH_CONTENT_KEY);
            C19383o.m32797g(str2, "b");
            int min = Math.min(str.length(), str2.length());
            int i = 4;
            while (true) {
                if (i < min) {
                    char charAt = str.charAt(i);
                    char charAt2 = str2.charAt(i);
                    if (charAt == charAt2) {
                        i++;
                    } else if (C19383o.m32799i(charAt, charAt2) < 0) {
                        return -1;
                    }
                } else {
                    int length = str.length();
                    int length2 = str2.length();
                    if (length == length2) {
                        return 0;
                    }
                    if (length < length2) {
                        return -1;
                    }
                }
            }
            return 1;
        }
    }

    /* renamed from: okhttp3.g$b */
    public static final class C19949b {
        /* renamed from: a */
        public static final C19947g m34103a(C19949b bVar, String str) {
            C19947g gVar = new C19947g(str);
            C19947g.f44020c.put(str, gVar);
            return gVar;
        }

        /* renamed from: c */
        public static String m34104c(String str) {
            if (C19457k.m33025c1(str, "TLS_", false)) {
                StringBuilder h = C0072d.m201h("SSL_");
                String substring = str.substring(4);
                C19383o.m32796f(substring, "(this as java.lang.String).substring(startIndex)");
                h.append(substring);
                return h.toString();
            } else if (!C19457k.m33025c1(str, "SSL_", false)) {
                return str;
            } else {
                StringBuilder h2 = C0072d.m201h("TLS_");
                String substring2 = str.substring(4);
                C19383o.m32796f(substring2, "(this as java.lang.String).substring(startIndex)");
                h2.append(substring2);
                return h2.toString();
            }
        }

        /* renamed from: b */
        public final synchronized C19947g mo72864b(String str) {
            C19947g gVar;
            C19383o.m32797g(str, "javaName");
            LinkedHashMap linkedHashMap = C19947g.f44020c;
            gVar = (C19947g) linkedHashMap.get(str);
            if (gVar == null) {
                gVar = (C19947g) linkedHashMap.get(m34104c(str));
                if (gVar == null) {
                    gVar = new C19947g(str);
                }
                linkedHashMap.put(str, gVar);
            }
            return gVar;
        }
    }

    static {
        C19949b bVar = new C19949b();
        f44037t = bVar;
        C19949b.m34103a(bVar, "SSL_RSA_WITH_NULL_MD5");
        C19949b.m34103a(bVar, "SSL_RSA_WITH_NULL_SHA");
        C19949b.m34103a(bVar, "SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        C19949b.m34103a(bVar, "SSL_RSA_WITH_RC4_128_MD5");
        C19949b.m34103a(bVar, "SSL_RSA_WITH_RC4_128_SHA");
        C19949b.m34103a(bVar, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        C19949b.m34103a(bVar, "SSL_RSA_WITH_DES_CBC_SHA");
        f44021d = C19949b.m34103a(bVar, "SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        C19949b.m34103a(bVar, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        C19949b.m34103a(bVar, "SSL_DHE_DSS_WITH_DES_CBC_SHA");
        C19949b.m34103a(bVar, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        C19949b.m34103a(bVar, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        C19949b.m34103a(bVar, "SSL_DHE_RSA_WITH_DES_CBC_SHA");
        C19949b.m34103a(bVar, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        C19949b.m34103a(bVar, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        C19949b.m34103a(bVar, "SSL_DH_anon_WITH_RC4_128_MD5");
        C19949b.m34103a(bVar, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        C19949b.m34103a(bVar, "SSL_DH_anon_WITH_DES_CBC_SHA");
        C19949b.m34103a(bVar, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        C19949b.m34103a(bVar, "TLS_KRB5_WITH_DES_CBC_SHA");
        C19949b.m34103a(bVar, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        C19949b.m34103a(bVar, "TLS_KRB5_WITH_RC4_128_SHA");
        C19949b.m34103a(bVar, "TLS_KRB5_WITH_DES_CBC_MD5");
        C19949b.m34103a(bVar, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        C19949b.m34103a(bVar, "TLS_KRB5_WITH_RC4_128_MD5");
        C19949b.m34103a(bVar, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        C19949b.m34103a(bVar, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        C19949b.m34103a(bVar, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        C19949b.m34103a(bVar, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        f44022e = C19949b.m34103a(bVar, "TLS_RSA_WITH_AES_128_CBC_SHA");
        C19949b.m34103a(bVar, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        C19949b.m34103a(bVar, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        C19949b.m34103a(bVar, "TLS_DH_anon_WITH_AES_128_CBC_SHA");
        f44023f = C19949b.m34103a(bVar, "TLS_RSA_WITH_AES_256_CBC_SHA");
        C19949b.m34103a(bVar, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        C19949b.m34103a(bVar, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        C19949b.m34103a(bVar, "TLS_DH_anon_WITH_AES_256_CBC_SHA");
        C19949b.m34103a(bVar, "TLS_RSA_WITH_NULL_SHA256");
        C19949b.m34103a(bVar, "TLS_RSA_WITH_AES_128_CBC_SHA256");
        C19949b.m34103a(bVar, "TLS_RSA_WITH_AES_256_CBC_SHA256");
        C19949b.m34103a(bVar, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        C19949b.m34103a(bVar, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        C19949b.m34103a(bVar, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        C19949b.m34103a(bVar, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        C19949b.m34103a(bVar, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        C19949b.m34103a(bVar, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        C19949b.m34103a(bVar, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        C19949b.m34103a(bVar, "TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        C19949b.m34103a(bVar, "TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        C19949b.m34103a(bVar, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        C19949b.m34103a(bVar, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        C19949b.m34103a(bVar, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        C19949b.m34103a(bVar, "TLS_PSK_WITH_RC4_128_SHA");
        C19949b.m34103a(bVar, "TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        C19949b.m34103a(bVar, "TLS_PSK_WITH_AES_128_CBC_SHA");
        C19949b.m34103a(bVar, "TLS_PSK_WITH_AES_256_CBC_SHA");
        C19949b.m34103a(bVar, "TLS_RSA_WITH_SEED_CBC_SHA");
        f44024g = C19949b.m34103a(bVar, "TLS_RSA_WITH_AES_128_GCM_SHA256");
        f44025h = C19949b.m34103a(bVar, "TLS_RSA_WITH_AES_256_GCM_SHA384");
        C19949b.m34103a(bVar, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        C19949b.m34103a(bVar, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        C19949b.m34103a(bVar, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        C19949b.m34103a(bVar, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        C19949b.m34103a(bVar, "TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        C19949b.m34103a(bVar, "TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        C19949b.m34103a(bVar, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        C19949b.m34103a(bVar, "TLS_FALLBACK_SCSV");
        C19949b.m34103a(bVar, "TLS_ECDH_ECDSA_WITH_NULL_SHA");
        C19949b.m34103a(bVar, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        C19949b.m34103a(bVar, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        C19949b.m34103a(bVar, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        C19949b.m34103a(bVar, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        C19949b.m34103a(bVar, "TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        C19949b.m34103a(bVar, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        C19949b.m34103a(bVar, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        C19949b.m34103a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        C19949b.m34103a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        C19949b.m34103a(bVar, "TLS_ECDH_RSA_WITH_NULL_SHA");
        C19949b.m34103a(bVar, "TLS_ECDH_RSA_WITH_RC4_128_SHA");
        C19949b.m34103a(bVar, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        C19949b.m34103a(bVar, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        C19949b.m34103a(bVar, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        C19949b.m34103a(bVar, "TLS_ECDHE_RSA_WITH_NULL_SHA");
        C19949b.m34103a(bVar, "TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        C19949b.m34103a(bVar, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        f44026i = C19949b.m34103a(bVar, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        f44027j = C19949b.m34103a(bVar, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        C19949b.m34103a(bVar, "TLS_ECDH_anon_WITH_NULL_SHA");
        C19949b.m34103a(bVar, "TLS_ECDH_anon_WITH_RC4_128_SHA");
        C19949b.m34103a(bVar, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        C19949b.m34103a(bVar, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        C19949b.m34103a(bVar, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        C19949b.m34103a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        C19949b.m34103a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        C19949b.m34103a(bVar, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        C19949b.m34103a(bVar, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        C19949b.m34103a(bVar, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        C19949b.m34103a(bVar, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        C19949b.m34103a(bVar, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        C19949b.m34103a(bVar, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        f44028k = C19949b.m34103a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        f44029l = C19949b.m34103a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        C19949b.m34103a(bVar, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        C19949b.m34103a(bVar, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        f44030m = C19949b.m34103a(bVar, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        f44031n = C19949b.m34103a(bVar, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        C19949b.m34103a(bVar, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        C19949b.m34103a(bVar, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        C19949b.m34103a(bVar, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        C19949b.m34103a(bVar, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        f44032o = C19949b.m34103a(bVar, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        f44033p = C19949b.m34103a(bVar, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
        C19949b.m34103a(bVar, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        C19949b.m34103a(bVar, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
        f44034q = C19949b.m34103a(bVar, "TLS_AES_128_GCM_SHA256");
        f44035r = C19949b.m34103a(bVar, "TLS_AES_256_GCM_SHA384");
        f44036s = C19949b.m34103a(bVar, "TLS_CHACHA20_POLY1305_SHA256");
        C19949b.m34103a(bVar, "TLS_AES_128_CCM_SHA256");
        C19949b.m34103a(bVar, "TLS_AES_128_CCM_8_SHA256");
    }

    public C19947g(String str) {
        this.f44038a = str;
    }

    public final String toString() {
        return this.f44038a;
    }
}
