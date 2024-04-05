package com.etsy.android.uikit.viewholder;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.uikit.viewholder.r */
public final class C12006r {

    /* renamed from: a */
    public final String f26761a;

    /* renamed from: b */
    public final String f26762b;

    public C12006r(String str, String str2) {
        C19383o.m32797g(str2, "thumbnailUrl");
        this.f26761a = str;
        this.f26762b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12006r)) {
            return false;
        }
        C12006r rVar = (C12006r) obj;
        return C19383o.m32792b(this.f26761a, rVar.f26761a) && C19383o.m32792b(this.f26762b, rVar.f26762b);
    }

    public final int hashCode() {
        return this.f26762b.hashCode() + (this.f26761a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ListingCardVideoUiModel(videoUrl=");
        h.append(this.f26761a);
        h.append(", thumbnailUrl=");
        return C0391c.m1057c(h, this.f26762b, ')');
    }
}
