package androidx.profileinstaller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import p136i2.C6984b;

public class ProfileInstallerInitializer implements C6984b<C3055c> {

    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$a */
    public static class C3053a {
        /* renamed from: a */
        public static void m7219a(Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new C3070l(runnable));
        }
    }

    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$b */
    public static class C3054b {
        /* renamed from: a */
        public static Handler m7220a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$c */
    public static class C3055c {
    }

    /* renamed from: a */
    public final List<Class<? extends C6984b<?>>> mo10023a() {
        return Collections.emptyList();
    }

    public final Object create(Context context) {
        C3053a.m7219a(new C3067i(0, this, context.getApplicationContext()));
        return new C3055c();
    }
}
