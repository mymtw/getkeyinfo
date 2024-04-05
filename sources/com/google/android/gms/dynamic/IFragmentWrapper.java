package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.C14466f;
import com.google.android.gms.internal.common.zzb;

public interface IFragmentWrapper extends IInterface {

    public static abstract class Stub extends zzb implements IFragmentWrapper {
        public Stub() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        public static IFragmentWrapper asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            return queryLocalInterface instanceof IFragmentWrapper ? (IFragmentWrapper) queryLocalInterface : new zza(iBinder);
        }

        public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z = false;
            switch (i) {
                case 2:
                    IObjectWrapper zzg = zzg();
                    parcel2.writeNoException();
                    C14466f.m22924b(parcel2, zzg);
                    break;
                case 3:
                    Bundle zzd = zzd();
                    parcel2.writeNoException();
                    int i3 = C14466f.f32597a;
                    if (zzd != null) {
                        parcel2.writeInt(1);
                        zzd.writeToParcel(parcel2, 1);
                        break;
                    } else {
                        parcel2.writeInt(0);
                        break;
                    }
                case 4:
                    int zzb = zzb();
                    parcel2.writeNoException();
                    parcel2.writeInt(zzb);
                    break;
                case 5:
                    IFragmentWrapper zze = zze();
                    parcel2.writeNoException();
                    C14466f.m22924b(parcel2, zze);
                    break;
                case 6:
                    IObjectWrapper zzh = zzh();
                    parcel2.writeNoException();
                    C14466f.m22924b(parcel2, zzh);
                    break;
                case 7:
                    boolean zzs = zzs();
                    parcel2.writeNoException();
                    int i4 = C14466f.f32597a;
                    parcel2.writeInt(zzs ? 1 : 0);
                    break;
                case 8:
                    String zzj = zzj();
                    parcel2.writeNoException();
                    parcel2.writeString(zzj);
                    break;
                case 9:
                    IFragmentWrapper zzf = zzf();
                    parcel2.writeNoException();
                    C14466f.m22924b(parcel2, zzf);
                    break;
                case 10:
                    int zzc = zzc();
                    parcel2.writeNoException();
                    parcel2.writeInt(zzc);
                    break;
                case 11:
                    boolean zzt = zzt();
                    parcel2.writeNoException();
                    int i5 = C14466f.f32597a;
                    parcel2.writeInt(zzt ? 1 : 0);
                    break;
                case 12:
                    IObjectWrapper zzi = zzi();
                    parcel2.writeNoException();
                    C14466f.m22924b(parcel2, zzi);
                    break;
                case 13:
                    boolean zzu = zzu();
                    parcel2.writeNoException();
                    int i6 = C14466f.f32597a;
                    parcel2.writeInt(zzu ? 1 : 0);
                    break;
                case 14:
                    boolean zzv = zzv();
                    parcel2.writeNoException();
                    int i7 = C14466f.f32597a;
                    parcel2.writeInt(zzv ? 1 : 0);
                    break;
                case 15:
                    boolean zzw = zzw();
                    parcel2.writeNoException();
                    int i8 = C14466f.f32597a;
                    parcel2.writeInt(zzw ? 1 : 0);
                    break;
                case 16:
                    boolean zzx = zzx();
                    parcel2.writeNoException();
                    int i9 = C14466f.f32597a;
                    parcel2.writeInt(zzx ? 1 : 0);
                    break;
                case 17:
                    boolean zzy = zzy();
                    parcel2.writeNoException();
                    int i10 = C14466f.f32597a;
                    parcel2.writeInt(zzy ? 1 : 0);
                    break;
                case 18:
                    boolean zzz = zzz();
                    parcel2.writeNoException();
                    int i11 = C14466f.f32597a;
                    parcel2.writeInt(zzz ? 1 : 0);
                    break;
                case 19:
                    boolean zzA = zzA();
                    parcel2.writeNoException();
                    int i12 = C14466f.f32597a;
                    parcel2.writeInt(zzA ? 1 : 0);
                    break;
                case 20:
                    zzk(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 21:
                    int i13 = C14466f.f32597a;
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    zzl(z);
                    parcel2.writeNoException();
                    break;
                case 22:
                    int i14 = C14466f.f32597a;
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    zzm(z);
                    parcel2.writeNoException();
                    break;
                case 23:
                    int i15 = C14466f.f32597a;
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    zzn(z);
                    parcel2.writeNoException();
                    break;
                case 24:
                    int i16 = C14466f.f32597a;
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    zzo(z);
                    parcel2.writeNoException();
                    break;
                case 25:
                    zzp((Intent) C14466f.m22923a(parcel, Intent.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 26:
                    zzq((Intent) C14466f.m22923a(parcel, Intent.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 27:
                    zzr(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                default:
                    return false;
            }
            return true;
        }
    }

    boolean zzA() throws RemoteException;

    int zzb() throws RemoteException;

    int zzc() throws RemoteException;

    Bundle zzd() throws RemoteException;

    IFragmentWrapper zze() throws RemoteException;

    IFragmentWrapper zzf() throws RemoteException;

    IObjectWrapper zzg() throws RemoteException;

    IObjectWrapper zzh() throws RemoteException;

    IObjectWrapper zzi() throws RemoteException;

    String zzj() throws RemoteException;

    void zzk(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzl(boolean z) throws RemoteException;

    void zzm(boolean z) throws RemoteException;

    void zzn(boolean z) throws RemoteException;

    void zzo(boolean z) throws RemoteException;

    void zzp(Intent intent) throws RemoteException;

    void zzq(Intent intent, int i) throws RemoteException;

    void zzr(IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean zzs() throws RemoteException;

    boolean zzt() throws RemoteException;

    boolean zzu() throws RemoteException;

    boolean zzv() throws RemoteException;

    boolean zzw() throws RemoteException;

    boolean zzx() throws RemoteException;

    boolean zzy() throws RemoteException;

    boolean zzz() throws RemoteException;
}
