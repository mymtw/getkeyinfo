package androidx.compose.p015ui.text.input;

import androidx.compose.foundation.layout.C0761x;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.text.input.o */
public final class C1997o {

    /* renamed from: a */
    public String f4513a;

    /* renamed from: b */
    public C1988h f4514b;

    /* renamed from: c */
    public int f4515c = -1;

    /* renamed from: d */
    public int f4516d = -1;

    public C1997o(String str) {
        C19383o.m32797g(str, "text");
        this.f4513a = str;
    }

    /* renamed from: a */
    public final int mo7685a() {
        C1988h hVar = this.f4514b;
        if (hVar == null) {
            return this.f4513a.length();
        }
        return (hVar.f4475a - (hVar.f4478d - hVar.f4477c)) + (this.f4513a.length() - (this.f4516d - this.f4515c));
    }

    /* renamed from: b */
    public final void mo7686b(int i, int i2, String str) {
        C19383o.m32797g(str, "text");
        C1988h hVar = this.f4514b;
        if (hVar == null) {
            int max = Math.max(255, str.length() + 128);
            char[] cArr = new char[max];
            int min = Math.min(i, 64);
            int min2 = Math.min(this.f4513a.length() - i2, 64);
            int i3 = i - min;
            C0761x.m1688Q0(this.f4513a, cArr, 0, i3, i);
            int i4 = max - min2;
            int i5 = min2 + i2;
            C0761x.m1688Q0(this.f4513a, cArr, i4, i2, i5);
            C0761x.m1688Q0(str, cArr, min, 0, str.length());
            this.f4514b = new C1988h(cArr, str.length() + min, i4);
            this.f4515c = i3;
            this.f4516d = i5;
            return;
        }
        int i6 = this.f4515c;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > hVar.f4475a - (hVar.f4478d - hVar.f4477c)) {
            this.f4513a = toString();
            this.f4514b = null;
            this.f4515c = -1;
            this.f4516d = -1;
            mo7686b(i, i2, str);
            return;
        }
        int length = str.length() - (i8 - i7);
        int i9 = hVar.f4478d - hVar.f4477c;
        if (length > i9) {
            int i10 = length - i9;
            int i11 = hVar.f4475a;
            do {
                i11 *= 2;
            } while (i11 - hVar.f4475a < i10);
            char[] cArr2 = new char[i11];
            C19318k.m32602T0(hVar.f4476b, cArr2, 0, 0, hVar.f4477c);
            int i12 = hVar.f4475a;
            int i13 = hVar.f4478d;
            int i14 = i12 - i13;
            int i15 = i11 - i14;
            C19318k.m32602T0(hVar.f4476b, cArr2, i15, i13, i14 + i13);
            hVar.f4476b = cArr2;
            hVar.f4475a = i11;
            hVar.f4478d = i15;
        }
        int i16 = hVar.f4477c;
        if (i7 < i16 && i8 <= i16) {
            int i17 = i16 - i8;
            char[] cArr3 = hVar.f4476b;
            C19318k.m32602T0(cArr3, cArr3, hVar.f4478d - i17, i8, i16);
            hVar.f4477c = i7;
            hVar.f4478d -= i17;
        } else if (i7 >= i16 || i8 < i16) {
            int i18 = hVar.f4478d;
            int i19 = i18 - i16;
            int i20 = i7 + i19;
            char[] cArr4 = hVar.f4476b;
            C19318k.m32602T0(cArr4, cArr4, i16, i18, i20);
            hVar.f4477c += i20 - i18;
            hVar.f4478d = i19 + i8;
        } else {
            hVar.f4478d = (hVar.f4478d - i16) + i8;
            hVar.f4477c = i7;
        }
        C0761x.m1688Q0(str, hVar.f4476b, hVar.f4477c, 0, str.length());
        hVar.f4477c = str.length() + hVar.f4477c;
    }

    public final String toString() {
        C1988h hVar = this.f4514b;
        if (hVar == null) {
            return this.f4513a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4513a, 0, this.f4515c);
        sb.append(hVar.f4476b, 0, hVar.f4477c);
        char[] cArr = hVar.f4476b;
        int i = hVar.f4478d;
        sb.append(cArr, i, hVar.f4475a - i);
        String str = this.f4513a;
        sb.append(str, this.f4516d, str.length());
        String sb2 = sb.toString();
        C19383o.m32796f(sb2, "sb.toString()");
        return sb2;
    }
}
