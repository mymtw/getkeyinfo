package com.etsy.android.lib.models;

import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class Nudge extends BaseFieldModel {
    private static final String TYPE_CART_COMBO_SCARCITY = "cart_combo_scarcity";
    private static final String TYPE_CART_IN_CART_ONLY = "cart_in_cart_only";
    private static final String TYPE_CART_OOA = "cart_ooa";
    private static final String TYPE_CART_SCARCITY = "cart_scarcity";
    private static final String TYPE_COMBO_CART_AND_QUANTITY = "combo_cart_and_quantity";
    private static final String TYPE_IN_CART_CAP_20 = "in_cart_cap_20";
    private static final String TYPE_IN_CART_ONLY = "in_cart_only";
    private static final String TYPE_ONLY_ONE_AVAILABLE = "only_one_available";
    private static final String TYPE_QUANTITY_ONLY = "quantity_only";
    private static final long serialVersionUID = -7922181562230704913L;
    public String mDisplayText = "";
    public String mIconUrl = "";
    public int mQuantity = 1;
    public int mTotalCarts = 1;
    public String mType = "";

    public String getDisplayText() {
        return this.mDisplayText;
    }

    @Deprecated
    public String getIconUrl() {
        return this.mIconUrl;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getImageResId() {
        /*
            r4 = this;
            java.lang.String r0 = r4.mType
            int r1 = r0.hashCode()
            r2 = 2
            r3 = 1
            switch(r1) {
                case -2015192144: goto L_0x0034;
                case -1071754175: goto L_0x002a;
                case -992570656: goto L_0x0020;
                case -703402287: goto L_0x0016;
                case 1252851933: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x003e
        L_0x000c:
            java.lang.String r1 = "only_one_available"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003e
            r0 = 3
            goto L_0x003f
        L_0x0016:
            java.lang.String r1 = "in_cart_only"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003e
            r0 = 0
            goto L_0x003f
        L_0x0020:
            java.lang.String r1 = "quantity_only"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003e
            r0 = 4
            goto L_0x003f
        L_0x002a:
            java.lang.String r1 = "combo_cart_and_quantity"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003e
            r0 = r2
            goto L_0x003f
        L_0x0034:
            java.lang.String r1 = "in_cart_cap_20"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003e
            r0 = r3
            goto L_0x003f
        L_0x003e:
            r0 = -1
        L_0x003f:
            if (r0 == 0) goto L_0x004d
            if (r0 == r3) goto L_0x004d
            if (r0 == r2) goto L_0x0049
            r0 = 2131232045(0x7f08052d, float:1.8080188E38)
            return r0
        L_0x0049:
            r0 = 2131232036(0x7f080524, float:1.808017E38)
            return r0
        L_0x004d:
            r0 = 2131232000(0x7f080500, float:1.8080097E38)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.Nudge.getImageResId():int");
    }

    public int getQuantity() {
        return this.mQuantity;
    }

    public int getTotalCarts() {
        return this.mTotalCarts;
    }

    public String getType() {
        return this.mType;
    }

    public boolean isCartComboScarcity() {
        String str = this.mType;
        return str != null && str.equals(TYPE_CART_COMBO_SCARCITY);
    }

    public boolean isCartInCartOnly() {
        String str = this.mType;
        return str != null && str.equals(TYPE_CART_IN_CART_ONLY);
    }

    public boolean isCartOnlyOneAvailable() {
        String str = this.mType;
        return str != null && str.equals(TYPE_CART_OOA);
    }

    public boolean isCartScarcity() {
        String str = this.mType;
        return str != null && str.equals(TYPE_CART_SCARCITY);
    }

    public boolean isComboAndCartQuantity() {
        String str = this.mType;
        return str != null && str.equals(TYPE_COMBO_CART_AND_QUANTITY);
    }

    public boolean isInCartCap20() {
        String str = this.mType;
        return str != null && str.equals(TYPE_IN_CART_CAP_20);
    }

    public boolean isInCartOnly() {
        String str = this.mType;
        return str != null && str.equals(TYPE_IN_CART_ONLY);
    }

    public boolean isOnlyOneAvailable() {
        String str = this.mType;
        return str != null && str.equals(TYPE_ONLY_ONE_AVAILABLE);
    }

    public boolean isQuantityOnly() {
        String str = this.mType;
        return str != null && str.equals(TYPE_QUANTITY_ONLY);
    }

    public boolean isQuantityRelated() {
        return isQuantityOnly() || isOnlyOneAvailable();
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1285004149:
                if (str.equals(ResponseConstants.QUANTITY)) {
                    c = 0;
                    break;
                }
                break;
            case -737588055:
                if (str.equals(ResponseConstants.ICON_URL)) {
                    c = 1;
                    break;
                }
                break;
            case -408181608:
                if (str.equals(ResponseConstants.TOTAL_CARTS)) {
                    c = 2;
                    break;
                }
                break;
            case 3575610:
                if (str.equals("type")) {
                    c = 3;
                    break;
                }
                break;
            case 1615269514:
                if (str.equals(ResponseConstants.DISPLAY_TEXT)) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.mQuantity = jsonParser.getValueAsInt();
                break;
            case 1:
                this.mIconUrl = BaseModel.parseString(jsonParser);
                break;
            case 2:
                this.mTotalCarts = jsonParser.getValueAsInt();
                break;
            case 3:
                this.mType = BaseModel.parseString(jsonParser);
                break;
            case 4:
                this.mDisplayText = BaseModel.parseString(jsonParser);
                break;
            default:
                return false;
        }
        return true;
    }

    public void setDisplayText(String str) {
        this.mDisplayText = str;
    }

    public void setIconUrl(String str) {
        this.mIconUrl = str;
    }

    public void setQuantity(int i) {
        this.mQuantity = i;
    }

    public void setTotalCarts(int i) {
        this.mTotalCarts = i;
    }

    public void setType(String str) {
        this.mType = str;
    }
}
