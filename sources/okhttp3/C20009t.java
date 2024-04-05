package okhttp3;

import android.support.p013v4.media.session.PlaybackStateCompat;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.requests.EtsyRequest;
import com.facebook.login.LoginFragment;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.C19324q;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19944e;
import okhttp3.C19989m;
import okhttp3.internal.connection.C19971e;
import okhttp3.internal.connection.C19979j;
import p241t2.C7949h;
import p383ke.C12995a;
import p387la.C13005a;
import p735br.C18978a;
import p735br.C18980c;
import p747hr.C19084h;
import p754kr.C19871c;
import p754kr.C19872d;

/* renamed from: okhttp3.t */
public final class C20009t implements Cloneable, C19944e.C19945a {

    /* renamed from: F */
    public static final List<Protocol> f44279F = C18980c.m32107k(Protocol.HTTP_2, Protocol.HTTP_1_1);

    /* renamed from: G */
    public static final List<C19950h> f44280G = C18980c.m32107k(C19950h.f44039e, C19950h.f44040f);

    /* renamed from: A */
    public final int f44281A;

    /* renamed from: B */
    public final int f44282B;

    /* renamed from: C */
    public final int f44283C;

    /* renamed from: D */
    public final long f44284D;

    /* renamed from: E */
    public final C19979j f44285E;

    /* renamed from: b */
    public final C19985k f44286b;

    /* renamed from: c */
    public final C7949h f44287c;

    /* renamed from: d */
    public final List<C20000q> f44288d;

    /* renamed from: e */
    public final List<C20000q> f44289e;

    /* renamed from: f */
    public final C19989m.C19991b f44290f;

    /* renamed from: g */
    public final boolean f44291g;

    /* renamed from: h */
    public final C19931b f44292h;

    /* renamed from: i */
    public final boolean f44293i;

    /* renamed from: j */
    public final boolean f44294j;

    /* renamed from: k */
    public final C19984j f44295k;

    /* renamed from: l */
    public final C19933c f44296l;

    /* renamed from: m */
    public final C19986l f44297m;

    /* renamed from: n */
    public final Proxy f44298n;

    /* renamed from: o */
    public final ProxySelector f44299o;

    /* renamed from: p */
    public final C19931b f44300p;

    /* renamed from: q */
    public final SocketFactory f44301q;

    /* renamed from: r */
    public final SSLSocketFactory f44302r;

    /* renamed from: s */
    public final X509TrustManager f44303s;

    /* renamed from: t */
    public final List<C19950h> f44304t;

    /* renamed from: u */
    public final List<Protocol> f44305u;

    /* renamed from: v */
    public final HostnameVerifier f44306v;

    /* renamed from: w */
    public final CertificatePinner f44307w;

    /* renamed from: x */
    public final C19871c f44308x;

    /* renamed from: y */
    public final int f44309y;

    /* renamed from: z */
    public final int f44310z;

    /* renamed from: okhttp3.t$a */
    public static final class C20010a {

        /* renamed from: A */
        public int f44311A;

        /* renamed from: B */
        public int f44312B;

        /* renamed from: C */
        public long f44313C;

        /* renamed from: D */
        public C19979j f44314D;

        /* renamed from: a */
        public C19985k f44315a = new C19985k();

        /* renamed from: b */
        public C7949h f44316b = new C7949h(3);

        /* renamed from: c */
        public final ArrayList f44317c = new ArrayList();

        /* renamed from: d */
        public final ArrayList f44318d = new ArrayList();

        /* renamed from: e */
        public C19989m.C19991b f44319e;

        /* renamed from: f */
        public boolean f44320f;

        /* renamed from: g */
        public C19931b f44321g;

        /* renamed from: h */
        public boolean f44322h;

        /* renamed from: i */
        public boolean f44323i;

        /* renamed from: j */
        public C19984j f44324j;

        /* renamed from: k */
        public C19933c f44325k;

        /* renamed from: l */
        public C19986l f44326l;

        /* renamed from: m */
        public Proxy f44327m;

        /* renamed from: n */
        public ProxySelector f44328n;

        /* renamed from: o */
        public C19931b f44329o;

        /* renamed from: p */
        public SocketFactory f44330p;

        /* renamed from: q */
        public SSLSocketFactory f44331q;

        /* renamed from: r */
        public X509TrustManager f44332r;

        /* renamed from: s */
        public List<C19950h> f44333s;

        /* renamed from: t */
        public List<? extends Protocol> f44334t;

        /* renamed from: u */
        public HostnameVerifier f44335u;

        /* renamed from: v */
        public CertificatePinner f44336v;

        /* renamed from: w */
        public C19871c f44337w;

        /* renamed from: x */
        public int f44338x;

        /* renamed from: y */
        public int f44339y;

        /* renamed from: z */
        public int f44340z;

        public C20010a() {
            C19989m.C19990a aVar = C19989m.f44227a;
            byte[] bArr = C18980c.f42301a;
            C19383o.m32797g(aVar, "$this$asFactory");
            this.f44319e = new C18978a(aVar);
            this.f44320f = true;
            C12995a aVar2 = C19931b.f43965f1;
            this.f44321g = aVar2;
            this.f44322h = true;
            this.f44323i = true;
            this.f44324j = C19984j.f44217g1;
            this.f44326l = C19986l.f44222h1;
            this.f44329o = aVar2;
            SocketFactory socketFactory = SocketFactory.getDefault();
            C19383o.m32796f(socketFactory, "SocketFactory.getDefault()");
            this.f44330p = socketFactory;
            this.f44333s = C20009t.f44280G;
            this.f44334t = C20009t.f44279F;
            this.f44335u = C19872d.f43855a;
            this.f44336v = CertificatePinner.f43935c;
            this.f44339y = EtsyRequest.DEFAULT_TIMEOUT;
            this.f44340z = EtsyRequest.DEFAULT_TIMEOUT;
            this.f44311A = EtsyRequest.DEFAULT_TIMEOUT;
            this.f44313C = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        }

        /* renamed from: a */
        public final void mo72993a(C20000q qVar) {
            C19383o.m32797g(qVar, "interceptor");
            this.f44317c.add(qVar);
        }

        /* renamed from: b */
        public final void mo72994b(long j, TimeUnit timeUnit) {
            C19383o.m32797g(timeUnit, ResponseConstants.UNIT);
            this.f44339y = C18980c.m32098b(j, timeUnit);
        }

        /* renamed from: c */
        public final void mo72995c(long j, TimeUnit timeUnit) {
            C19383o.m32797g(timeUnit, ResponseConstants.UNIT);
            this.f44340z = C18980c.m32098b(j, timeUnit);
        }

        /* renamed from: d */
        public final void mo72996d(C13005a aVar, X509TrustManager x509TrustManager) {
            if ((!C19383o.m32792b(aVar, this.f44331q)) || (!C19383o.m32792b(x509TrustManager, this.f44332r))) {
                this.f44314D = null;
            }
            this.f44331q = aVar;
            C19084h.f42595c.getClass();
            this.f44337w = C19084h.f42593a.mo70556b(x509TrustManager);
            this.f44332r = x509TrustManager;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0218  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C20009t(okhttp3.C20009t.C20010a r7) {
        /*
            r6 = this;
            r6.<init>()
            okhttp3.k r0 = r7.f44315a
            r6.f44286b = r0
            t2.h r0 = r7.f44316b
            r6.f44287c = r0
            java.util.ArrayList r0 = r7.f44317c
            java.util.List r0 = p735br.C18980c.m32118v(r0)
            r6.f44288d = r0
            java.util.ArrayList r0 = r7.f44318d
            java.util.List r0 = p735br.C18980c.m32118v(r0)
            r6.f44289e = r0
            okhttp3.m$b r0 = r7.f44319e
            r6.f44290f = r0
            boolean r0 = r7.f44320f
            r6.f44291g = r0
            okhttp3.b r0 = r7.f44321g
            r6.f44292h = r0
            boolean r0 = r7.f44322h
            r6.f44293i = r0
            boolean r0 = r7.f44323i
            r6.f44294j = r0
            okhttp3.j r0 = r7.f44324j
            r6.f44295k = r0
            okhttp3.c r0 = r7.f44325k
            r6.f44296l = r0
            okhttp3.l r0 = r7.f44326l
            r6.f44297m = r0
            java.net.Proxy r0 = r7.f44327m
            r6.f44298n = r0
            if (r0 == 0) goto L_0x0044
            jr.a r0 = p751jr.C19280a.f43147a
            goto L_0x0052
        L_0x0044:
            java.net.ProxySelector r0 = r7.f44328n
            if (r0 == 0) goto L_0x0049
            goto L_0x004d
        L_0x0049:
            java.net.ProxySelector r0 = java.net.ProxySelector.getDefault()
        L_0x004d:
            if (r0 == 0) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            jr.a r0 = p751jr.C19280a.f43147a
        L_0x0052:
            r6.f44299o = r0
            okhttp3.b r0 = r7.f44329o
            r6.f44300p = r0
            javax.net.SocketFactory r0 = r7.f44330p
            r6.f44301q = r0
            java.util.List<okhttp3.h> r0 = r7.f44333s
            r6.f44304t = r0
            java.util.List<? extends okhttp3.Protocol> r1 = r7.f44334t
            r6.f44305u = r1
            javax.net.ssl.HostnameVerifier r1 = r7.f44335u
            r6.f44306v = r1
            int r1 = r7.f44338x
            r6.f44309y = r1
            int r1 = r7.f44339y
            r6.f44310z = r1
            int r1 = r7.f44340z
            r6.f44281A = r1
            int r1 = r7.f44311A
            r6.f44282B = r1
            int r1 = r7.f44312B
            r6.f44283C = r1
            long r1 = r7.f44313C
            r6.f44284D = r1
            okhttp3.internal.connection.j r1 = r7.f44314D
            if (r1 == 0) goto L_0x0085
            goto L_0x008a
        L_0x0085:
            okhttp3.internal.connection.j r1 = new okhttp3.internal.connection.j
            r1.<init>()
        L_0x008a:
            r6.f44285E = r1
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0099
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0099
            goto L_0x00af
        L_0x0099:
            java.util.Iterator r0 = r0.iterator()
        L_0x009d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00af
            java.lang.Object r1 = r0.next()
            okhttp3.h r1 = (okhttp3.C19950h) r1
            boolean r1 = r1.f44041a
            if (r1 == 0) goto L_0x009d
            r0 = r2
            goto L_0x00b0
        L_0x00af:
            r0 = r3
        L_0x00b0:
            r1 = 0
            if (r0 == 0) goto L_0x00be
            r6.f44302r = r1
            r6.f44308x = r1
            r6.f44303s = r1
            okhttp3.CertificatePinner r7 = okhttp3.CertificatePinner.f43935c
            r6.f44307w = r7
            goto L_0x0123
        L_0x00be:
            javax.net.ssl.SSLSocketFactory r0 = r7.f44331q
            if (r0 == 0) goto L_0x00e8
            r6.f44302r = r0
            kr.c r0 = r7.f44337w
            kotlin.jvm.internal.C19383o.m32794d(r0)
            r6.f44308x = r0
            javax.net.ssl.X509TrustManager r4 = r7.f44332r
            kotlin.jvm.internal.C19383o.m32794d(r4)
            r6.f44303s = r4
            okhttp3.CertificatePinner r7 = r7.f44336v
            kr.c r4 = r7.f43938b
            boolean r4 = kotlin.jvm.internal.C19383o.m32792b(r4, r0)
            if (r4 == 0) goto L_0x00dd
            goto L_0x00e5
        L_0x00dd:
            okhttp3.CertificatePinner r4 = new okhttp3.CertificatePinner
            java.util.Set<okhttp3.CertificatePinner$c> r7 = r7.f43937a
            r4.<init>(r7, r0)
            r7 = r4
        L_0x00e5:
            r6.f44307w = r7
            goto L_0x0123
        L_0x00e8:
            hr.h$a r0 = p747hr.C19084h.f42595c
            r0.getClass()
            hr.h r4 = p747hr.C19084h.f42593a
            javax.net.ssl.X509TrustManager r4 = r4.mo70569n()
            r6.f44303s = r4
            hr.h r5 = p747hr.C19084h.f42593a
            kotlin.jvm.internal.C19383o.m32794d(r4)
            javax.net.ssl.SSLSocketFactory r5 = r5.mo70570m(r4)
            r6.f44302r = r5
            r0.getClass()
            hr.h r0 = p747hr.C19084h.f42593a
            kr.c r0 = r0.mo70556b(r4)
            r6.f44308x = r0
            okhttp3.CertificatePinner r7 = r7.f44336v
            kotlin.jvm.internal.C19383o.m32794d(r0)
            kr.c r4 = r7.f43938b
            boolean r4 = kotlin.jvm.internal.C19383o.m32792b(r4, r0)
            if (r4 == 0) goto L_0x0119
            goto L_0x0121
        L_0x0119:
            okhttp3.CertificatePinner r4 = new okhttp3.CertificatePinner
            java.util.Set<okhttp3.CertificatePinner$c> r7 = r7.f43937a
            r4.<init>(r7, r0)
            r7 = r4
        L_0x0121:
            r6.f44307w = r7
        L_0x0123:
            java.util.List<okhttp3.q> r7 = r6.f44288d
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>"
            if (r7 == 0) goto L_0x0218
            boolean r7 = r7.contains(r1)
            r7 = r7 ^ r3
            if (r7 == 0) goto L_0x01ff
            java.util.List<okhttp3.q> r7 = r6.f44289e
            if (r7 == 0) goto L_0x01f9
            boolean r7 = r7.contains(r1)
            r7 = r7 ^ r3
            if (r7 == 0) goto L_0x01e0
            java.util.List<okhttp3.h> r7 = r6.f44304t
            boolean r0 = r7 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0148
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0148
            goto L_0x015e
        L_0x0148:
            java.util.Iterator r7 = r7.iterator()
        L_0x014c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x015e
            java.lang.Object r0 = r7.next()
            okhttp3.h r0 = (okhttp3.C19950h) r0
            boolean r0 = r0.f44041a
            if (r0 == 0) goto L_0x014c
            r7 = r2
            goto L_0x015f
        L_0x015e:
            r7 = r3
        L_0x015f:
            if (r7 == 0) goto L_0x01af
            javax.net.ssl.SSLSocketFactory r7 = r6.f44302r
            if (r7 != 0) goto L_0x0167
            r7 = r3
            goto L_0x0168
        L_0x0167:
            r7 = r2
        L_0x0168:
            java.lang.String r0 = "Check failed."
            if (r7 == 0) goto L_0x01a5
            kr.c r7 = r6.f44308x
            if (r7 != 0) goto L_0x0172
            r7 = r3
            goto L_0x0173
        L_0x0172:
            r7 = r2
        L_0x0173:
            if (r7 == 0) goto L_0x019b
            javax.net.ssl.X509TrustManager r7 = r6.f44303s
            if (r7 != 0) goto L_0x017a
            r2 = r3
        L_0x017a:
            if (r2 == 0) goto L_0x0191
            okhttp3.CertificatePinner r7 = r6.f44307w
            okhttp3.CertificatePinner r1 = okhttp3.CertificatePinner.f43935c
            boolean r7 = kotlin.jvm.internal.C19383o.m32792b(r7, r1)
            if (r7 == 0) goto L_0x0187
            goto L_0x01bb
        L_0x0187:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x0191:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x019b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x01a5:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x01af:
            javax.net.ssl.SSLSocketFactory r7 = r6.f44302r
            if (r7 == 0) goto L_0x01d4
            kr.c r7 = r6.f44308x
            if (r7 == 0) goto L_0x01c8
            javax.net.ssl.X509TrustManager r7 = r6.f44303s
            if (r7 == 0) goto L_0x01bc
        L_0x01bb:
            return
        L_0x01bc:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "x509TrustManager == null"
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x01c8:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "certificateChainCleaner == null"
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x01d4:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "sslSocketFactory == null"
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x01e0:
            java.lang.String r7 = "Null network interceptor: "
            java.lang.StringBuilder r7 = android.support.p013v4.media.C0072d.m201h(r7)
            java.util.List<okhttp3.q> r0 = r6.f44289e
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            throw r0
        L_0x01f9:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            r7.<init>(r0)
            throw r7
        L_0x01ff:
            java.lang.String r7 = "Null interceptor: "
            java.lang.StringBuilder r7 = android.support.p013v4.media.C0072d.m201h(r7)
            java.util.List<okhttp3.q> r0 = r6.f44288d
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            throw r0
        L_0x0218:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.C20009t.<init>(okhttp3.t$a):void");
    }

    /* renamed from: a */
    public final C19944e mo20743a(C20011u uVar) {
        C19383o.m32797g(uVar, LoginFragment.EXTRA_REQUEST);
        return new C19971e(this, uVar, false);
    }

    /* renamed from: b */
    public final C20010a mo72991b() {
        C20010a aVar = new C20010a();
        aVar.f44315a = this.f44286b;
        aVar.f44316b = this.f44287c;
        C19324q.m32628J0(this.f44288d, aVar.f44317c);
        C19324q.m32628J0(this.f44289e, aVar.f44318d);
        aVar.f44319e = this.f44290f;
        aVar.f44320f = this.f44291g;
        aVar.f44321g = this.f44292h;
        aVar.f44322h = this.f44293i;
        aVar.f44323i = this.f44294j;
        aVar.f44324j = this.f44295k;
        aVar.f44325k = this.f44296l;
        aVar.f44326l = this.f44297m;
        aVar.f44327m = this.f44298n;
        aVar.f44328n = this.f44299o;
        aVar.f44329o = this.f44300p;
        aVar.f44330p = this.f44301q;
        aVar.f44331q = this.f44302r;
        aVar.f44332r = this.f44303s;
        aVar.f44333s = this.f44304t;
        aVar.f44334t = this.f44305u;
        aVar.f44335u = this.f44306v;
        aVar.f44336v = this.f44307w;
        aVar.f44337w = this.f44308x;
        aVar.f44338x = this.f44309y;
        aVar.f44339y = this.f44310z;
        aVar.f44340z = this.f44281A;
        aVar.f44311A = this.f44282B;
        aVar.f44312B = this.f44283C;
        aVar.f44313C = this.f44284D;
        aVar.f44314D = this.f44285E;
        return aVar;
    }

    public final Object clone() {
        return super.clone();
    }

    public C20009t() {
        this(new C20010a());
    }
}
