package okhttp3;

import android.support.p013v4.media.C0073e;
import androidx.appcompat.widget.C0326j;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.collections.C19322o;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import okhttp3.TlsVersion;
import p735br.C18980c;
import p753kq.C19846a;

public final class Handshake {

    /* renamed from: e */
    public static final Companion f43943e = new Companion();

    /* renamed from: a */
    public final C19285c f43944a;

    /* renamed from: b */
    public final TlsVersion f43945b;

    /* renamed from: c */
    public final C19947g f43946c;

    /* renamed from: d */
    public final List<Certificate> f43947d;

    public static final class Companion {
        /* renamed from: a */
        public static Handshake m34071a(SSLSession sSLSession) throws IOException {
            List list;
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite != null) {
                int hashCode = cipherSuite.hashCode();
                if (hashCode == 1019404634 ? cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : hashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                    throw new IOException(C0326j.m864i("cipherSuite == ", cipherSuite));
                }
                C19947g b = C19947g.f44037t.mo72864b(cipherSuite);
                String protocol = sSLSession.getProtocol();
                if (protocol == null) {
                    throw new IllegalStateException("tlsVersion == null".toString());
                } else if (!C19383o.m32792b("NONE", protocol)) {
                    TlsVersion.Companion.getClass();
                    TlsVersion a = TlsVersion.C19926a.m34074a(protocol);
                    try {
                        Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                        list = peerCertificates != null ? C18980c.m32107k((Certificate[]) Arrays.copyOf(peerCertificates, peerCertificates.length)) : EmptyList.INSTANCE;
                    } catch (SSLPeerUnverifiedException unused) {
                        list = EmptyList.INSTANCE;
                    }
                    Certificate[] localCertificates = sSLSession.getLocalCertificates();
                    return new Handshake(a, b, localCertificates != null ? C18980c.m32107k((Certificate[]) Arrays.copyOf(localCertificates, localCertificates.length)) : EmptyList.INSTANCE, new Handshake$Companion$handshake$1(list));
                } else {
                    throw new IOException("tlsVersion == NONE");
                }
            } else {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
        }

        /* renamed from: b */
        public static Handshake m34072b(TlsVersion tlsVersion, C19947g gVar, List list, List list2) {
            C19383o.m32797g(tlsVersion, "tlsVersion");
            C19383o.m32797g(list, "peerCertificates");
            C19383o.m32797g(list2, "localCertificates");
            return new Handshake(tlsVersion, gVar, C18980c.m32118v(list2), new Handshake$Companion$get$1(C18980c.m32118v(list)));
        }
    }

    public Handshake(TlsVersion tlsVersion, C19947g gVar, List<? extends Certificate> list, C19846a<? extends List<? extends Certificate>> aVar) {
        C19383o.m32797g(tlsVersion, "tlsVersion");
        C19383o.m32797g(gVar, "cipherSuite");
        C19383o.m32797g(list, "localCertificates");
        this.f43945b = tlsVersion;
        this.f43946c = gVar;
        this.f43947d = list;
        this.f43944a = C19350d.m32677b(new Handshake$peerCertificates$2(aVar));
    }

    /* renamed from: a */
    public final List<Certificate> mo72830a() {
        return (List) this.f43944a.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Handshake) {
            Handshake handshake = (Handshake) obj;
            return handshake.f43945b == this.f43945b && C19383o.m32792b(handshake.f43946c, this.f43946c) && C19383o.m32792b(handshake.mo72830a(), mo72830a()) && C19383o.m32792b(handshake.f43947d, this.f43947d);
        }
    }

    public final int hashCode() {
        int hashCode = this.f43946c.hashCode();
        int hashCode2 = mo72830a().hashCode();
        return this.f43947d.hashCode() + ((hashCode2 + ((hashCode + ((this.f43945b.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        String str2;
        List<Certificate> a = mo72830a();
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(a));
        for (Certificate certificate : a) {
            if (certificate instanceof X509Certificate) {
                str2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                str2 = certificate.getType();
                C19383o.m32796f(str2, "type");
            }
            arrayList.add(str2);
        }
        String obj = arrayList.toString();
        StringBuilder k = C0073e.m211k("Handshake{", "tlsVersion=");
        k.append(this.f43945b);
        k.append(' ');
        k.append("cipherSuite=");
        k.append(this.f43946c);
        k.append(' ');
        k.append("peerCertificates=");
        k.append(obj);
        k.append(' ');
        k.append("localCertificates=");
        List<Certificate> list = this.f43947d;
        ArrayList arrayList2 = new ArrayList(C19322o.m32624F0(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                str = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                str = certificate2.getType();
                C19383o.m32796f(str, "type");
            }
            arrayList2.add(str);
        }
        k.append(arrayList2);
        k.append('}');
        return k.toString();
    }
}
