package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzaa;
import com.google.android.gms.internal.maps.zzac;
import com.google.android.gms.internal.maps.zzad;
import com.google.android.gms.internal.maps.zzh;
import com.google.android.gms.internal.maps.zzi;
import com.google.android.gms.internal.maps.zzk;
import com.google.android.gms.internal.maps.zzl;
import com.google.android.gms.internal.maps.zzn;
import com.google.android.gms.internal.maps.zzo;
import com.google.android.gms.internal.maps.zzt;
import com.google.android.gms.internal.maps.zzu;
import com.google.android.gms.internal.maps.zzw;
import com.google.android.gms.internal.maps.zzx;
import com.google.android.gms.internal.maps.zzz;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import p711xj.C18785a;

public final class zzg extends zza implements IGoogleMapDelegate {
    public zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    public final zzh addCircle(CircleOptions circleOptions) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31701c(zza, circleOptions);
        Parcel zza2 = zza(35, zza);
        zzh zzc = zzi.zzc(zza2.readStrongBinder());
        zza2.recycle();
        return zzc;
    }

    public final zzk addGroundOverlay(GroundOverlayOptions groundOverlayOptions) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31701c(zza, groundOverlayOptions);
        Parcel zza2 = zza(12, zza);
        zzk zzd = zzl.zzd(zza2.readStrongBinder());
        zza2.recycle();
        return zzd;
    }

    public final zzt addMarker(MarkerOptions markerOptions) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31701c(zza, markerOptions);
        Parcel zza2 = zza(11, zza);
        zzt zzg = zzu.zzg(zza2.readStrongBinder());
        zza2.recycle();
        return zzg;
    }

    public final zzw addPolygon(PolygonOptions polygonOptions) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31701c(zza, polygonOptions);
        Parcel zza2 = zza(10, zza);
        zzw zzh = zzx.zzh(zza2.readStrongBinder());
        zza2.recycle();
        return zzh;
    }

    public final zzz addPolyline(PolylineOptions polylineOptions) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31701c(zza, polylineOptions);
        Parcel zza2 = zza(9, zza);
        zzz zzi = zzaa.zzi(zza2.readStrongBinder());
        zza2.recycle();
        return zzi;
    }

    public final zzac addTileOverlay(TileOverlayOptions tileOverlayOptions) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31701c(zza, tileOverlayOptions);
        Parcel zza2 = zza(13, zza);
        zzac zzj = zzad.zzj(zza2.readStrongBinder());
        zza2.recycle();
        return zzj;
    }

    public final void animateCamera(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, iObjectWrapper);
        zzb(5, zza);
    }

    public final void animateCameraWithCallback(IObjectWrapper iObjectWrapper, zzc zzc) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, iObjectWrapper);
        C18785a.m31700b(zza, zzc);
        zzb(6, zza);
    }

    public final void animateCameraWithDurationAndCallback(IObjectWrapper iObjectWrapper, int i, zzc zzc) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, iObjectWrapper);
        zza.writeInt(i);
        C18785a.m31700b(zza, zzc);
        zzb(7, zza);
    }

    public final void clear() throws RemoteException {
        zzb(14, zza());
    }

    public final CameraPosition getCameraPosition() throws RemoteException {
        Parcel zza = zza(1, zza());
        CameraPosition cameraPosition = (CameraPosition) C18785a.m31699a(zza, CameraPosition.CREATOR);
        zza.recycle();
        return cameraPosition;
    }

    public final zzn getFocusedBuilding() throws RemoteException {
        Parcel zza = zza(44, zza());
        zzn zze = zzo.zze(zza.readStrongBinder());
        zza.recycle();
        return zze;
    }

    public final void getMapAsync(zzap zzap) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, zzap);
        zzb(53, zza);
    }

    public final int getMapType() throws RemoteException {
        Parcel zza = zza(15, zza());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }

    public final float getMaxZoomLevel() throws RemoteException {
        Parcel zza = zza(2, zza());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    public final float getMinZoomLevel() throws RemoteException {
        Parcel zza = zza(3, zza());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    public final Location getMyLocation() throws RemoteException {
        Parcel zza = zza(23, zza());
        Location location = (Location) C18785a.m31699a(zza, Location.CREATOR);
        zza.recycle();
        return location;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.maps.internal.IProjectionDelegate getProjection() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 26
            android.os.Parcel r0 = r4.zza(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.maps.internal.IProjectionDelegate"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.maps.internal.IProjectionDelegate
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.maps.internal.IProjectionDelegate r1 = (com.google.android.gms.maps.internal.IProjectionDelegate) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.maps.internal.zzbr r2 = new com.google.android.gms.maps.internal.zzbr
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzg.getProjection():com.google.android.gms.maps.internal.IProjectionDelegate");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.maps.internal.IUiSettingsDelegate getUiSettings() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 25
            android.os.Parcel r0 = r4.zza(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.maps.internal.IUiSettingsDelegate"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.maps.internal.IUiSettingsDelegate
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.maps.internal.IUiSettingsDelegate r1 = (com.google.android.gms.maps.internal.IUiSettingsDelegate) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.maps.internal.zzbx r2 = new com.google.android.gms.maps.internal.zzbx
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzg.getUiSettings():com.google.android.gms.maps.internal.IUiSettingsDelegate");
    }

    public final boolean isBuildingsEnabled() throws RemoteException {
        Parcel zza = zza(40, zza());
        boolean d = C18785a.m31702d(zza);
        zza.recycle();
        return d;
    }

    public final boolean isIndoorEnabled() throws RemoteException {
        Parcel zza = zza(19, zza());
        boolean d = C18785a.m31702d(zza);
        zza.recycle();
        return d;
    }

    public final boolean isMyLocationEnabled() throws RemoteException {
        Parcel zza = zza(21, zza());
        boolean d = C18785a.m31702d(zza);
        zza.recycle();
        return d;
    }

    public final boolean isTrafficEnabled() throws RemoteException {
        Parcel zza = zza(17, zza());
        boolean d = C18785a.m31702d(zza);
        zza.recycle();
        return d;
    }

    public final void moveCamera(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, iObjectWrapper);
        zzb(4, zza);
    }

    public final void onCreate(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31701c(zza, bundle);
        zzb(54, zza);
    }

    public final void onDestroy() throws RemoteException {
        zzb(57, zza());
    }

    public final void onEnterAmbient(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31701c(zza, bundle);
        zzb(81, zza);
    }

    public final void onExitAmbient() throws RemoteException {
        zzb(82, zza());
    }

    public final void onLowMemory() throws RemoteException {
        zzb(58, zza());
    }

    public final void onPause() throws RemoteException {
        zzb(56, zza());
    }

    public final void onResume() throws RemoteException {
        zzb(55, zza());
    }

    public final void onSaveInstanceState(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31701c(zza, bundle);
        Parcel zza2 = zza(60, zza);
        if (zza2.readInt() != 0) {
            bundle.readFromParcel(zza2);
        }
        zza2.recycle();
    }

    public final void onStart() throws RemoteException {
        zzb(101, zza());
    }

    public final void onStop() throws RemoteException {
        zzb(102, zza());
    }

    public final void resetMinMaxZoomPreference() throws RemoteException {
        zzb(94, zza());
    }

    public final void setBuildingsEnabled(boolean z) throws RemoteException {
        Parcel zza = zza();
        ClassLoader classLoader = C18785a.f41654a;
        zza.writeInt(z ? 1 : 0);
        zzb(41, zza);
    }

    public final void setContentDescription(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzb(61, zza);
    }

    public final boolean setIndoorEnabled(boolean z) throws RemoteException {
        Parcel zza = zza();
        ClassLoader classLoader = C18785a.f41654a;
        zza.writeInt(z ? 1 : 0);
        Parcel zza2 = zza(20, zza);
        boolean d = C18785a.m31702d(zza2);
        zza2.recycle();
        return d;
    }

    public final void setInfoWindowAdapter(zzh zzh) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, zzh);
        zzb(33, zza);
    }

    public final void setLatLngBoundsForCameraTarget(LatLngBounds latLngBounds) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31701c(zza, latLngBounds);
        zzb(95, zza);
    }

    public final void setLocationSource(ILocationSourceDelegate iLocationSourceDelegate) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, iLocationSourceDelegate);
        zzb(24, zza);
    }

    public final boolean setMapStyle(MapStyleOptions mapStyleOptions) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31701c(zza, mapStyleOptions);
        Parcel zza2 = zza(91, zza);
        boolean d = C18785a.m31702d(zza2);
        zza2.recycle();
        return d;
    }

    public final void setMapType(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzb(16, zza);
    }

    public final void setMaxZoomPreference(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zzb(93, zza);
    }

    public final void setMinZoomPreference(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zzb(92, zza);
    }

    public final void setMyLocationEnabled(boolean z) throws RemoteException {
        Parcel zza = zza();
        ClassLoader classLoader = C18785a.f41654a;
        zza.writeInt(z ? 1 : 0);
        zzb(22, zza);
    }

    public final void setOnCameraChangeListener(zzl zzl) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, zzl);
        zzb(27, zza);
    }

    public final void setOnCameraIdleListener(zzn zzn) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, zzn);
        zzb(99, zza);
    }

    public final void setOnCameraMoveCanceledListener(zzp zzp) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, zzp);
        zzb(98, zza);
    }

    public final void setOnCameraMoveListener(zzr zzr) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, zzr);
        zzb(97, zza);
    }

    public final void setOnCameraMoveStartedListener(zzt zzt) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, zzt);
        zzb(96, zza);
    }

    public final void setOnCircleClickListener(zzv zzv) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, zzv);
        zzb(89, zza);
    }

    public final void setOnGroundOverlayClickListener(zzx zzx) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, zzx);
        zzb(83, zza);
    }

    public final void setOnIndoorStateChangeListener(zzz zzz) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, zzz);
        zzb(45, zza);
    }

    public final void setOnInfoWindowClickListener(zzab zzab) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, zzab);
        zzb(32, zza);
    }

    public final void setOnInfoWindowCloseListener(zzad zzad) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, zzad);
        zzb(86, zza);
    }

    public final void setOnInfoWindowLongClickListener(zzaf zzaf) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, zzaf);
        zzb(84, zza);
    }

    public final void setOnMapClickListener(zzaj zzaj) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, zzaj);
        zzb(28, zza);
    }

    public final void setOnMapLoadedCallback(zzal zzal) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, zzal);
        zzb(42, zza);
    }

    public final void setOnMapLongClickListener(zzan zzan) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, zzan);
        zzb(29, zza);
    }

    public final void setOnMarkerClickListener(zzar zzar) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, zzar);
        zzb(30, zza);
    }

    public final void setOnMarkerDragListener(zzat zzat) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, zzat);
        zzb(31, zza);
    }

    public final void setOnMyLocationButtonClickListener(zzav zzav) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, zzav);
        zzb(37, zza);
    }

    public final void setOnMyLocationChangeListener(zzax zzax) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, zzax);
        zzb(36, zza);
    }

    public final void setOnMyLocationClickListener(zzaz zzaz) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, zzaz);
        zzb(107, zza);
    }

    public final void setOnPoiClickListener(zzbb zzbb) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, zzbb);
        zzb(80, zza);
    }

    public final void setOnPolygonClickListener(zzbd zzbd) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, zzbd);
        zzb(85, zza);
    }

    public final void setOnPolylineClickListener(zzbf zzbf) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, zzbf);
        zzb(87, zza);
    }

    public final void setPadding(int i, int i2, int i3, int i4) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeInt(i2);
        zza.writeInt(i3);
        zza.writeInt(i4);
        zzb(39, zza);
    }

    public final void setTrafficEnabled(boolean z) throws RemoteException {
        Parcel zza = zza();
        ClassLoader classLoader = C18785a.f41654a;
        zza.writeInt(z ? 1 : 0);
        zzb(18, zza);
    }

    public final void setWatermarkEnabled(boolean z) throws RemoteException {
        Parcel zza = zza();
        ClassLoader classLoader = C18785a.f41654a;
        zza.writeInt(z ? 1 : 0);
        zzb(51, zza);
    }

    public final void snapshot(zzbs zzbs, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, zzbs);
        C18785a.m31700b(zza, iObjectWrapper);
        zzb(38, zza);
    }

    public final void snapshotForTest(zzbs zzbs) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, zzbs);
        zzb(71, zza);
    }

    public final void stopAnimation() throws RemoteException {
        zzb(8, zza());
    }

    public final boolean useViewLifecycleWhenInFragment() throws RemoteException {
        Parcel zza = zza(59, zza());
        boolean d = C18785a.m31702d(zza);
        zza.recycle();
        return d;
    }
}
