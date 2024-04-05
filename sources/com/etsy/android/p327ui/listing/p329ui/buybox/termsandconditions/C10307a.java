package com.etsy.android.p327ui.listing.p329ui.buybox.termsandconditions;

import android.support.p013v4.media.C0072d;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.termsandconditions.a */
public final class C10307a extends C10423j {

    /* renamed from: a */
    public final Spanned f22650a;

    public C10307a(SpannableStringBuilder spannableStringBuilder) {
        this.f22650a = spannableStringBuilder;
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.TERMS_AND_CONDITIONS;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10307a) && C19383o.m32792b(this.f22650a, ((C10307a) obj).f22650a);
    }

    public final int hashCode() {
        return this.f22650a.hashCode();
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("TermsAndConditions(termsText=");
        h.append(this.f22650a);
        h.append(')');
        return h.toString();
    }
}
