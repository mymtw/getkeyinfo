package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import com.google.android.play.core.assetpacks.C15588c1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TaxonomyValueScale extends BaseFieldModel {
    private static final long serialVersionUID = -5679380391184869541L;
    public boolean mActive;
    public String mDescription = "";
    public String mDisplayName = "";
    public String mEtsywebUnit = "";
    public String mFormat = "";
    public EtsyId mId = new EtsyId();
    public List<Integer> mLegacyScale = new ArrayList(0);
    public EtsyId mLegacyScaleId = new EtsyId();
    public int mOrder;
    public String mVersion = "";

    public String getDisplayName() {
        return this.mDisplayName;
    }

    public String getFormat() {
        return this.mFormat;
    }

    public EtsyId getId() {
        if (this.mId.hasId()) {
            return this.mId;
        }
        if (!this.mLegacyScaleId.hasId() && C15588c1.m25338o0(this.mLegacyScale)) {
            this.mLegacyScaleId.setId(Integer.toString(this.mLegacyScale.get(0).intValue()));
        }
        return this.mLegacyScaleId;
    }

    public int getOrder() {
        return this.mOrder;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if (ResponseConstants.LEGACY_SCALE.equals(str)) {
            this.mLegacyScale = BaseModel.parseIntArray(jsonParser);
            return true;
        } else if ("id".equals(str)) {
            this.mId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
            return true;
        } else if (ResponseConstants.ETSYWEB_UNIT.equals(str)) {
            this.mEtsywebUnit = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.VERSION.equals(str)) {
            this.mVersion = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.DISPLAY_NAME_CAMELCASE.equals(str)) {
            this.mDisplayName = BaseModel.parseString(jsonParser);
            return true;
        } else if ("description".equals(str)) {
            this.mDescription = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.ORDER.equals(str)) {
            this.mOrder = jsonParser.getValueAsInt();
            return true;
        } else if ("active".equals(str)) {
            this.mActive = jsonParser.getValueAsBoolean();
            return true;
        } else if (!ResponseConstants.FORMAT.equals(str)) {
            return false;
        } else {
            this.mFormat = BaseModel.parseString(jsonParser);
            return true;
        }
    }

    public void setDisplayName(String str) {
        this.mDisplayName = str;
    }

    public void setScaleId(EtsyId etsyId) {
        this.mId = etsyId;
    }
}
