package com.etsy.android.search.savedsearch;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
public final class SavedSearchRequestBody {

    /* renamed from: a */
    public final String f19803a;

    /* renamed from: b */
    public final Map<String, String> f19804b;

    /* renamed from: c */
    public final List<String> f19805c;

    /* renamed from: d */
    public final Integer f19806d;

    public SavedSearchRequestBody() {
        this((String) null, (Map) null, (List) null, (Integer) null, 15, (DefaultConstructorMarker) null);
    }

    public SavedSearchRequestBody(@C17402n(name = "query") String str, @C17402n(name = "filters") Map<String, String> map, @C17402n(name = "results") List<String> list, @C17402n(name = "total_results_count") Integer num) {
        this.f19803a = str;
        this.f19804b = map;
        this.f19805c = list;
        this.f19806d = num;
    }

    public final SavedSearchRequestBody copy(@C17402n(name = "query") String str, @C17402n(name = "filters") Map<String, String> map, @C17402n(name = "results") List<String> list, @C17402n(name = "total_results_count") Integer num) {
        return new SavedSearchRequestBody(str, map, list, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavedSearchRequestBody)) {
            return false;
        }
        SavedSearchRequestBody savedSearchRequestBody = (SavedSearchRequestBody) obj;
        return C19383o.m32792b(this.f19803a, savedSearchRequestBody.f19803a) && C19383o.m32792b(this.f19804b, savedSearchRequestBody.f19804b) && C19383o.m32792b(this.f19805c, savedSearchRequestBody.f19805c) && C19383o.m32792b(this.f19806d, savedSearchRequestBody.f19806d);
    }

    public final int hashCode() {
        String str = this.f19803a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, String> map = this.f19804b;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        List<String> list = this.f19805c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.f19806d;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SavedSearchRequestBody(query=");
        h.append(this.f19803a);
        h.append(", filters=");
        h.append(this.f19804b);
        h.append(", results=");
        h.append(this.f19805c);
        h.append(", totalResultsCount=");
        return C0023f.m109j(h, this.f19806d, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SavedSearchRequestBody(String str, Map map, List list, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : num);
    }
}
