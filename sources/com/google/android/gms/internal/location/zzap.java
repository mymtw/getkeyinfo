package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.zzal;
import p703wj.C18711n;

public final class zzap extends zza implements zzao {
    public zzap(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    public final Location zza(String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        Parcel transactAndReadException = transactAndReadException(21, obtainAndWriteInterfaceToken);
        Location location = (Location) C18711n.m31555a(transactAndReadException, Location.CREATOR);
        transactAndReadException.recycle();
        return location;
    }

    public final void zza(long j, boolean z, PendingIntent pendingIntent) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeLong(j);
        int i = C18711n.f41464a;
        obtainAndWriteInterfaceToken.writeInt(1);
        C18711n.m31557c(obtainAndWriteInterfaceToken, pendingIntent);
        transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
    }

    public final void zza(PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18711n.m31557c(obtainAndWriteInterfaceToken, pendingIntent);
        C18711n.m31556b(obtainAndWriteInterfaceToken, iStatusCallback);
        transactAndReadExceptionReturnVoid(73, obtainAndWriteInterfaceToken);
    }

    public final void zza(Location location) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18711n.m31557c(obtainAndWriteInterfaceToken, location);
        transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken);
    }

    public final void zza(zzaj zzaj) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18711n.m31556b(obtainAndWriteInterfaceToken, zzaj);
        transactAndReadExceptionReturnVoid(67, obtainAndWriteInterfaceToken);
    }

    public final void zza(zzbf zzbf) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18711n.m31557c(obtainAndWriteInterfaceToken, zzbf);
        transactAndReadExceptionReturnVoid(59, obtainAndWriteInterfaceToken);
    }

    public final void zza(zzo zzo) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18711n.m31557c(obtainAndWriteInterfaceToken, zzo);
        transactAndReadExceptionReturnVoid(75, obtainAndWriteInterfaceToken);
    }

    public final void zza(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18711n.m31557c(obtainAndWriteInterfaceToken, activityTransitionRequest);
        C18711n.m31557c(obtainAndWriteInterfaceToken, pendingIntent);
        C18711n.m31556b(obtainAndWriteInterfaceToken, iStatusCallback);
        transactAndReadExceptionReturnVoid(72, obtainAndWriteInterfaceToken);
    }

    public final void zza(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, zzam zzam) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18711n.m31557c(obtainAndWriteInterfaceToken, geofencingRequest);
        C18711n.m31557c(obtainAndWriteInterfaceToken, pendingIntent);
        C18711n.m31556b(obtainAndWriteInterfaceToken, zzam);
        transactAndReadExceptionReturnVoid(57, obtainAndWriteInterfaceToken);
    }

    public final void zza(LocationSettingsRequest locationSettingsRequest, zzaq zzaq, String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18711n.m31557c(obtainAndWriteInterfaceToken, locationSettingsRequest);
        C18711n.m31556b(obtainAndWriteInterfaceToken, zzaq);
        obtainAndWriteInterfaceToken.writeString(str);
        transactAndReadExceptionReturnVoid(63, obtainAndWriteInterfaceToken);
    }

    public final void zza(zzal zzal, zzam zzam) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18711n.m31557c(obtainAndWriteInterfaceToken, zzal);
        C18711n.m31556b(obtainAndWriteInterfaceToken, zzam);
        transactAndReadExceptionReturnVoid(74, obtainAndWriteInterfaceToken);
    }

    public final LocationAvailability zzb(String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        Parcel transactAndReadException = transactAndReadException(34, obtainAndWriteInterfaceToken);
        LocationAvailability locationAvailability = (LocationAvailability) C18711n.m31555a(transactAndReadException, LocationAvailability.CREATOR);
        transactAndReadException.recycle();
        return locationAvailability;
    }

    public final void zzb(PendingIntent pendingIntent) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18711n.m31557c(obtainAndWriteInterfaceToken, pendingIntent);
        transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
    }

    public final void zza(boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        int i = C18711n.f41464a;
        obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
        transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken);
    }
}
