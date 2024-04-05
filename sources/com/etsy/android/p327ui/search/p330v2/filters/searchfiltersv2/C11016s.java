package com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.apiv3.FacetCount;
import com.etsy.android.lib.models.apiv3.filters.ValueFacet;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p414oe.C13166d;

/* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.s */
public abstract class C11016s {

    /* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.s$a */
    public static final class C11017a extends C11016s {

        /* renamed from: a */
        public final String f24431a;

        /* renamed from: b */
        public final List<FacetCount> f24432b;

        public C11017a(String str, ArrayList arrayList) {
            this.f24431a = str;
            this.f24432b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11017a)) {
                return false;
            }
            C11017a aVar = (C11017a) obj;
            return C19383o.m32792b(this.f24431a, aVar.f24431a) && C19383o.m32792b(this.f24432b, aVar.f24432b);
        }

        public final int hashCode() {
            return this.f24432b.hashCode() + (this.f24431a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("CategoryPath(breadcrumb=");
            h.append(this.f24431a);
            h.append(", categoriesPath=");
            return C0070b.m186i(h, this.f24432b, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.s$b */
    public static final class C11018b extends C11016s {

        /* renamed from: a */
        public final Integer f24433a;

        public C11018b(Integer num) {
            this.f24433a = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11018b) && C19383o.m32792b(this.f24433a, ((C11018b) obj).f24433a);
        }

        public final int hashCode() {
            Integer num = this.f24433a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return C0023f.m109j(C0072d.m201h("Id(id="), this.f24433a, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.s$c */
    public static final class C11019c extends C11016s {

        /* renamed from: a */
        public final String f24434a;

        /* renamed from: b */
        public final List<ValueFacet> f24435b;

        public C11019c(String str, ArrayList arrayList) {
            this.f24434a = str;
            this.f24435b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11019c)) {
                return false;
            }
            C11019c cVar = (C11019c) obj;
            return C19383o.m32792b(this.f24434a, cVar.f24434a) && C19383o.m32792b(this.f24435b, cVar.f24435b);
        }

        public final int hashCode() {
            return this.f24435b.hashCode() + (this.f24434a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("MultiSelectedValues(breadcrumb=");
            h.append(this.f24434a);
            h.append(", values=");
            return C0070b.m186i(h, this.f24435b, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.s$d */
    public static final class C11020d extends C11016s {

        /* renamed from: a */
        public int f24436a;

        /* renamed from: b */
        public final C13166d f24437b;

        public C11020d(int i, C13166d dVar) {
            this.f24436a = i;
            this.f24437b = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11020d)) {
                return false;
            }
            C11020d dVar = (C11020d) obj;
            return this.f24436a == dVar.f24436a && C19383o.m32792b(this.f24437b, dVar.f24437b);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.f24436a) * 31;
            C13166d dVar = this.f24437b;
            return hashCode + (dVar == null ? 0 : dVar.hashCode());
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("PriceOption(index=");
            h.append(this.f24436a);
            h.append(", priceFilterOption=");
            h.append(this.f24437b);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.s$e */
    public static final class C11021e extends C11016s {

        /* renamed from: a */
        public final Integer f24438a;

        public C11021e(Integer num) {
            this.f24438a = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11021e) && C19383o.m32792b(this.f24438a, ((C11021e) obj).f24438a);
        }

        public final int hashCode() {
            Integer num = this.f24438a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return C0023f.m109j(C0072d.m201h("ResId(resId="), this.f24438a, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.s$f */
    public static final class C11022f extends C11016s {

        /* renamed from: a */
        public final int f24439a;

        /* renamed from: b */
        public final SearchOptions.Location f24440b;

        public C11022f(int i, SearchOptions.Location location) {
            C19383o.m32797g(location, "shopLocation");
            this.f24439a = i;
            this.f24440b = location;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11022f)) {
                return false;
            }
            C11022f fVar = (C11022f) obj;
            return this.f24439a == fVar.f24439a && C19383o.m32792b(this.f24440b, fVar.f24440b);
        }

        public final int hashCode() {
            return this.f24440b.hashCode() + (Integer.hashCode(this.f24439a) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ShopLocation(id=");
            h.append(this.f24439a);
            h.append(", shopLocation=");
            h.append(this.f24440b);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.s$g */
    public static final class C11023g extends C11016s {

        /* renamed from: a */
        public final String f24441a;

        public C11023g(String str) {
            C19383o.m32797g(str, "text");
            this.f24441a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11023g) && C19383o.m32792b(this.f24441a, ((C11023g) obj).f24441a);
        }

        public final int hashCode() {
            return this.f24441a.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("Text(text="), this.f24441a, ')');
        }
    }
}
