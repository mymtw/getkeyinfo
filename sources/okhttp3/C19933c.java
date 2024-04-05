package okhttp3;

import com.fasterxml.jackson.core.JsonFactory;
import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.C19394m;
import kotlin.collections.C19318k;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import kotlin.text.C19457k;
import kotlin.text.C19459m;
import okhttp3.C19994o;
import okhttp3.C20002r;
import okhttp3.Handshake;
import okhttp3.TlsVersion;
import okhttp3.internal.cache.C19959c;
import okhttp3.internal.cache.DiskLruCache;
import okio.ByteString;
import p568fn.C17782b;
import p735br.C18980c;
import p737cr.C18985d;
import p739dr.C19009i;
import p747hr.C19084h;
import p756lr.C19882a0;
import p756lr.C19888c0;
import p756lr.C19893f;
import p756lr.C19897i;
import p756lr.C19899k;
import p756lr.C19900l;
import p756lr.C19906r;
import p756lr.C19912w;
import p756lr.C19913x;

/* renamed from: okhttp3.c */
public final class C19933c implements Closeable, Flushable {

    /* renamed from: c */
    public static final C19936b f43969c = new C19936b();

    /* renamed from: b */
    public final DiskLruCache f43970b;

    /* renamed from: okhttp3.c$a */
    public static final class C19934a extends C19928a0 {

        /* renamed from: d */
        public final C19913x f43971d;

        /* renamed from: e */
        public final DiskLruCache.C19955b f43972e;

        /* renamed from: f */
        public final String f43973f;

        /* renamed from: g */
        public final String f43974g;

        /* renamed from: okhttp3.c$a$a */
        public static final class C19935a extends C19900l {

            /* renamed from: c */
            public final /* synthetic */ C19934a f43975c;

            /* renamed from: d */
            public final /* synthetic */ C19888c0 f43976d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C19935a(C19934a aVar, C19888c0 c0Var, C19888c0 c0Var2) {
                super(c0Var2);
                this.f43975c = aVar;
                this.f43976d = c0Var;
            }

            public final void close() throws IOException {
                this.f43975c.f43972e.close();
                super.close();
            }
        }

        public C19934a(DiskLruCache.C19955b bVar, String str, String str2) {
            this.f43972e = bVar;
            this.f43973f = str;
            this.f43974g = str2;
            C19888c0 c0Var = bVar.f44105d.get(1);
            this.f43971d = C19906r.m33998b(new C19935a(this, c0Var, c0Var));
        }

        /* renamed from: d */
        public final long mo70456d() {
            String str = this.f43974g;
            if (str == null) {
                return -1;
            }
            byte[] bArr = C18980c.f42301a;
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        /* renamed from: e */
        public final C20002r mo70457e() {
            String str = this.f43973f;
            if (str == null) {
                return null;
            }
            C20002r.f44260f.getClass();
            return C20002r.C20003a.m34244b(str);
        }

        /* renamed from: f */
        public final C19897i mo70458f() {
            return this.f43971d;
        }
    }

    /* renamed from: okhttp3.c$b */
    public static final class C19936b {
        /* renamed from: a */
        public static String m34090a(C19997p pVar) {
            C19383o.m32797g(pVar, "url");
            ByteString.C20020a aVar = ByteString.Companion;
            String str = pVar.f44248j;
            aVar.getClass();
            return ByteString.C20020a.m34295c(str).md5().hex();
        }

        /* renamed from: b */
        public static int m34091b(C19913x xVar) throws IOException {
            try {
                long b = xVar.mo72797b();
                String L = xVar.mo72719L();
                if (b >= 0 && b <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER)) {
                    if (!(L.length() > 0)) {
                        return (int) b;
                    }
                }
                throw new IOException("expected an int but was \"" + b + L + JsonFactory.DEFAULT_QUOTE_CHAR);
            } catch (NumberFormatException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: c */
        public static Set m34092c(C19994o oVar) {
            int length = oVar.f44235b.length / 2;
            TreeSet treeSet = null;
            for (int i = 0; i < length; i++) {
                if (C19457k.m33019W0("Vary", oVar.mo72949c(i), true)) {
                    String m = oVar.mo72955m(i);
                    if (treeSet == null) {
                        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                        C19383o.m32796f(comparator, "CASE_INSENSITIVE_ORDER");
                        treeSet = new TreeSet(comparator);
                    }
                    for (String str : C19459m.m33055x1(m, new char[]{','}, 0, 6)) {
                        if (str != null) {
                            treeSet.add(C19459m.m33035H1(str).toString());
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                        }
                    }
                    continue;
                }
            }
            return treeSet != null ? treeSet : EmptySet.INSTANCE;
        }
    }

    /* renamed from: okhttp3.c$d */
    public final class C19938d implements C19959c {

        /* renamed from: a */
        public final C19882a0 f43989a;

        /* renamed from: b */
        public final C19939a f43990b;

        /* renamed from: c */
        public boolean f43991c;

        /* renamed from: d */
        public final DiskLruCache.Editor f43992d;

        /* renamed from: okhttp3.c$d$a */
        public static final class C19939a extends C19899k {

            /* renamed from: c */
            public final /* synthetic */ C19938d f43994c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C19939a(C19938d dVar, C19882a0 a0Var) {
                super(a0Var);
                this.f43994c = dVar;
            }

            public final void close() throws IOException {
                synchronized (C19933c.this) {
                    C19938d dVar = this.f43994c;
                    if (!dVar.f43991c) {
                        dVar.f43991c = true;
                        C19933c.this.getClass();
                        super.close();
                        this.f43994c.f43992d.mo72895b();
                    }
                }
            }
        }

        public C19938d(DiskLruCache.Editor editor) {
            this.f43992d = editor;
            C19882a0 d = editor.mo72897d(1);
            this.f43989a = d;
            this.f43990b = new C19939a(this, d);
        }

        public final void abort() {
            synchronized (C19933c.this) {
                if (!this.f43991c) {
                    this.f43991c = true;
                    C19933c.this.getClass();
                    C18980c.m32099c(this.f43989a);
                    try {
                        this.f43992d.mo72894a();
                    } catch (IOException unused) {
                    }
                }
            }
        }
    }

    public C19933c(File file, long j) {
        this.f43970b = new DiskLruCache(file, j, C18985d.f42320h);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72847a(okhttp3.C20011u r7) throws java.io.IOException {
        /*
            r6 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.C19383o.m32797g(r7, r0)
            okhttp3.internal.cache.DiskLruCache r0 = r6.f43970b
            okhttp3.c$b r1 = f43969c
            okhttp3.p r7 = r7.f44342b
            r1.getClass()
            java.lang.String r7 = okhttp3.C19933c.C19936b.m34090a(r7)
            monitor-enter(r0)
            java.lang.String r1 = "key"
            kotlin.jvm.internal.C19383o.m32797g(r7, r1)     // Catch:{ all -> 0x003d }
            r0.mo72885f()     // Catch:{ all -> 0x003d }
            r0.mo72880a()     // Catch:{ all -> 0x003d }
            okhttp3.internal.cache.DiskLruCache.m34117t(r7)     // Catch:{ all -> 0x003d }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$a> r1 = r0.f44074h     // Catch:{ all -> 0x003d }
            java.lang.Object r7 = r1.get(r7)     // Catch:{ all -> 0x003d }
            okhttp3.internal.cache.DiskLruCache$a r7 = (okhttp3.internal.cache.DiskLruCache.C19954a) r7     // Catch:{ all -> 0x003d }
            r1 = 0
            if (r7 == 0) goto L_0x003b
            r0.mo72892n(r7)     // Catch:{ all -> 0x003d }
            long r2 = r0.f44072f     // Catch:{ all -> 0x003d }
            long r4 = r0.f44068b     // Catch:{ all -> 0x003d }
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 > 0) goto L_0x0039
            r0.f44080n = r1     // Catch:{ all -> 0x003d }
        L_0x0039:
            monitor-exit(r0)
            goto L_0x003c
        L_0x003b:
            monitor-exit(r0)
        L_0x003c:
            return
        L_0x003d:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.C19933c.mo72847a(okhttp3.u):void");
    }

    public final void close() throws IOException {
        this.f43970b.close();
    }

    public final void flush() throws IOException {
        this.f43970b.flush();
    }

    /* renamed from: okhttp3.c$c */
    public static final class C19937c {

        /* renamed from: k */
        public static final String f43977k = "OkHttp-Sent-Millis";

        /* renamed from: l */
        public static final String f43978l = "OkHttp-Received-Millis";

        /* renamed from: a */
        public final String f43979a;

        /* renamed from: b */
        public final C19994o f43980b;

        /* renamed from: c */
        public final String f43981c;

        /* renamed from: d */
        public final Protocol f43982d;

        /* renamed from: e */
        public final int f43983e;

        /* renamed from: f */
        public final String f43984f;

        /* renamed from: g */
        public final C19994o f43985g;

        /* renamed from: h */
        public final Handshake f43986h;

        /* renamed from: i */
        public final long f43987i;

        /* renamed from: j */
        public final long f43988j;

        static {
            C19084h.C19085a aVar = C19084h.f42595c;
            aVar.getClass();
            C19084h.f42593a.getClass();
            aVar.getClass();
            C19084h.f42593a.getClass();
        }

        public C19937c(C19888c0 c0Var) throws IOException {
            TlsVersion tlsVersion;
            C19383o.m32797g(c0Var, "rawSource");
            try {
                C19913x b = C19906r.m33998b(c0Var);
                this.f43979a = b.mo72719L();
                this.f43981c = b.mo72719L();
                C19994o.C19995a aVar = new C19994o.C19995a();
                C19933c.f43969c.getClass();
                int b2 = C19936b.m34091b(b);
                boolean z = false;
                for (int i = 0; i < b2; i++) {
                    aVar.mo72959b(b.mo72719L());
                }
                this.f43980b = aVar.mo72961d();
                C19009i a = C19009i.C19010a.m32164a(b.mo72719L());
                this.f43982d = a.f42359a;
                this.f43983e = a.f42360b;
                this.f43984f = a.f42361c;
                C19994o.C19995a aVar2 = new C19994o.C19995a();
                C19933c.f43969c.getClass();
                int b3 = C19936b.m34091b(b);
                for (int i2 = 0; i2 < b3; i2++) {
                    aVar2.mo72959b(b.mo72719L());
                }
                String str = f43977k;
                String e = aVar2.mo72962e(str);
                String str2 = f43978l;
                String e2 = aVar2.mo72962e(str2);
                aVar2.mo72963f(str);
                aVar2.mo72963f(str2);
                long j = 0;
                this.f43987i = e != null ? Long.parseLong(e) : 0;
                this.f43988j = e2 != null ? Long.parseLong(e2) : j;
                this.f43985g = aVar2.mo72961d();
                if (C19457k.m33025c1(this.f43979a, "https://", false)) {
                    String L = b.mo72719L();
                    if (!(L.length() > 0 ? true : z)) {
                        C19947g b4 = C19947g.f44037t.mo72864b(b.mo72719L());
                        List a2 = m34093a(b);
                        List a3 = m34093a(b);
                        if (!b.mo72733e0()) {
                            TlsVersion.C19926a aVar3 = TlsVersion.Companion;
                            String L2 = b.mo72719L();
                            aVar3.getClass();
                            tlsVersion = TlsVersion.C19926a.m34074a(L2);
                        } else {
                            tlsVersion = TlsVersion.SSL_3_0;
                        }
                        Handshake.f43943e.getClass();
                        this.f43986h = Handshake.Companion.m34072b(tlsVersion, b4, a2, a3);
                    } else {
                        throw new IOException("expected \"\" but was \"" + L + JsonFactory.DEFAULT_QUOTE_CHAR);
                    }
                } else {
                    this.f43986h = null;
                }
            } finally {
                c0Var.close();
            }
        }

        /* renamed from: a */
        public static List m34093a(C19913x xVar) throws IOException {
            C19933c.f43969c.getClass();
            int b = C19936b.m34091b(xVar);
            if (b == -1) {
                return EmptyList.INSTANCE;
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(b);
                for (int i = 0; i < b; i++) {
                    String L = xVar.mo72719L();
                    C19893f fVar = new C19893f();
                    ByteString.Companion.getClass();
                    ByteString a = ByteString.C20020a.m34293a(L);
                    C19383o.m32794d(a);
                    fVar.mo72747m0(a);
                    arrayList.add(instance.generateCertificate(new C19893f.C19894a(fVar)));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: b */
        public static void m34094b(C19912w wVar, List list) throws IOException {
            try {
                wVar.mo72724V((long) list.size());
                wVar.writeByte(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    byte[] encoded = ((Certificate) list.get(i)).getEncoded();
                    ByteString.C20020a aVar = ByteString.Companion;
                    C19383o.m32796f(encoded, "bytes");
                    int length = encoded.length;
                    aVar.getClass();
                    C17782b.m29843I((long) encoded.length, (long) 0, (long) length);
                    wVar.mo72716H(new ByteString(C19318k.m32606X0(0, length + 0, encoded)).base64());
                    wVar.writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: c */
        public final void mo72850c(DiskLruCache.Editor editor) throws IOException {
            C19912w a = C19906r.m33997a(editor.mo72897d(0));
            try {
                a.mo72716H(this.f43979a);
                a.writeByte(10);
                a.mo72716H(this.f43981c);
                a.writeByte(10);
                a.mo72724V((long) (this.f43980b.f44235b.length / 2));
                a.writeByte(10);
                int length = this.f43980b.f44235b.length / 2;
                for (int i = 0; i < length; i++) {
                    a.mo72716H(this.f43980b.mo72949c(i));
                    a.mo72716H(": ");
                    a.mo72716H(this.f43980b.mo72955m(i));
                    a.writeByte(10);
                }
                Protocol protocol = this.f43982d;
                int i2 = this.f43983e;
                String str = this.f43984f;
                C19383o.m32797g(protocol, "protocol");
                C19383o.m32797g(str, "message");
                StringBuilder sb = new StringBuilder();
                if (protocol == Protocol.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(i2);
                sb.append(' ');
                sb.append(str);
                String sb2 = sb.toString();
                C19383o.m32796f(sb2, "StringBuilder().apply(builderAction).toString()");
                a.mo72716H(sb2);
                a.writeByte(10);
                a.mo72724V((long) ((this.f43985g.f44235b.length / 2) + 2));
                a.writeByte(10);
                int length2 = this.f43985g.f44235b.length / 2;
                for (int i3 = 0; i3 < length2; i3++) {
                    a.mo72716H(this.f43985g.mo72949c(i3));
                    a.mo72716H(": ");
                    a.mo72716H(this.f43985g.mo72955m(i3));
                    a.writeByte(10);
                }
                a.mo72716H(f43977k);
                a.mo72716H(": ");
                a.mo72724V(this.f43987i);
                a.writeByte(10);
                a.mo72716H(f43978l);
                a.mo72716H(": ");
                a.mo72724V(this.f43988j);
                a.writeByte(10);
                if (C19457k.m33025c1(this.f43979a, "https://", false)) {
                    a.writeByte(10);
                    Handshake handshake = this.f43986h;
                    C19383o.m32794d(handshake);
                    a.mo72716H(handshake.f43946c.f44038a);
                    a.writeByte(10);
                    m34094b(a, this.f43986h.mo72830a());
                    m34094b(a, this.f43986h.f43947d);
                    a.mo72716H(this.f43986h.f43945b.javaName());
                    a.writeByte(10);
                }
                C19394m mVar = C19394m.f43287a;
                C19421p.m32917E(a, (Throwable) null);
            } catch (Throwable th) {
                C19421p.m32917E(a, th);
                throw th;
            }
        }

        public C19937c(C20018z zVar) {
            C19994o oVar;
            this.f43979a = zVar.f44362c.f44342b.f44248j;
            C19933c.f43969c.getClass();
            C20018z zVar2 = zVar.f44369j;
            C19383o.m32794d(zVar2);
            C19994o oVar2 = zVar2.f44362c.f44344d;
            Set c = C19936b.m34092c(zVar.f44367h);
            if (c.isEmpty()) {
                oVar = C18980c.f42302b;
            } else {
                C19994o.C19995a aVar = new C19994o.C19995a();
                int length = oVar2.f44235b.length / 2;
                for (int i = 0; i < length; i++) {
                    String c2 = oVar2.mo72949c(i);
                    if (c.contains(c2)) {
                        aVar.mo72958a(c2, oVar2.mo72955m(i));
                    }
                }
                oVar = aVar.mo72961d();
            }
            this.f43980b = oVar;
            this.f43981c = zVar.f44362c.f44343c;
            this.f43982d = zVar.f44363d;
            this.f43983e = zVar.f44365f;
            this.f43984f = zVar.f44364e;
            this.f43985g = zVar.f44367h;
            this.f43986h = zVar.f44366g;
            this.f43987i = zVar.f44372m;
            this.f43988j = zVar.f44373n;
        }
    }
}
