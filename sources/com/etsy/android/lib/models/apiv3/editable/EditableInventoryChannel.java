package com.etsy.android.lib.models.apiv3.editable;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Money;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class EditableInventoryChannel extends BaseFieldModel implements IEditableInventoryObject {
    public static final int EMPTY_QUANTITY = -1;
    public static final EtsyId RETAIL_CHANNEL_ID = new EtsyId(1);
    private static final long serialVersionUID = -3888610813549053291L;
    public EtsyId mChannelId = new EtsyId();
    public int mId;
    public boolean mIsEnabled = true;
    public EtsyId mListingId = new EtsyId();
    public int mParentId;
    public Money mPrice;
    public int mQuantity = -1;

    private boolean hasEqualIdsAndEnabledState(EditableInventoryChannel editableInventoryChannel) {
        int i = this.mId;
        int i2 = editableInventoryChannel.mId;
        if (i != i2 && Math.abs(i - i2) != Math.abs(100000)) {
            return false;
        }
        int i3 = this.mParentId;
        int i4 = editableInventoryChannel.mParentId;
        return (i3 == i4 || Math.abs(i3 - i4) == Math.abs(100000)) && this.mChannelId.equals(editableInventoryChannel.mChannelId) && this.mIsEnabled == editableInventoryChannel.isEnabled();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.mPrice;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean hasEqualPQ(com.etsy.android.lib.models.apiv3.editable.EditableInventoryChannel r3) {
        /*
            r2 = this;
            int r0 = r2.mQuantity
            int r1 = r3.mQuantity
            if (r0 != r1) goto L_0x0019
            com.etsy.android.lib.models.apiv3.Money r0 = r2.mPrice
            if (r0 == 0) goto L_0x0013
            com.etsy.android.lib.models.apiv3.Money r3 = r3.mPrice
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0019
            goto L_0x0017
        L_0x0013:
            com.etsy.android.lib.models.apiv3.Money r3 = r3.mPrice
            if (r3 != 0) goto L_0x0019
        L_0x0017:
            r3 = 1
            goto L_0x001a
        L_0x0019:
            r3 = 0
        L_0x001a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.editable.EditableInventoryChannel.hasEqualPQ(com.etsy.android.lib.models.apiv3.editable.EditableInventoryChannel):boolean");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EditableInventoryChannel editableInventoryChannel = (EditableInventoryChannel) obj;
        return hasEqualIdsAndEnabledState(editableInventoryChannel) && hasEqualPQ(editableInventoryChannel);
    }

    public boolean equalsIgnoringPQ(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return hasEqualIdsAndEnabledState((EditableInventoryChannel) obj);
    }

    public EtsyId getChannelId() {
        return this.mChannelId;
    }

    public int getId() {
        return this.mId;
    }

    public EtsyId getListingId() {
        return this.mListingId;
    }

    public int getParentId() {
        return this.mParentId;
    }

    public Money getPrice() {
        return this.mPrice;
    }

    public int getQuantity() {
        return this.mQuantity;
    }

    public int hashCode() {
        Money money = this.mPrice;
        return ((((this.mChannelId.hashCode() + ((((((money != null ? money.hashCode() : 0) * 31) + this.mId) * 31) + this.mParentId) * 31)) * 31) + this.mQuantity) * 31) + (this.mIsEnabled ? 1 : 0);
    }

    public boolean isEnabled() {
        return this.mIsEnabled;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if ("channel_id".equals(str)) {
            this.mChannelId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
            return true;
        } else if (ResponseConstants.QUANTITY.equals(str)) {
            this.mQuantity = jsonParser.getValueAsInt();
            return true;
        } else if (ResponseConstants.IS_ENABLED.equals(str)) {
            this.mIsEnabled = jsonParser.getValueAsBoolean();
            return true;
        } else if (!ResponseConstants.PRICE.equals(str)) {
            return false;
        } else {
            this.mPrice = (Money) BaseModel.parseObject(jsonParser, Money.class);
            return true;
        }
    }

    public void setChannelId(EtsyId etsyId) {
        this.mChannelId = etsyId;
    }

    public void setEnabled(boolean z) {
        this.mIsEnabled = z;
    }

    public void setId(int i) {
        this.mId = i;
    }

    public void setIsEnabled(boolean z) {
        this.mIsEnabled = z;
    }

    public void setParentId(int i) {
        this.mParentId = i;
    }

    public void setPrice(Money money) {
        this.mPrice = money;
    }

    public void setQuantity(int i) {
        this.mQuantity = i;
    }
}
