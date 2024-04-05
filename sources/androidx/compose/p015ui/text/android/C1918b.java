package androidx.compose.p015ui.text.android;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import android.text.Layout;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19459m;

/* renamed from: androidx.compose.ui.text.android.b */
public final class C1918b {

    /* renamed from: a */
    public final Layout f4316a;

    /* renamed from: b */
    public final ArrayList f4317b;

    /* renamed from: c */
    public final ArrayList f4318c;

    /* renamed from: d */
    public final boolean[] f4319d;

    /* renamed from: e */
    public char[] f4320e;

    /* renamed from: androidx.compose.ui.text.android.b$a */
    public static final class C1919a {

        /* renamed from: a */
        public final int f4321a;

        /* renamed from: b */
        public final int f4322b;

        /* renamed from: c */
        public final boolean f4323c;

        public C1919a(int i, int i2, boolean z) {
            this.f4321a = i;
            this.f4322b = i2;
            this.f4323c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1919a)) {
                return false;
            }
            C1919a aVar = (C1919a) obj;
            return this.f4321a == aVar.f4321a && this.f4322b == aVar.f4322b && this.f4323c == aVar.f4323c;
        }

        public final int hashCode() {
            int a = C0069a.m170a(this.f4322b, Integer.hashCode(this.f4321a) * 31, 31);
            boolean z = this.f4323c;
            if (z) {
                z = true;
            }
            return a + (z ? 1 : 0);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("BidiRun(start=");
            h.append(this.f4321a);
            h.append(", end=");
            h.append(this.f4322b);
            h.append(", isRtl=");
            return C0391c.m1058d(h, this.f4323c, ')');
        }
    }

    public C1918b(Layout layout) {
        C19383o.m32797g(layout, ResponseConstants.LAYOUT);
        this.f4316a = layout;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            CharSequence text = this.f4316a.getText();
            C19383o.m32796f(text, "layout.text");
            int k1 = C19459m.m33042k1(text, 10, i, false, 4);
            i = k1 < 0 ? this.f4316a.getText().length() : k1 + 1;
            arrayList.add(Integer.valueOf(i));
        } while (i < this.f4316a.getText().length());
        this.f4317b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add((Object) null);
        }
        this.f4318c = arrayList2;
        this.f4319d = new boolean[this.f4317b.size()];
        this.f4317b.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:95:0x019d, code lost:
        if (r14.getRunCount() == 1) goto L_0x019f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0106 A[EDGE_INSN: B:199:0x0106->B:70:0x0106 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0104 A[LOOP:0: B:46:0x00cb->B:69:0x0104, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float mo7416a(int r22, boolean r23, boolean r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            if (r24 != 0) goto L_0x0016
            if (r23 == 0) goto L_0x000f
            android.text.Layout r2 = r0.f4316a
            float r1 = r2.getPrimaryHorizontal(r1)
            goto L_0x0015
        L_0x000f:
            android.text.Layout r2 = r0.f4316a
            float r1 = r2.getSecondaryHorizontal(r1)
        L_0x0015:
            return r1
        L_0x0016:
            android.text.Layout r2 = r0.f4316a
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r2, r3)
            r3 = 0
            r4 = -1
            if (r1 > 0) goto L_0x0023
            r2 = r3
            goto L_0x0052
        L_0x0023:
            java.lang.CharSequence r5 = r2.getText()
            int r5 = r5.length()
            if (r1 < r5) goto L_0x0033
            int r2 = r2.getLineCount()
            int r2 = r2 + r4
            goto L_0x0052
        L_0x0033:
            int r5 = r2.getLineForOffset(r1)
            int r6 = r2.getLineStart(r5)
            int r2 = r2.getLineEnd(r5)
            if (r6 == r1) goto L_0x0044
            if (r2 == r1) goto L_0x0044
            goto L_0x004d
        L_0x0044:
            if (r6 != r1) goto L_0x004b
            if (r24 == 0) goto L_0x004d
            int r5 = r5 + -1
            goto L_0x004d
        L_0x004b:
            if (r24 == 0) goto L_0x004f
        L_0x004d:
            r2 = r5
            goto L_0x0052
        L_0x004f:
            int r5 = r5 + 1
            goto L_0x004d
        L_0x0052:
            android.text.Layout r5 = r0.f4316a
            int r5 = r5.getLineStart(r2)
            android.text.Layout r6 = r0.f4316a
            int r6 = r6.getLineEnd(r2)
            if (r1 == r5) goto L_0x0072
            if (r1 == r6) goto L_0x0072
            if (r23 == 0) goto L_0x006b
            android.text.Layout r2 = r0.f4316a
            float r1 = r2.getPrimaryHorizontal(r1)
            goto L_0x0071
        L_0x006b:
            android.text.Layout r2 = r0.f4316a
            float r1 = r2.getSecondaryHorizontal(r1)
        L_0x0071:
            return r1
        L_0x0072:
            if (r1 == 0) goto L_0x02cf
            android.text.Layout r7 = r0.f4316a
            java.lang.CharSequence r7 = r7.getText()
            int r7 = r7.length()
            if (r1 != r7) goto L_0x0082
            goto L_0x02cf
        L_0x0082:
            java.util.ArrayList r7 = r0.f4317b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r22)
            int r7 = p568fn.C17782b.m29896y(r7, r8)
            r8 = 1
            if (r7 >= 0) goto L_0x0092
            int r7 = r7 + r8
            int r7 = -r7
            goto L_0x0093
        L_0x0092:
            int r7 = r7 + r8
        L_0x0093:
            if (r24 == 0) goto L_0x00a8
            if (r7 <= 0) goto L_0x00a8
            java.util.ArrayList r9 = r0.f4317b
            int r10 = r7 + -1
            java.lang.Object r9 = r9.get(r10)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r1 != r9) goto L_0x00a8
            r7 = r10
        L_0x00a8:
            android.text.Layout r9 = r0.f4316a
            if (r7 != 0) goto L_0x00ae
            r10 = r3
            goto L_0x00bc
        L_0x00ae:
            java.util.ArrayList r10 = r0.f4317b
            int r11 = r7 + -1
            java.lang.Object r10 = r10.get(r11)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
        L_0x00bc:
            int r9 = r9.getLineForOffset(r10)
            android.text.Layout r10 = r0.f4316a
            int r9 = r10.getParagraphDirection(r9)
            if (r9 != r4) goto L_0x00ca
            r9 = r8
            goto L_0x00cb
        L_0x00ca:
            r9 = r3
        L_0x00cb:
            if (r6 <= 0) goto L_0x0106
            android.text.Layout r10 = r0.f4316a
            java.lang.CharSequence r10 = r10.getText()
            int r11 = r6 + -1
            char r10 = r10.charAt(r11)
            r12 = 32
            if (r10 == r12) goto L_0x0101
            r12 = 10
            if (r10 == r12) goto L_0x0101
            r12 = 5760(0x1680, float:8.071E-42)
            if (r10 == r12) goto L_0x0101
            r12 = 8192(0x2000, float:1.14794E-41)
            if (r12 > r10) goto L_0x00ef
            r12 = 8203(0x200b, float:1.1495E-41)
            if (r10 >= r12) goto L_0x00ef
            r12 = r8
            goto L_0x00f0
        L_0x00ef:
            r12 = r3
        L_0x00f0:
            if (r12 == 0) goto L_0x00f6
            r12 = 8199(0x2007, float:1.1489E-41)
            if (r10 != r12) goto L_0x0101
        L_0x00f6:
            r12 = 8287(0x205f, float:1.1613E-41)
            if (r10 == r12) goto L_0x0101
            r12 = 12288(0x3000, float:1.7219E-41)
            if (r10 != r12) goto L_0x00ff
            goto L_0x0101
        L_0x00ff:
            r10 = r3
            goto L_0x0102
        L_0x0101:
            r10 = r8
        L_0x0102:
            if (r10 == 0) goto L_0x0106
            r6 = r11
            goto L_0x00cb
        L_0x0106:
            if (r7 != 0) goto L_0x010a
            r10 = r3
            goto L_0x0118
        L_0x010a:
            java.util.ArrayList r10 = r0.f4317b
            int r11 = r7 + -1
            java.lang.Object r10 = r10.get(r11)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
        L_0x0118:
            int r11 = r5 - r10
            int r6 = r6 - r10
            boolean[] r10 = r0.f4319d
            boolean r10 = r10[r7]
            if (r10 == 0) goto L_0x012b
            java.util.ArrayList r10 = r0.f4318c
            java.lang.Object r7 = r10.get(r7)
            java.text.Bidi r7 = (java.text.Bidi) r7
            goto L_0x01b5
        L_0x012b:
            if (r7 != 0) goto L_0x012f
            r10 = r3
            goto L_0x013d
        L_0x012f:
            java.util.ArrayList r10 = r0.f4317b
            int r13 = r7 + -1
            java.lang.Object r10 = r10.get(r13)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
        L_0x013d:
            java.util.ArrayList r13 = r0.f4317b
            java.lang.Object r13 = r13.get(r7)
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            int r15 = r13 - r10
            char[] r14 = r0.f4320e
            if (r14 == 0) goto L_0x0152
            int r12 = r14.length
            if (r12 >= r15) goto L_0x0154
        L_0x0152:
            char[] r14 = new char[r15]
        L_0x0154:
            r12 = r14
            android.text.Layout r14 = r0.f4316a
            java.lang.CharSequence r14 = r14.getText()
            android.text.TextUtils.getChars(r14, r10, r13, r12, r3)
            boolean r10 = java.text.Bidi.requiresBidi(r12, r3, r15)
            if (r10 == 0) goto L_0x019f
            android.text.Layout r10 = r0.f4316a
            if (r7 != 0) goto L_0x016a
            r13 = r3
            goto L_0x0178
        L_0x016a:
            java.util.ArrayList r13 = r0.f4317b
            int r14 = r7 + -1
            java.lang.Object r13 = r13.get(r14)
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
        L_0x0178:
            int r10 = r10.getLineForOffset(r13)
            android.text.Layout r13 = r0.f4316a
            int r10 = r13.getParagraphDirection(r10)
            if (r10 != r4) goto L_0x0187
            r20 = r8
            goto L_0x0189
        L_0x0187:
            r20 = r3
        L_0x0189:
            java.text.Bidi r10 = new java.text.Bidi
            r16 = 0
            r17 = 0
            r18 = 0
            r14 = r10
            r13 = r15
            r15 = r12
            r19 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20)
            int r13 = r10.getRunCount()
            if (r13 != r8) goto L_0x01a0
        L_0x019f:
            r10 = 0
        L_0x01a0:
            java.util.ArrayList r13 = r0.f4318c
            r13.set(r7, r10)
            boolean[] r13 = r0.f4319d
            r13[r7] = r8
            if (r10 == 0) goto L_0x01b2
            char[] r7 = r0.f4320e
            if (r12 != r7) goto L_0x01b1
            r12 = 0
            goto L_0x01b2
        L_0x01b1:
            r12 = r7
        L_0x01b2:
            r0.f4320e = r12
            r7 = r10
        L_0x01b5:
            if (r7 == 0) goto L_0x01bc
            java.text.Bidi r12 = r7.createLineBidi(r11, r6)
            goto L_0x01bd
        L_0x01bc:
            r12 = 0
        L_0x01bd:
            if (r12 == 0) goto L_0x02ab
            int r6 = r12.getRunCount()
            if (r6 != r8) goto L_0x01c7
            goto L_0x02ab
        L_0x01c7:
            int r6 = r12.getRunCount()
            androidx.compose.ui.text.android.b$a[] r7 = new androidx.compose.p015ui.text.android.C1918b.C1919a[r6]
            r10 = r3
        L_0x01ce:
            if (r10 >= r6) goto L_0x01ef
            androidx.compose.ui.text.android.b$a r11 = new androidx.compose.ui.text.android.b$a
            int r13 = r12.getRunStart(r10)
            int r13 = r13 + r5
            int r14 = r12.getRunLimit(r10)
            int r14 = r14 + r5
            int r15 = r12.getRunLevel(r10)
            int r15 = r15 % 2
            if (r15 != r8) goto L_0x01e6
            r15 = r8
            goto L_0x01e7
        L_0x01e6:
            r15 = r3
        L_0x01e7:
            r11.<init>(r13, r14, r15)
            r7[r10] = r11
            int r10 = r10 + 1
            goto L_0x01ce
        L_0x01ef:
            int r10 = r12.getRunCount()
            byte[] r11 = new byte[r10]
            r13 = r3
        L_0x01f6:
            if (r13 >= r10) goto L_0x0202
            int r14 = r12.getRunLevel(r13)
            byte r14 = (byte) r14
            r11[r13] = r14
            int r13 = r13 + 1
            goto L_0x01f6
        L_0x0202:
            java.text.Bidi.reorderVisually(r11, r3, r7, r3, r6)
            if (r1 != r5) goto L_0x0259
            r5 = r3
        L_0x0208:
            if (r5 >= r6) goto L_0x0219
            r10 = r7[r5]
            int r10 = r10.f4321a
            if (r10 != r1) goto L_0x0212
            r10 = r8
            goto L_0x0213
        L_0x0212:
            r10 = r3
        L_0x0213:
            if (r10 == 0) goto L_0x0216
            goto L_0x021a
        L_0x0216:
            int r5 = r5 + 1
            goto L_0x0208
        L_0x0219:
            r5 = r4
        L_0x021a:
            r1 = r7[r5]
            if (r23 != 0) goto L_0x0225
            boolean r1 = r1.f4323c
            if (r9 != r1) goto L_0x0223
            goto L_0x0225
        L_0x0223:
            r3 = r9
            goto L_0x0228
        L_0x0225:
            if (r9 != 0) goto L_0x0228
            r3 = r8
        L_0x0228:
            if (r5 != 0) goto L_0x0233
            if (r3 == 0) goto L_0x0233
            android.text.Layout r1 = r0.f4316a
            float r1 = r1.getLineLeft(r2)
            return r1
        L_0x0233:
            int r6 = r6 + r4
            if (r5 != r6) goto L_0x023f
            if (r3 != 0) goto L_0x023f
            android.text.Layout r1 = r0.f4316a
            float r1 = r1.getLineRight(r2)
            return r1
        L_0x023f:
            if (r3 == 0) goto L_0x024d
            android.text.Layout r1 = r0.f4316a
            int r5 = r5 - r8
            r2 = r7[r5]
            int r2 = r2.f4321a
            float r1 = r1.getPrimaryHorizontal(r2)
            return r1
        L_0x024d:
            android.text.Layout r1 = r0.f4316a
            int r5 = r5 + r8
            r2 = r7[r5]
            int r2 = r2.f4321a
            float r1 = r1.getPrimaryHorizontal(r2)
            return r1
        L_0x0259:
            r5 = r3
        L_0x025a:
            if (r5 >= r6) goto L_0x026b
            r10 = r7[r5]
            int r10 = r10.f4322b
            if (r10 != r1) goto L_0x0264
            r10 = r8
            goto L_0x0265
        L_0x0264:
            r10 = r3
        L_0x0265:
            if (r10 == 0) goto L_0x0268
            goto L_0x026c
        L_0x0268:
            int r5 = r5 + 1
            goto L_0x025a
        L_0x026b:
            r5 = r4
        L_0x026c:
            r1 = r7[r5]
            if (r23 != 0) goto L_0x0279
            boolean r1 = r1.f4323c
            if (r9 != r1) goto L_0x0275
            goto L_0x0279
        L_0x0275:
            if (r9 != 0) goto L_0x027a
            r3 = r8
            goto L_0x027a
        L_0x0279:
            r3 = r9
        L_0x027a:
            if (r5 != 0) goto L_0x0285
            if (r3 == 0) goto L_0x0285
            android.text.Layout r1 = r0.f4316a
            float r1 = r1.getLineLeft(r2)
            return r1
        L_0x0285:
            int r6 = r6 + r4
            if (r5 != r6) goto L_0x0291
            if (r3 != 0) goto L_0x0291
            android.text.Layout r1 = r0.f4316a
            float r1 = r1.getLineRight(r2)
            return r1
        L_0x0291:
            if (r3 == 0) goto L_0x029f
            android.text.Layout r1 = r0.f4316a
            int r5 = r5 - r8
            r2 = r7[r5]
            int r2 = r2.f4322b
            float r1 = r1.getPrimaryHorizontal(r2)
            return r1
        L_0x029f:
            android.text.Layout r1 = r0.f4316a
            int r5 = r5 + r8
            r2 = r7[r5]
            int r2 = r2.f4322b
            float r1 = r1.getPrimaryHorizontal(r2)
            return r1
        L_0x02ab:
            android.text.Layout r4 = r0.f4316a
            boolean r4 = r4.isRtlCharAt(r5)
            if (r23 != 0) goto L_0x02b5
            if (r9 != r4) goto L_0x02ba
        L_0x02b5:
            if (r9 != 0) goto L_0x02b9
            r9 = r8
            goto L_0x02ba
        L_0x02b9:
            r9 = r3
        L_0x02ba:
            if (r1 != r5) goto L_0x02be
            r3 = r9
            goto L_0x02c1
        L_0x02be:
            if (r9 != 0) goto L_0x02c1
            r3 = r8
        L_0x02c1:
            android.text.Layout r1 = r0.f4316a
            if (r3 == 0) goto L_0x02ca
            float r1 = r1.getLineLeft(r2)
            goto L_0x02ce
        L_0x02ca:
            float r1 = r1.getLineRight(r2)
        L_0x02ce:
            return r1
        L_0x02cf:
            if (r23 == 0) goto L_0x02d8
            android.text.Layout r2 = r0.f4316a
            float r1 = r2.getPrimaryHorizontal(r1)
            goto L_0x02de
        L_0x02d8:
            android.text.Layout r2 = r0.f4316a
            float r1 = r2.getSecondaryHorizontal(r1)
        L_0x02de:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.text.android.C1918b.mo7416a(int, boolean, boolean):float");
    }
}
