package p340ea;

import android.os.Build;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.config.BuildTarget;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;

/* renamed from: ea.a */
public final class C12657a {

    /* renamed from: b */
    public static final DecimalFormat f27921b = new DecimalFormat("##########.####", new DecimalFormatSymbols(Locale.ROOT));

    /* renamed from: a */
    public final Map<String, Object> f27922a;

    public C12657a(String str, String str2, String str3, long j, C12674o oVar) {
        this.f27922a = C19294b0.m32562s0(new Pair("log_created_time", f27921b.format(((double) j) / 1000.0d)), new Pair("etsy_analytics_version", "0.8"), new Pair("app_version", str2), new Pair("hardware_platform_string", Build.MODEL), new Pair("device_system_version", Build.VERSION.RELEASE), new Pair(EventsNameKt.DEVICE_ID, str3), new Pair("data_type", oVar.f27948a), new Pair("is_android", 1), new Pair("app_name", str), new Pair("data", C19294b0.m32562s0(new Pair("log_message", oVar.f27950c), new Pair("log_namespace", oVar.f27949b))));
    }

    /* renamed from: a */
    public final String mo45436a() {
        try {
            String writeValueAsString = new ObjectMapper().writeValueAsString(this.f27922a);
            C19383o.m32796f(writeValueAsString, "ObjectMapper().writeValueAsString(logMap)");
            return writeValueAsString;
        } catch (JsonProcessingException e) {
            if (!C0326j.m869n(BuildTarget.Companion)) {
                return "";
            }
            throw e;
        }
    }
}
