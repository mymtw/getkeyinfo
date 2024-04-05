package androidx.compose.animation.core;

import androidx.compose.animation.core.C0432j;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.animation.core.m0 */
public interface C0439m0<V extends C0432j> {
    /* renamed from: a */
    boolean mo3517a();

    /* renamed from: b */
    long mo3518b(V v, V v2, V v3);

    /* renamed from: d */
    V mo3519d(V v, V v2, V v3) {
        C19383o.m32797g(v, "initialValue");
        C19383o.m32797g(v2, "targetValue");
        C19383o.m32797g(v3, "initialVelocity");
        return mo3520f(mo3518b(v, v2, v3), v, v2, v3);
    }

    /* renamed from: f */
    V mo3520f(long j, V v, V v2, V v3);

    /* renamed from: g */
    V mo3521g(long j, V v, V v2, V v3);
}
