package com.etsy.android.lib.models.apiv3.vespa;

import android.support.p013v4.media.C0072d;
import com.etsy.android.R;
import com.etsy.android.lib.models.BaseBackgroundColorFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import kotlin.jvm.internal.C19383o;

public final class SizeableText extends BaseBackgroundColorFieldModel {
    public static final int $stable = 8;
    private final SizeableTextPadding paddingBottom = new SizeableTextPadding(0);
    private final SizeableTextPadding paddingTop = new SizeableTextPadding(0);
    public SizeableTextSize size;
    public String text;

    public final SizeableTextPadding getPaddingBottom() {
        return this.paddingBottom;
    }

    public final SizeableTextPadding getPaddingTop() {
        return this.paddingTop;
    }

    public final SizeableTextSize getSize() {
        SizeableTextSize sizeableTextSize = this.size;
        if (sizeableTextSize != null) {
            return sizeableTextSize;
        }
        C19383o.m32805o(ResponseConstants.SIZE);
        throw null;
    }

    public final String getText() {
        String str = this.text;
        if (str != null) {
            return str;
        }
        C19383o.m32805o("text");
        throw null;
    }

    public int getViewType() {
        return R.id.view_type_sizeable_text;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        switch (C0072d.m197c(jsonParser, "jp", str, "fieldName")) {
            case -1500595161:
                if (str.equals(ResponseConstants.PADDING_TOP)) {
                    this.paddingTop.setValue(jsonParser.getValueAsInt());
                    return true;
                }
                break;
            case 3530753:
                if (str.equals(ResponseConstants.SIZE)) {
                    SizeableTextSize sizeableTextSize = new SizeableTextSize();
                    String valueAsString = jsonParser.getValueAsString();
                    if (valueAsString == null) {
                        valueAsString = "";
                    }
                    sizeableTextSize.setValue(valueAsString);
                    setSize(sizeableTextSize);
                    return true;
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    setText(BaseModel.Companion.parseString(jsonParser));
                    return true;
                }
                break;
            case 1569052185:
                if (str.equals(ResponseConstants.PADDING_BOTTOM)) {
                    this.paddingBottom.setValue(jsonParser.getValueAsInt());
                    return true;
                }
                break;
        }
        return false;
    }

    public final void setSize(SizeableTextSize sizeableTextSize) {
        C19383o.m32797g(sizeableTextSize, "<set-?>");
        this.size = sizeableTextSize;
    }

    public final void setText(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.text = str;
    }
}
