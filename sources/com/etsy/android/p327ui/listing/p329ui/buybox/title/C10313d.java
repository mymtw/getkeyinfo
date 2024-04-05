package com.etsy.android.p327ui.listing.p329ui.buybox.title;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.title.d */
public final class C10313d extends C10423j {

    /* renamed from: a */
    public final String f22658a;

    /* renamed from: b */
    public final String f22659b;

    /* renamed from: c */
    public final boolean f22660c;

    public C10313d(String str, String str2, boolean z) {
        C19383o.m32797g(str, "text");
        this.f22658a = str;
        this.f22659b = str2;
        this.f22660c = z;
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.TITLE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10313d)) {
            return false;
        }
        C10313d dVar = (C10313d) obj;
        return C19383o.m32792b(this.f22658a, dVar.f22658a) && C19383o.m32792b(this.f22659b, dVar.f22659b) && this.f22660c == dVar.f22660c;
    }

    public final int hashCode() {
        int hashCode = this.f22658a.hashCode() * 31;
        String str = this.f22659b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.f22660c;
        if (z) {
            z = true;
        }
        return hashCode2 + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("Title(text=");
        h.append(this.f22658a);
        h.append(", textInAlternateLanguage=");
        h.append(this.f22659b);
        h.append(", isExpanded=");
        return C0391c.m1058d(h, this.f22660c, ')');
    }
}
