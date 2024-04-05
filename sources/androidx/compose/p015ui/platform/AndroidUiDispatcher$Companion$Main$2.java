package androidx.compose.p015ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.internal.C19729m;
import p002a1.C0009c;
import p753kq.C19846a;
import p768rq.C20153b;

/* renamed from: androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2 */
public final class AndroidUiDispatcher$Companion$Main$2 extends Lambda implements C19846a<CoroutineContext> {
    public static final AndroidUiDispatcher$Companion$Main$2 INSTANCE = new AndroidUiDispatcher$Companion$Main$2();

    public AndroidUiDispatcher$Companion$Main$2() {
        super(0);
    }

    public final CoroutineContext invoke() {
        Choreographer choreographer;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            choreographer = Choreographer.getInstance();
        } else {
            C20153b bVar = C19760n0.f43719a;
            choreographer = (Choreographer) C19697g.m33469g(C19729m.f43681a, new AndroidUiDispatcher$Companion$Main$2$dispatcher$1((C19340c<? super AndroidUiDispatcher$Companion$Main$2$dispatcher$1>) null));
        }
        C19383o.m32796f(choreographer, "if (isMainThread()) Chor…eographer.getInstance() }");
        Handler a = C0009c.m83a(Looper.getMainLooper());
        C19383o.m32796f(a, "createAsync(Looper.getMainLooper())");
        AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, a);
        return androidUiDispatcher.plus(androidUiDispatcher.f4010l);
    }
}
