package p425q9;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.util.C8890e0;
import kotlin.jvm.internal.C19383o;
import p366ia.C12920a;

/* renamed from: q9.q */
public final class C13267q {

    /* renamed from: a */
    public final C8890e0 f29155a;

    /* renamed from: b */
    public final C12920a f29156b;

    /* renamed from: c */
    public long f29157c = -1;

    /* renamed from: d */
    public long f29158d = -1;

    /* renamed from: e */
    public long f29159e = -1;

    /* renamed from: f */
    public SharedPreferences f29160f;

    public C13267q(Context context, C8890e0 e0Var, C12920a aVar) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(e0Var, "systemTime");
        C19383o.m32797g(aVar, "loggingEligibility");
        this.f29155a = e0Var;
        this.f29156b = aVar;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        C19383o.m32796f(defaultSharedPreferences, "getDefaultSharedPreferences(context)");
        this.f29160f = defaultSharedPreferences;
        this.f29158d = defaultSharedPreferences.getLong("app_start_time", -1);
        this.f29159e = this.f29160f.getLong("app_foreground_time", -1);
        this.f29157c = this.f29160f.getLong("app_inital_start_time", System.currentTimeMillis());
        if (!this.f29160f.contains("app_inital_start_time")) {
            SharedPreferences.Editor edit = this.f29160f.edit();
            C19383o.m32796f(edit, "editor");
            edit.putLong("app_inital_start_time", this.f29157c);
            edit.apply();
        }
    }
}
