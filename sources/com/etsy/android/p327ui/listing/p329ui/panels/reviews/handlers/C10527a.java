package com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers;

import com.etsy.android.uikit.nav.transactions.TransactionDataRepository;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.listing.ui.panels.reviews.handlers.a */
public final class C10527a {

    /* renamed from: a */
    public final TransactionDataRepository f23097a;

    public C10527a(TransactionDataRepository transactionDataRepository) {
        C19383o.m32797g(transactionDataRepository, "transactionDataRepository");
        this.f23097a = transactionDataRepository;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [he.e] */
    /* JADX WARNING: type inference failed for: r11v2, types: [com.etsy.android.ui.navigation.keys.fragmentkeys.ShopHomeKey] */
    /* JADX WARNING: type inference failed for: r3v6, types: [com.etsy.android.ui.navigation.keys.fragmentkeys.FeedbackKey] */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        r2 = r2.getOwner();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p466vc.C13574d mo34114a(com.etsy.android.p327ui.listing.ListingViewState.C10092d r25, p466vc.C13597g.C13629e2 r26) {
        /*
            r24 = this;
            r0 = r26
            java.lang.String r1 = "event"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            java.lang.Long r1 = r25.mo33484l()
            com.etsy.android.lib.models.apiv3.listing.Shop r2 = r25.mo33483k()
            if (r1 == 0) goto L_0x00c8
            if (r2 == 0) goto L_0x00c8
            com.etsy.android.ui.listing.ui.panels.reviews.a r2 = r0.f30106b
            int r2 = r2.f23088f
            r3 = 3
            if (r2 <= r3) goto L_0x009a
            com.etsy.android.lib.models.apiv3.listing.Shop r2 = r25.mo33483k()
            r3 = 0
            if (r2 == 0) goto L_0x002d
            com.etsy.android.lib.models.apiv3.listing.User r2 = r2.getOwner()
            if (r2 == 0) goto L_0x002d
            java.lang.Long r2 = r2.getUserId()
            r8 = r2
            goto L_0x002e
        L_0x002d:
            r8 = r3
        L_0x002e:
            com.etsy.android.lib.models.apiv3.listing.Shop r2 = r25.mo33483k()
            if (r2 == 0) goto L_0x003a
            java.lang.String r2 = r2.getName()
            r9 = r2
            goto L_0x003b
        L_0x003a:
            r9 = r3
        L_0x003b:
            com.etsy.android.lib.models.apiv3.listing.Shop r2 = r25.mo33483k()
            if (r2 == 0) goto L_0x004d
            com.etsy.android.lib.models.apiv3.listing.User r2 = r2.getOwner()
            if (r2 == 0) goto L_0x004d
            java.lang.String r2 = r2.getLoginName()
            r10 = r2
            goto L_0x004e
        L_0x004d:
            r10 = r3
        L_0x004e:
            com.etsy.android.lib.models.apiv3.listing.Shop r2 = r25.mo33483k()
            if (r2 == 0) goto L_0x005e
            com.etsy.android.lib.models.apiv3.listing.User r2 = r2.getOwner()
            if (r2 == 0) goto L_0x005e
            java.lang.String r3 = r2.getDisplayName()
        L_0x005e:
            r11 = r3
            com.etsy.android.ui.listing.ui.panels.reviews.a r0 = r0.f30106b
            com.etsy.android.lib.models.apiv3.listing.ShopRating r13 = r0.f23090h
            int r15 = r0.f23088f
            com.etsy.android.feedback.FeedbackFragment$FeedbackUiData r0 = new com.etsy.android.feedback.FeedbackFragment$FeedbackUiData
            com.etsy.android.lib.models.apiv3.listing.Reviews$ReviewType r5 = com.etsy.android.lib.models.apiv3.listing.Reviews.ReviewType.SHOP
            long r6 = r1.longValue()
            r12 = 0
            r14 = 0
            r16 = 320(0x140, float:4.48E-43)
            r17 = 0
            r4 = r0
            r4.<init>(r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r2 = r24
            com.etsy.android.uikit.nav.transactions.TransactionDataRepository r3 = r2.f23097a
            int r0 = r3.mo38343b(r0)
            com.etsy.android.ui.navigation.keys.fragmentkeys.FeedbackKey r10 = new com.etsy.android.ui.navigation.keys.fragmentkeys.FeedbackKey
            java.lang.String r4 = r25.mo33467b()
            com.etsy.android.lib.models.datatypes.EtsyId r5 = new com.etsy.android.lib.models.datatypes.EtsyId
            long r6 = r1.longValue()
            r5.<init>((long) r6)
            r6 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r8 = 4
            r9 = 0
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            goto L_0x00c2
        L_0x009a:
            r2 = r24
            com.etsy.android.ui.navigation.keys.fragmentkeys.ShopHomeKey r10 = new com.etsy.android.ui.navigation.keys.fragmentkeys.ShopHomeKey
            java.lang.String r12 = r25.mo33467b()
            com.etsy.android.lib.models.datatypes.EtsyId r13 = new com.etsy.android.lib.models.datatypes.EtsyId
            long r0 = r1.longValue()
            r13.<init>((long) r0)
            com.etsy.android.ui.shop.ShopHomeConfig r14 = com.etsy.android.p327ui.shop.ShopHomeConfig.REVIEWS
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 1016(0x3f8, float:1.424E-42)
            r23 = 0
            r11 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x00c2:
            vc.d$b$i r0 = new vc.d$b$i
            r0.<init>(r10)
            goto L_0x00cc
        L_0x00c8:
            r2 = r24
            vc.d$a r0 = p466vc.C13574d.C13575a.f29662a
        L_0x00cc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers.C10527a.mo34114a(com.etsy.android.ui.listing.ListingViewState$d, vc.g$e2):vc.d");
    }
}
