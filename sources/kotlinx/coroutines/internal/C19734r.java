package kotlinx.coroutines.internal;

import androidx.core.internal.view.SupportMenu;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.internal.C19734r;

/* renamed from: kotlinx.coroutines.internal.r */
public abstract class C19734r<S extends C19734r<S>> extends C19720e<S> {

    /* renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f43684d = AtomicIntegerFieldUpdater.newUpdater(C19734r.class, "cleanedAndPointers");

    /* renamed from: c */
    public final long f43685c;
    private volatile /* synthetic */ int cleanedAndPointers;

    public C19734r(long j, S s, int i) {
        super(s);
        this.f43685c = j;
        this.cleanedAndPointers = i << 16;
    }

    /* renamed from: b */
    public final boolean mo72448b() {
        return this.cleanedAndPointers == mo72479f() && !mo72449c();
    }

    /* renamed from: e */
    public final boolean mo72478e() {
        return f43684d.addAndGet(this, SupportMenu.CATEGORY_MASK) == mo72479f() && !mo72449c();
    }

    /* renamed from: f */
    public abstract int mo72479f();

    /* renamed from: g */
    public final boolean mo72480g() {
        int i;
        do {
            i = this.cleanedAndPointers;
            if (!(i != mo72479f() || mo72449c())) {
                return false;
            }
        } while (!f43684d.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
