package com.google.android.gms.wallet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.identity.intents.model.UserAddress;
import p613lk.C18191a;

@SafeParcelable.Class(creator = "PaymentDataCreator")
public final class PaymentData extends AbstractSafeParcelable implements C18191a {
    public static final Parcelable.Creator<PaymentData> CREATOR = new zzad();
    @SafeParcelable.Field(mo49213id = 5)
    private String zzax;
    @SafeParcelable.Field(mo49213id = 1)
    private String zzba;
    @SafeParcelable.Field(mo49213id = 4)
    private PaymentMethodToken zzbh;
    @SafeParcelable.Field(mo49213id = 7)
    private String zzbz;
    @SafeParcelable.Field(mo49213id = 2)
    private CardInfo zzdt;
    @SafeParcelable.Field(mo49213id = 3)
    private UserAddress zzdu;
    @SafeParcelable.Field(mo49213id = 6)
    private Bundle zzdv;

    @SafeParcelable.Constructor
    public PaymentData(@SafeParcelable.Param(mo49216id = 1) String str, @SafeParcelable.Param(mo49216id = 2) CardInfo cardInfo, @SafeParcelable.Param(mo49216id = 3) UserAddress userAddress, @SafeParcelable.Param(mo49216id = 4) PaymentMethodToken paymentMethodToken, @SafeParcelable.Param(mo49216id = 5) String str2, @SafeParcelable.Param(mo49216id = 6) Bundle bundle, @SafeParcelable.Param(mo49216id = 7) String str3) {
        this.zzba = str;
        this.zzdt = cardInfo;
        this.zzdu = userAddress;
        this.zzbh = paymentMethodToken;
        this.zzax = str2;
        this.zzdv = bundle;
        this.zzbz = str3;
    }

    public static PaymentData fromJson(String str) {
        PaymentData paymentData = new PaymentData();
        paymentData.zzbz = (String) Preconditions.checkNotNull(str, "paymentDataJson cannot be null!");
        return paymentData;
    }

    public static PaymentData getFromIntent(Intent intent) {
        return (PaymentData) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.gms.wallet.PaymentData", CREATOR);
    }

    public final CardInfo getCardInfo() {
        return this.zzdt;
    }

    public final String getEmail() {
        return this.zzba;
    }

    public final Bundle getExtraData() {
        return this.zzdv;
    }

    public final String getGoogleTransactionId() {
        return this.zzax;
    }

    public final PaymentMethodToken getPaymentMethodToken() {
        return this.zzbh;
    }

    public final UserAddress getShippingAddress() {
        return this.zzdu;
    }

    public final void putIntoIntent(Intent intent) {
        SafeParcelableSerializer.serializeToIntentExtra(this, intent, "com.google.android.gms.wallet.PaymentData");
    }

    public final String toJson() {
        return this.zzbz;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzba, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzdt, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzdu, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzbh, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzax, false);
        SafeParcelWriter.writeBundle(parcel, 6, this.zzdv, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzbz, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private PaymentData() {
    }
}
