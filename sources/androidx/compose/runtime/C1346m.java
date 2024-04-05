package androidx.compose.runtime;

import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.internal.C19721f;

/* renamed from: androidx.compose.runtime.m */
public final class C1346m implements C1426z0 {

    /* renamed from: b */
    public final C19525d0 f2939b;

    public C1346m(C19721f fVar) {
        this.f2939b = fVar;
    }

    public final void onAbandoned() {
        C19697g.m33465c(this.f2939b);
    }

    public final void onForgotten() {
        C19697g.m33465c(this.f2939b);
    }

    public final void onRemembered() {
    }
}
