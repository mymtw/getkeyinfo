package p453tf;

import android.content.Context;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C19383o;

/* renamed from: tf.l */
public final class C13422l<V> implements Callable {

    /* renamed from: b */
    public static final C13422l f29407b = new C13422l();

    public final Object call() {
        Context context = C13418j.f29391k;
        if (context != null) {
            return context.getCacheDir();
        }
        C19383o.m32805o("applicationContext");
        throw null;
    }
}
