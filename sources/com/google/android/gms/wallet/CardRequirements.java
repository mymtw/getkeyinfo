package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

@SafeParcelable.Class(creator = "CardRequirementsCreator")
public final class CardRequirements extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CardRequirements> CREATOR = new zze();
    @SafeParcelable.Field(mo49213id = 1)
    public ArrayList<Integer> zzaj;
    @SafeParcelable.Field(defaultValue = "true", mo49213id = 2)
    public boolean zzak;
    @SafeParcelable.Field(mo49213id = 3)
    public boolean zzal;
    @SafeParcelable.Field(mo49213id = 4)
    public int zzam;

    /* renamed from: com.google.android.gms.wallet.CardRequirements$a */
    public final class C15148a {
    }

    @SafeParcelable.Constructor
    public CardRequirements(@SafeParcelable.Param(mo49216id = 1) ArrayList<Integer> arrayList, @SafeParcelable.Param(mo49216id = 2) boolean z, @SafeParcelable.Param(mo49216id = 3) boolean z2, @SafeParcelable.Param(mo49216id = 4) int i) {
        this.zzaj = arrayList;
        this.zzak = z;
        this.zzal = z2;
        this.zzam = i;
    }

    public static C15148a newBuilder() {
        new CardRequirements();
        return new C15148a();
    }

    public final boolean allowPrepaidCards() {
        return this.zzak;
    }

    public final ArrayList<Integer> getAllowedCardNetworks() {
        return this.zzaj;
    }

    public final int getBillingAddressFormat() {
        return this.zzam;
    }

    public final boolean isBillingAddressRequired() {
        return this.zzal;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntegerList(parcel, 1, this.zzaj, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzak);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzal);
        SafeParcelWriter.writeInt(parcel, 4, this.zzam);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private CardRequirements() {
        this.zzak = true;
    }
}
