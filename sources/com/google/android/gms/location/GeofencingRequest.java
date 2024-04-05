package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0073e;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.location.zzbh;
import java.util.ArrayList;
import java.util.List;
import p003a2.C0023f;
import p506ak.C14016b;

@SafeParcelable.Class(creator = "GeofencingRequestCreator")
@SafeParcelable.Reserved({1000})
public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new zzq();
    public static final int INITIAL_TRIGGER_DWELL = 4;
    public static final int INITIAL_TRIGGER_ENTER = 1;
    public static final int INITIAL_TRIGGER_EXIT = 2;
    @SafeParcelable.Field(defaultValue = "", getter = "getTag", mo49213id = 3)
    private final String tag;
    @SafeParcelable.Field(getter = "getParcelableGeofences", mo49213id = 1)
    private final List<zzbh> zzap;
    @SafeParcelable.Field(getter = "getInitialTrigger", mo49213id = 2)
    private final int zzaq;

    @SafeParcelable.Constructor
    public GeofencingRequest(@SafeParcelable.Param(mo49216id = 1) List<zzbh> list, @SafeParcelable.Param(mo49216id = 2) int i, @SafeParcelable.Param(mo49216id = 3) String str) {
        this.zzap = list;
        this.zzaq = i;
        this.tag = str;
    }

    public List<C14016b> getGeofences() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.zzap);
        return arrayList;
    }

    public int getInitialTrigger() {
        return this.zzaq;
    }

    public String toString() {
        StringBuilder k = C0073e.m211k("GeofencingRequest[", "geofences=");
        k.append(this.zzap);
        int i = this.zzaq;
        StringBuilder sb = new StringBuilder(30);
        sb.append(", initialTrigger=");
        sb.append(i);
        sb.append(", ");
        k.append(sb.toString());
        String valueOf = String.valueOf(this.tag);
        return C0023f.m110k(k, valueOf.length() != 0 ? "tag=".concat(valueOf) : new String("tag="), "]");
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.zzap, false);
        SafeParcelWriter.writeInt(parcel, 2, getInitialTrigger());
        SafeParcelWriter.writeString(parcel, 3, this.tag, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
