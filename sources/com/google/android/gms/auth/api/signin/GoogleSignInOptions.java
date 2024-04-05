package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AccountType;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p580hj.C17819e;

@SafeParcelable.Class(creator = "GoogleSignInOptionsCreator")
public class GoogleSignInOptions extends AbstractSafeParcelable implements Api.ApiOptions.Optional, ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new zad();
    @RecentlyNonNull
    public static final GoogleSignInOptions DEFAULT_GAMES_SIGN_IN;
    @RecentlyNonNull
    public static final GoogleSignInOptions DEFAULT_SIGN_IN;
    @RecentlyNonNull
    @VisibleForTesting
    public static final Scope zaa;
    @RecentlyNonNull
    @VisibleForTesting
    public static final Scope zab = new Scope("email");
    @RecentlyNonNull
    @VisibleForTesting
    public static final Scope zac;
    @RecentlyNonNull
    @VisibleForTesting
    public static final Scope zad;
    @RecentlyNonNull
    @VisibleForTesting
    public static final Scope zae = new Scope(Scopes.GAMES);
    private static Comparator<Scope> zaq = new C17819e();
    @SafeParcelable.VersionField(mo49219id = 1)
    private final int zaf;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getScopes", mo49213id = 2)
    public final ArrayList<Scope> zag;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getAccount", mo49213id = 3)
    public Account zah;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "isIdTokenRequested", mo49213id = 4)
    public boolean zai;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "isServerAuthCodeRequested", mo49213id = 5)
    public final boolean zaj;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "isForceCodeForRefreshToken", mo49213id = 6)
    public final boolean zak;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getServerClientId", mo49213id = 7)
    public String zal;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getHostedDomain", mo49213id = 8)
    public String zam;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getExtensions", mo49213id = 9)
    public ArrayList<GoogleSignInOptionsExtensionParcelable> zan;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getLogSessionId", mo49213id = 10)
    public String zao;
    private Map<Integer, GoogleSignInOptionsExtensionParcelable> zap;

    static {
        Scope scope = new Scope(Scopes.PROFILE);
        zaa = scope;
        Scope scope2 = new Scope(Scopes.OPEN_ID);
        zac = scope2;
        Scope scope3 = new Scope(Scopes.GAMES_LITE);
        zad = scope3;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(zae)) {
            Scope scope4 = zad;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        DEFAULT_SIGN_IN = new GoogleSignInOptions(3, new ArrayList(hashSet), (Account) null, false, false, false, (String) null, (String) null, hashMap, (String) null, (C17819e) null);
        HashSet hashSet2 = new HashSet();
        HashMap hashMap2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(zae)) {
            Scope scope5 = zad;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        DEFAULT_GAMES_SIGN_IN = new GoogleSignInOptions(3, new ArrayList(hashSet2), (Account) null, false, false, false, (String) null, (String) null, hashMap2, (String) null, (C17819e) null);
    }

    @SafeParcelable.Constructor
    public GoogleSignInOptions(@SafeParcelable.Param(mo49216id = 1) int i, @SafeParcelable.Param(mo49216id = 2) ArrayList<Scope> arrayList, @SafeParcelable.Param(mo49216id = 3) Account account, @SafeParcelable.Param(mo49216id = 4) boolean z, @SafeParcelable.Param(mo49216id = 5) boolean z2, @SafeParcelable.Param(mo49216id = 6) boolean z3, @SafeParcelable.Param(mo49216id = 7) String str, @SafeParcelable.Param(mo49216id = 8) String str2, @SafeParcelable.Param(mo49216id = 9) ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList2, @SafeParcelable.Param(mo49216id = 10) String str3) {
        this(i, arrayList, account, z, z2, z3, str, str2, zab((List<GoogleSignInOptionsExtensionParcelable>) arrayList2), str3);
    }

    @RecentlyNullable
    public static GoogleSignInOptions zaa(String str) throws JSONException {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        Account account = !TextUtils.isEmpty(optString) ? new Account(optString, AccountType.GOOGLE) : null;
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z = jSONObject.getBoolean("idTokenRequested");
        boolean z2 = jSONObject.getBoolean("serverAuthRequested");
        boolean z3 = jSONObject.getBoolean("forceCodeForRefreshToken");
        String optString2 = jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null;
        if (jSONObject.has("hostedDomain")) {
            str2 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, (ArrayList<Scope>) arrayList, account, z, z2, z3, optString2, str2, (Map<Integer, GoogleSignInOptionsExtensionParcelable>) new HashMap(), (String) null);
    }

    /* access modifiers changed from: private */
    public static Map<Integer, GoogleSignInOptionsExtensionParcelable> zab(List<GoogleSignInOptionsExtensionParcelable> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (GoogleSignInOptionsExtensionParcelable next : list) {
            hashMap.put(Integer.valueOf(next.getType()), next);
        }
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r1.equals(r4.getAccount()) != false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0067, code lost:
        if (r3.zal.equals(r4.getServerClientId()) != false) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch:{ ClassCastException -> 0x008f }
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r3.zan     // Catch:{ ClassCastException -> 0x008f }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x008f }
            if (r1 > 0) goto L_0x008f
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r4.zan     // Catch:{ ClassCastException -> 0x008f }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x008f }
            if (r1 <= 0) goto L_0x0018
            goto L_0x008f
        L_0x0018:
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.zag     // Catch:{ ClassCastException -> 0x008f }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x008f }
            java.util.ArrayList r2 = r4.getScopes()     // Catch:{ ClassCastException -> 0x008f }
            int r2 = r2.size()     // Catch:{ ClassCastException -> 0x008f }
            if (r1 != r2) goto L_0x008f
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.zag     // Catch:{ ClassCastException -> 0x008f }
            java.util.ArrayList r2 = r4.getScopes()     // Catch:{ ClassCastException -> 0x008f }
            boolean r1 = r1.containsAll(r2)     // Catch:{ ClassCastException -> 0x008f }
            if (r1 != 0) goto L_0x0035
            goto L_0x008f
        L_0x0035:
            android.accounts.Account r1 = r3.zah     // Catch:{ ClassCastException -> 0x008f }
            if (r1 != 0) goto L_0x0040
            android.accounts.Account r1 = r4.getAccount()     // Catch:{ ClassCastException -> 0x008f }
            if (r1 != 0) goto L_0x008f
            goto L_0x004a
        L_0x0040:
            android.accounts.Account r2 = r4.getAccount()     // Catch:{ ClassCastException -> 0x008f }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x008f }
            if (r1 == 0) goto L_0x008f
        L_0x004a:
            java.lang.String r1 = r3.zal     // Catch:{ ClassCastException -> 0x008f }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x008f }
            if (r1 == 0) goto L_0x005d
            java.lang.String r1 = r4.getServerClientId()     // Catch:{ ClassCastException -> 0x008f }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x008f }
            if (r1 == 0) goto L_0x008f
            goto L_0x0069
        L_0x005d:
            java.lang.String r1 = r3.zal     // Catch:{ ClassCastException -> 0x008f }
            java.lang.String r2 = r4.getServerClientId()     // Catch:{ ClassCastException -> 0x008f }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x008f }
            if (r1 == 0) goto L_0x008f
        L_0x0069:
            boolean r1 = r3.zak     // Catch:{ ClassCastException -> 0x008f }
            boolean r2 = r4.isForceCodeForRefreshToken()     // Catch:{ ClassCastException -> 0x008f }
            if (r1 != r2) goto L_0x008f
            boolean r1 = r3.zai     // Catch:{ ClassCastException -> 0x008f }
            boolean r2 = r4.isIdTokenRequested()     // Catch:{ ClassCastException -> 0x008f }
            if (r1 != r2) goto L_0x008f
            boolean r1 = r3.zaj     // Catch:{ ClassCastException -> 0x008f }
            boolean r2 = r4.isServerAuthCodeRequested()     // Catch:{ ClassCastException -> 0x008f }
            if (r1 != r2) goto L_0x008f
            java.lang.String r1 = r3.zao     // Catch:{ ClassCastException -> 0x008f }
            java.lang.String r4 = r4.getLogSessionId()     // Catch:{ ClassCastException -> 0x008f }
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch:{ ClassCastException -> 0x008f }
            if (r4 == 0) goto L_0x008f
            r4 = 1
            return r4
        L_0x008f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    @KeepForSdk
    @RecentlyNullable
    public Account getAccount() {
        return this.zah;
    }

    @RecentlyNonNull
    @KeepForSdk
    public ArrayList<GoogleSignInOptionsExtensionParcelable> getExtensions() {
        return this.zan;
    }

    @KeepForSdk
    @RecentlyNullable
    public String getLogSessionId() {
        return this.zao;
    }

    @RecentlyNonNull
    public Scope[] getScopeArray() {
        ArrayList<Scope> arrayList = this.zag;
        return (Scope[]) arrayList.toArray(new Scope[arrayList.size()]);
    }

    @RecentlyNonNull
    @KeepForSdk
    public ArrayList<Scope> getScopes() {
        return new ArrayList<>(this.zag);
    }

    @KeepForSdk
    @RecentlyNullable
    public String getServerClientId() {
        return this.zal;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.zag;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Scope scope = arrayList2.get(i2);
            i2++;
            arrayList.add(scope.getScopeUri());
        }
        Collections.sort(arrayList);
        Account account = this.zah;
        int hashCode = ((arrayList.hashCode() + (1 * 31)) * 31) + (account == null ? 0 : account.hashCode());
        String str = this.zal;
        int hashCode2 = (((((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + (this.zak ? 1 : 0)) * 31) + (this.zai ? 1 : 0)) * 31) + (this.zaj ? 1 : 0);
        String str2 = this.zao;
        int i3 = hashCode2 * 31;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i3 + i;
    }

    @KeepForSdk
    public boolean isForceCodeForRefreshToken() {
        return this.zak;
    }

    @KeepForSdk
    public boolean isIdTokenRequested() {
        return this.zai;
    }

    @KeepForSdk
    public boolean isServerAuthCodeRequested() {
        return this.zaj;
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaf);
        SafeParcelWriter.writeTypedList(parcel, 2, getScopes(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getAccount(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, isIdTokenRequested());
        SafeParcelWriter.writeBoolean(parcel, 5, isServerAuthCodeRequested());
        SafeParcelWriter.writeBoolean(parcel, 6, isForceCodeForRefreshToken());
        SafeParcelWriter.writeString(parcel, 7, getServerClientId(), false);
        SafeParcelWriter.writeString(parcel, 8, this.zam, false);
        SafeParcelWriter.writeTypedList(parcel, 9, getExtensions(), false);
        SafeParcelWriter.writeString(parcel, 10, getLogSessionId(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, GoogleSignInOptionsExtensionParcelable> map, String str3) {
        this.zaf = i;
        this.zag = arrayList;
        this.zah = account;
        this.zai = z;
        this.zaj = z2;
        this.zak = z3;
        this.zal = str;
        this.zam = str2;
        this.zan = new ArrayList<>(map.values());
        this.zap = map;
        this.zao = str3;
    }

    private final JSONObject zab() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.zag, zaq);
            ArrayList<Scope> arrayList = this.zag;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Scope scope = arrayList.get(i);
                i++;
                jSONArray.put(scope.getScopeUri());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.zah;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.zai);
            jSONObject.put("forceCodeForRefreshToken", this.zak);
            jSONObject.put("serverAuthRequested", this.zaj);
            if (!TextUtils.isEmpty(this.zal)) {
                jSONObject.put("serverClientId", this.zal);
            }
            if (!TextUtils.isEmpty(this.zam)) {
                jSONObject.put("hostedDomain", this.zam);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public /* synthetic */ GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3, C17819e eVar) {
        this(3, (ArrayList<Scope>) arrayList, account, z, z2, z3, str, str2, (Map<Integer, GoogleSignInOptionsExtensionParcelable>) map, str3);
    }

    @RecentlyNonNull
    public final String zaa() {
        return zab().toString();
    }
}
