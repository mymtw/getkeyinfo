package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "CredentialPickerConfigCreator")
public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new zze();
    @SafeParcelable.Field(getter = "shouldShowCancelButton", mo49213id = 2)
    private final boolean mShowCancelButton;
    @SafeParcelable.Field(mo49213id = 1000)
    private final int zzu;
    @SafeParcelable.Field(getter = "shouldShowAddAccountButton", mo49213id = 1)
    private final boolean zzv;
    @SafeParcelable.Field(getter = "isForNewAccount", mo49213id = 3)
    @Deprecated
    private final boolean zzw;
    @SafeParcelable.Field(getter = "getPromptInternalId", mo49213id = 4)
    private final int zzx;

    /* renamed from: com.google.android.gms.auth.api.credentials.CredentialPickerConfig$a */
    public static class C14447a {
    }

    @SafeParcelable.Constructor
    public CredentialPickerConfig(@SafeParcelable.Param(mo49216id = 1000) int i, @SafeParcelable.Param(mo49216id = 1) boolean z, @SafeParcelable.Param(mo49216id = 2) boolean z2, @SafeParcelable.Param(mo49216id = 3) boolean z3, @SafeParcelable.Param(mo49216id = 4) int i2) {
        this.zzu = i;
        this.zzv = z;
        this.mShowCancelButton = z2;
        boolean z4 = true;
        if (i < 2) {
            this.zzw = z3;
            this.zzx = z3 ? true : z4 ? 1 : 0;
            return;
        }
        this.zzw = i2 != 3 ? false : z4;
        this.zzx = i2;
    }

    @Deprecated
    public final boolean isForNewAccount() {
        return this.zzx == 3;
    }

    public final boolean shouldShowAddAccountButton() {
        return this.zzv;
    }

    public final boolean shouldShowCancelButton() {
        return this.mShowCancelButton;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, shouldShowAddAccountButton());
        SafeParcelWriter.writeBoolean(parcel, 2, shouldShowCancelButton());
        SafeParcelWriter.writeBoolean(parcel, 3, isForNewAccount());
        SafeParcelWriter.writeInt(parcel, 4, this.zzx);
        SafeParcelWriter.writeInt(parcel, 1000, this.zzu);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private CredentialPickerConfig(C14447a aVar) {
        this(2, false, true, false, 1);
        aVar.getClass();
    }
}
