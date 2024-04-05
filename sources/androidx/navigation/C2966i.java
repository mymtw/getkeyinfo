package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.navigation.C2964h;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p193o.C7507j;
import p772tq.C20203a;

/* renamed from: androidx.navigation.i */
public final class C2966i extends C2964h implements Iterable<C2964h> {

    /* renamed from: j */
    public final C7507j<C2964h> f6739j = new C7507j<>();

    /* renamed from: k */
    public int f6740k;

    /* renamed from: l */
    public String f6741l;

    /* renamed from: androidx.navigation.i$a */
    public class C2967a implements Iterator<C2964h> {

        /* renamed from: b */
        public int f6742b = -1;

        /* renamed from: c */
        public boolean f6743c = false;

        public C2967a() {
        }

        public final boolean hasNext() {
            return this.f6742b + 1 < C2966i.this.f6739j.mo19995i();
        }

        public final Object next() {
            if (hasNext()) {
                this.f6743c = true;
                C7507j<C2964h> jVar = C2966i.this.f6739j;
                int i = this.f6742b + 1;
                this.f6742b = i;
                return jVar.mo19996j(i);
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            if (this.f6743c) {
                C2966i.this.f6739j.mo19996j(this.f6742b).f6727c = null;
                C7507j<C2964h> jVar = C2966i.this.f6739j;
                int i = this.f6742b;
                Object[] objArr = jVar.f16749d;
                Object obj = objArr[i];
                Object obj2 = C7507j.f16746f;
                if (obj != obj2) {
                    objArr[i] = obj2;
                    jVar.f16747b = true;
                }
                this.f6742b = i - 1;
                this.f6743c = false;
                return;
            }
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
    }

    public C2966i(C2990p<? extends C2966i> pVar) {
        super(pVar);
    }

    /* renamed from: e */
    public final C2964h.C2965a mo10968e(C2963g gVar) {
        C2964h.C2965a e = super.mo10968e(gVar);
        C2967a aVar = new C2967a();
        while (aVar.hasNext()) {
            C2964h.C2965a e2 = ((C2964h) aVar.next()).mo10968e(gVar);
            if (e2 != null && (e == null || e2.compareTo(e) > 0)) {
                e = e2;
            }
        }
        return e;
    }

    /* renamed from: g */
    public final void mo10954g(Context context, AttributeSet attributeSet) {
        super.mo10954g(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C20203a.f44791u);
        int resourceId = obtainAttributes.getResourceId(0, 0);
        if (resourceId != this.f6728d) {
            this.f6740k = resourceId;
            this.f6741l = null;
            this.f6741l = C2964h.m6910c(context, resourceId);
            obtainAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException("Start destination " + resourceId + " cannot use the same id as the graph " + this);
    }

    public final Iterator<C2964h> iterator() {
        return new C2967a();
    }

    /* renamed from: l */
    public final void mo10972l(C2964h hVar) {
        int i = hVar.f6728d;
        if (i == 0) {
            throw new IllegalArgumentException("Destinations must have an id. Call setId() or include an android:id in your navigation XML.");
        } else if (i != this.f6728d) {
            C2964h hVar2 = (C2964h) this.f6739j.mo19993f(i, (Integer) null);
            if (hVar2 != hVar) {
                if (hVar.f6727c == null) {
                    if (hVar2 != null) {
                        hVar2.f6727c = null;
                    }
                    hVar.f6727c = this;
                    this.f6739j.mo19994h(hVar.f6728d, hVar);
                    return;
                }
                throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
            }
        } else {
            throw new IllegalArgumentException("Destination " + hVar + " cannot have the same id as graph " + this);
        }
    }

    /* renamed from: m */
    public final C2964h mo10973m(int i, boolean z) {
        C2966i iVar;
        C2964h hVar = (C2964h) this.f6739j.mo19993f(i, (Integer) null);
        if (hVar != null) {
            return hVar;
        }
        if (!z || (iVar = this.f6727c) == null) {
            return null;
        }
        return iVar.mo10973m(i, true);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" startDestination=");
        C2964h m = mo10973m(this.f6740k, true);
        if (m == null) {
            String str = this.f6741l;
            if (str == null) {
                sb.append("0x");
                sb.append(Integer.toHexString(this.f6740k));
            } else {
                sb.append(str);
            }
        } else {
            sb.append("{");
            sb.append(m.toString());
            sb.append("}");
        }
        return sb.toString();
    }
}
