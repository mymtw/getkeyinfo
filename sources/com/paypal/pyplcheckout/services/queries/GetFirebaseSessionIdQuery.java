package com.paypal.pyplcheckout.services.queries;

import androidx.compose.animation.C0388a;
import kotlin.jvm.internal.C19383o;

public final class GetFirebaseSessionIdQuery {
    public static final GetFirebaseSessionIdQuery INSTANCE = new GetFirebaseSessionIdQuery();

    private GetFirebaseSessionIdQuery() {
    }

    public final String get(String str) {
        C19383o.m32797g(str, "sessionId");
        return C0388a.m1049e(new Object[]{str}, 1, " { query: 'query GET_FIREBASE_SESSION_ID($sessionUID: String!) {\n  firebase {\n    auth(sessionUID: $sessionUID) {\n      sessionUID\n      sessionToken\n    }\n  }\n}',\n    variables: { sessionUID: %s }}", "format(format, *args)");
    }
}
