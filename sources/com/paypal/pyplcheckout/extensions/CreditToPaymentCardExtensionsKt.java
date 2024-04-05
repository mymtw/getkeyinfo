package com.paypal.pyplcheckout.extensions;

public final class CreditToPaymentCardExtensionsKt {
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x011e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.paypal.pyplcheckout.home.view.customviews.CardUiModel.OfferCardUiModel toOfferCardUiModel(com.paypal.pyplcheckout.pojo.CreditPPCOffer r12) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r12, r0)
            com.paypal.pyplcheckout.pojo.Content r0 = r12.getContent()
            r1 = 0
            if (r0 != 0) goto L_0x000e
            r0 = r1
            goto L_0x0012
        L_0x000e:
            java.lang.String r0 = r0.getProduct()
        L_0x0012:
            com.paypal.pyplcheckout.utils.PaymentTypes r2 = com.paypal.pyplcheckout.utils.PaymentTypes.PAYPAL_CREDIT_OFFER
            java.lang.String r3 = r2.toString()
            boolean r3 = kotlin.jvm.internal.C19383o.m32792b(r0, r3)
            r4 = 1
            if (r3 == 0) goto L_0x006b
            com.paypal.pyplcheckout.pojo.Content r0 = r12.getContent()
            java.lang.String r0 = r0.getTermsText()
            r3 = 0
            if (r0 != 0) goto L_0x002b
            goto L_0x0038
        L_0x002b:
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0033
            r0 = r4
            goto L_0x0034
        L_0x0033:
            r0 = r3
        L_0x0034:
            if (r0 != r4) goto L_0x0038
            r0 = r4
            goto L_0x0039
        L_0x0038:
            r0 = r3
        L_0x0039:
            if (r0 == 0) goto L_0x0081
            com.paypal.pyplcheckout.pojo.Content r0 = r12.getContent()
            java.lang.String r0 = r0.getTermsLinkText()
            if (r0 != 0) goto L_0x0046
            goto L_0x0052
        L_0x0046:
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x004e
            r0 = r4
            goto L_0x004f
        L_0x004e:
            r0 = r3
        L_0x004f:
            if (r0 != r4) goto L_0x0052
            r3 = r4
        L_0x0052:
            if (r3 == 0) goto L_0x0081
            com.paypal.pyplcheckout.pojo.Content r0 = r12.getContent()
            java.lang.String r0 = r0.getTermsText()
            com.paypal.pyplcheckout.pojo.Content r3 = r12.getContent()
            java.lang.String r3 = r3.getTermsLinkText()
            java.lang.String r5 = " "
            java.lang.String r0 = p010a9.C0048b.m163a(r0, r5, r3)
            goto L_0x007f
        L_0x006b:
            com.paypal.pyplcheckout.utils.PaymentTypes r3 = com.paypal.pyplcheckout.utils.PaymentTypes.GLOBAL_PAY_LATER
            java.lang.String r3 = r3.toString()
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r0, r3)
            if (r0 == 0) goto L_0x0081
            com.paypal.pyplcheckout.pojo.Content r0 = r12.getContent()
            java.lang.String r0 = r0.getLearnMoreText()
        L_0x007f:
            r9 = r0
            goto L_0x0082
        L_0x0081:
            r9 = r1
        L_0x0082:
            com.paypal.pyplcheckout.pojo.Content r0 = r12.getContent()
            if (r0 != 0) goto L_0x008a
            r0 = r1
            goto L_0x008e
        L_0x008a:
            java.lang.String r0 = r0.getProduct()
        L_0x008e:
            java.lang.String r3 = r2.toString()
            boolean r3 = kotlin.jvm.internal.C19383o.m32792b(r0, r3)
            if (r3 == 0) goto L_0x00a1
            com.paypal.pyplcheckout.pojo.Content r0 = r12.getContent()
            java.lang.String r0 = r0.getOfferText1()
            goto L_0x00b5
        L_0x00a1:
            com.paypal.pyplcheckout.utils.PaymentTypes r3 = com.paypal.pyplcheckout.utils.PaymentTypes.GLOBAL_PAY_LATER
            java.lang.String r3 = r3.toString()
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r0, r3)
            if (r0 == 0) goto L_0x00b7
            com.paypal.pyplcheckout.pojo.Content r0 = r12.getContent()
            java.lang.String r0 = r0.getOfferText1()
        L_0x00b5:
            r10 = r0
            goto L_0x00b8
        L_0x00b7:
            r10 = r1
        L_0x00b8:
            com.paypal.pyplcheckout.pojo.Content r0 = r12.getContent()
            if (r0 != 0) goto L_0x00c0
            r0 = r1
            goto L_0x00c4
        L_0x00c0:
            java.lang.String r0 = r0.getProduct()
        L_0x00c4:
            java.lang.String r3 = r2.toString()
            boolean r3 = kotlin.jvm.internal.C19383o.m32792b(r0, r3)
            if (r3 == 0) goto L_0x00d7
            com.paypal.pyplcheckout.pojo.Content r0 = r12.getContent()
            java.lang.String r0 = r0.getTermsLink()
            goto L_0x00eb
        L_0x00d7:
            com.paypal.pyplcheckout.utils.PaymentTypes r3 = com.paypal.pyplcheckout.utils.PaymentTypes.GLOBAL_PAY_LATER
            java.lang.String r3 = r3.toString()
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r0, r3)
            if (r0 == 0) goto L_0x00ed
            com.paypal.pyplcheckout.pojo.Content r0 = r12.getContent()
            java.lang.String r0 = r0.getLearnMoreLink()
        L_0x00eb:
            r8 = r0
            goto L_0x00ee
        L_0x00ed:
            r8 = r1
        L_0x00ee:
            java.lang.String r0 = r2.toString()
            com.paypal.pyplcheckout.pojo.Content r2 = r12.getContent()
            if (r2 != 0) goto L_0x00fa
            r2 = r1
            goto L_0x00fe
        L_0x00fa:
            java.lang.String r2 = r2.getProduct()
        L_0x00fe:
            boolean r0 = kotlin.text.C19457k.m33019W0(r0, r2, r4)
            if (r0 == 0) goto L_0x0107
            int r0 = com.paypal.pyplcheckout.C17165R.C17166drawable.ic_ppc_cardart
            goto L_0x0109
        L_0x0107:
            int r0 = com.paypal.pyplcheckout.C17165R.C17166drawable.ic_pi4_card
        L_0x0109:
            r7 = r0
            com.paypal.pyplcheckout.pojo.Content r0 = r12.getContent()
            if (r0 != 0) goto L_0x0112
            r6 = r1
            goto L_0x0117
        L_0x0112:
            java.lang.String r0 = r0.getProduct()
            r6 = r0
        L_0x0117:
            com.paypal.pyplcheckout.pojo.Content r12 = r12.getContent()
            if (r12 != 0) goto L_0x011e
            goto L_0x0122
        L_0x011e:
            java.lang.String r1 = r12.getOfferCheckoutButtonText()
        L_0x0122:
            r11 = r1
            com.paypal.pyplcheckout.home.view.customviews.CardUiModel$OfferCardUiModel r12 = new com.paypal.pyplcheckout.home.view.customviews.CardUiModel$OfferCardUiModel
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.extensions.CreditToPaymentCardExtensionsKt.toOfferCardUiModel(com.paypal.pyplcheckout.pojo.CreditPPCOffer):com.paypal.pyplcheckout.home.view.customviews.CardUiModel$OfferCardUiModel");
    }
}
