package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "RecordConsentByConsentResultResponseCreator")
public final class zai extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zai> CREATOR = new zah();
    @SafeParcelable.Field(getter = "getGrantedScopes", mo49213id = 1)
    private final List<String> zaa;
    @SafeParcelable.Field(getter = "getToken", mo49213id = 2)
    private final String zab;

    @SafeParcelable.Constructor
    public zai(@SafeParcelable.Param(mo49216id = 1) List<String> list, @SafeParcelable.Param(mo49216id = 2) String str) {
        this.zaa = list;
        this.zab = str;
    }

    public final Status getStatus() {
        return this.zab != null ? Status.RESULT_SUCCESS : Status.RESULT_CANCELED;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringList(parcel, 1, this.zaa, false);
        SafeParcelWriter.writeString(parcel, 2, this.zab, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
