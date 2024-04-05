package p409o9;

import p287xp.C8339g;

/* renamed from: o9.g */
public final /* synthetic */ class C13127g implements C8339g {

    /* renamed from: b */
    public final /* synthetic */ int f28858b;

    /* renamed from: c */
    public final /* synthetic */ Object f28859c;

    public /* synthetic */ C13127g(Object obj, int i) {
        this.f28858b = i;
        this.f28859c = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a6, code lost:
        r1 = r1.convert(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01b3, code lost:
        if (r10 != false) goto L_0x01c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0332  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r60) {
        /*
            r59 = this;
            r0 = r59
            int r1 = r0.f28858b
            r3 = 1
            r4 = 0
            java.lang.String r5 = "response"
            java.lang.String r6 = "this$0"
            switch(r1) {
                case 0: goto L_0x00c5;
                case 1: goto L_0x00b8;
                case 2: goto L_0x007a;
                case 3: goto L_0x003d;
                case 4: goto L_0x000f;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x00f7
        L_0x000f:
            java.lang.Object r1 = r0.f28859c
            com.etsy.android.ui.home.landingpage.c r1 = (com.etsy.android.p327ui.home.landingpage.C10021c) r1
            r3 = r60
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            kotlin.jvm.internal.C19383o.m32797g(r1, r6)
            java.lang.String r5 = "it"
            kotlin.jvm.internal.C19383o.m32797g(r3, r5)
            boolean r5 = r3 instanceof retrofit2.HttpException
            if (r5 == 0) goto L_0x0026
            retrofit2.HttpException r3 = (retrofit2.HttpException) r3
            goto L_0x0027
        L_0x0026:
            r3 = 0
        L_0x0027:
            com.etsy.android.ui.home.landingpage.e$b r5 = new com.etsy.android.ui.home.landingpage.e$b
            if (r3 == 0) goto L_0x0032
            com.squareup.moshi.y r1 = r1.f22070b
            java.lang.String r2 = androidx.compose.foundation.layout.C0761x.m1690R0(r3, r1)
            goto L_0x0033
        L_0x0032:
            r2 = 0
        L_0x0033:
            if (r3 == 0) goto L_0x0039
            int r4 = r3.code()
        L_0x0039:
            r5.<init>(r2, r4, r3)
            return r5
        L_0x003d:
            java.lang.Object r1 = r0.f28859c
            com.etsy.android.ui.favorites.createalist.g r1 = (com.etsy.android.p327ui.favorites.createalist.C9815g) r1
            r2 = r60
            java.util.List r2 = (java.util.List) r2
            kotlin.jvm.internal.C19383o.m32797g(r1, r6)
            java.lang.String r5 = "favorites"
            kotlin.jvm.internal.C19383o.m32797g(r2, r5)
            boolean r5 = kotlinx.coroutines.C19543e0.m33306Y(r2)
            if (r5 == 0) goto L_0x0067
            int r3 = r1.f21707e
            int r4 = r2.size()
            int r4 = r4 + r3
            r1.f21707e = r4
            java.util.ArrayList r1 = r1.f21708f
            r1.addAll(r2)
            com.etsy.android.ui.favorites.createalist.f$c r1 = new com.etsy.android.ui.favorites.createalist.f$c
            r1.<init>(r2)
            goto L_0x0079
        L_0x0067:
            int r5 = r1.f21707e
            if (r5 == 0) goto L_0x006c
            goto L_0x006d
        L_0x006c:
            r3 = r4
        L_0x006d:
            r1.f21711i = r3
            if (r3 == 0) goto L_0x0077
            com.etsy.android.ui.favorites.createalist.f$c r1 = new com.etsy.android.ui.favorites.createalist.f$c
            r1.<init>(r2)
            goto L_0x0079
        L_0x0077:
            com.etsy.android.ui.favorites.createalist.f$a r1 = com.etsy.android.p327ui.favorites.createalist.C9810f.C9811a.f21700a
        L_0x0079:
            return r1
        L_0x007a:
            java.lang.Object r1 = r0.f28859c
            com.etsy.android.ui.conversation.details.legacy.LegacyConversationRepository r1 = (com.etsy.android.p327ui.conversation.details.legacy.LegacyConversationRepository) r1
            r3 = r60
            retrofit2.v r3 = (retrofit2.C20145v) r3
            java.lang.Class<com.etsy.android.ui.conversation.details.legacy.LegacyConversationRepository$MessageSendError> r4 = com.etsy.android.p327ui.conversation.details.legacy.LegacyConversationRepository.MessageSendError.class
            kotlin.jvm.internal.C19383o.m32797g(r1, r6)
            kotlin.jvm.internal.C19383o.m32797g(r3, r5)
            boolean r5 = r3.mo74384a()
            if (r5 == 0) goto L_0x0096
            com.etsy.android.ui.conversation.details.r$b r1 = new com.etsy.android.ui.conversation.details.r$b
            r1.<init>()
            goto L_0x00b7
        L_0x0096:
            com.etsy.android.lib.network.f r1 = r1.f21150e
            retrofit2.w r1 = r1.f19176a
            java.lang.annotation.Annotation[] r5 = r4.getAnnotations()
            retrofit2.f r1 = r1.mo74390e(r4, r5)
            okhttp3.a0 r3 = r3.f44616c
            if (r3 == 0) goto L_0x00b1
            java.lang.Object r1 = r1.convert(r3)
            com.etsy.android.ui.conversation.details.legacy.LegacyConversationRepository$MessageSendError r1 = (com.etsy.android.p327ui.conversation.details.legacy.LegacyConversationRepository.MessageSendError) r1
            if (r1 == 0) goto L_0x00b1
            java.lang.String r2 = r1.f21151a
            goto L_0x00b2
        L_0x00b1:
            r2 = 0
        L_0x00b2:
            com.etsy.android.ui.conversation.details.r$a r1 = new com.etsy.android.ui.conversation.details.r$a
            r1.<init>(r2)
        L_0x00b7:
            return r1
        L_0x00b8:
            java.lang.Object r1 = r0.f28859c
            com.etsy.android.lib.requests.LocaleRepository r1 = (com.etsy.android.lib.requests.LocaleRepository) r1
            r2 = r60
            retrofit2.v r2 = (retrofit2.C20145v) r2
            com.etsy.android.lib.requests.LocaleResult r1 = com.etsy.android.lib.requests.LocaleRepository.m34869locale$lambda0(r1, r2)
            return r1
        L_0x00c5:
            java.lang.Object r1 = r0.f28859c
            o9.h r1 = (p409o9.C13128h) r1
            r2 = r60
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            kotlin.jvm.internal.C19383o.m32797g(r1, r6)
            java.lang.String r1 = "error"
            kotlin.jvm.internal.C19383o.m32797g(r2, r1)
            com.etsy.android.lib.config.GetConfigException r1 = new com.etsy.android.lib.config.GetConfigException
            java.lang.String r5 = r2.getMessage()
            if (r5 != 0) goto L_0x00df
            java.lang.String r5 = "An unknown error occurred while fetching Config"
        L_0x00df:
            r1.<init>(r5, r2)
            com.etsy.android.lib.util.CrashUtil r2 = com.etsy.android.lib.util.CrashUtil.m17307a()
            r2.getClass()
            com.etsy.android.lib.util.k r5 = new com.etsy.android.lib.util.k
            r5.<init>(r4, r2, r1)
            com.google.android.play.core.assetpacks.C15588c1.m25313X(r5, r3)
            com.etsy.android.lib.config.d$a r2 = new com.etsy.android.lib.config.d$a
            r2.<init>(r1)
            return r2
        L_0x00f7:
            java.lang.Object r1 = r0.f28859c
            com.etsy.android.ui.user.z r1 = (com.etsy.android.p327ui.user.C11769z) r1
            r7 = r60
            retrofit2.v r7 = (retrofit2.C20145v) r7
            kotlin.jvm.internal.C19383o.m32797g(r1, r6)
            kotlin.jvm.internal.C19383o.m32797g(r7, r5)
            boolean r5 = r7.mo74384a()
            if (r5 == 0) goto L_0x03ad
            T r5 = r7.f44615b
            okhttp3.a0 r5 = (okhttp3.C19928a0) r5
            if (r5 == 0) goto L_0x011d
            byte[] r5 = r5.mo72841a()
            java.lang.Class<com.etsy.android.lib.models.ReceiptApiModel> r6 = com.etsy.android.lib.models.ReceiptApiModel.class
            java.util.List r5 = com.etsy.android.lib.models.MoshiModelFactory.createListFromByteArray(r5, r6)
            if (r5 != 0) goto L_0x011f
        L_0x011d:
            kotlin.collections.EmptyList r5 = kotlin.collections.EmptyList.INSTANCE
        L_0x011f:
            java.lang.Object r5 = kotlin.collections.C19327t.m32640V0(r5)
            com.etsy.android.lib.models.ReceiptApiModel r5 = (com.etsy.android.lib.models.ReceiptApiModel) r5
            if (r5 == 0) goto L_0x039c
            com.etsy.android.ui.user.y$b r6 = new com.etsy.android.ui.user.y$b
            bf.a r1 = r1.f26215b
            r1.getClass()
            boolean r7 = r5.isInPerson()
            java.util.List r8 = r5.getTransactions()
            java.lang.String r9 = "transactions"
            kotlin.jvm.internal.C19383o.m32797g(r8, r9)
            if (r7 != 0) goto L_0x0171
            boolean r7 = r8.isEmpty()
            if (r7 == 0) goto L_0x0144
            goto L_0x016b
        L_0x0144:
            java.util.Iterator r7 = r8.iterator()
        L_0x0148:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x016b
            java.lang.Object r8 = r7.next()
            com.etsy.android.lib.models.Transaction r8 = (com.etsy.android.lib.models.Transaction) r8
            com.etsy.android.lib.models.Listing r10 = r8.getListing()
            boolean r10 = r10.isDigitalDownload()
            if (r10 != 0) goto L_0x0166
            boolean r8 = r8.isGiftCard()
            if (r8 != 0) goto L_0x0166
            r8 = r3
            goto L_0x0167
        L_0x0166:
            r8 = r4
        L_0x0167:
            if (r8 == 0) goto L_0x0148
            r7 = r3
            goto L_0x016c
        L_0x016b:
            r7 = r4
        L_0x016c:
            if (r7 == 0) goto L_0x0171
            r46 = r3
            goto L_0x0173
        L_0x0171:
            r46 = r4
        L_0x0173:
            java.lang.Long r7 = r5.getShippedTsz()
            r8 = 1000(0x3e8, float:1.401E-42)
            if (r7 == 0) goto L_0x0187
            long r10 = r7.longValue()
            java.util.Date r7 = new java.util.Date
            long r12 = (long) r8
            long r10 = r10 * r12
            r7.<init>(r10)
            goto L_0x0188
        L_0x0187:
            r7 = 0
        L_0x0188:
            java.lang.Long r10 = r5.getEstimatedShippedTsz()
            if (r10 == 0) goto L_0x019a
            long r10 = r10.longValue()
            java.util.Date r12 = new java.util.Date
            long r13 = (long) r8
            long r10 = r10 * r13
            r12.<init>(r10)
            goto L_0x019b
        L_0x019a:
            r12 = 0
        L_0x019b:
            boolean r10 = r5.getWasShipped()
            if (r46 != 0) goto L_0x01a2
            goto L_0x01c7
        L_0x01a2:
            r13 = 0
            if (r10 == 0) goto L_0x01b6
            if (r7 == 0) goto L_0x01b2
            long r10 = r7.getTime()
            int r10 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r10 <= 0) goto L_0x01b2
            r10 = r3
            goto L_0x01b3
        L_0x01b2:
            r10 = r4
        L_0x01b3:
            if (r10 == 0) goto L_0x01b6
            goto L_0x01c8
        L_0x01b6:
            if (r12 == 0) goto L_0x01c2
            long r10 = r12.getTime()
            int r7 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r7 <= 0) goto L_0x01c2
            r7 = r3
            goto L_0x01c3
        L_0x01c2:
            r7 = r4
        L_0x01c3:
            if (r7 == 0) goto L_0x01c7
            r7 = r12
            goto L_0x01c8
        L_0x01c7:
            r7 = 0
        L_0x01c8:
            com.etsy.android.lib.models.Receipt r15 = new com.etsy.android.lib.models.Receipt
            long r11 = r5.getReceiptId()
            java.lang.String r13 = r5.getName()
            java.lang.String r14 = r5.getFirstLine()
            java.lang.String r10 = r5.getSecondLine()
            java.lang.String r16 = ""
            if (r10 != 0) goto L_0x01e1
            r17 = r16
            goto L_0x01e3
        L_0x01e1:
            r17 = r10
        L_0x01e3:
            java.lang.String r18 = r5.getCity()
            java.lang.String r10 = r5.getState()
            if (r10 != 0) goto L_0x01f0
            r19 = r16
            goto L_0x01f2
        L_0x01f0:
            r19 = r10
        L_0x01f2:
            java.lang.String r10 = r5.getZip()
            if (r10 != 0) goto L_0x01fb
            r20 = r16
            goto L_0x01fd
        L_0x01fb:
            r20 = r10
        L_0x01fd:
            com.etsy.android.lib.models.Country r21 = r5.getCountry()
            java.lang.String r10 = r5.getPaymentMethodName()
            if (r10 != 0) goto L_0x020a
            r22 = r16
            goto L_0x020c
        L_0x020a:
            r22 = r10
        L_0x020c:
            java.lang.String r10 = r5.getTotalPrice()
            com.etsy.android.lib.currency.EtsyMoney r23 = p317bf.C8550a.m16951a(r10, r1, r5)
            java.lang.String r10 = r5.getDiscountAmount()
            com.etsy.android.lib.currency.EtsyMoney r24 = p317bf.C8550a.m16951a(r10, r1, r5)
            java.lang.String r10 = r5.getEtsyDiscountAmount()
            com.etsy.android.lib.currency.EtsyMoney r25 = p317bf.C8550a.m16951a(r10, r1, r5)
            java.lang.String r10 = r5.getTotalTaxCost()
            com.etsy.android.lib.currency.EtsyMoney r26 = p317bf.C8550a.m16951a(r10, r1, r5)
            java.lang.String r10 = r5.getTotalVatCost()
            com.etsy.android.lib.currency.EtsyMoney r27 = p317bf.C8550a.m16951a(r10, r1, r5)
            java.lang.String r10 = r5.getTotalShippingCost()
            com.etsy.android.lib.currency.EtsyMoney r28 = p317bf.C8550a.m16951a(r10, r1, r5)
            java.lang.String r10 = r5.getGiftCardAmountApplied()
            com.etsy.android.lib.currency.EtsyMoney r29 = p317bf.C8550a.m16951a(r10, r1, r5)
            java.lang.String r10 = r5.getGrandTotalAmount()
            com.etsy.android.lib.currency.EtsyMoney r1 = p317bf.C8550a.m16951a(r10, r1, r5)
            java.util.List r30 = r5.getVatCreditNoteIds()
            java.lang.String r31 = r5.getDonationDescription()
            java.lang.String r32 = r5.getDonationTermsLinkText()
            java.lang.String r33 = r5.getDonationTermsLinkUrl()
            com.etsy.android.lib.models.Location r34 = r5.getLocation()
            boolean r35 = r5.isFlaggedForManualFraudReview()
            boolean r36 = r5.getWasPaid()
            boolean r37 = r5.getWasGiftCardBalanceApplied()
            com.etsy.android.lib.models.Coupon r38 = r5.getCoupon()
            java.util.List r39 = r5.getTransactions()
            java.util.List r40 = r5.getShipments()
            java.lang.String r41 = r5.getShippingNote()
            boolean r42 = r5.getWasShipped()
            if (r7 != 0) goto L_0x0284
            r2 = r4
            goto L_0x02aa
        L_0x0284:
            java.util.Calendar r10 = java.util.Calendar.getInstance()
            r10.setTime(r7)
            p001a0.C0005b.m60s0(r10)
            java.util.Calendar r7 = java.util.Calendar.getInstance()
            java.lang.String r4 = "nowCal"
            kotlin.jvm.internal.C19383o.m32796f(r7, r4)
            p001a0.C0005b.m60s0(r7)
            long r43 = r10.getTimeInMillis()
            long r47 = r7.getTimeInMillis()
            long r43 = r43 - r47
            r47 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r43 / r47
            int r2 = (int) r2
        L_0x02aa:
            java.lang.Long r3 = r5.getShippingNotificationTsz()
            if (r3 == 0) goto L_0x02bf
            long r3 = r3.longValue()
            java.util.Date r7 = new java.util.Date
            r43 = r11
            long r10 = (long) r8
            long r3 = r3 * r10
            r7.<init>(r3)
            r4 = r7
            goto L_0x02c2
        L_0x02bf:
            r43 = r11
            r4 = 0
        L_0x02c2:
            java.lang.String r3 = r5.getShippingCarrier()
            java.lang.String r45 = r5.getShippingTrackingUrl()
            java.lang.String r47 = r5.getMessageFromSeller()
            java.lang.String r48 = r5.getMessageFromBuyer()
            boolean r49 = r5.isInPerson()
            java.util.List r7 = r5.getTransactions()
            kotlin.jvm.internal.C19383o.m32797g(r7, r9)
            boolean r8 = r7.isEmpty()
            r10 = 1
            r8 = r8 ^ r10
            if (r8 == 0) goto L_0x030e
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x02ec
            goto L_0x0308
        L_0x02ec:
            java.util.Iterator r7 = r7.iterator()
        L_0x02f0:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0308
            java.lang.Object r8 = r7.next()
            com.etsy.android.lib.models.Transaction r8 = (com.etsy.android.lib.models.Transaction) r8
            com.etsy.android.lib.models.Listing r8 = r8.getListing()
            boolean r8 = r8.isDigitalDownload()
            if (r8 != 0) goto L_0x02f0
            r7 = 0
            goto L_0x0309
        L_0x0308:
            r7 = r10
        L_0x0309:
            if (r7 == 0) goto L_0x030e
            r50 = r10
            goto L_0x0310
        L_0x030e:
            r50 = 0
        L_0x0310:
            com.etsy.android.lib.models.User r51 = r5.getSeller()
            java.lang.String r52 = r5.getSellerEmail()
            boolean r53 = r5.isGuest()
            com.etsy.android.lib.models.User r54 = r5.getBuyer()
            com.etsy.android.lib.models.GuestUser r55 = r5.getGuestUser()
            java.util.List r7 = r5.getTransactions()
            kotlin.jvm.internal.C19383o.m32797g(r7, r9)
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x0332
            goto L_0x034b
        L_0x0332:
            java.util.Iterator r7 = r7.iterator()
        L_0x0336:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x034b
            java.lang.Object r8 = r7.next()
            com.etsy.android.lib.models.Transaction r8 = (com.etsy.android.lib.models.Transaction) r8
            boolean r8 = r8.isGiftCard()
            if (r8 == 0) goto L_0x0336
            r56 = r10
            goto L_0x034d
        L_0x034b:
            r56 = 0
        L_0x034d:
            java.lang.String r57 = r5.getTransparentPriceMessage()
            java.lang.String r58 = r5.getMultiShopNote()
            r10 = r15
            r11 = r43
            r5 = r15
            r15 = r17
            r16 = r18
            r17 = r19
            r18 = r20
            r19 = r21
            r20 = r22
            r21 = r23
            r22 = r24
            r23 = r25
            r24 = r26
            r25 = r27
            r26 = r28
            r27 = r29
            r28 = r1
            r29 = r30
            r30 = r31
            r31 = r32
            r32 = r33
            r33 = r34
            r34 = r35
            r35 = r36
            r36 = r37
            r37 = r38
            r38 = r39
            r39 = r40
            r40 = r41
            r41 = r42
            r42 = r2
            r43 = r4
            r44 = r3
            r10.<init>(r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)
            r6.<init>(r5)
            goto L_0x03be
        L_0x039c:
            com.etsy.android.ui.user.y$a r2 = new com.etsy.android.ui.user.y$a
            com.squareup.moshi.y r1 = r1.f26216c
            java.lang.String r1 = androidx.compose.foundation.layout.C0761x.m1692S0(r7, r1)
            okhttp3.z r3 = r7.f44614a
            int r3 = r3.f44365f
            r4 = 0
            r2.<init>(r1, r3, r4)
            goto L_0x03bd
        L_0x03ad:
            r4 = 0
            com.etsy.android.ui.user.y$a r2 = new com.etsy.android.ui.user.y$a
            com.squareup.moshi.y r1 = r1.f26216c
            java.lang.String r1 = androidx.compose.foundation.layout.C0761x.m1692S0(r7, r1)
            okhttp3.z r3 = r7.f44614a
            int r3 = r3.f44365f
            r2.<init>(r1, r3, r4)
        L_0x03bd:
            r6 = r2
        L_0x03be:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p409o9.C13127g.apply(java.lang.Object):java.lang.Object");
    }
}
