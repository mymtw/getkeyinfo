package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;

@ShowFirstParty
@SafeParcelable.Class(creator = "FieldMapPairCreator")
public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new zak();
    @SafeParcelable.Field(mo49213id = 2)
    public final String zaa;
    @SafeParcelable.Field(mo49213id = 3)
    public final FastJsonResponse.Field<?, ?> zab;
    @SafeParcelable.VersionField(mo49219id = 1)
    private final int zac;

    @SafeParcelable.Constructor
    public zal(@SafeParcelable.Param(mo49216id = 1) int i, @SafeParcelable.Param(mo49216id = 2) String str, @SafeParcelable.Param(mo49216id = 3) FastJsonResponse.Field<?, ?> field) {
        this.zac = i;
        this.zaa = str;
        this.zab = field;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zac);
        SafeParcelWriter.writeString(parcel, 2, this.zaa, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zab, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zal(String str, FastJsonResponse.Field<?, ?> field) {
        this.zac = 1;
        this.zaa = str;
        this.zab = field;
    }
}
