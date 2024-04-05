package p185n1;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.etsy.android.p327ui.dialog.EtsyDialogFragment;
import com.fasterxml.jackson.core.JsonPointer;
import com.google.logging.type.LogSeverity;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import p003a2.C0015b;

/* renamed from: n1.a */
public final class C7369a {

    /* renamed from: A */
    public static final byte[] f16430A = {73, 72, 68, 82};

    /* renamed from: B */
    public static final byte[] f16431B = {73, 69, 78, 68};

    /* renamed from: C */
    public static final byte[] f16432C = {82, 73, 70, 70};

    /* renamed from: D */
    public static final byte[] f16433D = {87, 69, 66, 80};

    /* renamed from: E */
    public static final byte[] f16434E = {69, 88, 73, 70};

    /* renamed from: F */
    public static final String[] f16435F = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: G */
    public static final int[] f16436G = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: H */
    public static final byte[] f16437H = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: I */
    public static final C7373d f16438I = new C7373d("StripOffsets", 273, 3);

    /* renamed from: J */
    public static final C7373d[][] f16439J;

    /* renamed from: K */
    public static final C7373d[] f16440K = {new C7373d("SubIFDPointer", 330, 4), new C7373d("ExifIFDPointer", 34665, 4), new C7373d("GPSInfoIFDPointer", 34853, 4), new C7373d("InteroperabilityIFDPointer", 40965, 4), new C7373d("CameraSettingsIFDPointer", 8224, 1), new C7373d("ImageProcessingIFDPointer", 8256, 1)};

    /* renamed from: L */
    public static final HashMap<Integer, C7373d>[] f16441L = new HashMap[10];

    /* renamed from: M */
    public static final HashMap<String, C7373d>[] f16442M = new HashMap[10];

    /* renamed from: N */
    public static final HashSet<String> f16443N = new HashSet<>(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));

    /* renamed from: O */
    public static final HashMap<Integer, Integer> f16444O = new HashMap<>();

    /* renamed from: P */
    public static final Charset f16445P;

    /* renamed from: Q */
    public static final byte[] f16446Q;

    /* renamed from: R */
    public static final byte[] f16447R;

    /* renamed from: n */
    public static final boolean f16448n = Log.isLoggable("ExifInterface", 3);

    /* renamed from: o */
    public static final List<Integer> f16449o = Arrays.asList(new Integer[]{1, 6, 3, 8});

    /* renamed from: p */
    public static final List<Integer> f16450p = Arrays.asList(new Integer[]{2, 7, 4, 5});

    /* renamed from: q */
    public static final int[] f16451q = {8, 8, 8};

    /* renamed from: r */
    public static final int[] f16452r = {8};

    /* renamed from: s */
    public static final byte[] f16453s = {-1, -40, -1};

    /* renamed from: t */
    public static final byte[] f16454t = {102, 116, 121, 112};

    /* renamed from: u */
    public static final byte[] f16455u = {109, 105, 102, Framer.STDOUT_FRAME_PREFIX};

    /* renamed from: v */
    public static final byte[] f16456v = {104, 101, 105, 99};

    /* renamed from: w */
    public static final byte[] f16457w = {79, 76, 89, 77, 80, 0};

    /* renamed from: x */
    public static final byte[] f16458x = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: y */
    public static final byte[] f16459y = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: z */
    public static final byte[] f16460z = {101, 88, 73, 102};

    /* renamed from: a */
    public String f16461a;

    /* renamed from: b */
    public FileDescriptor f16462b;

    /* renamed from: c */
    public AssetManager.AssetInputStream f16463c;

    /* renamed from: d */
    public int f16464d;

    /* renamed from: e */
    public final HashMap<String, C7372c>[] f16465e;

    /* renamed from: f */
    public HashSet f16466f;

    /* renamed from: g */
    public ByteOrder f16467g = ByteOrder.BIG_ENDIAN;

    /* renamed from: h */
    public boolean f16468h;

    /* renamed from: i */
    public int f16469i;

    /* renamed from: j */
    public int f16470j;

    /* renamed from: k */
    public int f16471k;

    /* renamed from: l */
    public int f16472l;

    /* renamed from: m */
    public int f16473m;

    /* renamed from: n1.a$a */
    public class C7370a extends MediaDataSource {

        /* renamed from: b */
        public long f16474b;

        /* renamed from: c */
        public final /* synthetic */ C7371b f16475c;

        public C7370a(C7371b bVar) {
            this.f16475c = bVar;
        }

        public final void close() throws IOException {
        }

        public final long getSize() throws IOException {
            return -1;
        }

        public final int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
            if (i2 == 0) {
                return 0;
            }
            if (j < 0) {
                return -1;
            }
            try {
                long j2 = this.f16474b;
                if (j2 != j) {
                    if (j2 >= 0 && j >= j2 + ((long) this.f16475c.available())) {
                        return -1;
                    }
                    this.f16475c.mo19691a(j);
                    this.f16474b = j;
                }
                if (i2 > this.f16475c.available()) {
                    i2 = this.f16475c.available();
                }
                int read = this.f16475c.read(bArr, i, i2);
                if (read >= 0) {
                    this.f16474b += (long) read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f16474b = -1;
            return -1;
        }
    }

    /* renamed from: n1.a$c */
    public static class C7372c {

        /* renamed from: a */
        public final int f16482a;

        /* renamed from: b */
        public final int f16483b;

        /* renamed from: c */
        public final byte[] f16484c;

        public C7372c(int i, int i2, byte[] bArr) {
            this(bArr, i, i2);
        }

        /* renamed from: a */
        public static C7372c m14233a(String str) {
            byte[] bytes = (str + 0).getBytes(C7369a.f16445P);
            return new C7372c(bytes, 2, bytes.length);
        }

        /* renamed from: b */
        public static C7372c m14234b(long j, ByteOrder byteOrder) {
            long[] jArr = {j};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C7369a.f16436G[4] * 1)]);
            wrap.order(byteOrder);
            for (int i = 0; i < 1; i++) {
                wrap.putInt((int) jArr[i]);
            }
            return new C7372c(4, 1, wrap.array());
        }

        /* renamed from: c */
        public static C7372c m14235c(C7374e eVar, ByteOrder byteOrder) {
            C7374e[] eVarArr = {eVar};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C7369a.f16436G[5] * 1)]);
            wrap.order(byteOrder);
            for (int i = 0; i < 1; i++) {
                C7374e eVar2 = eVarArr[i];
                wrap.putInt((int) eVar2.f16489a);
                wrap.putInt((int) eVar2.f16490b);
            }
            return new C7372c(5, 1, wrap.array());
        }

        /* renamed from: d */
        public static C7372c m14236d(int i, ByteOrder byteOrder) {
            int[] iArr = {i};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C7369a.f16436G[3] * 1)]);
            wrap.order(byteOrder);
            for (int i2 = 0; i2 < 1; i2++) {
                wrap.putShort((short) iArr[i2]);
            }
            return new C7372c(3, 1, wrap.array());
        }

        /* renamed from: e */
        public final double mo19710e(ByteOrder byteOrder) {
            Serializable h = mo19713h(byteOrder);
            if (h == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (h instanceof String) {
                return Double.parseDouble((String) h);
            } else {
                if (h instanceof long[]) {
                    long[] jArr = (long[]) h;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h instanceof int[]) {
                    int[] iArr = (int[]) h;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h instanceof double[]) {
                    double[] dArr = (double[]) h;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h instanceof C7374e[]) {
                    C7374e[] eVarArr = (C7374e[]) h;
                    if (eVarArr.length == 1) {
                        C7374e eVar = eVarArr[0];
                        return ((double) eVar.f16489a) / ((double) eVar.f16490b);
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        /* renamed from: f */
        public final int mo19711f(ByteOrder byteOrder) {
            Serializable h = mo19713h(byteOrder);
            if (h == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (h instanceof String) {
                return Integer.parseInt((String) h);
            } else {
                if (h instanceof long[]) {
                    long[] jArr = (long[]) h;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h instanceof int[]) {
                    int[] iArr = (int[]) h;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        /* renamed from: g */
        public final String mo19712g(ByteOrder byteOrder) {
            Serializable h = mo19713h(byteOrder);
            if (h == null) {
                return null;
            }
            if (h instanceof String) {
                return (String) h;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (h instanceof long[]) {
                long[] jArr = (long[]) h;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (h instanceof int[]) {
                int[] iArr = (int[]) h;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (h instanceof double[]) {
                double[] dArr = (double[]) h;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (!(h instanceof C7374e[])) {
                return null;
            } else {
                C7374e[] eVarArr = (C7374e[]) h;
                while (i < eVarArr.length) {
                    sb.append(eVarArr[i].f16489a);
                    sb.append(JsonPointer.SEPARATOR);
                    sb.append(eVarArr[i].f16490b);
                    i++;
                    if (i != eVarArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
        }

        /* JADX WARNING: type inference failed for: r13v19, types: [int[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r13v21, types: [long[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r13v23, types: [n1.a$e[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r13v25, types: [int[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r13v27, types: [int[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r13v29, types: [n1.a$e[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r13v31, types: [double[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r13v33, types: [double[], java.io.Serializable] */
        /* JADX WARNING: Removed duplicated region for block: B:163:0x01a6 A[SYNTHETIC, Splitter:B:163:0x01a6] */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.io.Serializable mo19713h(java.nio.ByteOrder r13) {
            /*
                r12 = this;
                java.lang.String r0 = "IOException occurred while closing InputStream"
                java.lang.String r1 = "ExifInterface"
                r2 = 0
                n1.a$b r3 = new n1.a$b     // Catch:{ IOException -> 0x0190, all -> 0x018e }
                byte[] r4 = r12.f16484c     // Catch:{ IOException -> 0x0190, all -> 0x018e }
                r3.<init>((byte[]) r4)     // Catch:{ IOException -> 0x0190, all -> 0x018e }
                r3.f16479c = r13     // Catch:{ IOException -> 0x00c8 }
                int r13 = r12.f16482a     // Catch:{ IOException -> 0x00c8 }
                r4 = 0
                r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
                r7 = 1
                switch(r13) {
                    case 1: goto L_0x0155;
                    case 2: goto L_0x010a;
                    case 3: goto L_0x00f0;
                    case 4: goto L_0x00d4;
                    case 5: goto L_0x00aa;
                    case 6: goto L_0x0155;
                    case 7: goto L_0x010a;
                    case 8: goto L_0x0090;
                    case 9: goto L_0x0076;
                    case 10: goto L_0x0051;
                    case 11: goto L_0x0036;
                    case 12: goto L_0x001c;
                    default: goto L_0x001a;
                }     // Catch:{ IOException -> 0x00c8 }
            L_0x001a:
                goto L_0x0185
            L_0x001c:
                int r13 = r12.f16483b     // Catch:{ IOException -> 0x00c8 }
                double[] r13 = new double[r13]     // Catch:{ IOException -> 0x00c8 }
            L_0x0020:
                int r5 = r12.f16483b     // Catch:{ IOException -> 0x00c8 }
                if (r4 >= r5) goto L_0x002d
                double r5 = r3.readDouble()     // Catch:{ IOException -> 0x00c8 }
                r13[r4] = r5     // Catch:{ IOException -> 0x00c8 }
                int r4 = r4 + 1
                goto L_0x0020
            L_0x002d:
                r3.close()     // Catch:{ IOException -> 0x0031 }
                goto L_0x0035
            L_0x0031:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0035:
                return r13
            L_0x0036:
                int r13 = r12.f16483b     // Catch:{ IOException -> 0x00c8 }
                double[] r13 = new double[r13]     // Catch:{ IOException -> 0x00c8 }
            L_0x003a:
                int r5 = r12.f16483b     // Catch:{ IOException -> 0x00c8 }
                if (r4 >= r5) goto L_0x0048
                float r5 = r3.readFloat()     // Catch:{ IOException -> 0x00c8 }
                double r5 = (double) r5     // Catch:{ IOException -> 0x00c8 }
                r13[r4] = r5     // Catch:{ IOException -> 0x00c8 }
                int r4 = r4 + 1
                goto L_0x003a
            L_0x0048:
                r3.close()     // Catch:{ IOException -> 0x004c }
                goto L_0x0050
            L_0x004c:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0050:
                return r13
            L_0x0051:
                int r13 = r12.f16483b     // Catch:{ IOException -> 0x00c8 }
                n1.a$e[] r13 = new p185n1.C7369a.C7374e[r13]     // Catch:{ IOException -> 0x00c8 }
            L_0x0055:
                int r5 = r12.f16483b     // Catch:{ IOException -> 0x00c8 }
                if (r4 >= r5) goto L_0x006d
                int r5 = r3.readInt()     // Catch:{ IOException -> 0x00c8 }
                long r5 = (long) r5     // Catch:{ IOException -> 0x00c8 }
                int r7 = r3.readInt()     // Catch:{ IOException -> 0x00c8 }
                long r7 = (long) r7     // Catch:{ IOException -> 0x00c8 }
                n1.a$e r9 = new n1.a$e     // Catch:{ IOException -> 0x00c8 }
                r9.<init>(r5, r7)     // Catch:{ IOException -> 0x00c8 }
                r13[r4] = r9     // Catch:{ IOException -> 0x00c8 }
                int r4 = r4 + 1
                goto L_0x0055
            L_0x006d:
                r3.close()     // Catch:{ IOException -> 0x0071 }
                goto L_0x0075
            L_0x0071:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0075:
                return r13
            L_0x0076:
                int r13 = r12.f16483b     // Catch:{ IOException -> 0x00c8 }
                int[] r13 = new int[r13]     // Catch:{ IOException -> 0x00c8 }
            L_0x007a:
                int r5 = r12.f16483b     // Catch:{ IOException -> 0x00c8 }
                if (r4 >= r5) goto L_0x0087
                int r5 = r3.readInt()     // Catch:{ IOException -> 0x00c8 }
                r13[r4] = r5     // Catch:{ IOException -> 0x00c8 }
                int r4 = r4 + 1
                goto L_0x007a
            L_0x0087:
                r3.close()     // Catch:{ IOException -> 0x008b }
                goto L_0x008f
            L_0x008b:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x008f:
                return r13
            L_0x0090:
                int r13 = r12.f16483b     // Catch:{ IOException -> 0x00c8 }
                int[] r13 = new int[r13]     // Catch:{ IOException -> 0x00c8 }
            L_0x0094:
                int r5 = r12.f16483b     // Catch:{ IOException -> 0x00c8 }
                if (r4 >= r5) goto L_0x00a1
                short r5 = r3.readShort()     // Catch:{ IOException -> 0x00c8 }
                r13[r4] = r5     // Catch:{ IOException -> 0x00c8 }
                int r4 = r4 + 1
                goto L_0x0094
            L_0x00a1:
                r3.close()     // Catch:{ IOException -> 0x00a5 }
                goto L_0x00a9
            L_0x00a5:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00a9:
                return r13
            L_0x00aa:
                int r13 = r12.f16483b     // Catch:{ IOException -> 0x00c8 }
                n1.a$e[] r13 = new p185n1.C7369a.C7374e[r13]     // Catch:{ IOException -> 0x00c8 }
            L_0x00ae:
                int r7 = r12.f16483b     // Catch:{ IOException -> 0x00c8 }
                if (r4 >= r7) goto L_0x00cb
                int r7 = r3.readInt()     // Catch:{ IOException -> 0x00c8 }
                long r7 = (long) r7     // Catch:{ IOException -> 0x00c8 }
                long r7 = r7 & r5
                int r9 = r3.readInt()     // Catch:{ IOException -> 0x00c8 }
                long r9 = (long) r9     // Catch:{ IOException -> 0x00c8 }
                long r9 = r9 & r5
                n1.a$e r11 = new n1.a$e     // Catch:{ IOException -> 0x00c8 }
                r11.<init>(r7, r9)     // Catch:{ IOException -> 0x00c8 }
                r13[r4] = r11     // Catch:{ IOException -> 0x00c8 }
                int r4 = r4 + 1
                goto L_0x00ae
            L_0x00c8:
                r13 = move-exception
                goto L_0x0192
            L_0x00cb:
                r3.close()     // Catch:{ IOException -> 0x00cf }
                goto L_0x00d3
            L_0x00cf:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00d3:
                return r13
            L_0x00d4:
                int r13 = r12.f16483b     // Catch:{ IOException -> 0x00c8 }
                long[] r13 = new long[r13]     // Catch:{ IOException -> 0x00c8 }
            L_0x00d8:
                int r7 = r12.f16483b     // Catch:{ IOException -> 0x00c8 }
                if (r4 >= r7) goto L_0x00e7
                int r7 = r3.readInt()     // Catch:{ IOException -> 0x00c8 }
                long r7 = (long) r7     // Catch:{ IOException -> 0x00c8 }
                long r7 = r7 & r5
                r13[r4] = r7     // Catch:{ IOException -> 0x00c8 }
                int r4 = r4 + 1
                goto L_0x00d8
            L_0x00e7:
                r3.close()     // Catch:{ IOException -> 0x00eb }
                goto L_0x00ef
            L_0x00eb:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00ef:
                return r13
            L_0x00f0:
                int r13 = r12.f16483b     // Catch:{ IOException -> 0x00c8 }
                int[] r13 = new int[r13]     // Catch:{ IOException -> 0x00c8 }
            L_0x00f4:
                int r5 = r12.f16483b     // Catch:{ IOException -> 0x00c8 }
                if (r4 >= r5) goto L_0x0101
                int r5 = r3.readUnsignedShort()     // Catch:{ IOException -> 0x00c8 }
                r13[r4] = r5     // Catch:{ IOException -> 0x00c8 }
                int r4 = r4 + 1
                goto L_0x00f4
            L_0x0101:
                r3.close()     // Catch:{ IOException -> 0x0105 }
                goto L_0x0109
            L_0x0105:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0109:
                return r13
            L_0x010a:
                int r13 = r12.f16483b     // Catch:{ IOException -> 0x00c8 }
                byte[] r5 = p185n1.C7369a.f16437H     // Catch:{ IOException -> 0x00c8 }
                int r5 = r5.length     // Catch:{ IOException -> 0x00c8 }
                if (r13 < r5) goto L_0x0127
                r13 = r4
            L_0x0112:
                byte[] r5 = p185n1.C7369a.f16437H     // Catch:{ IOException -> 0x00c8 }
                int r6 = r5.length     // Catch:{ IOException -> 0x00c8 }
                if (r13 >= r6) goto L_0x0124
                byte[] r6 = r12.f16484c     // Catch:{ IOException -> 0x00c8 }
                byte r6 = r6[r13]     // Catch:{ IOException -> 0x00c8 }
                byte r8 = r5[r13]     // Catch:{ IOException -> 0x00c8 }
                if (r6 == r8) goto L_0x0121
                r7 = r4
                goto L_0x0124
            L_0x0121:
                int r13 = r13 + 1
                goto L_0x0112
            L_0x0124:
                if (r7 == 0) goto L_0x0127
                int r4 = r5.length     // Catch:{ IOException -> 0x00c8 }
            L_0x0127:
                java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00c8 }
                r13.<init>()     // Catch:{ IOException -> 0x00c8 }
            L_0x012c:
                int r5 = r12.f16483b     // Catch:{ IOException -> 0x00c8 }
                if (r4 >= r5) goto L_0x0148
                byte[] r5 = r12.f16484c     // Catch:{ IOException -> 0x00c8 }
                byte r5 = r5[r4]     // Catch:{ IOException -> 0x00c8 }
                if (r5 != 0) goto L_0x0137
                goto L_0x0148
            L_0x0137:
                r6 = 32
                if (r5 < r6) goto L_0x0140
                char r5 = (char) r5     // Catch:{ IOException -> 0x00c8 }
                r13.append(r5)     // Catch:{ IOException -> 0x00c8 }
                goto L_0x0145
            L_0x0140:
                r5 = 63
                r13.append(r5)     // Catch:{ IOException -> 0x00c8 }
            L_0x0145:
                int r4 = r4 + 1
                goto L_0x012c
            L_0x0148:
                java.lang.String r13 = r13.toString()     // Catch:{ IOException -> 0x00c8 }
                r3.close()     // Catch:{ IOException -> 0x0150 }
                goto L_0x0154
            L_0x0150:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0154:
                return r13
            L_0x0155:
                byte[] r13 = r12.f16484c     // Catch:{ IOException -> 0x00c8 }
                int r5 = r13.length     // Catch:{ IOException -> 0x00c8 }
                if (r5 != r7) goto L_0x0175
                byte r5 = r13[r4]     // Catch:{ IOException -> 0x00c8 }
                if (r5 < 0) goto L_0x0175
                if (r5 > r7) goto L_0x0175
                java.lang.String r13 = new java.lang.String     // Catch:{ IOException -> 0x00c8 }
                char[] r6 = new char[r7]     // Catch:{ IOException -> 0x00c8 }
                int r5 = r5 + 48
                char r5 = (char) r5     // Catch:{ IOException -> 0x00c8 }
                r6[r4] = r5     // Catch:{ IOException -> 0x00c8 }
                r13.<init>(r6)     // Catch:{ IOException -> 0x00c8 }
                r3.close()     // Catch:{ IOException -> 0x0170 }
                goto L_0x0174
            L_0x0170:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0174:
                return r13
            L_0x0175:
                java.lang.String r4 = new java.lang.String     // Catch:{ IOException -> 0x00c8 }
                java.nio.charset.Charset r5 = p185n1.C7369a.f16445P     // Catch:{ IOException -> 0x00c8 }
                r4.<init>(r13, r5)     // Catch:{ IOException -> 0x00c8 }
                r3.close()     // Catch:{ IOException -> 0x0180 }
                goto L_0x0184
            L_0x0180:
                r13 = move-exception
                android.util.Log.e(r1, r0, r13)
            L_0x0184:
                return r4
            L_0x0185:
                r3.close()     // Catch:{ IOException -> 0x0189 }
                goto L_0x018d
            L_0x0189:
                r13 = move-exception
                android.util.Log.e(r1, r0, r13)
            L_0x018d:
                return r2
            L_0x018e:
                r13 = move-exception
                goto L_0x01a4
            L_0x0190:
                r13 = move-exception
                r3 = r2
            L_0x0192:
                java.lang.String r4 = "IOException occurred during reading a value"
                android.util.Log.w(r1, r4, r13)     // Catch:{ all -> 0x01a2 }
                if (r3 == 0) goto L_0x01a1
                r3.close()     // Catch:{ IOException -> 0x019d }
                goto L_0x01a1
            L_0x019d:
                r13 = move-exception
                android.util.Log.e(r1, r0, r13)
            L_0x01a1:
                return r2
            L_0x01a2:
                r13 = move-exception
                r2 = r3
            L_0x01a4:
                if (r2 == 0) goto L_0x01ae
                r2.close()     // Catch:{ IOException -> 0x01aa }
                goto L_0x01ae
            L_0x01aa:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x01ae:
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: p185n1.C7369a.C7372c.mo19713h(java.nio.ByteOrder):java.io.Serializable");
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("(");
            h.append(C7369a.f16435F[this.f16482a]);
            h.append(", data length:");
            return C0071c.m191c(h, this.f16484c.length, ")");
        }

        public C7372c(byte[] bArr, int i, int i2) {
            this.f16482a = i;
            this.f16483b = i2;
            this.f16484c = bArr;
        }
    }

    /* renamed from: n1.a$e */
    public static class C7374e {

        /* renamed from: a */
        public final long f16489a;

        /* renamed from: b */
        public final long f16490b;

        public C7374e(long j, long j2) {
            if (j2 == 0) {
                this.f16489a = 0;
                this.f16490b = 1;
                return;
            }
            this.f16489a = j;
            this.f16490b = j2;
        }

        public final String toString() {
            return this.f16489a + "/" + this.f16490b;
        }
    }

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        "XMP ".getBytes(Charset.defaultCharset());
        C7373d[] dVarArr = {new C7373d("NewSubfileType", 254, 4), new C7373d("SubfileType", 255, 4), new C7373d("ImageWidth", 256), new C7373d("ImageLength", 257), new C7373d("BitsPerSample", 258, 3), new C7373d("Compression", 259, 3), new C7373d("PhotometricInterpretation", 262, 3), new C7373d("ImageDescription", 270, 2), new C7373d("Make", 271, 2), new C7373d("Model", 272, 2), new C7373d("StripOffsets", 273), new C7373d("Orientation", 274, 3), new C7373d("SamplesPerPixel", 277, 3), new C7373d("RowsPerStrip", 278), new C7373d("StripByteCounts", 279), new C7373d("XResolution", 282, 5), new C7373d("YResolution", 283, 5), new C7373d("PlanarConfiguration", 284, 3), new C7373d("ResolutionUnit", 296, 3), new C7373d("TransferFunction", 301, 3), new C7373d("Software", 305, 2), new C7373d("DateTime", 306, 2), new C7373d("Artist", 315, 2), new C7373d("WhitePoint", 318, 5), new C7373d("PrimaryChromaticities", 319, 5), new C7373d("SubIFDPointer", 330, 4), new C7373d("JPEGInterchangeFormat", 513, 4), new C7373d("JPEGInterchangeFormatLength", 514, 4), new C7373d("YCbCrCoefficients", 529, 5), new C7373d("YCbCrSubSampling", 530, 3), new C7373d("YCbCrPositioning", 531, 3), new C7373d("ReferenceBlackWhite", 532, 5), new C7373d("Copyright", 33432, 2), new C7373d("ExifIFDPointer", 34665, 4), new C7373d("GPSInfoIFDPointer", 34853, 4), new C7373d("SensorTopBorder", 4, 4), new C7373d("SensorLeftBorder", 5, 4), new C7373d("SensorBottomBorder", 6, 4), new C7373d("SensorRightBorder", 7, 4), new C7373d("ISO", 23, 3), new C7373d("JpgFromRaw", 46, 7), new C7373d("Xmp", LogSeverity.ALERT_VALUE, 1)};
        f16439J = new C7373d[][]{dVarArr, new C7373d[]{new C7373d("ExposureTime", 33434, 5), new C7373d("FNumber", 33437, 5), new C7373d("ExposureProgram", 34850, 3), new C7373d("SpectralSensitivity", 34852, 2), new C7373d("PhotographicSensitivity", 34855, 3), new C7373d("OECF", 34856, 7), new C7373d("SensitivityType", 34864, 3), new C7373d("StandardOutputSensitivity", 34865, 4), new C7373d("RecommendedExposureIndex", 34866, 4), new C7373d("ISOSpeed", 34867, 4), new C7373d("ISOSpeedLatitudeyyy", 34868, 4), new C7373d("ISOSpeedLatitudezzz", 34869, 4), new C7373d("ExifVersion", 36864, 2), new C7373d("DateTimeOriginal", 36867, 2), new C7373d("DateTimeDigitized", 36868, 2), new C7373d("OffsetTime", 36880, 2), new C7373d("OffsetTimeOriginal", 36881, 2), new C7373d("OffsetTimeDigitized", 36882, 2), new C7373d("ComponentsConfiguration", 37121, 7), new C7373d("CompressedBitsPerPixel", 37122, 5), new C7373d("ShutterSpeedValue", 37377, 10), new C7373d("ApertureValue", 37378, 5), new C7373d("BrightnessValue", 37379, 10), new C7373d("ExposureBiasValue", 37380, 10), new C7373d("MaxApertureValue", 37381, 5), new C7373d("SubjectDistance", 37382, 5), new C7373d("MeteringMode", 37383, 3), new C7373d("LightSource", 37384, 3), new C7373d("Flash", 37385, 3), new C7373d("FocalLength", 37386, 5), new C7373d("SubjectArea", 37396, 3), new C7373d("MakerNote", 37500, 7), new C7373d("UserComment", 37510, 7), new C7373d("SubSecTime", 37520, 2), new C7373d("SubSecTimeOriginal", 37521, 2), new C7373d("SubSecTimeDigitized", 37522, 2), new C7373d("FlashpixVersion", 40960, 7), new C7373d("ColorSpace", 40961, 3), new C7373d("PixelXDimension", 40962), new C7373d("PixelYDimension", 40963), new C7373d("RelatedSoundFile", 40964, 2), new C7373d("InteroperabilityIFDPointer", 40965, 4), new C7373d("FlashEnergy", 41483, 5), new C7373d("SpatialFrequencyResponse", 41484, 7), new C7373d("FocalPlaneXResolution", 41486, 5), new C7373d("FocalPlaneYResolution", 41487, 5), new C7373d("FocalPlaneResolutionUnit", 41488, 3), new C7373d("SubjectLocation", 41492, 3), new C7373d("ExposureIndex", 41493, 5), new C7373d("SensingMethod", 41495, 3), new C7373d("FileSource", 41728, 7), new C7373d("SceneType", 41729, 7), new C7373d("CFAPattern", 41730, 7), new C7373d("CustomRendered", 41985, 3), new C7373d("ExposureMode", 41986, 3), new C7373d("WhiteBalance", 41987, 3), new C7373d("DigitalZoomRatio", 41988, 5), new C7373d("FocalLengthIn35mmFilm", 41989, 3), new C7373d("SceneCaptureType", 41990, 3), new C7373d("GainControl", 41991, 3), new C7373d("Contrast", 41992, 3), new C7373d("Saturation", 41993, 3), new C7373d("Sharpness", 41994, 3), new C7373d("DeviceSettingDescription", 41995, 7), new C7373d("SubjectDistanceRange", 41996, 3), new C7373d("ImageUniqueID", 42016, 2), new C7373d("CameraOwnerName", 42032, 2), new C7373d("BodySerialNumber", 42033, 2), new C7373d("LensSpecification", 42034, 5), new C7373d("LensMake", 42035, 2), new C7373d("LensModel", 42036, 2), new C7373d("Gamma", 42240, 5), new C7373d("DNGVersion", 50706, 1), new C7373d("DefaultCropSize", 50720)}, new C7373d[]{new C7373d("GPSVersionID", 0, 1), new C7373d("GPSLatitudeRef", 1, 2), new C7373d("GPSLatitude", 2, 5), new C7373d("GPSLongitudeRef", 3, 2), new C7373d("GPSLongitude", 4, 5), new C7373d("GPSAltitudeRef", 5, 1), new C7373d("GPSAltitude", 6, 5), new C7373d("GPSTimeStamp", 7, 5), new C7373d("GPSSatellites", 8, 2), new C7373d("GPSStatus", 9, 2), new C7373d("GPSMeasureMode", 10, 2), new C7373d("GPSDOP", 11, 5), new C7373d("GPSSpeedRef", 12, 2), new C7373d("GPSSpeed", 13, 5), new C7373d("GPSTrackRef", 14, 2), new C7373d("GPSTrack", 15, 5), new C7373d("GPSImgDirectionRef", 16, 2), new C7373d("GPSImgDirection", 17, 5), new C7373d("GPSMapDatum", 18, 2), new C7373d("GPSDestLatitudeRef", 19, 2), new C7373d("GPSDestLatitude", 20, 5), new C7373d("GPSDestLongitudeRef", 21, 2), new C7373d("GPSDestLongitude", 22, 5), new C7373d("GPSDestBearingRef", 23, 2), new C7373d("GPSDestBearing", 24, 5), new C7373d("GPSDestDistanceRef", 25, 2), new C7373d("GPSDestDistance", 26, 5), new C7373d("GPSProcessingMethod", 27, 7), new C7373d("GPSAreaInformation", 28, 7), new C7373d("GPSDateStamp", 29, 2), new C7373d("GPSDifferential", 30, 3), new C7373d("GPSHPositioningError", 31, 5)}, new C7373d[]{new C7373d("InteroperabilityIndex", 1, 2)}, new C7373d[]{new C7373d("NewSubfileType", 254, 4), new C7373d("SubfileType", 255, 4), new C7373d("ThumbnailImageWidth", 256), new C7373d("ThumbnailImageLength", 257), new C7373d("BitsPerSample", 258, 3), new C7373d("Compression", 259, 3), new C7373d("PhotometricInterpretation", 262, 3), new C7373d("ImageDescription", 270, 2), new C7373d("Make", 271, 2), new C7373d("Model", 272, 2), new C7373d("StripOffsets", 273), new C7373d("ThumbnailOrientation", 274, 3), new C7373d("SamplesPerPixel", 277, 3), new C7373d("RowsPerStrip", 278), new C7373d("StripByteCounts", 279), new C7373d("XResolution", 282, 5), new C7373d("YResolution", 283, 5), new C7373d("PlanarConfiguration", 284, 3), new C7373d("ResolutionUnit", 296, 3), new C7373d("TransferFunction", 301, 3), new C7373d("Software", 305, 2), new C7373d("DateTime", 306, 2), new C7373d("Artist", 315, 2), new C7373d("WhitePoint", 318, 5), new C7373d("PrimaryChromaticities", 319, 5), new C7373d("SubIFDPointer", 330, 4), new C7373d("JPEGInterchangeFormat", 513, 4), new C7373d("JPEGInterchangeFormatLength", 514, 4), new C7373d("YCbCrCoefficients", 529, 5), new C7373d("YCbCrSubSampling", 530, 3), new C7373d("YCbCrPositioning", 531, 3), new C7373d("ReferenceBlackWhite", 532, 5), new C7373d("Copyright", 33432, 2), new C7373d("ExifIFDPointer", 34665, 4), new C7373d("GPSInfoIFDPointer", 34853, 4), new C7373d("DNGVersion", 50706, 1), new C7373d("DefaultCropSize", 50720)}, dVarArr, new C7373d[]{new C7373d("ThumbnailImage", 256, 7), new C7373d("CameraSettingsIFDPointer", 8224, 4), new C7373d("ImageProcessingIFDPointer", 8256, 4)}, new C7373d[]{new C7373d("PreviewImageStart", 257, 4), new C7373d("PreviewImageLength", 258, 4)}, new C7373d[]{new C7373d("AspectFrame", 4371, 3)}, new C7373d[]{new C7373d("ColorSpace", 55, 3)}};
        Charset forName = Charset.forName("US-ASCII");
        f16445P = forName;
        f16446Q = "Exif\u0000\u0000".getBytes(forName);
        f16447R = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C7373d[][] dVarArr2 = f16439J;
            if (i < dVarArr2.length) {
                f16441L[i] = new HashMap<>();
                f16442M[i] = new HashMap<>();
                for (C7373d dVar : dVarArr2[i]) {
                    f16441L[i].put(Integer.valueOf(dVar.f16485a), dVar);
                    f16442M[i].put(dVar.f16486b, dVar);
                }
                i++;
            } else {
                HashMap<Integer, Integer> hashMap = f16444O;
                C7373d[] dVarArr3 = f16440K;
                hashMap.put(Integer.valueOf(dVarArr3[0].f16485a), 5);
                hashMap.put(Integer.valueOf(dVarArr3[1].f16485a), 1);
                hashMap.put(Integer.valueOf(dVarArr3[2].f16485a), 2);
                hashMap.put(Integer.valueOf(dVarArr3[3].f16485a), 3);
                hashMap.put(Integer.valueOf(dVarArr3[4].f16485a), 7);
                hashMap.put(Integer.valueOf(dVarArr3[5].f16485a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:11|12|(1:14)|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (f16448n != false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        android.util.Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        r6 = false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002f */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0055 A[SYNTHETIC, Splitter:B:29:0x0055] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7369a(java.lang.String r6) throws java.io.IOException {
        /*
            r5 = this;
            r5.<init>()
            n1.a$d[][] r0 = f16439J
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r5.f16465e = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r5.f16466f = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r5.f16467g = r0
            if (r6 == 0) goto L_0x005c
            r0 = 0
            r5.f16463c = r0
            r5.f16461a = r6
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0052 }
            r1.<init>(r6)     // Catch:{ all -> 0x0052 }
            java.io.FileDescriptor r6 = r1.getFD()     // Catch:{ all -> 0x004f }
            r2 = 0
            int r4 = android.system.OsConstants.SEEK_CUR     // Catch:{ Exception -> 0x002f }
            android.system.Os.lseek(r6, r2, r4)     // Catch:{ Exception -> 0x002f }
            r6 = 1
            goto L_0x003b
        L_0x002f:
            boolean r6 = f16448n     // Catch:{ all -> 0x004f }
            if (r6 == 0) goto L_0x003a
            java.lang.String r6 = "ExifInterface"
            java.lang.String r2 = "The file descriptor for the given input is not seekable"
            android.util.Log.d(r6, r2)     // Catch:{ all -> 0x004f }
        L_0x003a:
            r6 = 0
        L_0x003b:
            if (r6 == 0) goto L_0x0044
            java.io.FileDescriptor r6 = r1.getFD()     // Catch:{ all -> 0x004f }
            r5.f16462b = r6     // Catch:{ all -> 0x004f }
            goto L_0x0046
        L_0x0044:
            r5.f16462b = r0     // Catch:{ all -> 0x004f }
        L_0x0046:
            r5.mo19679q(r1)     // Catch:{ all -> 0x004f }
            r1.close()     // Catch:{ RuntimeException -> 0x004d, Exception -> 0x004c }
        L_0x004c:
            return
        L_0x004d:
            r6 = move-exception
            throw r6
        L_0x004f:
            r6 = move-exception
            r0 = r1
            goto L_0x0053
        L_0x0052:
            r6 = move-exception
        L_0x0053:
            if (r0 == 0) goto L_0x005b
            r0.close()     // Catch:{ RuntimeException -> 0x0059, Exception -> 0x005b }
            goto L_0x005b
        L_0x0059:
            r6 = move-exception
            throw r6
        L_0x005b:
            throw r6
        L_0x005c:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "filename cannot be null"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p185n1.C7369a.<init>(java.lang.String):void");
    }

    /* renamed from: b */
    public static String m14206b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i])}));
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static long[] m14207c(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] iArr = (int[]) serializable;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = (long) iArr[i];
            }
            return jArr;
        } else if (serializable instanceof long[]) {
            return (long[]) serializable;
        } else {
            return null;
        }
    }

    /* renamed from: t */
    public static ByteOrder m14208t(C7371b bVar) throws IOException {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            if (f16448n) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (f16448n) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            StringBuilder h = C0072d.m201h("Invalid byte order: ");
            h.append(Integer.toHexString(readShort));
            throw new IOException(h.toString());
        }
    }

    /* renamed from: a */
    public final void mo19665a() {
        String d = mo19666d("DateTimeOriginal");
        if (d != null && mo19666d("DateTime") == null) {
            this.f16465e[0].put("DateTime", C7372c.m14233a(d));
        }
        if (mo19666d("ImageWidth") == null) {
            this.f16465e[0].put("ImageWidth", C7372c.m14234b(0, this.f16467g));
        }
        if (mo19666d("ImageLength") == null) {
            this.f16465e[0].put("ImageLength", C7372c.m14234b(0, this.f16467g));
        }
        if (mo19666d("Orientation") == null) {
            this.f16465e[0].put("Orientation", C7372c.m14234b(0, this.f16467g));
        }
        if (mo19666d("LightSource") == null) {
            this.f16465e[1].put("LightSource", C7372c.m14234b(0, this.f16467g));
        }
    }

    /* renamed from: d */
    public final String mo19666d(String str) {
        C7372c e = mo19667e(str);
        if (e != null) {
            if (!f16443N.contains(str)) {
                return e.mo19712g(this.f16467g);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = e.f16482a;
                if (i == 5 || i == 10) {
                    C7374e[] eVarArr = (C7374e[]) e.mo19713h(this.f16467g);
                    if (eVarArr == null || eVarArr.length != 3) {
                        StringBuilder h = C0072d.m201h("Invalid GPS Timestamp array. array=");
                        h.append(Arrays.toString(eVarArr));
                        Log.w("ExifInterface", h.toString());
                        return null;
                    }
                    C7374e eVar = eVarArr[0];
                    C7374e eVar2 = eVarArr[1];
                    C7374e eVar3 = eVarArr[2];
                    return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) eVar.f16489a) / ((float) eVar.f16490b))), Integer.valueOf((int) (((float) eVar2.f16489a) / ((float) eVar2.f16490b))), Integer.valueOf((int) (((float) eVar3.f16489a) / ((float) eVar3.f16490b)))});
                }
                StringBuilder h2 = C0072d.m201h("GPS Timestamp format is not rational. format=");
                h2.append(e.f16482a);
                Log.w("ExifInterface", h2.toString());
                return null;
            }
            try {
                return Double.toString(e.mo19710e(this.f16467g));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* renamed from: e */
    public final C7372c mo19667e(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f16448n) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f16439J.length; i++) {
            C7372c cVar = this.f16465e[i].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: f */
    public final void mo19668f(C7371b bVar) throws IOException {
        String str;
        String str2;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(new C7370a(bVar));
            String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
            String str3 = null;
            if ("yes".equals(extractMetadata3)) {
                str3 = mediaMetadataRetriever.extractMetadata(29);
                str2 = mediaMetadataRetriever.extractMetadata(30);
                str = mediaMetadataRetriever.extractMetadata(31);
            } else if ("yes".equals(extractMetadata4)) {
                str3 = mediaMetadataRetriever.extractMetadata(18);
                str2 = mediaMetadataRetriever.extractMetadata(19);
                str = mediaMetadataRetriever.extractMetadata(24);
            } else {
                str2 = null;
                str = null;
            }
            if (str3 != null) {
                this.f16465e[0].put("ImageWidth", C7372c.m14236d(Integer.parseInt(str3), this.f16467g));
            }
            if (str2 != null) {
                this.f16465e[0].put("ImageLength", C7372c.m14236d(Integer.parseInt(str2), this.f16467g));
            }
            if (str != null) {
                int i = 1;
                int parseInt = Integer.parseInt(str);
                if (parseInt == 90) {
                    i = 6;
                } else if (parseInt == 180) {
                    i = 3;
                } else if (parseInt == 270) {
                    i = 8;
                }
                this.f16465e[0].put("Orientation", C7372c.m14236d(i, this.f16467g));
            }
            if (!(extractMetadata == null || extractMetadata2 == null)) {
                int parseInt2 = Integer.parseInt(extractMetadata);
                int parseInt3 = Integer.parseInt(extractMetadata2);
                if (parseInt3 > 6) {
                    bVar.mo19691a((long) parseInt2);
                    byte[] bArr = new byte[6];
                    if (bVar.read(bArr) == 6) {
                        int i2 = parseInt2 + 6;
                        int i3 = parseInt3 - 6;
                        if (Arrays.equals(bArr, f16446Q)) {
                            byte[] bArr2 = new byte[i3];
                            if (bVar.read(bArr2) == i3) {
                                this.f16469i = i2;
                                mo19682u(0, bArr2);
                            } else {
                                throw new IOException("Can't read exif");
                            }
                        } else {
                            throw new IOException("Invalid identifier");
                        }
                    } else {
                        throw new IOException("Can't read identifier");
                    }
                } else {
                    throw new IOException("Invalid exif length");
                }
            }
            if (f16448n) {
                Log.d("ExifInterface", "Heif meta: " + str3 + EtsyDialogFragment.OPT_X_BUTTON + str2 + ", rotation " + str);
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x00e0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x018e A[SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19669g(p185n1.C7369a.C7371b r13, int r14, int r15) throws java.io.IOException {
        /*
            r12 = this;
            boolean r0 = f16448n
            java.lang.String r1 = "ExifInterface"
            if (r0 == 0) goto L_0x001a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "getJpegAttributes starting with: "
            r0.append(r2)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L_0x001a:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r13.f16479c = r0
            long r2 = (long) r14
            r13.mo19691a(r2)
            byte r0 = r13.readByte()
            java.lang.String r2 = "Invalid marker: "
            r3 = -1
            if (r0 != r3) goto L_0x01cf
            r4 = 1
            int r14 = r14 + r4
            byte r5 = r13.readByte()
            r6 = -40
            if (r5 != r6) goto L_0x01b8
            int r14 = r14 + r4
        L_0x0036:
            byte r0 = r13.readByte()
            if (r0 != r3) goto L_0x019f
            int r14 = r14 + r4
            byte r0 = r13.readByte()
            boolean r2 = f16448n
            if (r2 == 0) goto L_0x005b
            java.lang.String r5 = "Found JPEG segment indicator: "
            java.lang.StringBuilder r5 = android.support.p013v4.media.C0072d.m201h(r5)
            r6 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r6 = java.lang.Integer.toHexString(r6)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r1, r5)
        L_0x005b:
            int r14 = r14 + r4
            r5 = -39
            if (r0 == r5) goto L_0x019a
            r5 = -38
            if (r0 != r5) goto L_0x0066
            goto L_0x019a
        L_0x0066:
            int r5 = r13.readUnsignedShort()
            r6 = -2
            int r5 = r5 + r6
            int r14 = r14 + 2
            if (r2 == 0) goto L_0x0095
            java.lang.String r2 = "JPEG segment: "
            java.lang.StringBuilder r2 = android.support.p013v4.media.C0072d.m201h(r2)
            r7 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r7 = java.lang.Integer.toHexString(r7)
            r2.append(r7)
            java.lang.String r7 = " (length: "
            r2.append(r7)
            int r7 = r5 + 2
            r2.append(r7)
            java.lang.String r7 = ")"
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r1, r2)
        L_0x0095:
            java.lang.String r2 = "Invalid length"
            if (r5 < 0) goto L_0x0194
            r7 = -31
            r8 = 0
            if (r0 == r7) goto L_0x0114
            if (r0 == r6) goto L_0x00e8
            switch(r0) {
                case -64: goto L_0x00ae;
                case -63: goto L_0x00ae;
                case -62: goto L_0x00ae;
                case -61: goto L_0x00ae;
                default: goto L_0x00a3;
            }
        L_0x00a3:
            switch(r0) {
                case -59: goto L_0x00ae;
                case -58: goto L_0x00ae;
                case -57: goto L_0x00ae;
                default: goto L_0x00a6;
            }
        L_0x00a6:
            switch(r0) {
                case -55: goto L_0x00ae;
                case -54: goto L_0x00ae;
                case -53: goto L_0x00ae;
                default: goto L_0x00a9;
            }
        L_0x00a9:
            switch(r0) {
                case -51: goto L_0x00ae;
                case -50: goto L_0x00ae;
                case -49: goto L_0x00ae;
                default: goto L_0x00ac;
            }
        L_0x00ac:
            goto L_0x017b
        L_0x00ae:
            int r0 = r13.skipBytes(r4)
            if (r0 != r4) goto L_0x00e0
            java.util.HashMap<java.lang.String, n1.a$c>[] r0 = r12.f16465e
            r0 = r0[r15]
            int r6 = r13.readUnsignedShort()
            long r6 = (long) r6
            java.nio.ByteOrder r8 = r12.f16467g
            n1.a$c r6 = p185n1.C7369a.C7372c.m14234b(r6, r8)
            java.lang.String r7 = "ImageLength"
            r0.put(r7, r6)
            java.util.HashMap<java.lang.String, n1.a$c>[] r0 = r12.f16465e
            r0 = r0[r15]
            int r6 = r13.readUnsignedShort()
            long r6 = (long) r6
            java.nio.ByteOrder r8 = r12.f16467g
            n1.a$c r6 = p185n1.C7369a.C7372c.m14234b(r6, r8)
            java.lang.String r7 = "ImageWidth"
            r0.put(r7, r6)
            int r5 = r5 + -5
            goto L_0x017b
        L_0x00e0:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r14 = "Invalid SOFx"
            r13.<init>(r14)
            throw r13
        L_0x00e8:
            byte[] r0 = new byte[r5]
            int r6 = r13.read(r0)
            if (r6 != r5) goto L_0x010c
            java.lang.String r5 = "UserComment"
            java.lang.String r6 = r12.mo19666d(r5)
            if (r6 != 0) goto L_0x017a
            java.util.HashMap<java.lang.String, n1.a$c>[] r6 = r12.f16465e
            r6 = r6[r4]
            java.lang.String r7 = new java.lang.String
            java.nio.charset.Charset r9 = f16445P
            r7.<init>(r0, r9)
            n1.a$c r0 = p185n1.C7369a.C7372c.m14233a(r7)
            r6.put(r5, r0)
            goto L_0x017a
        L_0x010c:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r14 = "Invalid exif"
            r13.<init>(r14)
            throw r13
        L_0x0114:
            byte[] r0 = new byte[r5]
            r13.readFully(r0)
            int r6 = r14 + r5
            byte[] r7 = f16446Q
            if (r7 != 0) goto L_0x0120
            goto L_0x012e
        L_0x0120:
            int r9 = r7.length
            if (r5 >= r9) goto L_0x0124
            goto L_0x012e
        L_0x0124:
            r9 = r8
        L_0x0125:
            int r10 = r7.length
            if (r9 >= r10) goto L_0x0133
            byte r10 = r0[r9]
            byte r11 = r7[r9]
            if (r10 == r11) goto L_0x0130
        L_0x012e:
            r9 = r8
            goto L_0x0134
        L_0x0130:
            int r9 = r9 + 1
            goto L_0x0125
        L_0x0133:
            r9 = r4
        L_0x0134:
            if (r9 == 0) goto L_0x0143
            int r9 = r7.length
            int r14 = r14 + r9
            int r7 = r7.length
            byte[] r0 = java.util.Arrays.copyOfRange(r0, r7, r5)
            r12.f16469i = r14
            r12.mo19682u(r15, r0)
            goto L_0x0179
        L_0x0143:
            byte[] r14 = f16447R
            if (r14 != 0) goto L_0x0148
            goto L_0x0156
        L_0x0148:
            int r7 = r14.length
            if (r5 >= r7) goto L_0x014c
            goto L_0x0156
        L_0x014c:
            r7 = r8
        L_0x014d:
            int r9 = r14.length
            if (r7 >= r9) goto L_0x015b
            byte r9 = r0[r7]
            byte r10 = r14[r7]
            if (r9 == r10) goto L_0x0158
        L_0x0156:
            r7 = r8
            goto L_0x015c
        L_0x0158:
            int r7 = r7 + 1
            goto L_0x014d
        L_0x015b:
            r7 = r4
        L_0x015c:
            if (r7 == 0) goto L_0x0179
            int r7 = r14.length
            int r14 = r14.length
            byte[] r14 = java.util.Arrays.copyOfRange(r0, r14, r5)
            java.lang.String r0 = "Xmp"
            java.lang.String r5 = r12.mo19666d(r0)
            if (r5 != 0) goto L_0x0179
            java.util.HashMap<java.lang.String, n1.a$c>[] r5 = r12.f16465e
            r5 = r5[r8]
            n1.a$c r7 = new n1.a$c
            int r9 = r14.length
            r7.<init>((byte[]) r14, (int) r4, (int) r9)
            r5.put(r0, r7)
        L_0x0179:
            r14 = r6
        L_0x017a:
            r5 = r8
        L_0x017b:
            if (r5 < 0) goto L_0x018e
            int r0 = r13.skipBytes(r5)
            if (r0 != r5) goto L_0x0186
            int r14 = r14 + r5
            goto L_0x0036
        L_0x0186:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r14 = "Invalid JPEG segment"
            r13.<init>(r14)
            throw r13
        L_0x018e:
            java.io.IOException r13 = new java.io.IOException
            r13.<init>(r2)
            throw r13
        L_0x0194:
            java.io.IOException r13 = new java.io.IOException
            r13.<init>(r2)
            throw r13
        L_0x019a:
            java.nio.ByteOrder r14 = r12.f16467g
            r13.f16479c = r14
            return
        L_0x019f:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r14 = "Invalid marker:"
            java.lang.StringBuilder r14 = android.support.p013v4.media.C0072d.m201h(r14)
            r15 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r15 = java.lang.Integer.toHexString(r15)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L_0x01b8:
            java.io.IOException r13 = new java.io.IOException
            java.lang.StringBuilder r14 = android.support.p013v4.media.C0072d.m201h(r2)
            r15 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r15 = java.lang.Integer.toHexString(r15)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L_0x01cf:
            java.io.IOException r13 = new java.io.IOException
            java.lang.StringBuilder r14 = android.support.p013v4.media.C0072d.m201h(r2)
            r15 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r15 = java.lang.Integer.toHexString(r15)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p185n1.C7369a.mo19669g(n1.a$b, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00cf, code lost:
        if (r8 == null) goto L_0x00d4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0143 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c8 A[Catch:{ all -> 0x018a }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x010f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0111 A[SYNTHETIC, Splitter:B:99:0x0111] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo19670h(java.io.BufferedInputStream r18) throws java.io.IOException {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = 5000(0x1388, float:7.006E-42)
            r0.mark(r2)
            byte[] r3 = new byte[r2]
            r0.read(r3)
            r18.reset()
            r4 = 0
            r0 = r4
        L_0x0013:
            byte[] r5 = f16453s
            int r6 = r5.length
            if (r0 >= r6) goto L_0x0023
            byte r6 = r3[r0]
            byte r5 = r5[r0]
            if (r6 == r5) goto L_0x0020
            r0 = r4
            goto L_0x0024
        L_0x0020:
            int r0 = r0 + 1
            goto L_0x0013
        L_0x0023:
            r0 = 1
        L_0x0024:
            r5 = 4
            if (r0 == 0) goto L_0x0028
            return r5
        L_0x0028:
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r6 = "FUJIFILMCCD-RAW"
            byte[] r0 = r6.getBytes(r0)
            r6 = r4
        L_0x0033:
            int r8 = r0.length
            if (r6 >= r8) goto L_0x0041
            byte r8 = r3[r6]
            byte r9 = r0[r6]
            if (r8 == r9) goto L_0x003e
            r0 = r4
            goto L_0x0042
        L_0x003e:
            int r6 = r6 + 1
            goto L_0x0033
        L_0x0041:
            r0 = 1
        L_0x0042:
            if (r0 == 0) goto L_0x0047
            r0 = 9
            return r0
        L_0x0047:
            n1.a$b r8 = new n1.a$b     // Catch:{ Exception -> 0x00c2, all -> 0x00be }
            r8.<init>((byte[]) r3)     // Catch:{ Exception -> 0x00c2, all -> 0x00be }
            int r0 = r8.readInt()     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            long r9 = (long) r0     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            byte[] r0 = new byte[r5]     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            r8.read(r0)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            byte[] r11 = f16454t     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            boolean r0 = java.util.Arrays.equals(r0, r11)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            if (r0 != 0) goto L_0x0060
            goto L_0x00d1
        L_0x0060:
            r11 = 1
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            r13 = 16
            r15 = 8
            if (r0 != 0) goto L_0x0074
            long r9 = r8.readLong()     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x0075
            goto L_0x00d1
        L_0x0074:
            r13 = r15
        L_0x0075:
            long r6 = (long) r2     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x007b
            r9 = r6
        L_0x007b:
            long r9 = r9 - r13
            int r0 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x0081
            goto L_0x00d1
        L_0x0081:
            byte[] r0 = new byte[r5]     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            r6 = 0
            r2 = r4
            r13 = r2
        L_0x0087:
            r14 = 4
            long r14 = r9 / r14
            int r14 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r14 >= 0) goto L_0x00d1
            int r14 = r8.read(r0)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            if (r14 == r5) goto L_0x0096
            goto L_0x00d1
        L_0x0096:
            int r14 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r14 != 0) goto L_0x009b
            goto L_0x00b7
        L_0x009b:
            byte[] r14 = f16455u     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            boolean r14 = java.util.Arrays.equals(r0, r14)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            if (r14 == 0) goto L_0x00a5
            r2 = 1
            goto L_0x00ae
        L_0x00a5:
            byte[] r14 = f16456v     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            boolean r14 = java.util.Arrays.equals(r0, r14)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            if (r14 == 0) goto L_0x00ae
            r13 = 1
        L_0x00ae:
            if (r2 == 0) goto L_0x00b7
            if (r13 == 0) goto L_0x00b7
            r8.close()
            r0 = 1
            goto L_0x00d5
        L_0x00b7:
            long r6 = r6 + r11
            goto L_0x0087
        L_0x00b9:
            r0 = move-exception
            goto L_0x018d
        L_0x00bc:
            r0 = move-exception
            goto L_0x00c4
        L_0x00be:
            r0 = move-exception
            r6 = 0
            goto L_0x018c
        L_0x00c2:
            r0 = move-exception
            r8 = 0
        L_0x00c4:
            boolean r2 = f16448n     // Catch:{ all -> 0x018a }
            if (r2 == 0) goto L_0x00cf
            java.lang.String r2 = "ExifInterface"
            java.lang.String r6 = "Exception parsing HEIF file type box."
            android.util.Log.d(r2, r6, r0)     // Catch:{ all -> 0x018a }
        L_0x00cf:
            if (r8 == 0) goto L_0x00d4
        L_0x00d1:
            r8.close()
        L_0x00d4:
            r0 = r4
        L_0x00d5:
            if (r0 == 0) goto L_0x00da
            r0 = 12
            return r0
        L_0x00da:
            n1.a$b r2 = new n1.a$b     // Catch:{ Exception -> 0x0106, all -> 0x00fe }
            r2.<init>((byte[]) r3)     // Catch:{ Exception -> 0x0106, all -> 0x00fe }
            java.nio.ByteOrder r0 = m14208t(r2)     // Catch:{ Exception -> 0x0107, all -> 0x00fb }
            r1.f16467g = r0     // Catch:{ Exception -> 0x0107, all -> 0x00fb }
            r2.f16479c = r0     // Catch:{ Exception -> 0x0107, all -> 0x00fb }
            short r0 = r2.readShort()     // Catch:{ Exception -> 0x0107, all -> 0x00fb }
            r6 = 20306(0x4f52, float:2.8455E-41)
            if (r0 == r6) goto L_0x00f6
            r6 = 21330(0x5352, float:2.989E-41)
            if (r0 != r6) goto L_0x00f4
            goto L_0x00f6
        L_0x00f4:
            r0 = r4
            goto L_0x00f7
        L_0x00f6:
            r0 = 1
        L_0x00f7:
            r2.close()
            goto L_0x010d
        L_0x00fb:
            r0 = move-exception
            r6 = r2
            goto L_0x0100
        L_0x00fe:
            r0 = move-exception
            r6 = 0
        L_0x0100:
            if (r6 == 0) goto L_0x0105
            r6.close()
        L_0x0105:
            throw r0
        L_0x0106:
            r2 = 0
        L_0x0107:
            if (r2 == 0) goto L_0x010c
            r2.close()
        L_0x010c:
            r0 = r4
        L_0x010d:
            if (r0 == 0) goto L_0x0111
            r0 = 7
            return r0
        L_0x0111:
            n1.a$b r2 = new n1.a$b     // Catch:{ Exception -> 0x013a, all -> 0x0132 }
            r2.<init>((byte[]) r3)     // Catch:{ Exception -> 0x013a, all -> 0x0132 }
            java.nio.ByteOrder r0 = m14208t(r2)     // Catch:{ Exception -> 0x0130, all -> 0x012d }
            r1.f16467g = r0     // Catch:{ Exception -> 0x0130, all -> 0x012d }
            r2.f16479c = r0     // Catch:{ Exception -> 0x0130, all -> 0x012d }
            short r0 = r2.readShort()     // Catch:{ Exception -> 0x0130, all -> 0x012d }
            r6 = 85
            if (r0 != r6) goto L_0x0128
            r0 = 1
            goto L_0x0129
        L_0x0128:
            r0 = r4
        L_0x0129:
            r2.close()
            goto L_0x0141
        L_0x012d:
            r0 = move-exception
            r6 = r2
            goto L_0x0134
        L_0x0130:
            r6 = r2
            goto L_0x013b
        L_0x0132:
            r0 = move-exception
            r6 = 0
        L_0x0134:
            if (r6 == 0) goto L_0x0139
            r6.close()
        L_0x0139:
            throw r0
        L_0x013a:
            r6 = 0
        L_0x013b:
            if (r6 == 0) goto L_0x0140
            r6.close()
        L_0x0140:
            r0 = r4
        L_0x0141:
            if (r0 == 0) goto L_0x0146
            r0 = 10
            return r0
        L_0x0146:
            r0 = r4
        L_0x0147:
            byte[] r2 = f16459y
            int r6 = r2.length
            if (r0 >= r6) goto L_0x0157
            byte r6 = r3[r0]
            byte r2 = r2[r0]
            if (r6 == r2) goto L_0x0154
            r0 = r4
            goto L_0x0158
        L_0x0154:
            int r0 = r0 + 1
            goto L_0x0147
        L_0x0157:
            r0 = 1
        L_0x0158:
            if (r0 == 0) goto L_0x015d
            r0 = 13
            return r0
        L_0x015d:
            r0 = r4
        L_0x015e:
            byte[] r2 = f16432C
            int r6 = r2.length
            if (r0 >= r6) goto L_0x016d
            byte r6 = r3[r0]
            byte r2 = r2[r0]
            if (r6 == r2) goto L_0x016a
            goto L_0x017e
        L_0x016a:
            int r0 = r0 + 1
            goto L_0x015e
        L_0x016d:
            r0 = r4
        L_0x016e:
            byte[] r2 = f16433D
            int r6 = r2.length
            if (r0 >= r6) goto L_0x0183
            byte[] r6 = f16432C
            int r6 = r6.length
            int r6 = r6 + r0
            int r6 = r6 + r5
            byte r6 = r3[r6]
            byte r2 = r2[r0]
            if (r6 == r2) goto L_0x0180
        L_0x017e:
            r7 = r4
            goto L_0x0184
        L_0x0180:
            int r0 = r0 + 1
            goto L_0x016e
        L_0x0183:
            r7 = 1
        L_0x0184:
            if (r7 == 0) goto L_0x0189
            r0 = 14
            return r0
        L_0x0189:
            return r4
        L_0x018a:
            r0 = move-exception
            r6 = r8
        L_0x018c:
            r8 = r6
        L_0x018d:
            if (r8 == 0) goto L_0x0192
            r8.close()
        L_0x0192:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p185n1.C7369a.mo19670h(java.io.BufferedInputStream):int");
    }

    /* renamed from: i */
    public final void mo19671i(C7371b bVar) throws IOException {
        int i;
        int i2;
        mo19674l(bVar);
        C7372c cVar = this.f16465e[1].get("MakerNote");
        if (cVar != null) {
            C7371b bVar2 = new C7371b(cVar.f16484c);
            bVar2.f16479c = this.f16467g;
            byte[] bArr = f16457w;
            byte[] bArr2 = new byte[bArr.length];
            bVar2.readFully(bArr2);
            bVar2.mo19691a(0);
            byte[] bArr3 = f16458x;
            byte[] bArr4 = new byte[bArr3.length];
            bVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                bVar2.mo19691a(8);
            } else if (Arrays.equals(bArr4, bArr3)) {
                bVar2.mo19691a(12);
            }
            mo19683v(bVar2, 6);
            C7372c cVar2 = this.f16465e[7].get("PreviewImageStart");
            C7372c cVar3 = this.f16465e[7].get("PreviewImageLength");
            if (!(cVar2 == null || cVar3 == null)) {
                this.f16465e[5].put("JPEGInterchangeFormat", cVar2);
                this.f16465e[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            C7372c cVar4 = this.f16465e[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.mo19713h(this.f16467g);
                if (iArr == null || iArr.length != 4) {
                    StringBuilder h = C0072d.m201h("Invalid aspect frame values. frame=");
                    h.append(Arrays.toString(iArr));
                    Log.w("ExifInterface", h.toString());
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 > i4 && (i = iArr[3]) > (i2 = iArr[1])) {
                    int i5 = (i3 - i4) + 1;
                    int i6 = (i - i2) + 1;
                    if (i5 < i6) {
                        int i7 = i5 + i6;
                        i6 = i7 - i6;
                        i5 = i7 - i6;
                    }
                    C7372c d = C7372c.m14236d(i5, this.f16467g);
                    C7372c d2 = C7372c.m14236d(i6, this.f16467g);
                    this.f16465e[0].put("ImageWidth", d);
                    this.f16465e[0].put("ImageLength", d2);
                }
            }
        }
    }

    /* renamed from: j */
    public final void mo19672j(C7371b bVar) throws IOException {
        if (f16448n) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f16479c = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f16459y;
        bVar.skipBytes(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i2 = i + 4;
                    if (i2 == 16) {
                        if (!Arrays.equals(bArr2, f16430A)) {
                            throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                        }
                    }
                    if (!Arrays.equals(bArr2, f16431B)) {
                        if (Arrays.equals(bArr2, f16460z)) {
                            byte[] bArr3 = new byte[readInt];
                            if (bVar.read(bArr3) == readInt) {
                                int readInt2 = bVar.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.f16469i = i2;
                                    mo19682u(0, bArr3);
                                    mo19687z();
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + m14206b(bArr2));
                        }
                        int i3 = readInt + 4;
                        bVar.skipBytes(i3);
                        length = i2 + i3;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* renamed from: k */
    public final void mo19673k(C7371b bVar) throws IOException {
        bVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        bVar.read(bArr);
        bVar.skipBytes(4);
        bVar.read(bArr2);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        mo19669g(bVar, i, 5);
        bVar.mo19691a((long) i2);
        bVar.f16479c = ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        if (f16448n) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i3 = 0; i3 < readInt; i3++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f16438I.f16485a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                C7372c d = C7372c.m14236d(readShort, this.f16467g);
                C7372c d2 = C7372c.m14236d(readShort2, this.f16467g);
                this.f16465e[0].put("ImageLength", d);
                this.f16465e[0].put("ImageWidth", d2);
                if (f16448n) {
                    Log.d("ExifInterface", "Updated to length: " + readShort + ", width: " + readShort2);
                    return;
                }
                return;
            }
            bVar.skipBytes(readUnsignedShort2);
        }
    }

    /* renamed from: l */
    public final void mo19674l(C7371b bVar) throws IOException {
        C7372c cVar;
        mo19680r(bVar, bVar.available());
        mo19683v(bVar, 0);
        mo19686y(bVar, 0);
        mo19686y(bVar, 5);
        mo19686y(bVar, 4);
        mo19687z();
        if (this.f16464d == 8 && (cVar = this.f16465e[1].get("MakerNote")) != null) {
            C7371b bVar2 = new C7371b(cVar.f16484c);
            bVar2.f16479c = this.f16467g;
            bVar2.mo19691a(6);
            mo19683v(bVar2, 9);
            C7372c cVar2 = this.f16465e[9].get("ColorSpace");
            if (cVar2 != null) {
                this.f16465e[1].put("ColorSpace", cVar2);
            }
        }
    }

    /* renamed from: m */
    public final void mo19675m(C7371b bVar) throws IOException {
        mo19674l(bVar);
        if (this.f16465e[0].get("JpgFromRaw") != null) {
            mo19669g(bVar, this.f16473m, 5);
        }
        C7372c cVar = this.f16465e[0].get("ISO");
        C7372c cVar2 = this.f16465e[1].get("PhotographicSensitivity");
        if (cVar != null && cVar2 == null) {
            this.f16465e[1].put("PhotographicSensitivity", cVar);
        }
    }

    /* renamed from: n */
    public final void mo19676n(C7371b bVar) throws IOException {
        if (f16448n) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f16479c = ByteOrder.LITTLE_ENDIAN;
        bVar.skipBytes(f16432C.length);
        int readInt = bVar.readInt() + 8;
        int skipBytes = bVar.skipBytes(f16433D.length) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (bVar.read(bArr) == 4) {
                    int readInt2 = bVar.readInt();
                    int i = skipBytes + 4 + 4;
                    if (Arrays.equals(f16434E, bArr)) {
                        byte[] bArr2 = new byte[readInt2];
                        if (bVar.read(bArr2) == readInt2) {
                            this.f16469i = i;
                            mo19682u(0, bArr2);
                            this.f16469i = i;
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + m14206b(bArr));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    int i2 = i + readInt2;
                    if (i2 != readInt) {
                        if (i2 <= readInt) {
                            int skipBytes2 = bVar.skipBytes(readInt2);
                            if (skipBytes2 == readInt2) {
                                skipBytes = i + skipBytes2;
                            } else {
                                throw new IOException("Encountered WebP file with invalid chunk size");
                            }
                        } else {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* renamed from: o */
    public final void mo19677o(C7371b bVar, HashMap hashMap) throws IOException {
        C7372c cVar = (C7372c) hashMap.get("JPEGInterchangeFormat");
        C7372c cVar2 = (C7372c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar != null && cVar2 != null) {
            int f = cVar.mo19711f(this.f16467g);
            int f2 = cVar2.mo19711f(this.f16467g);
            if (this.f16464d == 7) {
                f += this.f16470j;
            }
            int min = Math.min(f2, bVar.f16480d - f);
            if (f > 0 && min > 0) {
                int i = this.f16469i + f;
                if (this.f16461a == null && this.f16463c == null && this.f16462b == null) {
                    bVar.mo19691a((long) i);
                    bVar.readFully(new byte[min]);
                }
            }
            if (f16448n) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + f + ", length: " + min);
            }
        }
    }

    /* renamed from: p */
    public final boolean mo19678p(HashMap hashMap) throws IOException {
        C7372c cVar = (C7372c) hashMap.get("ImageLength");
        C7372c cVar2 = (C7372c) hashMap.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.mo19711f(this.f16467g) <= 512 && cVar2.mo19711f(this.f16467g) <= 512;
    }

    /* renamed from: q */
    public final void mo19679q(InputStream inputStream) {
        if (inputStream != null) {
            int i = 0;
            while (i < f16439J.length) {
                try {
                    this.f16465e[i] = new HashMap<>();
                    i++;
                } catch (IOException e) {
                    boolean z = f16448n;
                    if (z) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                    }
                    mo19665a();
                    if (!z) {
                        return;
                    }
                } catch (Throwable th) {
                    mo19665a();
                    if (f16448n) {
                        mo19681s();
                    }
                    throw th;
                }
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f16464d = mo19670h(bufferedInputStream);
            C7371b bVar = new C7371b((InputStream) bufferedInputStream);
            switch (this.f16464d) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                case 8:
                case 11:
                    mo19674l(bVar);
                    break;
                case 4:
                    mo19669g(bVar, 0, 0);
                    break;
                case 7:
                    mo19671i(bVar);
                    break;
                case 9:
                    mo19673k(bVar);
                    break;
                case 10:
                    mo19675m(bVar);
                    break;
                case 12:
                    mo19668f(bVar);
                    break;
                case 13:
                    mo19672j(bVar);
                    break;
                case 14:
                    mo19676n(bVar);
                    break;
            }
            mo19684w(bVar);
            mo19665a();
            if (!f16448n) {
                return;
            }
            mo19681s();
            return;
        }
        throw new NullPointerException("inputstream shouldn't be null");
    }

    /* renamed from: r */
    public final void mo19680r(C7371b bVar, int i) throws IOException {
        ByteOrder t = m14208t(bVar);
        this.f16467g = t;
        bVar.f16479c = t;
        int readUnsignedShort = bVar.readUnsignedShort();
        int i2 = this.f16464d;
        if (i2 == 7 || i2 == 10 || readUnsignedShort == 42) {
            int readInt = bVar.readInt();
            if (readInt < 8 || readInt >= i) {
                throw new IOException(C0015b.m88g("Invalid first Ifd offset: ", readInt));
            }
            int i3 = readInt - 8;
            if (i3 > 0 && bVar.skipBytes(i3) != i3) {
                throw new IOException(C0015b.m88g("Couldn't jump to first Ifd: ", i3));
            }
            return;
        }
        StringBuilder h = C0072d.m201h("Invalid start code: ");
        h.append(Integer.toHexString(readUnsignedShort));
        throw new IOException(h.toString());
    }

    /* renamed from: s */
    public final void mo19681s() {
        for (int i = 0; i < this.f16465e.length; i++) {
            StringBuilder h = C0069a.m177h("The size of tag group[", i, "]: ");
            h.append(this.f16465e[i].size());
            Log.d("ExifInterface", h.toString());
            for (Map.Entry next : this.f16465e[i].entrySet()) {
                C7372c cVar = (C7372c) next.getValue();
                StringBuilder h2 = C0072d.m201h("tagName: ");
                h2.append((String) next.getKey());
                h2.append(", tagType: ");
                h2.append(cVar.toString());
                h2.append(", tagValue: '");
                h2.append(cVar.mo19712g(this.f16467g));
                h2.append("'");
                Log.d("ExifInterface", h2.toString());
            }
        }
    }

    /* renamed from: u */
    public final void mo19682u(int i, byte[] bArr) throws IOException {
        C7371b bVar = new C7371b(bArr);
        mo19680r(bVar, bArr.length);
        mo19683v(bVar, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:123:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0311  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0175  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19683v(p185n1.C7369a.C7371b r25, int r26) throws java.io.IOException {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            java.util.HashSet r3 = r0.f16466f
            int r4 = r1.f16481e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            int r3 = r1.f16481e
            int r3 = r3 + 2
            int r4 = r1.f16480d
            if (r3 <= r4) goto L_0x001a
            return
        L_0x001a:
            short r3 = r25.readShort()
            boolean r4 = f16448n
            java.lang.String r5 = "ExifInterface"
            if (r4 == 0) goto L_0x0038
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "numberOfDirectoryEntry: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r5, r4)
        L_0x0038:
            int r4 = r1.f16481e
            int r6 = r3 * 12
            int r6 = r6 + r4
            int r4 = r1.f16480d
            if (r6 > r4) goto L_0x0424
            if (r3 > 0) goto L_0x0045
            goto L_0x0424
        L_0x0045:
            r4 = 0
            r6 = r4
        L_0x0047:
            r7 = 5
            if (r4 >= r3) goto L_0x039d
            int r8 = r25.readUnsignedShort()
            int r9 = r25.readUnsignedShort()
            int r10 = r25.readInt()
            int r11 = r1.f16481e
            long r11 = (long) r11
            r13 = 4
            long r11 = r11 + r13
            java.util.HashMap<java.lang.Integer, n1.a$d>[] r15 = f16441L
            r15 = r15[r2]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            java.lang.Object r13 = r15.get(r13)
            n1.a$d r13 = (p185n1.C7369a.C7373d) r13
            boolean r14 = f16448n
            r15 = 3
            if (r14 == 0) goto L_0x009f
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r18 = java.lang.Integer.valueOf(r26)
            r7[r6] = r18
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r18 = 1
            r7[r18] = r6
            if (r13 == 0) goto L_0x0084
            java.lang.String r6 = r13.f16486b
            goto L_0x0085
        L_0x0084:
            r6 = 0
        L_0x0085:
            r18 = 2
            r7[r18] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            r7[r15] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            r15 = 4
            r7[r15] = r6
            java.lang.String r6 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            java.lang.String r6 = java.lang.String.format(r6, r7)
            android.util.Log.d(r5, r6)
        L_0x009f:
            r6 = 7
            if (r13 != 0) goto L_0x00bc
            if (r14 == 0) goto L_0x00b8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip the tag entry since tag number is not defined: "
            r6.append(r7)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r5, r6)
        L_0x00b8:
            r18 = r3
            goto L_0x011b
        L_0x00bc:
            if (r9 <= 0) goto L_0x0150
            int[] r7 = f16436G
            int r15 = r7.length
            if (r9 < r15) goto L_0x00c5
            goto L_0x0150
        L_0x00c5:
            int r15 = r13.f16487c
            if (r15 == r6) goto L_0x00f6
            if (r9 != r6) goto L_0x00cc
            goto L_0x00f6
        L_0x00cc:
            if (r15 == r9) goto L_0x00f6
            int r6 = r13.f16488d
            if (r6 != r9) goto L_0x00d3
            goto L_0x00f6
        L_0x00d3:
            r18 = r3
            r3 = 4
            if (r15 == r3) goto L_0x00da
            if (r6 != r3) goto L_0x00de
        L_0x00da:
            r3 = 3
            if (r9 != r3) goto L_0x00de
            goto L_0x00f8
        L_0x00de:
            r3 = 9
            if (r15 == r3) goto L_0x00e4
            if (r6 != r3) goto L_0x00e9
        L_0x00e4:
            r3 = 8
            if (r9 != r3) goto L_0x00e9
            goto L_0x00f8
        L_0x00e9:
            r3 = 12
            if (r15 == r3) goto L_0x00ef
            if (r6 != r3) goto L_0x00f4
        L_0x00ef:
            r3 = 11
            if (r9 != r3) goto L_0x00f4
            goto L_0x00f8
        L_0x00f4:
            r3 = 0
            goto L_0x00f9
        L_0x00f6:
            r18 = r3
        L_0x00f8:
            r3 = 1
        L_0x00f9:
            if (r3 != 0) goto L_0x011d
            if (r14 == 0) goto L_0x011b
            java.lang.String r3 = "Skip the tag entry since data format ("
            java.lang.StringBuilder r3 = android.support.p013v4.media.C0072d.m201h(r3)
            java.lang.String[] r6 = f16435F
            r6 = r6[r9]
            r3.append(r6)
            java.lang.String r6 = ") is unexpected for tag: "
            r3.append(r6)
            java.lang.String r6 = r13.f16486b
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r5, r3)
        L_0x011b:
            r15 = r4
            goto L_0x0169
        L_0x011d:
            r3 = 7
            r6 = r4
            if (r9 != r3) goto L_0x0122
            r9 = r15
        L_0x0122:
            long r3 = (long) r10
            r7 = r7[r9]
            r15 = r6
            long r6 = (long) r7
            long r3 = r3 * r6
            r6 = 0
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x0138
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x0136
            goto L_0x0138
        L_0x0136:
            r6 = 1
            goto L_0x016c
        L_0x0138:
            if (r14 == 0) goto L_0x014e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip the tag entry since the number of components is invalid: "
            r6.append(r7)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r5, r6)
        L_0x014e:
            r6 = 0
            goto L_0x016c
        L_0x0150:
            r18 = r3
            r15 = r4
            if (r14 == 0) goto L_0x0169
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Skip the tag entry since data format is invalid: "
            r3.append(r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r5, r3)
        L_0x0169:
            r6 = 0
            r3 = 0
        L_0x016c:
            if (r6 != 0) goto L_0x0175
            r1.mo19691a(r11)
            r16 = r15
            goto L_0x0393
        L_0x0175:
            r6 = 4
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            java.lang.String r7 = "Compression"
            if (r6 <= 0) goto L_0x0243
            int r6 = r25.readInt()
            if (r14 == 0) goto L_0x019c
            r16 = r15
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r17 = r9
            java.lang.String r9 = "seek to data offset: "
            r15.append(r9)
            r15.append(r6)
            java.lang.String r9 = r15.toString()
            android.util.Log.d(r5, r9)
            goto L_0x01a0
        L_0x019c:
            r17 = r9
            r16 = r15
        L_0x01a0:
            int r9 = r0.f16464d
            r15 = 7
            if (r9 != r15) goto L_0x0200
            java.lang.String r9 = r13.f16486b
            java.lang.String r15 = "MakerNote"
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L_0x01b2
            r0.f16470j = r6
            goto L_0x01fb
        L_0x01b2:
            r9 = 6
            if (r2 != r9) goto L_0x01fb
            java.lang.String r9 = r13.f16486b
            java.lang.String r15 = "ThumbnailImage"
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L_0x01fb
            r0.f16471k = r6
            r0.f16472l = r10
            java.nio.ByteOrder r9 = r0.f16467g
            r15 = 6
            n1.a$c r9 = p185n1.C7369a.C7372c.m14236d(r15, r9)
            int r15 = r0.f16471k
            r19 = r10
            r20 = r11
            long r10 = (long) r15
            java.nio.ByteOrder r12 = r0.f16467g
            n1.a$c r10 = p185n1.C7369a.C7372c.m14234b(r10, r12)
            int r11 = r0.f16472l
            long r11 = (long) r11
            java.nio.ByteOrder r15 = r0.f16467g
            n1.a$c r11 = p185n1.C7369a.C7372c.m14234b(r11, r15)
            java.util.HashMap<java.lang.String, n1.a$c>[] r12 = r0.f16465e
            r15 = 4
            r12 = r12[r15]
            r12.put(r7, r9)
            java.util.HashMap<java.lang.String, n1.a$c>[] r9 = r0.f16465e
            r9 = r9[r15]
            java.lang.String r12 = "JPEGInterchangeFormat"
            r9.put(r12, r10)
            java.util.HashMap<java.lang.String, n1.a$c>[] r9 = r0.f16465e
            r9 = r9[r15]
            java.lang.String r10 = "JPEGInterchangeFormatLength"
            r9.put(r10, r11)
            goto L_0x0214
        L_0x01fb:
            r19 = r10
            r20 = r11
            goto L_0x0214
        L_0x0200:
            r19 = r10
            r20 = r11
            r10 = 10
            if (r9 != r10) goto L_0x0214
            java.lang.String r9 = r13.f16486b
            java.lang.String r10 = "JpgFromRaw"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L_0x0214
            r0.f16473m = r6
        L_0x0214:
            long r9 = (long) r6
            long r11 = r9 + r3
            int r15 = r1.f16480d
            r22 = r3
            long r2 = (long) r15
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0226
            r1.mo19691a(r9)
            r11 = r20
            goto L_0x024b
        L_0x0226:
            if (r14 == 0) goto L_0x023c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Skip the tag entry since data offset is invalid: "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r5, r2)
        L_0x023c:
            r11 = r20
            r1.mo19691a(r11)
            goto L_0x0393
        L_0x0243:
            r22 = r3
            r17 = r9
            r19 = r10
            r16 = r15
        L_0x024b:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r2 = f16444O
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r14 == 0) goto L_0x0278
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "nextIfdType: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = " byteCount: "
            r3.append(r4)
            r8 = r22
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r5, r3)
            goto L_0x027a
        L_0x0278:
            r8 = r22
        L_0x027a:
            if (r2 == 0) goto L_0x032b
            r3 = -1
            r6 = 3
            r10 = r17
            if (r10 == r6) goto L_0x02a9
            r6 = 4
            if (r10 == r6) goto L_0x029d
            r6 = 8
            if (r10 == r6) goto L_0x0298
            r6 = 9
            if (r10 == r6) goto L_0x0293
            r6 = 13
            if (r10 == r6) goto L_0x0293
            goto L_0x02ae
        L_0x0293:
            int r3 = r25.readInt()
            goto L_0x02ad
        L_0x0298:
            short r3 = r25.readShort()
            goto L_0x02ad
        L_0x029d:
            int r3 = r25.readInt()
            long r3 = (long) r3
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r6
            goto L_0x02ae
        L_0x02a9:
            int r3 = r25.readUnsignedShort()
        L_0x02ad:
            long r3 = (long) r3
        L_0x02ae:
            r6 = 2
            if (r14 == 0) goto L_0x02c8
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
            r8 = 0
            r6[r8] = r7
            java.lang.String r7 = r13.f16486b
            r8 = 1
            r6[r8] = r7
            java.lang.String r7 = "Offset: %d, tagName: %s"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            android.util.Log.d(r5, r6)
        L_0x02c8:
            r6 = 0
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x0311
            int r6 = r1.f16480d
            long r6 = (long) r6
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x0311
            java.util.HashSet r6 = r0.f16466f
            int r7 = (int) r3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x02ed
            r1.mo19691a(r3)
            int r2 = r2.intValue()
            r0.mo19683v(r1, r2)
            goto L_0x0327
        L_0x02ed:
            if (r14 == 0) goto L_0x0327
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip jump into the IFD since it has already been read: IfdType "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = " (at "
            r6.append(r2)
            r6.append(r3)
            java.lang.String r2 = ")"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            android.util.Log.d(r5, r2)
            goto L_0x0327
        L_0x0311:
            if (r14 == 0) goto L_0x0327
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "Skip jump into the IFD since its offset is invalid: "
            r2.append(r6)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r5, r2)
        L_0x0327:
            r1.mo19691a(r11)
            goto L_0x0393
        L_0x032b:
            r10 = r17
            int r2 = (int) r8
            byte[] r2 = new byte[r2]
            r1.readFully(r2)
            n1.a$c r3 = new n1.a$c
            r4 = r19
            r3.<init>((byte[]) r2, (int) r10, (int) r4)
            java.util.HashMap<java.lang.String, n1.a$c>[] r2 = r0.f16465e
            r2 = r2[r26]
            java.lang.String r4 = r13.f16486b
            r2.put(r4, r3)
            java.lang.String r2 = r13.f16486b
            java.lang.String r4 = "DNGVersion"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0350
            r2 = 3
            r0.f16464d = r2
        L_0x0350:
            java.lang.String r2 = r13.f16486b
            java.lang.String r4 = "Make"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x0364
            java.lang.String r2 = r13.f16486b
            java.lang.String r4 = "Model"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0372
        L_0x0364:
            java.nio.ByteOrder r2 = r0.f16467g
            java.lang.String r2 = r3.mo19712g(r2)
            java.lang.String r4 = "PENTAX"
            boolean r2 = r2.contains(r4)
            if (r2 != 0) goto L_0x0385
        L_0x0372:
            java.lang.String r2 = r13.f16486b
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0389
            java.nio.ByteOrder r2 = r0.f16467g
            int r2 = r3.mo19711f(r2)
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r2 != r3) goto L_0x0389
        L_0x0385:
            r2 = 8
            r0.f16464d = r2
        L_0x0389:
            int r2 = r1.f16481e
            long r2 = (long) r2
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 == 0) goto L_0x0393
            r1.mo19691a(r11)
        L_0x0393:
            int r4 = r16 + 1
            short r4 = (short) r4
            r6 = 0
            r2 = r26
            r3 = r18
            goto L_0x0047
        L_0x039d:
            int r2 = r1.f16481e
            int r2 = r2 + 4
            int r3 = r1.f16480d
            if (r2 > r3) goto L_0x0424
            int r2 = r25.readInt()
            boolean r3 = f16448n
            if (r3 == 0) goto L_0x03c0
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r8 = 0
            r4[r8] = r6
            java.lang.String r6 = "nextIfdOffset: %d"
            java.lang.String r4 = java.lang.String.format(r6, r4)
            android.util.Log.d(r5, r4)
        L_0x03c0:
            long r8 = (long) r2
            r10 = 0
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 <= 0) goto L_0x040e
            int r4 = r1.f16480d
            if (r2 >= r4) goto L_0x040e
            java.util.HashSet r4 = r0.f16466f
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            boolean r4 = r4.contains(r6)
            if (r4 != 0) goto L_0x03f7
            r1.mo19691a(r8)
            java.util.HashMap<java.lang.String, n1.a$c>[] r2 = r0.f16465e
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x03e9
            r0.mo19683v(r1, r3)
            goto L_0x0424
        L_0x03e9:
            java.util.HashMap<java.lang.String, n1.a$c>[] r2 = r0.f16465e
            r2 = r2[r7]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0424
            r0.mo19683v(r1, r7)
            goto L_0x0424
        L_0x03f7:
            if (r3 == 0) goto L_0x0424
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r5, r1)
            goto L_0x0424
        L_0x040e:
            if (r3 == 0) goto L_0x0424
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r5, r1)
        L_0x0424:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p185n1.C7369a.mo19683v(n1.a$b, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19684w(p185n1.C7369a.C7371b r18) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.util.HashMap<java.lang.String, n1.a$c>[] r2 = r0.f16465e
            r3 = 4
            r2 = r2[r3]
            java.lang.String r3 = "Compression"
            java.lang.Object r3 = r2.get(r3)
            n1.a$c r3 = (p185n1.C7369a.C7372c) r3
            if (r3 == 0) goto L_0x0116
            java.nio.ByteOrder r4 = r0.f16467g
            int r3 = r3.mo19711f(r4)
            r4 = 1
            r5 = 6
            if (r3 == r4) goto L_0x0029
            if (r3 == r5) goto L_0x0024
            r6 = 7
            if (r3 == r6) goto L_0x0029
            goto L_0x0119
        L_0x0024:
            r0.mo19677o(r1, r2)
            goto L_0x0119
        L_0x0029:
            java.lang.String r3 = "BitsPerSample"
            java.lang.Object r3 = r2.get(r3)
            n1.a$c r3 = (p185n1.C7369a.C7372c) r3
            java.lang.String r6 = "ExifInterface"
            r7 = 0
            if (r3 == 0) goto L_0x0070
            java.nio.ByteOrder r8 = r0.f16467g
            java.io.Serializable r3 = r3.mo19713h(r8)
            int[] r3 = (int[]) r3
            int[] r8 = f16451q
            boolean r9 = java.util.Arrays.equals(r8, r3)
            if (r9 == 0) goto L_0x0047
            goto L_0x006e
        L_0x0047:
            int r9 = r0.f16464d
            r10 = 3
            if (r9 != r10) goto L_0x0070
            java.lang.String r9 = "PhotometricInterpretation"
            java.lang.Object r9 = r2.get(r9)
            n1.a$c r9 = (p185n1.C7369a.C7372c) r9
            if (r9 == 0) goto L_0x0070
            java.nio.ByteOrder r10 = r0.f16467g
            int r9 = r9.mo19711f(r10)
            if (r9 != r4) goto L_0x0066
            int[] r10 = f16452r
            boolean r10 = java.util.Arrays.equals(r3, r10)
            if (r10 != 0) goto L_0x006e
        L_0x0066:
            if (r9 != r5) goto L_0x0070
            boolean r3 = java.util.Arrays.equals(r3, r8)
            if (r3 == 0) goto L_0x0070
        L_0x006e:
            r3 = r4
            goto L_0x007a
        L_0x0070:
            boolean r3 = f16448n
            if (r3 == 0) goto L_0x0079
            java.lang.String r3 = "Unsupported data type value"
            android.util.Log.d(r6, r3)
        L_0x0079:
            r3 = r7
        L_0x007a:
            if (r3 == 0) goto L_0x0119
            java.lang.String r3 = "StripOffsets"
            java.lang.Object r3 = r2.get(r3)
            n1.a$c r3 = (p185n1.C7369a.C7372c) r3
            java.lang.String r5 = "StripByteCounts"
            java.lang.Object r2 = r2.get(r5)
            n1.a$c r2 = (p185n1.C7369a.C7372c) r2
            if (r3 == 0) goto L_0x0119
            if (r2 == 0) goto L_0x0119
            java.nio.ByteOrder r5 = r0.f16467g
            java.io.Serializable r3 = r3.mo19713h(r5)
            long[] r3 = m14207c(r3)
            java.nio.ByteOrder r5 = r0.f16467g
            java.io.Serializable r2 = r2.mo19713h(r5)
            long[] r2 = m14207c(r2)
            if (r3 == 0) goto L_0x0110
            int r5 = r3.length
            if (r5 != 0) goto L_0x00ab
            goto L_0x0110
        L_0x00ab:
            if (r2 == 0) goto L_0x010a
            int r5 = r2.length
            if (r5 != 0) goto L_0x00b1
            goto L_0x010a
        L_0x00b1:
            int r5 = r3.length
            int r8 = r2.length
            if (r5 == r8) goto L_0x00bb
            java.lang.String r1 = "stripOffsets and stripByteCounts should have same length."
            android.util.Log.w(r6, r1)
            goto L_0x0119
        L_0x00bb:
            r8 = 0
            int r5 = r2.length
            r10 = r7
        L_0x00bf:
            if (r10 >= r5) goto L_0x00c7
            r11 = r2[r10]
            long r8 = r8 + r11
            int r10 = r10 + 1
            goto L_0x00bf
        L_0x00c7:
            int r5 = (int) r8
            byte[] r5 = new byte[r5]
            r0.f16468h = r4
            r8 = r7
            r9 = r8
            r10 = r9
        L_0x00cf:
            int r11 = r3.length
            if (r8 >= r11) goto L_0x0103
            r11 = r3[r8]
            int r11 = (int) r11
            r12 = r2[r8]
            int r12 = (int) r12
            int r13 = r3.length
            int r13 = r13 - r4
            if (r8 >= r13) goto L_0x00e9
            int r13 = r11 + r12
            long r13 = (long) r13
            int r15 = r8 + 1
            r15 = r3[r15]
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L_0x00e9
            r0.f16468h = r7
        L_0x00e9:
            int r11 = r11 - r9
            if (r11 >= 0) goto L_0x00f1
            java.lang.String r13 = "Invalid strip offset value"
            android.util.Log.d(r6, r13)
        L_0x00f1:
            long r13 = (long) r11
            r1.mo19691a(r13)
            int r9 = r9 + r11
            byte[] r11 = new byte[r12]
            r1.read(r11)
            int r9 = r9 + r12
            java.lang.System.arraycopy(r11, r7, r5, r10, r12)
            int r10 = r10 + r12
            int r8 = r8 + 1
            goto L_0x00cf
        L_0x0103:
            boolean r1 = r0.f16468h
            if (r1 == 0) goto L_0x0119
            r1 = r3[r7]
            goto L_0x0119
        L_0x010a:
            java.lang.String r1 = "stripByteCounts should not be null or have zero length."
            android.util.Log.w(r6, r1)
            goto L_0x0119
        L_0x0110:
            java.lang.String r1 = "stripOffsets should not be null or have zero length."
            android.util.Log.w(r6, r1)
            goto L_0x0119
        L_0x0116:
            r0.mo19677o(r1, r2)
        L_0x0119:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p185n1.C7369a.mo19684w(n1.a$b):void");
    }

    /* renamed from: x */
    public final void mo19685x(int i, int i2) throws IOException {
        if (!this.f16465e[i].isEmpty() && !this.f16465e[i2].isEmpty()) {
            C7372c cVar = this.f16465e[i].get("ImageLength");
            C7372c cVar2 = this.f16465e[i].get("ImageWidth");
            C7372c cVar3 = this.f16465e[i2].get("ImageLength");
            C7372c cVar4 = this.f16465e[i2].get("ImageWidth");
            if (cVar == null || cVar2 == null) {
                if (f16448n) {
                    Log.d("ExifInterface", "First image does not contain valid size information");
                }
            } else if (cVar3 != null && cVar4 != null) {
                int f = cVar.mo19711f(this.f16467g);
                int f2 = cVar2.mo19711f(this.f16467g);
                int f3 = cVar3.mo19711f(this.f16467g);
                int f4 = cVar4.mo19711f(this.f16467g);
                if (f < f3 && f2 < f4) {
                    HashMap<String, C7372c>[] hashMapArr = this.f16465e;
                    HashMap<String, C7372c> hashMap = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap;
                }
            } else if (f16448n) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
            }
        } else if (f16448n) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    /* renamed from: y */
    public final void mo19686y(C7371b bVar, int i) throws IOException {
        C7372c cVar;
        C7372c cVar2;
        C7372c cVar3;
        C7372c cVar4 = this.f16465e[i].get("DefaultCropSize");
        C7372c cVar5 = this.f16465e[i].get("SensorTopBorder");
        C7372c cVar6 = this.f16465e[i].get("SensorLeftBorder");
        C7372c cVar7 = this.f16465e[i].get("SensorBottomBorder");
        C7372c cVar8 = this.f16465e[i].get("SensorRightBorder");
        if (cVar4 != null) {
            if (cVar4.f16482a == 5) {
                C7374e[] eVarArr = (C7374e[]) cVar4.mo19713h(this.f16467g);
                if (eVarArr == null || eVarArr.length != 2) {
                    StringBuilder h = C0072d.m201h("Invalid crop size values. cropSize=");
                    h.append(Arrays.toString(eVarArr));
                    Log.w("ExifInterface", h.toString());
                    return;
                }
                cVar3 = C7372c.m14235c(eVarArr[0], this.f16467g);
                cVar2 = C7372c.m14235c(eVarArr[1], this.f16467g);
            } else {
                int[] iArr = (int[]) cVar4.mo19713h(this.f16467g);
                if (iArr == null || iArr.length != 2) {
                    StringBuilder h2 = C0072d.m201h("Invalid crop size values. cropSize=");
                    h2.append(Arrays.toString(iArr));
                    Log.w("ExifInterface", h2.toString());
                    return;
                }
                cVar3 = C7372c.m14236d(iArr[0], this.f16467g);
                cVar2 = C7372c.m14236d(iArr[1], this.f16467g);
            }
            this.f16465e[i].put("ImageWidth", cVar3);
            this.f16465e[i].put("ImageLength", cVar2);
        } else if (cVar5 == null || cVar6 == null || cVar7 == null || cVar8 == null) {
            C7372c cVar9 = this.f16465e[i].get("ImageLength");
            C7372c cVar10 = this.f16465e[i].get("ImageWidth");
            if ((cVar9 == null || cVar10 == null) && (cVar = this.f16465e[i].get("JPEGInterchangeFormat")) != null) {
                mo19669g(bVar, cVar.mo19711f(this.f16467g), i);
            }
        } else {
            int f = cVar5.mo19711f(this.f16467g);
            int f2 = cVar7.mo19711f(this.f16467g);
            int f3 = cVar8.mo19711f(this.f16467g);
            int f4 = cVar6.mo19711f(this.f16467g);
            if (f2 > f && f3 > f4) {
                C7372c d = C7372c.m14236d(f2 - f, this.f16467g);
                C7372c d2 = C7372c.m14236d(f3 - f4, this.f16467g);
                this.f16465e[i].put("ImageLength", d);
                this.f16465e[i].put("ImageWidth", d2);
            }
        }
    }

    /* renamed from: z */
    public final void mo19687z() throws IOException {
        mo19685x(0, 5);
        mo19685x(0, 4);
        mo19685x(5, 4);
        C7372c cVar = this.f16465e[1].get("PixelXDimension");
        C7372c cVar2 = this.f16465e[1].get("PixelYDimension");
        if (!(cVar == null || cVar2 == null)) {
            this.f16465e[0].put("ImageWidth", cVar);
            this.f16465e[0].put("ImageLength", cVar2);
        }
        if (this.f16465e[4].isEmpty() && mo19678p(this.f16465e[5])) {
            HashMap<String, C7372c>[] hashMapArr = this.f16465e;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!mo19678p(this.f16465e[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
    }

    /* renamed from: n1.a$b */
    public static class C7371b extends InputStream implements DataInput {

        /* renamed from: f */
        public static final ByteOrder f16476f = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: g */
        public static final ByteOrder f16477g = ByteOrder.BIG_ENDIAN;

        /* renamed from: b */
        public DataInputStream f16478b;

        /* renamed from: c */
        public ByteOrder f16479c;

        /* renamed from: d */
        public final int f16480d;

        /* renamed from: e */
        public int f16481e;

        public C7371b(InputStream inputStream) throws IOException {
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            this.f16479c = byteOrder;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f16478b = dataInputStream;
            int available = dataInputStream.available();
            this.f16480d = available;
            this.f16481e = 0;
            this.f16478b.mark(available);
            this.f16479c = byteOrder;
        }

        /* renamed from: a */
        public final void mo19691a(long j) throws IOException {
            int i = this.f16481e;
            if (((long) i) > j) {
                this.f16481e = 0;
                this.f16478b.reset();
                this.f16478b.mark(this.f16480d);
            } else {
                j -= (long) i;
            }
            int i2 = (int) j;
            if (skipBytes(i2) != i2) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        public final int available() throws IOException {
            return this.f16478b.available();
        }

        public final int read() throws IOException {
            this.f16481e++;
            return this.f16478b.read();
        }

        public final boolean readBoolean() throws IOException {
            this.f16481e++;
            return this.f16478b.readBoolean();
        }

        public final byte readByte() throws IOException {
            int i = this.f16481e + 1;
            this.f16481e = i;
            if (i <= this.f16480d) {
                int read = this.f16478b.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public final char readChar() throws IOException {
            this.f16481e += 2;
            return this.f16478b.readChar();
        }

        public final double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        public final float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        public final void readFully(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f16481e + i2;
            this.f16481e = i3;
            if (i3 > this.f16480d) {
                throw new EOFException();
            } else if (this.f16478b.read(bArr, i, i2) != i2) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public final int readInt() throws IOException {
            int i = this.f16481e + 4;
            this.f16481e = i;
            if (i <= this.f16480d) {
                int read = this.f16478b.read();
                int read2 = this.f16478b.read();
                int read3 = this.f16478b.read();
                int read4 = this.f16478b.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.f16479c;
                    if (byteOrder == f16476f) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f16477g) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    StringBuilder h = C0072d.m201h("Invalid byte order: ");
                    h.append(this.f16479c);
                    throw new IOException(h.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public final String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        public final long readLong() throws IOException {
            int i = this.f16481e + 8;
            this.f16481e = i;
            if (i <= this.f16480d) {
                int read = this.f16478b.read();
                int read2 = this.f16478b.read();
                int read3 = this.f16478b.read();
                int read4 = this.f16478b.read();
                int read5 = this.f16478b.read();
                int read6 = this.f16478b.read();
                int read7 = this.f16478b.read();
                int read8 = this.f16478b.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.f16479c;
                    if (byteOrder == f16476f) {
                        return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                    }
                    if (byteOrder == f16477g) {
                        return (((long) read) << 56) + (((long) read2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                    }
                    StringBuilder h = C0072d.m201h("Invalid byte order: ");
                    h.append(this.f16479c);
                    throw new IOException(h.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public final short readShort() throws IOException {
            int i = this.f16481e + 2;
            this.f16481e = i;
            if (i <= this.f16480d) {
                int read = this.f16478b.read();
                int read2 = this.f16478b.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f16479c;
                    if (byteOrder == f16476f) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == f16477g) {
                        return (short) ((read << 8) + read2);
                    }
                    StringBuilder h = C0072d.m201h("Invalid byte order: ");
                    h.append(this.f16479c);
                    throw new IOException(h.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public final String readUTF() throws IOException {
            this.f16481e += 2;
            return this.f16478b.readUTF();
        }

        public final int readUnsignedByte() throws IOException {
            this.f16481e++;
            return this.f16478b.readUnsignedByte();
        }

        public final int readUnsignedShort() throws IOException {
            int i = this.f16481e + 2;
            this.f16481e = i;
            if (i <= this.f16480d) {
                int read = this.f16478b.read();
                int read2 = this.f16478b.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f16479c;
                    if (byteOrder == f16476f) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == f16477g) {
                        return (read << 8) + read2;
                    }
                    StringBuilder h = C0072d.m201h("Invalid byte order: ");
                    h.append(this.f16479c);
                    throw new IOException(h.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public final int skipBytes(int i) throws IOException {
            int min = Math.min(i, this.f16480d - this.f16481e);
            int i2 = 0;
            while (i2 < min) {
                i2 += this.f16478b.skipBytes(min - i2);
            }
            this.f16481e += i2;
            return i2;
        }

        public final int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.f16478b.read(bArr, i, i2);
            this.f16481e += read;
            return read;
        }

        public final void readFully(byte[] bArr) throws IOException {
            int length = this.f16481e + bArr.length;
            this.f16481e = length;
            if (length > this.f16480d) {
                throw new EOFException();
            } else if (this.f16478b.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public C7371b(byte[] bArr) throws IOException {
            this((InputStream) new ByteArrayInputStream(bArr));
        }
    }

    /* renamed from: n1.a$d */
    public static class C7373d {

        /* renamed from: a */
        public final int f16485a;

        /* renamed from: b */
        public final String f16486b;

        /* renamed from: c */
        public final int f16487c;

        /* renamed from: d */
        public final int f16488d;

        public C7373d(String str, int i, int i2) {
            this.f16486b = str;
            this.f16485a = i;
            this.f16487c = i2;
            this.f16488d = -1;
        }

        public C7373d(String str, int i) {
            this.f16486b = str;
            this.f16485a = i;
            this.f16487c = 3;
            this.f16488d = 4;
        }
    }

    public C7369a(InputStream inputStream) throws IOException {
        boolean z;
        C7373d[][] dVarArr = f16439J;
        this.f16465e = new HashMap[dVarArr.length];
        this.f16466f = new HashSet(dVarArr.length);
        if (inputStream != null) {
            this.f16461a = null;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f16463c = (AssetManager.AssetInputStream) inputStream;
                this.f16462b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    try {
                        Os.lseek(fileInputStream.getFD(), 0, OsConstants.SEEK_CUR);
                        z = true;
                    } catch (Exception unused) {
                        if (f16448n) {
                            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                        }
                        z = false;
                    }
                    if (z) {
                        this.f16463c = null;
                        this.f16462b = fileInputStream.getFD();
                    }
                }
                this.f16463c = null;
                this.f16462b = null;
            }
            mo19679q(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
