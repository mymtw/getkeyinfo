package com.etsy.android.lib.models.cardviewelement;

import android.support.p013v4.media.C0073e;
import com.etsy.android.R;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.interfaces.IServerDrivenAction;
import com.etsy.android.vespa.IVespaListSectionHeader;
import com.fasterxml.jackson.core.JsonParser;
import java.util.List;
import kotlin.jvm.internal.C19383o;

public final class SectionHeaderCard extends BaseFieldModel implements IVespaListSectionHeader {
    public static final int $stable = 8;
    private String subtitle;
    private String title;

    public /* bridge */ /* synthetic */ IServerDrivenAction getAction() {
        return null;
    }

    public /* bridge */ /* synthetic */ IPageLink getPageLink() {
        return null;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public String getTitle() {
        return this.title;
    }

    public /* bridge */ /* synthetic */ List getViewStyles() {
        return null;
    }

    public int getViewType() {
        return R.id.view_type_section_header_card;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        if (C0073e.m214n(jsonParser, "jp", str, "fieldName", str, "title")) {
            this.title = BaseModel.Companion.parseString(jsonParser);
            return true;
        } else if (!C19383o.m32792b(str, "subtitle")) {
            return false;
        } else {
            this.subtitle = BaseModel.Companion.parseString(jsonParser);
            return true;
        }
    }

    public void setSubtitle(String str) {
        this.subtitle = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
