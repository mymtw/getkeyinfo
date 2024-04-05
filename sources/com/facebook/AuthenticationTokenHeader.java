package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.nio.charset.Charset;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19446a;
import org.json.JSONException;
import org.json.JSONObject;
import p003a2.C0023f;
import p010a9.C0048b;
import p365hg.C12879l0;

public final class AuthenticationTokenHeader implements Parcelable {
    public static final Parcelable.Creator<AuthenticationTokenHeader> CREATOR = new AuthenticationTokenHeader$Companion$CREATOR$1();
    public static final C12177a Companion = new C12177a();
    private final String alg;
    private final String kid;
    private final String typ;

    /* renamed from: com.facebook.AuthenticationTokenHeader$a */
    public static final class C12177a {
    }

    public AuthenticationTokenHeader(String str, String str2, String str3) {
        C0048b.m167f(str, "alg", str2, "typ", str3, "kid");
        this.alg = str;
        this.typ = str2;
        this.kid = str3;
    }

    private final boolean isValidHeader(String str) {
        C12879l0.m20599c(str, "encodedHeaderString");
        byte[] decode = Base64.decode(str, 0);
        C19383o.m32796f(decode, "decodedBytes");
        try {
            JSONObject jSONObject = new JSONObject(new String(decode, C19446a.f43373b));
            String optString = jSONObject.optString("alg");
            C19383o.m32796f(optString, "alg");
            boolean z = (optString.length() > 0) && C19383o.m32792b(optString, "RS256");
            String optString2 = jSONObject.optString("kid");
            C19383o.m32796f(optString2, "jsonObj.optString(\"kid\")");
            boolean z2 = optString2.length() > 0;
            String optString3 = jSONObject.optString("typ");
            C19383o.m32796f(optString3, "jsonObj.optString(\"typ\")");
            return z && z2 && (optString3.length() > 0);
        } catch (JSONException unused) {
            return false;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationTokenHeader)) {
            return false;
        }
        AuthenticationTokenHeader authenticationTokenHeader = (AuthenticationTokenHeader) obj;
        return C19383o.m32792b(this.alg, authenticationTokenHeader.alg) && C19383o.m32792b(this.typ, authenticationTokenHeader.typ) && C19383o.m32792b(this.kid, authenticationTokenHeader.kid);
    }

    public final String getAlg() {
        return this.alg;
    }

    public final String getKid() {
        return this.kid;
    }

    public final String getTyp() {
        return this.typ;
    }

    public int hashCode() {
        return this.kid.hashCode() + C0023f.m105e(this.typ, C0023f.m105e(this.alg, 527, 31), 31);
    }

    public final String toEnCodedString() {
        String authenticationTokenHeader = toString();
        Charset charset = C19446a.f43373b;
        if (authenticationTokenHeader != null) {
            byte[] bytes = authenticationTokenHeader.getBytes(charset);
            C19383o.m32796f(bytes, "(this as java.lang.String).getBytes(charset)");
            String encodeToString = Base64.encodeToString(bytes, 0);
            C19383o.m32796f(encodeToString, "Base64.encodeToString(cl…eArray(), Base64.DEFAULT)");
            return encodeToString;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final JSONObject toJSONObject$facebook_core_release() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.alg);
        jSONObject.put("typ", this.typ);
        jSONObject.put("kid", this.kid);
        return jSONObject;
    }

    public String toString() {
        String jSONObject = toJSONObject$facebook_core_release().toString();
        C19383o.m32796f(jSONObject, "headerJsonObject.toString()");
        return jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "dest");
        parcel.writeString(this.alg);
        parcel.writeString(this.typ);
        parcel.writeString(this.kid);
    }

    public AuthenticationTokenHeader(String str) {
        C19383o.m32797g(str, "encodedHeaderString");
        if (isValidHeader(str)) {
            byte[] decode = Base64.decode(str, 0);
            C19383o.m32796f(decode, "decodedBytes");
            JSONObject jSONObject = new JSONObject(new String(decode, C19446a.f43373b));
            String string = jSONObject.getString("alg");
            C19383o.m32796f(string, "jsonObj.getString(\"alg\")");
            this.alg = string;
            String string2 = jSONObject.getString("typ");
            C19383o.m32796f(string2, "jsonObj.getString(\"typ\")");
            this.typ = string2;
            String string3 = jSONObject.getString("kid");
            C19383o.m32796f(string3, "jsonObj.getString(\"kid\")");
            this.kid = string3;
            return;
        }
        throw new IllegalArgumentException("Invalid Header".toString());
    }

    public AuthenticationTokenHeader(Parcel parcel) {
        C19383o.m32797g(parcel, "parcel");
        String readString = parcel.readString();
        C12879l0.m20602f(readString, "alg");
        this.alg = readString;
        String readString2 = parcel.readString();
        C12879l0.m20602f(readString2, "typ");
        this.typ = readString2;
        String readString3 = parcel.readString();
        C12879l0.m20602f(readString3, "kid");
        this.kid = readString3;
    }

    public AuthenticationTokenHeader(JSONObject jSONObject) throws JSONException {
        C19383o.m32797g(jSONObject, "jsonObject");
        String string = jSONObject.getString("alg");
        C19383o.m32796f(string, "jsonObject.getString(\"alg\")");
        this.alg = string;
        String string2 = jSONObject.getString("typ");
        C19383o.m32796f(string2, "jsonObject.getString(\"typ\")");
        this.typ = string2;
        String string3 = jSONObject.getString("kid");
        C19383o.m32796f(string3, "jsonObject.getString(\"kid\")");
        this.kid = string3;
    }
}
