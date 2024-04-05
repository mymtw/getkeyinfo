package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.C2592i;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

final class NioByteString extends ByteString.LeafByteString {
    /* access modifiers changed from: private */
    public final ByteBuffer buffer;

    public NioByteString(ByteBuffer byteBuffer) {
        Charset charset = C2631w.f5973a;
        if (byteBuffer != null) {
            this.buffer = byteBuffer.slice().order(ByteOrder.nativeOrder());
            return;
        }
        throw new NullPointerException("buffer");
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private Object writeReplace() {
        return ByteString.copyFrom(this.buffer.slice());
    }

    public ByteBuffer asReadOnlyByteBuffer() {
        return this.buffer.asReadOnlyBuffer();
    }

    public List<ByteBuffer> asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    public byte byteAt(int i) {
        try {
            return this.buffer.get(i);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    /* renamed from: c */
    public final ByteBuffer mo9504c(int i, int i2) {
        if (i < this.buffer.position() || i2 > this.buffer.limit() || i > i2) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        }
        ByteBuffer slice = this.buffer.slice();
        slice.position(i - this.buffer.position());
        slice.limit(i2 - this.buffer.position());
        return slice;
    }

    public void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.buffer.slice());
    }

    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        ByteBuffer slice = this.buffer.slice();
        slice.position(i);
        slice.get(bArr, i2, i3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (size() != byteString.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        return obj instanceof NioByteString ? this.buffer.equals(((NioByteString) obj).buffer) : obj instanceof RopeByteString ? obj.equals(this) : this.buffer.equals(byteString.asReadOnlyByteBuffer());
    }

    public boolean equalsRange(ByteString byteString, int i, int i2) {
        return substring(0, i2).equals(byteString.substring(i, i2 + i));
    }

    public byte internalByteAt(int i) {
        return byteAt(i);
    }

    public boolean isValidUtf8() {
        ByteBuffer byteBuffer = this.buffer;
        return Utf8.f5815a.mo9532e(0, byteBuffer.position(), byteBuffer.remaining(), byteBuffer) == 0;
    }

    public C2592i newCodedInput() {
        ByteBuffer byteBuffer = this.buffer;
        if (byteBuffer.hasArray()) {
            return C2592i.m5903f(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), true);
        } else if (byteBuffer.isDirect() && C2586h1.f5880e) {
            return new C2592i.C2595c(byteBuffer);
        } else {
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.duplicate().get(bArr);
            return C2592i.m5903f(bArr, 0, remaining, true);
        }
    }

    public InputStream newInput() {
        return new C2526a(this);
    }

    public int partialHash(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.buffer.get(i4);
        }
        return i;
    }

    public int partialIsValidUtf8(int i, int i2, int i3) {
        ByteBuffer byteBuffer = this.buffer;
        return Utf8.f5815a.mo9532e(i, i2, i3 + i2, byteBuffer);
    }

    public int size() {
        return this.buffer.remaining();
    }

    public ByteString substring(int i, int i2) {
        try {
            return new NioByteString(mo9504c(i, i2));
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    public String toStringInternal(Charset charset) {
        int i;
        int i2;
        byte[] bArr;
        if (this.buffer.hasArray()) {
            bArr = this.buffer.array();
            i = this.buffer.position() + this.buffer.arrayOffset();
            i2 = this.buffer.remaining();
        } else {
            bArr = toByteArray();
            i = 0;
            i2 = bArr.length;
        }
        return new String(bArr, i, i2, charset);
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: byte[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0098, code lost:
        if (r3 != false) goto L_0x009a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c A[Catch:{ all -> 0x00c2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeToInternal(java.io.OutputStream r9, int r10, int r11) throws java.io.IOException {
        /*
            r8 = this;
            java.nio.ByteBuffer r0 = r8.buffer
            boolean r0 = r0.hasArray()
            if (r0 == 0) goto L_0x0020
            java.nio.ByteBuffer r0 = r8.buffer
            int r0 = r0.arrayOffset()
            java.nio.ByteBuffer r1 = r8.buffer
            int r1 = r1.position()
            int r1 = r1 + r0
            int r1 = r1 + r10
            java.nio.ByteBuffer r10 = r8.buffer
            byte[] r10 = r10.array()
            r9.write(r10, r1, r11)
            return
        L_0x0020:
            int r11 = r11 + r10
            java.nio.ByteBuffer r10 = r8.mo9504c(r10, r11)
            java.lang.ThreadLocal<java.lang.ref.SoftReference<byte[]>> r11 = androidx.datastore.preferences.protobuf.C2579g.f5868a
            int r11 = r10.position()
            boolean r0 = r10.hasArray()     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x0047
            byte[] r0 = r10.array()     // Catch:{ all -> 0x00c2 }
            int r1 = r10.arrayOffset()     // Catch:{ all -> 0x00c2 }
            int r2 = r10.position()     // Catch:{ all -> 0x00c2 }
            int r1 = r1 + r2
            int r2 = r10.remaining()     // Catch:{ all -> 0x00c2 }
            r9.write(r0, r1, r2)     // Catch:{ all -> 0x00c2 }
            goto L_0x00be
        L_0x0047:
            long r0 = androidx.datastore.preferences.protobuf.C2579g.f5870c     // Catch:{ all -> 0x00c2 }
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            r5 = 0
            if (r2 < 0) goto L_0x0069
            java.lang.Class<?> r2 = androidx.datastore.preferences.protobuf.C2579g.f5869b     // Catch:{ all -> 0x00c2 }
            boolean r2 = r2.isInstance(r9)     // Catch:{ all -> 0x00c2 }
            if (r2 == 0) goto L_0x0069
            java.lang.Object r0 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r0, r9)     // Catch:{ ClassCastException -> 0x0061 }
            java.nio.channels.WritableByteChannel r0 = (java.nio.channels.WritableByteChannel) r0     // Catch:{ ClassCastException -> 0x0061 }
            goto L_0x0062
        L_0x0061:
            r0 = r4
        L_0x0062:
            if (r0 == 0) goto L_0x0069
            r0.write(r10)     // Catch:{ all -> 0x00c2 }
            r0 = r3
            goto L_0x006a
        L_0x0069:
            r0 = r5
        L_0x006a:
            if (r0 != 0) goto L_0x00be
            int r0 = r10.remaining()     // Catch:{ all -> 0x00c2 }
            r1 = 1024(0x400, float:1.435E-42)
            int r0 = java.lang.Math.max(r0, r1)     // Catch:{ all -> 0x00c2 }
            java.lang.ThreadLocal<java.lang.ref.SoftReference<byte[]>> r1 = androidx.datastore.preferences.protobuf.C2579g.f5868a     // Catch:{ all -> 0x00c2 }
            java.lang.Object r2 = r1.get()     // Catch:{ all -> 0x00c2 }
            java.lang.ref.SoftReference r2 = (java.lang.ref.SoftReference) r2     // Catch:{ all -> 0x00c2 }
            if (r2 != 0) goto L_0x0081
            goto L_0x0088
        L_0x0081:
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x00c2 }
            r4 = r2
            byte[] r4 = (byte[]) r4     // Catch:{ all -> 0x00c2 }
        L_0x0088:
            if (r4 == 0) goto L_0x009a
            int r2 = r4.length     // Catch:{ all -> 0x00c2 }
            if (r2 >= r0) goto L_0x0097
            float r2 = (float) r2     // Catch:{ all -> 0x00c2 }
            float r6 = (float) r0     // Catch:{ all -> 0x00c2 }
            r7 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 * r7
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r3 = r5
        L_0x0098:
            if (r3 == 0) goto L_0x00a8
        L_0x009a:
            byte[] r4 = new byte[r0]     // Catch:{ all -> 0x00c2 }
            r2 = 16384(0x4000, float:2.2959E-41)
            if (r0 > r2) goto L_0x00a8
            java.lang.ref.SoftReference r0 = new java.lang.ref.SoftReference     // Catch:{ all -> 0x00c2 }
            r0.<init>(r4)     // Catch:{ all -> 0x00c2 }
            r1.set(r0)     // Catch:{ all -> 0x00c2 }
        L_0x00a8:
            boolean r0 = r10.hasRemaining()     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x00be
            int r0 = r10.remaining()     // Catch:{ all -> 0x00c2 }
            int r1 = r4.length     // Catch:{ all -> 0x00c2 }
            int r0 = java.lang.Math.min(r0, r1)     // Catch:{ all -> 0x00c2 }
            r10.get(r4, r5, r0)     // Catch:{ all -> 0x00c2 }
            r9.write(r4, r5, r0)     // Catch:{ all -> 0x00c2 }
            goto L_0x00a8
        L_0x00be:
            r10.position(r11)
            return
        L_0x00c2:
            r9 = move-exception
            r10.position(r11)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.NioByteString.writeToInternal(java.io.OutputStream, int, int):void");
    }

    /* renamed from: androidx.datastore.preferences.protobuf.NioByteString$a */
    public class C2526a extends InputStream {

        /* renamed from: b */
        public final ByteBuffer f5800b;

        public C2526a(NioByteString nioByteString) {
            this.f5800b = nioByteString.buffer.slice();
        }

        public final int available() throws IOException {
            return this.f5800b.remaining();
        }

        public final void mark(int i) {
            this.f5800b.mark();
        }

        public final boolean markSupported() {
            return true;
        }

        public final int read() throws IOException {
            if (!this.f5800b.hasRemaining()) {
                return -1;
            }
            return this.f5800b.get() & 255;
        }

        public final void reset() throws IOException {
            try {
                this.f5800b.reset();
            } catch (InvalidMarkException e) {
                throw new IOException(e);
            }
        }

        public final int read(byte[] bArr, int i, int i2) throws IOException {
            if (!this.f5800b.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i2, this.f5800b.remaining());
            this.f5800b.get(bArr, i, min);
            return min;
        }
    }

    public void writeTo(C2584h hVar) throws IOException {
        hVar.mo9446b(this.buffer.slice());
    }
}
