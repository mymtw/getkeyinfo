package androidx.compose.foundation.layout;

import android.support.p013v4.media.C0072d;
import androidx.compose.p015ui.C1432b;
import androidx.compose.p015ui.C1436d;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p174m0.C7280a;
import p174m0.C7282b;

/* renamed from: androidx.compose.foundation.layout.h */
public final class C0737h implements C0735g, C0733f {

    /* renamed from: b */
    public final C7282b f1499b;

    /* renamed from: c */
    public final long f1500c;

    /* renamed from: d */
    public final /* synthetic */ C19543e0 f1501d = C19543e0.f43489b;

    public C0737h(C7282b bVar, long j) {
        this.f1499b = bVar;
        this.f1500c = j;
    }

    /* renamed from: b */
    public final long mo4120b() {
        return this.f1500c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0737h)) {
            return false;
        }
        C0737h hVar = (C0737h) obj;
        return C19383o.m32792b(this.f1499b, hVar.f1499b) && C7280a.m13957b(this.f1500c, hVar.f1500c);
    }

    /* renamed from: g */
    public final C1436d mo4116g(C1436d dVar, C1432b bVar) {
        C19383o.m32797g(dVar, "<this>");
        return this.f1501d.mo4116g(dVar, bVar);
    }

    public final int hashCode() {
        return Long.hashCode(this.f1500c) + (this.f1499b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("BoxWithConstraintsScopeImpl(density=");
        h.append(this.f1499b);
        h.append(", constraints=");
        h.append(C7280a.m13966k(this.f1500c));
        h.append(')');
        return h.toString();
    }
}
