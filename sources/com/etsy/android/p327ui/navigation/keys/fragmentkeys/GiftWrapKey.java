package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Image;
import com.etsy.android.p327ui.dialog.GiftWrapDescriptionFragment;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p003a2.C0023f;
import p010a9.C0048b;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.GiftWrapKey */
public final class GiftWrapKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<GiftWrapKey> CREATOR = new Creator();
    private final String description;
    private final Image previewImage;
    private final String referrer;
    private final Bundle referrerBundle;
    private final String shopName;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.GiftWrapKey$Creator */
    public static final class Creator implements Parcelable.Creator<GiftWrapKey> {
        public final GiftWrapKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new GiftWrapKey(parcel.readString(), parcel.readString(), parcel.readString(), (Image) parcel.readSerializable());
        }

        public final GiftWrapKey[] newArray(int i) {
            return new GiftWrapKey[i];
        }
    }

    public GiftWrapKey(String str, String str2, String str3, Image image) {
        C0048b.m167f(str, "referrer", str2, "shopName", str3, "description");
        this.referrer = str;
        this.shopName = str2;
        this.description = str3;
        this.previewImage = image;
    }

    public static /* synthetic */ GiftWrapKey copy$default(GiftWrapKey giftWrapKey, String str, String str2, String str3, Image image, int i, Object obj) {
        if ((i & 1) != 0) {
            str = giftWrapKey.getReferrer();
        }
        if ((i & 2) != 0) {
            str2 = giftWrapKey.shopName;
        }
        if ((i & 4) != 0) {
            str3 = giftWrapKey.description;
        }
        if ((i & 8) != 0) {
            image = giftWrapKey.previewImage;
        }
        return giftWrapKey.copy(str, str2, str3, image);
    }

    public final String component1() {
        return getReferrer();
    }

    public final String component2() {
        return this.shopName;
    }

    public final String component3() {
        return this.description;
    }

    public final Image component4() {
        return this.previewImage;
    }

    public final GiftWrapKey copy(String str, String str2, String str3, Image image) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(str2, "shopName");
        C19383o.m32797g(str3, "description");
        return new GiftWrapKey(str, str2, str3, image);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftWrapKey)) {
            return false;
        }
        GiftWrapKey giftWrapKey = (GiftWrapKey) obj;
        return C19383o.m32792b(getReferrer(), giftWrapKey.getReferrer()) && C19383o.m32792b(this.shopName, giftWrapKey.shopName) && C19383o.m32792b(this.description, giftWrapKey.description) && C19383o.m32792b(this.previewImage, giftWrapKey.previewImage);
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public C12693a getBackstackGenerator() {
        return new C0005b();
    }

    public String getClazzName() {
        String canonicalName = GiftWrapDescriptionFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        return canonicalName;
    }

    public boolean getClearBackstack() {
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        fVar.f28304a.put(ResponseConstants.SHOP_NAME, this.shopName);
        fVar.f28304a.put("gift_info_description", this.description);
        fVar.f28304a.put("gift_info_preview", this.previewImage);
        return fVar;
    }

    public final Image getPreviewImage() {
        return this.previewImage;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return this.referrerBundle;
    }

    public final String getShopName() {
        return this.shopName;
    }

    public int hashCode() {
        int e = C0023f.m105e(this.description, C0023f.m105e(this.shopName, getReferrer().hashCode() * 31, 31), 31);
        Image image = this.previewImage;
        return e + (image == null ? 0 : image.hashCode());
    }

    public boolean isDialog() {
        return true;
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
        StringBuilder h = C0072d.m201h("GiftWrapKey(referrer=");
        h.append(getReferrer());
        h.append(", shopName=");
        h.append(this.shopName);
        h.append(", description=");
        h.append(this.description);
        h.append(", previewImage=");
        h.append(this.previewImage);
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeString(this.shopName);
        parcel.writeString(this.description);
        parcel.writeSerializable(this.previewImage);
    }
}
