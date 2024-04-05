package com.etsy.android.p327ui.shop;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.shop.ShopHomeInitialLoadConfiguration */
public final class ShopHomeInitialLoadConfiguration implements Parcelable {
    public static final int $stable = 8;
    public static final int CONFIGURATION_ABOUT = 2;
    public static final int CONFIGURATION_ITEMS_SEARCH = 1;
    public static final int CONFIGURATION_POLICIES = 3;
    public static final int CONFIGURATION_REVIEWS = 4;
    public static final Parcelable.Creator<ShopHomeInitialLoadConfiguration> CREATOR = new Creator();
    public static final C11120a Companion = new C11120a();
    private final int configType;
    private final Map<String, String> payloads;

    /* renamed from: com.etsy.android.ui.shop.ShopHomeInitialLoadConfiguration$Creator */
    public static final class Creator implements Parcelable.Creator<ShopHomeInitialLoadConfiguration> {
        public final ShopHomeInitialLoadConfiguration createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            C19383o.m32797g(parcel, "parcel");
            int readInt = parcel.readInt();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
                for (int i = 0; i != readInt2; i++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
                linkedHashMap = linkedHashMap2;
            }
            return new ShopHomeInitialLoadConfiguration(readInt, linkedHashMap);
        }

        public final ShopHomeInitialLoadConfiguration[] newArray(int i) {
            return new ShopHomeInitialLoadConfiguration[i];
        }
    }

    /* renamed from: com.etsy.android.ui.shop.ShopHomeInitialLoadConfiguration$a */
    public static final class C11120a {
    }

    public ShopHomeInitialLoadConfiguration(int i, Map<String, String> map) {
        this.configType = i;
        this.payloads = map;
    }

    public int describeContents() {
        return 0;
    }

    public final int getConfigType() {
        return this.configType;
    }

    public final Map<String, String> getPayloads() {
        return this.payloads;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeInt(this.configType);
        Map<String, String> map = this.payloads;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry next : map.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeString((String) next.getValue());
        }
    }
}
