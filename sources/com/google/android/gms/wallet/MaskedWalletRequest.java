package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;

@SafeParcelable.Class(creator = "MaskedWalletRequestCreator")
@SafeParcelable.Reserved({1})
public final class MaskedWalletRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<MaskedWalletRequest> CREATOR = new zzz();
    @SafeParcelable.Field(mo49213id = 17)
    public ArrayList<Integer> zzaj;
    @SafeParcelable.Field(mo49213id = 7)
    public String zzap;
    @SafeParcelable.Field(mo49213id = 2)
    public String zzay;
    @SafeParcelable.Field(mo49213id = 9)
    public Cart zzbi;
    @SafeParcelable.Field(mo49213id = 3)
    public boolean zzde;
    @SafeParcelable.Field(mo49213id = 4)
    public boolean zzdf;
    @SafeParcelable.Field(mo49213id = 5)
    public boolean zzdg;
    @SafeParcelable.Field(mo49213id = 6)
    public String zzdh;
    @SafeParcelable.Field(mo49213id = 8)
    public String zzdi;
    @SafeParcelable.Field(mo49213id = 10)
    private boolean zzdj;
    @SafeParcelable.Field(mo49213id = 11)
    public boolean zzdk;
    @SafeParcelable.Field(mo49213id = 12)
    private CountrySpecification[] zzdl;
    @SafeParcelable.Field(defaultValue = "true", mo49213id = 13)
    public boolean zzdm;
    @SafeParcelable.Field(defaultValue = "true", mo49213id = 14)
    public boolean zzdn;
    @SafeParcelable.Field(mo49213id = 15)
    public ArrayList<CountrySpecification> zzdo;
    @SafeParcelable.Field(mo49213id = 16)
    public PaymentMethodTokenizationParameters zzdp;
    @SafeParcelable.Field(mo49213id = 18)
    public String zzi;

    /* renamed from: com.google.android.gms.wallet.MaskedWalletRequest$a */
    public final class C15157a {
    }

    @SafeParcelable.Constructor
    public MaskedWalletRequest(@SafeParcelable.Param(mo49216id = 2) String str, @SafeParcelable.Param(mo49216id = 3) boolean z, @SafeParcelable.Param(mo49216id = 4) boolean z2, @SafeParcelable.Param(mo49216id = 5) boolean z3, @SafeParcelable.Param(mo49216id = 6) String str2, @SafeParcelable.Param(mo49216id = 7) String str3, @SafeParcelable.Param(mo49216id = 8) String str4, @SafeParcelable.Param(mo49216id = 9) Cart cart, @SafeParcelable.Param(mo49216id = 10) boolean z4, @SafeParcelable.Param(mo49216id = 11) boolean z5, @SafeParcelable.Param(mo49216id = 12) CountrySpecification[] countrySpecificationArr, @SafeParcelable.Param(mo49216id = 13) boolean z6, @SafeParcelable.Param(mo49216id = 14) boolean z7, @SafeParcelable.Param(mo49216id = 15) ArrayList<CountrySpecification> arrayList, @SafeParcelable.Param(mo49216id = 16) PaymentMethodTokenizationParameters paymentMethodTokenizationParameters, @SafeParcelable.Param(mo49216id = 17) ArrayList<Integer> arrayList2, @SafeParcelable.Param(mo49216id = 18) String str5) {
        this.zzay = str;
        this.zzde = z;
        this.zzdf = z2;
        this.zzdg = z3;
        this.zzdh = str2;
        this.zzap = str3;
        this.zzdi = str4;
        this.zzbi = cart;
        this.zzdj = z4;
        this.zzdk = z5;
        this.zzdl = countrySpecificationArr;
        this.zzdm = z6;
        this.zzdn = z7;
        this.zzdo = arrayList;
        this.zzdp = paymentMethodTokenizationParameters;
        this.zzaj = arrayList2;
        this.zzi = str5;
    }

    public static C15157a newBuilder() {
        new MaskedWalletRequest();
        return new C15157a();
    }

    public final boolean allowDebitCard() {
        return this.zzdn;
    }

    public final boolean allowPrepaidCard() {
        return this.zzdm;
    }

    public final ArrayList<Integer> getAllowedCardNetworks() {
        return this.zzaj;
    }

    public final ArrayList<CountrySpecification> getAllowedCountrySpecificationsForShipping() {
        return this.zzdo;
    }

    public final CountrySpecification[] getAllowedShippingCountrySpecifications() {
        return this.zzdl;
    }

    public final Cart getCart() {
        return this.zzbi;
    }

    public final String getCountryCode() {
        return this.zzi;
    }

    public final String getCurrencyCode() {
        return this.zzap;
    }

    public final String getEstimatedTotalPrice() {
        return this.zzdh;
    }

    public final String getMerchantName() {
        return this.zzdi;
    }

    public final String getMerchantTransactionId() {
        return this.zzay;
    }

    public final PaymentMethodTokenizationParameters getPaymentMethodTokenizationParameters() {
        return this.zzdp;
    }

    @Deprecated
    public final boolean isBillingAgreement() {
        return this.zzdk;
    }

    public final boolean isPhoneNumberRequired() {
        return this.zzde;
    }

    public final boolean isShippingAddressRequired() {
        return this.zzdf;
    }

    @Deprecated
    public final boolean useMinimalBillingAddress() {
        return this.zzdg;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzay, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzde);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzdf);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzdg);
        SafeParcelWriter.writeString(parcel, 6, this.zzdh, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzap, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzdi, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.zzbi, i, false);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzdj);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzdk);
        SafeParcelWriter.writeTypedArray(parcel, 12, this.zzdl, i, false);
        SafeParcelWriter.writeBoolean(parcel, 13, this.zzdm);
        SafeParcelWriter.writeBoolean(parcel, 14, this.zzdn);
        SafeParcelWriter.writeTypedList(parcel, 15, this.zzdo, false);
        SafeParcelWriter.writeParcelable(parcel, 16, this.zzdp, i, false);
        SafeParcelWriter.writeIntegerList(parcel, 17, this.zzaj, false);
        SafeParcelWriter.writeString(parcel, 18, this.zzi, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public MaskedWalletRequest() {
        this.zzdm = true;
        this.zzdn = true;
    }
}
