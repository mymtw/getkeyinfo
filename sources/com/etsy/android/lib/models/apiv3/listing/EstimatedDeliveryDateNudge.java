package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class EstimatedDeliveryDateNudge {
    public static final int $stable = 0;
    private final String disclaimer;
    private final String fullDisplayText;
    private final String type;
    private final String underlinedText;

    public EstimatedDeliveryDateNudge() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public EstimatedDeliveryDateNudge(@C17402n(name = "type") String str, @C17402n(name = "full_display_text") String str2, @C17402n(name = "disclaimer") String str3, @C17402n(name = "underlined_text") String str4) {
        this.type = str;
        this.fullDisplayText = str2;
        this.disclaimer = str3;
        this.underlinedText = str4;
    }

    public static /* synthetic */ EstimatedDeliveryDateNudge copy$default(EstimatedDeliveryDateNudge estimatedDeliveryDateNudge, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = estimatedDeliveryDateNudge.type;
        }
        if ((i & 2) != 0) {
            str2 = estimatedDeliveryDateNudge.fullDisplayText;
        }
        if ((i & 4) != 0) {
            str3 = estimatedDeliveryDateNudge.disclaimer;
        }
        if ((i & 8) != 0) {
            str4 = estimatedDeliveryDateNudge.underlinedText;
        }
        return estimatedDeliveryDateNudge.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.fullDisplayText;
    }

    public final String component3() {
        return this.disclaimer;
    }

    public final String component4() {
        return this.underlinedText;
    }

    public final EstimatedDeliveryDateNudge copy(@C17402n(name = "type") String str, @C17402n(name = "full_display_text") String str2, @C17402n(name = "disclaimer") String str3, @C17402n(name = "underlined_text") String str4) {
        return new EstimatedDeliveryDateNudge(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EstimatedDeliveryDateNudge)) {
            return false;
        }
        EstimatedDeliveryDateNudge estimatedDeliveryDateNudge = (EstimatedDeliveryDateNudge) obj;
        return C19383o.m32792b(this.type, estimatedDeliveryDateNudge.type) && C19383o.m32792b(this.fullDisplayText, estimatedDeliveryDateNudge.fullDisplayText) && C19383o.m32792b(this.disclaimer, estimatedDeliveryDateNudge.disclaimer) && C19383o.m32792b(this.underlinedText, estimatedDeliveryDateNudge.underlinedText);
    }

    public final String getDisclaimer() {
        return this.disclaimer;
    }

    public final String getFullDisplayText() {
        return this.fullDisplayText;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUnderlinedText() {
        return this.underlinedText;
    }

    public int hashCode() {
        String str = this.type;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fullDisplayText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.disclaimer;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.underlinedText;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("EstimatedDeliveryDateNudge(type=");
        h.append(this.type);
        h.append(", fullDisplayText=");
        h.append(this.fullDisplayText);
        h.append(", disclaimer=");
        h.append(this.disclaimer);
        h.append(", underlinedText=");
        return C0391c.m1057c(h, this.underlinedText, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EstimatedDeliveryDateNudge(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
