package p550dl;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: dl.h */
public final class C17582h implements C17577c {

    /* renamed from: a */
    public final float f38453a;

    public C17582h(float f) {
        this.f38453a = f;
    }

    /* renamed from: a */
    public final float mo68901a(RectF rectF) {
        return rectF.height() * this.f38453a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17582h)) {
            return false;
        }
        return this.f38453a == ((C17582h) obj).f38453a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f38453a)});
    }
}
