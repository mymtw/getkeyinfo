package com.etsy.android.lib.models.apiv3.listing.extensions;

public final class StructuredPolicyPaymentsExtensionsKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.etsy.android.lib.models.apiv3.StructuredShopPayments convertToV2(com.etsy.android.lib.models.apiv3.listing.StructuredPolicyPayments r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r4, r0)
            com.etsy.android.lib.models.apiv3.StructuredShopPayments r0 = new com.etsy.android.lib.models.apiv3.StructuredShopPayments
            r0.<init>()
            java.util.List r1 = r4.getAcceptedPaymentMethods()
            if (r1 == 0) goto L_0x0031
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = kotlin.collections.C19322o.m32624F0(r1)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x001d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0033
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r3)
            r2.add(r3)
            goto L_0x001d
        L_0x0031:
            kotlin.collections.EmptyList r2 = kotlin.collections.EmptyList.INSTANCE
        L_0x0033:
            r0.setAcceptedPaymentMethods(r2)
            java.util.List r1 = r4.getProtectedPaymentMethods()
            if (r1 == 0) goto L_0x005d
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = kotlin.collections.C19322o.m32624F0(r1)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x0049:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x005f
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r3)
            r2.add(r3)
            goto L_0x0049
        L_0x005d:
            kotlin.collections.EmptyList r2 = kotlin.collections.EmptyList.INSTANCE
        L_0x005f:
            r0.setProtectedPaymentMethods(r2)
            java.util.List r1 = r4.getManualPaymentMethods()
            if (r1 == 0) goto L_0x0089
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = kotlin.collections.C19322o.m32624F0(r1)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x0075:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x008b
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r3)
            r2.add(r3)
            goto L_0x0075
        L_0x0089:
            kotlin.collections.EmptyList r2 = kotlin.collections.EmptyList.INSTANCE
        L_0x008b:
            r0.setManualPaymentMethods(r2)
            java.lang.Boolean r1 = r4.getAcceptsDirectCheckout()
            if (r1 == 0) goto L_0x0099
            boolean r1 = r1.booleanValue()
            goto L_0x009a
        L_0x0099:
            r1 = 0
        L_0x009a:
            r0.setAcceptsDirectCheckout(r1)
            java.lang.Boolean r4 = r4.getAcceptsPaypal()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r4 = kotlin.jvm.internal.C19383o.m32792b(r4, r1)
            if (r4 == 0) goto L_0x00c4
            java.util.List r4 = r0.getProtectedPaymentMethods()
            com.etsy.android.lib.util.PaymentMethod r1 = com.etsy.android.lib.util.PaymentMethod.PAYPAL
            java.lang.String r2 = r1.getName()
            boolean r4 = r4.contains(r2)
            if (r4 != 0) goto L_0x00c4
            java.util.List r4 = r0.getProtectedPaymentMethods()
            java.lang.String r1 = r1.getName()
            r4.add(r1)
        L_0x00c4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.extensions.StructuredPolicyPaymentsExtensionsKt.convertToV2(com.etsy.android.lib.models.apiv3.listing.StructuredPolicyPayments):com.etsy.android.lib.models.apiv3.StructuredShopPayments");
    }
}
