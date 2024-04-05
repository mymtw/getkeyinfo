package p186n2;

import android.view.View;
import android.view.WindowId;

/* renamed from: n2.g0 */
public final class C7402g0 implements C7404h0 {

    /* renamed from: a */
    public final WindowId f16543a;

    public C7402g0(View view) {
        this.f16543a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C7402g0) && ((C7402g0) obj).f16543a.equals(this.f16543a);
    }

    public final int hashCode() {
        return this.f16543a.hashCode();
    }
}
