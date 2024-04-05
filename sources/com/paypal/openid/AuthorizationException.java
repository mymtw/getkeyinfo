package com.paypal.openid;

import android.content.Intent;
import android.net.Uri;
import android.support.p013v4.media.C0072d;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.stetho.websocket.CloseCodes;
import java.util.Collections;
import java.util.Map;
import org.apache.commons.lang3.time.DateUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p193o.C7494b;
import p568fn.C17782b;

public final class AuthorizationException extends Exception {
    public static final String EXTRA_EXCEPTION = "AuthorizationException";
    public static final String PARAM_ERROR = "error";
    public static final String PARAM_ERROR_DESCRIPTION = "error_description";
    public static final String PARAM_ERROR_URI = "error_uri";
    public static final int TYPE_GENERAL_ERROR = 0;
    public static final int TYPE_OAUTH_AUTHORIZATION_ERROR = 1;
    public static final int TYPE_OAUTH_REGISTRATION_ERROR = 4;
    public static final int TYPE_OAUTH_TOKEN_ERROR = 2;
    public static final int TYPE_RESOURCE_SERVER_AUTHORIZATION_ERROR = 3;
    public final int code;
    public final String error;
    public final String errorDescription;
    public final Uri errorUri;
    public final int type;

    /* renamed from: com.paypal.openid.AuthorizationException$a */
    public static final class C17145a {

        /* renamed from: a */
        public static final AuthorizationException f37524a;

        /* renamed from: b */
        public static final AuthorizationException f37525b = AuthorizationException.m28594c(9, "Response state param did not match request state");

        /* renamed from: c */
        public static final Map<String, AuthorizationException> f37526c;

        static {
            AuthorizationException a = AuthorizationException.m28592a(1000, "invalid_request");
            AuthorizationException a2 = AuthorizationException.m28592a(DateUtils.SEMI_MONTH, "unauthorized_client");
            AuthorizationException a3 = AuthorizationException.m28592a(CloseCodes.PROTOCOL_ERROR, "access_denied");
            AuthorizationException a4 = AuthorizationException.m28592a(1003, "unsupported_response_type");
            AuthorizationException a5 = AuthorizationException.m28592a(1004, "invalid_scope");
            AuthorizationException a6 = AuthorizationException.m28592a(1005, "server_error");
            AuthorizationException a7 = AuthorizationException.m28592a(CloseCodes.CLOSED_ABNORMALLY, "temporarily_unavailable");
            AuthorizationException a8 = AuthorizationException.m28592a(1007, (String) null);
            AuthorizationException a9 = AuthorizationException.m28592a(1008, (String) null);
            f37524a = a9;
            f37526c = AuthorizationException.m28593b(new AuthorizationException[]{a, a2, a3, a4, a5, a6, a7, a8, a9});
        }
    }

    /* renamed from: com.paypal.openid.AuthorizationException$b */
    public static final class C17146b {

        /* renamed from: a */
        public static final AuthorizationException f37527a = AuthorizationException.m28594c(1, "User cancelled flow");

        /* renamed from: b */
        public static final AuthorizationException f37528b = AuthorizationException.m28594c(3, "Network error");

        /* renamed from: c */
        public static final AuthorizationException f37529c = AuthorizationException.m28594c(5, "JSON deserialization error");

        /* renamed from: d */
        public static final AuthorizationException f37530d = AuthorizationException.m28594c(8, "Authentication flow error");

        static {
            AuthorizationException.m28594c(0, "Invalid discovery document");
            AuthorizationException.m28594c(2, "Flow cancelled programmatically");
            AuthorizationException.m28594c(4, "Server error");
            AuthorizationException.m28594c(6, "Token response construction error");
            AuthorizationException.m28594c(7, "Invalid registration response");
            AuthorizationException.m28594c(9, "Something went wrong");
            AuthorizationException.m28594c(10, "Auth flow not triggered");
        }
    }

    /* renamed from: com.paypal.openid.AuthorizationException$c */
    public static final class C17147c {

        /* renamed from: a */
        public static final AuthorizationException f37531a;

        /* renamed from: b */
        public static final Map<String, AuthorizationException> f37532b;

        static {
            AuthorizationException d = AuthorizationException.m28595d(RecyclerView.MAX_SCROLL_DURATION, "invalid_request");
            AuthorizationException d2 = AuthorizationException.m28595d(2001, "invalid_client");
            AuthorizationException d3 = AuthorizationException.m28595d(2002, "invalid_grant");
            AuthorizationException d4 = AuthorizationException.m28595d(2003, "unauthorized_client");
            AuthorizationException d5 = AuthorizationException.m28595d(2004, "unsupported_grant_type");
            AuthorizationException d6 = AuthorizationException.m28595d(2005, "invalid_scope");
            AuthorizationException d7 = AuthorizationException.m28595d(2006, (String) null);
            AuthorizationException d8 = AuthorizationException.m28595d(2007, (String) null);
            f37531a = d8;
            f37532b = AuthorizationException.m28593b(new AuthorizationException[]{d, d2, d3, d4, d5, d6, d7, d8});
        }
    }

    public AuthorizationException(int i, int i2, String str, String str2, Uri uri, Throwable th) {
        super(str2, th);
        this.type = i;
        this.code = i2;
        this.error = str;
        this.errorDescription = str2;
        this.errorUri = uri;
    }

    /* renamed from: a */
    public static AuthorizationException m28592a(int i, String str) {
        return new AuthorizationException(1, i, str, (String) null, (Uri) null, (Throwable) null);
    }

    /* renamed from: b */
    public static Map m28593b(AuthorizationException[] authorizationExceptionArr) {
        C7494b bVar = new C7494b(authorizationExceptionArr.length);
        for (AuthorizationException authorizationException : authorizationExceptionArr) {
            String str = authorizationException.error;
            if (str != null) {
                bVar.put(str, authorizationException);
            }
        }
        return Collections.unmodifiableMap(bVar);
    }

    /* renamed from: c */
    public static AuthorizationException m28594c(int i, String str) {
        return new AuthorizationException(0, i, (String) null, str, (Uri) null, (Throwable) null);
    }

    /* renamed from: d */
    public static AuthorizationException m28595d(int i, String str) {
        return new AuthorizationException(2, i, str, (String) null, (Uri) null, (Throwable) null);
    }

    public static AuthorizationException fromIntent(Intent intent) {
        intent.getClass();
        if (!intent.hasExtra(EXTRA_EXCEPTION)) {
            return null;
        }
        try {
            return fromJson(intent.getStringExtra(EXTRA_EXCEPTION));
        } catch (JSONException e) {
            throw new IllegalArgumentException("Intent contains malformed exception data", e);
        }
    }

    public static AuthorizationException fromJson(String str) {
        C17782b.m29834C(str, "jsonStr cannot be null or empty");
        return fromJson(new JSONObject(str));
    }

    public static AuthorizationException fromJson(JSONObject jSONObject) {
        if (jSONObject != null) {
            return new AuthorizationException(jSONObject.getInt("type"), jSONObject.getInt(ResponseConstants.CODE), C17158g.m28621c("error", jSONObject), C17158g.m28621c("errorDescription", jSONObject), C17158g.m28625g("errorUri", jSONObject), (Throwable) null);
        }
        throw new NullPointerException("json cannot be null");
    }

    public static AuthorizationException fromOAuthRedirect(Uri uri) {
        String queryParameter = uri.getQueryParameter("error");
        String queryParameter2 = uri.getQueryParameter(PARAM_ERROR_DESCRIPTION);
        String queryParameter3 = uri.getQueryParameter(PARAM_ERROR_URI);
        AuthorizationException authorizationException = C17145a.f37526c.get(queryParameter);
        if (authorizationException == null) {
            authorizationException = C17145a.f37524a;
        }
        int i = authorizationException.type;
        int i2 = authorizationException.code;
        if (queryParameter2 == null) {
            queryParameter2 = authorizationException.errorDescription;
        }
        return new AuthorizationException(i, i2, queryParameter, queryParameter2, queryParameter3 != null ? Uri.parse(queryParameter3) : authorizationException.errorUri, (Throwable) null);
    }

    public static AuthorizationException fromOAuthTemplate(AuthorizationException authorizationException, String str, String str2, Uri uri) {
        int i = authorizationException.type;
        int i2 = authorizationException.code;
        if (str == null) {
            str = authorizationException.error;
        }
        String str3 = str;
        if (str2 == null) {
            str2 = authorizationException.errorDescription;
        }
        String str4 = str2;
        if (uri == null) {
            uri = authorizationException.errorUri;
        }
        return new AuthorizationException(i, i2, str3, str4, uri, (Throwable) null);
    }

    public static AuthorizationException fromTemplate(AuthorizationException authorizationException, Throwable th) {
        return new AuthorizationException(authorizationException.type, authorizationException.code, authorizationException.error, authorizationException.errorDescription, authorizationException.errorUri, th);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof AuthorizationException)) {
            return false;
        }
        AuthorizationException authorizationException = (AuthorizationException) obj;
        return this.type == authorizationException.type && this.code == authorizationException.code;
    }

    public int hashCode() {
        return ((this.type + 31) * 31) + this.code;
    }

    public Intent toIntent() {
        Intent intent = new Intent();
        intent.putExtra(EXTRA_EXCEPTION, toJsonString());
        return intent;
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        C17158g.m28627i(this.type, "type", jSONObject);
        C17158g.m28627i(this.code, ResponseConstants.CODE, jSONObject);
        C17158g.m28632n("error", this.error, jSONObject);
        C17158g.m28632n("errorDescription", this.errorDescription, jSONObject);
        C17158g.m28633o(jSONObject, "errorUri", this.errorUri);
        return jSONObject;
    }

    public String toJsonString() {
        return toJson().toString();
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("AuthorizationException: ");
        h.append(toJsonString());
        return h.toString();
    }
}
