package p209p6;

import p209p6.C7686e;

/* renamed from: p6.q */
public final class C7703q implements C7694h {

    /* renamed from: a */
    public final /* synthetic */ C7686e.C7688b f17083a;

    /* renamed from: b */
    public final /* synthetic */ byte f17084b;

    public C7703q(C7686e.C7688b bVar, byte b) {
        this.f17083a = bVar;
        this.f17084b = b;
    }

    /* renamed from: a */
    public final C7695i mo20147a(C7695i iVar) {
        if (iVar instanceof C7705s) {
            return iVar;
        }
        C7705s sVar = new C7705s();
        C7686e.C7688b bVar = this.f17083a;
        byte[][] bArr = this.f17084b == 0 ? C7697k.f17067d : C7697k.f17069f;
        int length = (bArr.length + 1) >>> 1;
        C7686e.C7688b[] bVarArr = new C7686e.C7688b[length];
        bVarArr[0] = bVar;
        int length2 = bArr.length;
        for (int i = 3; i < length2; i += 2) {
            int i2 = i >>> 1;
            byte[] bArr2 = bArr[i];
            C7686e.C7688b bVar2 = (C7686e.C7688b) bVar.f17048a.mo20089p();
            C7686e.C7688b bVar3 = (C7686e.C7688b) bVar.mo20144v();
            int i3 = 0;
            for (int length3 = bArr2.length - 1; length3 >= 0; length3--) {
                i3++;
                byte b = bArr2[length3];
                if (b != 0) {
                    bVar2 = (C7686e.C7688b) bVar2.mo20148y(i3).mo20131j(b > 0 ? bVar : bVar3);
                    i3 = 0;
                }
            }
            if (i3 > 0) {
                bVar2 = bVar2.mo20148y(i3);
            }
            bVarArr[i2] = bVar2;
        }
        C7676c cVar = bVar.f17048a;
        cVar.getClass();
        cVar.mo20084k(bVarArr, 0, length, (C7681d) null);
        sVar.f17085a = bVarArr;
        return sVar;
    }
}
