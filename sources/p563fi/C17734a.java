package p563fi;

import androidx.preference.C3039b;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import p001a0.C0005b;
import p010a9.C0048b;
import p512bi.C14044c;
import p513bj.C14049b0;
import p513bj.C14076q;
import p513bj.C14077r;

/* renamed from: fi.a */
public final class C17734a extends C3039b {

    /* renamed from: d */
    public static final C0048b f38563d = new C0048b();

    /* renamed from: c */
    public final C17735a f38564c;

    /* renamed from: fi.a$a */
    public interface C17735a {
        /* renamed from: b */
        boolean mo90b(int i, int i2, int i3, int i4, int i5);
    }

    /* renamed from: fi.a$b */
    public static final class C17736b {

        /* renamed from: a */
        public final int f38565a;

        /* renamed from: b */
        public final boolean f38566b;

        /* renamed from: c */
        public final int f38567c;

        public C17736b(int i, int i2, boolean z) {
            this.f38565a = i;
            this.f38566b = z;
            this.f38567c = i2;
        }
    }

    public C17734a(C17735a aVar) {
        this.f38564c = aVar;
    }

    /* renamed from: A0 */
    public static GeobFrame m29740A0(int i, C14077r rVar) throws UnsupportedEncodingException {
        int p = rVar.mo46925p();
        String J0 = m29749J0(p);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        rVar.mo46911b(0, i2, bArr);
        int M0 = m29752M0(0, bArr);
        String str = new String(bArr, 0, M0, "ISO-8859-1");
        int i3 = M0 + 1;
        int L0 = m29751L0(i3, p, bArr);
        String D0 = m29743D0(J0, bArr, i3, L0);
        int I0 = m29748I0(p) + L0;
        int L02 = m29751L0(I0, p, bArr);
        String D02 = m29743D0(J0, bArr, I0, L02);
        int I02 = m29748I0(p) + L02;
        return new GeobFrame(str, D0, D02, i2 <= I02 ? C14049b0.f30918f : Arrays.copyOfRange(bArr, I02, i2));
    }

    /* renamed from: B0 */
    public static MlltFrame m29741B0(int i, C14077r rVar) {
        int u = rVar.mo46930u();
        int r = rVar.mo46927r();
        int r2 = rVar.mo46927r();
        int p = rVar.mo46925p();
        int p2 = rVar.mo46925p();
        C14076q qVar = new C14076q();
        qVar.mo46904k(rVar.f30988c, rVar.f30986a);
        qVar.mo46905l(rVar.f30987b * 8);
        int i2 = ((i - 10) * 8) / (p + p2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int h = qVar.mo46901h(p);
            int h2 = qVar.mo46901h(p2);
            iArr[i3] = h;
            iArr2[i3] = h2;
        }
        return new MlltFrame(u, r, r2, iArr, iArr2);
    }

    /* renamed from: C0 */
    public static PrivFrame m29742C0(int i, C14077r rVar) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        rVar.mo46911b(0, i, bArr);
        int M0 = m29752M0(0, bArr);
        String str = new String(bArr, 0, M0, "ISO-8859-1");
        int i2 = M0 + 1;
        return new PrivFrame(str, i <= i2 ? C14049b0.f30918f : Arrays.copyOfRange(bArr, i2, i));
    }

    /* renamed from: D0 */
    public static String m29743D0(String str, byte[] bArr, int i, int i2) throws UnsupportedEncodingException {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    /* renamed from: E0 */
    public static TextInformationFrame m29744E0(int i, C14077r rVar, String str) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int p = rVar.mo46925p();
        String J0 = m29749J0(p);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        rVar.mo46911b(0, i2, bArr);
        return new TextInformationFrame(str, (String) null, new String(bArr, 0, m29751L0(0, p, bArr), J0));
    }

    /* renamed from: F0 */
    public static TextInformationFrame m29745F0(int i, C14077r rVar) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int p = rVar.mo46925p();
        String J0 = m29749J0(p);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        rVar.mo46911b(0, i2, bArr);
        int L0 = m29751L0(0, p, bArr);
        String str = new String(bArr, 0, L0, J0);
        int I0 = m29748I0(p) + L0;
        return new TextInformationFrame("TXXX", str, m29743D0(J0, bArr, I0, m29751L0(I0, p, bArr)));
    }

    /* renamed from: G0 */
    public static UrlLinkFrame m29746G0(int i, C14077r rVar, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        rVar.mo46911b(0, i, bArr);
        return new UrlLinkFrame(str, (String) null, new String(bArr, 0, m29752M0(0, bArr), "ISO-8859-1"));
    }

    /* renamed from: H0 */
    public static UrlLinkFrame m29747H0(int i, C14077r rVar) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int p = rVar.mo46925p();
        String J0 = m29749J0(p);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        rVar.mo46911b(0, i2, bArr);
        int L0 = m29751L0(0, p, bArr);
        String str = new String(bArr, 0, L0, J0);
        int I0 = m29748I0(p) + L0;
        return new UrlLinkFrame("WXXX", str, m29743D0("ISO-8859-1", bArr, I0, m29752M0(I0, bArr)));
    }

    /* renamed from: I0 */
    public static int m29748I0(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* renamed from: J0 */
    public static String m29749J0(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    /* renamed from: K0 */
    public static String m29750K0(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
        }
        return String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
    }

    /* renamed from: L0 */
    public static int m29751L0(int i, int i2, byte[] bArr) {
        int M0 = m29752M0(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return M0;
        }
        while (M0 < bArr.length - 1) {
            if (M0 % 2 == 0 && bArr[M0 + 1] == 0) {
                return M0;
            }
            M0 = m29752M0(M0 + 1, bArr);
        }
        return bArr.length;
    }

    /* renamed from: M0 */
    public static int m29752M0(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* renamed from: N0 */
    public static int m29753N0(int i, C14077r rVar) {
        byte[] bArr = rVar.f30986a;
        int i2 = rVar.f30987b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0075, code lost:
        if ((r10 & 1) != 0) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0083, code lost:
        if ((r10 & 128) != 0) goto L_0x008a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0097 A[SYNTHETIC, Splitter:B:46:0x0097] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0093 A[SYNTHETIC] */
    /* renamed from: O0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m29754O0(p513bj.C14077r r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f30987b
        L_0x0006:
            int r3 = r1.f30988c     // Catch:{ all -> 0x00af }
            int r4 = r1.f30987b     // Catch:{ all -> 0x00af }
            int r3 = r3 - r4
            r4 = 1
            r5 = r20
            if (r3 < r5) goto L_0x00ab
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L_0x0021
            int r7 = r18.mo46912c()     // Catch:{ all -> 0x00af }
            long r8 = r18.mo46926q()     // Catch:{ all -> 0x00af }
            int r10 = r18.mo46930u()     // Catch:{ all -> 0x00af }
            goto L_0x002b
        L_0x0021:
            int r7 = r18.mo46927r()     // Catch:{ all -> 0x00af }
            int r8 = r18.mo46927r()     // Catch:{ all -> 0x00af }
            long r8 = (long) r8
            r10 = r6
        L_0x002b:
            r11 = 0
            if (r7 != 0) goto L_0x0039
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x0039
            if (r10 != 0) goto L_0x0039
            r1.mo46935z(r2)
            return r4
        L_0x0039:
            r7 = 4
            if (r0 != r7) goto L_0x006a
            if (r21 != 0) goto L_0x006a
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x004a
            r1.mo46935z(r2)
            return r6
        L_0x004a:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L_0x006a:
            if (r0 != r7) goto L_0x0078
            r3 = r10 & 64
            if (r3 == 0) goto L_0x0072
            r3 = r4
            goto L_0x0073
        L_0x0072:
            r3 = r6
        L_0x0073:
            r7 = r10 & 1
            if (r7 == 0) goto L_0x0086
            goto L_0x008a
        L_0x0078:
            if (r0 != r3) goto L_0x0088
            r3 = r10 & 32
            if (r3 == 0) goto L_0x0080
            r3 = r4
            goto L_0x0081
        L_0x0080:
            r3 = r6
        L_0x0081:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0086
            goto L_0x008a
        L_0x0086:
            r4 = r6
            goto L_0x008a
        L_0x0088:
            r3 = r6
            r4 = r3
        L_0x008a:
            if (r4 == 0) goto L_0x008e
            int r3 = r3 + 4
        L_0x008e:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x0097
            r1.mo46935z(r2)
            return r6
        L_0x0097:
            int r3 = r1.f30988c     // Catch:{ all -> 0x00af }
            int r4 = r1.f30987b     // Catch:{ all -> 0x00af }
            int r3 = r3 - r4
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x00a5
            r1.mo46935z(r2)
            return r6
        L_0x00a5:
            int r3 = (int) r8
            r1.mo46909A(r3)     // Catch:{ all -> 0x00af }
            goto L_0x0006
        L_0x00ab:
            r1.mo46935z(r2)
            return r4
        L_0x00af:
            r0 = move-exception
            r1.mo46935z(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p563fi.C17734a.m29754O0(bj.r, int, int, boolean):boolean");
    }

    /* renamed from: v0 */
    public static ApicFrame m29755v0(C14077r rVar, int i, int i2) throws UnsupportedEncodingException {
        int i3;
        String str;
        int p = rVar.mo46925p();
        String J0 = m29749J0(p);
        int i4 = i - 1;
        byte[] bArr = new byte[i4];
        rVar.mo46911b(0, i4, bArr);
        if (i2 == 2) {
            String valueOf = String.valueOf(C0005b.m56q0(new String(bArr, 0, 3, "ISO-8859-1")));
            str = valueOf.length() != 0 ? "image/".concat(valueOf) : new String("image/");
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            i3 = 2;
        } else {
            i3 = m29752M0(0, bArr);
            String q0 = C0005b.m56q0(new String(bArr, 0, i3, "ISO-8859-1"));
            str = q0.indexOf(47) == -1 ? q0.length() != 0 ? "image/".concat(q0) : new String("image/") : q0;
        }
        byte b = bArr[i3 + 1] & 255;
        int i5 = i3 + 2;
        int L0 = m29751L0(i5, p, bArr);
        String str2 = new String(bArr, i5, L0 - i5, J0);
        int I0 = m29748I0(p) + L0;
        return new ApicFrame(str, str2, b, i4 <= I0 ? C14049b0.f30918f : Arrays.copyOfRange(bArr, I0, i4));
    }

    /* renamed from: w0 */
    public static ChapterFrame m29756w0(C14077r rVar, int i, int i2, boolean z, int i3, C17735a aVar) throws UnsupportedEncodingException {
        C14077r rVar2 = rVar;
        int i4 = rVar2.f30987b;
        int M0 = m29752M0(i4, rVar2.f30986a);
        String str = new String(rVar2.f30986a, i4, M0 - i4, "ISO-8859-1");
        rVar.mo46935z(M0 + 1);
        int c = rVar.mo46912c();
        int c2 = rVar.mo46912c();
        long q = rVar.mo46926q();
        long j = q == UnsignedInteger.INT_MASK ? -1 : q;
        long q2 = rVar.mo46926q();
        long j2 = q2 == UnsignedInteger.INT_MASK ? -1 : q2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (rVar2.f30987b < i5) {
            Id3Frame z0 = m29759z0(i2, rVar, z, i3, aVar);
            if (z0 != null) {
                arrayList.add(z0);
            }
        }
        return new ChapterFrame(str, c, c2, j, j2, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    /* renamed from: x0 */
    public static ChapterTocFrame m29757x0(C14077r rVar, int i, int i2, boolean z, int i3, C17735a aVar) throws UnsupportedEncodingException {
        C14077r rVar2 = rVar;
        int i4 = rVar2.f30987b;
        int M0 = m29752M0(i4, rVar2.f30986a);
        String str = new String(rVar2.f30986a, i4, M0 - i4, "ISO-8859-1");
        rVar2.mo46935z(M0 + 1);
        int p = rVar.mo46925p();
        boolean z2 = (p & 2) != 0;
        boolean z3 = (p & 1) != 0;
        int p2 = rVar.mo46925p();
        String[] strArr = new String[p2];
        for (int i5 = 0; i5 < p2; i5++) {
            int i6 = rVar2.f30987b;
            int M02 = m29752M0(i6, rVar2.f30986a);
            strArr[i5] = new String(rVar2.f30986a, i6, M02 - i6, "ISO-8859-1");
            rVar2.mo46935z(M02 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (rVar2.f30987b < i7) {
            Id3Frame z0 = m29759z0(i2, rVar2, z, i3, aVar);
            if (z0 != null) {
                arrayList.add(z0);
            }
        }
        return new ChapterTocFrame(str, z2, z3, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    /* renamed from: y0 */
    public static CommentFrame m29758y0(int i, C14077r rVar) throws UnsupportedEncodingException {
        if (i < 4) {
            return null;
        }
        int p = rVar.mo46925p();
        String J0 = m29749J0(p);
        byte[] bArr = new byte[3];
        rVar.mo46911b(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        rVar.mo46911b(0, i2, bArr2);
        int L0 = m29751L0(0, p, bArr2);
        String str2 = new String(bArr2, 0, L0, J0);
        int I0 = m29748I0(p) + L0;
        return new CommentFrame(str, str2, m29743D0(J0, bArr2, I0, m29751L0(I0, p, bArr2)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0185, code lost:
        if (r13 == 67) goto L_0x0187;
     */
    /* renamed from: z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.exoplayer2.metadata.id3.Id3Frame m29759z0(int r18, p513bj.C14077r r19, boolean r20, int r21, p563fi.C17734a.C17735a r22) {
        /*
            r0 = r18
            r7 = r19
            int r8 = r19.mo46925p()
            int r9 = r19.mo46925p()
            int r10 = r19.mo46925p()
            r12 = 3
            if (r0 < r12) goto L_0x0019
            int r1 = r19.mo46925p()
            r13 = r1
            goto L_0x001a
        L_0x0019:
            r13 = 0
        L_0x001a:
            r14 = 4
            if (r0 != r14) goto L_0x003c
            int r1 = r19.mo46928s()
            if (r20 != 0) goto L_0x003a
            r2 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r1 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 7
            r2 = r2 | r3
            int r3 = r1 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 14
            r2 = r2 | r3
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 21
            r1 = r1 | r2
        L_0x003a:
            r15 = r1
            goto L_0x0048
        L_0x003c:
            if (r0 != r12) goto L_0x0043
            int r1 = r19.mo46928s()
            goto L_0x003a
        L_0x0043:
            int r1 = r19.mo46927r()
            goto L_0x003a
        L_0x0048:
            if (r0 < r12) goto L_0x0050
            int r1 = r19.mo46930u()
            r6 = r1
            goto L_0x0051
        L_0x0050:
            r6 = 0
        L_0x0051:
            r16 = 0
            if (r8 != 0) goto L_0x0065
            if (r9 != 0) goto L_0x0065
            if (r10 != 0) goto L_0x0065
            if (r13 != 0) goto L_0x0065
            if (r15 != 0) goto L_0x0065
            if (r6 != 0) goto L_0x0065
            int r0 = r7.f30988c
            r7.mo46935z(r0)
            return r16
        L_0x0065:
            int r1 = r7.f30987b
            int r5 = r1 + r15
            int r1 = r7.f30988c
            java.lang.String r4 = "Id3Decoder"
            if (r5 <= r1) goto L_0x007a
            java.lang.String r0 = "Frame size exceeds remaining tag data"
            android.util.Log.w(r4, r0)
            int r0 = r7.f30988c
            r7.mo46935z(r0)
            return r16
        L_0x007a:
            if (r22 == 0) goto L_0x0092
            r1 = r22
            r2 = r18
            r3 = r8
            r17 = r4
            r4 = r9
            r11 = r5
            r5 = r10
            r14 = r6
            r6 = r13
            boolean r1 = r1.mo90b(r2, r3, r4, r5, r6)
            if (r1 != 0) goto L_0x0096
            r7.mo46935z(r11)
            return r16
        L_0x0092:
            r17 = r4
            r11 = r5
            r14 = r6
        L_0x0096:
            r1 = 1
            if (r0 != r12) goto L_0x00b3
            r2 = r14 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x009f
            r2 = r1
            goto L_0x00a0
        L_0x009f:
            r2 = 0
        L_0x00a0:
            r3 = r14 & 64
            if (r3 == 0) goto L_0x00a6
            r3 = r1
            goto L_0x00a7
        L_0x00a6:
            r3 = 0
        L_0x00a7:
            r4 = r14 & 32
            if (r4 == 0) goto L_0x00ad
            r4 = r1
            goto L_0x00ae
        L_0x00ad:
            r4 = 0
        L_0x00ae:
            r5 = r4
            r6 = 0
            r4 = r3
            r3 = r2
            goto L_0x00e3
        L_0x00b3:
            r2 = 4
            if (r0 != r2) goto L_0x00db
            r2 = r14 & 64
            if (r2 == 0) goto L_0x00bc
            r4 = r1
            goto L_0x00bd
        L_0x00bc:
            r4 = 0
        L_0x00bd:
            r2 = r14 & 8
            if (r2 == 0) goto L_0x00c3
            r2 = r1
            goto L_0x00c4
        L_0x00c3:
            r2 = 0
        L_0x00c4:
            r3 = r14 & 4
            if (r3 == 0) goto L_0x00ca
            r3 = r1
            goto L_0x00cb
        L_0x00ca:
            r3 = 0
        L_0x00cb:
            r5 = r14 & 2
            if (r5 == 0) goto L_0x00d1
            r5 = r1
            goto L_0x00d2
        L_0x00d1:
            r5 = 0
        L_0x00d2:
            r6 = r14 & 1
            if (r6 == 0) goto L_0x00df
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r1
            goto L_0x00e3
        L_0x00db:
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x00df:
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = 0
        L_0x00e3:
            if (r2 != 0) goto L_0x022e
            if (r4 == 0) goto L_0x00e9
            goto L_0x022e
        L_0x00e9:
            if (r5 == 0) goto L_0x00f0
            int r15 = r15 + -1
            r7.mo46909A(r1)
        L_0x00f0:
            if (r3 == 0) goto L_0x00f8
            int r15 = r15 + -4
            r1 = 4
            r7.mo46909A(r1)
        L_0x00f8:
            if (r6 == 0) goto L_0x00fe
            int r15 = m29753N0(r15, r7)
        L_0x00fe:
            r1 = 84
            r2 = 88
            r3 = 2
            if (r8 != r1) goto L_0x0113
            if (r9 != r2) goto L_0x0113
            if (r10 != r2) goto L_0x0113
            if (r0 == r3) goto L_0x010d
            if (r13 != r2) goto L_0x0113
        L_0x010d:
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r1 = m29745F0(r15, r7)     // Catch:{ UnsupportedEncodingException -> 0x0122 }
            goto L_0x01ef
        L_0x0113:
            if (r8 != r1) goto L_0x0126
            java.lang.String r1 = m29750K0(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0122 }
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r1 = m29744E0(r15, r7, r1)     // Catch:{ UnsupportedEncodingException -> 0x0122 }
            goto L_0x01ef
        L_0x011f:
            r0 = move-exception
            goto L_0x022a
        L_0x0122:
            r2 = r17
            goto L_0x0221
        L_0x0126:
            r4 = 87
            if (r8 != r4) goto L_0x0138
            if (r9 != r2) goto L_0x0138
            if (r10 != r2) goto L_0x0138
            if (r0 == r3) goto L_0x0132
            if (r13 != r2) goto L_0x0138
        L_0x0132:
            com.google.android.exoplayer2.metadata.id3.UrlLinkFrame r1 = m29747H0(r15, r7)     // Catch:{ UnsupportedEncodingException -> 0x0122 }
            goto L_0x01ef
        L_0x0138:
            if (r8 != r4) goto L_0x0144
            java.lang.String r1 = m29750K0(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0122 }
            com.google.android.exoplayer2.metadata.id3.UrlLinkFrame r1 = m29746G0(r15, r7, r1)     // Catch:{ UnsupportedEncodingException -> 0x0122 }
            goto L_0x01ef
        L_0x0144:
            r2 = 73
            r4 = 80
            if (r8 != r4) goto L_0x015a
            r5 = 82
            if (r9 != r5) goto L_0x015a
            if (r10 != r2) goto L_0x015a
            r5 = 86
            if (r13 != r5) goto L_0x015a
            com.google.android.exoplayer2.metadata.id3.PrivFrame r1 = m29742C0(r15, r7)     // Catch:{ UnsupportedEncodingException -> 0x0122 }
            goto L_0x01ef
        L_0x015a:
            r5 = 71
            r6 = 79
            if (r8 != r5) goto L_0x0172
            r5 = 69
            if (r9 != r5) goto L_0x0172
            if (r10 != r6) goto L_0x0172
            r5 = 66
            if (r13 == r5) goto L_0x016c
            if (r0 != r3) goto L_0x0172
        L_0x016c:
            com.google.android.exoplayer2.metadata.id3.GeobFrame r1 = m29740A0(r15, r7)     // Catch:{ UnsupportedEncodingException -> 0x0122 }
            goto L_0x01ef
        L_0x0172:
            r5 = 65
            r12 = 67
            if (r0 != r3) goto L_0x017f
            if (r8 != r4) goto L_0x018d
            if (r9 != r2) goto L_0x018d
            if (r10 != r12) goto L_0x018d
            goto L_0x0187
        L_0x017f:
            if (r8 != r5) goto L_0x018d
            if (r9 != r4) goto L_0x018d
            if (r10 != r2) goto L_0x018d
            if (r13 != r12) goto L_0x018d
        L_0x0187:
            com.google.android.exoplayer2.metadata.id3.ApicFrame r1 = m29755v0(r7, r15, r0)     // Catch:{ UnsupportedEncodingException -> 0x0122 }
            goto L_0x01ef
        L_0x018d:
            r2 = 77
            if (r8 != r12) goto L_0x019e
            if (r9 != r6) goto L_0x019e
            if (r10 != r2) goto L_0x019e
            if (r13 == r2) goto L_0x0199
            if (r0 != r3) goto L_0x019e
        L_0x0199:
            com.google.android.exoplayer2.metadata.id3.CommentFrame r1 = m29758y0(r15, r7)     // Catch:{ UnsupportedEncodingException -> 0x0122 }
            goto L_0x01ef
        L_0x019e:
            if (r8 != r12) goto L_0x01b8
            r3 = 72
            if (r9 != r3) goto L_0x01b8
            if (r10 != r5) goto L_0x01b8
            if (r13 != r4) goto L_0x01b8
            r1 = r19
            r2 = r15
            r3 = r18
            r4 = r20
            r5 = r21
            r6 = r22
            com.google.android.exoplayer2.metadata.id3.ChapterFrame r1 = m29756w0(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x0122 }
            goto L_0x01ef
        L_0x01b8:
            if (r8 != r12) goto L_0x01d0
            if (r9 != r1) goto L_0x01d0
            if (r10 != r6) goto L_0x01d0
            if (r13 != r12) goto L_0x01d0
            r1 = r19
            r2 = r15
            r3 = r18
            r4 = r20
            r5 = r21
            r6 = r22
            com.google.android.exoplayer2.metadata.id3.ChapterTocFrame r1 = m29757x0(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x0122 }
            goto L_0x01ef
        L_0x01d0:
            if (r8 != r2) goto L_0x01df
            r2 = 76
            if (r9 != r2) goto L_0x01df
            if (r10 != r2) goto L_0x01df
            if (r13 != r1) goto L_0x01df
            com.google.android.exoplayer2.metadata.id3.MlltFrame r1 = m29741B0(r15, r7)     // Catch:{ UnsupportedEncodingException -> 0x0122 }
            goto L_0x01ef
        L_0x01df:
            java.lang.String r1 = m29750K0(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0122 }
            byte[] r2 = new byte[r15]     // Catch:{ UnsupportedEncodingException -> 0x0122 }
            r3 = 0
            r7.mo46911b(r3, r15, r2)     // Catch:{ UnsupportedEncodingException -> 0x0122 }
            com.google.android.exoplayer2.metadata.id3.BinaryFrame r3 = new com.google.android.exoplayer2.metadata.id3.BinaryFrame     // Catch:{ UnsupportedEncodingException -> 0x0122 }
            r3.<init>(r1, r2)     // Catch:{ UnsupportedEncodingException -> 0x0122 }
            r1 = r3
        L_0x01ef:
            if (r1 != 0) goto L_0x021d
            java.lang.String r0 = m29750K0(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0122 }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ UnsupportedEncodingException -> 0x0122 }
            int r2 = r2.length()     // Catch:{ UnsupportedEncodingException -> 0x0122 }
            int r2 = r2 + 50
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x0122 }
            r3.<init>(r2)     // Catch:{ UnsupportedEncodingException -> 0x0122 }
            java.lang.String r2 = "Failed to decode frame: id="
            r3.append(r2)     // Catch:{ UnsupportedEncodingException -> 0x0122 }
            r3.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0122 }
            java.lang.String r0 = ", frameSize="
            r3.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0122 }
            r3.append(r15)     // Catch:{ UnsupportedEncodingException -> 0x0122 }
            java.lang.String r0 = r3.toString()     // Catch:{ UnsupportedEncodingException -> 0x0122 }
            r2 = r17
            android.util.Log.w(r2, r0)     // Catch:{ UnsupportedEncodingException -> 0x0221 }
        L_0x021d:
            r7.mo46935z(r11)
            return r1
        L_0x0221:
            java.lang.String r0 = "Unsupported character encoding"
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x011f }
            r7.mo46935z(r11)
            return r16
        L_0x022a:
            r7.mo46935z(r11)
            throw r0
        L_0x022e:
            r2 = r17
            java.lang.String r0 = "Skipping unsupported compressed or encrypted frame"
            android.util.Log.w(r2, r0)
            r7.mo46935z(r11)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: p563fi.C17734a.m29759z0(int, bj.r, boolean, int, fi.a$a):com.google.android.exoplayer2.metadata.id3.Id3Frame");
    }

    /* renamed from: n0 */
    public final Metadata mo11184n0(C14044c cVar, ByteBuffer byteBuffer) {
        return mo68991u0(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c3  */
    /* renamed from: u0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.exoplayer2.metadata.Metadata mo68991u0(int r13, byte[] r14) {
        /*
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            bj.r r1 = new bj.r
            r1.<init>(r13, r14)
            int r13 = r1.f30988c
            int r14 = r1.f30987b
            int r13 = r13 - r14
            r14 = 2
            java.lang.String r2 = "Id3Decoder"
            r3 = 10
            r4 = 4
            r5 = 1
            r6 = 0
            r7 = 0
            if (r13 >= r3) goto L_0x0021
            java.lang.String r13 = "Data too short to be an ID3 tag"
            android.util.Log.w(r2, r13)
            goto L_0x00bf
        L_0x0021:
            int r13 = r1.mo46927r()
            r8 = 4801587(0x494433, float:6.728456E-39)
            if (r13 == r8) goto L_0x0053
            java.lang.String r8 = "Unexpected first three bytes of ID3 tag header: 0x"
            java.lang.Object[] r9 = new java.lang.Object[r5]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r9[r6] = r13
            java.lang.String r13 = "%06X"
            java.lang.String r13 = java.lang.String.format(r13, r9)
            java.lang.String r13 = java.lang.String.valueOf(r13)
            int r9 = r13.length()
            if (r9 == 0) goto L_0x0049
            java.lang.String r13 = r8.concat(r13)
            goto L_0x004e
        L_0x0049:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r8)
        L_0x004e:
            android.util.Log.w(r2, r13)
            goto L_0x00bf
        L_0x0053:
            int r13 = r1.mo46925p()
            r1.mo46909A(r5)
            int r8 = r1.mo46925p()
            int r9 = r1.mo46924o()
            if (r13 != r14) goto L_0x0073
            r10 = r8 & 64
            if (r10 == 0) goto L_0x006a
            r10 = r5
            goto L_0x006b
        L_0x006a:
            r10 = r6
        L_0x006b:
            if (r10 == 0) goto L_0x00a9
            java.lang.String r13 = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme"
            android.util.Log.w(r2, r13)
            goto L_0x00bf
        L_0x0073:
            r10 = 3
            if (r13 != r10) goto L_0x0089
            r10 = r8 & 64
            if (r10 == 0) goto L_0x007c
            r10 = r5
            goto L_0x007d
        L_0x007c:
            r10 = r6
        L_0x007d:
            if (r10 == 0) goto L_0x00a9
            int r10 = r1.mo46912c()
            r1.mo46909A(r10)
            int r10 = r10 + r4
            int r9 = r9 - r10
            goto L_0x00a9
        L_0x0089:
            if (r13 != r4) goto L_0x00b8
            r10 = r8 & 64
            if (r10 == 0) goto L_0x0091
            r10 = r5
            goto L_0x0092
        L_0x0091:
            r10 = r6
        L_0x0092:
            if (r10 == 0) goto L_0x009e
            int r10 = r1.mo46924o()
            int r11 = r10 + -4
            r1.mo46909A(r11)
            int r9 = r9 - r10
        L_0x009e:
            r10 = r8 & 16
            if (r10 == 0) goto L_0x00a4
            r10 = r5
            goto L_0x00a5
        L_0x00a4:
            r10 = r6
        L_0x00a5:
            if (r10 == 0) goto L_0x00a9
            int r9 = r9 + -10
        L_0x00a9:
            if (r13 >= r4) goto L_0x00b1
            r8 = r8 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x00b1
            r8 = r5
            goto L_0x00b2
        L_0x00b1:
            r8 = r6
        L_0x00b2:
            fi.a$b r10 = new fi.a$b
            r10.<init>(r13, r9, r8)
            goto L_0x00c0
        L_0x00b8:
            r8 = 57
            java.lang.String r9 = "Skipped ID3 tag with unsupported majorVersion="
            p003a2.C0023f.m112m(r8, r9, r13, r2)
        L_0x00bf:
            r10 = r7
        L_0x00c0:
            if (r10 != 0) goto L_0x00c3
            return r7
        L_0x00c3:
            int r13 = r1.f30987b
            int r8 = r10.f38565a
            if (r8 != r14) goto L_0x00ca
            r3 = 6
        L_0x00ca:
            int r14 = r10.f38567c
            boolean r8 = r10.f38566b
            if (r8 == 0) goto L_0x00d4
            int r14 = m29753N0(r14, r1)
        L_0x00d4:
            int r13 = r13 + r14
            r1.mo46934y(r13)
            int r13 = r10.f38565a
            boolean r13 = m29754O0(r1, r13, r3, r6)
            if (r13 != 0) goto L_0x00f5
            int r13 = r10.f38565a
            if (r13 != r4) goto L_0x00eb
            boolean r13 = m29754O0(r1, r4, r3, r5)
            if (r13 == 0) goto L_0x00eb
            goto L_0x00f6
        L_0x00eb:
            int r13 = r10.f38565a
            r14 = 56
            java.lang.String r0 = "Failed to validate ID3 tag with majorVersion="
            p003a2.C0023f.m112m(r14, r0, r13, r2)
            return r7
        L_0x00f5:
            r5 = r6
        L_0x00f6:
            int r13 = r1.f30988c
            int r14 = r1.f30987b
            int r13 = r13 - r14
            if (r13 < r3) goto L_0x010b
            int r13 = r10.f38565a
            fi.a$a r14 = r12.f38564c
            com.google.android.exoplayer2.metadata.id3.Id3Frame r13 = m29759z0(r13, r1, r5, r3, r14)
            if (r13 == 0) goto L_0x00f6
            r0.add(r13)
            goto L_0x00f6
        L_0x010b:
            com.google.android.exoplayer2.metadata.Metadata r13 = new com.google.android.exoplayer2.metadata.Metadata
            r13.<init>((java.util.List<? extends com.google.android.exoplayer2.metadata.Metadata.Entry>) r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p563fi.C17734a.mo68991u0(int, byte[]):com.google.android.exoplayer2.metadata.Metadata");
    }
}
