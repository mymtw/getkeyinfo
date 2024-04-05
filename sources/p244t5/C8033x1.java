package p244t5;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.C6147i;
import com.google.android.play.core.appupdate.C15567i;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: t5.x1 */
public final class C8033x1 {

    /* renamed from: a */
    public final InputStream f17516a;

    /* renamed from: b */
    public final int f17517b;

    /* renamed from: c */
    public final byte[][] f17518c;

    public C8033x1(C7968c1 c1Var, int i) {
        this.f17516a = c1Var;
        this.f17517b = i;
        this.f17518c = new byte[11][];
    }

    public C8033x1(C8029w0 w0Var) {
        this(w0Var, C7974e1.m15997b(w0Var));
    }

    /* renamed from: a */
    public final C7966c mo20586a(int i, boolean z) {
        if (!z) {
            return new C7992k0(false, i, new C7964b0(((C8029w0) this.f17516a).mo20583d()));
        }
        C15567i c = mo20588c();
        if (this.f17516a instanceof C8035y0) {
            if (c.mo55344c() == 1) {
                return new C8000n(true, i, c.mo55342a(0));
            }
            C7988j jVar = C7978g.f17464a;
            return new C8000n(false, i, c.mo55344c() < 1 ? C7978g.f17464a : new C7988j(c));
        } else if (c.mo55344c() == 1) {
            return new C7992k0(true, i, c.mo55342a(0));
        } else {
            C7976f0 f0Var = C8022u.f17506a;
            return new C7992k0(false, i, c.mo55344c() < 1 ? C8022u.f17506a : new C8020t0(c));
        }
    }

    /* renamed from: b */
    public final C7984h1 mo20587b() {
        int read = this.f17516a.read();
        if (read == -1) {
            return null;
        }
        InputStream inputStream = this.f17516a;
        boolean z = false;
        if (inputStream instanceof C8035y0) {
            C8035y0 y0Var = (C8035y0) inputStream;
            y0Var.f17523g = false;
            y0Var.mo20590d();
        }
        int a = C7996l1.m16062a(this.f17516a, read);
        if ((read & 32) != 0) {
            z = true;
        }
        int g = C7996l1.m16066g(this.f17516a, this.f17517b);
        if (g >= 0) {
            C8029w0 w0Var = new C8029w0(this.f17516a, g);
            if ((read & 64) != 0) {
                return new C8007p0(a, z, w0Var.mo20583d());
            }
            if ((read & 128) != 0) {
                return new C8003o(z, a, new C8033x1(w0Var));
            }
            if (z) {
                if (a == 4) {
                    return new C7985i(new C8033x1(w0Var));
                }
                if (a == 8) {
                    return new C8019t(new C8033x1(w0Var));
                }
                if (a == 16) {
                    return new C7979g0(new C8033x1(w0Var));
                }
                if (a == 17) {
                    return new C7986i0(new C8033x1(w0Var));
                }
                throw new IOException(C0069a.m175f("unknown tag ", a, " encountered"));
            } else if (a == 4) {
                return new C7967c0(w0Var);
            } else {
                try {
                    return C7996l1.m16064e(a, w0Var, this.f17518c);
                } catch (IllegalArgumentException e) {
                    throw new C6147i("corrupted stream detected", e);
                }
            }
        } else if (z) {
            C8033x1 x1Var = new C8033x1(new C8035y0(this.f17516a, this.f17517b), this.f17517b);
            if ((read & 64) != 0) {
                return new C7975f(a, x1Var);
            }
            if ((read & 128) != 0) {
                return new C8003o(true, a, x1Var);
            }
            if (a == 4) {
                return new C7985i(x1Var);
            }
            if (a == 8) {
                return new C8019t(x1Var);
            }
            if (a == 16) {
                return new C7991k(x1Var);
            }
            if (a == 17) {
                return new C7997m(x1Var);
            }
            StringBuilder h = C0072d.m201h("unknown BER object encountered: 0x");
            h.append(Integer.toHexString(a));
            throw new C6147i(h.toString());
        } else {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
    }

    /* renamed from: c */
    public final C15567i mo20588c() {
        C15567i iVar = new C15567i(2);
        while (true) {
            C7984h1 b = mo20587b();
            if (b == null) {
                return iVar;
            }
            iVar.mo55343b(b instanceof C8032x0 ? ((C8032x0) b).mo20527e() : b.mo12996i());
        }
    }
}
