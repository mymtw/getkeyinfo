package com.etsy.android.p327ui.core;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.apiv3.CollectionDetails;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.core.f */
public final class C9618f {

    /* renamed from: a */
    public final CollectionDetails f21310a;

    /* renamed from: b */
    public final String f21311b;

    public C9618f(CollectionDetails collectionDetails, String str) {
        this.f21310a = collectionDetails;
        this.f21311b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9618f)) {
            return false;
        }
        C9618f fVar = (C9618f) obj;
        return C19383o.m32792b(this.f21310a, fVar.f21310a) && C19383o.m32792b(this.f21311b, fVar.f21311b);
    }

    public final int hashCode() {
        int hashCode = this.f21310a.hashCode() * 31;
        String str = this.f21311b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("CollectionResult(collectionDetails=");
        h.append(this.f21310a);
        h.append(", nextLink=");
        return C0391c.m1057c(h, this.f21311b, ')');
    }
}
