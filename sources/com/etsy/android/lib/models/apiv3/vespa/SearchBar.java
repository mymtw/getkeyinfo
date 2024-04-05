package com.etsy.android.lib.models.apiv3.vespa;

import android.support.p013v4.media.C0073e;
import com.etsy.android.R;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import kotlin.jvm.internal.C19383o;
import p415of.C13188q;
import p415of.C13191t;

public final class SearchBar extends BaseFieldModel implements C13188q {
    public static final int $stable = 8;
    public String hint;
    private transient C13191t metadataProvider;
    public String searchType;

    public final String getHint() {
        String str = this.hint;
        if (str != null) {
            return str;
        }
        C19383o.m32805o(ResponseConstants.HINT);
        throw null;
    }

    public final C13191t getMetadataProvider() {
        return this.metadataProvider;
    }

    public final String getSearchType() {
        String str = this.searchType;
        if (str != null) {
            return str;
        }
        C19383o.m32805o("searchType");
        throw null;
    }

    public int getViewType() {
        return R.id.view_type_search_bar;
    }

    public void injectMetadataProvider(C13191t tVar) {
        C19383o.m32797g(tVar, "provider");
        this.metadataProvider = tVar;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        if (C0073e.m214n(jsonParser, "jp", str, "fieldName", str, ResponseConstants.PLACEHOLDER_TEXT)) {
            setHint(BaseModel.Companion.parseString(jsonParser));
            return true;
        } else if (!C19383o.m32792b(str, ResponseConstants.SEARCH_TYPE)) {
            return false;
        } else {
            setSearchType(BaseModel.Companion.parseString(jsonParser));
            return true;
        }
    }

    public final void setHint(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.hint = str;
    }

    public final void setMetadataProvider(C13191t tVar) {
        this.metadataProvider = tVar;
    }

    public final void setSearchType(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.searchType = str;
    }
}
