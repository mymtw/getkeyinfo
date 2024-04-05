package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import kotlinx.coroutines.C19543e0;
import p568fn.C17782b;

@SafeParcelable.Class(creator = "GoogleMapOptionsCreator")
@SafeParcelable.Reserved({1})
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new zzaa();
    @SafeParcelable.Field(getter = "getMapType", mo49213id = 4)
    private int mapType = -1;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getZOrderOnTopForParcel", mo49213id = 2, type = "byte")
    private Boolean zzaj;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getUseViewLifecycleInFragmentForParcel", mo49213id = 3, type = "byte")
    private Boolean zzak;
    @SafeParcelable.Field(getter = "getCamera", mo49213id = 5)
    private CameraPosition zzal;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getZoomControlsEnabledForParcel", mo49213id = 6, type = "byte")
    private Boolean zzam;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getCompassEnabledForParcel", mo49213id = 7, type = "byte")
    private Boolean zzan;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getScrollGesturesEnabledForParcel", mo49213id = 8, type = "byte")
    private Boolean zzao;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getZoomGesturesEnabledForParcel", mo49213id = 9, type = "byte")
    private Boolean zzap;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getTiltGesturesEnabledForParcel", mo49213id = 10, type = "byte")
    private Boolean zzaq;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getRotateGesturesEnabledForParcel", mo49213id = 11, type = "byte")
    private Boolean zzar;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getLiteModeForParcel", mo49213id = 12, type = "byte")
    private Boolean zzas;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getMapToolbarEnabledForParcel", mo49213id = 14, type = "byte")
    private Boolean zzat;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getAmbientEnabledForParcel", mo49213id = 15, type = "byte")
    private Boolean zzau;
    @SafeParcelable.Field(getter = "getMinZoomPreference", mo49213id = 16)
    private Float zzav = null;
    @SafeParcelable.Field(getter = "getMaxZoomPreference", mo49213id = 17)
    private Float zzaw = null;
    @SafeParcelable.Field(getter = "getLatLngBoundsForCameraTarget", mo49213id = 18)
    private LatLngBounds zzax = null;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getScrollGesturesEnabledDuringRotateOrZoomForParcel", mo49213id = 19, type = "byte")
    private Boolean zzay;

    @SafeParcelable.Constructor
    public GoogleMapOptions(@SafeParcelable.Param(mo49216id = 2) byte b, @SafeParcelable.Param(mo49216id = 3) byte b2, @SafeParcelable.Param(mo49216id = 4) int i, @SafeParcelable.Param(mo49216id = 5) CameraPosition cameraPosition, @SafeParcelable.Param(mo49216id = 6) byte b3, @SafeParcelable.Param(mo49216id = 7) byte b4, @SafeParcelable.Param(mo49216id = 8) byte b5, @SafeParcelable.Param(mo49216id = 9) byte b6, @SafeParcelable.Param(mo49216id = 10) byte b7, @SafeParcelable.Param(mo49216id = 11) byte b8, @SafeParcelable.Param(mo49216id = 12) byte b9, @SafeParcelable.Param(mo49216id = 14) byte b10, @SafeParcelable.Param(mo49216id = 15) byte b11, @SafeParcelable.Param(mo49216id = 16) Float f, @SafeParcelable.Param(mo49216id = 17) Float f2, @SafeParcelable.Param(mo49216id = 18) LatLngBounds latLngBounds, @SafeParcelable.Param(mo49216id = 19) byte b12) {
        this.zzaj = C17782b.m29895x0(b);
        this.zzak = C17782b.m29895x0(b2);
        this.mapType = i;
        this.zzal = cameraPosition;
        this.zzam = C17782b.m29895x0(b3);
        this.zzan = C17782b.m29895x0(b4);
        this.zzao = C17782b.m29895x0(b5);
        this.zzap = C17782b.m29895x0(b6);
        this.zzaq = C17782b.m29895x0(b7);
        this.zzar = C17782b.m29895x0(b8);
        this.zzas = C17782b.m29895x0(b9);
        this.zzat = C17782b.m29895x0(b10);
        this.zzau = C17782b.m29895x0(b11);
        this.zzav = f;
        this.zzaw = f2;
        this.zzax = latLngBounds;
        this.zzay = C17782b.m29895x0(b12);
    }

    public static GoogleMapOptions createFromAttributes(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C19543e0.f43491d);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (obtainAttributes.hasValue(13)) {
            googleMapOptions.mapType(obtainAttributes.getInt(13, -1));
        }
        if (obtainAttributes.hasValue(23)) {
            googleMapOptions.zOrderOnTop(obtainAttributes.getBoolean(23, false));
        }
        if (obtainAttributes.hasValue(22)) {
            googleMapOptions.useViewLifecycleInFragment(obtainAttributes.getBoolean(22, false));
        }
        if (obtainAttributes.hasValue(14)) {
            googleMapOptions.compassEnabled(obtainAttributes.getBoolean(14, true));
        }
        if (obtainAttributes.hasValue(16)) {
            googleMapOptions.rotateGesturesEnabled(obtainAttributes.getBoolean(16, true));
        }
        if (obtainAttributes.hasValue(18)) {
            googleMapOptions.scrollGesturesEnabledDuringRotateOrZoom(obtainAttributes.getBoolean(18, true));
        }
        if (obtainAttributes.hasValue(17)) {
            googleMapOptions.scrollGesturesEnabled(obtainAttributes.getBoolean(17, true));
        }
        if (obtainAttributes.hasValue(19)) {
            googleMapOptions.tiltGesturesEnabled(obtainAttributes.getBoolean(19, true));
        }
        if (obtainAttributes.hasValue(21)) {
            googleMapOptions.zoomGesturesEnabled(obtainAttributes.getBoolean(21, true));
        }
        if (obtainAttributes.hasValue(20)) {
            googleMapOptions.zoomControlsEnabled(obtainAttributes.getBoolean(20, true));
        }
        if (obtainAttributes.hasValue(12)) {
            googleMapOptions.liteMode(obtainAttributes.getBoolean(12, false));
        }
        if (obtainAttributes.hasValue(15)) {
            googleMapOptions.mapToolbarEnabled(obtainAttributes.getBoolean(15, true));
        }
        if (obtainAttributes.hasValue(0)) {
            googleMapOptions.ambientEnabled(obtainAttributes.getBoolean(0, false));
        }
        if (obtainAttributes.hasValue(3)) {
            googleMapOptions.minZoomPreference(obtainAttributes.getFloat(3, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(3)) {
            googleMapOptions.maxZoomPreference(obtainAttributes.getFloat(2, Float.POSITIVE_INFINITY));
        }
        googleMapOptions.latLngBoundsForCameraTarget(zza(context, attributeSet));
        googleMapOptions.camera(zzb(context, attributeSet));
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    public static LatLngBounds zza(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C19543e0.f43491d);
        Float valueOf = obtainAttributes.hasValue(10) ? Float.valueOf(obtainAttributes.getFloat(10, 0.0f)) : null;
        Float valueOf2 = obtainAttributes.hasValue(11) ? Float.valueOf(obtainAttributes.getFloat(11, 0.0f)) : null;
        Float valueOf3 = obtainAttributes.hasValue(8) ? Float.valueOf(obtainAttributes.getFloat(8, 0.0f)) : null;
        Float valueOf4 = obtainAttributes.hasValue(9) ? Float.valueOf(obtainAttributes.getFloat(9, 0.0f)) : null;
        obtainAttributes.recycle();
        if (valueOf == null || valueOf2 == null || valueOf3 == null || valueOf4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng((double) valueOf.floatValue(), (double) valueOf2.floatValue()), new LatLng((double) valueOf3.floatValue(), (double) valueOf4.floatValue()));
    }

    public static CameraPosition zzb(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C19543e0.f43491d);
        LatLng latLng = new LatLng((double) (obtainAttributes.hasValue(4) ? obtainAttributes.getFloat(4, 0.0f) : 0.0f), (double) (obtainAttributes.hasValue(5) ? obtainAttributes.getFloat(5, 0.0f) : 0.0f));
        CameraPosition.C14916a builder = CameraPosition.builder();
        builder.f33249a = latLng;
        if (obtainAttributes.hasValue(7)) {
            builder.f33250b = obtainAttributes.getFloat(7, 0.0f);
        }
        if (obtainAttributes.hasValue(1)) {
            builder.f33252d = obtainAttributes.getFloat(1, 0.0f);
        }
        if (obtainAttributes.hasValue(6)) {
            builder.f33251c = obtainAttributes.getFloat(6, 0.0f);
        }
        obtainAttributes.recycle();
        return new CameraPosition(builder.f33249a, builder.f33250b, builder.f33251c, builder.f33252d);
    }

    public final GoogleMapOptions ambientEnabled(boolean z) {
        this.zzau = Boolean.valueOf(z);
        return this;
    }

    public final GoogleMapOptions camera(CameraPosition cameraPosition) {
        this.zzal = cameraPosition;
        return this;
    }

    public final GoogleMapOptions compassEnabled(boolean z) {
        this.zzan = Boolean.valueOf(z);
        return this;
    }

    public final Boolean getAmbientEnabled() {
        return this.zzau;
    }

    public final CameraPosition getCamera() {
        return this.zzal;
    }

    public final Boolean getCompassEnabled() {
        return this.zzan;
    }

    public final LatLngBounds getLatLngBoundsForCameraTarget() {
        return this.zzax;
    }

    public final Boolean getLiteMode() {
        return this.zzas;
    }

    public final Boolean getMapToolbarEnabled() {
        return this.zzat;
    }

    public final int getMapType() {
        return this.mapType;
    }

    public final Float getMaxZoomPreference() {
        return this.zzaw;
    }

    public final Float getMinZoomPreference() {
        return this.zzav;
    }

    public final Boolean getRotateGesturesEnabled() {
        return this.zzar;
    }

    public final Boolean getScrollGesturesEnabled() {
        return this.zzao;
    }

    public final Boolean getScrollGesturesEnabledDuringRotateOrZoom() {
        return this.zzay;
    }

    public final Boolean getTiltGesturesEnabled() {
        return this.zzaq;
    }

    public final Boolean getUseViewLifecycleInFragment() {
        return this.zzak;
    }

    public final Boolean getZOrderOnTop() {
        return this.zzaj;
    }

    public final Boolean getZoomControlsEnabled() {
        return this.zzam;
    }

    public final Boolean getZoomGesturesEnabled() {
        return this.zzap;
    }

    public final GoogleMapOptions latLngBoundsForCameraTarget(LatLngBounds latLngBounds) {
        this.zzax = latLngBounds;
        return this;
    }

    public final GoogleMapOptions liteMode(boolean z) {
        this.zzas = Boolean.valueOf(z);
        return this;
    }

    public final GoogleMapOptions mapToolbarEnabled(boolean z) {
        this.zzat = Boolean.valueOf(z);
        return this;
    }

    public final GoogleMapOptions mapType(int i) {
        this.mapType = i;
        return this;
    }

    public final GoogleMapOptions maxZoomPreference(float f) {
        this.zzaw = Float.valueOf(f);
        return this;
    }

    public final GoogleMapOptions minZoomPreference(float f) {
        this.zzav = Float.valueOf(f);
        return this;
    }

    public final GoogleMapOptions rotateGesturesEnabled(boolean z) {
        this.zzar = Boolean.valueOf(z);
        return this;
    }

    public final GoogleMapOptions scrollGesturesEnabled(boolean z) {
        this.zzao = Boolean.valueOf(z);
        return this;
    }

    public final GoogleMapOptions scrollGesturesEnabledDuringRotateOrZoom(boolean z) {
        this.zzay = Boolean.valueOf(z);
        return this;
    }

    public final GoogleMapOptions tiltGesturesEnabled(boolean z) {
        this.zzaq = Boolean.valueOf(z);
        return this;
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("MapType", Integer.valueOf(this.mapType)).add("LiteMode", this.zzas).add("Camera", this.zzal).add("CompassEnabled", this.zzan).add("ZoomControlsEnabled", this.zzam).add("ScrollGesturesEnabled", this.zzao).add("ZoomGesturesEnabled", this.zzap).add("TiltGesturesEnabled", this.zzaq).add("RotateGesturesEnabled", this.zzar).add("ScrollGesturesEnabledDuringRotateOrZoom", this.zzay).add("MapToolbarEnabled", this.zzat).add("AmbientEnabled", this.zzau).add("MinZoomPreference", this.zzav).add("MaxZoomPreference", this.zzaw).add("LatLngBoundsForCameraTarget", this.zzax).add("ZOrderOnTop", this.zzaj).add("UseViewLifecycleInFragment", this.zzak).toString();
    }

    public final GoogleMapOptions useViewLifecycleInFragment(boolean z) {
        this.zzak = Boolean.valueOf(z);
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByte(parcel, 2, C17782b.m29891v0(this.zzaj));
        SafeParcelWriter.writeByte(parcel, 3, C17782b.m29891v0(this.zzak));
        SafeParcelWriter.writeInt(parcel, 4, getMapType());
        SafeParcelWriter.writeParcelable(parcel, 5, getCamera(), i, false);
        SafeParcelWriter.writeByte(parcel, 6, C17782b.m29891v0(this.zzam));
        SafeParcelWriter.writeByte(parcel, 7, C17782b.m29891v0(this.zzan));
        SafeParcelWriter.writeByte(parcel, 8, C17782b.m29891v0(this.zzao));
        SafeParcelWriter.writeByte(parcel, 9, C17782b.m29891v0(this.zzap));
        SafeParcelWriter.writeByte(parcel, 10, C17782b.m29891v0(this.zzaq));
        SafeParcelWriter.writeByte(parcel, 11, C17782b.m29891v0(this.zzar));
        SafeParcelWriter.writeByte(parcel, 12, C17782b.m29891v0(this.zzas));
        SafeParcelWriter.writeByte(parcel, 14, C17782b.m29891v0(this.zzat));
        SafeParcelWriter.writeByte(parcel, 15, C17782b.m29891v0(this.zzau));
        SafeParcelWriter.writeFloatObject(parcel, 16, getMinZoomPreference(), false);
        SafeParcelWriter.writeFloatObject(parcel, 17, getMaxZoomPreference(), false);
        SafeParcelWriter.writeParcelable(parcel, 18, getLatLngBoundsForCameraTarget(), i, false);
        SafeParcelWriter.writeByte(parcel, 19, C17782b.m29891v0(this.zzay));
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final GoogleMapOptions zOrderOnTop(boolean z) {
        this.zzaj = Boolean.valueOf(z);
        return this;
    }

    public final GoogleMapOptions zoomControlsEnabled(boolean z) {
        this.zzam = Boolean.valueOf(z);
        return this;
    }

    public final GoogleMapOptions zoomGesturesEnabled(boolean z) {
        this.zzap = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions() {
    }
}
