package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

@SafeParcelable.Class(creator = "WalletFragmentInitParamsCreator")
@SafeParcelable.Reserved({1})
public final class WalletFragmentInitParams extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<WalletFragmentInitParams> CREATOR = new zzd();
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getAccountName", mo49213id = 2)
    public String zzcj;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getMaskedWalletRequest", mo49213id = 3)
    public MaskedWalletRequest zzfk;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getMaskedWallet", mo49213id = 5)
    public MaskedWallet zzfl;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(defaultValue = "-1", getter = "getMaskedWalletRequestCode", mo49213id = 4)
    public int zzfz;

    /* renamed from: com.google.android.gms.wallet.fragment.WalletFragmentInitParams$a */
    public final class C15171a {
    }

    private WalletFragmentInitParams() {
        this.zzfz = -1;
    }

    public static C15171a newBuilder() {
        new WalletFragmentInitParams();
        return new C15171a();
    }

    public final String getAccountName() {
        return this.zzcj;
    }

    public final MaskedWallet getMaskedWallet() {
        return this.zzfl;
    }

    public final MaskedWalletRequest getMaskedWalletRequest() {
        return this.zzfk;
    }

    public final int getMaskedWalletRequestCode() {
        return this.zzfz;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getAccountName(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getMaskedWalletRequest(), i, false);
        SafeParcelWriter.writeInt(parcel, 4, getMaskedWalletRequestCode());
        SafeParcelWriter.writeParcelable(parcel, 5, getMaskedWallet(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public WalletFragmentInitParams(@SafeParcelable.Param(mo49216id = 2) String str, @SafeParcelable.Param(mo49216id = 3) MaskedWalletRequest maskedWalletRequest, @SafeParcelable.Param(mo49216id = 4) int i, @SafeParcelable.Param(mo49216id = 5) MaskedWallet maskedWallet) {
        this.zzcj = str;
        this.zzfk = maskedWalletRequest;
        this.zzfz = i;
        this.zzfl = maskedWallet;
    }
}
