package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class(creator = "LocationSettingsRequestCreator")
@SafeParcelable.Reserved({1000})
public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new zzag();
    @SafeParcelable.Field(getter = "getLocationRequests", mo49213id = 1)
    private final List<LocationRequest> zzbg;
    @SafeParcelable.Field(defaultValue = "false", getter = "alwaysShow", mo49213id = 2)
    private final boolean zzbh;
    @SafeParcelable.Field(getter = "needBle", mo49213id = 3)
    private final boolean zzbi;
    @SafeParcelable.Field(getter = "getConfiguration", mo49213id = 5)
    private zzae zzbj;

    @SafeParcelable.Constructor
    public LocationSettingsRequest(@SafeParcelable.Param(mo49216id = 1) List<LocationRequest> list, @SafeParcelable.Param(mo49216id = 2) boolean z, @SafeParcelable.Param(mo49216id = 3) boolean z2, @SafeParcelable.Param(mo49216id = 5) zzae zzae) {
        this.zzbg = list;
        this.zzbh = z;
        this.zzbi = z2;
        this.zzbj = zzae;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, Collections.unmodifiableList(this.zzbg), false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzbh);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzbi);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzbj, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
