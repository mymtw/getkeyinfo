package androidx.compose.p015ui.platform;

import androidx.compose.p015ui.text.input.C1998p;
import androidx.compose.p015ui.text.input.C2002t;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.platform.AndroidComposeView_androidKt */
public final class AndroidComposeView_androidKt {

    /* renamed from: a */
    public static C19857l<? super C1998p, ? extends C2002t> f3985a = AndroidComposeView_androidKt$textInputServiceFactory$1.INSTANCE;

    /* renamed from: a */
    public static final void m3930a(float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        float b = m3931b(0, 0, fArr4, fArr3);
        float b2 = m3931b(0, 1, fArr4, fArr3);
        float b3 = m3931b(0, 2, fArr4, fArr3);
        float b4 = m3931b(0, 3, fArr4, fArr3);
        float b5 = m3931b(1, 0, fArr4, fArr3);
        float b6 = m3931b(1, 1, fArr4, fArr3);
        float b7 = m3931b(1, 2, fArr4, fArr3);
        float b8 = m3931b(1, 3, fArr4, fArr3);
        float b9 = m3931b(2, 0, fArr4, fArr3);
        float b10 = m3931b(2, 1, fArr4, fArr3);
        float b11 = m3931b(2, 2, fArr4, fArr3);
        float b12 = m3931b(2, 3, fArr4, fArr3);
        float b13 = m3931b(3, 0, fArr4, fArr3);
        float b14 = m3931b(3, 1, fArr4, fArr3);
        float b15 = m3931b(3, 2, fArr4, fArr3);
        float b16 = m3931b(3, 3, fArr4, fArr3);
        fArr3[0] = b;
        fArr3[1] = b2;
        fArr3[2] = b3;
        fArr3[3] = b4;
        fArr3[4] = b5;
        fArr3[5] = b6;
        fArr3[6] = b7;
        fArr3[7] = b8;
        fArr3[8] = b9;
        fArr3[9] = b10;
        fArr3[10] = b11;
        fArr3[11] = b12;
        fArr3[12] = b13;
        fArr3[13] = b14;
        fArr3[14] = b15;
        fArr3[15] = b16;
    }

    /* renamed from: b */
    public static final float m3931b(int i, int i2, float[] fArr, float[] fArr2) {
        int i3 = i * 4;
        float f = (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3 + 0] * fArr2[0 + i2]);
        return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + f;
    }
}
