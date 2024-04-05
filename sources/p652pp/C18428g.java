package p652pp;

import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: pp.g */
public final class C18428g extends OutputStream {

    /* renamed from: b */
    public final int f40521b = PrimitiveArrayBuilder.MAX_CHUNK_SIZE;

    /* renamed from: c */
    public ByteBuffer f40522c;

    public C18428g(int i) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
        this.f40522c = allocateDirect;
        allocateDirect.clear();
    }

    /* renamed from: a */
    public final synchronized void mo69955a() throws IOException {
        write(13);
        write(10);
    }

    /* renamed from: b */
    public final synchronized void mo69956b(int i) {
        if (i > this.f40522c.capacity()) {
            ByteBuffer byteBuffer = this.f40522c;
            int position = byteBuffer.position();
            int i2 = this.f40521b;
            this.f40522c = ByteBuffer.allocateDirect(((i / i2) + 1) * i2);
            byteBuffer.clear();
            this.f40522c.clear();
            this.f40522c.put(byteBuffer);
            this.f40522c.position(position);
        }
    }

    /* renamed from: d */
    public final synchronized void mo69957d(String str) throws IOException {
        write(str.getBytes("UTF-8"));
    }

    public final synchronized void write(int i) throws IOException {
        if (this.f40522c.position() + 1 > this.f40522c.capacity()) {
            mo69956b(this.f40522c.capacity() + 1);
        }
        this.f40522c.put((byte) i);
    }

    public final synchronized void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.f40522c.position() + i2 > this.f40522c.capacity()) {
            mo69956b(this.f40522c.capacity() + i2);
        }
        this.f40522c.put(bArr, i, i2);
    }

    public final synchronized void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
