package com.etsy.android.p327ui.search.p330v2.suggestions;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0391c;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p010a9.C0048b;

/* renamed from: com.etsy.android.ui.search.v2.suggestions.o */
public abstract class C11064o {

    /* renamed from: com.etsy.android.ui.search.v2.suggestions.o$a */
    public static final class C11065a extends C11064o {

        /* renamed from: a */
        public final String f24519a;

        /* renamed from: b */
        public final int f24520b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11065a(String str, int i) {
            super(str, i);
            C19383o.m32797g(str, "value");
            this.f24519a = str;
            this.f24520b = i;
        }

        /* renamed from: a */
        public final int mo36652a() {
            return this.f24520b;
        }

        /* renamed from: b */
        public final String mo36653b() {
            return this.f24519a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11065a)) {
                return false;
            }
            C11065a aVar = (C11065a) obj;
            return C19383o.m32792b(this.f24519a, aVar.f24519a) && this.f24520b == aVar.f24520b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f24520b) + (this.f24519a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Autosuggest(value=");
            h.append(this.f24519a);
            h.append(", position=");
            return C0073e.m208h(h, this.f24520b, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.suggestions.o$b */
    public static final class C11066b extends C11064o {

        /* renamed from: a */
        public final String f24521a;

        /* renamed from: b */
        public final int f24522b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11066b(String str, int i) {
            super(str, i);
            C19383o.m32797g(str, "value");
            this.f24521a = str;
            this.f24522b = i;
        }

        /* renamed from: a */
        public final int mo36652a() {
            return this.f24522b;
        }

        /* renamed from: b */
        public final String mo36653b() {
            return this.f24521a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11066b)) {
                return false;
            }
            C11066b bVar = (C11066b) obj;
            return C19383o.m32792b(this.f24521a, bVar.f24521a) && this.f24522b == bVar.f24522b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f24522b) + (this.f24521a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Popular(value=");
            h.append(this.f24521a);
            h.append(", position=");
            return C0073e.m208h(h, this.f24522b, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.suggestions.o$c */
    public static final class C11067c extends C11064o {

        /* renamed from: a */
        public final String f24523a;

        /* renamed from: b */
        public final int f24524b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11067c(String str, int i) {
            super(str, i);
            C19383o.m32797g(str, "value");
            this.f24523a = str;
            this.f24524b = i;
        }

        /* renamed from: a */
        public final int mo36652a() {
            return this.f24524b;
        }

        /* renamed from: b */
        public final String mo36653b() {
            return this.f24523a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11067c)) {
                return false;
            }
            C11067c cVar = (C11067c) obj;
            return C19383o.m32792b(this.f24523a, cVar.f24523a) && this.f24524b == cVar.f24524b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f24524b) + (this.f24523a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Recent(value=");
            h.append(this.f24523a);
            h.append(", position=");
            return C0073e.m208h(h, this.f24524b, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.suggestions.o$d */
    public static final class C11068d extends C11064o {

        /* renamed from: a */
        public final String f24525a;

        /* renamed from: b */
        public final String f24526b;

        /* renamed from: c */
        public final String f24527c;

        /* renamed from: d */
        public final boolean f24528d;

        /* renamed from: e */
        public final int f24529e = -1;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11068d(String str, String str2, boolean z, String str3) {
            super(str, -1);
            C0048b.m167f(str, "value", str2, "listingId", str3, "imgSrc");
            this.f24525a = str;
            this.f24526b = str2;
            this.f24527c = str3;
            this.f24528d = z;
        }

        /* renamed from: a */
        public final int mo36652a() {
            return this.f24529e;
        }

        /* renamed from: b */
        public final String mo36653b() {
            return this.f24525a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11068d)) {
                return false;
            }
            C11068d dVar = (C11068d) obj;
            return C19383o.m32792b(this.f24525a, dVar.f24525a) && C19383o.m32792b(this.f24526b, dVar.f24526b) && C19383o.m32792b(this.f24527c, dVar.f24527c) && this.f24528d == dVar.f24528d && this.f24529e == dVar.f24529e;
        }

        public final int hashCode() {
            int e = C0023f.m105e(this.f24527c, C0023f.m105e(this.f24526b, this.f24525a.hashCode() * 31, 31), 31);
            boolean z = this.f24528d;
            if (z) {
                z = true;
            }
            return Integer.hashCode(this.f24529e) + ((e + (z ? 1 : 0)) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("RecentView(value=");
            h.append(this.f24525a);
            h.append(", listingId=");
            h.append(this.f24526b);
            h.append(", imgSrc=");
            h.append(this.f24527c);
            h.append(", isFav=");
            h.append(this.f24528d);
            h.append(", position=");
            return C0073e.m208h(h, this.f24529e, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.suggestions.o$e */
    public static final class C11069e extends C11064o {

        /* renamed from: a */
        public final String f24530a;

        /* renamed from: b */
        public final int f24531b;

        /* renamed from: c */
        public final String f24532c;

        /* renamed from: d */
        public final long f24533d;

        /* renamed from: e */
        public final Map<String, String> f24534e;

        /* renamed from: f */
        public final boolean f24535f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11069e(String str, int i, String str2, long j, Map<String, String> map, boolean z) {
            super(str, i);
            C19383o.m32797g(str, "value");
            C19383o.m32797g(str2, "filtersDisplayValue");
            C19383o.m32797g(map, "filters");
            this.f24530a = str;
            this.f24531b = i;
            this.f24532c = str2;
            this.f24533d = j;
            this.f24534e = map;
            this.f24535f = z;
        }

        /* renamed from: a */
        public final int mo36652a() {
            return this.f24531b;
        }

        /* renamed from: b */
        public final String mo36653b() {
            return this.f24530a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11069e)) {
                return false;
            }
            C11069e eVar = (C11069e) obj;
            return C19383o.m32792b(this.f24530a, eVar.f24530a) && this.f24531b == eVar.f24531b && C19383o.m32792b(this.f24532c, eVar.f24532c) && this.f24533d == eVar.f24533d && C19383o.m32792b(this.f24534e, eVar.f24534e) && this.f24535f == eVar.f24535f;
        }

        public final int hashCode() {
            int hashCode = (this.f24534e.hashCode() + C0071c.m190b(this.f24533d, C0023f.m105e(this.f24532c, C0069a.m170a(this.f24531b, this.f24530a.hashCode() * 31, 31), 31), 31)) * 31;
            boolean z = this.f24535f;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("SavedSearchQuery(value=");
            h.append(this.f24530a);
            h.append(", position=");
            h.append(this.f24531b);
            h.append(", filtersDisplayValue=");
            h.append(this.f24532c);
            h.append(", savedSearchId=");
            h.append(this.f24533d);
            h.append(", filters=");
            h.append(this.f24534e);
            h.append(", shouldDisplayNewResultsBadge=");
            return C0391c.m1058d(h, this.f24535f, ')');
        }
    }

    public C11064o(String str, int i) {
    }

    /* renamed from: a */
    public abstract int mo36652a();

    /* renamed from: b */
    public abstract String mo36653b();
}
