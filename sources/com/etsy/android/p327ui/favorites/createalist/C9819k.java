package com.etsy.android.p327ui.favorites.createalist;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.listing.ListingCard;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.favorites.createalist.k */
public abstract class C9819k {

    /* renamed from: com.etsy.android.ui.favorites.createalist.k$a */
    public static final class C9820a extends C9819k {

        /* renamed from: a */
        public final ListingCard f21716a;

        public C9820a(ListingCard listingCard) {
            this.f21716a = listingCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9820a) && C19383o.m32792b(this.f21716a, ((C9820a) obj).f21716a);
        }

        public final int hashCode() {
            return this.f21716a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("FavoriteDeselected(favorite=");
            h.append(this.f21716a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.favorites.createalist.k$b */
    public static final class C9821b extends C9819k {

        /* renamed from: a */
        public final ListingCard f21717a;

        public C9821b(ListingCard listingCard) {
            this.f21717a = listingCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9821b) && C19383o.m32792b(this.f21717a, ((C9821b) obj).f21717a);
        }

        public final int hashCode() {
            return this.f21717a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("FavoriteSelected(favorite=");
            h.append(this.f21717a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.favorites.createalist.k$c */
    public static final class C9822c extends C9819k {

        /* renamed from: a */
        public static final C9822c f21718a = new C9822c();
    }
}
