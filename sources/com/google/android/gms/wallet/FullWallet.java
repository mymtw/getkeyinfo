package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

@SafeParcelable.Class(creator = "FullWalletCreator")
@SafeParcelable.Reserved({1})
public final class FullWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<FullWallet> CREATOR = new zzk();
    @SafeParcelable.Field(mo49213id = 2)
    private String zzax;
    @SafeParcelable.Field(mo49213id = 3)
    private String zzay;
    @SafeParcelable.Field(mo49213id = 4)
    private ProxyCard zzaz;
    @SafeParcelable.Field(mo49213id = 5)
    private String zzba;
    @SafeParcelable.Field(mo49213id = 6)
    private zza zzbb;
    @SafeParcelable.Field(mo49213id = 7)
    private zza zzbc;
    @SafeParcelable.Field(mo49213id = 8)
    private String[] zzbd;
    @SafeParcelable.Field(mo49213id = 9)
    private UserAddress zzbe;
    @SafeParcelable.Field(mo49213id = 10)
    private UserAddress zzbf;
    @SafeParcelable.Field(mo49213id = 11)
    private InstrumentInfo[] zzbg;
    @SafeParcelable.Field(mo49213id = 12)
    private PaymentMethodToken zzbh;

    @SafeParcelable.Constructor
    public FullWallet(@SafeParcelable.Param(mo49216id = 2) String str, @SafeParcelable.Param(mo49216id = 3) String str2, @SafeParcelable.Param(mo49216id = 4) ProxyCard proxyCard, @SafeParcelable.Param(mo49216id = 5) String str3, @SafeParcelable.Param(mo49216id = 6) zza zza, @SafeParcelable.Param(mo49216id = 7) zza zza2, @SafeParcelable.Param(mo49216id = 8) String[] strArr, @SafeParcelable.Param(mo49216id = 9) UserAddress userAddress, @SafeParcelable.Param(mo49216id = 10) UserAddress userAddress2, @SafeParcelable.Param(mo49216id = 11) InstrumentInfo[] instrumentInfoArr, @SafeParcelable.Param(mo49216id = 12) PaymentMethodToken paymentMethodToken) {
        this.zzax = str;
        this.zzay = str2;
        this.zzaz = proxyCard;
        this.zzba = str3;
        this.zzbb = zza;
        this.zzbc = zza2;
        this.zzbd = strArr;
        this.zzbe = userAddress;
        this.zzbf = userAddress2;
        this.zzbg = instrumentInfoArr;
        this.zzbh = paymentMethodToken;
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

    public final PaymentMethodToken getPaymentMethodToken() {
        return this.zzbh;
    }

    public final ProxyCard getProxyCard() {
        return this.zzaz;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzax, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzay, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzaz, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzba, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzbb, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzbc, i, false);
        SafeParcelWriter.writeStringArray(parcel, 8, this.zzbd, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.zzbe, i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzbf, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 11, this.zzbg, i, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzbh, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private FullWallet() {
    }
}
