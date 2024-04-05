package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

@SafeParcelable.Class(creator = "MaskedWalletCreator")
@SafeParcelable.Reserved({1})
public final class MaskedWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<MaskedWallet> CREATOR = new zzx();
    @SafeParcelable.Field(mo49213id = 2)
    public String zzax;
    @SafeParcelable.Field(mo49213id = 3)
    public String zzay;
    @SafeParcelable.Field(mo49213id = 5)
    public String zzba;
    @SafeParcelable.Field(mo49213id = 6)
    private zza zzbb;
    @SafeParcelable.Field(mo49213id = 7)
    private zza zzbc;
    @SafeParcelable.Field(mo49213id = 4)
    public String[] zzbd;
    @SafeParcelable.Field(mo49213id = 10)
    public UserAddress zzbe;
    @SafeParcelable.Field(mo49213id = 11)
    public UserAddress zzbf;
    @SafeParcelable.Field(mo49213id = 12)
    public InstrumentInfo[] zzbg;
    @SafeParcelable.Field(mo49213id = 8)
    private LoyaltyWalletObject[] zzdb;
    @SafeParcelable.Field(mo49213id = 9)
    private OfferWalletObject[] zzdc;

    /* renamed from: com.google.android.gms.wallet.MaskedWallet$a */
    public final class C15156a {
        public C15156a(MaskedWallet maskedWallet) {
        }
    }

    @SafeParcelable.Constructor
    public MaskedWallet(@SafeParcelable.Param(mo49216id = 2) String str, @SafeParcelable.Param(mo49216id = 3) String str2, @SafeParcelable.Param(mo49216id = 4) String[] strArr, @SafeParcelable.Param(mo49216id = 5) String str3, @SafeParcelable.Param(mo49216id = 6) zza zza, @SafeParcelable.Param(mo49216id = 7) zza zza2, @SafeParcelable.Param(mo49216id = 8) LoyaltyWalletObject[] loyaltyWalletObjectArr, @SafeParcelable.Param(mo49216id = 9) OfferWalletObject[] offerWalletObjectArr, @SafeParcelable.Param(mo49216id = 10) UserAddress userAddress, @SafeParcelable.Param(mo49216id = 11) UserAddress userAddress2, @SafeParcelable.Param(mo49216id = 12) InstrumentInfo[] instrumentInfoArr) {
        this.zzax = str;
        this.zzay = str2;
        this.zzbd = strArr;
        this.zzba = str3;
        this.zzbb = zza;
        this.zzbc = zza2;
        this.zzdb = loyaltyWalletObjectArr;
        this.zzdc = offerWalletObjectArr;
        this.zzbe = userAddress;
        this.zzbf = userAddress2;
        this.zzbg = instrumentInfoArr;
    }

    public static C15156a newBuilderFrom(MaskedWallet maskedWallet) {
        Preconditions.checkNotNull(maskedWallet);
        MaskedWallet maskedWallet2 = new MaskedWallet();
        C15156a aVar = new C15156a(maskedWallet2);
        maskedWallet2.zzax = maskedWallet.getGoogleTransactionId();
        maskedWallet2.zzay = maskedWallet.getMerchantTransactionId();
        maskedWallet2.zzbd = maskedWallet.getPaymentDescriptions();
        maskedWallet2.zzbg = maskedWallet.getInstrumentInfos();
        maskedWallet2.zzba = maskedWallet.getEmail();
        maskedWallet2.zzdb = maskedWallet.zzdb;
        maskedWallet2.zzdc = maskedWallet.zzdc;
        maskedWallet2.zzbe = maskedWallet.getBuyerBillingAddress();
        maskedWallet2.zzbf = maskedWallet.getBuyerShippingAddress();
        return aVar;
    }

    public final UserAddress getBuyerBillingAddress() {
        return this.zzbe;
    }

    public final UserAddress getBuyerShippingAddress() {
        return this.zzbf;
    }

    public final String getEmail() {
        return this.zzba;
    }

    public final String getGoogleTransactionId() {
        return this.zzax;
    }

    public final InstrumentInfo[] getInstrumentInfos() {
        return this.zzbg;
    }

    public final String getMerchantTransactionId() {
        return this.zzay;
    }

    public final String[] getPaymentDescriptions() {
        return this.zzbd;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzax, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzay, false);
        SafeParcelWriter.writeStringArray(parcel, 4, this.zzbd, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzba, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzbb, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzbc, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 8, this.zzdb, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 9, this.zzdc, i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzbe, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzbf, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 12, this.zzbg, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private MaskedWallet() {
    }
}
