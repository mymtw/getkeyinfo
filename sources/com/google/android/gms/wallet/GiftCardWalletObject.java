package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;

@SafeParcelable.Class(creator = "GiftCardWalletObjectCreator")
@SafeParcelable.Reserved({1})
public final class GiftCardWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GiftCardWalletObject> CREATOR = new zzo();
    @SafeParcelable.Field(mo49213id = 4)
    public String pin;
    @SafeParcelable.Field(mo49213id = 2)
    public CommonWalletObject zzbk;
    @SafeParcelable.Field(mo49213id = 3)
    public String zzbl;
    @SafeParcelable.Field(mo49213id = 5)
    @Deprecated
    public String zzbm;
    @SafeParcelable.Field(mo49213id = 6)
    public long zzbn;
    @SafeParcelable.Field(mo49213id = 7)
    public String zzbo;
    @SafeParcelable.Field(mo49213id = 8)
    public long zzbp;
    @SafeParcelable.Field(mo49213id = 9)
    public String zzbq;

    /* renamed from: com.google.android.gms.wallet.GiftCardWalletObject$a */
    public final class C15152a {
        public C15152a() {
            CommonWalletObject.zze();
        }
    }

    public GiftCardWalletObject() {
        this.zzbk = CommonWalletObject.this;
    }

    public static C15152a newBuilder() {
        new GiftCardWalletObject();
        return new C15152a();
    }

    public final String getBalanceCurrencyCode() {
        return this.zzbo;
    }

    public final long getBalanceMicros() {
        return this.zzbn;
    }

    public final long getBalanceUpdateTime() {
        return this.zzbp;
    }

    public final String getBarcodeAlternateText() {
        return this.zzbk.getBarcodeAlternateText();
    }

    @Deprecated
    public final String getBarcodeLabel() {
        return this.zzbk.getBarcodeLabel();
    }

    public final String getBarcodeType() {
        return this.zzbk.getBarcodeType();
    }

    public final String getBarcodeValue() {
        return this.zzbk.getBarcodeValue();
    }

    @Deprecated
    public final String getCardIdentifier() {
        return this.zzbm;
    }

    public final String getCardNumber() {
        return this.zzbl;
    }

    public final String getClassId() {
        return this.zzbk.getClassId();
    }

    public final String getEventNumber() {
        return this.zzbq;
    }

    public final String getId() {
        return this.zzbk.getId();
    }

    public final ArrayList<UriData> getImageModuleDataMainImageUris() {
        return this.zzbk.getImageModuleDataMainImageUris();
    }

    @Deprecated
    public final String getInfoModuleDataHexBackgroundColor() {
        return this.zzbk.getInfoModuleDataHexBackgroundColor();
    }

    @Deprecated
    public final String getInfoModuleDataHexFontColor() {
        return this.zzbk.getInfoModuleDataHexFontColor();
    }

    public final ArrayList<LabelValueRow> getInfoModuleDataLabelValueRows() {
        return this.zzbk.getInfoModuleDataLabelValueRows();
    }

    public final boolean getInfoModuleDataShowLastUpdateTime() {
        return this.zzbk.getInfoModuleDataShowLastUpdateTime();
    }

    public final String getIssuerName() {
        return this.zzbk.getIssuerName();
    }

    public final ArrayList<UriData> getLinksModuleDataUris() {
        return this.zzbk.getLinksModuleDataUris();
    }

    public final ArrayList<LatLng> getLocations() {
        return this.zzbk.getLocations();
    }

    public final ArrayList<WalletObjectMessage> getMessages() {
        return this.zzbk.getMessages();
    }

    public final String getPin() {
        return this.pin;
    }

    public final int getState() {
        return this.zzbk.getState();
    }

    public final ArrayList<TextModuleData> getTextModulesData() {
        return this.zzbk.getTextModulesData();
    }

    public final String getTitle() {
        return this.zzbk.getName();
    }

    public final TimeInterval getValidTimeInterval() {
        return this.zzbk.getValidTimeInterval();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzbk, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzbl, false);
        SafeParcelWriter.writeString(parcel, 4, this.pin, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzbm, false);
        SafeParcelWriter.writeLong(parcel, 6, this.zzbn);
        SafeParcelWriter.writeString(parcel, 7, this.zzbo, false);
        SafeParcelWriter.writeLong(parcel, 8, this.zzbp);
        SafeParcelWriter.writeString(parcel, 9, this.zzbq, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public GiftCardWalletObject(@SafeParcelable.Param(mo49216id = 2) CommonWalletObject commonWalletObject, @SafeParcelable.Param(mo49216id = 3) String str, @SafeParcelable.Param(mo49216id = 4) String str2, @SafeParcelable.Param(mo49216id = 5) String str3, @SafeParcelable.Param(mo49216id = 6) long j, @SafeParcelable.Param(mo49216id = 7) String str4, @SafeParcelable.Param(mo49216id = 8) long j2, @SafeParcelable.Param(mo49216id = 9) String str5) {
        CommonWalletObject commonWalletObject2 = CommonWalletObject.this;
        this.zzbk = commonWalletObject;
        this.zzbl = str;
        this.pin = str2;
        this.zzbn = j;
        this.zzbo = str4;
        this.zzbp = j2;
        this.zzbq = str5;
        this.zzbm = str3;
    }
}
