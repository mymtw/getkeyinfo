package okhttp3;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0391c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import okhttp3.TlsVersion;
import p735br.C18980c;
import p742fq.C19020a;

/* renamed from: okhttp3.h */
public final class C19950h {

    /* renamed from: e */
    public static final C19950h f44039e;

    /* renamed from: f */
    public static final C19950h f44040f = new C19950h(false, false, (String[]) null, (String[]) null);

    /* renamed from: a */
    public final boolean f44041a;

    /* renamed from: b */
    public final boolean f44042b;

    /* renamed from: c */
    public final String[] f44043c;

    /* renamed from: d */
    public final String[] f44044d;

    /* renamed from: okhttp3.h$a */
    public static final class C19951a {

        /* renamed from: a */
        public boolean f44045a;

        /* renamed from: b */
        public String[] f44046b;

        /* renamed from: c */
        public String[] f44047c;

        /* renamed from: d */
        public boolean f44048d;

        public C19951a() {
            this.f44045a = true;
        }

        /* renamed from: a */
        public final C19950h mo72871a() {
            return new C19950h(this.f44045a, this.f44048d, this.f44046b, this.f44047c);
        }

        /* renamed from: b */
        public final void mo72872b(String... strArr) {
            C19383o.m32797g(strArr, "cipherSuites");
            if (this.f44045a) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    if (clone != null) {
                        this.f44046b = (String[]) clone;
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                }
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        /* renamed from: c */
        public final void mo72873c(C19947g... gVarArr) {
            C19383o.m32797g(gVarArr, "cipherSuites");
            if (this.f44045a) {
                ArrayList arrayList = new ArrayList(gVarArr.length);
                for (C19947g gVar : gVarArr) {
                    arrayList.add(gVar.f44038a);
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    mo72872b((String[]) Arrays.copyOf(strArr, strArr.length));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        /* renamed from: d */
        public final void mo72874d() {
            if (this.f44045a) {
                this.f44048d = true;
                return;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }

        /* renamed from: e */
        public final void mo72875e(String... strArr) {
            C19383o.m32797g(strArr, "tlsVersions");
            if (this.f44045a) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    if (clone != null) {
                        this.f44047c = (String[]) clone;
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                }
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        /* renamed from: f */
        public final void mo72876f(TlsVersion... tlsVersionArr) {
            if (this.f44045a) {
                ArrayList arrayList = new ArrayList(tlsVersionArr.length);
                for (TlsVersion javaName : tlsVersionArr) {
                    arrayList.add(javaName.javaName());
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    mo72875e((String[]) Arrays.copyOf(strArr, strArr.length));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public C19951a(C19950h hVar) {
            this.f44045a = hVar.f44041a;
            this.f44046b = hVar.f44043c;
            this.f44047c = hVar.f44044d;
            this.f44048d = hVar.f44042b;
        }
    }

    static {
        C19947g gVar = C19947g.f44034q;
        C19947g gVar2 = C19947g.f44035r;
        C19947g gVar3 = C19947g.f44036s;
        C19947g gVar4 = C19947g.f44028k;
        C19947g gVar5 = C19947g.f44030m;
        C19947g gVar6 = C19947g.f44029l;
        C19947g gVar7 = C19947g.f44031n;
        C19947g gVar8 = C19947g.f44033p;
        C19947g gVar9 = C19947g.f44032o;
        C19947g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9};
        C19947g[] gVarArr2 = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, C19947g.f44026i, C19947g.f44027j, C19947g.f44024g, C19947g.f44025h, C19947g.f44022e, C19947g.f44023f, C19947g.f44021d};
        C19951a aVar = new C19951a();
        aVar.mo72873c((C19947g[]) Arrays.copyOf(gVarArr, 9));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        aVar.mo72876f(tlsVersion, tlsVersion2);
        aVar.mo72874d();
        aVar.mo72871a();
        C19951a aVar2 = new C19951a();
        aVar2.mo72873c((C19947g[]) Arrays.copyOf(gVarArr2, 16));
        aVar2.mo72876f(tlsVersion, tlsVersion2);
        aVar2.mo72874d();
        f44039e = aVar2.mo72871a();
        C19951a aVar3 = new C19951a();
        aVar3.mo72873c((C19947g[]) Arrays.copyOf(gVarArr2, 16));
        aVar3.mo72876f(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0);
        aVar3.mo72874d();
        aVar3.mo72871a();
    }

    public C19950h(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.f44041a = z;
        this.f44042b = z2;
        this.f44043c = strArr;
        this.f44044d = strArr2;
    }

    /* renamed from: a */
    public final List<C19947g> mo72865a() {
        String[] strArr = this.f44043c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String b : strArr) {
            arrayList.add(C19947g.f44037t.mo72864b(b));
        }
        return C19327t.m32660p1(arrayList);
    }

    /* renamed from: b */
    public final boolean mo72866b(SSLSocket sSLSocket) {
        if (!this.f44041a) {
            return false;
        }
        String[] strArr = this.f44044d;
        if (strArr != null && !C18980c.m32105i(strArr, sSLSocket.getEnabledProtocols(), C19020a.f42387b)) {
            return false;
        }
        String[] strArr2 = this.f44043c;
        if (strArr2 == null) {
            return true;
        }
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        C19947g.f44037t.getClass();
        return C18980c.m32105i(strArr2, enabledCipherSuites, C19947g.f44019b);
    }

    /* renamed from: c */
    public final List<TlsVersion> mo72867c() {
        String[] strArr = this.f44044d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String a : strArr) {
            TlsVersion.Companion.getClass();
            arrayList.add(TlsVersion.C19926a.m34074a(a));
        }
        return C19327t.m32660p1(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19950h)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.f44041a;
        C19950h hVar = (C19950h) obj;
        if (z != hVar.f44041a) {
            return false;
        }
        return !z || (Arrays.equals(this.f44043c, hVar.f44043c) && Arrays.equals(this.f44044d, hVar.f44044d) && this.f44042b == hVar.f44042b);
    }

    public final int hashCode() {
        if (!this.f44041a) {
            return 17;
        }
        String[] strArr = this.f44043c;
        int i = 0;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f44044d;
        if (strArr2 != null) {
            i = Arrays.hashCode(strArr2);
        }
        return ((hashCode + i) * 31) + (this.f44042b ^ true ? 1 : 0);
    }

    public final String toString() {
        if (!this.f44041a) {
            return "ConnectionSpec()";
        }
        StringBuilder k = C0073e.m211k("ConnectionSpec(", "cipherSuites=");
        k.append(Objects.toString(mo72865a(), "[all enabled]"));
        k.append(", ");
        k.append("tlsVersions=");
        k.append(Objects.toString(mo72867c(), "[all enabled]"));
        k.append(", ");
        k.append("supportsTlsExtensions=");
        return C0391c.m1058d(k, this.f44042b, ')');
    }
}
