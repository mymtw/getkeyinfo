package okhttp3.internal.publicsuffix;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19459m;
import org.apache.commons.lang3.ClassUtils;
import p568fn.C17782b;
import p735br.C18980c;

public final class PublicSuffixDatabase {

    /* renamed from: e */
    public static final byte[] f44210e = {(byte) 42};

    /* renamed from: f */
    public static final List<String> f44211f = C17782b.m29864d0("*");

    /* renamed from: g */
    public static final PublicSuffixDatabase f44212g = new PublicSuffixDatabase();

    /* renamed from: a */
    public final AtomicBoolean f44213a = new AtomicBoolean(false);

    /* renamed from: b */
    public final CountDownLatch f44214b = new CountDownLatch(1);

    /* renamed from: c */
    public byte[] f44215c;

    /* renamed from: d */
    public byte[] f44216d;

    /* renamed from: okhttp3.internal.publicsuffix.PublicSuffixDatabase$a */
    public static final class C19983a {
        /* renamed from: a */
        public static final String m34186a(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            boolean z;
            byte b;
            int i3;
            byte[] bArr3 = bArr;
            byte[][] bArr4 = bArr2;
            byte[] bArr5 = PublicSuffixDatabase.f44210e;
            int length = bArr3.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = (i4 + length) / 2;
                while (i5 > -1 && bArr3[i5] != ((byte) 10)) {
                    i5--;
                }
                int i6 = i5 + 1;
                int i7 = 1;
                while (true) {
                    i2 = i6 + i7;
                    if (bArr3[i2] == ((byte) 10)) {
                        break;
                    }
                    i7++;
                }
                int i8 = i2 - i6;
                int i9 = i;
                boolean z2 = false;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (z2) {
                        b = 46;
                        z = false;
                    } else {
                        byte b2 = bArr4[i9][i10];
                        byte[] bArr6 = C18980c.f42301a;
                        byte b3 = b2 & 255;
                        z = z2;
                        b = b3;
                    }
                    byte b4 = bArr3[i6 + i11];
                    byte[] bArr7 = C18980c.f42301a;
                    i3 = b - (b4 & 255);
                    if (i3 == 0) {
                        i11++;
                        i10++;
                        if (i11 == i8) {
                            break;
                        } else if (bArr4[i9].length != i10) {
                            z2 = z;
                        } else if (i9 == bArr4.length - 1) {
                            break;
                        } else {
                            i9++;
                            i10 = -1;
                            z2 = true;
                        }
                    } else {
                        break;
                    }
                }
                if (i3 >= 0) {
                    if (i3 <= 0) {
                        int i12 = i8 - i11;
                        int length2 = bArr4[i9].length - i10;
                        int length3 = bArr4.length;
                        for (int i13 = i9 + 1; i13 < length3; i13++) {
                            length2 += bArr4[i13].length;
                        }
                        if (length2 >= i12) {
                            if (length2 <= i12) {
                                Charset charset = StandardCharsets.UTF_8;
                                C19383o.m32796f(charset, "UTF_8");
                                return new String(bArr3, i6, i8, charset);
                            }
                        }
                    }
                    i4 = i2 + 1;
                }
                length = i6 - 1;
            }
            return null;
        }
    }

    static {
        new C19983a();
    }

    /* renamed from: c */
    public static List m34183c(String str) {
        List x1 = C19459m.m33055x1(str, new char[]{ClassUtils.PACKAGE_SEPARATOR_CHAR}, 0, 6);
        return C19383o.m32792b((String) C19327t.m32645a1(x1), "") ? C19327t.m32635Q0(x1) : x1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        if (r1 == false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r1 != false) goto L_0x003b;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0043 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo72938a(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.String r0 = java.net.IDN.toUnicode(r13)
            java.lang.String r1 = "unicodeDomain"
            kotlin.jvm.internal.C19383o.m32796f(r0, r1)
            java.util.List r0 = m34183c(r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = r12.f44213a
            boolean r1 = r1.get()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0052
            java.util.concurrent.atomic.AtomicBoolean r1 = r12.f44213a
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 == 0) goto L_0x0052
            r1 = r2
        L_0x0020:
            r12.mo72939b()     // Catch:{ InterruptedIOException -> 0x0043, IOException -> 0x0028 }
            if (r1 == 0) goto L_0x005f
            goto L_0x003b
        L_0x0026:
            r13 = move-exception
            goto L_0x0048
        L_0x0028:
            r4 = move-exception
            hr.h$a r5 = p747hr.C19084h.f42595c     // Catch:{ all -> 0x0026 }
            r5.getClass()     // Catch:{ all -> 0x0026 }
            hr.h r5 = p747hr.C19084h.f42593a     // Catch:{ all -> 0x0026 }
            java.lang.String r6 = "Failed to read public suffix list"
            r7 = 5
            r5.getClass()     // Catch:{ all -> 0x0026 }
            p747hr.C19084h.m32344i(r7, r6, r4)     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x005f
        L_0x003b:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            goto L_0x005f
        L_0x0043:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x0026 }
            r1 = r3
            goto L_0x0020
        L_0x0048:
            if (r1 == 0) goto L_0x0051
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0051:
            throw r13
        L_0x0052:
            java.util.concurrent.CountDownLatch r1 = r12.f44214b     // Catch:{ InterruptedException -> 0x0058 }
            r1.await()     // Catch:{ InterruptedException -> 0x0058 }
            goto L_0x005f
        L_0x0058:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L_0x005f:
            byte[] r1 = r12.f44215c
            if (r1 == 0) goto L_0x0065
            r1 = r3
            goto L_0x0066
        L_0x0065:
            r1 = r2
        L_0x0066:
            if (r1 == 0) goto L_0x01da
            int r1 = r0.size()
            byte[][] r4 = new byte[r1][]
            r5 = r2
        L_0x006f:
            if (r5 >= r1) goto L_0x0096
            java.lang.Object r6 = r0.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r8 = "UTF_8"
            kotlin.jvm.internal.C19383o.m32796f(r7, r8)
            if (r6 == 0) goto L_0x008e
            byte[] r6 = r6.getBytes(r7)
            java.lang.String r7 = "(this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.C19383o.m32796f(r6, r7)
            r4[r5] = r6
            int r5 = r5 + 1
            goto L_0x006f
        L_0x008e:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            r13.<init>(r0)
            throw r13
        L_0x0096:
            r5 = r2
        L_0x0097:
            java.lang.String r6 = "publicSuffixListBytes"
            r7 = 0
            if (r5 >= r1) goto L_0x00ae
            byte[] r8 = r12.f44215c
            if (r8 == 0) goto L_0x00aa
            java.lang.String r8 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.C19983a.m34186a(r8, r4, r5)
            if (r8 == 0) goto L_0x00a7
            goto L_0x00af
        L_0x00a7:
            int r5 = r5 + 1
            goto L_0x0097
        L_0x00aa:
            kotlin.jvm.internal.C19383o.m32805o(r6)
            throw r7
        L_0x00ae:
            r8 = r7
        L_0x00af:
            if (r1 <= r3) goto L_0x00d2
            java.lang.Object r5 = r4.clone()
            byte[][] r5 = (byte[][]) r5
            int r9 = r5.length
            int r9 = r9 - r3
            r10 = r2
        L_0x00ba:
            if (r10 >= r9) goto L_0x00d2
            byte[] r11 = f44210e
            r5[r10] = r11
            byte[] r11 = r12.f44215c
            if (r11 == 0) goto L_0x00ce
            java.lang.String r11 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.C19983a.m34186a(r11, r5, r10)
            if (r11 == 0) goto L_0x00cb
            goto L_0x00d3
        L_0x00cb:
            int r10 = r10 + 1
            goto L_0x00ba
        L_0x00ce:
            kotlin.jvm.internal.C19383o.m32805o(r6)
            throw r7
        L_0x00d2:
            r11 = r7
        L_0x00d3:
            if (r11 == 0) goto L_0x00ed
            int r1 = r1 - r3
            r5 = r2
        L_0x00d7:
            if (r5 >= r1) goto L_0x00ed
            byte[] r6 = r12.f44216d
            if (r6 == 0) goto L_0x00e7
            java.lang.String r6 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.C19983a.m34186a(r6, r4, r5)
            if (r6 == 0) goto L_0x00e4
            goto L_0x00ee
        L_0x00e4:
            int r5 = r5 + 1
            goto L_0x00d7
        L_0x00e7:
            java.lang.String r13 = "publicSuffixExceptionListBytes"
            kotlin.jvm.internal.C19383o.m32805o(r13)
            throw r7
        L_0x00ed:
            r6 = r7
        L_0x00ee:
            r1 = 46
            r4 = 33
            r5 = 6
            if (r6 == 0) goto L_0x010d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r4)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            char[] r8 = new char[r3]
            r8[r2] = r1
            java.util.List r1 = kotlin.text.C19459m.m33055x1(r6, r8, r2, r5)
            goto L_0x0139
        L_0x010d:
            if (r8 != 0) goto L_0x0114
            if (r11 != 0) goto L_0x0114
            java.util.List<java.lang.String> r1 = f44211f
            goto L_0x0139
        L_0x0114:
            if (r8 == 0) goto L_0x011f
            char[] r6 = new char[r3]
            r6[r2] = r1
            java.util.List r6 = kotlin.text.C19459m.m33055x1(r8, r6, r2, r5)
            goto L_0x0121
        L_0x011f:
            kotlin.collections.EmptyList r6 = kotlin.collections.EmptyList.INSTANCE
        L_0x0121:
            if (r11 == 0) goto L_0x012c
            char[] r8 = new char[r3]
            r8[r2] = r1
            java.util.List r1 = kotlin.text.C19459m.m33055x1(r11, r8, r2, r5)
            goto L_0x012e
        L_0x012c:
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.INSTANCE
        L_0x012e:
            int r5 = r6.size()
            int r8 = r1.size()
            if (r5 <= r8) goto L_0x0139
            r1 = r6
        L_0x0139:
            int r5 = r0.size()
            int r6 = r1.size()
            if (r5 != r6) goto L_0x0150
            java.lang.Object r5 = r1.get(r2)
            java.lang.String r5 = (java.lang.String) r5
            char r5 = r5.charAt(r2)
            if (r5 == r4) goto L_0x0150
            return r7
        L_0x0150:
            java.lang.Object r5 = r1.get(r2)
            java.lang.String r5 = (java.lang.String) r5
            char r5 = r5.charAt(r2)
            if (r5 != r4) goto L_0x0165
            int r0 = r0.size()
            int r1 = r1.size()
            goto L_0x016e
        L_0x0165:
            int r0 = r0.size()
            int r1 = r1.size()
            int r1 = r1 + r3
        L_0x016e:
            int r0 = r0 - r1
            java.util.List r13 = m34183c(r13)
            kotlin.collections.s r13 = kotlin.collections.C19327t.m32633O0(r13)
            if (r0 < 0) goto L_0x017b
            r1 = r3
            goto L_0x017c
        L_0x017b:
            r1 = r2
        L_0x017c:
            if (r1 == 0) goto L_0x01c8
            if (r0 != 0) goto L_0x0181
            goto L_0x0192
        L_0x0181:
            boolean r1 = r13 instanceof kotlin.sequences.C19425c
            if (r1 == 0) goto L_0x018c
            kotlin.sequences.c r13 = (kotlin.sequences.C19425c) r13
            kotlin.sequences.g r13 = r13.mo71994a(r0)
            goto L_0x0192
        L_0x018c:
            kotlin.sequences.b r1 = new kotlin.sequences.b
            r1.<init>(r13, r0)
            r13 = r1
        L_0x0192:
            java.lang.String r0 = ""
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r13, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.util.Iterator r13 = r13.iterator()
        L_0x01a5:
            boolean r4 = r13.hasNext()
            if (r4 == 0) goto L_0x01bb
            java.lang.Object r4 = r13.next()
            int r2 = r2 + r3
            if (r2 <= r3) goto L_0x01b7
            java.lang.String r5 = "."
            r1.append(r5)
        L_0x01b7:
            kotlin.jvm.internal.C19382n.m32709G(r1, r4, r7)
            goto L_0x01a5
        L_0x01bb:
            r1.append(r0)
            java.lang.String r13 = r1.toString()
            java.lang.String r0 = "joinTo(StringBuilder(), …ed, transform).toString()"
            kotlin.jvm.internal.C19383o.m32796f(r13, r0)
            return r13
        L_0x01c8:
            java.lang.String r13 = "Requested element count "
            java.lang.String r1 = " is less than zero."
            java.lang.String r13 = android.support.p013v4.media.C0069a.m175f(r13, r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r13.toString()
            r0.<init>(r13)
            throw r0
        L_0x01da:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unable to load publicsuffixes.gz resource from the classpath."
            java.lang.String r0 = r0.toString()
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.mo72938a(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        kotlin.reflect.C19421p.m32917E(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        throw r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72939b() throws java.io.IOException {
        /*
            r6 = this;
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 == 0) goto L_0x004f
            lr.o r1 = new lr.o
            lr.q r0 = p756lr.C19906r.m34002f(r0)
            r1.<init>(r0)
            lr.x r0 = p756lr.C19906r.m33998b(r1)
            r1 = 0
            int r2 = r0.readInt()     // Catch:{ all -> 0x0048 }
            long r2 = (long) r2     // Catch:{ all -> 0x0048 }
            r0.mo72723U(r2)     // Catch:{ all -> 0x0048 }
            lr.f r4 = r0.f43916b     // Catch:{ all -> 0x0048 }
            byte[] r2 = r4.mo72750r(r2)     // Catch:{ all -> 0x0048 }
            int r3 = r0.readInt()     // Catch:{ all -> 0x0048 }
            long r3 = (long) r3     // Catch:{ all -> 0x0048 }
            r0.mo72723U(r3)     // Catch:{ all -> 0x0048 }
            lr.f r5 = r0.f43916b     // Catch:{ all -> 0x0048 }
            byte[] r3 = r5.mo72750r(r3)     // Catch:{ all -> 0x0048 }
            kotlin.m r4 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0048 }
            kotlin.reflect.C19421p.m32917E(r0, r1)
            monitor-enter(r6)
            r6.f44215c = r2     // Catch:{ all -> 0x0045 }
            r6.f44216d = r3     // Catch:{ all -> 0x0045 }
            monitor-exit(r6)
            java.util.concurrent.CountDownLatch r0 = r6.f44214b
            r0.countDown()
            return
        L_0x0045:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0048:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004a }
        L_0x004a:
            r2 = move-exception
            kotlin.reflect.C19421p.m32917E(r0, r1)
            throw r2
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.mo72939b():void");
    }
}
