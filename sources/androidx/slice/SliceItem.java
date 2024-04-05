package androidx.slice;

import androidx.versionedparcelable.CustomVersionedParcelable;
import com.etsy.android.lib.models.ResponseConstants;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import p077d1.C6619c;

public final class SliceItem extends CustomVersionedParcelable {

    /* renamed from: a */
    public String[] f7608a;

    /* renamed from: b */
    public String f7609b;

    /* renamed from: c */
    public String f7610c;

    /* renamed from: d */
    public Object f7611d;

    /* renamed from: e */
    public SliceItemHolder f7612e;

    public SliceItem(Object obj, String str, String str2, String[] strArr) {
        this.f7608a = strArr;
        this.f7609b = str;
        this.f7610c = str2;
        this.f7611d = obj;
    }

    /* renamed from: b */
    public final void mo12109b() {
        Object[] objArr;
        Class<String> cls = String.class;
        String[] strArr = this.f7608a;
        int i = 0;
        if (strArr != null) {
            int length = strArr.length;
            objArr = (Object[]) Array.newInstance(cls, length + 1);
            System.arraycopy(strArr, 0, objArr, 0, length);
            i = length;
        } else {
            objArr = (Object[]) Array.newInstance(cls, 1);
        }
        objArr[i] = "partial";
        this.f7608a = (String[]) objArr;
    }

    /* renamed from: c */
    public final List<String> mo12110c() {
        return Arrays.asList(this.f7608a);
    }

    /* renamed from: d */
    public final Slice mo12111d() {
        return ResponseConstants.ACTION.equals(this.f7609b) ? (Slice) ((C6619c) this.f7611d).f14607b : (Slice) this.f7611d;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ba, code lost:
        if (r15.equals(com.etsy.android.lib.models.ResponseConstants.IMAGE) == false) goto L_0x00e1;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo12112e(java.lang.String r15) {
        /*
            r14 = this;
            java.lang.StringBuilder r0 = android.support.p013v4.media.C0072d.m201h(r15)
            java.lang.String r1 = r14.f7609b
            r0.append(r1)
            java.lang.String r1 = r14.f7610c
            if (r1 == 0) goto L_0x001c
            r1 = 60
            r0.append(r1)
            java.lang.String r1 = r14.f7610c
            r0.append(r1)
            r1 = 62
            r0.append(r1)
        L_0x001c:
            r1 = 32
            r0.append(r1)
            java.lang.String[] r2 = r14.f7608a
            int r3 = r2.length
            if (r3 <= 0) goto L_0x002c
            androidx.slice.Slice.m7928b(r0, r2)
            r0.append(r1)
        L_0x002c:
            java.lang.String r1 = "  "
            java.lang.String r1 = androidx.appcompat.widget.C0326j.m864i(r15, r1)
            java.lang.String r2 = r14.f7609b
            r2.getClass()
            int r3 = r2.hashCode()
            java.lang.String r4 = "slice"
            java.lang.String r5 = "image"
            java.lang.String r6 = "text"
            java.lang.String r7 = "long"
            java.lang.String r8 = "int"
            java.lang.String r9 = "action"
            r10 = 4
            r11 = 3
            r12 = 2
            r13 = 1
            switch(r3) {
                case -1422950858: goto L_0x007c;
                case 104431: goto L_0x0073;
                case 3327612: goto L_0x006a;
                case 3556653: goto L_0x0061;
                case 100313435: goto L_0x0058;
                case 109526418: goto L_0x004f;
                default: goto L_0x004e;
            }
        L_0x004e:
            goto L_0x0085
        L_0x004f:
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0056
            goto L_0x0085
        L_0x0056:
            r2 = 5
            goto L_0x0086
        L_0x0058:
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x005f
            goto L_0x0085
        L_0x005f:
            r2 = r10
            goto L_0x0086
        L_0x0061:
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L_0x0068
            goto L_0x0085
        L_0x0068:
            r2 = r11
            goto L_0x0086
        L_0x006a:
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x0071
            goto L_0x0085
        L_0x0071:
            r2 = r12
            goto L_0x0086
        L_0x0073:
            boolean r2 = r2.equals(r8)
            if (r2 != 0) goto L_0x007a
            goto L_0x0085
        L_0x007a:
            r2 = r13
            goto L_0x0086
        L_0x007c:
            boolean r2 = r2.equals(r9)
            if (r2 != 0) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            r2 = 0
            goto L_0x0086
        L_0x0085:
            r2 = -1
        L_0x0086:
            java.lang.String r3 = "{\n"
            if (r2 == 0) goto L_0x020d
            if (r2 == r13) goto L_0x018a
            if (r2 == r12) goto L_0x013c
            if (r2 == r11) goto L_0x012b
            if (r2 == r10) goto L_0x0122
            r11 = 5
            if (r2 == r11) goto L_0x0105
            java.lang.String r15 = r14.f7609b
            r15.getClass()
            int r1 = r15.hashCode()
            switch(r1) {
                case -1422950858: goto L_0x00d8;
                case 104431: goto L_0x00cf;
                case 3327612: goto L_0x00c6;
                case 3556653: goto L_0x00bd;
                case 100313435: goto L_0x00b6;
                case 100358090: goto L_0x00ab;
                case 109526418: goto L_0x00a2;
                default: goto L_0x00a1;
            }
        L_0x00a1:
            goto L_0x00e1
        L_0x00a2:
            boolean r1 = r15.equals(r4)
            if (r1 != 0) goto L_0x00a9
            goto L_0x00e1
        L_0x00a9:
            r10 = 6
            goto L_0x00e2
        L_0x00ab:
            java.lang.String r1 = "input"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L_0x00b4
            goto L_0x00e1
        L_0x00b4:
            r10 = r11
            goto L_0x00e2
        L_0x00b6:
            boolean r1 = r15.equals(r5)
            if (r1 != 0) goto L_0x00e2
            goto L_0x00e1
        L_0x00bd:
            boolean r1 = r15.equals(r6)
            if (r1 != 0) goto L_0x00c4
            goto L_0x00e1
        L_0x00c4:
            r10 = 3
            goto L_0x00e2
        L_0x00c6:
            boolean r1 = r15.equals(r7)
            if (r1 != 0) goto L_0x00cd
            goto L_0x00e1
        L_0x00cd:
            r10 = r12
            goto L_0x00e2
        L_0x00cf:
            boolean r1 = r15.equals(r8)
            if (r1 != 0) goto L_0x00d6
            goto L_0x00e1
        L_0x00d6:
            r10 = r13
            goto L_0x00e2
        L_0x00d8:
            boolean r1 = r15.equals(r9)
            if (r1 != 0) goto L_0x00df
            goto L_0x00e1
        L_0x00df:
            r10 = 0
            goto L_0x00e2
        L_0x00e1:
            r10 = -1
        L_0x00e2:
            switch(r10) {
                case 0: goto L_0x00fe;
                case 1: goto L_0x00fb;
                case 2: goto L_0x00f8;
                case 3: goto L_0x00f5;
                case 4: goto L_0x00f2;
                case 5: goto L_0x00ef;
                case 6: goto L_0x00ec;
                default: goto L_0x00e5;
            }
        L_0x00e5:
            java.lang.String r1 = "Unrecognized format: "
            java.lang.String r15 = androidx.appcompat.widget.C0326j.m864i(r1, r15)
            goto L_0x0100
        L_0x00ec:
            java.lang.String r15 = "Slice"
            goto L_0x0100
        L_0x00ef:
            java.lang.String r15 = "RemoteInput"
            goto L_0x0100
        L_0x00f2:
            java.lang.String r15 = "Image"
            goto L_0x0100
        L_0x00f5:
            java.lang.String r15 = "Text"
            goto L_0x0100
        L_0x00f8:
            java.lang.String r15 = "Long"
            goto L_0x0100
        L_0x00fb:
            java.lang.String r15 = "Int"
            goto L_0x0100
        L_0x00fe:
            java.lang.String r15 = "Action"
        L_0x0100:
            r0.append(r15)
            goto L_0x023b
        L_0x0105:
            r0.append(r3)
            androidx.slice.Slice r2 = r14.mo12111d()
            java.lang.String r1 = r2.mo12099f(r1)
            r0.append(r1)
            r1 = 10
            r0.append(r1)
            r0.append(r15)
            r15 = 125(0x7d, float:1.75E-43)
            r0.append(r15)
            goto L_0x023b
        L_0x0122:
            java.lang.Object r15 = r14.f7611d
            androidx.core.graphics.drawable.IconCompat r15 = (androidx.core.graphics.drawable.IconCompat) r15
            r0.append(r15)
            goto L_0x023b
        L_0x012b:
            r15 = 34
            r0.append(r15)
            java.lang.Object r1 = r14.f7611d
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.append(r1)
            r0.append(r15)
            goto L_0x023b
        L_0x013c:
            java.lang.String r15 = r14.f7610c
            java.lang.String r1 = "millis"
            boolean r15 = r1.equals(r15)
            if (r15 == 0) goto L_0x0178
            java.lang.Object r15 = r14.f7611d
            java.lang.Long r15 = (java.lang.Long) r15
            long r1 = r15.longValue()
            r3 = -1
            int r15 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r15 != 0) goto L_0x015b
            java.lang.String r15 = "INFINITY"
            r0.append(r15)
            goto L_0x023b
        L_0x015b:
            java.lang.Object r15 = r14.f7611d
            java.lang.Long r15 = (java.lang.Long) r15
            long r1 = r15.longValue()
            java.util.Calendar r15 = java.util.Calendar.getInstance()
            long r3 = r15.getTimeInMillis()
            r5 = 1000(0x3e8, double:4.94E-321)
            r7 = 262144(0x40000, float:3.67342E-40)
            java.lang.CharSequence r15 = android.text.format.DateUtils.getRelativeTimeSpanString(r1, r3, r5, r7)
            r0.append(r15)
            goto L_0x023b
        L_0x0178:
            java.lang.Object r15 = r14.f7611d
            java.lang.Long r15 = (java.lang.Long) r15
            long r1 = r15.longValue()
            r0.append(r1)
            r15 = 76
            r0.append(r15)
            goto L_0x023b
        L_0x018a:
            java.lang.String r15 = r14.f7610c
            java.lang.String r1 = "color"
            boolean r15 = r1.equals(r15)
            if (r15 == 0) goto L_0x01d2
            java.lang.Object r15 = r14.f7611d
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            java.lang.Object[] r1 = new java.lang.Object[r10]
            int r2 = android.graphics.Color.alpha(r15)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            int r2 = android.graphics.Color.red(r15)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r13] = r2
            int r2 = android.graphics.Color.green(r15)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r12] = r2
            int r15 = android.graphics.Color.blue(r15)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r2 = 3
            r1[r2] = r15
            java.lang.String r15 = "a=0x%02x r=0x%02x g=0x%02x b=0x%02x"
            java.lang.String r15 = java.lang.String.format(r15, r1)
            r0.append(r15)
            goto L_0x023b
        L_0x01d2:
            java.lang.String r15 = r14.f7610c
            java.lang.String r1 = "layout_direction"
            boolean r15 = r1.equals(r15)
            if (r15 == 0) goto L_0x0201
            java.lang.Object r15 = r14.f7611d
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            if (r15 == 0) goto L_0x01fb
            if (r15 == r13) goto L_0x01f8
            if (r15 == r12) goto L_0x01f5
            r1 = 3
            if (r15 == r1) goto L_0x01f2
            java.lang.String r15 = java.lang.Integer.toString(r15)
            goto L_0x01fd
        L_0x01f2:
            java.lang.String r15 = "LOCALE"
            goto L_0x01fd
        L_0x01f5:
            java.lang.String r15 = "INHERIT"
            goto L_0x01fd
        L_0x01f8:
            java.lang.String r15 = "RTL"
            goto L_0x01fd
        L_0x01fb:
            java.lang.String r15 = "LTR"
        L_0x01fd:
            r0.append(r15)
            goto L_0x023b
        L_0x0201:
            java.lang.Object r15 = r14.f7611d
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            r0.append(r15)
            goto L_0x023b
        L_0x020d:
            java.lang.Object r2 = r14.f7611d
            d1.c r2 = (p077d1.C6619c) r2
            F r2 = r2.f14606a
            r4 = 91
            r0.append(r4)
            r0.append(r2)
            java.lang.String r2 = "] "
            r0.append(r2)
            r0.append(r3)
            androidx.slice.Slice r2 = r14.mo12111d()
            java.lang.String r1 = r2.mo12099f(r1)
            r0.append(r1)
            r1 = 10
            r0.append(r1)
            r0.append(r15)
            r15 = 125(0x7d, float:1.75E-43)
            r0.append(r15)
        L_0x023b:
            java.lang.String r15 = "\n"
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slice.SliceItem.mo12112e(java.lang.String):java.lang.String");
    }

    public final String toString() {
        return mo12112e("");
    }

    public SliceItem() {
        this.f7608a = new String[0];
    }
}
