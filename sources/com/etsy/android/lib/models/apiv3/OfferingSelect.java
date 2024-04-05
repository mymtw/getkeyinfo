package com.etsy.android.lib.models.apiv3;

import android.text.TextUtils;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OfferingSelect extends BaseFieldModel {
    private static final long serialVersionUID = 8919511967344739540L;
    public OfferingOption mDefaultOption;
    public boolean mEnabled;
    public String mErrorText = "";
    public boolean mIsError = false;
    public String mLabel = "";
    public List<OfferingOption> mOptions = new ArrayList();
    public String mPrompt = "";
    public EtsyId mPropertyId = new EtsyId();

    @Deprecated
    public OfferingOption getDefaultOption() {
        return this.mDefaultOption;
    }

    public String getLabel() {
        return this.mLabel;
    }

    public List<OfferingOption> getOptions() {
        return this.mOptions;
    }

    public String getPrompt() {
        return (!this.mIsError || TextUtils.isEmpty(this.mErrorText)) ? this.mPrompt : this.mErrorText;
    }

    public EtsyId getPropertyId() {
        return this.mPropertyId;
    }

    public OfferingOption getSelectedOption() {
        for (OfferingOption next : this.mOptions) {
            if (next.isSelected()) {
                return next;
            }
        }
        return null;
    }

    public int getSelectedOptionIndex() {
        for (int i = 0; i < this.mOptions.size(); i++) {
            if (this.mOptions.get(i).isSelected()) {
                return i;
            }
        }
        return -1;
    }

    public boolean hasSelectedOption() {
        return getSelectedOption() != null;
    }

    public boolean isEnabled() {
        return this.mEnabled;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1609594047:
                if (str.equals(ResponseConstants.ENABLED)) {
                    c = 0;
                    break;
                }
                break;
            case -1249474914:
                if (str.equals(ResponseConstants.OPTIONS)) {
                    c = 1;
                    break;
                }
                break;
            case -979805852:
                if (str.equals(ResponseConstants.PROMPT)) {
                    c = 2;
                    break;
                }
                break;
            case 96784904:
                if (str.equals("error")) {
                    c = 3;
                    break;
                }
                break;
            case 102727412:
                if (str.equals(ResponseConstants.LABEL)) {
                    c = 4;
                    break;
                }
                break;
            case 1357596613:
                if (str.equals("property_id")) {
                    c = 5;
                    break;
                }
                break;
            case 1636184324:
                if (str.equals(ResponseConstants.ERROR_TEXT)) {
                    c = 6;
                    break;
                }
                break;
            case 2037797939:
                if (str.equals(ResponseConstants.DEFAULT_OPTION)) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.mEnabled = jsonParser.getValueAsBoolean();
                break;
            case 1:
                this.mOptions = BaseModel.parseArray(jsonParser, OfferingOption.class);
                break;
            case 2:
                this.mPrompt = BaseModel.parseString(jsonParser);
                break;
            case 3:
                this.mIsError = jsonParser.getValueAsBoolean();
                break;
            case 4:
                this.mLabel = BaseModel.parseString(jsonParser);
                break;
            case 5:
                this.mPropertyId = new EtsyId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                break;
            case 6:
                this.mErrorText = BaseModel.parseString(jsonParser);
                break;
            case 7:
                this.mDefaultOption = (OfferingOption) BaseModel.parseObject(jsonParser, OfferingOption.class);
                break;
            default:
                return false;
        }
        return true;
    }

    public void setEnabled(boolean z) {
        this.mEnabled = z;
    }

    public void setErrorText(String str) {
        this.mErrorText = str;
    }

    public void setIsError(boolean z) {
        this.mIsError = z;
    }

    public void setLabel(String str) {
        this.mLabel = str;
    }

    public void setOptions(List<OfferingOption> list) {
        this.mOptions = list;
    }

    public void setPrompt(String str) {
        this.mPrompt = str;
    }
}
