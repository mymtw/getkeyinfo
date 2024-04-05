package com.paypal.pyplcheckout.services.api;

import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.services.queries.GetFirebaseSessionIdQuery;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.C20011u;
import org.json.JSONObject;

public final class FirebaseTokenApi extends BaseApi {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FirebaseTokenApi get() {
            return new FirebaseTokenApi();
        }
    }

    public static final FirebaseTokenApi get() {
        return Companion.get();
    }

    public C20011u createService() {
        GetFirebaseSessionIdQuery getFirebaseSessionIdQuery = GetFirebaseSessionIdQuery.INSTANCE;
        String firebaseSessionId = DebugConfigManager.getInstance().getFirebaseSessionId();
        C19383o.m32796f(firebaseSessionId, "getInstance().firebaseSessionId");
        JSONObject jSONObject = new JSONObject(getFirebaseSessionIdQuery.get(firebaseSessionId));
        C20011u.C20012a aVar = new C20011u.C20012a();
        BaseApiKt.setGraphQlUrl(aVar);
        BaseApiKt.addBaseHeaders(aVar);
        String jSONObject2 = jSONObject.toString();
        C19383o.m32796f(jSONObject2, "firebaseQueryJson.toString()");
        BaseApiKt.addPostBody(aVar, jSONObject2);
        return aVar.mo72999b();
    }
}
