package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "TransactionInfoCreator")
public final class TransactionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TransactionInfo> CREATOR = new zzap();
    @SafeParcelable.Field(mo49213id = 2)
    public String zzao;
    @SafeParcelable.Field(mo49213id = 3)
    public String zzap;
    @SafeParcelable.Field(mo49213id = 1)
    public int zzep;

    /* renamed from: com.google.android.gms.wallet.TransactionInfo$a */
    public final class C15162a {
    }

    @SafeParcelable.Constructor
    public TransactionInfo(@SafeParcelable.Param(mo49216id = 1) int i, @SafeParcelable.Param(mo49216id = 2) String str, @SafeParcelable.Param(mo49216id = 3) String str2) {
        this.zzep = i;
        this.zzao = str;
        this.zzap = str2;
    }

    public static C15162a newBuilder() {
        new TransactionInfo();
        return new C15162a();
    }

    public final String getCurrencyCode() {
        return this.zzap;
    }

    public final String getTotalPrice() {
        return this.zzao;
    }

    public final int getTotalPriceStatus() {
        return this.zzep;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzep);
        SafeParcelWriter.writeString(parcel, 2, this.zzao, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzap, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private TransactionInfo() {
    }
}
