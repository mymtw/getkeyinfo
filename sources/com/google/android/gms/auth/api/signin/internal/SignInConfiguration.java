package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SignInConfigurationCreator")
@SafeParcelable.Reserved({1})
public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new zzx();
    @SafeParcelable.Field(getter = "getConsumerPkgName", mo49213id = 2)
    private final String zzbr;
    @SafeParcelable.Field(getter = "getGoogleConfig", mo49213id = 5)
    private GoogleSignInOptions zzbs;

    @SafeParcelable.Constructor
    public SignInConfiguration(@SafeParcelable.Param(mo49216id = 2) String str, @SafeParcelable.Param(mo49216id = 5) GoogleSignInOptions googleSignInOptions) {
        this.zzbr = Preconditions.checkNotEmpty(str);
        this.zzbs = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.zzbr.equals(signInConfiguration.zzbr)) {
            GoogleSignInOptions googleSignInOptions = this.zzbs;
            if (googleSignInOptions == null) {
                if (signInConfiguration.zzbs == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(signInConfiguration.zzbs)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzbr;
        int i = 0;
        int hashCode = (1 * 31) + (str == null ? 0 : str.hashCode());
        GoogleSignInOptions googleSignInOptions = this.zzbs;
        int i2 = hashCode * 31;
        if (googleSignInOptions != null) {
            i = googleSignInOptions.hashCode();
        }
        return i2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzbr, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzbs, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final GoogleSignInOptions zzm() {
        return this.zzbs;
    }
}
