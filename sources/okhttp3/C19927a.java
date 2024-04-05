package okhttp3;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import androidx.compose.foundation.layout.C0761x;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import okhttp3.C19997p;
import p003a2.C0015b;
import p504ai.C13983i;
import p735br.C18980c;

/* renamed from: okhttp3.a */
public final class C19927a {

    /* renamed from: a */
    public final C19997p f43948a;

    /* renamed from: b */
    public final List<Protocol> f43949b;

    /* renamed from: c */
    public final List<C19950h> f43950c;

    /* renamed from: d */
    public final C19986l f43951d;

    /* renamed from: e */
    public final SocketFactory f43952e;

    /* renamed from: f */
    public final SSLSocketFactory f43953f;

    /* renamed from: g */
    public final HostnameVerifier f43954g;

    /* renamed from: h */
    public final CertificatePinner f43955h;

    /* renamed from: i */
    public final C19931b f43956i;

    /* renamed from: j */
    public final Proxy f43957j;

    /* renamed from: k */
    public final ProxySelector f43958k;

    public C19927a(String str, int i, C19986l lVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, C19931b bVar, Proxy proxy, List<? extends Protocol> list, List<C19950h> list2, ProxySelector proxySelector) {
        String str2 = str;
        int i2 = i;
        SocketFactory socketFactory2 = socketFactory;
        SSLSocketFactory sSLSocketFactory2 = sSLSocketFactory;
        C19931b bVar2 = bVar;
        ProxySelector proxySelector2 = proxySelector;
        C19383o.m32797g(str, "uriHost");
        C19383o.m32797g(lVar, "dns");
        C19383o.m32797g(socketFactory2, "socketFactory");
        C19383o.m32797g(bVar2, "proxyAuthenticator");
        C19383o.m32797g(list, "protocols");
        C19383o.m32797g(list2, "connectionSpecs");
        C19383o.m32797g(proxySelector2, "proxySelector");
        this.f43951d = lVar;
        this.f43952e = socketFactory2;
        this.f43953f = sSLSocketFactory2;
        this.f43954g = hostnameVerifier;
        this.f43955h = certificatePinner;
        this.f43956i = bVar2;
        this.f43957j = proxy;
        this.f43958k = proxySelector2;
        C19997p.C19998a aVar = new C19997p.C19998a();
        String str3 = sSLSocketFactory2 != null ? "https" : "http";
        boolean z = true;
        if (C19457k.m33019W0(str3, "http", true)) {
            aVar.f44249a = "http";
        } else if (C19457k.m33019W0(str3, "https", true)) {
            aVar.f44249a = "https";
        } else {
            throw new IllegalArgumentException(C0326j.m864i("unexpected scheme: ", str3));
        }
        String P0 = C0761x.m1686P0(C19997p.C19999b.m34236e(C19997p.f44238l, str, 0, 0, false, 7));
        if (P0 != null) {
            aVar.f44252d = P0;
            if ((1 > i2 || 65535 < i2) ? false : z) {
                aVar.f44253e = i2;
                this.f43948a = aVar.mo72978d();
                this.f43949b = C18980c.m32118v(list);
                this.f43950c = C18980c.m32118v(list2);
                return;
            }
            throw new IllegalArgumentException(C0015b.m88g("unexpected port: ", i).toString());
        }
        throw new IllegalArgumentException(C0326j.m864i("unexpected host: ", str));
    }

    /* renamed from: a */
    public final boolean mo72837a(C19927a aVar) {
        C19383o.m32797g(aVar, "that");
        return C19383o.m32792b(this.f43951d, aVar.f43951d) && C19383o.m32792b(this.f43956i, aVar.f43956i) && C19383o.m32792b(this.f43949b, aVar.f43949b) && C19383o.m32792b(this.f43950c, aVar.f43950c) && C19383o.m32792b(this.f43958k, aVar.f43958k) && C19383o.m32792b(this.f43957j, aVar.f43957j) && C19383o.m32792b(this.f43953f, aVar.f43953f) && C19383o.m32792b(this.f43954g, aVar.f43954g) && C19383o.m32792b(this.f43955h, aVar.f43955h) && this.f43948a.f44244f == aVar.f43948a.f44244f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C19927a) {
            C19927a aVar = (C19927a) obj;
            return C19383o.m32792b(this.f43948a, aVar.f43948a) && mo72837a(aVar);
        }
    }

    public final int hashCode() {
        int hashCode = this.f43951d.hashCode();
        int hashCode2 = this.f43956i.hashCode();
        int g = C13983i.m21488g(this.f43950c, C13983i.m21488g(this.f43949b, (hashCode2 + ((hashCode + ((this.f43948a.hashCode() + 527) * 31)) * 31)) * 31, 31), 31);
        int hashCode3 = Objects.hashCode(this.f43957j);
        int hashCode4 = Objects.hashCode(this.f43953f);
        int hashCode5 = Objects.hashCode(this.f43954g);
        return Objects.hashCode(this.f43955h) + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((this.f43958k.hashCode() + g) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb;
        StringBuilder h = C0072d.m201h("Address{");
        h.append(this.f43948a.f44243e);
        h.append(':');
        h.append(this.f43948a.f44244f);
        h.append(", ");
        if (this.f43957j != null) {
            sb = C0072d.m201h("proxy=");
            obj = this.f43957j;
        } else {
            sb = C0072d.m201h("proxySelector=");
            obj = this.f43958k;
        }
        sb.append(obj);
        h.append(sb.toString());
        h.append("}");
        return h.toString();
    }
}
