package com.google.android.gms.search;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.C0391c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GoogleNowAuthStateCreator")
@SafeParcelable.Reserved({1000})
public class GoogleNowAuthState extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleNowAuthState> CREATOR = new zza();
    @SafeParcelable.Field(getter = "getAuthCode", mo49213id = 1)
    public String zza;
    @SafeParcelable.Field(getter = "getAccessToken", mo49213id = 2)
    public String zzb;
    @SafeParcelable.Field(getter = "getNextAllowedTimeMillis", mo49213id = 3)
    public long zzc;

    @SafeParcelable.Constructor
    public GoogleNowAuthState(@SafeParcelable.Param(mo49216id = 1) String str, @SafeParcelable.Param(mo49216id = 2) String str2, @SafeParcelable.Param(mo49216id = 3) long j) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
    }

    public String getAccessToken() {
        return this.zzb;
    }

    public String getAuthCode() {
        return this.zza;
    }

    public long getNextAllowedTimeMillis() {
        return this.zzc;
    }

    public String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        long j = this.zzc;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 74 + String.valueOf(str2).length());
        C0391c.m1061h(sb, "mAuthCode = ", str, "\nmAccessToken = ", str2);
        sb.append("\nmNextAllowedTimeMillis = ");
        sb.append(j);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getAuthCode(), false);
        SafeParcelWriter.writeString(parcel, 2, getAccessToken(), false);
        SafeParcelWriter.writeLong(parcel, 3, getNextAllowedTimeMillis());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
