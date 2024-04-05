package androidx.work;

import android.content.Context;
import androidx.appcompat.widget.C0326j;

/* renamed from: androidx.work.u */
public abstract class C3442u {

    /* renamed from: a */
    public static final String f8046a = C3422l.m8214e("WorkerFactory");

    /* renamed from: a */
    public final ListenableWorker mo12968a(Context context, String str, WorkerParameters workerParameters) {
        Class<? extends U> cls;
        ListenableWorker listenableWorker = null;
        try {
            cls = Class.forName(str).asSubclass(ListenableWorker.class);
        } catch (Throwable th) {
            C3422l.m8213c().mo12927b(f8046a, C0326j.m864i("Invalid class: ", str), th);
            cls = null;
        }
        if (cls != null) {
            try {
                listenableWorker = (ListenableWorker) cls.getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
            } catch (Throwable th2) {
                C3422l.m8213c().mo12927b(f8046a, C0326j.m864i("Could not instantiate ", str), th2);
            }
        }
        if (listenableWorker == null || !listenableWorker.f7856e) {
            return listenableWorker;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", new Object[]{getClass().getName(), str}));
    }
}
