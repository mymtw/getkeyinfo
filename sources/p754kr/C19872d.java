package p754kr;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;

/* renamed from: kr.d */
public final class C19872d implements HostnameVerifier {

    /* renamed from: a */
    public static final C19872d f43855a = new C19872d();

    /* renamed from: a */
    public static List m33863a(X509Certificate x509Certificate, int i) {
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return EmptyList.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            for (List next : subjectAlternativeNames) {
                if (next != null) {
                    if (next.size() >= 2) {
                        if (!(!C19383o.m32792b(next.get(0), Integer.valueOf(i)))) {
                            Object obj = next.get(1);
                            if (obj != null) {
                                arrayList.add((String) obj);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return EmptyList.INSTANCE;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x0131 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m33864b(java.lang.String r11, java.security.cert.X509Certificate r12) {
        /*
            java.lang.String r0 = "host"
            kotlin.jvm.internal.C19383o.m32797g(r11, r0)
            byte[] r0 = p735br.C18980c.f42301a
            kotlin.text.Regex r0 = p735br.C18980c.f42306f
            boolean r0 = r0.matches(r11)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0042
            java.lang.String r11 = androidx.compose.foundation.layout.C0761x.m1686P0(r11)
            r0 = 7
            java.util.List r12 = m33863a(r12, r0)
            boolean r0 = r12 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0026
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x0026
            goto L_0x0130
        L_0x0026:
            java.util.Iterator r12 = r12.iterator()
        L_0x002a:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0130
            java.lang.Object r0 = r12.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = androidx.compose.foundation.layout.C0761x.m1686P0(r0)
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r11, r0)
            if (r0 == 0) goto L_0x002a
            goto L_0x0131
        L_0x0042:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = "Locale.US"
            java.lang.String r4 = "(this as java.lang.String).toLowerCase(locale)"
            java.lang.String r11 = android.support.p013v4.media.session.C0087d.m237g(r0, r3, r11, r0, r4)
            r0 = 2
            java.util.List r12 = m33863a(r12, r0)
            boolean r0 = r12 instanceof java.util.Collection
            if (r0 == 0) goto L_0x005d
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x005d
            goto L_0x0130
        L_0x005d:
            java.util.Iterator r12 = r12.iterator()
        L_0x0061:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0130
            java.lang.Object r0 = r12.next()
            java.lang.String r0 = (java.lang.String) r0
            int r5 = r11.length()
            if (r5 != 0) goto L_0x0075
            r5 = r1
            goto L_0x0076
        L_0x0075:
            r5 = r2
        L_0x0076:
            if (r5 != 0) goto L_0x012c
            java.lang.String r5 = "."
            boolean r6 = kotlin.text.C19457k.m33025c1(r11, r5, r2)
            if (r6 != 0) goto L_0x012c
            java.lang.String r6 = ".."
            boolean r7 = kotlin.text.C19457k.m33018V0(r11, r6)
            if (r7 == 0) goto L_0x008a
            goto L_0x012c
        L_0x008a:
            if (r0 == 0) goto L_0x0095
            int r7 = r0.length()
            if (r7 != 0) goto L_0x0093
            goto L_0x0095
        L_0x0093:
            r7 = r2
            goto L_0x0096
        L_0x0095:
            r7 = r1
        L_0x0096:
            if (r7 != 0) goto L_0x012c
            boolean r7 = kotlin.text.C19457k.m33025c1(r0, r5, r2)
            if (r7 != 0) goto L_0x012c
            boolean r6 = kotlin.text.C19457k.m33018V0(r0, r6)
            if (r6 == 0) goto L_0x00a6
            goto L_0x012c
        L_0x00a6:
            boolean r6 = kotlin.text.C19457k.m33018V0(r11, r5)
            if (r6 != 0) goto L_0x00b1
            java.lang.String r6 = androidx.appcompat.widget.C0326j.m864i(r11, r5)
            goto L_0x00b2
        L_0x00b1:
            r6 = r11
        L_0x00b2:
            boolean r7 = kotlin.text.C19457k.m33018V0(r0, r5)
            if (r7 != 0) goto L_0x00bc
            java.lang.String r0 = androidx.appcompat.widget.C0326j.m864i(r0, r5)
        L_0x00bc:
            java.util.Locale r5 = java.util.Locale.US
            kotlin.jvm.internal.C19383o.m32796f(r5, r3)
            if (r0 == 0) goto L_0x0124
            java.lang.String r0 = r0.toLowerCase(r5)
            kotlin.jvm.internal.C19383o.m32796f(r0, r4)
            java.lang.String r5 = "*"
            boolean r5 = kotlin.text.C19459m.m33036e1(r0, r5, r2)
            if (r5 != 0) goto L_0x00d7
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r6, r0)
            goto L_0x012d
        L_0x00d7:
            java.lang.String r5 = "*."
            boolean r7 = kotlin.text.C19457k.m33025c1(r0, r5, r2)
            if (r7 == 0) goto L_0x012c
            r7 = 42
            r8 = 4
            int r7 = kotlin.text.C19459m.m33042k1(r0, r7, r1, r2, r8)
            r9 = -1
            if (r7 == r9) goto L_0x00ea
            goto L_0x012c
        L_0x00ea:
            int r7 = r6.length()
            int r10 = r0.length()
            if (r7 >= r10) goto L_0x00f5
            goto L_0x012c
        L_0x00f5:
            boolean r5 = kotlin.jvm.internal.C19383o.m32792b(r5, r0)
            if (r5 == 0) goto L_0x00fc
            goto L_0x012c
        L_0x00fc:
            java.lang.String r0 = r0.substring(r1)
            java.lang.String r5 = "(this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.C19383o.m32796f(r0, r5)
            boolean r5 = kotlin.text.C19457k.m33018V0(r6, r0)
            if (r5 != 0) goto L_0x010c
            goto L_0x012c
        L_0x010c:
            int r5 = r6.length()
            int r0 = r0.length()
            int r5 = r5 - r0
            if (r5 <= 0) goto L_0x0122
            r0 = 46
            int r5 = r5 + -1
            int r0 = kotlin.text.C19459m.m33045n1(r6, r0, r5, r8)
            if (r0 == r9) goto L_0x0122
            goto L_0x012c
        L_0x0122:
            r0 = r1
            goto L_0x012d
        L_0x0124:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r12 = "null cannot be cast to non-null type java.lang.String"
            r11.<init>(r12)
            throw r11
        L_0x012c:
            r0 = r2
        L_0x012d:
            if (r0 == 0) goto L_0x0061
            goto L_0x0131
        L_0x0130:
            r1 = r2
        L_0x0131:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p754kr.C19872d.m33864b(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        C19383o.m32797g(str, "host");
        C19383o.m32797g(sSLSession, "session");
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return m33864b(str, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
