package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "WalletObjectMessageCreator")
@SafeParcelable.Reserved({1})
public final class WalletObjectMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WalletObjectMessage> CREATOR = new zzn();
    @SafeParcelable.Field(mo49213id = 2)
    public String zzhb;
    @SafeParcelable.Field(mo49213id = 3)
    public String zzhc;
    @SafeParcelable.Field(mo49213id = 4)
    public TimeInterval zzhg;
    @SafeParcelable.Field(mo49213id = 5)
    @Deprecated
    public UriData zzhh;
    @SafeParcelable.Field(mo49213id = 6)
    @Deprecated
    public UriData zzhi;

    /* renamed from: com.google.android.gms.wallet.wobs.WalletObjectMessage$a */
    public final class C15177a {
    }

    @SafeParcelable.Constructor
    public WalletObjectMessage(@SafeParcelable.Param(mo49216id = 2) String str, @SafeParcelable.Param(mo49216id = 3) String str2, @SafeParcelable.Param(mo49216id = 4) TimeInterval timeInterval, @SafeParcelable.Param(mo49216id = 5) UriData uriData, @SafeParcelable.Param(mo49216id = 6) UriData uriData2) {
        this.zzhb = str;
        this.zzhc = str2;
        this.zzhg = timeInterval;
        this.zzhh = uriData;
        this.zzhi = uriData2;
    }

    public static C15177a newBuilder() {
        new WalletObjectMessage();
        return new C15177a();
    }

    @Deprecated
    public final UriData getActionUri() {
        return this.zzhh;
    }

    public final String getBody() {
        return this.zzhc;
    }

    public final TimeInterval getDisplayInterval() {
        return this.zzhg;
    }

    public final String getHeader() {
        return this.zzhb;
    }

    @Deprecated
    public final UriData getImageUri() {
        return this.zzhi;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzhb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzhc, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzhg, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzhh, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzhi, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public WalletObjectMessage() {
    }
}
