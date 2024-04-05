package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.compose.p015ui.platform.C1864q;
import androidx.emoji2.text.C2665e;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p021b1.C3454d;
import p021b1.C3456e;
import p021b1.C3463k;
import p021b1.C3464l;

/* renamed from: androidx.emoji2.text.j */
public final class C2684j extends C2665e.C2668c {

    /* renamed from: d */
    public static final C2685a f6048d = new C2685a();

    /* renamed from: androidx.emoji2.text.j$a */
    public static class C2685a {
    }

    /* renamed from: androidx.emoji2.text.j$b */
    public static class C2686b implements C2665e.C2672g {

        /* renamed from: a */
        public final Context f6049a;

        /* renamed from: b */
        public final C3456e f6050b;

        /* renamed from: c */
        public final C2685a f6051c;

        /* renamed from: d */
        public final Object f6052d = new Object();

        /* renamed from: e */
        public Handler f6053e;

        /* renamed from: f */
        public Executor f6054f;

        /* renamed from: g */
        public ThreadPoolExecutor f6055g;

        /* renamed from: h */
        public C2665e.C2673h f6056h;

        public C2686b(Context context, C3456e eVar) {
            C2685a aVar = C2684j.f6048d;
            if (context != null) {
                this.f6049a = context.getApplicationContext();
                this.f6050b = eVar;
                this.f6051c = aVar;
                return;
            }
            throw new NullPointerException("Context cannot be null");
        }

        /* renamed from: a */
        public final void mo10026a(C2665e.C2673h hVar) {
            synchronized (this.f6052d) {
                this.f6056h = hVar;
            }
            mo10084c();
        }

        /* renamed from: b */
        public final void mo10083b() {
            synchronized (this.f6052d) {
                this.f6056h = null;
                Handler handler = this.f6053e;
                if (handler != null) {
                    handler.removeCallbacks((Runnable) null);
                }
                this.f6053e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f6055g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f6054f = null;
                this.f6055g = null;
            }
        }

        /* renamed from: c */
        public final void mo10084c() {
            synchronized (this.f6052d) {
                if (this.f6056h != null) {
                    if (this.f6054f == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new C2658a("emojiCompat"));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        this.f6055g = threadPoolExecutor;
                        this.f6054f = threadPoolExecutor;
                    }
                    this.f6054f.execute(new C1864q(this, 1));
                }
            }
        }

        /* renamed from: d */
        public final C3464l mo10085d() {
            try {
                C2685a aVar = this.f6051c;
                Context context = this.f6049a;
                C3456e eVar = this.f6050b;
                aVar.getClass();
                C3463k a = C3454d.m8291a(context, eVar);
                if (a.f8077a == 0) {
                    C3464l[] lVarArr = a.f8078b;
                    if (lVarArr != null && lVarArr.length != 0) {
                        return lVarArr[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException(C0071c.m191c(C0072d.m201h("fetchFonts failed ("), a.f8077a, ")"));
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }
    }

    public C2684j(Context context, C3456e eVar) {
        super(new C2686b(context, eVar));
    }
}
