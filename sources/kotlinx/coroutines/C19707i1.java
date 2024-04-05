package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.i1 */
public class C19707i1 extends C19749k1 implements C19820t {

    /* renamed from: c */
    public final boolean f43637c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19707i1(C19699g1 g1Var) {
        super(true);
        C19749k1 G;
        boolean z = true;
        mo72523k0(g1Var);
        C19762o g0 = mo72520g0();
        C19765p pVar = g0 instanceof C19765p ? (C19765p) g0 : null;
        C19749k1 G2 = pVar == null ? null : pVar.mo72494G();
        if (G2 == null) {
            z = false;
        } else {
            while (true) {
                if (!G2.mo72406b0()) {
                    C19762o g02 = G2.mo72520g0();
                    C19765p pVar2 = g02 instanceof C19765p ? (C19765p) g02 : null;
                    if (pVar2 == null) {
                        G = null;
                        continue;
                    } else {
                        G = pVar2.mo72494G();
                        continue;
                    }
                    if (G2 == null) {
                        break;
                    }
                } else {
                    break;
                }
            }
            z = false;
        }
        this.f43637c = z;
    }

    /* renamed from: b0 */
    public final boolean mo72406b0() {
        return this.f43637c;
    }

    /* renamed from: d0 */
    public final boolean mo72407d0() {
        return true;
    }
}
