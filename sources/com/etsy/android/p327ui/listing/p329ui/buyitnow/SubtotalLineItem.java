package com.etsy.android.p327ui.listing.p329ui.buyitnow;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.etsy.android.ui.listing.ui.buyitnow.SubtotalLineItem */
public final class SubtotalLineItem implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SubtotalLineItem> CREATOR = new Creator();
    private final String label;
    private final String value;

    /* renamed from: com.etsy.android.ui.listing.ui.buyitnow.SubtotalLineItem$Creator */
    public static final class Creator implements Parcelable.Creator<SubtotalLineItem> {
        public final SubtotalLineItem createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new SubtotalLineItem(parcel.readString(), parcel.readString());
        }

        public final SubtotalLineItem[] newArray(int i) {
            return new SubtotalLineItem[i];
        }
    }

    public SubtotalLineItem() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public SubtotalLineItem(String str, String str2) {
        C19383o.m32797g(str, ResponseConstants.LABEL);
        C19383o.m32797g(str2, "value");
        this.label = str;
        this.value = str2;
    }

    public static /* synthetic */ SubtotalLineItem copy$default(SubtotalLineItem subtotalLineItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subtotalLineItem.label;
        }
        if ((i & 2) != 0) {
            str2 = subtotalLineItem.value;
        }
        return subtotalLineItem.copy(str, str2);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.value;
    }

    public final SubtotalLineItem copy(String str, String str2) {
        C19383o.m32797g(str, ResponseConstants.LABEL);
        C19383o.m32797g(str2, "value");
        return new SubtotalLineItem(str, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubtotalLineItem)) {
            return false;
        }
        SubtotalLineItem subtotalLineItem = (SubtotalLineItem) obj;
        return C19383o.m32792b(this.label, subtotalLineItem.label) && C19383o.m32792b(this.value, subtotalLineItem.value);
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.label.hashCode() * 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("SubtotalLineItem(label=");
        h.append(this.label);
        h.append(", value=");
        return C0391c.m1057c(h, this.value, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.label);
        parcel.writeString(this.value);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SubtotalLineItem(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
