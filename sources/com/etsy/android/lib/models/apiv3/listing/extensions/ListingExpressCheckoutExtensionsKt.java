package com.etsy.android.lib.models.apiv3.listing.extensions;

public final class ListingExpressCheckoutExtensionsKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.etsy.android.lib.models.SingleListingCheckout convertToV2(com.etsy.android.lib.models.apiv3.listing.ListingExpressCheckout r17) {
        /*
            java.lang.String r0 = "<this>"
            r1 = r17
            kotlin.jvm.internal.C19383o.m32797g(r1, r0)
            java.lang.Boolean r0 = r17.isExpressCheckoutEligible()
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.booleanValue()
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            java.lang.Integer r5 = r17.getIneligibilityErrorCode()
            java.lang.String r0 = r17.getIneligibilityErrorReason()
            java.lang.String r6 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r0)
            java.lang.String r0 = r17.getTitle()
            java.lang.String r7 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r0)
            java.lang.Boolean r0 = r17.getAcceptsMultiplePaymentMethods()
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.booleanValue()
            r8 = r0
            goto L_0x0038
        L_0x0037:
            r8 = 0
        L_0x0038:
            java.lang.Boolean r0 = r17.getAcceptsPaypal()
            if (r0 == 0) goto L_0x0044
            boolean r0 = r0.booleanValue()
            r9 = r0
            goto L_0x0045
        L_0x0044:
            r9 = 0
        L_0x0045:
            java.lang.String r0 = r17.getDefaultPaymentMethod()
            java.lang.String r10 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r0)
            java.lang.String r0 = r17.getDefaultSubmitText()
            java.lang.String r11 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r0)
            java.lang.String r0 = r17.getPurchaseAcceptTermsText()
            java.lang.String r12 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r0)
            java.util.List r0 = r17.getPaymentOptions()
            if (r0 == 0) goto L_0x0100
            java.util.ArrayList r3 = new java.util.ArrayList
            int r13 = kotlin.collections.C19322o.m32624F0(r0)
            r3.<init>(r13)
            java.util.Iterator r0 = r0.iterator()
        L_0x0070:
            boolean r13 = r0.hasNext()
            if (r13 == 0) goto L_0x00fe
            java.lang.Object r13 = r0.next()
            com.etsy.android.lib.models.apiv3.listing.ListingExpressCheckoutPaymentOption r13 = (com.etsy.android.lib.models.apiv3.listing.ListingExpressCheckoutPaymentOption) r13
            com.etsy.android.lib.models.PaymentOption r14 = new com.etsy.android.lib.models.PaymentOption
            r14.<init>()
            java.lang.String r15 = r13.getLabel()
            java.lang.String r15 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r15)
            r14.setLabel(r15)
            java.lang.Boolean r15 = r13.getSelected()
            if (r15 == 0) goto L_0x0097
            boolean r15 = r15.booleanValue()
            goto L_0x0098
        L_0x0097:
            r15 = 0
        L_0x0098:
            r14.setSelected(r15)
            java.lang.String r15 = r13.getInputId()
            java.lang.String r15 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r15)
            r14.setInputId(r15)
            java.lang.String r15 = r13.getSubmitClasses()
            java.lang.String r15 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r15)
            r14.setSubmitClasses(r15)
            java.lang.String r15 = r13.getSubmitText()
            java.lang.String r15 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r15)
            r14.setSubmitText(r15)
            java.util.List r15 = r13.getIconClasses()
            if (r15 == 0) goto L_0x00e5
            java.util.ArrayList r2 = new java.util.ArrayList
            r16 = r0
            int r0 = kotlin.collections.C19322o.m32624F0(r15)
            r2.<init>(r0)
            java.util.Iterator r0 = r15.iterator()
        L_0x00d1:
            boolean r15 = r0.hasNext()
            if (r15 == 0) goto L_0x00e9
            java.lang.Object r15 = r0.next()
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r15 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r15)
            r2.add(r15)
            goto L_0x00d1
        L_0x00e5:
            r16 = r0
            kotlin.collections.EmptyList r2 = kotlin.collections.EmptyList.INSTANCE
        L_0x00e9:
            r14.setIconClasses(r2)
            java.lang.String r0 = r13.getPaymentMethod()
            java.lang.String r0 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r0)
            r14.setPaymentMethod(r0)
            r3.add(r14)
            r0 = r16
            goto L_0x0070
        L_0x00fe:
            r13 = r3
            goto L_0x0103
        L_0x0100:
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.INSTANCE
            r13 = r0
        L_0x0103:
            java.lang.Boolean r0 = r17.isInternational()
            if (r0 == 0) goto L_0x010f
            boolean r2 = r0.booleanValue()
            r14 = r2
            goto L_0x0110
        L_0x010f:
            r14 = 0
        L_0x0110:
            com.etsy.android.lib.models.SingleListingCheckout r0 = new com.etsy.android.lib.models.SingleListingCheckout
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.extensions.ListingExpressCheckoutExtensionsKt.convertToV2(com.etsy.android.lib.models.apiv3.listing.ListingExpressCheckout):com.etsy.android.lib.models.SingleListingCheckout");
    }
}
