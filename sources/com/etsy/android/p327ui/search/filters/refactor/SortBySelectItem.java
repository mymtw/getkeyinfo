package com.etsy.android.p327ui.search.filters.refactor;

import android.support.p013v4.media.C0072d;
import com.etsy.android.R;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.search.filters.refactor.SortBySelectItem */
public final class SortBySelectItem {

    /* renamed from: a */
    public final String f23885a;

    /* renamed from: b */
    public final String f23886b;

    /* renamed from: c */
    public final boolean f23887c;

    /* renamed from: d */
    public final SortByType f23888d;

    /* renamed from: com.etsy.android.ui.search.filters.refactor.SortBySelectItem$SortByType */
    public enum SortByType {
        RELEVANCY(R.string.order_relevance),
        MOST_RECENT(R.string.sort_order_most_recent),
        HIGHEST_PRICE(R.string.sort_order_highest_price),
        LOWEST_PRICE(R.string.sort_order_lowest_price);
        
        private final int nameResource;

        private SortByType(int i) {
            this.nameResource = i;
        }

        public final int getNameResource() {
            return this.nameResource;
        }
    }

    public SortBySelectItem(String str, String str2, boolean z, SortByType sortByType) {
        C19383o.m32797g(str, "id");
        this.f23885a = str;
        this.f23886b = str2;
        this.f23887c = z;
        this.f23888d = sortByType;
    }

    /* renamed from: a */
    public static SortBySelectItem m18789a(SortBySelectItem sortBySelectItem, boolean z) {
        String str = sortBySelectItem.f23885a;
        String str2 = sortBySelectItem.f23886b;
        SortByType sortByType = sortBySelectItem.f23888d;
        C19383o.m32797g(str, "id");
        C19383o.m32797g(str2, "title");
        C19383o.m32797g(sortByType, "type");
        return new SortBySelectItem(str, str2, z, sortByType);
    }

    /* renamed from: b */
    public final String mo35870b() {
        return this.f23885a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SortBySelectItem)) {
            return false;
        }
        SortBySelectItem sortBySelectItem = (SortBySelectItem) obj;
        return C19383o.m32792b(this.f23885a, sortBySelectItem.f23885a) && C19383o.m32792b(this.f23886b, sortBySelectItem.f23886b) && this.f23887c == sortBySelectItem.f23887c && this.f23888d == sortBySelectItem.f23888d;
    }

    public final int hashCode() {
        int e = C0023f.m105e(this.f23886b, this.f23885a.hashCode() * 31, 31);
        boolean z = this.f23887c;
        if (z) {
            z = true;
        }
        return this.f23888d.hashCode() + ((e + (z ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SortBySelectItem(id=");
        h.append(this.f23885a);
        h.append(", title=");
        h.append(this.f23886b);
        h.append(", selected=");
        h.append(this.f23887c);
        h.append(", type=");
        h.append(this.f23888d);
        h.append(')');
        return h.toString();
    }
}
