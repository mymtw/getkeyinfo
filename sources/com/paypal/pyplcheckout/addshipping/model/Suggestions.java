package com.paypal.pyplcheckout.addshipping.model;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0388a;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class Suggestions {
    private final String addressText;
    private final String mainText;
    private final String placeId;
    private final String secondaryText;

    public Suggestions() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public Suggestions(String str, String str2, String str3, String str4) {
        this.addressText = str;
        this.mainText = str2;
        this.placeId = str3;
        this.secondaryText = str4;
    }

    public static /* synthetic */ Suggestions copy$default(Suggestions suggestions, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = suggestions.addressText;
        }
        if ((i & 2) != 0) {
            str2 = suggestions.mainText;
        }
        if ((i & 4) != 0) {
            str3 = suggestions.placeId;
        }
        if ((i & 8) != 0) {
            str4 = suggestions.secondaryText;
        }
        return suggestions.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.addressText;
    }

    public final String component2() {
        return this.mainText;
    }

    public final String component3() {
        return this.placeId;
    }

    public final String component4() {
        return this.secondaryText;
    }

    public final Suggestions copy(String str, String str2, String str3, String str4) {
        return new Suggestions(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Suggestions)) {
            return false;
        }
        Suggestions suggestions = (Suggestions) obj;
        return C19383o.m32792b(this.addressText, suggestions.addressText) && C19383o.m32792b(this.mainText, suggestions.mainText) && C19383o.m32792b(this.placeId, suggestions.placeId) && C19383o.m32792b(this.secondaryText, suggestions.secondaryText);
    }

    public final String getAddressText() {
        return this.addressText;
    }

    public final String getMainText() {
        return this.mainText;
    }

    public final String getPlaceId() {
        return this.placeId;
    }

    public final String getSecondaryText() {
        return this.secondaryText;
    }

    public int hashCode() {
        String str = this.addressText;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.mainText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.placeId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.secondaryText;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.addressText;
        String str2 = this.mainText;
        return C0073e.m210j(C0388a.m1050f("Suggestions(addressText=", str, ", mainText=", str2, ", placeId="), this.placeId, ", secondaryText=", this.secondaryText, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Suggestions(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
