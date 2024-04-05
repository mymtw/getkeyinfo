package com.etsy.android.lib.models.apiv3.listing.extensions;

public final class FormattedMoneyExtensionsKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.etsy.android.lib.models.apiv3.FormattedMoney convertToV2(com.etsy.android.lib.models.apiv3.listing.FormattedMoney r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r3, r0)
            com.etsy.android.lib.models.apiv3.FormattedMoney r0 = new com.etsy.android.lib.models.apiv3.FormattedMoney
            r0.<init>()
            java.lang.String r1 = r3.getFormat()
            java.lang.String r1 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r1)
            r0.setFormatString(r1)
            java.util.List r3 = r3.getArguments()
            if (r3 == 0) goto L_0x003c
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = kotlin.collections.C19322o.m32624F0(r3)
            r1.<init>(r2)
            java.util.Iterator r3 = r3.iterator()
        L_0x0028:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x003e
            java.lang.Object r2 = r3.next()
            com.etsy.android.lib.models.apiv3.listing.Money r2 = (com.etsy.android.lib.models.apiv3.listing.Money) r2
            com.etsy.android.lib.models.apiv3.Money r2 = com.etsy.android.lib.models.apiv3.listing.extensions.MoneyExtensionsKt.convertToV2(r2)
            r1.add(r2)
            goto L_0x0028
        L_0x003c:
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.INSTANCE
        L_0x003e:
            r0.setArguments(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.extensions.FormattedMoneyExtensionsKt.convertToV2(com.etsy.android.lib.models.apiv3.listing.FormattedMoney):com.etsy.android.lib.models.apiv3.FormattedMoney");
    }
}
