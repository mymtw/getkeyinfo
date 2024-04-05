package p269vp;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.EmptyDisposable;
import p248tp.C8066r;
import p736cq.C18981a;

/* renamed from: vp.b */
public final class C8224b extends C8066r {

    /* renamed from: d */
    public final Handler f18051d;

    /* renamed from: e */
    public final boolean f18052e;

    /* renamed from: vp.b$a */
    public static final class C8225a extends C8066r.C8069c {

        /* renamed from: b */
        public final Handler f18053b;

        /* renamed from: c */
        public final boolean f18054c;

        /* renamed from: d */
        public volatile boolean f18055d;

        public C8225a(Handler handler, boolean z) {
            this.f18053b = handler;
            this.f18054c = z;
        }

        @SuppressLint({"NewApi"})
        /* renamed from: b */
        public final Disposable mo20653b(Runnable runnable, long j, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            } else if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            } else if (this.f18055d) {
                return EmptyDisposable.INSTANCE;
            } else {
                Handler handler = this.f18053b;
                C8226b bVar = new C8226b(handler, runnable);
                Message obtain = Message.obtain(handler, bVar);
                obtain.obj = this;
                if (this.f18054c) {
                    obtain.setAsynchronous(true);
                }
                this.f18053b.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                if (!this.f18055d) {
                    return bVar;
                }
                this.f18053b.removeCallbacks(bVar);
                return EmptyDisposable.INSTANCE;
            }
        }

        public final void dispose() {
            this.f18055d = true;
            this.f18053b.removeCallbacksAndMessages(this);
        }

        public final boolean isDisposed() {
            return this.f18055d;
        }
    }

    /* renamed from: vp.b$b */
    public static final class C8226b implements Runnable, Disposable {

        /* renamed from: b */
        public final Handler f18056b;

        /* renamed from: c */
        public final Runnable f18057c;

        /* renamed from: d */
        public volatile boolean f18058d;

        public C8226b(Handler handler, Runnable runnable) {
            this.f18056b = handler;
            this.f18057c = runnable;
        }

        public final void dispose() {
            this.f18056b.removeCallbacks(this);
            this.f18058d = true;
        }

        public final boolean isDisposed() {
            return this.f18058d;
        }

        public final void run() {
            try {
                this.f18057c.run();
            } catch (Throwable th) {
                C18981a.m32123b(th);
            }
        }
    }

    public C8224b(Handler handler, boolean z) {
        this.f18051d = handler;
        this.f18052e = z;
    }

    /* renamed from: b */
    public final C8066r.C8069c mo20646b() {
        return new C8225a(this.f18051d, this.f18052e);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public final Disposable mo20648d(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        } else if (timeUnit != null) {
            Handler handler = this.f18051d;
            C8226b bVar = new C8226b(handler, runnable);
            Message obtain = Message.obtain(handler, bVar);
            if (this.f18052e) {
                obtain.setAsynchronous(true);
            }
            this.f18051d.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            return bVar;
        } else {
            throw new NullPointerException("unit == null");
        }
    }
}
