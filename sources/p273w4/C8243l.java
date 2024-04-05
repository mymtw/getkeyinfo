package p273w4;

import com.bumptech.glide.request.C6124d;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p036c5.C4426l;

/* renamed from: w4.l */
public final class C8243l {

    /* renamed from: a */
    public final Set<C6124d> f18069a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public final HashSet f18070b = new HashSet();

    /* renamed from: c */
    public boolean f18071c;

    /* renamed from: a */
    public final boolean mo20850a(C6124d dVar) {
        boolean z = true;
        if (dVar == null) {
            return true;
        }
        boolean remove = this.f18069a.remove(dVar);
        if (!this.f18070b.remove(dVar) && !remove) {
            z = false;
        }
        if (z) {
            dVar.clear();
        }
        return z;
    }

    /* renamed from: b */
    public final void mo20851b() {
        Iterator it = C4426l.m10131e(this.f18069a).iterator();
        while (it.hasNext()) {
            C6124d dVar = (C6124d) it.next();
            if (!dVar.mo17126e() && !dVar.mo17123c()) {
                dVar.clear();
                if (!this.f18071c) {
                    dVar.mo17129h();
                } else {
                    this.f18070b.add(dVar);
                }
            }
        }
    }

    public final String toString() {
        return super.toString() + "{numRequests=" + this.f18069a.size() + ", isPaused=" + this.f18071c + "}";
    }
}
