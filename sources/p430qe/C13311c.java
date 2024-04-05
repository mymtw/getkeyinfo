package p430qe;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.TaxonomyNode;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import com.etsy.android.p327ui.search.p330v2.suggestions.C11083w;
import kotlin.jvm.internal.C19383o;
import p003a2.C0015b;

/* renamed from: qe.c */
public abstract class C13311c {

    /* renamed from: qe.c$a */
    public static final class C13312a extends C13311c {

        /* renamed from: a */
        public static final C13312a f29217a = new C13312a();
    }

    /* renamed from: qe.c$b */
    public static final class C13313b extends C13311c {

        /* renamed from: a */
        public final TaxonomyNode f29218a;

        public C13313b(TaxonomyNode taxonomyNode) {
            this.f29218a = taxonomyNode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13313b) && C19383o.m32792b(this.f29218a, ((C13313b) obj).f29218a);
        }

        public final int hashCode() {
            return this.f29218a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Category(categoryNode=");
            h.append(this.f29218a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: qe.c$c */
    public static final class C13314c extends C13311c {

        /* renamed from: a */
        public static final C13314c f29219a = new C13314c();
    }

    /* renamed from: qe.c$d */
    public static final class C13315d extends C13311c {

        /* renamed from: a */
        public final String f29220a;

        public C13315d(String str) {
            C19383o.m32797g(str, "query");
            this.f29220a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13315d) && C19383o.m32792b(this.f29220a, ((C13315d) obj).f29220a);
        }

        public final int hashCode() {
            return this.f29220a.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("DeleteQuery(query="), this.f29220a, ')');
        }
    }

    /* renamed from: qe.c$e */
    public static final class C13316e extends C13311c {

        /* renamed from: a */
        public final long f29221a;

        public C13316e(long j) {
            this.f29221a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13316e) && this.f29221a == ((C13316e) obj).f29221a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f29221a);
        }

        public final String toString() {
            return C0015b.m91j(C0072d.m201h("DeleteSavedSearch(savedSearchId="), this.f29221a, ')');
        }
    }

    /* renamed from: qe.c$f */
    public static final class C13317f extends C13311c {

        /* renamed from: a */
        public final int f29222a;

        public C13317f(int i) {
            this.f29222a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13317f) && this.f29222a == ((C13317f) obj).f29222a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f29222a);
        }

        public final String toString() {
            return C0073e.m208h(C0072d.m201h("FetchMoreSavedSearches(position="), this.f29222a, ')');
        }
    }

    /* renamed from: qe.c$g */
    public static final class C13318g extends C13311c {

        /* renamed from: a */
        public static final C13318g f29223a = new C13318g();
    }

    /* renamed from: qe.c$h */
    public static final class C13319h extends C13311c {

        /* renamed from: a */
        public static final C13319h f29224a = new C13319h();
    }

    /* renamed from: qe.c$i */
    public static final class C13320i extends C13311c {

        /* renamed from: a */
        public final String f29225a;

        public C13320i(String str) {
            C19383o.m32797g(str, "deepLink");
            this.f29225a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13320i) && C19383o.m32792b(this.f29225a, ((C13320i) obj).f29225a);
        }

        public final int hashCode() {
            return this.f29225a.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("GiftGuide(deepLink="), this.f29225a, ')');
        }
    }

    /* renamed from: qe.c$j */
    public static final class C13321j extends C13311c {

        /* renamed from: a */
        public final String f29226a;

        public C13321j(String str) {
            C19383o.m32797g(str, "listingId");
            this.f29226a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13321j) && C19383o.m32792b(this.f29226a, ((C13321j) obj).f29226a);
        }

        public final int hashCode() {
            return this.f29226a.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("Listing(listingId="), this.f29226a, ')');
        }
    }

    /* renamed from: qe.c$k */
    public static final class C13322k extends C13311c {

        /* renamed from: a */
        public final C11083w.C11093j f29227a;

        public C13322k(C11083w.C11093j jVar) {
            C19383o.m32797g(jVar, "moreShopsSearchSuggestion");
            this.f29227a = jVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13322k) && C19383o.m32792b(this.f29227a, ((C13322k) obj).f29227a);
        }

        public final int hashCode() {
            return this.f29227a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("MoreShop(moreShopsSearchSuggestion=");
            h.append(this.f29227a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: qe.c$l */
    public static final class C13323l extends C13311c {

        /* renamed from: a */
        public final String f29228a;

        public C13323l(String str) {
            C19383o.m32797g(str, "query");
            this.f29228a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13323l) && C19383o.m32792b(this.f29228a, ((C13323l) obj).f29228a);
        }

        public final int hashCode() {
            return this.f29228a.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("PopulateSuggestion(query="), this.f29228a, ')');
        }
    }

    /* renamed from: qe.c$m */
    public static final class C13324m extends C13311c {

        /* renamed from: a */
        public final String f29229a;

        /* renamed from: b */
        public final SearchOptions f29230b;

        /* renamed from: c */
        public final Long f29231c;

        /* renamed from: d */
        public final boolean f29232d;

        public C13324m(String str, SearchOptions searchOptions, Long l, boolean z) {
            C19383o.m32797g(str, "query");
            this.f29229a = str;
            this.f29230b = searchOptions;
            this.f29231c = l;
            this.f29232d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13324m)) {
                return false;
            }
            C13324m mVar = (C13324m) obj;
            return C19383o.m32792b(this.f29229a, mVar.f29229a) && C19383o.m32792b(this.f29230b, mVar.f29230b) && C19383o.m32792b(this.f29231c, mVar.f29231c) && this.f29232d == mVar.f29232d;
        }

        public final int hashCode() {
            int hashCode = this.f29229a.hashCode() * 31;
            SearchOptions searchOptions = this.f29230b;
            int i = 0;
            int hashCode2 = (hashCode + (searchOptions == null ? 0 : searchOptions.hashCode())) * 31;
            Long l = this.f29231c;
            if (l != null) {
                i = l.hashCode();
            }
            int i2 = (hashCode2 + i) * 31;
            boolean z = this.f29232d;
            if (z) {
                z = true;
            }
            return i2 + (z ? 1 : 0);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("SearchSuggestion(query=");
            h.append(this.f29229a);
            h.append(", searchOptions=");
            h.append(this.f29230b);
            h.append(", savedSearchId=");
            h.append(this.f29231c);
            h.append(", isRecentSearch=");
            return C0391c.m1058d(h, this.f29232d, ')');
        }
    }

    /* renamed from: qe.c$n */
    public static final class C13325n extends C13311c {

        /* renamed from: a */
        public final C11083w.C11097n f29233a;

        public C13325n(C11083w.C11097n nVar) {
            C19383o.m32797g(nVar, "shopSearchSuggestion");
            this.f29233a = nVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13325n) && C19383o.m32792b(this.f29233a, ((C13325n) obj).f29233a);
        }

        public final int hashCode() {
            return this.f29233a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Shop(shopSearchSuggestion=");
            h.append(this.f29233a);
            h.append(')');
            return h.toString();
        }
    }
}
