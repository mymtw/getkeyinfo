package com.etsy.android.lib.network.oauth2;

import com.paypal.openid.AuthorizationException;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class OAuth2ErrorPayLoadJsonAdapter extends JsonAdapter<OAuth2ErrorPayLoad> {
    public static final int $stable = 8;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("error", AuthorizationException.PARAM_ERROR_DESCRIPTION, AuthorizationException.PARAM_ERROR_URI);
    private final JsonAdapter<String> stringAdapter;

    public OAuth2ErrorPayLoadJsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = yVar.mo68558c(cls, emptySet, "errorType");
        this.nullableStringAdapter = yVar.mo68558c(cls, emptySet, "errorUri");
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw C18215a.m30734m("errorType", "error", jsonReader);
                }
            } else if (Q == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw C18215a.m30734m("errorDescription", AuthorizationException.PARAM_ERROR_DESCRIPTION, jsonReader);
                }
            } else if (Q == 2) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (str == null) {
            throw C18215a.m30728g("errorType", "error", jsonReader);
        } else if (str2 != null) {
            return new OAuth2ErrorPayLoad(str, str2, str3);
        } else {
            throw C18215a.m30728g("errorDescription", AuthorizationException.PARAM_ERROR_DESCRIPTION, jsonReader);
        }
    }

    public final void toJson(C17412w wVar, Object obj) {
        OAuth2ErrorPayLoad oAuth2ErrorPayLoad = (OAuth2ErrorPayLoad) obj;
        C19383o.m32797g(wVar, "writer");
        if (oAuth2ErrorPayLoad != null) {
            wVar.mo68522b();
            wVar.mo68529h("error");
            this.stringAdapter.toJson(wVar, oAuth2ErrorPayLoad.f19197a);
            wVar.mo68529h(AuthorizationException.PARAM_ERROR_DESCRIPTION);
            this.stringAdapter.toJson(wVar, oAuth2ErrorPayLoad.f19198b);
            wVar.mo68529h(AuthorizationException.PARAM_ERROR_URI);
            this.nullableStringAdapter.toJson(wVar, oAuth2ErrorPayLoad.f19199c);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(OAuth2ErrorPayLoad)";
    }
}
