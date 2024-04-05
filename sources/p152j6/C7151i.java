package p152j6;

import p209p6.C7681d;
import p244t5.C7964b0;
import p244t5.C8005o1;
import p244t5.C8018s1;

/* renamed from: j6.i */
public final class C7151i extends C8005o1 {

    /* renamed from: b */
    public C7681d f15881b;

    public C7151i(C7681d dVar) {
        this.f15881b = dVar;
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        byte[] bArr;
        int f = (this.f15881b.mo20097f() + 7) / 8;
        byte[] byteArray = this.f15881b.mo20092a().toByteArray();
        if (f < byteArray.length) {
            bArr = new byte[f];
            System.arraycopy(byteArray, byteArray.length - f, bArr, 0, f);
        } else {
            if (f > byteArray.length) {
                bArr = new byte[f];
                System.arraycopy(byteArray, 0, bArr, f - byteArray.length, byteArray.length);
            }
            return new C7964b0(byteArray);
        }
        byteArray = bArr;
        return new C7964b0(byteArray);
    }
}
