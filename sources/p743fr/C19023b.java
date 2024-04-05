package p743fr;

import android.support.p013v4.media.C0072d;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.internal.C19736t;
import okio.ByteString;
import p735br.C18980c;
import p743fr.C19045o;
import p743fr.C19054r;
import p756lr.C19893f;
import p756lr.C19906r;
import p756lr.C19913x;

/* renamed from: fr.b */
public final class C19023b {

    /* renamed from: a */
    public static final C19022a[] f42398a;

    /* renamed from: b */
    public static final Map<ByteString, Integer> f42399b;

    /* renamed from: fr.b$a */
    public static final class C19024a {

        /* renamed from: a */
        public final ArrayList f42400a = new ArrayList();

        /* renamed from: b */
        public final C19913x f42401b;

        /* renamed from: c */
        public C19022a[] f42402c;

        /* renamed from: d */
        public int f42403d;

        /* renamed from: e */
        public int f42404e;

        /* renamed from: f */
        public int f42405f;

        /* renamed from: g */
        public final int f42406g = RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT;

        /* renamed from: h */
        public int f42407h = RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT;

        public C19024a(C19045o.C19047b bVar) {
            this.f42401b = C19906r.m33998b(bVar);
            this.f42402c = new C19022a[8];
            this.f42403d = 7;
        }

        /* renamed from: a */
        public final int mo70473a(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f42402c.length;
                while (true) {
                    length--;
                    i2 = this.f42403d;
                    if (length < i2 || i <= 0) {
                        C19022a[] aVarArr = this.f42402c;
                        System.arraycopy(aVarArr, i2 + 1, aVarArr, i2 + 1 + i3, this.f42404e);
                        this.f42403d += i3;
                    } else {
                        C19022a aVar = this.f42402c[length];
                        C19383o.m32794d(aVar);
                        int i4 = aVar.f42395a;
                        i -= i4;
                        this.f42405f -= i4;
                        this.f42404e--;
                        i3++;
                    }
                }
                C19022a[] aVarArr2 = this.f42402c;
                System.arraycopy(aVarArr2, i2 + 1, aVarArr2, i2 + 1 + i3, this.f42404e);
                this.f42403d += i3;
            }
            return i3;
        }

        /* renamed from: b */
        public final ByteString mo70474b(int i) throws IOException {
            if (i >= 0 && i <= C19023b.f42398a.length - 1) {
                return C19023b.f42398a[i].f42396b;
            }
            int length = this.f42403d + 1 + (i - C19023b.f42398a.length);
            if (length >= 0) {
                C19022a[] aVarArr = this.f42402c;
                if (length < aVarArr.length) {
                    C19022a aVar = aVarArr[length];
                    C19383o.m32794d(aVar);
                    return aVar.f42396b;
                }
            }
            StringBuilder h = C0072d.m201h("Header index too large ");
            h.append(i + 1);
            throw new IOException(h.toString());
        }

        /* renamed from: c */
        public final void mo70475c(C19022a aVar) {
            this.f42400a.add(aVar);
            int i = aVar.f42395a;
            int i2 = this.f42407h;
            if (i > i2) {
                C19318k.m32610b1(this.f42402c, (C19736t) null);
                this.f42403d = this.f42402c.length - 1;
                this.f42404e = 0;
                this.f42405f = 0;
                return;
            }
            mo70473a((this.f42405f + i) - i2);
            int i3 = this.f42404e + 1;
            C19022a[] aVarArr = this.f42402c;
            if (i3 > aVarArr.length) {
                C19022a[] aVarArr2 = new C19022a[(aVarArr.length * 2)];
                System.arraycopy(aVarArr, 0, aVarArr2, aVarArr.length, aVarArr.length);
                this.f42403d = this.f42402c.length - 1;
                this.f42402c = aVarArr2;
            }
            int i4 = this.f42403d;
            this.f42403d = i4 - 1;
            this.f42402c[i4] = aVar;
            this.f42404e++;
            this.f42405f += i;
        }

        /* renamed from: d */
        public final ByteString mo70476d() throws IOException {
            byte readByte = this.f42401b.readByte();
            byte[] bArr = C18980c.f42301a;
            byte b = readByte & 255;
            byte b2 = 0;
            boolean z = (b & 128) == 128;
            long e = (long) mo70477e(b, 127);
            if (!z) {
                return this.f42401b.mo72725X(e);
            }
            C19893f fVar = new C19893f();
            int[] iArr = C19054r.f42546a;
            C19913x xVar = this.f42401b;
            C19383o.m32797g(xVar, "source");
            C19054r.C19055a aVar = C19054r.f42548c;
            int i = 0;
            for (long j = 0; j < e; j++) {
                byte readByte2 = xVar.readByte();
                byte[] bArr2 = C18980c.f42301a;
                b2 = (b2 << 8) | (readByte2 & 255);
                i += 8;
                while (i >= 8) {
                    int i2 = i - 8;
                    C19054r.C19055a[] aVarArr = aVar.f42549a;
                    C19383o.m32794d(aVarArr);
                    aVar = aVarArr[(b2 >>> i2) & 255];
                    C19383o.m32794d(aVar);
                    if (aVar.f42549a == null) {
                        fVar.mo72771x0(aVar.f42550b);
                        i -= aVar.f42551c;
                        aVar = C19054r.f42548c;
                    } else {
                        i = i2;
                    }
                }
            }
            while (i > 0) {
                C19054r.C19055a[] aVarArr2 = aVar.f42549a;
                C19383o.m32794d(aVarArr2);
                C19054r.C19055a aVar2 = aVarArr2[(b2 << (8 - i)) & 255];
                C19383o.m32794d(aVar2);
                if (aVar2.f42549a != null || aVar2.f42551c > i) {
                    break;
                }
                fVar.mo72771x0(aVar2.f42550b);
                i -= aVar2.f42551c;
                aVar = C19054r.f42548c;
            }
            return fVar.mo72759t();
        }

        /* renamed from: e */
        public final int mo70477e(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                byte readByte = this.f42401b.readByte();
                byte[] bArr = C18980c.f42301a;
                byte b = readByte & 255;
                if ((b & 128) == 0) {
                    return i2 + (b << i4);
                }
                i2 += (b & Byte.MAX_VALUE) << i4;
                i4 += 7;
            }
        }
    }

    /* renamed from: fr.b$b */
    public static final class C19025b {

        /* renamed from: a */
        public int f42408a;

        /* renamed from: b */
        public boolean f42409b;

        /* renamed from: c */
        public int f42410c;

        /* renamed from: d */
        public C19022a[] f42411d;

        /* renamed from: e */
        public int f42412e;

        /* renamed from: f */
        public int f42413f;

        /* renamed from: g */
        public int f42414g;

        /* renamed from: h */
        public final boolean f42415h = true;

        /* renamed from: i */
        public final C19893f f42416i;

        public C19025b(C19893f fVar) {
            this.f42416i = fVar;
            this.f42408a = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f42410c = RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT;
            this.f42411d = new C19022a[8];
            this.f42412e = 7;
        }

        /* renamed from: a */
        public final void mo70478a(int i) {
            int i2;
            if (i > 0) {
                int length = this.f42411d.length - 1;
                int i3 = 0;
                while (true) {
                    i2 = this.f42412e;
                    if (length < i2 || i <= 0) {
                        C19022a[] aVarArr = this.f42411d;
                        int i4 = i2 + 1;
                        System.arraycopy(aVarArr, i4, aVarArr, i4 + i3, this.f42413f);
                        C19022a[] aVarArr2 = this.f42411d;
                        int i5 = this.f42412e + 1;
                        Arrays.fill(aVarArr2, i5, i5 + i3, (Object) null);
                        this.f42412e += i3;
                    } else {
                        C19022a aVar = this.f42411d[length];
                        C19383o.m32794d(aVar);
                        i -= aVar.f42395a;
                        int i6 = this.f42414g;
                        C19022a aVar2 = this.f42411d[length];
                        C19383o.m32794d(aVar2);
                        this.f42414g = i6 - aVar2.f42395a;
                        this.f42413f--;
                        i3++;
                        length--;
                    }
                }
                C19022a[] aVarArr3 = this.f42411d;
                int i42 = i2 + 1;
                System.arraycopy(aVarArr3, i42, aVarArr3, i42 + i3, this.f42413f);
                C19022a[] aVarArr22 = this.f42411d;
                int i52 = this.f42412e + 1;
                Arrays.fill(aVarArr22, i52, i52 + i3, (Object) null);
                this.f42412e += i3;
            }
        }

        /* renamed from: b */
        public final void mo70479b(C19022a aVar) {
            int i = aVar.f42395a;
            int i2 = this.f42410c;
            if (i > i2) {
                C19318k.m32610b1(this.f42411d, (C19736t) null);
                this.f42412e = this.f42411d.length - 1;
                this.f42413f = 0;
                this.f42414g = 0;
                return;
            }
            mo70478a((this.f42414g + i) - i2);
            int i3 = this.f42413f + 1;
            C19022a[] aVarArr = this.f42411d;
            if (i3 > aVarArr.length) {
                C19022a[] aVarArr2 = new C19022a[(aVarArr.length * 2)];
                System.arraycopy(aVarArr, 0, aVarArr2, aVarArr.length, aVarArr.length);
                this.f42412e = this.f42411d.length - 1;
                this.f42411d = aVarArr2;
            }
            int i4 = this.f42412e;
            this.f42412e = i4 - 1;
            this.f42411d[i4] = aVar;
            this.f42413f++;
            this.f42414g += i;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: long} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo70480c(okio.ByteString r11) throws java.io.IOException {
            /*
                r10 = this;
                java.lang.String r0 = "data"
                kotlin.jvm.internal.C19383o.m32797g(r11, r0)
                boolean r0 = r10.f42415h
                r1 = 127(0x7f, float:1.78E-43)
                r2 = 0
                if (r0 == 0) goto L_0x008b
                int[] r0 = p743fr.C19054r.f42546a
                int r0 = r11.size()
                r3 = 0
                r5 = r2
                r6 = r3
            L_0x0016:
                if (r5 >= r0) goto L_0x0029
                byte r8 = r11.getByte(r5)
                byte[] r9 = p735br.C18980c.f42301a
                r8 = r8 & 255(0xff, float:3.57E-43)
                byte[] r9 = p743fr.C19054r.f42547b
                byte r8 = r9[r8]
                long r8 = (long) r8
                long r6 = r6 + r8
                int r5 = r5 + 1
                goto L_0x0016
            L_0x0029:
                r0 = 7
                long r8 = (long) r0
                long r6 = r6 + r8
                r0 = 3
                long r5 = r6 >> r0
                int r0 = (int) r5
                int r5 = r11.size()
                if (r0 >= r5) goto L_0x008b
                lr.f r0 = new lr.f
                r0.<init>()
                int[] r5 = p743fr.C19054r.f42546a
                int r5 = r11.size()
                r6 = r3
                r3 = r2
            L_0x0043:
                if (r2 >= r5) goto L_0x0069
                byte r4 = r11.getByte(r2)
                byte[] r8 = p735br.C18980c.f42301a
                r4 = r4 & 255(0xff, float:3.57E-43)
                int[] r8 = p743fr.C19054r.f42546a
                r8 = r8[r4]
                byte[] r9 = p743fr.C19054r.f42547b
                byte r4 = r9[r4]
                long r6 = r6 << r4
                long r8 = (long) r8
                long r6 = r6 | r8
                int r3 = r3 + r4
            L_0x0059:
                r4 = 8
                if (r3 < r4) goto L_0x0066
                int r3 = r3 + -8
                long r8 = r6 >> r3
                int r4 = (int) r8
                r0.mo72771x0(r4)
                goto L_0x0059
            L_0x0066:
                int r2 = r2 + 1
                goto L_0x0043
            L_0x0069:
                if (r3 <= 0) goto L_0x0078
                int r11 = 8 - r3
                long r4 = r6 << r11
                r6 = 255(0xff, double:1.26E-321)
                long r2 = r6 >>> r3
                long r2 = r2 | r4
                int r11 = (int) r2
                r0.mo72771x0(r11)
            L_0x0078:
                okio.ByteString r11 = r0.mo72759t()
                int r0 = r11.size()
                r2 = 128(0x80, float:1.794E-43)
                r10.mo70482e(r0, r1, r2)
                lr.f r0 = r10.f42416i
                r0.mo72747m0(r11)
                goto L_0x0097
            L_0x008b:
                int r0 = r11.size()
                r10.mo70482e(r0, r1, r2)
                lr.f r0 = r10.f42416i
                r0.mo72747m0(r11)
            L_0x0097:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p743fr.C19023b.C19025b.mo70480c(okio.ByteString):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x006d  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00ab  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00b3  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo70481d(java.util.ArrayList r13) throws java.io.IOException {
            /*
                r12 = this;
                boolean r0 = r12.f42409b
                r1 = 0
                if (r0 == 0) goto L_0x001e
                int r0 = r12.f42408a
                int r2 = r12.f42410c
                r3 = 32
                r4 = 31
                if (r0 >= r2) goto L_0x0012
                r12.mo70482e(r0, r4, r3)
            L_0x0012:
                r12.f42409b = r1
                r0 = 2147483647(0x7fffffff, float:NaN)
                r12.f42408a = r0
                int r0 = r12.f42410c
                r12.mo70482e(r0, r4, r3)
            L_0x001e:
                int r0 = r13.size()
                r2 = r1
            L_0x0023:
                if (r2 >= r0) goto L_0x00f0
                java.lang.Object r3 = r13.get(r2)
                fr.a r3 = (p743fr.C19022a) r3
                okio.ByteString r4 = r3.f42396b
                okio.ByteString r4 = r4.toAsciiLowercase()
                okio.ByteString r5 = r3.f42397c
                java.util.Map<okio.ByteString, java.lang.Integer> r6 = p743fr.C19023b.f42399b
                java.lang.Object r6 = r6.get(r4)
                java.lang.Integer r6 = (java.lang.Integer) r6
                r7 = -1
                if (r6 == 0) goto L_0x0069
                int r6 = r6.intValue()
                int r6 = r6 + 1
                r8 = 7
                r9 = 2
                if (r9 <= r6) goto L_0x0049
                goto L_0x0067
            L_0x0049:
                if (r8 < r6) goto L_0x0067
                fr.a[] r8 = p743fr.C19023b.f42398a
                int r9 = r6 + -1
                r9 = r8[r9]
                okio.ByteString r9 = r9.f42397c
                boolean r9 = kotlin.jvm.internal.C19383o.m32792b(r9, r5)
                if (r9 == 0) goto L_0x005a
                goto L_0x006a
            L_0x005a:
                r8 = r8[r6]
                okio.ByteString r8 = r8.f42397c
                boolean r8 = kotlin.jvm.internal.C19383o.m32792b(r8, r5)
                if (r8 == 0) goto L_0x0067
                int r8 = r6 + 1
                goto L_0x006b
            L_0x0067:
                r8 = r7
                goto L_0x006b
            L_0x0069:
                r6 = r7
            L_0x006a:
                r8 = r6
            L_0x006b:
                if (r8 != r7) goto L_0x00a9
                int r9 = r12.f42412e
                int r9 = r9 + 1
                fr.a[] r10 = r12.f42411d
                int r10 = r10.length
            L_0x0074:
                if (r9 >= r10) goto L_0x00a9
                fr.a[] r11 = r12.f42411d
                r11 = r11[r9]
                kotlin.jvm.internal.C19383o.m32794d(r11)
                okio.ByteString r11 = r11.f42396b
                boolean r11 = kotlin.jvm.internal.C19383o.m32792b(r11, r4)
                if (r11 == 0) goto L_0x00a6
                fr.a[] r11 = r12.f42411d
                r11 = r11[r9]
                kotlin.jvm.internal.C19383o.m32794d(r11)
                okio.ByteString r11 = r11.f42397c
                boolean r11 = kotlin.jvm.internal.C19383o.m32792b(r11, r5)
                if (r11 == 0) goto L_0x009c
                int r8 = r12.f42412e
                int r9 = r9 - r8
                fr.a[] r8 = p743fr.C19023b.f42398a
                int r8 = r8.length
                int r8 = r8 + r9
                goto L_0x00a9
            L_0x009c:
                if (r6 != r7) goto L_0x00a6
                int r6 = r12.f42412e
                int r6 = r9 - r6
                fr.a[] r11 = p743fr.C19023b.f42398a
                int r11 = r11.length
                int r6 = r6 + r11
            L_0x00a6:
                int r9 = r9 + 1
                goto L_0x0074
            L_0x00a9:
                if (r8 == r7) goto L_0x00b3
                r3 = 127(0x7f, float:1.78E-43)
                r4 = 128(0x80, float:1.794E-43)
                r12.mo70482e(r8, r3, r4)
                goto L_0x00ec
            L_0x00b3:
                r8 = 64
                if (r6 != r7) goto L_0x00c6
                lr.f r6 = r12.f42416i
                r6.mo72771x0(r8)
                r12.mo70480c(r4)
                r12.mo70480c(r5)
                r12.mo70479b(r3)
                goto L_0x00ec
            L_0x00c6:
                okio.ByteString r7 = p743fr.C19022a.f42389d
                boolean r7 = r4.startsWith((okio.ByteString) r7)
                if (r7 == 0) goto L_0x00e1
                okio.ByteString r7 = p743fr.C19022a.f42394i
                boolean r4 = kotlin.jvm.internal.C19383o.m32792b(r7, r4)
                r4 = r4 ^ 1
                if (r4 == 0) goto L_0x00e1
                r3 = 15
                r12.mo70482e(r6, r3, r1)
                r12.mo70480c(r5)
                goto L_0x00ec
            L_0x00e1:
                r4 = 63
                r12.mo70482e(r6, r4, r8)
                r12.mo70480c(r5)
                r12.mo70479b(r3)
            L_0x00ec:
                int r2 = r2 + 1
                goto L_0x0023
            L_0x00f0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p743fr.C19023b.C19025b.mo70481d(java.util.ArrayList):void");
        }

        /* renamed from: e */
        public final void mo70482e(int i, int i2, int i3) {
            if (i < i2) {
                this.f42416i.mo72771x0(i | i3);
                return;
            }
            this.f42416i.mo72771x0(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.f42416i.mo72771x0(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.f42416i.mo72771x0(i4);
        }
    }

    static {
        C19022a aVar = new C19022a("", C19022a.f42394i);
        ByteString byteString = C19022a.f42391f;
        ByteString byteString2 = C19022a.f42392g;
        ByteString byteString3 = C19022a.f42393h;
        ByteString byteString4 = C19022a.f42390e;
        f42398a = new C19022a[]{aVar, new C19022a("GET", byteString), new C19022a("POST", byteString), new C19022a("/", byteString2), new C19022a("/index.html", byteString2), new C19022a("http", byteString3), new C19022a("https", byteString3), new C19022a("200", byteString4), new C19022a("204", byteString4), new C19022a("206", byteString4), new C19022a("304", byteString4), new C19022a("400", byteString4), new C19022a("404", byteString4), new C19022a("500", byteString4), new C19022a("accept-charset", ""), new C19022a("accept-encoding", "gzip, deflate"), new C19022a("accept-language", ""), new C19022a("accept-ranges", ""), new C19022a((String) ResponseConstants.ACCEPT, ""), new C19022a("access-control-allow-origin", ""), new C19022a("age", ""), new C19022a("allow", ""), new C19022a("authorization", ""), new C19022a("cache-control", ""), new C19022a("content-disposition", ""), new C19022a("content-encoding", ""), new C19022a("content-language", ""), new C19022a("content-length", ""), new C19022a("content-location", ""), new C19022a("content-range", ""), new C19022a("content-type", ""), new C19022a("cookie", ""), new C19022a("date", ""), new C19022a("etag", ""), new C19022a("expect", ""), new C19022a("expires", ""), new C19022a((String) ResponseConstants.FROM, ""), new C19022a("host", ""), new C19022a("if-match", ""), new C19022a("if-modified-since", ""), new C19022a("if-none-match", ""), new C19022a("if-range", ""), new C19022a("if-unmodified-since", ""), new C19022a("last-modified", ""), new C19022a((String) ResponseConstants.LINK, ""), new C19022a("location", ""), new C19022a("max-forwards", ""), new C19022a("proxy-authenticate", ""), new C19022a("proxy-authorization", ""), new C19022a("range", ""), new C19022a("referer", ""), new C19022a("refresh", ""), new C19022a("retry-after", ""), new C19022a("server", ""), new C19022a("set-cookie", ""), new C19022a("strict-transport-security", ""), new C19022a("transfer-encoding", ""), new C19022a("user-agent", ""), new C19022a("vary", ""), new C19022a("via", ""), new C19022a("www-authenticate", "")};
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            C19022a[] aVarArr = f42398a;
            if (!linkedHashMap.containsKey(aVarArr[i].f42396b)) {
                linkedHashMap.put(aVarArr[i].f42396b, Integer.valueOf(i));
            }
        }
        Map<ByteString, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C19383o.m32796f(unmodifiableMap, "Collections.unmodifiableMap(result)");
        f42399b = unmodifiableMap;
    }

    /* renamed from: a */
    public static void m32187a(ByteString byteString) throws IOException {
        C19383o.m32797g(byteString, "name");
        int size = byteString.size();
        for (int i = 0; i < size; i++) {
            byte b = (byte) 65;
            byte b2 = (byte) 90;
            byte b3 = byteString.getByte(i);
            if (b <= b3 && b2 >= b3) {
                StringBuilder h = C0072d.m201h("PROTOCOL_ERROR response malformed: mixed case name: ");
                h.append(byteString.utf8());
                throw new IOException(h.toString());
            }
        }
    }
}
