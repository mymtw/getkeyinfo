package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;

@SafeParcelable.Class(creator = "LoyaltyWalletObjectCreator")
@SafeParcelable.Reserved({1})
public final class LoyaltyWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LoyaltyWalletObject> CREATOR = new zzv();
    @SafeParcelable.Field(mo49213id = 12)
    public int state;
    @SafeParcelable.Field(mo49213id = 2)
    public String zzcf;
    @SafeParcelable.Field(mo49213id = 3)
    public String zzcg;
    @SafeParcelable.Field(mo49213id = 4)
    public String zzch;
    @SafeParcelable.Field(mo49213id = 5)
    public String zzci;
    @SafeParcelable.Field(mo49213id = 6)
    public String zzcj;
    @SafeParcelable.Field(mo49213id = 7)
    public String zzck;
    @SafeParcelable.Field(mo49213id = 8)
    public String zzcl;
    @SafeParcelable.Field(mo49213id = 9)
    public String zzcm;
    @SafeParcelable.Field(mo49213id = 10)
    @Deprecated
    public String zzcn;
    @SafeParcelable.Field(mo49213id = 11)
    public String zzco;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", mo49213id = 13)
    public ArrayList<WalletObjectMessage> zzcp;
    @SafeParcelable.Field(mo49213id = 14)
    public TimeInterval zzcq;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", mo49213id = 15)
    public ArrayList<LatLng> zzcr;
    @SafeParcelable.Field(mo49213id = 16)
    @Deprecated
    public String zzcs;
    @SafeParcelable.Field(mo49213id = 17)
    @Deprecated
    public String zzct;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", mo49213id = 18)
    public ArrayList<LabelValueRow> zzcu;
    @SafeParcelable.Field(mo49213id = 19)
    public boolean zzcv;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", mo49213id = 20)
    public ArrayList<UriData> zzcw;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", mo49213id = 21)
    public ArrayList<TextModuleData> zzcx;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", mo49213id = 22)
    public ArrayList<UriData> zzcy;
    @SafeParcelable.Field(mo49213id = 23)
    public LoyaltyPoints zzcz;

    /* renamed from: com.google.android.gms.wallet.LoyaltyWalletObject$a */
    public final class C15155a {
    }

    @SafeParcelable.Constructor
    public LoyaltyWalletObject(@SafeParcelable.Param(mo49216id = 2) String str, @SafeParcelable.Param(mo49216id = 3) String str2, @SafeParcelable.Param(mo49216id = 4) String str3, @SafeParcelable.Param(mo49216id = 5) String str4, @SafeParcelable.Param(mo49216id = 6) String str5, @SafeParcelable.Param(mo49216id = 7) String str6, @SafeParcelable.Param(mo49216id = 8) String str7, @SafeParcelable.Param(mo49216id = 9) String str8, @SafeParcelable.Param(mo49216id = 10) String str9, @SafeParcelable.Param(mo49216id = 11) String str10, @SafeParcelable.Param(mo49216id = 12) int i, @SafeParcelable.Param(mo49216id = 13) ArrayList<WalletObjectMessage> arrayList, @SafeParcelable.Param(mo49216id = 14) TimeInterval timeInterval, @SafeParcelable.Param(mo49216id = 15) ArrayList<LatLng> arrayList2, @SafeParcelable.Param(mo49216id = 16) String str11, @SafeParcelable.Param(mo49216id = 17) String str12, @SafeParcelable.Param(mo49216id = 18) ArrayList<LabelValueRow> arrayList3, @SafeParcelable.Param(mo49216id = 19) boolean z, @SafeParcelable.Param(mo49216id = 20) ArrayList<UriData> arrayList4, @SafeParcelable.Param(mo49216id = 21) ArrayList<TextModuleData> arrayList5, @SafeParcelable.Param(mo49216id = 22) ArrayList<UriData> arrayList6, @SafeParcelable.Param(mo49216id = 23) LoyaltyPoints loyaltyPoints) {
        this.zzcf = str;
        this.zzcg = str2;
        this.zzch = str3;
        this.zzci = str4;
        this.zzcj = str5;
        this.zzck = str6;
        this.zzcl = str7;
        this.zzcm = str8;
        this.zzcn = str9;
        this.zzco = str10;
        this.state = i;
        this.zzcp = arrayList;
        this.zzcq = timeInterval;
        this.zzcr = arrayList2;
        this.zzcs = str11;
        this.zzct = str12;
        this.zzcu = arrayList3;
        this.zzcv = z;
        this.zzcw = arrayList4;
        this.zzcx = arrayList5;
        this.zzcy = arrayList6;
        this.zzcz = loyaltyPoints;
    }

    public static C15155a newBuilder() {
        new LoyaltyWalletObject();
        return new C15155a();
    }

    public final String getAccountId() {
        return this.zzcg;
    }

    public final String getAccountName() {
        return this.zzcj;
    }

    public final String getBarcodeAlternateText() {
        return this.zzck;
    }

    @Deprecated
    public final String getBarcodeLabel() {
        return this.zzcn;
    }

    public final String getBarcodeType() {
        return this.zzcl;
    }

    public final String getBarcodeValue() {
        return this.zzcm;
    }

    public final String getClassId() {
        return this.zzco;
    }

    public final String getId() {
        return this.zzcf;
    }

    public final ArrayList<UriData> getImageModuleDataMainImageUris() {
        return this.zzcw;
    }

    @Deprecated
    public final String getInfoModuleDataHexBackgroundColor() {
        return this.zzct;
    }

    @Deprecated
    public final String getInfoModuleDataHexFontColor() {
        return this.zzcs;
    }

    public final ArrayList<LabelValueRow> getInfoModuleDataLabelValueRows() {
        return this.zzcu;
    }

    public final boolean getInfoModuleDataShowLastUpdateTime() {
        return this.zzcv;
    }

    public final String getIssuerName() {
        return this.zzch;
    }

    public final ArrayList<UriData> getLinksModuleDataUris() {
        return this.zzcy;
    }

    public final ArrayList<LatLng> getLocations() {
        return this.zzcr;
    }

    public final LoyaltyPoints getLoyaltyPoints() {
        return this.zzcz;
    }

    public final ArrayList<WalletObjectMessage> getMessages() {
        return this.zzcp;
    }

    public final String getProgramName() {
        return this.zzci;
    }

    public final int getState() {
        return this.state;
    }

    public final ArrayList<TextModuleData> getTextModulesData() {
        return this.zzcx;
    }

    public final TimeInterval getValidTimeInterval() {
        return this.zzcq;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzcf, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzcg, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzch, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzci, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzcj, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzck, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzcl, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzcm, false);
        SafeParcelWriter.writeString(parcel, 10, this.zzcn, false);
        SafeParcelWriter.writeString(parcel, 11, this.zzco, false);
        SafeParcelWriter.writeInt(parcel, 12, this.state);
        SafeParcelWriter.writeTypedList(parcel, 13, this.zzcp, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzcq, i, false);
        SafeParcelWriter.writeTypedList(parcel, 15, this.zzcr, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzcs, false);
        SafeParcelWriter.writeString(parcel, 17, this.zzct, false);
        SafeParcelWriter.writeTypedList(parcel, 18, this.zzcu, false);
        SafeParcelWriter.writeBoolean(parcel, 19, this.zzcv);
        SafeParcelWriter.writeTypedList(parcel, 20, this.zzcw, false);
        SafeParcelWriter.writeTypedList(parcel, 21, this.zzcx, false);
        SafeParcelWriter.writeTypedList(parcel, 22, this.zzcy, false);
        SafeParcelWriter.writeParcelable(parcel, 23, this.zzcz, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public LoyaltyWalletObject() {
        this.zzcp = ArrayUtils.newArrayList();
        this.zzcr = ArrayUtils.newArrayList();
        this.zzcu = ArrayUtils.newArrayList();
        this.zzcw = ArrayUtils.newArrayList();
        this.zzcx = ArrayUtils.newArrayList();
        this.zzcy = ArrayUtils.newArrayList();
    }
}
