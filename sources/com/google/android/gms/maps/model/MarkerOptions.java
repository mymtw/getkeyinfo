package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import p549dk.C17571a;

@SafeParcelable.Class(creator = "MarkerOptionsCreator")
@SafeParcelable.Reserved({1})
public final class MarkerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new zzh();
    @SafeParcelable.Field(defaultValue = "1.0f", getter = "getAlpha", mo49213id = 14)
    private float alpha = 1.0f;
    @SafeParcelable.Field(getter = "getPosition", mo49213id = 2)
    private LatLng position;
    @SafeParcelable.Field(getter = "getZIndex", mo49213id = 15)
    private float zzcs;
    @SafeParcelable.Field(getter = "isVisible", mo49213id = 9)
    private boolean zzct = true;
    @SafeParcelable.Field(getter = "getAnchorU", mo49213id = 6)
    private float zzdb = 0.5f;
    @SafeParcelable.Field(getter = "getAnchorV", mo49213id = 7)
    private float zzdc = 1.0f;
    @SafeParcelable.Field(getter = "getTitle", mo49213id = 3)
    private String zzdn;
    @SafeParcelable.Field(getter = "getSnippet", mo49213id = 4)
    private String zzdo;
    @SafeParcelable.Field(getter = "getWrappedIconDescriptorImplBinder", mo49213id = 5, type = "android.os.IBinder")
    private C17571a zzdp;
    @SafeParcelable.Field(getter = "isDraggable", mo49213id = 8)
    private boolean zzdq;
    @SafeParcelable.Field(getter = "isFlat", mo49213id = 10)
    private boolean zzdr = false;
    @SafeParcelable.Field(getter = "getRotation", mo49213id = 11)
    private float zzds = 0.0f;
    @SafeParcelable.Field(defaultValue = "0.5f", getter = "getInfoWindowAnchorU", mo49213id = 12)
    private float zzdt = 0.5f;
    @SafeParcelable.Field(getter = "getInfoWindowAnchorV", mo49213id = 13)
    private float zzdu = 0.0f;

    public MarkerOptions() {
    }

    public final MarkerOptions alpha(float f) {
        this.alpha = f;
        return this;
    }

    public final MarkerOptions anchor(float f, float f2) {
        this.zzdb = f;
        this.zzdc = f2;
        return this;
    }

    public final MarkerOptions draggable(boolean z) {
        this.zzdq = z;
        return this;
    }

    public final MarkerOptions flat(boolean z) {
        this.zzdr = z;
        return this;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final float getAnchorU() {
        return this.zzdb;
    }

    public final float getAnchorV() {
        return this.zzdc;
    }

    public final C17571a getIcon() {
        return this.zzdp;
    }

    public final float getInfoWindowAnchorU() {
        return this.zzdt;
    }

    public final float getInfoWindowAnchorV() {
        return this.zzdu;
    }

    public final LatLng getPosition() {
        return this.position;
    }

    public final float getRotation() {
        return this.zzds;
    }

    public final String getSnippet() {
        return this.zzdo;
    }

    public final String getTitle() {
        return this.zzdn;
    }

    public final float getZIndex() {
        return this.zzcs;
    }

    public final MarkerOptions icon(C17571a aVar) {
        this.zzdp = aVar;
        return this;
    }

    public final MarkerOptions infoWindowAnchor(float f, float f2) {
        this.zzdt = f;
        this.zzdu = f2;
        return this;
    }

    public final boolean isDraggable() {
        return this.zzdq;
    }

    public final boolean isFlat() {
        return this.zzdr;
    }

    public final boolean isVisible() {
        return this.zzct;
    }

    public final MarkerOptions position(LatLng latLng) {
        if (latLng != null) {
            this.position = latLng;
            return this;
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }

    public final MarkerOptions rotation(float f) {
        this.zzds = f;
        return this;
    }

    public final MarkerOptions snippet(String str) {
        this.zzdo = str;
        return this;
    }

    public final MarkerOptions title(String str) {
        this.zzdn = str;
        return this;
    }

    public final MarkerOptions visible(boolean z) {
        this.zzct = z;
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getPosition(), i, false);
        SafeParcelWriter.writeString(parcel, 3, getTitle(), false);
        SafeParcelWriter.writeString(parcel, 4, getSnippet(), false);
        C17571a aVar = this.zzdp;
        SafeParcelWriter.writeIBinder(parcel, 5, aVar == null ? null : aVar.f38442a.asBinder(), false);
        SafeParcelWriter.writeFloat(parcel, 6, getAnchorU());
        SafeParcelWriter.writeFloat(parcel, 7, getAnchorV());
        SafeParcelWriter.writeBoolean(parcel, 8, isDraggable());
        SafeParcelWriter.writeBoolean(parcel, 9, isVisible());
        SafeParcelWriter.writeBoolean(parcel, 10, isFlat());
        SafeParcelWriter.writeFloat(parcel, 11, getRotation());
        SafeParcelWriter.writeFloat(parcel, 12, getInfoWindowAnchorU());
        SafeParcelWriter.writeFloat(parcel, 13, getInfoWindowAnchorV());
        SafeParcelWriter.writeFloat(parcel, 14, getAlpha());
        SafeParcelWriter.writeFloat(parcel, 15, getZIndex());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final MarkerOptions zIndex(float f) {
        this.zzcs = f;
        return this;
    }

    @SafeParcelable.Constructor
    public MarkerOptions(@SafeParcelable.Param(mo49216id = 2) LatLng latLng, @SafeParcelable.Param(mo49216id = 3) String str, @SafeParcelable.Param(mo49216id = 4) String str2, @SafeParcelable.Param(mo49216id = 5) IBinder iBinder, @SafeParcelable.Param(mo49216id = 6) float f, @SafeParcelable.Param(mo49216id = 7) float f2, @SafeParcelable.Param(mo49216id = 8) boolean z, @SafeParcelable.Param(mo49216id = 9) boolean z2, @SafeParcelable.Param(mo49216id = 10) boolean z3, @SafeParcelable.Param(mo49216id = 11) float f3, @SafeParcelable.Param(mo49216id = 12) float f4, @SafeParcelable.Param(mo49216id = 13) float f5, @SafeParcelable.Param(mo49216id = 14) float f6, @SafeParcelable.Param(mo49216id = 15) float f7) {
        this.position = latLng;
        this.zzdn = str;
        this.zzdo = str2;
        if (iBinder == null) {
            this.zzdp = null;
        } else {
            this.zzdp = new C17571a(IObjectWrapper.Stub.asInterface(iBinder));
        }
        this.zzdb = f;
        this.zzdc = f2;
        this.zzdq = z;
        this.zzct = z2;
        this.zzdr = z3;
        this.zzds = f3;
        this.zzdt = f4;
        this.zzdu = f5;
        this.alpha = f6;
        this.zzcs = f7;
    }
}
