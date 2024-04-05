package com.etsy.android.p327ui.user.inappnotifications;

import android.support.p013v4.media.C0072d;
import android.view.View;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.inappnotifications.IANListingCard;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.etsy.android.stylekit.views.FavHeartButton;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.inappnotifications.r */
public abstract class C11573r {

    /* renamed from: com.etsy.android.ui.user.inappnotifications.r$a */
    public static final class C11574a extends C11573r {

        /* renamed from: a */
        public final IANListingCard f25637a;

        /* renamed from: b */
        public final View f25638b;

        public C11574a(FavHeartButton favHeartButton, IANListingCard iANListingCard) {
            C19383o.m32797g(iANListingCard, ResponseConstants.LISTING);
            this.f25637a = iANListingCard;
            this.f25638b = favHeartButton;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11574a)) {
                return false;
            }
            C11574a aVar = (C11574a) obj;
            return C19383o.m32792b(this.f25637a, aVar.f25637a) && C19383o.m32792b(this.f25638b, aVar.f25638b);
        }

        public final int hashCode() {
            return this.f25638b.hashCode() + (this.f25637a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Favorite(listing=");
            h.append(this.f25637a);
            h.append(", favIcon=");
            h.append(this.f25638b);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.user.inappnotifications.r$b */
    public static final class C11575b extends C11573r {

        /* renamed from: a */
        public final ListingLike f25639a;

        public C11575b(IANListingCard iANListingCard) {
            C19383o.m32797g(iANListingCard, ResponseConstants.LISTING);
            this.f25639a = iANListingCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11575b) && C19383o.m32792b(this.f25639a, ((C11575b) obj).f25639a);
        }

        public final int hashCode() {
            return this.f25639a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ListingClick(listing=");
            h.append(this.f25639a);
            h.append(')');
            return h.toString();
        }
    }
}
