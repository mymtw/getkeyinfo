package com.facebook;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.AuthenticationTokenManager;
import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import java.io.IOException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19459m;
import org.apache.commons.lang3.ClassUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p003a2.C0023f;
import p365hg.C12869i0;
import p365hg.C12879l0;
import p432qg.C13330a;
import p453tf.C13414f;
import p453tf.C13418j;

public final class AuthenticationToken implements Parcelable {
    public static final String AUTHENTICATION_TOKEN_KEY = "id_token";
    private static final String CLAIMS_KEY = "claims";
    public static final Parcelable.Creator<AuthenticationToken> CREATOR = new AuthenticationToken$Companion$CREATOR$1();
    public static final C12175a Companion = new C12175a();
    private static final String EXPECTED_NONCE_KEY = "expected_nonce";
    private static final String HEADER_KEY = "header";
    private static final String SIGNATURE_KEY = "signature";
    private static final String TOKEN_STRING_KEY = "token_string";
    private final AuthenticationTokenClaims claims;
    private final String expectedNonce;
    private final AuthenticationTokenHeader header;
    private final String signature;
    private final String token;

    /* renamed from: com.facebook.AuthenticationToken$a */
    public static final class C12175a {
    }

    public AuthenticationToken(String str, String str2) {
        C19383o.m32797g(str, UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN);
        C19383o.m32797g(str2, "expectedNonce");
        C12879l0.m20599c(str, UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN);
        C12879l0.m20599c(str2, "expectedNonce");
        List y1 = C19459m.m33056y1(str, new String[]{"."}, 0, 6);
        if (y1.size() == 3) {
            String str3 = (String) y1.get(0);
            String str4 = (String) y1.get(1);
            String str5 = (String) y1.get(2);
            this.token = str;
            this.expectedNonce = str2;
            AuthenticationTokenHeader authenticationTokenHeader = new AuthenticationTokenHeader(str3);
            this.header = authenticationTokenHeader;
            this.claims = new AuthenticationTokenClaims(str4, str2);
            if (isValidSignature(str3, str4, str5, authenticationTokenHeader.getKid())) {
                this.signature = str5;
                return;
            }
            throw new IllegalArgumentException("Invalid Signature".toString());
        }
        throw new IllegalArgumentException("Invalid IdToken string".toString());
    }

    public static final AuthenticationToken getCurrentAuthenticationToken() {
        Companion.getClass();
        return AuthenticationTokenManager.f27214e.mo39154a().f27215a;
    }

    private final boolean isValidSignature(String str, String str2, String str3, String str4) {
        try {
            String b = C13330a.m20945b(str4);
            if (b != null) {
                PublicKey a = C13330a.m20944a(b);
                return C13330a.m20946c(a, str + ClassUtils.PACKAGE_SEPARATOR_CHAR + str2, str3);
            }
        } catch (IOException | InvalidKeySpecException unused) {
        }
        return false;
    }

    public static final void setCurrentAuthenticationToken(AuthenticationToken authenticationToken) {
        Companion.getClass();
        AuthenticationTokenManager a = AuthenticationTokenManager.f27214e.mo39154a();
        AuthenticationToken authenticationToken2 = a.f27215a;
        a.f27215a = authenticationToken;
        if (authenticationToken != null) {
            C13414f fVar = a.f27217c;
            fVar.getClass();
            try {
                fVar.f29379a.edit().putString("com.facebook.AuthenticationManager.CachedAuthenticationToken", authenticationToken.toJSONObject$facebook_core_release().toString()).apply();
            } catch (JSONException unused) {
            }
        } else {
            a.f27217c.f29379a.edit().remove("com.facebook.AuthenticationManager.CachedAuthenticationToken").apply();
            C12869i0.m20565d(C13418j.m21106b());
        }
        if (!C12869i0.m20562a(authenticationToken2, authenticationToken)) {
            Intent intent = new Intent(C13418j.m21106b(), AuthenticationTokenManager.CurrentAuthenticationTokenChangedBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED");
            intent.putExtra("com.facebook.sdk.EXTRA_OLD_AUTHENTICATION_TOKEN", authenticationToken2);
            intent.putExtra("com.facebook.sdk.EXTRA_NEW_AUTHENTICATION_TOKEN", authenticationToken);
            a.f27216b.mo20709c(intent);
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationToken)) {
            return false;
        }
        AuthenticationToken authenticationToken = (AuthenticationToken) obj;
        return C19383o.m32792b(this.token, authenticationToken.token) && C19383o.m32792b(this.expectedNonce, authenticationToken.expectedNonce) && C19383o.m32792b(this.header, authenticationToken.header) && C19383o.m32792b(this.claims, authenticationToken.claims) && C19383o.m32792b(this.signature, authenticationToken.signature);
    }

    public final AuthenticationTokenClaims getClaims() {
        return this.claims;
    }

    public final String getExpectedNonce() {
        return this.expectedNonce;
    }

    public final AuthenticationTokenHeader getHeader() {
        return this.header;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        int e = C0023f.m105e(this.expectedNonce, C0023f.m105e(this.token, 527, 31), 31);
        int hashCode = this.claims.hashCode();
        return this.signature.hashCode() + ((hashCode + ((this.header.hashCode() + e) * 31)) * 31);
    }

    public final JSONObject toJSONObject$facebook_core_release() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TOKEN_STRING_KEY, this.token);
        jSONObject.put(EXPECTED_NONCE_KEY, this.expectedNonce);
        jSONObject.put("header", this.header.toJSONObject$facebook_core_release());
        jSONObject.put(CLAIMS_KEY, this.claims.toJSONObject$facebook_core_release());
        jSONObject.put(SIGNATURE_KEY, this.signature);
        return jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "dest");
        parcel.writeString(this.token);
        parcel.writeString(this.expectedNonce);
        parcel.writeParcelable(this.header, i);
        parcel.writeParcelable(this.claims, i);
        parcel.writeString(this.signature);
    }

    public AuthenticationToken(Parcel parcel) {
        C19383o.m32797g(parcel, "parcel");
        String readString = parcel.readString();
        C12879l0.m20602f(readString, UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN);
        this.token = readString;
        String readString2 = parcel.readString();
        C12879l0.m20602f(readString2, "expectedNonce");
        this.expectedNonce = readString2;
        Parcelable readParcelable = parcel.readParcelable(AuthenticationTokenHeader.class.getClassLoader());
        if (readParcelable != null) {
            this.header = (AuthenticationTokenHeader) readParcelable;
            Parcelable readParcelable2 = parcel.readParcelable(AuthenticationTokenClaims.class.getClassLoader());
            if (readParcelable2 != null) {
                this.claims = (AuthenticationTokenClaims) readParcelable2;
                String readString3 = parcel.readString();
                C12879l0.m20602f(readString3, SIGNATURE_KEY);
                this.signature = readString3;
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public AuthenticationToken(JSONObject jSONObject) throws JSONException {
        C19383o.m32797g(jSONObject, "jsonObject");
        String string = jSONObject.getString(TOKEN_STRING_KEY);
        C19383o.m32796f(string, "jsonObject.getString(TOKEN_STRING_KEY)");
        this.token = string;
        String string2 = jSONObject.getString(EXPECTED_NONCE_KEY);
        C19383o.m32796f(string2, "jsonObject.getString(EXPECTED_NONCE_KEY)");
        this.expectedNonce = string2;
        String string3 = jSONObject.getString(SIGNATURE_KEY);
        C19383o.m32796f(string3, "jsonObject.getString(SIGNATURE_KEY)");
        this.signature = string3;
        JSONObject jSONObject2 = jSONObject.getJSONObject("header");
        JSONObject jSONObject3 = jSONObject.getJSONObject(CLAIMS_KEY);
        C19383o.m32796f(jSONObject2, "headerJSONObject");
        this.header = new AuthenticationTokenHeader(jSONObject2);
        AuthenticationTokenClaims.C12176a aVar = AuthenticationTokenClaims.Companion;
        C19383o.m32796f(jSONObject3, "claimsJSONObject");
        aVar.getClass();
        this.claims = AuthenticationTokenClaims.C12176a.m19984a(jSONObject3);
    }
}
