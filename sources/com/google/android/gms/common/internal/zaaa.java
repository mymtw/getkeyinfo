package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

@SafeParcelable.Class(creator = "TelemetryDataCreator")
public final class zaaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaaa> CREATOR = new zaad();
    @SafeParcelable.Field(getter = "getTelemetryConfigVersion", mo49213id = 1)
    private final int zaa;
    @SafeParcelable.Field(getter = "getMethodInvocations", mo49213id = 2)
    private List<zao> zab;

    @SafeParcelable.Constructor
    public zaaa(@SafeParcelable.Param(mo49216id = 1) int i, @SafeParcelable.Param(mo49216id = 2) List<zao> list) {
        this.zaa = i;
        this.zab = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        SafeParcelWriter.writeTypedList(parcel, 2, this.zab, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zaa() {
        return this.zaa;
    }

    public final List<zao> zab() {
        return this.zab;
    }

    public final void zaa(zao zao) {
        if (this.zab == null) {
            this.zab = new ArrayList();
        }
        this.zab.add(zao);
    }
}
