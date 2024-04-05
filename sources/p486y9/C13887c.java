package p486y9;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.config.C8591a;
import kotlin.jvm.internal.C19383o;

/* renamed from: y9.c */
public final class C13887c {

    /* renamed from: a */
    public final C8591a f30553a;

    /* renamed from: b */
    public final boolean f30554b;

    public C13887c(C8591a aVar, boolean z) {
        this.f30553a = aVar;
        this.f30554b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13887c)) {
            return false;
        }
        C13887c cVar = (C13887c) obj;
        return C19383o.m32792b(this.f30553a, cVar.f30553a) && this.f30554b == cVar.f30554b;
    }

    public final int hashCode() {
        int hashCode = this.f30553a.hashCode() * 31;
        boolean z = this.f30554b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ConfigUpdatedEvent(config=");
        h.append(this.f30553a);
        h.append(", isFirstFetch=");
        return C0391c.m1058d(h, this.f30554b, ')');
    }
}
