package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.etsy.android.p327ui.shop.ShopSectionListingsFragment;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.C19410j;
import kotlinx.coroutines.C19543e0;
import p003a2.C0023f;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;
import p759nq.C19919a;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.ShopSectionListingsKey */
public final class ShopSectionListingsKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ShopSectionListingsKey> CREATOR = new Creator();
    private final int listingCount;
    private final String referrer;
    private final Bundle referrerBundle;
    private final String sectionId;
    private final String sectionTitle;
    private final String shopId;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.ShopSectionListingsKey$Creator */
    public static final class Creator implements Parcelable.Creator<ShopSectionListingsKey> {
        public final ShopSectionListingsKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new ShopSectionListingsKey(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        public final ShopSectionListingsKey[] newArray(int i) {
            return new ShopSectionListingsKey[i];
        }
    }

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.ShopSectionListingsKey$a */
    public static final class C10705a {

        /* renamed from: f */
        public static final /* synthetic */ C19410j<Object>[] f23605f;

        /* renamed from: a */
        public String f23606a;

        /* renamed from: b */
        public String f23607b;

        /* renamed from: c */
        public String f23608c;

        /* renamed from: d */
        public String f23609d;

        /* renamed from: e */
        public final C19919a f23610e = new C19919a();

        static {
            MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(C10705a.class, "listingCount", "getListingCount()I", 0);
            C19386q.f43269a.getClass();
            f23605f = new C19410j[]{mutablePropertyReference1Impl};
        }
    }

    public ShopSectionListingsKey(String str, String str2, String str3, String str4, int i) {
        C0391c.m1060g(str, "referrer", str2, "shopId", str3, "sectionId", str4, "sectionTitle");
        this.referrer = str;
        this.shopId = str2;
        this.sectionId = str3;
        this.sectionTitle = str4;
        this.listingCount = i;
    }

    public static /* synthetic */ ShopSectionListingsKey copy$default(ShopSectionListingsKey shopSectionListingsKey, String str, String str2, String str3, String str4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = shopSectionListingsKey.getReferrer();
        }
        if ((i2 & 2) != 0) {
            str2 = shopSectionListingsKey.shopId;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = shopSectionListingsKey.sectionId;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            str4 = shopSectionListingsKey.sectionTitle;
        }
        String str7 = str4;
        if ((i2 & 16) != 0) {
            i = shopSectionListingsKey.listingCount;
        }
        return shopSectionListingsKey.copy(str, str5, str6, str7, i);
    }

    public final String component1() {
        return getReferrer();
    }

    public final String component2() {
        return this.shopId;
    }

    public final String component3() {
        return this.sectionId;
    }

    public final String component4() {
        return this.sectionTitle;
    }

    public final int component5() {
        return this.listingCount;
    }

    public final ShopSectionListingsKey copy(String str, String str2, String str3, String str4, int i) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(str2, "shopId");
        C19383o.m32797g(str3, "sectionId");
        C19383o.m32797g(str4, "sectionTitle");
        return new ShopSectionListingsKey(str, str2, str3, str4, i);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopSectionListingsKey)) {
            return false;
        }
        ShopSectionListingsKey shopSectionListingsKey = (ShopSectionListingsKey) obj;
        return C19383o.m32792b(getReferrer(), shopSectionListingsKey.getReferrer()) && C19383o.m32792b(this.shopId, shopSectionListingsKey.shopId) && C19383o.m32792b(this.sectionId, shopSectionListingsKey.sectionId) && C19383o.m32792b(this.sectionTitle, shopSectionListingsKey.sectionTitle) && this.listingCount == shopSectionListingsKey.listingCount;
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public C12693a getBackstackGenerator() {
        return new C19543e0();
    }

    public String getClazzName() {
        String canonicalName = ShopSectionListingsFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        return canonicalName;
    }

    public boolean getClearBackstack() {
        return false;
    }

    public final int getListingCount() {
        return this.listingCount;
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        fVar.f28304a.put("shop_id", this.shopId);
        fVar.f28304a.put("section_id", this.sectionId);
        fVar.f28304a.put(ShopSectionListingsFragment.SECTION_TITLE, this.sectionTitle);
        fVar.f28304a.put(ShopSectionListingsFragment.LISTING_COUNT, Integer.valueOf(this.listingCount));
        return fVar;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return this.referrerBundle;
    }

    public final String getSectionId() {
        return this.sectionId;
    }

    public final String getSectionTitle() {
        return this.sectionTitle;
    }

    public final String getShopId() {
        return this.shopId;
    }

    public int hashCode() {
        return Integer.hashCode(this.listingCount) + C0023f.m105e(this.sectionTitle, C0023f.m105e(this.sectionId, C0023f.m105e(this.shopId, getReferrer().hashCode() * 31, 31), 31), 31);
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
        StringBuilder h = C0072d.m201h("ShopSectionListingsKey(referrer=");
        h.append(getReferrer());
        h.append(", shopId=");
        h.append(this.shopId);
        h.append(", sectionId=");
        h.append(this.sectionId);
        h.append(", sectionTitle=");
        h.append(this.sectionTitle);
        h.append(", listingCount=");
        return C0073e.m208h(h, this.listingCount, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeString(this.shopId);
        parcel.writeString(this.sectionId);
        parcel.writeString(this.sectionTitle);
        parcel.writeInt(this.listingCount);
    }
}
