package p305z7;

import java.util.Iterator;
import p027b8.C3485d;
import p027b8.C3504n;
import p039c8.C4449e;

/* renamed from: z7.g */
public final class C8465g {

    /* renamed from: a */
    public static C8462e f18488a = C8462e.f18482e;

    /* renamed from: b */
    public static final C3485d f18489b = new C3485d();

    /* renamed from: c */
    public static final C4449e f18490c = new C4449e();

    /* renamed from: a */
    public static void m16900a(Object obj, Appendable appendable, C8462e eVar) {
        C3504n<?> nVar;
        if (obj == null) {
            appendable.append("null");
            return;
        }
        Class<?> cls = obj.getClass();
        C3485d dVar = f18489b;
        C3504n<?> nVar2 = dVar.f8116a.get(cls);
        if (nVar2 == null) {
            if (cls.isArray()) {
                nVar = C3485d.f8114k;
            } else {
                Class<?> cls2 = obj.getClass();
                Iterator<C3485d.C3494i> it = dVar.f8117b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        C3485d.C3494i next = it.next();
                        if (next.f8118a.isAssignableFrom(cls2)) {
                            nVar = next.f8119b;
                            break;
                        }
                    } else {
                        nVar = null;
                        break;
                    }
                }
                if (nVar == null) {
                    nVar = C3485d.f8113j;
                }
            }
            nVar2 = nVar;
            f18489b.mo12998a(nVar2, cls);
        }
        nVar2.mo12997a(obj, appendable, eVar);
    }
}
