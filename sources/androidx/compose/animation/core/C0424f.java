package androidx.compose.animation.core;

import android.support.p013v4.media.C0072d;
import androidx.activity.C0114h;
import androidx.compose.animation.core.C0432j;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.compose.runtime.C1342k1;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.C19383o;
import p003a2.C0015b;

/* renamed from: androidx.compose.animation.core.f */
public final class C0424f<T, V extends C0432j> implements C1342k1<T> {

    /* renamed from: b */
    public final C0435k0<T, V> f1109b;

    /* renamed from: c */
    public final ParcelableSnapshotMutableState f1110c;

    /* renamed from: d */
    public V f1111d;

    /* renamed from: e */
    public long f1112e;

    /* renamed from: f */
    public long f1113f;

    /* renamed from: g */
    public boolean f1114g;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0424f(C0435k0 k0Var, Object obj, C0432j jVar, int i) {
        this(k0Var, obj, (i & 4) != 0 ? null : jVar, (i & 8) != 0 ? Long.MIN_VALUE : 0, (i & 16) != 0 ? Long.MIN_VALUE : 0, false);
    }

    /* renamed from: d */
    public final T mo3484d() {
        return this.f1109b.mo3510b().invoke(this.f1111d);
    }

    public final T getValue() {
        return this.f1110c.getValue();
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("AnimationState(value=");
        h.append(getValue());
        h.append(", velocity=");
        h.append(mo3484d());
        h.append(", isRunning=");
        h.append(this.f1114g);
        h.append(", lastFrameTimeNanos=");
        h.append(this.f1112e);
        h.append(", finishedTimeNanos=");
        return C0015b.m91j(h, this.f1113f, ')');
    }

    public C0424f(C0435k0<T, V> k0Var, T t, V v, long j, long j2, boolean z) {
        C19383o.m32797g(k0Var, "typeConverter");
        this.f1109b = k0Var;
        this.f1110c = C0761x.m1751w0(t, C1351n1.f2948a);
        this.f1111d = v != null ? C1993m.m4377w(v) : C0114h.m290U(k0Var, t);
        this.f1112e = j;
        this.f1113f = j2;
        this.f1114g = z;
    }
}
