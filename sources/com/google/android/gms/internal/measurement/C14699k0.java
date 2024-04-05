package com.google.android.gms.internal.measurement;

import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import p106f8.C6811b;

/* renamed from: com.google.android.gms.internal.measurement.k0 */
public final class C14699k0 {

    /* renamed from: a */
    public final C14597c2 f32901a;

    /* renamed from: b */
    public C14598c3 f32902b;

    /* renamed from: c */
    public final C14594c f32903c = new C14594c();

    /* renamed from: d */
    public final C6811b f32904d = new C6811b();

    public C14699k0() {
        C14597c2 c2Var = new C14597c2();
        this.f32901a = c2Var;
        this.f32902b = c2Var.f32775b.mo50399b();
        ((Map) c2Var.f32777d.f2868b).put("internal.registerCallback", new C14568a(this));
        ((Map) c2Var.f32777d.f2868b).put("internal.eventLogger", new C14885z(this));
    }

    /* renamed from: a */
    public final void mo50620a(C14780q3 q3Var) throws zzd {
        C14685j jVar;
        try {
            this.f32902b = this.f32901a.f32775b.mo50399b();
            if (!(this.f32901a.mo50398a(this.f32902b, (C14817t3[]) q3Var.mo50803t().toArray(new C14817t3[0])) instanceof C14659h)) {
                for (C14754o3 o3Var : q3Var.mo50802r().mo50678u()) {
                    C14891z5 t = o3Var.mo50759t();
                    String s = o3Var.mo50758s();
                    Iterator it = t.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            C14763p a = this.f32901a.mo50398a(this.f32902b, (C14817t3) it.next());
                            if (a instanceof C14724m) {
                                C14598c3 c3Var = this.f32902b;
                                if (!c3Var.mo50405h(s)) {
                                    jVar = null;
                                } else {
                                    C14763p e = c3Var.mo50402e(s);
                                    if (!(e instanceof C14685j)) {
                                        String valueOf = String.valueOf(s);
                                        throw new IllegalStateException(valueOf.length() != 0 ? "Invalid function name: ".concat(valueOf) : new String("Invalid function name: "));
                                    }
                                    jVar = (C14685j) e;
                                }
                                if (jVar == null) {
                                    String valueOf2 = String.valueOf(s);
                                    throw new IllegalStateException(valueOf2.length() != 0 ? "Rule function is undefined: ".concat(valueOf2) : new String("Rule function is undefined: "));
                                }
                                jVar.mo50553b(this.f32902b, Collections.singletonList(a));
                            } else {
                                throw new IllegalArgumentException("Invalid rule definition");
                            }
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    /* renamed from: b */
    public final boolean mo50621b(C14581b bVar) throws zzd {
        try {
            C14594c cVar = this.f32903c;
            cVar.f32768a = bVar;
            cVar.f32769b = bVar.clone();
            cVar.f32770c.clear();
            this.f32901a.f32776c.mo50404g("runtime.counter", new C14672i(Double.valueOf(ShadowDrawableWrapper.COS_45)));
            this.f32904d.mo18936c(this.f32902b.mo50399b(), this.f32903c);
            C14594c cVar2 = this.f32903c;
            return (cVar2.f32769b.equals(cVar2.f32768a) ^ true) || (this.f32903c.f32770c.isEmpty() ^ true);
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }
}
