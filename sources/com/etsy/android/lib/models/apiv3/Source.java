package com.etsy.android.lib.models.apiv3;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class Source {
    public static final int $stable = 0;
    private final String format;
    private final String type;
    private final String url;

    public Source(String str, String str2, String str3) {
        this.format = str;
        this.type = str2;
        this.url = str3;
    }

    public static /* synthetic */ Source copy$default(Source source, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = source.format;
        }
        if ((i & 2) != 0) {
            str2 = source.type;
        }
        if ((i & 4) != 0) {
            str3 = source.url;
        }
        return source.copy(str, str2, str3);
    }

    public final String component1() {
        return this.format;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.url;
    }

    public final Source copy(String str, String str2, String str3) {
        return new Source(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Source)) {
            return false;
        }
        Source source = (Source) obj;
        return C19383o.m32792b(this.format, source.format) && C19383o.m32792b(this.type, source.type) && C19383o.m32792b(this.url, source.url);
    }

    public final String getFormat() {
        return this.format;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.format;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("Source(format=");
        h.append(this.format);
        h.append(", type=");
        h.append(this.type);
        h.append(", url=");
        return C0391c.m1057c(h, this.url, ')');
    }
}
