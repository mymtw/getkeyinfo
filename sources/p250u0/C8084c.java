package p250u0;

import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: u0.c */
public final class C8084c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Object f17611b;

    /* renamed from: c */
    public final /* synthetic */ Object f17612c;

    public C8084c(Object obj, Object obj2) {
        this.f17611b = obj;
        this.f17612c = obj2;
    }

    public final void run() {
        try {
            Method method = C8080b.f17597d;
            if (method != null) {
                method.invoke(this.f17611b, new Object[]{this.f17612c, Boolean.FALSE, "AppCompat recreation"});
                return;
            }
            C8080b.f17598e.invoke(this.f17611b, new Object[]{this.f17612c, Boolean.FALSE});
        } catch (RuntimeException e) {
            if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                throw e;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}
