package com.etsy.android.lib.models.apiv3.search;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class Query {
    public static final int $stable = 0;
    private final String query;

    public Query(String str) {
        C19383o.m32797g(str, "query");
        this.query = str;
    }

    public static /* synthetic */ Query copy$default(Query query2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = query2.query;
        }
        return query2.copy(str);
    }

    public final String component1() {
        return this.query;
    }

    public final Query copy(String str) {
        C19383o.m32797g(str, "query");
        return new Query(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Query) && C19383o.m32792b(this.query, ((Query) obj).query);
    }

    public final String getQuery() {
        return this.query;
    }

    public int hashCode() {
        return this.query.hashCode();
    }

    public String toString() {
        return C0391c.m1057c(C0072d.m201h("Query(query="), this.query, ')');
    }
}
