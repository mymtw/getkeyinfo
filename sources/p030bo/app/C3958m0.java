package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.p013v4.media.C0069a;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: bo.app.m0 */
public final class C3958m0 implements C3602c2 {

    /* renamed from: b */
    public static final C3959a f8891b = new C3959a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final SharedPreferences f8892a;

    /* renamed from: bo.app.m0$a */
    public static final class C3959a {
        private C3959a() {
        }

        public /* synthetic */ C3959a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo13710a() {
            return String.valueOf(722989291);
        }
    }

    public C3958m0(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.device", 0);
        C19383o.m32796f(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.f8892a = sharedPreferences;
    }

    /* renamed from: a */
    private final void m9144a(String str) {
        this.f8892a.edit().putString(EventsNameKt.DEVICE_ID, str).putString("persistent_device_id", f8891b.mo13710a()).apply();
    }

    public String getDeviceId() {
        String str = null;
        String string = this.f8892a.getString(EventsNameKt.DEVICE_ID, (String) null);
        if (!m9145a()) {
            str = string;
        }
        if (str == null) {
            String e = C0069a.m174e("randomUUID().toString()");
            m9144a(e);
            return e;
        } else if (this.f8892a.contains("persistent_device_id")) {
            return str;
        } else {
            m9144a(str);
            return str;
        }
    }

    /* renamed from: a */
    private final boolean m9145a() {
        if (this.f8892a.contains("persistent_device_id")) {
            if (!C19383o.m32792b(f8891b.mo13710a(), this.f8892a.getString("persistent_device_id", ""))) {
                return true;
            }
        }
        return false;
    }
}
