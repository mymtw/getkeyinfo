package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

@SafeParcelable.Class(creator = "IsReadyToPayRequestCreator")
@SafeParcelable.Reserved({1})
public final class IsReadyToPayRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<IsReadyToPayRequest> CREATOR = new zzr();
    @SafeParcelable.Field(mo49213id = 2)
    public ArrayList<Integer> zzaj;
    @SafeParcelable.Field(mo49213id = 4)
    private String zzbv;
    @SafeParcelable.Field(mo49213id = 5)
    private String zzbw;
    @SafeParcelable.Field(mo49213id = 6)
    public ArrayList<Integer> zzbx;
    @SafeParcelable.Field(mo49213id = 7)
    public boolean zzby;
    @SafeParcelable.Field(mo49213id = 8)
    private String zzbz;

    /* renamed from: com.google.android.gms.wallet.IsReadyToPayRequest$a */
    public final class C15153a {
        public C15153a() {
        }
    }

    public IsReadyToPayRequest() {
    }

    public static IsReadyToPayRequest fromJson(String str) {
        IsReadyToPayRequest isReadyToPayRequest = IsReadyToPayRequest.this;
        isReadyToPayRequest.zzbz = (String) Preconditions.checkNotNull(str, "isReadyToPayRequestJson cannot be null!");
        return isReadyToPayRequest;
    }

    public static C15153a newBuilder() {
        return new C15153a();
    }

    public final ArrayList<Integer> getAllowedCardNetworks() {
        return this.zzaj;
    }

    public final ArrayList<Integer> getAllowedPaymentMethods() {
        return this.zzbx;
    }

    public final boolean isExistingPaymentMethodRequired() {
        return this.zzby;
    }

    public final String toJson() {
        return this.zzbz;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntegerList(parcel, 2, this.zzaj, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzbv, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzbw, false);
        SafeParcelWriter.writeIntegerList(parcel, 6, this.zzbx, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzby);
        SafeParcelWriter.writeString(parcel, 8, this.zzbz, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public IsReadyToPayRequest(@SafeParcelable.Param(mo49216id = 2) ArrayList<Integer> arrayList, @SafeParcelable.Param(mo49216id = 4) String str, @SafeParcelable.Param(mo49216id = 5) String str2, @SafeParcelable.Param(mo49216id = 6) ArrayList<Integer> arrayList2, @SafeParcelable.Param(mo49216id = 7) boolean z, @SafeParcelable.Param(mo49216id = 8) String str3) {
        this.zzaj = arrayList;
        this.zzbv = str;
        this.zzbw = str2;
        this.zzbx = arrayList2;
        this.zzby = z;
        this.zzbz = str3;
    }
}
