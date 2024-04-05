package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.core.EtsyApplication;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.exceptions.UnsupportedNavigationException;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.etsy.android.p327ui.shop.ShopHomeConfig;
import com.etsy.android.p327ui.shop.ShopHomeFragment;
import com.etsy.android.p327ui.shop.ShopHomeInitialLoadConfiguration;
import com.etsy.android.p327ui.shop.tabs.ShopFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.ShopHomeKey */
public final class ShopHomeKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ShopHomeKey> CREATOR = new Creator();
    private final boolean favoriteShop;
    private final ShopHomeConfig initialConfig;
    private final Map<String, String> initialConfigPayload;
    private final String referrer;
    private final Bundle referrerBundle;
    private final String referringListingId;
    private final String shopCoupon;
    private final EtsyId shopId;
    private final String shopName;
    private final EtsyId shopUserId;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.ShopHomeKey$Creator */
    public static final class Creator implements Parcelable.Creator<ShopHomeKey> {
        public final ShopHomeKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            String readString = parcel.readString();
            EtsyId etsyId = (EtsyId) parcel.readSerializable();
            LinkedHashMap linkedHashMap = null;
            ShopHomeConfig createFromParcel = parcel.readInt() == 0 ? null : ShopHomeConfig.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            return new ShopHomeKey(readString, etsyId, createFromParcel, linkedHashMap, parcel.readString(), parcel.readString(), (EtsyId) parcel.readSerializable(), parcel.readInt() != 0, parcel.readString(), parcel.readBundle());
        }

        public final ShopHomeKey[] newArray(int i) {
            return new ShopHomeKey[i];
        }
    }

    public ShopHomeKey(String str, EtsyId etsyId, ShopHomeConfig shopHomeConfig, Map<String, String> map, String str2, String str3, EtsyId etsyId2, boolean z, String str4, Bundle bundle) {
        C19383o.m32797g(str, "referrer");
        this.referrer = str;
        this.shopId = etsyId;
        this.initialConfig = shopHomeConfig;
        this.initialConfigPayload = map;
        this.referringListingId = str2;
        this.shopName = str3;
        this.shopUserId = etsyId2;
        this.favoriteShop = z;
        this.shopCoupon = str4;
        this.referrerBundle = bundle;
    }

    public static /* synthetic */ ShopHomeKey copy$default(ShopHomeKey shopHomeKey, String str, EtsyId etsyId, ShopHomeConfig shopHomeConfig, Map map, String str2, String str3, EtsyId etsyId2, boolean z, String str4, Bundle bundle, int i, Object obj) {
        ShopHomeKey shopHomeKey2 = shopHomeKey;
        int i2 = i;
        return shopHomeKey.copy((i2 & 1) != 0 ? shopHomeKey.getReferrer() : str, (i2 & 2) != 0 ? shopHomeKey2.shopId : etsyId, (i2 & 4) != 0 ? shopHomeKey2.initialConfig : shopHomeConfig, (i2 & 8) != 0 ? shopHomeKey2.initialConfigPayload : map, (i2 & 16) != 0 ? shopHomeKey2.referringListingId : str2, (i2 & 32) != 0 ? shopHomeKey2.shopName : str3, (i2 & 64) != 0 ? shopHomeKey2.shopUserId : etsyId2, (i2 & 128) != 0 ? shopHomeKey2.favoriteShop : z, (i2 & 256) != 0 ? shopHomeKey2.shopCoupon : str4, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? shopHomeKey.getReferrerBundle() : bundle);
    }

    public final String component1() {
        return getReferrer();
    }

    public final Bundle component10() {
        return getReferrerBundle();
    }

    public final EtsyId component2() {
        return this.shopId;
    }

    public final ShopHomeConfig component3() {
        return this.initialConfig;
    }

    public final Map<String, String> component4() {
        return this.initialConfigPayload;
    }

    public final String component5() {
        return this.referringListingId;
    }

    public final String component6() {
        return this.shopName;
    }

    public final EtsyId component7() {
        return this.shopUserId;
    }

    public final boolean component8() {
        return this.favoriteShop;
    }

    public final String component9() {
        return this.shopCoupon;
    }

    public final ShopHomeKey copy(String str, EtsyId etsyId, ShopHomeConfig shopHomeConfig, Map<String, String> map, String str2, String str3, EtsyId etsyId2, boolean z, String str4, Bundle bundle) {
        C19383o.m32797g(str, "referrer");
        return new ShopHomeKey(str, etsyId, shopHomeConfig, map, str2, str3, etsyId2, z, str4, bundle);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopHomeKey)) {
            return false;
        }
        ShopHomeKey shopHomeKey = (ShopHomeKey) obj;
        return C19383o.m32792b(getReferrer(), shopHomeKey.getReferrer()) && C19383o.m32792b(this.shopId, shopHomeKey.shopId) && this.initialConfig == shopHomeKey.initialConfig && C19383o.m32792b(this.initialConfigPayload, shopHomeKey.initialConfigPayload) && C19383o.m32792b(this.referringListingId, shopHomeKey.referringListingId) && C19383o.m32792b(this.shopName, shopHomeKey.shopName) && C19383o.m32792b(this.shopUserId, shopHomeKey.shopUserId) && this.favoriteShop == shopHomeKey.favoriteShop && C19383o.m32792b(this.shopCoupon, shopHomeKey.shopCoupon) && C19383o.m32792b(getReferrerBundle(), shopHomeKey.getReferrerBundle());
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public C12693a getBackstackGenerator() {
        return new C0005b();
    }

    public String getClazzName() {
        if (EtsyApplication.get().getEtsyConfigMap().mo21132b(C8592b.C8607o.f18916c)) {
            String canonicalName = ShopFragment.class.getCanonicalName();
            C19383o.m32794d(canonicalName);
            return canonicalName;
        }
        String canonicalName2 = ShopHomeFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName2);
        return canonicalName2;
    }

    public boolean getClearBackstack() {
        return false;
    }

    public final boolean getFavoriteShop() {
        return this.favoriteShop;
    }

    public final ShopHomeConfig getInitialConfig() {
        return this.initialConfig;
    }

    public final Map<String, String> getInitialConfigPayload() {
        return this.initialConfigPayload;
    }

    public C12824f getNavigationParams() {
        if (this.shopId == null) {
            String str = this.shopName;
            if (str == null || str.length() == 0) {
                throw new UnsupportedNavigationException("Shop Home Navigation requires shop id or shop name");
            }
        }
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        if (getReferrerBundle() != null) {
            fVar.f28304a.put("referral_args", getReferrerBundle());
        }
        EtsyId etsyId = this.shopId;
        if (etsyId != null) {
            fVar.f28304a.put("shop_id", etsyId.getId());
        }
        EtsyId etsyId2 = this.shopUserId;
        if (etsyId2 != null) {
            fVar.f28304a.put("user_id", Long.valueOf(etsyId2.getIdAsLong()));
        }
        if (C18263b.m30839d0(this.shopName)) {
            fVar.f28304a.put(ResponseConstants.SHOP_NAME, this.shopName);
        }
        if (this.initialConfig != null) {
            fVar.f28304a.put("shop_home_load_configuration", new ShopHomeInitialLoadConfiguration(this.initialConfig.getConfigType(), this.initialConfigPayload));
        }
        boolean z = this.favoriteShop;
        if (z) {
            fVar.f28304a.put("favorite_shop", Boolean.valueOf(z));
        }
        if (C18263b.m30839d0(this.shopCoupon)) {
            fVar.f28304a.put("coupon", this.shopCoupon);
        }
        if (C18263b.m30839d0(this.referringListingId)) {
            fVar.f28304a.put("referring_listing_id", this.referringListingId);
        }
        return fVar;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return this.referrerBundle;
    }

    public final String getReferringListingId() {
        return this.referringListingId;
    }

    public final String getShopCoupon() {
        return this.shopCoupon;
    }

    public final EtsyId getShopId() {
        return this.shopId;
    }

    public final String getShopName() {
        return this.shopName;
    }

    public final EtsyId getShopUserId() {
        return this.shopUserId;
    }

    public int hashCode() {
        int hashCode = getReferrer().hashCode() * 31;
        EtsyId etsyId = this.shopId;
        int i = 0;
        int hashCode2 = (hashCode + (etsyId == null ? 0 : etsyId.hashCode())) * 31;
        ShopHomeConfig shopHomeConfig = this.initialConfig;
        int hashCode3 = (hashCode2 + (shopHomeConfig == null ? 0 : shopHomeConfig.hashCode())) * 31;
        Map<String, String> map = this.initialConfigPayload;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.referringListingId;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.shopName;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        EtsyId etsyId2 = this.shopUserId;
        int hashCode7 = (hashCode6 + (etsyId2 == null ? 0 : etsyId2.hashCode())) * 31;
        boolean z = this.favoriteShop;
        if (z) {
            z = true;
        }
        int i2 = (hashCode7 + (z ? 1 : 0)) * 31;
        String str3 = this.shopCoupon;
        int hashCode8 = (i2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        if (getReferrerBundle() != null) {
            i = getReferrerBundle().hashCode();
        }
        return hashCode8 + i;
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
        StringBuilder h = C0072d.m201h("ShopHomeKey(referrer=");
        h.append(getReferrer());
        h.append(", shopId=");
        h.append(this.shopId);
        h.append(", initialConfig=");
        h.append(this.initialConfig);
        h.append(", initialConfigPayload=");
        h.append(this.initialConfigPayload);
        h.append(", referringListingId=");
        h.append(this.referringListingId);
        h.append(", shopName=");
        h.append(this.shopName);
        h.append(", shopUserId=");
        h.append(this.shopUserId);
        h.append(", favoriteShop=");
        h.append(this.favoriteShop);
        h.append(", shopCoupon=");
        h.append(this.shopCoupon);
        h.append(", referrerBundle=");
        h.append(getReferrerBundle());
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeSerializable(this.shopId);
        ShopHomeConfig shopHomeConfig = this.initialConfig;
        if (shopHomeConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shopHomeConfig.writeToParcel(parcel, i);
        }
        Map<String, String> map = this.initialConfigPayload;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry next : map.entrySet()) {
                parcel.writeString((String) next.getKey());
                parcel.writeString((String) next.getValue());
            }
        }
        parcel.writeString(this.referringListingId);
        parcel.writeString(this.shopName);
        parcel.writeSerializable(this.shopUserId);
        parcel.writeInt(this.favoriteShop ? 1 : 0);
        parcel.writeString(this.shopCoupon);
        parcel.writeBundle(this.referrerBundle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ShopHomeKey(java.lang.String r11, com.etsy.android.lib.models.datatypes.EtsyId r12, com.etsy.android.p327ui.shop.ShopHomeConfig r13, java.util.Map r14, java.lang.String r15, java.lang.String r16, com.etsy.android.lib.models.datatypes.EtsyId r17, boolean r18, java.lang.String r19, android.os.Bundle r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r10 = this;
            r0 = r21
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r12
        L_0x000a:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r13
        L_0x0011:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r14
        L_0x0018:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r15
        L_0x001f:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0027
        L_0x0025:
            r6 = r16
        L_0x0027:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x002d
            r7 = r2
            goto L_0x002f
        L_0x002d:
            r7 = r17
        L_0x002f:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x0035
            r8 = 0
            goto L_0x0037
        L_0x0035:
            r8 = r18
        L_0x0037:
            r9 = r0 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x003d
            r9 = r2
            goto L_0x003f
        L_0x003d:
            r9 = r19
        L_0x003f:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            r2 = r20
        L_0x0046:
            r12 = r10
            r13 = r11
            r14 = r1
            r15 = r3
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r7
            r20 = r8
            r21 = r9
            r22 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.navigation.keys.fragmentkeys.ShopHomeKey.<init>(java.lang.String, com.etsy.android.lib.models.datatypes.EtsyId, com.etsy.android.ui.shop.ShopHomeConfig, java.util.Map, java.lang.String, java.lang.String, com.etsy.android.lib.models.datatypes.EtsyId, boolean, java.lang.String, android.os.Bundle, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
