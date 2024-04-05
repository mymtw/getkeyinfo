package p713xl;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C16503j0;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.logging.Logger;
import p551dm.C17589a0;
import p705wl.C18726a;
import p705wl.C18730d;
import p705wl.C18745o;

/* renamed from: xl.j */
public final class C18812j implements C18726a {

    /* renamed from: c */
    public static final byte[] f41664c = new byte[0];

    /* renamed from: a */
    public final C17589a0 f41665a;

    /* renamed from: b */
    public final C18726a f41666b;

    public C18812j(C17589a0 a0Var, C18726a aVar) {
        this.f41665a = a0Var;
        this.f41666b = aVar;
    }

    /* renamed from: a */
    public final byte[] mo46853a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        C16503j0 b;
        C17589a0 a0Var = this.f41665a;
        Logger logger = C18745o.f41518a;
        synchronized (C18745o.class) {
            C18730d d = C18745o.m31612b(a0Var.mo68915z()).mo70237d();
            if (((Boolean) C18745o.f41521d.get(a0Var.mo68915z())).booleanValue()) {
                b = d.mo70220b(a0Var.mo68913A());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + a0Var.mo68915z());
            }
        }
        byte[] c = b.mo58605c();
        byte[] a = this.f41666b.mo46853a(c, f41664c);
        byte[] a2 = ((C18726a) C18745o.m31613c(this.f41665a.mo68915z(), ByteString.copyFrom(c), C18726a.class)).mo46853a(bArr, bArr2);
        return ByteBuffer.allocate(a.length + 4 + a2.length).putInt(a.length).put(a).put(a2).array();
    }

    /* renamed from: b */
    public final byte[] mo46854b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            wrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            byte[] b = this.f41666b.mo46854b(bArr3, f41664c);
            String z = this.f41665a.mo68915z();
            Logger logger = C18745o.f41518a;
            return ((C18726a) C18745o.m31613c(z, ByteString.copyFrom(b), C18726a.class)).mo46854b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e) {
            e = e;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e2) {
            e = e2;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e3) {
            e = e3;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
