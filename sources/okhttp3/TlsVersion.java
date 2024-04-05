package okhttp3;

import androidx.appcompat.widget.C0326j;
import kotlin.jvm.internal.C19383o;

public enum TlsVersion {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    
    public static final C19926a Companion = null;
    private final String javaName;

    /* renamed from: okhttp3.TlsVersion$a */
    public static final class C19926a {
        /* renamed from: a */
        public static TlsVersion m34074a(String str) {
            C19383o.m32797g(str, "javaName");
            int hashCode = str.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (str.equals("TLSv1.1")) {
                                return TlsVersion.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (str.equals("TLSv1.2")) {
                                return TlsVersion.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (str.equals("TLSv1.3")) {
                                return TlsVersion.TLS_1_3;
                            }
                            break;
                    }
                } else if (str.equals("TLSv1")) {
                    return TlsVersion.TLS_1_0;
                }
            } else if (str.equals("SSLv3")) {
                return TlsVersion.SSL_3_0;
            }
            throw new IllegalArgumentException(C0326j.m864i("Unexpected TLS version: ", str));
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C19926a();
    }

    private TlsVersion(String str) {
        this.javaName = str;
    }

    public static final TlsVersion forJavaName(String str) {
        Companion.getClass();
        return C19926a.m34074a(str);
    }

    /* renamed from: -deprecated_javaName  reason: not valid java name */
    public final String m35492deprecated_javaName() {
        return this.javaName;
    }

    public final String javaName() {
        return this.javaName;
    }
}
