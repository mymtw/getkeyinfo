package p365hg;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.appboy.Constants;
import com.facebook.login.LoginFragment;
import com.facebook.login.widget.ProfilePictureView;
import java.util.HashMap;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p365hg.C12885n0;
import p365hg.C12910u;
import p401mg.C13080a;

/* renamed from: hg.t */
public final class C12904t {

    /* renamed from: a */
    public static Handler f28453a;

    /* renamed from: b */
    public static final C12885n0 f28454b = new C12885n0(8);

    /* renamed from: c */
    public static final C12885n0 f28455c = new C12885n0(2);

    /* renamed from: d */
    public static final HashMap f28456d = new HashMap();

    /* renamed from: e */
    public static final C12904t f28457e = new C12904t();

    /* renamed from: hg.t$a */
    public static final class C12905a implements Runnable {

        /* renamed from: b */
        public final C12908d f28458b;

        /* renamed from: c */
        public final boolean f28459c;

        public C12905a(C12908d dVar, boolean z) {
            this.f28458b = dVar;
            this.f28459c = z;
        }

        public final void run() {
            if (!C13080a.m20762b(this)) {
                try {
                    Handler handler = C12904t.f28453a;
                    C12904t.m20617b(this.f28458b, this.f28459c);
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            }
        }
    }

    /* renamed from: hg.t$b */
    public static final class C12906b implements Runnable {

        /* renamed from: b */
        public final C12908d f28460b;

        public C12906b(C12908d dVar) {
            C19383o.m32797g(dVar, "key");
            this.f28460b = dVar;
        }

        public final void run() {
            if (!C13080a.m20762b(this)) {
                try {
                    Handler handler = C12904t.f28453a;
                    C12904t.m20616a(this.f28460b);
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            }
        }
    }

    /* renamed from: hg.t$c */
    public static final class C12907c {

        /* renamed from: a */
        public C12885n0.C12887b f28461a;

        /* renamed from: b */
        public boolean f28462b;

        /* renamed from: c */
        public C12910u f28463c;

        public C12907c(C12910u uVar) {
            C19383o.m32797g(uVar, LoginFragment.EXTRA_REQUEST);
            this.f28463c = uVar;
        }
    }

    /* renamed from: hg.t$d */
    public static final class C12908d {

        /* renamed from: a */
        public Uri f28464a;

        /* renamed from: b */
        public Object f28465b;

        public C12908d(Uri uri, Object obj) {
            C19383o.m32797g(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
            C19383o.m32797g(obj, "tag");
            this.f28464a = uri;
            this.f28465b = obj;
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C12908d)) {
                return false;
            }
            C12908d dVar = (C12908d) obj;
            return dVar.f28464a == this.f28464a && dVar.f28465b == this.f28465b;
        }

        public final int hashCode() {
            return this.f28465b.hashCode() + ((this.f28464a.hashCode() + 1073) * 37);
        }
    }

    /* renamed from: hg.t$e */
    public static final class C12909e implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C12910u f28466b;

        /* renamed from: c */
        public final /* synthetic */ Exception f28467c;

        /* renamed from: d */
        public final /* synthetic */ boolean f28468d;

        /* renamed from: e */
        public final /* synthetic */ Bitmap f28469e;

        /* renamed from: f */
        public final /* synthetic */ C12910u.C12911a f28470f;

        public C12909e(C12910u uVar, Exception exc, boolean z, Bitmap bitmap, C12910u.C12911a aVar) {
            this.f28466b = uVar;
            this.f28467c = exc;
            this.f28468d = z;
            this.f28469e = bitmap;
            this.f28470f = aVar;
        }

        public final void run() {
            if (!C13080a.m20762b(this)) {
                try {
                    ProfilePictureView.this.processResponse(new C12913v(this.f28466b, this.f28467c, this.f28468d, this.f28469e));
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.io.IOException} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0095, code lost:
        r12 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009b, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009c, code lost:
        r6 = null;
        r5 = r4;
        r4 = false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0095 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:5:0x0018] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m20616a(p365hg.C12904t.C12908d r12) {
        /*
            hg.t r0 = f28457e
            r1 = 0
            r2 = 0
            r3 = 1
            java.net.URL r4 = new java.net.URL     // Catch:{ IOException -> 0x00d2, all -> 0x00c9 }
            android.net.Uri r5 = r12.f28464a     // Catch:{ IOException -> 0x00d2, all -> 0x00c9 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x00d2, all -> 0x00c9 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x00d2, all -> 0x00c9 }
            java.net.URLConnection r4 = r4.openConnection()     // Catch:{ IOException -> 0x00d2, all -> 0x00c9 }
            if (r4 == 0) goto L_0x00c1
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ IOException -> 0x00d2, all -> 0x00c9 }
            r4.setInstanceFollowRedirects(r2)     // Catch:{ IOException -> 0x00ba, all -> 0x0095 }
            int r5 = r4.getResponseCode()     // Catch:{ IOException -> 0x00ba, all -> 0x0095 }
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 == r6) goto L_0x00a0
            r6 = 301(0x12d, float:4.22E-43)
            if (r5 == r6) goto L_0x005d
            r6 = 302(0x12e, float:4.23E-43)
            if (r5 == r6) goto L_0x005d
            java.io.InputStream r5 = r4.getErrorStream()     // Catch:{ IOException -> 0x00ba, all -> 0x0095 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00b5, all -> 0x00b2 }
            r6.<init>()     // Catch:{ IOException -> 0x00b5, all -> 0x00b2 }
            if (r5 == 0) goto L_0x004d
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x00b5, all -> 0x00b2 }
            r7.<init>(r5)     // Catch:{ IOException -> 0x00b5, all -> 0x00b2 }
            r8 = 128(0x80, float:1.794E-43)
            char[] r9 = new char[r8]     // Catch:{ IOException -> 0x00b5, all -> 0x00b2 }
        L_0x003f:
            int r10 = r7.read(r9, r2, r8)     // Catch:{ IOException -> 0x00b5, all -> 0x00b2 }
            if (r10 <= 0) goto L_0x0049
            r6.append(r9, r2, r10)     // Catch:{ IOException -> 0x00b5, all -> 0x00b2 }
            goto L_0x003f
        L_0x0049:
            p365hg.C12869i0.m20566e(r7)     // Catch:{ IOException -> 0x00b5, all -> 0x00b2 }
            goto L_0x0052
        L_0x004d:
            java.lang.String r7 = "Unexpected error while downloading an image."
            r6.append(r7)     // Catch:{ IOException -> 0x00b5, all -> 0x00b2 }
        L_0x0052:
            com.facebook.FacebookException r7 = new com.facebook.FacebookException     // Catch:{ IOException -> 0x00b5, all -> 0x00b2 }
            java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x00b5, all -> 0x00b2 }
            r7.<init>((java.lang.String) r6)     // Catch:{ IOException -> 0x00b5, all -> 0x00b2 }
            r6 = r1
            goto L_0x00a9
        L_0x005d:
            java.lang.String r3 = "location"
            java.lang.String r3 = r4.getHeaderField(r3)     // Catch:{ IOException -> 0x009b, all -> 0x0095 }
            boolean r5 = p365hg.C12869i0.m20546B(r3)     // Catch:{ IOException -> 0x009b, all -> 0x0095 }
            if (r5 != 0) goto L_0x0097
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ IOException -> 0x009b, all -> 0x0095 }
            android.net.Uri r5 = r12.f28464a     // Catch:{ IOException -> 0x009b, all -> 0x0095 }
            p365hg.C12867h0.m20544a(r5, r3)     // Catch:{ IOException -> 0x009b, all -> 0x0095 }
            hg.t$c r5 = m20621g(r12)     // Catch:{ IOException -> 0x009b, all -> 0x0095 }
            if (r5 == 0) goto L_0x0097
            boolean r6 = r5.f28462b     // Catch:{ IOException -> 0x009b, all -> 0x0095 }
            if (r6 != 0) goto L_0x0097
            hg.u r5 = r5.f28463c     // Catch:{ IOException -> 0x009b, all -> 0x0095 }
            hg.t$d r6 = new hg.t$d     // Catch:{ IOException -> 0x009b, all -> 0x0095 }
            java.lang.String r7 = "redirectUri"
            kotlin.jvm.internal.C19383o.m32796f(r3, r7)     // Catch:{ IOException -> 0x009b, all -> 0x0095 }
            java.lang.Object r7 = r12.f28465b     // Catch:{ IOException -> 0x009b, all -> 0x0095 }
            r6.<init>(r3, r7)     // Catch:{ IOException -> 0x009b, all -> 0x0095 }
            hg.n0 r3 = f28455c     // Catch:{ IOException -> 0x009b, all -> 0x0095 }
            hg.t$a r7 = new hg.t$a     // Catch:{ IOException -> 0x009b, all -> 0x0095 }
            r7.<init>(r6, r2)     // Catch:{ IOException -> 0x009b, all -> 0x0095 }
            m20620e(r5, r6, r3, r7)     // Catch:{ IOException -> 0x009b, all -> 0x0095 }
            goto L_0x0097
        L_0x0095:
            r12 = move-exception
            goto L_0x00cb
        L_0x0097:
            r6 = r1
            r7 = r6
            r3 = r2
            goto L_0x00aa
        L_0x009b:
            r3 = move-exception
            r6 = r1
            r5 = r4
            r4 = r2
            goto L_0x00d8
        L_0x00a0:
            java.io.InputStream r5 = p365hg.C12914w.m20626c(r4)     // Catch:{ IOException -> 0x00ba, all -> 0x0095 }
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r5)     // Catch:{ IOException -> 0x00b5, all -> 0x00b2 }
            r7 = r1
        L_0x00a9:
            r1 = r5
        L_0x00aa:
            p365hg.C12869i0.m20566e(r1)
            p365hg.C12869i0.m20572k(r4)
            r1 = r6
            goto L_0x00e0
        L_0x00b2:
            r12 = move-exception
            r1 = r5
            goto L_0x00cb
        L_0x00b5:
            r6 = move-exception
            r11 = r6
            r6 = r5
            r5 = r11
            goto L_0x00bc
        L_0x00ba:
            r5 = move-exception
            r6 = r1
        L_0x00bc:
            r11 = r4
            r4 = r3
            r3 = r5
            r5 = r11
            goto L_0x00d8
        L_0x00c1:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch:{ IOException -> 0x00d2, all -> 0x00c9 }
            java.lang.String r5 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            r4.<init>(r5)     // Catch:{ IOException -> 0x00d2, all -> 0x00c9 }
            throw r4     // Catch:{ IOException -> 0x00d2, all -> 0x00c9 }
        L_0x00c9:
            r12 = move-exception
            r4 = r1
        L_0x00cb:
            p365hg.C12869i0.m20566e(r1)
            p365hg.C12869i0.m20572k(r4)
            throw r12
        L_0x00d2:
            r4 = move-exception
            r5 = r1
            r6 = r5
            r11 = r4
            r4 = r3
            r3 = r11
        L_0x00d8:
            p365hg.C12869i0.m20566e(r6)
            p365hg.C12869i0.m20572k(r5)
            r7 = r3
            r3 = r4
        L_0x00e0:
            if (r3 == 0) goto L_0x00e5
            r0.mo45676f(r12, r7, r1, r2)
        L_0x00e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p365hg.C12904t.m20616a(hg.t$d):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: hg.u} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00fc  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m20617b(p365hg.C12904t.C12908d r12, boolean r13) {
        /*
            hg.t r0 = f28457e
            r1 = 0
            r2 = 0
            if (r13 == 0) goto L_0x00e6
            android.net.Uri r13 = r12.f28464a
            java.lang.String r3 = p365hg.C12867h0.f28364a
            r3 = 1
            if (r13 != 0) goto L_0x000f
            goto L_0x00d5
        L_0x000f:
            java.lang.String r13 = r13.toString()
            java.lang.String r4 = "uri.toString()"
            kotlin.jvm.internal.C19383o.m32796f(r13, r4)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r4.add(r13)
            java.lang.Class<hg.h0> r5 = p365hg.C12867h0.class
            monitor-enter(r5)     // Catch:{ IOException -> 0x00aa, all -> 0x00ac }
            hg.o r6 = p365hg.C12867h0.f28366c     // Catch:{ all -> 0x00ae }
            if (r6 == 0) goto L_0x0028
            goto L_0x0034
        L_0x0028:
            hg.o r6 = new hg.o     // Catch:{ all -> 0x00ae }
            java.lang.String r7 = p365hg.C12867h0.f28364a     // Catch:{ all -> 0x00ae }
            hg.o$d r8 = new hg.o$d     // Catch:{ all -> 0x00ae }
            r8.<init>()     // Catch:{ all -> 0x00ae }
            r6.<init>(r7, r8)     // Catch:{ all -> 0x00ae }
        L_0x0034:
            p365hg.C12867h0.f28366c = r6     // Catch:{ all -> 0x00ae }
            monitor-exit(r5)     // Catch:{ IOException -> 0x00aa, all -> 0x00ac }
            java.lang.String r5 = p365hg.C12867h0.f28365b     // Catch:{ IOException -> 0x00aa, all -> 0x00ac }
            java.io.BufferedInputStream r5 = r6.mo45649b(r13, r5)     // Catch:{ IOException -> 0x00aa, all -> 0x00ac }
            r8 = r1
            r7 = r2
        L_0x003f:
            if (r5 == 0) goto L_0x009e
            java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x009c, all -> 0x0099 }
            r8.<init>(r5)     // Catch:{ IOException -> 0x009c, all -> 0x0099 }
            r5 = 128(0x80, float:1.794E-43)
            char[] r7 = new char[r5]     // Catch:{ IOException -> 0x0097 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0097 }
            r9.<init>()     // Catch:{ IOException -> 0x0097 }
            int r10 = r8.read(r7, r1, r5)     // Catch:{ IOException -> 0x0097 }
        L_0x0053:
            if (r10 <= 0) goto L_0x005d
            r9.append(r7, r1, r10)     // Catch:{ IOException -> 0x0097 }
            int r10 = r8.read(r7, r1, r5)     // Catch:{ IOException -> 0x0097 }
            goto L_0x0053
        L_0x005d:
            p365hg.C12869i0.m20566e(r8)     // Catch:{ IOException -> 0x0097 }
            java.lang.String r5 = r9.toString()     // Catch:{ IOException -> 0x0097 }
            java.lang.String r7 = "urlBuilder.toString()"
            kotlin.jvm.internal.C19383o.m32796f(r5, r7)     // Catch:{ IOException -> 0x0097 }
            boolean r7 = r4.contains(r5)     // Catch:{ IOException -> 0x0097 }
            if (r7 == 0) goto L_0x0088
            boolean r4 = kotlin.jvm.internal.C19383o.m32792b(r5, r13)     // Catch:{ IOException -> 0x0097 }
            if (r4 == 0) goto L_0x0078
            r7 = r8
            r8 = r3
            goto L_0x009e
        L_0x0078:
            hg.c0$a r13 = p365hg.C12845c0.f28334f     // Catch:{ IOException -> 0x0097 }
            com.facebook.LoggingBehavior r4 = com.facebook.LoggingBehavior.CACHE     // Catch:{ IOException -> 0x0097 }
            r5 = 6
            java.lang.String r6 = p365hg.C12867h0.f28364a     // Catch:{ IOException -> 0x0097 }
            java.lang.String r7 = "A loop detected in UrlRedirectCache"
            r13.mo45625a(r4, r5, r6, r7)     // Catch:{ IOException -> 0x0097 }
            p365hg.C12869i0.m20566e(r8)
            goto L_0x00d5
        L_0x0088:
            r4.add(r5)     // Catch:{ IOException -> 0x0097 }
            java.lang.String r13 = p365hg.C12867h0.f28365b     // Catch:{ IOException -> 0x0097 }
            java.io.BufferedInputStream r13 = r6.mo45649b(r5, r13)     // Catch:{ IOException -> 0x0097 }
            r7 = r8
            r8 = r3
            r11 = r5
            r5 = r13
            r13 = r11
            goto L_0x003f
        L_0x0097:
            r13 = move-exception
            goto L_0x00b2
        L_0x0099:
            r12 = move-exception
            r2 = r7
            goto L_0x00e2
        L_0x009c:
            r13 = move-exception
            goto L_0x00a8
        L_0x009e:
            if (r8 == 0) goto L_0x00d2
            android.net.Uri r13 = android.net.Uri.parse(r13)     // Catch:{ IOException -> 0x009c, all -> 0x0099 }
            p365hg.C12869i0.m20566e(r7)
            goto L_0x00d6
        L_0x00a8:
            r8 = r7
            goto L_0x00b2
        L_0x00aa:
            r13 = move-exception
            goto L_0x00b1
        L_0x00ac:
            r12 = move-exception
            goto L_0x00e2
        L_0x00ae:
            r13 = move-exception
            monitor-exit(r5)     // Catch:{ IOException -> 0x00aa, all -> 0x00ac }
            throw r13     // Catch:{ IOException -> 0x00aa, all -> 0x00ac }
        L_0x00b1:
            r8 = r2
        L_0x00b2:
            hg.c0$a r4 = p365hg.C12845c0.f28334f     // Catch:{ all -> 0x00e0 }
            com.facebook.LoggingBehavior r5 = com.facebook.LoggingBehavior.CACHE     // Catch:{ all -> 0x00e0 }
            r6 = 4
            java.lang.String r7 = p365hg.C12867h0.f28364a     // Catch:{ all -> 0x00e0 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e0 }
            r9.<init>()     // Catch:{ all -> 0x00e0 }
            java.lang.String r10 = "IOException when accessing cache: "
            r9.append(r10)     // Catch:{ all -> 0x00e0 }
            java.lang.String r13 = r13.getMessage()     // Catch:{ all -> 0x00e0 }
            r9.append(r13)     // Catch:{ all -> 0x00e0 }
            java.lang.String r13 = r9.toString()     // Catch:{ all -> 0x00e0 }
            r4.mo45625a(r5, r6, r7, r13)     // Catch:{ all -> 0x00e0 }
            r7 = r8
        L_0x00d2:
            p365hg.C12869i0.m20566e(r7)
        L_0x00d5:
            r13 = r2
        L_0x00d6:
            if (r13 == 0) goto L_0x00e6
            java.io.BufferedInputStream r13 = p365hg.C12914w.m20625b(r13)
            if (r13 == 0) goto L_0x00e7
            r1 = r3
            goto L_0x00e7
        L_0x00e0:
            r12 = move-exception
            r2 = r8
        L_0x00e2:
            p365hg.C12869i0.m20566e(r2)
            throw r12
        L_0x00e6:
            r13 = r2
        L_0x00e7:
            if (r1 != 0) goto L_0x00ef
            android.net.Uri r13 = r12.f28464a
            java.io.BufferedInputStream r13 = p365hg.C12914w.m20625b(r13)
        L_0x00ef:
            if (r13 == 0) goto L_0x00fc
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r13)
            p365hg.C12869i0.m20566e(r13)
            r0.mo45676f(r12, r2, r3, r1)
            goto L_0x0116
        L_0x00fc:
            hg.t$c r13 = m20621g(r12)
            if (r13 == 0) goto L_0x0104
            hg.u r2 = r13.f28463c
        L_0x0104:
            if (r13 == 0) goto L_0x0116
            boolean r13 = r13.f28462b
            if (r13 != 0) goto L_0x0116
            if (r2 == 0) goto L_0x0116
            hg.n0 r13 = f28454b
            hg.t$b r0 = new hg.t$b
            r0.<init>(r12)
            m20620e(r2, r12, r13, r0)
        L_0x0116:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p365hg.C12904t.m20617b(hg.t$d, boolean):void");
    }

    /* renamed from: c */
    public static final void m20618c(C12910u uVar) {
        C19383o.m32797g(uVar, LoginFragment.EXTRA_REQUEST);
        C12908d dVar = new C12908d(uVar.f28471a, uVar.f28474d);
        HashMap hashMap = f28456d;
        synchronized (hashMap) {
            C12907c cVar = (C12907c) hashMap.get(dVar);
            if (cVar != null) {
                C12885n0.C12887b bVar = cVar.f28461a;
                if (bVar == null || !bVar.cancel()) {
                    cVar.f28462b = true;
                } else {
                    hashMap.remove(dVar);
                }
            }
            C19394m mVar = C19394m.f43287a;
        }
    }

    /* renamed from: d */
    public static final void m20619d(C12910u uVar) {
        C12908d dVar = new C12908d(uVar.f28471a, uVar.f28474d);
        HashMap hashMap = f28456d;
        synchronized (hashMap) {
            C12907c cVar = (C12907c) hashMap.get(dVar);
            if (cVar != null) {
                cVar.f28463c = uVar;
                cVar.f28462b = false;
                C12885n0.C12887b bVar = cVar.f28461a;
                if (bVar != null) {
                    bVar.mo45645a();
                    C19394m mVar = C19394m.f43287a;
                }
            } else {
                m20620e(uVar, dVar, f28455c, new C12905a(dVar, uVar.f28473c));
                C19394m mVar2 = C19394m.f43287a;
            }
        }
    }

    /* renamed from: e */
    public static void m20620e(C12910u uVar, C12908d dVar, C12885n0 n0Var, Runnable runnable) {
        HashMap hashMap = f28456d;
        synchronized (hashMap) {
            C12907c cVar = new C12907c(uVar);
            hashMap.put(dVar, cVar);
            cVar.f28461a = C12885n0.m20604a(n0Var, runnable);
            C19394m mVar = C19394m.f43287a;
        }
    }

    /* renamed from: g */
    public static C12907c m20621g(C12908d dVar) {
        C12907c cVar;
        HashMap hashMap = f28456d;
        synchronized (hashMap) {
            cVar = (C12907c) hashMap.remove(dVar);
        }
        return cVar;
    }

    /* renamed from: f */
    public final void mo45676f(C12908d dVar, Exception exc, Bitmap bitmap, boolean z) {
        Handler handler;
        C12907c g = m20621g(dVar);
        if (g != null && !g.f28462b) {
            C12910u uVar = g.f28463c;
            C12910u.C12911a aVar = uVar != null ? uVar.f28472b : null;
            if (aVar != null) {
                synchronized (this) {
                    if (f28453a == null) {
                        f28453a = new Handler(Looper.getMainLooper());
                    }
                    handler = f28453a;
                }
                if (handler != null) {
                    handler.post(new C12909e(uVar, exc, z, bitmap, aVar));
                }
            }
        }
    }
}
