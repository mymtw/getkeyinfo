package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

@KeepName
@SafeParcelable.Class(creator = "CommonWalletObjectCreator")
@SafeParcelable.Reserved({1})
public class CommonWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new zzb();
    @SafeParcelable.Field(mo49213id = 4)
    public String name;
    @SafeParcelable.Field(mo49213id = 10)
    public int state;
    @SafeParcelable.Field(mo49213id = 2)
    public String zzcf;
    @SafeParcelable.Field(mo49213id = 5)
    public String zzch;
    @SafeParcelable.Field(mo49213id = 6)
    public String zzck;
    @SafeParcelable.Field(mo49213id = 7)
    public String zzcl;
    @SafeParcelable.Field(mo49213id = 8)
    public String zzcm;
    @SafeParcelable.Field(mo49213id = 9)
    @Deprecated
    public String zzcn;
    @SafeParcelable.Field(mo49213id = 3)
    public String zzco;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", mo49213id = 11)
    public ArrayList<WalletObjectMessage> zzcp;
    @SafeParcelable.Field(mo49213id = 12)
    public TimeInterval zzcq;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", mo49213id = 13)
    public ArrayList<LatLng> zzcr;
    @SafeParcelable.Field(mo49213id = 14)
    @Deprecated
    public String zzcs;
    @SafeParcelable.Field(mo49213id = 15)
    @Deprecated
    public String zzct;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", mo49213id = 16)
    public ArrayList<LabelValueRow> zzcu;
    @SafeParcelable.Field(mo49213id = 17)
    public boolean zzcv;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", mo49213id = 18)
    public ArrayList<UriData> zzcw;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", mo49213id = 19)
    public ArrayList<TextModuleData> zzcx;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", mo49213id = 20)
    public ArrayList<UriData> zzcy;

    /* renamed from: com.google.android.gms.wallet.wobs.CommonWalletObject$a */
    public final class C15173a {
        public C15173a() {
        }
    }

    @SafeParcelable.Constructor
    public CommonWalletObject(@SafeParcelable.Param(mo49216id = 2) String str, @SafeParcelable.Param(mo49216id = 3) String str2, @SafeParcelable.Param(mo49216id = 4) String str3, @SafeParcelable.Param(mo49216id = 5) String str4, @SafeParcelable.Param(mo49216id = 6) String str5, @SafeParcelable.Param(mo49216id = 7) String str6, @SafeParcelable.Param(mo49216id = 8) String str7, @SafeParcelable.Param(mo49216id = 9) String str8, @SafeParcelable.Param(mo49216id = 10) int i, @SafeParcelable.Param(mo49216id = 11) ArrayList<WalletObjectMessage> arrayList, @SafeParcelable.Param(mo49216id = 12) TimeInterval timeInterval, @SafeParcelable.Param(mo49216id = 13) ArrayList<LatLng> arrayList2, @SafeParcelable.Param(mo49216id = 14) String str9, @SafeParcelable.Param(mo49216id = 15) String str10, @SafeParcelable.Param(mo49216id = 16) ArrayList<LabelValueRow> arrayList3, @SafeParcelable.Param(mo49216id = 17) boolean z, @SafeParcelable.Param(mo49216id = 18) ArrayList<UriData> arrayList4, @SafeParcelable.Param(mo49216id = 19) ArrayList<TextModuleData> arrayList5, @SafeParcelable.Param(mo49216id = 20) ArrayList<UriData> arrayList6) {
        this.zzcf = str;
        this.zzco = str2;
        this.name = str3;
        this.zzch = str4;
        this.zzck = str5;
        this.zzcl = str6;
        this.zzcm = str7;
        this.zzcn = str8;
        this.state = i;
        this.zzcp = arrayList;
        this.zzcq = timeInterval;
        this.zzcr = arrayList2;
        this.zzcs = str9;
        this.zzct = str10;
        this.zzcu = arrayList3;
        this.zzcv = z;
        this.zzcw = arrayList4;
        this.zzcx = arrayList5;
        this.zzcy = arrayList6;
    }

    public static C15173a zze() {
        return new C15173a();
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

    public final ArrayList<WalletObjectMessage> getMessages() {
        return this.zzcp;
    }

    public final String getName() {
        return this.name;
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

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzcf, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzco, false);
        SafeParcelWriter.writeString(parcel, 4, this.name, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzch, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzck, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzcl, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzcm, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzcn, false);
        SafeParcelWriter.writeInt(parcel, 10, this.state);
        SafeParcelWriter.writeTypedList(parcel, 11, this.zzcp, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzcq, i, false);
        SafeParcelWriter.writeTypedList(parcel, 13, this.zzcr, false);
        SafeParcelWriter.writeString(parcel, 14, this.zzcs, false);
        SafeParcelWriter.writeString(parcel, 15, this.zzct, false);
        SafeParcelWriter.writeTypedList(parcel, 16, this.zzcu, false);
        SafeParcelWriter.writeBoolean(parcel, 17, this.zzcv);
        SafeParcelWriter.writeTypedList(parcel, 18, this.zzcw, false);
        SafeParcelWriter.writeTypedList(parcel, 19, this.zzcx, false);
        SafeParcelWriter.writeTypedList(parcel, 20, this.zzcy, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public CommonWalletObject() {
        this.zzcp = ArrayUtils.newArrayList();
        this.zzcr = ArrayUtils.newArrayList();
        this.zzcu = ArrayUtils.newArrayList();
        this.zzcw = ArrayUtils.newArrayList();
        this.zzcx = ArrayUtils.newArrayList();
        this.zzcy = ArrayUtils.newArrayList();
    }
}
