package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "HintRequestCreator")
public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<HintRequest> CREATOR = new zzj();
    @SafeParcelable.Field(getter = "getAccountTypes", mo49213id = 4)
    private final String[] zzaa;
    @SafeParcelable.Field(getter = "isIdTokenRequested", mo49213id = 5)
    private final boolean zzad;
    @SafeParcelable.Field(getter = "getServerClientId", mo49213id = 6)
    private final String zzae;
    @SafeParcelable.Field(getter = "getIdTokenNonce", mo49213id = 7)
    private final String zzaf;
    @SafeParcelable.Field(getter = "getHintPickerConfig", mo49213id = 1)
    private final CredentialPickerConfig zzah;
    @SafeParcelable.Field(getter = "isEmailAddressIdentifierSupported", mo49213id = 2)
    private final boolean zzai;
    @SafeParcelable.Field(getter = "isPhoneNumberIdentifierSupported", mo49213id = 3)
    private final boolean zzaj;
    @SafeParcelable.Field(mo49213id = 1000)
    private final int zzu;

    /* renamed from: com.google.android.gms.auth.api.credentials.HintRequest$a */
    public static final class C14449a {
    }

    @SafeParcelable.Constructor
    public HintRequest(@SafeParcelable.Param(mo49216id = 1000) int i, @SafeParcelable.Param(mo49216id = 1) CredentialPickerConfig credentialPickerConfig, @SafeParcelable.Param(mo49216id = 2) boolean z, @SafeParcelable.Param(mo49216id = 3) boolean z2, @SafeParcelable.Param(mo49216id = 4) String[] strArr, @SafeParcelable.Param(mo49216id = 5) boolean z3, @SafeParcelable.Param(mo49216id = 6) String str, @SafeParcelable.Param(mo49216id = 7) String str2) {
        this.zzu = i;
        this.zzah = (CredentialPickerConfig) Preconditions.checkNotNull(credentialPickerConfig);
        this.zzai = z;
        this.zzaj = z2;
        this.zzaa = (String[]) Preconditions.checkNotNull(strArr);
        if (i < 2) {
            this.zzad = true;
            this.zzae = null;
            this.zzaf = null;
            return;
        }
        this.zzad = z3;
        this.zzae = str;
        this.zzaf = str2;
    }

    public final String[] getAccountTypes() {
        return this.zzaa;
    }

    public final CredentialPickerConfig getHintPickerConfig() {
        return this.zzah;
    }

    public final String getIdTokenNonce() {
        return this.zzaf;
    }

    public final String getServerClientId() {
        return this.zzae;
    }

    public final boolean isEmailAddressIdentifierSupported() {
        return this.zzai;
    }

    public final boolean isIdTokenRequested() {
        return this.zzad;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getHintPickerConfig(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 2, isEmailAddressIdentifierSupported());
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzaj);
        SafeParcelWriter.writeStringArray(parcel, 4, getAccountTypes(), false);
        SafeParcelWriter.writeBoolean(parcel, 5, isIdTokenRequested());
        SafeParcelWriter.writeString(parcel, 6, getServerClientId(), false);
        SafeParcelWriter.writeString(parcel, 7, getIdTokenNonce(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zzu);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private HintRequest(C14449a aVar) {
        throw null;
    }
}
