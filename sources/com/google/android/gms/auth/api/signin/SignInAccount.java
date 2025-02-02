package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SignInAccountCreator")
@SafeParcelable.Reserved({1})
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new zzd();
    @SafeParcelable.Field(defaultValue = "", mo49213id = 4)
    @Deprecated
    private String zzba;
    @SafeParcelable.Field(getter = "getGoogleSignInAccount", mo49213id = 7)
    private GoogleSignInAccount zzbb;
    @SafeParcelable.Field(defaultValue = "", mo49213id = 8)
    @Deprecated
    private String zzbc;

    @SafeParcelable.Constructor
    public SignInAccount(@SafeParcelable.Param(mo49216id = 4) String str, @SafeParcelable.Param(mo49216id = 7) GoogleSignInAccount googleSignInAccount, @SafeParcelable.Param(mo49216id = 8) String str2) {
        this.zzbb = googleSignInAccount;
        this.zzba = Preconditions.checkNotEmpty(str, "8.3 and 8.4 SDKs require non-null email");
        this.zzbc = Preconditions.checkNotEmpty(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    public final GoogleSignInAccount getGoogleSignInAccount() {
        return this.zzbb;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 4, this.zzba, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzbb, i, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzbc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
