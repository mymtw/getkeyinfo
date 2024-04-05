package androidx.compose.material;

import androidx.activity.C0114h;
import androidx.compose.foundation.interaction.C0634d;
import androidx.compose.foundation.interaction.C0639i;
import androidx.compose.foundation.layout.C0759v;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.layout.C1681g;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1693l;
import androidx.compose.p015ui.text.C1913a;
import androidx.compose.p015ui.text.C2023s;
import androidx.compose.p015ui.text.input.C1994n;
import androidx.compose.p015ui.text.input.C2005w;
import androidx.compose.p015ui.text.input.C2006x;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1345l1;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p628nj.C18263b;
import p753kq.C19861p;

public final class TextFieldImplKt {

    /* renamed from: a */
    public static final long f2329a = C0114h.m313q(0, 0, 0, 0);

    /* renamed from: b */
    public static final float f2330b = ((float) 16);

    /* renamed from: c */
    public static final float f2331c = ((float) 12);

    /* renamed from: d */
    public static final C1436d f2332d;

    static {
        int i = C1436d.f3124a0;
        float f = (float) 48;
        f2332d = SizeKt.m1483c(C1436d.C1437a.f3125b, f, f);
    }

    /* renamed from: a */
    public static final void m2267a(TextFieldType textFieldType, String str, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C2006x xVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, C19861p<? super C1302d, ? super Integer, C19394m> pVar3, C19861p<? super C1302d, ? super Integer, C19394m> pVar4, C19861p<? super C1302d, ? super Integer, C19394m> pVar5, boolean z, boolean z2, boolean z3, C0639i iVar, C0759v vVar, C1166a2 a2Var, C19861p<? super C1302d, ? super Integer, C19394m> pVar6, C1302d dVar, int i, int i2, int i3) {
        int i4;
        int i5;
        C19861p<? super C1302d, ? super Integer, C19394m> pVar7;
        ComposerImpl composerImpl;
        boolean z4;
        boolean z5;
        boolean z6;
        C19861p<? super C1302d, ? super Integer, C19394m> pVar8;
        C19861p<? super C1302d, ? super Integer, C19394m> pVar9;
        C19861p<? super C1302d, ? super Integer, C19394m> pVar10;
        InputPhase inputPhase;
        TextFieldType textFieldType2 = textFieldType;
        String str2 = str;
        C19861p<? super C1302d, ? super Integer, C19394m> pVar11 = pVar;
        C2006x xVar2 = xVar;
        C19861p<? super C1302d, ? super Integer, C19394m> pVar12 = pVar2;
        C0639i iVar2 = iVar;
        C0759v vVar2 = vVar;
        C1166a2 a2Var2 = a2Var;
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        C19383o.m32797g(textFieldType2, "type");
        C19383o.m32797g(str2, "value");
        C19383o.m32797g(pVar11, "innerTextField");
        C19383o.m32797g(xVar2, "visualTransformation");
        C19383o.m32797g(iVar2, "interactionSource");
        C19383o.m32797g(vVar2, "contentPadding");
        C19383o.m32797g(a2Var2, "colors");
        ComposerImpl h = dVar.mo5440h(-712568069);
        if ((i8 & 1) != 0) {
            i4 = i6 | 6;
        } else if ((i6 & 14) == 0) {
            i4 = (h.mo5408I(textFieldType2) ? 4 : 2) | i6;
        } else {
            i4 = i6;
        }
        int i9 = 16;
        if ((i8 & 2) != 0) {
            i4 |= 48;
        } else if ((i6 & 112) == 0) {
            i4 |= h.mo5408I(str2) ? 32 : 16;
        }
        int i10 = 128;
        if ((i8 & 4) != 0) {
            i4 |= 384;
        } else if ((i6 & 896) == 0) {
            i4 |= h.mo5408I(pVar11) ? 256 : 128;
        }
        int i11 = i8 & 8;
        int i12 = RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE;
        if (i11 != 0) {
            i4 |= 3072;
        } else if ((i6 & 7168) == 0) {
            i4 |= h.mo5408I(xVar2) ? 2048 : 1024;
        }
        int i13 = 8192;
        if ((i8 & 16) != 0) {
            i4 |= 24576;
        } else if ((i6 & 57344) == 0) {
            i4 |= h.mo5408I(pVar12) ? 16384 : 8192;
        }
        int i14 = i8 & 32;
        if (i14 != 0) {
            i4 |= 196608;
            C19861p<? super C1302d, ? super Integer, C19394m> pVar13 = pVar3;
        } else {
            C19861p<? super C1302d, ? super Integer, C19394m> pVar14 = pVar3;
            if ((i6 & 458752) == 0) {
                i4 |= h.mo5408I(pVar14) ? 131072 : 65536;
            }
        }
        int i15 = i8 & 64;
        if (i15 != 0) {
            i4 |= 1572864;
            C19861p<? super C1302d, ? super Integer, C19394m> pVar15 = pVar4;
        } else {
            C19861p<? super C1302d, ? super Integer, C19394m> pVar16 = pVar4;
            if ((i6 & 3670016) == 0) {
                i4 |= h.mo5408I(pVar16) ? 1048576 : 524288;
            }
        }
        int i16 = i8 & 128;
        if (i16 != 0) {
            i4 |= 12582912;
            C19861p<? super C1302d, ? super Integer, C19394m> pVar17 = pVar5;
        } else {
            C19861p<? super C1302d, ? super Integer, C19394m> pVar18 = pVar5;
            if ((i6 & 29360128) == 0) {
                i4 |= h.mo5408I(pVar18) ? 8388608 : 4194304;
            }
        }
        int i17 = i8 & 256;
        if (i17 != 0) {
            i4 |= 100663296;
            boolean z7 = z;
        } else {
            boolean z8 = z;
            if ((i6 & 234881024) == 0) {
                i4 |= h.mo5427a(z8) ? 67108864 : 33554432;
            }
        }
        int i18 = i8 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN;
        if (i18 != 0) {
            i4 |= 805306368;
            boolean z9 = z2;
        } else {
            int i19 = i6 & 1879048192;
            boolean z10 = z2;
            if (i19 == 0) {
                i4 |= h.mo5427a(z10) ? 536870912 : 268435456;
            }
        }
        int i20 = i4;
        int i21 = i8 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE;
        if (i21 != 0) {
            i5 = i7 | 6;
            boolean z11 = z3;
        } else {
            boolean z12 = z3;
            if ((i7 & 14) == 0) {
                i5 = i7 | (h.mo5427a(z12) ? 4 : 2);
            } else {
                i5 = i7;
            }
        }
        if ((i8 & RecyclerView.C3084b0.FLAG_MOVED) != 0) {
            i5 |= 48;
        } else if ((i7 & 112) == 0) {
            if (h.mo5408I(iVar2)) {
                i9 = 32;
            }
            i5 |= i9;
        }
        int i22 = i5;
        if ((i8 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            i22 |= 384;
        } else if ((i7 & 896) == 0) {
            if (h.mo5408I(vVar2)) {
                i10 = 256;
            }
            i22 |= i10;
        }
        if ((i8 & 8192) != 0) {
            i22 |= 3072;
        } else if ((i7 & 7168) == 0) {
            if (h.mo5408I(a2Var2)) {
                i12 = 2048;
            }
            i22 |= i12;
        }
        int i23 = i8 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE;
        if (i23 != 0) {
            i22 |= 24576;
            C19861p<? super C1302d, ? super Integer, C19394m> pVar19 = pVar6;
        } else {
            C19861p<? super C1302d, ? super Integer, C19394m> pVar20 = pVar6;
            if ((i7 & 57344) == 0) {
                if (h.mo5408I(pVar20)) {
                    i13 = 16384;
                }
                i22 |= i13;
            }
        }
        if ((i20 & 1533916891) == 306783378 && (46811 & i22) == 9362 && h.mo5442i()) {
            h.mo5396C();
            pVar10 = pVar3;
            pVar9 = pVar4;
            pVar8 = pVar5;
            z6 = z;
            z5 = z2;
            z4 = z3;
            pVar7 = pVar6;
            composerImpl = h;
        } else {
            C19861p<? super C1302d, ? super Integer, C19394m> pVar21 = i14 != 0 ? null : pVar3;
            C19861p<? super C1302d, ? super Integer, C19394m> pVar22 = i15 != 0 ? null : pVar4;
            C19861p<? super C1302d, ? super Integer, C19394m> pVar23 = i16 != 0 ? null : pVar5;
            boolean z13 = i17 != 0 ? false : z;
            boolean z14 = i18 != 0 ? true : z2;
            boolean z15 = i21 != 0 ? false : z3;
            C19861p<? super C1302d, ? super Integer, C19394m> pVar24 = i23 != 0 ? null : pVar6;
            h.mo5465u(511388516);
            boolean I = h.mo5408I(str2) | h.mo5408I(xVar2);
            Object c0 = h.mo5431c0();
            if (I || c0 == C1302d.C1303a.f2828a) {
                c0 = new C2005w(new C1913a(str2, (List) null, 6), C1994n.C1995a.f4512a);
                h.mo5407H0(c0);
            }
            h.mo5418R(false);
            String str3 = ((C2005w) c0).f4528a.f4296b;
            if (((Boolean) C0634d.m1441a(iVar2, h, (i22 >> 3) & 14).getValue()).booleanValue()) {
                inputPhase = InputPhase.Focused;
            } else {
                inputPhase = str3.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
            }
            InputPhase inputPhase2 = inputPhase;
            ComposerImpl composerImpl2 = h;
            TextFieldImplKt$CommonDecorationBox$labelColor$1 textFieldImplKt$CommonDecorationBox$labelColor$1 = r0;
            TextFieldImplKt$CommonDecorationBox$labelColor$1 textFieldImplKt$CommonDecorationBox$labelColor$12 = new TextFieldImplKt$CommonDecorationBox$labelColor$1(a2Var, z14, z15, iVar, i20, i22);
            C1345l1 l1Var = TypographyKt.f2371a;
            C1178d2 d2Var = (C1178d2) composerImpl2.mo5410J(l1Var);
            C2023s sVar = d2Var.f2408g;
            C2023s sVar2 = d2Var.f2413l;
            long b = sVar.mo7758b();
            long j = C1545s.f3364i;
            boolean z16 = (C1545s.m3357c(b, j) && !C1545s.m3357c(sVar2.mo7758b(), j)) || (!C1545s.m3357c(sVar.mo7758b(), j) && C1545s.m3357c(sVar2.mo7758b(), j));
            TextFieldTransitionScope textFieldTransitionScope = TextFieldTransitionScope.f2340a;
            composerImpl2.mo5465u(2129141006);
            long b2 = ((C1178d2) composerImpl2.mo5410J(l1Var)).f2413l.mo7758b();
            if (z16) {
                if (!(b2 != j)) {
                    b2 = ((C1545s) textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(inputPhase2, composerImpl2, 0)).f3366a;
                }
            }
            long j2 = b2;
            composerImpl2.mo5418R(false);
            long b3 = ((C1178d2) composerImpl2.mo5410J(l1Var)).f2408g.mo7758b();
            if (z16) {
                if (!(b3 != j)) {
                    b3 = ((C1545s) textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(inputPhase2, composerImpl2, 0)).f3366a;
                }
            }
            long j3 = b3;
            boolean z17 = pVar12 != null;
            TextFieldImplKt$CommonDecorationBox$labelColor$1 textFieldImplKt$CommonDecorationBox$labelColor$13 = textFieldImplKt$CommonDecorationBox$labelColor$1;
            TextFieldImplKt$CommonDecorationBox$3 textFieldImplKt$CommonDecorationBox$3 = r0;
            TextFieldImplKt$CommonDecorationBox$3 textFieldImplKt$CommonDecorationBox$32 = new TextFieldImplKt$CommonDecorationBox$3(pVar2, pVar21, str3, z15, i22, a2Var, z14, iVar, i20, pVar22, pVar23, textFieldType, pVar, z13, vVar, z16, pVar24);
            composerImpl = composerImpl2;
            textFieldTransitionScope.mo5200a(inputPhase2, j2, j3, textFieldImplKt$CommonDecorationBox$labelColor$13, z17, C18263b.m30805A(composerImpl, 341865432, textFieldImplKt$CommonDecorationBox$3), composerImpl, 1769472);
            pVar10 = pVar21;
            pVar9 = pVar22;
            pVar8 = pVar23;
            z6 = z13;
            z5 = z14;
            z4 = z15;
            pVar7 = pVar24;
        }
        C1418v0 U = composerImpl.mo5421U();
        if (U != null) {
            U.f3081d = new TextFieldImplKt$CommonDecorationBox$4(textFieldType, str, pVar, xVar, pVar2, pVar10, pVar9, pVar8, z6, z5, z4, iVar, vVar, a2Var, pVar7, i, i2, i3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2268b(long r16, androidx.compose.p015ui.text.C2023s r18, java.lang.Float r19, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r20, androidx.compose.runtime.C1302d r21, int r22, int r23) {
        /*
            r6 = r20
            r7 = r22
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r6, r0)
            r0 = -399493340(0xffffffffe8303724, float:-3.3286147E24)
            r1 = r21
            androidx.compose.runtime.ComposerImpl r8 = r1.mo5440h(r0)
            r0 = r23 & 1
            if (r0 == 0) goto L_0x001b
            r0 = r7 | 6
            r9 = r16
            goto L_0x002d
        L_0x001b:
            r0 = r7 & 14
            r9 = r16
            if (r0 != 0) goto L_0x002c
            boolean r0 = r8.mo5434e(r9)
            if (r0 == 0) goto L_0x0029
            r0 = 4
            goto L_0x002a
        L_0x0029:
            r0 = 2
        L_0x002a:
            r0 = r0 | r7
            goto L_0x002d
        L_0x002c:
            r0 = r7
        L_0x002d:
            r1 = r23 & 2
            if (r1 == 0) goto L_0x0034
            r0 = r0 | 48
            goto L_0x0047
        L_0x0034:
            r2 = r7 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0047
            r2 = r18
            boolean r3 = r8.mo5408I(r2)
            if (r3 == 0) goto L_0x0043
            r3 = 32
            goto L_0x0045
        L_0x0043:
            r3 = 16
        L_0x0045:
            r0 = r0 | r3
            goto L_0x0049
        L_0x0047:
            r2 = r18
        L_0x0049:
            r3 = r23 & 4
            if (r3 == 0) goto L_0x0050
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0050:
            r4 = r7 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0063
            r4 = r19
            boolean r5 = r8.mo5408I(r4)
            if (r5 == 0) goto L_0x005f
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r0 = r0 | r5
            goto L_0x0065
        L_0x0063:
            r4 = r19
        L_0x0065:
            r5 = r23 & 8
            if (r5 == 0) goto L_0x006c
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x007c
        L_0x006c:
            r5 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x007c
            boolean r5 = r8.mo5408I(r6)
            if (r5 == 0) goto L_0x0079
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r0 = r0 | r5
        L_0x007c:
            r11 = r0
            r0 = r11 & 5851(0x16db, float:8.199E-42)
            r5 = 1170(0x492, float:1.64E-42)
            if (r0 != r5) goto L_0x008f
            boolean r0 = r8.mo5442i()
            if (r0 != 0) goto L_0x008a
            goto L_0x008f
        L_0x008a:
            r8.mo5396C()
            r3 = r2
            goto L_0x00d3
        L_0x008f:
            r0 = 0
            if (r1 == 0) goto L_0x0094
            r12 = r0
            goto L_0x0095
        L_0x0094:
            r12 = r2
        L_0x0095:
            if (r3 == 0) goto L_0x0099
            r13 = r0
            goto L_0x009a
        L_0x0099:
            r13 = r4
        L_0x009a:
            r14 = 494684590(0x1d7c49ae, float:3.3390014E-21)
            androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1 r15 = new androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1
            r0 = r15
            r1 = r16
            r3 = r13
            r4 = r20
            r5 = r11
            r0.<init>(r1, r3, r4, r5)
            androidx.compose.runtime.internal.ComposableLambdaImpl r0 = p628nj.C18263b.m30805A(r8, r14, r15)
            if (r12 == 0) goto L_0x00bf
            r1 = -2009952864(0xffffffff88328da0, float:-5.3731406E-34)
            r8.mo5465u(r1)
            int r1 = r11 >> 3
            r1 = r1 & 14
            r1 = r1 | 48
            androidx.compose.material.TextKt.m2282a(r12, r0, r8, r1)
            goto L_0x00cd
        L_0x00bf:
            r1 = -2009952812(0xffffffff88328dd4, float:-5.3731645E-34)
            r8.mo5465u(r1)
            r1 = 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.invoke(r8, r1)
        L_0x00cd:
            r0 = 0
            r8.mo5418R(r0)
            r3 = r12
            r4 = r13
        L_0x00d3:
            androidx.compose.runtime.v0 r8 = r8.mo5421U()
            if (r8 != 0) goto L_0x00da
            goto L_0x00ea
        L_0x00da:
            androidx.compose.material.TextFieldImplKt$Decoration$1 r11 = new androidx.compose.material.TextFieldImplKt$Decoration$1
            r0 = r11
            r1 = r16
            r5 = r20
            r6 = r22
            r7 = r23
            r0.<init>(r1, r3, r4, r5, r6, r7)
            r8.f3081d = r11
        L_0x00ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldImplKt.m2268b(long, androidx.compose.ui.text.s, java.lang.Float, kq.p, androidx.compose.runtime.d, int, int):void");
    }

    /* renamed from: c */
    public static final Object m2269c(C1681g gVar) {
        C19383o.m32797g(gVar, "<this>");
        Object f = gVar.mo6666f();
        C1693l lVar = f instanceof C1693l ? (C1693l) f : null;
        if (lVar != null) {
            return lVar.mo6691a();
        }
        return null;
    }

    /* renamed from: d */
    public static final int m2270d(C1686i0 i0Var) {
        if (i0Var != null) {
            return i0Var.f3723c;
        }
        return 0;
    }

    /* renamed from: e */
    public static final int m2271e(C1686i0 i0Var) {
        if (i0Var != null) {
            return i0Var.f3722b;
        }
        return 0;
    }
}
