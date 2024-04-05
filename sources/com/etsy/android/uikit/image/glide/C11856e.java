package com.etsy.android.uikit.image.glide;

import com.etsy.android.uikit.image.glide.C11863j;
import java.io.InputStream;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20009t;
import p197o4.C7588n;
import p197o4.C7590o;
import p197o4.C7596r;

/* renamed from: com.etsy.android.uikit.image.glide.e */
public final class C11856e implements C7588n<C11860g, InputStream> {

    /* renamed from: a */
    public final C20009t f26367a;

    /* renamed from: b */
    public final C11851a f26368b;

    /* renamed from: c */
    public final C7588n<String, InputStream> f26369c;

    /* renamed from: d */
    public final C11863j.C11864a f26370d;

    /* renamed from: com.etsy.android.uikit.image.glide.e$a */
    public static final class C11857a implements C7590o<C11860g, InputStream> {

        /* renamed from: a */
        public final C20009t f26371a;

        /* renamed from: b */
        public final C11851a f26372b;

        /* renamed from: c */
        public final C11863j.C11864a f26373c;

        public C11857a(C20009t tVar, C11855d dVar, C11863j.C11865b bVar) {
            this.f26371a = tVar;
            this.f26372b = dVar;
            this.f26373c = bVar;
        }

        /* renamed from: b */
        public final C7588n<C11860g, InputStream> mo20003b(C7596r rVar) {
            C19383o.m32797g(rVar, "multiFactory");
            C7588n<Model, Data> b = rVar.mo20029b(String.class, InputStream.class);
            C19383o.m32796f(b, "multiFactory.build(Strin… InputStream::class.java)");
            return new C11856e(this.f26371a, this.f26372b, b, this.f26373c);
        }
    }

    public C11856e(C20009t tVar, C11851a aVar, C7588n<String, InputStream> nVar, C11863j.C11864a aVar2) {
        C19383o.m32797g(tVar, "client");
        C19383o.m32797g(aVar, "progressiveJpegHostProvider");
        C19383o.m32797g(aVar2, "progressiveJpegResourceDecoderFactory");
        this.f26367a = tVar;
        this.f26368b = aVar;
        this.f26369c = nVar;
        this.f26370d = aVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0096, code lost:
        if ((r2.length() > 0) == true) goto L_0x009a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p197o4.C7588n.C7589a mo20000a(java.lang.Object r18, int r19, int r20, p150j4.C7114e r21) {
        /*
            r17 = this;
            r0 = r17
            r4 = r21
            r1 = r18
            com.etsy.android.uikit.image.glide.g r1 = (com.etsy.android.uikit.image.glide.C11860g) r1
            java.lang.String r2 = "model"
            kotlin.jvm.internal.C19383o.m32797g(r1, r2)
            java.lang.String r2 = "options"
            kotlin.jvm.internal.C19383o.m32797g(r4, r2)
            java.lang.String r2 = r1.f26383b
            boolean r2 = p628nj.C18263b.m30835b0(r2)
            if (r2 != 0) goto L_0x0028
            o4.n<java.lang.String, java.io.InputStream> r2 = r0.f26369c
            java.lang.String r1 = r1.f26383b
            r3 = r19
            r5 = r20
            o4.n$a r1 = r2.mo20000a(r1, r3, r5, r4)
            goto L_0x011c
        L_0x0028:
            r3 = r19
            r5 = r20
            java.lang.String r2 = r1.f26383b
            java.net.URI r2 = java.net.URI.create(r2)
            java.lang.String r6 = "create(model.url)"
            kotlin.jvm.internal.C19383o.m32796f(r2, r6)
            com.etsy.android.uikit.image.glide.a r6 = r0.f26368b
            com.etsy.android.uikit.image.glide.d r6 = (com.etsy.android.uikit.image.glide.C11855d) r6
            com.etsy.android.lib.logger.b r6 = r6.f26366a
            com.etsy.android.lib.config.e r6 = r6.mo21332b()
            com.etsy.android.lib.config.EtsyConfigKey r7 = com.etsy.android.lib.config.C8592b.C8601i.f18889c
            java.lang.String r10 = r6.mo21136f(r7)
            r6 = 1
            if (r10 == 0) goto L_0x0057
            int r7 = r10.length()
            if (r7 <= 0) goto L_0x0052
            r7 = r6
            goto L_0x0053
        L_0x0052:
            r7 = 0
        L_0x0053:
            if (r7 != r6) goto L_0x0057
            r7 = r6
            goto L_0x0058
        L_0x0057:
            r7 = 0
        L_0x0058:
            if (r7 == 0) goto L_0x00e6
            java.lang.String r7 = "newHost"
            kotlin.jvm.internal.C19383o.m32797g(r10, r7)
            java.net.URI r7 = new java.net.URI
            java.lang.String r8 = r2.getScheme()
            java.lang.String r14 = "scheme"
            kotlin.jvm.internal.C19383o.m32796f(r8, r14)
            java.util.Locale r15 = java.util.Locale.US
            java.lang.String r9 = "US"
            java.lang.String r13 = "this as java.lang.String).toLowerCase(locale)"
            java.lang.String r9 = android.support.p013v4.media.session.C0087d.m237g(r15, r9, r8, r15, r13)
            java.lang.String r11 = r2.getPath()
            java.lang.String r12 = r2.getQuery()
            java.lang.String r2 = r2.getFragment()
            r8 = r7
            r16 = r13
            r13 = r2
            r8.<init>(r9, r10, r11, r12, r13)
            java.lang.String r2 = r7.getQuery()
            if (r2 == 0) goto L_0x0099
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x0095
            r2 = r6
            goto L_0x0096
        L_0x0095:
            r2 = 0
        L_0x0096:
            if (r2 != r6) goto L_0x0099
            goto L_0x009a
        L_0x0099:
            r6 = 0
        L_0x009a:
            r2 = 61
            if (r6 == 0) goto L_0x00c1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = r7.getQuery()
            r6.append(r8)
            r8 = 38
            r6.append(r8)
            java.lang.String r8 = "format"
            r6.append(r8)
            r6.append(r2)
            java.lang.String r2 = "pjpg"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            goto L_0x00c3
        L_0x00c1:
            java.lang.String r2 = "format=pjpg"
        L_0x00c3:
            r12 = r2
            java.net.URI r2 = new java.net.URI
            java.lang.String r6 = r7.getScheme()
            kotlin.jvm.internal.C19383o.m32796f(r6, r14)
            java.lang.String r9 = r6.toLowerCase(r15)
            r6 = r16
            kotlin.jvm.internal.C19383o.m32796f(r9, r6)
            java.lang.String r10 = r7.getHost()
            java.lang.String r11 = r7.getPath()
            java.lang.String r13 = r7.getFragment()
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13)
        L_0x00e6:
            com.etsy.android.uikit.image.glide.j$a r6 = r0.f26370d
            com.etsy.android.uikit.image.glide.j$b r6 = (com.etsy.android.uikit.image.glide.C11863j.C11865b) r6
            com.etsy.android.uikit.image.glide.j r8 = new com.etsy.android.uikit.image.glide.j
            com.bumptech.glide.Glide r7 = r6.f26398a
            android.util.DisplayMetrics r9 = r6.f26399b
            fa.a r6 = r6.f26400c
            r8.<init>(r7, r9, r6)
            o4.n$a r9 = new o4.n$a
            b5.d r10 = new b5.d
            r10.<init>(r1)
            com.etsy.android.uikit.image.glide.c r11 = new com.etsy.android.uikit.image.glide.c
            okhttp3.t r6 = r0.f26367a
            java.lang.String r7 = r2.toString()
            java.lang.String r2 = "uri.toString()"
            kotlin.jvm.internal.C19383o.m32796f(r7, r2)
            java.lang.ref.WeakReference<android.widget.ImageView> r12 = r1.f26384c
            r1 = r11
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r6
            r6 = r7
            r7 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r9.<init>(r10, r11)
            r1 = r9
        L_0x011c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.uikit.image.glide.C11856e.mo20000a(java.lang.Object, int, int, j4.e):o4.n$a");
    }

    /* renamed from: b */
    public final boolean mo20001b(Object obj) {
        C19383o.m32797g((C11860g) obj, "model");
        return true;
    }
}
