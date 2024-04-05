package p276w7;

import android.support.p013v4.media.C0072d;
import com.cardinalcommerce.dependencies.internal.bouncycastle.util.p060a.C6228c;
import com.cardinalcommerce.dependencies.internal.bouncycastle.util.p060a.C6229e;
import java.io.ByteArrayOutputStream;

/* renamed from: w7.c */
public final class C8260c {

    /* renamed from: a */
    public static final C8261d f18096a = new C8261d();

    /* renamed from: a */
    public static byte[] m16545a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f18096a.mo20866a(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            StringBuilder h = C0072d.m201h("exception decoding Hex string: ");
            h.append(e.getMessage());
            throw new C6228c(h.toString(), e);
        }
    }

    /* renamed from: b */
    public static byte[] m16546b(int i, int i2, byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C8261d dVar = f18096a;
            dVar.getClass();
            for (int i3 = i; i3 < i + i2; i3++) {
                byte b = bArr[i3] & 255;
                byteArrayOutputStream.write(((byte[]) dVar.f18097b)[b >>> 4]);
                byteArrayOutputStream.write(((byte[]) dVar.f18097b)[b & 15]);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            StringBuilder h = C0072d.m201h("exception encoding Hex string: ");
            h.append(e.getMessage());
            throw new C6229e(h.toString(), e);
        }
    }
}
