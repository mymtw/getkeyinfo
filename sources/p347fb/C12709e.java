package p347fb;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

/* renamed from: fb.e */
public interface C12709e extends C12705a {

    /* renamed from: fb.e$a */
    public static final class C12710a implements C12709e {

        /* renamed from: a */
        public final String f28007a = "Loading!";

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12710a) && C19383o.m32792b(this.f28007a, ((C12710a) obj).f28007a);
        }

        public final int hashCode() {
            return this.f28007a.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("ShowToast(message="), this.f28007a, ')');
        }
    }
}
