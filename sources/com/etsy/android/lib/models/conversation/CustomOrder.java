package com.etsy.android.lib.models.conversation;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class CustomOrder {
    public static final int $stable = 8;
    private String imageUrl;
    private String subtitle;
    private String title;
    private String url;

    public CustomOrder() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public CustomOrder(String str, String str2, @C17402n(name = "image_url") String str3, String str4) {
        this.title = str;
        this.subtitle = str2;
        this.imageUrl = str3;
        this.url = str4;
    }

    public static /* synthetic */ CustomOrder copy$default(CustomOrder customOrder, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customOrder.title;
        }
        if ((i & 2) != 0) {
            str2 = customOrder.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = customOrder.imageUrl;
        }
        if ((i & 8) != 0) {
            str4 = customOrder.url;
        }
        return customOrder.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final String component3() {
        return this.imageUrl;
    }

    public final String component4() {
        return this.url;
    }

    public final CustomOrder copy(String str, String str2, @C17402n(name = "image_url") String str3, String str4) {
        return new CustomOrder(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomOrder)) {
            return false;
        }
        CustomOrder customOrder = (CustomOrder) obj;
        return C19383o.m32792b(this.title, customOrder.title) && C19383o.m32792b(this.subtitle, customOrder.subtitle) && C19383o.m32792b(this.imageUrl, customOrder.imageUrl) && C19383o.m32792b(this.url, customOrder.url);
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageUrl;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.url;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public final void setSubtitle(String str) {
        this.subtitle = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("CustomOrder(title=");
        h.append(this.title);
        h.append(", subtitle=");
        h.append(this.subtitle);
        h.append(", imageUrl=");
        h.append(this.imageUrl);
        h.append(", url=");
        return C0391c.m1057c(h, this.url, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CustomOrder(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
