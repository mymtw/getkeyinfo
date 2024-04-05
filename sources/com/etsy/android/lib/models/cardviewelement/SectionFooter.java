package com.etsy.android.lib.models.cardviewelement;

import android.support.p013v4.media.C0073e;
import com.etsy.android.R;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.fasterxml.jackson.core.JsonParser;

public final class SectionFooter extends BaseFieldModel {
    public static final int $stable = 8;
    private TooltipButton tooltipButton;

    public final TooltipButton getTooltipButton() {
        return this.tooltipButton;
    }

    public int getViewType() {
        return R.id.view_type_section_footer;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        if (!C0073e.m214n(jsonParser, "parser", str, "fieldName", "tooltip_button", str)) {
            return false;
        }
        this.tooltipButton = (TooltipButton) BaseModel.Companion.parseObject(jsonParser, TooltipButton.class);
        return true;
    }
}
