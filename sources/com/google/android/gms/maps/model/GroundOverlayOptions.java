package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import p549dk.C17571a;

@SafeParcelable.Class(creator = "GroundOverlayOptionsCreator")
@SafeParcelable.Reserved({1})
public final class GroundOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GroundOverlayOptions> CREATOR = new zzd();
    public static final float NO_DIMENSION = -1.0f;
    @SafeParcelable.Field(getter = "getBearing", mo49213id = 7)
    private float bearing;
    @SafeParcelable.Field(getter = "getHeight", mo49213id = 5)
    private float height;
    @SafeParcelable.Field(getter = "getWidth", mo49213id = 4)
    private float width;
    @SafeParcelable.Field(getter = "getZIndex", mo49213id = 8)
    private float zzcs;
    @SafeParcelable.Field(getter = "isVisible", mo49213id = 9)
    private boolean zzct = true;
    @SafeParcelable.Field(getter = "isClickable", mo49213id = 13)
    private boolean zzcu = false;
    @SafeParcelable.Field(getter = "getWrappedImageDescriptorImplBinder", mo49213id = 2, type = "android.os.IBinder")
    private C17571a zzcx;
    @SafeParcelable.Field(getter = "getLocation", mo49213id = 3)
    private LatLng zzcy;
    @SafeParcelable.Field(getter = "getBounds", mo49213id = 6)
    private LatLngBounds zzcz;
    @SafeParcelable.Field(getter = "getTransparency", mo49213id = 10)
    private float zzda = 0.0f;
    @SafeParcelable.Field(getter = "getAnchorU", mo49213id = 11)
    private float zzdb = 0.5f;
    @SafeParcelable.Field(getter = "getAnchorV", mo49213id = 12)
    private float zzdc = 0.5f;

    @SafeParcelable.Constructor
    public GroundOverlayOptions(@SafeParcelable.Param(mo49216id = 2) IBinder iBinder, @SafeParcelable.Param(mo49216id = 3) LatLng latLng, @SafeParcelable.Param(mo49216id = 4) float f, @SafeParcelable.Param(mo49216id = 5) float f2, @SafeParcelable.Param(mo49216id = 6) LatLngBounds latLngBounds, @SafeParcelable.Param(mo49216id = 7) float f3, @SafeParcelable.Param(mo49216id = 8) float f4, @SafeParcelable.Param(mo49216id = 9) boolean z, @SafeParcelable.Param(mo49216id = 10) float f5, @SafeParcelable.Param(mo49216id = 11) float f6, @SafeParcelable.Param(mo49216id = 12) float f7, @SafeParcelable.Param(mo49216id = 13) boolean z2) {
        this.zzcx = new C17571a(IObjectWrapper.Stub.asInterface(iBinder));
        this.zzcy = latLng;
        this.width = f;
        this.height = f2;
        this.zzcz = latLngBounds;
        this.bearing = f3;
        this.zzcs = f4;
        this.zzct = z;
        this.zzda = f5;
        this.zzdb = f6;
        this.zzdc = f7;
        this.zzcu = z2;
    }

    private final GroundOverlayOptions zza(LatLng latLng, float f, float f2) {
        this.zzcy = latLng;
        this.width = f;
        this.height = f2;
        return this;
    }

    public final GroundOverlayOptions anchor(float f, float f2) {
        this.zzdb = f;
        this.zzdc = f2;
        return this;
    }

    public final GroundOverlayOptions bearing(float f) {
        this.bearing = ((f % 360.0f) + 360.0f) % 360.0f;
        return this;
    }

    public final GroundOverlayOptions clickable(boolean z) {
        this.zzcu = z;
        return this;
    }

    public final float getAnchorU() {
        return this.zzdb;
    }

    public final float getAnchorV() {
        return this.zzdc;
    }

    public final float getBearing() {
        return this.bearing;
    }

    public final LatLngBounds getBounds() {
        return this.zzcz;
    }

    public final float getHeight() {
        return this.height;
    }

    public final C17571a getImage() {
        return this.zzcx;
    }

    public final LatLng getLocation() {
        return this.zzcy;
    }

    public final float getTransparency() {
        return this.zzda;
    }

    public final float getWidth() {
        return this.width;
    }

    public final float getZIndex() {
        return this.zzcs;
    }

    public final GroundOverlayOptions image(C17571a aVar) {
        Preconditions.checkNotNull(aVar, "imageDescriptor must not be null");
        this.zzcx = aVar;
        return this;
    }

    public final boolean isClickable() {
        return this.zzcu;
    }

    public final boolean isVisible() {
        return this.zzct;
    }

    public final GroundOverlayOptions position(LatLng latLng, float f) {
        boolean z = true;
        Preconditions.checkState(this.zzcz == null, "Position has already been set using positionFromBounds");
        Preconditions.checkArgument(latLng != null, "Location must be specified");
        if (f < 0.0f) {
            z = false;
        }
        Preconditions.checkArgument(z, "Width must be non-negative");
        return zza(latLng, f, -1.0f);
    }

    public final GroundOverlayOptions positionFromBounds(LatLngBounds latLngBounds) {
        LatLng latLng = this.zzcy;
        boolean z = latLng == null;
        String valueOf = String.valueOf(latLng);
        StringBuilder sb = new StringBuilder(valueOf.length() + 46);
        sb.append("Position has already been set using position: ");
        sb.append(valueOf);
        Preconditions.checkState(z, sb.toString());
        this.zzcz = latLngBounds;
        return this;
    }

    public final GroundOverlayOptions transparency(float f) {
        Preconditions.checkArgument(f >= 0.0f && f <= 1.0f, "Transparency must be in the range [0..1]");
        this.zzda = f;
        return this;
    }

    public final GroundOverlayOptions visible(boolean z) {
        this.zzct = z;
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 2, this.zzcx.f38442a.asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getLocation(), i, false);
        SafeParcelWriter.writeFloat(parcel, 4, getWidth());
        SafeParcelWriter.writeFloat(parcel, 5, getHeight());
        SafeParcelWriter.writeParcelable(parcel, 6, getBounds(), i, false);
        SafeParcelWriter.writeFloat(parcel, 7, getBearing());
        SafeParcelWriter.writeFloat(parcel, 8, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 9, isVisible());
        SafeParcelWriter.writeFloat(parcel, 10, getTransparency());
        SafeParcelWriter.writeFloat(parcel, 11, getAnchorU());
        SafeParcelWriter.writeFloat(parcel, 12, getAnchorV());
        SafeParcelWriter.writeBoolean(parcel, 13, isClickable());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final GroundOverlayOptions zIndex(float f) {
        this.zzcs = f;
        return this;
    }

    public final GroundOverlayOptions position(LatLng latLng, float f, float f2) {
        boolean z = true;
        Preconditions.checkState(this.zzcz == null, "Position has already been set using positionFromBounds");
        Preconditions.checkArgument(latLng != null, "Location must be specified");
        Preconditions.checkArgument(f >= 0.0f, "Width must be non-negative");
        if (f2 < 0.0f) {
            z = false;
        }
        Preconditions.checkArgument(z, "Height must be non-negative");
        return zza(latLng, f, f2);
    }

    public GroundOverlayOptions() {
    }
}
