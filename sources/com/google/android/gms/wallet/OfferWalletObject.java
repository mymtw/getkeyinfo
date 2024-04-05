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

@SafeParcelable.Class(creator = "OfferWalletObjectCreator")
public final class OfferWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OfferWalletObject> CREATOR = new zzab();
    @SafeParcelable.VersionField(getter = "getVersionCode", mo49219id = 1)
    private final int versionCode;
    @SafeParcelable.Field(mo49213id = 4)
    public CommonWalletObject zzbk;
    @SafeParcelable.Field(mo49213id = 2)
    public String zzcf;
    @SafeParcelable.Field(mo49213id = 3)
    public String zzdr;

    /* renamed from: com.google.android.gms.wallet.OfferWalletObject$a */
    public final class C15158a {
        public C15158a() {
            CommonWalletObject.zze();
        }
    }

    @SafeParcelable.Constructor
    public OfferWalletObject(@SafeParcelable.Param(mo49216id = 1) int i, @SafeParcelable.Param(mo49216id = 2) String str, @SafeParcelable.Param(mo49216id = 3) String str2, @SafeParcelable.Param(mo49216id = 4) CommonWalletObject commonWalletObject) {
        this.versionCode = i;
        this.zzdr = str2;
        if (i < 3) {
            CommonWalletObject commonWalletObject2 = CommonWalletObject.this;
            commonWalletObject2.zzcf = str;
            this.zzbk = commonWalletObject2;
            return;
        }
        this.zzbk = commonWalletObject;
    }

    public static C15158a newBuilder() {
        new OfferWalletObject();
        return new C15158a();
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

    public final String getClassId() {
        return this.zzbk.getClassId();
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

    public final String getRedemptionCode() {
        return this.zzdr;
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

    public final int getVersionCode() {
        return this.versionCode;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getVersionCode());
        SafeParcelWriter.writeString(parcel, 2, this.zzcf, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzdr, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzbk, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public OfferWalletObject() {
        this.versionCode = 3;
    }
}
