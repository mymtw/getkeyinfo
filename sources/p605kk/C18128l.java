package p605kk;

import java.util.concurrent.CountDownLatch;

/* renamed from: kk.l */
public final class C18128l implements C18121e, C18120d, C18118b {

    /* renamed from: b */
    public final CountDownLatch f39570b = new CountDownLatch(1);

    /* renamed from: a */
    public final void mo414a(Exception exc) {
        this.f39570b.countDown();
    }

    /* renamed from: b */
    public final void mo69676b() {
        this.f39570b.countDown();
    }

    public final void onSuccess(Object obj) {
        this.f39570b.countDown();
    }
}
