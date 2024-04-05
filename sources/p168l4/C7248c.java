package p168l4;

import androidx.activity.C0114h;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: l4.c */
public final class C7248c {

    /* renamed from: a */
    public final HashMap f16093a = new HashMap();

    /* renamed from: b */
    public final C7250b f16094b = new C7250b();

    /* renamed from: l4.c$a */
    public static class C7249a {

        /* renamed from: a */
        public final ReentrantLock f16095a = new ReentrantLock();

        /* renamed from: b */
        public int f16096b;
    }

    /* renamed from: l4.c$b */
    public static class C7250b {

        /* renamed from: a */
        public final ArrayDeque f16097a = new ArrayDeque();
    }

    /* renamed from: a */
    public final void mo19518a(String str) {
        C7249a aVar;
        synchronized (this) {
            Object obj = this.f16093a.get(str);
            C0114h.m281L(obj);
            aVar = (C7249a) obj;
            int i = aVar.f16096b;
            if (i >= 1) {
                int i2 = i - 1;
                aVar.f16096b = i2;
                if (i2 == 0) {
                    C7249a aVar2 = (C7249a) this.f16093a.remove(str);
                    if (aVar2.equals(aVar)) {
                        C7250b bVar = this.f16094b;
                        synchronized (bVar.f16097a) {
                            if (bVar.f16097a.size() < 10) {
                                bVar.f16097a.offer(aVar2);
                            }
                        }
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f16096b);
            }
        }
        aVar.f16095a.unlock();
    }
}
