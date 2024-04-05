package com.etsy.android.p327ui.search.filters.refactor;

import android.support.p013v4.media.C0072d;
import com.etsy.android.R;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.search.filters.refactor.ItemTypeSelectItem */
public final class ItemTypeSelectItem {

    /* renamed from: a */
    public final String f23782a;

    /* renamed from: b */
    public final String f23783b;

    /* renamed from: c */
    public final boolean f23784c;

    /* renamed from: d */
    public final ItemTypeType f23785d;

    /* renamed from: com.etsy.android.ui.search.filters.refactor.ItemTypeSelectItem$ItemTypeType */
    public enum ItemTypeType {
        ALL_ITEMS_ID(R.string.new_search_filter_all_items),
        HANDMADE_ID(R.string.handmade),
        VINTAGE_ID(R.string.vintage);
        
        private final int nameResource;

        private ItemTypeType(int i) {
            this.nameResource = i;
        }

        public final int getNameResource() {
            return this.nameResource;
        }
    }

    public ItemTypeSelectItem(String str, String str2, boolean z, ItemTypeType itemTypeType) {
        C19383o.m32797g(str, "id");
        this.f23782a = str;
        this.f23783b = str2;
        this.f23784c = z;
        this.f23785d = itemTypeType;
    }

    /* renamed from: a */
    public static ItemTypeSelectItem m18672a(ItemTypeSelectItem itemTypeSelectItem, boolean z) {
        String str = itemTypeSelectItem.f23782a;
        String str2 = itemTypeSelectItem.f23783b;
        ItemTypeType itemTypeType = itemTypeSelectItem.f23785d;
        C19383o.m32797g(str, "id");
        C19383o.m32797g(str2, "title");
        C19383o.m32797g(itemTypeType, "type");
        return new ItemTypeSelectItem(str, str2, z, itemTypeType);
    }

    /* renamed from: b */
    public final String mo35758b() {
        return this.f23782a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemTypeSelectItem)) {
            return false;
        }
        ItemTypeSelectItem itemTypeSelectItem = (ItemTypeSelectItem) obj;
        return C19383o.m32792b(this.f23782a, itemTypeSelectItem.f23782a) && C19383o.m32792b(this.f23783b, itemTypeSelectItem.f23783b) && this.f23784c == itemTypeSelectItem.f23784c && this.f23785d == itemTypeSelectItem.f23785d;
    }

    public final int hashCode() {
        int e = C0023f.m105e(this.f23783b, this.f23782a.hashCode() * 31, 31);
        boolean z = this.f23784c;
        if (z) {
            z = true;
        }
        return this.f23785d.hashCode() + ((e + (z ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ItemTypeSelectItem(id=");
        h.append(this.f23782a);
        h.append(", title=");
        h.append(this.f23783b);
        h.append(", selected=");
        h.append(this.f23784c);
        h.append(", type=");
        h.append(this.f23785d);
        h.append(')');
        return h.toString();
    }
}
