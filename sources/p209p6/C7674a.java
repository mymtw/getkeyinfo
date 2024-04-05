package p209p6;

/* renamed from: p6.a */
public final class C7674a {
    /* renamed from: a */
    public static C7686e m14732a(C7686e[] eVarArr, C7686e[] eVarArr2, byte[] bArr, C7686e[] eVarArr3, C7686e[] eVarArr4, byte[] bArr2) {
        C7686e eVar;
        int max = Math.max(bArr.length, bArr2.length);
        C7686e p = eVarArr[0].f17048a.mo20089p();
        int i = max - 1;
        int i2 = 0;
        C7686e eVar2 = p;
        while (i >= 0) {
            byte b = i < bArr.length ? bArr[i] : 0;
            byte b2 = i < bArr2.length ? bArr2[i] : 0;
            if ((b | b2) == 0) {
                i2++;
            } else {
                if (b != 0) {
                    eVar = p.mo20131j((b < 0 ? eVarArr2 : eVarArr)[Math.abs(b) >>> 1]);
                } else {
                    eVar = p;
                }
                if (b2 != 0) {
                    eVar = eVar.mo20131j((b2 < 0 ? eVarArr4 : eVarArr3)[Math.abs(b2) >>> 1]);
                }
                if (i2 > 0) {
                    eVar2 = eVar2.mo20128h(i2);
                    i2 = 0;
                }
                eVar2 = eVar2.mo20134m(eVar);
            }
            i--;
        }
        return i2 > 0 ? eVar2.mo20128h(i2) : eVar2;
    }
}
