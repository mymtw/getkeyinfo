package androidx.compose.animation.core;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.core.C0432j;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.animation.core.c */
public final class C0417c<T, V extends C0432j> {

    /* renamed from: a */
    public final C0424f<T, V> f1091a;

    /* renamed from: b */
    public final AnimationEndReason f1092b;

    public C0417c(C0424f<T, V> fVar, AnimationEndReason animationEndReason) {
        C19383o.m32797g(fVar, "endState");
        C19383o.m32797g(animationEndReason, "endReason");
        this.f1091a = fVar;
        this.f1092b = animationEndReason;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("AnimationResult(endReason=");
        h.append(this.f1092b);
        h.append(", endState=");
        h.append(this.f1091a);
        h.append(')');
        return h.toString();
    }
}
