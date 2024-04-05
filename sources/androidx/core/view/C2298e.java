package androidx.core.view;

import android.os.Build;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: androidx.core.view.e */
public final class C2298e {

    /* renamed from: a */
    public final Object f5555a;

    public C2298e(Object obj) {
        this.f5555a = obj;
    }

    /* renamed from: a */
    public final int mo8889a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f5555a).getSafeInsetBottom();
        }
        return 0;
    }

    /* renamed from: b */
    public final int mo8890b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f5555a).getSafeInsetLeft();
        }
        return 0;
    }

    /* renamed from: c */
    public final int mo8891c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f5555a).getSafeInsetRight();
        }
        return 0;
    }

    /* renamed from: d */
    public final int mo8892d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f5555a).getSafeInsetTop();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2298e.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f5555a, ((C2298e) obj).f5555a);
    }

    public final int hashCode() {
        Object obj = this.f5555a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return C0071c.m192d(C0072d.m201h("DisplayCutoutCompat{"), this.f5555a, "}");
    }
}
