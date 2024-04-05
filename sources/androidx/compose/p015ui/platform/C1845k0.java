package androidx.compose.p015ui.platform;

import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.compose.runtime.C1341k0;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.C1422x0;
import androidx.compose.runtime.snapshots.C1395m;
import java.io.Serializable;
import kotlin.C19283a;

/* renamed from: androidx.compose.ui.platform.k0 */
public final class C1845k0 {

    /* renamed from: a */
    public static final Class<? extends Object>[] f4102a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* renamed from: a */
    public static final boolean m4050a(Object obj) {
        if (obj instanceof C1395m) {
            C1395m mVar = (C1395m) obj;
            if (mVar.getPolicy() != C1341k0.f2935a && mVar.getPolicy() != C1351n1.f2948a && mVar.getPolicy() != C1422x0.f3093a) {
                return false;
            }
            Object value = mVar.getValue();
            if (value == null) {
                return true;
            }
            return m4050a(value);
        } else if ((obj instanceof C19283a) && (obj instanceof Serializable)) {
            return false;
        } else {
            Class<? extends Object>[] clsArr = f4102a;
            for (int i = 0; i < 7; i++) {
                if (clsArr[i].isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }
}
