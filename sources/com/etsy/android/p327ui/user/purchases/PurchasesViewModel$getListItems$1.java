package com.etsy.android.p327ui.user.purchases;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C19600e;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.etsy.android.ui.user.purchases.PurchasesViewModel$getListItems$1", mo70541f = "PurchasesViewModel.kt", mo70542l = {55, 57, 104, 107, 112}, mo70543m = "invokeSuspend")
/* renamed from: com.etsy.android.ui.user.purchases.PurchasesViewModel$getListItems$1 */
final class PurchasesViewModel$getListItems$1 extends SuspendLambda implements C19861p<C19600e<? super C11644f>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C11632c $spec;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C11679u this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PurchasesViewModel$getListItems$1(C11679u uVar, C11632c cVar, C19340c<? super PurchasesViewModel$getListItems$1> cVar2) {
        super(2, cVar2);
        this.this$0 = uVar;
        this.$spec = cVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        PurchasesViewModel$getListItems$1 purchasesViewModel$getListItems$1 = new PurchasesViewModel$getListItems$1(this.this$0, this.$spec, cVar);
        purchasesViewModel$getListItems$1.L$0 = obj;
        return purchasesViewModel$getListItems$1;
    }

    public final Object invoke(C19600e<? super C11644f> eVar, C19340c<? super C19394m> cVar) {
        return ((PurchasesViewModel$getListItems$1) create(eVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x027e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            r30 = this;
            r0 = r30
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 4
            r5 = 1
            r6 = 5
            r7 = 2
            if (r2 == 0) goto L_0x0037
            if (r2 == r5) goto L_0x002f
            if (r2 == r7) goto L_0x0025
            if (r2 == r3) goto L_0x0020
            if (r2 == r4) goto L_0x0020
            if (r2 != r6) goto L_0x0018
            goto L_0x0020
        L_0x0018:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0020:
            androidx.compose.foundation.layout.C0761x.m1684O0(r31)
            goto L_0x029b
        L_0x0025:
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.e r2 = (kotlinx.coroutines.flow.C19600e) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r31)
            r7 = r31
            goto L_0x005c
        L_0x002f:
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.e r2 = (kotlinx.coroutines.flow.C19600e) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r31)
            goto L_0x004b
        L_0x0037:
            androidx.compose.foundation.layout.C0761x.m1684O0(r31)
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.e r2 = (kotlinx.coroutines.flow.C19600e) r2
            com.etsy.android.ui.user.purchases.f$d r8 = com.etsy.android.p327ui.user.purchases.C11644f.C11648d.f25772a
            r0.L$0 = r2
            r0.label = r5
            java.lang.Object r8 = r2.emit(r8, r0)
            if (r8 != r1) goto L_0x004b
            return r1
        L_0x004b:
            com.etsy.android.ui.user.purchases.u r8 = r0.this$0
            com.etsy.android.ui.user.purchases.PurchasesRepository r8 = r8.f25877b
            com.etsy.android.ui.user.purchases.c r9 = r0.$spec
            r0.L$0 = r2
            r0.label = r7
            java.lang.Object r7 = r8.mo37701a(r9, r0)
            if (r7 != r1) goto L_0x005c
            return r1
        L_0x005c:
            com.etsy.android.ui.user.purchases.b r7 = (com.etsy.android.p327ui.user.purchases.C11629b) r7
            boolean r8 = r7 instanceof com.etsy.android.p327ui.user.purchases.C11629b.C11631b
            if (r8 == 0) goto L_0x027e
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            com.etsy.android.ui.user.purchases.b$b r7 = (com.etsy.android.p327ui.user.purchases.C11629b.C11631b) r7
            java.util.List<com.etsy.android.lib.models.pastpurchase.ReviewCarouselItem> r8 = r7.f25750c
            boolean r8 = r8.isEmpty()
            r8 = r8 ^ r5
            java.lang.String r10 = "<this>"
            if (r8 == 0) goto L_0x0136
            com.etsy.android.ui.user.purchases.u r8 = r0.this$0
            r8.f25879d = r3
            com.etsy.android.ui.user.purchases.e$a r8 = new com.etsy.android.ui.user.purchases.e$a
            r11 = 2131952408(0x7f130318, float:1.9541258E38)
            java.util.List<com.etsy.android.lib.models.pastpurchase.ReviewCarouselItem> r12 = r7.f25750c
            int r12 = r12.size()
            r8.<init>(r11, r12)
            r6.add(r8)
            java.util.List<com.etsy.android.lib.models.pastpurchase.ReviewCarouselItem> r8 = r7.f25750c
            java.util.ArrayList r15 = new java.util.ArrayList
            int r11 = kotlin.collections.C19322o.m32624F0(r8)
            r15.<init>(r11)
            java.util.Iterator r8 = r8.iterator()
        L_0x0098:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x00b1
            java.lang.Object r11 = r8.next()
            com.etsy.android.lib.models.pastpurchase.ReviewCarouselItem r11 = (com.etsy.android.lib.models.pastpurchase.ReviewCarouselItem) r11
            long r11 = r11.getTransactionId()
            java.lang.Long r13 = new java.lang.Long
            r13.<init>(r11)
            r15.add(r13)
            goto L_0x0098
        L_0x00b1:
            java.util.List<com.etsy.android.lib.models.pastpurchase.ReviewCarouselItem> r8 = r7.f25750c
            java.util.ArrayList r14 = new java.util.ArrayList
            int r11 = kotlin.collections.C19322o.m32624F0(r8)
            r14.<init>(r11)
            java.util.Iterator r8 = r8.iterator()
        L_0x00c0:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x0121
            java.lang.Object r11 = r8.next()
            com.etsy.android.lib.models.pastpurchase.ReviewCarouselItem r11 = (com.etsy.android.lib.models.pastpurchase.ReviewCarouselItem) r11
            kotlin.jvm.internal.C19383o.m32797g(r11, r10)
            com.etsy.android.ui.user.purchases.reviewcarousel.c r12 = new com.etsy.android.ui.user.purchases.reviewcarousel.c
            long r16 = r11.getTransactionId()
            com.etsy.android.ui.user.purchases.reviewcarousel.d r13 = new com.etsy.android.ui.user.purchases.reviewcarousel.d
            com.etsy.android.lib.models.apiv3.listing.ListingImage r18 = r11.getImage()
            java.lang.String r4 = r18.getUrl()
            com.etsy.android.lib.models.apiv3.listing.ListingImage r18 = r11.getImage()
            java.lang.String r3 = r18.getUrl75x75()
            com.etsy.android.lib.models.apiv3.listing.ListingImage r18 = r11.getImage()
            java.lang.String r9 = r18.getUrl300x300()
            com.etsy.android.lib.models.apiv3.listing.ListingImage r18 = r11.getImage()
            java.lang.String r5 = r18.getUrl600x600()
            r13.<init>(r4, r3, r9, r5)
            java.lang.String r3 = r11.getTitle()
            java.lang.String r4 = r11.getListingTitle()
            r11 = r12
            r5 = r12
            r9 = r13
            r12 = r16
            r18 = r8
            r8 = r14
            r14 = r15
            r19 = r15
            r15 = r9
            r16 = r3
            r17 = r4
            r11.<init>(r12, r14, r15, r16, r17)
            r8.add(r5)
            r14 = r8
            r8 = r18
            r15 = r19
            r3 = 3
            r4 = 4
            r5 = 1
            goto L_0x00c0
        L_0x0121:
            r8 = r14
            com.etsy.android.ui.user.purchases.e$d r3 = new com.etsy.android.ui.user.purchases.e$d
            r3.<init>(r8)
            r6.add(r3)
            com.etsy.android.ui.user.purchases.e$a r3 = new com.etsy.android.ui.user.purchases.e$a
            r4 = 2131951692(0x7f13004c, float:1.9539806E38)
            r5 = 0
            r3.<init>(r4, r5)
            r6.add(r3)
        L_0x0136:
            java.util.List<com.etsy.android.lib.models.pastpurchase.PastPurchaseReceipt> r3 = r7.f25748a
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = kotlin.collections.C19322o.m32624F0(r3)
            r4.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
        L_0x0145:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x015a
            java.lang.Object r5 = r3.next()
            com.etsy.android.lib.models.pastpurchase.PastPurchaseReceipt r5 = (com.etsy.android.lib.models.pastpurchase.PastPurchaseReceipt) r5
            com.etsy.android.ui.user.purchases.e$c r8 = new com.etsy.android.ui.user.purchases.e$c
            r8.<init>(r5)
            r4.add(r8)
            goto L_0x0145
        L_0x015a:
            kotlin.collections.C19324q.m32628J0(r4, r6)
            com.etsy.android.ui.user.purchases.u r3 = r0.this$0
            int r4 = r7.f25749b
            int r5 = r3.f25879d
            int r4 = r4 + r5
            r3.f25880e = r4
            com.etsy.android.lib.models.apiv3.pastpurchase.ModulePlacement r3 = r7.f25752e
            if (r3 == 0) goto L_0x024c
            java.util.List<com.etsy.android.lib.models.pastpurchase.ReviewCarouselItem> r3 = r7.f25750c
            boolean r3 = r3.isEmpty()
            r4 = 1
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x0180
            com.etsy.android.lib.models.apiv3.pastpurchase.ModulePlacement r3 = r7.f25752e
            int r3 = r3.getPosition()
            com.etsy.android.ui.user.purchases.u r4 = r0.this$0
            int r4 = r4.f25879d
            int r3 = r3 + r4
            goto L_0x0186
        L_0x0180:
            com.etsy.android.lib.models.apiv3.pastpurchase.ModulePlacement r3 = r7.f25752e
            int r3 = r3.getPosition()
        L_0x0186:
            com.etsy.android.lib.models.apiv3.pastpurchase.ModulePlacement r4 = r7.f25752e
            com.etsy.android.lib.models.apiv3.pastpurchase.Module r4 = r4.getModule()
            com.etsy.android.ui.user.purchases.e$b r5 = new com.etsy.android.ui.user.purchases.e$b
            kotlin.jvm.internal.C19383o.m32797g(r4, r10)
            java.lang.String r7 = r4.getHeaderTitle()
            com.etsy.android.lib.models.apiv3.pastpurchase.ModuleLandingPage r8 = r4.getLandingPage()
            kotlin.jvm.internal.C19383o.m32797g(r8, r10)
            java.lang.String r9 = r8.getLinkTitle()
            java.lang.String r11 = r8.getLinkLandingTitle()
            java.lang.String r12 = ""
            if (r11 != 0) goto L_0x01a9
            r11 = r12
        L_0x01a9:
            java.lang.String r13 = r8.getApiPath()
            java.lang.String r8 = r8.getEventName()
            if (r8 != 0) goto L_0x01b4
            r8 = r12
        L_0x01b4:
            com.etsy.android.ui.user.purchases.module.e r14 = new com.etsy.android.ui.user.purchases.module.e
            r14.<init>(r9, r13, r11, r8)
            java.util.List r4 = r4.getListings()
            java.util.ArrayList r8 = new java.util.ArrayList
            int r9 = kotlin.collections.C19322o.m32624F0(r4)
            r8.<init>(r9)
            java.util.Iterator r4 = r4.iterator()
        L_0x01ca:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x0239
            java.lang.Object r9 = r4.next()
            com.etsy.android.lib.models.apiv3.pastpurchase.ModuleListingCard r9 = (com.etsy.android.lib.models.apiv3.pastpurchase.ModuleListingCard) r9
            kotlin.jvm.internal.C19383o.m32797g(r9, r10)
            com.etsy.android.ui.user.purchases.module.g r11 = new com.etsy.android.ui.user.purchases.module.g
            long r20 = r9.getListingId()
            long r22 = r9.getShopId()
            java.lang.String r13 = r9.getListingTitle()
            if (r13 != 0) goto L_0x01ec
            r24 = r12
            goto L_0x01ee
        L_0x01ec:
            r24 = r13
        L_0x01ee:
            java.lang.String r25 = r9.getListingUrl()
            boolean r26 = r9.isFav()
            boolean r27 = r9.isInCollections()
            com.etsy.android.lib.models.apiv3.listing.ListingImage r13 = r9.getImg()
            if (r13 == 0) goto L_0x021e
            com.etsy.android.ui.user.purchases.module.f r15 = new com.etsy.android.ui.user.purchases.module.f
            r16 = r4
            java.lang.String r4 = r13.getUrl()
            r17 = r10
            java.lang.String r10 = r13.getUrl170x135()
            r18 = r12
            java.lang.String r12 = r13.getUrl340x270()
            java.lang.String r13 = r13.getUrl680x540()
            r15.<init>(r4, r10, r12, r13)
            r28 = r15
            goto L_0x0226
        L_0x021e:
            r16 = r4
            r17 = r10
            r18 = r12
            r28 = 0
        L_0x0226:
            java.lang.String r29 = r9.getContentSource()
            r19 = r11
            r19.<init>(r20, r22, r24, r25, r26, r27, r28, r29)
            r8.add(r11)
            r4 = r16
            r10 = r17
            r12 = r18
            goto L_0x01ca
        L_0x0239:
            com.etsy.android.ui.user.purchases.module.h r4 = new com.etsy.android.ui.user.purchases.module.h
            r4.<init>(r7, r14, r8)
            r5.<init>(r4)
            r6.add(r3, r5)
            com.etsy.android.ui.user.purchases.u r3 = r0.this$0
            int r4 = r3.f25879d
            r5 = 1
            int r4 = r4 + r5
            r3.f25879d = r4
        L_0x024c:
            boolean r3 = r6.isEmpty()
            if (r3 == 0) goto L_0x0261
            com.etsy.android.ui.user.purchases.f$a r3 = com.etsy.android.p327ui.user.purchases.C11644f.C11645a.f25768a
            r4 = 0
            r0.L$0 = r4
            r4 = 3
            r0.label = r4
            java.lang.Object r2 = r2.emit(r3, r0)
            if (r2 != r1) goto L_0x029b
            return r1
        L_0x0261:
            com.etsy.android.ui.user.purchases.u r3 = r0.this$0
            java.util.ArrayList r3 = r3.f25878c
            r3.addAll(r6)
            com.etsy.android.ui.user.purchases.f$c r3 = new com.etsy.android.ui.user.purchases.f$c
            com.etsy.android.ui.user.purchases.u r4 = r0.this$0
            int r4 = r4.f25880e
            r3.<init>(r4, r6)
            r4 = 0
            r0.L$0 = r4
            r4 = 4
            r0.label = r4
            java.lang.Object r2 = r2.emit(r3, r0)
            if (r2 != r1) goto L_0x029b
            return r1
        L_0x027e:
            boolean r3 = r7 instanceof com.etsy.android.p327ui.user.purchases.C11629b.C11630a
            if (r3 == 0) goto L_0x029b
            com.etsy.android.lib.logger.h r3 = com.etsy.android.lib.logger.LogCatKt.m17045a()
            com.etsy.android.ui.user.purchases.b$a r7 = (com.etsy.android.p327ui.user.purchases.C11629b.C11630a) r7
            java.lang.Throwable r4 = r7.f25745a
            r3.error(r4)
            com.etsy.android.ui.user.purchases.f$b r3 = com.etsy.android.p327ui.user.purchases.C11644f.C11646b.f25769a
            r4 = 0
            r0.L$0 = r4
            r0.label = r6
            java.lang.Object r2 = r2.emit(r3, r0)
            if (r2 != r1) goto L_0x029b
            return r1
        L_0x029b:
            kotlin.m r1 = kotlin.C19394m.f43287a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.user.purchases.PurchasesViewModel$getListItems$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
