package p036c5;

import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: c5.a */
public final class C4410a {

    /* renamed from: a */
    public static final AtomicReference<byte[]> f9682a = new AtomicReference<>();

    /* renamed from: c5.a$b */
    public static final class C4412b {

        /* renamed from: a */
        public final int f9685a;

        /* renamed from: b */
        public final int f9686b;

        /* renamed from: c */
        public final byte[] f9687c;

        public C4412b(byte[] bArr, int i, int i2) {
            this.f9687c = bArr;
            this.f9685a = i;
            this.f9686b = i2;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:9|10|11|12|13|14|15) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x002d */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004f A[SYNTHETIC, Splitter:B:29:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0054 A[SYNTHETIC, Splitter:B:33:0x0054] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.MappedByteBuffer m10111a(java.io.File r9) throws java.io.IOException {
        /*
            r0 = 0
            long r5 = r9.length()     // Catch:{ all -> 0x004b }
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0043
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x003b
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch:{ all -> 0x004b }
            java.lang.String r1 = "r"
            r7.<init>(r9, r1)     // Catch:{ all -> 0x004b }
            java.nio.channels.FileChannel r9 = r7.getChannel()     // Catch:{ all -> 0x0033 }
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0031 }
            r3 = 0
            r1 = r9
            java.nio.MappedByteBuffer r0 = r1.map(r2, r3, r5)     // Catch:{ all -> 0x0031 }
            java.nio.MappedByteBuffer r0 = r0.load()     // Catch:{ all -> 0x0031 }
            r9.close()     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            r7.close()     // Catch:{ IOException -> 0x0030 }
        L_0x0030:
            return r0
        L_0x0031:
            r0 = move-exception
            goto L_0x0037
        L_0x0033:
            r9 = move-exception
            r8 = r0
            r0 = r9
            r9 = r8
        L_0x0037:
            r8 = r0
            r0 = r9
            r9 = r8
            goto L_0x004d
        L_0x003b:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x004b }
            java.lang.String r1 = "File unsuitable for memory mapping"
            r9.<init>(r1)     // Catch:{ all -> 0x004b }
            throw r9     // Catch:{ all -> 0x004b }
        L_0x0043:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x004b }
            java.lang.String r1 = "File too large to map into memory"
            r9.<init>(r1)     // Catch:{ all -> 0x004b }
            throw r9     // Catch:{ all -> 0x004b }
        L_0x004b:
            r9 = move-exception
            r7 = r0
        L_0x004d:
            if (r0 == 0) goto L_0x0052
            r0.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            if (r7 == 0) goto L_0x0057
            r7.close()     // Catch:{ IOException -> 0x0057 }
        L_0x0057:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p036c5.C4410a.m10111a(java.io.File):java.nio.MappedByteBuffer");
    }

    /* renamed from: b */
    public static ByteBuffer m10112b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(PrimitiveArrayBuilder.SMALL_CHUNK_SIZE);
        byte[] andSet = f9682a.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new byte[PrimitiveArrayBuilder.SMALL_CHUNK_SIZE];
        }
        while (true) {
            int read = inputStream.read(andSet);
            if (read >= 0) {
                byteArrayOutputStream.write(andSet, 0, read);
            } else {
                f9682a.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return (ByteBuffer) ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:1|2|3|4|5|6|7|8|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c A[SYNTHETIC, Splitter:B:14:0x002c] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0031 A[SYNTHETIC, Splitter:B:18:0x0031] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m10113c(java.nio.ByteBuffer r4, java.io.File r5) throws java.io.IOException {
        /*
            r0 = 0
            java.nio.Buffer r1 = r4.position(r0)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            r1 = 0
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0028 }
            java.lang.String r3 = "rw"
            r2.<init>(r5, r3)     // Catch:{ all -> 0x0028 }
            java.nio.channels.FileChannel r1 = r2.getChannel()     // Catch:{ all -> 0x0026 }
            r1.write(r4)     // Catch:{ all -> 0x0026 }
            r1.force(r0)     // Catch:{ all -> 0x0026 }
            r1.close()     // Catch:{ all -> 0x0026 }
            r2.close()     // Catch:{ all -> 0x0026 }
            r1.close()     // Catch:{ IOException -> 0x0022 }
        L_0x0022:
            r2.close()     // Catch:{ IOException -> 0x0025 }
        L_0x0025:
            return
        L_0x0026:
            r4 = move-exception
            goto L_0x002a
        L_0x0028:
            r4 = move-exception
            r2 = r1
        L_0x002a:
            if (r1 == 0) goto L_0x002f
            r1.close()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            if (r2 == 0) goto L_0x0034
            r2.close()     // Catch:{ IOException -> 0x0034 }
        L_0x0034:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p036c5.C4410a.m10113c(java.nio.ByteBuffer, java.io.File):void");
    }

    /* renamed from: c5.a$a */
    public static class C4411a extends InputStream {

        /* renamed from: b */
        public final ByteBuffer f9683b;

        /* renamed from: c */
        public int f9684c = -1;

        public C4411a(ByteBuffer byteBuffer) {
            this.f9683b = byteBuffer;
        }

        public final int available() {
            return this.f9683b.remaining();
        }

        public final synchronized void mark(int i) {
            this.f9684c = this.f9683b.position();
        }

        public final boolean markSupported() {
            return true;
        }

        public final int read() {
            if (!this.f9683b.hasRemaining()) {
                return -1;
            }
            return this.f9683b.get() & 255;
        }

        public final synchronized void reset() throws IOException {
            int i = this.f9684c;
            if (i != -1) {
                this.f9683b.position(i);
            } else {
                throw new IOException("Cannot reset to unset mark position");
            }
        }

        public final long skip(long j) {
            if (!this.f9683b.hasRemaining()) {
                return -1;
            }
            long min = Math.min(j, (long) available());
            ByteBuffer byteBuffer = this.f9683b;
            byteBuffer.position((int) (((long) byteBuffer.position()) + min));
            return min;
        }

        public final int read(byte[] bArr, int i, int i2) {
            if (!this.f9683b.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i2, available());
            this.f9683b.get(bArr, i, min);
            return min;
        }
    }
}
