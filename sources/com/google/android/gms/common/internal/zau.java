package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ResolveAccountResponseCreator")
public final class zau extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zau> CREATOR = new zax();
    @SafeParcelable.VersionField(mo49219id = 1)
    private final int zaa;
    @SafeParcelable.Field(mo49213id = 2)
    private IBinder zab;
    @SafeParcelable.Field(getter = "getConnectionResult", mo49213id = 3)
    private ConnectionResult zac;
    @SafeParcelable.Field(getter = "getSaveDefaultAccount", mo49213id = 4)
    private boolean zad;
    @SafeParcelable.Field(getter = "isFromCrossClientAuth", mo49213id = 5)
    private boolean zae;

    @SafeParcelable.Constructor
    public zau(@SafeParcelable.Param(mo49216id = 1) int i, @SafeParcelable.Param(mo49216id = 2) IBinder iBinder, @SafeParcelable.Param(mo49216id = 3) ConnectionResult connectionResult, @SafeParcelable.Param(mo49216id = 4) boolean z, @SafeParcelable.Param(mo49216id = 5) boolean z2) {
        this.zaa = i;
        this.zab = iBinder;
        this.zac = connectionResult;
        this.zad = z;
        this.zae = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zau)) {
            return false;
        }
        zau zau = (zau) obj;
        return this.zac.equals(zau.zac) && Objects.equal(zaa(), zau.zaa());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        SafeParcelWriter.writeIBinder(parcel, 2, this.zab, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zac, i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zad);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zae);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final IAccountAccessor zaa() {
        IBinder iBinder = this.zab;
        if (iBinder == null) {
            return null;
        }
        return IAccountAccessor.Stub.asInterface(iBinder);
    }

    public final ConnectionResult zab() {
        return this.zac;
    }

    public final boolean zac() {
        return this.zad;
    }

    public final boolean zad() {
        return this.zae;
    }
}
