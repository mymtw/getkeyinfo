package p550dl;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: dl.a */
public final class C17575a implements C17577c {

    /* renamed from: a */
    public final float f38446a;

    public C17575a(float f) {
        this.f38446a = f;
    }

    /* renamed from: a */
    public final float mo68901a(RectF rectF) {
        return this.f38446a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17575a)) {
            return false;
        }
        return this.f38446a == ((C17575a) obj).f38446a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f38446a)});
    }
}
