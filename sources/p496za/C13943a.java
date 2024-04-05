package p496za;

import android.content.Context;
import android.content.SharedPreferences;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

/* renamed from: za.a */
public final class C13943a {

    /* renamed from: a */
    public final Context f30662a;

    public C13943a(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this.f30662a = context;
    }

    /* renamed from: a */
    public final SharedPreferences mo46761a() {
        SharedPreferences sharedPreferences = this.f30662a.getSharedPreferences("EtsyUserPrefs", 0);
        C19383o.m32796f(sharedPreferences, "context.getSharedPrefere…    Context.MODE_PRIVATE)");
        return sharedPreferences;
    }
}
