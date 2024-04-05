package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class ModernAsyncTask<Params, Progress, Result> {

    /* renamed from: g */
    public static final ThreadPoolExecutor f6534g;

    /* renamed from: h */
    public static C2902f f6535h;

    /* renamed from: b */
    public final C2898b f6536b;

    /* renamed from: c */
    public final C2899c f6537c;

    /* renamed from: d */
    public volatile Status f6538d = Status.PENDING;

    /* renamed from: e */
    public final AtomicBoolean f6539e = new AtomicBoolean();

    /* renamed from: f */
    public final AtomicBoolean f6540f = new AtomicBoolean();

    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$a */
    public static class C2897a implements ThreadFactory {

        /* renamed from: b */
        public final AtomicInteger f6541b = new AtomicInteger(1);

        public final Thread newThread(Runnable runnable) {
            StringBuilder h = C0072d.m201h("ModernAsyncTask #");
            h.append(this.f6541b.getAndIncrement());
            return new Thread(runnable, h.toString());
        }
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$b */
    public class C2898b extends C2903g<Params, Result> {
        public C2898b() {
        }

        public final Result call() throws Exception {
            ModernAsyncTask.this.f6540f.set(true);
            try {
                Process.setThreadPriority(10);
                ModernAsyncTask.this.mo10847a(this.f6547b);
                Binder.flushPendingCommands();
                ModernAsyncTask.this.mo10850d((Object) null);
                return null;
            } catch (Throwable th) {
                ModernAsyncTask.this.mo10850d((Object) null);
                throw th;
            }
        }
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$c */
    public class C2899c extends FutureTask<Result> {
        public C2899c(C2898b bVar) {
            super(bVar);
        }

        public final void done() {
            try {
                Object obj = get();
                ModernAsyncTask modernAsyncTask = ModernAsyncTask.this;
                if (!modernAsyncTask.f6540f.get()) {
                    modernAsyncTask.mo10850d(obj);
                }
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (CancellationException unused) {
                ModernAsyncTask modernAsyncTask2 = ModernAsyncTask.this;
                if (!modernAsyncTask2.f6540f.get()) {
                    modernAsyncTask2.mo10850d((Object) null);
                }
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$d */
    public static /* synthetic */ class C2900d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6544a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.loader.content.ModernAsyncTask$Status[] r0 = androidx.loader.content.ModernAsyncTask.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6544a = r0
                androidx.loader.content.ModernAsyncTask$Status r1 = androidx.loader.content.ModernAsyncTask.Status.RUNNING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6544a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.loader.content.ModernAsyncTask$Status r1 = androidx.loader.content.ModernAsyncTask.Status.FINISHED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.loader.content.ModernAsyncTask.C2900d.<clinit>():void");
        }
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$e */
    public static class C2901e<Data> {

        /* renamed from: a */
        public final ModernAsyncTask f6545a;

        /* renamed from: b */
        public final Data[] f6546b;

        public C2901e(ModernAsyncTask modernAsyncTask, Data... dataArr) {
            this.f6545a = modernAsyncTask;
            this.f6546b = dataArr;
        }
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$f */
    public static class C2902f extends Handler {
        public C2902f() {
            super(Looper.getMainLooper());
        }

        public final void handleMessage(Message message) {
            C2901e eVar = (C2901e) message.obj;
            int i = message.what;
            if (i == 1) {
                ModernAsyncTask modernAsyncTask = eVar.f6545a;
                Data data = eVar.f6546b[0];
                if (modernAsyncTask.f6539e.get()) {
                    modernAsyncTask.mo10848b(data);
                } else {
                    modernAsyncTask.mo10849c(data);
                }
                modernAsyncTask.f6538d = Status.FINISHED;
            } else if (i == 2) {
                eVar.f6545a.getClass();
            }
        }
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$g */
    public static abstract class C2903g<Params, Result> implements Callable<Result> {

        /* renamed from: b */
        public Params[] f6547b;
    }

    static {
        C2897a aVar = new C2897a();
        f6534g = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, new LinkedBlockingQueue(10), aVar);
    }

    public ModernAsyncTask() {
        C2898b bVar = new C2898b();
        this.f6536b = bVar;
        this.f6537c = new C2899c(bVar);
    }

    /* renamed from: a */
    public abstract void mo10847a(Object... objArr);

    /* renamed from: b */
    public void mo10848b(Result result) {
    }

    /* renamed from: c */
    public void mo10849c(Result result) {
    }

    /* renamed from: d */
    public final void mo10850d(Object obj) {
        C2902f fVar;
        synchronized (ModernAsyncTask.class) {
            if (f6535h == null) {
                f6535h = new C2902f();
            }
            fVar = f6535h;
        }
        fVar.obtainMessage(1, new C2901e(this, obj)).sendToTarget();
    }
}
