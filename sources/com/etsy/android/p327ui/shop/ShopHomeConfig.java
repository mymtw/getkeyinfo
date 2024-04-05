package com.etsy.android.p327ui.shop;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.shop.ShopHomeConfig */
public enum ShopHomeConfig implements Parcelable {
    ITEMS_SEARCH(1),
    ABOUT(2),
    POLICIES(3),
    REVIEWS(4);
    
    public static final Parcelable.Creator<ShopHomeConfig> CREATOR = null;
    private final int configType;

    /* renamed from: com.etsy.android.ui.shop.ShopHomeConfig$Creator */
    public static final class Creator implements Parcelable.Creator<ShopHomeConfig> {
        public final ShopHomeConfig createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return ShopHomeConfig.valueOf(parcel.readString());
        }

        public final ShopHomeConfig[] newArray(int i) {
            return new ShopHomeConfig[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new Creator();
    }

    private ShopHomeConfig(int i) {
        this.configType = i;
    }

    public int describeContents() {
        return 0;
    }

    public final int getConfigType() {
        return this.configType;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(name());
    }
}
