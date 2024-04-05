package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzaa implements Parcelable.Creator<zzz> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Thing[] thingArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        zzc zzc = null;
        String str = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 2:
                    thingArr = (Thing[]) SafeParcelReader.createTypedArray(parcel, readHeader, Thing.CREATOR);
                    break;
                case 3:
                    strArr = SafeParcelReader.createStringArray(parcel, readHeader);
                    break;
                case 5:
                    strArr2 = SafeParcelReader.createStringArray(parcel, readHeader);
                    break;
                case 6:
                    zzc = (zzc) SafeParcelReader.createParcelable(parcel, readHeader, zzc.CREATOR);
                    break;
                case 7:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 8:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzz(i, thingArr, strArr, strArr2, zzc, str, str2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzz[i];
    }
}
