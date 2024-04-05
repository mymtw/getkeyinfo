package p244t5;

import android.support.p013v4.media.C0069a;
import androidx.recyclerview.widget.RecyclerView;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.C6147i;
import com.google.android.play.core.appupdate.C15567i;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import p003a2.C0015b;
import p244t5.C7959a;
import p267v7.C8212a;
import p610kp.C18161c;

/* renamed from: t5.l1 */
public final class C7996l1 extends FilterInputStream {

    /* renamed from: b */
    public final int f17484b;

    /* renamed from: c */
    public final boolean f17485c;

    /* renamed from: d */
    public final byte[][] f17486d;

    public C7996l1() {
        throw null;
    }

    public C7996l1(InputStream inputStream) {
        this(inputStream, C7974e1.m15997b(inputStream), false);
    }

    public C7996l1(InputStream inputStream, int i, boolean z) {
        super(inputStream);
        this.f17484b = i;
        this.f17485c = z;
        this.f17486d = new byte[11][];
    }

    /* renamed from: a */
    public static int m16062a(InputStream inputStream, int i) {
        int i2 = i & 31;
        if (i2 != 31) {
            return i2;
        }
        int i3 = 0;
        int read = inputStream.read();
        if ((read & 127) != 0) {
            while (read >= 0 && (read & 128) != 0) {
                i3 = (i3 | (read & 127)) << 7;
                read = inputStream.read();
            }
            if (read >= 0) {
                return i3 | (read & 127);
            }
            throw new EOFException("EOF found inside tag value.");
        }
        throw new IOException("corrupted stream - invalid high tag number found");
    }

    /* renamed from: b */
    public static C15567i m16063b(C8029w0 w0Var) {
        C7996l1 l1Var = new C7996l1((InputStream) w0Var);
        C15567i iVar = new C15567i(2);
        while (true) {
            C8018s1 h = l1Var.mo20554h();
            if (h == null) {
                return iVar;
            }
            iVar.mo55343b(h);
        }
    }

    /* renamed from: e */
    public static C8018s1 m16064e(int i, C8029w0 w0Var, byte[][] bArr) {
        int read;
        if (i == 10) {
            byte[] f = m16065f(w0Var, bArr);
            if (f.length > 1) {
                return new C7987i1(f);
            }
            if (f.length != 0) {
                byte b = f[0] & 255;
                C7987i1[] i1VarArr = C7987i1.f17473c;
                if (b >= 12) {
                    return new C7987i1(C8212a.m16504k(f));
                }
                C7987i1 i1Var = i1VarArr[b];
                if (i1Var == null) {
                    i1Var = new C7987i1(C8212a.m16504k(f));
                    i1VarArr[b] = i1Var;
                }
                return i1Var;
            }
            throw new IllegalArgumentException("ENUMERATED has zero length");
        } else if (i == 12) {
            return new C7995l0(w0Var.mo20583d());
        } else {
            if (i != 30) {
                switch (i) {
                    case 1:
                        byte[] f2 = m16065f(w0Var, bArr);
                        byte[] bArr2 = C7977f1.f17459c;
                        if (f2.length == 1) {
                            byte b2 = f2[0];
                            return b2 == 0 ? C7977f1.f17461e : (b2 & 255) == 255 ? C7977f1.f17462f : new C7977f1(f2);
                        }
                        throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
                    case 2:
                        return new C7999m1(w0Var.mo20583d(), false);
                    case 3:
                        int i2 = w0Var.f17514e;
                        if (i2 >= 1) {
                            int read2 = w0Var.read();
                            int i3 = i2 - 1;
                            byte[] bArr3 = new byte[i3];
                            if (i3 != 0) {
                                if (C18161c.m30659c(w0Var, bArr3) != i3) {
                                    throw new EOFException("EOF encountered in middle of BIT STRING");
                                } else if (read2 > 0 && read2 < 8) {
                                    byte b3 = bArr3[i3 - 1];
                                    if (b3 != ((byte) ((255 << read2) & b3))) {
                                        return new C8010q0(read2, bArr3);
                                    }
                                }
                            }
                            return new C8012r(read2, bArr3);
                        }
                        throw new IllegalArgumentException("truncated BIT STRING detected");
                    case 4:
                        return new C7964b0(w0Var.mo20583d());
                    case 5:
                        return C8037z.f17524b;
                    case 6:
                        byte[] f3 = m16065f(w0Var, bArr);
                        ConcurrentHashMap concurrentHashMap = C7959a.f17433d;
                        C7959a aVar = (C7959a) C7959a.f17433d.get(new C7959a.C7960a(f3));
                        return aVar == null ? new C7959a(f3) : aVar;
                    default:
                        switch (i) {
                            case 18:
                                return new C7961a0(w0Var.mo20583d());
                            case 19:
                                return new C7973e0(w0Var.mo20583d());
                            case 20:
                                return new C7989j0(w0Var.mo20583d());
                            case 21:
                                return new C8001n0(w0Var.mo20583d());
                            case 22:
                                return new C8034y(w0Var.mo20583d());
                            case 23:
                                return new C7969d(w0Var.mo20583d());
                            case 24:
                                return new C7993k1(w0Var.mo20583d());
                            case 25:
                                return new C8031x(w0Var.mo20583d());
                            case 26:
                                return new C8004o0(w0Var.mo20583d());
                            case 27:
                                return new C8025v(w0Var.mo20583d());
                            case 28:
                                return new C7998m0(w0Var.mo20583d());
                            default:
                                throw new IOException(C0069a.m175f("unknown tag ", i, " encountered"));
                        }
                }
            } else {
                int i4 = w0Var.f17514e / 2;
                char[] cArr = new char[i4];
                for (int i5 = 0; i5 < i4; i5++) {
                    int read3 = w0Var.read();
                    if (read3 < 0 || (read = w0Var.read()) < 0) {
                        break;
                    }
                    cArr[i5] = (char) ((read3 << 8) | (read & 255));
                }
                return new C8009q(cArr);
            }
        }
    }

    /* renamed from: f */
    public static byte[] m16065f(C8029w0 w0Var, byte[][] bArr) {
        int i = w0Var.f17514e;
        if (i >= bArr.length) {
            return w0Var.mo20583d();
        }
        byte[] bArr2 = bArr[i];
        if (bArr2 == null) {
            bArr2 = new byte[i];
            bArr[i] = bArr2;
        }
        C18161c.m30659c(w0Var, bArr2);
        return bArr2;
    }

    /* renamed from: g */
    public static int m16066g(InputStream inputStream, int i) {
        int read = inputStream.read();
        if (read < 0) {
            throw new EOFException("EOF found when length expected");
        } else if (read == 128) {
            return -1;
        } else {
            if (read <= 127) {
                return read;
            }
            int i2 = read & 127;
            if (i2 <= 4) {
                int i3 = 0;
                int i4 = 0;
                while (i4 < i2) {
                    int read2 = inputStream.read();
                    if (read2 >= 0) {
                        i3 = (i3 << 8) + read2;
                        i4++;
                    } else {
                        throw new EOFException("EOF found reading length");
                    }
                }
                if (i3 < 0) {
                    throw new IOException("corrupted stream - negative length found");
                } else if (i3 < i) {
                    return i3;
                } else {
                    throw new IOException("corrupted stream - out of bounds length found");
                }
            } else {
                throw new IOException(C0015b.m88g("DER length more than 4 bytes: ", i2));
            }
        }
    }

    /* renamed from: d */
    public final C8018s1 mo20553d(int i, int i2, int i3) {
        boolean z = (i & 32) != 0;
        C8029w0 w0Var = new C8029w0(this, i3);
        if ((i & 64) != 0) {
            return new C8007p0(i2, z, w0Var.mo20583d());
        }
        if ((i & 128) != 0) {
            return new C8033x1(w0Var).mo20586a(i2, z);
        }
        if (!z) {
            return m16064e(i2, w0Var, this.f17486d);
        }
        if (i2 == 4) {
            C15567i b = m16063b(w0Var);
            int c = b.mo55344c();
            C8008p1[] p1VarArr = new C8008p1[c];
            for (int i4 = 0; i4 != c; i4++) {
                p1VarArr[i4] = (C8008p1) b.mo55342a(i4);
            }
            return new C7981h(p1VarArr);
        } else if (i2 == 8) {
            return new C8013r0(m16063b(w0Var));
        } else {
            if (i2 != 16) {
                if (i2 == 17) {
                    C15567i b2 = m16063b(w0Var);
                    C7976f0 f0Var = C8022u.f17506a;
                    return b2.mo55344c() < 1 ? C8022u.f17507b : new C8023u0(b2);
                }
                throw new IOException(C0069a.m175f("unknown tag ", i2, " encountered"));
            } else if (this.f17485c) {
                return new C7965b1(w0Var.mo20583d());
            } else {
                C15567i b3 = m16063b(w0Var);
                C7976f0 f0Var2 = C8022u.f17506a;
                return b3.mo55344c() < 1 ? C8022u.f17506a : new C8020t0(b3);
            }
        }
    }

    /* renamed from: h */
    public final C8018s1 mo20554h() {
        int read = read();
        if (read > 0) {
            int a = m16062a(this, read);
            boolean z = (read & 32) != 0;
            int g = m16066g(this, this.f17484b);
            if (g >= 0) {
                try {
                    return mo20553d(read, a, g);
                } catch (IllegalArgumentException e) {
                    throw new C6147i("corrupted stream detected", e);
                }
            } else if (z) {
                C8033x1 x1Var = new C8033x1(new C8035y0(this, this.f17484b), this.f17484b);
                if ((read & 64) != 0) {
                    return new C7972e(a, x1Var.mo20588c());
                }
                if ((read & 128) != 0) {
                    return x1Var.mo20586a(a, true);
                }
                if (a == 4) {
                    C8006p pVar = new C8006p(x1Var);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT];
                    while (true) {
                        int read2 = pVar.read(bArr, 0, RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT);
                        if (read2 < 0) {
                            return new C7981h(byteArrayOutputStream.toByteArray(), (C8008p1[]) null);
                        }
                        byteArrayOutputStream.write(bArr, 0, read2);
                    }
                } else if (a == 8) {
                    try {
                        return new C8013r0(x1Var.mo20588c());
                    } catch (IllegalArgumentException e2) {
                        throw new C6147i(e2.getMessage(), e2);
                    }
                } else if (a == 16) {
                    return new C7988j(x1Var.mo20588c());
                } else {
                    if (a == 17) {
                        return new C7994l(x1Var.mo20588c());
                    }
                    throw new IOException("unknown BER object encountered");
                }
            } else {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
        } else if (read != 0) {
            return null;
        } else {
            throw new IOException("unexpected end-of-contents marker");
        }
    }

    public C7996l1(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length, false);
    }
}
