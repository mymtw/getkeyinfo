package com.etsy.android.p327ui.search.shopresults;

import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.shopresults.SearchShopsRepository */
public final class SearchShopsRepository {

    /* renamed from: a */
    public final C10949h f24273a;

    public SearchShopsRepository(C10949h hVar) {
        C19383o.m32797g(hVar, "searchShopsEndpoint");
        this.f24273a = hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0047 A[Catch:{ Exception -> 0x0070 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006d A[Catch:{ Exception -> 0x0070 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo36277a(com.etsy.android.p327ui.search.shopresults.C10950i r5, kotlin.coroutines.C19340c<? super com.etsy.android.p327ui.search.shopresults.C10951j> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.etsy.android.p327ui.search.shopresults.SearchShopsRepository$searchShops$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.etsy.android.ui.search.shopresults.SearchShopsRepository$searchShops$1 r0 = (com.etsy.android.p327ui.search.shopresults.SearchShopsRepository$searchShops$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.etsy.android.ui.search.shopresults.SearchShopsRepository$searchShops$1 r0 = new com.etsy.android.ui.search.shopresults.SearchShopsRepository$searchShops$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)     // Catch:{ Exception -> 0x0070 }
            goto L_0x003f
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            com.etsy.android.ui.search.shopresults.h r6 = r4.f24273a     // Catch:{ Exception -> 0x0070 }
            java.util.LinkedHashMap r5 = r5.f24300d     // Catch:{ Exception -> 0x0070 }
            r0.label = r3     // Catch:{ Exception -> 0x0070 }
            java.lang.Object r6 = r6.mo36288a(r5, r0)     // Catch:{ Exception -> 0x0070 }
            if (r6 != r1) goto L_0x003f
            return r1
        L_0x003f:
            retrofit2.v r6 = (retrofit2.C20145v) r6     // Catch:{ Exception -> 0x0070 }
            boolean r5 = r6.mo74384a()     // Catch:{ Exception -> 0x0070 }
            if (r5 == 0) goto L_0x006d
            com.etsy.android.ui.search.shopresults.j$b r5 = new com.etsy.android.ui.search.shopresults.j$b     // Catch:{ Exception -> 0x0070 }
            T r0 = r6.f44615b     // Catch:{ Exception -> 0x0070 }
            okhttp3.a0 r0 = (okhttp3.C19928a0) r0     // Catch:{ Exception -> 0x0070 }
            if (r0 == 0) goto L_0x005b
            byte[] r0 = r0.mo72841a()     // Catch:{ Exception -> 0x0070 }
            java.lang.Class<com.etsy.android.lib.models.apiv3.ShopCard> r1 = com.etsy.android.lib.models.apiv3.ShopCard.class
            java.util.List r0 = com.etsy.android.lib.models.MoshiModelFactory.createListFromByteArray(r0, r1)     // Catch:{ Exception -> 0x0070 }
            if (r0 != 0) goto L_0x005d
        L_0x005b:
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.INSTANCE     // Catch:{ Exception -> 0x0070 }
        L_0x005d:
            java.lang.Integer r6 = p001a0.C0005b.m46k0(r6)     // Catch:{ Exception -> 0x0070 }
            if (r6 == 0) goto L_0x0068
            int r6 = r6.intValue()     // Catch:{ Exception -> 0x0070 }
            goto L_0x0069
        L_0x0068:
            r6 = 0
        L_0x0069:
            r5.<init>(r6, r0)     // Catch:{ Exception -> 0x0070 }
            goto L_0x006f
        L_0x006d:
            com.etsy.android.ui.search.shopresults.j$a r5 = com.etsy.android.p327ui.search.shopresults.C10951j.C10952a.f24301a     // Catch:{ Exception -> 0x0070 }
        L_0x006f:
            return r5
        L_0x0070:
            r5 = move-exception
            com.etsy.android.lib.logger.h r6 = com.etsy.android.lib.logger.LogCatKt.m17045a()
            r6.error(r5)
            com.etsy.android.ui.search.shopresults.j$a r5 = com.etsy.android.p327ui.search.shopresults.C10951j.C10952a.f24301a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.shopresults.SearchShopsRepository.mo36277a(com.etsy.android.ui.search.shopresults.i, kotlin.coroutines.c):java.lang.Object");
    }
}
