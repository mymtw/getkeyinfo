package androidx.compose.p015ui.graphics;

import android.graphics.Paint;

/* renamed from: androidx.compose.ui.graphics.f */
public final /* synthetic */ class C1519f {

    /* renamed from: a */
    public static final /* synthetic */ int[] f3293a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f3294b;

    static {
        new int[Paint.Style.values().length][Paint.Style.STROKE.ordinal()] = 1;
        int[] iArr = new int[Paint.Cap.values().length];
        iArr[Paint.Cap.BUTT.ordinal()] = 1;
        iArr[Paint.Cap.ROUND.ordinal()] = 2;
        iArr[Paint.Cap.SQUARE.ordinal()] = 3;
        f3293a = iArr;
        int[] iArr2 = new int[Paint.Join.values().length];
        iArr2[Paint.Join.MITER.ordinal()] = 1;
        iArr2[Paint.Join.BEVEL.ordinal()] = 2;
        iArr2[Paint.Join.ROUND.ordinal()] = 3;
        f3294b = iArr2;
    }
}
