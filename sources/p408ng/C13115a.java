package p408ng;

import com.etsy.android.lib.models.ResponseConstants;
import java.io.File;
import kotlin.jvm.internal.C19383o;
import org.json.JSONException;
import org.json.JSONObject;
import p568fn.C17782b;

/* renamed from: ng.a */
public final class C13115a {

    /* renamed from: a */
    public String f28838a;

    /* renamed from: b */
    public String f28839b;

    /* renamed from: c */
    public Long f28840c;

    public C13115a(String str) {
        this.f28840c = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.f28839b = str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("error_log_");
        Long l = this.f28840c;
        if (l != null) {
            stringBuffer.append(l.longValue());
            stringBuffer.append(".json");
            String stringBuffer2 = stringBuffer.toString();
            C19383o.m32796f(stringBuffer2, "StringBuffer()\n         …)\n            .toString()");
            this.f28838a = stringBuffer2;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l = this.f28840c;
            if (l != null) {
                jSONObject.put(ResponseConstants.TIMESTAMP, l.longValue());
            }
            jSONObject.put(ResponseConstants.ERROR_MESSAGE, this.f28839b);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return super.toString();
        }
        String jSONObject2 = jSONObject.toString();
        C19383o.m32796f(jSONObject2, "params.toString()");
        return jSONObject2;
    }

    public C13115a(File file) {
        C19383o.m32797g(file, ResponseConstants.FILE);
        String name = file.getName();
        C19383o.m32796f(name, "file.name");
        this.f28838a = name;
        JSONObject j0 = C17782b.m29870j0(name);
        if (j0 != null) {
            this.f28840c = Long.valueOf(j0.optLong(ResponseConstants.TIMESTAMP, 0));
            this.f28839b = j0.optString(ResponseConstants.ERROR_MESSAGE, (String) null);
        }
    }
}
