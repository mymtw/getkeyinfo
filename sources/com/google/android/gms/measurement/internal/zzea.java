package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C14660h0;
import com.google.android.gms.internal.measurement.zzbn;
import java.util.List;

public abstract class zzea extends zzbn implements zzeb {
    public zzea() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean z = false;
        switch (i) {
            case 1:
                zzk((zzat) C14660h0.m23607a(parcel, zzat.CREATOR), (zzp) C14660h0.m23607a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                zzt((zzkv) C14660h0.m23607a(parcel, zzkv.CREATOR), (zzp) C14660h0.m23607a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                break;
            case 4:
                zzj((zzp) C14660h0.m23607a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                break;
            case 5:
                zzl((zzat) C14660h0.m23607a(parcel, zzat.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 6:
                zzs((zzp) C14660h0.m23607a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                break;
            case 7:
                zzp zzp = (zzp) C14660h0.m23607a(parcel, zzp.CREATOR);
                if (parcel.readInt() != 0) {
                    z = true;
                }
                List<zzkv> zze = zze(zzp, z);
                parcel2.writeNoException();
                parcel2.writeTypedList(zze);
                break;
            case 9:
                byte[] zzu = zzu((zzat) C14660h0.m23607a(parcel, zzat.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(zzu);
                break;
            case 10:
                zzq(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 11:
                String zzd = zzd((zzp) C14660h0.m23607a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(zzd);
                break;
            case 12:
                zzn((zzab) C14660h0.m23607a(parcel, zzab.CREATOR), (zzp) C14660h0.m23607a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                break;
            case 13:
                zzo((zzab) C14660h0.m23607a(parcel, zzab.CREATOR));
                parcel2.writeNoException();
                break;
            case 14:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                ClassLoader classLoader = C14660h0.f32859a;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                List<zzkv> zzh = zzh(readString, readString2, z, (zzp) C14660h0.m23607a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(zzh);
                break;
            case 15:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                ClassLoader classLoader2 = C14660h0.f32859a;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                List<zzkv> zzi = zzi(readString3, readString4, readString5, z);
                parcel2.writeNoException();
                parcel2.writeTypedList(zzi);
                break;
            case 16:
                List<zzab> zzf = zzf(parcel.readString(), parcel.readString(), (zzp) C14660h0.m23607a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(zzf);
                break;
            case 17:
                List<zzab> zzg = zzg(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(zzg);
                break;
            case 18:
                zzm((zzp) C14660h0.m23607a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                break;
            case 19:
                zzr((Bundle) C14660h0.m23607a(parcel, Bundle.CREATOR), (zzp) C14660h0.m23607a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                break;
            case 20:
                zzp((zzp) C14660h0.m23607a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
