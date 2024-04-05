package com.etsy.android.p327ui.search.listingresults;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.models.apiv3.search.QueryCorrection;
import com.etsy.android.lib.models.cardviewelement.Page;
import com.etsy.android.p327ui.search.listingresults.SearchResultsListingsState;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.listingresults.i */
public interface C10909i {

    /* renamed from: com.etsy.android.ui.search.listingresults.i$a */
    public static final class C10910a implements C10909i {

        /* renamed from: a */
        public final String f24219a = "browselistings";

        /* renamed from: b */
        public final Map<AnalyticsProperty, Object> f24220b;

        public C10910a(HashMap hashMap) {
            this.f24220b = hashMap;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10910a)) {
                return false;
            }
            C10910a aVar = (C10910a) obj;
            return C19383o.m32792b(this.f24219a, aVar.f24219a) && C19383o.m32792b(this.f24220b, aVar.f24220b);
        }

        public final int hashCode() {
            return this.f24220b.hashCode() + (this.f24219a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("AnalyticsAdHocEvent(eventName=");
            h.append(this.f24219a);
            h.append(", parameters=");
            h.append(this.f24220b);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.search.listingresults.i$b */
    public static final class C10911b implements C10909i {

        /* renamed from: a */
        public static final C10911b f24221a = new C10911b();
    }

    /* renamed from: com.etsy.android.ui.search.listingresults.i$c */
    public static final class C10912c implements C10909i {

        /* renamed from: a */
        public final SearchResultsListingsState.ViewMode f24222a;

        public C10912c(SearchResultsListingsState.ViewMode viewMode) {
            C19383o.m32797g(viewMode, "viewMode");
            this.f24222a = viewMode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10912c) && this.f24222a == ((C10912c) obj).f24222a;
        }

        public final int hashCode() {
            return this.f24222a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("GridSizeChanged(viewMode=");
            h.append(this.f24222a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.search.listingresults.i$d */
    public static final class C10913d implements C10909i {

        /* renamed from: a */
        public final Throwable f24223a;

        public C10913d(Throwable th) {
            C19383o.m32797g(th, "throwable");
            this.f24223a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10913d) && C19383o.m32792b(this.f24223a, ((C10913d) obj).f24223a);
        }

        public final int hashCode() {
            return this.f24223a.hashCode();
        }

        public final String toString() {
            return C0070b.m185h(C0072d.m201h("HandleError(throwable="), this.f24223a, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.listingresults.i$e */
    public static final class C10914e implements C10909i {

        /* renamed from: a */
        public final Page f24224a;

        public C10914e(Page page) {
            C19383o.m32797g(page, "page");
            this.f24224a = page;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10914e) && C19383o.m32792b(this.f24224a, ((C10914e) obj).f24224a);
        }

        public final int hashCode() {
            return this.f24224a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("SearchResultsLoaded(page=");
            h.append(this.f24224a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.search.listingresults.i$f */
    public static final class C10915f implements C10909i {

        /* renamed from: a */
        public static final C10915f f24225a = new C10915f();
    }

    /* renamed from: com.etsy.android.ui.search.listingresults.i$g */
    public static final class C10916g implements C10909i {

        /* renamed from: a */
        public static final C10916g f24226a = new C10916g();
    }

    /* renamed from: com.etsy.android.ui.search.listingresults.i$h */
    public static final class C10917h implements C10909i {

        /* renamed from: a */
        public static final C10917h f24227a = new C10917h();
    }

    /* renamed from: com.etsy.android.ui.search.listingresults.i$i */
    public static final class C10918i implements C10909i {

        /* renamed from: a */
        public final int f24228a;

        /* renamed from: b */
        public final QueryCorrection f24229b;

        public C10918i(int i, QueryCorrection queryCorrection) {
            this.f24228a = i;
            this.f24229b = queryCorrection;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10918i)) {
                return false;
            }
            C10918i iVar = (C10918i) obj;
            return this.f24228a == iVar.f24228a && C19383o.m32792b(this.f24229b, iVar.f24229b);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.f24228a) * 31;
            QueryCorrection queryCorrection = this.f24229b;
            return hashCode + (queryCorrection == null ? 0 : queryCorrection.hashCode());
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("UpdateFilterHeader(totalResultsCount=");
            h.append(this.f24228a);
            h.append(", queryCorrection=");
            h.append(this.f24229b);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.search.listingresults.i$j */
    public static final class C10919j implements C10909i {

        /* renamed from: a */
        public final Page f24230a;

        /* renamed from: b */
        public final boolean f24231b;

        public C10919j(Page page, boolean z) {
            this.f24230a = page;
            this.f24231b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10919j)) {
                return false;
            }
            C10919j jVar = (C10919j) obj;
            return C19383o.m32792b(this.f24230a, jVar.f24230a) && this.f24231b == jVar.f24231b;
        }

        public final int hashCode() {
            int hashCode = this.f24230a.hashCode() * 31;
            boolean z = this.f24231b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("UpdateGridSize(page=");
            h.append(this.f24230a);
            h.append(", show3x3View=");
            return C0391c.m1058d(h, this.f24231b, ')');
        }
    }
}
