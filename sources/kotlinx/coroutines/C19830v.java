package kotlinx.coroutines;

import android.support.p013v4.media.C0070b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: kotlinx.coroutines.v */
public class C19830v {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f43841b = AtomicIntegerFieldUpdater.newUpdater(C19830v.class, "_handled");
    private volatile /* synthetic */ int _handled;

    /* renamed from: a */
    public final Throwable f43842a;

    public C19830v(Throwable th, boolean z) {
        this.f43842a = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [boolean, int] */
    /* renamed from: a */
    public final boolean mo72675a() {
        return this._handled;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return C0070b.m185h(sb, this.f43842a, ']');
    }
}
