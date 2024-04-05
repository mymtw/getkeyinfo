package com.etsy.android.lib.models.apiv3;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
public final class StarSellerBadge {
    public static final int $stable = 0;
    private final String eventName;
    private final String label;
    private final String modalBody;
    private final String modalTitle;

    public StarSellerBadge(@C17402n(name = "label") String str, @C17402n(name = "modal_title") String str2, @C17402n(name = "modal_body") String str3, @C17402n(name = "event_name") String str4) {
        C0391c.m1060g(str, ResponseConstants.LABEL, str2, "modalTitle", str3, "modalBody", str4, "eventName");
        this.label = str;
        this.modalTitle = str2;
        this.modalBody = str3;
        this.eventName = str4;
    }

    public static /* synthetic */ StarSellerBadge copy$default(StarSellerBadge starSellerBadge, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = starSellerBadge.label;
        }
        if ((i & 2) != 0) {
            str2 = starSellerBadge.modalTitle;
        }
        if ((i & 4) != 0) {
            str3 = starSellerBadge.modalBody;
        }
        if ((i & 8) != 0) {
            str4 = starSellerBadge.eventName;
        }
        return starSellerBadge.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.modalTitle;
    }

    public final String component3() {
        return this.modalBody;
    }

    public final String component4() {
        return this.eventName;
    }

    public final StarSellerBadge copy(@C17402n(name = "label") String str, @C17402n(name = "modal_title") String str2, @C17402n(name = "modal_body") String str3, @C17402n(name = "event_name") String str4) {
        C19383o.m32797g(str, ResponseConstants.LABEL);
        C19383o.m32797g(str2, "modalTitle");
        C19383o.m32797g(str3, "modalBody");
        C19383o.m32797g(str4, "eventName");
        return new StarSellerBadge(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StarSellerBadge)) {
            return false;
        }
        StarSellerBadge starSellerBadge = (StarSellerBadge) obj;
        return C19383o.m32792b(this.label, starSellerBadge.label) && C19383o.m32792b(this.modalTitle, starSellerBadge.modalTitle) && C19383o.m32792b(this.modalBody, starSellerBadge.modalBody) && C19383o.m32792b(this.eventName, starSellerBadge.eventName);
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getModalBody() {
        return this.modalBody;
    }

    public final String getModalTitle() {
        return this.modalTitle;
    }

    public int hashCode() {
        return this.eventName.hashCode() + C0023f.m105e(this.modalBody, C0023f.m105e(this.modalTitle, this.label.hashCode() * 31, 31), 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("StarSellerBadge(label=");
        h.append(this.label);
        h.append(", modalTitle=");
        h.append(this.modalTitle);
        h.append(", modalBody=");
        h.append(this.modalBody);
        h.append(", eventName=");
        return C0391c.m1057c(h, this.eventName, ')');
    }
}
