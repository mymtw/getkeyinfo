package com.etsy.android.lib.models.apiv3.editable;

import android.text.TextUtils;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.util.regex.Pattern;

public class TextInputConstants extends BaseFieldModel {
    public static final String FIELD_TYPE_SKU = "sku";
    public static final String FIELD_TYPE_VARIATION_OPTION = "variation_option";
    public static final String FIELD_TYPE_VARIATION_PROPERTY = "variation_property";
    private static final long serialVersionUID = 4149124512607310315L;
    public boolean mDidCompileInvalidCharactersPattern;
    public String mFieldType = "";
    public String mInvalidCharacters;
    public Pattern mInvalidCharactersPattern;
    public int mMaximumCharactersAllowed;
    public int mMinimumCharactersAllowed;

    public String getFieldType() {
        return this.mFieldType;
    }

    public Pattern getInvalidCharactersPattern() {
        if (TextUtils.isEmpty(this.mInvalidCharacters)) {
            return null;
        }
        if (this.mInvalidCharactersPattern == null && !this.mDidCompileInvalidCharactersPattern) {
            this.mDidCompileInvalidCharactersPattern = true;
            try {
                this.mInvalidCharactersPattern = Pattern.compile(this.mInvalidCharacters);
            } catch (Throwable unused) {
            }
        }
        return this.mInvalidCharactersPattern;
    }

    public int getMaximumCharactersAllowed() {
        return this.mMaximumCharactersAllowed;
    }

    public int getMinimumCharactersAllowed() {
        return this.mMinimumCharactersAllowed;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if (ResponseConstants.MINIMUM_CHARACTERS.equals(str)) {
            this.mMinimumCharactersAllowed = jsonParser.getValueAsInt();
            return true;
        } else if (ResponseConstants.MAXIMUM_CHARACTERS.equals(str)) {
            this.mMaximumCharactersAllowed = jsonParser.getValueAsInt();
            return true;
        } else if (ResponseConstants.INVALID_CHARACTERS_PATTERN.equals(str)) {
            this.mInvalidCharacters = BaseModel.parseString(jsonParser);
            return true;
        } else if (!ResponseConstants.FIELD_TYPE.equals(str)) {
            return true;
        } else {
            this.mFieldType = BaseModel.parseString(jsonParser);
            return false;
        }
    }
}
