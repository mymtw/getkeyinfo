package androidx.compose.foundation.lazy;

import com.google.android.gms.common.ConnectionResult;
import com.paypal.pyplcheckout.addshipping.ShippingUtilsKt;
import java.util.List;

/* renamed from: androidx.compose.foundation.lazy.u */
public final class C0862u {

    /* renamed from: a */
    public static final float f1851a = ((float) ShippingUtilsKt.mediumHeightScreen);

    /* renamed from: b */
    public static final float f1852b = ((float) ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);

    /* renamed from: a */
    public static final C0827j m1918a(LazyListState lazyListState, int i) {
        C0827j jVar;
        List<C0827j> b = lazyListState.mo4226g().mo4244b();
        int size = b.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                jVar = null;
                break;
            }
            jVar = b.get(i2);
            if (jVar.getIndex() == i) {
                break;
            }
            i2++;
        }
        return jVar;
    }
}
