package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "LoyaltyPointsCreator")
@SafeParcelable.Reserved({1, 4})
public final class LoyaltyPoints extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LoyaltyPoints> CREATOR = new zzi();
    @SafeParcelable.Field(mo49213id = 2)
    public String label;
    @SafeParcelable.Field(mo49213id = 5)
    @Deprecated
    public TimeInterval zzcq;
    @SafeParcelable.Field(mo49213id = 3)
    public LoyaltyPointsBalance zzgt;

    /* renamed from: com.google.android.gms.wallet.wobs.LoyaltyPoints$a */
    public final class C15175a {
    }

    @SafeParcelable.Constructor
    public LoyaltyPoints(@SafeParcelable.Param(mo49216id = 2) String str, @SafeParcelable.Param(mo49216id = 3) LoyaltyPointsBalance loyaltyPointsBalance, @SafeParcelable.Param(mo49216id = 5) TimeInterval timeInterval) {
        this.label = str;
        this.zzgt = loyaltyPointsBalance;
        this.zzcq = timeInterval;
    }

    public static C15175a newBuilder() {
        new LoyaltyPoints();
        return new C15175a();
    }

    public final LoyaltyPointsBalance getBalance() {
        return this.zzgt;
    }

    public final String getLabel() {
        return this.label;
    }

    @Deprecated
    public final String getType() {
        return null;
    }

    @Deprecated
    public final TimeInterval getValidTimeInterval() {
        return this.zzcq;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.label, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzgt, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzcq, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public LoyaltyPoints() {
    }
}
