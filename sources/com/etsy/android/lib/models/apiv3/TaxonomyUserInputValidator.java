package com.etsy.android.lib.models.apiv3;

import android.text.TextUtils;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.editable.EditableListing;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TaxonomyUserInputValidator extends BaseFieldModel {
    public static final String VALIDATOR_TYPE_FLOAT = "DataType_Float";
    public static final String VALIDATOR_TYPE_INT = "DataType_Int";
    public static final String VALIDATOR_TYPE_MEASUREMENT = "DataType_OTT_Measurement";
    public static final String VALIDATOR_TYPE_STRING = "DataType_String";
    private static final long serialVersionUID = 3779762565777375785L;
    public String mMax = "";
    public String mMin = "";
    public TaxonomyValueScale mMinMaxScale;
    public List<ValueScaleBounds> mScaleBounds;
    public List<TaxonomyValueScale> mScales = new ArrayList(0);
    public String mType = VALIDATOR_TYPE_STRING;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ValidatorType {
    }

    public static class ValueScaleBounds extends BaseFieldModel {
        public static final BigDecimal NO_VALUE = new BigDecimal(EditableListing.LISTING_ID_DEVICE_DRAFT);
        public String mMax = "";
        public BigDecimal mMaxValue;
        public String mMin = "";
        public BigDecimal mMinValue;
        public EtsyId mScaleId = new EtsyId();

        private static BigDecimal createValue(String str) {
            if (TextUtils.isEmpty(str)) {
                return NO_VALUE;
            }
            try {
                return new BigDecimal(str);
            } catch (Throwable unused) {
                return NO_VALUE;
            }
        }

        public BigDecimal getMinValue() {
            if (this.mMinValue == null) {
                this.mMinValue = createValue(this.mMin);
            }
            return this.mMinValue;
        }

        public EtsyId getScaleId() {
            return this.mScaleId;
        }

        public boolean parseField(JsonParser jsonParser, String str) throws IOException {
            if (ResponseConstants.SCALE_ID_CAMELCASE.equals(str)) {
                this.mScaleId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                return true;
            } else if (ResponseConstants.MIN.equals(str)) {
                this.mMin = BaseModel.parseString(jsonParser);
                return true;
            } else if (!ResponseConstants.MAX.equals(str)) {
                return false;
            } else {
                this.mMax = BaseModel.parseString(jsonParser);
                return true;
            }
        }
    }

    private static String validatorTypeForString(String str) {
        return VALIDATOR_TYPE_FLOAT.equalsIgnoreCase(str) ? VALIDATOR_TYPE_FLOAT : VALIDATOR_TYPE_INT.equalsIgnoreCase(str) ? VALIDATOR_TYPE_INT : VALIDATOR_TYPE_MEASUREMENT.equalsIgnoreCase(str) ? VALIDATOR_TYPE_MEASUREMENT : VALIDATOR_TYPE_STRING;
    }

    public List<TaxonomyValueScale> getScales() {
        return this.mScales;
    }

    public String getType() {
        return this.mType;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1311224673:
                if (str.equals(ResponseConstants.SCALE_BOUNDS_CAMELCASE)) {
                    c = 0;
                    break;
                }
                break;
            case -908189591:
                if (str.equals(ResponseConstants.SCALES)) {
                    c = 1;
                    break;
                }
                break;
            case 107876:
                if (str.equals(ResponseConstants.MAX)) {
                    c = 2;
                    break;
                }
                break;
            case 108114:
                if (str.equals(ResponseConstants.MIN)) {
                    c = 3;
                    break;
                }
                break;
            case 3575610:
                if (str.equals("type")) {
                    c = 4;
                    break;
                }
                break;
            case 1751370424:
                if (str.equals(ResponseConstants.MIN_MAX_SCALE)) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.mScaleBounds = BaseModel.parseArray(jsonParser, ValueScaleBounds.class);
                return true;
            case 1:
                this.mScales = BaseModel.parseArray(jsonParser, TaxonomyValueScale.class);
                return true;
            case 2:
                this.mMax = BaseModel.parseString(jsonParser);
                return true;
            case 3:
                this.mMin = BaseModel.parseString(jsonParser);
                return true;
            case 4:
                this.mType = validatorTypeForString(BaseModel.parseString(jsonParser));
                return true;
            case 5:
                this.mMinMaxScale = (TaxonomyValueScale) BaseModel.parseObject(jsonParser, TaxonomyValueScale.class);
                return true;
            default:
                return false;
        }
    }
}
