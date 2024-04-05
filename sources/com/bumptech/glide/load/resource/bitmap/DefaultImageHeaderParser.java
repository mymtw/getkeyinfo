package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import androidx.activity.C0114h;
import androidx.compose.animation.C0472h;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.bitmap_recycle.C5996b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* renamed from: a */
    public static final byte[] f13044a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b */
    public static final int[] f13045b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public interface Reader {

        public static final class EndOfFileException extends IOException {
            private static final long serialVersionUID = 1;

            public EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        /* renamed from: a */
        int mo17006a() throws IOException;

        /* renamed from: b */
        int mo17007b(int i, byte[] bArr) throws IOException;

        /* renamed from: c */
        short mo17008c() throws IOException;

        long skip(long j) throws IOException;
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$a */
    public static final class C6059a implements Reader {

        /* renamed from: a */
        public final ByteBuffer f13046a;

        public C6059a(ByteBuffer byteBuffer) {
            this.f13046a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public final int mo17006a() throws Reader.EndOfFileException {
            return (mo17008c() << 8) | mo17008c();
        }

        /* renamed from: b */
        public final int mo17007b(int i, byte[] bArr) {
            int min = Math.min(i, this.f13046a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f13046a.get(bArr, 0, min);
            return min;
        }

        /* renamed from: c */
        public final short mo17008c() throws Reader.EndOfFileException {
            if (this.f13046a.remaining() >= 1) {
                return (short) (this.f13046a.get() & 255);
            }
            throw new Reader.EndOfFileException();
        }

        public final long skip(long j) {
            int min = (int) Math.min((long) this.f13046a.remaining(), j);
            ByteBuffer byteBuffer = this.f13046a;
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$b */
    public static final class C6060b {

        /* renamed from: a */
        public final ByteBuffer f13047a;

        public C6060b(int i, byte[] bArr) {
            this.f13047a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* renamed from: a */
        public final short mo17010a(int i) {
            if (this.f13047a.remaining() - i >= 2) {
                return this.f13047a.getShort(i);
            }
            return -1;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$c */
    public static final class C6061c implements Reader {

        /* renamed from: a */
        public final InputStream f13048a;

        public C6061c(InputStream inputStream) {
            this.f13048a = inputStream;
        }

        /* renamed from: a */
        public final int mo17006a() throws IOException {
            return (mo17008c() << 8) | mo17008c();
        }

        /* renamed from: b */
        public final int mo17007b(int i, byte[] bArr) throws IOException {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.f13048a.read(bArr, i2, i - i2)) != -1) {
                i2 += i3;
            }
            if (i2 != 0 || i3 != -1) {
                return i2;
            }
            throw new Reader.EndOfFileException();
        }

        /* renamed from: c */
        public final short mo17008c() throws IOException {
            int read = this.f13048a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new Reader.EndOfFileException();
        }

        public final long skip(long j) throws IOException {
            if (j < 0) {
                return 0;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f13048a.skip(j2);
                if (skip <= 0) {
                    if (this.f13048a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }
    }

    /* renamed from: e */
    public static int m12010e(Reader reader, C5996b bVar) throws IOException {
        byte[] bArr;
        try {
            int a = reader.mo17006a();
            if (!((a & 65496) == 65496 || a == 19789 || a == 18761)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + a);
                }
                return -1;
            }
            int g = m12012g(reader);
            if (g == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            bArr = (byte[]) bVar.mo16914c(g, byte[].class);
            int h = m12013h(reader, bArr, g);
            bVar.put(bArr);
            return h;
        } catch (Reader.EndOfFileException unused) {
            return -1;
        } catch (Throwable th) {
            bVar.put(bArr);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        return com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0039 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bumptech.glide.load.ImageHeaderParser.ImageType m12011f(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader r7) throws java.io.IOException {
        /*
            int r0 = r7.mo17006a()     // Catch:{ EndOfFileException -> 0x00fa }
            r1 = 65496(0xffd8, float:9.178E-41)
            if (r0 != r1) goto L_0x000c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG     // Catch:{ EndOfFileException -> 0x00fa }
            return r7
        L_0x000c:
            int r0 = r0 << 8
            short r1 = r7.mo17008c()     // Catch:{ EndOfFileException -> 0x00fa }
            r0 = r0 | r1
            r1 = 4671814(0x474946, float:6.546606E-39)
            if (r0 != r1) goto L_0x001b
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF     // Catch:{ EndOfFileException -> 0x00fa }
            return r7
        L_0x001b:
            int r0 = r0 << 8
            short r1 = r7.mo17008c()     // Catch:{ EndOfFileException -> 0x00fa }
            r0 = r0 | r1
            r1 = -1991225785(0xffffffff89504e47, float:-2.5073895E-33)
            if (r0 != r1) goto L_0x003c
            r0 = 21
            r7.skip(r0)     // Catch:{ EndOfFileException -> 0x00fa }
            short r7 = r7.mo17008c()     // Catch:{ EndOfFileException -> 0x0039 }
            r0 = 3
            if (r7 < r0) goto L_0x0036
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A     // Catch:{ EndOfFileException -> 0x0039 }
            goto L_0x0038
        L_0x0036:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ EndOfFileException -> 0x0039 }
        L_0x0038:
            return r7
        L_0x0039:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ EndOfFileException -> 0x00fa }
            return r7
        L_0x003c:
            r1 = 1380533830(0x52494646, float:2.16116855E11)
            r2 = 4
            if (r0 == r1) goto L_0x0099
            int r1 = r7.mo17006a()     // Catch:{ EndOfFileException -> 0x00fa }
            int r1 = r1 << 16
            int r4 = r7.mo17006a()     // Catch:{ EndOfFileException -> 0x00fa }
            r1 = r1 | r4
            r4 = 0
            r5 = 1718909296(0x66747970, float:2.8862439E23)
            if (r1 == r5) goto L_0x0055
            goto L_0x0091
        L_0x0055:
            int r1 = r7.mo17006a()     // Catch:{ EndOfFileException -> 0x00fa }
            int r1 = r1 << 16
            int r5 = r7.mo17006a()     // Catch:{ EndOfFileException -> 0x00fa }
            r1 = r1 | r5
            r5 = 1635150182(0x61766966, float:2.8409336E20)
            if (r1 == r5) goto L_0x0090
            r6 = 1635150195(0x61766973, float:2.8409359E20)
            if (r1 != r6) goto L_0x006b
            goto L_0x0090
        L_0x006b:
            r7.skip(r2)     // Catch:{ EndOfFileException -> 0x00fa }
            int r0 = r0 + -16
            int r1 = r0 % 4
            if (r1 == 0) goto L_0x0075
            goto L_0x0091
        L_0x0075:
            r1 = r4
        L_0x0076:
            r2 = 5
            if (r1 >= r2) goto L_0x0091
            if (r0 <= 0) goto L_0x0091
            int r2 = r7.mo17006a()     // Catch:{ EndOfFileException -> 0x00fa }
            int r2 = r2 << 16
            int r3 = r7.mo17006a()     // Catch:{ EndOfFileException -> 0x00fa }
            r2 = r2 | r3
            if (r2 == r5) goto L_0x0090
            if (r2 != r6) goto L_0x008b
            goto L_0x0090
        L_0x008b:
            int r1 = r1 + 1
            int r0 = r0 + -4
            goto L_0x0076
        L_0x0090:
            r4 = 1
        L_0x0091:
            if (r4 == 0) goto L_0x0096
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.AVIF     // Catch:{ EndOfFileException -> 0x00fa }
            goto L_0x0098
        L_0x0096:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ EndOfFileException -> 0x00fa }
        L_0x0098:
            return r7
        L_0x0099:
            r7.skip(r2)     // Catch:{ EndOfFileException -> 0x00fa }
            int r0 = r7.mo17006a()     // Catch:{ EndOfFileException -> 0x00fa }
            int r0 = r0 << 16
            int r1 = r7.mo17006a()     // Catch:{ EndOfFileException -> 0x00fa }
            r0 = r0 | r1
            r1 = 1464156752(0x57454250, float:2.16888601E14)
            if (r0 == r1) goto L_0x00af
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ EndOfFileException -> 0x00fa }
            return r7
        L_0x00af:
            int r0 = r7.mo17006a()     // Catch:{ EndOfFileException -> 0x00fa }
            int r0 = r0 << 16
            int r1 = r7.mo17006a()     // Catch:{ EndOfFileException -> 0x00fa }
            r0 = r0 | r1
            r1 = r0 & -256(0xffffffffffffff00, float:NaN)
            r4 = 1448097792(0x56503800, float:5.7234734E13)
            if (r1 == r4) goto L_0x00c4
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ EndOfFileException -> 0x00fa }
            return r7
        L_0x00c4:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 88
            if (r0 != r1) goto L_0x00e2
            r7.skip(r2)     // Catch:{ EndOfFileException -> 0x00fa }
            short r7 = r7.mo17008c()     // Catch:{ EndOfFileException -> 0x00fa }
            r0 = r7 & 2
            if (r0 == 0) goto L_0x00d8
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.ANIMATED_WEBP     // Catch:{ EndOfFileException -> 0x00fa }
            return r7
        L_0x00d8:
            r7 = r7 & 16
            if (r7 == 0) goto L_0x00df
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ EndOfFileException -> 0x00fa }
            return r7
        L_0x00df:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ EndOfFileException -> 0x00fa }
            return r7
        L_0x00e2:
            r1 = 76
            if (r0 != r1) goto L_0x00f7
            r7.skip(r2)     // Catch:{ EndOfFileException -> 0x00fa }
            short r7 = r7.mo17008c()     // Catch:{ EndOfFileException -> 0x00fa }
            r7 = r7 & 8
            if (r7 == 0) goto L_0x00f4
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ EndOfFileException -> 0x00fa }
            goto L_0x00f6
        L_0x00f4:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ EndOfFileException -> 0x00fa }
        L_0x00f6:
            return r7
        L_0x00f7:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ EndOfFileException -> 0x00fa }
            return r7
        L_0x00fa:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.m12011f(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader):com.bumptech.glide.load.ImageHeaderParser$ImageType");
    }

    /* renamed from: g */
    public static int m12012g(Reader reader) throws IOException {
        short c;
        int a;
        long j;
        long skip;
        do {
            short c2 = reader.mo17008c();
            if (c2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + c2);
                }
                return -1;
            }
            c = reader.mo17008c();
            if (c == 218) {
                return -1;
            }
            if (c == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            a = reader.mo17006a() - 2;
            if (c == 225) {
                return a;
            }
            j = (long) a;
            skip = reader.skip(j);
        } while (skip == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder g = C0472h.m1244g("Unable to skip enough data, type: ", c, ", wanted to skip: ", a, ", but actually skipped: ");
            g.append(skip);
            Log.d("DfltImageHeaderParser", g.toString());
        }
        return -1;
    }

    /* renamed from: h */
    public static int m12013h(Reader reader, byte[] bArr, int i) throws IOException {
        ByteOrder byteOrder;
        int b = reader.mo17007b(i, bArr);
        if (b != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + b);
            }
            return -1;
        }
        boolean z = bArr != null && i > f13044a.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = f13044a;
                if (i2 >= bArr2.length) {
                    break;
                } else if (bArr[i2] != bArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
        }
        if (z) {
            C6060b bVar = new C6060b(i, bArr);
            short a = bVar.mo17010a(6);
            if (a == 18761) {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            } else if (a != 19789) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown endianness = " + a);
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.BIG_ENDIAN;
            }
            bVar.f13047a.order(byteOrder);
            int i3 = (bVar.f13047a.remaining() - 10 >= 4 ? bVar.f13047a.getInt(10) : -1) + 6;
            short a2 = bVar.mo17010a(i3);
            for (int i4 = 0; i4 < a2; i4++) {
                int i5 = (i4 * 12) + i3 + 2;
                short a3 = bVar.mo17010a(i5);
                if (a3 == 274) {
                    short a4 = bVar.mo17010a(i5 + 2);
                    if (a4 >= 1 && a4 <= 12) {
                        int i6 = i5 + 4;
                        int i7 = bVar.f13047a.remaining() - i6 >= 4 ? bVar.f13047a.getInt(i6) : -1;
                        if (i7 >= 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                StringBuilder g = C0472h.m1244g("Got tagIndex=", i4, " tagType=", a3, " formatCode=");
                                g.append(a4);
                                g.append(" componentCount=");
                                g.append(i7);
                                Log.d("DfltImageHeaderParser", g.toString());
                            }
                            int i8 = i7 + f13045b[a4];
                            if (i8 <= 4) {
                                int i9 = i5 + 8;
                                if (i9 < 0 || i9 > bVar.f13047a.remaining()) {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i9 + " tagType=" + a3);
                                    }
                                } else if (i8 >= 0 && i8 + i9 <= bVar.f13047a.remaining()) {
                                    return bVar.mo17010a(i9);
                                } else {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + a3);
                                    }
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + a4);
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Negative tiff component count");
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Got invalid format code = " + a4);
                    }
                }
            }
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }

    /* renamed from: a */
    public final ImageHeaderParser.ImageType mo16836a(ByteBuffer byteBuffer) throws IOException {
        C0114h.m281L(byteBuffer);
        return m12011f(new C6059a(byteBuffer));
    }

    /* renamed from: b */
    public final int mo16837b(ByteBuffer byteBuffer, C5996b bVar) throws IOException {
        C0114h.m281L(byteBuffer);
        C6059a aVar = new C6059a(byteBuffer);
        C0114h.m281L(bVar);
        return m12010e(aVar, bVar);
    }

    /* renamed from: c */
    public final ImageHeaderParser.ImageType mo16838c(InputStream inputStream) throws IOException {
        C0114h.m281L(inputStream);
        return m12011f(new C6061c(inputStream));
    }

    /* renamed from: d */
    public final int mo16839d(InputStream inputStream, C5996b bVar) throws IOException {
        C0114h.m281L(inputStream);
        C6061c cVar = new C6061c(inputStream);
        C0114h.m281L(bVar);
        return m12010e(cVar, bVar);
    }
}
