package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class(creator = "CredentialCreator")
@SafeParcelable.Reserved({1000})
public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Credential> CREATOR = new zzc();
    public static final String EXTRA_KEY = "com.google.android.gms.credentials.Credential";
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getId", mo49213id = 1)
    public final String mId;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getName", mo49213id = 2)
    public final String mName;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getProfilePictureUri", mo49213id = 3)
    public final Uri zzo;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getIdTokens", mo49213id = 4)
    public final List<IdToken> zzp;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getPassword", mo49213id = 5)
    public final String zzq;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getAccountType", mo49213id = 6)
    public final String zzr;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getGivenName", mo49213id = 9)
    public final String zzs;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getFamilyName", mo49213id = 10)
    public final String zzt;

    @SafeParcelable.Constructor
    public Credential(@SafeParcelable.Param(mo49216id = 1) String str, @SafeParcelable.Param(mo49216id = 2) String str2, @SafeParcelable.Param(mo49216id = 3) Uri uri, @SafeParcelable.Param(mo49216id = 4) List<IdToken> list, @SafeParcelable.Param(mo49216id = 5) String str3, @SafeParcelable.Param(mo49216id = 6) String str4, @SafeParcelable.Param(mo49216id = 9) String str5, @SafeParcelable.Param(mo49216id = 10) String str6) {
        String trim = ((String) Preconditions.checkNotNull(str, "credential identifier cannot be null")).trim();
        Preconditions.checkNotEmpty(trim, "credential identifier cannot be empty");
        if (str3 == null || !TextUtils.isEmpty(str3)) {
            if (str4 != null) {
                boolean z = false;
                if (!TextUtils.isEmpty(str4)) {
                    Uri parse = Uri.parse(str4);
                    if (parse.isAbsolute() && parse.isHierarchical() && !TextUtils.isEmpty(parse.getScheme()) && !TextUtils.isEmpty(parse.getAuthority()) && ("http".equalsIgnoreCase(parse.getScheme()) || "https".equalsIgnoreCase(parse.getScheme()))) {
                        z = true;
                    }
                }
                if (!Boolean.valueOf(z).booleanValue()) {
                    throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
                }
            }
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                if (str2 != null && TextUtils.isEmpty(str2.trim())) {
                    str2 = null;
                }
                this.mName = str2;
                this.zzo = uri;
                this.zzp = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
                this.mId = trim;
                this.zzq = str3;
                this.zzr = str4;
                this.zzs = str5;
                this.zzt = str6;
                return;
            }
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        throw new IllegalArgumentException("Password must not be empty if set");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.mId, credential.mId) && TextUtils.equals(this.mName, credential.mName) && Objects.equal(this.zzo, credential.zzo) && TextUtils.equals(this.zzq, credential.zzq) && TextUtils.equals(this.zzr, credential.zzr);
    }

    public String getAccountType() {
        return this.zzr;
    }

    public String getFamilyName() {
        return this.zzt;
    }

    public String getGivenName() {
        return this.zzs;
    }

    public String getId() {
        return this.mId;
    }

    public List<IdToken> getIdTokens() {
        return this.zzp;
    }

    public String getName() {
        return this.mName;
    }

    public String getPassword() {
        return this.zzq;
    }

    public Uri getProfilePictureUri() {
        return this.zzo;
    }

    public int hashCode() {
        return Objects.hashCode(this.mId, this.mName, this.zzo, this.zzq, this.zzr);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getId(), false);
        SafeParcelWriter.writeString(parcel, 2, getName(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getProfilePictureUri(), i, false);
        SafeParcelWriter.writeTypedList(parcel, 4, getIdTokens(), false);
        SafeParcelWriter.writeString(parcel, 5, getPassword(), false);
        SafeParcelWriter.writeString(parcel, 6, getAccountType(), false);
        SafeParcelWriter.writeString(parcel, 9, getGivenName(), false);
        SafeParcelWriter.writeString(parcel, 10, getFamilyName(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
