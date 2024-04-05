package p276w7;

/* renamed from: w7.b */
public final class C8259b {

    /* renamed from: a */
    public final byte[] f18094a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, Framer.EXIT_FRAME_PREFIX, 121, 122, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: b */
    public final byte[] f18095b = new byte[128];

    public C8259b() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f18095b;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = this.f18094a;
            if (i < bArr2.length) {
                this.f18095b[bArr2[i]] = (byte) i;
                i++;
            } else {
                return;
            }
        }
    }
}
