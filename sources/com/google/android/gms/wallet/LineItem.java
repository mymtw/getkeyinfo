package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "LineItemCreator")
@SafeParcelable.Reserved({1})
public final class LineItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LineItem> CREATOR = new zzt();
    @SafeParcelable.Field(mo49213id = 2)
    public String description;
    @SafeParcelable.Field(mo49213id = 5)
    public String zzao;
    @SafeParcelable.Field(mo49213id = 7)
    public String zzap;
    @SafeParcelable.Field(mo49213id = 3)
    public String zzcb;
    @SafeParcelable.Field(mo49213id = 4)
    public String zzcc;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.wallet.LineItem.Role.REGULAR", mo49213id = 6)
    public int zzcd;

    /* renamed from: com.google.android.gms.wallet.LineItem$a */
    public final class C15154a {
    }

    @SafeParcelable.Constructor
    public LineItem(@SafeParcelable.Param(mo49216id = 2) String str, @SafeParcelable.Param(mo49216id = 3) String str2, @SafeParcelable.Param(mo49216id = 4) String str3, @SafeParcelable.Param(mo49216id = 5) String str4, @SafeParcelable.Param(mo49216id = 6) int i, @SafeParcelable.Param(mo49216id = 7) String str5) {
        this.description = str;
        this.zzcb = str2;
        this.zzcc = str3;
        this.zzao = str4;
        this.zzcd = i;
        this.zzap = str5;
    }

    public static C15154a newBuilder() {
        new LineItem();
        return new C15154a();
    }

    public final String getCurrencyCode() {
        return this.zzap;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getQuantity() {
        return this.zzcb;
    }

    public final int getRole() {
        return this.zzcd;
    }

    public final String getTotalPrice() {
        return this.zzao;
    }

    public final String getUnitPrice() {
        return this.zzcc;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.description, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzcb, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzcc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzao, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzcd);
        SafeParcelWriter.writeString(parcel, 7, this.zzap, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public LineItem() {
        this.zzcd = 0;
    }
}
