package com.etsy.android.p327ui.search.listingresults;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.listingresults.j */
public interface C10920j {

    /* renamed from: com.etsy.android.ui.search.listingresults.j$b */
    public static final class C10922b implements C10920j {

        /* renamed from: a */
        public static final C10922b f24233a = new C10922b();
    }

    /* renamed from: com.etsy.android.ui.search.listingresults.j$a */
    public static final class C10921a implements C10920j {

        /* renamed from: a */
        public final List<String> f24232a;

        public C10921a() {
            this(0);
        }

        public C10921a(int i) {
            this((List<String>) EmptyList.INSTANCE);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10921a) && C19383o.m32792b(this.f24232a, ((C10921a) obj).f24232a);
        }

        public final int hashCode() {
            return this.f24232a.hashCode();
        }

        public final String toString() {
            return C0070b.m186i(C0072d.m201h("EmptyResults(queries="), this.f24232a, ')');
        }

        public C10921a(List<String> list) {
            C19383o.m32797g(list, "queries");
            this.f24232a = list;
        }
    }
}
