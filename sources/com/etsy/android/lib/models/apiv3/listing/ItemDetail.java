package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class ItemDetail {
    public static final int $stable = 8;
    private final List<String> displayText;
    private final String icon;
    private final String type;

    public ItemDetail() {
        this((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    public ItemDetail(@C17402n(name = "type") String str, @C17402n(name = "icon") String str2, @C17402n(name = "display_text") List<String> list) {
        this.type = str;
        this.icon = str2;
        this.displayText = list;
    }

    public static /* synthetic */ ItemDetail copy$default(ItemDetail itemDetail, String str, String str2, List<String> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = itemDetail.type;
        }
        if ((i & 2) != 0) {
            str2 = itemDetail.icon;
        }
        if ((i & 4) != 0) {
            list = itemDetail.displayText;
        }
        return itemDetail.copy(str, str2, list);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.icon;
    }

    public final List<String> component3() {
        return this.displayText;
    }

    public final ItemDetail copy(@C17402n(name = "type") String str, @C17402n(name = "icon") String str2, @C17402n(name = "display_text") List<String> list) {
        return new ItemDetail(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemDetail)) {
            return false;
        }
        ItemDetail itemDetail = (ItemDetail) obj;
        return C19383o.m32792b(this.type, itemDetail.type) && C19383o.m32792b(this.icon, itemDetail.icon) && C19383o.m32792b(this.displayText, itemDetail.displayText);
    }

    public final List<String> getDisplayText() {
        return this.displayText;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.icon;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.displayText;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ItemDetail(type=");
        h.append(this.type);
        h.append(", icon=");
        h.append(this.icon);
        h.append(", displayText=");
        return C0070b.m186i(h, this.displayText, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ItemDetail(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }
}
