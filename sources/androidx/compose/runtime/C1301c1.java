package androidx.compose.runtime;

import androidx.compose.runtime.tooling.C1413a;
import androidx.compose.runtime.tooling.C1414b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p755lq.C19875a;

/* renamed from: androidx.compose.runtime.c1 */
public final class C1301c1 implements C1413a, Iterable<C1414b>, C19875a {

    /* renamed from: b */
    public int[] f2820b = new int[0];

    /* renamed from: c */
    public int f2821c;

    /* renamed from: d */
    public Object[] f2822d = new Object[0];

    /* renamed from: e */
    public int f2823e;

    /* renamed from: f */
    public int f2824f;

    /* renamed from: g */
    public boolean f2825g;

    /* renamed from: h */
    public int f2826h;

    /* renamed from: i */
    public ArrayList<C1296b> f2827i = new ArrayList<>();

    /* renamed from: e */
    public final Iterable<C1414b> mo5644e() {
        return this;
    }

    public final Iterator<C1414b> iterator() {
        return new C1421x(0, this.f2821c, this);
    }

    /* renamed from: l */
    public final int mo5646l(C1296b bVar) {
        C19383o.m32797g(bVar, "anchor");
        if (!(!this.f2825g)) {
            ComposerKt.m2526c("Use active SlotWriter to determine anchor location instead".toString());
            throw null;
        } else if (bVar.mo5622a()) {
            return bVar.f2800a;
        } else {
            throw new IllegalArgumentException("Anchor refers to a group that was removed".toString());
        }
    }

    /* renamed from: m */
    public final boolean mo5647m(C1296b bVar, int i) {
        if (!this.f2825g) {
            if (i >= 0 && i < this.f2821c) {
                if (mo5650q(bVar)) {
                    int u = C0005b.m63u(i, this.f2820b) + i;
                    int i2 = bVar.f2800a;
                    if (i <= i2 && i2 < u) {
                        return true;
                    }
                }
                return false;
            }
            ComposerKt.m2526c("Invalid group index".toString());
            throw null;
        }
        ComposerKt.m2526c("Writer is active".toString());
        throw null;
    }

    /* renamed from: n */
    public final C1298b1 mo5648n() {
        if (!this.f2825g) {
            this.f2824f++;
            return new C1298b1(this);
        }
        throw new IllegalStateException("Cannot read while a writer is pending".toString());
    }

    /* renamed from: p */
    public final C1306d1 mo5649p() {
        if (!this.f2825g) {
            if (this.f2824f <= 0) {
                this.f2825g = true;
                this.f2826h++;
                return new C1306d1(this);
            }
            ComposerKt.m2526c("Cannot start a writer when a reader is pending".toString());
            throw null;
        }
        ComposerKt.m2526c("Cannot start a writer when another writer is pending".toString());
        throw null;
    }

    /* renamed from: q */
    public final boolean mo5650q(C1296b bVar) {
        if (bVar.mo5622a()) {
            int n0 = C0005b.m51n0(this.f2827i, bVar.f2800a, this.f2821c);
            if (n0 >= 0 && C19383o.m32792b(this.f2827i.get(n0), bVar)) {
                return true;
            }
        }
        return false;
    }
}
