package com.etsy.android.p327ui.listing.p329ui;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.listing.p329ui.buybox.title.C10313d;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.listing.ui.x */
public final class C10665x {

    /* renamed from: a */
    public String f23483a;

    /* renamed from: b */
    public String f23484b;

    /* renamed from: c */
    public boolean f23485c;

    public C10665x(C10313d dVar) {
        C19383o.m32797g(dVar, "title");
        String str = dVar.f22658a;
        String str2 = dVar.f22659b;
        boolean z = dVar.f22660c;
        C19383o.m32797g(str, "text");
        this.f23483a = str;
        this.f23484b = str2;
        this.f23485c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10665x)) {
            return false;
        }
        C10665x xVar = (C10665x) obj;
        return C19383o.m32792b(this.f23483a, xVar.f23483a) && C19383o.m32792b(this.f23484b, xVar.f23484b) && this.f23485c == xVar.f23485c;
    }

    public final int hashCode() {
        int hashCode = this.f23483a.hashCode() * 31;
        String str = this.f23484b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.f23485c;
        if (z) {
            z = true;
        }
        return hashCode2 + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("TitleBuilder(text=");
        h.append(this.f23483a);
        h.append(", textInAlternateLanguage=");
        h.append(this.f23484b);
        h.append(", isExpanded=");
        return C0391c.m1058d(h, this.f23485c, ')');
    }
}
