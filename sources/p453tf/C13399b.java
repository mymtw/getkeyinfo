package p453tf;

import android.content.SharedPreferences;
import kotlin.jvm.internal.C19383o;

/* renamed from: tf.b */
public final class C13399b {

    /* renamed from: a */
    public final SharedPreferences f29347a;

    /* renamed from: tf.b$a */
    public static final class C13400a {
    }

    public C13399b() {
        SharedPreferences sharedPreferences = C13418j.m21106b().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        C19383o.m32796f(sharedPreferences, "FacebookSdk.getApplicati…ME, Context.MODE_PRIVATE)");
        new C13400a();
        this.f29347a = sharedPreferences;
    }
}
