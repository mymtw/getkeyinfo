package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.core.EtsyApplication;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.core.ListingViewTrackedObject;
import com.etsy.android.p327ui.listing.ListingFragment;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p001a0.C0005b;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.ListingKey */
public final class ListingKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ListingKey> CREATOR = new Creator();
    public static final C10702a Companion = new C10702a();
    public static final String PARAM_INCLUDE_RELATED_LISTINGS = "include_related_listings";
    public static final String PARAM_SHOULD_SHOW_ADD_TO_CART_INTERSTITIAL = "should_show_add_to_cart_interstitial";
    private final String clazzName;
    private final boolean includeRelatedListings;
    private final EtsyId listingId;
    private final String referrer;
    private final Bundle referrerBundle;
    private final boolean shouldShowAddToCartInterstitial;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.ListingKey$Creator */
    public static final class Creator implements Parcelable.Creator<ListingKey> {
        public final ListingKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            String readString = parcel.readString();
            EtsyId etsyId = (EtsyId) parcel.readSerializable();
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new ListingKey(readString, etsyId, z2, z, parcel.readBundle());
        }

        public final ListingKey[] newArray(int i) {
            return new ListingKey[i];
        }
    }

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.ListingKey$a */
    public static final class C10702a {
    }

    public ListingKey(String str, EtsyId etsyId, boolean z, boolean z2, Bundle bundle) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(etsyId, "listingId");
        this.referrer = str;
        this.listingId = etsyId;
        this.includeRelatedListings = z;
        this.shouldShowAddToCartInterstitial = z2;
        this.referrerBundle = bundle;
        String canonicalName = ListingFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        this.clazzName = canonicalName;
    }

    public static /* synthetic */ ListingKey copy$default(ListingKey listingKey, String str, EtsyId etsyId, boolean z, boolean z2, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            str = listingKey.getReferrer();
        }
        if ((i & 2) != 0) {
            etsyId = listingKey.listingId;
        }
        EtsyId etsyId2 = etsyId;
        if ((i & 4) != 0) {
            z = listingKey.includeRelatedListings;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = listingKey.shouldShowAddToCartInterstitial;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            bundle = listingKey.getReferrerBundle();
        }
        return listingKey.copy(str, etsyId2, z3, z4, bundle);
    }

    public final String component1() {
        return getReferrer();
    }

    public final EtsyId component2() {
        return this.listingId;
    }

    public final boolean component3() {
        return this.includeRelatedListings;
    }

    public final boolean component4() {
        return this.shouldShowAddToCartInterstitial;
    }

    public final Bundle component5() {
        return getReferrerBundle();
    }

    public final ListingKey copy(String str, EtsyId etsyId, boolean z, boolean z2, Bundle bundle) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(etsyId, "listingId");
        return new ListingKey(str, etsyId, z, z2, bundle);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListingKey)) {
            return false;
        }
        ListingKey listingKey = (ListingKey) obj;
        return C19383o.m32792b(getReferrer(), listingKey.getReferrer()) && C19383o.m32792b(this.listingId, listingKey.listingId) && this.includeRelatedListings == listingKey.includeRelatedListings && this.shouldShowAddToCartInterstitial == listingKey.shouldShowAddToCartInterstitial && C19383o.m32792b(getReferrerBundle(), listingKey.getReferrerBundle());
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public C12693a getBackstackGenerator() {
        return new C0005b();
    }

    public String getClazzName() {
        return this.clazzName;
    }

    public boolean getClearBackstack() {
        return false;
    }

    public final boolean getIncludeRelatedListings() {
        return this.includeRelatedListings;
    }

    public final EtsyId getListingId() {
        return this.listingId;
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        fVar.f28304a.put("listing_id", this.listingId);
        EtsyApplication etsyApplication = EtsyApplication.get();
        C19383o.m32796f(etsyApplication, "get()");
        fVar.f28304a.put("TRACKING_PARAMS", new ListingViewTrackedObject(etsyApplication));
        fVar.f28304a.put(PARAM_INCLUDE_RELATED_LISTINGS, Boolean.valueOf(this.includeRelatedListings));
        fVar.f28304a.put(PARAM_SHOULD_SHOW_ADD_TO_CART_INTERSTITIAL, Boolean.valueOf(this.shouldShowAddToCartInterstitial));
        if (getReferrerBundle() != null) {
            fVar.f28304a.put("referral_args", getReferrerBundle());
        }
        return fVar;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return this.referrerBundle;
    }

    public final boolean getShouldShowAddToCartInterstitial() {
        return this.shouldShowAddToCartInterstitial;
    }

    public int hashCode() {
        int hashCode = (this.listingId.hashCode() + (getReferrer().hashCode() * 31)) * 31;
        boolean z = this.includeRelatedListings;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.shouldShowAddToCartInterstitial;
        if (!z3) {
            z2 = z3;
        }
        return ((i + (z2 ? 1 : 0)) * 31) + (getReferrerBundle() == null ? 0 : getReferrerBundle().hashCode());
    }

    public boolean isDialog() {
        return false;
    }

    public boolean isForciblyAddedToCurrentStack() {
        return false;
    }

    public boolean shouldReplaceTop() {
        return false;
    }

    public int storeDataForKey(Object obj) {
        C19383o.m32797g(obj, "value");
        return C12822e.C12823a.m20464a(obj);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ListingKey(referrer=");
        h.append(getReferrer());
        h.append(", listingId=");
        h.append(this.listingId);
        h.append(", includeRelatedListings=");
        h.append(this.includeRelatedListings);
        h.append(", shouldShowAddToCartInterstitial=");
        h.append(this.shouldShowAddToCartInterstitial);
        h.append(", referrerBundle=");
        h.append(getReferrerBundle());
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeSerializable(this.listingId);
        parcel.writeInt(this.includeRelatedListings ? 1 : 0);
        parcel.writeInt(this.shouldShowAddToCartInterstitial ? 1 : 0);
        parcel.writeBundle(this.referrerBundle);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListingKey(String str, EtsyId etsyId, boolean z, boolean z2, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, etsyId, (i & 4) != 0 ? true : z, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? null : bundle);
    }
}
