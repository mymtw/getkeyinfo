package androidx.compose.foundation.lazy.grid;

import com.google.android.gms.common.ConnectionResult;
import com.paypal.pyplcheckout.addshipping.ShippingUtilsKt;
import java.util.List;
import p174m0.C7290i;

/* renamed from: androidx.compose.foundation.lazy.grid.r */
public final class C0816r {

    /* renamed from: a */
    public static final float f1740a = ((float) ShippingUtilsKt.mediumHeightScreen);

    /* renamed from: b */
    public static final float f1741b = ((float) ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);

    /* renamed from: a */
    public static final int m1850a(List list) {
        LazyGridScrollingKt$calculateLineAverageMainAxisSize$lineOf$1 lazyGridScrollingKt$calculateLineAverageMainAxisSize$lineOf$1 = new LazyGridScrollingKt$calculateLineAverageMainAxisSize$lineOf$1(true, list);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < list.size()) {
            int intValue = ((Number) lazyGridScrollingKt$calculateLineAverageMainAxisSize$lineOf$1.invoke(Integer.valueOf(i))).intValue();
            if (intValue == -1) {
                i++;
            } else {
                int i4 = 0;
                while (i < list.size() && ((Number) lazyGridScrollingKt$calculateLineAverageMainAxisSize$lineOf$1.invoke(Integer.valueOf(i))).intValue() == intValue) {
                    i4 = Math.max(i4, C7290i.m13995b(((C0805g) list.get(i)).mo4339a()));
                    i++;
                }
                i2 += i4;
                i3++;
            }
        }
        return i2 / i3;
    }

    /* renamed from: b */
    public static final C0805g m1851b(LazyGridState lazyGridState, int i) {
        C0805g gVar;
        List<C0805g> b = lazyGridState.mo4315g().mo4331b();
        int size = b.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                gVar = null;
                break;
            }
            gVar = b.get(i2);
            if (gVar.getIndex() == i) {
                break;
            }
            i2++;
        }
        return gVar;
    }
}
