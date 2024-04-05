package androidx.compose.material;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.session.C0087d;
import androidx.activity.C0114h;
import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0472h;
import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.C0435k0;
import androidx.compose.animation.core.C0454t;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.graphics.colorspace.C1505c;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1345l1;
import androidx.compose.runtime.C1412t0;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import p001a0.C0005b;
import p003a2.C0023f;
import p174m0.C7282b;
import p504ai.C13983i;
import p753kq.C19846a;
import p753kq.C19861p;

public final class TabKt {

    /* renamed from: a */
    public static final float f2313a = ((float) 48);

    /* renamed from: b */
    public static final float f2314b = ((float) 72);

    /* renamed from: c */
    public static final float f2315c = ((float) 16);

    /* renamed from: d */
    public static final float f2316d = ((float) 14);

    /* renamed from: e */
    public static final float f2317e = ((float) 6);

    /* renamed from: f */
    public static final long f2318f = C0114h.m302g0(20);

    /* renamed from: g */
    public static final float f2319g = ((float) 8);

    /* JADX WARNING: Removed duplicated region for block: B:101:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0117  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2255a(int r30, int r31, long r32, long r34, androidx.compose.foundation.interaction.C0640j r36, androidx.compose.runtime.C1302d r37, androidx.compose.p015ui.C1436d r38, p753kq.C19846a r39, p753kq.C19861p r40, p753kq.C19861p r41, boolean r42, boolean r43) {
        /*
            r12 = r30
            r13 = r31
            r2 = r39
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C19383o.m32797g(r2, r0)
            r0 = -1486097588(0xffffffffa76bf34c, float:-3.2744693E-15)
            r1 = r37
            androidx.compose.runtime.ComposerImpl r0 = r1.mo5440h(r0)
            r1 = r13 & 1
            if (r1 == 0) goto L_0x001e
            r1 = r12 | 6
            r3 = r1
            r1 = r42
            goto L_0x0032
        L_0x001e:
            r1 = r12 & 14
            if (r1 != 0) goto L_0x002f
            r1 = r42
            boolean r3 = r0.mo5427a(r1)
            if (r3 == 0) goto L_0x002c
            r3 = 4
            goto L_0x002d
        L_0x002c:
            r3 = 2
        L_0x002d:
            r3 = r3 | r12
            goto L_0x0032
        L_0x002f:
            r1 = r42
            r3 = r12
        L_0x0032:
            r4 = r13 & 2
            if (r4 == 0) goto L_0x0039
            r3 = r3 | 48
            goto L_0x0049
        L_0x0039:
            r4 = r12 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0049
            boolean r4 = r0.mo5408I(r2)
            if (r4 == 0) goto L_0x0046
            r4 = 32
            goto L_0x0048
        L_0x0046:
            r4 = 16
        L_0x0048:
            r3 = r3 | r4
        L_0x0049:
            r4 = r13 & 4
            if (r4 == 0) goto L_0x0050
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0050:
            r5 = r12 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0063
            r5 = r38
            boolean r6 = r0.mo5408I(r5)
            if (r6 == 0) goto L_0x005f
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r3 = r3 | r6
            goto L_0x0065
        L_0x0063:
            r5 = r38
        L_0x0065:
            r6 = r13 & 8
            if (r6 == 0) goto L_0x006c
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x007f
        L_0x006c:
            r7 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x007f
            r7 = r43
            boolean r8 = r0.mo5427a(r7)
            if (r8 == 0) goto L_0x007b
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r3 = r3 | r8
            goto L_0x0081
        L_0x007f:
            r7 = r43
        L_0x0081:
            r8 = r13 & 16
            r9 = 57344(0xe000, float:8.0356E-41)
            if (r8 == 0) goto L_0x008b
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009d
        L_0x008b:
            r9 = r9 & r12
            if (r9 != 0) goto L_0x009d
            r9 = r40
            boolean r10 = r0.mo5408I(r9)
            if (r10 == 0) goto L_0x0099
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009b
        L_0x0099:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x009b:
            r3 = r3 | r10
            goto L_0x009f
        L_0x009d:
            r9 = r40
        L_0x009f:
            r10 = r13 & 32
            r11 = 458752(0x70000, float:6.42848E-40)
            if (r10 == 0) goto L_0x00a9
            r11 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r11
            goto L_0x00bb
        L_0x00a9:
            r11 = r11 & r12
            if (r11 != 0) goto L_0x00bb
            r11 = r41
            boolean r14 = r0.mo5408I(r11)
            if (r14 == 0) goto L_0x00b7
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b9
        L_0x00b7:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00b9:
            r3 = r3 | r14
            goto L_0x00bd
        L_0x00bb:
            r11 = r41
        L_0x00bd:
            r14 = r13 & 64
            r15 = 3670016(0x380000, float:5.142788E-39)
            if (r14 == 0) goto L_0x00ca
            r16 = 1572864(0x180000, float:2.204052E-39)
            r3 = r3 | r16
            r15 = r36
            goto L_0x00dd
        L_0x00ca:
            r16 = r12 & r15
            r15 = r36
            if (r16 != 0) goto L_0x00dd
            boolean r16 = r0.mo5408I(r15)
            if (r16 == 0) goto L_0x00d9
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00db
        L_0x00d9:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00db:
            r3 = r3 | r16
        L_0x00dd:
            r16 = 29360128(0x1c00000, float:7.052966E-38)
            r16 = r12 & r16
            if (r16 != 0) goto L_0x00f9
            r1 = r13 & 128(0x80, float:1.794E-43)
            if (r1 != 0) goto L_0x00f2
            r1 = r32
            boolean r16 = r0.mo5434e(r1)
            if (r16 == 0) goto L_0x00f4
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f6
        L_0x00f2:
            r1 = r32
        L_0x00f4:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f6:
            r3 = r3 | r16
            goto L_0x00fb
        L_0x00f9:
            r1 = r32
        L_0x00fb:
            r16 = 234881024(0xe000000, float:1.5777218E-30)
            r16 = r12 & r16
            if (r16 != 0) goto L_0x0117
            r1 = r13 & 256(0x100, float:3.59E-43)
            if (r1 != 0) goto L_0x0110
            r1 = r34
            boolean r16 = r0.mo5434e(r1)
            if (r16 == 0) goto L_0x0112
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0114
        L_0x0110:
            r1 = r34
        L_0x0112:
            r16 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0114:
            r3 = r3 | r16
            goto L_0x0119
        L_0x0117:
            r1 = r34
        L_0x0119:
            r16 = 191739611(0xb6db6db, float:4.5782105E-32)
            r1 = r3 & r16
            r2 = 38347922(0x2492492, float:1.4777643E-37)
            if (r1 != r2) goto L_0x0138
            boolean r1 = r0.mo5442i()
            if (r1 != 0) goto L_0x012a
            goto L_0x0138
        L_0x012a:
            r0.mo5396C()
            r3 = r5
            r4 = r7
            r5 = r9
            r6 = r11
            r7 = r15
            r8 = r32
            r10 = r34
            goto L_0x0218
        L_0x0138:
            r0.mo5466u0()
            r1 = r12 & 1
            r2 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r16 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            if (r1 == 0) goto L_0x0162
            boolean r1 = r0.mo5425Y()
            if (r1 == 0) goto L_0x014c
            goto L_0x0162
        L_0x014c:
            r0.mo5396C()
            r1 = r13 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0154
            r3 = r3 & r2
        L_0x0154:
            r1 = r13 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x015a
            r3 = r3 & r16
        L_0x015a:
            r1 = r34
            r8 = r3
            r6 = r5
            r3 = r15
            r4 = r32
            goto L_0x01b9
        L_0x0162:
            if (r4 == 0) goto L_0x0167
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r5 = r1
        L_0x0167:
            if (r6 == 0) goto L_0x016b
            r1 = 1
            r7 = r1
        L_0x016b:
            if (r8 == 0) goto L_0x016f
            r1 = 0
            r9 = r1
        L_0x016f:
            if (r10 == 0) goto L_0x0173
            r1 = 0
            r11 = r1
        L_0x0173:
            if (r14 == 0) goto L_0x018e
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.mo5465u(r1)
            java.lang.Object r1 = r0.mo5431c0()
            androidx.compose.runtime.d$a$a r4 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r1 != r4) goto L_0x0187
            androidx.compose.foundation.interaction.k r1 = android.support.p013v4.media.C0072d.m198e(r0)
        L_0x0187:
            r4 = 0
            r0.mo5418R(r4)
            androidx.compose.foundation.interaction.j r1 = (androidx.compose.foundation.interaction.C0640j) r1
            r15 = r1
        L_0x018e:
            r1 = r13 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x01a0
            androidx.compose.runtime.t r1 = androidx.compose.material.ContentColorKt.f2199a
            java.lang.Object r1 = r0.mo5410J(r1)
            androidx.compose.ui.graphics.s r1 = (androidx.compose.p015ui.graphics.C1545s) r1
            r38 = r5
            long r4 = r1.f3366a
            r3 = r3 & r2
            goto L_0x01a4
        L_0x01a0:
            r38 = r5
            r4 = r32
        L_0x01a4:
            r1 = r13 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x01b3
            float r1 = kotlinx.coroutines.C19543e0.m33302T(r0)
            long r1 = androidx.compose.p015ui.graphics.C1545s.m3356b(r4, r1)
            r3 = r3 & r16
            goto L_0x01b5
        L_0x01b3:
            r1 = r34
        L_0x01b5:
            r6 = r38
            r8 = r3
            r3 = r15
        L_0x01b9:
            r0.mo5419S()
            if (r9 == 0) goto L_0x01cb
            r10 = -1729014781(0xffffffff98f15403, float:-6.238187E-24)
            androidx.compose.material.TabKt$Tab$styledText$1$1 r14 = new androidx.compose.material.TabKt$Tab$styledText$1$1
            r14.<init>(r9, r8)
            androidx.compose.runtime.internal.ComposableLambdaImpl r10 = p628nj.C18263b.m30805A(r0, r10, r14)
            goto L_0x01cc
        L_0x01cb:
            r10 = 0
        L_0x01cc:
            r14 = -178151495(0xfffffffff5619fb9, float:-2.860123E32)
            androidx.compose.material.TabKt$Tab$2 r15 = new androidx.compose.material.TabKt$Tab$2
            r15.<init>(r10, r11, r8)
            androidx.compose.runtime.internal.ComposableLambdaImpl r23 = p628nj.C18263b.m30805A(r0, r14, r15)
            r10 = 12582912(0xc00000, float:1.7632415E-38)
            r14 = r8 & 14
            r10 = r10 | r14
            r14 = r8 & 112(0x70, float:1.57E-43)
            r10 = r10 | r14
            r14 = r8 & 896(0x380, float:1.256E-42)
            r10 = r10 | r14
            r14 = r8 & 7168(0x1c00, float:1.0045E-41)
            r10 = r10 | r14
            int r8 = r8 >> 6
            r14 = 57344(0xe000, float:8.0356E-41)
            r14 = r14 & r8
            r10 = r10 | r14
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r8
            r10 = r10 | r14
            r14 = 3670016(0x380000, float:5.142788E-39)
            r8 = r8 & r14
            r25 = r10 | r8
            r26 = 0
            r14 = r42
            r15 = r39
            r16 = r6
            r17 = r7
            r18 = r3
            r19 = r4
            r21 = r1
            r24 = r0
            m2256b(r14, r15, r16, r17, r18, r19, r21, r23, r24, r25, r26)
            r27 = r7
            r7 = r3
            r3 = r6
            r6 = r11
            r10 = r1
            r28 = r4
            r4 = r27
            r5 = r9
            r8 = r28
        L_0x0218:
            androidx.compose.runtime.v0 r14 = r0.mo5421U()
            if (r14 != 0) goto L_0x021f
            goto L_0x022f
        L_0x021f:
            androidx.compose.material.TabKt$Tab$3 r15 = new androidx.compose.material.TabKt$Tab$3
            r0 = r15
            r1 = r42
            r2 = r39
            r12 = r30
            r13 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r12, r13)
            r14.f3081d = r15
        L_0x022f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabKt.m2255a(int, int, long, long, androidx.compose.foundation.interaction.j, androidx.compose.runtime.d, androidx.compose.ui.d, kq.a, kq.p, kq.p, boolean, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x010c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2256b(boolean r23, p753kq.C19846a<kotlin.C19394m> r24, androidx.compose.p015ui.C1436d r25, boolean r26, androidx.compose.foundation.interaction.C0640j r27, long r28, long r30, p753kq.C19862q<? super androidx.compose.foundation.layout.C0739i, ? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r32, androidx.compose.runtime.C1302d r33, int r34, int r35) {
        /*
            r9 = r24
            r10 = r32
            r11 = r34
            r12 = r35
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C19383o.m32797g(r9, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r10, r0)
            r0 = 713679175(0x2a89e147, float:2.4492406E-13)
            r1 = r33
            androidx.compose.runtime.ComposerImpl r13 = r1.mo5440h(r0)
            r0 = r12 & 1
            if (r0 == 0) goto L_0x0024
            r0 = r11 | 6
            r14 = r23
            goto L_0x0036
        L_0x0024:
            r0 = r11 & 14
            r14 = r23
            if (r0 != 0) goto L_0x0035
            boolean r0 = r13.mo5427a(r14)
            if (r0 == 0) goto L_0x0032
            r0 = 4
            goto L_0x0033
        L_0x0032:
            r0 = 2
        L_0x0033:
            r0 = r0 | r11
            goto L_0x0036
        L_0x0035:
            r0 = r11
        L_0x0036:
            r1 = r12 & 2
            if (r1 == 0) goto L_0x003d
            r0 = r0 | 48
            goto L_0x004d
        L_0x003d:
            r1 = r11 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x004d
            boolean r1 = r13.mo5408I(r9)
            if (r1 == 0) goto L_0x004a
            r1 = 32
            goto L_0x004c
        L_0x004a:
            r1 = 16
        L_0x004c:
            r0 = r0 | r1
        L_0x004d:
            r1 = r12 & 4
            if (r1 == 0) goto L_0x0054
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0054:
            r2 = r11 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0067
            r2 = r25
            boolean r3 = r13.mo5408I(r2)
            if (r3 == 0) goto L_0x0063
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r0 = r0 | r3
            goto L_0x0069
        L_0x0067:
            r2 = r25
        L_0x0069:
            r3 = r12 & 8
            if (r3 == 0) goto L_0x0070
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0070:
            r4 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x0083
            r4 = r26
            boolean r5 = r13.mo5427a(r4)
            if (r5 == 0) goto L_0x007f
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r0 = r0 | r5
            goto L_0x0085
        L_0x0083:
            r4 = r26
        L_0x0085:
            r5 = r12 & 16
            if (r5 == 0) goto L_0x008c
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a1
        L_0x008c:
            r6 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r11
            if (r6 != 0) goto L_0x00a1
            r6 = r27
            boolean r7 = r13.mo5408I(r6)
            if (r7 == 0) goto L_0x009d
            r7 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009d:
            r7 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r0 = r0 | r7
            goto L_0x00a3
        L_0x00a1:
            r6 = r27
        L_0x00a3:
            r7 = 458752(0x70000, float:6.42848E-40)
            r7 = r7 & r11
            if (r7 != 0) goto L_0x00bd
            r7 = r12 & 32
            if (r7 != 0) goto L_0x00b7
            r7 = r28
            boolean r15 = r13.mo5434e(r7)
            if (r15 == 0) goto L_0x00b9
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bb
        L_0x00b7:
            r7 = r28
        L_0x00b9:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00bb:
            r0 = r0 | r15
            goto L_0x00bf
        L_0x00bd:
            r7 = r28
        L_0x00bf:
            r15 = 3670016(0x380000, float:5.142788E-39)
            r15 = r15 & r11
            if (r15 != 0) goto L_0x00d7
            r15 = r12 & 64
            r6 = r30
            if (r15 != 0) goto L_0x00d3
            boolean r8 = r13.mo5434e(r6)
            if (r8 == 0) goto L_0x00d3
            r8 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d5
        L_0x00d3:
            r8 = 524288(0x80000, float:7.34684E-40)
        L_0x00d5:
            r0 = r0 | r8
            goto L_0x00d9
        L_0x00d7:
            r6 = r30
        L_0x00d9:
            r8 = r12 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x00e0
            r8 = 12582912(0xc00000, float:1.7632415E-38)
            goto L_0x00f0
        L_0x00e0:
            r8 = 29360128(0x1c00000, float:7.052966E-38)
            r8 = r8 & r11
            if (r8 != 0) goto L_0x00f1
            boolean r8 = r13.mo5408I(r10)
            if (r8 == 0) goto L_0x00ee
            r8 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f0
        L_0x00ee:
            r8 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f0:
            r0 = r0 | r8
        L_0x00f1:
            r8 = 23967451(0x16db6db, float:4.3661218E-38)
            r8 = r8 & r0
            r15 = 4793490(0x492492, float:6.71711E-39)
            if (r8 != r15) goto L_0x010c
            boolean r8 = r13.mo5442i()
            if (r8 != 0) goto L_0x0101
            goto L_0x010c
        L_0x0101:
            r13.mo5396C()
            r5 = r27
            r3 = r2
            r8 = r6
            r6 = r28
            goto L_0x01fc
        L_0x010c:
            r13.mo5466u0()
            r8 = r11 & 1
            r15 = -458753(0xfffffffffff8ffff, float:NaN)
            r16 = -3670017(0xffffffffffc7ffff, float:NaN)
            if (r8 == 0) goto L_0x0135
            boolean r8 = r13.mo5425Y()
            if (r8 == 0) goto L_0x0120
            goto L_0x0135
        L_0x0120:
            r13.mo5396C()
            r1 = r12 & 32
            if (r1 == 0) goto L_0x0128
            r0 = r0 & r15
        L_0x0128:
            r1 = r12 & 64
            if (r1 == 0) goto L_0x012e
            r0 = r0 & r16
        L_0x012e:
            r15 = r28
            r1 = r0
            r0 = r27
            goto L_0x0197
        L_0x0135:
            if (r1 == 0) goto L_0x013a
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x013b
        L_0x013a:
            r1 = r2
        L_0x013b:
            if (r3 == 0) goto L_0x013f
            r2 = 1
            r4 = r2
        L_0x013f:
            if (r5 == 0) goto L_0x015a
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r13.mo5465u(r2)
            java.lang.Object r2 = r13.mo5431c0()
            androidx.compose.runtime.d$a$a r3 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r2 != r3) goto L_0x0153
            androidx.compose.foundation.interaction.k r2 = android.support.p013v4.media.C0072d.m198e(r13)
        L_0x0153:
            r3 = 0
            r13.mo5418R(r3)
            androidx.compose.foundation.interaction.j r2 = (androidx.compose.foundation.interaction.C0640j) r2
            goto L_0x015c
        L_0x015a:
            r2 = r27
        L_0x015c:
            r3 = r12 & 32
            if (r3 == 0) goto L_0x0170
            androidx.compose.runtime.t r3 = androidx.compose.material.ContentColorKt.f2199a
            java.lang.Object r3 = r13.mo5410J(r3)
            androidx.compose.ui.graphics.s r3 = (androidx.compose.p015ui.graphics.C1545s) r3
            r25 = r1
            r26 = r2
            long r1 = r3.f3366a
            r0 = r0 & r15
            goto L_0x0176
        L_0x0170:
            r25 = r1
            r26 = r2
            r1 = r28
        L_0x0176:
            r3 = r12 & 64
            if (r3 == 0) goto L_0x0191
            float r3 = kotlinx.coroutines.C19543e0.m33302T(r13)
            long r5 = androidx.compose.p015ui.graphics.C1545s.m3356b(r1, r3)
            r0 = r0 & r16
            r15 = r25
            r17 = r26
            r22 = r0
            r18 = r1
            r16 = r4
            r20 = r5
            goto L_0x01a2
        L_0x0191:
            r15 = r1
            r2 = r25
            r1 = r0
            r0 = r26
        L_0x0197:
            r17 = r0
            r22 = r1
            r20 = r6
            r18 = r15
            r15 = r2
            r16 = r4
        L_0x01a2:
            r13.mo5419S()
            r0 = 1
            r1 = 0
            int r2 = r22 >> 9
            r2 = r2 & 896(0x380, float:1.256E-42)
            r2 = r2 | 6
            r3 = 2
            r25 = r0
            r26 = r1
            r27 = r18
            r29 = r13
            r30 = r2
            r31 = r3
            androidx.compose.material.ripple.c r4 = androidx.compose.material.ripple.C1244j.m2369a(r25, r26, r27, r29, r30, r31)
            r8 = -1237246709(0xffffffffb6411d0b, float:-2.8776146E-6)
            androidx.compose.material.TabKt$Tab$5 r7 = new androidx.compose.material.TabKt$Tab$5
            r0 = r7
            r1 = r15
            r2 = r23
            r3 = r17
            r5 = r16
            r6 = r24
            r9 = r7
            r7 = r32
            r10 = r8
            r8 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            androidx.compose.runtime.internal.ComposableLambdaImpl r6 = p628nj.C18263b.m30805A(r13, r10, r9)
            int r0 = r22 >> 15
            r1 = r0 & 14
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = r22 << 6
            r1 = r1 & 896(0x380, float:1.256E-42)
            r8 = r0 | r1
            r1 = r18
            r3 = r20
            r5 = r23
            r7 = r13
            m2257c(r1, r3, r5, r6, r7, r8)
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r8 = r20
        L_0x01fc:
            androidx.compose.runtime.v0 r13 = r13.mo5421U()
            if (r13 != 0) goto L_0x0203
            goto L_0x0215
        L_0x0203:
            androidx.compose.material.TabKt$Tab$6 r15 = new androidx.compose.material.TabKt$Tab$6
            r0 = r15
            r1 = r23
            r2 = r24
            r10 = r32
            r11 = r34
            r12 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12)
            r13.f3081d = r15
        L_0x0215:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabKt.m2256b(boolean, kq.a, androidx.compose.ui.d, boolean, androidx.compose.foundation.interaction.j, long, long, kq.q, androidx.compose.runtime.d, int, int):void");
    }

    /* renamed from: c */
    public static final void m2257c(long j, long j2, boolean z, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C1302d dVar, int i) {
        int i2;
        C19861p<? super C1302d, ? super Integer, C19394m> pVar2 = pVar;
        int i3 = i;
        ComposerImpl h = dVar.mo5440h(-405571117);
        long j3 = j;
        if ((i3 & 14) == 0) {
            i2 = (h.mo5434e(j3) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        long j4 = j2;
        if ((i3 & 112) == 0) {
            i2 |= h.mo5434e(j4) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i2 |= h.mo5427a(z) ? 256 : 128;
        } else {
            boolean z2 = z;
        }
        if ((i3 & 7168) == 0) {
            i2 |= h.mo5408I(pVar2) ? RecyclerView.C3084b0.FLAG_MOVED : RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE;
        }
        if ((i2 & 5851) != 1170 || !h.mo5442i()) {
            int i4 = i2 >> 6;
            Transition e = TransitionKt.m1103e(Boolean.valueOf(z), (String) null, h, i4 & 14, 2);
            TabKt$TabTransition$color$2 tabKt$TabTransition$color$2 = TabKt$TabTransition$color$2.INSTANCE;
            h.mo5465u(-1462136984);
            boolean booleanValue = ((Boolean) e.mo3412d()).booleanValue();
            h.mo5465u(1445938070);
            long j5 = booleanValue ? j3 : j4;
            h.mo5418R(false);
            C1505c f = C1545s.m3360f(j5);
            h.mo5465u(-3686930);
            boolean I = h.mo5408I(f);
            Object c0 = h.mo5431c0();
            if (I || c0 == C1302d.C1303a.f2828a) {
                c0 = (C0435k0) ColorVectorConverterKt.f975a.invoke(f);
                h.mo5407H0(c0);
            }
            h.mo5418R(false);
            h.mo5465u(1847725064);
            boolean booleanValue2 = ((Boolean) e.mo3410b()).booleanValue();
            h.mo5465u(1445938070);
            C0435k0 k0Var = (C0435k0) c0;
            long j6 = booleanValue2 ? j3 : j4;
            h.mo5418R(false);
            C1545s sVar = new C1545s(j6);
            boolean booleanValue3 = ((Boolean) e.mo3412d()).booleanValue();
            h.mo5465u(1445938070);
            long j7 = booleanValue3 ? j3 : j4;
            h.mo5418R(false);
            Transition.C0404d c = TransitionKt.m1101c(e, sVar, new C1545s(j7), (C0454t) tabKt$TabTransition$color$2.invoke(e.mo3411c(), h, 0), k0Var, "ColorAnimation", h);
            h.mo5418R(false);
            h.mo5418R(false);
            CompositionLocalKt.m2530a(new C1412t0[]{ContentColorKt.f2199a.mo5908b(new C1545s(C1545s.m3356b(((C1545s) c.getValue()).f3366a, 1.0f))), ContentAlphaKt.f2198a.mo5908b(Float.valueOf(C1545s.m3358d(((C1545s) c.getValue()).f3366a)))}, pVar2, h, (i4 & 112) | 8);
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new TabKt$TabTransition$1(j, j2, z, pVar, i);
        }
    }

    /* renamed from: d */
    public static final void m2258d(C19861p pVar, C19861p pVar2, C1302d dVar, int i) {
        int i2;
        ComposerImpl composerImpl;
        C1345l1 l1Var;
        C19861p<ComposeUiNode, LayoutDirection, C19394m> pVar3;
        ComposerImpl composerImpl2;
        C19861p<ComposeUiNode, C7282b, C19394m> pVar4;
        C1436d.C1437a aVar;
        C1345l1 l1Var2;
        C1345l1 l1Var3;
        boolean z;
        C19861p pVar5 = pVar;
        C19861p pVar6 = pVar2;
        int i3 = i;
        ComposerImpl h = dVar.mo5440h(1249848471);
        if ((i3 & 14) == 0) {
            i2 = (h.mo5408I(pVar5) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= h.mo5408I(pVar6) ? 32 : 16;
        }
        int i4 = i2;
        if ((i4 & 91) != 18 || !h.mo5442i()) {
            TabKt$TabBaselineLayout$2 tabKt$TabBaselineLayout$2 = new TabKt$TabBaselineLayout$2(pVar5, pVar6);
            h.mo5465u(-1323940314);
            C1436d.C1437a aVar2 = C1436d.C1437a.f3125b;
            C1345l1 l1Var4 = CompositionLocalsKt.f4019e;
            C7282b bVar = (C7282b) h.mo5410J(l1Var4);
            C1345l1 l1Var5 = CompositionLocalsKt.f4025k;
            LayoutDirection layoutDirection = (LayoutDirection) h.mo5410J(l1Var5);
            C1345l1 l1Var6 = CompositionLocalsKt.f4029o;
            C1843j1 j1Var = (C1843j1) h.mo5410J(l1Var6);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a = C1700o.m3617a(aVar2);
            if (h.f2715a instanceof C1299c) {
                h.mo5392A();
                if (h.f2702K) {
                    h.mo5450m(aVar3);
                } else {
                    h.mo5452n();
                }
                h.f2738x = false;
                C19861p<ComposeUiNode, C1711v, C19394m> pVar7 = ComposeUiNode.Companion.f3781e;
                Updater.m2571b(h, tabKt$TabBaselineLayout$2, pVar7);
                C19861p<ComposeUiNode, C7282b, C19394m> pVar8 = ComposeUiNode.Companion.f3780d;
                Updater.m2571b(h, bVar, pVar8);
                C19861p<ComposeUiNode, LayoutDirection, C19394m> pVar9 = ComposeUiNode.Companion.f3782f;
                Updater.m2571b(h, layoutDirection, pVar9);
                C19861p<ComposeUiNode, C1843j1, C19394m> pVar10 = ComposeUiNode.Companion.f3783g;
                C19861p<ComposeUiNode, C1843j1, C19394m> pVar11 = pVar10;
                C19861p<ComposeUiNode, C1711v, C19394m> pVar12 = pVar7;
                C19846a<ComposeUiNode> aVar4 = aVar3;
                C0326j.m868m(0, a, C13983i.m21490i(h, j1Var, pVar10, h), h, 2058660585, 1142473408);
                h.mo5465u(-2141028452);
                if (pVar5 != null) {
                    C1436d H0 = C15588c1.m25283H0(C1993m.m4358S(aVar2, "text"), f2315c, 0.0f, 2);
                    h.mo5465u(733328855);
                    C1711v c = BoxKt.m1457c(C1428a.C1429a.f3105a, false, h);
                    h.mo5465u(-1323940314);
                    C7282b bVar2 = (C7282b) h.mo5410J(l1Var4);
                    LayoutDirection layoutDirection2 = (LayoutDirection) h.mo5410J(l1Var5);
                    C1843j1 j1Var2 = (C1843j1) h.mo5410J(l1Var6);
                    ComposableLambdaImpl a2 = C1700o.m3617a(H0);
                    if (h.f2715a instanceof C1299c) {
                        h.mo5392A();
                        if (h.f2702K) {
                            h.mo5450m(aVar4);
                        } else {
                            h.mo5452n();
                        }
                        h.f2738x = false;
                        ComposerImpl composerImpl3 = h;
                        l1Var = l1Var6;
                        composerImpl2 = h;
                        pVar3 = pVar9;
                        C0326j.m868m(0, a2, C0023f.m106g(h, c, pVar12, composerImpl3, bVar2, pVar8, composerImpl2, layoutDirection2, pVar3, h, j1Var2, pVar11, h), composerImpl3, 2058660585, -2137368960);
                        h.mo5465u(-459869377);
                        pVar4 = pVar8;
                        l1Var3 = l1Var5;
                        l1Var2 = l1Var4;
                        aVar = aVar2;
                        C0472h.m1247j(i4 & 14, pVar, h, false, false, false);
                        C0071c.m194f(composerImpl2, true, false, false);
                        z = false;
                    } else {
                        C0005b.m45j0();
                        throw null;
                    }
                } else {
                    pVar4 = pVar8;
                    pVar3 = pVar9;
                    l1Var3 = l1Var5;
                    l1Var2 = l1Var4;
                    aVar = aVar2;
                    l1Var = l1Var6;
                    composerImpl2 = h;
                    z = false;
                }
                composerImpl2.mo5418R(z);
                if (pVar6 != null) {
                    C1436d S = C1993m.m4358S(aVar, ResponseConstants.ICON);
                    composerImpl2.mo5465u(733328855);
                    C1711v c2 = BoxKt.m1457c(C1428a.C1429a.f3105a, z, composerImpl2);
                    composerImpl2.mo5465u(-1323940314);
                    C7282b bVar3 = (C7282b) composerImpl2.mo5410J(l1Var2);
                    LayoutDirection layoutDirection3 = (LayoutDirection) composerImpl2.mo5410J(l1Var3);
                    C1843j1 j1Var3 = (C1843j1) composerImpl2.mo5410J(l1Var);
                    ComposableLambdaImpl a3 = C1700o.m3617a(S);
                    if (composerImpl2.f2715a instanceof C1299c) {
                        composerImpl2.mo5392A();
                        if (composerImpl2.f2702K) {
                            composerImpl2.mo5450m(aVar4);
                        } else {
                            composerImpl2.mo5452n();
                        }
                        composerImpl2.f2738x = false;
                        composerImpl = composerImpl2;
                        C0326j.m868m(0, a3, C0023f.m106g(composerImpl2, c2, pVar12, composerImpl2, bVar3, pVar4, composerImpl2, layoutDirection3, pVar3, composerImpl, j1Var3, pVar11, composerImpl), composerImpl, 2058660585, -2137368960);
                        composerImpl.mo5465u(892169960);
                        C0472h.m1247j((i4 >> 3) & 14, pVar2, composerImpl, false, false, false);
                        C0071c.m194f(composerImpl, true, false, false);
                        z = false;
                    } else {
                        C0005b.m45j0();
                        throw null;
                    }
                } else {
                    composerImpl = composerImpl2;
                }
                C0087d.m238h(composerImpl, z, z, true, z);
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
            U.f3081d = new TabKt$TabBaselineLayout$3(pVar5, pVar6, i);
        }
    }
}
