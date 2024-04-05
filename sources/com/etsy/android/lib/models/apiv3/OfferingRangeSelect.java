package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.util.ArrayList;

public class OfferingRangeSelect extends BaseFieldModel {
    private static final int VALUE_NONE = Integer.MIN_VALUE;
    private static final long serialVersionUID = 4341903889029328019L;
    public boolean mEnabled;
    public String mLabel = "";
    public int mMax;
    public int mMin;
    public int mSelectedValue = Integer.MIN_VALUE;
    public int mStep;

    public Integer[] getIntegerSequence() {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        int i3 = this.mMin;
        int i4 = this.mMax;
        if (i3 <= i4 && (i = this.mStep) >= 0 && (i > 0 || i3 == i4)) {
            while (true) {
                i2 = this.mMax;
                if (i3 >= i2) {
                    break;
                }
                arrayList.add(Integer.valueOf(i3));
                i3 += this.mStep;
            }
            arrayList.add(Integer.valueOf(i2));
        }
        return (Integer[]) arrayList.toArray(new Integer[arrayList.size()]);
    }

    public String getLabel() {
        return this.mLabel;
    }

    public int getMax() {
        return this.mMax;
    }

    public int getMin() {
        return this.mMin;
    }

    public int getSelectedValue() {
        return this.mSelectedValue;
    }

    public int getStep() {
        return this.mStep;
    }

    public boolean hasSelectedValue() {
        return this.mSelectedValue != Integer.MIN_VALUE;
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
            case 107876:
                if (str.equals(ResponseConstants.MAX)) {
                    c = 1;
                    break;
                }
                break;
            case 108114:
                if (str.equals(ResponseConstants.MIN)) {
                    c = 2;
                    break;
                }
                break;
            case 3540684:
                if (str.equals(ResponseConstants.STEP)) {
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
            case 1191572123:
                if (str.equals(ResponseConstants.SELECTED)) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.mEnabled = jsonParser.getValueAsBoolean();
                break;
            case 1:
                this.mMax = jsonParser.getValueAsInt();
                break;
            case 2:
                this.mMin = jsonParser.getValueAsInt();
                break;
            case 3:
                this.mStep = jsonParser.getValueAsInt();
                break;
            case 4:
                this.mLabel = BaseModel.parseString(jsonParser);
                break;
            case 5:
                this.mSelectedValue = jsonParser.getValueAsInt(Integer.MIN_VALUE);
                break;
            default:
                return false;
        }
        return true;
    }

    public void setEnabled(boolean z) {
        this.mEnabled = z;
    }

    public void setLabel(String str) {
        this.mLabel = str;
    }

    public void setMax(int i) {
        this.mMax = i;
    }

    public void setMin(int i) {
        this.mMin = i;
    }

    public void setSelectedValue(int i) {
        this.mSelectedValue = i;
    }

    public void setStep(int i) {
        this.mStep = i;
    }
}
