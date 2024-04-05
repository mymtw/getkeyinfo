package okio;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import androidx.appcompat.widget.C0326j;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import kotlin.text.C19446a;
import p003a2.C0015b;
import p568fn.C17782b;
import p756lr.C19881a;
import p756lr.C19893f;

public class ByteString implements Serializable, Comparable<ByteString> {
    public static final C20020a Companion = new C20020a();
    public static final ByteString EMPTY = new ByteString(new byte[0]);
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    public transient int f44388b;

    /* renamed from: c */
    public transient String f44389c;
    private final byte[] data;

    /* renamed from: okio.ByteString$a */
    public static final class C20020a {
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
            r5 = r0 - 1;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static okio.ByteString m34293a(java.lang.String r15) {
            /*
                java.lang.String r0 = "$this$decodeBase64"
                kotlin.jvm.internal.C19383o.m32797g(r15, r0)
                byte[] r0 = p756lr.C19881a.f43858a
                int r0 = r15.length()
            L_0x000b:
                r1 = 9
                r2 = 32
                r3 = 13
                r4 = 10
                if (r0 <= 0) goto L_0x002a
                int r5 = r0 + -1
                char r6 = r15.charAt(r5)
                r7 = 61
                if (r6 == r7) goto L_0x0028
                if (r6 == r4) goto L_0x0028
                if (r6 == r3) goto L_0x0028
                if (r6 == r2) goto L_0x0028
                if (r6 == r1) goto L_0x0028
                goto L_0x002a
            L_0x0028:
                r0 = r5
                goto L_0x000b
            L_0x002a:
                long r5 = (long) r0
                r7 = 6
                long r5 = r5 * r7
                r7 = 8
                long r5 = r5 / r7
                int r5 = (int) r5
                byte[] r6 = new byte[r5]
                r7 = 0
                r8 = r7
                r9 = r8
                r10 = r9
            L_0x0038:
                r11 = 0
                if (r7 >= r0) goto L_0x00a3
                char r12 = r15.charAt(r7)
                r13 = 90
                r14 = 65
                if (r14 <= r12) goto L_0x0046
                goto L_0x004b
            L_0x0046:
                if (r13 < r12) goto L_0x004b
                int r12 = r12 + -65
                goto L_0x0083
            L_0x004b:
                r13 = 122(0x7a, float:1.71E-43)
                r14 = 97
                if (r14 <= r12) goto L_0x0052
                goto L_0x0057
            L_0x0052:
                if (r13 < r12) goto L_0x0057
                int r12 = r12 + -71
                goto L_0x0083
            L_0x0057:
                r13 = 57
                r14 = 48
                if (r14 <= r12) goto L_0x005e
                goto L_0x0063
            L_0x005e:
                if (r13 < r12) goto L_0x0063
                int r12 = r12 + 4
                goto L_0x0083
            L_0x0063:
                r13 = 43
                if (r12 == r13) goto L_0x0081
                r13 = 45
                if (r12 != r13) goto L_0x006c
                goto L_0x0081
            L_0x006c:
                r13 = 47
                if (r12 == r13) goto L_0x007e
                r13 = 95
                if (r12 != r13) goto L_0x0075
                goto L_0x007e
            L_0x0075:
                if (r12 == r4) goto L_0x00a0
                if (r12 == r3) goto L_0x00a0
                if (r12 == r2) goto L_0x00a0
                if (r12 != r1) goto L_0x00d7
                goto L_0x00a0
            L_0x007e:
                r12 = 63
                goto L_0x0083
            L_0x0081:
                r12 = 62
            L_0x0083:
                int r9 = r9 << 6
                r9 = r9 | r12
                int r8 = r8 + 1
                int r11 = r8 % 4
                if (r11 != 0) goto L_0x00a0
                int r11 = r10 + 1
                int r12 = r9 >> 16
                byte r12 = (byte) r12
                r6[r10] = r12
                int r10 = r11 + 1
                int r12 = r9 >> 8
                byte r12 = (byte) r12
                r6[r11] = r12
                int r11 = r10 + 1
                byte r12 = (byte) r9
                r6[r10] = r12
                r10 = r11
            L_0x00a0:
                int r7 = r7 + 1
                goto L_0x0038
            L_0x00a3:
                int r8 = r8 % 4
                r15 = 1
                if (r8 == r15) goto L_0x00d7
                r15 = 2
                if (r8 == r15) goto L_0x00c0
                r15 = 3
                if (r8 == r15) goto L_0x00af
                goto L_0x00ca
            L_0x00af:
                int r15 = r9 << 6
                int r0 = r10 + 1
                int r1 = r15 >> 16
                byte r1 = (byte) r1
                r6[r10] = r1
                int r10 = r0 + 1
                int r15 = r15 >> 8
                byte r15 = (byte) r15
                r6[r0] = r15
                goto L_0x00ca
            L_0x00c0:
                int r15 = r9 << 12
                int r0 = r10 + 1
                int r15 = r15 >> 16
                byte r15 = (byte) r15
                r6[r10] = r15
                r10 = r0
            L_0x00ca:
                if (r10 != r5) goto L_0x00cd
                goto L_0x00d8
            L_0x00cd:
                byte[] r6 = java.util.Arrays.copyOf(r6, r10)
                java.lang.String r15 = "java.util.Arrays.copyOf(this, newSize)"
                kotlin.jvm.internal.C19383o.m32796f(r6, r15)
                goto L_0x00d8
            L_0x00d7:
                r6 = r11
            L_0x00d8:
                if (r6 == 0) goto L_0x00df
                okio.ByteString r11 = new okio.ByteString
                r11.<init>(r6)
            L_0x00df:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.C20020a.m34293a(java.lang.String):okio.ByteString");
        }

        /* renamed from: b */
        public static ByteString m34294b(String str) {
            C19383o.m32797g(str, "$this$decodeHex");
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    bArr[i] = (byte) (C19421p.m32957v(str.charAt(i2 + 1)) + (C19421p.m32957v(str.charAt(i2)) << 4));
                }
                return new ByteString(bArr);
            }
            throw new IllegalArgumentException(C0326j.m864i("Unexpected hex string: ", str).toString());
        }

        /* renamed from: c */
        public static ByteString m34295c(String str) {
            C19383o.m32797g(str, "$this$encodeUtf8");
            byte[] bytes = str.getBytes(C19446a.f43373b);
            C19383o.m32796f(bytes, "(this as java.lang.String).getBytes(charset)");
            ByteString byteString = new ByteString(bytes);
            byteString.setUtf8$okio(str);
            return byteString;
        }

        /* renamed from: d */
        public static ByteString m34296d(InputStream inputStream, int i) throws IOException {
            C19383o.m32797g(inputStream, "$this$readByteString");
            int i2 = 0;
            if (i >= 0) {
                byte[] bArr = new byte[i];
                while (i2 < i) {
                    int read = inputStream.read(bArr, i2, i - i2);
                    if (read != -1) {
                        i2 += read;
                    } else {
                        throw new EOFException();
                    }
                }
                return new ByteString(bArr);
            }
            throw new IllegalArgumentException(C0015b.m88g("byteCount < 0: ", i).toString());
        }
    }

    public ByteString(byte[] bArr) {
        C19383o.m32797g(bArr, "data");
        this.data = bArr;
    }

    public static final ByteString decodeBase64(String str) {
        Companion.getClass();
        return C20020a.m34293a(str);
    }

    public static final ByteString decodeHex(String str) {
        Companion.getClass();
        return C20020a.m34294b(str);
    }

    public static final ByteString encodeString(String str, Charset charset) {
        Companion.getClass();
        C19383o.m32797g(str, "$this$encode");
        C19383o.m32797g(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        C19383o.m32796f(bytes, "(this as java.lang.String).getBytes(charset)");
        return new ByteString(bytes);
    }

    public static final ByteString encodeUtf8(String str) {
        Companion.getClass();
        return C20020a.m34295c(str);
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, ByteString byteString2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return byteString.indexOf(byteString2, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, byte[] bArr, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return byteString.indexOf(bArr, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, ByteString byteString2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = byteString.size();
            }
            return byteString.lastIndexOf(byteString2, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, byte[] bArr, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = byteString.size();
            }
            return byteString.lastIndexOf(bArr, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    /* renamed from: of */
    public static final ByteString m34290of(ByteBuffer byteBuffer) {
        Companion.getClass();
        C19383o.m32797g(byteBuffer, "$this$toByteString");
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return new ByteString(bArr);
    }

    public static final ByteString read(InputStream inputStream, int i) throws IOException {
        Companion.getClass();
        return C20020a.m34296d(inputStream, i);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IOException {
        int readInt = objectInputStream.readInt();
        Companion.getClass();
        ByteString d = C20020a.m34296d(objectInputStream, readInt);
        Field declaredField = ByteString.class.getDeclaredField("data");
        C19383o.m32796f(declaredField, "field");
        declaredField.setAccessible(true);
        declaredField.set(this, d.data);
    }

    public static /* synthetic */ ByteString substring$default(ByteString byteString, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = byteString.size();
            }
            return byteString.substring(i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    /* renamed from: -deprecated_getByte  reason: not valid java name */
    public final byte m35493deprecated_getByte(int i) {
        return getByte(i);
    }

    /* renamed from: -deprecated_size  reason: not valid java name */
    public final int m35494deprecated_size() {
        return size();
    }

    public ByteBuffer asByteBuffer() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(this.data).asReadOnlyBuffer();
        C19383o.m32796f(asReadOnlyBuffer, "ByteBuffer.wrap(data).asReadOnlyBuffer()");
        return asReadOnlyBuffer;
    }

    public String base64() {
        return C19881a.m33867a(getData$okio(), C19881a.f43858a);
    }

    public String base64Url() {
        return C19881a.m33867a(getData$okio(), C19881a.f43859b);
    }

    public ByteString digest$okio(String str) {
        C19383o.m32797g(str, "algorithm");
        MessageDigest instance = MessageDigest.getInstance(str);
        instance.update(this.data, 0, size());
        byte[] digest = instance.digest();
        C19383o.m32796f(digest, "digestBytes");
        return new ByteString(digest);
    }

    public final boolean endsWith(ByteString byteString) {
        C19383o.m32797g(byteString, "suffix");
        return rangeEquals(size() - byteString.size(), byteString, 0, byteString.size());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == getData$okio().length && byteString.rangeEquals(0, getData$okio(), 0, getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    public final byte getByte(int i) {
        return internalGet$okio(i);
    }

    public final byte[] getData$okio() {
        return this.data;
    }

    public final int getHashCode$okio() {
        return this.f44388b;
    }

    public int getSize$okio() {
        return getData$okio().length;
    }

    public final String getUtf8$okio() {
        return this.f44389c;
    }

    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int hashCode = Arrays.hashCode(getData$okio());
        setHashCode$okio(hashCode);
        return hashCode;
    }

    public String hex() {
        char[] cArr = new char[(getData$okio().length * 2)];
        int i = 0;
        for (byte b : getData$okio()) {
            int i2 = i + 1;
            char[] cArr2 = C19421p.f43323m;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public ByteString hmac$okio(String str, ByteString byteString) {
        C19383o.m32797g(str, "algorithm");
        C19383o.m32797g(byteString, "key");
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(new SecretKeySpec(byteString.toByteArray(), str));
            byte[] doFinal = instance.doFinal(this.data);
            C19383o.m32796f(doFinal, "mac.doFinal(data)");
            return new ByteString(doFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public ByteString hmacSha1(ByteString byteString) {
        C19383o.m32797g(byteString, "key");
        return hmac$okio("HmacSHA1", byteString);
    }

    public ByteString hmacSha256(ByteString byteString) {
        C19383o.m32797g(byteString, "key");
        return hmac$okio("HmacSHA256", byteString);
    }

    public ByteString hmacSha512(ByteString byteString) {
        C19383o.m32797g(byteString, "key");
        return hmac$okio("HmacSHA512", byteString);
    }

    public final int indexOf(ByteString byteString) {
        return indexOf$default(this, byteString, 0, 2, (Object) null);
    }

    public final int indexOf(ByteString byteString, int i) {
        C19383o.m32797g(byteString, "other");
        return indexOf(byteString.internalArray$okio(), i);
    }

    public final int indexOf(byte[] bArr) {
        return indexOf$default(this, bArr, 0, 2, (Object) null);
    }

    public byte[] internalArray$okio() {
        return getData$okio();
    }

    public byte internalGet$okio(int i) {
        return getData$okio()[i];
    }

    public final int lastIndexOf(ByteString byteString) {
        return lastIndexOf$default(this, byteString, 0, 2, (Object) null);
    }

    public final int lastIndexOf(ByteString byteString, int i) {
        C19383o.m32797g(byteString, "other");
        return lastIndexOf(byteString.internalArray$okio(), i);
    }

    public final int lastIndexOf(byte[] bArr) {
        return lastIndexOf$default(this, bArr, 0, 2, (Object) null);
    }

    public final ByteString md5() {
        return digest$okio("MD5");
    }

    public boolean rangeEquals(int i, ByteString byteString, int i2, int i3) {
        C19383o.m32797g(byteString, "other");
        return byteString.rangeEquals(i2, getData$okio(), i, i3);
    }

    public final void setHashCode$okio(int i) {
        this.f44388b = i;
    }

    public final void setUtf8$okio(String str) {
        this.f44389c = str;
    }

    public final ByteString sha1() {
        return digest$okio("SHA-1");
    }

    public final ByteString sha256() {
        return digest$okio("SHA-256");
    }

    public final ByteString sha512() {
        return digest$okio("SHA-512");
    }

    public final int size() {
        return getSize$okio();
    }

    public final boolean startsWith(ByteString byteString) {
        C19383o.m32797g(byteString, "prefix");
        return rangeEquals(0, byteString, 0, byteString.size());
    }

    public String string(Charset charset) {
        C19383o.m32797g(charset, "charset");
        return new String(this.data, charset);
    }

    public final ByteString substring() {
        return substring$default(this, 0, 0, 3, (Object) null);
    }

    public final ByteString substring(int i) {
        return substring$default(this, i, 0, 2, (Object) null);
    }

    public ByteString substring(int i, int i2) {
        boolean z = true;
        if (i >= 0) {
            if (i2 <= getData$okio().length) {
                if (i2 - i < 0) {
                    z = false;
                }
                if (z) {
                    return (i == 0 && i2 == getData$okio().length) ? this : new ByteString(C19318k.m32606X0(i, i2, getData$okio()));
                }
                throw new IllegalArgumentException("endIndex < beginIndex".toString());
            }
            throw new IllegalArgumentException(C0073e.m208h(C0072d.m201h("endIndex > length("), getData$okio().length, ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0".toString());
    }

    public ByteString toAsciiLowercase() {
        byte b;
        int i = 0;
        while (i < getData$okio().length) {
            byte b2 = getData$okio()[i];
            byte b3 = (byte) 65;
            if (b2 < b3 || b2 > (b = (byte) 90)) {
                i++;
            } else {
                byte[] data$okio = getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                C19383o.m32796f(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 + 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return this;
    }

    public ByteString toAsciiUppercase() {
        byte b;
        int i = 0;
        while (i < getData$okio().length) {
            byte b2 = getData$okio()[i];
            byte b3 = (byte) 97;
            if (b2 < b3 || b2 > (b = (byte) 122)) {
                i++;
            } else {
                byte[] data$okio = getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                C19383o.m32796f(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 - 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 - 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return this;
    }

    public byte[] toByteArray() {
        byte[] data$okio = getData$okio();
        byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
        C19383o.m32796f(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0120, code lost:
        if (r3 == 64) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x015e, code lost:
        if (r3 == 64) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x016f, code lost:
        if (r3 == 64) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0180, code lost:
        if (r3 == 64) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x018f, code lost:
        if (r3 == 64) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x01a5, code lost:
        if (r3 == 64) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x01ad, code lost:
        if (r3 == 64) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x01b4, code lost:
        if (r3 == 64) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x01e9, code lost:
        if (r3 == 64) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x01ec, code lost:
        r4 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x008a, code lost:
        if (r3 == 64) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0099, code lost:
        if (r3 == 64) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00a4, code lost:
        if (r3 == 64) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x00e5, code lost:
        if (r3 == 64) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x00f6, code lost:
        if (r3 == 64) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0105, code lost:
        if (r3 == 64) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0117, code lost:
        if (r3 == 64) goto L_0x01ed;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r17 = this;
            byte[] r0 = r17.getData$okio()
            int r0 = r0.length
            if (r0 != 0) goto L_0x0009
            r0 = 1
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = "[size=0]"
            goto L_0x02d1
        L_0x0010:
            byte[] r0 = r17.getData$okio()
            int r1 = r0.length
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x0018:
            r5 = 64
            if (r2 >= r1) goto L_0x01ed
            byte r6 = r0[r2]
            r7 = 13
            r8 = 10
            r9 = 31
            r10 = 127(0x7f, float:1.78E-43)
            r11 = 159(0x9f, float:2.23E-43)
            r12 = 65533(0xfffd, float:9.1831E-41)
            r14 = 65536(0x10000, float:9.18355E-41)
            if (r6 < 0) goto L_0x007f
            int r15 = r3 + 1
            if (r3 != r5) goto L_0x0035
            goto L_0x01ed
        L_0x0035:
            if (r6 == r8) goto L_0x0047
            if (r6 == r7) goto L_0x0047
            if (r6 < 0) goto L_0x003d
            if (r9 >= r6) goto L_0x0042
        L_0x003d:
            if (r10 <= r6) goto L_0x0040
            goto L_0x0044
        L_0x0040:
            if (r11 < r6) goto L_0x0044
        L_0x0042:
            r3 = 1
            goto L_0x0045
        L_0x0044:
            r3 = 0
        L_0x0045:
            if (r3 != 0) goto L_0x01ec
        L_0x0047:
            if (r6 != r12) goto L_0x004b
            goto L_0x01ec
        L_0x004b:
            if (r6 >= r14) goto L_0x004f
            r3 = 1
            goto L_0x0050
        L_0x004f:
            r3 = 2
        L_0x0050:
            int r4 = r4 + r3
            int r2 = r2 + 1
        L_0x0053:
            r3 = r15
            if (r2 >= r1) goto L_0x0018
            byte r6 = r0[r2]
            if (r6 < 0) goto L_0x0018
            int r2 = r2 + 1
            int r15 = r3 + 1
            if (r3 != r5) goto L_0x0062
            goto L_0x01ed
        L_0x0062:
            if (r6 == r8) goto L_0x0074
            if (r6 == r7) goto L_0x0074
            if (r6 < 0) goto L_0x006a
            if (r9 >= r6) goto L_0x006f
        L_0x006a:
            if (r10 <= r6) goto L_0x006d
            goto L_0x0071
        L_0x006d:
            if (r11 < r6) goto L_0x0071
        L_0x006f:
            r3 = 1
            goto L_0x0072
        L_0x0071:
            r3 = 0
        L_0x0072:
            if (r3 != 0) goto L_0x01ec
        L_0x0074:
            if (r6 != r12) goto L_0x0078
            goto L_0x01ec
        L_0x0078:
            if (r6 >= r14) goto L_0x007c
            r3 = 1
            goto L_0x007d
        L_0x007c:
            r3 = 2
        L_0x007d:
            int r4 = r4 + r3
            goto L_0x0053
        L_0x007f:
            int r14 = r6 >> 5
            r15 = -2
            r13 = 128(0x80, float:1.794E-43)
            if (r14 != r15) goto L_0x00d7
            int r14 = r2 + 1
            if (r1 > r14) goto L_0x008e
            if (r3 != r5) goto L_0x01ec
            goto L_0x01ed
        L_0x008e:
            byte r14 = r0[r14]
            r15 = r14 & 192(0xc0, float:2.69E-43)
            if (r15 != r13) goto L_0x0096
            r15 = 1
            goto L_0x0097
        L_0x0096:
            r15 = 0
        L_0x0097:
            if (r15 != 0) goto L_0x009d
            if (r3 != r5) goto L_0x01ec
            goto L_0x01ed
        L_0x009d:
            r14 = r14 ^ 3968(0xf80, float:5.56E-42)
            int r6 = r6 << 6
            r6 = r6 ^ r14
            if (r6 >= r13) goto L_0x00a8
            if (r3 != r5) goto L_0x01ec
            goto L_0x01ed
        L_0x00a8:
            int r13 = r3 + 1
            if (r3 != r5) goto L_0x00ae
            goto L_0x01ed
        L_0x00ae:
            if (r6 == r8) goto L_0x00c0
            if (r6 == r7) goto L_0x00c0
            if (r6 < 0) goto L_0x00b6
            if (r9 >= r6) goto L_0x00bb
        L_0x00b6:
            if (r10 <= r6) goto L_0x00b9
            goto L_0x00bd
        L_0x00b9:
            if (r11 < r6) goto L_0x00bd
        L_0x00bb:
            r3 = 1
            goto L_0x00be
        L_0x00bd:
            r3 = 0
        L_0x00be:
            if (r3 != 0) goto L_0x01ec
        L_0x00c0:
            if (r6 != r12) goto L_0x00c4
            goto L_0x01ec
        L_0x00c4:
            r3 = 65536(0x10000, float:9.18355E-41)
            if (r6 >= r3) goto L_0x00cc
            r3 = 1
            r16 = r3
            goto L_0x00ce
        L_0x00cc:
            r16 = 2
        L_0x00ce:
            int r4 = r4 + r16
            kotlin.m r3 = kotlin.C19394m.f43287a
            int r2 = r2 + 2
            r3 = r13
            goto L_0x0018
        L_0x00d7:
            int r10 = r6 >> 4
            r11 = 55296(0xd800, float:7.7486E-41)
            r12 = 57343(0xdfff, float:8.0355E-41)
            if (r10 != r15) goto L_0x0156
            int r10 = r2 + 2
            if (r1 > r10) goto L_0x00e9
            if (r3 != r5) goto L_0x01ec
            goto L_0x01ed
        L_0x00e9:
            int r14 = r2 + 1
            byte r14 = r0[r14]
            r15 = r14 & 192(0xc0, float:2.69E-43)
            if (r15 != r13) goto L_0x00f3
            r15 = 1
            goto L_0x00f4
        L_0x00f3:
            r15 = 0
        L_0x00f4:
            if (r15 != 0) goto L_0x00fa
            if (r3 != r5) goto L_0x01ec
            goto L_0x01ed
        L_0x00fa:
            byte r10 = r0[r10]
            r15 = r10 & 192(0xc0, float:2.69E-43)
            if (r15 != r13) goto L_0x0102
            r13 = 1
            goto L_0x0103
        L_0x0102:
            r13 = 0
        L_0x0103:
            if (r13 != 0) goto L_0x0109
            if (r3 != r5) goto L_0x01ec
            goto L_0x01ed
        L_0x0109:
            r13 = -123008(0xfffffffffffe1f80, float:NaN)
            r10 = r10 ^ r13
            int r13 = r14 << 6
            r10 = r10 ^ r13
            int r6 = r6 << 12
            r6 = r6 ^ r10
            r10 = 2048(0x800, float:2.87E-42)
            if (r6 >= r10) goto L_0x011b
            if (r3 != r5) goto L_0x01ec
            goto L_0x01ed
        L_0x011b:
            if (r11 <= r6) goto L_0x011e
            goto L_0x0124
        L_0x011e:
            if (r12 < r6) goto L_0x0124
            if (r3 != r5) goto L_0x01ec
            goto L_0x01ed
        L_0x0124:
            int r10 = r3 + 1
            if (r3 != r5) goto L_0x012a
            goto L_0x01ed
        L_0x012a:
            if (r6 == r8) goto L_0x0140
            if (r6 == r7) goto L_0x0140
            if (r6 < 0) goto L_0x0132
            if (r9 >= r6) goto L_0x013b
        L_0x0132:
            r3 = 127(0x7f, float:1.78E-43)
            if (r3 <= r6) goto L_0x0137
            goto L_0x013d
        L_0x0137:
            r3 = 159(0x9f, float:2.23E-43)
            if (r3 < r6) goto L_0x013d
        L_0x013b:
            r3 = 1
            goto L_0x013e
        L_0x013d:
            r3 = 0
        L_0x013e:
            if (r3 != 0) goto L_0x01ec
        L_0x0140:
            r3 = 65533(0xfffd, float:9.1831E-41)
            if (r6 != r3) goto L_0x0147
            goto L_0x01ec
        L_0x0147:
            r3 = 65536(0x10000, float:9.18355E-41)
            if (r6 >= r3) goto L_0x014d
            r13 = 1
            goto L_0x014e
        L_0x014d:
            r13 = 2
        L_0x014e:
            int r4 = r4 + r13
            kotlin.m r3 = kotlin.C19394m.f43287a
            int r2 = r2 + 3
            r3 = r10
            goto L_0x0018
        L_0x0156:
            int r9 = r6 >> 3
            if (r9 != r15) goto L_0x01e9
            int r9 = r2 + 3
            if (r1 > r9) goto L_0x0162
            if (r3 != r5) goto L_0x01ec
            goto L_0x01ed
        L_0x0162:
            int r10 = r2 + 1
            byte r10 = r0[r10]
            r14 = r10 & 192(0xc0, float:2.69E-43)
            if (r14 != r13) goto L_0x016c
            r14 = 1
            goto L_0x016d
        L_0x016c:
            r14 = 0
        L_0x016d:
            if (r14 != 0) goto L_0x0173
            if (r3 != r5) goto L_0x01ec
            goto L_0x01ed
        L_0x0173:
            int r14 = r2 + 2
            byte r14 = r0[r14]
            r15 = r14 & 192(0xc0, float:2.69E-43)
            if (r15 != r13) goto L_0x017d
            r15 = 1
            goto L_0x017e
        L_0x017d:
            r15 = 0
        L_0x017e:
            if (r15 != 0) goto L_0x0184
            if (r3 != r5) goto L_0x01ec
            goto L_0x01ed
        L_0x0184:
            byte r9 = r0[r9]
            r15 = r9 & 192(0xc0, float:2.69E-43)
            if (r15 != r13) goto L_0x018c
            r13 = 1
            goto L_0x018d
        L_0x018c:
            r13 = 0
        L_0x018d:
            if (r13 != 0) goto L_0x0193
            if (r3 != r5) goto L_0x01ec
            goto L_0x01ed
        L_0x0193:
            r13 = 3678080(0x381f80, float:5.154088E-39)
            r9 = r9 ^ r13
            int r13 = r14 << 6
            r9 = r9 ^ r13
            int r10 = r10 << 12
            r9 = r9 ^ r10
            int r6 = r6 << 18
            r6 = r6 ^ r9
            r9 = 1114111(0x10ffff, float:1.561202E-39)
            if (r6 <= r9) goto L_0x01a8
            if (r3 != r5) goto L_0x01ec
            goto L_0x01ed
        L_0x01a8:
            if (r11 <= r6) goto L_0x01ab
            goto L_0x01b0
        L_0x01ab:
            if (r12 < r6) goto L_0x01b0
            if (r3 != r5) goto L_0x01ec
            goto L_0x01ed
        L_0x01b0:
            r9 = 65536(0x10000, float:9.18355E-41)
            if (r6 >= r9) goto L_0x01b7
            if (r3 != r5) goto L_0x01ec
            goto L_0x01ed
        L_0x01b7:
            int r9 = r3 + 1
            if (r3 != r5) goto L_0x01bc
            goto L_0x01ed
        L_0x01bc:
            if (r6 == r8) goto L_0x01d4
            if (r6 == r7) goto L_0x01d4
            if (r6 < 0) goto L_0x01c6
            r3 = 31
            if (r3 >= r6) goto L_0x01cf
        L_0x01c6:
            r3 = 127(0x7f, float:1.78E-43)
            if (r3 <= r6) goto L_0x01cb
            goto L_0x01d1
        L_0x01cb:
            r3 = 159(0x9f, float:2.23E-43)
            if (r3 < r6) goto L_0x01d1
        L_0x01cf:
            r3 = 1
            goto L_0x01d2
        L_0x01d1:
            r3 = 0
        L_0x01d2:
            if (r3 != 0) goto L_0x01ec
        L_0x01d4:
            r3 = 65533(0xfffd, float:9.1831E-41)
            if (r6 != r3) goto L_0x01da
            goto L_0x01ec
        L_0x01da:
            r3 = 65536(0x10000, float:9.18355E-41)
            if (r6 >= r3) goto L_0x01e0
            r13 = 1
            goto L_0x01e1
        L_0x01e0:
            r13 = 2
        L_0x01e1:
            int r4 = r4 + r13
            kotlin.m r3 = kotlin.C19394m.f43287a
            int r2 = r2 + 4
            r3 = r9
            goto L_0x0018
        L_0x01e9:
            if (r3 != r5) goto L_0x01ec
            goto L_0x01ed
        L_0x01ec:
            r4 = -1
        L_0x01ed:
            java.lang.String r0 = "…]"
            r1 = 93
            java.lang.String r2 = "[size="
            r3 = -1
            if (r4 != r3) goto L_0x0273
            byte[] r3 = r17.getData$okio()
            int r3 = r3.length
            if (r3 > r5) goto L_0x0213
            java.lang.String r0 = "[hex="
            java.lang.StringBuilder r0 = android.support.p013v4.media.C0072d.m201h(r0)
            java.lang.String r2 = r17.hex()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x02d1
        L_0x0213:
            java.lang.StringBuilder r1 = android.support.p013v4.media.C0072d.m201h(r2)
            byte[] r2 = r17.getData$okio()
            int r2 = r2.length
            r1.append(r2)
            java.lang.String r2 = " hex="
            r1.append(r2)
            byte[] r2 = r17.getData$okio()
            int r2 = r2.length
            if (r5 > r2) goto L_0x022d
            r2 = 1
            goto L_0x022e
        L_0x022d:
            r2 = 0
        L_0x022e:
            if (r2 == 0) goto L_0x0258
            byte[] r2 = r17.getData$okio()
            int r2 = r2.length
            if (r5 != r2) goto L_0x023a
            r2 = r17
            goto L_0x0248
        L_0x023a:
            okio.ByteString r2 = new okio.ByteString
            byte[] r3 = r17.getData$okio()
            r4 = 0
            byte[] r3 = kotlin.collections.C19318k.m32606X0(r4, r5, r3)
            r2.<init>(r3)
        L_0x0248:
            java.lang.String r2 = r2.hex()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x02d1
        L_0x0258:
            java.lang.String r0 = "endIndex > length("
            java.lang.StringBuilder r0 = android.support.p013v4.media.C0072d.m201h(r0)
            byte[] r1 = r17.getData$okio()
            int r1 = r1.length
            r2 = 41
            java.lang.String r0 = android.support.p013v4.media.C0073e.m208h(r0, r1, r2)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0273:
            java.lang.String r3 = r17.utf8()
            if (r3 == 0) goto L_0x02d2
            r5 = 0
            java.lang.String r6 = r3.substring(r5, r4)
            java.lang.String r7 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.C19383o.m32796f(r6, r7)
            java.lang.String r7 = "\\"
            java.lang.String r8 = "\\\\"
            java.lang.String r6 = kotlin.text.C19457k.m33023a1(r6, r7, r8, r5)
            java.lang.String r7 = "\n"
            java.lang.String r8 = "\\n"
            java.lang.String r6 = kotlin.text.C19457k.m33023a1(r6, r7, r8, r5)
            java.lang.String r7 = "\r"
            java.lang.String r8 = "\\r"
            java.lang.String r5 = kotlin.text.C19457k.m33023a1(r6, r7, r8, r5)
            int r3 = r3.length()
            if (r4 >= r3) goto L_0x02bd
            java.lang.StringBuilder r1 = android.support.p013v4.media.C0072d.m201h(r2)
            byte[] r2 = r17.getData$okio()
            int r2 = r2.length
            r1.append(r2)
            java.lang.String r2 = " text="
            r1.append(r2)
            r1.append(r5)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x02d1
        L_0x02bd:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "[text="
            r0.append(r2)
            r0.append(r5)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x02d1:
            return r0
        L_0x02d2:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.toString():java.lang.String");
    }

    public String utf8() {
        String utf8$okio = getUtf8$okio();
        if (utf8$okio != null) {
            return utf8$okio;
        }
        byte[] internalArray$okio = internalArray$okio();
        C19383o.m32797g(internalArray$okio, "$this$toUtf8String");
        String str = new String(internalArray$okio, C19446a.f43373b);
        setUtf8$okio(str);
        return str;
    }

    public void write(OutputStream outputStream) throws IOException {
        C19383o.m32797g(outputStream, "out");
        outputStream.write(this.data);
    }

    public void write$okio(C19893f fVar, int i, int i2) {
        C19383o.m32797g(fVar, "buffer");
        fVar.mo72736f0(i, i2, getData$okio());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if (r7 < r8) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r0 < r1) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(okio.ByteString r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.C19383o.m32797g(r10, r0)
            int r0 = r9.size()
            int r1 = r10.size()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0013:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L_0x002b
            byte r7 = r9.getByte(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.getByte(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L_0x0028
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0028:
            if (r7 >= r8) goto L_0x0032
            goto L_0x0030
        L_0x002b:
            if (r0 != r1) goto L_0x002e
            goto L_0x0033
        L_0x002e:
            if (r0 >= r1) goto L_0x0032
        L_0x0030:
            r3 = r5
            goto L_0x0033
        L_0x0032:
            r3 = r6
        L_0x0033:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.compareTo(okio.ByteString):int");
    }

    public final boolean endsWith(byte[] bArr) {
        C19383o.m32797g(bArr, "suffix");
        return rangeEquals(size() - bArr.length, bArr, 0, bArr.length);
    }

    public int indexOf(byte[] bArr, int i) {
        C19383o.m32797g(bArr, "other");
        int length = getData$okio().length - bArr.length;
        int max = Math.max(i, 0);
        if (max <= length) {
            while (!C17782b.m29890v(getData$okio(), max, 0, bArr, bArr.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    public int lastIndexOf(byte[] bArr, int i) {
        C19383o.m32797g(bArr, "other");
        for (int min = Math.min(i, getData$okio().length - bArr.length); min >= 0; min--) {
            if (C17782b.m29890v(getData$okio(), min, 0, bArr, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public boolean rangeEquals(int i, byte[] bArr, int i2, int i3) {
        C19383o.m32797g(bArr, "other");
        return i >= 0 && i <= getData$okio().length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C17782b.m29890v(getData$okio(), i, i2, bArr, i3);
    }

    public final boolean startsWith(byte[] bArr) {
        C19383o.m32797g(bArr, "prefix");
        return rangeEquals(0, bArr, 0, bArr.length);
    }

    /* renamed from: of */
    public static final ByteString m34291of(byte... bArr) {
        Companion.getClass();
        C19383o.m32797g(bArr, "data");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        C19383o.m32796f(copyOf, "java.util.Arrays.copyOf(this, size)");
        return new ByteString(copyOf);
    }

    /* renamed from: of */
    public static final ByteString m34292of(byte[] bArr, int i, int i2) {
        Companion.getClass();
        C19383o.m32797g(bArr, "$this$toByteString");
        C17782b.m29843I((long) bArr.length, (long) i, (long) i2);
        return new ByteString(C19318k.m32606X0(i, i2 + i, bArr));
    }
}
