package com.etsy.android.p327ui.search.filters.refactor;

import android.support.p013v4.media.C0072d;
import com.etsy.android.R;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.search.filters.refactor.ShippingSelectItem */
public final class ShippingSelectItem {

    /* renamed from: a */
    public final String f23877a;

    /* renamed from: b */
    public final String f23878b;

    /* renamed from: c */
    public final boolean f23879c;

    /* renamed from: d */
    public final ShippingType f23880d;

    /* renamed from: com.etsy.android.ui.search.filters.refactor.ShippingSelectItem$ShippingType */
    public enum ShippingType {
        FREE_SHIPPING_ID(R.string.new_search_filter_free_shipping),
        ONE_DAY_SHIPPING_ID(R.string.new_search_filter_1_day_shipping),
        THREE_DAY_SHIPPING_ID(R.string.new_search_filter_3_day_shipping);
        
        private final int nameResource;

        private ShippingType(int i) {
            this.nameResource = i;
        }

        public final int getNameResource() {
            return this.nameResource;
        }
    }

    public ShippingSelectItem(String str, String str2, boolean z, ShippingType shippingType) {
        C19383o.m32797g(str, "id");
        this.f23877a = str;
        this.f23878b = str2;
        this.f23879c = z;
        this.f23880d = shippingType;
    }

    /* renamed from: a */
    public static ShippingSelectItem m18786a(ShippingSelectItem shippingSelectItem, boolean z) {
        String str = shippingSelectItem.f23877a;
        String str2 = shippingSelectItem.f23878b;
        ShippingType shippingType = shippingSelectItem.f23880d;
        C19383o.m32797g(str, "id");
        C19383o.m32797g(str2, "title");
        C19383o.m32797g(shippingType, "type");
        return new ShippingSelectItem(str, str2, z, shippingType);
    }

    /* renamed from: b */
    public final String mo35863b() {
        return this.f23877a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingSelectItem)) {
            return false;
        }
        ShippingSelectItem shippingSelectItem = (ShippingSelectItem) obj;
        return C19383o.m32792b(this.f23877a, shippingSelectItem.f23877a) && C19383o.m32792b(this.f23878b, shippingSelectItem.f23878b) && this.f23879c == shippingSelectItem.f23879c && this.f23880d == shippingSelectItem.f23880d;
    }

    public final int hashCode() {
        int e = C0023f.m105e(this.f23878b, this.f23877a.hashCode() * 31, 31);
        boolean z = this.f23879c;
        if (z) {
            z = true;
        }
        return this.f23880d.hashCode() + ((e + (z ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ShippingSelectItem(id=");
        h.append(this.f23877a);
        h.append(", title=");
        h.append(this.f23878b);
        h.append(", selected=");
        h.append(this.f23879c);
        h.append(", type=");
        h.append(this.f23880d);
        h.append(')');
        return h.toString();
    }
}
