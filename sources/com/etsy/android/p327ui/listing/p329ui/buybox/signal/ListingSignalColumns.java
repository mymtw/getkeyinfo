package com.etsy.android.p327ui.listing.p329ui.buybox.signal;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.C10563f;
import com.etsy.android.uikit.p331ui.core.NumericRatingView;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.signal.ListingSignalColumns */
public final class ListingSignalColumns extends C10423j {

    /* renamed from: a */
    public final String f22630a;

    /* renamed from: b */
    public final C10563f f22631b;

    /* renamed from: c */
    public final boolean f22632c;

    /* renamed from: d */
    public final float f22633d;

    /* renamed from: e */
    public final int f22634e;

    /* renamed from: f */
    public final NumericRatingView.ReviewCountDisplayType f22635f;

    /* renamed from: g */
    public final SignalsState f22636g;

    /* renamed from: com.etsy.android.ui.listing.ui.buybox.signal.ListingSignalColumns$SignalsState */
    public enum SignalsState {
        INITIAL,
        LOADING,
        SHOW,
        HIDE
    }

    public ListingSignalColumns(String str, C10563f fVar, boolean z, float f, int i, NumericRatingView.ReviewCountDisplayType reviewCountDisplayType, SignalsState signalsState) {
        C19383o.m32797g(reviewCountDisplayType, "reviewCountDisplayType");
        C19383o.m32797g(signalsState, "signalsState");
        this.f22630a = str;
        this.f22631b = fVar;
        this.f22632c = z;
        this.f22633d = f;
        this.f22634e = i;
        this.f22635f = reviewCountDisplayType;
        this.f22636g = signalsState;
    }

    /* renamed from: b */
    public static ListingSignalColumns m18358b(ListingSignalColumns listingSignalColumns, String str, C10563f fVar, SignalsState signalsState, int i) {
        if ((i & 1) != 0) {
            str = listingSignalColumns.f22630a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            fVar = listingSignalColumns.f22631b;
        }
        C10563f fVar2 = fVar;
        boolean z = (i & 4) != 0 ? listingSignalColumns.f22632c : false;
        float f = (i & 8) != 0 ? listingSignalColumns.f22633d : 0.0f;
        int i2 = (i & 16) != 0 ? listingSignalColumns.f22634e : 0;
        NumericRatingView.ReviewCountDisplayType reviewCountDisplayType = (i & 32) != 0 ? listingSignalColumns.f22635f : null;
        if ((i & 64) != 0) {
            signalsState = listingSignalColumns.f22636g;
        }
        SignalsState signalsState2 = signalsState;
        listingSignalColumns.getClass();
        C19383o.m32797g(reviewCountDisplayType, "reviewCountDisplayType");
        C19383o.m32797g(signalsState2, "signalsState");
        return new ListingSignalColumns(str2, fVar2, z, f, i2, reviewCountDisplayType, signalsState2);
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.HORIZONTAL_INFO_TABLE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListingSignalColumns)) {
            return false;
        }
        ListingSignalColumns listingSignalColumns = (ListingSignalColumns) obj;
        return C19383o.m32792b(this.f22630a, listingSignalColumns.f22630a) && C19383o.m32792b(this.f22631b, listingSignalColumns.f22631b) && this.f22632c == listingSignalColumns.f22632c && C19383o.m32792b(Float.valueOf(this.f22633d), Float.valueOf(listingSignalColumns.f22633d)) && this.f22634e == listingSignalColumns.f22634e && this.f22635f == listingSignalColumns.f22635f && this.f22636g == listingSignalColumns.f22636g;
    }

    public final int hashCode() {
        String str = this.f22630a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        C10563f fVar = this.f22631b;
        if (fVar != null) {
            i = fVar.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f22632c;
        if (z) {
            z = true;
        }
        return this.f22636g.hashCode() + ((this.f22635f.hashCode() + C0069a.m170a(this.f22634e, C0023f.m104c(this.f22633d, (i2 + (z ? 1 : 0)) * 31, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ListingSignalColumns(estimatedDeliveryDateRange=");
        h.append(this.f22630a);
        h.append(", calculatedShipping=");
        h.append(this.f22631b);
        h.append(", hasFreeShipping=");
        h.append(this.f22632c);
        h.append(", averageRating=");
        h.append(this.f22633d);
        h.append(", numberOfReviews=");
        h.append(this.f22634e);
        h.append(", reviewCountDisplayType=");
        h.append(this.f22635f);
        h.append(", signalsState=");
        h.append(this.f22636g);
        h.append(')');
        return h.toString();
    }
}
