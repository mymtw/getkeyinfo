package p462ug;

import android.widget.ImageView;

/* renamed from: ug.j */
public final class C13534j {

    /* renamed from: ug.j$a */
    public static /* synthetic */ class C13535a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f29601a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f29601a = iArr;
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m21308a(float f, float f2, float f3) {
        if (f >= f2) {
            throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        } else if (f2 >= f3) {
            throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }
}
