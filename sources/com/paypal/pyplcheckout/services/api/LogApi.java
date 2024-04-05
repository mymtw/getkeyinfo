package com.paypal.pyplcheckout.services.api;

import com.facebook.login.LoginFragment;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.pojo.BeaverLoggerRequest;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.C20011u;
import org.json.JSONObject;

public final class LogApi extends BaseApi {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static String TAG = "LogApi";
    private static BeaverLoggerRequest beaverLoggerRequest;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LogApi get() {
            return new LogApi();
        }
    }

    public static final LogApi get() {
        return Companion.get();
    }

    public C20011u createService() {
        C20011u.C20012a aVar = new C20011u.C20012a();
        BeaverLoggerRequest beaverLoggerRequest2 = beaverLoggerRequest;
        if (beaverLoggerRequest2 != null) {
            aVar.mo73003f(beaverLoggerRequest2.getUrl());
            BeaverLoggerRequest beaverLoggerRequest3 = beaverLoggerRequest;
            if (beaverLoggerRequest3 != null) {
                for (Map.Entry next : beaverLoggerRequest3.getHeaders().entrySet()) {
                    aVar.mo73000c((String) next.getKey(), (String) next.getValue());
                }
                String str = TAG;
                C19383o.m32796f(str, "TAG");
                BeaverLoggerRequest beaverLoggerRequest4 = beaverLoggerRequest;
                if (beaverLoggerRequest4 != null) {
                    JSONObject data = beaverLoggerRequest4.getData();
                    PLog.d$default(str, "logging events: " + data, 0, 4, (Object) null);
                    BeaverLoggerRequest beaverLoggerRequest5 = beaverLoggerRequest;
                    if (beaverLoggerRequest5 != null) {
                        String jSONObject = beaverLoggerRequest5.getData().toString();
                        C19383o.m32796f(jSONObject, "beaverLoggerRequest.data.toString()");
                        BaseApiKt.addPostBody(aVar, jSONObject);
                        return aVar.mo72999b();
                    }
                    C19383o.m32805o("beaverLoggerRequest");
                    throw null;
                }
                C19383o.m32805o("beaverLoggerRequest");
                throw null;
            }
            C19383o.m32805o("beaverLoggerRequest");
            throw null;
        }
        C19383o.m32805o("beaverLoggerRequest");
        throw null;
    }

    public final void setRequest(BeaverLoggerRequest beaverLoggerRequest2) {
        C19383o.m32797g(beaverLoggerRequest2, LoginFragment.EXTRA_REQUEST);
        beaverLoggerRequest = beaverLoggerRequest2;
    }
}
