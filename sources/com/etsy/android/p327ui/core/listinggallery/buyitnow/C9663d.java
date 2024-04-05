package com.etsy.android.p327ui.core.listinggallery.buyitnow;

import androidx.lifecycle.C2843a0;

/* renamed from: com.etsy.android.ui.core.listinggallery.buyitnow.d */
public final /* synthetic */ class C9663d implements C2843a0 {

    /* renamed from: b */
    public final /* synthetic */ int f21397b;

    /* renamed from: c */
    public final /* synthetic */ Object f21398c;

    public /* synthetic */ C9663d(Object obj, int i) {
        this.f21397b = i;
        this.f21398c = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x017c, code lost:
        if (r8 != false) goto L_0x0187;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0186  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onChanged(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.f21397b
            switch(r1) {
                case 0: goto L_0x0039;
                case 1: goto L_0x002d;
                case 2: goto L_0x0021;
                case 3: goto L_0x0015;
                case 4: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0286
        L_0x0009:
            java.lang.Object r1 = r0.f21398c
            com.paypal.pyplcheckout.home.view.customviews.AddCardView r1 = (com.paypal.pyplcheckout.home.view.customviews.AddCardView) r1
            r2 = r18
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            com.paypal.pyplcheckout.home.view.customviews.AddCardView.m35277initViewModelObservers$lambda5(r1, r2)
            return
        L_0x0015:
            java.lang.Object r1 = r0.f21398c
            com.paypal.pyplcheckout.home.view.activities.PYPLHomeActivity r1 = (com.paypal.pyplcheckout.home.view.activities.PYPLHomeActivity) r1
            r2 = r18
            com.paypal.pyplcheckout.viewmodels.CancelViewModel$State r2 = (com.paypal.pyplcheckout.viewmodels.CancelViewModel.State) r2
            com.paypal.pyplcheckout.home.view.activities.PYPLHomeActivity.m35260setupCancelViewModel$lambda3(r1, r2)
            return
        L_0x0021:
            java.lang.Object r1 = r0.f21398c
            com.paypal.pyplcheckout.conversionrate.view.customviews.PayPalConversionRateInfoView r1 = (com.paypal.pyplcheckout.conversionrate.view.customviews.PayPalConversionRateInfoView) r1
            r2 = r18
            java.lang.String r2 = (java.lang.String) r2
            com.paypal.pyplcheckout.conversionrate.view.customviews.PayPalConversionRateInfoView.m35240initViewModelObservers$lambda2(r1, r2)
            return
        L_0x002d:
            java.lang.Object r1 = r0.f21398c
            com.paypal.pyplcheckout.addressbook.view.customviews.PayPalNewShippingAddressHeaderView r1 = (com.paypal.pyplcheckout.addressbook.view.customviews.PayPalNewShippingAddressHeaderView) r1
            r2 = r18
            java.lang.String r2 = (java.lang.String) r2
            com.paypal.pyplcheckout.addressbook.view.customviews.PayPalNewShippingAddressHeaderView.m35167initViewModelObservers$lambda0(r1, r2)
            return
        L_0x0039:
            java.lang.Object r1 = r0.f21398c
            com.etsy.android.ui.core.listinggallery.buyitnow.f r1 = (com.etsy.android.p327ui.core.listinggallery.buyitnow.C9665f) r1
            r2 = r18
            com.etsy.android.util.p r2 = (com.etsy.android.util.C12059p) r2
            java.lang.String r3 = "this$0"
            kotlin.jvm.internal.C19383o.m32797g(r1, r3)
            r3 = 0
            if (r2 == 0) goto L_0x0050
            java.lang.Object r2 = r2.mo38935a()
            com.etsy.android.ui.core.listinggallery.buyitnow.c r2 = (com.etsy.android.p327ui.core.listinggallery.buyitnow.C9655c) r2
            goto L_0x0051
        L_0x0050:
            r2 = r3
        L_0x0051:
            com.etsy.android.uikit.ui.core.TrackingBaseFragment r4 = r1.f21407g
            if (r4 != 0) goto L_0x0057
            goto L_0x0285
        L_0x0057:
            boolean r5 = r2 instanceof com.etsy.android.p327ui.core.listinggallery.buyitnow.C9655c.C9657b
            if (r5 == 0) goto L_0x008b
            com.etsy.android.ui.navigation.keys.fragmentkeys.SingleListingCheckoutKey r1 = new com.etsy.android.ui.navigation.keys.fragmentkeys.SingleListingCheckoutKey
            kotlin.c<java.lang.String> r3 = com.etsy.android.lib.logger.referrers.Referrer.f19131c
            com.etsy.android.lib.logger.referrers.Referrer r3 = com.etsy.android.lib.logger.referrers.Referrer.C8712a.m17141a(r4)
            java.lang.String r7 = r3.toString()
            com.etsy.android.ui.core.listingnomapper.SingleListingCheckoutNavigationSpec r3 = new com.etsy.android.ui.core.listingnomapper.SingleListingCheckoutNavigationSpec
            com.etsy.android.ui.core.listinggallery.buyitnow.c$b r2 = (com.etsy.android.p327ui.core.listinggallery.buyitnow.C9655c.C9657b) r2
            java.lang.String r9 = r2.f21375a
            int r5 = r2.f21376b
            java.lang.String r10 = java.lang.String.valueOf(r5)
            com.etsy.android.lib.models.PaymentOption r11 = r2.f21377c
            java.lang.String r12 = r2.f21378d
            java.lang.String r13 = r2.f21379e
            java.lang.String r14 = r2.f21380f
            r8 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r9 = 0
            r10 = 4
            r11 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            p356ge.C12790b.m20430b(r4, r1)
            goto L_0x0285
        L_0x008b:
            boolean r5 = r2 instanceof com.etsy.android.p327ui.core.listinggallery.buyitnow.C9655c.C9659d
            if (r5 == 0) goto L_0x00bc
            kotlin.c<java.lang.String> r1 = com.etsy.android.lib.logger.referrers.Referrer.f19131c
            com.etsy.android.lib.logger.referrers.Referrer r1 = com.etsy.android.lib.logger.referrers.Referrer.C8712a.m17141a(r4)
            java.lang.String r6 = r1.toString()
            com.etsy.android.ui.core.listinggallery.buyitnow.c$d r2 = (com.etsy.android.p327ui.core.listinggallery.buyitnow.C9655c.C9659d) r2
            com.etsy.android.lib.models.apiv3.listing.ListingExpressCheckout r1 = r2.f21387f
            com.etsy.android.lib.models.SingleListingCheckout r8 = com.etsy.android.lib.models.apiv3.listing.extensions.ListingExpressCheckoutExtensionsKt.convertToV2(r1)
            com.etsy.android.lib.models.apiv3.cart.SingleListingCart r9 = r2.f21388g
            java.lang.String r7 = r2.f21382a
            int r1 = r2.f21383b
            java.lang.String r10 = java.lang.String.valueOf(r1)
            java.lang.String r11 = r2.f21384c
            java.lang.String r12 = r2.f21385d
            java.lang.String r13 = r2.f21386e
            com.etsy.android.ui.navigation.keys.fragmentkeys.SingleListingCheckoutDialogKey r1 = new com.etsy.android.ui.navigation.keys.fragmentkeys.SingleListingCheckoutDialogKey
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            p356ge.C12790b.m20430b(r4, r1)
            goto L_0x0285
        L_0x00bc:
            boolean r5 = r2 instanceof com.etsy.android.p327ui.core.listinggallery.buyitnow.C9655c.C9658c
            r6 = 0
            if (r5 == 0) goto L_0x00d4
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            if (r1 == 0) goto L_0x0285
            com.etsy.android.ui.core.listinggallery.buyitnow.c$c r2 = (com.etsy.android.p327ui.core.listinggallery.buyitnow.C9655c.C9658c) r2
            int r2 = r2.f21381a
            android.widget.Toast r1 = android.widget.Toast.makeText(r1, r2, r6)
            r1.show()
            goto L_0x0285
        L_0x00d4:
            boolean r5 = r2 instanceof com.etsy.android.p327ui.core.listinggallery.buyitnow.C9655c.C9662g
            r7 = 1
            if (r5 == 0) goto L_0x01d1
            com.etsy.android.ui.core.listinggallery.buyitnow.c$g r2 = (com.etsy.android.p327ui.core.listinggallery.buyitnow.C9655c.C9662g) r2
            boolean r4 = r2.f21393b
            int r5 = r2.f21394c
            java.lang.String r8 = r2.f21395d
            java.lang.String r2 = r2.f21396e
            java.lang.String r9 = "personalizationInstructions"
            kotlin.jvm.internal.C19383o.m32797g(r8, r9)
            java.lang.String r9 = "originalPersonalization"
            kotlin.jvm.internal.C19383o.m32797g(r2, r9)
            r1.mo32380c()
            com.etsy.android.ui.core.listinggallery.buyitnow.l r15 = new com.etsy.android.ui.core.listinggallery.buyitnow.l
            a0.b r9 = r1.f21401a
            r15.<init>(r9)
            r1.f21404d = r15
            com.etsy.android.uikit.ui.core.TrackingBaseFragment r9 = r1.f21407g
            if (r9 == 0) goto L_0x0103
            androidx.fragment.app.FragmentActivity r9 = r9.requireActivity()
            r11 = r9
            goto L_0x0104
        L_0x0103:
            r11 = r3
        L_0x0104:
            kotlin.jvm.internal.C19383o.m32794d(r11)
            com.etsy.android.ui.core.listinggallery.buyitnow.BuyItNowPresenter$showPersonalizationBottomSheet$1 r14 = new com.etsy.android.ui.core.listinggallery.buyitnow.BuyItNowPresenter$showPersonalizationBottomSheet$1
            r14.<init>(r1)
            com.etsy.android.stylekit.views.CollageBottomSheet r1 = new com.etsy.android.stylekit.views.CollageBottomSheet
            r9 = 2132017436(0x7f14011c, float:1.967315E38)
            r1.<init>(r11, r9)
            r1.setPopover(r7)
            r9 = 2131624470(0x7f0e0216, float:1.887612E38)
            r1.setContentView((int) r9)
            r9 = 2131430096(0x7f0b0ad0, float:1.8481883E38)
            android.view.View r9 = r1.findViewById(r9)
            kotlin.jvm.internal.C19383o.m32794d(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r10 = 2131430078(0x7f0b0abe, float:1.8481847E38)
            android.view.View r10 = r1.findViewById(r10)
            kotlin.jvm.internal.C19383o.m32794d(r10)
            r13 = r10
            com.etsy.android.stylekit.views.CollageTextInput r13 = (com.etsy.android.stylekit.views.CollageTextInput) r13
            r10 = 2131427634(0x7f0b0132, float:1.847689E38)
            android.view.View r10 = r1.findViewById(r10)
            kotlin.jvm.internal.C19383o.m32794d(r10)
            r12 = r10
            android.widget.Button r12 = (android.widget.Button) r12
            r9.setText(r8)
            r13.setRequired(r4)
            r13.setCounterMaxLength(r5)
            r13.setText(r2)
            int r8 = r2.length()
            r13.setSelection(r8)
            if (r4 == 0) goto L_0x016e
            int r8 = r2.length()
            if (r8 != 0) goto L_0x0160
            r8 = r7
            goto L_0x0161
        L_0x0160:
            r8 = r6
        L_0x0161:
            if (r8 == 0) goto L_0x016e
            r8 = 2131952459(0x7f13034b, float:1.9541361E38)
            java.lang.String r8 = r11.getString(r8)
            r13.setErrorText(r8)
            goto L_0x0171
        L_0x016e:
            r13.setErrorText(r3)
        L_0x0171:
            if (r4 == 0) goto L_0x017f
            int r8 = r2.length()
            if (r8 != 0) goto L_0x017b
            r8 = r7
            goto L_0x017c
        L_0x017b:
            r8 = r6
        L_0x017c:
            if (r8 == 0) goto L_0x017f
            goto L_0x0187
        L_0x017f:
            int r2 = r2.length()
            if (r2 <= r5) goto L_0x0186
            goto L_0x0187
        L_0x0186:
            r6 = r7
        L_0x0187:
            r12.setEnabled(r6)
            com.etsy.android.ui.core.listinggallery.buyitnow.PersonalizationBottomSheet$start$1$2 r2 = new com.etsy.android.ui.core.listinggallery.buyitnow.PersonalizationBottomSheet$start$1$2
            r8 = r2
            r9 = r4
            r10 = r13
            r6 = r12
            r12 = r15
            r7 = r13
            r13 = r5
            r16 = r14
            r14 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14)
            com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.TextinputKt.m18959a(r7, r2)
            com.etsy.android.ui.core.listinggallery.buyitnow.h r2 = new com.etsy.android.ui.core.listinggallery.buyitnow.h
            r8 = r2
            r9 = r15
            r10 = r7
            r11 = r4
            r12 = r5
            r13 = r16
            r8.<init>(r9, r10, r11, r12, r13)
            r7.setOnEditorActionListener(r2)
            com.etsy.android.ui.core.listinggallery.buyitnow.PersonalizationBottomSheet$start$1$4 r2 = new com.etsy.android.ui.core.listinggallery.buyitnow.PersonalizationBottomSheet$start$1$4
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13)
            com.etsy.android.extensions.ViewExtensions.m12866j(r6, r2)
            com.etsy.android.ui.core.listinggallery.buyitnow.i r2 = new com.etsy.android.ui.core.listinggallery.buyitnow.i
            r2.<init>(r1, r7)
            r1.setOnShowListener(r2)
            r15.f21431b = r1
            r1.setOnDismissListener(r3)
            r1.dismiss()
            r1.show()
            com.etsy.android.ui.core.listinggallery.buyitnow.j r2 = new com.etsy.android.ui.core.listinggallery.buyitnow.j
            r2.<init>(r15)
            r1.setOnDismissListener(r2)
            goto L_0x0285
        L_0x01d1:
            boolean r5 = r2 instanceof com.etsy.android.p327ui.core.listinggallery.buyitnow.C9655c.C9660e
            if (r5 == 0) goto L_0x022e
            com.etsy.android.ui.core.listinggallery.buyitnow.c$e r2 = (com.etsy.android.p327ui.core.listinggallery.buyitnow.C9655c.C9660e) r2
            com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext r4 = r2.f21389a
            java.util.Map<java.lang.Long, com.etsy.android.lib.models.apiv3.listing.ListingImage> r8 = r2.f21390b
            r1.mo32380c()
            com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartUi r2 = r4.getUi()
            com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartUi r4 = r4.getUi()
            if (r4 == 0) goto L_0x01ec
            java.util.List r3 = r4.getSelects()
        L_0x01ec:
            r9 = r3
            if (r2 == 0) goto L_0x0285
            if (r9 == 0) goto L_0x0285
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L_0x01f9
            goto L_0x0285
        L_0x01f9:
            int r2 = r9.size()
            if (r2 <= r7) goto L_0x021f
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.Object r2 = r9.get(r6)
            r10 = r2
            com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiSelect r10 = (com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiSelect) r10
            java.lang.Object r2 = r9.get(r7)
            r5 = r2
            com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiSelect r5 = (com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiSelect) r5
            com.etsy.android.ui.core.listinggallery.buyitnow.BuyItNowPresenter$showNewStyleVariationBottomSheets$1 r11 = new com.etsy.android.ui.core.listinggallery.buyitnow.BuyItNowPresenter$showNewStyleVariationBottomSheets$1
            r2 = r11
            r4 = r1
            r6 = r8
            r7 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            r1.mo32381d(r10, r8, r11)
            goto L_0x0285
        L_0x021f:
            java.lang.Object r2 = r9.get(r6)
            com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiSelect r2 = (com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiSelect) r2
            com.etsy.android.ui.core.listinggallery.buyitnow.BuyItNowPresenter$showNewStyleVariationBottomSheets$2 r3 = new com.etsy.android.ui.core.listinggallery.buyitnow.BuyItNowPresenter$showNewStyleVariationBottomSheets$2
            r3.<init>(r1)
            r1.mo32381d(r2, r8, r3)
            goto L_0x0285
        L_0x022e:
            boolean r3 = r2 instanceof com.etsy.android.p327ui.core.listinggallery.buyitnow.C9655c.C9661f
            if (r3 == 0) goto L_0x0272
            com.etsy.android.ui.core.listinggallery.buyitnow.c$f r2 = (com.etsy.android.p327ui.core.listinggallery.buyitnow.C9655c.C9661f) r2
            java.util.List<com.etsy.android.lib.models.apiv3.listing.Variation> r8 = r2.f21391a
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto L_0x023d
            goto L_0x0285
        L_0x023d:
            int r2 = r8.size()
            if (r2 <= r7) goto L_0x0263
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.Object r2 = r8.get(r6)
            r9 = r2
            com.etsy.android.lib.models.apiv3.listing.Variation r9 = (com.etsy.android.lib.models.apiv3.listing.Variation) r9
            java.lang.Object r2 = r8.get(r7)
            r6 = r2
            com.etsy.android.lib.models.apiv3.listing.Variation r6 = (com.etsy.android.lib.models.apiv3.listing.Variation) r6
            com.etsy.android.ui.core.listinggallery.buyitnow.BuyItNowPresenter$showOldStyleVariationBottomSheets$1 r10 = new com.etsy.android.ui.core.listinggallery.buyitnow.BuyItNowPresenter$showOldStyleVariationBottomSheets$1
            r2 = r10
            r4 = r9
            r5 = r1
            r7 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            r1.mo32382e(r9, r10)
            goto L_0x0285
        L_0x0263:
            java.lang.Object r2 = r8.get(r6)
            com.etsy.android.lib.models.apiv3.listing.Variation r2 = (com.etsy.android.lib.models.apiv3.listing.Variation) r2
            com.etsy.android.ui.core.listinggallery.buyitnow.BuyItNowPresenter$showOldStyleVariationBottomSheets$2 r3 = new com.etsy.android.ui.core.listinggallery.buyitnow.BuyItNowPresenter$showOldStyleVariationBottomSheets$2
            r3.<init>(r1, r2)
            r1.mo32382e(r2, r3)
            goto L_0x0285
        L_0x0272:
            boolean r2 = r2 instanceof com.etsy.android.p327ui.core.listinggallery.buyitnow.C9655c.C9656a
            if (r2 == 0) goto L_0x0285
            com.etsy.android.lib.logger.p r2 = r4.getAnalyticsContext()
            if (r2 == 0) goto L_0x0285
            java.util.Map r1 = r1.mo32379b()
            java.lang.String r3 = "buy_it_now_tapped"
            r2.mo21333d(r3, r1)
        L_0x0285:
            return
        L_0x0286:
            java.lang.Object r1 = r0.f21398c
            com.paypal.pyplcheckout.home.view.customviews.PayPalCurrencyConversionView r1 = (com.paypal.pyplcheckout.home.view.customviews.PayPalCurrencyConversionView) r1
            r2 = r18
            com.paypal.pyplcheckout.events.model.ContingencyEventsModel r2 = (com.paypal.pyplcheckout.events.model.ContingencyEventsModel) r2
            com.paypal.pyplcheckout.home.view.customviews.PayPalCurrencyConversionView.m35314initViewModelObservers$lambda5(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.core.listinggallery.buyitnow.C9663d.onChanged(java.lang.Object):void");
    }
}
