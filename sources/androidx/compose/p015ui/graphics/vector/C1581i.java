package androidx.compose.p015ui.graphics.vector;

import com.etsy.android.lib.models.ResponseConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p504ai.C13983i;
import p755lq.C19875a;

/* renamed from: androidx.compose.ui.graphics.vector.i */
public final class C1581i extends C1584k implements Iterable<C1584k>, C19875a {

    /* renamed from: b */
    public final String f3527b;

    /* renamed from: c */
    public final float f3528c;

    /* renamed from: d */
    public final float f3529d;

    /* renamed from: e */
    public final float f3530e;

    /* renamed from: f */
    public final float f3531f;

    /* renamed from: g */
    public final float f3532g;

    /* renamed from: h */
    public final float f3533h;

    /* renamed from: i */
    public final float f3534i;

    /* renamed from: j */
    public final List<C1556d> f3535j;

    /* renamed from: k */
    public final List<C1584k> f3536k;

    /* renamed from: androidx.compose.ui.graphics.vector.i$a */
    public static final class C1582a implements Iterator<C1584k>, C19875a {

        /* renamed from: b */
        public final Iterator<C1584k> f3537b;

        public C1582a(C1581i iVar) {
            this.f3537b = iVar.f3536k.iterator();
        }

        public final boolean hasNext() {
            return this.f3537b.hasNext();
        }

        public final Object next() {
            return this.f3537b.next();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C1581i(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends C1556d> list, List<? extends C1584k> list2) {
        C19383o.m32797g(str, "name");
        C19383o.m32797g(list, "clipPathData");
        C19383o.m32797g(list2, ResponseConstants.CHILDREN);
        this.f3527b = str;
        this.f3528c = f;
        this.f3529d = f2;
        this.f3530e = f3;
        this.f3531f = f4;
        this.f3532g = f5;
        this.f3533h = f6;
        this.f3534i = f7;
        this.f3535j = list;
        this.f3536k = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1581i)) {
            return false;
        }
        C1581i iVar = (C1581i) obj;
        if (!C19383o.m32792b(this.f3527b, iVar.f3527b)) {
            return false;
        }
        if (!(this.f3528c == iVar.f3528c)) {
            return false;
        }
        if (!(this.f3529d == iVar.f3529d)) {
            return false;
        }
        if (!(this.f3530e == iVar.f3530e)) {
            return false;
        }
        if (!(this.f3531f == iVar.f3531f)) {
            return false;
        }
        if (!(this.f3532g == iVar.f3532g)) {
            return false;
        }
        if (!(this.f3533h == iVar.f3533h)) {
            return false;
        }
        return ((this.f3534i > iVar.f3534i ? 1 : (this.f3534i == iVar.f3534i ? 0 : -1)) == 0) && C19383o.m32792b(this.f3535j, iVar.f3535j) && C19383o.m32792b(this.f3536k, iVar.f3536k);
    }

    public final int hashCode() {
        return this.f3536k.hashCode() + C13983i.m21488g(this.f3535j, C0023f.m104c(this.f3534i, C0023f.m104c(this.f3533h, C0023f.m104c(this.f3532g, C0023f.m104c(this.f3531f, C0023f.m104c(this.f3530e, C0023f.m104c(this.f3529d, C0023f.m104c(this.f3528c, this.f3527b.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final Iterator<C1584k> iterator() {
        return new C1582a(this);
    }

    public C1581i() {
        this("", 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, C1583j.f3538a, EmptyList.INSTANCE);
    }
}
