package com.google.android.gms.signin.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zau;

@SafeParcelable.Class(creator = "SignInResponseCreator")
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new zam();
    @SafeParcelable.VersionField(mo49219id = 1)
    private final int zaa;
    @SafeParcelable.Field(getter = "getConnectionResult", mo49213id = 2)
    private final ConnectionResult zab;
    @SafeParcelable.Field(getter = "getResolveAccountResponse", mo49213id = 3)
    private final zau zac;

    @SafeParcelable.Constructor
    public zak(@SafeParcelable.Param(mo49216id = 1) int i, @SafeParcelable.Param(mo49216id = 2) ConnectionResult connectionResult, @SafeParcelable.Param(mo49216id = 3) zau zau) {
        this.zaa = i;
        this.zab = connectionResult;
        this.zac = zau;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zab, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zac, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final ConnectionResult zaa() {
        return this.zab;
    }

    public final zau zab() {
        return this.zac;
    }

    public zak(int i) {
        this(new ConnectionResult(8, (PendingIntent) null), (zau) null);
    }

    private zak(ConnectionResult connectionResult, zau zau) {
        this(1, connectionResult, (zau) null);
    }
}
