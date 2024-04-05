package com.etsy.android.p327ui.favorites.createalist;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.apiv3.Collection;
import com.etsy.android.lib.models.apiv3.listing.ListingCard;
import java.util.Set;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.favorites.createalist.e */
public abstract class C9803e {

    /* renamed from: com.etsy.android.ui.favorites.createalist.e$a */
    public static final class C9804a extends C9803e {

        /* renamed from: a */
        public static final C9804a f21693a = new C9804a();
    }

    /* renamed from: com.etsy.android.ui.favorites.createalist.e$b */
    public static final class C9805b extends C9803e {

        /* renamed from: a */
        public final Collection f21694a;

        /* renamed from: b */
        public final Set<ListingCard> f21695b;

        public C9805b(Collection collection, Set<ListingCard> set) {
            C19383o.m32797g(collection, Collection.TYPE_COLLECTION);
            this.f21694a = collection;
            this.f21695b = set;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9805b)) {
                return false;
            }
            C9805b bVar = (C9805b) obj;
            return C19383o.m32792b(this.f21694a, bVar.f21694a) && C19383o.m32792b(this.f21695b, bVar.f21695b);
        }

        public final int hashCode() {
            return this.f21695b.hashCode() + (this.f21694a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Complete(collection=");
            h.append(this.f21694a);
            h.append(", listings=");
            h.append(this.f21695b);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.favorites.createalist.e$c */
    public static final class C9806c extends C9803e {

        /* renamed from: a */
        public static final C9806c f21696a = new C9806c();
    }

    /* renamed from: com.etsy.android.ui.favorites.createalist.e$d */
    public static final class C9807d extends C9803e {

        /* renamed from: a */
        public final Set<ListingCard> f21697a;

        public C9807d(Set<ListingCard> set) {
            this.f21697a = set;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9807d) && C19383o.m32792b(this.f21697a, ((C9807d) obj).f21697a);
        }

        public final int hashCode() {
            return this.f21697a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Next(selectedFavorites=");
            h.append(this.f21697a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.favorites.createalist.e$e */
    public static final class C9808e extends C9803e {

        /* renamed from: a */
        public final boolean f21698a;

        public C9808e(boolean z) {
            this.f21698a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9808e) && this.f21698a == ((C9808e) obj).f21698a;
        }

        public final int hashCode() {
            boolean z = this.f21698a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return C0391c.m1058d(C0072d.m201h("Select(selectInProgress="), this.f21698a, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.favorites.createalist.e$f */
    public static final class C9809f extends C9803e {

        /* renamed from: a */
        public final boolean f21699a;

        public C9809f(boolean z) {
            this.f21699a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9809f) && this.f21699a == ((C9809f) obj).f21699a;
        }

        public final int hashCode() {
            boolean z = this.f21699a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return C0391c.m1058d(C0072d.m201h("Skip(showBackButton="), this.f21699a, ')');
        }

        public C9809f() {
            this(true);
        }
    }
}
