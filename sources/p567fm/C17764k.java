package p567fm;

import androidx.activity.C0114h;
import com.google.android.gms.common.api.Api;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.AEADBadTagException;
import p705wl.C18726a;

/* renamed from: fm.k */
public abstract class C17764k implements C18726a {

    /* renamed from: a */
    public final C17762i f38605a;

    /* renamed from: b */
    public final C17762i f38606b;

    public C17764k(byte[] bArr) throws InvalidKeyException {
        this.f38605a = mo69009d(1, bArr);
        this.f38606b = mo69009d(0, bArr);
    }

    /* renamed from: c */
    public static byte[] m29799c(ByteBuffer byteBuffer, byte[] bArr) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int remaining = byteBuffer.remaining();
        int i = remaining % 16;
        int i2 = (i == 0 ? remaining : (remaining + 16) - i) + length;
        ByteBuffer order = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(length);
        order.put(byteBuffer);
        order.position(i2);
        order.putLong((long) bArr.length);
        order.putLong((long) remaining);
        return order.array();
    }

    /* renamed from: a */
    public final byte[] mo46853a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length <= (Api.BaseClientBuilder.API_PRIORITY_OTHER - this.f38605a.mo69004g()) - 16) {
            ByteBuffer allocate = ByteBuffer.allocate(this.f38605a.mo69004g() + bArr.length + 16);
            if (allocate.remaining() >= this.f38605a.mo69004g() + bArr.length + 16) {
                int position = allocate.position();
                this.f38605a.mo69007f(allocate, bArr);
                allocate.position(position);
                byte[] bArr3 = new byte[this.f38605a.mo69004g()];
                allocate.get(bArr3);
                allocate.limit(allocate.limit() - 16);
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                byte[] bArr4 = new byte[32];
                this.f38606b.mo69005c(0, bArr3).get(bArr4);
                byte[] N = C0114h.m283N(bArr4, m29799c(allocate, bArr2));
                allocate.limit(allocate.limit() + 16);
                allocate.put(N);
                return allocate.array();
            }
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* renamed from: b */
    public final byte[] mo46854b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (wrap.remaining() >= this.f38605a.mo69004g() + 16) {
            int position = wrap.position();
            byte[] bArr3 = new byte[16];
            wrap.position(wrap.limit() - 16);
            wrap.get(bArr3);
            wrap.position(position);
            wrap.limit(wrap.limit() - 16);
            byte[] bArr4 = new byte[this.f38605a.mo69004g()];
            wrap.get(bArr4);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            try {
                byte[] bArr5 = new byte[32];
                this.f38606b.mo69005c(0, bArr4).get(bArr5);
                if (C17760g.m29781b(C0114h.m283N(bArr5, m29799c(wrap, bArr2)), bArr3)) {
                    wrap.position(position);
                    return this.f38605a.mo69006e(wrap);
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e) {
                throw new AEADBadTagException(e.toString());
            }
        } else {
            throw new GeneralSecurityException("ciphertext too short");
        }
    }

    /* renamed from: d */
    public abstract C17762i mo69009d(int i, byte[] bArr) throws InvalidKeyException;
}
