package p030bo.app;

import com.braze.support.BrazeLogger;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19446a;
import p753kq.C19846a;

/* renamed from: bo.app.q5 */
public final class C4105q5 {

    /* renamed from: a */
    public static final C4105q5 f9134a = new C4105q5();

    /* renamed from: bo.app.q5$a */
    public static final class C4106a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4106a f9135b = new C4106a();

        public C4106a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Caught exception while trying to read BrazeLogger tag from system properties.";
        }
    }

    private C4105q5() {
    }

    /* renamed from: a */
    public final String mo13916a(String str) {
        C19383o.m32797g(str, "key");
        try {
            InputStream inputStream = Runtime.getRuntime().exec(new String[]{"/system/bin/getprop", str}).getInputStream();
            C19383o.m32796f(inputStream, "getRuntime()\n           …             .inputStream");
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, C19446a.f43373b);
            String readLine = (inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192)).readLine();
            C19383o.m32796f(readLine, "{\n            Runtime.ge…er().readLine()\n        }");
            return readLine;
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C4106a.f9135b, 4);
            return "";
        }
    }
}
