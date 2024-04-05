package kotlinx.coroutines;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;

/* renamed from: kotlinx.coroutines.s0 */
public final class C19793s0 implements C19466a1 {

    /* renamed from: b */
    public final boolean f43759b;

    public C19793s0(boolean z) {
        this.f43759b = z;
    }

    /* renamed from: d */
    public final C19767p1 mo72101d() {
        return null;
    }

    public final boolean isActive() {
        return this.f43759b;
    }

    public final String toString() {
        return C0391c.m1057c(C0072d.m201h("Empty{"), this.f43759b ? "Active" : "New", '}');
    }
}
