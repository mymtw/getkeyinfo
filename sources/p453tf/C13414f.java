package p453tf;

import android.content.SharedPreferences;
import kotlin.jvm.internal.C19383o;

/* renamed from: tf.f */
public final class C13414f {

    /* renamed from: a */
    public final SharedPreferences f29379a;

    public C13414f() {
        SharedPreferences sharedPreferences = C13418j.m21106b().getSharedPreferences("com.facebook.AuthenticationTokenManager.SharedPreferences", 0);
        C19383o.m32796f(sharedPreferences, "FacebookSdk.getApplicati…ME, Context.MODE_PRIVATE)");
        this.f29379a = sharedPreferences;
    }
}
