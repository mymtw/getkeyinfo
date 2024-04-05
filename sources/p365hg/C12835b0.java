package p365hg;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import p453tf.C13418j;

/* renamed from: hg.b0 */
public final class C12835b0<T> {

    /* renamed from: a */
    public T f28330a;

    /* renamed from: b */
    public CountDownLatch f28331b = new CountDownLatch(1);

    public C12835b0() {
        C13418j.m21108d().execute(new FutureTask(new C12830a0(this)));
    }
}
