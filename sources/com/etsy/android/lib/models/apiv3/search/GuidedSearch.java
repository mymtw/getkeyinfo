package com.etsy.android.lib.models.apiv3.search;

import android.support.p013v4.media.C0073e;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.fasterxml.jackson.core.JsonParser;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class GuidedSearch extends BaseFieldModel {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final transient String REFORMULATIONS = "reformulations";
    public List<QueryReformulation> queryReformulations;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final List<QueryReformulation> getQueryReformulations() {
        List<QueryReformulation> list = this.queryReformulations;
        if (list != null) {
            return list;
        }
        C19383o.m32805o("queryReformulations");
        throw null;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        if (!C0073e.m214n(jsonParser, "jp", str, "fieldName", str, REFORMULATIONS)) {
            return false;
        }
        setQueryReformulations(BaseModel.Companion.parseArray(jsonParser, QueryReformulation.class));
        return true;
    }

    public final void setQueryReformulations(List<QueryReformulation> list) {
        C19383o.m32797g(list, "<set-?>");
        this.queryReformulations = list;
    }
}
