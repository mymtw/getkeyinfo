package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.SingleListingCheckout;
import com.etsy.android.lib.models.apiv3.cart.SingleListingCart;
import com.etsy.android.p327ui.dialog.SingleListingCheckoutSADialog;
import com.etsy.android.p327ui.dialog.SingleListingCheckoutStandalonePayPalSADialog;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p003a2.C0023f;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.SingleListingCheckoutDialogKey */
public final class SingleListingCheckoutDialogKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SingleListingCheckoutDialogKey> CREATOR = new Creator();
    private final String listingId;
    private final String offeringId;
    private final String personalization;
    private final String quantity;
    private final String referrer;
    private final Bundle referrerBundle;
    private final String selectedVariations;
    private final SingleListingCart singleListingCart;
    private final SingleListingCheckout singleListingCheckout;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.SingleListingCheckoutDialogKey$Creator */
    public static final class Creator implements Parcelable.Creator<SingleListingCheckoutDialogKey> {
        public final SingleListingCheckoutDialogKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new SingleListingCheckoutDialogKey(parcel.readString(), parcel.readString(), SingleListingCheckout.CREATOR.createFromParcel(parcel), (SingleListingCart) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final SingleListingCheckoutDialogKey[] newArray(int i) {
            return new SingleListingCheckoutDialogKey[i];
        }
    }

    public SingleListingCheckoutDialogKey(String str, String str2, SingleListingCheckout singleListingCheckout2, SingleListingCart singleListingCart2, String str3, String str4, String str5, String str6) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(str2, "listingId");
        C19383o.m32797g(singleListingCheckout2, "singleListingCheckout");
        C19383o.m32797g(str3, ResponseConstants.QUANTITY);
        this.referrer = str;
        this.listingId = str2;
        this.singleListingCheckout = singleListingCheckout2;
        this.singleListingCart = singleListingCart2;
        this.quantity = str3;
        this.offeringId = str4;
        this.personalization = str5;
        this.selectedVariations = str6;
    }

    public static /* synthetic */ SingleListingCheckoutDialogKey copy$default(SingleListingCheckoutDialogKey singleListingCheckoutDialogKey, String str, String str2, SingleListingCheckout singleListingCheckout2, SingleListingCart singleListingCart2, String str3, String str4, String str5, String str6, int i, Object obj) {
        SingleListingCheckoutDialogKey singleListingCheckoutDialogKey2 = singleListingCheckoutDialogKey;
        int i2 = i;
        return singleListingCheckoutDialogKey.copy((i2 & 1) != 0 ? singleListingCheckoutDialogKey.getReferrer() : str, (i2 & 2) != 0 ? singleListingCheckoutDialogKey2.listingId : str2, (i2 & 4) != 0 ? singleListingCheckoutDialogKey2.singleListingCheckout : singleListingCheckout2, (i2 & 8) != 0 ? singleListingCheckoutDialogKey2.singleListingCart : singleListingCart2, (i2 & 16) != 0 ? singleListingCheckoutDialogKey2.quantity : str3, (i2 & 32) != 0 ? singleListingCheckoutDialogKey2.offeringId : str4, (i2 & 64) != 0 ? singleListingCheckoutDialogKey2.personalization : str5, (i2 & 128) != 0 ? singleListingCheckoutDialogKey2.selectedVariations : str6);
    }

    public final String component1() {
        return getReferrer();
    }

    public final String component2() {
        return this.listingId;
    }

    public final SingleListingCheckout component3() {
        return this.singleListingCheckout;
    }

    public final SingleListingCart component4() {
        return this.singleListingCart;
    }

    public final String component5() {
        return this.quantity;
    }

    public final String component6() {
        return this.offeringId;
    }

    public final String component7() {
        return this.personalization;
    }

    public final String component8() {
        return this.selectedVariations;
    }

    public final SingleListingCheckoutDialogKey copy(String str, String str2, SingleListingCheckout singleListingCheckout2, SingleListingCart singleListingCart2, String str3, String str4, String str5, String str6) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(str2, "listingId");
        C19383o.m32797g(singleListingCheckout2, "singleListingCheckout");
        C19383o.m32797g(str3, ResponseConstants.QUANTITY);
        return new SingleListingCheckoutDialogKey(str, str2, singleListingCheckout2, singleListingCart2, str3, str4, str5, str6);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingleListingCheckoutDialogKey)) {
            return false;
        }
        SingleListingCheckoutDialogKey singleListingCheckoutDialogKey = (SingleListingCheckoutDialogKey) obj;
        return C19383o.m32792b(getReferrer(), singleListingCheckoutDialogKey.getReferrer()) && C19383o.m32792b(this.listingId, singleListingCheckoutDialogKey.listingId) && C19383o.m32792b(this.singleListingCheckout, singleListingCheckoutDialogKey.singleListingCheckout) && C19383o.m32792b(this.singleListingCart, singleListingCheckoutDialogKey.singleListingCart) && C19383o.m32792b(this.quantity, singleListingCheckoutDialogKey.quantity) && C19383o.m32792b(this.offeringId, singleListingCheckoutDialogKey.offeringId) && C19383o.m32792b(this.personalization, singleListingCheckoutDialogKey.personalization) && C19383o.m32792b(this.selectedVariations, singleListingCheckoutDialogKey.selectedVariations);
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public C12693a getBackstackGenerator() {
        return new C0005b();
    }

    public String getClazzName() {
        if (isStandalonePayPal()) {
            String canonicalName = SingleListingCheckoutStandalonePayPalSADialog.class.getCanonicalName();
            C19383o.m32794d(canonicalName);
            return canonicalName;
        }
        String canonicalName2 = SingleListingCheckoutSADialog.class.getCanonicalName();
        C19383o.m32794d(canonicalName2);
        return canonicalName2;
    }

    public boolean getClearBackstack() {
        return false;
    }

    public final String getListingId() {
        return this.listingId;
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        fVar.f28304a.put("listing_id", this.listingId);
        fVar.f28304a.put(ResponseConstants.SINGLE_LISTING_CHECKOUT, this.singleListingCheckout);
        fVar.f28304a.put(ResponseConstants.QUANTITY, this.quantity);
        SingleListingCart singleListingCart2 = this.singleListingCart;
        if (singleListingCart2 != null) {
            fVar.f28304a.put("single_listing_cart", singleListingCart2);
        }
        if (C18263b.m30839d0(this.offeringId)) {
            fVar.f28304a.put(ResponseConstants.OFFERING_ID, this.offeringId);
        }
        if (C18263b.m30839d0(this.selectedVariations)) {
            fVar.f28304a.put("listing_variation", this.selectedVariations);
        }
        if (C18263b.m30839d0(this.personalization)) {
            fVar.f28304a.put(ResponseConstants.PERSONALIZATION, this.personalization);
        }
        return fVar;
    }

    public final String getOfferingId() {
        return this.offeringId;
    }

    public final String getPersonalization() {
        return this.personalization;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return this.referrerBundle;
    }

    public final String getSelectedVariations() {
        return this.selectedVariations;
    }

    public final SingleListingCart getSingleListingCart() {
        return this.singleListingCart;
    }

    public final SingleListingCheckout getSingleListingCheckout() {
        return this.singleListingCheckout;
    }

    public int hashCode() {
        int hashCode = (this.singleListingCheckout.hashCode() + C0023f.m105e(this.listingId, getReferrer().hashCode() * 31, 31)) * 31;
        SingleListingCart singleListingCart2 = this.singleListingCart;
        int i = 0;
        int e = C0023f.m105e(this.quantity, (hashCode + (singleListingCart2 == null ? 0 : singleListingCart2.hashCode())) * 31, 31);
        String str = this.offeringId;
        int hashCode2 = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.personalization;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.selectedVariations;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public boolean isDialog() {
        return true;
    }

    public boolean isForciblyAddedToCurrentStack() {
        return false;
    }

    public final boolean isStandalonePayPal() {
        return this.singleListingCheckout.isStandalonePaypal();
    }

    public boolean shouldReplaceTop() {
        return false;
    }

    public int storeDataForKey(Object obj) {
        C19383o.m32797g(obj, "value");
        return C12822e.C12823a.m20464a(obj);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("SingleListingCheckoutDialogKey(referrer=");
        h.append(getReferrer());
        h.append(", listingId=");
        h.append(this.listingId);
        h.append(", singleListingCheckout=");
        h.append(this.singleListingCheckout);
        h.append(", singleListingCart=");
        h.append(this.singleListingCart);
        h.append(", quantity=");
        h.append(this.quantity);
        h.append(", offeringId=");
        h.append(this.offeringId);
        h.append(", personalization=");
        h.append(this.personalization);
        h.append(", selectedVariations=");
        return C0391c.m1057c(h, this.selectedVariations, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeString(this.listingId);
        this.singleListingCheckout.writeToParcel(parcel, i);
        parcel.writeSerializable(this.singleListingCart);
        parcel.writeString(this.quantity);
        parcel.writeString(this.offeringId);
        parcel.writeString(this.personalization);
        parcel.writeString(this.selectedVariations);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SingleListingCheckoutDialogKey(java.lang.String r13, java.lang.String r14, com.etsy.android.lib.models.SingleListingCheckout r15, com.etsy.android.lib.models.apiv3.cart.SingleListingCart r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r12 = this;
            r0 = r21
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r7 = r2
            goto L_0x000b
        L_0x0009:
            r7 = r16
        L_0x000b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0011
            r9 = r2
            goto L_0x0013
        L_0x0011:
            r9 = r18
        L_0x0013:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0019
            r10 = r2
            goto L_0x001b
        L_0x0019:
            r10 = r19
        L_0x001b:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0021
            r11 = r2
            goto L_0x0023
        L_0x0021:
            r11 = r20
        L_0x0023:
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r8 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.navigation.keys.fragmentkeys.SingleListingCheckoutDialogKey.<init>(java.lang.String, java.lang.String, com.etsy.android.lib.models.SingleListingCheckout, com.etsy.android.lib.models.apiv3.cart.SingleListingCart, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
