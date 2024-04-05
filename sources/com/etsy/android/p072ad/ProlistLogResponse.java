package com.etsy.android.p072ad;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ad.ProlistLogResponse */
public final class ProlistLogResponse {

    /* renamed from: a */
    public final boolean f14105a;

    /* renamed from: b */
    public final Integer f14106b;

    public ProlistLogResponse(@C17402n(name = "success") boolean z, @C17402n(name = "num_buffered") Integer num) {
        this.f14105a = z;
        this.f14106b = num;
    }

    public final ProlistLogResponse copy(@C17402n(name = "success") boolean z, @C17402n(name = "num_buffered") Integer num) {
        return new ProlistLogResponse(z, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProlistLogResponse)) {
            return false;
        }
        ProlistLogResponse prolistLogResponse = (ProlistLogResponse) obj;
        return this.f14105a == prolistLogResponse.f14105a && C19383o.m32792b(this.f14106b, prolistLogResponse.f14106b);
    }

    public final int hashCode() {
        boolean z = this.f14105a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        Integer num = this.f14106b;
        return i + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ProlistLogResponse(success=");
        h.append(this.f14105a);
        h.append(", numBuffered=");
        return C0023f.m109j(h, this.f14106b, ')');
    }
}
