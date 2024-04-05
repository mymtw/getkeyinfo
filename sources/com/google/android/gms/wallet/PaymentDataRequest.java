package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

@SafeParcelable.Class(creator = "PaymentDataRequestCreator")
public final class PaymentDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentDataRequest> CREATOR = new zzaf();
    @SafeParcelable.Field(mo49213id = 6)
    public ArrayList<Integer> zzbx;
    @SafeParcelable.Field(mo49213id = 10)
    public String zzbz;
    @SafeParcelable.Field(mo49213id = 2)
    public boolean zzde;
    @SafeParcelable.Field(mo49213id = 4)
    public boolean zzdf;
    @SafeParcelable.Field(mo49213id = 7)
    public PaymentMethodTokenizationParameters zzdp;
    @SafeParcelable.Field(mo49213id = 1)
    public boolean zzdx;
    @SafeParcelable.Field(mo49213id = 3)
    public CardRequirements zzdy;
    @SafeParcelable.Field(mo49213id = 5)
    public ShippingAddressRequirements zzdz;
    @SafeParcelable.Field(mo49213id = 8)
    public TransactionInfo zzea;
    @SafeParcelable.Field(defaultValue = "true", mo49213id = 9)
    public boolean zzeb;

    /* renamed from: com.google.android.gms.wallet.PaymentDataRequest$a */
    public final class C15159a {
        public C15159a() {
        }
    }

    @SafeParcelable.Constructor
    public PaymentDataRequest(@SafeParcelable.Param(mo49216id = 1) boolean z, @SafeParcelable.Param(mo49216id = 2) boolean z2, @SafeParcelable.Param(mo49216id = 3) CardRequirements cardRequirements, @SafeParcelable.Param(mo49216id = 4) boolean z3, @SafeParcelable.Param(mo49216id = 5) ShippingAddressRequirements shippingAddressRequirements, @SafeParcelable.Param(mo49216id = 6) ArrayList<Integer> arrayList, @SafeParcelable.Param(mo49216id = 7) PaymentMethodTokenizationParameters paymentMethodTokenizationParameters, @SafeParcelable.Param(mo49216id = 8) TransactionInfo transactionInfo, @SafeParcelable.Param(mo49216id = 9) boolean z4, @SafeParcelable.Param(mo49216id = 10) String str) {
        this.zzdx = z;
        this.zzde = z2;
        this.zzdy = cardRequirements;
        this.zzdf = z3;
        this.zzdz = shippingAddressRequirements;
        this.zzbx = arrayList;
        this.zzdp = paymentMethodTokenizationParameters;
        this.zzea = transactionInfo;
        this.zzeb = z4;
        this.zzbz = str;
    }

    public static PaymentDataRequest fromJson(String str) {
        C15159a newBuilder = newBuilder();
        String str2 = (String) Preconditions.checkNotNull(str, "paymentDataRequestJson cannot be null!");
        PaymentDataRequest paymentDataRequest = PaymentDataRequest.this;
        paymentDataRequest.zzbz = str2;
        if (str2 == null) {
            Preconditions.checkNotNull(paymentDataRequest.zzbx, "Allowed payment methods must be set! You can set it through addAllowedPaymentMethod() or addAllowedPaymentMethods() in the PaymentDataRequest Builder.");
            Preconditions.checkNotNull(PaymentDataRequest.this.zzdy, "Card requirements must be set!");
            PaymentDataRequest paymentDataRequest2 = PaymentDataRequest.this;
            if (paymentDataRequest2.zzdp != null) {
                Preconditions.checkNotNull(paymentDataRequest2.zzea, "Transaction info must be set if paymentMethodTokenizationParameters is set!");
            }
        }
        return PaymentDataRequest.this;
    }

    public static C15159a newBuilder() {
        return new C15159a();
    }

    public final ArrayList<Integer> getAllowedPaymentMethods() {
        return this.zzbx;
    }

    public final CardRequirements getCardRequirements() {
        return this.zzdy;
    }

    public final PaymentMethodTokenizationParameters getPaymentMethodTokenizationParameters() {
        return this.zzdp;
    }

    public final ShippingAddressRequirements getShippingAddressRequirements() {
        return this.zzdz;
    }

    public final TransactionInfo getTransactionInfo() {
        return this.zzea;
    }

    public final boolean isEmailRequired() {
        return this.zzdx;
    }

    public final boolean isPhoneNumberRequired() {
        return this.zzde;
    }

    public final boolean isShippingAddressRequired() {
        return this.zzdf;
    }

    public final boolean isUiRequired() {
        return this.zzeb;
    }

    public final String toJson() {
        return this.zzbz;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zzdx);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzde);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzdy, i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzdf);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzdz, i, false);
        SafeParcelWriter.writeIntegerList(parcel, 6, this.zzbx, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzdp, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzea, i, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzeb);
        SafeParcelWriter.writeString(parcel, 10, this.zzbz, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private PaymentDataRequest() {
        this.zzeb = true;
    }
}
