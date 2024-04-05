package p221r3;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;

/* renamed from: r3.c */
public final class C7741c {

    /* renamed from: a */
    public final int f17166a;

    public C7741c(int i) {
        this.f17166a = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C7741c) && this.f17166a == ((C7741c) obj).f17166a;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17166a);
    }

    public final String toString() {
        return C0071c.m191c(C0072d.m201h("ResourceId(resId="), this.f17166a, ")");
    }
}
