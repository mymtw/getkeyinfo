package com.etsy.android.lib.models.apiv3;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.listing.FormattedMoney;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.io.Serializable;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class DetailedFreeShipping implements Serializable {
    public static final int $stable = 8;
    private FormattedMoney body;
    private String title;

    public DetailedFreeShipping() {
        this((String) null, (FormattedMoney) null, 3, (DefaultConstructorMarker) null);
    }

    public DetailedFreeShipping(@C17402n(name = "title") String str, @C17402n(name = "body") FormattedMoney formattedMoney) {
        this.title = str;
        this.body = formattedMoney;
    }

    public static /* synthetic */ DetailedFreeShipping copy$default(DetailedFreeShipping detailedFreeShipping, String str, FormattedMoney formattedMoney, int i, Object obj) {
        if ((i & 1) != 0) {
            str = detailedFreeShipping.title;
        }
        if ((i & 2) != 0) {
            formattedMoney = detailedFreeShipping.body;
        }
        return detailedFreeShipping.copy(str, formattedMoney);
    }

    public final String component1() {
        return this.title;
    }

    public final FormattedMoney component2() {
        return this.body;
    }

    public final DetailedFreeShipping copy(@C17402n(name = "title") String str, @C17402n(name = "body") FormattedMoney formattedMoney) {
        return new DetailedFreeShipping(str, formattedMoney);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DetailedFreeShipping)) {
            return false;
        }
        DetailedFreeShipping detailedFreeShipping = (DetailedFreeShipping) obj;
        return C19383o.m32792b(this.title, detailedFreeShipping.title) && C19383o.m32792b(this.body, detailedFreeShipping.body);
    }

    public final FormattedMoney getBody() {
        return this.body;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        FormattedMoney formattedMoney = this.body;
        if (formattedMoney != null) {
            i = formattedMoney.hashCode();
        }
        return hashCode + i;
    }

    public final void setBody(FormattedMoney formattedMoney) {
        this.body = formattedMoney;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("DetailedFreeShipping(title=");
        h.append(this.title);
        h.append(", body=");
        h.append(this.body);
        h.append(')');
        return h.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DetailedFreeShipping(String str, FormattedMoney formattedMoney, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : formattedMoney);
    }
}
