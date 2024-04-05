package com.google.android.exoplayer2.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p513bj.C14047a0;
import p513bj.C14049b0;
import p513bj.C14075p;

public final class Loader {

    /* renamed from: d */
    public static final C14425b f32488d = new C14425b(0, -9223372036854775807L);

    /* renamed from: e */
    public static final C14425b f32489e = new C14425b(2, -9223372036854775807L);

    /* renamed from: f */
    public static final C14425b f32490f = new C14425b(3, -9223372036854775807L);

    /* renamed from: a */
    public final ExecutorService f32491a;

    /* renamed from: b */
    public C14426c<? extends C14427d> f32492b;

    /* renamed from: c */
    public IOException f32493c;

    public static final class UnexpectedLoaderException extends IOException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public UnexpectedLoaderException(java.lang.Throwable r5) {
            /*
                r4 = this;
                java.lang.Class r0 = r5.getClass()
                java.lang.String r0 = r0.getSimpleName()
                java.lang.String r1 = r5.getMessage()
                int r2 = r0.length()
                int r2 = r2 + 13
                int r2 = androidx.compose.animation.C0391c.m1055a(r1, r2)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r2)
                java.lang.String r2 = "Unexpected "
                r3.append(r2)
                r3.append(r0)
                java.lang.String r0 = ": "
                r3.append(r0)
                r3.append(r1)
                java.lang.String r0 = r3.toString()
                r4.<init>(r0, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.Loader.UnexpectedLoaderException.<init>(java.lang.Throwable):void");
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.Loader$a */
    public interface C14424a<T extends C14427d> {
        /* renamed from: g */
        void mo47744g(T t, long j, long j2, boolean z);

        /* renamed from: h */
        void mo47745h(T t, long j, long j2);

        /* renamed from: m */
        C14425b mo47746m(T t, long j, long j2, IOException iOException, int i);
    }

    /* renamed from: com.google.android.exoplayer2.upstream.Loader$b */
    public static final class C14425b {

        /* renamed from: a */
        public final int f32494a;

        /* renamed from: b */
        public final long f32495b;

        public C14425b(int i, long j) {
            this.f32494a = i;
            this.f32495b = j;
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.exoplayer2.upstream.Loader$c */
    public final class C14426c<T extends C14427d> extends Handler implements Runnable {

        /* renamed from: b */
        public final int f32496b;

        /* renamed from: c */
        public final T f32497c;

        /* renamed from: d */
        public final long f32498d;

        /* renamed from: e */
        public C14424a<T> f32499e;

        /* renamed from: f */
        public IOException f32500f;

        /* renamed from: g */
        public int f32501g;

        /* renamed from: h */
        public Thread f32502h;

        /* renamed from: i */
        public boolean f32503i;

        /* renamed from: j */
        public volatile boolean f32504j;

        public C14426c(Looper looper, T t, C14424a<T> aVar, int i, long j) {
            super(looper);
            this.f32497c = t;
            this.f32499e = aVar;
            this.f32496b = i;
            this.f32498d = j;
        }

        /* renamed from: a */
        public final void mo48167a(boolean z) {
            this.f32504j = z;
            this.f32500f = null;
            if (hasMessages(0)) {
                this.f32503i = true;
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f32503i = true;
                    this.f32497c.mo47728b();
                    Thread thread = this.f32502h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z) {
                Loader.this.f32492b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C14424a<T> aVar = this.f32499e;
                aVar.getClass();
                aVar.mo47744g(this.f32497c, elapsedRealtime, elapsedRealtime - this.f32498d, true);
                this.f32499e = null;
            }
        }

        /* renamed from: b */
        public final void mo48168b(long j) {
            C14075p.m21694f(Loader.this.f32492b == null);
            Loader loader = Loader.this;
            loader.f32492b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
                return;
            }
            this.f32500f = null;
            loader.f32491a.execute(this);
        }

        public final void handleMessage(Message message) {
            if (!this.f32504j) {
                int i = message.what;
                if (i == 0) {
                    this.f32500f = null;
                    Loader loader = Loader.this;
                    ExecutorService executorService = loader.f32491a;
                    C14426c<? extends C14427d> cVar = loader.f32492b;
                    cVar.getClass();
                    executorService.execute(cVar);
                } else if (i != 3) {
                    Loader.this.f32492b = null;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = elapsedRealtime - this.f32498d;
                    C14424a<T> aVar = this.f32499e;
                    aVar.getClass();
                    if (this.f32503i) {
                        aVar.mo47744g(this.f32497c, elapsedRealtime, j, false);
                        return;
                    }
                    int i2 = message.what;
                    if (i2 == 1) {
                        try {
                            aVar.mo47745h(this.f32497c, elapsedRealtime, j);
                        } catch (RuntimeException e) {
                            C14075p.m21698j("LoadTask", "Unexpected exception handling load completed", e);
                            Loader.this.f32493c = new UnexpectedLoaderException(e);
                        }
                    } else if (i2 == 2) {
                        IOException iOException = (IOException) message.obj;
                        this.f32500f = iOException;
                        int i3 = this.f32501g + 1;
                        this.f32501g = i3;
                        C14425b m = aVar.mo47746m(this.f32497c, elapsedRealtime, j, iOException, i3);
                        int i4 = m.f32494a;
                        if (i4 == 3) {
                            Loader.this.f32493c = this.f32500f;
                        } else if (i4 != 2) {
                            if (i4 == 1) {
                                this.f32501g = 1;
                            }
                            long j2 = m.f32495b;
                            if (j2 == -9223372036854775807L) {
                                j2 = (long) Math.min((this.f32501g - 1) * 1000, 5000);
                            }
                            mo48168b(j2);
                        }
                    }
                } else {
                    throw ((Error) message.obj);
                }
            }
        }

        public final void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = !this.f32503i;
                    this.f32502h = Thread.currentThread();
                }
                if (z) {
                    String simpleName = this.f32497c.getClass().getSimpleName();
                    C14075p.m21690b(simpleName.length() != 0 ? "load:".concat(simpleName) : new String("load:"));
                    this.f32497c.mo47727a();
                    C14075p.m21699k();
                }
                synchronized (this) {
                    this.f32502h = null;
                    Thread.interrupted();
                }
                if (!this.f32504j) {
                    sendEmptyMessage(1);
                }
            } catch (IOException e) {
                if (!this.f32504j) {
                    obtainMessage(2, e).sendToTarget();
                }
            } catch (Exception e2) {
                if (!this.f32504j) {
                    C14075p.m21698j("LoadTask", "Unexpected exception loading stream", e2);
                    obtainMessage(2, new UnexpectedLoaderException(e2)).sendToTarget();
                }
            } catch (OutOfMemoryError e3) {
                if (!this.f32504j) {
                    C14075p.m21698j("LoadTask", "OutOfMemory error loading stream", e3);
                    obtainMessage(2, new UnexpectedLoaderException(e3)).sendToTarget();
                }
            } catch (Error e4) {
                if (!this.f32504j) {
                    C14075p.m21698j("LoadTask", "Unexpected error loading stream", e4);
                    obtainMessage(3, e4).sendToTarget();
                }
                throw e4;
            } catch (Throwable th) {
                C14075p.m21699k();
                throw th;
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.Loader$d */
    public interface C14427d {
        /* renamed from: a */
        void mo47727a() throws IOException;

        /* renamed from: b */
        void mo47728b();
    }

    /* renamed from: com.google.android.exoplayer2.upstream.Loader$e */
    public interface C14428e {
        /* renamed from: n */
        void mo47747n();
    }

    /* renamed from: com.google.android.exoplayer2.upstream.Loader$f */
    public static final class C14429f implements Runnable {

        /* renamed from: b */
        public final C14428e f32506b;

        public C14429f(C14428e eVar) {
            this.f32506b = eVar;
        }

        public final void run() {
            this.f32506b.mo47747n();
        }
    }

    public Loader(String str) {
        String concat = str.length() != 0 ? "ExoPlayer:Loader:".concat(str) : new String("ExoPlayer:Loader:");
        int i = C14049b0.f30913a;
        this.f32491a = Executors.newSingleThreadExecutor(new C14047a0(concat));
    }

    /* renamed from: a */
    public final void mo48163a() {
        C14426c<? extends C14427d> cVar = this.f32492b;
        C14075p.m21696h(cVar);
        cVar.mo48167a(false);
    }

    /* renamed from: b */
    public final boolean mo48164b() {
        return this.f32492b != null;
    }

    /* renamed from: c */
    public final void mo48165c(C14428e eVar) {
        C14426c<? extends C14427d> cVar = this.f32492b;
        if (cVar != null) {
            cVar.mo48167a(true);
        }
        if (eVar != null) {
            this.f32491a.execute(new C14429f(eVar));
        }
        this.f32491a.shutdown();
    }

    /* renamed from: d */
    public final <T extends C14427d> long mo48166d(T t, C14424a<T> aVar, int i) {
        Looper myLooper = Looper.myLooper();
        C14075p.m21696h(myLooper);
        this.f32493c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new C14426c(myLooper, t, aVar, i, elapsedRealtime).mo48168b(0);
        return elapsedRealtime;
    }
}
