package okhttp3.internal.connection;

import android.support.p013v4.media.C0072d;
import java.io.IOException;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19947g;
import okhttp3.C19950h;
import p735br.C18980c;
import p742fq.C19020a;

/* renamed from: okhttp3.internal.connection.b */
public final class C19966b {

    /* renamed from: a */
    public int f44122a;

    /* renamed from: b */
    public boolean f44123b;

    /* renamed from: c */
    public boolean f44124c;

    /* renamed from: d */
    public final List<C19950h> f44125d;

    public C19966b(List<C19950h> list) {
        C19383o.m32797g(list, "connectionSpecs");
        this.f44125d = list;
    }

    /* renamed from: a */
    public final C19950h mo72905a(SSLSocket sSLSocket) throws IOException {
        C19950h hVar;
        boolean z;
        String[] strArr;
        String[] strArr2;
        int i = this.f44122a;
        int size = this.f44125d.size();
        while (true) {
            if (i >= size) {
                hVar = null;
                break;
            }
            hVar = this.f44125d.get(i);
            if (hVar.mo72866b(sSLSocket)) {
                this.f44122a = i + 1;
                break;
            }
            i++;
        }
        if (hVar != null) {
            int i2 = this.f44122a;
            int size2 = this.f44125d.size();
            while (true) {
                if (i2 >= size2) {
                    z = false;
                    break;
                } else if (this.f44125d.get(i2).mo72866b(sSLSocket)) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            this.f44123b = z;
            boolean z2 = this.f44124c;
            if (hVar.f44043c != null) {
                String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                C19383o.m32796f(enabledCipherSuites, "sslSocket.enabledCipherSuites");
                String[] strArr3 = hVar.f44043c;
                C19947g.f44037t.getClass();
                strArr = C18980c.m32111o(enabledCipherSuites, strArr3, C19947g.f44019b);
            } else {
                strArr = sSLSocket.getEnabledCipherSuites();
            }
            if (hVar.f44044d != null) {
                String[] enabledProtocols = sSLSocket.getEnabledProtocols();
                C19383o.m32796f(enabledProtocols, "sslSocket.enabledProtocols");
                strArr2 = C18980c.m32111o(enabledProtocols, hVar.f44044d, C19020a.f42387b);
            } else {
                strArr2 = sSLSocket.getEnabledProtocols();
            }
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            C19383o.m32796f(supportedCipherSuites, "supportedCipherSuites");
            C19947g.f44037t.getClass();
            C19947g.C19948a aVar = C19947g.f44019b;
            byte[] bArr = C18980c.f42301a;
            C19383o.m32797g(aVar, "comparator");
            int length = supportedCipherSuites.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    i3 = -1;
                    break;
                }
                if (aVar.compare(supportedCipherSuites[i3], "TLS_FALLBACK_SCSV") == 0) {
                    break;
                }
                i3++;
            }
            if (z2 && i3 != -1) {
                C19383o.m32796f(strArr, "cipherSuitesIntersection");
                String str = supportedCipherSuites[i3];
                C19383o.m32796f(str, "supportedCipherSuites[indexOfFallbackScsv]");
                Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
                C19383o.m32796f(copyOf, "java.util.Arrays.copyOf(this, newSize)");
                strArr = (String[]) copyOf;
                strArr[strArr.length - 1] = str;
            }
            C19950h.C19951a aVar2 = new C19950h.C19951a(hVar);
            C19383o.m32796f(strArr, "cipherSuitesIntersection");
            aVar2.mo72872b((String[]) Arrays.copyOf(strArr, strArr.length));
            C19383o.m32796f(strArr2, "tlsVersionsIntersection");
            aVar2.mo72875e((String[]) Arrays.copyOf(strArr2, strArr2.length));
            C19950h a = aVar2.mo72871a();
            if (a.mo72867c() != null) {
                sSLSocket.setEnabledProtocols(a.f44044d);
            }
            if (a.mo72865a() != null) {
                sSLSocket.setEnabledCipherSuites(a.f44043c);
            }
            return hVar;
        }
        StringBuilder h = C0072d.m201h("Unable to find acceptable protocols. isFallback=");
        h.append(this.f44124c);
        h.append(',');
        h.append(" modes=");
        h.append(this.f44125d);
        h.append(',');
        h.append(" supported protocols=");
        String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
        C19383o.m32794d(enabledProtocols2);
        String arrays = Arrays.toString(enabledProtocols2);
        C19383o.m32796f(arrays, "java.util.Arrays.toString(this)");
        h.append(arrays);
        throw new UnknownServiceException(h.toString());
    }
}
