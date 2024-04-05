package com.etsy.android.p327ui.search.redirect;

import com.etsy.android.lib.models.apiv3.SearchCategoryRedirectPage;
import com.squareup.moshi.C17414y;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p425q9.C13257h;

/* renamed from: com.etsy.android.ui.search.redirect.SearchRedirectRepository */
public final class SearchRedirectRepository {

    /* renamed from: a */
    public final C10926b f24254a;

    /* renamed from: b */
    public final C17414y f24255b;

    public SearchRedirectRepository(C10926b bVar, C17414y yVar) {
        C19383o.m32797g(bVar, "endpoint");
        C19383o.m32797g(yVar, "moshi");
        this.f24254a = bVar;
        this.f24255b = yVar;
    }

    /* renamed from: a */
    public static void m18930a(HashMap hashMap) {
        if (hashMap != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str = (String) hashMap.get(SearchCategoryRedirectPage.PARAM_QUERY);
            if (str != null) {
                if (str.length() > 0) {
                    linkedHashMap.put(SearchCategoryRedirectPage.PARAM_QUERY, str);
                }
            }
            if (!Collections.disjoint(C13257h.f29121a, hashMap.keySet())) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry : hashMap.entrySet()) {
                    if (C13257h.f29121a.contains(entry.getKey())) {
                        hashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                linkedHashMap.putAll(hashMap2);
                if (!linkedHashMap.isEmpty()) {
                    hashMap.keySet().removeAll(linkedHashMap.keySet());
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(C19421p.m32930T(linkedHashMap.size()));
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        linkedHashMap2.put("query_parameters[" + ((String) entry2.getKey()) + ']', entry2.getValue());
                    }
                    hashMap.putAll(linkedHashMap2);
                }
                if (hashMap.containsKey("pct_discount_min") || hashMap.containsKey("pct_discount_max")) {
                    hashMap.remove("query_parameters[is_discounted]");
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056 A[Catch:{ Exception -> 0x002c }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007b A[Catch:{ Exception -> 0x002c }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo36246b(com.etsy.android.p327ui.search.redirect.C10925a r6, kotlin.coroutines.C19340c<? super com.etsy.android.p327ui.search.redirect.C10927c> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.etsy.android.p327ui.search.redirect.SearchRedirectRepository$getSearchCategoryRedirectPage$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.etsy.android.ui.search.redirect.SearchRedirectRepository$getSearchCategoryRedirectPage$1 r0 = (com.etsy.android.p327ui.search.redirect.SearchRedirectRepository$getSearchCategoryRedirectPage$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.etsy.android.ui.search.redirect.SearchRedirectRepository$getSearchCategoryRedirectPage$1 r0 = new com.etsy.android.ui.search.redirect.SearchRedirectRepository$getSearchCategoryRedirectPage$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r6 = r0.L$0
            com.etsy.android.ui.search.redirect.SearchRedirectRepository r6 = (com.etsy.android.p327ui.search.redirect.SearchRedirectRepository) r6
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)     // Catch:{ Exception -> 0x002c }
            goto L_0x004e
        L_0x002c:
            r7 = move-exception
            goto L_0x008f
        L_0x002e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0036:
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            com.etsy.android.ui.search.redirect.b r7 = r5.f24254a     // Catch:{ Exception -> 0x008c }
            java.lang.String r2 = r6.f24256a     // Catch:{ Exception -> 0x008c }
            java.util.HashMap<java.lang.String, java.lang.String> r6 = r6.f24257b     // Catch:{ Exception -> 0x008c }
            m18930a(r6)     // Catch:{ Exception -> 0x008c }
            r0.L$0 = r5     // Catch:{ Exception -> 0x008c }
            r0.label = r3     // Catch:{ Exception -> 0x008c }
            java.lang.Object r7 = r7.mo36251a(r2, r6, r0)     // Catch:{ Exception -> 0x008c }
            if (r7 != r1) goto L_0x004d
            return r1
        L_0x004d:
            r6 = r5
        L_0x004e:
            retrofit2.v r7 = (retrofit2.C20145v) r7     // Catch:{ Exception -> 0x002c }
            boolean r0 = r7.mo74384a()     // Catch:{ Exception -> 0x002c }
            if (r0 == 0) goto L_0x007b
            com.etsy.android.ui.search.redirect.c$b r0 = new com.etsy.android.ui.search.redirect.c$b     // Catch:{ Exception -> 0x002c }
            T r1 = r7.f44615b     // Catch:{ Exception -> 0x002c }
            okhttp3.a0 r1 = (okhttp3.C19928a0) r1     // Catch:{ Exception -> 0x002c }
            if (r1 == 0) goto L_0x0069
            byte[] r1 = r1.mo72841a()     // Catch:{ Exception -> 0x002c }
            java.lang.Class<com.etsy.android.lib.models.apiv3.SearchCategoryRedirectPage> r2 = com.etsy.android.lib.models.apiv3.SearchCategoryRedirectPage.class
            java.lang.Object r1 = com.etsy.android.lib.models.MoshiModelFactory.createFromByteArray(r1, r2)     // Catch:{ Exception -> 0x002c }
            goto L_0x006a
        L_0x0069:
            r1 = r4
        L_0x006a:
            kotlin.jvm.internal.C19383o.m32794d(r1)     // Catch:{ Exception -> 0x002c }
            com.etsy.android.lib.models.apiv3.SearchCategoryRedirectPage r1 = (com.etsy.android.lib.models.apiv3.SearchCategoryRedirectPage) r1     // Catch:{ Exception -> 0x002c }
            java.lang.String r7 = p001a0.C0005b.m48l0(r7)     // Catch:{ Exception -> 0x002c }
            if (r7 != 0) goto L_0x0077
            java.lang.String r7 = ""
        L_0x0077:
            r0.<init>(r1, r7)     // Catch:{ Exception -> 0x002c }
            goto L_0x00ad
        L_0x007b:
            okhttp3.z r0 = r7.f44614a     // Catch:{ Exception -> 0x002c }
            int r0 = r0.f44365f     // Catch:{ Exception -> 0x002c }
            com.squareup.moshi.y r1 = r6.f24255b     // Catch:{ Exception -> 0x002c }
            java.lang.String r7 = androidx.compose.foundation.layout.C0761x.m1692S0(r7, r1)     // Catch:{ Exception -> 0x002c }
            com.etsy.android.ui.search.redirect.c$a r1 = new com.etsy.android.ui.search.redirect.c$a     // Catch:{ Exception -> 0x002c }
            r1.<init>(r7, r0, r4)     // Catch:{ Exception -> 0x002c }
            r0 = r1
            goto L_0x00ad
        L_0x008c:
            r6 = move-exception
            r7 = r6
            r6 = r5
        L_0x008f:
            boolean r0 = r7 instanceof retrofit2.HttpException
            if (r0 == 0) goto L_0x0096
            retrofit2.HttpException r7 = (retrofit2.HttpException) r7
            goto L_0x0097
        L_0x0096:
            r7 = r4
        L_0x0097:
            if (r7 == 0) goto L_0x009e
            int r0 = r7.code()
            goto L_0x009f
        L_0x009e:
            r0 = 0
        L_0x009f:
            if (r7 == 0) goto L_0x00a7
            com.squareup.moshi.y r6 = r6.f24255b
            java.lang.String r4 = androidx.compose.foundation.layout.C0761x.m1690R0(r7, r6)
        L_0x00a7:
            com.etsy.android.ui.search.redirect.c$a r6 = new com.etsy.android.ui.search.redirect.c$a
            r6.<init>(r4, r0, r7)
            r0 = r6
        L_0x00ad:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.redirect.SearchRedirectRepository.mo36246b(com.etsy.android.ui.search.redirect.a, kotlin.coroutines.c):java.lang.Object");
    }
}
