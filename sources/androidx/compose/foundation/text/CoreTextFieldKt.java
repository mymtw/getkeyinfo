package androidx.compose.foundation.text;

import android.support.p013v4.media.session.C0087d;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.text.selection.C1022p;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.semantics.SemanticsModifierKt;
import androidx.compose.p015ui.text.C1913a;
import androidx.compose.p015ui.text.C2021q;
import androidx.compose.p015ui.text.C2022r;
import androidx.compose.p015ui.text.input.C1985e;
import androidx.compose.p015ui.text.input.C1994n;
import androidx.compose.p015ui.text.input.C2002t;
import androidx.compose.p015ui.text.input.C2004v;
import androidx.compose.p015ui.text.input.TextFieldValue;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.reflect.C19421p;
import p001a0.C0005b;
import p174m0.C7282b;
import p288y.C8343c;
import p288y.C8345d;
import p504ai.C13983i;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

public final class CoreTextFieldKt {
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x05c6, code lost:
        if (r4 > ((r6 != null ? r6.longValue() : 0) + ((long) 5000))) goto L_0x05c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x052d  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0535  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x055d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x059a  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x05a4  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x05b5  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x05dd  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x064a  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0670  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x06bd  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x06ca  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x06e0  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x06ea  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x0725 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x0737  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0742  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x0764  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x076b  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x07dd  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x07e0  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x07e4  */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x0857  */
    /* JADX WARNING: Removed duplicated region for block: B:337:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0135  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1957a(androidx.compose.p015ui.text.input.TextFieldValue r57, p753kq.C19857l<? super androidx.compose.p015ui.text.input.TextFieldValue, kotlin.C19394m> r58, androidx.compose.p015ui.C1436d r59, androidx.compose.p015ui.text.C2023s r60, androidx.compose.p015ui.text.input.C2006x r61, p753kq.C19857l<? super androidx.compose.p015ui.text.C2021q, kotlin.C19394m> r62, androidx.compose.foundation.interaction.C0640j r63, androidx.compose.p015ui.graphics.C1533m r64, boolean r65, int r66, androidx.compose.p015ui.text.input.C1990j r67, androidx.compose.foundation.text.C0953g r68, boolean r69, boolean r70, p753kq.C19862q<? super p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m>, ? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r71, androidx.compose.runtime.C1302d r72, int r73, int r74, int r75) {
        /*
            r15 = r57
            r14 = r58
            r13 = r73
            r12 = r74
            r11 = r75
            java.lang.String r0 = "value"
            kotlin.jvm.internal.C19383o.m32797g(r15, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.C19383o.m32797g(r14, r0)
            r1 = 109313709(0x683fead, float:4.9650936E-35)
            r2 = r72
            androidx.compose.runtime.ComposerImpl r10 = r2.mo5440h(r1)
            r1 = r11 & 1
            if (r1 == 0) goto L_0x0024
            r1 = r13 | 6
            goto L_0x0034
        L_0x0024:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x0033
            boolean r1 = r10.mo5408I(r15)
            if (r1 == 0) goto L_0x0030
            r1 = 4
            goto L_0x0031
        L_0x0030:
            r1 = 2
        L_0x0031:
            r1 = r1 | r13
            goto L_0x0034
        L_0x0033:
            r1 = r13
        L_0x0034:
            r4 = r11 & 2
            if (r4 == 0) goto L_0x003b
            r1 = r1 | 48
            goto L_0x004b
        L_0x003b:
            r4 = r13 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004b
            boolean r4 = r10.mo5408I(r14)
            if (r4 == 0) goto L_0x0048
            r4 = 32
            goto L_0x004a
        L_0x0048:
            r4 = 16
        L_0x004a:
            r1 = r1 | r4
        L_0x004b:
            r4 = r11 & 4
            if (r4 == 0) goto L_0x0052
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0052:
            r9 = r13 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x0066
            r9 = r59
            boolean r16 = r10.mo5408I(r9)
            if (r16 == 0) goto L_0x0061
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r1 = r1 | r16
            goto L_0x0068
        L_0x0066:
            r9 = r59
        L_0x0068:
            r16 = r11 & 8
            r17 = 2048(0x800, float:2.87E-42)
            r18 = 1024(0x400, float:1.435E-42)
            if (r16 == 0) goto L_0x0073
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0087
        L_0x0073:
            r2 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x0087
            r2 = r60
            boolean r19 = r10.mo5408I(r2)
            if (r19 == 0) goto L_0x0082
            r19 = r17
            goto L_0x0084
        L_0x0082:
            r19 = r18
        L_0x0084:
            r1 = r1 | r19
            goto L_0x0089
        L_0x0087:
            r2 = r60
        L_0x0089:
            r19 = r11 & 16
            r20 = 8192(0x2000, float:1.14794E-41)
            r21 = 16384(0x4000, float:2.2959E-41)
            if (r19 == 0) goto L_0x0096
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r5 = r61
            goto L_0x00ac
        L_0x0096:
            r22 = 57344(0xe000, float:8.0356E-41)
            r22 = r13 & r22
            r5 = r61
            if (r22 != 0) goto L_0x00ac
            boolean r23 = r10.mo5408I(r5)
            if (r23 == 0) goto L_0x00a8
            r23 = r21
            goto L_0x00aa
        L_0x00a8:
            r23 = r20
        L_0x00aa:
            r1 = r1 | r23
        L_0x00ac:
            r23 = r11 & 32
            if (r23 == 0) goto L_0x00b7
            r24 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r24
            r7 = r62
            goto L_0x00cc
        L_0x00b7:
            r24 = 458752(0x70000, float:6.42848E-40)
            r24 = r13 & r24
            r7 = r62
            if (r24 != 0) goto L_0x00cc
            boolean r25 = r10.mo5408I(r7)
            if (r25 == 0) goto L_0x00c8
            r25 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ca
        L_0x00c8:
            r25 = 65536(0x10000, float:9.18355E-41)
        L_0x00ca:
            r1 = r1 | r25
        L_0x00cc:
            r25 = r11 & 64
            if (r25 == 0) goto L_0x00d7
            r26 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r26
            r8 = r63
            goto L_0x00ec
        L_0x00d7:
            r26 = 3670016(0x380000, float:5.142788E-39)
            r26 = r13 & r26
            r8 = r63
            if (r26 != 0) goto L_0x00ec
            boolean r27 = r10.mo5408I(r8)
            if (r27 == 0) goto L_0x00e8
            r27 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ea
        L_0x00e8:
            r27 = 524288(0x80000, float:7.34684E-40)
        L_0x00ea:
            r1 = r1 | r27
        L_0x00ec:
            r27 = 29360128(0x1c00000, float:7.052966E-38)
            r27 = r13 & r27
            if (r27 != 0) goto L_0x0108
            r6 = r11 & 128(0x80, float:1.794E-43)
            if (r6 != 0) goto L_0x0101
            r6 = r64
            boolean r28 = r10.mo5408I(r6)
            if (r28 == 0) goto L_0x0103
            r28 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0105
        L_0x0101:
            r6 = r64
        L_0x0103:
            r28 = 4194304(0x400000, float:5.877472E-39)
        L_0x0105:
            r1 = r1 | r28
            goto L_0x010a
        L_0x0108:
            r6 = r64
        L_0x010a:
            r3 = r11 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x0115
            r29 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r29
            r2 = r65
            goto L_0x012a
        L_0x0115:
            r29 = 234881024(0xe000000, float:1.5777218E-30)
            r29 = r13 & r29
            r2 = r65
            if (r29 != 0) goto L_0x012a
            boolean r29 = r10.mo5427a(r2)
            if (r29 == 0) goto L_0x0126
            r29 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0128
        L_0x0126:
            r29 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0128:
            r1 = r1 | r29
        L_0x012a:
            r2 = r11 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x0135
            r29 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r29
            r5 = r66
            goto L_0x014a
        L_0x0135:
            r29 = 1879048192(0x70000000, float:1.58456325E29)
            r29 = r13 & r29
            r5 = r66
            if (r29 != 0) goto L_0x014a
            boolean r29 = r10.mo5432d(r5)
            if (r29 == 0) goto L_0x0146
            r29 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0148
        L_0x0146:
            r29 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0148:
            r1 = r1 | r29
        L_0x014a:
            r29 = r12 & 14
            if (r29 != 0) goto L_0x0164
            r5 = r11 & 1024(0x400, float:1.435E-42)
            if (r5 != 0) goto L_0x015d
            r5 = r67
            boolean r29 = r10.mo5408I(r5)
            if (r29 == 0) goto L_0x015f
            r29 = 4
            goto L_0x0161
        L_0x015d:
            r5 = r67
        L_0x015f:
            r29 = 2
        L_0x0161:
            r29 = r12 | r29
            goto L_0x0168
        L_0x0164:
            r5 = r67
            r29 = r12
        L_0x0168:
            r5 = r11 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x016f
            r29 = r29 | 48
            goto L_0x0182
        L_0x016f:
            r30 = r12 & 112(0x70, float:1.57E-43)
            r6 = r68
            if (r30 != 0) goto L_0x0182
            boolean r30 = r10.mo5408I(r6)
            if (r30 == 0) goto L_0x017e
            r22 = 32
            goto L_0x0180
        L_0x017e:
            r22 = 16
        L_0x0180:
            r29 = r29 | r22
        L_0x0182:
            r6 = r29
            r7 = r11 & 4096(0x1000, float:5.74E-42)
            if (r7 == 0) goto L_0x018b
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x019f
        L_0x018b:
            r8 = r12 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x019f
            r8 = r69
            boolean r22 = r10.mo5427a(r8)
            if (r22 == 0) goto L_0x019a
            r24 = 256(0x100, float:3.59E-43)
            goto L_0x019c
        L_0x019a:
            r24 = 128(0x80, float:1.794E-43)
        L_0x019c:
            r6 = r6 | r24
            goto L_0x01a1
        L_0x019f:
            r8 = r69
        L_0x01a1:
            r8 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r8 == 0) goto L_0x01a8
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x01ba
        L_0x01a8:
            r9 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x01ba
            r9 = r70
            boolean r22 = r10.mo5427a(r9)
            if (r22 == 0) goto L_0x01b5
            goto L_0x01b7
        L_0x01b5:
            r17 = r18
        L_0x01b7:
            r6 = r6 | r17
            goto L_0x01bc
        L_0x01ba:
            r9 = r70
        L_0x01bc:
            r9 = r11 & 16384(0x4000, float:2.2959E-41)
            if (r9 == 0) goto L_0x01c5
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
            r12 = r71
            goto L_0x01d8
        L_0x01c5:
            r17 = 57344(0xe000, float:8.0356E-41)
            r17 = r12 & r17
            r12 = r71
            if (r17 != 0) goto L_0x01d8
            boolean r17 = r10.mo5408I(r12)
            if (r17 == 0) goto L_0x01d6
            r20 = r21
        L_0x01d6:
            r6 = r6 | r20
        L_0x01d8:
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r1 = r1 & r17
            r12 = 306783378(0x12492492, float:6.3469493E-28)
            if (r1 != r12) goto L_0x0211
            r1 = 46811(0xb6db, float:6.5596E-41)
            r1 = r1 & r6
            r12 = 9362(0x2492, float:1.3119E-41)
            if (r1 != r12) goto L_0x0211
            boolean r1 = r10.mo5442i()
            if (r1 != 0) goto L_0x01f1
            goto L_0x0211
        L_0x01f1:
            r10.mo5396C()
            r3 = r59
            r4 = r60
            r5 = r61
            r6 = r62
            r7 = r63
            r8 = r64
            r9 = r65
            r11 = r67
            r12 = r68
            r13 = r69
            r14 = r70
            r15 = r71
            r2 = r10
            r10 = r66
            goto L_0x0850
        L_0x0211:
            r10.mo5466u0()
            r1 = r13 & 1
            if (r1 == 0) goto L_0x0268
            boolean r1 = r10.mo5425Y()
            if (r1 == 0) goto L_0x021f
            goto L_0x0268
        L_0x021f:
            r10.mo5396C()
            r1 = r11 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0248
            r1 = r6 & -15
            r12 = r59
            r9 = r60
            r8 = r61
            r18 = r62
            r7 = r63
            r6 = r64
            r19 = r65
            r5 = r66
            r4 = r67
            r3 = r68
            r2 = r69
            r22 = r70
            r23 = r71
            r21 = r0
            r16 = r1
            goto L_0x02e7
        L_0x0248:
            r12 = r59
            r9 = r60
            r8 = r61
            r18 = r62
            r7 = r63
            r19 = r65
            r5 = r66
            r4 = r67
            r3 = r68
            r2 = r69
            r22 = r70
            r23 = r71
            r21 = r0
            r16 = r6
            r6 = r64
            goto L_0x02e7
        L_0x0268:
            if (r4 == 0) goto L_0x026d
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x026f
        L_0x026d:
            r1 = r59
        L_0x026f:
            if (r16 == 0) goto L_0x0274
            androidx.compose.ui.text.s r4 = androidx.compose.p015ui.text.C2023s.f4598d
            goto L_0x0276
        L_0x0274:
            r4 = r60
        L_0x0276:
            if (r19 == 0) goto L_0x027b
            a9.b r16 = androidx.compose.p015ui.text.input.C2006x.C2007a.f4530a
            goto L_0x027d
        L_0x027b:
            r16 = r61
        L_0x027d:
            if (r23 == 0) goto L_0x0282
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$1 r18 = androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$1.INSTANCE
            goto L_0x0284
        L_0x0282:
            r18 = r62
        L_0x0284:
            if (r25 == 0) goto L_0x0289
            r19 = 0
            goto L_0x028b
        L_0x0289:
            r19 = r63
        L_0x028b:
            r12 = r11 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L_0x029b
            androidx.compose.ui.graphics.l0 r12 = new androidx.compose.ui.graphics.l0
            r21 = r0
            r59 = r1
            long r0 = androidx.compose.p015ui.graphics.C1545s.f3364i
            r12.<init>(r0)
            goto L_0x02a1
        L_0x029b:
            r21 = r0
            r59 = r1
            r12 = r64
        L_0x02a1:
            if (r3 == 0) goto L_0x02a5
            r0 = 1
            goto L_0x02a7
        L_0x02a5:
            r0 = r65
        L_0x02a7:
            if (r2 == 0) goto L_0x02ad
            r1 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x02af
        L_0x02ad:
            r1 = r66
        L_0x02af:
            r2 = r11 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x02b8
            androidx.compose.ui.text.input.j r2 = androidx.compose.p015ui.text.input.C1990j.f4480f
            r6 = r6 & -15
            goto L_0x02ba
        L_0x02b8:
            r2 = r67
        L_0x02ba:
            if (r5 == 0) goto L_0x02bf
            androidx.compose.foundation.text.g r3 = androidx.compose.foundation.text.C0953g.f1978g
            goto L_0x02c1
        L_0x02bf:
            r3 = r68
        L_0x02c1:
            if (r7 == 0) goto L_0x02c5
            r5 = 1
            goto L_0x02c7
        L_0x02c5:
            r5 = r69
        L_0x02c7:
            if (r8 == 0) goto L_0x02cb
            r7 = 0
            goto L_0x02cd
        L_0x02cb:
            r7 = r70
        L_0x02cd:
            if (r9 == 0) goto L_0x02d2
            androidx.compose.runtime.internal.ComposableLambdaImpl r8 = androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.f1909a
            goto L_0x02d4
        L_0x02d2:
            r8 = r71
        L_0x02d4:
            r9 = r4
            r22 = r7
            r23 = r8
            r8 = r16
            r7 = r19
            r19 = r0
            r4 = r2
            r2 = r5
            r16 = r6
            r6 = r12
            r12 = r59
            r5 = r1
        L_0x02e7:
            r10.mo5419S()
            androidx.compose.ui.focus.l r0 = new androidx.compose.ui.focus.l
            r0.<init>()
            r1 = -55013392(0xfffffffffcb88ff0, float:-7.666416E36)
            r10.mo5465u(r1)
            if (r2 == 0) goto L_0x0303
            if (r22 == 0) goto L_0x02fa
            goto L_0x0303
        L_0x02fa:
            androidx.compose.runtime.l1 r1 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4026l
            java.lang.Object r1 = r10.mo5410J(r1)
            androidx.compose.ui.text.input.t r1 = (androidx.compose.p015ui.text.input.C2002t) r1
            goto L_0x0304
        L_0x0303:
            r1 = 0
        L_0x0304:
            r11 = 0
            r10.mo5418R(r11)
            androidx.compose.runtime.l1 r11 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4019e
            java.lang.Object r11 = r10.mo5410J(r11)
            m0.b r11 = (p174m0.C7282b) r11
            androidx.compose.runtime.l1 r13 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4022h
            java.lang.Object r13 = r10.mo5410J(r13)
            androidx.compose.ui.text.font.g$a r13 = (androidx.compose.p015ui.text.font.C1952g.C1953a) r13
            r24 = r12
            androidx.compose.runtime.t r12 = androidx.compose.foundation.text.selection.TextSelectionColorsKt.f2103a
            java.lang.Object r12 = r10.mo5410J(r12)
            androidx.compose.foundation.text.selection.t r12 = (androidx.compose.foundation.text.selection.C1026t) r12
            r26 = r6
            r25 = r7
            long r6 = r12.f2155b
            androidx.compose.runtime.l1 r12 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4020f
            java.lang.Object r12 = r10.mo5410J(r12)
            androidx.compose.ui.focus.d r12 = (androidx.compose.p015ui.focus.C1469d) r12
            r70 = r2
            r2 = 1
            if (r5 != r2) goto L_0x033d
            if (r19 != 0) goto L_0x033d
            boolean r2 = r4.f4481a
            if (r2 == 0) goto L_0x033d
            r2 = 1
            goto L_0x033e
        L_0x033d:
            r2 = 0
        L_0x033e:
            if (r2 == 0) goto L_0x0343
            androidx.compose.foundation.gestures.Orientation r2 = androidx.compose.foundation.gestures.Orientation.Horizontal
            goto L_0x0345
        L_0x0343:
            androidx.compose.foundation.gestures.Orientation r2 = androidx.compose.foundation.gestures.Orientation.Vertical
        L_0x0345:
            r30 = r4
            r29 = r5
            r5 = 1
            java.lang.Object[] r4 = new java.lang.Object[r5]
            r5 = 0
            r4[r5] = r2
            androidx.compose.runtime.saveable.h r5 = androidx.compose.foundation.text.TextFieldScrollerPosition.f1938f
            r71 = r1
            r1 = 1157296644(0x44faf204, float:2007.563)
            r10.mo5465u(r1)
            boolean r1 = r10.mo5408I(r2)
            r69 = r0
            java.lang.Object r0 = r10.mo5431c0()
            if (r1 != 0) goto L_0x0369
            androidx.compose.runtime.d$a$a r1 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r0 != r1) goto L_0x0371
        L_0x0369:
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1 r0 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1
            r0.<init>(r2)
            r10.mo5407H0(r0)
        L_0x0371:
            r1 = 0
            r10.mo5418R(r1)
            kq.a r0 = (p753kq.C19846a) r0
            r1 = 4
            java.lang.Object r0 = androidx.compose.runtime.saveable.C1366b.m2863a(r4, r5, r0, r10, r1)
            r5 = r0
            androidx.compose.foundation.text.TextFieldScrollerPosition r5 = (androidx.compose.foundation.text.TextFieldScrollerPosition) r5
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r10.mo5465u(r0)
            boolean r0 = r10.mo5408I(r15)
            boolean r1 = r10.mo5408I(r8)
            r0 = r0 | r1
            java.lang.Object r1 = r10.mo5431c0()
            if (r0 != 0) goto L_0x03a1
            androidx.compose.runtime.d$a$a r0 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r1 != r0) goto L_0x0399
            goto L_0x03a1
        L_0x0399:
            r28 = r5
            r32 = r6
            r31 = r8
            goto L_0x0424
        L_0x03a1:
            androidx.compose.ui.text.a r0 = r15.f4448a
            r1 = r8
            a9.b r1 = (p010a9.C0048b) r1
            r1.getClass()
            java.lang.String r1 = "text"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            androidx.compose.ui.text.input.w r1 = new androidx.compose.ui.text.input.w
            androidx.compose.ui.text.input.n$a$a r2 = androidx.compose.p015ui.text.input.C1994n.C1995a.f4512a
            r1.<init>(r0, r2)
            androidx.compose.ui.text.r r0 = r15.f4450c
            if (r0 == 0) goto L_0x041b
            r28 = r5
            long r4 = r0.f4597a
            androidx.compose.ui.text.a$a r0 = new androidx.compose.ui.text.a$a
            androidx.compose.ui.text.a r2 = r1.f4528a
            r0.<init>(r2)
            androidx.compose.ui.text.n r2 = new androidx.compose.ui.text.n
            r31 = r2
            r32 = 0
            r34 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            androidx.compose.ui.text.style.e r48 = androidx.compose.p015ui.text.style.C2030e.f4613c
            r49 = 0
            r50 = 12287(0x2fff, float:1.7218E-41)
            r31.<init>((long) r32, (long) r34, (androidx.compose.p015ui.text.font.C1959m) r36, (androidx.compose.p015ui.text.font.C1957k) r37, (androidx.compose.p015ui.text.font.C1958l) r38, (androidx.compose.p015ui.text.font.C1952g) r39, (java.lang.String) r40, (long) r41, (androidx.compose.p015ui.text.style.C2025a) r43, (androidx.compose.p015ui.text.style.C2032g) r44, (p157k0.C7175c) r45, (long) r46, (androidx.compose.p015ui.text.style.C2030e) r48, (androidx.compose.p015ui.graphics.C1528j0) r49, (int) r50)
            r31 = r8
            androidx.compose.ui.text.input.n r8 = r1.f4529b
            int r32 = androidx.compose.p015ui.text.C2022r.f4596c
            r32 = r6
            r27 = 32
            long r6 = r4 >> r27
            int r6 = (int) r6
            int r6 = r8.mo7684b(r6)
            androidx.compose.ui.text.input.n r7 = r1.f4529b
            int r4 = androidx.compose.p015ui.text.C2022r.m4464c(r4)
            int r4 = r7.mo7684b(r4)
            java.util.ArrayList r5 = r0.f4301b
            androidx.compose.ui.text.a$a$a r7 = new androidx.compose.ui.text.a$a$a
            r7.<init>(r2, r6, r4)
            r5.add(r7)
            androidx.compose.ui.text.a r0 = r0.mo7398b()
            androidx.compose.ui.text.input.n r1 = r1.f4529b
            androidx.compose.ui.text.input.w r2 = new androidx.compose.ui.text.input.w
            r2.<init>(r0, r1)
            r1 = r2
            goto L_0x0421
        L_0x041b:
            r28 = r5
            r32 = r6
            r31 = r8
        L_0x0421:
            r10.mo5407H0(r1)
        L_0x0424:
            r0 = 0
            r10.mo5418R(r0)
            r0 = r1
            androidx.compose.ui.text.input.w r0 = (androidx.compose.p015ui.text.input.C2005w) r0
            androidx.compose.ui.text.a r1 = r0.f4528a
            androidx.compose.ui.text.input.n r2 = r0.f4529b
            androidx.compose.runtime.v0 r4 = r10.mo5461s()
            if (r4 == 0) goto L_0x0872
            r10.mo5398D(r4)
            r5 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.mo5465u(r5)
            java.lang.Object r6 = r10.mo5431c0()
            androidx.compose.runtime.d$a$a r7 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r6 != r7) goto L_0x046b
            androidx.compose.foundation.text.TextFieldState r6 = new androidx.compose.foundation.text.TextFieldState
            androidx.compose.foundation.text.k r8 = new androidx.compose.foundation.text.k
            r27 = 0
            r34 = 0
            r35 = 148(0x94, float:2.07E-43)
            r59 = r8
            r60 = r1
            r61 = r9
            r62 = r27
            r63 = r19
            r64 = r34
            r65 = r11
            r66 = r13
            r67 = r35
            r59.<init>((androidx.compose.p015ui.text.C1913a) r60, (androidx.compose.p015ui.text.C2023s) r61, (int) r62, (boolean) r63, (int) r64, (p174m0.C7282b) r65, (androidx.compose.p015ui.text.font.C1952g.C1953a) r66, (int) r67)
            r6.<init>(r8, r4)
            r10.mo5407H0(r6)
        L_0x046b:
            r4 = 0
            r10.mo5418R(r4)
            r8 = r6
            androidx.compose.foundation.text.TextFieldState r8 = (androidx.compose.foundation.text.TextFieldState) r8
            r8.getClass()
            java.lang.String r4 = "visualText"
            kotlin.jvm.internal.C19383o.m32797g(r1, r4)
            java.lang.String r4 = "textStyle"
            kotlin.jvm.internal.C19383o.m32797g(r9, r4)
            java.lang.String r4 = "density"
            kotlin.jvm.internal.C19383o.m32797g(r11, r4)
            java.lang.String r4 = "fontFamilyResolver"
            kotlin.jvm.internal.C19383o.m32797g(r13, r4)
            java.lang.String r4 = "keyboardActions"
            kotlin.jvm.internal.C19383o.m32797g(r3, r4)
            java.lang.String r4 = "focusManager"
            kotlin.jvm.internal.C19383o.m32797g(r12, r4)
            r8.f1957n = r14
            androidx.compose.ui.graphics.e r4 = r8.f1960q
            r5 = r32
            r4.mo6241e(r5)
            androidx.compose.foundation.text.e r4 = r8.f1956m
            r4.getClass()
            r4.f1976a = r3
            r4.f1977b = r12
            androidx.compose.foundation.text.k r4 = r8.f1944a
            kotlin.collections.EmptyList r5 = kotlin.collections.EmptyList.INSTANCE
            r6 = 1
            r12 = 2147483647(0x7fffffff, float:NaN)
            r59 = r4
            r60 = r1
            r61 = r9
            r62 = r11
            r63 = r13
            r64 = r19
            r65 = r6
            r66 = r12
            r67 = r5
            androidx.compose.foundation.text.k r1 = androidx.compose.foundation.text.CoreTextKt.m1965b(r59, r60, r61, r62, r63, r64, r65, r66, r67)
            r8.f1944a = r1
            androidx.compose.ui.text.input.e r1 = r8.f1946c
            androidx.compose.ui.text.input.v r4 = r8.f1947d
            r1.getClass()
            androidx.compose.ui.text.r r5 = r15.f4450c
            androidx.compose.ui.text.input.f r6 = r1.f4469b
            int r11 = r6.f4473d
            r12 = -1
            if (r11 == r12) goto L_0x04d7
            r13 = 1
            goto L_0x04d8
        L_0x04d7:
            r13 = 0
        L_0x04d8:
            if (r13 == 0) goto L_0x04e6
            int r6 = r6.f4474e
            long r12 = p001a0.C0005b.m47l(r11, r6)
            androidx.compose.ui.text.r r6 = new androidx.compose.ui.text.r
            r6.<init>(r12)
            goto L_0x04e7
        L_0x04e6:
            r6 = 0
        L_0x04e7:
            boolean r5 = kotlin.jvm.internal.C19383o.m32792b(r5, r6)
            r6 = 1
            r5 = r5 ^ r6
            androidx.compose.ui.text.input.TextFieldValue r6 = r1.f4468a
            androidx.compose.ui.text.a r6 = r6.f4448a
            androidx.compose.ui.text.a r11 = r15.f4448a
            boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r6, r11)
            if (r6 != 0) goto L_0x0506
            androidx.compose.ui.text.input.f r6 = new androidx.compose.ui.text.input.f
            androidx.compose.ui.text.a r11 = r15.f4448a
            long r12 = r15.f4449b
            r6.<init>(r11, r12)
            r1.f4469b = r6
            r6 = 1
            goto L_0x0527
        L_0x0506:
            androidx.compose.ui.text.input.TextFieldValue r6 = r1.f4468a
            long r11 = r6.f4449b
            long r13 = r15.f4449b
            boolean r6 = androidx.compose.p015ui.text.C2022r.m4462a(r11, r13)
            if (r6 != 0) goto L_0x0526
            androidx.compose.ui.text.input.f r6 = r1.f4469b
            long r11 = r15.f4449b
            int r11 = androidx.compose.p015ui.text.C2022r.m4466e(r11)
            long r12 = r15.f4449b
            int r12 = androidx.compose.p015ui.text.C2022r.m4465d(r12)
            r6.mo7663f(r11, r12)
            r6 = 1
            r11 = 0
            goto L_0x0529
        L_0x0526:
            r6 = 0
        L_0x0527:
            r11 = r6
            r6 = 0
        L_0x0529:
            androidx.compose.ui.text.r r12 = r15.f4450c
            if (r12 != 0) goto L_0x0535
            androidx.compose.ui.text.input.f r12 = r1.f4469b
            r13 = -1
            r12.f4473d = r13
            r12.f4474e = r13
            goto L_0x0557
        L_0x0535:
            long r12 = r12.f4597a
            boolean r12 = androidx.compose.p015ui.text.C2022r.m4463b(r12)
            if (r12 != 0) goto L_0x0557
            androidx.compose.ui.text.input.f r12 = r1.f4469b
            androidx.compose.ui.text.r r13 = r15.f4450c
            long r13 = r13.f4597a
            int r13 = androidx.compose.p015ui.text.C2022r.m4466e(r13)
            androidx.compose.ui.text.r r14 = r15.f4450c
            r32 = r8
            r27 = r9
            long r8 = r14.f4597a
            int r8 = androidx.compose.p015ui.text.C2022r.m4465d(r8)
            r12.mo7662e(r13, r8)
            goto L_0x055b
        L_0x0557:
            r32 = r8
            r27 = r9
        L_0x055b:
            if (r11 != 0) goto L_0x0564
            if (r6 != 0) goto L_0x0562
            if (r5 == 0) goto L_0x0562
            goto L_0x0564
        L_0x0562:
            r5 = r15
            goto L_0x0573
        L_0x0564:
            androidx.compose.ui.text.input.f r5 = r1.f4469b
            r6 = -1
            r5.f4473d = r6
            r5.f4474e = r6
            r5 = 0
            r8 = 3
            r9 = 0
            androidx.compose.ui.text.input.TextFieldValue r5 = androidx.compose.p015ui.text.input.TextFieldValue.m4312a(r15, r9, r5, r8)
        L_0x0573:
            androidx.compose.ui.text.input.TextFieldValue r6 = r1.f4468a
            r1.f4468a = r5
            if (r4 == 0) goto L_0x058e
            androidx.compose.ui.text.input.t r1 = r4.f4526a
            java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.text.input.v> r1 = r1.f4524b
            java.lang.Object r1 = r1.get()
            androidx.compose.ui.text.input.v r1 = (androidx.compose.p015ui.text.input.C2004v) r1
            boolean r1 = kotlin.jvm.internal.C19383o.m32792b(r1, r4)
            if (r1 == 0) goto L_0x058e
            androidx.compose.ui.text.input.p r1 = r4.f4527b
            r1.mo7640d(r6, r5)
        L_0x058e:
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.mo5465u(r1)
            java.lang.Object r1 = r10.mo5431c0()
            if (r1 != r7) goto L_0x05a4
            androidx.compose.foundation.text.s r1 = new androidx.compose.foundation.text.s
            r4 = 0
            r1.<init>(r4)
            r10.mo5407H0(r1)
            goto L_0x05a5
        L_0x05a4:
            r4 = 0
        L_0x05a5:
            r10.mo5418R(r4)
            androidx.compose.foundation.text.s r1 = (androidx.compose.foundation.text.C0966s) r1
            long r4 = java.lang.System.currentTimeMillis()
            r1.getClass()
            boolean r6 = r1.f2050f
            if (r6 != 0) goto L_0x05c8
            java.lang.Long r6 = r1.f2049e
            if (r6 == 0) goto L_0x05be
            long r8 = r6.longValue()
            goto L_0x05c0
        L_0x05be:
            r8 = 0
        L_0x05c0:
            r6 = 5000(0x1388, float:7.006E-42)
            long r11 = (long) r6
            long r8 = r8 + r11
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x05d1
        L_0x05c8:
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.f2049e = r4
            r1.mo4581a(r15)
        L_0x05d1:
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.mo5465u(r4)
            java.lang.Object r4 = r10.mo5431c0()
            if (r4 != r7) goto L_0x05e5
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r4 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager
            r4.<init>(r1)
            r10.mo5407H0(r4)
        L_0x05e5:
            r5 = 0
            r10.mo5418R(r5)
            r14 = r4
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r14 = (androidx.compose.foundation.text.selection.TextFieldSelectionManager) r14
            r14.getClass()
            java.lang.String r4 = "<set-?>"
            kotlin.jvm.internal.C19383o.m32797g(r2, r4)
            r14.f2084b = r2
            r8 = r31
            kotlin.jvm.internal.C19383o.m32797g(r8, r4)
            r9 = r32
            kq.l<androidx.compose.ui.text.input.TextFieldValue, kotlin.m> r5 = r9.f1958o
            kotlin.jvm.internal.C19383o.m32797g(r5, r4)
            r14.f2085c = r5
            r14.f2086d = r9
            androidx.compose.runtime.ParcelableSnapshotMutableState r4 = r14.f2087e
            r4.setValue(r15)
            androidx.compose.runtime.l1 r4 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4018d
            java.lang.Object r4 = r10.mo5410J(r4)
            androidx.compose.ui.platform.e0 r4 = (androidx.compose.p015ui.platform.C1827e0) r4
            r14.f2088f = r4
            androidx.compose.runtime.l1 r4 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4027m
            java.lang.Object r4 = r10.mo5410J(r4)
            androidx.compose.ui.platform.c1 r4 = (androidx.compose.p015ui.platform.C1822c1) r4
            r14.f2089g = r4
            androidx.compose.runtime.l1 r4 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4023i
            java.lang.Object r4 = r10.mo5410J(r4)
            b0.a r4 = (p020b0.C3449a) r4
            r14.f2090h = r4
            r4 = r69
            r14.f2091i = r4
            r5 = r22 ^ 1
            androidx.compose.runtime.ParcelableSnapshotMutableState r6 = r14.f2092j
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r5)
            r6.setValue(r11)
            r6 = 773894976(0x2e20b340, float:3.6538994E-11)
            r10.mo5465u(r6)
            r6 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.mo5465u(r6)
            java.lang.Object r6 = r10.mo5431c0()
            if (r6 != r7) goto L_0x0659
            kotlin.coroutines.EmptyCoroutineContext r6 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlinx.coroutines.internal.f r6 = androidx.compose.runtime.C1415u.m3034h(r6, r10)
            androidx.compose.runtime.m r11 = new androidx.compose.runtime.m
            r11.<init>(r6)
            r10.mo5407H0(r11)
            r6 = r11
        L_0x0659:
            r11 = 0
            r10.mo5418R(r11)
            androidx.compose.runtime.m r6 = (androidx.compose.runtime.C1346m) r6
            kotlinx.coroutines.d0 r6 = r6.f2939b
            r10.mo5418R(r11)
            r11 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.mo5465u(r11)
            java.lang.Object r11 = r10.mo5431c0()
            if (r11 != r7) goto L_0x0678
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl r11 = new androidx.compose.foundation.relocation.BringIntoViewRequesterImpl
            r11.<init>()
            r10.mo5407H0(r11)
        L_0x0678:
            r7 = 0
            r10.mo5418R(r7)
            r12 = r11
            androidx.compose.foundation.relocation.d r12 = (androidx.compose.foundation.relocation.C0882d) r12
            androidx.compose.ui.d$a r11 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1 r13 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1
            r59 = r13
            r60 = r9
            r61 = r71
            r62 = r57
            r63 = r30
            r64 = r14
            r65 = r6
            r66 = r12
            r67 = r2
            r59.<init>(r60, r61, r62, r63, r64, r65, r66, r67)
            androidx.compose.ui.d r6 = androidx.compose.p015ui.focus.FocusRequesterModifierKt.m3105a(r11, r4)
            androidx.compose.ui.d r6 = androidx.compose.p015ui.focus.FocusChangedModifierKt.m3096a(r6, r13)
            r13 = r70
            r7 = r25
            androidx.compose.ui.d r6 = androidx.compose.foundation.FocusableKt.m1305b(r7, r6, r13)
            r25 = r3
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2 r3 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2
            r3.<init>(r9)
            androidx.compose.runtime.C1415u.m3028b(r9, r3, r10)
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$b r3 = r14.f2099q
            r70 = r12
            java.lang.String r12 = "observer"
            kotlin.jvm.internal.C19383o.m32797g(r3, r12)
            if (r13 == 0) goto L_0x06ca
            androidx.compose.foundation.text.TextFieldGestureModifiersKt$longPressDragGestureFilter$1 r12 = new androidx.compose.foundation.text.TextFieldGestureModifiersKt$longPressDragGestureFilter$1
            r31 = r8
            r8 = 0
            r12.<init>(r3, r8)
            androidx.compose.ui.d r3 = androidx.compose.p015ui.input.pointer.SuspendingPointerInputFilterKt.m3484b(r11, r3, r12)
            goto L_0x06cd
        L_0x06ca:
            r31 = r8
            r3 = r11
        L_0x06cd:
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$1 r8 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$1
            r59 = r8
            r60 = r9
            r61 = r4
            r62 = r22
            r63 = r14
            r64 = r2
            r59.<init>(r60, r61, r62, r63, r64)
            if (r13 == 0) goto L_0x06ea
            androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1 r12 = new androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1
            r12.<init>(r8, r7)
            androidx.compose.ui.d r8 = androidx.compose.p015ui.ComposedModifierKt.m3049a(r11, androidx.compose.p015ui.platform.InspectableValueKt.f4032a, r12)
            goto L_0x06eb
        L_0x06ea:
            r8 = r11
        L_0x06eb:
            androidx.compose.ui.d r3 = r8.mo6148i0(r3)
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1 r8 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1
            r8.<init>(r9, r15, r2)
            androidx.compose.ui.d r12 = androidx.compose.p015ui.draw.DrawModifierKt.m3070a(r11, r8)
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1 r8 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1
            r8.<init>(r9, r13, r14)
            androidx.compose.ui.d r32 = com.google.android.play.core.assetpacks.C15588c1.m25270A0(r11, r8)
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1 r8 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1
            r33 = 0
            r59 = r8
            r60 = r30
            r61 = r0
            r62 = r57
            r63 = r13
            r64 = r33
            r65 = r22
            r66 = r9
            r67 = r2
            r68 = r14
            r69 = r4
            r59.<init>(r60, r61, r62, r63, r64, r65, r66, r67, r68, r69)
            r0 = 1
            androidx.compose.ui.d r4 = androidx.compose.p015ui.semantics.SemanticsModifierKt.m4174a(r11, r0, r8)
            if (r13 == 0) goto L_0x0729
            if (r22 != 0) goto L_0x0729
            r0 = 1
            goto L_0x072a
        L_0x0729:
            r0 = 0
        L_0x072a:
            float r8 = androidx.compose.foundation.text.C0959m.f2023a
            java.lang.String r8 = "cursorBrush"
            r68 = r12
            r12 = r26
            kotlin.jvm.internal.C19383o.m32797g(r12, r8)
            if (r0 == 0) goto L_0x0742
            androidx.compose.foundation.text.TextFieldCursorKt$cursor$1 r0 = new androidx.compose.foundation.text.TextFieldCursorKt$cursor$1
            r0.<init>(r12, r9, r15, r2)
            androidx.compose.ui.d r0 = androidx.compose.p015ui.ComposedModifierKt.m3049a(r11, androidx.compose.p015ui.platform.InspectableValueKt.f4032a, r0)
            r8 = r0
            goto L_0x0743
        L_0x0742:
            r8 = r11
        L_0x0743:
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3 r0 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3
            r0.<init>(r14)
            androidx.compose.runtime.C1415u.m3028b(r14, r0, r10)
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4 r0 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4
            r69 = r8
            r26 = r12
            r12 = r30
            r8 = r71
            r0.<init>(r8, r9, r15, r12)
            androidx.compose.runtime.C1415u.m3028b(r12, r0, r10)
            kq.l<androidx.compose.ui.text.input.TextFieldValue, kotlin.m> r0 = r9.f1958o
            r17 = r10
            r8 = r29
            r10 = 1
            if (r8 != r10) goto L_0x076b
            r56 = r21
            r21 = r10
            r10 = r56
            goto L_0x076f
        L_0x076b:
            r10 = r21
            r21 = 0
        L_0x076f:
            kotlin.jvm.internal.C19383o.m32797g(r0, r10)
            androidx.compose.foundation.text.TextFieldKeyInputKt$textFieldKeyInput$2 r10 = new androidx.compose.foundation.text.TextFieldKeyInputKt$textFieldKeyInput$2
            r59 = r10
            r60 = r9
            r61 = r14
            r62 = r57
            r63 = r5
            r64 = r21
            r65 = r2
            r66 = r1
            r67 = r0
            r59.<init>(r60, r61, r62, r63, r64, r65, r66, r67)
            androidx.compose.ui.d r0 = androidx.compose.p015ui.ComposedModifierKt.m3049a(r11, androidx.compose.p015ui.platform.InspectableValueKt.f4032a, r10)
            r10 = r24
            androidx.compose.ui.d r1 = r10.mo6148i0(r6)
            androidx.compose.foundation.text.CoreTextFieldKt$previewKeyEventToDeselectOnBack$1 r2 = new androidx.compose.foundation.text.CoreTextFieldKt$previewKeyEventToDeselectOnBack$1
            r2.<init>(r9, r14)
            f0.e<androidx.compose.ui.input.key.d> r5 = androidx.compose.p015ui.input.key.KeyInputModifierKt.f3575a
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r1, r5)
            kq.l<androidx.compose.ui.platform.o0, kotlin.m> r5 = androidx.compose.p015ui.platform.InspectableValueKt.f4032a
            androidx.compose.ui.input.key.d r6 = new androidx.compose.ui.input.key.d
            r10 = 0
            r6.<init>(r10, r2)
            androidx.compose.ui.d r1 = androidx.compose.p015ui.platform.InspectableValueKt.m3945a(r1, r6)
            androidx.compose.ui.d r0 = r1.mo6148i0(r0)
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            java.lang.String r1 = "scrollerPosition"
            r6 = r28
            kotlin.jvm.internal.C19383o.m32797g(r6, r1)
            androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2 r1 = new androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2
            r1.<init>(r6, r13, r7)
            androidx.compose.ui.d r0 = androidx.compose.p015ui.ComposedModifierKt.m3049a(r0, r5, r1)
            androidx.compose.ui.d r0 = r0.mo6148i0(r3)
            androidx.compose.ui.d r0 = r0.mo6148i0(r4)
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1 r1 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
            r1.<init>(r9)
            androidx.compose.ui.d r10 = com.google.android.play.core.assetpacks.C15588c1.m25270A0(r0, r1)
            if (r13 == 0) goto L_0x07e0
            boolean r0 = r9.mo4561b()
            if (r0 == 0) goto L_0x07e0
            r29 = 1
            goto L_0x07e2
        L_0x07e0:
            r29 = 0
        L_0x07e2:
            if (r29 == 0) goto L_0x07e9
            androidx.compose.ui.d r0 = androidx.compose.foundation.text.selection.C1024r.m2143a(r14)
            r11 = r0
        L_0x07e9:
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5 r5 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5
            r0 = r5
            r1 = r23
            r20 = r13
            r2 = r16
            r21 = r25
            r3 = r8
            r25 = r12
            r4 = r27
            r13 = r5
            r28 = r8
            r5 = r6
            r6 = r57
            r30 = r7
            r7 = r31
            r16 = r9
            r8 = r69
            r9 = r68
            r51 = r10
            r52 = r17
            r12 = r24
            r10 = r32
            r12 = r70
            r53 = r13
            r13 = r16
            r59 = r14
            r15 = r29
            r16 = r22
            r17 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0 = -1885146845(0xffffffff8fa2f123, float:-1.6067316E-29)
            r2 = r52
            r1 = r53
            androidx.compose.runtime.internal.ComposableLambdaImpl r0 = p628nj.C18263b.m30805A(r2, r0, r1)
            r1 = 448(0x1c0, float:6.28E-43)
            r4 = r59
            r3 = r51
            m1958b(r3, r4, r0, r2, r1)
            r6 = r18
            r9 = r19
            r13 = r20
            r12 = r21
            r14 = r22
            r15 = r23
            r3 = r24
            r11 = r25
            r8 = r26
            r4 = r27
            r10 = r28
            r7 = r30
            r5 = r31
        L_0x0850:
            androidx.compose.runtime.v0 r2 = r2.mo5421U()
            if (r2 != 0) goto L_0x0857
            goto L_0x0871
        L_0x0857:
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$6 r1 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$6
            r0 = r1
            r54 = r1
            r1 = r57
            r55 = r2
            r2 = r58
            r16 = r73
            r17 = r74
            r18 = r75
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0 = r54
            r1 = r55
            r1.f3081d = r0
        L_0x0871:
            return
        L_0x0872:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "no recompose scope found"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt.m1957a(androidx.compose.ui.text.input.TextFieldValue, kq.l, androidx.compose.ui.d, androidx.compose.ui.text.s, androidx.compose.ui.text.input.x, kq.l, androidx.compose.foundation.interaction.j, androidx.compose.ui.graphics.m, boolean, int, androidx.compose.ui.text.input.j, androidx.compose.foundation.text.g, boolean, boolean, kq.q, androidx.compose.runtime.d, int, int, int):void");
    }

    /* renamed from: b */
    public static final void m1958b(C1436d dVar, TextFieldSelectionManager textFieldSelectionManager, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C1302d dVar2, int i) {
        ComposerImpl h = dVar2.mo5440h(-20551815);
        int i2 = (i & 14) | 384;
        h.mo5465u(733328855);
        C1711v c = BoxKt.m1457c(C1428a.C1429a.f3105a, true, h);
        h.mo5465u(-1323940314);
        C7282b bVar = (C7282b) h.mo5410J(CompositionLocalsKt.f4019e);
        LayoutDirection layoutDirection = (LayoutDirection) h.mo5410J(CompositionLocalsKt.f4025k);
        C1843j1 j1Var = (C1843j1) h.mo5410J(CompositionLocalsKt.f4029o);
        ComposeUiNode.f3776c0.getClass();
        C19846a<ComposeUiNode> aVar = ComposeUiNode.Companion.f3778b;
        ComposableLambdaImpl a = C1700o.m3617a(dVar);
        int i3 = ((((i2 << 3) & 112) << 9) & 7168) | 6;
        if (h.f2715a instanceof C1299c) {
            h.mo5392A();
            if (h.f2702K) {
                h.mo5450m(aVar);
            } else {
                h.mo5452n();
            }
            h.f2738x = false;
            Updater.m2571b(h, c, ComposeUiNode.Companion.f3781e);
            Updater.m2571b(h, bVar, ComposeUiNode.Companion.f3780d);
            Updater.m2571b(h, layoutDirection, ComposeUiNode.Companion.f3782f);
            a.invoke(C13983i.m21490i(h, j1Var, ComposeUiNode.Companion.f3783g, h), h, Integer.valueOf((i3 >> 3) & 112));
            h.mo5465u(2058660585);
            h.mo5465u(-2137368960);
            if (((i3 >> 9) & 14 & 11) != 2 || !h.mo5442i()) {
                h.mo5465u(1524757375);
                if (((((i2 >> 6) & 112) | 6) & 81) != 16 || !h.mo5442i()) {
                    ContextMenu_androidKt.m1956b(textFieldSelectionManager, pVar, h, ((i >> 3) & 112) | 8);
                } else {
                    h.mo5396C();
                }
                h.mo5418R(false);
            } else {
                h.mo5396C();
            }
            C0087d.m238h(h, false, false, true, false);
            h.mo5418R(false);
            C1418v0 U = h.mo5421U();
            if (U != null) {
                U.f3081d = new CoreTextFieldKt$CoreTextFieldRootBox$2(dVar, textFieldSelectionManager, pVar, i);
                return;
            }
            return;
        }
        C0005b.m45j0();
        throw null;
    }

    /* renamed from: c */
    public static final void m1959c(TextFieldSelectionManager textFieldSelectionManager, C1302d dVar, int i) {
        C19383o.m32797g(textFieldSelectionManager, "manager");
        ComposerImpl h = dVar.mo5440h(-1436003720);
        TextFieldState textFieldState = textFieldSelectionManager.f2086d;
        boolean z = true;
        if (textFieldState == null || !((Boolean) textFieldState.f1955l.getValue()).booleanValue()) {
            z = false;
        }
        if (z) {
            h.mo5465u(1157296644);
            boolean I = h.mo5408I(textFieldSelectionManager);
            Object c0 = h.mo5431c0();
            if (I || c0 == C1302d.C1303a.f2828a) {
                c0 = new C1022p(textFieldSelectionManager);
                h.mo5407H0(c0);
            }
            h.mo5418R(false);
            C0958l lVar = (C0958l) c0;
            C7282b bVar = (C7282b) h.mo5410J(CompositionLocalsKt.f4019e);
            C19383o.m32797g(bVar, "density");
            C1994n nVar = textFieldSelectionManager.f2084b;
            long j = textFieldSelectionManager.mo4651j().f4449b;
            int i2 = C2022r.f4596c;
            int b = nVar.mo7684b((int) (j >> 32));
            TextFieldState textFieldState2 = textFieldSelectionManager.f2086d;
            C0965r c = textFieldState2 != null ? textFieldState2.mo4562c() : null;
            C19383o.m32794d(c);
            C2021q qVar = c.f2042a;
            C8345d c2 = qVar.mo7740c(C19388s.m32833M(b, 0, qVar.f4589a.f4556a.length()));
            long q = C19421p.m32952q((bVar.mo3789B0(C0959m.f2023a) / ((float) 2)) + c2.f18301a, c2.f18304d);
            C1436d b2 = SuspendingPointerInputFilterKt.m3484b(C1436d.C1437a.f3125b, lVar, new CoreTextFieldKt$TextFieldCursorHandle$1(lVar, (C19340c<? super CoreTextFieldKt$TextFieldCursorHandle$1>) null));
            C8343c cVar = new C8343c(q);
            h.mo5465u(1157296644);
            boolean I2 = h.mo5408I(cVar);
            Object c02 = h.mo5431c0();
            if (I2 || c02 == C1302d.C1303a.f2828a) {
                c02 = new CoreTextFieldKt$TextFieldCursorHandle$2$1(q);
                h.mo5407H0(c02);
            }
            h.mo5418R(false);
            AndroidCursorHandle_androidKt.m1949a(q, SemanticsModifierKt.m4174a(b2, false, (C19857l) c02), (C19861p<? super C1302d, ? super Integer, C19394m>) null, h, 384);
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new CoreTextFieldKt$TextFieldCursorHandle$3(textFieldSelectionManager, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r0 = r0.mo4562c();
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1960d(androidx.compose.foundation.text.selection.TextFieldSelectionManager r7, boolean r8, androidx.compose.runtime.C1302d r9, int r10) {
        /*
            r0 = 626339208(0x25552d88, float:1.8490232E-16)
            androidx.compose.runtime.ComposerImpl r9 = r9.mo5440h(r0)
            if (r8 == 0) goto L_0x00c2
            androidx.compose.foundation.text.TextFieldState r0 = r7.f2086d
            if (r0 == 0) goto L_0x0016
            androidx.compose.foundation.text.r r0 = r0.mo4562c()
            if (r0 == 0) goto L_0x0016
            androidx.compose.ui.text.q r0 = r0.f2042a
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            if (r0 != 0) goto L_0x001b
            goto L_0x00c5
        L_0x001b:
            androidx.compose.ui.text.input.TextFieldValue r1 = r7.mo4651j()
            long r1 = r1.f4449b
            boolean r1 = androidx.compose.p015ui.text.C2022r.m4463b(r1)
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0095
            androidx.compose.ui.text.input.n r1 = r7.f2084b
            androidx.compose.ui.text.input.TextFieldValue r4 = r7.mo4651j()
            long r4 = r4.f4449b
            r6 = 32
            long r4 = r4 >> r6
            int r4 = (int) r4
            int r1 = r1.mo7684b(r4)
            androidx.compose.ui.text.input.n r4 = r7.f2084b
            androidx.compose.ui.text.input.TextFieldValue r5 = r7.mo4651j()
            long r5 = r5.f4449b
            int r5 = androidx.compose.p015ui.text.C2022r.m4464c(r5)
            int r4 = r4.mo7684b(r5)
            androidx.compose.ui.text.style.ResolvedTextDirection r1 = r0.mo7738a(r1)
            int r4 = r4 - r2
            int r4 = java.lang.Math.max(r4, r3)
            androidx.compose.ui.text.style.ResolvedTextDirection r0 = r0.mo7738a(r4)
            r4 = -498396421(0xffffffffe24b12fb, float:-9.365142E20)
            r9.mo5465u(r4)
            androidx.compose.foundation.text.TextFieldState r4 = r7.f2086d
            if (r4 == 0) goto L_0x0070
            androidx.compose.runtime.ParcelableSnapshotMutableState r4 = r4.f1953j
            java.lang.Object r4 = r4.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != r2) goto L_0x0070
            r4 = r2
            goto L_0x0071
        L_0x0070:
            r4 = r3
        L_0x0071:
            r5 = 518(0x206, float:7.26E-43)
            if (r4 == 0) goto L_0x0078
            androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.m2057a(r2, r1, r7, r9, r5)
        L_0x0078:
            r9.mo5418R(r3)
            androidx.compose.foundation.text.TextFieldState r1 = r7.f2086d
            if (r1 == 0) goto L_0x008f
            androidx.compose.runtime.ParcelableSnapshotMutableState r1 = r1.f1954k
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != r2) goto L_0x008f
            r1 = r2
            goto L_0x0090
        L_0x008f:
            r1 = r3
        L_0x0090:
            if (r1 == 0) goto L_0x0095
            androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.m2057a(r3, r0, r7, r9, r5)
        L_0x0095:
            androidx.compose.foundation.text.TextFieldState r0 = r7.f2086d
            if (r0 == 0) goto L_0x00c5
            androidx.compose.ui.text.input.TextFieldValue r1 = r7.f2098p
            androidx.compose.ui.text.a r1 = r1.f4448a
            java.lang.String r1 = r1.f4296b
            androidx.compose.ui.text.input.TextFieldValue r4 = r7.mo4651j()
            androidx.compose.ui.text.a r4 = r4.f4448a
            java.lang.String r4 = r4.f4296b
            boolean r1 = kotlin.jvm.internal.C19383o.m32792b(r1, r4)
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x00b0
            r0.f1952i = r3
        L_0x00b0:
            boolean r1 = r0.mo4561b()
            if (r1 == 0) goto L_0x00c5
            boolean r0 = r0.f1952i
            if (r0 == 0) goto L_0x00be
            r7.mo4655n()
            goto L_0x00c5
        L_0x00be:
            r7.mo4652k()
            goto L_0x00c5
        L_0x00c2:
            r7.mo4652k()
        L_0x00c5:
            androidx.compose.runtime.v0 r9 = r9.mo5421U()
            if (r9 != 0) goto L_0x00cc
            goto L_0x00d3
        L_0x00cc:
            androidx.compose.foundation.text.CoreTextFieldKt$SelectionToolbarAndHandles$2 r0 = new androidx.compose.foundation.text.CoreTextFieldKt$SelectionToolbarAndHandles$2
            r0.<init>(r7, r8, r10)
            r9.f3081d = r0
        L_0x00d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt.m1960d(androidx.compose.foundation.text.selection.TextFieldSelectionManager, boolean, androidx.compose.runtime.d, int):void");
    }

    /* renamed from: e */
    public static final void m1961e(TextFieldState textFieldState) {
        boolean z;
        C2004v vVar = textFieldState.f1947d;
        if (vVar != null) {
            C1985e eVar = textFieldState.f1946c;
            C19857l<TextFieldValue, C19394m> lVar = textFieldState.f1958o;
            C19383o.m32797g(eVar, "editProcessor");
            C19383o.m32797g(lVar, "onValueChange");
            lVar.invoke(TextFieldValue.m4312a(eVar.f4468a, (C1913a) null, 0, 3));
            C2002t tVar = vVar.f4526a;
            tVar.getClass();
            AtomicReference<C2004v> atomicReference = tVar.f4524b;
            while (true) {
                if (!atomicReference.compareAndSet(vVar, (Object) null)) {
                    if (atomicReference.get() != vVar) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                tVar.f4523a.mo7637a();
            }
        }
        textFieldState.f1947d = null;
    }
}
