package p400mf;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.interfaces.ListingLike;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: mf.b */
public abstract class C13074b {

    /* renamed from: mf.b$a */
    public static final class C13075a extends C13074b {

        /* renamed from: a */
        public final long f28745a;

        /* renamed from: b */
        public final boolean f28746b;

        /* renamed from: c */
        public final List<String> f28747c;

        /* renamed from: d */
        public final ListingLike f28748d;

        public C13075a(long j, boolean z, List<String> list, ListingLike listingLike) {
            C19383o.m32797g(listingLike, ResponseConstants.LISTING);
            this.f28745a = j;
            this.f28746b = z;
            this.f28747c = list;
            this.f28748d = listingLike;
        }
    }

    /* renamed from: mf.b$b */
    public static final class C13076b extends C13074b {

        /* renamed from: a */
        public final long f28749a;

        /* renamed from: b */
        public final boolean f28750b;

        /* renamed from: c */
        public final ListingLike f28751c;

        public C13076b(long j, boolean z, ListingLike listingLike) {
            C19383o.m32797g(listingLike, ResponseConstants.LISTING);
            this.f28749a = j;
            this.f28750b = z;
            this.f28751c = listingLike;
        }
    }

    /* renamed from: mf.b$c */
    public static final class C13077c extends C13074b {

        /* renamed from: a */
        public final long f28752a;

        /* renamed from: b */
        public final boolean f28753b;

        public C13077c(long j, String str, boolean z) {
            C19383o.m32797g(str, "shopName");
            this.f28752a = j;
            this.f28753b = z;
        }
    }
}
