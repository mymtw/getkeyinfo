package com.etsy.android.lib.models.apiv3.vespa;

import android.support.p013v4.media.C0072d;
import com.etsy.android.R;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.fasterxml.jackson.core.JsonParser;
import java.util.Map;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class SavableSearchQuery extends BaseFieldModel {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final transient String DISPLAY_FILTERS_FIELD_NAME = "filters_display_value";
    public static final transient String FILTERS_FIELD_NAME = "filters";
    public static final transient String IS_FAVORITE_FIELD_NAME = "is_favorite";
    public static final String QUERY_FIELD_NAME = "query";
    public static final transient String SAVED_SEARCH_ID_FIELD_NAME = "saved_search_id";
    public static final transient String TYPE_FIELD_NAME = "type";
    private Map<String, String> filters = C19294b0.m32559p0();
    private String filtersDisplayValue = "";
    private boolean isFavorite;
    private String query = "";
    private long savedSearchId = -1;
    private SavableSearchQueryType type = SavableSearchQueryType.RECENT;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final Map<String, String> getFilters() {
        return this.filters;
    }

    public final String getFiltersDisplayValue() {
        return this.filtersDisplayValue;
    }

    public final String getQuery() {
        return this.query;
    }

    public final long getSavedSearchId() {
        return this.savedSearchId;
    }

    public final SavableSearchQueryType getType() {
        return this.type;
    }

    public int getViewType() {
        return R.id.view_type_savable_search_query;
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        switch (C0072d.m197c(jsonParser, "jp", str, "fieldName")) {
            case -854547461:
                if (str.equals("filters")) {
                    SavableSearchQuery$parseField$valueMapper$1 savableSearchQuery$parseField$valueMapper$1 = new SavableSearchQuery$parseField$valueMapper$1();
                    BaseModel.Companion companion = BaseModel.Companion;
                    this.filters = companion.parseMap(jsonParser, companion.defaultKeyMapper(), savableSearchQuery$parseField$valueMapper$1);
                    return true;
                }
                break;
            case -103066000:
                if (str.equals(DISPLAY_FILTERS_FIELD_NAME)) {
                    this.filtersDisplayValue = BaseModel.Companion.parseString(jsonParser);
                    return true;
                }
                break;
            case 3575610:
                if (str.equals("type")) {
                    String parseString = BaseModel.Companion.parseString(jsonParser);
                    SavableSearchQueryType savableSearchQueryType = SavableSearchQueryType.SAVED;
                    if (C19383o.m32792b(parseString, savableSearchQueryType.getKey())) {
                        this.type = savableSearchQueryType;
                        return true;
                    }
                    SavableSearchQueryType savableSearchQueryType2 = SavableSearchQueryType.RECENT;
                    if (!C19383o.m32792b(parseString, savableSearchQueryType2.getKey())) {
                        return true;
                    }
                    this.type = savableSearchQueryType2;
                    return true;
                }
                break;
            case 107944136:
                if (str.equals("query")) {
                    this.query = BaseModel.Companion.parseString(jsonParser);
                    return true;
                }
                break;
            case 315759889:
                if (str.equals("is_favorite")) {
                    this.isFavorite = jsonParser.getValueAsBoolean();
                    return true;
                }
                break;
            case 648640346:
                if (str.equals(SAVED_SEARCH_ID_FIELD_NAME)) {
                    this.savedSearchId = jsonParser.getLongValue();
                    return true;
                }
                break;
        }
        return false;
    }

    public final void setFavorite(boolean z) {
        this.isFavorite = z;
    }

    public final void setFilters(Map<String, String> map) {
        C19383o.m32797g(map, "<set-?>");
        this.filters = map;
    }

    public final void setFiltersDisplayValue(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.filtersDisplayValue = str;
    }

    public final void setQuery(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.query = str;
    }

    public final void setSavedSearchId(long j) {
        this.savedSearchId = j;
    }

    public final void setType(SavableSearchQueryType savableSearchQueryType) {
        C19383o.m32797g(savableSearchQueryType, "<set-?>");
        this.type = savableSearchQueryType;
    }
}
