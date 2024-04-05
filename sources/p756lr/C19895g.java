package p756lr;

import java.io.OutputStream;
import kotlin.jvm.internal.C19383o;

/* renamed from: lr.g */
public final class C19895g extends OutputStream {

    /* renamed from: b */
    public final /* synthetic */ C19893f f43878b;

    public C19895g(C19893f fVar) {
        this.f43878b = fVar;
    }

    public final void close() {
    }

    public final void flush() {
    }

    public final String toString() {
        return this.f43878b + ".outputStream()";
    }

    public final void write(int i) {
        this.f43878b.mo72771x0(i);
    }

    public final void write(byte[] bArr, int i, int i2) {
        C19383o.m32797g(bArr, "data");
        this.f43878b.mo72736f0(i, i2, bArr);
    }
}
