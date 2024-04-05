package com.etsy.android.p327ui.user.purchases;

import androidx.lifecycle.C2843a0;

/* renamed from: com.etsy.android.ui.user.purchases.n */
public final /* synthetic */ class C11668n implements C2843a0 {

    /* renamed from: b */
    public final /* synthetic */ int f25833b;

    /* renamed from: c */
    public final /* synthetic */ Object f25834c;

    public /* synthetic */ C11668n(Object obj, int i) {
        this.f25833b = i;
        this.f25834c = obj;
    }

    /* JADX WARNING: type inference failed for: r1v17, types: [androidx.fragment.app.Fragment, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onChanged(java.lang.Object r26) {
        /*
            r25 = this;
            r0 = r25
            int r1 = r0.f25833b
            switch(r1) {
                case 0: goto L_0x002d;
                case 1: goto L_0x0021;
                case 2: goto L_0x0015;
                case 3: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x01fd
        L_0x0009:
            java.lang.Object r1 = r0.f25834c
            com.paypal.pyplcheckout.home.view.fragments.HomeFragment r1 = (com.paypal.pyplcheckout.home.view.fragments.HomeFragment) r1
            r2 = r26
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            com.paypal.pyplcheckout.home.view.fragments.HomeFragment.m35413initPYPLHomeViewModelObservers$lambda9(r1, r2)
            return
        L_0x0015:
            java.lang.Object r1 = r0.f25834c
            com.paypal.pyplcheckout.home.view.customviews.PayPalPoliciesAndRightsLinkView r1 = (com.paypal.pyplcheckout.home.view.customviews.PayPalPoliciesAndRightsLinkView) r1
            r2 = r26
            com.paypal.pyplcheckout.events.model.ContingencyEventsModel r2 = (com.paypal.pyplcheckout.events.model.ContingencyEventsModel) r2
            com.paypal.pyplcheckout.home.view.customviews.PayPalPoliciesAndRightsLinkView.m35348initViewModelObservers$lambda4(r1, r2)
            return
        L_0x0021:
            java.lang.Object r1 = r0.f25834c
            com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsToggle r1 = (com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsToggle) r1
            r2 = r26
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsToggle.m35231listenForShowEvents$lambda5(r1, r2)
            return
        L_0x002d:
            java.lang.Object r1 = r0.f25834c
            com.etsy.android.ui.user.purchases.r r1 = (com.etsy.android.p327ui.user.purchases.C11672r) r1
            r2 = r26
            com.etsy.android.util.p r2 = (com.etsy.android.util.C12059p) r2
            java.lang.String r3 = "this$0"
            kotlin.jvm.internal.C19383o.m32797g(r1, r3)
            java.lang.Object r2 = r2.mo38935a()
            com.etsy.android.ui.user.purchases.d r2 = (com.etsy.android.p327ui.user.purchases.C11633d) r2
            boolean r3 = r2 instanceof com.etsy.android.p327ui.user.purchases.C11633d.C11637d
            if (r3 == 0) goto L_0x0067
            com.etsy.android.ui.user.purchases.t r1 = r1.f25838a
            androidx.fragment.app.FragmentActivity r1 = r1.getFragmentActivity()
            com.etsy.android.ui.user.purchases.d$d r2 = (com.etsy.android.p327ui.user.purchases.C11633d.C11637d) r2
            long r2 = r2.f25761a
            com.etsy.android.ui.navigation.keys.fragmentkeys.ReceiptKey r12 = new com.etsy.android.ui.navigation.keys.fragmentkeys.ReceiptKey
            java.lang.String r5 = kotlin.reflect.C19421p.m32935c0(r1)
            java.lang.Long r6 = java.lang.Long.valueOf(r2)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 28
            r11 = 0
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            p356ge.C12788a.m20424c(r1, r12)
            goto L_0x01fc
        L_0x0067:
            boolean r3 = r2 instanceof com.etsy.android.p327ui.user.purchases.C11633d.C11638e
            r4 = 0
            java.lang.String r5 = "analyticsTracker"
            if (r3 == 0) goto L_0x00a5
            com.etsy.android.lib.logger.p r3 = r1.f25844g
            com.etsy.android.ui.user.purchases.t r1 = r1.f25838a
            androidx.fragment.app.FragmentActivity r1 = r1.getFragmentActivity()
            com.etsy.android.ui.user.purchases.d$e r2 = (com.etsy.android.p327ui.user.purchases.C11633d.C11638e) r2
            java.lang.String r12 = r2.f25762a
            kotlin.jvm.internal.C19383o.m32797g(r3, r5)
            java.lang.String r2 = "shopName"
            kotlin.jvm.internal.C19383o.m32797g(r12, r2)
            if (r1 == 0) goto L_0x01fc
            java.lang.String r2 = "shop_viewed_from_purchase"
            r3.mo21333d(r2, r4)
            com.etsy.android.ui.navigation.keys.fragmentkeys.ShopHomeKey r2 = new com.etsy.android.ui.navigation.keys.fragmentkeys.ShopHomeKey
            java.lang.String r7 = kotlin.reflect.C19421p.m32935c0(r1)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 990(0x3de, float:1.387E-42)
            r18 = 0
            r6 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            p356ge.C12788a.m20424c(r1, r2)
            goto L_0x01fc
        L_0x00a5:
            boolean r3 = r2 instanceof com.etsy.android.p327ui.user.purchases.C11633d.C11636c
            if (r3 == 0) goto L_0x00e7
            com.etsy.android.ui.user.purchases.t r3 = r1.f25838a
            androidx.fragment.app.FragmentActivity r3 = r3.getFragmentActivity()
            com.etsy.android.ui.user.purchases.t r1 = r1.f25838a
            androidx.fragment.app.Fragment r1 = r1.getFragment()
            com.etsy.android.lib.models.datatypes.EtsyId r7 = new com.etsy.android.lib.models.datatypes.EtsyId
            com.etsy.android.ui.user.purchases.d$c r2 = (com.etsy.android.p327ui.user.purchases.C11633d.C11636c) r2
            long r5 = r2.f25760a
            r7.<init>((long) r5)
            com.etsy.android.ui.user.review.ReviewTrackingSource r9 = com.etsy.android.p327ui.user.review.ReviewTrackingSource.PURCHASES_SCREEN
            r8 = 0
            r10 = 0
            java.lang.String r2 = "fragment"
            kotlin.jvm.internal.C19383o.m32797g(r1, r2)
            java.lang.String r2 = "source"
            kotlin.jvm.internal.C19383o.m32797g(r9, r2)
            boolean r2 = r1 instanceof com.etsy.android.p327ui.user.review.C11714m
            if (r2 == 0) goto L_0x00d3
            r4 = r1
            com.etsy.android.ui.user.review.m r4 = (com.etsy.android.p327ui.user.review.C11714m) r4
        L_0x00d3:
            if (r4 == 0) goto L_0x01fc
            ie.b r1 = new ie.b
            java.lang.String r6 = kotlin.reflect.C19421p.m32935c0(r3)
            r11 = 0
            r12 = 32
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r4.launchReviewFlow(r1)
            goto L_0x01fc
        L_0x00e7:
            boolean r3 = r2 instanceof com.etsy.android.p327ui.user.purchases.C11633d.C11634a
            if (r3 == 0) goto L_0x01a3
            com.etsy.android.ui.user.purchases.d$a r2 = (com.etsy.android.p327ui.user.purchases.C11633d.C11634a) r2
            long r3 = r2.f25756a
            java.lang.String r7 = java.lang.String.valueOf(r3)
            com.etsy.android.lib.logger.p r3 = r1.f25844g
            java.lang.String r8 = r3.f19059a
            q9.p r3 = r1.f25845h
            boolean r9 = r3.mo45960e()
            o9.q r3 = r1.f25846i
            java.lang.String r11 = r3.f28895a
            com.etsy.android.ui.user.c r3 = new com.etsy.android.ui.user.c
            java.lang.String r4 = "guid"
            kotlin.jvm.internal.C19383o.m32796f(r8, r4)
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r6 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.etsy.android.ui.user.purchases.t r4 = r1.f25838a
            androidx.fragment.app.FragmentActivity r4 = r4.getFragmentActivity()
            long r6 = r2.f25756a
            com.etsy.android.lib.logger.p r8 = r1.f25844g
            boolean r2 = r2.f25758c
            com.etsy.android.ui.user.b r9 = r1.f25847j
            com.etsy.android.ui.cart.CartBadgeCountRepo r10 = r1.f25848k
            ua.f r1 = r1.f25840c
            kotlin.jvm.internal.C19383o.m32797g(r8, r5)
            java.lang.String r5 = "addToCartRepo"
            kotlin.jvm.internal.C19383o.m32797g(r9, r5)
            java.lang.String r5 = "cartBadgeCountRepo"
            kotlin.jvm.internal.C19383o.m32797g(r10, r5)
            java.lang.String r5 = "schedulers"
            kotlin.jvm.internal.C19383o.m32797g(r1, r5)
            if (r4 == 0) goto L_0x01fc
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r5 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.LISTING_ID
            java.lang.Long r11 = java.lang.Long.valueOf(r6)
            r1.put(r5, r11)
            java.lang.String r5 = "buy_this_again_button_tapped_purchases"
            r8.mo21333d(r5, r1)
            if (r2 == 0) goto L_0x0183
            tp.s r1 = r9.mo37350a(r3)
            tp.r r2 = p456ua.C13461f.m21235b()
            io.reactivex.internal.operators.single.SingleSubscribeOn r1 = r1.mo20660i(r2)
            tp.r r2 = p456ua.C13461f.m21236c()
            io.reactivex.internal.operators.single.SingleObserveOn r1 = r1.mo20657f(r2)
            com.etsy.android.ui.user.purchases.PurchaseClickEventHandler$buyThisAgain$1$1 r2 = new com.etsy.android.ui.user.purchases.PurchaseClickEventHandler$buyThisAgain$1$1
            r2.<init>(r4)
            com.etsy.android.ui.user.purchases.PurchaseClickEventHandler$buyThisAgain$1$2 r3 = new com.etsy.android.ui.user.purchases.PurchaseClickEventHandler$buyThisAgain$1$2
            r3.<init>(r10)
            p145io.reactivex.rxkotlin.SubscribersKt.m32500e(r1, r2, r3)
            com.etsy.android.ui.navigation.keys.fragmentkeys.CartWithSavedKey r1 = new com.etsy.android.ui.navigation.keys.fragmentkeys.CartWithSavedKey
            java.lang.String r12 = kotlin.reflect.C19421p.m32935c0(r4)
            r13 = 0
            r14 = 0
            r15 = 6
            r16 = 0
            r11 = r1
            r11.<init>(r12, r13, r14, r15, r16)
            p356ge.C12788a.m20424c(r4, r1)
            goto L_0x01fc
        L_0x0183:
            com.etsy.android.ui.navigation.keys.fragmentkeys.ListingKey r1 = new com.etsy.android.ui.navigation.keys.fragmentkeys.ListingKey
            java.lang.String r18 = kotlin.reflect.C19421p.m32935c0(r4)
            com.etsy.android.lib.models.datatypes.EtsyId r2 = new com.etsy.android.lib.models.datatypes.EtsyId
            r2.<init>((long) r6)
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 28
            r24 = 0
            r17 = r1
            r19 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            p356ge.C12788a.m20424c(r4, r1)
            goto L_0x01fc
        L_0x01a3:
            boolean r3 = r2 instanceof com.etsy.android.p327ui.user.purchases.C11633d.C11635b
            if (r3 == 0) goto L_0x01fc
            com.etsy.android.ui.user.purchases.t r3 = r1.f25838a
            androidx.fragment.app.FragmentActivity r3 = r3.getFragmentActivity()
            com.etsy.android.ui.user.purchases.d$b r2 = (com.etsy.android.p327ui.user.purchases.C11633d.C11635b) r2
            long r6 = r2.f25759a
            com.etsy.android.lib.logger.p r1 = r1.f25844g
            kotlin.jvm.internal.C19383o.m32797g(r1, r5)
            java.lang.String r2 = "help_with_order_button_tapped_from_purchases"
            r1.mo21333d(r2, r4)
            com.etsy.android.lib.deeplinks.DeepLinkEntity r1 = com.etsy.android.lib.deeplinks.DeepLinkEntity.YOUR
            java.lang.String r1 = r1.getEntityName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.etsy.android.lib.deeplinks.DeepLinkEntity r4 = com.etsy.android.lib.deeplinks.DeepLinkEntity.PURCHASES
            java.lang.String r4 = r4.getEntityName()
            r2.append(r4)
            r4 = 47
            r2.append(r4)
            r2.append(r6)
            r2.append(r4)
            com.etsy.android.lib.deeplinks.DeepLinkEntity r4 = com.etsy.android.lib.deeplinks.DeepLinkEntity.HELP
            java.lang.String r4 = r4.getEntityName()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r1 = com.etsy.android.lib.util.C8915n.m17351c(r1, r2)
            com.etsy.android.ui.navigation.keys.fragmentkeys.GenericHelpKey r2 = new com.etsy.android.ui.navigation.keys.fragmentkeys.GenericHelpKey
            java.lang.String r4 = kotlin.reflect.C19421p.m32935c0(r3)
            java.lang.String r5 = "url"
            kotlin.jvm.internal.C19383o.m32796f(r1, r5)
            r2.<init>(r4, r1)
            p356ge.C12788a.m20423b(r3, r2)
        L_0x01fc:
            return
        L_0x01fd:
            java.lang.Object r1 = r0.f25834c
            com.paypal.pyplcheckout.userprofile.view.customviews.PayPalPoliciesView r1 = (com.paypal.pyplcheckout.userprofile.view.customviews.PayPalPoliciesView) r1
            r2 = r26
            com.paypal.pyplcheckout.userprofile.model.UserState r2 = (com.paypal.pyplcheckout.userprofile.model.UserState) r2
            com.paypal.pyplcheckout.userprofile.view.customviews.PayPalPoliciesView.m35452initViewModelObservers$lambda0(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.user.purchases.C11668n.onChanged(java.lang.Object):void");
    }
}
