package com.etsy.android.p327ui;

import p145io.reactivex.functions.Consumer;

/* renamed from: com.etsy.android.ui.m */
public final /* synthetic */ class C10673m implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ int f23509b;

    /* renamed from: c */
    public final /* synthetic */ Object f23510c;

    public /* synthetic */ C10673m(Object obj, int i) {
        this.f23509b = i;
        this.f23510c = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x022d, code lost:
        if (kotlin.jvm.internal.C19383o.m32792b(r2, "paypal") != false) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f7, code lost:
        r5 = r5.f21441b;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.f23509b
            r2 = 0
            r3 = 1
            java.lang.String r4 = "this$0"
            switch(r1) {
                case 0: goto L_0x02ac;
                case 1: goto L_0x02a0;
                case 2: goto L_0x027f;
                case 3: goto L_0x00e6;
                case 4: goto L_0x00da;
                case 5: goto L_0x005b;
                case 6: goto L_0x000d;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x02c2
        L_0x000d:
            java.lang.Object r1 = r0.f23510c
            zd.e r1 = (p499zd.C13957e) r1
            r2 = r18
            com.etsy.android.lib.network.oauth2.AccessTokens r2 = (com.etsy.android.lib.network.oauth2.AccessTokens) r2
            kotlin.jvm.internal.C19383o.m32797g(r1, r4)
            com.etsy.android.lib.logger.h r3 = com.etsy.android.lib.logger.LogCatKt.m17045a()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Token get! "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.mo21310e(r4)
            java.lang.String r3 = "it"
            kotlin.jvm.internal.C19383o.m32796f(r2, r3)
            r1.mo46778c(r2)
            androidx.lifecycle.z<zd.a> r3 = r1.f30689n
            zd.a$c r4 = new zd.a$c
            java.lang.StringBuilder r5 = android.support.p013v4.media.C0072d.m201h(r5)
            com.etsy.android.lib.network.oauth2.OAuth2AccessToken r2 = r2.getOAuth2AccessToken()
            java.lang.String r2 = r2.getAccessToken()
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4.<init>(r2)
            r3.postValue(r4)
            com.etsy.android.ui.user.auth.e r1 = r1.f30681f
            r1.onFetchedUser()
            return
        L_0x005b:
            java.lang.Object r1 = r0.f23510c
            com.etsy.android.ui.home.tabs.HomePagerViewModel r1 = (com.etsy.android.p327ui.home.tabs.HomePagerViewModel) r1
            r4 = r18
            qc.d r4 = (p428qc.C13286d) r4
            r1.getClass()
            boolean r5 = r4 instanceof p428qc.C13286d.C13291e
            if (r5 == 0) goto L_0x0083
            db.b r2 = r1.f22123i
            za.a r2 = r2.f27883a
            android.content.SharedPreferences r2 = r2.mo46761a()
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r4 = "shouldShowReengageSweepsV1"
            android.content.SharedPreferences$Editor r2 = r2.putBoolean(r4, r3)
            r2.apply()
            r1.mo33341e()
            goto L_0x00d9
        L_0x0083:
            boolean r5 = r4 instanceof p428qc.C13286d.C13292f
            if (r5 == 0) goto L_0x0088
            goto L_0x008a
        L_0x0088:
            boolean r3 = r4 instanceof p428qc.C13286d.C13293g
        L_0x008a:
            if (r3 == 0) goto L_0x0090
            r1.mo33342f()
            goto L_0x00d9
        L_0x0090:
            boolean r3 = r4 instanceof p428qc.C13286d.C13288b
            if (r3 == 0) goto L_0x00aa
            q9.p r3 = r1.f22122h
            boolean r3 = r3.mo45960e()
            if (r3 != 0) goto L_0x00d9
            androidx.lifecycle.z<com.etsy.android.ui.home.tabs.m> r1 = r1.f22130p
            com.etsy.android.ui.home.tabs.l$a r3 = new com.etsy.android.ui.home.tabs.l$a
            com.etsy.android.lib.deeplinks.EtsyAction r4 = com.etsy.android.lib.deeplinks.EtsyAction.VIEW_COUPON_BANNER
            r5 = 6
            r3.<init>(r4, r2, r5)
            com.etsy.android.p327ui.home.tabs.HomePagerViewModel.m18209c(r1, r3)
            goto L_0x00d9
        L_0x00aa:
            boolean r2 = r4 instanceof p428qc.C13286d.C13290d
            if (r2 == 0) goto L_0x00d9
            qc.d$d r4 = (p428qc.C13286d.C13290d) r4
            com.etsy.android.ui.homescreen.purchaseclaim.PurchaseClaimSpec r2 = r4.f29193a
            q9.p r3 = r1.f22122h
            boolean r3 = r3.mo45960e()
            if (r3 == 0) goto L_0x00be
            r1.mo33340d(r2)
            goto L_0x00d9
        L_0x00be:
            androidx.lifecycle.z<com.etsy.android.ui.home.tabs.m> r1 = r1.f22130p
            com.etsy.android.lib.deeplinks.EtsyAction r3 = com.etsy.android.lib.deeplinks.EtsyAction.CLAIM_PURCHASE
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r5 = r3.getType()
            r4.putParcelable(r5, r2)
            kotlin.m r2 = kotlin.C19394m.f43287a
            r2 = 2
            com.etsy.android.ui.home.tabs.l$a r5 = new com.etsy.android.ui.home.tabs.l$a
            r5.<init>(r3, r4, r2)
            com.etsy.android.p327ui.home.tabs.HomePagerViewModel.m18209c(r1, r5)
        L_0x00d9:
            return
        L_0x00da:
            java.lang.Object r1 = r0.f23510c
            com.etsy.android.ui.giftcards.GiftCardCreateFragment r1 = (com.etsy.android.p327ui.giftcards.GiftCardCreateFragment) r1
            r2 = r18
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            com.etsy.android.p327ui.giftcards.GiftCardCreateFragment.m34986requestGiftCardAmounts$lambda5(r1, r2)
            return
        L_0x00e6:
            java.lang.Object r1 = r0.f23510c
            com.etsy.android.ui.core.listinggallery.buyitnow.g r1 = (com.etsy.android.p327ui.core.listinggallery.buyitnow.C9666g) r1
            r5 = r18
            com.etsy.android.ui.core.listinggallery.buyitnow.a$a r5 = (com.etsy.android.p327ui.core.listinggallery.buyitnow.C9647a.C9648a) r5
            kotlin.jvm.internal.C19383o.m32797g(r1, r4)
            com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext r4 = r5.f21368a
            com.etsy.android.ui.core.listinggallery.e r5 = r1.f21416i
            if (r5 == 0) goto L_0x0100
            com.etsy.android.lib.models.apiv3.listing.ListingExpressCheckout r5 = r5.f21441b
            if (r5 == 0) goto L_0x0100
            com.etsy.android.lib.models.SingleListingCheckout r5 = com.etsy.android.lib.models.apiv3.listing.extensions.ListingExpressCheckoutExtensionsKt.convertToV2(r5)
            goto L_0x0101
        L_0x0100:
            r5 = r2
        L_0x0101:
            if (r5 == 0) goto L_0x0108
            com.etsy.android.lib.models.PaymentOption r6 = r5.getDefaultPaymentOption()
            goto L_0x0109
        L_0x0108:
            r6 = r2
        L_0x0109:
            r7 = 0
            if (r6 == 0) goto L_0x0114
            boolean r8 = r6.isGooglePay()
            if (r8 != r3) goto L_0x0114
            r8 = r3
            goto L_0x0115
        L_0x0114:
            r8 = r7
        L_0x0115:
            if (r8 == 0) goto L_0x013e
            if (r5 == 0) goto L_0x013c
            java.util.List r5 = r5.getPaymentOptions()
            if (r5 == 0) goto L_0x013c
            java.util.Iterator r5 = r5.iterator()
        L_0x0123:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0138
            java.lang.Object r6 = r5.next()
            r8 = r6
            com.etsy.android.lib.models.PaymentOption r8 = (com.etsy.android.lib.models.PaymentOption) r8
            boolean r8 = r8.isGooglePay()
            r8 = r8 ^ r3
            if (r8 == 0) goto L_0x0123
            goto L_0x0139
        L_0x0138:
            r6 = r2
        L_0x0139:
            com.etsy.android.lib.models.PaymentOption r6 = (com.etsy.android.lib.models.PaymentOption) r6
            goto L_0x013e
        L_0x013c:
            r10 = r2
            goto L_0x013f
        L_0x013e:
            r10 = r6
        L_0x013f:
            if (r4 == 0) goto L_0x0157
            com.etsy.android.lib.models.apiv3.listing.InventoryProductOffering r5 = r4.getOffering()
            if (r5 == 0) goto L_0x0157
            long r5 = r5.getOfferingId()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            boolean r5 = com.google.android.play.core.assetpacks.C15588c1.m25348t0(r5)
            if (r5 != r3) goto L_0x0157
            r5 = r3
            goto L_0x0158
        L_0x0157:
            r5 = r7
        L_0x0158:
            if (r5 == 0) goto L_0x0170
            com.etsy.android.lib.models.apiv3.listing.InventoryProductOffering r4 = r4.getOffering()
            if (r4 == 0) goto L_0x0169
            long r4 = r4.getOfferingId()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            goto L_0x016a
        L_0x0169:
            r4 = r2
        L_0x016a:
            java.lang.String r4 = r4.toString()
            r13 = r4
            goto L_0x0171
        L_0x0170:
            r13 = r2
        L_0x0171:
            com.etsy.android.ui.core.listinggallery.e r4 = r1.f21416i
            kotlin.jvm.internal.C19383o.m32794d(r4)
            com.etsy.android.lib.models.apiv3.listing.ListingFetch r4 = r4.f21440a
            kotlin.jvm.internal.C19383o.m32794d(r4)
            com.etsy.android.lib.models.apiv3.listing.Listing r4 = r4.getListing()
            long r4 = r4.getListingId()
            java.lang.String r12 = java.lang.String.valueOf(r4)
            com.etsy.android.ui.core.listinggallery.buyitnow.a r4 = r1.f21410c
            com.etsy.android.ui.core.listinggallery.e r5 = r1.f21416i
            kotlin.jvm.internal.C19383o.m32794d(r5)
            java.util.List<kotlin.Pair<com.etsy.android.lib.models.apiv3.listing.Variation, com.etsy.android.lib.models.apiv3.listing.VariationValue>> r6 = r1.f21419l
            r4.getClass()
            com.etsy.android.lib.models.apiv3.listing.ListingFetch r4 = r5.f21440a
            if (r4 == 0) goto L_0x0273
            boolean r4 = r4.hasVariations()
            com.etsy.android.lib.models.apiv3.listing.ListingFetch r8 = r5.f21440a
            boolean r8 = r8.hasSelectedAllVariations()
            if (r4 == 0) goto L_0x01d7
            if (r8 == 0) goto L_0x01d7
            com.etsy.android.lib.models.apiv3.listing.ListingFetch r4 = r5.f21440a
            java.util.List r4 = r4.getVariations()
            kotlin.jvm.internal.C19383o.m32794d(r4)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r5 = kotlin.collections.C19322o.m32624F0(r4)
            r6.<init>(r5)
            java.util.Iterator r4 = r4.iterator()
        L_0x01bb:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01dc
            java.lang.Object r5 = r4.next()
            com.etsy.android.lib.models.apiv3.listing.Variation r5 = (com.etsy.android.lib.models.apiv3.listing.Variation) r5
            kotlin.Pair r8 = new kotlin.Pair
            com.etsy.android.lib.models.apiv3.listing.VariationValue r9 = r5.getSelectedValue()
            kotlin.jvm.internal.C19383o.m32794d(r9)
            r8.<init>(r5, r9)
            r6.add(r8)
            goto L_0x01bb
        L_0x01d7:
            if (r6 == 0) goto L_0x01da
            goto L_0x01dc
        L_0x01da:
            kotlin.collections.EmptyList r6 = kotlin.collections.EmptyList.INSTANCE
        L_0x01dc:
            java.lang.String r15 = com.etsy.android.lib.models.apiv3.listing.extensions.OldStyleSelectedVariationsExtensionsKt.toExpressCheckoutJsonString(r6)
            boolean r4 = r1.mo32384c()
            if (r4 == 0) goto L_0x01e9
            java.lang.String r4 = r1.f21420m
            goto L_0x01ef
        L_0x01e9:
            com.etsy.android.ui.core.listinggallery.e r4 = r1.f21416i
            if (r4 == 0) goto L_0x01f1
            java.lang.String r4 = r4.f21443d
        L_0x01ef:
            r14 = r4
            goto L_0x01f2
        L_0x01f1:
            r14 = r2
        L_0x01f2:
            if (r10 == 0) goto L_0x024f
            com.etsy.android.ui.core.listinggallery.e r4 = r1.f21416i
            if (r4 == 0) goto L_0x020a
            com.etsy.android.lib.models.apiv3.listing.ListingExpressCheckout r4 = r4.f21441b
            if (r4 == 0) goto L_0x020a
            java.util.List r4 = r4.getPaymentOptions()
            if (r4 == 0) goto L_0x020a
            int r4 = r4.size()
            if (r4 != r3) goto L_0x020a
            r4 = r3
            goto L_0x020b
        L_0x020a:
            r4 = r7
        L_0x020b:
            if (r4 == 0) goto L_0x0230
            com.etsy.android.ui.core.listinggallery.e r4 = r1.f21416i
            if (r4 == 0) goto L_0x0227
            com.etsy.android.lib.models.apiv3.listing.ListingExpressCheckout r4 = r4.f21441b
            if (r4 == 0) goto L_0x0227
            java.util.List r4 = r4.getPaymentOptions()
            if (r4 == 0) goto L_0x0227
            java.lang.Object r4 = kotlin.collections.C19327t.m32638T0(r4)
            com.etsy.android.lib.models.apiv3.listing.ListingExpressCheckoutPaymentOption r4 = (com.etsy.android.lib.models.apiv3.listing.ListingExpressCheckoutPaymentOption) r4
            if (r4 == 0) goto L_0x0227
            java.lang.String r2 = r4.getPaymentMethod()
        L_0x0227:
            java.lang.String r4 = "paypal"
            boolean r2 = kotlin.jvm.internal.C19383o.m32792b(r2, r4)
            if (r2 == 0) goto L_0x0230
            goto L_0x0231
        L_0x0230:
            r3 = r7
        L_0x0231:
            if (r3 != 0) goto L_0x024f
            androidx.lifecycle.z<com.etsy.android.util.p<com.etsy.android.ui.core.listinggallery.buyitnow.c>> r2 = r1.f21413f
            com.etsy.android.util.p r3 = new com.etsy.android.util.p
            com.etsy.android.ui.core.listinggallery.buyitnow.c$b r4 = new com.etsy.android.ui.core.listinggallery.buyitnow.c$b
            r8 = r4
            r9 = r12
            r11 = r13
            r12 = r14
            r13 = r15
            r8.<init>(r9, r10, r11, r12, r13)
            r3.<init>(r4)
            r2.setValue(r3)
            androidx.lifecycle.z<com.etsy.android.ui.core.listinggallery.buyitnow.b> r1 = r1.f21411d
            com.etsy.android.ui.core.listinggallery.buyitnow.b$a r2 = com.etsy.android.p327ui.core.listinggallery.buyitnow.C9649b.C9650a.f21369a
            r1.setValue(r2)
            goto L_0x0272
        L_0x024f:
            androidx.lifecycle.z<com.etsy.android.util.p<com.etsy.android.ui.core.listinggallery.buyitnow.c>> r2 = r1.f21413f
            com.etsy.android.util.p r3 = new com.etsy.android.util.p
            com.etsy.android.ui.core.listinggallery.buyitnow.c$d r4 = new com.etsy.android.ui.core.listinggallery.buyitnow.c$d
            com.etsy.android.ui.core.listinggallery.e r5 = r1.f21416i
            kotlin.jvm.internal.C19383o.m32794d(r5)
            com.etsy.android.lib.models.apiv3.listing.ListingExpressCheckout r5 = r5.f21441b
            kotlin.jvm.internal.C19383o.m32794d(r5)
            r11 = r4
            r16 = r5
            r11.<init>(r12, r13, r14, r15, r16)
            r3.<init>(r4)
            r2.setValue(r3)
            androidx.lifecycle.z<com.etsy.android.ui.core.listinggallery.buyitnow.b> r1 = r1.f21411d
            com.etsy.android.ui.core.listinggallery.buyitnow.b$a r2 = com.etsy.android.p327ui.core.listinggallery.buyitnow.C9649b.C9650a.f21369a
            r1.setValue(r2)
        L_0x0272:
            return
        L_0x0273:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "ListingFetch must not be null in listingState when calling BuyItNowAPIUseCase.resolveSelectedVariations()"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x027f:
            java.lang.Object r1 = r0.f23510c
            com.etsy.android.ui.cart.saved.a r1 = (com.etsy.android.p327ui.cart.saved.C9336a) r1
            r2 = r18
            com.etsy.android.ui.cart.k r2 = (com.etsy.android.p327ui.cart.C9315k) r2
            kotlin.jvm.internal.C19383o.m32797g(r1, r4)
            java.lang.String r3 = "cartRefreshEvent"
            kotlin.jvm.internal.C19383o.m32797g(r2, r3)
            boolean r2 = r2 instanceof com.etsy.android.p327ui.cart.C9315k.C9320e
            if (r2 == 0) goto L_0x029f
            androidx.lifecycle.z<com.etsy.android.util.p<com.etsy.android.ui.cart.saved.a$a>> r2 = r1.f20618g
            com.etsy.android.ui.cart.saved.a$a$c r3 = com.etsy.android.p327ui.cart.saved.C9336a.C9337a.C9340c.f20622a
            com.etsy.android.util.C12060q.m19870a(r2, r3)
            com.etsy.android.ui.cart.l r1 = r1.f20615d
            r1.mo31715a()
        L_0x029f:
            return
        L_0x02a0:
            java.lang.Object r1 = r0.f23510c
            com.etsy.android.ui.cart.MultiShopCartFragment r1 = (com.etsy.android.p327ui.cart.MultiShopCartFragment) r1
            r2 = r18
            com.etsy.android.ui.cart.k r2 = (com.etsy.android.p327ui.cart.C9315k) r2
            com.etsy.android.p327ui.cart.MultiShopCartFragment.m34918onViewCreated$lambda2(r1, r2)
            return
        L_0x02ac:
            java.lang.Object r1 = r0.f23510c
            com.etsy.android.ui.n r1 = (com.etsy.android.p327ui.C10677n) r1
            r2 = r18
            com.etsy.android.ui.navigation.bottom.g r2 = (com.etsy.android.p327ui.navigation.bottom.C10690g) r2
            kotlin.jvm.internal.C19383o.m32797g(r1, r4)
            java.lang.String r3 = "state"
            kotlin.jvm.internal.C19383o.m32797g(r2, r3)
            androidx.lifecycle.z<com.etsy.android.ui.navigation.bottom.g> r1 = r1.f23523m
            r1.postValue(r2)
            return
        L_0x02c2:
            java.lang.Object r1 = r0.f23510c
            com.etsy.android.lib.logger.h r1 = (com.etsy.android.lib.logger.C8694h) r1
            r2 = r18
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r1.error(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.C10673m.accept(java.lang.Object):void");
    }
}
