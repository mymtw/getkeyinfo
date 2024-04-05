package com.etsy.android.lib.models.apiv3.listing.extensions;

public final class StructuredPolicyShippingExtensionsKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.etsy.android.lib.models.apiv3.StructuredShopShipping convertToV2(com.etsy.android.lib.models.apiv3.listing.StructuredPolicyShipping r7) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r7, r0)
            com.etsy.android.lib.models.apiv3.StructuredShopShipping r0 = new com.etsy.android.lib.models.apiv3.StructuredShopShipping
            r0.<init>()
            java.util.List r1 = r7.getEstimates()
            r2 = 0
            if (r1 == 0) goto L_0x008b
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = kotlin.collections.C19322o.m32624F0(r1)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x001e:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x008d
            java.lang.Object r4 = r1.next()
            com.etsy.android.lib.models.apiv3.listing.StructuredPolicyShippingEstimate r4 = (com.etsy.android.lib.models.apiv3.listing.StructuredPolicyShippingEstimate) r4
            com.etsy.android.lib.models.apiv3.StructuredShopShippingEstimate r5 = new com.etsy.android.lib.models.apiv3.StructuredShopShippingEstimate
            r5.<init>()
            java.lang.Integer r6 = r4.getMin()
            if (r6 == 0) goto L_0x003a
            int r6 = r6.intValue()
            goto L_0x003b
        L_0x003a:
            r6 = r2
        L_0x003b:
            r5.setMin(r6)
            java.lang.Integer r6 = r4.getMax()
            if (r6 == 0) goto L_0x0049
            int r6 = r6.intValue()
            goto L_0x004a
        L_0x0049:
            r6 = r2
        L_0x004a:
            r5.setMax(r6)
            java.lang.String r6 = r4.getDisplayName()
            java.lang.String r6 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r6)
            r5.setDisplayName(r6)
            java.lang.Integer r6 = r4.getCountryId()
            if (r6 != 0) goto L_0x006a
            java.lang.String r6 = r4.getRegionCode()
            java.lang.String r6 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r6)
            r5.setRegionCode(r6)
            goto L_0x0071
        L_0x006a:
            java.lang.Integer r6 = r4.getCountryId()
            r5.setCountryId(r6)
        L_0x0071:
            java.lang.String r6 = r4.getUnit()
            java.lang.String r6 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r6)
            r5.setUnit(r6)
            java.lang.String r4 = r4.getType()
            java.lang.String r4 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r4)
            r5.setType(r4)
            r3.add(r5)
            goto L_0x001e
        L_0x008b:
            kotlin.collections.EmptyList r3 = kotlin.collections.EmptyList.INSTANCE
        L_0x008d:
            r0.setEstimates(r3)
            java.lang.Boolean r1 = r7.getHasShippingUpgrades()
            if (r1 == 0) goto L_0x009b
            boolean r1 = r1.booleanValue()
            goto L_0x009c
        L_0x009b:
            r1 = r2
        L_0x009c:
            r0.setHasShippingUpgrades(r1)
            java.lang.Boolean r1 = r7.getShipsInternational()
            if (r1 == 0) goto L_0x00a9
            boolean r2 = r1.booleanValue()
        L_0x00a9:
            r0.setShipsInternational(r2)
            java.lang.String r7 = r7.getProcessingTimeText()
            java.lang.String r7 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r7)
            if (r7 != 0) goto L_0x00b8
            java.lang.String r7 = ""
        L_0x00b8:
            r0.setProcessingTimeText(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.extensions.StructuredPolicyShippingExtensionsKt.convertToV2(com.etsy.android.lib.models.apiv3.listing.StructuredPolicyShipping):com.etsy.android.lib.models.apiv3.StructuredShopShipping");
    }
}
