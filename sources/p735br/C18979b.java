package p735br;

import java.util.concurrent.ThreadFactory;

/* renamed from: br.b */
public final class C18979b implements ThreadFactory {

    /* renamed from: b */
    public final /* synthetic */ String f42299b;

    /* renamed from: c */
    public final /* synthetic */ boolean f42300c;

    public C18979b(String str, boolean z) {
        this.f42299b = str;
        this.f42300c = z;
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f42299b);
        thread.setDaemon(this.f42300c);
        return thread;
    }
}
