package com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2;

import com.squareup.moshi.C17414y;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.SearchWithAdsRepository */
public final class SearchWithAdsRepository {

    /* renamed from: a */
    public final C11011p f24364a;

    public SearchWithAdsRepository(C11011p pVar, C17414y yVar) {
        C19383o.m32797g(pVar, "searchWithAdsEndpoint");
        C19383o.m32797g(yVar, "moshi");
        this.f24364a = pVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049 A[Catch:{ Exception -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005b A[Catch:{ Exception -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0074 A[Catch:{ Exception -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0095 A[Catch:{ Exception -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo36525a(com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11015r r6, kotlin.coroutines.C19340c<? super com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11012q> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.SearchWithAdsRepository$searchWithAdsRefactor$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.SearchWithAdsRepository$searchWithAdsRefactor$1 r0 = (com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.SearchWithAdsRepository$searchWithAdsRefactor$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.SearchWithAdsRepository$searchWithAdsRefactor$1 r0 = new com.etsy.android.ui.search.v2.filters.searchfiltersv2.SearchWithAdsRepository$searchWithAdsRefactor$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)     // Catch:{ Exception -> 0x00a0 }
            goto L_0x006c
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)     // Catch:{ Exception -> 0x00a0 }
            goto L_0x0058
        L_0x0036:
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            java.lang.String r7 = r6.f24424h     // Catch:{ Exception -> 0x00a0 }
            if (r7 == 0) goto L_0x0046
            int r7 = r7.length()     // Catch:{ Exception -> 0x00a0 }
            if (r7 != 0) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            r7 = 0
            goto L_0x0047
        L_0x0046:
            r7 = r4
        L_0x0047:
            if (r7 == 0) goto L_0x005b
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.p r7 = r5.f24364a     // Catch:{ Exception -> 0x00a0 }
            java.util.LinkedHashMap r6 = androidx.compose.foundation.layout.C0761x.m1746u(r6)     // Catch:{ Exception -> 0x00a0 }
            r0.label = r4     // Catch:{ Exception -> 0x00a0 }
            java.lang.Object r7 = r7.mo36563a(r6, r0)     // Catch:{ Exception -> 0x00a0 }
            if (r7 != r1) goto L_0x0058
            return r1
        L_0x0058:
            retrofit2.v r7 = (retrofit2.C20145v) r7     // Catch:{ Exception -> 0x00a0 }
            goto L_0x006e
        L_0x005b:
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.p r7 = r5.f24364a     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r2 = r6.f24424h     // Catch:{ Exception -> 0x00a0 }
            java.util.LinkedHashMap r6 = androidx.compose.foundation.layout.C0761x.m1746u(r6)     // Catch:{ Exception -> 0x00a0 }
            r0.label = r3     // Catch:{ Exception -> 0x00a0 }
            java.lang.Object r7 = r7.mo36565c(r2, r6, r0)     // Catch:{ Exception -> 0x00a0 }
            if (r7 != r1) goto L_0x006c
            return r1
        L_0x006c:
            retrofit2.v r7 = (retrofit2.C20145v) r7     // Catch:{ Exception -> 0x00a0 }
        L_0x006e:
            boolean r6 = r7.mo74384a()     // Catch:{ Exception -> 0x00a0 }
            if (r6 == 0) goto L_0x0095
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.q$b r6 = new com.etsy.android.ui.search.v2.filters.searchfiltersv2.q$b     // Catch:{ Exception -> 0x00a0 }
            T r0 = r7.f44615b     // Catch:{ Exception -> 0x00a0 }
            okhttp3.a0 r0 = (okhttp3.C19928a0) r0     // Catch:{ Exception -> 0x00a0 }
            if (r0 == 0) goto L_0x0087
            byte[] r0 = r0.mo72841a()     // Catch:{ Exception -> 0x00a0 }
            java.lang.Class<com.etsy.android.lib.models.apiv3.SearchWithAds> r1 = com.etsy.android.lib.models.apiv3.SearchWithAds.class
            java.lang.Object r0 = com.etsy.android.lib.models.MoshiModelFactory.createFromByteArray(r0, r1)     // Catch:{ Exception -> 0x00a0 }
            goto L_0x0088
        L_0x0087:
            r0 = 0
        L_0x0088:
            kotlin.jvm.internal.C19383o.m32794d(r0)     // Catch:{ Exception -> 0x00a0 }
            com.etsy.android.lib.models.apiv3.SearchWithAds r0 = (com.etsy.android.lib.models.apiv3.SearchWithAds) r0     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r7 = p001a0.C0005b.m48l0(r7)     // Catch:{ Exception -> 0x00a0 }
            r6.<init>(r0, r7)     // Catch:{ Exception -> 0x00a0 }
            goto L_0x00a7
        L_0x0095:
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.q$a r6 = new com.etsy.android.ui.search.v2.filters.searchfiltersv2.q$a     // Catch:{ Exception -> 0x00a0 }
            retrofit2.HttpException r0 = new retrofit2.HttpException     // Catch:{ Exception -> 0x00a0 }
            r0.<init>(r7)     // Catch:{ Exception -> 0x00a0 }
            r6.<init>(r0)     // Catch:{ Exception -> 0x00a0 }
            goto L_0x00a7
        L_0x00a0:
            r6 = move-exception
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.q$a r7 = new com.etsy.android.ui.search.v2.filters.searchfiltersv2.q$a
            r7.<init>(r6)
            r6 = r7
        L_0x00a7:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.SearchWithAdsRepository.mo36525a(com.etsy.android.ui.search.v2.filters.searchfiltersv2.r, kotlin.coroutines.c):java.lang.Object");
    }
}
