package androidx.compose.material;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.session.C0087d;
import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0472h;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0718d;
import androidx.compose.foundation.layout.C0752o;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1432b;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.layout.AlignmentLineKt;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.C1859o0;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1295a1;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1345l1;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import p001a0.C0005b;
import p003a2.C0023f;
import p174m0.C7282b;
import p174m0.C7284d;
import p504ai.C13983i;
import p568fn.C17782b;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

public final class SnackbarKt {

    /* renamed from: a */
    public static final float f2267a = ((float) 30);

    /* renamed from: b */
    public static final float f2268b = ((float) 16);

    /* renamed from: c */
    public static final float f2269c;

    /* renamed from: d */
    public static final float f2270d = ((float) 2);

    /* renamed from: e */
    public static final float f2271e = ((float) 6);

    /* renamed from: f */
    public static final float f2272f;

    /* renamed from: g */
    public static final float f2273g = ((float) 12);

    /* renamed from: h */
    public static final float f2274h = ((float) 48);

    /* renamed from: i */
    public static final float f2275i = ((float) 68);

    static {
        float f = (float) 8;
        f2269c = f;
        f2272f = f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:130:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0117  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2227a(androidx.compose.p015ui.C1436d r29, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r30, boolean r31, androidx.compose.p015ui.graphics.C1530k0 r32, long r33, long r35, float r37, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r38, androidx.compose.runtime.C1302d r39, int r40, int r41) {
        /*
            r10 = r38
            r11 = r40
            r12 = r41
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r10, r0)
            r0 = -558258760(0xffffffffdeb9a5b8, float:-6.6886503E18)
            r1 = r39
            androidx.compose.runtime.ComposerImpl r0 = r1.mo5440h(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x001e
            r2 = r11 | 6
            r3 = r2
            r2 = r29
            goto L_0x0032
        L_0x001e:
            r2 = r11 & 14
            if (r2 != 0) goto L_0x002f
            r2 = r29
            boolean r3 = r0.mo5408I(r2)
            if (r3 == 0) goto L_0x002c
            r3 = 4
            goto L_0x002d
        L_0x002c:
            r3 = 2
        L_0x002d:
            r3 = r3 | r11
            goto L_0x0032
        L_0x002f:
            r2 = r29
            r3 = r11
        L_0x0032:
            r4 = r12 & 2
            if (r4 == 0) goto L_0x0039
            r3 = r3 | 48
            goto L_0x004c
        L_0x0039:
            r5 = r11 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004c
            r5 = r30
            boolean r6 = r0.mo5408I(r5)
            if (r6 == 0) goto L_0x0048
            r6 = 32
            goto L_0x004a
        L_0x0048:
            r6 = 16
        L_0x004a:
            r3 = r3 | r6
            goto L_0x004e
        L_0x004c:
            r5 = r30
        L_0x004e:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0055
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0055:
            r7 = r11 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0068
            r7 = r31
            boolean r8 = r0.mo5427a(r7)
            if (r8 == 0) goto L_0x0064
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r3 = r3 | r8
            goto L_0x006a
        L_0x0068:
            r7 = r31
        L_0x006a:
            r8 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0083
            r8 = r12 & 8
            if (r8 != 0) goto L_0x007d
            r8 = r32
            boolean r9 = r0.mo5408I(r8)
            if (r9 == 0) goto L_0x007f
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007d:
            r8 = r32
        L_0x007f:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r3 = r3 | r9
            goto L_0x0085
        L_0x0083:
            r8 = r32
        L_0x0085:
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r11
            if (r9 != 0) goto L_0x009e
            r9 = r12 & 16
            r13 = r33
            if (r9 != 0) goto L_0x009a
            boolean r9 = r0.mo5434e(r13)
            if (r9 == 0) goto L_0x009a
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r3 = r3 | r9
            goto L_0x00a0
        L_0x009e:
            r13 = r33
        L_0x00a0:
            r9 = 458752(0x70000, float:6.42848E-40)
            r15 = r11 & r9
            if (r15 != 0) goto L_0x00b9
            r15 = r12 & 32
            r9 = r35
            if (r15 != 0) goto L_0x00b5
            boolean r15 = r0.mo5434e(r9)
            if (r15 == 0) goto L_0x00b5
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b7
        L_0x00b5:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b7:
            r3 = r3 | r15
            goto L_0x00bb
        L_0x00b9:
            r9 = r35
        L_0x00bb:
            r15 = r12 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r15 == 0) goto L_0x00c6
            r3 = r3 | r16
            r2 = r37
            goto L_0x00db
        L_0x00c6:
            r17 = 3670016(0x380000, float:5.142788E-39)
            r17 = r11 & r17
            r2 = r37
            if (r17 != 0) goto L_0x00db
            boolean r17 = r0.mo5428b(r2)
            if (r17 == 0) goto L_0x00d7
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d9
        L_0x00d7:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00d9:
            r3 = r3 | r17
        L_0x00db:
            r2 = r12 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x00e5
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r3 | r2
            r10 = r38
            goto L_0x00f8
        L_0x00e5:
            r2 = 29360128(0x1c00000, float:7.052966E-38)
            r2 = r2 & r11
            r10 = r38
            if (r2 != 0) goto L_0x00f8
            boolean r2 = r0.mo5408I(r10)
            if (r2 == 0) goto L_0x00f5
            r2 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f7
        L_0x00f5:
            r2 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f7:
            r3 = r3 | r2
        L_0x00f8:
            r2 = 23967451(0x16db6db, float:4.3661218E-38)
            r2 = r2 & r3
            r9 = 4793490(0x492492, float:6.71711E-39)
            if (r2 != r9) goto L_0x0117
            boolean r2 = r0.mo5442i()
            if (r2 != 0) goto L_0x0108
            goto L_0x0117
        L_0x0108:
            r0.mo5396C()
            r1 = r29
            r9 = r37
            r2 = r5
            r3 = r7
            r4 = r8
            r5 = r13
            r7 = r35
            goto L_0x0205
        L_0x0117:
            r0.mo5466u0()
            r2 = r11 & 1
            r9 = -57345(0xffffffffffff1fff, float:NaN)
            r17 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r2 == 0) goto L_0x014a
            boolean r2 = r0.mo5425Y()
            if (r2 == 0) goto L_0x012b
            goto L_0x014a
        L_0x012b:
            r0.mo5396C()
            r1 = r12 & 8
            if (r1 == 0) goto L_0x0134
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0134:
            r1 = r12 & 16
            if (r1 == 0) goto L_0x0139
            r3 = r3 & r9
        L_0x0139:
            r1 = r12 & 32
            if (r1 == 0) goto L_0x013f
            r3 = r3 & r17
        L_0x013f:
            r1 = r29
            r6 = r37
            r4 = r8
            r9 = r13
            r8 = r3
            r2 = r35
            goto L_0x01bf
        L_0x014a:
            if (r1 == 0) goto L_0x014f
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x0151
        L_0x014f:
            r1 = r29
        L_0x0151:
            if (r4 == 0) goto L_0x0155
            r2 = 0
            r5 = r2
        L_0x0155:
            r2 = 0
            if (r6 == 0) goto L_0x0159
            r7 = r2
        L_0x0159:
            r4 = r12 & 8
            if (r4 == 0) goto L_0x016a
            androidx.compose.runtime.l1 r4 = androidx.compose.material.ShapesKt.f2252a
            java.lang.Object r4 = r0.mo5410J(r4)
            androidx.compose.material.q1 r4 = (androidx.compose.material.C1225q1) r4
            p.a r4 = r4.f2547a
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x016b
        L_0x016a:
            r4 = r8
        L_0x016b:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x019e
            r6 = 1630911716(0x6135bce4, float:2.0952948E20)
            r0.mo5465u(r6)
            androidx.compose.runtime.l1 r6 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r8 = r0.mo5410J(r6)
            androidx.compose.material.v r8 = (androidx.compose.material.C1259v) r8
            long r13 = r8.mo5358e()
            r8 = 1061997773(0x3f4ccccd, float:0.8)
            long r13 = androidx.compose.p015ui.graphics.C1545s.m3356b(r13, r8)
            java.lang.Object r6 = r0.mo5410J(r6)
            androidx.compose.material.v r6 = (androidx.compose.material.C1259v) r6
            long r9 = r6.mo5363j()
            long r9 = p628nj.C18263b.m30808C(r13, r9)
            r0.mo5418R(r2)
            r2 = -57345(0xffffffffffff1fff, float:NaN)
            r3 = r3 & r2
            goto L_0x019f
        L_0x019e:
            r9 = r13
        L_0x019f:
            r2 = r12 & 32
            if (r2 == 0) goto L_0x01b3
            androidx.compose.runtime.l1 r2 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r2 = r0.mo5410J(r2)
            androidx.compose.material.v r2 = (androidx.compose.material.C1259v) r2
            long r13 = r2.mo5363j()
            r2 = r3 & r17
            r3 = r2
            goto L_0x01b5
        L_0x01b3:
            r13 = r35
        L_0x01b5:
            if (r15 == 0) goto L_0x01ba
            r2 = 6
            float r2 = (float) r2
            goto L_0x01bc
        L_0x01ba:
            r2 = r37
        L_0x01bc:
            r6 = r2
            r8 = r3
            r2 = r13
        L_0x01bf:
            r0.mo5419S()
            r19 = 0
            r13 = -2084221700(0xffffffff83c54cfc, float:-1.1596294E-36)
            androidx.compose.material.SnackbarKt$Snackbar$1 r14 = new androidx.compose.material.SnackbarKt$Snackbar$1
            r15 = r38
            r14.<init>(r5, r15, r8, r7)
            androidx.compose.runtime.internal.ComposableLambdaImpl r21 = p628nj.C18263b.m30805A(r0, r13, r14)
            r13 = r8 & 14
            r13 = r13 | r16
            int r14 = r8 >> 6
            r16 = r14 & 112(0x70, float:1.57E-43)
            r13 = r13 | r16
            r29 = r5
            r5 = r14 & 896(0x380, float:1.256E-42)
            r5 = r5 | r13
            r13 = r14 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 | r13
            int r8 = r8 >> 3
            r13 = 458752(0x70000, float:6.42848E-40)
            r8 = r8 & r13
            r23 = r5 | r8
            r24 = 16
            r13 = r1
            r14 = r4
            r15 = r9
            r17 = r2
            r20 = r6
            r22 = r0
            androidx.compose.material.SurfaceKt.m2234a(r13, r14, r15, r17, r19, r20, r21, r22, r23, r24)
            r25 = r2
            r2 = r29
            r3 = r7
            r7 = r25
            r27 = r9
            r9 = r6
            r5 = r27
        L_0x0205:
            androidx.compose.runtime.v0 r13 = r0.mo5421U()
            if (r13 != 0) goto L_0x020c
            goto L_0x021a
        L_0x020c:
            androidx.compose.material.SnackbarKt$Snackbar$2 r14 = new androidx.compose.material.SnackbarKt$Snackbar$2
            r0 = r14
            r10 = r38
            r11 = r40
            r12 = r41
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11, r12)
            r13.f3081d = r14
        L_0x021a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarKt.m2227a(androidx.compose.ui.d, kq.p, boolean, androidx.compose.ui.graphics.k0, long, long, float, kq.p, androidx.compose.runtime.d, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:144:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0114  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2228b(androidx.compose.material.C1251s1 r29, androidx.compose.p015ui.C1436d r30, boolean r31, androidx.compose.p015ui.graphics.C1530k0 r32, long r33, long r35, long r37, float r39, androidx.compose.runtime.C1302d r40, int r41, int r42) {
        /*
            r1 = r29
            r12 = r41
            r13 = r42
            java.lang.String r0 = "snackbarData"
            kotlin.jvm.internal.C19383o.m32797g(r1, r0)
            r0 = 258660814(0xf6ad9ce, float:1.15790384E-29)
            r2 = r40
            androidx.compose.runtime.ComposerImpl r0 = r2.mo5440h(r0)
            r2 = r13 & 1
            if (r2 == 0) goto L_0x001b
            r2 = r12 | 6
            goto L_0x002b
        L_0x001b:
            r2 = r12 & 14
            if (r2 != 0) goto L_0x002a
            boolean r2 = r0.mo5408I(r1)
            if (r2 == 0) goto L_0x0027
            r2 = 4
            goto L_0x0028
        L_0x0027:
            r2 = 2
        L_0x0028:
            r2 = r2 | r12
            goto L_0x002b
        L_0x002a:
            r2 = r12
        L_0x002b:
            r3 = r13 & 2
            if (r3 == 0) goto L_0x0032
            r2 = r2 | 48
            goto L_0x0045
        L_0x0032:
            r4 = r12 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0045
            r4 = r30
            boolean r5 = r0.mo5408I(r4)
            if (r5 == 0) goto L_0x0041
            r5 = 32
            goto L_0x0043
        L_0x0041:
            r5 = 16
        L_0x0043:
            r2 = r2 | r5
            goto L_0x0047
        L_0x0045:
            r4 = r30
        L_0x0047:
            r5 = r13 & 4
            if (r5 == 0) goto L_0x004e
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x004e:
            r6 = r12 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0061
            r6 = r31
            boolean r7 = r0.mo5427a(r6)
            if (r7 == 0) goto L_0x005d
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r2 = r2 | r7
            goto L_0x0063
        L_0x0061:
            r6 = r31
        L_0x0063:
            r7 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x007c
            r7 = r13 & 8
            if (r7 != 0) goto L_0x0076
            r7 = r32
            boolean r8 = r0.mo5408I(r7)
            if (r8 == 0) goto L_0x0078
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0076:
            r7 = r32
        L_0x0078:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r2 = r2 | r8
            goto L_0x007e
        L_0x007c:
            r7 = r32
        L_0x007e:
            r8 = 57344(0xe000, float:8.0356E-41)
            r9 = r12 & r8
            if (r9 != 0) goto L_0x009a
            r9 = r13 & 16
            if (r9 != 0) goto L_0x0094
            r9 = r33
            boolean r11 = r0.mo5434e(r9)
            if (r11 == 0) goto L_0x0096
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0094:
            r9 = r33
        L_0x0096:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r2 = r2 | r11
            goto L_0x009c
        L_0x009a:
            r9 = r33
        L_0x009c:
            r11 = 458752(0x70000, float:6.42848E-40)
            r14 = r12 & r11
            if (r14 != 0) goto L_0x00b8
            r14 = r13 & 32
            if (r14 != 0) goto L_0x00b1
            r14 = r35
            boolean r16 = r0.mo5434e(r14)
            if (r16 == 0) goto L_0x00b3
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b5
        L_0x00b1:
            r14 = r35
        L_0x00b3:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b5:
            r2 = r2 | r16
            goto L_0x00ba
        L_0x00b8:
            r14 = r35
        L_0x00ba:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r17 = r12 & r16
            if (r17 != 0) goto L_0x00d3
            r17 = r13 & 64
            r8 = r37
            if (r17 != 0) goto L_0x00cf
            boolean r10 = r0.mo5434e(r8)
            if (r10 == 0) goto L_0x00cf
            r10 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d1
        L_0x00cf:
            r10 = 524288(0x80000, float:7.34684E-40)
        L_0x00d1:
            r2 = r2 | r10
            goto L_0x00d5
        L_0x00d3:
            r8 = r37
        L_0x00d5:
            r10 = r13 & 128(0x80, float:1.794E-43)
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            if (r10 == 0) goto L_0x00e0
            r2 = r2 | r17
            r11 = r39
            goto L_0x00f5
        L_0x00e0:
            r18 = 29360128(0x1c00000, float:7.052966E-38)
            r18 = r12 & r18
            r11 = r39
            if (r18 != 0) goto L_0x00f5
            boolean r19 = r0.mo5428b(r11)
            if (r19 == 0) goto L_0x00f1
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f3
        L_0x00f1:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f3:
            r2 = r2 | r19
        L_0x00f5:
            r19 = 23967451(0x16db6db, float:4.3661218E-38)
            r4 = r2 & r19
            r6 = 4793490(0x492492, float:6.71711E-39)
            if (r4 != r6) goto L_0x0114
            boolean r4 = r0.mo5442i()
            if (r4 != 0) goto L_0x0106
            goto L_0x0114
        L_0x0106:
            r0.mo5396C()
            r2 = r30
            r3 = r31
            r5 = r33
            r4 = r7
            r9 = r8
            r7 = r14
            goto L_0x027a
        L_0x0114:
            r0.mo5466u0()
            r4 = r12 & 1
            r6 = -458753(0xfffffffffff8ffff, float:NaN)
            r19 = -57345(0xffffffffffff1fff, float:NaN)
            r20 = -3670017(0xffffffffffc7ffff, float:NaN)
            if (r4 == 0) goto L_0x0151
            boolean r4 = r0.mo5425Y()
            if (r4 == 0) goto L_0x012b
            goto L_0x0151
        L_0x012b:
            r0.mo5396C()
            r3 = r13 & 8
            if (r3 == 0) goto L_0x0134
            r2 = r2 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0134:
            r3 = r13 & 16
            if (r3 == 0) goto L_0x013a
            r2 = r2 & r19
        L_0x013a:
            r3 = r13 & 32
            if (r3 == 0) goto L_0x013f
            r2 = r2 & r6
        L_0x013f:
            r3 = r13 & 64
            if (r3 == 0) goto L_0x0145
            r2 = r2 & r20
        L_0x0145:
            r3 = r31
            r4 = r33
            r6 = r11
            r10 = r8
            r8 = r14
            r14 = r2
            r2 = r30
            goto L_0x0211
        L_0x0151:
            if (r3 == 0) goto L_0x0156
            androidx.compose.ui.d$a r3 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x0158
        L_0x0156:
            r3 = r30
        L_0x0158:
            if (r5 == 0) goto L_0x015c
            r5 = 0
            goto L_0x015e
        L_0x015c:
            r5 = r31
        L_0x015e:
            r21 = r13 & 8
            if (r21 == 0) goto L_0x016e
            androidx.compose.runtime.l1 r7 = androidx.compose.material.ShapesKt.f2252a
            java.lang.Object r7 = r0.mo5410J(r7)
            androidx.compose.material.q1 r7 = (androidx.compose.material.C1225q1) r7
            p.a r7 = r7.f2547a
            r2 = r2 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x016e:
            r21 = r13 & 16
            if (r21 == 0) goto L_0x01a4
            r6 = 1630911716(0x6135bce4, float:2.0952948E20)
            r0.mo5465u(r6)
            androidx.compose.runtime.l1 r6 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r22 = r0.mo5410J(r6)
            androidx.compose.material.v r22 = (androidx.compose.material.C1259v) r22
            r31 = r5
            long r4 = r22.mo5358e()
            r22 = r3
            r3 = 1061997773(0x3f4ccccd, float:0.8)
            long r3 = androidx.compose.p015ui.graphics.C1545s.m3356b(r4, r3)
            java.lang.Object r5 = r0.mo5410J(r6)
            androidx.compose.material.v r5 = (androidx.compose.material.C1259v) r5
            long r5 = r5.mo5363j()
            long r3 = p628nj.C18263b.m30808C(r3, r5)
            r5 = 0
            r0.mo5418R(r5)
            r2 = r2 & r19
            goto L_0x01aa
        L_0x01a4:
            r22 = r3
            r31 = r5
            r3 = r33
        L_0x01aa:
            r5 = r13 & 32
            if (r5 == 0) goto L_0x01bf
            androidx.compose.runtime.l1 r5 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r5 = r0.mo5410J(r5)
            androidx.compose.material.v r5 = (androidx.compose.material.C1259v) r5
            long r5 = r5.mo5363j()
            r14 = -458753(0xfffffffffff8ffff, float:NaN)
            r2 = r2 & r14
            goto L_0x01c0
        L_0x01bf:
            r5 = r14
        L_0x01c0:
            r14 = r13 & 64
            if (r14 == 0) goto L_0x01fb
            r8 = -810329402(0xffffffffcfb35ac6, float:-6.0181412E9)
            r0.mo5465u(r8)
            androidx.compose.runtime.l1 r8 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r8 = r0.mo5410J(r8)
            androidx.compose.material.v r8 = (androidx.compose.material.C1259v) r8
            boolean r9 = r8.mo5364k()
            if (r9 == 0) goto L_0x01ee
            long r14 = r8.mo5359f()
            long r8 = r8.mo5363j()
            r32 = r3
            r3 = 1058642330(0x3f19999a, float:0.6)
            long r3 = androidx.compose.p015ui.graphics.C1545s.m3356b(r8, r3)
            long r3 = p628nj.C18263b.m30808C(r3, r14)
            goto L_0x01f4
        L_0x01ee:
            r32 = r3
            long r3 = r8.mo5360g()
        L_0x01f4:
            r8 = 0
            r0.mo5418R(r8)
            r2 = r2 & r20
            goto L_0x01fe
        L_0x01fb:
            r32 = r3
            r3 = r8
        L_0x01fe:
            if (r10 == 0) goto L_0x0203
            r8 = 6
            float r8 = (float) r8
            goto L_0x0204
        L_0x0203:
            r8 = r11
        L_0x0204:
            r14 = r2
            r10 = r3
            r2 = r22
            r3 = r31
            r27 = r5
            r6 = r8
            r4 = r32
            r8 = r27
        L_0x0211:
            r0.mo5419S()
            java.lang.String r15 = r29.mo5346a()
            if (r15 == 0) goto L_0x0231
            androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1 r12 = new androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1
            r30 = r12
            r31 = r10
            r33 = r14
            r34 = r29
            r35 = r15
            r30.<init>(r31, r33, r34, r35)
            r15 = 1843479216(0x6de142b0, float:8.7143434E27)
            androidx.compose.runtime.internal.ComposableLambdaImpl r12 = p628nj.C18263b.m30805A(r0, r15, r12)
            goto L_0x0232
        L_0x0231:
            r12 = 0
        L_0x0232:
            r15 = r12
            r12 = 12
            float r12 = (float) r12
            androidx.compose.ui.d r12 = com.google.android.play.core.assetpacks.C15588c1.m25279F0(r2, r12)
            r30 = r2
            r2 = -261845785(0xfffffffff0648ce7, float:-2.829317E29)
            r31 = r10
            androidx.compose.material.SnackbarKt$Snackbar$3 r10 = new androidx.compose.material.SnackbarKt$Snackbar$3
            r10.<init>(r1)
            androidx.compose.runtime.internal.ComposableLambdaImpl r23 = p628nj.C18263b.m30805A(r0, r2, r10)
            r2 = r14 & 896(0x380, float:1.256E-42)
            r2 = r2 | r17
            r10 = r14 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r10
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r14
            r2 = r2 | r10
            r10 = 458752(0x70000, float:6.42848E-40)
            r10 = r10 & r14
            r2 = r2 | r10
            int r10 = r14 >> 3
            r10 = r10 & r16
            r25 = r2 | r10
            r26 = 0
            r14 = r12
            r16 = r3
            r17 = r7
            r18 = r4
            r20 = r8
            r22 = r6
            r24 = r0
            m2227a(r14, r15, r16, r17, r18, r20, r22, r23, r24, r25, r26)
            r2 = r30
            r11 = r6
            r5 = r4
            r4 = r7
            r7 = r8
            r9 = r31
        L_0x027a:
            androidx.compose.runtime.v0 r14 = r0.mo5421U()
            if (r14 != 0) goto L_0x0281
            goto L_0x028f
        L_0x0281:
            androidx.compose.material.SnackbarKt$Snackbar$4 r15 = new androidx.compose.material.SnackbarKt$Snackbar$4
            r0 = r15
            r1 = r29
            r12 = r41
            r13 = r42
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r11, r12, r13)
            r14.f3081d = r15
        L_0x028f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarKt.m2228b(androidx.compose.material.s1, androidx.compose.ui.d, boolean, androidx.compose.ui.graphics.k0, long, long, long, float, androidx.compose.runtime.d, int, int):void");
    }

    /* renamed from: c */
    public static final void m2229c(C19861p pVar, C19861p pVar2, C1302d dVar, int i) {
        int i2;
        ComposerImpl composerImpl;
        C19861p pVar3 = pVar;
        C19861p pVar4 = pVar2;
        int i3 = i;
        ComposerImpl h = dVar.mo5440h(-1229075900);
        if ((i3 & 14) == 0) {
            i2 = (h.mo5408I(pVar3) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= h.mo5408I(pVar4) ? 32 : 16;
        }
        int i4 = i2;
        if ((i4 & 91) != 18 || !h.mo5442i()) {
            C1436d dVar2 = C1436d.C1437a.f3125b;
            C1436d g = SizeKt.m1487g(dVar2);
            float f = f2268b;
            float f2 = f2269c;
            C1436d J0 = C15588c1.m25287J0(g, f, 0.0f, f2, f2270d, 2);
            h.mo5465u(-483455358);
            C1711v a = ColumnKt.m1461a(C0718d.f1478c, C1428a.C1429a.f3116l, h);
            h.mo5465u(-1323940314);
            C1345l1 l1Var = CompositionLocalsKt.f4019e;
            C7282b bVar = (C7282b) h.mo5410J(l1Var);
            C1345l1 l1Var2 = CompositionLocalsKt.f4025k;
            LayoutDirection layoutDirection = (LayoutDirection) h.mo5410J(l1Var2);
            C1345l1 l1Var3 = CompositionLocalsKt.f4029o;
            C1843j1 j1Var = (C1843j1) h.mo5410J(l1Var3);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a2 = C1700o.m3617a(J0);
            if (h.f2715a instanceof C1299c) {
                h.mo5392A();
                if (h.f2702K) {
                    h.mo5450m(aVar);
                } else {
                    h.mo5452n();
                }
                h.f2738x = false;
                C1345l1 l1Var4 = l1Var2;
                C19861p<ComposeUiNode, C1711v, C19394m> pVar5 = ComposeUiNode.Companion.f3781e;
                Updater.m2571b(h, a, pVar5);
                C19861p<ComposeUiNode, C7282b, C19394m> pVar6 = ComposeUiNode.Companion.f3780d;
                Updater.m2571b(h, bVar, pVar6);
                C19861p<ComposeUiNode, LayoutDirection, C19394m> pVar7 = ComposeUiNode.Companion.f3782f;
                Updater.m2571b(h, layoutDirection, pVar7);
                C19861p<ComposeUiNode, C1843j1, C19394m> pVar8 = ComposeUiNode.Companion.f3783g;
                C19861p<ComposeUiNode, C1843j1, C19394m> pVar9 = pVar8;
                C19846a<ComposeUiNode> aVar2 = aVar;
                C1345l1 l1Var5 = l1Var3;
                C1345l1 l1Var6 = l1Var4;
                C19861p<ComposeUiNode, C1711v, C19394m> pVar10 = pVar5;
                C0326j.m868m(0, a2, C13983i.m21490i(h, j1Var, pVar8, h), h, 2058660585, -1163856341);
                h.mo5465u(-1214415430);
                float f3 = f2267a;
                float f4 = f2273g;
                C1436d h0 = !C7284d.m13983a(f4, Float.NaN) ? C17782b.m29868h0(AlignmentLineKt.f3695b, 0.0f, f4, 2) : dVar2;
                if (!C7284d.m13983a(f3, Float.NaN)) {
                    dVar2 = C17782b.m29868h0(AlignmentLineKt.f3694a, f3, 0.0f, 4);
                }
                C1436d J02 = C15588c1.m25287J0(h0.mo6148i0(dVar2), 0.0f, 0.0f, f2, 0.0f, 11);
                h.mo5465u(733328855);
                C1432b bVar2 = C1428a.C1429a.f3105a;
                C1711v c = BoxKt.m1457c(bVar2, false, h);
                h.mo5465u(-1323940314);
                C7282b bVar3 = (C7282b) h.mo5410J(l1Var);
                LayoutDirection layoutDirection2 = (LayoutDirection) h.mo5410J(l1Var6);
                C1345l1 l1Var7 = l1Var5;
                C1843j1 j1Var2 = (C1843j1) h.mo5410J(l1Var7);
                ComposableLambdaImpl a3 = C1700o.m3617a(J02);
                if (h.f2715a instanceof C1299c) {
                    h.mo5392A();
                    if (h.f2702K) {
                        h.mo5450m(aVar2);
                    } else {
                        h.mo5452n();
                    }
                    h.f2738x = false;
                    ComposerImpl composerImpl2 = h;
                    C1345l1 l1Var8 = l1Var7;
                    C1432b bVar4 = bVar2;
                    ComposerImpl composerImpl3 = h;
                    C19861p<ComposeUiNode, LayoutDirection, C19394m> pVar11 = pVar7;
                    C0326j.m868m(0, a3, C0023f.m106g(h, c, pVar10, composerImpl2, bVar3, pVar6, composerImpl3, layoutDirection2, pVar11, h, j1Var2, pVar9, h), composerImpl2, 2058660585, -2137368960);
                    h.mo5465u(1193033152);
                    C19846a<ComposeUiNode> aVar3 = aVar2;
                    C19861p<ComposeUiNode, C7282b, C19394m> pVar12 = pVar6;
                    C0472h.m1247j(i4 & 14, pVar, h, false, false, false);
                    C0071c.m194f(composerImpl3, true, false, false);
                    C1432b.C1433a aVar4 = C1428a.C1429a.f3118n;
                    C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
                    C0752o oVar = new C0752o(aVar4);
                    composerImpl3.mo5465u(733328855);
                    C1711v c2 = BoxKt.m1457c(bVar4, false, composerImpl3);
                    composerImpl3.mo5465u(-1323940314);
                    C7282b bVar5 = (C7282b) composerImpl3.mo5410J(l1Var);
                    LayoutDirection layoutDirection3 = (LayoutDirection) composerImpl3.mo5410J(l1Var6);
                    C1843j1 j1Var3 = (C1843j1) composerImpl3.mo5410J(l1Var8);
                    ComposableLambdaImpl a4 = C1700o.m3617a(oVar);
                    if (composerImpl3.f2715a instanceof C1299c) {
                        composerImpl3.mo5392A();
                        if (composerImpl3.f2702K) {
                            composerImpl3.mo5450m(aVar3);
                        } else {
                            composerImpl3.mo5452n();
                        }
                        composerImpl3.f2738x = false;
                        composerImpl = composerImpl3;
                        C0326j.m868m(0, a4, C0023f.m106g(composerImpl3, c2, pVar10, composerImpl3, bVar5, pVar12, composerImpl3, layoutDirection3, pVar11, composerImpl, j1Var3, pVar9, composerImpl), composerImpl, 2058660585, -2137368960);
                        composerImpl.mo5465u(-2100387721);
                        C0472h.m1247j((i4 >> 3) & 14, pVar2, composerImpl, false, false, false);
                        C0087d.m238h(composerImpl, true, false, false, false);
                        C0087d.m238h(composerImpl, false, false, true, false);
                        composerImpl.mo5418R(false);
                    } else {
                        C0005b.m45j0();
                        throw null;
                    }
                } else {
                    C0005b.m45j0();
                    throw null;
                }
            } else {
                C0005b.m45j0();
                throw null;
            }
        } else {
            h.mo5396C();
            composerImpl = h;
        }
        C1418v0 U = composerImpl.mo5421U();
        if (U != null) {
            U.f3081d = new SnackbarKt$NewLineButtonSnackbar$2(pVar, pVar4, i3);
        }
    }

    /* renamed from: d */
    public static final void m2230d(C19861p pVar, C19861p pVar2, C1302d dVar, int i) {
        int i2;
        ComposerImpl composerImpl;
        C19861p pVar3 = pVar;
        C19861p pVar4 = pVar2;
        int i3 = i;
        ComposerImpl h = dVar.mo5440h(-534813202);
        if ((i3 & 14) == 0) {
            i2 = (h.mo5408I(pVar3) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= h.mo5408I(pVar4) ? 32 : 16;
        }
        int i4 = i2;
        if ((i4 & 91) != 18 || !h.mo5442i()) {
            C1436d.C1437a aVar = C1436d.C1437a.f3125b;
            C1436d J0 = C15588c1.m25287J0(aVar, f2268b, 0.0f, f2269c, 0.0f, 10);
            SnackbarKt$OneRowSnackbar$2 snackbarKt$OneRowSnackbar$2 = new SnackbarKt$OneRowSnackbar$2();
            h.mo5465u(-1323940314);
            C1345l1 l1Var = CompositionLocalsKt.f4019e;
            C7282b bVar = (C7282b) h.mo5410J(l1Var);
            C1345l1 l1Var2 = CompositionLocalsKt.f4025k;
            LayoutDirection layoutDirection = (LayoutDirection) h.mo5410J(l1Var2);
            C1345l1 l1Var3 = CompositionLocalsKt.f4029o;
            C1843j1 j1Var = (C1843j1) h.mo5410J(l1Var3);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a = C1700o.m3617a(J0);
            if (h.f2715a instanceof C1299c) {
                h.mo5392A();
                if (h.f2702K) {
                    h.mo5450m(aVar2);
                } else {
                    h.mo5452n();
                }
                h.f2738x = false;
                C19861p<ComposeUiNode, C1711v, C19394m> pVar5 = ComposeUiNode.Companion.f3781e;
                Updater.m2571b(h, snackbarKt$OneRowSnackbar$2, pVar5);
                C19861p<ComposeUiNode, C7282b, C19394m> pVar6 = ComposeUiNode.Companion.f3780d;
                Updater.m2571b(h, bVar, pVar6);
                C19861p<ComposeUiNode, LayoutDirection, C19394m> pVar7 = ComposeUiNode.Companion.f3782f;
                Updater.m2571b(h, layoutDirection, pVar7);
                C19861p<ComposeUiNode, C1843j1, C19394m> pVar8 = ComposeUiNode.Companion.f3783g;
                C19861p<ComposeUiNode, C1843j1, C19394m> pVar9 = pVar8;
                C19861p<ComposeUiNode, C1711v, C19394m> pVar10 = pVar5;
                C19846a<ComposeUiNode> aVar3 = aVar2;
                C1345l1 l1Var4 = l1Var3;
                C0326j.m868m(0, a, C13983i.m21490i(h, j1Var, pVar8, h), h, 2058660585, -643033641);
                C1436d H0 = C15588c1.m25283H0(C1993m.m4358S(aVar, "text"), 0.0f, f2271e, 1);
                h.mo5465u(733328855);
                C1432b bVar2 = C1428a.C1429a.f3105a;
                C1711v c = BoxKt.m1457c(bVar2, false, h);
                h.mo5465u(-1323940314);
                C7282b bVar3 = (C7282b) h.mo5410J(l1Var);
                LayoutDirection layoutDirection2 = (LayoutDirection) h.mo5410J(l1Var2);
                C1843j1 j1Var2 = (C1843j1) h.mo5410J(l1Var4);
                ComposableLambdaImpl a2 = C1700o.m3617a(H0);
                if (h.f2715a instanceof C1299c) {
                    h.mo5392A();
                    if (h.f2702K) {
                        h.mo5450m(aVar3);
                    } else {
                        h.mo5452n();
                    }
                    h.f2738x = false;
                    ComposerImpl composerImpl2 = h;
                    C1432b bVar4 = bVar2;
                    C1345l1 l1Var5 = l1Var2;
                    ComposerImpl composerImpl3 = h;
                    C19861p<ComposeUiNode, LayoutDirection, C19394m> pVar11 = pVar7;
                    C0326j.m868m(0, a2, C0023f.m106g(h, c, pVar10, composerImpl2, bVar3, pVar6, composerImpl3, layoutDirection2, pVar11, h, j1Var2, pVar9, h), composerImpl2, 2058660585, -2137368960);
                    h.mo5465u(1616738193);
                    C19846a<ComposeUiNode> aVar4 = aVar3;
                    C19861p<ComposeUiNode, C7282b, C19394m> pVar12 = pVar6;
                    C0472h.m1247j(i4 & 14, pVar, h, false, false, false);
                    C0071c.m194f(composerImpl3, true, false, false);
                    C1436d S = C1993m.m4358S(aVar, ResponseConstants.ACTION);
                    composerImpl3.mo5465u(733328855);
                    C1711v c2 = BoxKt.m1457c(bVar4, false, composerImpl3);
                    composerImpl3.mo5465u(-1323940314);
                    C7282b bVar5 = (C7282b) composerImpl3.mo5410J(l1Var);
                    LayoutDirection layoutDirection3 = (LayoutDirection) composerImpl3.mo5410J(l1Var5);
                    C1843j1 j1Var3 = (C1843j1) composerImpl3.mo5410J(l1Var4);
                    ComposableLambdaImpl a3 = C1700o.m3617a(S);
                    if (composerImpl3.f2715a instanceof C1299c) {
                        composerImpl3.mo5392A();
                        if (composerImpl3.f2702K) {
                            composerImpl3.mo5450m(aVar4);
                        } else {
                            composerImpl3.mo5452n();
                        }
                        composerImpl3.f2738x = false;
                        composerImpl = composerImpl3;
                        C0326j.m868m(0, a3, C0023f.m106g(composerImpl3, c2, pVar10, composerImpl3, bVar5, pVar12, composerImpl3, layoutDirection3, pVar11, composerImpl, j1Var3, pVar9, composerImpl), composerImpl, 2058660585, -2137368960);
                        composerImpl.mo5465u(-1690150342);
                        C0472h.m1247j((i4 >> 3) & 14, pVar2, composerImpl, false, false, false);
                        C0087d.m238h(composerImpl, true, false, false, false);
                        C0071c.m194f(composerImpl, false, true, false);
                    } else {
                        C0005b.m45j0();
                        throw null;
                    }
                } else {
                    C0005b.m45j0();
                    throw null;
                }
            } else {
                C0005b.m45j0();
                throw null;
            }
        } else {
            h.mo5396C();
            composerImpl = h;
        }
        C1418v0 U = composerImpl.mo5421U();
        if (U != null) {
            U.f3081d = new SnackbarKt$OneRowSnackbar$3(pVar, pVar4, i3);
        }
    }

    /* renamed from: e */
    public static final void m2231e(C19861p pVar, C1302d dVar, int i) {
        int i2;
        ComposerImpl composerImpl;
        C19861p pVar2 = pVar;
        int i3 = i;
        ComposerImpl h = dVar.mo5440h(917397959);
        if ((i3 & 14) == 0) {
            i2 = (h.mo5408I(pVar2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i2 & 11) != 2 || !h.mo5442i()) {
            SnackbarKt$TextOnlySnackbar$2 snackbarKt$TextOnlySnackbar$2 = SnackbarKt$TextOnlySnackbar$2.f2276a;
            h.mo5465u(-1323940314);
            C1436d.C1437a aVar = C1436d.C1437a.f3125b;
            C1345l1 l1Var = CompositionLocalsKt.f4019e;
            C7282b bVar = (C7282b) h.mo5410J(l1Var);
            C1345l1 l1Var2 = CompositionLocalsKt.f4025k;
            LayoutDirection layoutDirection = (LayoutDirection) h.mo5410J(l1Var2);
            C1345l1 l1Var3 = CompositionLocalsKt.f4029o;
            C1843j1 j1Var = (C1843j1) h.mo5410J(l1Var3);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a = C1700o.m3617a(aVar);
            if (h.f2715a instanceof C1299c) {
                h.mo5392A();
                if (h.f2702K) {
                    h.mo5450m(aVar2);
                } else {
                    h.mo5452n();
                }
                h.f2738x = false;
                C19861p<ComposeUiNode, C1711v, C19394m> pVar3 = ComposeUiNode.Companion.f3781e;
                Updater.m2571b(h, snackbarKt$TextOnlySnackbar$2, pVar3);
                C19861p<ComposeUiNode, C7282b, C19394m> pVar4 = ComposeUiNode.Companion.f3780d;
                Updater.m2571b(h, bVar, pVar4);
                C19861p<ComposeUiNode, LayoutDirection, C19394m> pVar5 = ComposeUiNode.Companion.f3782f;
                Updater.m2571b(h, layoutDirection, pVar5);
                C19861p<ComposeUiNode, C1843j1, C19394m> pVar6 = ComposeUiNode.Companion.f3783g;
                C1295a1 i4 = C13983i.m21490i(h, j1Var, pVar6, h);
                C19861p<ComposeUiNode, C1843j1, C19394m> pVar7 = pVar6;
                ComposableLambdaImpl composableLambdaImpl = a;
                C1295a1 a1Var = i4;
                C19861p<ComposeUiNode, C1711v, C19394m> pVar8 = pVar3;
                C19846a<ComposeUiNode> aVar3 = aVar2;
                C0326j.m868m(0, composableLambdaImpl, a1Var, h, 2058660585, -266728784);
                C1436d G0 = C15588c1.m25281G0(aVar, f2268b, f2271e);
                h.mo5465u(733328855);
                C1711v c = BoxKt.m1457c(C1428a.C1429a.f3105a, false, h);
                h.mo5465u(-1323940314);
                C7282b bVar2 = (C7282b) h.mo5410J(l1Var);
                LayoutDirection layoutDirection2 = (LayoutDirection) h.mo5410J(l1Var2);
                C1843j1 j1Var2 = (C1843j1) h.mo5410J(l1Var3);
                ComposableLambdaImpl a2 = C1700o.m3617a(G0);
                if (h.f2715a instanceof C1299c) {
                    h.mo5392A();
                    if (h.f2702K) {
                        h.mo5450m(aVar3);
                    } else {
                        h.mo5452n();
                    }
                    h.f2738x = false;
                    ComposerImpl composerImpl2 = h;
                    C0326j.m868m(0, a2, C0023f.m106g(h, c, pVar8, composerImpl2, bVar2, pVar4, h, layoutDirection2, pVar5, h, j1Var2, pVar7, h), composerImpl2, 2058660585, -2137368960);
                    h.mo5465u(1392363114);
                    composerImpl = h;
                    C0472h.m1247j(i2 & 14, pVar, h, false, false, false);
                    C0087d.m238h(composerImpl, true, false, false, false);
                    C0071c.m194f(composerImpl, false, true, false);
                } else {
                    C0005b.m45j0();
                    throw null;
                }
            } else {
                C0005b.m45j0();
                throw null;
            }
        } else {
            h.mo5396C();
            composerImpl = h;
        }
        C1418v0 U = composerImpl.mo5421U();
        if (U != null) {
            U.f3081d = new SnackbarKt$TextOnlySnackbar$3(pVar, i3);
        }
    }
}
