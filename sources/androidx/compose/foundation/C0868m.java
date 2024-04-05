package androidx.compose.foundation;

import androidx.compose.p015ui.layout.C1674c0;
import androidx.compose.p015ui.layout.C1689j;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p098f0.C6764b;
import p098f0.C6766d;
import p753kq.C19857l;

/* renamed from: androidx.compose.foundation.m */
public final class C0868m implements C6764b, C1674c0 {

    /* renamed from: b */
    public C19857l<? super C1689j, C19394m> f1877b;

    /* renamed from: c */
    public C1689j f1878c;

    /* renamed from: M */
    public final void mo3622M(C6766d dVar) {
        C19857l<? super C1689j, C19394m> lVar;
        C19383o.m32797g(dVar, "scope");
        C19857l<? super C1689j, C19394m> lVar2 = (C19857l) dVar.mo6818a(FocusedBoundsKt.f1267a);
        if (lVar2 == null && (lVar = this.f1877b) != null) {
            lVar.invoke(null);
        }
        this.f1877b = lVar2;
    }

    /* renamed from: x0 */
    public final void mo3878x0(C1689j jVar) {
        C19857l<? super C1689j, C19394m> lVar;
        C19383o.m32797g(jVar, "coordinates");
        this.f1878c = jVar;
        if (jVar.mo6685c()) {
            C1689j jVar2 = this.f1878c;
            if (jVar2 != null && jVar2.mo6685c() && (lVar = this.f1877b) != null) {
                lVar.invoke(this.f1878c);
                return;
            }
            return;
        }
        C19857l<? super C1689j, C19394m> lVar2 = this.f1877b;
        if (lVar2 != null) {
            lVar2.invoke(null);
        }
    }
}
