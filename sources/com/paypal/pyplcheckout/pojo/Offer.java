package com.paypal.pyplcheckout.pojo;

import androidx.compose.animation.C0388a;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class Offer {
    @C18417a("actionUrl")
    private final ReturnUrl actionUrl;
    @C18417a("page")
    private final String page;
    @C18417a("referenceId")
    private final String referenceId;

    public Offer() {
        this((String) null, (String) null, (ReturnUrl) null, 7, (DefaultConstructorMarker) null);
    }

    public Offer(String str, String str2, ReturnUrl returnUrl) {
        this.referenceId = str;
        this.page = str2;
        this.actionUrl = returnUrl;
    }

    public static /* synthetic */ Offer copy$default(Offer offer, String str, String str2, ReturnUrl returnUrl, int i, Object obj) {
        if ((i & 1) != 0) {
            str = offer.referenceId;
        }
        if ((i & 2) != 0) {
            str2 = offer.page;
        }
        if ((i & 4) != 0) {
            returnUrl = offer.actionUrl;
        }
        return offer.copy(str, str2, returnUrl);
    }

    public final String component1() {
        return this.referenceId;
    }

    public final String component2() {
        return this.page;
    }

    public final ReturnUrl component3() {
        return this.actionUrl;
    }

    public final Offer copy(String str, String str2, ReturnUrl returnUrl) {
        return new Offer(str, str2, returnUrl);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Offer)) {
            return false;
        }
        Offer offer = (Offer) obj;
        return C19383o.m32792b(this.referenceId, offer.referenceId) && C19383o.m32792b(this.page, offer.page) && C19383o.m32792b(this.actionUrl, offer.actionUrl);
    }

    public final ReturnUrl getActionUrl() {
        return this.actionUrl;
    }

    public final String getPage() {
        return this.page;
    }

    public final String getReferenceId() {
        return this.referenceId;
    }

    public int hashCode() {
        String str = this.referenceId;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.page;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ReturnUrl returnUrl = this.actionUrl;
        if (returnUrl != null) {
            i = returnUrl.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.referenceId;
        String str2 = this.page;
        ReturnUrl returnUrl = this.actionUrl;
        StringBuilder f = C0388a.m1050f("Offer(referenceId=", str, ", page=", str2, ", actionUrl=");
        f.append(returnUrl);
        f.append(")");
        return f.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Offer(String str, String str2, ReturnUrl returnUrl, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : returnUrl);
    }
}
