package com.google.android.play.core.appupdate;

import android.app.NotificationChannel;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.session.C0087d;
import androidx.activity.C0114h;
import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0391c;
import androidx.compose.animation.C0472h;
import androidx.compose.p015ui.graphics.C1514d;
import androidx.compose.p015ui.graphics.C1532l0;
import androidx.compose.p015ui.graphics.C1533m;
import androidx.compose.p015ui.graphics.C1535n;
import androidx.compose.p015ui.graphics.C1604x;
import androidx.compose.p015ui.input.pointer.C1644p;
import androidx.compose.p015ui.node.LayoutNode;
import androidx.compose.p015ui.text.font.C1959m;
import androidx.compose.p015ui.text.font.C1960n;
import androidx.compose.p015ui.text.font.C1967s;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONArray;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.C6236a;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.C6246c;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.C6247d;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.C6248e;
import com.etsy.android.R;
import com.etsy.android.lib.conversation.MessageDraft;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.SettingsKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.YouKey;
import com.facebook.internal.FeatureManager;
import com.fasterxml.jackson.core.p333io.NumberInput;
import com.google.android.gms.internal.measurement.C14720l8;
import com.google.android.gms.measurement.internal.C14941c2;
import com.google.android.gms.measurement.internal.C14950d2;
import com.google.android.gms.measurement.internal.C14959e2;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.gson.internal.C16790g;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.C19394m;
import kotlin.collections.C19294b0;
import kotlin.collections.C19318k;
import kotlin.collections.C19323p;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.SegmentedByteString;
import p174m0.C7290i;
import p199o6.C7621b;
import p223r5.C7759g0;
import p244t5.C7959a;
import p280x0.C8285c;
import p285x5.C8323b;
import p288y.C8343c;
import p288y.C8347f;
import p343ee.C12693a;
import p365hg.C12869i0;
import p401mg.C13080a;
import p408ng.C13115a;
import p408ng.C13116b;
import p408ng.C13117c;
import p408ng.C13118d;
import p453tf.C13418j;
import p453tf.C13442y;
import p461uf.C13511h;
import p568fn.C17782b;
import p628nj.C18263b;
import p634np.C18290b;
import p753kq.C19857l;

/* renamed from: com.google.android.play.core.appupdate.d */
public final class C15562d implements C18290b, C1967s, C14941c2, C16790g, C12693a, FeatureManager.C12256a {

    /* renamed from: b */
    public static C15563e f35017b;

    /* renamed from: c */
    public static String[] f35018c;

    /* renamed from: d */
    public static final C15562d f35019d = new C15562d();

    /* renamed from: e */
    public static final /* synthetic */ C15562d f35020e = new C15562d();

    /* renamed from: f */
    public static C15562d f35021f;

    /* renamed from: g */
    public static final C15562d f35022g = new C15562d();

    /* renamed from: h */
    public static final int[] f35023h = {R.attr.appTheme, R.attr.environment, R.attr.fragmentMode, R.attr.fragmentStyle};

    /* renamed from: i */
    public static final int[] f35024i = {R.attr.buyButtonAppearance, R.attr.buyButtonHeight, R.attr.buyButtonText, R.attr.buyButtonWidth, R.attr.maskedWalletDetailsBackground, R.attr.maskedWalletDetailsButtonBackground, R.attr.maskedWalletDetailsButtonTextAppearance, R.attr.maskedWalletDetailsHeaderTextAppearance, R.attr.maskedWalletDetailsLogoImageType, R.attr.maskedWalletDetailsLogoTextColor, R.attr.maskedWalletDetailsTextAppearance};

    /* renamed from: j */
    public static final int[] f35025j = {16842755, 16842960, 16842961};

    /* renamed from: k */
    public static final int[] f35026k = {16842755, 16842961};

    /* renamed from: l */
    public static final long[] f35027l = {3161836309350906777L, -7642453882179322845L, -3821226941089661423L, 7312758566309945096L, -556661012383879292L, 8945041530681231562L, -4750851271514160027L, 6847946401097695794L, 541669439031730457L};

    public /* synthetic */ C15562d() {
    }

    /* renamed from: A */
    public static C6236a m25163A(JSONObject jSONObject) {
        return C6236a.m12482a((String) C19382n.m32756l(jSONObject, "alg", String.class));
    }

    /* renamed from: B */
    public static void m25164B(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        m25177O(jArr, m25196h(jArr2), jArr4);
        m25202r(jArr4, jArr3);
    }

    /* renamed from: C */
    public static final void m25165C(Bundle bundle, String str, LinkedHashMap linkedHashMap) {
        String str2;
        C19383o.m32797g(bundle, "<this>");
        Set<String> keySet = bundle.keySet();
        C19383o.m32796f(keySet, "keySet()");
        for (String str3 : keySet) {
            Object obj = bundle.get(str3);
            if (obj instanceof Object[]) {
                C19383o.m32796f(str3, "key");
                linkedHashMap.put(str3, C19318k.m32616h1((Object[]) obj, (String) null, (C19857l) null, 63));
            } else if (obj instanceof Bundle) {
                C19383o.m32796f(str3, "key");
                m25165C((Bundle) obj, str3, linkedHashMap);
            } else {
                String i = C0326j.m864i(str, str3);
                if (obj == null || (str2 = obj.toString()) == null) {
                    str2 = "null";
                }
                linkedHashMap.put(i, str2);
            }
        }
    }

    /* renamed from: D */
    public static String m25166D(JSONObject jSONObject) {
        return (String) C19382n.m32756l(jSONObject, "kid", String.class);
    }

    /* renamed from: E */
    public static void m25167E(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[18];
        m25172J(jArr, jArr3);
        m25202r(jArr3, jArr2);
    }

    /* renamed from: F */
    public static void m25168F(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        m25177O(jArr, m25196h(jArr2), jArr4);
        for (int i = 0; i < 18; i++) {
            jArr3[i] = jArr3[i] ^ jArr4[i];
        }
    }

    /* renamed from: G */
    public static final boolean m25169G(NotificationChannel notificationChannel) {
        C19383o.m32797g(notificationChannel, "<this>");
        return notificationChannel.getImportance() != 0;
    }

    /* renamed from: H */
    public static String m25170H(ByteString byteString) {
        StringBuilder sb = new StringBuilder(byteString.size());
        for (int i = 0; i < byteString.size(); i++) {
            byte byteAt = byteString.byteAt(i);
            if (byteAt == 34) {
                sb.append("\\\"");
            } else if (byteAt == 39) {
                sb.append("\\'");
            } else if (byteAt != 92) {
                switch (byteAt) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (byteAt >= 32 && byteAt <= 126) {
                            sb.append((char) byteAt);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((byteAt >>> 6) & 3) + 48));
                            sb.append((char) (((byteAt >>> 3) & 7) + 48));
                            sb.append((char) ((byteAt & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* renamed from: I */
    public static void m25171I(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        m25177O(jArr, jArr2, jArr4);
        m25202r(jArr4, jArr3);
    }

    /* renamed from: J */
    public static void m25172J(long[] jArr, long[] jArr2) {
        for (int i = 0; i < 9; i++) {
            C0114h.m331z(jArr2, i << 1, jArr[i]);
        }
    }

    /* renamed from: K */
    public static String m25173K(Context context) {
        Class<C13511h> cls = C13511h.class;
        C13511h.f29567i.getClass();
        if (C13511h.m21276a() == null) {
            synchronized (C13511h.m21278c()) {
                if (C13511h.m21276a() == null) {
                    String string = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", (String) null);
                    if (!C13080a.m20762b(cls)) {
                        try {
                            C13511h.f29565g = string;
                        } catch (Throwable th) {
                            C13080a.m20761a(cls, th);
                        }
                    }
                    if (C13511h.m21276a() == null) {
                        String str = "XZ" + UUID.randomUUID().toString();
                        if (!C13080a.m20762b(cls)) {
                            try {
                                C13511h.f29565g = str;
                            } catch (Throwable th2) {
                                C13080a.m20761a(cls, th2);
                            }
                        }
                        context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", C13511h.m21276a()).apply();
                    }
                }
                C19394m mVar = C19394m.f43287a;
            }
        }
        String a = C13511h.m21276a();
        if (a != null) {
            return a;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: L */
    public static final Long m25174L(Bundle bundle) {
        C19383o.m32797g(bundle, "<this>");
        Object obj = bundle.get("shop_id");
        if (obj instanceof Long) {
            if (!(((Number) obj).longValue() > 0)) {
                obj = null;
            }
            return (Long) obj;
        } else if (obj instanceof EtsyId) {
            return Long.valueOf(((EtsyId) obj).getIdAsLong());
        } else {
            return null;
        }
    }

    /* renamed from: M */
    public static final Long m25175M(Bundle bundle, String str) {
        C19383o.m32797g(bundle, "<this>");
        if (bundle.containsKey(str)) {
            return Long.valueOf(bundle.getLong(str));
        }
        return null;
    }

    /* renamed from: N */
    public static LinkedList m25176N(JSONObject jSONObject) {
        LinkedList v = C0114h.m323v((JSONArray) C19382n.m32756l(jSONObject, "x5c", JSONArray.class));
        if (v == null || !v.isEmpty()) {
            return v;
        }
        return null;
    }

    /* renamed from: O */
    public static void m25177O(long[] jArr, long[] jArr2, long[] jArr3) {
        int i = 56;
        while (true) {
            long j = 0;
            if (i < 0) {
                break;
            }
            for (int i2 = 1; i2 < 9; i2 += 2) {
                int i3 = (int) (jArr[i2] >>> i);
                int i4 = (i3 & 15) * 9;
                int i5 = (((i3 >>> 4) & 15) + 16) * 9;
                int i6 = i2 - 1;
                for (int i7 = 0; i7 < 9; i7++) {
                    int i8 = i6 + i7;
                    jArr3[i8] = jArr3[i8] ^ (jArr2[i4 + i7] ^ jArr2[i5 + i7]);
                }
            }
            int i9 = 0;
            while (i9 < 16) {
                int i10 = 0 + i9;
                long j2 = jArr3[i10];
                jArr3[i10] = (j >>> -8) | (j2 << 8);
                i9++;
                j = j2;
            }
            i -= 8;
        }
        for (int i11 = 56; i11 >= 0; i11 -= 8) {
            for (int i12 = 0; i12 < 9; i12 += 2) {
                int i13 = (int) (jArr[i12] >>> i11);
                int i14 = (i13 & 15) * 9;
                int i15 = (((i13 >>> 4) & 15) + 16) * 9;
                for (int i16 = 0; i16 < 9; i16++) {
                    int i17 = i12 + i16;
                    jArr3[i17] = jArr3[i17] ^ (jArr2[i14 + i16] ^ jArr2[i15 + i16]);
                }
            }
            if (i11 > 0) {
                long j3 = 0;
                int i18 = 0;
                while (i18 < 18) {
                    int i19 = 0 + i18;
                    long j4 = jArr3[i19];
                    jArr3[i19] = (j3 >>> -8) | (j4 << 8);
                    i18++;
                    j3 = j4;
                }
            }
        }
    }

    /* renamed from: P */
    public static boolean m25178P(double d) {
        return Math.getExponent(d) <= 1023;
    }

    /* renamed from: Q */
    public static final boolean m25179Q(C1644p pVar, long j) {
        C19383o.m32797g(pVar, "$this$isOutOfBounds");
        long j2 = pVar.f3658c;
        float c = C8343c.m16642c(j2);
        float d = C8343c.m16643d(j2);
        return c < 0.0f || c > ((float) ((int) (j >> 32))) || d < 0.0f || d > ((float) C7290i.m13995b(j));
    }

    /* renamed from: R */
    public static final boolean m25180R(C1644p pVar, long j, long j2) {
        C19383o.m32797g(pVar, "$this$isOutOfBounds");
        if (!(pVar.f3663h == 1)) {
            return m25179Q(pVar, j);
        }
        long j3 = pVar.f3658c;
        float c = C8343c.m16642c(j3);
        float d = C8343c.m16643d(j3);
        return c < (-C8347f.m16656d(j2)) || c > C8347f.m16656d(j2) + ((float) ((int) (j >> 32))) || d < (-C8347f.m16654b(j2)) || d > C8347f.m16654b(j2) + ((float) C7290i.m13995b(j));
    }

    /* renamed from: S */
    public static final C1533m m25181S(C8285c cVar) {
        Shader shader = cVar.f18156a;
        boolean z = true;
        if (!(shader != null) && cVar.f18158c == 0) {
            z = false;
        }
        if (z) {
            return shader != null ? new C1535n(shader) : new C1532l0(C18263b.m30834b(cVar.f18158c));
        }
        return null;
    }

    /* renamed from: T */
    public static final int m25182T(String str) {
        if (C18263b.m30839d0(str)) {
            if (str.charAt(0) != '#') {
                str = '#' + str;
            }
            try {
                return Color.parseColor(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return -1;
    }

    /* renamed from: U */
    public static final long m25183U(C1644p pVar) {
        C19383o.m32797g(pVar, "<this>");
        return m25184V(pVar, false);
    }

    /* renamed from: V */
    public static final long m25184V(C1644p pVar, boolean z) {
        long e = C8343c.m16644e(pVar.f3658c, pVar.f3661f);
        if (z || !pVar.mo6615b()) {
            return e;
        }
        int i = C8343c.f18298e;
        return C8343c.f18295b;
    }

    /* renamed from: W */
    public static final int m25185W(SegmentedByteString segmentedByteString, int i) {
        int i2;
        C19383o.m32797g(segmentedByteString, "$this$segment");
        int[] directory$okio = segmentedByteString.getDirectory$okio();
        int i3 = i + 1;
        int length = segmentedByteString.getSegments$okio().length;
        C19383o.m32797g(directory$okio, "$this$binarySearch");
        int i4 = length - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = directory$okio[i2];
                if (i6 >= i3) {
                    if (i6 <= i3) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = (-i5) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : ~i2;
    }

    /* renamed from: X */
    public static final Bitmap.Config m25186X(int i) {
        boolean z = false;
        if (i == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i == 2) {
            return Bitmap.Config.RGB_565;
        }
        if (i == 3) {
            return Bitmap.Config.RGBA_F16;
        }
        if (i == 4) {
            z = true;
        }
        return z ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    /* renamed from: Y */
    public static final Map m25187Y(Bundle bundle) {
        if (bundle == null) {
            return C19294b0.m32559p0();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> keySet = bundle.keySet();
        C19383o.m32796f(keySet, "keySet()");
        for (String str : keySet) {
            String string = bundle.getString(str);
            if (string != null) {
                C19383o.m32796f(str, "key");
                linkedHashMap.put(str, string);
            }
        }
        return C19294b0.m32568y0(linkedHashMap);
    }

    /* renamed from: Z */
    public static String m25188Z(String str, String str2) {
        return C0070b.m184f(new StringBuilder(str.length() + 1 + String.valueOf(str2).length()), str, MessageDraft.IMAGE_DELIMITER, str2);
    }

    /* renamed from: a */
    public static C6247d m25189a(JSONObject jSONObject) {
        try {
            return C6247d.m12528a((String) C19382n.m32756l(jSONObject, "kty", String.class));
        } catch (IllegalArgumentException e) {
            throw new ParseException(e.getMessage(), 0);
        }
    }

    /* renamed from: a0 */
    public static String m25190a0(String str, String str2, String str3) {
        int length = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(str.length() + 2 + length + String.valueOf(str3).length());
        C0391c.m1061h(sb, str, MessageDraft.IMAGE_DELIMITER, str2, MessageDraft.IMAGE_DELIMITER);
        sb.append(str3);
        return sb.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0078 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* renamed from: b0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m25191b0(int r6, int r7, byte[] r8) {
        /*
        L_0x0000:
            if (r6 >= r7) goto L_0x0009
            byte r0 = r8[r6]
            if (r0 < 0) goto L_0x0009
            int r6 = r6 + 1
            goto L_0x0000
        L_0x0009:
            r0 = 0
            if (r6 < r7) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            if (r6 < r7) goto L_0x0012
        L_0x000f:
            r6 = r0
            goto L_0x0076
        L_0x0012:
            int r1 = r6 + 1
            byte r6 = r8[r6]
            if (r6 >= 0) goto L_0x007a
            r2 = -32
            r3 = -65
            if (r6 >= r2) goto L_0x002b
            if (r1 >= r7) goto L_0x0076
            r2 = -62
            if (r6 < r2) goto L_0x0075
            int r6 = r1 + 1
            byte r1 = r8[r1]
            if (r1 <= r3) goto L_0x000d
            goto L_0x0075
        L_0x002b:
            r4 = -16
            if (r6 >= r4) goto L_0x0051
            int r4 = r7 + -1
            if (r1 < r4) goto L_0x0038
            int r6 = com.google.android.gms.internal.measurement.C14881y7.m24177a(r1, r7, r8)
            goto L_0x0076
        L_0x0038:
            int r4 = r1 + 1
            byte r1 = r8[r1]
            if (r1 > r3) goto L_0x0075
            r5 = -96
            if (r6 != r2) goto L_0x0044
            if (r1 < r5) goto L_0x0075
        L_0x0044:
            r2 = -19
            if (r6 != r2) goto L_0x004a
            if (r1 >= r5) goto L_0x0075
        L_0x004a:
            int r6 = r4 + 1
            byte r1 = r8[r4]
            if (r1 <= r3) goto L_0x000d
            goto L_0x0075
        L_0x0051:
            int r2 = r7 + -2
            if (r1 < r2) goto L_0x005a
            int r6 = com.google.android.gms.internal.measurement.C14881y7.m24177a(r1, r7, r8)
            goto L_0x0076
        L_0x005a:
            int r2 = r1 + 1
            byte r1 = r8[r1]
            if (r1 > r3) goto L_0x0075
            int r6 = r6 << 28
            int r1 = r1 + 112
            int r1 = r1 + r6
            int r6 = r1 >> 30
            if (r6 != 0) goto L_0x0075
            int r6 = r2 + 1
            byte r1 = r8[r2]
            if (r1 > r3) goto L_0x0075
            int r1 = r6 + 1
            byte r6 = r8[r6]
            if (r6 <= r3) goto L_0x007a
        L_0x0075:
            r6 = -1
        L_0x0076:
            if (r6 != 0) goto L_0x0079
            r0 = 1
        L_0x0079:
            return r0
        L_0x007a:
            r6 = r1
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.C15562d.m25191b0(int, int, byte[]):boolean");
    }

    /* renamed from: c */
    public static C7621b m25192c(String str) {
        C7959a aVar = (C7959a) C8323b.f18267a.get(str);
        C7759g0 g0Var = aVar != null ? (C7759g0) C8323b.f18268b.get(aVar) : null;
        if (g0Var == null) {
            try {
                g0Var = (C7759g0) C8323b.f18268b.get(new C7959a(str));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        if (g0Var == null) {
            return null;
        }
        return new C7621b(str, g0Var.f17188f, g0Var.f17190h, g0Var.f17191i, g0Var.f17192j, g0Var.mo20320b());
    }

    /* renamed from: d */
    public static void m25193d(long[] jArr, int i) {
        int i2 = i + 8;
        long j = jArr[i2];
        long j2 = j >>> 59;
        jArr[i] = ((j2 << 10) ^ (((j2 << 2) ^ j2) ^ (j2 << 5))) ^ jArr[i];
        jArr[i2] = j & 576460752303423487L;
    }

    /* renamed from: e */
    public static void m25194e(long[] jArr, int i, long[] jArr2) {
        long[] jArr3 = new long[18];
        m25172J(jArr, jArr3);
        while (true) {
            m25202r(jArr3, jArr2);
            i--;
            if (i > 0) {
                m25172J(jArr2, jArr3);
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public static void m25195g(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 9; i++) {
            jArr3[i] = jArr[i] ^ jArr2[i];
        }
    }

    /* renamed from: h */
    public static long[] m25196h(long[] jArr) {
        long j;
        long[] jArr2 = new long[288];
        System.arraycopy(jArr, 0, jArr2, 9, 9);
        int i = 7;
        int i2 = 0;
        while (true) {
            j = 0;
            if (i <= 0) {
                break;
            }
            i2 += 18;
            int i3 = i2 >>> 1;
            int i4 = 0;
            while (i4 < 9) {
                long j2 = jArr2[i3 + i4];
                jArr2[i2 + i4] = (j >>> 63) | (j2 << 1);
                i4++;
                j = j2;
            }
            m25193d(jArr2, i2);
            int i5 = i2 + 9;
            for (int i6 = 0; i6 < 9; i6++) {
                jArr2[i5 + i6] = jArr2[9 + i6] ^ jArr2[i2 + i6];
            }
            i--;
        }
        int i7 = 0;
        while (i7 < 144) {
            long j3 = jArr2[0 + i7];
            jArr2[144 + i7] = (j >>> -4) | (j3 << 4);
            i7++;
            j = j3;
        }
        return jArr2;
    }

    /* renamed from: j */
    public static final Bitmap m25197j(C1604x xVar) {
        C19383o.m32797g(xVar, "<this>");
        if (xVar instanceof C1514d) {
            return ((C1514d) xVar).f3287a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    /* renamed from: l */
    public static C6248e m25198l(JSONObject jSONObject) {
        return C6248e.m12530a((String) C19382n.m32756l(jSONObject, "use", String.class));
    }

    /* renamed from: m */
    public static void m25199m(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 9; i++) {
            jArr3[i] = jArr3[i] ^ (jArr[i] ^ jArr2[i]);
        }
    }

    /* renamed from: p */
    public static ArrayList m25200p(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) (((bArr[11] & 255) << 8) | (bArr[10] & 255))) * NumberInput.L_BILLION) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000).array());
        return arrayList;
    }

    /* renamed from: q */
    public static Set m25201q(JSONObject jSONObject) {
        return C6246c.m12526a(C19382n.m32750h0(jSONObject, "key_ops"));
    }

    /* renamed from: r */
    public static void m25202r(long[] jArr, long[] jArr2) {
        long j = jArr[9];
        long j2 = jArr[17];
        long j3 = (((j ^ (j2 >>> 59)) ^ (j2 >>> 57)) ^ (j2 >>> 54)) ^ (j2 >>> 49);
        long j4 = (j2 << 15) ^ (((jArr[8] ^ (j2 << 5)) ^ (j2 << 7)) ^ (j2 << 10));
        for (int i = 16; i >= 10; i--) {
            long j5 = jArr[i];
            jArr2[i - 8] = (((j4 ^ (j5 >>> 59)) ^ (j5 >>> 57)) ^ (j5 >>> 54)) ^ (j5 >>> 49);
            j4 = (((jArr[i - 9] ^ (j5 << 5)) ^ (j5 << 7)) ^ (j5 << 10)) ^ (j5 << 15);
        }
        jArr2[1] = (((j4 ^ (j3 >>> 59)) ^ (j3 >>> 57)) ^ (j3 >>> 54)) ^ (j3 >>> 49);
        long j6 = (j3 << 15) ^ (((jArr[0] ^ (j3 << 5)) ^ (j3 << 7)) ^ (j3 << 10));
        long j7 = jArr2[8];
        long j8 = j7 >>> 59;
        jArr2[0] = (((j6 ^ j8) ^ (j8 << 2)) ^ (j8 << 5)) ^ (j8 << 10);
        jArr2[8] = 576460752303423487L & j7;
    }

    /* renamed from: s */
    public static final boolean m25203s(C1644p pVar) {
        C19383o.m32797g(pVar, "<this>");
        return !pVar.mo6615b() && !pVar.f3662g && pVar.f3659d;
    }

    /* renamed from: t */
    public static final boolean m25204t(C1644p pVar) {
        C19383o.m32797g(pVar, "<this>");
        return !pVar.f3662g && pVar.f3659d;
    }

    /* renamed from: u */
    public static final boolean m25205u(C1644p pVar) {
        C19383o.m32797g(pVar, "<this>");
        return !pVar.mo6615b() && pVar.f3662g && !pVar.f3659d;
    }

    /* renamed from: v */
    public static final boolean m25206v(C1644p pVar) {
        C19383o.m32797g(pVar, "<this>");
        return pVar.f3662g && !pVar.f3659d;
    }

    /* renamed from: w */
    public static final void m25207w(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(C0087d.m235e("index: ", i, ", size: ", i2));
        }
    }

    /* renamed from: x */
    public static final void m25208x(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(C0087d.m235e("index: ", i, ", size: ", i2));
        }
    }

    /* renamed from: y */
    public static final void m25209y(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder g = C0472h.m1244g("fromIndex: ", i, ", toIndex: ", i2, ", size: ");
            g.append(i3);
            throw new IndexOutOfBoundsException(g.toString());
        } else if (i > i2) {
            throw new IllegalArgumentException(C0087d.m235e("fromIndex: ", i, " > toIndex: ", i2));
        }
    }

    /* renamed from: z */
    public static Typeface m25210z(String str, C1959m mVar, int i) {
        boolean z = true;
        if ((i == 0) && C19383o.m32792b(mVar, C1959m.f4413g)) {
            if (str == null || str.length() == 0) {
                Typeface typeface = Typeface.DEFAULT;
                C19383o.m32796f(typeface, "DEFAULT");
                return typeface;
            }
        }
        int b0 = C0114h.m297b0(mVar, i);
        if (!(str == null || str.length() == 0)) {
            z = false;
        }
        if (z) {
            Typeface defaultFromStyle = Typeface.defaultFromStyle(b0);
            C19383o.m32796f(defaultFromStyle, "{\n            Typeface.d…le(targetStyle)\n        }");
            return defaultFromStyle;
        }
        Typeface create = Typeface.create(str, b0);
        C19383o.m32796f(create, "{\n            Typeface.c…y, targetStyle)\n        }");
        return create;
    }

    /* renamed from: b */
    public Typeface mo13b(C1960n nVar, C1959m mVar, int i) {
        C19383o.m32797g(nVar, "name");
        C19383o.m32797g(mVar, "fontWeight");
        String str = nVar.f4418c;
        C19383o.m32797g(str, "name");
        int i2 = mVar.f4417b / 100;
        boolean z = false;
        if (i2 >= 0 && i2 < 2) {
            str = C0326j.m864i(str, "-thin");
        } else {
            if (2 <= i2 && i2 < 4) {
                str = C0326j.m864i(str, "-light");
            } else if (i2 != 4) {
                if (i2 == 5) {
                    str = C0326j.m864i(str, "-medium");
                } else {
                    if (!(6 <= i2 && i2 < 8)) {
                        if (8 <= i2 && i2 < 11) {
                            str = C0326j.m864i(str, "-black");
                        }
                    }
                }
            }
        }
        Typeface typeface = null;
        if (!(str.length() == 0)) {
            Typeface z2 = m25210z(str, mVar, i);
            if (!C19383o.m32792b(z2, Typeface.create(Typeface.DEFAULT, C0114h.m297b0(mVar, i))) && !C19383o.m32792b(z2, m25210z((String) null, mVar, i))) {
                z = true;
            }
            if (z) {
                typeface = z2;
            }
        }
        return typeface == null ? m25210z(nVar.f4418c, mVar, i) : typeface;
    }

    /* renamed from: f */
    public Typeface mo17f(C1959m mVar, int i) {
        C19383o.m32797g(mVar, "fontWeight");
        return m25210z((String) null, mVar, i);
    }

    /* renamed from: i */
    public Object mo1134i() {
        return new LinkedHashSet();
    }

    /* renamed from: k */
    public ArrayList mo19k(FragmentNavigationKey fragmentNavigationKey, boolean z) {
        C19383o.m32797g(fragmentNavigationKey, "key");
        ArrayList arrayList = new ArrayList();
        if (!z) {
            arrayList.add(new YouKey(fragmentNavigationKey.getReferrer(), (Bundle) null, (String) null, 6, (DefaultConstructorMarker) null));
            arrayList.add(new SettingsKey(fragmentNavigationKey.getReferrer()));
        }
        arrayList.add(fragmentNavigationKey);
        return arrayList;
    }

    /* renamed from: n */
    public void mo20n(boolean z) {
        File[] fileArr;
        if (z) {
            String str = C13418j.f29381a;
            if (C13442y.m21140c() && !C12869i0.m20587z()) {
                File X = C17782b.m29858X();
                int i = 0;
                if (X != null) {
                    fileArr = X.listFiles(C13116b.f28841a);
                    C19383o.m32796f(fileArr, "reportDir.listFiles { di…OR_REPORT_PREFIX)))\n    }");
                } else {
                    fileArr = new File[0];
                }
                ArrayList arrayList = new ArrayList();
                for (File aVar : fileArr) {
                    C13115a aVar2 = new C13115a(aVar);
                    if ((aVar2.f28839b == null || aVar2.f28840c == null) ? false : true) {
                        arrayList.add(aVar2);
                    }
                }
                C19323p.m32627I0(arrayList, C13117c.f28842b);
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                while (i < arrayList.size() && i < 1000) {
                    jSONArray.put(arrayList.get(i));
                    i++;
                }
                C17782b.m29873l0("error_reports", jSONArray, new C13118d(arrayList));
            }
        }
    }

    /* renamed from: o */
    public int mo21o() {
        return R.id.menu_bottom_nav_you;
    }

    public Object zza() {
        List<C14950d2<?>> list = C14959e2.f33393a;
        return Long.valueOf(C14720l8.f32933c.zza().mo50691g());
    }

    public /* synthetic */ C15562d(LayoutNode layoutNode) {
        C19383o.m32797g(layoutNode, "node");
    }
}
