package p513bj;

import java.util.concurrent.ThreadFactory;

/* renamed from: bj.a0 */
public final /* synthetic */ class C14047a0 implements ThreadFactory {

    /* renamed from: b */
    public final /* synthetic */ String f30908b;

    public /* synthetic */ C14047a0(String str) {
        this.f30908b = str;
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f30908b);
    }
}
