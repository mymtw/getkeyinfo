package androidx.compose.p015ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.C19394m;
import kotlin.collections.C19316i;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.CoroutineDispatcher;
import p002a1.C0009c;

/* renamed from: androidx.compose.ui.platform.AndroidUiDispatcher */
public final class AndroidUiDispatcher extends CoroutineDispatcher {

    /* renamed from: m */
    public static final C19285c<CoroutineContext> f3999m = C19350d.m32677b(AndroidUiDispatcher$Companion$Main$2.INSTANCE);

    /* renamed from: n */
    public static final C1784a f4000n = new C1784a();

    /* renamed from: c */
    public final Choreographer f4001c;

    /* renamed from: d */
    public final Handler f4002d;

    /* renamed from: e */
    public final Object f4003e = new Object();

    /* renamed from: f */
    public final C19316i<Runnable> f4004f = new C19316i<>();

    /* renamed from: g */
    public List<Choreographer.FrameCallback> f4005g = new ArrayList();

    /* renamed from: h */
    public List<Choreographer.FrameCallback> f4006h = new ArrayList();

    /* renamed from: i */
    public boolean f4007i;

    /* renamed from: j */
    public boolean f4008j;

    /* renamed from: k */
    public final AndroidUiDispatcher$dispatchCallback$1 f4009k = new AndroidUiDispatcher$dispatchCallback$1(this);

    /* renamed from: l */
    public final AndroidUiFrameClock f4010l;

    /* renamed from: androidx.compose.ui.platform.AndroidUiDispatcher$a */
    public static final class C1784a extends ThreadLocal<CoroutineContext> {
        public final Object initialValue() {
            Choreographer instance = Choreographer.getInstance();
            C19383o.m32796f(instance, "getInstance()");
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                Handler a = C0009c.m83a(myLooper);
                C19383o.m32796f(a, "createAsync(\n           …d\")\n                    )");
                AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(instance, a);
                return androidUiDispatcher.plus(androidUiDispatcher.f4010l);
            }
            throw new IllegalStateException("no Looper on this thread".toString());
        }
    }

    public AndroidUiDispatcher(Choreographer choreographer, Handler handler) {
        this.f4001c = choreographer;
        this.f4002d = handler;
        this.f4010l = new AndroidUiFrameClock(choreographer);
    }

    /* renamed from: E0 */
    public static final void m3936E0(AndroidUiDispatcher androidUiDispatcher) {
        Runnable removeFirst;
        boolean z;
        do {
            synchronized (androidUiDispatcher.f4003e) {
                C19316i<Runnable> iVar = androidUiDispatcher.f4004f;
                removeFirst = iVar.isEmpty() ? null : iVar.removeFirst();
            }
            while (removeFirst != null) {
                removeFirst.run();
                synchronized (androidUiDispatcher.f4003e) {
                    C19316i<Runnable> iVar2 = androidUiDispatcher.f4004f;
                    removeFirst = iVar2.isEmpty() ? null : iVar2.removeFirst();
                }
            }
            synchronized (androidUiDispatcher.f4003e) {
                z = false;
                if (androidUiDispatcher.f4004f.isEmpty()) {
                    androidUiDispatcher.f4007i = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    /* renamed from: A0 */
    public final void mo7108A0(CoroutineContext coroutineContext, Runnable runnable) {
        C19383o.m32797g(coroutineContext, ResponseConstants.CONTEXT);
        C19383o.m32797g(runnable, "block");
        synchronized (this.f4003e) {
            this.f4004f.addLast(runnable);
            if (!this.f4007i) {
                this.f4007i = true;
                this.f4002d.post(this.f4009k);
                if (!this.f4008j) {
                    this.f4008j = true;
                    this.f4001c.postFrameCallback(this.f4009k);
                }
            }
            C19394m mVar = C19394m.f43287a;
        }
    }
}
