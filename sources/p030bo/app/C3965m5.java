package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.p013v4.media.C0072d;
import com.appboy.Constants;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p003a2.C0023f;
import p753kq.C19846a;

/* renamed from: bo.app.m5 */
public final class C3965m5 {

    /* renamed from: a */
    private static final String f8900a = C19383o.m32802l("SharedPrefUtils", Constants.LOG_TAG_PREFIX);

    /* renamed from: bo.app.m5$a */
    public static final class C3966a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f8901b;

        /* renamed from: c */
        public final /* synthetic */ String f8902c;

        /* renamed from: d */
        public final /* synthetic */ String f8903d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3966a(String str, String str2, String str3) {
            super(0);
            this.f8901b = str;
            this.f8902c = str2;
            this.f8903d = str3;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Detected SDK update from '");
            h.append(this.f8901b);
            h.append("' -> '");
            h.append(this.f8902c);
            h.append("'. Clearing ");
            return C0023f.m110k(h, this.f8903d, " storage.");
        }
    }

    /* renamed from: a */
    public static /* synthetic */ SharedPreferences m9151a(Context context, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = Constants.APPBOY_SDK_VERSION;
        }
        return m9150a(context, str, str2);
    }

    /* renamed from: a */
    public static final SharedPreferences m9150a(Context context, String str, String str2) {
        C19383o.m32797g(context, "<this>");
        C19383o.m32797g(str, "prefsFilename");
        C19383o.m32797g(str2, "currentSdkVersion");
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        String string = sharedPreferences.getString("last_accessed_sdk_version", "");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (!C19383o.m32792b(str2, string)) {
            BrazeLogger.m11283e(f8900a, BrazeLogger.Priority.V, (Throwable) null, new C3966a(string, str2, str), 12);
            edit.clear().apply();
        }
        edit.putString("last_accessed_sdk_version", str2).apply();
        return sharedPreferences;
    }
}
