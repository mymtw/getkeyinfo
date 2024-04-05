package p321cc;

import p287xp.C8339g;

/* renamed from: cc.b */
public final /* synthetic */ class C8568b implements C8339g {

    /* renamed from: b */
    public final /* synthetic */ int f18657b;

    public /* synthetic */ C8568b(int i) {
        this.f18657b = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v10, types: [retrofit2.HttpException] */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r3v27 */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0116, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0113, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0113, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.f18657b
            java.lang.String r1 = "it"
            java.lang.String r2 = "throwable"
            r3 = 0
            switch(r0) {
                case 0: goto L_0x0124;
                case 1: goto L_0x0058;
                case 2: goto L_0x004d;
                case 3: goto L_0x0036;
                case 4: goto L_0x0017;
                case 5: goto L_0x000c;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x012f
        L_0x000c:
            java.lang.Throwable r15 = (java.lang.Throwable) r15
            kotlin.jvm.internal.C19383o.m32797g(r15, r2)
            ud.j$a r15 = new ud.j$a
            r15.<init>()
            return r15
        L_0x0017:
            retrofit2.v r15 = (retrofit2.C20145v) r15
            java.lang.String r0 = "response"
            kotlin.jvm.internal.C19383o.m32797g(r15, r0)
            boolean r0 = r15.mo74384a()
            if (r0 == 0) goto L_0x0030
            T r15 = r15.f44615b
            if (r15 == 0) goto L_0x0030
            ed.b$b$b r0 = new ed.b$b$b
            com.etsy.android.lib.models.apiv3.NewTranslatedReview r15 = (com.etsy.android.lib.models.apiv3.NewTranslatedReview) r15
            r0.<init>(r15)
            goto L_0x0035
        L_0x0030:
            ed.b$b$a r0 = new ed.b$b$a
            r0.<init>()
        L_0x0035:
            return r0
        L_0x0036:
            java.lang.Throwable r15 = (java.lang.Throwable) r15
            kotlin.jvm.internal.C19383o.m32797g(r15, r2)
            boolean r0 = r15 instanceof retrofit2.HttpException
            if (r0 == 0) goto L_0x0042
            r3 = r15
            retrofit2.HttpException r3 = (retrofit2.HttpException) r3
        L_0x0042:
            if (r3 == 0) goto L_0x0047
            r3.code()
        L_0x0047:
            uc.d$a r15 = new uc.d$a
            r15.<init>()
            return r15
        L_0x004d:
            java.util.List r15 = (java.util.List) r15
            kotlin.jvm.internal.C19383o.m32797g(r15, r1)
            com.etsy.android.lib.models.GiftCardDesigns r0 = new com.etsy.android.lib.models.GiftCardDesigns
            r0.<init>(r15)
            return r0
        L_0x0058:
            retrofit2.v r15 = (retrofit2.C20145v) r15
            kotlin.jvm.internal.C19383o.m32797g(r15, r1)
            com.etsy.android.ui.core.f r0 = new com.etsy.android.ui.core.f
            T r1 = r15.f44615b
            okhttp3.a0 r1 = (okhttp3.C19928a0) r1
            if (r1 == 0) goto L_0x0070
            byte[] r1 = r1.mo72841a()
            java.lang.Class<com.etsy.android.lib.models.apiv3.CollectionDetails> r2 = com.etsy.android.lib.models.apiv3.CollectionDetails.class
            java.lang.Object r1 = com.etsy.android.lib.models.MoshiModelFactory.createFromByteArray(r1, r2)
            goto L_0x0071
        L_0x0070:
            r1 = r3
        L_0x0071:
            com.etsy.android.lib.models.apiv3.CollectionDetails r1 = (com.etsy.android.lib.models.apiv3.CollectionDetails) r1
            if (r1 == 0) goto L_0x011e
            okhttp3.z r15 = r15.f44614a
            okhttp3.o r15 = r15.f44367h
            java.lang.String r2 = "link"
            java.lang.String r15 = r15.mo72948a(r2)
            if (r15 == 0) goto L_0x011a
            java.lang.String r2 = ","
            java.lang.String[] r15 = r15.split(r2)
            int r2 = r15.length
            r4 = 0
            r5 = r4
        L_0x008a:
            if (r5 >= r2) goto L_0x011a
            r6 = r15[r5]
            java.lang.String r7 = ";"
            java.lang.String[] r6 = r6.split(r7)
            int r7 = r6.length
            r8 = 2
            if (r7 >= r8) goto L_0x009a
            goto L_0x0116
        L_0x009a:
            r7 = r6[r4]
            java.lang.String r7 = r7.trim()
            java.lang.String r9 = "<"
            boolean r9 = r7.startsWith(r9)
            if (r9 == 0) goto L_0x0116
            java.lang.String r9 = ">"
            boolean r9 = r7.endsWith(r9)
            if (r9 != 0) goto L_0x00b1
            goto L_0x0116
        L_0x00b1:
            int r9 = r7.length()
            r10 = 1
            int r9 = r9 - r10
            java.lang.String r7 = r7.substring(r10, r9)
            r9 = r10
        L_0x00bc:
            int r11 = r6.length
            if (r9 >= r11) goto L_0x0116
            r11 = r6[r9]
            java.lang.String r11 = r11.trim()
            java.lang.String r12 = "="
            java.lang.String[] r11 = r11.split(r12)
            int r12 = r11.length
            if (r12 < r8) goto L_0x0113
            r12 = r11[r4]
            java.lang.String r13 = "rel"
            boolean r12 = r13.equals(r12)
            if (r12 != 0) goto L_0x00d9
            goto L_0x0113
        L_0x00d9:
            r11 = r11[r10]
            java.lang.String r12 = "\""
            boolean r13 = r11.startsWith(r12)
            if (r13 == 0) goto L_0x00f2
            boolean r12 = r11.endsWith(r12)
            if (r12 == 0) goto L_0x00f2
            int r12 = r11.length()
            int r12 = r12 - r10
            java.lang.String r11 = r11.substring(r10, r12)
        L_0x00f2:
            java.lang.String r12 = "first"
            boolean r12 = r12.equals(r11)
            if (r12 == 0) goto L_0x00fb
            goto L_0x0113
        L_0x00fb:
            java.lang.String r12 = "last"
            boolean r12 = r12.equals(r11)
            if (r12 == 0) goto L_0x0104
            goto L_0x0113
        L_0x0104:
            java.lang.String r12 = "next"
            boolean r12 = r12.equals(r11)
            if (r12 == 0) goto L_0x010e
            r3 = r7
            goto L_0x0113
        L_0x010e:
            java.lang.String r12 = "prev"
            r12.equals(r11)
        L_0x0113:
            int r9 = r9 + 1
            goto L_0x00bc
        L_0x0116:
            int r5 = r5 + 1
            goto L_0x008a
        L_0x011a:
            r0.<init>(r1, r3)
            return r0
        L_0x011e:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            r15.<init>()
            throw r15
        L_0x0124:
            java.lang.Throwable r15 = (java.lang.Throwable) r15
            kotlin.jvm.internal.C19383o.m32797g(r15, r2)
            cc.c$c$a r0 = new cc.c$c$a
            r0.<init>(r15)
            return r0
        L_0x012f:
            retrofit2.v r15 = (retrofit2.C20145v) r15
            kotlin.jvm.internal.C19383o.m32797g(r15, r1)
            boolean r0 = r15.mo74384a()
            if (r0 == 0) goto L_0x0159
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.q$b r0 = new com.etsy.android.ui.search.v2.filters.searchfiltersv2.q$b
            T r1 = r15.f44615b
            okhttp3.a0 r1 = (okhttp3.C19928a0) r1
            if (r1 == 0) goto L_0x014c
            byte[] r1 = r1.mo72841a()
            java.lang.Class<com.etsy.android.lib.models.apiv3.SearchWithAds> r2 = com.etsy.android.lib.models.apiv3.SearchWithAds.class
            java.lang.Object r3 = com.etsy.android.lib.models.MoshiModelFactory.createFromByteArray(r1, r2)
        L_0x014c:
            kotlin.jvm.internal.C19383o.m32794d(r3)
            com.etsy.android.lib.models.apiv3.SearchWithAds r3 = (com.etsy.android.lib.models.apiv3.SearchWithAds) r3
            java.lang.String r15 = p001a0.C0005b.m48l0(r15)
            r0.<init>(r3, r15)
            goto L_0x0163
        L_0x0159:
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.q$a r0 = new com.etsy.android.ui.search.v2.filters.searchfiltersv2.q$a
            retrofit2.HttpException r1 = new retrofit2.HttpException
            r1.<init>(r15)
            r0.<init>(r1)
        L_0x0163:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p321cc.C8568b.apply(java.lang.Object):java.lang.Object");
    }
}
