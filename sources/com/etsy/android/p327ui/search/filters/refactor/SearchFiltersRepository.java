package com.etsy.android.p327ui.search.filters.refactor;

import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.filters.refactor.SearchFiltersRepository */
public final class SearchFiltersRepository {

    /* renamed from: a */
    public final C10812k f23801a;

    public SearchFiltersRepository(C10812k kVar) {
        C19383o.m32797g(kVar, "searchFiltersEndpoint");
        this.f23801a = kVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0049 A[Catch:{ Exception -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0072 A[Catch:{ Exception -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo35790a(com.etsy.android.p327ui.search.filters.refactor.C10854r r5, kotlin.coroutines.C19340c<? super com.etsy.android.p327ui.search.filters.refactor.C10838o> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.etsy.android.p327ui.search.filters.refactor.SearchFiltersRepository$applySearchFilters$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.etsy.android.ui.search.filters.refactor.SearchFiltersRepository$applySearchFilters$1 r0 = (com.etsy.android.p327ui.search.filters.refactor.SearchFiltersRepository$applySearchFilters$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.etsy.android.ui.search.filters.refactor.SearchFiltersRepository$applySearchFilters$1 r0 = new com.etsy.android.ui.search.filters.refactor.SearchFiltersRepository$applySearchFilters$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)     // Catch:{ Exception -> 0x007e }
            goto L_0x0041
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            com.etsy.android.ui.search.filters.refactor.k r6 = r4.f23801a     // Catch:{ Exception -> 0x007e }
            java.util.LinkedHashMap r5 = r5.mo36021a()     // Catch:{ Exception -> 0x007e }
            r0.label = r3     // Catch:{ Exception -> 0x007e }
            java.lang.Object r6 = r6.mo35918a(r5, r0)     // Catch:{ Exception -> 0x007e }
            if (r6 != r1) goto L_0x0041
            return r1
        L_0x0041:
            retrofit2.v r6 = (retrofit2.C20145v) r6     // Catch:{ Exception -> 0x007e }
            boolean r5 = r6.mo74384a()     // Catch:{ Exception -> 0x007e }
            if (r5 == 0) goto L_0x0072
            T r5 = r6.f44615b     // Catch:{ Exception -> 0x007e }
            okhttp3.a0 r5 = (okhttp3.C19928a0) r5     // Catch:{ Exception -> 0x007e }
            if (r5 == 0) goto L_0x005a
            byte[] r5 = r5.mo72841a()     // Catch:{ Exception -> 0x007e }
            java.lang.Class<com.etsy.android.lib.models.apiv3.SearchWithAds> r6 = com.etsy.android.lib.models.apiv3.SearchWithAds.class
            java.lang.Object r5 = com.etsy.android.lib.models.MoshiModelFactory.createFromByteArray(r5, r6)     // Catch:{ Exception -> 0x007e }
            goto L_0x005b
        L_0x005a:
            r5 = 0
        L_0x005b:
            kotlin.jvm.internal.C19383o.m32794d(r5)     // Catch:{ Exception -> 0x007e }
            com.etsy.android.lib.models.apiv3.SearchWithAds r5 = (com.etsy.android.lib.models.apiv3.SearchWithAds) r5     // Catch:{ Exception -> 0x007e }
            com.etsy.android.ui.search.filters.refactor.o$b r6 = new com.etsy.android.ui.search.filters.refactor.o$b     // Catch:{ Exception -> 0x007e }
            int r0 = r5.getCount()     // Catch:{ Exception -> 0x007e }
            com.etsy.android.lib.models.apiv3.FacetCountListMap r1 = r5.getFacetCountListMap()     // Catch:{ Exception -> 0x007e }
            com.etsy.android.lib.models.apiv3.filters.StaticFilters r5 = r5.getStaticFilters()     // Catch:{ Exception -> 0x007e }
            r6.<init>(r0, r1, r5)     // Catch:{ Exception -> 0x007e }
            goto L_0x0084
        L_0x0072:
            com.etsy.android.ui.search.filters.refactor.o$a r5 = new com.etsy.android.ui.search.filters.refactor.o$a     // Catch:{ Exception -> 0x007e }
            retrofit2.HttpException r0 = new retrofit2.HttpException     // Catch:{ Exception -> 0x007e }
            r0.<init>(r6)     // Catch:{ Exception -> 0x007e }
            r5.<init>(r0)     // Catch:{ Exception -> 0x007e }
            r6 = r5
            goto L_0x0084
        L_0x007e:
            r5 = move-exception
            com.etsy.android.ui.search.filters.refactor.o$a r6 = new com.etsy.android.ui.search.filters.refactor.o$a
            r6.<init>(r5)
        L_0x0084:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.filters.refactor.SearchFiltersRepository.mo35790a(com.etsy.android.ui.search.filters.refactor.r, kotlin.coroutines.c):java.lang.Object");
    }
}
