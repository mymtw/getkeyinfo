package com.etsy.android.search.savedsearch;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class SaveSearchPutResponse {

    /* renamed from: a */
    public Long f19802a;

    public SaveSearchPutResponse() {
        this((Long) null, 1, (DefaultConstructorMarker) null);
    }

    public SaveSearchPutResponse(@C17402n(name = "saved_search_id") Long l) {
        this.f19802a = l;
    }

    public final SaveSearchPutResponse copy(@C17402n(name = "saved_search_id") Long l) {
        return new SaveSearchPutResponse(l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SaveSearchPutResponse) && C19383o.m32792b(this.f19802a, ((SaveSearchPutResponse) obj).f19802a);
    }

    public final int hashCode() {
        Long l = this.f19802a;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SaveSearchPutResponse(savedSearchId=");
        h.append(this.f19802a);
        h.append(')');
        return h.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SaveSearchPutResponse(Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l);
    }
}
