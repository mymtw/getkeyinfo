package com.etsy.android.p327ui.search.shopresults;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.shopresults.c */
public final class C10937c {

    /* renamed from: a */
    public final String f24283a;

    public C10937c(String str) {
        this.f24283a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10937c) && C19383o.m32792b(this.f24283a, ((C10937c) obj).f24283a);
    }

    public final int hashCode() {
        return this.f24283a.hashCode();
    }

    public final String toString() {
        return C0391c.m1057c(C0072d.m201h("SearchResultsShopsHeaderUi(maxShopResults="), this.f24283a, ')');
    }
}
