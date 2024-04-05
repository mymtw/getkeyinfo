package com.etsy.android.p327ui.search.filters.refactor;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.FacetCountListMap;
import com.etsy.android.lib.models.apiv3.filters.StaticFilters;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.filters.refactor.o */
public interface C10838o {

    /* renamed from: com.etsy.android.ui.search.filters.refactor.o$a */
    public static final class C10839a implements C10838o {

        /* renamed from: a */
        public final Throwable f24000a;

        public C10839a(Exception exc) {
            this.f24000a = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10839a) && C19383o.m32792b(this.f24000a, ((C10839a) obj).f24000a);
        }

        public final int hashCode() {
            return this.f24000a.hashCode();
        }

        public final String toString() {
            return C0070b.m185h(C0072d.m201h("Error(throwable="), this.f24000a, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.refactor.o$b */
    public static final class C10840b implements C10838o {

        /* renamed from: a */
        public final int f24001a;

        /* renamed from: b */
        public final FacetCountListMap f24002b;

        /* renamed from: c */
        public final StaticFilters f24003c;

        public C10840b(int i, FacetCountListMap facetCountListMap, StaticFilters staticFilters) {
            this.f24001a = i;
            this.f24002b = facetCountListMap;
            this.f24003c = staticFilters;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10840b)) {
                return false;
            }
            C10840b bVar = (C10840b) obj;
            return this.f24001a == bVar.f24001a && C19383o.m32792b(this.f24002b, bVar.f24002b) && C19383o.m32792b(this.f24003c, bVar.f24003c);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.f24001a) * 31;
            FacetCountListMap facetCountListMap = this.f24002b;
            int i = 0;
            int hashCode2 = (hashCode + (facetCountListMap == null ? 0 : facetCountListMap.hashCode())) * 31;
            StaticFilters staticFilters = this.f24003c;
            if (staticFilters != null) {
                i = staticFilters.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Success(totalResults=");
            h.append(this.f24001a);
            h.append(", facetCountListMap=");
            h.append(this.f24002b);
            h.append(", staticFilters=");
            h.append(this.f24003c);
            h.append(')');
            return h.toString();
        }
    }
}
