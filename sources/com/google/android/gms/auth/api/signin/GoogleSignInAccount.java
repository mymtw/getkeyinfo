package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AccountType;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p003a2.C0023f;
import p193o.C7496d;
import p580hj.C17818d;

@SafeParcelable.Class(creator = "GoogleSignInAccountCreator")
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new zab();
    @VisibleForTesting
    private static Clock zaa = DefaultClock.getInstance();
    @SafeParcelable.VersionField(mo49219id = 1)
    private final int zab;
    @SafeParcelable.Field(getter = "getId", mo49213id = 2)
    private String zac;
    @SafeParcelable.Field(getter = "getIdToken", mo49213id = 3)
    private String zad;
    @SafeParcelable.Field(getter = "getEmail", mo49213id = 4)
    private String zae;
    @SafeParcelable.Field(getter = "getDisplayName", mo49213id = 5)
    private String zaf;
    @SafeParcelable.Field(getter = "getPhotoUrl", mo49213id = 6)
    private Uri zag;
    @SafeParcelable.Field(getter = "getServerAuthCode", mo49213id = 7)
    private String zah;
    @SafeParcelable.Field(getter = "getExpirationTimeSecs", mo49213id = 8)
    private long zai;
    @SafeParcelable.Field(getter = "getObfuscatedIdentifier", mo49213id = 9)
    private String zaj;
    @SafeParcelable.Field(mo49213id = 10)
    private List<Scope> zak;
    @SafeParcelable.Field(getter = "getGivenName", mo49213id = 11)
    private String zal;
    @SafeParcelable.Field(getter = "getFamilyName", mo49213id = 12)
    private String zam;
    private Set<Scope> zan = new HashSet();

    @SafeParcelable.Constructor
    public GoogleSignInAccount(@SafeParcelable.Param(mo49216id = 1) int i, @SafeParcelable.Param(mo49216id = 2) String str, @SafeParcelable.Param(mo49216id = 3) String str2, @SafeParcelable.Param(mo49216id = 4) String str3, @SafeParcelable.Param(mo49216id = 5) String str4, @SafeParcelable.Param(mo49216id = 6) Uri uri, @SafeParcelable.Param(mo49216id = 7) String str5, @SafeParcelable.Param(mo49216id = 8) long j, @SafeParcelable.Param(mo49216id = 9) String str6, @SafeParcelable.Param(mo49216id = 10) List<Scope> list, @SafeParcelable.Param(mo49216id = 11) String str7, @SafeParcelable.Param(mo49216id = 12) String str8) {
        this.zab = i;
        this.zac = str;
        this.zad = str2;
        this.zae = str3;
        this.zaf = str4;
        this.zag = uri;
        this.zah = str5;
        this.zai = j;
        this.zaj = str6;
        this.zak = list;
        this.zal = str7;
        this.zam = str8;
    }

    @RecentlyNonNull
    @KeepForSdk
    public static GoogleSignInAccount createDefault() {
        return zaa(new Account("<<default account>>", AccountType.GOOGLE), (Set<Scope>) new HashSet());
    }

    @RecentlyNonNull
    @KeepForSdk
    public static GoogleSignInAccount fromAccount(@RecentlyNonNull Account account) {
        return zaa(account, (Set<Scope>) new C7496d());
    }

    @RecentlyNullable
    public static GoogleSignInAccount zaa(String str) throws JSONException {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount zaa2 = zaa(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has(ResponseConstants.DISPLAY_NAME_CAMELCASE) ? jSONObject.optString(ResponseConstants.DISPLAY_NAME_CAMELCASE) : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        if (jSONObject.has("serverAuthCode")) {
            str2 = jSONObject.optString("serverAuthCode");
        }
        zaa2.zah = str2;
        return zaa2;
    }

    private final JSONObject zac() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (getId() != null) {
                jSONObject.put("id", getId());
            }
            if (getIdToken() != null) {
                jSONObject.put("tokenId", getIdToken());
            }
            if (getEmail() != null) {
                jSONObject.put("email", getEmail());
            }
            if (getDisplayName() != null) {
                jSONObject.put(ResponseConstants.DISPLAY_NAME_CAMELCASE, getDisplayName());
            }
            if (getGivenName() != null) {
                jSONObject.put("givenName", getGivenName());
            }
            if (getFamilyName() != null) {
                jSONObject.put("familyName", getFamilyName());
            }
            Uri photoUrl = getPhotoUrl();
            if (photoUrl != null) {
                jSONObject.put("photoUrl", photoUrl.toString());
            }
            if (getServerAuthCode() != null) {
                jSONObject.put("serverAuthCode", getServerAuthCode());
            }
            jSONObject.put("expirationTime", this.zai);
            jSONObject.put("obfuscatedIdentifier", this.zaj);
            JSONArray jSONArray = new JSONArray();
            List<Scope> list = this.zak;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, C17818d.f38726b);
            for (Scope scopeUri : scopeArr) {
                jSONArray.put(scopeUri.getScopeUri());
            }
            jSONObject.put("grantedScopes", jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.zaj.equals(this.zaj) && googleSignInAccount.getRequestedScopes().equals(getRequestedScopes());
    }

    @RecentlyNullable
    public Account getAccount() {
        if (this.zae == null) {
            return null;
        }
        return new Account(this.zae, AccountType.GOOGLE);
    }

    @RecentlyNullable
    public String getDisplayName() {
        return this.zaf;
    }

    @RecentlyNullable
    public String getEmail() {
        return this.zae;
    }

    @RecentlyNullable
    public String getFamilyName() {
        return this.zam;
    }

    @RecentlyNullable
    public String getGivenName() {
        return this.zal;
    }

    public Set<Scope> getGrantedScopes() {
        return new HashSet(this.zak);
    }

    @RecentlyNullable
    public String getId() {
        return this.zac;
    }

    @RecentlyNullable
    public String getIdToken() {
        return this.zad;
    }

    @RecentlyNullable
    public Uri getPhotoUrl() {
        return this.zag;
    }

    @KeepForSdk
    public Set<Scope> getRequestedScopes() {
        HashSet hashSet = new HashSet(this.zak);
        hashSet.addAll(this.zan);
        return hashSet;
    }

    @RecentlyNullable
    public String getServerAuthCode() {
        return this.zah;
    }

    public int hashCode() {
        return getRequestedScopes().hashCode() + C0023f.m105e(this.zaj, 527, 31);
    }

    @KeepForSdk
    public boolean isExpired() {
        return zaa.currentTimeMillis() / 1000 >= this.zai - 300;
    }

    @RecentlyNonNull
    @KeepForSdk
    public GoogleSignInAccount requestExtraScopes(@RecentlyNonNull Scope... scopeArr) {
        if (scopeArr != null) {
            Collections.addAll(this.zan, scopeArr);
        }
        return this;
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zab);
        SafeParcelWriter.writeString(parcel, 2, getId(), false);
        SafeParcelWriter.writeString(parcel, 3, getIdToken(), false);
        SafeParcelWriter.writeString(parcel, 4, getEmail(), false);
        SafeParcelWriter.writeString(parcel, 5, getDisplayName(), false);
        SafeParcelWriter.writeParcelable(parcel, 6, getPhotoUrl(), i, false);
        SafeParcelWriter.writeString(parcel, 7, getServerAuthCode(), false);
        SafeParcelWriter.writeLong(parcel, 8, this.zai);
        SafeParcelWriter.writeString(parcel, 9, this.zaj, false);
        SafeParcelWriter.writeTypedList(parcel, 10, this.zak, false);
        SafeParcelWriter.writeString(parcel, 11, getGivenName(), false);
        SafeParcelWriter.writeString(parcel, 12, getFamilyName(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @RecentlyNonNull
    public final String zab() {
        JSONObject zac2 = zac();
        zac2.remove("serverAuthCode");
        return zac2.toString();
    }

    private static GoogleSignInAccount zaa(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set<Scope> set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, (String) null, (l == null ? Long.valueOf(zaa.currentTimeMillis() / 1000) : l).longValue(), Preconditions.checkNotEmpty(str7), new ArrayList((Collection) Preconditions.checkNotNull(set)), str5, str6);
    }

    private static GoogleSignInAccount zaa(Account account, Set<Scope> set) {
        return zaa((String) null, (String) null, account.name, (String) null, (String) null, (String) null, (Uri) null, 0L, account.name, set);
    }

    public final String zaa() {
        return this.zaj;
    }
}
