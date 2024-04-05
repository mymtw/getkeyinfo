package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.activity.f */
public abstract class C0112f {

    /* renamed from: a */
    public boolean f163a;

    /* renamed from: b */
    public CopyOnWriteArrayList<C0101a> f164b = new CopyOnWriteArrayList<>();

    public C0112f(boolean z) {
        this.f163a = z;
    }

    /* renamed from: a */
    public abstract void mo1121a();

    /* renamed from: b */
    public final void mo1125b() {
        Iterator<C0101a> it = this.f164b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }
}
