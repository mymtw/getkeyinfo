package com.etsy.android.lib.models.apiv3;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;

@C17403o(generateAdapter = true)
public final class SearchImpressionsLog {
    public static final int $stable = 8;
    private final List<String> displayLocations;
    private final List<String> impressionsData;
    private final List<String> loggingKeys;

    public SearchImpressionsLog(@C17402n(name = "display_locs") List<String> list, @C17402n(name = "logging_keys") List<String> list2, @C17402n(name = "impressions_data") List<String> list3) {
        C19383o.m32797g(list, "displayLocations");
        C19383o.m32797g(list2, "loggingKeys");
        C19383o.m32797g(list3, "impressionsData");
        this.displayLocations = list;
        this.loggingKeys = list2;
        this.impressionsData = list3;
    }

    public static /* synthetic */ SearchImpressionsLog copy$default(SearchImpressionsLog searchImpressionsLog, List<String> list, List<String> list2, List<String> list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = searchImpressionsLog.displayLocations;
        }
        if ((i & 2) != 0) {
            list2 = searchImpressionsLog.loggingKeys;
        }
        if ((i & 4) != 0) {
            list3 = searchImpressionsLog.impressionsData;
        }
        return searchImpressionsLog.copy(list, list2, list3);
    }

    public final List<String> component1() {
        return this.displayLocations;
    }

    public final List<String> component2() {
        return this.loggingKeys;
    }

    public final List<String> component3() {
        return this.impressionsData;
    }

    public final SearchImpressionsLog copy(@C17402n(name = "display_locs") List<String> list, @C17402n(name = "logging_keys") List<String> list2, @C17402n(name = "impressions_data") List<String> list3) {
        C19383o.m32797g(list, "displayLocations");
        C19383o.m32797g(list2, "loggingKeys");
        C19383o.m32797g(list3, "impressionsData");
        return new SearchImpressionsLog(list, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchImpressionsLog)) {
            return false;
        }
        SearchImpressionsLog searchImpressionsLog = (SearchImpressionsLog) obj;
        return C19383o.m32792b(this.displayLocations, searchImpressionsLog.displayLocations) && C19383o.m32792b(this.loggingKeys, searchImpressionsLog.loggingKeys) && C19383o.m32792b(this.impressionsData, searchImpressionsLog.impressionsData);
    }

    public final List<String> getDisplayLocations() {
        return this.displayLocations;
    }

    public final List<String> getImpressionsData() {
        return this.impressionsData;
    }

    public final List<String> getLoggingKeys() {
        return this.loggingKeys;
    }

    public int hashCode() {
        return this.impressionsData.hashCode() + C13983i.m21488g(this.loggingKeys, this.displayLocations.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("SearchImpressionsLog(displayLocations=");
        h.append(this.displayLocations);
        h.append(", loggingKeys=");
        h.append(this.loggingKeys);
        h.append(", impressionsData=");
        return C0070b.m186i(h, this.impressionsData, ')');
    }
}
