package p430qe;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.TaxonomyNode;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.SearchContainerDestinationKey;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import kotlin.jvm.internal.C19383o;

/* renamed from: qe.b */
public abstract class C13301b {

    /* renamed from: qe.b$a */
    public static final class C13302a extends C13301b {

        /* renamed from: a */
        public final String f29205a;

        public C13302a(String str) {
            this.f29205a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13302a) && C19383o.m32792b(this.f29205a, ((C13302a) obj).f29205a);
        }

        public final int hashCode() {
            String str = this.f29205a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("AutoSuggest(autoSuggestQuery="), this.f29205a, ')');
        }
    }

    /* renamed from: qe.b$b */
    public static final class C13303b extends C13301b {

        /* renamed from: a */
        public static final C13303b f29206a = new C13303b();
    }

    /* renamed from: qe.b$c */
    public static final class C13304c extends C13301b {

        /* renamed from: a */
        public final TaxonomyNode f29207a;

        public C13304c(TaxonomyNode taxonomyNode) {
            C19383o.m32797g(taxonomyNode, "categoryNode");
            this.f29207a = taxonomyNode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13304c) && C19383o.m32792b(this.f29207a, ((C13304c) obj).f29207a);
        }

        public final int hashCode() {
            return this.f29207a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Category(categoryNode=");
            h.append(this.f29207a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: qe.b$d */
    public static final class C13305d extends C13301b {

        /* renamed from: a */
        public static final C13305d f29208a = new C13305d();
    }

    /* renamed from: qe.b$e */
    public static final class C13306e extends C13301b {

        /* renamed from: a */
        public static final C13306e f29209a = new C13306e();
    }

    /* renamed from: qe.b$f */
    public static final class C13307f extends C13301b {

        /* renamed from: a */
        public final String f29210a;

        public C13307f(String str) {
            this.f29210a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13307f) && C19383o.m32792b(this.f29210a, ((C13307f) obj).f29210a);
        }

        public final int hashCode() {
            return this.f29210a.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("PerformSearch(query="), this.f29210a, ')');
        }
    }

    /* renamed from: qe.b$g */
    public static final class C13308g extends C13301b {

        /* renamed from: a */
        public final String f29211a;

        public C13308g(String str) {
            this.f29211a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13308g) && C19383o.m32792b(this.f29211a, ((C13308g) obj).f29211a);
        }

        public final int hashCode() {
            return this.f29211a.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("PopulateQuery(query="), this.f29211a, ')');
        }
    }

    /* renamed from: qe.b$h */
    public static final class C13309h extends C13301b {

        /* renamed from: a */
        public final SearchContainerDestinationKey f29212a;

        public C13309h(SearchContainerDestinationKey searchContainerDestinationKey) {
            this.f29212a = searchContainerDestinationKey;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13309h) && C19383o.m32792b(this.f29212a, ((C13309h) obj).f29212a);
        }

        public final int hashCode() {
            return this.f29212a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("RedirectDestination(destinationKey=");
            h.append(this.f29212a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: qe.b$i */
    public static final class C13310i extends C13301b {

        /* renamed from: a */
        public final String f29213a;

        /* renamed from: b */
        public final SearchOptions f29214b;

        /* renamed from: c */
        public final Long f29215c;

        /* renamed from: d */
        public final boolean f29216d;

        public C13310i(String str, SearchOptions searchOptions, Long l, boolean z) {
            this.f29213a = str;
            this.f29214b = searchOptions;
            this.f29215c = l;
            this.f29216d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13310i)) {
                return false;
            }
            C13310i iVar = (C13310i) obj;
            return C19383o.m32792b(this.f29213a, iVar.f29213a) && C19383o.m32792b(this.f29214b, iVar.f29214b) && C19383o.m32792b(this.f29215c, iVar.f29215c) && this.f29216d == iVar.f29216d;
        }

        public final int hashCode() {
            int hashCode = this.f29213a.hashCode() * 31;
            SearchOptions searchOptions = this.f29214b;
            int i = 0;
            int hashCode2 = (hashCode + (searchOptions == null ? 0 : searchOptions.hashCode())) * 31;
            Long l = this.f29215c;
            if (l != null) {
                i = l.hashCode();
            }
            int i2 = (hashCode2 + i) * 31;
            boolean z = this.f29216d;
            if (z) {
                z = true;
            }
            return i2 + (z ? 1 : 0);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("SuggestedSearch(query=");
            h.append(this.f29213a);
            h.append(", searchOptions=");
            h.append(this.f29214b);
            h.append(", savedSearchId=");
            h.append(this.f29215c);
            h.append(", isRecentSearch=");
            return C0391c.m1058d(h, this.f29216d, ')');
        }
    }
}
