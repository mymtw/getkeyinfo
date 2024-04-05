package com.bugsnag.android;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.a1 */
public final class C5718a1 extends C5756i {

    /* renamed from: b */
    public final C5722b1 f12147b;

    public C5718a1() {
        this(0);
    }

    public /* synthetic */ C5718a1(int i) {
        this(new C5722b1());
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C5718a1) && C19383o.m32792b(this.f12147b, ((C5718a1) obj).f12147b);
        }
        return true;
    }

    public final int hashCode() {
        C5722b1 b1Var = this.f12147b;
        if (b1Var != null) {
            return b1Var.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("FeatureFlagState(featureFlags=");
        h.append(this.f12147b);
        h.append(")");
        return h.toString();
    }

    public C5718a1(C5722b1 b1Var) {
        C19383o.m32798h(b1Var, "featureFlags");
        this.f12147b = b1Var;
    }
}
