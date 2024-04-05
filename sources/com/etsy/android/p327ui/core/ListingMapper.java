package com.etsy.android.p327ui.core;

import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.models.Nudge;
import com.etsy.android.lib.models.apiv3.Money;
import kotlin.jvm.internal.C19383o;
import org.apache.commons.lang3.StringEscapeUtils;

/* renamed from: com.etsy.android.ui.core.ListingMapper */
public final class ListingMapper {

    /* renamed from: a */
    public final C8630b f21303a;

    /* renamed from: com.etsy.android.ui.core.ListingMapper$MappingException */
    public static final class MappingException extends RuntimeException {
        public static final int $stable = 0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MappingException(Throwable th) {
            super(th);
            C19383o.m32797g(th, "throwable");
        }
    }

    public ListingMapper(C8630b bVar) {
        C19383o.m32797g(bVar, "etsyMoneyFactory");
        this.f21303a = bVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.etsy.android.lib.models.apiv3.FormattedMoney m17971b(com.etsy.android.lib.models.apiv3.listing.FormattedMoney r3) {
        /*
            if (r3 == 0) goto L_0x003f
            com.etsy.android.lib.models.apiv3.FormattedMoney r0 = new com.etsy.android.lib.models.apiv3.FormattedMoney
            r0.<init>()
            java.lang.String r1 = r3.getFormat()
            java.lang.String r1 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r1)
            r0.setFormatString(r1)
            java.util.List r3 = r3.getArguments()
            if (r3 == 0) goto L_0x0039
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = kotlin.collections.C19322o.m32624F0(r3)
            r1.<init>(r2)
            java.util.Iterator r3 = r3.iterator()
        L_0x0025:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x003b
            java.lang.Object r2 = r3.next()
            com.etsy.android.lib.models.apiv3.listing.Money r2 = (com.etsy.android.lib.models.apiv3.listing.Money) r2
            com.etsy.android.lib.models.apiv3.Money r2 = m17973d(r2)
            r1.add(r2)
            goto L_0x0025
        L_0x0039:
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.INSTANCE
        L_0x003b:
            r0.setArguments(r1)
            goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.core.ListingMapper.m17971b(com.etsy.android.lib.models.apiv3.listing.FormattedMoney):com.etsy.android.lib.models.apiv3.FormattedMoney");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.etsy.android.lib.models.apiv3.Image m17972c(com.etsy.android.lib.models.apiv3.listing.Image r5) {
        /*
            if (r5 == 0) goto L_0x0064
            com.etsy.android.lib.models.apiv3.Image r0 = new com.etsy.android.lib.models.apiv3.Image
            r0.<init>()
            java.lang.String r1 = r5.getKey()
            java.lang.String r1 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r1)
            r0.setKey(r1)
            java.lang.String r1 = r5.getUrl()
            java.lang.String r1 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r1)
            r0.setUrl(r1)
            java.util.List r5 = r5.getSources()
            if (r5 == 0) goto L_0x005e
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = kotlin.collections.C19322o.m32624F0(r5)
            r1.<init>(r2)
            java.util.Iterator r5 = r5.iterator()
        L_0x0030:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0060
            java.lang.Object r2 = r5.next()
            com.etsy.android.lib.models.apiv3.listing.ImageSize r2 = (com.etsy.android.lib.models.apiv3.listing.ImageSize) r2
            com.etsy.android.lib.models.apiv3.Image$Source r3 = new com.etsy.android.lib.models.apiv3.Image$Source
            r3.<init>()
            java.lang.String r4 = r2.getUrl()
            java.lang.String r4 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r4)
            r3.setUrl(r4)
            int r4 = r2.getHeight()
            r3.setHeight(r4)
            int r2 = r2.getWidth()
            r3.setWidth(r2)
            r1.add(r3)
            goto L_0x0030
        L_0x005e:
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.INSTANCE
        L_0x0060:
            r0.setSources(r1)
            goto L_0x0065
        L_0x0064:
            r0 = 0
        L_0x0065:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.core.ListingMapper.m17972c(com.etsy.android.lib.models.apiv3.listing.Image):com.etsy.android.lib.models.apiv3.Image");
    }

    /* renamed from: d */
    public static Money m17973d(com.etsy.android.lib.models.apiv3.listing.Money money) {
        if (money == null) {
            return null;
        }
        Money money2 = new Money();
        money2.setAmount(StringEscapeUtils.unescapeHtml4(money.get_amount()));
        money2.setDivisor(money.getDivisor());
        String unescapeHtml4 = StringEscapeUtils.unescapeHtml4(money.getCurrencyCode());
        String str = "";
        if (unescapeHtml4 == null) {
            unescapeHtml4 = str;
        }
        money2.setCurrencyCode(unescapeHtml4);
        String unescapeHtml42 = StringEscapeUtils.unescapeHtml4(money.getCurrencyFormattedRaw());
        if (unescapeHtml42 == null) {
            unescapeHtml42 = str;
        }
        money2.setCurrencyFormattedRaw(unescapeHtml42);
        String unescapeHtml43 = StringEscapeUtils.unescapeHtml4(money.getCurrencyFormattedLong());
        if (unescapeHtml43 == null) {
            unescapeHtml43 = str;
        }
        money2.setCurrencyFormattedLong(unescapeHtml43);
        String unescapeHtml44 = StringEscapeUtils.unescapeHtml4(money.getCurrencyFormattedShort());
        if (unescapeHtml44 != null) {
            str = unescapeHtml44;
        }
        money2.setCurrencyFormattedShort(str);
        return money2;
    }

    /* renamed from: e */
    public static Nudge m17974e(com.etsy.android.lib.models.apiv3.listing.Nudge nudge) {
        if (nudge == null) {
            return null;
        }
        Nudge nudge2 = new Nudge();
        Integer totalCarts = nudge.getTotalCarts();
        int i = 0;
        nudge2.setTotalCarts(totalCarts != null ? totalCarts.intValue() : 0);
        Integer quantity = nudge.getQuantity();
        if (quantity != null) {
            i = quantity.intValue();
        }
        nudge2.setQuantity(i);
        nudge2.setDisplayText(StringEscapeUtils.unescapeHtml4(nudge.getDisplayText()));
        nudge2.setType(StringEscapeUtils.unescapeHtml4(nudge.getType()));
        nudge2.setIconUrl(nudge.getIconUrl());
        return nudge2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.etsy.android.lib.models.apiv3.OfferingUi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.etsy.android.lib.models.apiv3.OfferingRangeSelect} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.etsy.android.lib.models.apiv3.OfferingResponse m17975f(com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext r15) {
        /*
            r0 = 0
            if (r15 == 0) goto L_0x0008
            com.etsy.android.lib.models.apiv3.listing.Money r1 = r15.getMinPrice()
            goto L_0x0009
        L_0x0008:
            r1 = r0
        L_0x0009:
            if (r1 == 0) goto L_0x0221
            com.etsy.android.lib.models.apiv3.listing.Money r1 = r15.getMaxPrice()
            if (r1 == 0) goto L_0x0221
            com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartUi r1 = r15.getUi()
            if (r1 == 0) goto L_0x001c
            com.etsy.android.lib.models.apiv3.listing.FormattedMoney r1 = r1.getPrice()
            goto L_0x001d
        L_0x001c:
            r1 = r0
        L_0x001d:
            if (r1 == 0) goto L_0x0221
            com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartUi r1 = r15.getUi()
            if (r1 == 0) goto L_0x002a
            com.etsy.android.lib.models.apiv3.listing.RangeSelect r1 = r1.getQuantity()
            goto L_0x002b
        L_0x002a:
            r1 = r0
        L_0x002b:
            if (r1 == 0) goto L_0x0221
            com.etsy.android.lib.models.apiv3.OfferingResponse r1 = new com.etsy.android.lib.models.apiv3.OfferingResponse
            r1.<init>()
            java.lang.Integer r2 = r15.getMinQuantity()
            r3 = 0
            if (r2 == 0) goto L_0x003e
            int r2 = r2.intValue()
            goto L_0x003f
        L_0x003e:
            r2 = r3
        L_0x003f:
            r1.setMinQuantity(r2)
            java.lang.Integer r2 = r15.getMaxQuantity()
            if (r2 == 0) goto L_0x004d
            int r2 = r2.intValue()
            goto L_0x004e
        L_0x004d:
            r2 = r3
        L_0x004e:
            r1.setMaxQuantity(r2)
            com.etsy.android.lib.models.apiv3.listing.Money r2 = r15.getMinPrice()
            com.etsy.android.lib.models.apiv3.Money r2 = m17973d(r2)
            r1.setMinPrice(r2)
            com.etsy.android.lib.models.apiv3.listing.Money r2 = r15.getMaxPrice()
            com.etsy.android.lib.models.apiv3.Money r2 = m17973d(r2)
            r1.setMaxPrice(r2)
            com.etsy.android.lib.models.apiv3.listing.Nudge r2 = r15.getNudge()
            com.etsy.android.lib.models.Nudge r2 = m17974e(r2)
            r1.setNudge(r2)
            com.etsy.android.lib.models.apiv3.listing.InventoryProductOffering r2 = r15.getOffering()
            if (r2 == 0) goto L_0x00b3
            com.etsy.android.lib.models.apiv3.Offering r4 = new com.etsy.android.lib.models.apiv3.Offering
            r4.<init>()
            com.etsy.android.lib.models.datatypes.EtsyId r5 = new com.etsy.android.lib.models.datatypes.EtsyId
            long r6 = r2.getOfferingId()
            r5.<init>((long) r6)
            r4.setOfferingId(r5)
            com.etsy.android.lib.models.datatypes.EtsyId r5 = new com.etsy.android.lib.models.datatypes.EtsyId
            long r6 = r2.getProductId()
            r5.<init>((long) r6)
            r4.setProductId(r5)
            java.lang.Integer r5 = r2.getQuantity()
            if (r5 == 0) goto L_0x00a0
            int r5 = r5.intValue()
            goto L_0x00a1
        L_0x00a0:
            r5 = r3
        L_0x00a1:
            r4.setQuantity(r5)
            com.etsy.android.lib.models.apiv3.listing.Money r2 = r2.getPrice()
            com.etsy.android.lib.models.apiv3.Money r2 = m17973d(r2)
            kotlin.jvm.internal.C19383o.m32794d(r2)
            r4.setPrice(r2)
            goto L_0x00b4
        L_0x00b3:
            r4 = r0
        L_0x00b4:
            r1.setOffering(r4)
            com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartUi r15 = r15.getUi()
            if (r15 == 0) goto L_0x021d
            com.etsy.android.lib.models.apiv3.OfferingUi r2 = new com.etsy.android.lib.models.apiv3.OfferingUi
            r2.<init>()
            java.util.List r4 = r15.getSelects()
            java.lang.String r5 = ""
            if (r4 == 0) goto L_0x018d
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = kotlin.collections.C19322o.m32624F0(r4)
            r6.<init>(r7)
            java.util.Iterator r4 = r4.iterator()
        L_0x00d7:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x018f
            java.lang.Object r7 = r4.next()
            com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiSelect r7 = (com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiSelect) r7
            com.etsy.android.lib.models.apiv3.OfferingSelect r8 = new com.etsy.android.lib.models.apiv3.OfferingSelect
            r8.<init>()
            java.lang.String r9 = r7.getLabel()
            java.lang.String r9 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r9)
            if (r9 != 0) goto L_0x00f3
            r9 = r5
        L_0x00f3:
            r8.setLabel(r9)
            java.lang.String r9 = r7.getPrompt()
            java.lang.String r9 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r9)
            if (r9 != 0) goto L_0x0101
            r9 = r5
        L_0x0101:
            r8.setPrompt(r9)
            java.lang.Boolean r9 = r7.getEnabled()
            if (r9 == 0) goto L_0x010f
            boolean r9 = r9.booleanValue()
            goto L_0x0110
        L_0x010f:
            r9 = r3
        L_0x0110:
            r8.setEnabled(r9)
            r8.setIsError(r3)
            java.lang.String r9 = r7.getErrorText()
            java.lang.String r9 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r9)
            r8.setErrorText(r9)
            java.util.List r7 = r7.getOptions()
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = kotlin.collections.C19322o.m32624F0(r7)
            r9.<init>(r10)
            java.util.Iterator r7 = r7.iterator()
        L_0x0132:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x0185
            java.lang.Object r10 = r7.next()
            com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiOption r10 = (com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiOption) r10
            com.etsy.android.lib.models.apiv3.OfferingOption r11 = new com.etsy.android.lib.models.apiv3.OfferingOption
            r11.<init>()
            com.etsy.android.lib.models.apiv3.listing.FormattedMoney r12 = r10.getDisplayValue()
            com.etsy.android.lib.models.apiv3.FormattedMoney r12 = m17971b(r12)
            r11.setDisplayValue(r12)
            com.etsy.android.lib.models.datatypes.EtsyId r12 = new com.etsy.android.lib.models.datatypes.EtsyId
            java.lang.Long r13 = r10.getValue()
            if (r13 == 0) goto L_0x015b
            long r13 = r13.longValue()
            goto L_0x015d
        L_0x015b:
            r13 = 0
        L_0x015d:
            r12.<init>((long) r13)
            r11.setValue(r12)
            java.lang.Boolean r12 = r10.getEnabled()
            if (r12 == 0) goto L_0x016e
            boolean r12 = r12.booleanValue()
            goto L_0x016f
        L_0x016e:
            r12 = r3
        L_0x016f:
            r11.setEnabled(r12)
            java.lang.Boolean r10 = r10.getSelected()
            if (r10 == 0) goto L_0x017d
            boolean r10 = r10.booleanValue()
            goto L_0x017e
        L_0x017d:
            r10 = r3
        L_0x017e:
            r11.setSelected(r10)
            r9.add(r11)
            goto L_0x0132
        L_0x0185:
            r8.setOptions(r9)
            r6.add(r8)
            goto L_0x00d7
        L_0x018d:
            kotlin.collections.EmptyList r6 = kotlin.collections.EmptyList.INSTANCE
        L_0x018f:
            r2.setSelects(r6)
            com.etsy.android.lib.models.apiv3.listing.FormattedMoney r4 = r15.getPrice()
            com.etsy.android.lib.models.apiv3.FormattedMoney r4 = m17971b(r4)
            r2.setPrice(r4)
            com.etsy.android.lib.models.apiv3.listing.FormattedMoney r4 = r15.getDiscountedPrice()
            com.etsy.android.lib.models.apiv3.FormattedMoney r4 = m17971b(r4)
            r2.setDiscountedPrice(r4)
            com.etsy.android.lib.models.apiv3.listing.FormattedMoney r4 = r15.getDiscountedDescription()
            com.etsy.android.lib.models.apiv3.FormattedMoney r4 = m17971b(r4)
            r2.setDiscountDescription(r4)
            java.lang.Boolean r4 = r15.getHasVariableQuantity()
            if (r4 == 0) goto L_0x01be
            boolean r4 = r4.booleanValue()
            goto L_0x01bf
        L_0x01be:
            r4 = 1
        L_0x01bf:
            r2.setHasVariableQuantity(r4)
            java.lang.String r4 = r15.getUnitPrice()
            java.lang.String r4 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r4)
            r2.setUnitPrice(r4)
            com.etsy.android.lib.models.apiv3.listing.RangeSelect r15 = r15.getQuantity()
            if (r15 == 0) goto L_0x0219
            com.etsy.android.lib.models.apiv3.OfferingRangeSelect r0 = new com.etsy.android.lib.models.apiv3.OfferingRangeSelect
            r0.<init>()
            java.lang.String r4 = r15.getLabel()
            java.lang.String r4 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r4)
            if (r4 != 0) goto L_0x01e3
            goto L_0x01e4
        L_0x01e3:
            r5 = r4
        L_0x01e4:
            r0.setLabel(r5)
            java.lang.Boolean r4 = r15.getEnabled()
            if (r4 == 0) goto L_0x01f1
            boolean r3 = r4.booleanValue()
        L_0x01f1:
            r0.setEnabled(r3)
            int r3 = r15.getMin()
            r0.setMin(r3)
            int r3 = r15.getMax()
            r0.setMax(r3)
            int r3 = r15.getStep()
            r0.setStep(r3)
            java.lang.Integer r15 = r15.getSelected()
            if (r15 == 0) goto L_0x0214
            int r15 = r15.intValue()
            goto L_0x0216
        L_0x0214:
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0216:
            r0.setSelectedValue(r15)
        L_0x0219:
            r2.setQuantity(r0)
            r0 = r2
        L_0x021d:
            r1.setUi(r0)
            return r1
        L_0x0221:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.core.ListingMapper.m17975f(com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext):com.etsy.android.lib.models.apiv3.OfferingResponse");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v58, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v60, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v62, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v67, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v68, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v71, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v72, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v76, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v77, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v78, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v79, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v80, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v81, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v38, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v39, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v26, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x02cc A[SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.etsy.android.lib.models.Shop m17976g(com.etsy.android.lib.models.apiv3.listing.ListingFetch r16) {
        /*
            com.etsy.android.lib.models.Shop r0 = new com.etsy.android.lib.models.Shop
            r0.<init>()
            com.etsy.android.lib.models.apiv3.listing.Shop r1 = r16.getShop()
            if (r1 == 0) goto L_0x08fd
            java.lang.Long r2 = r1.getShopId()
            if (r2 == 0) goto L_0x001b
            long r4 = r2.longValue()
            com.etsy.android.lib.models.datatypes.EtsyId r2 = new com.etsy.android.lib.models.datatypes.EtsyId
            r2.<init>((long) r4)
            goto L_0x001c
        L_0x001b:
            r2 = 0
        L_0x001c:
            r0.setShopId(r2)
            java.lang.Long r2 = r1.getUserId()
            if (r2 == 0) goto L_0x002f
            long r4 = r2.longValue()
            com.etsy.android.lib.models.datatypes.EtsyId r2 = new com.etsy.android.lib.models.datatypes.EtsyId
            r2.<init>((long) r4)
            goto L_0x0030
        L_0x002f:
            r2 = 0
        L_0x0030:
            r0.setUserId(r2)
            java.lang.Integer r2 = r1.getActiveListingCount()
            r4 = 0
            if (r2 == 0) goto L_0x003f
            int r2 = r2.intValue()
            goto L_0x0040
        L_0x003f:
            r2 = r4
        L_0x0040:
            r0.setListingActiveCount(r2)
            java.lang.Integer r2 = r1.getDigitalListingCount()
            if (r2 == 0) goto L_0x004e
            int r2 = r2.intValue()
            goto L_0x004f
        L_0x004e:
            r2 = r4
        L_0x004f:
            r0.setDigitalListingCount(r2)
            java.lang.String r2 = r1.getStatus()
            java.lang.String r2 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r2)
            r0.setStatus(r2)
            java.lang.String r2 = r1.getHeadline()
            java.lang.String r2 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r2)
            r0.setTitle(r2)
            java.lang.String r2 = r1.getShopName()
            java.lang.String r2 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r2)
            r0.setShopName(r2)
            java.lang.String r2 = r1.getSellerName()
            java.lang.String r5 = ""
            if (r2 != 0) goto L_0x007c
            r2 = r5
        L_0x007c:
            r0.setSellerName(r2)
            com.etsy.android.lib.models.apiv3.listing.User r2 = r1.getOwner()
            if (r2 == 0) goto L_0x0092
            java.lang.String r2 = r2.getLoginName()
            java.lang.String r2 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r2)
            r0.setLoginName(r2)
            kotlin.m r2 = kotlin.C19394m.f43287a
        L_0x0092:
            java.lang.String r2 = r1.getUrl()
            r0.setUrl(r2)
            com.etsy.android.lib.models.apiv3.listing.ShopsPolicy r2 = r16.getPolicies()
            if (r2 == 0) goto L_0x00d8
            java.lang.String r6 = r2.getWelcome()
            java.lang.String r6 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r6)
            r0.setPolicyWelcome(r6)
            java.lang.String r6 = r2.getPayment()
            java.lang.String r6 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r6)
            r0.setPolicyPayment(r6)
            java.lang.String r6 = r2.getShipping()
            java.lang.String r6 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r6)
            r0.setPolicyShipping(r6)
            java.lang.String r6 = r2.getRefunds()
            java.lang.String r6 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r6)
            r0.setPolicyRefunds(r6)
            java.lang.String r2 = r2.getAdditional()
            java.lang.String r2 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r2)
            r0.setPolicyAdditional(r2)
            kotlin.m r2 = kotlin.C19394m.f43287a
        L_0x00d8:
            java.lang.Integer r2 = r1.getTotalRatingCount()
            if (r2 == 0) goto L_0x00e3
            int r2 = r2.intValue()
            goto L_0x00e4
        L_0x00e3:
            r2 = r4
        L_0x00e4:
            r0.setNumRatings(r2)
            java.lang.Float r2 = r1.getAverageRating()
            if (r2 == 0) goto L_0x00f3
            float r2 = r2.floatValue()
            double r6 = (double) r2
            goto L_0x00f5
        L_0x00f3:
            r6 = 0
        L_0x00f5:
            r0.setAverageRating(r6)
            java.lang.Boolean r2 = r1.isUsingStructuredPolicies()
            if (r2 == 0) goto L_0x0103
            boolean r2 = r2.booleanValue()
            goto L_0x0104
        L_0x0103:
            r2 = r4
        L_0x0104:
            r0.setUsingStructuredPolicies(r2)
            java.lang.Boolean r2 = r1.getHasIcon()
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r2 = kotlin.jvm.internal.C19383o.m32792b(r2, r6)
            if (r2 == 0) goto L_0x0127
            com.etsy.android.lib.models.apiv3.listing.ShopIcon r2 = r1.getIcon()
            if (r2 == 0) goto L_0x0127
            com.etsy.android.lib.models.apiv3.ShopIcon r6 = new com.etsy.android.lib.models.apiv3.ShopIcon
            java.lang.String r2 = r2.getUrl()
            r6.<init>(r2)
            r0.setShopIcon(r6)
            kotlin.m r2 = kotlin.C19394m.f43287a
        L_0x0127:
            com.etsy.android.lib.models.apiv3.listing.User r2 = r16.getSeller()
            r6 = 1
            if (r2 == 0) goto L_0x01f3
            com.etsy.android.lib.models.User r7 = new com.etsy.android.lib.models.User
            r7.<init>()
            java.lang.Long r8 = r2.getUserId()
            if (r8 == 0) goto L_0x0145
            long r8 = r8.longValue()
            com.etsy.android.lib.models.datatypes.EtsyId r10 = new com.etsy.android.lib.models.datatypes.EtsyId
            r10.<init>((long) r8)
            r7.setUserId(r10)
        L_0x0145:
            java.lang.String r8 = r2.getLoginName()
            java.lang.String r8 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r8)
            r7.setLoginName(r8)
            java.lang.Integer r8 = r2.getFollowerCount()
            if (r8 == 0) goto L_0x015b
            int r8 = r8.intValue()
            goto L_0x015c
        L_0x015b:
            r8 = r4
        L_0x015c:
            r7.setFollowerCount(r8)
            java.lang.Integer r8 = r2.getFollowingCount()
            if (r8 == 0) goto L_0x016a
            int r8 = r8.intValue()
            goto L_0x016b
        L_0x016a:
            r8 = r4
        L_0x016b:
            r7.setFollowingCount(r8)
            com.etsy.android.lib.models.UserProfile r8 = new com.etsy.android.lib.models.UserProfile
            r8.<init>()
            java.lang.String r9 = r2.getFirstName()
            java.lang.String r9 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r9)
            r8.setFirstName(r9)
            java.lang.String r9 = r2.getLastName()
            java.lang.String r9 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r9)
            r8.setLastName(r9)
            java.lang.String r9 = r2.getLoginName()
            java.lang.String r9 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r9)
            r8.setLoginName(r9)
            java.lang.Integer r9 = r2.getNumFavorites()
            if (r9 == 0) goto L_0x019f
            int r9 = r9.intValue()
            goto L_0x01a0
        L_0x019f:
            r9 = r4
        L_0x01a0:
            r8.setNumFavorites(r9)
            java.lang.String r9 = r2.getLocation()
            java.lang.String r9 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r9)
            r8.setLocation(r9)
            com.etsy.android.lib.models.apiv3.UserAvatar r9 = new com.etsy.android.lib.models.apiv3.UserAvatar
            java.lang.String r10 = r2.getAvatarUrl()
            r9.<init>(r10)
            r8.setUserAvatar(r9)
            r7.setProfile(r8)
            com.etsy.android.lib.models.apiv3.listing.Image r2 = r2.getAvatar()
            com.etsy.android.lib.models.apiv3.Image r2 = m17972c(r2)
            r7.setAvatar(r2)
            r0.setUser(r7)
            com.etsy.android.lib.models.User r2 = r0.getUser()
            com.etsy.android.lib.models.UserProfile r2 = r2.getProfile()
            if (r2 == 0) goto L_0x01e2
            java.lang.String r7 = r1.getLocation()
            java.lang.String r7 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r7)
            r2.setLocation(r7)
            kotlin.m r2 = kotlin.C19394m.f43287a
        L_0x01e2:
            com.etsy.android.lib.models.User r2 = r0.getUser()
            com.etsy.android.lib.models.Shop[] r7 = new com.etsy.android.lib.models.Shop[r6]
            r7[r4] = r0
            java.util.ArrayList r7 = p568fn.C17782b.m29866f0(r7)
            r2.setShops(r7)
            kotlin.m r2 = kotlin.C19394m.f43287a
        L_0x01f3:
            com.etsy.android.lib.models.ShopAbout r2 = new com.etsy.android.lib.models.ShopAbout
            r2.<init>()
            java.util.List r7 = r16.getShopOwners()
            if (r7 == 0) goto L_0x02e1
            java.util.ArrayList r8 = new java.util.ArrayList
            int r9 = kotlin.collections.C19322o.m32624F0(r7)
            r8.<init>(r9)
            java.util.Iterator r7 = r7.iterator()
        L_0x020b:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x02e3
            java.lang.Object r9 = r7.next()
            com.etsy.android.lib.models.apiv3.listing.ShopsAboutMember r9 = (com.etsy.android.lib.models.apiv3.listing.ShopsAboutMember) r9
            com.etsy.android.lib.models.ShopAboutMember r10 = new com.etsy.android.lib.models.ShopAboutMember
            r10.<init>()
            java.lang.Long r11 = r9.getShopAboutMemberId()
            if (r11 == 0) goto L_0x022c
            long r11 = r11.longValue()
            com.etsy.android.lib.models.datatypes.EtsyId r13 = new com.etsy.android.lib.models.datatypes.EtsyId
            r13.<init>((long) r11)
            goto L_0x022d
        L_0x022c:
            r13 = 0
        L_0x022d:
            r10.setId(r13)
            java.lang.String r11 = r9.getName()
            java.lang.String r11 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r11)
            r10.setName(r11)
            java.lang.String r11 = r9.getRole()
            java.lang.String r11 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r11)
            r10.setRole(r11)
            java.lang.String r11 = r9.getBio()
            java.lang.String r11 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r11)
            r10.setBio(r11)
            com.etsy.android.lib.models.apiv3.listing.Image r11 = r9.getImage()
            com.etsy.android.lib.models.apiv3.Image r11 = m17972c(r11)
            r10.setImage(r11)
            com.etsy.android.lib.models.apiv3.listing.Image r11 = r9.getImage()
            if (r11 == 0) goto L_0x0297
            java.util.List r11 = r11.getSources()
            if (r11 == 0) goto L_0x0297
            java.util.Iterator r11 = r11.iterator()
        L_0x026c:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x028d
            java.lang.Object r12 = r11.next()
            r13 = r12
            com.etsy.android.lib.models.apiv3.listing.ImageSize r13 = (com.etsy.android.lib.models.apiv3.listing.ImageSize) r13
            int r14 = r13.getHeight()
            r15 = 90
            if (r14 != r15) goto L_0x0289
            int r13 = r13.getWidth()
            if (r13 != r15) goto L_0x0289
            r13 = r6
            goto L_0x028a
        L_0x0289:
            r13 = r4
        L_0x028a:
            if (r13 == 0) goto L_0x026c
            goto L_0x028e
        L_0x028d:
            r12 = 0
        L_0x028e:
            com.etsy.android.lib.models.apiv3.listing.ImageSize r12 = (com.etsy.android.lib.models.apiv3.listing.ImageSize) r12
            if (r12 == 0) goto L_0x0297
            java.lang.String r11 = r12.getUrl()
            goto L_0x0298
        L_0x0297:
            r11 = 0
        L_0x0298:
            r10.setImageUrl90x90(r11)
            com.etsy.android.lib.models.apiv3.listing.Image r9 = r9.getImage()
            if (r9 == 0) goto L_0x02d6
            java.util.List r9 = r9.getSources()
            if (r9 == 0) goto L_0x02d6
            java.util.Iterator r9 = r9.iterator()
        L_0x02ab:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x02cc
            java.lang.Object r11 = r9.next()
            r12 = r11
            com.etsy.android.lib.models.apiv3.listing.ImageSize r12 = (com.etsy.android.lib.models.apiv3.listing.ImageSize) r12
            int r13 = r12.getHeight()
            r14 = 190(0xbe, float:2.66E-43)
            if (r13 != r14) goto L_0x02c8
            int r12 = r12.getWidth()
            if (r12 != r14) goto L_0x02c8
            r12 = r6
            goto L_0x02c9
        L_0x02c8:
            r12 = r4
        L_0x02c9:
            if (r12 == 0) goto L_0x02ab
            goto L_0x02cd
        L_0x02cc:
            r11 = 0
        L_0x02cd:
            com.etsy.android.lib.models.apiv3.listing.ImageSize r11 = (com.etsy.android.lib.models.apiv3.listing.ImageSize) r11
            if (r11 == 0) goto L_0x02d6
            java.lang.String r9 = r11.getUrl()
            goto L_0x02d7
        L_0x02d6:
            r9 = 0
        L_0x02d7:
            r10.setImageUrl190x190(r9)
            kotlin.m r9 = kotlin.C19394m.f43287a
            r8.add(r10)
            goto L_0x020b
        L_0x02e1:
            kotlin.collections.EmptyList r8 = kotlin.collections.EmptyList.INSTANCE
        L_0x02e3:
            r2.setMembers(r8)
            kotlin.m r7 = kotlin.C19394m.f43287a
            r0.setAbout(r2)
            java.util.List r2 = r16.getShopReviews()
            r7 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x04e8
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = kotlin.collections.C19322o.m32624F0(r2)
            r9.<init>(r10)
            java.util.Iterator r2 = r2.iterator()
        L_0x0300:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L_0x04ea
            java.lang.Object r10 = r2.next()
            com.etsy.android.lib.models.apiv3.listing.ShopReview r10 = (com.etsy.android.lib.models.apiv3.listing.ShopReview) r10
            com.etsy.android.lib.models.ReceiptReview r11 = new com.etsy.android.lib.models.ReceiptReview
            r11.<init>()
            com.etsy.android.lib.models.apiv3.listing.TransactionReview r12 = r10.getReview()
            if (r12 == 0) goto L_0x0328
            java.lang.Long r12 = r12.getCreateDate()
            if (r12 == 0) goto L_0x0328
            long r12 = r12.longValue()
            java.util.Date r14 = new java.util.Date
            long r12 = r12 * r7
            r14.<init>(r12)
            goto L_0x032d
        L_0x0328:
            java.util.Date r14 = new java.util.Date
            r14.<init>()
        L_0x032d:
            r11.setDate(r14)
            com.etsy.android.lib.models.apiv3.listing.ShopsReviewsUserCard r12 = r10.getBuyerUser()
            if (r12 == 0) goto L_0x0346
            java.lang.Long r12 = r12.getUserId()
            if (r12 == 0) goto L_0x0346
            long r12 = r12.longValue()
            com.etsy.android.lib.models.datatypes.EtsyId r14 = new com.etsy.android.lib.models.datatypes.EtsyId
            r14.<init>((long) r12)
            goto L_0x0347
        L_0x0346:
            r14 = 0
        L_0x0347:
            r11.setUserId(r14)
            com.etsy.android.lib.models.apiv3.listing.ShopsReviewsUserCard r12 = r10.getBuyerUser()
            if (r12 == 0) goto L_0x0355
            java.lang.String r12 = r12.getAvatarUrl()
            goto L_0x0356
        L_0x0355:
            r12 = 0
        L_0x0356:
            r11.setUserAvatarUrl(r12)
            com.etsy.android.lib.models.apiv3.listing.ShopsReviewsUserCard r12 = r10.getBuyerUser()
            if (r12 == 0) goto L_0x0364
            java.lang.String r12 = r12.getRealNameOrLoginName()
            goto L_0x0365
        L_0x0364:
            r12 = 0
        L_0x0365:
            java.lang.String r12 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r12)
            r11.setUserRealName(r12)
            com.etsy.android.lib.models.apiv3.listing.ShopsReviewsUserCard r12 = r10.getBuyerUser()
            if (r12 == 0) goto L_0x0377
            java.lang.String r12 = r12.getLoginName()
            goto L_0x0378
        L_0x0377:
            r12 = 0
        L_0x0378:
            java.lang.String r12 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r12)
            r11.setUserLoginName(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r11.setReviews(r12)
            com.etsy.android.lib.models.apiv3.listing.TransactionReview r12 = r10.getReview()
            if (r12 == 0) goto L_0x04e0
            java.util.List r13 = r11.getReviews()
            com.etsy.android.lib.models.Review r14 = new com.etsy.android.lib.models.Review
            r14.<init>()
            java.lang.Long r15 = r12.getTransactionId()
            if (r15 == 0) goto L_0x03a6
            long r3 = r15.longValue()
            com.etsy.android.lib.models.datatypes.EtsyId r15 = new com.etsy.android.lib.models.datatypes.EtsyId
            r15.<init>((long) r3)
            goto L_0x03a7
        L_0x03a6:
            r15 = 0
        L_0x03a7:
            r14.setTransactionId(r15)
            java.lang.Float r3 = r12.getRating()
            if (r3 == 0) goto L_0x03b9
            float r3 = r3.floatValue()
            int r3 = p173m.C7279a.m13954l(r3)
            goto L_0x03ba
        L_0x03b9:
            r3 = 0
        L_0x03ba:
            r14.setRating(r3)
            java.lang.String r3 = r12.getReview()
            java.lang.String r3 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r3)
            r14.setReviewMessage(r3)
            java.lang.String r3 = r12.getTranslatedReview()
            java.lang.String r3 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r3)
            r14.setTranslatedReview(r3)
            java.lang.Long r3 = r12.getListingId()
            if (r3 == 0) goto L_0x03e3
            long r3 = r3.longValue()
            com.etsy.android.lib.models.datatypes.EtsyId r15 = new com.etsy.android.lib.models.datatypes.EtsyId
            r15.<init>((long) r3)
            goto L_0x03e4
        L_0x03e3:
            r15 = 0
        L_0x03e4:
            r14.setListingId(r15)
            com.etsy.android.lib.models.apiv3.listing.ShopTransaction r3 = r10.getTransaction()
            if (r3 == 0) goto L_0x03f2
            java.lang.String r3 = r3.getTitle()
            goto L_0x03f3
        L_0x03f2:
            r3 = 0
        L_0x03f3:
            java.lang.String r3 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r3)
            r14.setListingTitle(r3)
            com.etsy.android.lib.models.apiv3.listing.ShopTransaction r3 = r10.getTransaction()
            if (r3 == 0) goto L_0x0405
            java.lang.String r3 = r3.getImageUrl150x150()
            goto L_0x0406
        L_0x0405:
            r3 = 0
        L_0x0406:
            r14.setListingImageUrl(r3)
            com.etsy.android.lib.models.apiv3.listing.AppreciationPhoto r3 = r10.getAppreciationPhoto()
            if (r3 == 0) goto L_0x04b4
            com.etsy.android.lib.models.apiv3.AppreciationPhoto r4 = new com.etsy.android.lib.models.apiv3.AppreciationPhoto
            r4.<init>()
            java.lang.Long r15 = r3.getImageId()
            if (r15 == 0) goto L_0x0426
            long r7 = r15.longValue()
            com.etsy.android.lib.models.datatypes.EtsyId r15 = new com.etsy.android.lib.models.datatypes.EtsyId
            r15.<init>((long) r7)
            r4.setImageId(r15)
        L_0x0426:
            java.lang.Long r7 = r3.getTransactionId()
            if (r7 == 0) goto L_0x0436
            long r7 = r7.longValue()
            com.etsy.android.lib.models.datatypes.EtsyId r15 = new com.etsy.android.lib.models.datatypes.EtsyId
            r15.<init>((long) r7)
            goto L_0x0437
        L_0x0436:
            r15 = 0
        L_0x0437:
            r4.setTransactionId(r15)
            java.lang.Boolean r7 = r3.isSellerApproved()
            if (r7 == 0) goto L_0x0445
            boolean r7 = r7.booleanValue()
            goto L_0x0446
        L_0x0445:
            r7 = 0
        L_0x0446:
            r4.setIsSellerApproved(r7)
            java.lang.String r7 = r3.getStatus()
            java.lang.String r7 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r7)
            r4.setStatus(r7)
            java.lang.String r7 = r1.getShopName()
            java.lang.String r7 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r7)
            r4.setShopName(r7)
            java.lang.String r7 = r1.getSellerAvatar()
            r4.setSellerAvatarUrl(r7)
            com.etsy.android.lib.models.apiv3.listing.ShopTransaction r7 = r10.getTransaction()
            if (r7 == 0) goto L_0x0471
            java.lang.String r7 = r7.getTitle()
            goto L_0x0472
        L_0x0471:
            r7 = 0
        L_0x0472:
            java.lang.String r7 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r7)
            r4.setListingTitle(r7)
            java.lang.String r7 = r3.getUrl75x75()
            r4.setUrl75x75(r7)
            java.lang.String r7 = r3.getUrl170x135()
            r4.setUrl170x135(r7)
            java.lang.String r7 = r3.getUrl224xN()
            r4.setUrl224xN(r7)
            java.lang.String r7 = r3.getUrl340x270()
            r4.setUrl340x270(r7)
            java.lang.String r7 = r3.getUrl570xN()
            r4.setUrl570xN(r7)
            java.lang.String r7 = r3.getUrlFullxfull()
            r4.setUrlFullxFull(r7)
            java.lang.String r7 = r3.getUrl300x300()
            r4.setUrl300x300(r7)
            java.lang.String r3 = r3.getUrl680x540()
            r4.setUrl680x540(r3)
            r14.setAppreciationPhoto(r4)
        L_0x04b4:
            com.etsy.android.lib.models.apiv3.listing.ShopTransaction r3 = r10.getTransaction()
            if (r3 == 0) goto L_0x04cf
            java.lang.String r3 = r3.getResponse()
            if (r3 == 0) goto L_0x04cf
            com.etsy.android.lib.models.ReviewResponse r4 = new com.etsy.android.lib.models.ReviewResponse
            r4.<init>()
            java.lang.String r3 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r3)
            r4.setMessage(r3)
            r14.setReviewResponse(r4)
        L_0x04cf:
            java.lang.String r3 = r12.getLanguage()
            java.lang.String r3 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r3)
            r14.setReviewLanguage(r3)
            r14.setListingDisplayable(r6)
            r13.add(r14)
        L_0x04e0:
            r9.add(r11)
            r4 = 0
            r7 = 1000(0x3e8, double:4.94E-321)
            goto L_0x0300
        L_0x04e8:
            kotlin.collections.EmptyList r9 = kotlin.collections.EmptyList.INSTANCE
        L_0x04ea:
            r0.setReceiptReviews(r9)
            com.etsy.android.lib.models.apiv3.listing.ShopStructuredPolicies r1 = r16.getStructuredPolicies()
            if (r1 == 0) goto L_0x07f9
            com.etsy.android.lib.models.apiv3.StructuredShopPolicies r2 = new com.etsy.android.lib.models.apiv3.StructuredShopPolicies
            r2.<init>()
            java.lang.Long r3 = r1.getStructuredPoliciesId()
            if (r3 == 0) goto L_0x0508
            long r3 = r3.longValue()
            com.etsy.android.lib.models.datatypes.EtsyId r6 = new com.etsy.android.lib.models.datatypes.EtsyId
            r6.<init>((long) r3)
            goto L_0x0509
        L_0x0508:
            r6 = 0
        L_0x0509:
            r2.setPoliciesId(r6)
            com.etsy.android.lib.models.apiv3.StructuredShopPayments r3 = new com.etsy.android.lib.models.apiv3.StructuredShopPayments
            r3.<init>()
            com.etsy.android.lib.models.apiv3.listing.StructuredPolicyPayments r4 = r1.getPayments()
            if (r4 == 0) goto L_0x053e
            java.util.List r4 = r4.getAcceptedPaymentMethods()
            if (r4 == 0) goto L_0x053e
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = kotlin.collections.C19322o.m32624F0(r4)
            r6.<init>(r7)
            java.util.Iterator r4 = r4.iterator()
        L_0x052a:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0540
            java.lang.Object r7 = r4.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r7 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r7)
            r6.add(r7)
            goto L_0x052a
        L_0x053e:
            kotlin.collections.EmptyList r6 = kotlin.collections.EmptyList.INSTANCE
        L_0x0540:
            r3.setAcceptedPaymentMethods(r6)
            com.etsy.android.lib.models.apiv3.listing.StructuredPolicyPayments r4 = r1.getPayments()
            if (r4 == 0) goto L_0x0570
            java.util.List r4 = r4.getProtectedPaymentMethods()
            if (r4 == 0) goto L_0x0570
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = kotlin.collections.C19322o.m32624F0(r4)
            r6.<init>(r7)
            java.util.Iterator r4 = r4.iterator()
        L_0x055c:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0572
            java.lang.Object r7 = r4.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r7 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r7)
            r6.add(r7)
            goto L_0x055c
        L_0x0570:
            kotlin.collections.EmptyList r6 = kotlin.collections.EmptyList.INSTANCE
        L_0x0572:
            r3.setProtectedPaymentMethods(r6)
            com.etsy.android.lib.models.apiv3.listing.StructuredPolicyPayments r4 = r1.getPayments()
            if (r4 == 0) goto L_0x05a2
            java.util.List r4 = r4.getManualPaymentMethods()
            if (r4 == 0) goto L_0x05a2
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = kotlin.collections.C19322o.m32624F0(r4)
            r6.<init>(r7)
            java.util.Iterator r4 = r4.iterator()
        L_0x058e:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x05a4
            java.lang.Object r7 = r4.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r7 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r7)
            r6.add(r7)
            goto L_0x058e
        L_0x05a2:
            kotlin.collections.EmptyList r6 = kotlin.collections.EmptyList.INSTANCE
        L_0x05a4:
            r3.setManualPaymentMethods(r6)
            com.etsy.android.lib.models.apiv3.listing.StructuredPolicyPayments r4 = r1.getPayments()
            if (r4 == 0) goto L_0x05b8
            java.lang.Boolean r4 = r4.getAcceptsDirectCheckout()
            if (r4 == 0) goto L_0x05b8
            boolean r4 = r4.booleanValue()
            goto L_0x05b9
        L_0x05b8:
            r4 = 0
        L_0x05b9:
            r3.setAcceptsDirectCheckout(r4)
            com.etsy.android.lib.models.apiv3.listing.StructuredPolicyPayments r4 = r1.getPayments()
            if (r4 == 0) goto L_0x05cd
            java.lang.Boolean r4 = r4.getAcceptsPaypal()
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r4 = kotlin.jvm.internal.C19383o.m32792b(r4, r6)
            goto L_0x05ce
        L_0x05cd:
            r4 = 0
        L_0x05ce:
            if (r4 == 0) goto L_0x05eb
            java.util.List r4 = r3.getProtectedPaymentMethods()
            com.etsy.android.lib.util.PaymentMethod r6 = com.etsy.android.lib.util.PaymentMethod.PAYPAL
            java.lang.String r7 = r6.getName()
            boolean r4 = r4.contains(r7)
            if (r4 != 0) goto L_0x05eb
            java.util.List r4 = r3.getProtectedPaymentMethods()
            java.lang.String r6 = r6.getName()
            r4.add(r6)
        L_0x05eb:
            kotlin.m r4 = kotlin.C19394m.f43287a
            r2.setPayments(r3)
            com.etsy.android.lib.models.apiv3.StructuredShopRefunds r3 = new com.etsy.android.lib.models.apiv3.StructuredShopRefunds
            r3.<init>()
            com.etsy.android.lib.models.apiv3.listing.StructuredPolicyRefunds r4 = r1.getRefunds()
            if (r4 == 0) goto L_0x06f1
            java.lang.Boolean r6 = r4.getAcceptsReturns()
            if (r6 == 0) goto L_0x0606
            boolean r6 = r6.booleanValue()
            goto L_0x0607
        L_0x0606:
            r6 = 0
        L_0x0607:
            r3.setAcceptsReturns(r6)
            java.lang.Boolean r6 = r4.getExchanges()
            if (r6 == 0) goto L_0x0615
            boolean r6 = r6.booleanValue()
            goto L_0x0616
        L_0x0615:
            r6 = 0
        L_0x0616:
            r3.setAcceptsExchanges(r6)
            java.lang.Boolean r6 = r4.getAcceptsCancellations()
            r3.setAcceptsCancellations(r6)
            java.lang.String r6 = r4.getAcceptedSummaryString()
            if (r6 == 0) goto L_0x062b
            java.lang.String r6 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r6)
            goto L_0x062c
        L_0x062b:
            r6 = 0
        L_0x062c:
            if (r6 != 0) goto L_0x062f
            r6 = r5
        L_0x062f:
            r3.setAcceptedSummaryString(r6)
            java.lang.String r6 = r4.getNotAcceptedSummaryString()
            if (r6 == 0) goto L_0x063d
            java.lang.String r6 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r6)
            goto L_0x063e
        L_0x063d:
            r6 = 0
        L_0x063e:
            if (r6 != 0) goto L_0x0641
            r6 = r5
        L_0x0641:
            r3.setNotAcceptedSummaryString(r6)
            java.lang.Integer r6 = r4.getContactSellerWithinDays()
            if (r6 == 0) goto L_0x064f
            int r6 = r6.intValue()
            goto L_0x0650
        L_0x064f:
            r6 = 0
        L_0x0650:
            r3.setContactWithinDays(r6)
            java.lang.Integer r6 = r4.getReturnItemsWithinDays()
            if (r6 == 0) goto L_0x065e
            int r6 = r6.intValue()
            goto L_0x065f
        L_0x065e:
            r6 = 0
        L_0x065f:
            r3.setReturnWithinDays(r6)
            java.lang.Integer r6 = r4.getCancelWithinHours()
            if (r6 == 0) goto L_0x066d
            int r6 = r6.intValue()
            goto L_0x066e
        L_0x066d:
            r6 = 0
        L_0x066e:
            r3.setCancelWithinHours(r6)
            java.lang.String r6 = r4.getCancellationWindowType()
            if (r6 == 0) goto L_0x068f
            com.etsy.android.lib.models.apiv3.CancellationType[] r7 = com.etsy.android.lib.models.apiv3.CancellationType.values()
            int r8 = r7.length
            r9 = 0
        L_0x067d:
            if (r9 >= r8) goto L_0x068f
            r10 = r7[r9]
            java.lang.String r11 = r10.getValue()
            boolean r11 = kotlin.jvm.internal.C19383o.m32792b(r11, r6)
            if (r11 == 0) goto L_0x068c
            goto L_0x0690
        L_0x068c:
            int r9 = r9 + 1
            goto L_0x067d
        L_0x068f:
            r10 = 0
        L_0x0690:
            r3.setCancellationType(r10)
            java.util.List r4 = r4.getNonRefundableItems()
            if (r4 == 0) goto L_0x06e7
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = kotlin.collections.C19322o.m32624F0(r4)
            r6.<init>(r7)
            java.util.Iterator r4 = r4.iterator()
        L_0x06a6:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x06e2
            java.lang.Object r7 = r4.next()
            com.etsy.android.lib.models.apiv3.listing.NonRefundableItem r7 = (com.etsy.android.lib.models.apiv3.listing.NonRefundableItem) r7
            com.etsy.android.lib.models.apiv3.NonRefundableItem r8 = new com.etsy.android.lib.models.apiv3.NonRefundableItem
            r8.<init>()
            java.lang.String r9 = r7.getType()
            java.lang.String r9 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r9)
            r8.setType(r9)
            java.lang.String r9 = r7.getName()
            java.lang.String r9 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r9)
            r8.setName(r9)
            java.lang.Boolean r7 = r7.getNonRefundable()
            if (r7 == 0) goto L_0x06d8
            boolean r7 = r7.booleanValue()
            goto L_0x06d9
        L_0x06d8:
            r7 = 0
        L_0x06d9:
            r8.setNonRefundable(r7)
            kotlin.m r7 = kotlin.C19394m.f43287a
            r6.add(r8)
            goto L_0x06a6
        L_0x06e2:
            java.util.ArrayList r4 = kotlin.collections.C19327t.m32661q1(r6)
            goto L_0x06ec
        L_0x06e7:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x06ec:
            r3.setNonRefundableItems(r4)
            kotlin.m r4 = kotlin.C19394m.f43287a
        L_0x06f1:
            r2.setRefunds(r3)
            com.etsy.android.lib.models.apiv3.StructuredShopShipping r3 = new com.etsy.android.lib.models.apiv3.StructuredShopShipping
            r3.<init>()
            com.etsy.android.lib.models.apiv3.listing.StructuredPolicyShipping r4 = r1.getShipping()
            if (r4 == 0) goto L_0x07b4
            java.util.List r6 = r4.getEstimates()
            if (r6 == 0) goto L_0x0781
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = kotlin.collections.C19322o.m32624F0(r6)
            r7.<init>(r8)
            java.util.Iterator r6 = r6.iterator()
        L_0x0712:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0783
            java.lang.Object r8 = r6.next()
            com.etsy.android.lib.models.apiv3.listing.StructuredPolicyShippingEstimate r8 = (com.etsy.android.lib.models.apiv3.listing.StructuredPolicyShippingEstimate) r8
            com.etsy.android.lib.models.apiv3.StructuredShopShippingEstimate r9 = new com.etsy.android.lib.models.apiv3.StructuredShopShippingEstimate
            r9.<init>()
            java.lang.Integer r10 = r8.getMin()
            if (r10 == 0) goto L_0x072e
            int r10 = r10.intValue()
            goto L_0x072f
        L_0x072e:
            r10 = 0
        L_0x072f:
            r9.setMin(r10)
            java.lang.Integer r10 = r8.getMax()
            if (r10 == 0) goto L_0x073d
            int r10 = r10.intValue()
            goto L_0x073e
        L_0x073d:
            r10 = 0
        L_0x073e:
            r9.setMax(r10)
            java.lang.String r10 = r8.getDisplayName()
            java.lang.String r10 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r10)
            r9.setDisplayName(r10)
            java.lang.Integer r10 = r8.getCountryId()
            if (r10 != 0) goto L_0x075e
            java.lang.String r10 = r8.getRegionCode()
            java.lang.String r10 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r10)
            r9.setRegionCode(r10)
            goto L_0x0765
        L_0x075e:
            java.lang.Integer r10 = r8.getCountryId()
            r9.setCountryId(r10)
        L_0x0765:
            java.lang.String r10 = r8.getUnit()
            java.lang.String r10 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r10)
            r9.setUnit(r10)
            java.lang.String r8 = r8.getType()
            java.lang.String r8 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r8)
            r9.setType(r8)
            kotlin.m r8 = kotlin.C19394m.f43287a
            r7.add(r9)
            goto L_0x0712
        L_0x0781:
            kotlin.collections.EmptyList r7 = kotlin.collections.EmptyList.INSTANCE
        L_0x0783:
            r3.setEstimates(r7)
            java.lang.Boolean r6 = r4.getHasShippingUpgrades()
            if (r6 == 0) goto L_0x0791
            boolean r6 = r6.booleanValue()
            goto L_0x0792
        L_0x0791:
            r6 = 0
        L_0x0792:
            r3.setHasShippingUpgrades(r6)
            java.lang.Boolean r6 = r4.getShipsInternational()
            if (r6 == 0) goto L_0x07a0
            boolean r6 = r6.booleanValue()
            goto L_0x07a1
        L_0x07a0:
            r6 = 0
        L_0x07a1:
            r3.setShipsInternational(r6)
            java.lang.String r4 = r4.getProcessingTimeText()
            java.lang.String r4 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r4)
            if (r4 != 0) goto L_0x07af
            r4 = r5
        L_0x07af:
            r3.setProcessingTimeText(r4)
            kotlin.m r4 = kotlin.C19394m.f43287a
        L_0x07b4:
            r2.setShipping(r3)
            java.lang.Long r3 = r1.getUpdateDate()
            if (r3 == 0) goto L_0x07cc
            long r3 = r3.longValue()
            java.util.Date r6 = new java.util.Date
            r7 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r7
            r6.<init>(r3)
            r2.setLastUpdatedDate(r6)
        L_0x07cc:
            java.lang.Boolean r3 = r1.getCanHaveAdditionalPolicies()
            if (r3 == 0) goto L_0x07d7
            boolean r3 = r3.booleanValue()
            goto L_0x07d8
        L_0x07d7:
            r3 = 0
        L_0x07d8:
            r2.setCanHaveAdditionalPolicies(r3)
            java.lang.String r3 = r1.getAdditionalTermsAndConditions()
            java.lang.String r3 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r3)
            if (r3 != 0) goto L_0x07e6
            r3 = r5
        L_0x07e6:
            r2.setTermsAndConditions(r3)
            java.lang.Boolean r1 = r1.getIncludeDisputeFormLink()
            if (r1 == 0) goto L_0x07f4
            boolean r4 = r1.booleanValue()
            goto L_0x07f5
        L_0x07f4:
            r4 = 0
        L_0x07f5:
            r2.setIncludeResolutionLink(r4)
            goto L_0x07fa
        L_0x07f9:
            r2 = 0
        L_0x07fa:
            r0.setStructuredPolicies(r2)
            com.etsy.android.lib.models.apiv3.listing.ShopsSellerPersonalDetails r1 = r16.getSellerDetails()
            if (r1 == 0) goto L_0x0884
            com.etsy.android.lib.models.apiv3.SellerDetails r2 = new com.etsy.android.lib.models.apiv3.SellerDetails
            r2.<init>()
            java.lang.String r3 = r1.getFirstName()
            java.lang.String r3 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r3)
            r2.setFirstName(r3)
            java.lang.String r3 = r1.getLastName()
            java.lang.String r3 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r3)
            r2.setLastName(r3)
            java.lang.String r3 = r1.getAddressLine1()
            java.lang.String r3 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r3)
            r2.setAddressLine1(r3)
            java.lang.String r3 = r1.getAddressLine2()
            java.lang.String r3 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r3)
            r2.setAddressLine2(r3)
            java.lang.String r3 = r1.getCity()
            java.lang.String r3 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r3)
            r2.setCity(r3)
            java.lang.String r3 = r1.getState()
            java.lang.String r3 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r3)
            r2.setState(r3)
            java.lang.String r3 = r1.getPostalCode()
            java.lang.String r3 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r3)
            r2.setPostalCode(r3)
            java.lang.String r3 = r1.getCountry()
            java.lang.String r3 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r3)
            r2.setCountry(r3)
            java.lang.String r3 = r1.getVatNumber()
            java.lang.String r3 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r3)
            r2.setVatNumber(r3)
            java.lang.String r3 = r1.getEmailAddress()
            java.lang.String r3 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r3)
            r2.setEmail(r3)
            java.lang.String r1 = r1.getPhoneNumber()
            java.lang.String r1 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r1)
            r2.setPhone(r1)
            kotlin.m r1 = kotlin.C19394m.f43287a
            goto L_0x0885
        L_0x0884:
            r2 = 0
        L_0x0885:
            r0.setSellerDetails(r2)
            com.etsy.android.lib.models.apiv3.FAQs r1 = new com.etsy.android.lib.models.apiv3.FAQs
            r1.<init>()
            r0.setFAQs(r1)
            com.etsy.android.lib.models.apiv3.FAQs r1 = r0.getFAQs()
            java.util.List r2 = r16.getFaqs()
            if (r2 == 0) goto L_0x08f6
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = kotlin.collections.C19322o.m32624F0(r2)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x08a7:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x08f8
            java.lang.Object r4 = r2.next()
            com.etsy.android.lib.models.apiv3.listing.ShopsFrequentlyAskedQuestion r4 = (com.etsy.android.lib.models.apiv3.listing.ShopsFrequentlyAskedQuestion) r4
            com.etsy.android.lib.models.apiv3.FAQ r6 = new com.etsy.android.lib.models.apiv3.FAQ
            r6.<init>()
            java.lang.Long r7 = r4.getFaqId()
            if (r7 == 0) goto L_0x08c8
            long r7 = r7.longValue()
            com.etsy.android.lib.models.datatypes.EtsyId r9 = new com.etsy.android.lib.models.datatypes.EtsyId
            r9.<init>((long) r7)
            goto L_0x08c9
        L_0x08c8:
            r9 = 0
        L_0x08c9:
            r6.setFaqId(r9)
            java.lang.String r7 = r4.getQuestion()
            java.lang.String r7 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r7)
            r6.setQuestion(r7)
            java.lang.String r7 = r4.getAnswer()
            java.lang.String r7 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r7)
            r6.setAnswer(r7)
            java.lang.String r4 = r4.getLanguage()
            java.lang.String r4 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r4)
            if (r4 != 0) goto L_0x08ed
            r4 = r5
        L_0x08ed:
            r6.setLanguage(r4)
            kotlin.m r4 = kotlin.C19394m.f43287a
            r3.add(r6)
            goto L_0x08a7
        L_0x08f6:
            kotlin.collections.EmptyList r3 = kotlin.collections.EmptyList.INSTANCE
        L_0x08f8:
            r1.addAll(r3)
            kotlin.m r1 = kotlin.C19394m.f43287a
        L_0x08fd:
            kotlin.m r1 = kotlin.C19394m.f43287a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.core.ListingMapper.m17976g(com.etsy.android.lib.models.apiv3.listing.ListingFetch):com.etsy.android.lib.models.Shop");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.etsy.android.lib.models.SingleListingCheckout m17977h(com.etsy.android.lib.models.apiv3.listing.ListingFetch r17) {
        /*
            com.etsy.android.lib.models.apiv3.listing.ListingExpressCheckout r0 = r17.getSingleListingCheckout()
            if (r0 == 0) goto L_0x0116
            java.lang.Boolean r1 = r0.isExpressCheckoutEligible()
            if (r1 == 0) goto L_0x0011
            boolean r1 = r1.booleanValue()
            goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            java.lang.Integer r5 = r0.getIneligibilityErrorCode()
            java.lang.String r1 = r0.getIneligibilityErrorReason()
            java.lang.String r6 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r1)
            java.lang.String r1 = r0.getTitle()
            java.lang.String r7 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r1)
            java.lang.Boolean r1 = r0.getAcceptsMultiplePaymentMethods()
            if (r1 == 0) goto L_0x0036
            boolean r1 = r1.booleanValue()
            r8 = r1
            goto L_0x0037
        L_0x0036:
            r8 = 0
        L_0x0037:
            java.lang.Boolean r1 = r0.getAcceptsPaypal()
            if (r1 == 0) goto L_0x0043
            boolean r1 = r1.booleanValue()
            r9 = r1
            goto L_0x0044
        L_0x0043:
            r9 = 0
        L_0x0044:
            java.lang.String r1 = r0.getDefaultPaymentMethod()
            java.lang.String r10 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r1)
            java.lang.String r1 = r0.getDefaultSubmitText()
            java.lang.String r11 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r1)
            java.lang.String r1 = r0.getPurchaseAcceptTermsText()
            java.lang.String r12 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r1)
            java.util.List r1 = r0.getPaymentOptions()
            if (r1 == 0) goto L_0x00ff
            java.util.ArrayList r3 = new java.util.ArrayList
            int r13 = kotlin.collections.C19322o.m32624F0(r1)
            r3.<init>(r13)
            java.util.Iterator r1 = r1.iterator()
        L_0x006f:
            boolean r13 = r1.hasNext()
            if (r13 == 0) goto L_0x00fd
            java.lang.Object r13 = r1.next()
            com.etsy.android.lib.models.apiv3.listing.ListingExpressCheckoutPaymentOption r13 = (com.etsy.android.lib.models.apiv3.listing.ListingExpressCheckoutPaymentOption) r13
            com.etsy.android.lib.models.PaymentOption r14 = new com.etsy.android.lib.models.PaymentOption
            r14.<init>()
            java.lang.String r15 = r13.getLabel()
            java.lang.String r15 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r15)
            r14.setLabel(r15)
            java.lang.Boolean r15 = r13.getSelected()
            if (r15 == 0) goto L_0x0096
            boolean r15 = r15.booleanValue()
            goto L_0x0097
        L_0x0096:
            r15 = 0
        L_0x0097:
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
            if (r15 == 0) goto L_0x00e4
            java.util.ArrayList r2 = new java.util.ArrayList
            r16 = r1
            int r1 = kotlin.collections.C19322o.m32624F0(r15)
            r2.<init>(r1)
            java.util.Iterator r1 = r15.iterator()
        L_0x00d0:
            boolean r15 = r1.hasNext()
            if (r15 == 0) goto L_0x00e8
            java.lang.Object r15 = r1.next()
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r15 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r15)
            r2.add(r15)
            goto L_0x00d0
        L_0x00e4:
            r16 = r1
            kotlin.collections.EmptyList r2 = kotlin.collections.EmptyList.INSTANCE
        L_0x00e8:
            r14.setIconClasses(r2)
            java.lang.String r1 = r13.getPaymentMethod()
            java.lang.String r1 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r1)
            r14.setPaymentMethod(r1)
            r3.add(r14)
            r1 = r16
            goto L_0x006f
        L_0x00fd:
            r13 = r3
            goto L_0x0102
        L_0x00ff:
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.INSTANCE
            r13 = r1
        L_0x0102:
            java.lang.Boolean r0 = r0.isInternational()
            if (r0 == 0) goto L_0x010e
            boolean r2 = r0.booleanValue()
            r14 = r2
            goto L_0x010f
        L_0x010e:
            r14 = 0
        L_0x010f:
            com.etsy.android.lib.models.SingleListingCheckout r0 = new com.etsy.android.lib.models.SingleListingCheckout
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0117
        L_0x0116:
            r0 = 0
        L_0x0117:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.core.ListingMapper.m17977h(com.etsy.android.lib.models.apiv3.listing.ListingFetch):com.etsy.android.lib.models.SingleListingCheckout");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v39, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v41, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v43, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v45, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v82, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v83, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v84, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v85, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v86, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v87, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v56, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v57, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v58, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v59, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x050a A[SYNTHETIC, Splitter:B:256:0x050a] */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0527 A[Catch:{ NumberFormatException -> 0x0530 }] */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0533 A[SYNTHETIC, Splitter:B:270:0x0533] */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0540 A[Catch:{ Exception -> 0x07a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0545 A[Catch:{ Exception -> 0x07a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x054c A[Catch:{ Exception -> 0x07a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x055a A[Catch:{ Exception -> 0x07a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x055b A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.etsy.android.lib.models.Listing mo32283a(com.etsy.android.lib.models.apiv3.listing.ListingFetch r53) {
        /*
            r52 = this;
            r1 = r52
            java.lang.String r0 = ""
            java.lang.String r2 = "listingFetch"
            r3 = r53
            kotlin.jvm.internal.C19383o.m32797g(r3, r2)
            com.etsy.android.lib.models.Listing r2 = new com.etsy.android.lib.models.Listing     // Catch:{ Exception -> 0x07a2 }
            r2.<init>()     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.listing.Listing r4 = r53.getListing()     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.listing.ListingPersonalization r5 = r53.getPersonalization()     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.listing.Shipping r6 = r53.getShipping()     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.datatypes.EtsyId r7 = new com.etsy.android.lib.models.datatypes.EtsyId     // Catch:{ Exception -> 0x07a2 }
            long r8 = r4.getListingId()     // Catch:{ Exception -> 0x07a2 }
            r7.<init>((long) r8)     // Catch:{ Exception -> 0x07a2 }
            r2.setListingId(r7)     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.datatypes.EtsyId r7 = new com.etsy.android.lib.models.datatypes.EtsyId     // Catch:{ Exception -> 0x07a2 }
            long r8 = r4.getUserId()     // Catch:{ Exception -> 0x07a2 }
            r7.<init>((long) r8)     // Catch:{ Exception -> 0x07a2 }
            r2.setUserId(r7)     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r7 = r4.getPrice()     // Catch:{ Exception -> 0x07a2 }
            if (r7 == 0) goto L_0x005d
            java.lang.String r7 = r4.getCurrencyCode()     // Catch:{ Exception -> 0x07a2 }
            if (r7 == 0) goto L_0x005d
            com.etsy.android.lib.currency.b r7 = r1.f21303a     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r8 = r4.getPrice()     // Catch:{ Exception -> 0x07a2 }
            kotlin.jvm.internal.C19383o.m32794d(r8)     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r8 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r8)     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r9 = r4.getCurrencyCode()     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r9 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r9)     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.currency.EtsyMoney r7 = r7.mo21248a(r8, r9)     // Catch:{ Exception -> 0x07a2 }
            r2.setPrice(r7)     // Catch:{ Exception -> 0x07a2 }
            goto L_0x0066
        L_0x005d:
            com.etsy.android.lib.currency.b r7 = r1.f21303a     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.currency.EtsyMoney r7 = r7.mo21250c()     // Catch:{ Exception -> 0x07a2 }
            r2.setPrice(r7)     // Catch:{ Exception -> 0x07a2 }
        L_0x0066:
            java.lang.String r7 = r4.getState()     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r7 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r7)     // Catch:{ Exception -> 0x07a2 }
            r2.setState(r7)     // Catch:{ Exception -> 0x07a2 }
            java.lang.Integer r7 = r4.getQuantity()     // Catch:{ Exception -> 0x07a2 }
            r8 = 0
            if (r7 == 0) goto L_0x007d
            int r7 = r7.intValue()     // Catch:{ Exception -> 0x07a2 }
            goto L_0x007e
        L_0x007d:
            r7 = r8
        L_0x007e:
            r2.setQuantity(r7)     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r7 = r4.getUrl()     // Catch:{ Exception -> 0x07a2 }
            r2.setUrl(r7)     // Catch:{ Exception -> 0x07a2 }
            r2.setConvertedPrice(r0)     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.listing.ListingMachineTranslationData r7 = r53.getMachineTranslation()     // Catch:{ Exception -> 0x07a2 }
            if (r7 == 0) goto L_0x0096
            com.etsy.android.lib.models.apiv3.listing.ListingMachineTranslationTranslatedFields r7 = r7.getUntranslated()     // Catch:{ Exception -> 0x07a2 }
            goto L_0x0097
        L_0x0096:
            r7 = 0
        L_0x0097:
            if (r7 == 0) goto L_0x010a
            com.etsy.android.lib.models.apiv3.listing.ListingMachineTranslationData r7 = r53.getMachineTranslation()     // Catch:{ Exception -> 0x07a2 }
            if (r7 == 0) goto L_0x00aa
            com.etsy.android.lib.models.apiv3.listing.ListingMachineTranslationTranslatedFields r7 = r7.getUntranslated()     // Catch:{ Exception -> 0x07a2 }
            if (r7 == 0) goto L_0x00aa
            java.lang.String r7 = r7.getTitle()     // Catch:{ Exception -> 0x07a2 }
            goto L_0x00ab
        L_0x00aa:
            r7 = 0
        L_0x00ab:
            java.lang.String r7 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r7)     // Catch:{ Exception -> 0x07a2 }
            if (r7 != 0) goto L_0x00b2
            r7 = r0
        L_0x00b2:
            r2.setTitle(r7)     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.listing.ListingMachineTranslationData r7 = r53.getMachineTranslation()     // Catch:{ Exception -> 0x07a2 }
            if (r7 == 0) goto L_0x00c6
            com.etsy.android.lib.models.apiv3.listing.ListingMachineTranslationTranslatedFields r7 = r7.getUntranslated()     // Catch:{ Exception -> 0x07a2 }
            if (r7 == 0) goto L_0x00c6
            java.lang.String r7 = r7.getDescriptionPlaintext()     // Catch:{ Exception -> 0x07a2 }
            goto L_0x00c7
        L_0x00c6:
            r7 = 0
        L_0x00c7:
            java.lang.String r7 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r7)     // Catch:{ Exception -> 0x07a2 }
            if (r7 != 0) goto L_0x00ce
            r7 = r0
        L_0x00ce:
            r2.setDescription(r7)     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.listing.ListingMachineTranslationData r7 = r53.getMachineTranslation()     // Catch:{ Exception -> 0x07a2 }
            if (r7 == 0) goto L_0x00e2
            com.etsy.android.lib.models.apiv3.listing.ListingMachineTranslationTranslatedFields r7 = r7.getUntranslated()     // Catch:{ Exception -> 0x07a2 }
            if (r7 == 0) goto L_0x00e2
            java.lang.String r7 = r7.getLanguage()     // Catch:{ Exception -> 0x07a2 }
            goto L_0x00e3
        L_0x00e2:
            r7 = 0
        L_0x00e3:
            java.lang.String r7 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r7)     // Catch:{ Exception -> 0x07a2 }
            if (r7 != 0) goto L_0x00ea
            r7 = r0
        L_0x00ea:
            r2.setLanguage(r7)     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.listing.ListingMachineTranslationData r7 = r53.getMachineTranslation()     // Catch:{ Exception -> 0x07a2 }
            if (r7 == 0) goto L_0x00fe
            com.etsy.android.lib.models.apiv3.listing.ListingMachineTranslationTranslatedFields r7 = r7.getTranslated()     // Catch:{ Exception -> 0x07a2 }
            if (r7 == 0) goto L_0x00fe
            java.lang.String r7 = r7.getLanguage()     // Catch:{ Exception -> 0x07a2 }
            goto L_0x00ff
        L_0x00fe:
            r7 = 0
        L_0x00ff:
            java.lang.String r7 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r7)     // Catch:{ Exception -> 0x07a2 }
            if (r7 != 0) goto L_0x0106
            r7 = r0
        L_0x0106:
            r2.setOriginalLanguage(r7)     // Catch:{ Exception -> 0x07a2 }
            goto L_0x013f
        L_0x010a:
            java.lang.String r7 = r4.getTitle()     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r7 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r7)     // Catch:{ Exception -> 0x07a2 }
            if (r7 != 0) goto L_0x0115
            r7 = r0
        L_0x0115:
            r2.setTitle(r7)     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r7 = r4.getDescription()     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r7 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r7)     // Catch:{ Exception -> 0x07a2 }
            if (r7 != 0) goto L_0x0123
            r7 = r0
        L_0x0123:
            r2.setDescription(r7)     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.listing.ListingMachineTranslationData r7 = r53.getMachineTranslation()     // Catch:{ Exception -> 0x07a2 }
            if (r7 == 0) goto L_0x0131
            java.lang.String r7 = r7.getFromLangCode()     // Catch:{ Exception -> 0x07a2 }
            goto L_0x0132
        L_0x0131:
            r7 = 0
        L_0x0132:
            java.lang.String r7 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r7)     // Catch:{ Exception -> 0x07a2 }
            if (r7 != 0) goto L_0x0139
            r7 = r0
        L_0x0139:
            r2.setLanguage(r7)     // Catch:{ Exception -> 0x07a2 }
            r2.setOriginalLanguage(r0)     // Catch:{ Exception -> 0x07a2 }
        L_0x013f:
            if (r5 == 0) goto L_0x017b
            java.lang.Boolean r7 = r5.isPersonalizable()     // Catch:{ Exception -> 0x07a2 }
            if (r7 == 0) goto L_0x014c
            boolean r7 = r7.booleanValue()     // Catch:{ Exception -> 0x07a2 }
            goto L_0x014d
        L_0x014c:
            r7 = r8
        L_0x014d:
            r2.setPersonalizable(r7)     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r7 = r5.getPersonalizationInstructions()     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r7 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r7)     // Catch:{ Exception -> 0x07a2 }
            r2.setPersonalizationInstructions(r7)     // Catch:{ Exception -> 0x07a2 }
            java.lang.Integer r7 = r5.getBuyerPersonalizationCharCountMax()     // Catch:{ Exception -> 0x07a2 }
            if (r7 == 0) goto L_0x0166
            int r7 = r7.intValue()     // Catch:{ Exception -> 0x07a2 }
            goto L_0x0168
        L_0x0166:
            r7 = 256(0x100, float:3.59E-43)
        L_0x0168:
            r2.setPersonalizationMaxChars(r7)     // Catch:{ Exception -> 0x07a2 }
            java.lang.Boolean r5 = r5.isRequired()     // Catch:{ Exception -> 0x07a2 }
            if (r5 == 0) goto L_0x0176
            boolean r5 = r5.booleanValue()     // Catch:{ Exception -> 0x07a2 }
            goto L_0x0177
        L_0x0176:
            r5 = r8
        L_0x0177:
            r2.setPersonalizationRequired(r5)     // Catch:{ Exception -> 0x07a2 }
            goto L_0x0187
        L_0x017b:
            r2.setPersonalizable(r8)     // Catch:{ Exception -> 0x07a2 }
            r2.setPersonalizationMaxChars(r8)     // Catch:{ Exception -> 0x07a2 }
            r2.setPersonalizationInstructions(r0)     // Catch:{ Exception -> 0x07a2 }
            r2.setPersonalizationRequired(r8)     // Catch:{ Exception -> 0x07a2 }
        L_0x0187:
            if (r6 == 0) goto L_0x0194
            java.lang.Integer r5 = r6.getProcessingMin()     // Catch:{ Exception -> 0x07a2 }
            if (r5 == 0) goto L_0x0194
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x07a2 }
            goto L_0x0195
        L_0x0194:
            r5 = r8
        L_0x0195:
            r2.setProcessingMin(r5)     // Catch:{ Exception -> 0x07a2 }
            if (r6 == 0) goto L_0x01a5
            java.lang.Integer r5 = r6.getProcessingMax()     // Catch:{ Exception -> 0x07a2 }
            if (r5 == 0) goto L_0x01a5
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x07a2 }
            goto L_0x01a6
        L_0x01a5:
            r5 = r8
        L_0x01a6:
            r2.setProcessingMax(r5)     // Catch:{ Exception -> 0x07a2 }
            int r5 = r4.getFavorites()     // Catch:{ Exception -> 0x07a2 }
            r2.setNumFavorers(r5)     // Catch:{ Exception -> 0x07a2 }
            boolean r5 = r4.isPrivate()     // Catch:{ Exception -> 0x07a2 }
            r2.setPrivate(r5)     // Catch:{ Exception -> 0x07a2 }
            boolean r5 = r4.isDigital()     // Catch:{ Exception -> 0x07a2 }
            r2.setDigitalDownload(r5)     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.listing.PriceMessaging r5 = r53.getPriceMessaging()     // Catch:{ Exception -> 0x07a2 }
            if (r5 == 0) goto L_0x01e3
            java.lang.Boolean r6 = r5.isVatInclusive()     // Catch:{ Exception -> 0x07a2 }
            if (r6 == 0) goto L_0x01cf
            boolean r6 = r6.booleanValue()     // Catch:{ Exception -> 0x07a2 }
            goto L_0x01d0
        L_0x01cf:
            r6 = r8
        L_0x01d0:
            r2.setVATInclusive(r6)     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r5 = r5.getTransparentPriceMessage()     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r5 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r5)     // Catch:{ Exception -> 0x07a2 }
            if (r5 != 0) goto L_0x01de
            r5 = r0
        L_0x01de:
            r2.setTransparentPriceMessage(r5)     // Catch:{ Exception -> 0x07a2 }
            kotlin.m r5 = kotlin.C19394m.f43287a     // Catch:{ Exception -> 0x07a2 }
        L_0x01e3:
            com.etsy.android.lib.models.apiv3.listing.ListingCard r5 = r53.getListingCard()     // Catch:{ Exception -> 0x07a2 }
            if (r5 == 0) goto L_0x0209
            java.lang.Boolean r6 = r5.isFavorite()     // Catch:{ Exception -> 0x07a2 }
            if (r6 == 0) goto L_0x01f4
            boolean r6 = r6.booleanValue()     // Catch:{ Exception -> 0x07a2 }
            goto L_0x01f5
        L_0x01f4:
            r6 = r8
        L_0x01f5:
            r2.setFavorite(r6)     // Catch:{ Exception -> 0x07a2 }
            java.lang.Boolean r5 = r5.isInCollections()     // Catch:{ Exception -> 0x07a2 }
            if (r5 == 0) goto L_0x0203
            boolean r5 = r5.booleanValue()     // Catch:{ Exception -> 0x07a2 }
            goto L_0x0204
        L_0x0203:
            r5 = r8
        L_0x0204:
            r2.setHasCollections(r5)     // Catch:{ Exception -> 0x07a2 }
            kotlin.m r5 = kotlin.C19394m.f43287a     // Catch:{ Exception -> 0x07a2 }
        L_0x0209:
            java.util.Date r5 = new java.util.Date     // Catch:{ Exception -> 0x07a2 }
            long r6 = r4.getCreateDate()     // Catch:{ Exception -> 0x07a2 }
            r10 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r10
            r5.<init>(r6)     // Catch:{ Exception -> 0x07a2 }
            r2.setCreationDate(r5)     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.Shop r5 = m17976g(r53)     // Catch:{ Exception -> 0x07a2 }
            r2.setShop(r5)     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.SingleListingCheckout r5 = m17977h(r53)     // Catch:{ Exception -> 0x07a2 }
            r2.setSingleListingCheckout(r5)     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.listing.ListingGiftInfo r5 = r53.getGiftInfo()     // Catch:{ Exception -> 0x07a2 }
            if (r5 == 0) goto L_0x0276
            com.etsy.android.lib.models.apiv3.GiftInfo r6 = new com.etsy.android.lib.models.apiv3.GiftInfo     // Catch:{ Exception -> 0x07a2 }
            r6.<init>()     // Catch:{ Exception -> 0x07a2 }
            java.lang.Boolean r7 = r5.isEligible()     // Catch:{ Exception -> 0x07a2 }
            if (r7 == 0) goto L_0x023c
            boolean r7 = r7.booleanValue()     // Catch:{ Exception -> 0x07a2 }
            goto L_0x023d
        L_0x023c:
            r7 = r8
        L_0x023d:
            r6.setIsEligible(r7)     // Catch:{ Exception -> 0x07a2 }
            java.lang.Boolean r7 = r5.getOffersGiftMessage()     // Catch:{ Exception -> 0x07a2 }
            if (r7 == 0) goto L_0x024b
            boolean r7 = r7.booleanValue()     // Catch:{ Exception -> 0x07a2 }
            goto L_0x024c
        L_0x024b:
            r7 = r8
        L_0x024c:
            r6.setOffersGiftMessage(r7)     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r7 = r5.getDescription()     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r7 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r7)     // Catch:{ Exception -> 0x07a2 }
            if (r7 != 0) goto L_0x025a
            r7 = r0
        L_0x025a:
            r6.setDescription(r7)     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.listing.Money r7 = r5.getPrice()     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.Money r7 = m17973d(r7)     // Catch:{ Exception -> 0x07a2 }
            r6.setPrice(r7)     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.listing.Image r5 = r5.getPreviewImage()     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.Image r5 = m17972c(r5)     // Catch:{ Exception -> 0x07a2 }
            r6.setPreviewImage(r5)     // Catch:{ Exception -> 0x07a2 }
            kotlin.m r5 = kotlin.C19394m.f43287a     // Catch:{ Exception -> 0x07a2 }
            goto L_0x0277
        L_0x0276:
            r6 = 0
        L_0x0277:
            r2.setGiftInfo(r6)     // Catch:{ Exception -> 0x07a2 }
            java.util.List r5 = r53.getListingImages()     // Catch:{ Exception -> 0x07a2 }
            if (r5 == 0) goto L_0x03c3
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x07a2 }
            int r7 = kotlin.collections.C19322o.m32624F0(r5)     // Catch:{ Exception -> 0x07a2 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x07a2 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x07a2 }
        L_0x028d:
            boolean r7 = r5.hasNext()     // Catch:{ Exception -> 0x07a2 }
            if (r7 == 0) goto L_0x03c7
            java.lang.Object r7 = r5.next()     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.listing.ListingImage r7 = (com.etsy.android.lib.models.apiv3.listing.ListingImage) r7     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r12 = r7.getColor()     // Catch:{ Exception -> 0x07a2 }
            if (r12 == 0) goto L_0x02c3
            java.lang.String r13 = "#"
            boolean r13 = kotlin.text.C19457k.m33025c1(r12, r13, false)     // Catch:{ Exception -> 0x07a2 }
            if (r13 != 0) goto L_0x02b8
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x07a2 }
            r13.<init>()     // Catch:{ Exception -> 0x07a2 }
            r14 = 35
            r13.append(r14)     // Catch:{ Exception -> 0x07a2 }
            r13.append(r12)     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r12 = r13.toString()     // Catch:{ Exception -> 0x07a2 }
        L_0x02b8:
            int r12 = android.graphics.Color.parseColor(r12)     // Catch:{ Exception -> 0x07a2 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x07a2 }
            kotlin.m r13 = kotlin.C19394m.f43287a     // Catch:{ Exception -> 0x07a2 }
            goto L_0x02c4
        L_0x02c3:
            r12 = 0
        L_0x02c4:
            com.etsy.android.lib.models.datatypes.EtsyId r22 = r7.getImageId()     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r44 = r7.getAltText()     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r13 = r7.getUrl()     // Catch:{ Exception -> 0x07a2 }
            if (r13 != 0) goto L_0x02d5
            r36 = r0
            goto L_0x02d7
        L_0x02d5:
            r36 = r13
        L_0x02d7:
            java.lang.String r13 = r7.getUrl75x75()     // Catch:{ Exception -> 0x07a2 }
            if (r13 != 0) goto L_0x02e0
            r35 = r0
            goto L_0x02e2
        L_0x02e0:
            r35 = r13
        L_0x02e2:
            java.lang.String r13 = r7.getUrl170x135()     // Catch:{ Exception -> 0x07a2 }
            if (r13 != 0) goto L_0x02eb
            r27 = r0
            goto L_0x02ed
        L_0x02eb:
            r27 = r13
        L_0x02ed:
            java.lang.String r13 = r7.getUrl224xN()     // Catch:{ Exception -> 0x07a2 }
            if (r13 != 0) goto L_0x02f6
            r28 = r0
            goto L_0x02f8
        L_0x02f6:
            r28 = r13
        L_0x02f8:
            java.lang.String r13 = r7.getUrl300x300()     // Catch:{ Exception -> 0x07a2 }
            if (r13 != 0) goto L_0x0301
            r29 = r0
            goto L_0x0303
        L_0x0301:
            r29 = r13
        L_0x0303:
            java.lang.String r13 = r7.getUrl340x270()     // Catch:{ Exception -> 0x07a2 }
            if (r13 != 0) goto L_0x030c
            r30 = r0
            goto L_0x030e
        L_0x030c:
            r30 = r13
        L_0x030e:
            java.lang.String r13 = r7.getUrl570xN()     // Catch:{ Exception -> 0x07a2 }
            if (r13 != 0) goto L_0x0317
            r31 = r0
            goto L_0x0319
        L_0x0317:
            r31 = r13
        L_0x0319:
            java.lang.String r13 = r7.getUrl680x540()     // Catch:{ Exception -> 0x07a2 }
            if (r13 != 0) goto L_0x0322
            r34 = r0
            goto L_0x0324
        L_0x0322:
            r34 = r13
        L_0x0324:
            java.lang.Integer r13 = r7.getHue()     // Catch:{ Exception -> 0x07a2 }
            if (r13 == 0) goto L_0x032f
            int r13 = r13.intValue()     // Catch:{ Exception -> 0x07a2 }
            goto L_0x0330
        L_0x032f:
            r13 = r8
        L_0x0330:
            java.lang.Integer r14 = r7.getSaturation()     // Catch:{ Exception -> 0x07a2 }
            if (r14 == 0) goto L_0x033b
            int r14 = r14.intValue()     // Catch:{ Exception -> 0x07a2 }
            goto L_0x033c
        L_0x033b:
            r14 = r8
        L_0x033c:
            java.lang.Integer r15 = r7.getHeight()     // Catch:{ Exception -> 0x07a2 }
            if (r15 == 0) goto L_0x0349
            int r15 = r15.intValue()     // Catch:{ Exception -> 0x07a2 }
            r40 = r15
            goto L_0x034b
        L_0x0349:
            r40 = r8
        L_0x034b:
            java.lang.Integer r7 = r7.getWidth()     // Catch:{ Exception -> 0x07a2 }
            if (r7 == 0) goto L_0x0358
            int r7 = r7.intValue()     // Catch:{ Exception -> 0x07a2 }
            r39 = r7
            goto L_0x035a
        L_0x0358:
            r39 = r8
        L_0x035a:
            if (r12 == 0) goto L_0x0366
            int r7 = r12.intValue()     // Catch:{ Exception -> 0x07a2 }
            int r7 = android.graphics.Color.red(r7)     // Catch:{ Exception -> 0x07a2 }
            r15 = r7
            goto L_0x0367
        L_0x0366:
            r15 = r8
        L_0x0367:
            if (r12 == 0) goto L_0x0374
            int r7 = r12.intValue()     // Catch:{ Exception -> 0x07a2 }
            int r7 = android.graphics.Color.green(r7)     // Catch:{ Exception -> 0x07a2 }
            r16 = r7
            goto L_0x0376
        L_0x0374:
            r16 = r8
        L_0x0376:
            if (r12 == 0) goto L_0x0383
            int r7 = r12.intValue()     // Catch:{ Exception -> 0x07a2 }
            int r7 = android.graphics.Color.blue(r7)     // Catch:{ Exception -> 0x07a2 }
            r17 = r7
            goto L_0x0385
        L_0x0383:
            r17 = r8
        L_0x0385:
            com.etsy.android.lib.models.apiv3.listing.ListingImage r7 = new com.etsy.android.lib.models.apiv3.listing.ListingImage     // Catch:{ Exception -> 0x07a2 }
            r12 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            java.lang.Integer r21 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x07a2 }
            r23 = 0
            java.lang.Integer r24 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x07a2 }
            r25 = 0
            r26 = 0
            r32 = 0
            r33 = 0
            r37 = 0
            r38 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = -1182000527(0xffffffffb98c1a71, float:-2.672258E-4)
            r50 = 7
            r51 = 0
            r13 = r7
            r14 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)     // Catch:{ Exception -> 0x07a2 }
            r6.add(r7)     // Catch:{ Exception -> 0x07a2 }
            goto L_0x028d
        L_0x03c3:
            kotlin.collections.EmptyList r6 = p568fn.C17782b.m29855U()     // Catch:{ Exception -> 0x07a2 }
        L_0x03c7:
            r2.setImages(r6)     // Catch:{ Exception -> 0x07a2 }
            java.util.List r5 = r53.getOverview()     // Catch:{ Exception -> 0x07a2 }
            if (r5 == 0) goto L_0x03f1
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x07a2 }
            int r7 = kotlin.collections.C19322o.m32624F0(r5)     // Catch:{ Exception -> 0x07a2 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x07a2 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x07a2 }
        L_0x03dd:
            boolean r7 = r5.hasNext()     // Catch:{ Exception -> 0x07a2 }
            if (r7 == 0) goto L_0x03f5
            java.lang.Object r7 = r5.next()     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r7 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r7)     // Catch:{ Exception -> 0x07a2 }
            r6.add(r7)     // Catch:{ Exception -> 0x07a2 }
            goto L_0x03dd
        L_0x03f1:
            kotlin.collections.EmptyList r6 = p568fn.C17782b.m29855U()     // Catch:{ Exception -> 0x07a2 }
        L_0x03f5:
            r2.setOverview(r6)     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.listing.SellerMarketingBOEMessage r5 = r53.getPromoMessage()     // Catch:{ Exception -> 0x07a2 }
            if (r5 == 0) goto L_0x0444
            com.etsy.android.lib.models.ListingPromotion r6 = new com.etsy.android.lib.models.ListingPromotion     // Catch:{ Exception -> 0x07a2 }
            r6.<init>()     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.listing.FormattedMoney r7 = r5.getDiscountDescription()     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.FormattedMoney r7 = m17971b(r7)     // Catch:{ Exception -> 0x07a2 }
            r6.setDiscountDescription(r7)     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r7 = r5.getDescription()     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r7 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r7)     // Catch:{ Exception -> 0x07a2 }
            r6.setDescription(r7)     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r7 = r5.getDisclaimer()     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r7 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r7)     // Catch:{ Exception -> 0x07a2 }
            r6.setDisclaimer(r7)     // Catch:{ Exception -> 0x07a2 }
            java.lang.Boolean r7 = r5.getHasMinimumCondition()     // Catch:{ Exception -> 0x07a2 }
            if (r7 == 0) goto L_0x042f
            boolean r7 = r7.booleanValue()     // Catch:{ Exception -> 0x07a2 }
            goto L_0x0430
        L_0x042f:
            r7 = r8
        L_0x0430:
            r6.setMinimumCondition(r7)     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r5 = r5.getSellerDescription()     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r5 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r5)     // Catch:{ Exception -> 0x07a2 }
            if (r5 != 0) goto L_0x043e
            r5 = r0
        L_0x043e:
            r6.setSellerDescription(r5)     // Catch:{ Exception -> 0x07a2 }
            kotlin.m r5 = kotlin.C19394m.f43287a     // Catch:{ Exception -> 0x07a2 }
            goto L_0x0445
        L_0x0444:
            r6 = 0
        L_0x0445:
            r2.setListingPromotion(r6)     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.listing.SellerMarketingBOEMessage r5 = r53.getPromoMessage()     // Catch:{ Exception -> 0x07a2 }
            if (r5 == 0) goto L_0x0457
            com.etsy.android.lib.models.apiv3.listing.Money r5 = r5.getDiscountedPrice()     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.Money r5 = m17973d(r5)     // Catch:{ Exception -> 0x07a2 }
            goto L_0x0458
        L_0x0457:
            r5 = 0
        L_0x0458:
            r2.setDiscountedPrice(r5)     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.listing.ListingDetailedFreeShipping r5 = r53.getDetailedFreeShipping()     // Catch:{ Exception -> 0x07a2 }
            if (r5 == 0) goto L_0x0491
            com.etsy.android.lib.models.apiv3.FreeShippingListingData r6 = new com.etsy.android.lib.models.apiv3.FreeShippingListingData     // Catch:{ Exception -> 0x07a2 }
            r6.<init>()     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r7 = r5.getSellerDescription()     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r7 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r7)     // Catch:{ Exception -> 0x07a2 }
            if (r7 != 0) goto L_0x0471
            r7 = r0
        L_0x0471:
            r6.setSellerDescription(r7)     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.listing.FormattedMoney r5 = r5.getMessage()     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.FormattedMoney r5 = m17971b(r5)     // Catch:{ Exception -> 0x07a2 }
            r6.setMessage(r5)     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.listing.ListingDetailedFreeShipping r5 = r53.getDetailedFreeShipping()     // Catch:{ Exception -> 0x07a2 }
            if (r5 == 0) goto L_0x048a
            com.etsy.android.lib.models.apiv3.DetailedFreeShipping r5 = r5.getFormattedMessage()     // Catch:{ Exception -> 0x07a2 }
            goto L_0x048b
        L_0x048a:
            r5 = 0
        L_0x048b:
            r6.setFormattedMessage(r5)     // Catch:{ Exception -> 0x07a2 }
            kotlin.m r5 = kotlin.C19394m.f43287a     // Catch:{ Exception -> 0x07a2 }
            goto L_0x0492
        L_0x0491:
            r6 = 0
        L_0x0492:
            r2.setFreeShippingData(r6)     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.listing.Nudge r5 = r53.getListingNudge()     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.Nudge r5 = m17974e(r5)     // Catch:{ Exception -> 0x07a2 }
            r2.setNudge(r5)     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.PaymentTemplate r5 = new com.etsy.android.lib.models.PaymentTemplate     // Catch:{ Exception -> 0x07a2 }
            java.util.List r4 = r4.getPaymentMethods()     // Catch:{ Exception -> 0x07a2 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x07a2 }
            r2.setPaymentInfo(r5)     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.listing.Shipping r4 = r53.getShipping()     // Catch:{ Exception -> 0x07a2 }
            if (r4 == 0) goto L_0x0565
            java.util.List r4 = r4.getShipsTo()     // Catch:{ Exception -> 0x07a2 }
            if (r4 == 0) goto L_0x0565
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x07a2 }
            int r6 = kotlin.collections.C19322o.m32624F0(r4)     // Catch:{ Exception -> 0x07a2 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x07a2 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x07a2 }
        L_0x04c5:
            boolean r6 = r4.hasNext()     // Catch:{ Exception -> 0x07a2 }
            if (r6 == 0) goto L_0x0569
            java.lang.Object r6 = r4.next()     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.listing.ShippingProfileEntryBasic r6 = (com.etsy.android.lib.models.apiv3.listing.ShippingProfileEntryBasic) r6     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.ShippingInfo r7 = new com.etsy.android.lib.models.ShippingInfo     // Catch:{ Exception -> 0x07a2 }
            r7.<init>()     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.listing.ShippingCost r12 = r6.getPrimaryCost()     // Catch:{ Exception -> 0x07a2 }
            if (r12 == 0) goto L_0x04e1
            java.lang.String r12 = r12.getCurrency()     // Catch:{ Exception -> 0x07a2 }
            goto L_0x04e2
        L_0x04e1:
            r12 = 0
        L_0x04e2:
            java.lang.String r12 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r12)     // Catch:{ Exception -> 0x07a2 }
            r7.setCurrencyCode(r12)     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.listing.ShippingCost r12 = r6.getPrimaryCost()     // Catch:{ Exception -> 0x07a2 }
            r13 = 0
            if (r12 == 0) goto L_0x050f
            java.lang.String r12 = r12.getPrice()     // Catch:{ Exception -> 0x07a2 }
            if (r12 == 0) goto L_0x050f
            kotlin.text.Regex r14 = kotlin.text.C19452f.f43389a     // Catch:{ NumberFormatException -> 0x0507 }
            boolean r14 = r14.matches(r12)     // Catch:{ NumberFormatException -> 0x0507 }
            if (r14 == 0) goto L_0x0507
            float r12 = java.lang.Float.parseFloat(r12)     // Catch:{ NumberFormatException -> 0x0507 }
            java.lang.Float r12 = java.lang.Float.valueOf(r12)     // Catch:{ NumberFormatException -> 0x0507 }
            goto L_0x0508
        L_0x0507:
            r12 = 0
        L_0x0508:
            if (r12 == 0) goto L_0x050f
            float r12 = r12.floatValue()     // Catch:{ Exception -> 0x07a2 }
            goto L_0x0510
        L_0x050f:
            r12 = r13
        L_0x0510:
            r7.setPrimaryCost(r12)     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.listing.ShippingCost r12 = r6.getSecondaryCost()     // Catch:{ Exception -> 0x07a2 }
            if (r12 == 0) goto L_0x0537
            java.lang.String r12 = r12.getPrice()     // Catch:{ Exception -> 0x07a2 }
            if (r12 == 0) goto L_0x0537
            kotlin.text.Regex r14 = kotlin.text.C19452f.f43389a     // Catch:{ NumberFormatException -> 0x0530 }
            boolean r14 = r14.matches(r12)     // Catch:{ NumberFormatException -> 0x0530 }
            if (r14 == 0) goto L_0x0530
            float r12 = java.lang.Float.parseFloat(r12)     // Catch:{ NumberFormatException -> 0x0530 }
            java.lang.Float r12 = java.lang.Float.valueOf(r12)     // Catch:{ NumberFormatException -> 0x0530 }
            goto L_0x0531
        L_0x0530:
            r12 = 0
        L_0x0531:
            if (r12 == 0) goto L_0x0537
            float r13 = r12.floatValue()     // Catch:{ Exception -> 0x07a2 }
        L_0x0537:
            r7.setSecondaryCost(r13)     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.listing.Shipping r12 = r53.getShipping()     // Catch:{ Exception -> 0x07a2 }
            if (r12 == 0) goto L_0x0545
            java.lang.String r12 = r12.getShipsFrom()     // Catch:{ Exception -> 0x07a2 }
            goto L_0x0546
        L_0x0545:
            r12 = 0
        L_0x0546:
            java.lang.String r12 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r12)     // Catch:{ Exception -> 0x07a2 }
            if (r12 != 0) goto L_0x054d
            r12 = r0
        L_0x054d:
            r7.setOriginCountryName(r12)     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r6 = r6.getName()     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r6 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r6)     // Catch:{ Exception -> 0x07a2 }
            if (r6 != 0) goto L_0x055b
            r6 = r0
        L_0x055b:
            r7.setDestinationCountryName(r6)     // Catch:{ Exception -> 0x07a2 }
            kotlin.m r6 = kotlin.C19394m.f43287a     // Catch:{ Exception -> 0x07a2 }
            r5.add(r7)     // Catch:{ Exception -> 0x07a2 }
            goto L_0x04c5
        L_0x0565:
            kotlin.collections.EmptyList r5 = p568fn.C17782b.m29855U()     // Catch:{ Exception -> 0x07a2 }
        L_0x0569:
            r2.setShippingInfo(r5)     // Catch:{ Exception -> 0x07a2 }
            java.util.List r4 = r53.getManufacturers()     // Catch:{ Exception -> 0x07a2 }
            if (r4 == 0) goto L_0x05b7
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x07a2 }
            int r6 = kotlin.collections.C19322o.m32624F0(r4)     // Catch:{ Exception -> 0x07a2 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x07a2 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x07a2 }
        L_0x057f:
            boolean r6 = r4.hasNext()     // Catch:{ Exception -> 0x07a2 }
            if (r6 == 0) goto L_0x05bb
            java.lang.Object r6 = r4.next()     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.listing.ShopsManufacturer r6 = (com.etsy.android.lib.models.apiv3.listing.ShopsManufacturer) r6     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.Manufacturer r7 = new com.etsy.android.lib.models.Manufacturer     // Catch:{ Exception -> 0x07a2 }
            r7.<init>()     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r12 = r6.getName()     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r12 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r12)     // Catch:{ Exception -> 0x07a2 }
            r7.setName(r12)     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r12 = r6.getDescription()     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r12 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r12)     // Catch:{ Exception -> 0x07a2 }
            r7.setDescription(r12)     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r6 = r6.getLocation()     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r6 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r6)     // Catch:{ Exception -> 0x07a2 }
            r7.setLocation(r6)     // Catch:{ Exception -> 0x07a2 }
            kotlin.m r6 = kotlin.C19394m.f43287a     // Catch:{ Exception -> 0x07a2 }
            r5.add(r7)     // Catch:{ Exception -> 0x07a2 }
            goto L_0x057f
        L_0x05b7:
            kotlin.collections.EmptyList r5 = p568fn.C17782b.m29855U()     // Catch:{ Exception -> 0x07a2 }
        L_0x05bb:
            r2.setManufacturers(r5)     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext r4 = r53.getOfferings()     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.OfferingResponse r4 = m17975f(r4)     // Catch:{ Exception -> 0x07a2 }
            r2.setOfferings(r4)     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.OfferingResponse r4 = r2.getOfferings()     // Catch:{ Exception -> 0x07a2 }
            if (r4 != 0) goto L_0x05ec
            java.util.List r4 = r53.getVariations()     // Catch:{ Exception -> 0x07a2 }
            r5 = 1
            if (r4 == 0) goto L_0x05de
            boolean r4 = r4.isEmpty()     // Catch:{ Exception -> 0x07a2 }
            r4 = r4 ^ r5
            if (r4 != r5) goto L_0x05de
            goto L_0x05df
        L_0x05de:
            r5 = r8
        L_0x05df:
            if (r5 == 0) goto L_0x05ec
            java.util.List r4 = r53.getVariations()     // Catch:{ Exception -> 0x07a2 }
            java.util.List r4 = r1.mo32284i(r4)     // Catch:{ Exception -> 0x07a2 }
            r2.setVariations(r4)     // Catch:{ Exception -> 0x07a2 }
        L_0x05ec:
            com.etsy.android.lib.models.apiv3.OfferingResponse r4 = r2.getOfferings()     // Catch:{ Exception -> 0x07a2 }
            if (r4 == 0) goto L_0x0607
            com.etsy.android.lib.models.Nudge r5 = r4.getNudge()     // Catch:{ Exception -> 0x07a2 }
            if (r5 != 0) goto L_0x0605
            com.etsy.android.lib.models.Nudge r5 = r2.getNudge()     // Catch:{ Exception -> 0x07a2 }
            if (r5 == 0) goto L_0x0605
            com.etsy.android.lib.models.Nudge r5 = r2.getNudge()     // Catch:{ Exception -> 0x07a2 }
            r4.setNudge(r5)     // Catch:{ Exception -> 0x07a2 }
        L_0x0605:
            kotlin.m r4 = kotlin.C19394m.f43287a     // Catch:{ Exception -> 0x07a2 }
        L_0x0607:
            java.util.List r4 = r53.getReviewImages()     // Catch:{ Exception -> 0x07a2 }
            if (r4 == 0) goto L_0x06ba
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x07a2 }
            int r6 = kotlin.collections.C19322o.m32624F0(r4)     // Catch:{ Exception -> 0x07a2 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x07a2 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x07a2 }
        L_0x061a:
            boolean r6 = r4.hasNext()     // Catch:{ Exception -> 0x07a2 }
            if (r6 == 0) goto L_0x06bb
            java.lang.Object r6 = r4.next()     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.listing.ReviewImage r6 = (com.etsy.android.lib.models.apiv3.listing.ReviewImage) r6     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.ReviewImage r7 = new com.etsy.android.lib.models.ReviewImage     // Catch:{ Exception -> 0x07a2 }
            r7.<init>()     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.listing.Image r12 = r6.getImage()     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.Image r12 = m17972c(r12)     // Catch:{ Exception -> 0x07a2 }
            r7.setImage(r12)     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r12 = r6.getReview()     // Catch:{ Exception -> 0x07a2 }
            if (r12 != 0) goto L_0x063d
            r12 = r0
        L_0x063d:
            r7.setReviewText(r12)     // Catch:{ Exception -> 0x07a2 }
            java.lang.Integer r12 = r6.getRating()     // Catch:{ Exception -> 0x07a2 }
            if (r12 != 0) goto L_0x064a
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x07a2 }
        L_0x064a:
            r7.setReviewRating(r12)     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r12 = r6.getBuyerAvatarUrl()     // Catch:{ Exception -> 0x07a2 }
            if (r12 != 0) goto L_0x0654
            r12 = r0
        L_0x0654:
            r7.setBuyerAvatarUrl(r12)     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r12 = r6.getBuyerName()     // Catch:{ Exception -> 0x07a2 }
            if (r12 != 0) goto L_0x065e
            r12 = r0
        L_0x065e:
            r7.setBuyerName(r12)     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r12 = r6.getBuyerProfileUrl()     // Catch:{ Exception -> 0x07a2 }
            if (r12 != 0) goto L_0x0668
            r12 = r0
        L_0x0668:
            r7.setBuyerProfileUrl(r12)     // Catch:{ Exception -> 0x07a2 }
            java.util.Date r12 = new java.util.Date     // Catch:{ Exception -> 0x07a2 }
            java.lang.Long r13 = r6.getCreateDate()     // Catch:{ Exception -> 0x07a2 }
            r14 = 0
            if (r13 == 0) goto L_0x067a
            long r16 = r13.longValue()     // Catch:{ Exception -> 0x07a2 }
            goto L_0x067c
        L_0x067a:
            r16 = r14
        L_0x067c:
            long r8 = r16 * r10
            r12.<init>(r8)     // Catch:{ Exception -> 0x07a2 }
            r7.setCreateDate(r12)     // Catch:{ Exception -> 0x07a2 }
            boolean r8 = r6.isListingOnly()     // Catch:{ Exception -> 0x07a2 }
            r7.setListingOnly(r8)     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.datatypes.EtsyId r8 = new com.etsy.android.lib.models.datatypes.EtsyId     // Catch:{ Exception -> 0x07a2 }
            java.lang.Long r9 = r6.getListingId()     // Catch:{ Exception -> 0x07a2 }
            if (r9 == 0) goto L_0x0697
            long r14 = r9.longValue()     // Catch:{ Exception -> 0x07a2 }
        L_0x0697:
            r8.<init>((long) r14)     // Catch:{ Exception -> 0x07a2 }
            r7.setListingId(r8)     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r8 = r6.getListingTitle()     // Catch:{ Exception -> 0x07a2 }
            r7.setListingTitle(r8)     // Catch:{ Exception -> 0x07a2 }
            java.util.List r8 = r6.getListingImages()     // Catch:{ Exception -> 0x07a2 }
            r7.setListingImages(r8)     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r6 = r6.getTransactionId()     // Catch:{ Exception -> 0x07a2 }
            r7.setTransactionId(r6)     // Catch:{ Exception -> 0x07a2 }
            kotlin.m r6 = kotlin.C19394m.f43287a     // Catch:{ Exception -> 0x07a2 }
            r5.add(r7)     // Catch:{ Exception -> 0x07a2 }
            r8 = 0
            goto L_0x061a
        L_0x06ba:
            r5 = 0
        L_0x06bb:
            r2.setReviewImages(r5)     // Catch:{ Exception -> 0x07a2 }
            java.util.Map r4 = r53.getVariationImages()     // Catch:{ Exception -> 0x07a2 }
            if (r4 == 0) goto L_0x070e
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x07a2 }
            int r6 = r4.size()     // Catch:{ Exception -> 0x07a2 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x07a2 }
            java.util.Set r4 = r4.entrySet()     // Catch:{ Exception -> 0x07a2 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x07a2 }
        L_0x06d5:
            boolean r6 = r4.hasNext()     // Catch:{ Exception -> 0x07a2 }
            if (r6 == 0) goto L_0x0712
            java.lang.Object r6 = r4.next()     // Catch:{ Exception -> 0x07a2 }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ Exception -> 0x07a2 }
            java.lang.Object r7 = r6.getKey()     // Catch:{ Exception -> 0x07a2 }
            java.lang.Number r7 = (java.lang.Number) r7     // Catch:{ Exception -> 0x07a2 }
            long r7 = r7.longValue()     // Catch:{ Exception -> 0x07a2 }
            java.lang.Object r6 = r6.getValue()     // Catch:{ Exception -> 0x07a2 }
            java.lang.Number r6 = (java.lang.Number) r6     // Catch:{ Exception -> 0x07a2 }
            long r9 = r6.longValue()     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.VariationImage r6 = new com.etsy.android.lib.models.VariationImage     // Catch:{ Exception -> 0x07a2 }
            r20 = 0
            r21 = 0
            java.lang.Long r22 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x07a2 }
            java.lang.Long r23 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x07a2 }
            r24 = 0
            r19 = r6
            r19.<init>(r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x07a2 }
            r5.add(r6)     // Catch:{ Exception -> 0x07a2 }
            goto L_0x06d5
        L_0x070e:
            kotlin.collections.EmptyList r5 = p568fn.C17782b.m29855U()     // Catch:{ Exception -> 0x07a2 }
        L_0x0712:
            r2.setVariationImages(r5)     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.listing.Shipping r4 = r53.getShipping()     // Catch:{ Exception -> 0x07a2 }
            if (r4 == 0) goto L_0x0720
            com.etsy.android.lib.models.apiv3.listing.QuickDelivery r4 = r4.getQuickDelivery()     // Catch:{ Exception -> 0x07a2 }
            goto L_0x0721
        L_0x0720:
            r4 = 0
        L_0x0721:
            if (r4 == 0) goto L_0x0737
            com.etsy.android.lib.models.QuickDelivery r5 = new com.etsy.android.lib.models.QuickDelivery     // Catch:{ Exception -> 0x07a2 }
            r5.<init>()     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r6 = r4.getQuickDeliveryTitle()     // Catch:{ Exception -> 0x07a2 }
            r5.setQuickDeliveryTitle(r6)     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r4 = r4.getEstimatedDeliveryDate()     // Catch:{ Exception -> 0x07a2 }
            r5.setEstimatedDeliveryDate(r4)     // Catch:{ Exception -> 0x07a2 }
            goto L_0x0738
        L_0x0737:
            r5 = 0
        L_0x0738:
            r2.setQuickDelivery(r5)     // Catch:{ Exception -> 0x07a2 }
            com.etsy.android.lib.models.apiv3.listing.ListingSustainabilitySignals r3 = r53.getSustainability()     // Catch:{ Exception -> 0x07a2 }
            if (r3 == 0) goto L_0x079d
            com.etsy.android.lib.models.SustainabilitySignals r9 = new com.etsy.android.lib.models.SustainabilitySignals     // Catch:{ Exception -> 0x07a2 }
            r9.<init>()     // Catch:{ Exception -> 0x07a2 }
            java.lang.Boolean r4 = r3.isDigital()     // Catch:{ Exception -> 0x07a2 }
            if (r4 == 0) goto L_0x0751
            boolean r4 = r4.booleanValue()     // Catch:{ Exception -> 0x07a2 }
            goto L_0x0752
        L_0x0751:
            r4 = 0
        L_0x0752:
            r9.setDigital(r4)     // Catch:{ Exception -> 0x07a2 }
            java.lang.Boolean r4 = r3.isHandmade()     // Catch:{ Exception -> 0x07a2 }
            if (r4 == 0) goto L_0x0760
            boolean r4 = r4.booleanValue()     // Catch:{ Exception -> 0x07a2 }
            goto L_0x0761
        L_0x0760:
            r4 = 0
        L_0x0761:
            r9.setHandmade(r4)     // Catch:{ Exception -> 0x07a2 }
            java.lang.Boolean r4 = r3.isOrganic()     // Catch:{ Exception -> 0x07a2 }
            if (r4 == 0) goto L_0x076f
            boolean r4 = r4.booleanValue()     // Catch:{ Exception -> 0x07a2 }
            goto L_0x0770
        L_0x076f:
            r4 = 0
        L_0x0770:
            r9.setOrganic(r4)     // Catch:{ Exception -> 0x07a2 }
            java.lang.Boolean r4 = r3.isRecycled()     // Catch:{ Exception -> 0x07a2 }
            if (r4 == 0) goto L_0x077e
            boolean r4 = r4.booleanValue()     // Catch:{ Exception -> 0x07a2 }
            goto L_0x077f
        L_0x077e:
            r4 = 0
        L_0x077f:
            r9.setRecycled(r4)     // Catch:{ Exception -> 0x07a2 }
            java.lang.Boolean r4 = r3.isVintage()     // Catch:{ Exception -> 0x07a2 }
            if (r4 == 0) goto L_0x078d
            boolean r8 = r4.booleanValue()     // Catch:{ Exception -> 0x07a2 }
            goto L_0x078e
        L_0x078d:
            r8 = 0
        L_0x078e:
            r9.setVintage(r8)     // Catch:{ Exception -> 0x07a2 }
            java.lang.String r3 = r3.getLocation()     // Catch:{ Exception -> 0x07a2 }
            if (r3 != 0) goto L_0x0798
            goto L_0x0799
        L_0x0798:
            r0 = r3
        L_0x0799:
            r9.setLocation(r0)     // Catch:{ Exception -> 0x07a2 }
            goto L_0x079e
        L_0x079d:
            r9 = 0
        L_0x079e:
            r2.setSustainabilitySignals(r9)     // Catch:{ Exception -> 0x07a2 }
            return r2
        L_0x07a2:
            r0 = move-exception
            com.etsy.android.ui.core.ListingMapper$MappingException r2 = new com.etsy.android.ui.core.ListingMapper$MappingException
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.core.ListingMapper.mo32283a(com.etsy.android.lib.models.apiv3.listing.ListingFetch):com.etsy.android.lib.models.Listing");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.etsy.android.lib.models.Variation> mo32284i(java.util.List<com.etsy.android.lib.models.apiv3.listing.Variation> r11) {
        /*
            r10 = this;
            if (r11 == 0) goto L_0x00eb
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = kotlin.collections.C19322o.m32624F0(r11)
            r0.<init>(r1)
            java.util.Iterator r11 = r11.iterator()
        L_0x000f:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x00ed
            java.lang.Object r1 = r11.next()
            com.etsy.android.lib.models.apiv3.listing.Variation r1 = (com.etsy.android.lib.models.apiv3.listing.Variation) r1
            com.etsy.android.lib.models.Variation r2 = new com.etsy.android.lib.models.Variation
            r2.<init>()
            java.lang.Long r3 = r1.getPropertyId()
            r4 = 0
            if (r3 == 0) goto L_0x002d
            long r6 = r3.longValue()
            goto L_0x002e
        L_0x002d:
            r6 = r4
        L_0x002e:
            r2.setPropertyId(r6)
            java.lang.String r3 = r1.getName()
            java.lang.String r3 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r3)
            r2.setFormattedName(r3)
            java.util.List r1 = r1.getValues()
            if (r1 == 0) goto L_0x00e1
            java.util.ArrayList r3 = new java.util.ArrayList
            int r6 = kotlin.collections.C19322o.m32624F0(r1)
            r3.<init>(r6)
            java.util.Iterator r1 = r1.iterator()
        L_0x004f:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x00e3
            java.lang.Object r6 = r1.next()
            com.etsy.android.lib.models.apiv3.listing.VariationValue r6 = (com.etsy.android.lib.models.apiv3.listing.VariationValue) r6
            com.etsy.android.lib.models.Option r7 = new com.etsy.android.lib.models.Option
            r7.<init>()
            java.lang.Long r8 = r6.getValueId()
            if (r8 == 0) goto L_0x006b
            long r8 = r8.longValue()
            goto L_0x006c
        L_0x006b:
            r8 = r4
        L_0x006c:
            r7.setValueId(r8)
            java.lang.String r8 = r6.getValue()
            java.lang.String r8 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r8)
            r7.setFormattedValue(r8)
            java.lang.Boolean r8 = r6.isAvailable()
            if (r8 == 0) goto L_0x0085
            boolean r8 = r8.booleanValue()
            goto L_0x0086
        L_0x0085:
            r8 = 0
        L_0x0086:
            r7.setAvailable(r8)
            com.etsy.android.lib.models.apiv3.listing.Money r8 = r6.getPrice()
            java.lang.String r9 = "null cannot be cast to non-null type com.etsy.android.lib.models.apiv3.listing.Money"
            if (r8 == 0) goto L_0x009d
            com.etsy.android.lib.models.apiv3.listing.Money r8 = r6.getPrice()
            kotlin.jvm.internal.C19383o.m32795e(r8, r9)
            com.etsy.android.lib.currency.EtsyMoney r8 = r8.asEtsyMoney()
            goto L_0x00a3
        L_0x009d:
            com.etsy.android.lib.currency.b r8 = r10.f21303a
            com.etsy.android.lib.currency.EtsyMoney r8 = r8.mo21250c()
        L_0x00a3:
            r7.setPrice(r8)
            com.etsy.android.lib.models.apiv3.listing.Money r8 = r6.getPriceDiff()
            if (r8 == 0) goto L_0x00b8
            com.etsy.android.lib.models.apiv3.listing.Money r8 = r6.getPriceDiff()
            kotlin.jvm.internal.C19383o.m32795e(r8, r9)
            com.etsy.android.lib.currency.EtsyMoney r8 = r8.asEtsyMoney()
            goto L_0x00be
        L_0x00b8:
            com.etsy.android.lib.currency.b r8 = r10.f21303a
            com.etsy.android.lib.currency.EtsyMoney r8 = r8.mo21250c()
        L_0x00be:
            r7.setPriceDiff(r8)
            com.etsy.android.lib.models.apiv3.listing.Money r8 = r6.getConvertedPrice()
            if (r8 == 0) goto L_0x00d3
            com.etsy.android.lib.models.apiv3.listing.Money r6 = r6.getConvertedPrice()
            kotlin.jvm.internal.C19383o.m32795e(r6, r9)
            com.etsy.android.lib.currency.EtsyMoney r6 = r6.asEtsyMoney()
            goto L_0x00d9
        L_0x00d3:
            com.etsy.android.lib.currency.b r6 = r10.f21303a
            com.etsy.android.lib.currency.EtsyMoney r6 = r6.mo21250c()
        L_0x00d9:
            r7.setConvertedPrice(r6)
            r3.add(r7)
            goto L_0x004f
        L_0x00e1:
            kotlin.collections.EmptyList r3 = kotlin.collections.EmptyList.INSTANCE
        L_0x00e3:
            r2.setOptions(r3)
            r0.add(r2)
            goto L_0x000f
        L_0x00eb:
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.INSTANCE
        L_0x00ed:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.core.ListingMapper.mo32284i(java.util.List):java.util.List");
    }
}
