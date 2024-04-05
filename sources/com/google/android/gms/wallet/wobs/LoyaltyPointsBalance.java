package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "LoyaltyPointsBalanceCreator")
@SafeParcelable.Reserved({1})
public final class LoyaltyPointsBalance extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LoyaltyPointsBalance> CREATOR = new zzh();
    @SafeParcelable.Field(mo49213id = 5)
    public String zzbo;
    @SafeParcelable.Field(mo49213id = 2)
    public int zzgv;
    @SafeParcelable.Field(mo49213id = 3)
    public String zzgw;
    @SafeParcelable.Field(mo49213id = 4)
    public double zzgx;
    @SafeParcelable.Field(mo49213id = 6)
    public long zzgy;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.wallet.wobs.LoyaltyPointsBalance.Type.UNDEFINED", mo49213id = 7)
    public int zzgz;

    /* renamed from: com.google.android.gms.wallet.wobs.LoyaltyPointsBalance$a */
    public final class C15176a {
    }

    @SafeParcelable.Constructor
    public LoyaltyPointsBalance(@SafeParcelable.Param(mo49216id = 2) int i, @SafeParcelable.Param(mo49216id = 3) String str, @SafeParcelable.Param(mo49216id = 4) double d, @SafeParcelable.Param(mo49216id = 5) String str2, @SafeParcelable.Param(mo49216id = 6) long j, @SafeParcelable.Param(mo49216id = 7) int i2) {
        this.zzgv = i;
        this.zzgw = str;
        this.zzgx = d;
        this.zzbo = str2;
        this.zzgy = j;
        this.zzgz = i2;
    }

    public static C15176a newBuilder() {
        new LoyaltyPointsBalance();
        return new C15176a();
    }

    public final String getCurrencyCode() {
        return this.zzbo;
    }

    public final long getCurrencyMicros() {
        return this.zzgy;
    }

    public final double getDouble() {
        return this.zzgx;
    }

    public final int getInt() {
        return this.zzgv;
    }

    public final String getString() {
        return this.zzgw;
    }

    public final int getType() {
        return this.zzgz;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zzgv);
        SafeParcelWriter.writeString(parcel, 3, this.zzgw, false);
        SafeParcelWriter.writeDouble(parcel, 4, this.zzgx);
        SafeParcelWriter.writeString(parcel, 5, this.zzbo, false);
        SafeParcelWriter.writeLong(parcel, 6, this.zzgy);
        SafeParcelWriter.writeInt(parcel, 7, this.zzgz);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public LoyaltyPointsBalance() {
        this.zzgz = -1;
        this.zzgv = -1;
        this.zzgx = -1.0d;
    }
}
