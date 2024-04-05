package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SignInButtonConfigCreator")
public final class zaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaw> CREATOR = new zaz();
    @SafeParcelable.VersionField(mo49219id = 1)
    private final int zaa;
    @SafeParcelable.Field(getter = "getButtonSize", mo49213id = 2)
    private final int zab;
    @SafeParcelable.Field(getter = "getColorScheme", mo49213id = 3)
    private final int zac;
    @SafeParcelable.Field(getter = "getScopes", mo49213id = 4)
    @Deprecated
    private final Scope[] zad;

    @SafeParcelable.Constructor
    public zaw(@SafeParcelable.Param(mo49216id = 1) int i, @SafeParcelable.Param(mo49216id = 2) int i2, @SafeParcelable.Param(mo49216id = 3) int i3, @SafeParcelable.Param(mo49216id = 4) Scope[] scopeArr) {
        this.zaa = i;
        this.zab = i2;
        this.zac = i3;
        this.zad = scopeArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        SafeParcelWriter.writeInt(parcel, 2, this.zab);
        SafeParcelWriter.writeInt(parcel, 3, this.zac);
        SafeParcelWriter.writeTypedArray(parcel, 4, this.zad, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zaw(int i, int i2, Scope[] scopeArr) {
        this(1, i, i2, (Scope[]) null);
    }
}
