package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "CreateWalletObjectsRequestCreator")
@SafeParcelable.Reserved({1})
public final class CreateWalletObjectsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CreateWalletObjectsRequest> CREATOR = new zzj();
    public static final int REQUEST_IMMEDIATE_SAVE = 1;
    public static final int SHOW_SAVE_PROMPT = 0;
    @SafeParcelable.Field(mo49213id = 2)
    public LoyaltyWalletObject zzas;
    @SafeParcelable.Field(mo49213id = 3)
    public OfferWalletObject zzat;
    @SafeParcelable.Field(mo49213id = 4)
    public GiftCardWalletObject zzau;
    @SafeParcelable.Field(mo49213id = 5)
    public int zzav;

    /* renamed from: com.google.android.gms.wallet.CreateWalletObjectsRequest$a */
    public final class C15150a {
    }

    @SafeParcelable.Constructor
    public CreateWalletObjectsRequest(@SafeParcelable.Param(mo49216id = 2) LoyaltyWalletObject loyaltyWalletObject, @SafeParcelable.Param(mo49216id = 3) OfferWalletObject offerWalletObject, @SafeParcelable.Param(mo49216id = 4) GiftCardWalletObject giftCardWalletObject, @SafeParcelable.Param(mo49216id = 5) int i) {
        this.zzas = loyaltyWalletObject;
        this.zzat = offerWalletObject;
        this.zzau = giftCardWalletObject;
        this.zzav = i;
    }

    public static C15150a newBuilder() {
        new CreateWalletObjectsRequest();
        return new C15150a();
    }

    public final int getCreateMode() {
        return this.zzav;
    }

    public final GiftCardWalletObject getGiftCardWalletObject() {
        return this.zzau;
    }

    public final LoyaltyWalletObject getLoyaltyWalletObject() {
        return this.zzas;
    }

    public final OfferWalletObject getOfferWalletObject() {
        return this.zzat;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzas, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzat, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzau, i, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zzav);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public CreateWalletObjectsRequest() {
    }

    @Deprecated
    public CreateWalletObjectsRequest(LoyaltyWalletObject loyaltyWalletObject) {
        this.zzas = loyaltyWalletObject;
    }

    @Deprecated
    public CreateWalletObjectsRequest(OfferWalletObject offerWalletObject) {
        this.zzat = offerWalletObject;
    }

    @Deprecated
    public CreateWalletObjectsRequest(GiftCardWalletObject giftCardWalletObject) {
        this.zzau = giftCardWalletObject;
    }
}
