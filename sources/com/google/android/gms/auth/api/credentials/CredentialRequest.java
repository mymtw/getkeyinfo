package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@SafeParcelable.Class(creator = "CredentialRequestCreator")
public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CredentialRequest> CREATOR = new zzg();
    @SafeParcelable.Field(getter = "getAccountTypes", mo49213id = 2)
    private final String[] zzaa;
    @SafeParcelable.Field(getter = "getCredentialPickerConfig", mo49213id = 3)
    private final CredentialPickerConfig zzab;
    @SafeParcelable.Field(getter = "getCredentialHintPickerConfig", mo49213id = 4)
    private final CredentialPickerConfig zzac;
    @SafeParcelable.Field(getter = "isIdTokenRequested", mo49213id = 5)
    private final boolean zzad;
    @SafeParcelable.Field(getter = "getServerClientId", mo49213id = 6)
    private final String zzae;
    @SafeParcelable.Field(getter = "getIdTokenNonce", mo49213id = 7)
    private final String zzaf;
    @SafeParcelable.Field(getter = "getRequireUserMediation", mo49213id = 8)
    private final boolean zzag;
    @SafeParcelable.Field(mo49213id = 1000)
    private final int zzu;
    @SafeParcelable.Field(getter = "isPasswordLoginSupported", mo49213id = 1)
    private final boolean zzz;

    /* renamed from: com.google.android.gms.auth.api.credentials.CredentialRequest$a */
    public static final class C14448a {
    }

    @SafeParcelable.Constructor
    public CredentialRequest(@SafeParcelable.Param(mo49216id = 1000) int i, @SafeParcelable.Param(mo49216id = 1) boolean z, @SafeParcelable.Param(mo49216id = 2) String[] strArr, @SafeParcelable.Param(mo49216id = 3) CredentialPickerConfig credentialPickerConfig, @SafeParcelable.Param(mo49216id = 4) CredentialPickerConfig credentialPickerConfig2, @SafeParcelable.Param(mo49216id = 5) boolean z2, @SafeParcelable.Param(mo49216id = 6) String str, @SafeParcelable.Param(mo49216id = 7) String str2, @SafeParcelable.Param(mo49216id = 8) boolean z3) {
        this.zzu = i;
        this.zzz = z;
        this.zzaa = (String[]) Preconditions.checkNotNull(strArr);
        this.zzab = credentialPickerConfig == null ? new CredentialPickerConfig(new CredentialPickerConfig.C14447a()) : credentialPickerConfig;
        this.zzac = credentialPickerConfig2 == null ? new CredentialPickerConfig(new CredentialPickerConfig.C14447a()) : credentialPickerConfig2;
        if (i < 3) {
            this.zzad = true;
            this.zzae = null;
            this.zzaf = null;
        } else {
            this.zzad = z2;
            this.zzae = str;
            this.zzaf = str2;
        }
        this.zzag = z3;
    }

    public final String[] getAccountTypes() {
        return this.zzaa;
    }

    public final Set<String> getAccountTypesSet() {
        return new HashSet(Arrays.asList(this.zzaa));
    }

    public final CredentialPickerConfig getCredentialHintPickerConfig() {
        return this.zzac;
    }

    public final CredentialPickerConfig getCredentialPickerConfig() {
        return this.zzab;
    }

    public final String getIdTokenNonce() {
        return this.zzaf;
    }

    public final String getServerClientId() {
        return this.zzae;
    }

    @Deprecated
    public final boolean getSupportsPasswordLogin() {
        return isPasswordLoginSupported();
    }

    public final boolean isIdTokenRequested() {
        return this.zzad;
    }

    public final boolean isPasswordLoginSupported() {
        return this.zzz;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, isPasswordLoginSupported());
        SafeParcelWriter.writeStringArray(parcel, 2, getAccountTypes(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getCredentialPickerConfig(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, getCredentialHintPickerConfig(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 5, isIdTokenRequested());
        SafeParcelWriter.writeString(parcel, 6, getServerClientId(), false);
        SafeParcelWriter.writeString(parcel, 7, getIdTokenNonce(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zzu);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzag);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private CredentialRequest(C14448a aVar) {
        throw null;
    }
}
