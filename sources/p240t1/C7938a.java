package p240t1;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.p016os.OperationCanceledException;
import androidx.loader.content.Loader;
import androidx.loader.content.ModernAsyncTask;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p230s1.C7798b;
import p588ij.C17843b;

/* renamed from: t1.a */
public abstract class C7938a<D> extends Loader<D> {

    /* renamed from: g */
    public final Executor f17405g;

    /* renamed from: h */
    public volatile C7938a<D>.a f17406h;

    /* renamed from: i */
    public volatile C7938a<D>.a f17407i;

    /* renamed from: t1.a$a */
    public final class C7939a extends ModernAsyncTask<Void, Void, D> implements Runnable {

        /* renamed from: i */
        public final CountDownLatch f17408i = new CountDownLatch(1);

        public C7939a() {
        }

        /* renamed from: a */
        public final void mo10847a(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            try {
                C7938a.this.mo20478c();
            } catch (OperationCanceledException e) {
                if (!this.f6539e.get()) {
                    throw e;
                }
            }
        }

        /* renamed from: b */
        public final void mo10848b(D d) {
            try {
                C7938a aVar = C7938a.this;
                if (aVar.f17407i == this) {
                    SystemClock.uptimeMillis();
                    aVar.f17407i = null;
                    aVar.mo20477b();
                }
            } finally {
                this.f17408i.countDown();
            }
        }

        /* renamed from: c */
        public final void mo10849c(D d) {
            try {
                C7938a aVar = C7938a.this;
                if (aVar.f17406h != this) {
                    if (aVar.f17407i == this) {
                        SystemClock.uptimeMillis();
                        aVar.f17407i = null;
                        aVar.mo20477b();
                    }
                } else if (!aVar.f6531d) {
                    SystemClock.uptimeMillis();
                    aVar.f17406h = null;
                    Loader.C2896a<D> aVar2 = aVar.f6529b;
                    if (aVar2 != null) {
                        C7798b.C7799a aVar3 = (C7798b.C7799a) aVar2;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            aVar3.setValue(d);
                        } else {
                            aVar3.postValue(d);
                        }
                    }
                }
            } finally {
                this.f17408i.countDown();
            }
        }

        public final void run() {
            C7938a.this.mo20477b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7938a(Context context) {
        super(context);
        ThreadPoolExecutor threadPoolExecutor = ModernAsyncTask.f6534g;
        this.f17405g = threadPoolExecutor;
    }

    /* renamed from: b */
    public final void mo20477b() {
        if (this.f17407i == null && this.f17406h != null) {
            this.f17406h.getClass();
            C7938a<D>.a aVar = this.f17406h;
            Executor executor = this.f17405g;
            if (aVar.f6538d != ModernAsyncTask.Status.PENDING) {
                int i = ModernAsyncTask.C2900d.f6544a[aVar.f6538d.ordinal()];
                if (i == 1) {
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                } else if (i != 2) {
                    throw new IllegalStateException("We should never reach this state");
                } else {
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
            } else {
                aVar.f6538d = ModernAsyncTask.Status.RUNNING;
                aVar.f6536b.f6547b = null;
                executor.execute(aVar.f6537c);
            }
        }
    }

    /* renamed from: c */
    public final void mo20478c() {
        C17843b bVar = (C17843b) this;
        int i = 0;
        for (GoogleApiClient maybeSignIn : bVar.f38758k) {
            if (maybeSignIn.maybeSignIn(bVar)) {
                i++;
            }
        }
        try {
            bVar.f38757j.tryAcquire(i, 5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
        }
    }
}
