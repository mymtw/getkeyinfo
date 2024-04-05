package com.etsy.android.lib.models.apiv3.cart;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.EtsyAssociativeArray;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Alert;
import com.etsy.android.lib.models.apiv3.AlertType;
import com.etsy.android.lib.models.cardviewelement.ListSection;
import com.etsy.android.lib.models.cardviewelement.Page;
import com.etsy.android.lib.models.editable.EditableListing;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class CartPage extends Page {
    private static final String KEY_MESSAGE = "message";
    private static final String KEY_PROMOTION_NAME = "promotion_name";
    private static final long serialVersionUID = -3441439262918930918L;
    public EtsyAssociativeArray mMetadata;

    private int getCount(String str) {
        EtsyAssociativeArray etsyAssociativeArray = this.mMetadata;
        if (etsyAssociativeArray != null) {
            return Integer.parseInt(etsyAssociativeArray.getStringOrDefault(str, EditableListing.LISTING_ID_DEVICE_DRAFT));
        }
        return 0;
    }

    public Alert getCartAlert() {
        AlertType alertType;
        EtsyAssociativeArray etsyAssociativeArray = this.mMetadata;
        if (etsyAssociativeArray == null || !(etsyAssociativeArray.get("alert") instanceof EtsyAssociativeArray)) {
            return null;
        }
        EtsyAssociativeArray etsyAssociativeArray2 = (EtsyAssociativeArray) this.mMetadata.get("alert");
        try {
            alertType = AlertType.valueOf(etsyAssociativeArray2.getString("type").toUpperCase(Locale.US));
        } catch (IllegalArgumentException unused) {
            alertType = AlertType.UNKNOWN;
        }
        return new Alert(alertType, etsyAssociativeArray2.getString("title"), (String) null, etsyAssociativeArray2.getString(ResponseConstants.ICON), (String) null, (String) null, false, (String) null);
    }

    public int getCartCount() {
        return getCount("cart_count");
    }

    public String getInputError() {
        EtsyAssociativeArray etsyAssociativeArray = this.mMetadata;
        if (etsyAssociativeArray != null) {
            return etsyAssociativeArray.getString("modal_input_error");
        }
        return null;
    }

    public int getInputErrorCode() {
        EtsyAssociativeArray etsyAssociativeArray = this.mMetadata;
        if (etsyAssociativeArray != null) {
            return Integer.parseInt(etsyAssociativeArray.getStringOrDefault("modal_input_error_code", "0"));
        }
        return 0;
    }

    public String getInvalidShopCouponError(String str) {
        HashMap<String, Object> map;
        try {
            EtsyAssociativeArray etsyAssociativeArray = this.mMetadata;
            if (etsyAssociativeArray == null || (map = ((EtsyAssociativeArray) etsyAssociativeArray.get(ResponseConstants.CART_INVALID_COUPON_CODES)).getMap()) == null) {
                return null;
            }
            for (String str2 : map.keySet()) {
                Iterator it = ((List) map.get(str2)).iterator();
                while (true) {
                    if (it.hasNext()) {
                        EtsyAssociativeArray etsyAssociativeArray2 = (EtsyAssociativeArray) it.next();
                        if (str.equalsIgnoreCase(etsyAssociativeArray2.getString("promotion_name"))) {
                            return etsyAssociativeArray2.getString("message");
                        }
                    }
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: ha.b$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: ha.b$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v0, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: ha.b$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: ha.b$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v1, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v2, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: ha.b$b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<p359ha.C12800b> getPurchaseAnalyticsData() {
        /*
            r35 = this;
            r0 = r35
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.etsy.android.lib.models.EtsyAssociativeArray r2 = r0.mMetadata
            if (r2 == 0) goto L_0x01ef
            java.lang.String r3 = "analytics_data"
            java.lang.Object r2 = r2.get(r3)
            boolean r2 = r2 instanceof java.util.ArrayList
            if (r2 == 0) goto L_0x01ef
            com.etsy.android.lib.models.EtsyAssociativeArray r2 = r0.mMetadata
            java.lang.Object r2 = r2.get(r3)
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0021:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01ef
            java.lang.Object r3 = r2.next()
            com.etsy.android.lib.models.EtsyAssociativeArray r3 = (com.etsy.android.lib.models.EtsyAssociativeArray) r3
            java.lang.String r4 = "array"
            kotlin.jvm.internal.C19383o.m32797g(r3, r4)
            java.util.HashMap r5 = r3.getMap()
            java.lang.String r6 = "test_transaction_order_id"
            boolean r5 = r5.containsKey(r6)
            java.lang.String r7 = "test_transaction_receipt_id"
            if (r5 == 0) goto L_0x004c
            java.util.HashMap r5 = r3.getMap()
            boolean r5 = r5.containsKey(r7)
            if (r5 == 0) goto L_0x004c
            r5 = 1
            goto L_0x004d
        L_0x004c:
            r5 = 0
        L_0x004d:
            java.lang.String r10 = "getString(\"user_ltv\")"
            java.lang.String r11 = "user_ltv"
            if (r5 == 0) goto L_0x0075
            java.lang.String r4 = r3.getString(r6)
            java.lang.String r5 = r3.getString(r7)
            java.lang.String r3 = r3.getString(r11)
            ha.b$b r6 = new ha.b$b
            kotlin.jvm.internal.C19383o.m32796f(r3, r10)
            java.lang.String r7 = "getString(\"test_transaction_order_id\")"
            kotlin.jvm.internal.C19383o.m32796f(r4, r7)
            java.lang.String r7 = "getString(\"test_transaction_receipt_id\")"
            kotlin.jvm.internal.C19383o.m32796f(r5, r7)
            r6.<init>(r3, r4, r5)
            r34 = r2
            goto L_0x01e4
        L_0x0075:
            java.util.HashMap r5 = r3.getMap()
            java.lang.String r6 = "transaction_id"
            boolean r5 = r5.containsKey(r6)
            java.lang.String r7 = "items"
            java.lang.String r12 = "currency"
            java.lang.String r13 = "shipping"
            java.lang.String r14 = "tax"
            java.lang.String r15 = "value"
            java.lang.String r8 = "affiliation"
            if (r5 == 0) goto L_0x00cb
            java.util.HashMap r5 = r3.getMap()
            boolean r5 = r5.containsKey(r8)
            if (r5 == 0) goto L_0x00cb
            java.util.HashMap r5 = r3.getMap()
            boolean r5 = r5.containsKey(r15)
            if (r5 == 0) goto L_0x00cb
            java.util.HashMap r5 = r3.getMap()
            boolean r5 = r5.containsKey(r14)
            if (r5 == 0) goto L_0x00cb
            java.util.HashMap r5 = r3.getMap()
            boolean r5 = r5.containsKey(r13)
            if (r5 == 0) goto L_0x00cb
            java.util.HashMap r5 = r3.getMap()
            boolean r5 = r5.containsKey(r12)
            if (r5 == 0) goto L_0x00cb
            java.util.HashMap r5 = r3.getMap()
            boolean r5 = r5.containsKey(r7)
            if (r5 == 0) goto L_0x00cb
            r5 = 1
            goto L_0x00cc
        L_0x00cb:
            r5 = 0
        L_0x00cc:
            r16 = 0
            if (r5 == 0) goto L_0x01e0
            java.lang.String r5 = r3.getString(r6)
            java.lang.String r6 = r3.getString(r8)
            java.lang.String r8 = r3.getString(r11)
            java.lang.String r11 = r3.getString(r15)
            java.lang.String r15 = "array.getString(\"value\")"
            kotlin.jvm.internal.C19383o.m32796f(r11, r15)
            double r21 = java.lang.Double.parseDouble(r11)
            java.lang.String r11 = r3.getString(r14)
            java.lang.String r14 = "array.getString(\"tax\")"
            kotlin.jvm.internal.C19383o.m32796f(r11, r14)
            double r23 = java.lang.Double.parseDouble(r11)
            java.lang.String r11 = r3.getString(r13)
            java.lang.String r13 = "array.getString(\"shipping\")"
            kotlin.jvm.internal.C19383o.m32796f(r11, r13)
            double r25 = java.lang.Double.parseDouble(r11)
            java.lang.String r11 = r3.getString(r12)
            java.lang.Object r3 = r3.get(r7)
            boolean r7 = r3 instanceof java.util.List
            if (r7 == 0) goto L_0x0112
            java.util.List r3 = (java.util.List) r3
            goto L_0x0114
        L_0x0112:
            r3 = r16
        L_0x0114:
            if (r3 == 0) goto L_0x01b7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x011f:
            boolean r12 = r3.hasNext()
            if (r12 == 0) goto L_0x01b2
            java.lang.Object r12 = r3.next()
            com.etsy.android.lib.models.EtsyAssociativeArray r12 = (com.etsy.android.lib.models.EtsyAssociativeArray) r12
            kotlin.jvm.internal.C19383o.m32797g(r12, r4)
            java.util.HashMap r13 = r12.getMap()
            java.lang.String r14 = "listing_id"
            boolean r13 = r13.containsKey(r14)
            java.lang.String r15 = "quantity"
            java.lang.String r9 = "price"
            java.lang.String r0 = "listing_name"
            if (r13 == 0) goto L_0x0160
            java.util.HashMap r13 = r12.getMap()
            boolean r13 = r13.containsKey(r0)
            if (r13 == 0) goto L_0x0160
            java.util.HashMap r13 = r12.getMap()
            boolean r13 = r13.containsKey(r9)
            if (r13 == 0) goto L_0x0160
            java.util.HashMap r13 = r12.getMap()
            boolean r13 = r13.containsKey(r15)
            if (r13 == 0) goto L_0x0160
            r13 = 1
            goto L_0x0161
        L_0x0160:
            r13 = 0
        L_0x0161:
            if (r13 == 0) goto L_0x01a3
            ha.c r13 = new ha.c
            java.lang.String r14 = r12.getString(r14)
            r34 = r2
            java.lang.String r2 = "array.getString(\"listing_id\")"
            kotlin.jvm.internal.C19383o.m32796f(r14, r2)
            java.lang.String r0 = r12.getString(r0)
            java.lang.String r2 = "array.getString(\"listing_name\")"
            kotlin.jvm.internal.C19383o.m32796f(r0, r2)
            java.lang.String r2 = "listing_category"
            java.lang.String r33 = r12.getString(r2)
            java.lang.String r2 = r12.getString(r9)
            java.lang.String r9 = "array.getString(\"price\")"
            kotlin.jvm.internal.C19383o.m32796f(r2, r9)
            double r29 = java.lang.Double.parseDouble(r2)
            java.lang.String r2 = r12.getString(r15)
            java.lang.String r9 = "array.getString(\"quantity\")"
            kotlin.jvm.internal.C19383o.m32796f(r2, r9)
            int r32 = java.lang.Integer.parseInt(r2)
            r27 = r13
            r28 = r14
            r31 = r0
            r27.<init>(r28, r29, r31, r32, r33)
            goto L_0x01a7
        L_0x01a3:
            r34 = r2
            r13 = r16
        L_0x01a7:
            if (r13 == 0) goto L_0x01ac
            r7.add(r13)
        L_0x01ac:
            r0 = r35
            r2 = r34
            goto L_0x011f
        L_0x01b2:
            r34 = r2
            r28 = r7
            goto L_0x01bd
        L_0x01b7:
            r34 = r2
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.INSTANCE
            r28 = r0
        L_0x01bd:
            ha.b$a r0 = new ha.b$a
            kotlin.jvm.internal.C19383o.m32796f(r8, r10)
            java.lang.String r2 = "getString(\"transaction_id\")"
            kotlin.jvm.internal.C19383o.m32796f(r5, r2)
            java.lang.String r2 = "getString(\"affiliation\")"
            kotlin.jvm.internal.C19383o.m32796f(r6, r2)
            java.lang.String r2 = "getString(\"currency\")"
            kotlin.jvm.internal.C19383o.m32796f(r11, r2)
            r17 = r0
            r18 = r8
            r19 = r5
            r20 = r6
            r27 = r11
            r17.<init>(r18, r19, r20, r21, r23, r25, r27, r28)
            r6 = r0
            goto L_0x01e4
        L_0x01e0:
            r34 = r2
            r6 = r16
        L_0x01e4:
            if (r6 == 0) goto L_0x01e9
            r1.add(r6)
        L_0x01e9:
            r0 = r35
            r2 = r34
            goto L_0x0021
        L_0x01ef:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.cart.CartPage.getPurchaseAnalyticsData():java.util.List");
    }

    public int getSavedCount() {
        return getCount("saved_count");
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if (ResponseConstants.METADATA.equals(str)) {
            this.mMetadata = (EtsyAssociativeArray) BaseModel.parseObject(jsonParser, EtsyAssociativeArray.class);
            return true;
        } else if (!ResponseConstants.LIST.equals(str)) {
            return super.parseField(jsonParser, str);
        } else {
            this.mListSections.addAll(BaseModel.parseArray(jsonParser, ListSection.class));
            return true;
        }
    }
}
