package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.foundation.layout.C0761x;
import kotlin.Result;

/* renamed from: kotlinx.coroutines.android.e */
public final class C19472e {

    /* renamed from: a */
    public static final /* synthetic */ int f43408a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        try {
            obj = Result.m35480constructorimpl(new C19470c(m33091a(Looper.getMainLooper())));
        } catch (Throwable th) {
            obj = Result.m35480constructorimpl(C0761x.m1673J(th));
        }
        if (Result.m35485isFailureimpl(obj)) {
            obj = null;
        }
        C19471d dVar = (C19471d) obj;
    }

    /* renamed from: a */
    public static final Handler m33091a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
            if (invoke != null) {
                return (Handler) invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
