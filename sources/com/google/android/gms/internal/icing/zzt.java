package com.google.android.gms.internal.icing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzt implements Parcelable.Creator<zzs> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        zzm[] zzmArr = null;
        String str4 = null;
        zzu zzu = null;
        int i = 1;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 11) {
                str4 = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId != 12) {
                switch (fieldId) {
                    case 1:
                        str = SafeParcelReader.createString(parcel, readHeader);
                        break;
                    case 2:
                        str2 = SafeParcelReader.createString(parcel, readHeader);
                        break;
                    case 3:
                        z = SafeParcelReader.readBoolean(parcel, readHeader);
                        break;
                    case 4:
                        i = SafeParcelReader.readInt(parcel, readHeader);
                        break;
                    case 5:
                        z2 = SafeParcelReader.readBoolean(parcel, readHeader);
                        break;
                    case 6:
                        str3 = SafeParcelReader.createString(parcel, readHeader);
                        break;
                    case 7:
                        zzmArr = (zzm[]) SafeParcelReader.createTypedArray(parcel, readHeader, zzm.CREATOR);
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel, readHeader);
                        break;
                }
            } else {
                zzu = (zzu) SafeParcelReader.createParcelable(parcel, readHeader, zzu.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzs(str, str2, z, i, z2, str3, zzmArr, str4, zzu);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzs[i];
    }
}
