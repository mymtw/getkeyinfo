package kotlinx.coroutines;

import kotlin.collections.C19318k;
import kotlinx.coroutines.internal.C19716a;

/* renamed from: kotlinx.coroutines.t0 */
public abstract class C19821t0 extends CoroutineDispatcher {

    /* renamed from: f */
    public static final /* synthetic */ int f43821f = 0;

    /* renamed from: c */
    public long f43822c;

    /* renamed from: d */
    public boolean f43823d;

    /* renamed from: e */
    public C19716a<C19754l0<?>> f43824e;

    /* renamed from: E0 */
    public final void mo72657E0(boolean z) {
        long j = this.f43822c - (z ? 4294967296L : 1);
        this.f43822c = j;
        if (j <= 0 && this.f43823d) {
            shutdown();
        }
    }

    /* renamed from: F0 */
    public final void mo72658F0(C19754l0<?> l0Var) {
        C19716a<C19754l0<?>> aVar = this.f43824e;
        if (aVar == null) {
            aVar = new C19716a<>();
            this.f43824e = aVar;
        }
        Object[] objArr = aVar.f43653a;
        int i = aVar.f43655c;
        objArr[i] = l0Var;
        int length = (objArr.length - 1) & (i + 1);
        aVar.f43655c = length;
        int i2 = aVar.f43654b;
        if (length == i2) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[(length2 << 1)];
            C19318k.m32605W0(objArr, objArr2, 0, i2, 0, 10);
            Object[] objArr3 = aVar.f43653a;
            int length3 = objArr3.length;
            int i3 = aVar.f43654b;
            C19318k.m32605W0(objArr3, objArr2, length3 - i3, 0, i3, 4);
            aVar.f43653a = objArr2;
            aVar.f43654b = 0;
            aVar.f43655c = length2;
        }
    }

    /* renamed from: G0 */
    public final void mo72659G0(boolean z) {
        this.f43822c = (z ? 4294967296L : 1) + this.f43822c;
        if (!z) {
            this.f43823d = true;
        }
    }

    /* renamed from: H0 */
    public final boolean mo72660H0() {
        return this.f43822c >= 4294967296L;
    }

    /* renamed from: I0 */
    public long mo72661I0() {
        return !mo72662J0() ? Long.MAX_VALUE : 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: kotlinx.coroutines.l0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: J0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo72662J0() {
        /*
            r7 = this;
            kotlinx.coroutines.internal.a<kotlinx.coroutines.l0<?>> r0 = r7.f43824e
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r2 = r0.f43654b
            int r3 = r0.f43655c
            r4 = 0
            r5 = 1
            if (r2 != r3) goto L_0x000f
            goto L_0x001f
        L_0x000f:
            java.lang.Object[] r3 = r0.f43653a
            r6 = r3[r2]
            r3[r2] = r4
            int r2 = r2 + r5
            int r3 = r3.length
            int r3 = r3 + -1
            r2 = r2 & r3
            r0.f43654b = r2
            if (r6 == 0) goto L_0x0028
            r4 = r6
        L_0x001f:
            kotlinx.coroutines.l0 r4 = (kotlinx.coroutines.C19754l0) r4
            if (r4 != 0) goto L_0x0024
            return r1
        L_0x0024:
            r4.run()
            return r5
        L_0x0028:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C19821t0.mo72662J0():boolean");
    }

    public void shutdown() {
    }
}
