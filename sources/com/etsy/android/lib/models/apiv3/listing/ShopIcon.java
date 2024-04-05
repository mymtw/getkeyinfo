package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class ShopIcon {
    public static final int $stable = 8;
    private final Long imageId;
    private final String key;
    private final List<ImageSize> sources;
    private final String url;

    public ShopIcon() {
        this((Long) null, (String) null, (List) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public ShopIcon(@C17402n(name = "image_id") Long l, @C17402n(name = "key") String str, @C17402n(name = "sources") List<ImageSize> list, @C17402n(name = "url") String str2) {
        this.imageId = l;
        this.key = str;
        this.sources = list;
        this.url = str2;
    }

    public static /* synthetic */ ShopIcon copy$default(ShopIcon shopIcon, Long l, String str, List<ImageSize> list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = shopIcon.imageId;
        }
        if ((i & 2) != 0) {
            str = shopIcon.key;
        }
        if ((i & 4) != 0) {
            list = shopIcon.sources;
        }
        if ((i & 8) != 0) {
            str2 = shopIcon.url;
        }
        return shopIcon.copy(l, str, list, str2);
    }

    public final Long component1() {
        return this.imageId;
    }

    public final String component2() {
        return this.key;
    }

    public final List<ImageSize> component3() {
        return this.sources;
    }

    public final String component4() {
        return this.url;
    }

    public final ShopIcon copy(@C17402n(name = "image_id") Long l, @C17402n(name = "key") String str, @C17402n(name = "sources") List<ImageSize> list, @C17402n(name = "url") String str2) {
        return new ShopIcon(l, str, list, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopIcon)) {
            return false;
        }
        ShopIcon shopIcon = (ShopIcon) obj;
        return C19383o.m32792b(this.imageId, shopIcon.imageId) && C19383o.m32792b(this.key, shopIcon.key) && C19383o.m32792b(this.sources, shopIcon.sources) && C19383o.m32792b(this.url, shopIcon.url);
    }

    public final Long getImageId() {
        return this.imageId;
    }

    public final String getKey() {
        return this.key;
    }

    public final List<ImageSize> getSources() {
        return this.sources;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        Long l = this.imageId;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.key;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<ImageSize> list = this.sources;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.url;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ShopIcon(imageId=");
        h.append(this.imageId);
        h.append(", key=");
        h.append(this.key);
        h.append(", sources=");
        h.append(this.sources);
        h.append(", url=");
        return C0391c.m1057c(h, this.url, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShopIcon(Long l, String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str2);
    }
}
