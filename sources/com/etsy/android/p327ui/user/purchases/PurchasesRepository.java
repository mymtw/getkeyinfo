package com.etsy.android.p327ui.user.purchases;

import com.squareup.moshi.C17414y;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.purchases.PurchasesRepository */
public final class PurchasesRepository {

    /* renamed from: a */
    public final C11652j f25741a;

    /* renamed from: b */
    public final C17414y f25742b;

    /* renamed from: c */
    public final C11651i f25743c;

    public PurchasesRepository(C11652j jVar, C17414y yVar, C11651i iVar) {
        C19383o.m32797g(jVar, "endpoint");
        C19383o.m32797g(yVar, "moshi");
        C19383o.m32797g(iVar, "purchasesEligibility");
        this.f25741a = jVar;
        this.f25742b = yVar;
        this.f25743c = iVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01cb A[Catch:{ Exception -> 0x0157 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ac A[Catch:{ Exception -> 0x0157 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cd A[Catch:{ Exception -> 0x0157 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0144 A[Catch:{ Exception -> 0x0157 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x015a A[Catch:{ Exception -> 0x0157 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x017b A[Catch:{ Exception -> 0x0157 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo37701a(com.etsy.android.p327ui.user.purchases.C11632c r18, kotlin.coroutines.C19340c<? super com.etsy.android.p327ui.user.purchases.C11629b> r19) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            boolean r3 = r2 instanceof com.etsy.android.p327ui.user.purchases.PurchasesRepository$getUserReceipts$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.etsy.android.ui.user.purchases.PurchasesRepository$getUserReceipts$1 r3 = (com.etsy.android.p327ui.user.purchases.PurchasesRepository$getUserReceipts$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            com.etsy.android.ui.user.purchases.PurchasesRepository$getUserReceipts$1 r3 = new com.etsy.android.ui.user.purchases.PurchasesRepository$getUserReceipts$1
            r3.<init>(r1, r2)
        L_0x001e:
            java.lang.Object r2 = r3.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r5 = r3.label
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            r10 = 0
            if (r5 == 0) goto L_0x0069
            if (r5 == r8) goto L_0x005d
            if (r5 == r7) goto L_0x004b
            if (r5 != r6) goto L_0x0043
            java.lang.Object r0 = r3.L$2
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r4 = r3.L$1
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r3 = r3.L$0
            com.etsy.android.ui.user.purchases.PurchasesRepository r3 = (com.etsy.android.p327ui.user.purchases.PurchasesRepository) r3
            androidx.compose.foundation.layout.C0761x.m1684O0(r2)     // Catch:{ Exception -> 0x0157 }
            r15 = r0
            goto L_0x0173
        L_0x0043:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x004b:
            java.lang.Object r0 = r3.L$2
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r4 = r3.L$1
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r3 = r3.L$0
            com.etsy.android.ui.user.purchases.PurchasesRepository r3 = (com.etsy.android.p327ui.user.purchases.PurchasesRepository) r3
            androidx.compose.foundation.layout.C0761x.m1684O0(r2)     // Catch:{ Exception -> 0x0157 }
            r15 = r0
            goto L_0x00c5
        L_0x005d:
            java.lang.Object r0 = r3.L$1
            com.etsy.android.ui.user.purchases.c r0 = (com.etsy.android.p327ui.user.purchases.C11632c) r0
            java.lang.Object r5 = r3.L$0
            com.etsy.android.ui.user.purchases.PurchasesRepository r5 = (com.etsy.android.p327ui.user.purchases.PurchasesRepository) r5
            androidx.compose.foundation.layout.C0761x.m1684O0(r2)     // Catch:{ Exception -> 0x0157 }
            goto L_0x0080
        L_0x0069:
            androidx.compose.foundation.layout.C0761x.m1684O0(r2)
            boolean r2 = r0.f25755c     // Catch:{ Exception -> 0x0157 }
            if (r2 == 0) goto L_0x009d
            com.etsy.android.ui.user.purchases.j r2 = r1.f25741a     // Catch:{ Exception -> 0x0157 }
            r3.L$0 = r1     // Catch:{ Exception -> 0x0157 }
            r3.L$1 = r0     // Catch:{ Exception -> 0x0157 }
            r3.label = r8     // Catch:{ Exception -> 0x0157 }
            java.lang.Object r2 = r2.mo37746c(r3)     // Catch:{ Exception -> 0x0157 }
            if (r2 != r4) goto L_0x007f
            return r4
        L_0x007f:
            r5 = r1
        L_0x0080:
            retrofit2.v r2 = (retrofit2.C20145v) r2     // Catch:{ Exception -> 0x0157 }
            T r8 = r2.f44615b     // Catch:{ Exception -> 0x0157 }
            com.etsy.android.lib.models.pastpurchase.PastPurchaseReviewCarouselResult r8 = (com.etsy.android.lib.models.pastpurchase.PastPurchaseReviewCarouselResult) r8     // Catch:{ Exception -> 0x0157 }
            boolean r11 = r2.mo74384a()     // Catch:{ Exception -> 0x0157 }
            if (r11 == 0) goto L_0x0095
            if (r8 == 0) goto L_0x0095
            java.util.List r2 = r8.getItems()     // Catch:{ Exception -> 0x0157 }
            r8 = r2
            r2 = r10
            goto L_0x00a0
        L_0x0095:
            com.squareup.moshi.y r8 = r5.f25742b     // Catch:{ Exception -> 0x0157 }
            java.lang.String r2 = androidx.compose.foundation.layout.C0761x.m1694T0(r2, r8)     // Catch:{ Exception -> 0x0157 }
            r8 = r10
            goto L_0x00a0
        L_0x009d:
            r5 = r1
            r2 = r10
            r8 = r2
        L_0x00a0:
            com.etsy.android.ui.user.purchases.i r11 = r5.f25743c     // Catch:{ Exception -> 0x0157 }
            com.etsy.android.lib.config.c r11 = r11.f25778a     // Catch:{ Exception -> 0x0157 }
            com.etsy.android.lib.config.EtsyConfigKey r12 = com.etsy.android.lib.config.C8592b.f18807l0     // Catch:{ Exception -> 0x0157 }
            boolean r11 = r11.mo21132b(r12)     // Catch:{ Exception -> 0x0157 }
            if (r11 == 0) goto L_0x015a
            com.etsy.android.ui.user.purchases.j r6 = r5.f25741a     // Catch:{ Exception -> 0x0157 }
            int r11 = r0.f25754b     // Catch:{ Exception -> 0x0157 }
            int r0 = r0.f25753a     // Catch:{ Exception -> 0x0157 }
            r3.L$0 = r5     // Catch:{ Exception -> 0x0157 }
            r3.L$1 = r8     // Catch:{ Exception -> 0x0157 }
            r3.L$2 = r2     // Catch:{ Exception -> 0x0157 }
            r3.label = r7     // Catch:{ Exception -> 0x0157 }
            java.lang.Object r0 = r6.mo37745b(r11, r0, r3)     // Catch:{ Exception -> 0x0157 }
            if (r0 != r4) goto L_0x00c1
            return r4
        L_0x00c1:
            r15 = r2
            r3 = r5
            r4 = r8
            r2 = r0
        L_0x00c5:
            retrofit2.v r2 = (retrofit2.C20145v) r2     // Catch:{ Exception -> 0x0157 }
            boolean r0 = r2.mo74384a()     // Catch:{ Exception -> 0x0157 }
            if (r0 == 0) goto L_0x0144
            T r0 = r2.f44615b     // Catch:{ Exception -> 0x0157 }
            com.etsy.android.lib.models.apiv3.pastpurchase.ReceiptsWithModule r0 = (com.etsy.android.lib.models.apiv3.pastpurchase.ReceiptsWithModule) r0     // Catch:{ Exception -> 0x0157 }
            if (r0 == 0) goto L_0x00fa
            java.util.List r3 = r0.getReceipts()     // Catch:{ Exception -> 0x0157 }
            if (r3 == 0) goto L_0x00fa
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x0157 }
            int r6 = kotlin.collections.C19322o.m32624F0(r3)     // Catch:{ Exception -> 0x0157 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x0157 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x0157 }
        L_0x00e6:
            boolean r6 = r3.hasNext()     // Catch:{ Exception -> 0x0157 }
            if (r6 == 0) goto L_0x00fb
            java.lang.Object r6 = r3.next()     // Catch:{ Exception -> 0x0157 }
            com.etsy.android.lib.models.pastpurchase.PastPurchaseReceiptV3 r6 = (com.etsy.android.lib.models.pastpurchase.PastPurchaseReceiptV3) r6     // Catch:{ Exception -> 0x0157 }
            com.etsy.android.lib.models.pastpurchase.PastPurchaseReceipt r6 = androidx.compose.foundation.layout.C0761x.m1744t(r6)     // Catch:{ Exception -> 0x0157 }
            r5.add(r6)     // Catch:{ Exception -> 0x0157 }
            goto L_0x00e6
        L_0x00fa:
            r5 = r10
        L_0x00fb:
            if (r0 == 0) goto L_0x0114
            com.etsy.android.lib.models.apiv3.pastpurchase.ModulePlacement r3 = r0.getModulePlacement()     // Catch:{ Exception -> 0x0157 }
            if (r3 == 0) goto L_0x0114
            com.etsy.android.lib.models.apiv3.pastpurchase.Module r3 = r3.getModule()     // Catch:{ Exception -> 0x0157 }
            if (r3 == 0) goto L_0x0114
            java.util.List r3 = r3.getListings()     // Catch:{ Exception -> 0x0157 }
            if (r3 == 0) goto L_0x0114
            int r3 = r3.size()     // Catch:{ Exception -> 0x0157 }
            goto L_0x0115
        L_0x0114:
            r3 = r9
        L_0x0115:
            r6 = 6
            if (r3 != r6) goto L_0x0121
            if (r0 == 0) goto L_0x0121
            com.etsy.android.lib.models.apiv3.pastpurchase.ModulePlacement r0 = r0.getModulePlacement()     // Catch:{ Exception -> 0x0157 }
            r16 = r0
            goto L_0x0123
        L_0x0121:
            r16 = r10
        L_0x0123:
            java.lang.Integer r0 = p001a0.C0005b.m46k0(r2)     // Catch:{ Exception -> 0x0157 }
            if (r0 == 0) goto L_0x012d
            int r9 = r0.intValue()     // Catch:{ Exception -> 0x0157 }
        L_0x012d:
            r13 = r9
            com.etsy.android.ui.user.purchases.b$b r0 = new com.etsy.android.ui.user.purchases.b$b     // Catch:{ Exception -> 0x0157 }
            if (r5 != 0) goto L_0x0136
            kotlin.collections.EmptyList r2 = kotlin.collections.EmptyList.INSTANCE     // Catch:{ Exception -> 0x0157 }
            r12 = r2
            goto L_0x0137
        L_0x0136:
            r12 = r5
        L_0x0137:
            if (r4 != 0) goto L_0x013d
            kotlin.collections.EmptyList r2 = kotlin.collections.EmptyList.INSTANCE     // Catch:{ Exception -> 0x0157 }
            r14 = r2
            goto L_0x013e
        L_0x013d:
            r14 = r4
        L_0x013e:
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x0157 }
            goto L_0x01e3
        L_0x0144:
            com.squareup.moshi.y r0 = r3.f25742b     // Catch:{ Exception -> 0x0157 }
            java.lang.String r0 = androidx.compose.foundation.layout.C0761x.m1694T0(r2, r0)     // Catch:{ Exception -> 0x0157 }
            com.etsy.android.ui.user.purchases.b$a r3 = new com.etsy.android.ui.user.purchases.b$a     // Catch:{ Exception -> 0x0157 }
            retrofit2.HttpException r4 = new retrofit2.HttpException     // Catch:{ Exception -> 0x0157 }
            r4.<init>(r2)     // Catch:{ Exception -> 0x0157 }
            r3.<init>(r0, r15, r4)     // Catch:{ Exception -> 0x0157 }
        L_0x0154:
            r0 = r3
            goto L_0x01e3
        L_0x0157:
            r0 = move-exception
            goto L_0x01dd
        L_0x015a:
            com.etsy.android.ui.user.purchases.j r7 = r5.f25741a     // Catch:{ Exception -> 0x0157 }
            int r11 = r0.f25754b     // Catch:{ Exception -> 0x0157 }
            int r0 = r0.f25753a     // Catch:{ Exception -> 0x0157 }
            r3.L$0 = r5     // Catch:{ Exception -> 0x0157 }
            r3.L$1 = r8     // Catch:{ Exception -> 0x0157 }
            r3.L$2 = r2     // Catch:{ Exception -> 0x0157 }
            r3.label = r6     // Catch:{ Exception -> 0x0157 }
            java.lang.Object r0 = r7.mo37744a(r11, r0, r3)     // Catch:{ Exception -> 0x0157 }
            if (r0 != r4) goto L_0x016f
            return r4
        L_0x016f:
            r15 = r2
            r3 = r5
            r4 = r8
            r2 = r0
        L_0x0173:
            retrofit2.v r2 = (retrofit2.C20145v) r2     // Catch:{ Exception -> 0x0157 }
            boolean r0 = r2.mo74384a()     // Catch:{ Exception -> 0x0157 }
            if (r0 == 0) goto L_0x01cb
            T r0 = r2.f44615b     // Catch:{ Exception -> 0x0157 }
            okhttp3.a0 r0 = (okhttp3.C19928a0) r0     // Catch:{ Exception -> 0x0157 }
            if (r0 == 0) goto L_0x018d
            byte[] r0 = r0.mo72841a()     // Catch:{ Exception -> 0x0157 }
            java.lang.Class<com.etsy.android.lib.models.pastpurchase.PastPurchaseReceiptV3> r3 = com.etsy.android.lib.models.pastpurchase.PastPurchaseReceiptV3.class
            java.util.List r0 = com.etsy.android.lib.models.MoshiModelFactory.createListFromByteArray(r0, r3)     // Catch:{ Exception -> 0x0157 }
            if (r0 != 0) goto L_0x018f
        L_0x018d:
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.INSTANCE     // Catch:{ Exception -> 0x0157 }
        L_0x018f:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ Exception -> 0x0157 }
            int r3 = kotlin.collections.C19322o.m32624F0(r0)     // Catch:{ Exception -> 0x0157 }
            r12.<init>(r3)     // Catch:{ Exception -> 0x0157 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0157 }
        L_0x019c:
            boolean r3 = r0.hasNext()     // Catch:{ Exception -> 0x0157 }
            if (r3 == 0) goto L_0x01b0
            java.lang.Object r3 = r0.next()     // Catch:{ Exception -> 0x0157 }
            com.etsy.android.lib.models.pastpurchase.PastPurchaseReceiptV3 r3 = (com.etsy.android.lib.models.pastpurchase.PastPurchaseReceiptV3) r3     // Catch:{ Exception -> 0x0157 }
            com.etsy.android.lib.models.pastpurchase.PastPurchaseReceipt r3 = androidx.compose.foundation.layout.C0761x.m1744t(r3)     // Catch:{ Exception -> 0x0157 }
            r12.add(r3)     // Catch:{ Exception -> 0x0157 }
            goto L_0x019c
        L_0x01b0:
            java.lang.Integer r0 = p001a0.C0005b.m46k0(r2)     // Catch:{ Exception -> 0x0157 }
            if (r0 == 0) goto L_0x01ba
            int r9 = r0.intValue()     // Catch:{ Exception -> 0x0157 }
        L_0x01ba:
            r13 = r9
            com.etsy.android.ui.user.purchases.b$b r0 = new com.etsy.android.ui.user.purchases.b$b     // Catch:{ Exception -> 0x0157 }
            if (r4 != 0) goto L_0x01c3
            kotlin.collections.EmptyList r2 = kotlin.collections.EmptyList.INSTANCE     // Catch:{ Exception -> 0x0157 }
            r14 = r2
            goto L_0x01c4
        L_0x01c3:
            r14 = r4
        L_0x01c4:
            r16 = 0
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x0157 }
            goto L_0x01e3
        L_0x01cb:
            com.squareup.moshi.y r0 = r3.f25742b     // Catch:{ Exception -> 0x0157 }
            java.lang.String r0 = androidx.compose.foundation.layout.C0761x.m1694T0(r2, r0)     // Catch:{ Exception -> 0x0157 }
            com.etsy.android.ui.user.purchases.b$a r3 = new com.etsy.android.ui.user.purchases.b$a     // Catch:{ Exception -> 0x0157 }
            retrofit2.HttpException r4 = new retrofit2.HttpException     // Catch:{ Exception -> 0x0157 }
            r4.<init>(r2)     // Catch:{ Exception -> 0x0157 }
            r3.<init>(r0, r15, r4)     // Catch:{ Exception -> 0x0157 }
            goto L_0x0154
        L_0x01dd:
            com.etsy.android.ui.user.purchases.b$a r2 = new com.etsy.android.ui.user.purchases.b$a
            r2.<init>(r10, r10, r0)
            r0 = r2
        L_0x01e3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.user.purchases.PurchasesRepository.mo37701a(com.etsy.android.ui.user.purchases.c, kotlin.coroutines.c):java.lang.Object");
    }
}
