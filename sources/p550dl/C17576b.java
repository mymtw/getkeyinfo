package p550dl;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: dl.b */
public final class C17576b implements C17577c {

    /* renamed from: a */
    public final C17577c f38447a;

    /* renamed from: b */
    public final float f38448b;

    public C17576b(float f, C17577c cVar) {
        while (cVar instanceof C17576b) {
            cVar = ((C17576b) cVar).f38447a;
            f += ((C17576b) cVar).f38448b;
        }
        this.f38447a = cVar;
        this.f38448b = f;
    }

    /* renamed from: a */
    public final float mo68901a(RectF rectF) {
        return Math.max(0.0f, this.f38447a.mo68901a(rectF) + this.f38448b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17576b)) {
            return false;
        }
        C17576b bVar = (C17576b) obj;
        return this.f38447a.equals(bVar.f38447a) && this.f38448b == bVar.f38448b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f38447a, Float.valueOf(this.f38448b)});
    }
}
