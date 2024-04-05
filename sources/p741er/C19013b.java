package p741er;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import androidx.appcompat.widget.C0326j;
import com.fasterxml.jackson.core.JsonFactory;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import kotlin.text.C19459m;
import okhttp3.C19984j;
import okhttp3.C19994o;
import okhttp3.C19997p;
import okhttp3.C20009t;
import okhttp3.C20011u;
import okhttp3.C20018z;
import okhttp3.Protocol;
import okhttp3.internal.connection.C19976g;
import p735br.C18980c;
import p739dr.C19004d;
import p739dr.C19005e;
import p739dr.C19009i;
import p756lr.C19882a0;
import p756lr.C19888c0;
import p756lr.C19890d0;
import p756lr.C19893f;
import p756lr.C19896h;
import p756lr.C19897i;
import p756lr.C19901m;

/* renamed from: er.b */
public final class C19013b implements C19004d {

    /* renamed from: a */
    public int f42364a;

    /* renamed from: b */
    public final C19012a f42365b;

    /* renamed from: c */
    public C19994o f42366c;

    /* renamed from: d */
    public final C20009t f42367d;

    /* renamed from: e */
    public final C19976g f42368e;

    /* renamed from: f */
    public final C19897i f42369f;

    /* renamed from: g */
    public final C19896h f42370g;

    /* renamed from: er.b$a */
    public abstract class C19014a implements C19888c0 {

        /* renamed from: b */
        public final C19901m f42371b;

        /* renamed from: c */
        public boolean f42372c;

        public C19014a() {
            this.f42371b = new C19901m(C19013b.this.f42369f.mo68547m());
        }

        /* renamed from: J */
        public long mo68544J(C19893f fVar, long j) {
            C19383o.m32797g(fVar, "sink");
            try {
                return C19013b.this.f42369f.mo68544J(fVar, j);
            } catch (IOException e) {
                C19013b.this.f42368e.mo72930k();
                mo70465a();
                throw e;
            }
        }

        /* renamed from: a */
        public final void mo70465a() {
            C19013b bVar = C19013b.this;
            int i = bVar.f42364a;
            if (i != 6) {
                if (i == 5) {
                    C19013b.m32166i(bVar, this.f42371b);
                    C19013b.this.f42364a = 6;
                    return;
                }
                StringBuilder h = C0072d.m201h("state: ");
                h.append(C19013b.this.f42364a);
                throw new IllegalStateException(h.toString());
            }
        }

        /* renamed from: m */
        public final C19890d0 mo68547m() {
            return this.f42371b;
        }
    }

    /* renamed from: er.b$b */
    public final class C19015b implements C19882a0 {

        /* renamed from: b */
        public final C19901m f42374b;

        /* renamed from: c */
        public boolean f42375c;

        public C19015b() {
            this.f42374b = new C19901m(C19013b.this.f42370g.mo68515m());
        }

        /* renamed from: O */
        public final void mo68512O(C19893f fVar, long j) {
            C19383o.m32797g(fVar, "source");
            if (!(!this.f42375c)) {
                throw new IllegalStateException("closed".toString());
            } else if (j != 0) {
                C19013b.this.f42370g.mo72746l0(j);
                C19013b.this.f42370g.mo72716H("\r\n");
                C19013b.this.f42370g.mo68512O(fVar, j);
                C19013b.this.f42370g.mo72716H("\r\n");
            }
        }

        public final synchronized void close() {
            if (!this.f42375c) {
                this.f42375c = true;
                C19013b.this.f42370g.mo72716H("0\r\n\r\n");
                C19013b.m32166i(C19013b.this, this.f42374b);
                C19013b.this.f42364a = 3;
            }
        }

        public final synchronized void flush() {
            if (!this.f42375c) {
                C19013b.this.f42370g.flush();
            }
        }

        /* renamed from: m */
        public final C19890d0 mo68515m() {
            return this.f42374b;
        }
    }

    /* renamed from: er.b$c */
    public final class C19016c extends C19014a {

        /* renamed from: e */
        public long f42377e = -1;

        /* renamed from: f */
        public boolean f42378f = true;

        /* renamed from: g */
        public final C19997p f42379g;

        /* renamed from: h */
        public final /* synthetic */ C19013b f42380h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19016c(C19013b bVar, C19997p pVar) {
            super();
            C19383o.m32797g(pVar, "url");
            this.f42380h = bVar;
            this.f42379g = pVar;
        }

        /* renamed from: J */
        public final long mo68544J(C19893f fVar, long j) {
            C19383o.m32797g(fVar, "sink");
            boolean z = true;
            if (!(j >= 0)) {
                throw new IllegalArgumentException(C0073e.m205e("byteCount < 0: ", j).toString());
            } else if (!(!this.f42372c)) {
                throw new IllegalStateException("closed".toString());
            } else if (!this.f42378f) {
                return -1;
            } else {
                long j2 = this.f42377e;
                if (j2 == 0 || j2 == -1) {
                    if (j2 != -1) {
                        this.f42380h.f42369f.mo72719L();
                    }
                    try {
                        this.f42377e = this.f42380h.f42369f.mo72772y0();
                        String L = this.f42380h.f42369f.mo72719L();
                        if (L != null) {
                            String obj = C19459m.m33035H1(L).toString();
                            if (this.f42377e >= 0) {
                                if (obj.length() <= 0) {
                                    z = false;
                                }
                                if (!z || C19457k.m33025c1(obj, ";", false)) {
                                    if (this.f42377e == 0) {
                                        this.f42378f = false;
                                        C19013b bVar = this.f42380h;
                                        bVar.f42366c = bVar.f42365b.mo70462a();
                                        C20009t tVar = this.f42380h.f42367d;
                                        C19383o.m32794d(tVar);
                                        C19984j jVar = tVar.f44295k;
                                        C19997p pVar = this.f42379g;
                                        C19994o oVar = this.f42380h.f42366c;
                                        C19383o.m32794d(oVar);
                                        C19005e.m32153b(jVar, pVar, oVar);
                                        mo70465a();
                                    }
                                    if (!this.f42378f) {
                                        return -1;
                                    }
                                }
                            }
                            throw new ProtocolException("expected chunk size and optional extensions" + " but was \"" + this.f42377e + obj + JsonFactory.DEFAULT_QUOTE_CHAR);
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                    } catch (NumberFormatException e) {
                        throw new ProtocolException(e.getMessage());
                    }
                }
                long J = super.mo68544J(fVar, Math.min(j, this.f42377e));
                if (J != -1) {
                    this.f42377e -= J;
                    return J;
                }
                this.f42380h.f42368e.mo72930k();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo70465a();
                throw protocolException;
            }
        }

        public final void close() {
            if (!this.f42372c) {
                if (this.f42378f && !C18980c.m32103g(this, TimeUnit.MILLISECONDS)) {
                    this.f42380h.f42368e.mo72930k();
                    mo70465a();
                }
                this.f42372c = true;
            }
        }
    }

    /* renamed from: er.b$d */
    public final class C19017d extends C19014a {

        /* renamed from: e */
        public long f42381e;

        public C19017d(long j) {
            super();
            this.f42381e = j;
            if (j == 0) {
                mo70465a();
            }
        }

        /* renamed from: J */
        public final long mo68544J(C19893f fVar, long j) {
            C19383o.m32797g(fVar, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(C0073e.m205e("byteCount < 0: ", j).toString());
            } else if (!this.f42372c) {
                long j2 = this.f42381e;
                if (j2 == 0) {
                    return -1;
                }
                long J = super.mo68544J(fVar, Math.min(j2, j));
                if (J != -1) {
                    long j3 = this.f42381e - J;
                    this.f42381e = j3;
                    if (j3 == 0) {
                        mo70465a();
                    }
                    return J;
                }
                C19013b.this.f42368e.mo72930k();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo70465a();
                throw protocolException;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        public final void close() {
            if (!this.f42372c) {
                if (this.f42381e != 0 && !C18980c.m32103g(this, TimeUnit.MILLISECONDS)) {
                    C19013b.this.f42368e.mo72930k();
                    mo70465a();
                }
                this.f42372c = true;
            }
        }
    }

    /* renamed from: er.b$e */
    public final class C19018e implements C19882a0 {

        /* renamed from: b */
        public final C19901m f42383b;

        /* renamed from: c */
        public boolean f42384c;

        public C19018e() {
            this.f42383b = new C19901m(C19013b.this.f42370g.mo68515m());
        }

        /* renamed from: O */
        public final void mo68512O(C19893f fVar, long j) {
            C19383o.m32797g(fVar, "source");
            if (!this.f42384c) {
                long j2 = fVar.f43876c;
                byte[] bArr = C18980c.f42301a;
                if ((0 | j) < 0 || 0 > j2 || j2 - 0 < j) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                C19013b.this.f42370g.mo68512O(fVar, j);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }

        public final void close() {
            if (!this.f42384c) {
                this.f42384c = true;
                C19013b.m32166i(C19013b.this, this.f42383b);
                C19013b.this.f42364a = 3;
            }
        }

        public final void flush() {
            if (!this.f42384c) {
                C19013b.this.f42370g.flush();
            }
        }

        /* renamed from: m */
        public final C19890d0 mo68515m() {
            return this.f42383b;
        }
    }

    /* renamed from: er.b$f */
    public final class C19019f extends C19014a {

        /* renamed from: e */
        public boolean f42386e;

        public C19019f(C19013b bVar) {
            super();
        }

        /* renamed from: J */
        public final long mo68544J(C19893f fVar, long j) {
            C19383o.m32797g(fVar, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(C0073e.m205e("byteCount < 0: ", j).toString());
            } else if (!(!this.f42372c)) {
                throw new IllegalStateException("closed".toString());
            } else if (this.f42386e) {
                return -1;
            } else {
                long J = super.mo68544J(fVar, j);
                if (J != -1) {
                    return J;
                }
                this.f42386e = true;
                mo70465a();
                return -1;
            }
        }

        public final void close() {
            if (!this.f42372c) {
                if (!this.f42386e) {
                    mo70465a();
                }
                this.f42372c = true;
            }
        }
    }

    public C19013b(C20009t tVar, C19976g gVar, C19897i iVar, C19896h hVar) {
        C19383o.m32797g(gVar, "connection");
        this.f42367d = tVar;
        this.f42368e = gVar;
        this.f42369f = iVar;
        this.f42370g = hVar;
        this.f42365b = new C19012a(iVar);
    }

    /* renamed from: i */
    public static final void m32166i(C19013b bVar, C19901m mVar) {
        bVar.getClass();
        C19890d0 d0Var = mVar.f43884e;
        C19890d0.C19891a aVar = C19890d0.f43871d;
        C19383o.m32797g(aVar, "delegate");
        mVar.f43884e = aVar;
        d0Var.mo72699a();
        d0Var.mo72700b();
    }

    /* renamed from: a */
    public final void mo70444a() {
        this.f42370g.flush();
    }

    /* renamed from: b */
    public final C19888c0 mo70445b(C20018z zVar) {
        if (!C19005e.m32152a(zVar)) {
            return mo70463j(0);
        }
        boolean z = true;
        if (C19457k.m33019W0("chunked", C20018z.m34284b(zVar, "Transfer-Encoding"), true)) {
            C19997p pVar = zVar.f44362c.f44342b;
            if (this.f42364a != 4) {
                z = false;
            }
            if (z) {
                this.f42364a = 5;
                return new C19016c(this, pVar);
            }
            StringBuilder h = C0072d.m201h("state: ");
            h.append(this.f42364a);
            throw new IllegalStateException(h.toString().toString());
        }
        long j = C18980c.m32106j(zVar);
        if (j != -1) {
            return mo70463j(j);
        }
        if (this.f42364a != 4) {
            z = false;
        }
        if (z) {
            this.f42364a = 5;
            this.f42368e.mo72930k();
            return new C19019f(this);
        }
        StringBuilder h2 = C0072d.m201h("state: ");
        h2.append(this.f42364a);
        throw new IllegalStateException(h2.toString().toString());
    }

    /* renamed from: c */
    public final C19976g mo70446c() {
        return this.f42368e;
    }

    public final void cancel() {
        Socket socket = this.f42368e.f44177b;
        if (socket != null) {
            C18980c.m32100d(socket);
        }
    }

    /* renamed from: d */
    public final long mo70448d(C20018z zVar) {
        if (!C19005e.m32152a(zVar)) {
            return 0;
        }
        if (C19457k.m33019W0("chunked", C20018z.m34284b(zVar, "Transfer-Encoding"), true)) {
            return -1;
        }
        return C18980c.m32106j(zVar);
    }

    /* renamed from: e */
    public final C19882a0 mo70449e(C20011u uVar, long j) {
        boolean z = true;
        if (C19457k.m33019W0("chunked", uVar.f44344d.mo72948a("Transfer-Encoding"), true)) {
            if (this.f42364a != 1) {
                z = false;
            }
            if (z) {
                this.f42364a = 2;
                return new C19015b();
            }
            StringBuilder h = C0072d.m201h("state: ");
            h.append(this.f42364a);
            throw new IllegalStateException(h.toString().toString());
        } else if (j != -1) {
            if (this.f42364a != 1) {
                z = false;
            }
            if (z) {
                this.f42364a = 2;
                return new C19018e();
            }
            StringBuilder h2 = C0072d.m201h("state: ");
            h2.append(this.f42364a);
            throw new IllegalStateException(h2.toString().toString());
        } else {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    /* renamed from: f */
    public final void mo70450f(C20011u uVar) {
        Proxy.Type type = this.f42368e.f44192q.f43996b.type();
        C19383o.m32796f(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append(uVar.f44343c);
        sb.append(' ');
        C19997p pVar = uVar.f44342b;
        if (!pVar.f44239a && type == Proxy.Type.HTTP) {
            sb.append(pVar);
        } else {
            String b = pVar.mo72965b();
            String d = pVar.mo72967d();
            if (d != null) {
                b = b + RFC1522Codec.SEP + d;
            }
            sb.append(b);
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        C19383o.m32796f(sb2, "StringBuilder().apply(builderAction).toString()");
        mo70464k(uVar.f44344d, sb2);
    }

    /* renamed from: g */
    public final C20018z.C20019a mo70451g(boolean z) {
        int i = this.f42364a;
        boolean z2 = true;
        if (!(i == 1 || i == 3)) {
            z2 = false;
        }
        if (z2) {
            C19997p.C19998a aVar = null;
            try {
                C19012a aVar2 = this.f42365b;
                String C = aVar2.f42363b.mo72710C(aVar2.f42362a);
                aVar2.f42362a -= (long) C.length();
                C19009i a = C19009i.C19010a.m32164a(C);
                C20018z.C20019a aVar3 = new C20018z.C20019a();
                Protocol protocol = a.f42359a;
                C19383o.m32797g(protocol, "protocol");
                aVar3.f44376b = protocol;
                aVar3.f44377c = a.f42360b;
                String str = a.f42361c;
                C19383o.m32797g(str, "message");
                aVar3.f44378d = str;
                aVar3.mo73009c(this.f42365b.mo70462a());
                if (z && a.f42360b == 100) {
                    return null;
                }
                if (a.f42360b == 100) {
                    this.f42364a = 3;
                } else {
                    this.f42364a = 4;
                }
                return aVar3;
            } catch (EOFException e) {
                C19997p pVar = this.f42368e.f44192q.f43995a.f43948a;
                pVar.getClass();
                try {
                    C19997p.C19998a aVar4 = new C19997p.C19998a();
                    aVar4.mo72980f("/...", pVar);
                    aVar = aVar4;
                } catch (IllegalArgumentException unused) {
                }
                C19383o.m32794d(aVar);
                C19997p.C19999b bVar = C19997p.f44238l;
                aVar.f44250b = C19997p.C19999b.m34232a(bVar, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251);
                aVar.f44251c = C19997p.C19999b.m34232a(bVar, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251);
                throw new IOException(C0326j.m864i("unexpected end of stream on ", aVar.mo72978d().f44248j), e);
            }
        } else {
            StringBuilder h = C0072d.m201h("state: ");
            h.append(this.f42364a);
            throw new IllegalStateException(h.toString().toString());
        }
    }

    /* renamed from: h */
    public final void mo70452h() {
        this.f42370g.flush();
    }

    /* renamed from: j */
    public final C19017d mo70463j(long j) {
        if (this.f42364a == 4) {
            this.f42364a = 5;
            return new C19017d(j);
        }
        StringBuilder h = C0072d.m201h("state: ");
        h.append(this.f42364a);
        throw new IllegalStateException(h.toString().toString());
    }

    /* renamed from: k */
    public final void mo70464k(C19994o oVar, String str) {
        C19383o.m32797g(oVar, "headers");
        C19383o.m32797g(str, "requestLine");
        if (this.f42364a == 0) {
            this.f42370g.mo72716H(str).mo72716H("\r\n");
            int length = oVar.f44235b.length / 2;
            for (int i = 0; i < length; i++) {
                this.f42370g.mo72716H(oVar.mo72949c(i)).mo72716H(": ").mo72716H(oVar.mo72955m(i)).mo72716H("\r\n");
            }
            this.f42370g.mo72716H("\r\n");
            this.f42364a = 1;
            return;
        }
        StringBuilder h = C0072d.m201h("state: ");
        h.append(this.f42364a);
        throw new IllegalStateException(h.toString().toString());
    }
}
