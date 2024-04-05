package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class StructuredPolicyPrivacy {
    public static final int $stable = 8;
    private final String header;
    private final List<String> order;

    public StructuredPolicyPrivacy(@C17402n(name = "header") String str, @C17402n(name = "order") List<String> list) {
        this.header = str;
        this.order = list;
    }

    public static /* synthetic */ StructuredPolicyPrivacy copy$default(StructuredPolicyPrivacy structuredPolicyPrivacy, String str, List<String> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = structuredPolicyPrivacy.header;
        }
        if ((i & 2) != 0) {
            list = structuredPolicyPrivacy.order;
        }
        return structuredPolicyPrivacy.copy(str, list);
    }

    public final String component1() {
        return this.header;
    }

    public final List<String> component2() {
        return this.order;
    }

    public final StructuredPolicyPrivacy copy(@C17402n(name = "header") String str, @C17402n(name = "order") List<String> list) {
        return new StructuredPolicyPrivacy(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StructuredPolicyPrivacy)) {
            return false;
        }
        StructuredPolicyPrivacy structuredPolicyPrivacy = (StructuredPolicyPrivacy) obj;
        return C19383o.m32792b(this.header, structuredPolicyPrivacy.header) && C19383o.m32792b(this.order, structuredPolicyPrivacy.order);
    }

    public final String getHeader() {
        return this.header;
    }

    public final List<String> getOrder() {
        return this.order;
    }

    public int hashCode() {
        String str = this.header;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.order;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("StructuredPolicyPrivacy(header=");
        h.append(this.header);
        h.append(", order=");
        return C0070b.m186i(h, this.order, ')');
    }
}
