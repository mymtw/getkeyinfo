package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19446a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p003a2.C0023f;
import p365hg.C12869i0;
import p365hg.C12879l0;
import p453tf.C13418j;

public final class AuthenticationTokenClaims implements Parcelable {
    public static final Parcelable.Creator<AuthenticationTokenClaims> CREATOR = new AuthenticationTokenClaims$Companion$CREATOR$1();
    public static final C12176a Companion = new C12176a();
    public static final String JSON_KEY_AUD = "aud";
    public static final String JSON_KEY_EMAIL = "email";
    public static final String JSON_KEY_EXP = "exp";
    public static final String JSON_KEY_FAMILY_NAME = "family_name";
    public static final String JSON_KEY_GIVEN_NAME = "given_name";
    public static final String JSON_KEY_IAT = "iat";
    public static final String JSON_KEY_ISS = "iss";
    public static final String JSON_KEY_JIT = "jti";
    public static final String JSON_KEY_MIDDLE_NAME = "middle_name";
    public static final String JSON_KEY_NAME = "name";
    public static final String JSON_KEY_NONCE = "nonce";
    public static final String JSON_KEY_PICTURE = "picture";
    public static final String JSON_KEY_SUB = "sub";
    public static final String JSON_KEY_USER_AGE_RANGE = "user_age_range";
    public static final String JSON_KEY_USER_BIRTHDAY = "user_birthday";
    public static final String JSON_KEY_USER_FRIENDS = "user_friends";
    public static final String JSON_KEY_USER_GENDER = "user_gender";
    public static final String JSON_KEY_USER_HOMETOWN = "user_hometown";
    public static final String JSON_KEY_USER_LINK = "user_link";
    public static final String JSON_KEY_USER_LOCATION = "user_location";
    public static final long MAX_TIME_SINCE_TOKEN_ISSUED = 600000;
    private final String aud;
    private final String email;
    private final long exp;
    private final String familyName;
    private final String givenName;
    private final long iat;
    private final String iss;
    private final String jti;
    private final String middleName;
    private final String name;
    private final String nonce;
    private final String picture;
    private final String sub;
    private final Map<String, Integer> userAgeRange;
    private final String userBirthday;
    private final Set<String> userFriends;
    private final String userGender;
    private final Map<String, String> userHometown;
    private final String userLink;
    private final Map<String, String> userLocation;

    /* renamed from: com.facebook.AuthenticationTokenClaims$a */
    public static final class C12176a {
        /* renamed from: a */
        public static AuthenticationTokenClaims m19984a(JSONObject jSONObject) throws JSONException {
            JSONObject jSONObject2 = jSONObject;
            C19383o.m32797g(jSONObject2, "jsonObject");
            String string = jSONObject2.getString(AuthenticationTokenClaims.JSON_KEY_JIT);
            String string2 = jSONObject2.getString(AuthenticationTokenClaims.JSON_KEY_ISS);
            String string3 = jSONObject2.getString(AuthenticationTokenClaims.JSON_KEY_AUD);
            String string4 = jSONObject2.getString("nonce");
            long j = jSONObject2.getLong(AuthenticationTokenClaims.JSON_KEY_EXP);
            long j2 = jSONObject2.getLong(AuthenticationTokenClaims.JSON_KEY_IAT);
            String string5 = jSONObject2.getString(AuthenticationTokenClaims.JSON_KEY_SUB);
            String b = m19985b("name", jSONObject2);
            String b2 = m19985b(AuthenticationTokenClaims.JSON_KEY_GIVEN_NAME, jSONObject2);
            String b3 = m19985b(AuthenticationTokenClaims.JSON_KEY_MIDDLE_NAME, jSONObject2);
            String b4 = m19985b(AuthenticationTokenClaims.JSON_KEY_FAMILY_NAME, jSONObject2);
            String b5 = m19985b("email", jSONObject2);
            String b6 = m19985b(AuthenticationTokenClaims.JSON_KEY_PICTURE, jSONObject2);
            JSONArray optJSONArray = jSONObject2.optJSONArray(AuthenticationTokenClaims.JSON_KEY_USER_FRIENDS);
            long j3 = j2;
            String b7 = m19985b(AuthenticationTokenClaims.JSON_KEY_USER_BIRTHDAY, jSONObject2);
            JSONObject optJSONObject = jSONObject2.optJSONObject(AuthenticationTokenClaims.JSON_KEY_USER_AGE_RANGE);
            JSONObject optJSONObject2 = jSONObject2.optJSONObject(AuthenticationTokenClaims.JSON_KEY_USER_HOMETOWN);
            long j4 = j;
            JSONObject optJSONObject3 = jSONObject2.optJSONObject(AuthenticationTokenClaims.JSON_KEY_USER_LOCATION);
            String b8 = m19985b(AuthenticationTokenClaims.JSON_KEY_USER_GENDER, jSONObject2);
            String b9 = m19985b(AuthenticationTokenClaims.JSON_KEY_USER_LINK, jSONObject2);
            C19383o.m32796f(string, AuthenticationTokenClaims.JSON_KEY_JIT);
            C19383o.m32796f(string2, AuthenticationTokenClaims.JSON_KEY_ISS);
            C19383o.m32796f(string3, AuthenticationTokenClaims.JSON_KEY_AUD);
            C19383o.m32796f(string4, "nonce");
            C19383o.m32796f(string5, AuthenticationTokenClaims.JSON_KEY_SUB);
            HashMap hashMap = null;
            ArrayList D = optJSONArray == null ? null : C12869i0.m20548D(optJSONArray);
            HashMap h = optJSONObject == null ? null : C12869i0.m20569h(optJSONObject);
            HashMap i = optJSONObject2 == null ? null : C12869i0.m20570i(optJSONObject2);
            if (optJSONObject3 != null) {
                hashMap = C12869i0.m20570i(optJSONObject3);
            }
            return new AuthenticationTokenClaims(string, string2, string3, string4, j4, j3, string5, b, b2, b3, b4, b5, b6, D, b7, h, i, hashMap, b8, b9);
        }

        /* renamed from: b */
        public static String m19985b(String str, JSONObject jSONObject) {
            C19383o.m32797g(jSONObject, "$this$getNullableString");
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            return null;
        }
    }

    public AuthenticationTokenClaims(String str, String str2) {
        Set<String> set;
        Map<String, Integer> map;
        Map<String, String> map2;
        C19383o.m32797g(str, "encodedClaims");
        C19383o.m32797g(str2, "expectedNonce");
        C12879l0.m20599c(str, "encodedClaims");
        byte[] decode = Base64.decode(str, 8);
        C19383o.m32796f(decode, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decode, C19446a.f43373b));
        if (isValidClaims(jSONObject, str2)) {
            String string = jSONObject.getString(JSON_KEY_JIT);
            C19383o.m32796f(string, "jsonObj.getString(JSON_KEY_JIT)");
            this.jti = string;
            String string2 = jSONObject.getString(JSON_KEY_ISS);
            C19383o.m32796f(string2, "jsonObj.getString(JSON_KEY_ISS)");
            this.iss = string2;
            String string3 = jSONObject.getString(JSON_KEY_AUD);
            C19383o.m32796f(string3, "jsonObj.getString(JSON_KEY_AUD)");
            this.aud = string3;
            String string4 = jSONObject.getString("nonce");
            C19383o.m32796f(string4, "jsonObj.getString(JSON_KEY_NONCE)");
            this.nonce = string4;
            this.exp = jSONObject.getLong(JSON_KEY_EXP);
            this.iat = jSONObject.getLong(JSON_KEY_IAT);
            String string5 = jSONObject.getString(JSON_KEY_SUB);
            C19383o.m32796f(string5, "jsonObj.getString(JSON_KEY_SUB)");
            this.sub = string5;
            Companion.getClass();
            this.name = C12176a.m19985b("name", jSONObject);
            this.givenName = C12176a.m19985b(JSON_KEY_GIVEN_NAME, jSONObject);
            this.middleName = C12176a.m19985b(JSON_KEY_MIDDLE_NAME, jSONObject);
            this.familyName = C12176a.m19985b(JSON_KEY_FAMILY_NAME, jSONObject);
            this.email = C12176a.m19985b("email", jSONObject);
            this.picture = C12176a.m19985b(JSON_KEY_PICTURE, jSONObject);
            JSONArray optJSONArray = jSONObject.optJSONArray(JSON_KEY_USER_FRIENDS);
            Map<String, String> map3 = null;
            if (optJSONArray == null) {
                set = null;
            } else {
                int i = C12869i0.f28368a;
                HashSet hashSet = new HashSet();
                int length = optJSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    String string6 = optJSONArray.getString(i2);
                    C19383o.m32796f(string6, "jsonArray.getString(i)");
                    hashSet.add(string6);
                }
                set = Collections.unmodifiableSet(hashSet);
            }
            this.userFriends = set;
            Companion.getClass();
            this.userBirthday = C12176a.m19985b(JSON_KEY_USER_BIRTHDAY, jSONObject);
            JSONObject optJSONObject = jSONObject.optJSONObject(JSON_KEY_USER_AGE_RANGE);
            if (optJSONObject == null) {
                map = null;
            } else {
                map = Collections.unmodifiableMap(C12869i0.m20569h(optJSONObject));
            }
            this.userAgeRange = map;
            JSONObject optJSONObject2 = jSONObject.optJSONObject(JSON_KEY_USER_HOMETOWN);
            if (optJSONObject2 == null) {
                map2 = null;
            } else {
                map2 = Collections.unmodifiableMap(C12869i0.m20570i(optJSONObject2));
            }
            this.userHometown = map2;
            JSONObject optJSONObject3 = jSONObject.optJSONObject(JSON_KEY_USER_LOCATION);
            this.userLocation = optJSONObject3 != null ? Collections.unmodifiableMap(C12869i0.m20570i(optJSONObject3)) : map3;
            this.userGender = C12176a.m19985b(JSON_KEY_USER_GENDER, jSONObject);
            this.userLink = C12176a.m19985b(JSON_KEY_USER_LINK, jSONObject);
            return;
        }
        throw new IllegalArgumentException("Invalid claims".toString());
    }

    public AuthenticationTokenClaims(String str, String str2, String str3, String str4, long j, long j2, String str5) {
        this(str, str2, str3, str4, j, j2, str5, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Collection) null, (String) null, (Map) null, (Map) null, (Map) null, (String) null, (String) null, 1048448, (DefaultConstructorMarker) null);
    }

    public AuthenticationTokenClaims(String str, String str2, String str3, String str4, long j, long j2, String str5, String str6) {
        this(str, str2, str3, str4, j, j2, str5, str6, (String) null, (String) null, (String) null, (String) null, (String) null, (Collection) null, (String) null, (Map) null, (Map) null, (Map) null, (String) null, (String) null, 1048320, (DefaultConstructorMarker) null);
    }

    public AuthenticationTokenClaims(String str, String str2, String str3, String str4, long j, long j2, String str5, String str6, String str7) {
        this(str, str2, str3, str4, j, j2, str5, str6, str7, (String) null, (String) null, (String) null, (String) null, (Collection) null, (String) null, (Map) null, (Map) null, (Map) null, (String) null, (String) null, 1048064, (DefaultConstructorMarker) null);
    }

    public AuthenticationTokenClaims(String str, String str2, String str3, String str4, long j, long j2, String str5, String str6, String str7, String str8) {
        this(str, str2, str3, str4, j, j2, str5, str6, str7, str8, (String) null, (String) null, (String) null, (Collection) null, (String) null, (Map) null, (Map) null, (Map) null, (String) null, (String) null, 1047552, (DefaultConstructorMarker) null);
    }

    public AuthenticationTokenClaims(String str, String str2, String str3, String str4, long j, long j2, String str5, String str6, String str7, String str8, String str9) {
        this(str, str2, str3, str4, j, j2, str5, str6, str7, str8, str9, (String) null, (String) null, (Collection) null, (String) null, (Map) null, (Map) null, (Map) null, (String) null, (String) null, 1046528, (DefaultConstructorMarker) null);
    }

    public AuthenticationTokenClaims(String str, String str2, String str3, String str4, long j, long j2, String str5, String str6, String str7, String str8, String str9, String str10) {
        this(str, str2, str3, str4, j, j2, str5, str6, str7, str8, str9, str10, (String) null, (Collection) null, (String) null, (Map) null, (Map) null, (Map) null, (String) null, (String) null, 1044480, (DefaultConstructorMarker) null);
    }

    public AuthenticationTokenClaims(String str, String str2, String str3, String str4, long j, long j2, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this(str, str2, str3, str4, j, j2, str5, str6, str7, str8, str9, str10, str11, (Collection) null, (String) null, (Map) null, (Map) null, (Map) null, (String) null, (String) null, 1040384, (DefaultConstructorMarker) null);
    }

    public AuthenticationTokenClaims(String str, String str2, String str3, String str4, long j, long j2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Collection<String> collection) {
        this(str, str2, str3, str4, j, j2, str5, str6, str7, str8, str9, str10, str11, collection, (String) null, (Map) null, (Map) null, (Map) null, (String) null, (String) null, 1032192, (DefaultConstructorMarker) null);
    }

    public AuthenticationTokenClaims(String str, String str2, String str3, String str4, long j, long j2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Collection<String> collection, String str12) {
        this(str, str2, str3, str4, j, j2, str5, str6, str7, str8, str9, str10, str11, collection, str12, (Map) null, (Map) null, (Map) null, (String) null, (String) null, 1015808, (DefaultConstructorMarker) null);
    }

    public AuthenticationTokenClaims(String str, String str2, String str3, String str4, long j, long j2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Collection<String> collection, String str12, Map<String, Integer> map) {
        this(str, str2, str3, str4, j, j2, str5, str6, str7, str8, str9, str10, str11, collection, str12, map, (Map) null, (Map) null, (String) null, (String) null, 983040, (DefaultConstructorMarker) null);
    }

    public AuthenticationTokenClaims(String str, String str2, String str3, String str4, long j, long j2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Collection<String> collection, String str12, Map<String, Integer> map, Map<String, String> map2) {
        this(str, str2, str3, str4, j, j2, str5, str6, str7, str8, str9, str10, str11, collection, str12, map, map2, (Map) null, (String) null, (String) null, 917504, (DefaultConstructorMarker) null);
    }

    public AuthenticationTokenClaims(String str, String str2, String str3, String str4, long j, long j2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Collection<String> collection, String str12, Map<String, Integer> map, Map<String, String> map2, Map<String, String> map3) {
        this(str, str2, str3, str4, j, j2, str5, str6, str7, str8, str9, str10, str11, collection, str12, map, map2, map3, (String) null, (String) null, 786432, (DefaultConstructorMarker) null);
    }

    public AuthenticationTokenClaims(String str, String str2, String str3, String str4, long j, long j2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Collection<String> collection, String str12, Map<String, Integer> map, Map<String, String> map2, Map<String, String> map3, String str13) {
        this(str, str2, str3, str4, j, j2, str5, str6, str7, str8, str9, str10, str11, collection, str12, map, map2, map3, str13, (String) null, 524288, (DefaultConstructorMarker) null);
    }

    public static final AuthenticationTokenClaims createFromJSONObject$facebook_core_release(JSONObject jSONObject) throws JSONException {
        Companion.getClass();
        return C12176a.m19984a(jSONObject);
    }

    private final boolean isValidClaims(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return false;
        }
        String optString = jSONObject.optString(JSON_KEY_JIT);
        C19383o.m32796f(optString, JSON_KEY_JIT);
        if (optString.length() == 0) {
            return false;
        }
        try {
            String optString2 = jSONObject.optString(JSON_KEY_ISS);
            C19383o.m32796f(optString2, JSON_KEY_ISS);
            if (!(optString2.length() == 0) && (!(!C19383o.m32792b(new URL(optString2).getHost(), "facebook.com")) || !(!C19383o.m32792b(new URL(optString2).getHost(), "www.facebook.com")))) {
                String optString3 = jSONObject.optString(JSON_KEY_AUD);
                C19383o.m32796f(optString3, JSON_KEY_AUD);
                if (!(optString3.length() == 0) && !(!C19383o.m32792b(optString3, C13418j.m21107c()))) {
                    long j = (long) 1000;
                    if (new Date().after(new Date(jSONObject.optLong(JSON_KEY_EXP) * j))) {
                        return false;
                    }
                    if (new Date().after(new Date((jSONObject.optLong(JSON_KEY_IAT) * j) + MAX_TIME_SINCE_TOKEN_ISSUED))) {
                        return false;
                    }
                    String optString4 = jSONObject.optString(JSON_KEY_SUB);
                    C19383o.m32796f(optString4, JSON_KEY_SUB);
                    if (optString4.length() == 0) {
                        return false;
                    }
                    String optString5 = jSONObject.optString("nonce");
                    C19383o.m32796f(optString5, "nonce");
                    return !(optString5.length() == 0) && !(C19383o.m32792b(optString5, str) ^ true);
                }
            }
        } catch (MalformedURLException unused) {
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationTokenClaims)) {
            return false;
        }
        AuthenticationTokenClaims authenticationTokenClaims = (AuthenticationTokenClaims) obj;
        return C19383o.m32792b(this.jti, authenticationTokenClaims.jti) && C19383o.m32792b(this.iss, authenticationTokenClaims.iss) && C19383o.m32792b(this.aud, authenticationTokenClaims.aud) && C19383o.m32792b(this.nonce, authenticationTokenClaims.nonce) && this.exp == authenticationTokenClaims.exp && this.iat == authenticationTokenClaims.iat && C19383o.m32792b(this.sub, authenticationTokenClaims.sub) && C19383o.m32792b(this.name, authenticationTokenClaims.name) && C19383o.m32792b(this.givenName, authenticationTokenClaims.givenName) && C19383o.m32792b(this.middleName, authenticationTokenClaims.middleName) && C19383o.m32792b(this.familyName, authenticationTokenClaims.familyName) && C19383o.m32792b(this.email, authenticationTokenClaims.email) && C19383o.m32792b(this.picture, authenticationTokenClaims.picture) && C19383o.m32792b(this.userFriends, authenticationTokenClaims.userFriends) && C19383o.m32792b(this.userBirthday, authenticationTokenClaims.userBirthday) && C19383o.m32792b(this.userAgeRange, authenticationTokenClaims.userAgeRange) && C19383o.m32792b(this.userHometown, authenticationTokenClaims.userHometown) && C19383o.m32792b(this.userLocation, authenticationTokenClaims.userLocation) && C19383o.m32792b(this.userGender, authenticationTokenClaims.userGender) && C19383o.m32792b(this.userLink, authenticationTokenClaims.userLink);
    }

    public final String getAud() {
        return this.aud;
    }

    public final String getEmail() {
        return this.email;
    }

    public final long getExp() {
        return this.exp;
    }

    public final String getFamilyName() {
        return this.familyName;
    }

    public final String getGivenName() {
        return this.givenName;
    }

    public final long getIat() {
        return this.iat;
    }

    public final String getIss() {
        return this.iss;
    }

    public final String getJti() {
        return this.jti;
    }

    public final String getMiddleName() {
        return this.middleName;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final String getPicture() {
        return this.picture;
    }

    public final String getSub() {
        return this.sub;
    }

    public final Map<String, Integer> getUserAgeRange() {
        return this.userAgeRange;
    }

    public final String getUserBirthday() {
        return this.userBirthday;
    }

    public final Set<String> getUserFriends() {
        return this.userFriends;
    }

    public final String getUserGender() {
        return this.userGender;
    }

    public final Map<String, String> getUserHometown() {
        return this.userHometown;
    }

    public final String getUserLink() {
        return this.userLink;
    }

    public final Map<String, String> getUserLocation() {
        return this.userLocation;
    }

    public int hashCode() {
        int e = C0023f.m105e(this.sub, (Long.valueOf(this.iat).hashCode() + ((Long.valueOf(this.exp).hashCode() + C0023f.m105e(this.nonce, C0023f.m105e(this.aud, C0023f.m105e(this.iss, C0023f.m105e(this.jti, 527, 31), 31), 31), 31)) * 31)) * 31, 31);
        String str = this.name;
        int i = 0;
        int hashCode = (e + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.givenName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.middleName;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.familyName;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.email;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.picture;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Set<String> set = this.userFriends;
        int hashCode7 = (hashCode6 + (set != null ? set.hashCode() : 0)) * 31;
        String str7 = this.userBirthday;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Map<String, Integer> map = this.userAgeRange;
        int hashCode9 = (hashCode8 + (map != null ? map.hashCode() : 0)) * 31;
        Map<String, String> map2 = this.userHometown;
        int hashCode10 = (hashCode9 + (map2 != null ? map2.hashCode() : 0)) * 31;
        Map<String, String> map3 = this.userLocation;
        int hashCode11 = (hashCode10 + (map3 != null ? map3.hashCode() : 0)) * 31;
        String str8 = this.userGender;
        int hashCode12 = (hashCode11 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.userLink;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return hashCode12 + i;
    }

    public final String toEnCodedString() {
        String authenticationTokenClaims = toString();
        Charset charset = C19446a.f43373b;
        if (authenticationTokenClaims != null) {
            byte[] bytes = authenticationTokenClaims.getBytes(charset);
            C19383o.m32796f(bytes, "(this as java.lang.String).getBytes(charset)");
            String encodeToString = Base64.encodeToString(bytes, 8);
            C19383o.m32796f(encodeToString, "Base64.encodeToString(cl…Array(), Base64.URL_SAFE)");
            return encodeToString;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final JSONObject toJSONObject$facebook_core_release() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(JSON_KEY_JIT, this.jti);
        jSONObject.put(JSON_KEY_ISS, this.iss);
        jSONObject.put(JSON_KEY_AUD, this.aud);
        jSONObject.put("nonce", this.nonce);
        jSONObject.put(JSON_KEY_EXP, this.exp);
        jSONObject.put(JSON_KEY_IAT, this.iat);
        String str = this.sub;
        if (str != null) {
            jSONObject.put(JSON_KEY_SUB, str);
        }
        String str2 = this.name;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        String str3 = this.givenName;
        if (str3 != null) {
            jSONObject.put(JSON_KEY_GIVEN_NAME, str3);
        }
        String str4 = this.middleName;
        if (str4 != null) {
            jSONObject.put(JSON_KEY_MIDDLE_NAME, str4);
        }
        String str5 = this.familyName;
        if (str5 != null) {
            jSONObject.put(JSON_KEY_FAMILY_NAME, str5);
        }
        String str6 = this.email;
        if (str6 != null) {
            jSONObject.put("email", str6);
        }
        String str7 = this.picture;
        if (str7 != null) {
            jSONObject.put(JSON_KEY_PICTURE, str7);
        }
        if (this.userFriends != null) {
            jSONObject.put(JSON_KEY_USER_FRIENDS, new JSONArray(this.userFriends));
        }
        String str8 = this.userBirthday;
        if (str8 != null) {
            jSONObject.put(JSON_KEY_USER_BIRTHDAY, str8);
        }
        if (this.userAgeRange != null) {
            jSONObject.put(JSON_KEY_USER_AGE_RANGE, new JSONObject(this.userAgeRange));
        }
        if (this.userHometown != null) {
            jSONObject.put(JSON_KEY_USER_HOMETOWN, new JSONObject(this.userHometown));
        }
        if (this.userLocation != null) {
            jSONObject.put(JSON_KEY_USER_LOCATION, new JSONObject(this.userLocation));
        }
        String str9 = this.userGender;
        if (str9 != null) {
            jSONObject.put(JSON_KEY_USER_GENDER, str9);
        }
        String str10 = this.userLink;
        if (str10 != null) {
            jSONObject.put(JSON_KEY_USER_LINK, str10);
        }
        return jSONObject;
    }

    public String toString() {
        String jSONObject = toJSONObject$facebook_core_release().toString();
        C19383o.m32796f(jSONObject, "claimsJsonObject.toString()");
        return jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "dest");
        parcel.writeString(this.jti);
        parcel.writeString(this.iss);
        parcel.writeString(this.aud);
        parcel.writeString(this.nonce);
        parcel.writeLong(this.exp);
        parcel.writeLong(this.iat);
        parcel.writeString(this.sub);
        parcel.writeString(this.name);
        parcel.writeString(this.givenName);
        parcel.writeString(this.middleName);
        parcel.writeString(this.familyName);
        parcel.writeString(this.email);
        parcel.writeString(this.picture);
        if (this.userFriends == null) {
            parcel.writeStringList((List) null);
        } else {
            parcel.writeStringList(new ArrayList(this.userFriends));
        }
        parcel.writeString(this.userBirthday);
        parcel.writeMap(this.userAgeRange);
        parcel.writeMap(this.userHometown);
        parcel.writeMap(this.userLocation);
        parcel.writeString(this.userGender);
        parcel.writeString(this.userLink);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AuthenticationTokenClaims(java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, long r31, long r33, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.util.Collection r42, java.lang.String r43, java.util.Map r44, java.util.Map r45, java.util.Map r46, java.lang.String r47, java.lang.String r48, int r49, kotlin.jvm.internal.DefaultConstructorMarker r50) {
        /*
            r26 = this;
            r0 = r49
            r1 = r0 & 128(0x80, float:1.794E-43)
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r13 = r2
            goto L_0x000b
        L_0x0009:
            r13 = r36
        L_0x000b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0011
            r14 = r2
            goto L_0x0013
        L_0x0011:
            r14 = r37
        L_0x0013:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0019
            r15 = r2
            goto L_0x001b
        L_0x0019:
            r15 = r38
        L_0x001b:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0022
            r16 = r2
            goto L_0x0024
        L_0x0022:
            r16 = r39
        L_0x0024:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x002b
            r17 = r2
            goto L_0x002d
        L_0x002b:
            r17 = r40
        L_0x002d:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0034
            r18 = r2
            goto L_0x0036
        L_0x0034:
            r18 = r41
        L_0x0036:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x003d
            r19 = r2
            goto L_0x003f
        L_0x003d:
            r19 = r42
        L_0x003f:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0046
            r20 = r2
            goto L_0x0048
        L_0x0046:
            r20 = r43
        L_0x0048:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0051
            r21 = r2
            goto L_0x0053
        L_0x0051:
            r21 = r44
        L_0x0053:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x005b
            r22 = r2
            goto L_0x005d
        L_0x005b:
            r22 = r45
        L_0x005d:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0065
            r23 = r2
            goto L_0x0067
        L_0x0065:
            r23 = r46
        L_0x0067:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x006f
            r24 = r2
            goto L_0x0071
        L_0x006f:
            r24 = r47
        L_0x0071:
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0079
            r25 = r2
            goto L_0x007b
        L_0x0079:
            r25 = r48
        L_0x007b:
            r3 = r26
            r4 = r27
            r5 = r28
            r6 = r29
            r7 = r30
            r8 = r31
            r10 = r33
            r12 = r35
            r3.<init>(r4, r5, r6, r7, r8, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.AuthenticationTokenClaims.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Collection, java.lang.String, java.util.Map, java.util.Map, java.util.Map, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public AuthenticationTokenClaims(String str, String str2, String str3, String str4, long j, long j2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Collection<String> collection, String str12, Map<String, Integer> map, Map<String, String> map2, Map<String, String> map3, String str13, String str14) {
        String str15 = str;
        String str16 = str2;
        String str17 = str3;
        String str18 = str4;
        String str19 = str5;
        Collection<String> collection2 = collection;
        Map<String, Integer> map4 = map;
        Map<String, String> map5 = map2;
        Map<String, String> map6 = map3;
        C19383o.m32797g(str15, JSON_KEY_JIT);
        C19383o.m32797g(str16, JSON_KEY_ISS);
        C19383o.m32797g(str17, JSON_KEY_AUD);
        C19383o.m32797g(str18, "nonce");
        C19383o.m32797g(str19, JSON_KEY_SUB);
        C12879l0.m20599c(str15, JSON_KEY_JIT);
        C12879l0.m20599c(str16, JSON_KEY_ISS);
        C12879l0.m20599c(str17, JSON_KEY_AUD);
        C12879l0.m20599c(str18, "nonce");
        C12879l0.m20599c(str19, JSON_KEY_SUB);
        this.jti = str15;
        this.iss = str16;
        this.aud = str17;
        this.nonce = str18;
        this.exp = j;
        this.iat = j2;
        this.sub = str19;
        this.name = str6;
        this.givenName = str7;
        this.middleName = str8;
        this.familyName = str9;
        this.email = str10;
        this.picture = str11;
        Map<String, String> map7 = null;
        this.userFriends = collection2 != null ? Collections.unmodifiableSet(new HashSet(collection2)) : null;
        this.userBirthday = str12;
        this.userAgeRange = map4 != null ? Collections.unmodifiableMap(new HashMap(map4)) : null;
        this.userHometown = map5 != null ? Collections.unmodifiableMap(new HashMap(map5)) : null;
        this.userLocation = map6 != null ? Collections.unmodifiableMap(new HashMap(map6)) : map7;
        this.userGender = str13;
        this.userLink = str14;
    }

    public AuthenticationTokenClaims(Parcel parcel) {
        Class<C19388s> cls = C19388s.class;
        C19383o.m32797g(parcel, "parcel");
        String readString = parcel.readString();
        C12879l0.m20602f(readString, JSON_KEY_JIT);
        this.jti = readString;
        String readString2 = parcel.readString();
        C12879l0.m20602f(readString2, JSON_KEY_ISS);
        this.iss = readString2;
        String readString3 = parcel.readString();
        C12879l0.m20602f(readString3, JSON_KEY_AUD);
        this.aud = readString3;
        String readString4 = parcel.readString();
        C12879l0.m20602f(readString4, "nonce");
        this.nonce = readString4;
        this.exp = parcel.readLong();
        this.iat = parcel.readLong();
        String readString5 = parcel.readString();
        C12879l0.m20602f(readString5, JSON_KEY_SUB);
        this.sub = readString5;
        this.name = parcel.readString();
        this.givenName = parcel.readString();
        this.middleName = parcel.readString();
        this.familyName = parcel.readString();
        this.email = parcel.readString();
        this.picture = parcel.readString();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        Map<String, String> map = null;
        this.userFriends = createStringArrayList != null ? Collections.unmodifiableSet(new HashSet(createStringArrayList)) : null;
        this.userBirthday = parcel.readString();
        HashMap readHashMap = parcel.readHashMap(C19382n.class.getClassLoader());
        readHashMap = !(readHashMap instanceof HashMap) ? null : readHashMap;
        this.userAgeRange = readHashMap != null ? Collections.unmodifiableMap(readHashMap) : null;
        HashMap readHashMap2 = parcel.readHashMap(cls.getClassLoader());
        readHashMap2 = !(readHashMap2 instanceof HashMap) ? null : readHashMap2;
        this.userHometown = readHashMap2 != null ? Collections.unmodifiableMap(readHashMap2) : null;
        HashMap readHashMap3 = parcel.readHashMap(cls.getClassLoader());
        readHashMap3 = !(readHashMap3 instanceof HashMap) ? null : readHashMap3;
        this.userLocation = readHashMap3 != null ? Collections.unmodifiableMap(readHashMap3) : map;
        this.userGender = parcel.readString();
        this.userLink = parcel.readString();
    }
}
