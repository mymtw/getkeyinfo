package com.etsy.android.lib.models.apiv3.vespa;

import android.support.p013v4.media.C0073e;
import com.etsy.android.R;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class DeeplinkTableRow extends BaseFieldModel {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String ITEM_TYPE = "deepLinkTableRow";
    public String link;
    public String text;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getLink() {
        String str = this.link;
        if (str != null) {
            return str;
        }
        C19383o.m32805o(ResponseConstants.LINK);
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

    public Map<AnalyticsProperty, Object> getTrackingParameters() {
        return C19294b0.m32561r0(new Pair(PredefinedAnalyticsProperty.DEEP_LINK_ROW, getText()), new Pair(PredefinedAnalyticsProperty.DEEP_LINK_ROW_URL, getLink()));
    }

    public int getViewType() {
        return R.id.view_type_deep_link_table_row;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        if (C0073e.m214n(jsonParser, "jp", str, "fieldName", str, "text")) {
            setText(BaseModel.Companion.parseString(jsonParser));
            return true;
        } else if (!C19383o.m32792b(str, ResponseConstants.LINK)) {
            return false;
        } else {
            setLink(BaseModel.Companion.parseString(jsonParser));
            return true;
        }
    }

    public final void setLink(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.link = str;
    }

    public final void setText(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.text = str;
    }

    public void setTrackingParameters(Map<AnalyticsProperty, Object> map) {
    }
}
