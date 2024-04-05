package androidx.compose.p015ui.text;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;

/* renamed from: androidx.compose.ui.text.k */
public final class C2009k {

    /* renamed from: b */
    public static final C2009k f4531b = new C2009k();

    /* renamed from: a */
    public final boolean f4532a;

    public C2009k(boolean z) {
        this.f4532a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2009k) && this.f4532a == ((C2009k) obj).f4532a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4532a);
    }

    public final String toString() {
        return C0391c.m1058d(C0072d.m201h("PlatformParagraphStyle(includeFontPadding="), this.f4532a, ')');
    }

    public C2009k() {
        this(true);
    }
}
