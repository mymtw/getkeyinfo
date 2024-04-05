package com.etsy.android.p327ui.user.review;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p010a9.C0048b;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.user.review.Source */
public final class Source {

    /* renamed from: a */
    public final String f26039a;

    /* renamed from: b */
    public final String f26040b;

    /* renamed from: c */
    public final String f26041c;

    public Source(@C17402n(name = "format") String str, @C17402n(name = "type") String str2, @C17402n(name = "url") String str3) {
        C0048b.m167f(str, ResponseConstants.FORMAT, str2, "type", str3, "url");
        this.f26039a = str;
        this.f26040b = str2;
        this.f26041c = str3;
    }

    public final Source copy(@C17402n(name = "format") String str, @C17402n(name = "type") String str2, @C17402n(name = "url") String str3) {
        C19383o.m32797g(str, ResponseConstants.FORMAT);
        C19383o.m32797g(str2, "type");
        C19383o.m32797g(str3, "url");
        return new Source(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Source)) {
            return false;
        }
        Source source = (Source) obj;
        return C19383o.m32792b(this.f26039a, source.f26039a) && C19383o.m32792b(this.f26040b, source.f26040b) && C19383o.m32792b(this.f26041c, source.f26041c);
    }

    public final int hashCode() {
        return this.f26041c.hashCode() + C0023f.m105e(this.f26040b, this.f26039a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("Source(format=");
        h.append(this.f26039a);
        h.append(", type=");
        h.append(this.f26040b);
        h.append(", url=");
        return C0391c.m1057c(h, this.f26041c, ')');
    }
}
