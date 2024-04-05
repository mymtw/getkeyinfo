package com.etsy.android.lib.models;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.Alert;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class ShopFollowResponse {
    public static final int $stable = 0;
    private final Alert alert;
    private final Boolean socialInvitesFlag;

    public ShopFollowResponse() {
        this((Boolean) null, (Alert) null, 3, (DefaultConstructorMarker) null);
    }

    public ShopFollowResponse(@C17402n(name = "social_invites_flag") Boolean bool, @C17402n(name = "alert") Alert alert2) {
        this.socialInvitesFlag = bool;
        this.alert = alert2;
    }

    public static /* synthetic */ ShopFollowResponse copy$default(ShopFollowResponse shopFollowResponse, Boolean bool, Alert alert2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = shopFollowResponse.socialInvitesFlag;
        }
        if ((i & 2) != 0) {
            alert2 = shopFollowResponse.alert;
        }
        return shopFollowResponse.copy(bool, alert2);
    }

    public final Boolean component1() {
        return this.socialInvitesFlag;
    }

    public final Alert component2() {
        return this.alert;
    }

    public final ShopFollowResponse copy(@C17402n(name = "social_invites_flag") Boolean bool, @C17402n(name = "alert") Alert alert2) {
        return new ShopFollowResponse(bool, alert2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopFollowResponse)) {
            return false;
        }
        ShopFollowResponse shopFollowResponse = (ShopFollowResponse) obj;
        return C19383o.m32792b(this.socialInvitesFlag, shopFollowResponse.socialInvitesFlag) && C19383o.m32792b(this.alert, shopFollowResponse.alert);
    }

    public final Alert getAlert() {
        return this.alert;
    }

    public final Boolean getSocialInvitesFlag() {
        return this.socialInvitesFlag;
    }

    public int hashCode() {
        Boolean bool = this.socialInvitesFlag;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Alert alert2 = this.alert;
        if (alert2 != null) {
            i = alert2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ShopFollowResponse(socialInvitesFlag=");
        h.append(this.socialInvitesFlag);
        h.append(", alert=");
        h.append(this.alert);
        h.append(')');
        return h.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShopFollowResponse(Boolean bool, Alert alert2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? null : alert2);
    }
}
