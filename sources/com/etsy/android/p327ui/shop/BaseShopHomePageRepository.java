package com.etsy.android.p327ui.shop;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.ShopHomeSortOption;
import com.squareup.moshi.C17414y;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.shop.BaseShopHomePageRepository */
public final class BaseShopHomePageRepository {

    /* renamed from: a */
    public final C11169j f24594a;

    /* renamed from: b */
    public final C17414y f24595b;

    /* renamed from: com.etsy.android.ui.shop.BaseShopHomePageRepository$a */
    public static final class C11114a {
    }

    static {
        new C11114a();
    }

    public BaseShopHomePageRepository(C11169j jVar, C17414y yVar) {
        C19383o.m32797g(jVar, "baseShopHomeRequestEndpoint");
        C19383o.m32797g(yVar, "moshi");
        this.f24594a = jVar;
        this.f24595b = yVar;
    }

    /* renamed from: b */
    public static LinkedHashMap m19038b(C11167i iVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("section_listing_depth", "8");
        if (iVar.f24696c) {
            Map linkedHashMap2 = new LinkedHashMap();
            ShopHomeInitialLoadConfiguration shopHomeInitialLoadConfiguration = iVar.f24697d;
            if (shopHomeInitialLoadConfiguration == null || shopHomeInitialLoadConfiguration.getConfigType() != 1) {
                linkedHashMap2 = C19294b0.m32559p0();
            } else {
                Map<String, String> payloads = iVar.f24697d.getPayloads();
                if (payloads == null || payloads.isEmpty()) {
                    linkedHashMap2 = C19294b0.m32559p0();
                } else {
                    if (payloads.containsKey("section_id")) {
                        linkedHashMap2.put("section_id", payloads.get("section_id"));
                    } else if (payloads.containsKey("search_query")) {
                        linkedHashMap2.put("search_query", payloads.get("search_query"));
                    }
                    if (payloads.containsKey(ResponseConstants.ORDER)) {
                        linkedHashMap2.put(ResponseConstants.SORT_ORDER, payloads.get(ResponseConstants.ORDER));
                    }
                }
            }
            linkedHashMap.putAll(linkedHashMap2);
        }
        String str = iVar.f24698e;
        if (str != null) {
            linkedHashMap.put("referring_listing_id", str);
            String str2 = (String) linkedHashMap.putIfAbsent(ResponseConstants.SORT_ORDER, ShopHomeSortOption.SORT_RELEVANCE);
        }
        if (C18263b.m30839d0(iVar.f24699f)) {
            linkedHashMap.put("coupon", iVar.f24699f);
        }
        linkedHashMap.put("include_additional_listing_images", "true");
        if (iVar.f24700g) {
            linkedHashMap.put("include_shop_ratings", "true");
        }
        linkedHashMap.put("include_machine_translations", String.valueOf(iVar.f24701h));
        return linkedHashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082 A[Catch:{ Exception -> 0x00c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b1 A[Catch:{ Exception -> 0x00c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo36761a(com.etsy.android.p327ui.shop.C11167i r8, kotlin.coroutines.C19340c<? super com.etsy.android.p327ui.shop.C11172k0> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.etsy.android.p327ui.shop.BaseShopHomePageRepository$fetchHomePageDataCoroutine$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.etsy.android.ui.shop.BaseShopHomePageRepository$fetchHomePageDataCoroutine$1 r0 = (com.etsy.android.p327ui.shop.BaseShopHomePageRepository$fetchHomePageDataCoroutine$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.etsy.android.ui.shop.BaseShopHomePageRepository$fetchHomePageDataCoroutine$1 r0 = new com.etsy.android.ui.shop.BaseShopHomePageRepository$fetchHomePageDataCoroutine$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            java.lang.Object r8 = r0.L$0
            com.etsy.android.ui.shop.BaseShopHomePageRepository r8 = (com.etsy.android.p327ui.shop.BaseShopHomePageRepository) r8
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)     // Catch:{ Exception -> 0x00c3 }
            goto L_0x007a
        L_0x002c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0034:
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)
            com.etsy.android.ui.shop.j r9 = r7.f24594a     // Catch:{ Exception -> 0x00c3 }
            com.etsy.android.lib.models.datatypes.EtsyId r2 = r8.f24694a     // Catch:{ Exception -> 0x00c3 }
            java.lang.String r5 = "/etsyapps/v3/bespoke/member/shops/"
            if (r2 == 0) goto L_0x0054
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c3 }
            r6.<init>()     // Catch:{ Exception -> 0x00c3 }
            r6.append(r5)     // Catch:{ Exception -> 0x00c3 }
            r6.append(r2)     // Catch:{ Exception -> 0x00c3 }
            java.lang.String r2 = "/home"
            r6.append(r2)     // Catch:{ Exception -> 0x00c3 }
            java.lang.String r2 = r6.toString()     // Catch:{ Exception -> 0x00c3 }
            goto L_0x006a
        L_0x0054:
            java.lang.String r2 = r8.f24695b     // Catch:{ Exception -> 0x00c3 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c3 }
            r6.<init>()     // Catch:{ Exception -> 0x00c3 }
            r6.append(r5)     // Catch:{ Exception -> 0x00c3 }
            r6.append(r2)     // Catch:{ Exception -> 0x00c3 }
            java.lang.String r2 = "/home-by-name"
            r6.append(r2)     // Catch:{ Exception -> 0x00c3 }
            java.lang.String r2 = r6.toString()     // Catch:{ Exception -> 0x00c3 }
        L_0x006a:
            java.util.LinkedHashMap r8 = m19038b(r8)     // Catch:{ Exception -> 0x00c3 }
            r0.L$0 = r7     // Catch:{ Exception -> 0x00c3 }
            r0.label = r4     // Catch:{ Exception -> 0x00c3 }
            java.lang.Object r9 = r9.mo36839c(r2, r8, r0)     // Catch:{ Exception -> 0x00c3 }
            if (r9 != r1) goto L_0x0079
            return r1
        L_0x0079:
            r8 = r7
        L_0x007a:
            retrofit2.v r9 = (retrofit2.C20145v) r9     // Catch:{ Exception -> 0x00c3 }
            boolean r0 = r9.mo74384a()     // Catch:{ Exception -> 0x00c3 }
            if (r0 == 0) goto L_0x00b1
            T r0 = r9.f44615b     // Catch:{ Exception -> 0x00c3 }
            okhttp3.a0 r0 = (okhttp3.C19928a0) r0     // Catch:{ Exception -> 0x00c3 }
            if (r0 == 0) goto L_0x0093
            byte[] r0 = r0.mo72841a()     // Catch:{ Exception -> 0x00c3 }
            java.lang.Class<com.etsy.android.lib.models.apiv3.ShopHomePage> r1 = com.etsy.android.lib.models.apiv3.ShopHomePage.class
            java.lang.Object r0 = com.etsy.android.lib.models.MoshiModelFactory.createFromByteArray(r0, r1)     // Catch:{ Exception -> 0x00c3 }
            goto L_0x0094
        L_0x0093:
            r0 = r3
        L_0x0094:
            com.etsy.android.lib.models.apiv3.ShopHomePage r0 = (com.etsy.android.lib.models.apiv3.ShopHomePage) r0     // Catch:{ Exception -> 0x00c3 }
            if (r0 == 0) goto L_0x009e
            com.etsy.android.ui.shop.k0$b r8 = new com.etsy.android.ui.shop.k0$b     // Catch:{ Exception -> 0x00c3 }
            r8.<init>(r0)     // Catch:{ Exception -> 0x00c3 }
            goto L_0x00c2
        L_0x009e:
            com.etsy.android.ui.shop.k0$a r0 = new com.etsy.android.ui.shop.k0$a     // Catch:{ Exception -> 0x00c3 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x00c3 }
            java.lang.String r2 = "Shop home page model couldn't be parsed."
            r1.<init>(r2)     // Catch:{ Exception -> 0x00c3 }
            com.squareup.moshi.y r8 = r8.f24595b     // Catch:{ Exception -> 0x00c3 }
            java.lang.String r8 = androidx.compose.foundation.layout.C0761x.m1694T0(r9, r8)     // Catch:{ Exception -> 0x00c3 }
            r0.<init>(r8, r1)     // Catch:{ Exception -> 0x00c3 }
            goto L_0x00c1
        L_0x00b1:
            com.etsy.android.ui.shop.k0$a r0 = new com.etsy.android.ui.shop.k0$a     // Catch:{ Exception -> 0x00c3 }
            retrofit2.HttpException r1 = new retrofit2.HttpException     // Catch:{ Exception -> 0x00c3 }
            r1.<init>(r9)     // Catch:{ Exception -> 0x00c3 }
            com.squareup.moshi.y r8 = r8.f24595b     // Catch:{ Exception -> 0x00c3 }
            java.lang.String r8 = androidx.compose.foundation.layout.C0761x.m1694T0(r9, r8)     // Catch:{ Exception -> 0x00c3 }
            r0.<init>(r8, r1)     // Catch:{ Exception -> 0x00c3 }
        L_0x00c1:
            r8 = r0
        L_0x00c2:
            return r8
        L_0x00c3:
            com.etsy.android.ui.shop.k0$a r8 = new com.etsy.android.ui.shop.k0$a
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.String r0 = "Unknown error occurred loading shop"
            r9.<init>(r0)
            r8.<init>(r3, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.shop.BaseShopHomePageRepository.mo36761a(com.etsy.android.ui.shop.i, kotlin.coroutines.c):java.lang.Object");
    }
}
