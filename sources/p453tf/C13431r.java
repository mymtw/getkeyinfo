package p453tf;

import android.content.SharedPreferences;
import kotlin.jvm.internal.C19383o;

/* renamed from: tf.r */
public final class C13431r {

    /* renamed from: a */
    public final SharedPreferences f29416a;

    public C13431r() {
        SharedPreferences sharedPreferences = C13418j.m21106b().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        C19383o.m32796f(sharedPreferences, "FacebookSdk.getApplicati…ME, Context.MODE_PRIVATE)");
        this.f29416a = sharedPreferences;
    }
}
