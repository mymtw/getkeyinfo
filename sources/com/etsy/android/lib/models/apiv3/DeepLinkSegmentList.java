package com.etsy.android.lib.models.apiv3;

import android.support.p013v4.media.C0073e;
import com.etsy.android.R;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class DeepLinkSegmentList extends BaseFieldModel implements ILinkCollection {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final long serialVersionUID = 9220968466583979633L;
    private int numberOfRows = 1;
    private List<Segment> segments = new ArrayList();
    private String title = "";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public List<ILink> getLinks() {
        return this.segments;
    }

    public int getNumberOfRows() {
        return this.numberOfRows;
    }

    public String getTitle() {
        return this.title;
    }

    public int getViewType() {
        return R.id.view_type_deep_link_segment_list;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        if (C0073e.m214n(jsonParser, "jp", str, "fieldName", ResponseConstants.SEGMENTS, str)) {
            this.segments = BaseModel.Companion.parseArray(jsonParser, Segment.class);
            return true;
        } else if (C19383o.m32792b(ResponseConstants.NUMBER_OF_ROWS, str)) {
            this.numberOfRows = jsonParser.getIntValue();
            return true;
        } else if (!C19383o.m32792b("title", str)) {
            return false;
        } else {
            this.title = BaseModel.Companion.parseString(jsonParser);
            return true;
        }
    }
}
