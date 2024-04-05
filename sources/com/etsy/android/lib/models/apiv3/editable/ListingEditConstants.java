package com.etsy.android.lib.models.apiv3.editable;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class ListingEditConstants extends BaseFieldModel {
    private static final long serialVersionUID = 875310650539083169L;
    public int mCategoryMinimumLevel;
    public List<ChannelEditConstants> mChannelEditConstantsList = Collections.emptyList();
    public List<EtsyId> mCustomVariationPropertyIds = Collections.emptyList();
    public List<TextInputConstants> mTextInputConstantsList = Collections.emptyList();

    public ChannelEditConstants channelEditConstantsForId(EtsyId etsyId) {
        int size = this.mChannelEditConstantsList.size();
        for (int i = 0; i < size; i++) {
            ChannelEditConstants channelEditConstants = this.mChannelEditConstantsList.get(i);
            if (etsyId.equals(channelEditConstants.getSalesChannelId())) {
                return channelEditConstants;
            }
        }
        return null;
    }

    public int getCategoryMinimumLevel() {
        return this.mCategoryMinimumLevel;
    }

    public List<EtsyId> getCustomVariationPropertyIds() {
        return this.mCustomVariationPropertyIds;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if (ResponseConstants.TEXT_INPUT_CONSTANTS.equals(str)) {
            this.mTextInputConstantsList = BaseModel.parseArray(jsonParser, TextInputConstants.class);
            return true;
        } else if (ResponseConstants.CHANNEL_CONSTANTS.equals(str)) {
            this.mChannelEditConstantsList = BaseModel.parseArray(jsonParser, ChannelEditConstants.class);
            return true;
        } else if (ResponseConstants.CUSTOM_VARIATION_PROPERTY_IDS.equals(str)) {
            this.mCustomVariationPropertyIds = BaseModel.parseEtsyIdArray(jsonParser);
            return true;
        } else if (!ResponseConstants.CATEGORY_MINIMUM_LEVEL.equals(str)) {
            return false;
        } else {
            this.mCategoryMinimumLevel = jsonParser.getValueAsInt();
            return true;
        }
    }

    public TextInputConstants textInputConstantsForFieldType(String str) {
        int size = this.mTextInputConstantsList.size();
        for (int i = 0; i < size; i++) {
            TextInputConstants textInputConstants = this.mTextInputConstantsList.get(i);
            if (str.equals(textInputConstants.getFieldType())) {
                return textInputConstants;
            }
        }
        return null;
    }
}
