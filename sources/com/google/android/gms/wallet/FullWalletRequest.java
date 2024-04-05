package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "FullWalletRequestCreator")
@SafeParcelable.Reserved({1})
public final class FullWalletRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<FullWalletRequest> CREATOR = new zzm();
    @SafeParcelable.Field(mo49213id = 2)
    public String zzax;
    @SafeParcelable.Field(mo49213id = 3)
    public String zzay;
    @SafeParcelable.Field(mo49213id = 4)
    public Cart zzbi;

    /* renamed from: com.google.android.gms.wallet.FullWalletRequest$a */
    public final class C15151a {
    }

    @SafeParcelable.Constructor
    public FullWalletRequest(@SafeParcelable.Param(mo49216id = 2) String str, @SafeParcelable.Param(mo49216id = 3) String str2, @SafeParcelable.Param(mo49216id = 4) Cart cart) {
        this.zzax = str;
        this.zzay = str2;
        this.zzbi = cart;
    }

    public static C15151a newBuilder() {
        new FullWalletRequest();
        return new C15151a();
    }

    public final Cart getCart() {
        return this.zzbi;
    }

    public final String getGoogleTransactionId() {
        return this.zzax;
    }

    public final String getMerchantTransactionId() {
        return this.zzay;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzax, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzay, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzbi, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public FullWalletRequest() {
    }
}
