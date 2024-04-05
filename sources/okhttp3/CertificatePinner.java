package okhttp3;

import androidx.appcompat.widget.C0326j;
import androidx.compose.foundation.layout.C0761x;
import com.fasterxml.jackson.core.JsonPointer;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.C19318k;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import kotlin.text.C19459m;
import okio.ByteString;
import p003a2.C0023f;
import p568fn.C17782b;
import p754kr.C19871c;

public final class CertificatePinner {

    /* renamed from: c */
    public static final CertificatePinner f43935c = new CertificatePinner(C19327t.m32664t1(new C19922a().f43939a), (C19871c) null);

    /* renamed from: d */
    public static final C19923b f43936d = new C19923b();

    /* renamed from: a */
    public final Set<C19924c> f43937a;

    /* renamed from: b */
    public final C19871c f43938b;

    /* renamed from: okhttp3.CertificatePinner$a */
    public static final class C19922a {

        /* renamed from: a */
        public final ArrayList f43939a = new ArrayList();
    }

    /* renamed from: okhttp3.CertificatePinner$b */
    public static final class C19923b {
        /* renamed from: a */
        public static String m34068a(X509Certificate x509Certificate) {
            C19383o.m32797g(x509Certificate, "certificate");
            return "sha256/" + m34069b(x509Certificate).base64();
        }

        /* renamed from: b */
        public static ByteString m34069b(X509Certificate x509Certificate) {
            C19383o.m32797g(x509Certificate, "$this$sha256Hash");
            ByteString.C20020a aVar = ByteString.Companion;
            PublicKey publicKey = x509Certificate.getPublicKey();
            C19383o.m32796f(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            C19383o.m32796f(encoded, "publicKey.encoded");
            int length = encoded.length;
            aVar.getClass();
            C17782b.m29843I((long) encoded.length, (long) 0, (long) length);
            return new ByteString(C19318k.m32606X0(0, length + 0, encoded)).sha256();
        }
    }

    /* renamed from: okhttp3.CertificatePinner$c */
    public static final class C19924c {

        /* renamed from: a */
        public final String f43940a;

        /* renamed from: b */
        public final String f43941b;

        /* renamed from: c */
        public final ByteString f43942c;

        public C19924c(String str, String str2) {
            C19383o.m32797g(str2, "pin");
            boolean z = true;
            if ((!C19457k.m33025c1(str, "*.", false) || C19459m.m33043l1(str, "*", 1, false, 4) != -1) && ((!C19457k.m33025c1(str, "**.", false) || C19459m.m33043l1(str, "*", 2, false, 4) != -1) && C19459m.m33043l1(str, "*", 0, false, 6) != -1)) {
                z = false;
            }
            if (z) {
                String P0 = C0761x.m1686P0(str);
                if (P0 != null) {
                    this.f43940a = P0;
                    if (C19457k.m33025c1(str2, "sha1/", false)) {
                        this.f43941b = "sha1";
                        ByteString.C20020a aVar = ByteString.Companion;
                        String substring = str2.substring(5);
                        C19383o.m32796f(substring, "(this as java.lang.String).substring(startIndex)");
                        aVar.getClass();
                        ByteString a = ByteString.C20020a.m34293a(substring);
                        if (a != null) {
                            this.f43942c = a;
                            return;
                        }
                        throw new IllegalArgumentException(C0326j.m864i("Invalid pin hash: ", str2));
                    } else if (C19457k.m33025c1(str2, "sha256/", false)) {
                        this.f43941b = "sha256";
                        ByteString.C20020a aVar2 = ByteString.Companion;
                        String substring2 = str2.substring(7);
                        C19383o.m32796f(substring2, "(this as java.lang.String).substring(startIndex)");
                        aVar2.getClass();
                        ByteString a2 = ByteString.C20020a.m34293a(substring2);
                        if (a2 != null) {
                            this.f43942c = a2;
                            return;
                        }
                        throw new IllegalArgumentException(C0326j.m864i("Invalid pin hash: ", str2));
                    } else {
                        throw new IllegalArgumentException(C0326j.m864i("pins must start with 'sha256/' or 'sha1/': ", str2));
                    }
                } else {
                    throw new IllegalArgumentException(C0326j.m864i("Invalid pattern: ", str));
                }
            } else {
                throw new IllegalArgumentException(C0326j.m864i("Unexpected pattern: ", str).toString());
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C19924c)) {
                return false;
            }
            C19924c cVar = (C19924c) obj;
            return !(C19383o.m32792b(this.f43940a, cVar.f43940a) ^ true) && !(C19383o.m32792b(this.f43941b, cVar.f43941b) ^ true) && !(C19383o.m32792b(this.f43942c, cVar.f43942c) ^ true);
        }

        public final int hashCode() {
            return this.f43942c.hashCode() + C0023f.m105e(this.f43941b, this.f43940a.hashCode() * 31, 31);
        }

        public final String toString() {
            return this.f43941b + JsonPointer.SEPARATOR + this.f43942c.base64();
        }
    }

    public CertificatePinner(Set<C19924c> set, C19871c cVar) {
        C19383o.m32797g(set, "pins");
        this.f43937a = set;
        this.f43938b = cVar;
    }

    /* renamed from: a */
    public final void mo72823a(String str, List<? extends Certificate> list) throws SSLPeerUnverifiedException {
        C19383o.m32797g(str, "hostname");
        C19383o.m32797g(list, "peerCertificates");
        mo72824b(str, new CertificatePinner$check$1(this, list, str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x008e, code lost:
        if (kotlin.text.C19459m.m33045n1(r6, org.apache.commons.lang3.ClassUtils.PACKAGE_SEPARATOR_CHAR, r15 - 1, 4) == -1) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0059, code lost:
        if (r6.charAt(r14 - 1) == '.') goto L_0x0090;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0012 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72824b(java.lang.String r21, p753kq.C19846a<? extends java.util.List<? extends java.security.cert.X509Certificate>> r22) {
        /*
            r20 = this;
            r6 = r21
            java.lang.String r0 = "hostname"
            kotlin.jvm.internal.C19383o.m32797g(r6, r0)
            r7 = r20
            java.util.Set<okhttp3.CertificatePinner$c> r0 = r7.f43937a
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.INSTANCE
            java.util.Iterator r8 = r0.iterator()
            r9 = r1
        L_0x0012:
            boolean r0 = r8.hasNext()
            r10 = 0
            if (r0 == 0) goto L_0x00af
            java.lang.Object r11 = r8.next()
            r0 = r11
            okhttp3.CertificatePinner$c r0 = (okhttp3.CertificatePinner.C19924c) r0
            r0.getClass()
            java.lang.String r1 = r0.f43940a
            java.lang.String r2 = "**."
            boolean r1 = kotlin.text.C19457k.m33025c1(r1, r2, r10)
            r12 = 1
            r13 = 46
            if (r1 == 0) goto L_0x005c
            java.lang.String r1 = r0.f43940a
            int r1 = r1.length()
            int r2 = r1 + -3
            int r1 = r21.length()
            int r14 = r1 - r2
            int r1 = r21.length()
            int r1 = r1 - r2
            java.lang.String r4 = r0.f43940a
            r3 = 3
            r5 = 0
            r0 = r1
            r1 = r3
            r3 = r21
            boolean r0 = kotlin.text.C19457k.m33021Y0(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0098
            if (r14 == 0) goto L_0x0090
            int r14 = r14 + -1
            char r0 = r6.charAt(r14)
            if (r0 != r13) goto L_0x0098
            goto L_0x0090
        L_0x005c:
            java.lang.String r1 = r0.f43940a
            java.lang.String r2 = "*."
            boolean r1 = kotlin.text.C19457k.m33025c1(r1, r2, r10)
            if (r1 == 0) goto L_0x0092
            java.lang.String r1 = r0.f43940a
            int r1 = r1.length()
            r14 = -1
            int r2 = r1 + -1
            int r1 = r21.length()
            int r15 = r1 - r2
            int r1 = r21.length()
            int r1 = r1 - r2
            java.lang.String r4 = r0.f43940a
            r3 = 1
            r5 = 0
            r0 = r1
            r1 = r3
            r3 = r21
            boolean r0 = kotlin.text.C19457k.m33021Y0(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0098
            int r15 = r15 + r14
            r0 = 4
            int r0 = kotlin.text.C19459m.m33045n1(r6, r13, r15, r0)
            if (r0 != r14) goto L_0x0098
        L_0x0090:
            r10 = r12
            goto L_0x0098
        L_0x0092:
            java.lang.String r0 = r0.f43940a
            boolean r10 = kotlin.jvm.internal.C19383o.m32792b(r6, r0)
        L_0x0098:
            if (r10 == 0) goto L_0x0012
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x00a6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9 = r0
        L_0x00a6:
            java.util.List r0 = kotlin.jvm.internal.C19389t.m32908b(r9)
            r0.add(r11)
            goto L_0x0012
        L_0x00af:
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x00b6
            return
        L_0x00b6:
            java.lang.Object r0 = r22.invoke()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r1 = r0.iterator()
        L_0x00c0:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x017e
            java.lang.Object r2 = r1.next()
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            java.util.Iterator r3 = r9.iterator()
            r4 = 0
            r5 = 0
        L_0x00d2:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x017a
            java.lang.Object r8 = r3.next()
            okhttp3.CertificatePinner$c r8 = (okhttp3.CertificatePinner.C19924c) r8
            java.lang.String r11 = r8.f43941b
            int r12 = r11.hashCode()
            r13 = -903629273(0xffffffffca23b627, float:-2682249.8)
            if (r12 == r13) goto L_0x0141
            r13 = 3528965(0x35d905, float:4.945133E-39)
            if (r12 != r13) goto L_0x0165
            java.lang.String r12 = "sha1"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x0165
            if (r5 != 0) goto L_0x0136
            okhttp3.CertificatePinner$b r5 = f43936d
            r5.getClass()
            java.lang.String r5 = "$this$sha1Hash"
            kotlin.jvm.internal.C19383o.m32797g(r2, r5)
            okio.ByteString$a r5 = okio.ByteString.Companion
            java.security.PublicKey r11 = r2.getPublicKey()
            java.lang.String r12 = "publicKey"
            kotlin.jvm.internal.C19383o.m32796f(r11, r12)
            byte[] r11 = r11.getEncoded()
            java.lang.String r12 = "publicKey.encoded"
            kotlin.jvm.internal.C19383o.m32796f(r11, r12)
            int r12 = r11.length
            r5.getClass()
            int r5 = r11.length
            long r13 = (long) r5
            r19 = r9
            long r9 = (long) r10
            long r5 = (long) r12
            r15 = r9
            r17 = r5
            p568fn.C17782b.m29843I(r13, r15, r17)
            okio.ByteString r5 = new okio.ByteString
            r10 = 0
            int r12 = r12 + r10
            byte[] r6 = kotlin.collections.C19318k.m32606X0(r10, r12, r11)
            r5.<init>(r6)
            okio.ByteString r5 = r5.sha1()
            goto L_0x0138
        L_0x0136:
            r19 = r9
        L_0x0138:
            okio.ByteString r6 = r8.f43942c
            boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r6, r5)
            if (r6 == 0) goto L_0x015f
            return
        L_0x0141:
            r19 = r9
            java.lang.String r6 = "sha256"
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L_0x0165
            if (r4 != 0) goto L_0x0156
            okhttp3.CertificatePinner$b r4 = f43936d
            r4.getClass()
            okio.ByteString r4 = okhttp3.CertificatePinner.C19923b.m34069b(r2)
        L_0x0156:
            okio.ByteString r6 = r8.f43942c
            boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r6, r4)
            if (r6 == 0) goto L_0x015f
            return
        L_0x015f:
            r6 = r21
            r9 = r19
            goto L_0x00d2
        L_0x0165:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "unsupported hashAlgorithm: "
            java.lang.StringBuilder r1 = android.support.p013v4.media.C0072d.m201h(r1)
            java.lang.String r2 = r8.f43941b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x017a:
            r6 = r21
            goto L_0x00c0
        L_0x017e:
            r19 = r9
            java.lang.String r1 = "Certificate pinning failure!"
            java.lang.String r2 = "\n  Peer certificate chain:"
            java.lang.StringBuilder r1 = android.support.p013v4.media.C0073e.m211k(r1, r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x018c:
            boolean r2 = r0.hasNext()
            java.lang.String r3 = "\n    "
            if (r2 == 0) goto L_0x01bf
            java.lang.Object r2 = r0.next()
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            r1.append(r3)
            okhttp3.CertificatePinner$b r3 = f43936d
            r3.getClass()
            java.lang.String r3 = okhttp3.CertificatePinner.C19923b.m34068a(r2)
            r1.append(r3)
            java.lang.String r3 = ": "
            r1.append(r3)
            java.security.Principal r2 = r2.getSubjectDN()
            java.lang.String r3 = "element.subjectDN"
            kotlin.jvm.internal.C19383o.m32796f(r2, r3)
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            goto L_0x018c
        L_0x01bf:
            java.lang.String r0 = "\n  Pinned certificates for "
            r1.append(r0)
            r0 = r21
            r1.append(r0)
            java.lang.String r0 = ":"
            r1.append(r0)
            java.util.Iterator r0 = r19.iterator()
        L_0x01d2:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x01e5
            java.lang.Object r2 = r0.next()
            okhttp3.CertificatePinner$c r2 = (okhttp3.CertificatePinner.C19924c) r2
            r1.append(r3)
            r1.append(r2)
            goto L_0x01d2
        L_0x01e5:
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.C19383o.m32796f(r0, r1)
            javax.net.ssl.SSLPeerUnverifiedException r1 = new javax.net.ssl.SSLPeerUnverifiedException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.CertificatePinner.mo72824b(java.lang.String, kq.a):void");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            return C19383o.m32792b(certificatePinner.f43937a, this.f43937a) && C19383o.m32792b(certificatePinner.f43938b, this.f43938b);
        }
    }

    public final int hashCode() {
        int hashCode = (this.f43937a.hashCode() + 1517) * 41;
        C19871c cVar = this.f43938b;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }
}
