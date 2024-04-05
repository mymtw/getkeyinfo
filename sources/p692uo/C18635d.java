package p692uo;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import p156k.C7167d;

/* renamed from: uo.d */
public final class C18635d {

    /* renamed from: a */
    public final WeakReference<Context> f41150a;

    /* renamed from: b */
    public final AtomicReference<C7167d> f41151b = new AtomicReference<>();

    /* renamed from: c */
    public final CountDownLatch f41152c = new CountDownLatch(1);

    /* renamed from: d */
    public C18634c f41153d;

    public C18635d(Context context) {
        this.f41150a = new WeakReference<>(context);
    }
}
