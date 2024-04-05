package p689ul;

import java.util.concurrent.CountDownLatch;

/* renamed from: ul.p */
public final class C18618p implements C18605c, C18604b {

    /* renamed from: b */
    public final CountDownLatch f41111b = new CountDownLatch(1);

    /* renamed from: a */
    public final void mo46667a(Exception exc) {
        this.f41111b.countDown();
    }

    public final void onSuccess(Object obj) {
        this.f41111b.countDown();
    }
}
