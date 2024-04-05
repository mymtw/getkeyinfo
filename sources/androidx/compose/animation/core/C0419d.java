package androidx.compose.animation.core;

import androidx.compose.animation.core.C0432j;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;

/* renamed from: androidx.compose.animation.core.d */
public final class C0419d<T, V extends C0432j> {

    /* renamed from: a */
    public final C0435k0<T, V> f1096a;

    /* renamed from: b */
    public final T f1097b;

    /* renamed from: c */
    public final long f1098c;

    /* renamed from: d */
    public final C19846a<C19394m> f1099d;

    /* renamed from: e */
    public final ParcelableSnapshotMutableState f1100e;

    /* renamed from: f */
    public V f1101f;

    /* renamed from: g */
    public long f1102g;

    /* renamed from: h */
    public long f1103h = Long.MIN_VALUE;

    /* renamed from: i */
    public final ParcelableSnapshotMutableState f1104i = C0761x.m1751w0(Boolean.TRUE, C1351n1.f2948a);

    public C0419d(Object obj, C0435k0 k0Var, C0432j jVar, long j, Object obj2, long j2, C19846a aVar) {
        C19383o.m32797g(k0Var, "typeConverter");
        C19383o.m32797g(jVar, "initialVelocityVector");
        this.f1096a = k0Var;
        this.f1097b = obj2;
        this.f1098c = j2;
        this.f1099d = aVar;
        this.f1100e = C0761x.m1751w0(obj, C1351n1.f2948a);
        this.f1101f = C1993m.m4377w(jVar);
        this.f1102g = j;
    }

    /* renamed from: a */
    public final void mo3480a() {
        this.f1104i.setValue(Boolean.FALSE);
        this.f1099d.invoke();
    }

    /* renamed from: b */
    public final T mo3481b() {
        return this.f1100e.getValue();
    }
}
