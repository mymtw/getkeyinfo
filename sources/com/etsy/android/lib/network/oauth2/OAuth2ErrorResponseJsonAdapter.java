package com.etsy.android.lib.network.oauth2;

import com.paypal.openid.AuthorizationException;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class OAuth2ErrorResponseJsonAdapter extends JsonAdapter<OAuth2ErrorResponse> {
    public static final int $stable = 8;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("error", AuthorizationException.PARAM_ERROR_DESCRIPTION);
    private final JsonAdapter<String> stringAdapter;

    public OAuth2ErrorResponseJsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = yVar.mo68558c(cls, emptySet, "error");
        this.nullableStringAdapter = yVar.mo68558c(cls, emptySet, "description");
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        String str2 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw C18215a.m30734m("error", "error", jsonReader);
                }
            } else if (Q == 1) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (str != null) {
            return new OAuth2ErrorResponse(str, str2);
        }
        throw C18215a.m30728g("error", "error", jsonReader);
    }

    public final void toJson(C17412w wVar, Object obj) {
        OAuth2ErrorResponse oAuth2ErrorResponse = (OAuth2ErrorResponse) obj;
        C19383o.m32797g(wVar, "writer");
        if (oAuth2ErrorResponse != null) {
            wVar.mo68522b();
            wVar.mo68529h("error");
            this.stringAdapter.toJson(wVar, oAuth2ErrorResponse.f19200a);
            wVar.mo68529h(AuthorizationException.PARAM_ERROR_DESCRIPTION);
            this.nullableStringAdapter.toJson(wVar, oAuth2ErrorResponse.f19201b);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(OAuth2ErrorResponse)";
    }
}
