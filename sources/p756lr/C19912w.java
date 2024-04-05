package p756lr;

import android.support.p013v4.media.C0072d;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.C19383o;
import okio.ByteString;

/* renamed from: lr.w */
public final class C19912w implements C19896h {

    /* renamed from: b */
    public final C19893f f43913b = new C19893f();

    /* renamed from: c */
    public boolean f43914c;

    /* renamed from: d */
    public final C19882a0 f43915d;

    public C19912w(C19882a0 a0Var) {
        C19383o.m32797g(a0Var, "sink");
        this.f43915d = a0Var;
    }

    /* renamed from: A */
    public final C19896h mo72706A() {
        if (!this.f43914c) {
            long d = this.f43913b.mo72731d();
            if (d > 0) {
                this.f43915d.mo68512O(this.f43913b, d);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: H */
    public final C19896h mo72716H(String str) {
        C19383o.m32797g(str, "string");
        if (!this.f43914c) {
            this.f43913b.mo72715G0(str);
            mo72706A();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: O */
    public final void mo68512O(C19893f fVar, long j) {
        C19383o.m32797g(fVar, "source");
        if (!this.f43914c) {
            this.f43913b.mo68512O(fVar, j);
            mo72706A();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: V */
    public final C19896h mo72724V(long j) {
        if (!this.f43914c) {
            this.f43913b.mo72707A0(j);
            mo72706A();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: a */
    public final void mo72792a(int i) {
        if (!this.f43914c) {
            this.f43913b.mo72711C0(((i & 255) << 24) | ((-16777216 & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8));
            mo72706A();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final void close() {
        if (!this.f43914c) {
            Throwable th = null;
            try {
                C19893f fVar = this.f43913b;
                long j = fVar.f43876c;
                if (j > 0) {
                    this.f43915d.mo68512O(fVar, j);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f43915d.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f43914c = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public final void flush() {
        if (!this.f43914c) {
            C19893f fVar = this.f43913b;
            long j = fVar.f43876c;
            if (j > 0) {
                this.f43915d.mo68512O(fVar, j);
            }
            this.f43915d.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final boolean isOpen() {
        return !this.f43914c;
    }

    /* renamed from: l */
    public final C19893f mo72745l() {
        return this.f43913b;
    }

    /* renamed from: l0 */
    public final C19896h mo72746l0(long j) {
        if (!this.f43914c) {
            this.f43913b.mo72709B0(j);
            mo72706A();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: m */
    public final C19890d0 mo68515m() {
        return this.f43915d.mo68515m();
    }

    /* renamed from: o0 */
    public final C19896h mo72748o0(int i, int i2, String str) {
        C19383o.m32797g(str, "string");
        if (!this.f43914c) {
            this.f43913b.mo72714F0(i, i2, str);
            mo72706A();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: s0 */
    public final C19896h mo72757s0(ByteString byteString) {
        C19383o.m32797g(byteString, "byteString");
        if (!this.f43914c) {
            this.f43913b.mo72747m0(byteString);
            mo72706A();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("buffer(");
        h.append(this.f43915d);
        h.append(')');
        return h.toString();
    }

    /* renamed from: v0 */
    public final C19896h mo72762v0(int i, int i2, byte[] bArr) {
        C19383o.m32797g(bArr, "source");
        if (!this.f43914c) {
            this.f43913b.mo72736f0(i, i2, bArr);
            mo72706A();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: w0 */
    public final long mo72764w0(C19888c0 c0Var) {
        long j = 0;
        while (true) {
            long J = ((C19905q) c0Var).mo68544J(this.f43913b, (long) 8192);
            if (J == -1) {
                return j;
            }
            j += J;
            mo72706A();
        }
    }

    public final int write(ByteBuffer byteBuffer) {
        C19383o.m32797g(byteBuffer, "source");
        if (!this.f43914c) {
            int write = this.f43913b.write(byteBuffer);
            mo72706A();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final C19896h writeByte(int i) {
        if (!this.f43914c) {
            this.f43913b.mo72771x0(i);
            mo72706A();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final C19896h writeInt(int i) {
        if (!this.f43914c) {
            this.f43913b.mo72711C0(i);
            mo72706A();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final C19896h writeShort(int i) {
        if (!this.f43914c) {
            this.f43913b.mo72712D0(i);
            mo72706A();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final C19896h write(byte[] bArr) {
        C19383o.m32797g(bArr, "source");
        if (!this.f43914c) {
            this.f43913b.write(bArr);
            mo72706A();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }
}
