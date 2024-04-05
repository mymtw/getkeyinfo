package com.etsy.android.p327ui.search.filters.refactor;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.FilterCountry;
import java.util.Map;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.filters.refactor.q */
public interface C10849q {

    /* renamed from: com.etsy.android.ui.search.filters.refactor.q$a */
    public static final class C10850a implements C10849q {

        /* renamed from: a */
        public final String f24045a;

        /* renamed from: b */
        public final Map<AnalyticsProperty, Object> f24046b;

        public C10850a() {
            throw null;
        }

        public C10850a(int i) {
            Map<AnalyticsProperty, Object> p0 = C19294b0.m32559p0();
            this.f24045a = "filter_ships_to_update_tapped";
            this.f24046b = p0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10850a)) {
                return false;
            }
            C10850a aVar = (C10850a) obj;
            return C19383o.m32792b(this.f24045a, aVar.f24045a) && C19383o.m32792b(this.f24046b, aVar.f24046b);
        }

        public final int hashCode() {
            return this.f24046b.hashCode() + (this.f24045a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("AnalyticsAdHocEvent(eventName=");
            h.append(this.f24045a);
            h.append(", parameters=");
            h.append(this.f24046b);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.refactor.q$b */
    public static final class C10851b implements C10849q {

        /* renamed from: a */
        public final FilterCountry f24047a;

        public C10851b(FilterCountry filterCountry) {
            this.f24047a = filterCountry;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10851b) && C19383o.m32792b(this.f24047a, ((C10851b) obj).f24047a);
        }

        public final int hashCode() {
            return this.f24047a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("NavigateToCountrySelector(filterCountry=");
            h.append(this.f24047a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.refactor.q$c */
    public static final class C10852c implements C10849q {

        /* renamed from: a */
        public final String f24048a;

        /* renamed from: b */
        public final SearchOptions f24049b;

        /* renamed from: c */
        public final boolean f24050c;

        public C10852c(String str, SearchOptions searchOptions, boolean z) {
            this.f24048a = str;
            this.f24049b = searchOptions;
            this.f24050c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10852c)) {
                return false;
            }
            C10852c cVar = (C10852c) obj;
            return C19383o.m32792b(this.f24048a, cVar.f24048a) && C19383o.m32792b(this.f24049b, cVar.f24049b) && this.f24050c == cVar.f24050c;
        }

        public final int hashCode() {
            int hashCode = (this.f24049b.hashCode() + (this.f24048a.hashCode() * 31)) * 31;
            boolean z = this.f24050c;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("NavigateToSearchResultsListings(query=");
            h.append(this.f24048a);
            h.append(", options=");
            h.append(this.f24049b);
            h.append(", includeFeaturedCategories=");
            return C0391c.m1058d(h, this.f24050c, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.refactor.q$d */
    public static final class C10853d implements C10849q {

        /* renamed from: a */
        public final String f24051a;

        public C10853d(String str) {
            C19383o.m32797g(str, "itemId");
            this.f24051a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10853d) && C19383o.m32792b(this.f24051a, ((C10853d) obj).f24051a);
        }

        public final int hashCode() {
            return this.f24051a.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("ScrollToItem(itemId="), this.f24051a, ')');
        }
    }
}
