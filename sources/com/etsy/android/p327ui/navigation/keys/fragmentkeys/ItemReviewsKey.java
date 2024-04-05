package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.feedback.ItemReviewsFragment;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.ItemReviewsKey */
public final class ItemReviewsKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ItemReviewsKey> CREATOR = new Creator();
    private final ItemReviewsFragment.ItemReviewsUiData data;
    private final String referrer;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.ItemReviewsKey$Creator */
    public static final class Creator implements Parcelable.Creator<ItemReviewsKey> {
        public final ItemReviewsKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new ItemReviewsKey(parcel.readString(), ItemReviewsFragment.ItemReviewsUiData.CREATOR.createFromParcel(parcel));
        }

        public final ItemReviewsKey[] newArray(int i) {
            return new ItemReviewsKey[i];
        }
    }

    public ItemReviewsKey(String str, ItemReviewsFragment.ItemReviewsUiData itemReviewsUiData) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(itemReviewsUiData, "data");
        this.referrer = str;
        this.data = itemReviewsUiData;
    }

    public static /* synthetic */ ItemReviewsKey copy$default(ItemReviewsKey itemReviewsKey, String str, ItemReviewsFragment.ItemReviewsUiData itemReviewsUiData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = itemReviewsKey.getReferrer();
        }
        if ((i & 2) != 0) {
            itemReviewsUiData = itemReviewsKey.data;
        }
        return itemReviewsKey.copy(str, itemReviewsUiData);
    }

    public final String component1() {
        return getReferrer();
    }

    public final ItemReviewsFragment.ItemReviewsUiData component2() {
        return this.data;
    }

    public final ItemReviewsKey copy(String str, ItemReviewsFragment.ItemReviewsUiData itemReviewsUiData) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(itemReviewsUiData, "data");
        return new ItemReviewsKey(str, itemReviewsUiData);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemReviewsKey)) {
            return false;
        }
        ItemReviewsKey itemReviewsKey = (ItemReviewsKey) obj;
        return C19383o.m32792b(getReferrer(), itemReviewsKey.getReferrer()) && C19383o.m32792b(this.data, itemReviewsKey.data);
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public C12693a getBackstackGenerator() {
        return new C0005b();
    }

    public String getClazzName() {
        String canonicalName = ItemReviewsFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        return canonicalName;
    }

    public boolean getClearBackstack() {
        return false;
    }

    public final ItemReviewsFragment.ItemReviewsUiData getData() {
        return this.data;
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        fVar.f28304a.put(ItemReviewsFragment.ITEM_REVIEWS_DATA, this.data);
        return fVar;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return null;
    }

    public int hashCode() {
        return this.data.hashCode() + (getReferrer().hashCode() * 31);
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
        StringBuilder h = C0072d.m201h("ItemReviewsKey(referrer=");
        h.append(getReferrer());
        h.append(", data=");
        h.append(this.data);
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        this.data.writeToParcel(parcel, i);
    }
}
