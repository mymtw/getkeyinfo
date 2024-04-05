package com.google.android.gms.maps.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.material.shadow.ShadowDrawableWrapper;

@SafeParcelable.Class(creator = "CameraPositionCreator")
@SafeParcelable.Reserved({1})
public final class CameraPosition extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new zza();
    @SafeParcelable.Field(mo49213id = 5)
    public final float bearing;
    @SafeParcelable.Field(mo49213id = 2)
    public final LatLng target;
    @SafeParcelable.Field(mo49213id = 4)
    public final float tilt;
    @SafeParcelable.Field(mo49213id = 3)
    public final float zoom;

    /* renamed from: com.google.android.gms.maps.model.CameraPosition$a */
    public static final class C14916a {

        /* renamed from: a */
        public LatLng f33249a;

        /* renamed from: b */
        public float f33250b;

        /* renamed from: c */
        public float f33251c;

        /* renamed from: d */
        public float f33252d;

        public C14916a() {
        }

        public C14916a(CameraPosition cameraPosition) {
            this.f33249a = cameraPosition.target;
            this.f33250b = cameraPosition.zoom;
            this.f33251c = cameraPosition.tilt;
            this.f33252d = cameraPosition.bearing;
        }
    }

    @SafeParcelable.Constructor
    public CameraPosition(@SafeParcelable.Param(mo49216id = 2) LatLng latLng, @SafeParcelable.Param(mo49216id = 3) float f, @SafeParcelable.Param(mo49216id = 4) float f2, @SafeParcelable.Param(mo49216id = 5) float f3) {
        Preconditions.checkNotNull(latLng, "null camera target");
        Preconditions.checkArgument(0.0f <= f2 && f2 <= 90.0f, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f2));
        this.target = latLng;
        this.zoom = f;
        this.tilt = f2 + 0.0f;
        this.bearing = (((double) f3) <= ShadowDrawableWrapper.COS_45 ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    public static C14916a builder() {
        return new C14916a();
    }

    public static CameraPosition createFromAttributes(Context context, AttributeSet attributeSet) {
        return GoogleMapOptions.zzb(context, attributeSet);
    }

    public static final CameraPosition fromLatLngZoom(LatLng latLng, float f) {
        return new CameraPosition(latLng, f, 0.0f, 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.target.equals(cameraPosition.target) && Float.floatToIntBits(this.zoom) == Float.floatToIntBits(cameraPosition.zoom) && Float.floatToIntBits(this.tilt) == Float.floatToIntBits(cameraPosition.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(cameraPosition.bearing);
    }

    public final int hashCode() {
        return Objects.hashCode(this.target, Float.valueOf(this.zoom), Float.valueOf(this.tilt), Float.valueOf(this.bearing));
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("target", this.target).add("zoom", Float.valueOf(this.zoom)).add("tilt", Float.valueOf(this.tilt)).add("bearing", Float.valueOf(this.bearing)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.target, i, false);
        SafeParcelWriter.writeFloat(parcel, 3, this.zoom);
        SafeParcelWriter.writeFloat(parcel, 4, this.tilt);
        SafeParcelWriter.writeFloat(parcel, 5, this.bearing);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static C14916a builder(CameraPosition cameraPosition) {
        return new C14916a(cameraPosition);
    }
}
