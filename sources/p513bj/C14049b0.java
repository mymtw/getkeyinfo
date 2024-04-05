package p513bj;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.compose.animation.C0391c;
import androidx.core.widget.NestedScrollView;
import com.google.common.base.C15781b;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.apache.commons.cli.HelpFormatter;
import p001a0.C0005b;
import p003a2.C0015b;
import p218q8.C7728a;
import p505aj.C13999g;

/* renamed from: bj.b0 */
public final class C14049b0 {

    /* renamed from: a */
    public static final int f30913a;

    /* renamed from: b */
    public static final String f30914b;

    /* renamed from: c */
    public static final String f30915c;

    /* renamed from: d */
    public static final String f30916d;

    /* renamed from: e */
    public static final String f30917e;

    /* renamed from: f */
    public static final byte[] f30918f = new byte[0];

    /* renamed from: g */
    public static final Pattern f30919g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");

    /* renamed from: h */
    public static final Pattern f30920h = Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");

    /* renamed from: i */
    public static HashMap<String, String> f30921i;

    /* renamed from: j */
    public static final String[] f30922j = {"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};

    /* renamed from: k */
    public static final String[] f30923k = {"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};

    /* renamed from: l */
    public static final int[] f30924l = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};

    /* renamed from: m */
    public static final int[] f30925m = {0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, NestedScrollView.ANIMATED_SCROLL_GAP, 253, 244, 243};

    static {
        String str = Build.VERSION.CODENAME;
        int i = "S".equals(str) ? 31 : "R".equals(str) ? 30 : Build.VERSION.SDK_INT;
        f30913a = i;
        String str2 = Build.DEVICE;
        f30914b = str2;
        String str3 = Build.MANUFACTURER;
        f30915c = str3;
        String str4 = Build.MODEL;
        f30916d = str4;
        StringBuilder k = C0015b.m92k(C0391c.m1055a(str3, C0391c.m1055a(str4, C0391c.m1055a(str2, 17))), str2, ", ", str4, ", ");
        k.append(str3);
        k.append(", ");
        k.append(i);
        f30917e = k.toString();
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
    }

    /* renamed from: A */
    public static boolean m21620A(C14077r rVar, C14077r rVar2, Inflater inflater) {
        int i = rVar.f30988c - rVar.f30987b;
        if (i <= 0) {
            return false;
        }
        if (rVar2.f30986a.length < i) {
            rVar2.mo46910a(i * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        byte[] bArr = rVar.f30986a;
        int i2 = rVar.f30987b;
        inflater.setInput(bArr, i2, rVar.f30988c - i2);
        int i3 = 0;
        while (true) {
            try {
                byte[] bArr2 = rVar2.f30986a;
                i3 += inflater.inflate(bArr2, i3, bArr2.length - i3);
                if (inflater.finished()) {
                    rVar2.mo46934y(i3);
                    inflater.reset();
                    return true;
                } else if (inflater.needsDictionary()) {
                    break;
                } else if (inflater.needsInput()) {
                    break;
                } else {
                    byte[] bArr3 = rVar2.f30986a;
                    if (i3 == bArr3.length) {
                        rVar2.mo46910a(bArr3.length * 2);
                    }
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    /* renamed from: B */
    public static boolean m21621B(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4;
    }

    /* renamed from: C */
    public static String m21622C(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String q0 = C0005b.m56q0(str);
        int i = 0;
        String str2 = q0.split(HelpFormatter.DEFAULT_OPT_PREFIX, 2)[0];
        if (f30921i == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            HashMap<String, String> hashMap = new HashMap<>(iSOLanguages.length + f30922j.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            int i2 = 0;
            while (true) {
                String[] strArr = f30922j;
                if (i2 >= strArr.length) {
                    break;
                }
                hashMap.put(strArr[i2], strArr[i2 + 1]);
                i2 += 2;
            }
            f30921i = hashMap;
        }
        String str4 = f30921i.get(str2);
        if (str4 != null) {
            String valueOf = String.valueOf(q0.substring(str2.length()));
            q0 = valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4);
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return q0;
        }
        while (true) {
            String[] strArr2 = f30923k;
            if (i >= strArr2.length) {
                return q0;
            }
            if (q0.startsWith(strArr2[i])) {
                String valueOf2 = String.valueOf(strArr2[i + 1]);
                String valueOf3 = String.valueOf(q0.substring(strArr2[i].length()));
                return valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2);
            }
            i += 2;
        }
    }

    /* renamed from: D */
    public static Object[] m21623D(int i, Object[] objArr) {
        C14075p.m21691c(i <= objArr.length);
        return Arrays.copyOf(objArr, i);
    }

    /* renamed from: E */
    public static void m21624E(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    /* renamed from: F */
    public static long m21625F(long j, long j2, long j3) {
        int i = (j3 > j2 ? 1 : (j3 == j2 ? 0 : -1));
        if (i >= 0 && j3 % j2 == 0) {
            return j / (j3 / j2);
        }
        if (i < 0 && j2 % j3 == 0) {
            return (j2 / j3) * j;
        }
        return (long) (((double) j) * (((double) j2) / ((double) j3)));
    }

    /* renamed from: G */
    public static void m21626G(long[] jArr, long j) {
        int i = (j > 1000000 ? 1 : (j == 1000000 ? 0 : -1));
        int i2 = 0;
        if (i >= 0 && j % 1000000 == 0) {
            long j2 = j / 1000000;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] / j2;
                i2++;
            }
        } else if (i >= 0 || 1000000 % j != 0) {
            double d = ((double) 1000000) / ((double) j);
            while (i2 < jArr.length) {
                jArr[i2] = (long) (((double) jArr[i2]) * d);
                i2++;
            }
        } else {
            long j3 = 1000000 / j;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] * j3;
                i2++;
            }
        }
    }

    /* renamed from: H */
    public static String[] m21627H(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
    }

    /* renamed from: a */
    public static boolean m21628a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0019  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m21629b(long[] r3, long r4, boolean r6) {
        /*
            int r0 = java.util.Arrays.binarySearch(r3, r4)
            if (r0 >= 0) goto L_0x0008
            int r3 = ~r0
            goto L_0x001a
        L_0x0008:
            int r0 = r0 + 1
            int r1 = r3.length
            if (r0 >= r1) goto L_0x0014
            r1 = r3[r0]
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0014
            goto L_0x0008
        L_0x0014:
            if (r6 == 0) goto L_0x0019
            int r3 = r0 + -1
            goto L_0x001a
        L_0x0019:
            r3 = r0
        L_0x001a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p513bj.C14049b0.m21629b(long[], long, boolean):int");
    }

    /* renamed from: c */
    public static int m21630c(List list, Long l, boolean z) {
        int i;
        int binarySearch = Collections.binarySearch(list, l);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0 || ((Comparable) list.get(binarySearch)).compareTo(l) != 0) {
                    i = binarySearch + 1;
                }
                binarySearch--;
                break;
            } while (((Comparable) list.get(binarySearch)).compareTo(l) != 0);
            i = binarySearch + 1;
        }
        return z ? Math.max(0, i) : i;
    }

    /* renamed from: d */
    public static int m21631d(C7728a aVar, long j) {
        int i = aVar.f17139a - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            if (aVar.mo20205b(i3) < j) {
                i2 = i3 + 1;
            } else {
                i = i3 - 1;
            }
        }
        int i4 = i + 1;
        if (i4 < aVar.f17139a && aVar.mo20205b(i4) == j) {
            return i4;
        }
        if (i == -1) {
            return 0;
        }
        return i;
    }

    /* renamed from: e */
    public static int m21632e(int[] iArr, int i) {
        int binarySearch = Arrays.binarySearch(iArr, i);
        if (binarySearch < 0) {
            return -(binarySearch + 2);
        }
        do {
            binarySearch--;
            if (binarySearch < 0 || iArr[binarySearch] != i) {
            }
            binarySearch--;
            break;
        } while (iArr[binarySearch] != i);
        return binarySearch;
    }

    /* renamed from: f */
    public static int m21633f(long[] jArr, long j, boolean z) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0 || jArr[binarySearch] != j) {
                    i = binarySearch + 1;
                }
                binarySearch--;
                break;
            } while (jArr[binarySearch] != j);
            i = binarySearch + 1;
        }
        return z ? Math.max(0, i) : i;
    }

    /* renamed from: g */
    public static void m21634g(C13999g gVar) {
        if (gVar != null) {
            try {
                gVar.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: h */
    public static float m21635h(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    /* renamed from: i */
    public static int m21636i(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    /* renamed from: j */
    public static long m21637j(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    /* renamed from: k */
    public static boolean m21638k(Object[] objArr, String str) {
        for (Object a : objArr) {
            if (m21628a(a, str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public static Handler m21639l(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        C14075p.m21696h(myLooper);
        return new Handler(myLooper, callback);
    }

    /* renamed from: m */
    public static String m21640m(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: n */
    public static String m21641n(int i, int i2, byte[] bArr) {
        return new String(bArr, i, i2, C15781b.f35562c);
    }

    /* renamed from: o */
    public static int m21642o(int i) {
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i2 = f30913a;
                return (i2 < 23 && i2 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    /* renamed from: p */
    public static int m21643p(int i, String str) {
        int i2 = 0;
        for (String d : m21627H(str)) {
            if (i == C14065m.m21678h(C14065m.m21674d(d))) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: q */
    public static String m21644q(int i, String str) {
        String[] H = m21627H(str);
        if (H.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : H) {
            if (i == C14065m.m21678h(C14065m.m21674d(str2))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    /* renamed from: r */
    public static long m21645r(long j, float f) {
        return f == 1.0f ? j : Math.round(((double) j) * ((double) f));
    }

    /* renamed from: s */
    public static int m21646s(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i != 24) {
            return i != 32 ? 0 : 805306368;
        }
        return 536870912;
    }

    /* renamed from: t */
    public static int m21647t(int i, int i2) {
        if (i != 2) {
            if (i == 3) {
                return i2;
            }
            if (i != 4) {
                if (i != 268435456) {
                    if (i == 536870912) {
                        return i2 * 3;
                    }
                    if (i != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i2 * 4;
        }
        return i2 * 2;
    }

    /* renamed from: u */
    public static long m21648u(long j, float f) {
        return f == 1.0f ? j : Math.round(((double) j) / ((double) f));
    }

    /* renamed from: v */
    public static int m21649v(int i) {
        if (i == 13) {
            return 1;
        }
        switch (i) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* renamed from: w */
    public static String m21650w(StringBuilder sb, Formatter formatter, long j) {
        if (j == -9223372036854775807L) {
            j = 0;
        }
        String str = j < 0 ? HelpFormatter.DEFAULT_OPT_PREFIX : "";
        long abs = (Math.abs(j) + 500) / 1000;
        long j2 = abs % 60;
        long j3 = (abs / 60) % 60;
        long j4 = abs / 3600;
        sb.setLength(0);
        if (j4 > 0) {
            return formatter.format("%s%d:%02d:%02d", new Object[]{str, Long.valueOf(j4), Long.valueOf(j3), Long.valueOf(j2)}).toString();
        }
        return formatter.format("%s%02d:%02d", new Object[]{str, Long.valueOf(j3), Long.valueOf(j2)}).toString();
    }

    /* renamed from: x */
    public static String m21651x(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Exception e) {
            C14075p.m21698j("Util", str.length() != 0 ? "Failed to read system property ".concat(str) : new String("Failed to read system property "), e);
            return null;
        }
    }

    /* renamed from: y */
    public static byte[] m21652y(String str) {
        return str.getBytes(C15781b.f35562c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007f, code lost:
        if (r10.contains("format=m3u8-aapl") != false) goto L_0x0081;
     */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m21653z(android.net.Uri r10, java.lang.String r11) {
        /*
            r0 = 4
            r1 = 3
            r2 = 2
            r3 = 0
            r4 = 1
            if (r11 != 0) goto L_0x0086
            java.lang.String r11 = r10.getScheme()
            if (r11 == 0) goto L_0x0040
            java.lang.String r5 = "rtsp"
            if (r5 != r11) goto L_0x0012
            goto L_0x003c
        L_0x0012:
            int r6 = r11.length()
            if (r0 == r6) goto L_0x0019
            goto L_0x003a
        L_0x0019:
            r6 = r3
        L_0x001a:
            if (r6 >= r0) goto L_0x003c
            char r7 = r5.charAt(r6)
            char r8 = r11.charAt(r6)
            if (r7 != r8) goto L_0x0027
            goto L_0x0037
        L_0x0027:
            r7 = r7 | 32
            int r7 = r7 + -97
            char r7 = (char) r7
            r9 = 26
            if (r7 >= r9) goto L_0x003a
            r8 = r8 | 32
            int r8 = r8 + -97
            char r8 = (char) r8
            if (r7 != r8) goto L_0x003a
        L_0x0037:
            int r6 = r6 + 1
            goto L_0x001a
        L_0x003a:
            r11 = r3
            goto L_0x003d
        L_0x003c:
            r11 = r4
        L_0x003d:
            if (r11 == 0) goto L_0x0040
            goto L_0x0085
        L_0x0040:
            java.lang.String r10 = r10.getPath()
            if (r10 != 0) goto L_0x0047
            goto L_0x0084
        L_0x0047:
            java.lang.String r10 = p001a0.C0005b.m56q0(r10)
            java.lang.String r11 = ".mpd"
            boolean r11 = r10.endsWith(r11)
            if (r11 == 0) goto L_0x0054
            goto L_0x0077
        L_0x0054:
            java.lang.String r11 = ".m3u8"
            boolean r11 = r10.endsWith(r11)
            if (r11 == 0) goto L_0x005d
            goto L_0x0081
        L_0x005d:
            java.util.regex.Pattern r11 = f30920h
            java.util.regex.Matcher r10 = r11.matcher(r10)
            boolean r11 = r10.matches()
            if (r11 == 0) goto L_0x0084
            java.lang.String r10 = r10.group(r2)
            if (r10 == 0) goto L_0x0083
            java.lang.String r11 = "format=mpd-time-csf"
            boolean r11 = r10.contains(r11)
            if (r11 == 0) goto L_0x0079
        L_0x0077:
            r0 = r3
            goto L_0x0084
        L_0x0079:
            java.lang.String r11 = "format=m3u8-aapl"
            boolean r10 = r10.contains(r11)
            if (r10 == 0) goto L_0x0083
        L_0x0081:
            r0 = r2
            goto L_0x0084
        L_0x0083:
            r0 = r4
        L_0x0084:
            r1 = r0
        L_0x0085:
            return r1
        L_0x0086:
            r10 = -1
            int r5 = r11.hashCode()
            switch(r5) {
                case -979127466: goto L_0x00b0;
                case -156749520: goto L_0x00a5;
                case 64194685: goto L_0x009a;
                case 1154777587: goto L_0x008f;
                default: goto L_0x008e;
            }
        L_0x008e:
            goto L_0x00ba
        L_0x008f:
            java.lang.String r5 = "application/x-rtsp"
            boolean r11 = r11.equals(r5)
            if (r11 != 0) goto L_0x0098
            goto L_0x00ba
        L_0x0098:
            r10 = r1
            goto L_0x00ba
        L_0x009a:
            java.lang.String r5 = "application/dash+xml"
            boolean r11 = r11.equals(r5)
            if (r11 != 0) goto L_0x00a3
            goto L_0x00ba
        L_0x00a3:
            r10 = r2
            goto L_0x00ba
        L_0x00a5:
            java.lang.String r5 = "application/vnd.ms-sstr+xml"
            boolean r11 = r11.equals(r5)
            if (r11 != 0) goto L_0x00ae
            goto L_0x00ba
        L_0x00ae:
            r10 = r4
            goto L_0x00ba
        L_0x00b0:
            java.lang.String r5 = "application/x-mpegURL"
            boolean r11 = r11.equals(r5)
            if (r11 != 0) goto L_0x00b9
            goto L_0x00ba
        L_0x00b9:
            r10 = r3
        L_0x00ba:
            switch(r10) {
                case 0: goto L_0x00c1;
                case 1: goto L_0x00c0;
                case 2: goto L_0x00bf;
                case 3: goto L_0x00be;
                default: goto L_0x00bd;
            }
        L_0x00bd:
            return r0
        L_0x00be:
            return r1
        L_0x00bf:
            return r3
        L_0x00c0:
            return r4
        L_0x00c1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p513bj.C14049b0.m21653z(android.net.Uri, java.lang.String):int");
    }
}
