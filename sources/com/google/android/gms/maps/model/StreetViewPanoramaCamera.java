package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.material.shadow.ShadowDrawableWrapper;

@SafeParcelable.Class(creator = "StreetViewPanoramaCameraCreator")
@SafeParcelable.Reserved({1})
public class StreetViewPanoramaCamera extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaCamera> CREATOR = new zzm();
    @SafeParcelable.Field(mo49213id = 4)
    public final float bearing;
    @SafeParcelable.Field(mo49213id = 3)
    public final float tilt;
    @SafeParcelable.Field(mo49213id = 2)
    public final float zoom;
    private final StreetViewPanoramaOrientation zzeg;

    /* renamed from: com.google.android.gms.maps.model.StreetViewPanoramaCamera$a */
    public static final class C14918a {
        public C14918a() {
        }

        public C14918a(StreetViewPanoramaCamera streetViewPanoramaCamera) {
            Preconditions.checkNotNull(streetViewPanoramaCamera, "StreetViewPanoramaCamera");
            float f = streetViewPanoramaCamera.zoom;
        }
    }

    @SafeParcelable.Constructor
    public StreetViewPanoramaCamera(@SafeParcelable.Param(mo49216id = 2) float f, @SafeParcelable.Param(mo49216id = 3) float f2, @SafeParcelable.Param(mo49216id = 4) float f3) {
        boolean z = -90.0f <= f2 && f2 <= 90.0f;
        StringBuilder sb = new StringBuilder(62);
        sb.append("Tilt needs to be between -90 and 90 inclusive: ");
        sb.append(f2);
        Preconditions.checkArgument(z, sb.toString());
        this.zoom = ((double) f) <= ShadowDrawableWrapper.COS_45 ? 0.0f : f;
        this.tilt = 0.0f + f2;
        this.bearing = (((double) f3) <= ShadowDrawableWrapper.COS_45 ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
        this.zzeg = new StreetViewPanoramaOrientation(f2, f3);
    }

    public static C14918a builder() {
        return new C14918a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaCamera)) {
            return false;
        }
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) obj;
        return Float.floatToIntBits(this.zoom) == Float.floatToIntBits(streetViewPanoramaCamera.zoom) && Float.floatToIntBits(this.tilt) == Float.floatToIntBits(streetViewPanoramaCamera.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(streetViewPanoramaCamera.bearing);
    }

    public StreetViewPanoramaOrientation getOrientation() {
        return this.zzeg;
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.zoom), Float.valueOf(this.tilt), Float.valueOf(this.bearing));
    }

    public String toString() {
        return Objects.toStringHelper(this).add("zoom", Float.valueOf(this.zoom)).add("tilt", Float.valueOf(this.tilt)).add("bearing", Float.valueOf(this.bearing)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeFloat(parcel, 2, this.zoom);
        SafeParcelWriter.writeFloat(parcel, 3, this.tilt);
        SafeParcelWriter.writeFloat(parcel, 4, this.bearing);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static C14918a builder(StreetViewPanoramaCamera streetViewPanoramaCamera) {
        return new C14918a(streetViewPanoramaCamera);
    }
}
