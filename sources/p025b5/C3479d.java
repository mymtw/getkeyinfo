package p025b5;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import androidx.activity.C0114h;
import java.security.MessageDigest;
import p150j4.C7109b;

/* renamed from: b5.d */
public final class C3479d implements C7109b {

    /* renamed from: b */
    public final Object f8101b;

    public C3479d(Object obj) {
        C0114h.m281L(obj);
        this.f8101b = obj;
    }

    /* renamed from: b */
    public final void mo12991b(MessageDigest messageDigest) {
        messageDigest.update(this.f8101b.toString().getBytes(C7109b.f15813a));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3479d) {
            return this.f8101b.equals(((C3479d) obj).f8101b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8101b.hashCode();
    }

    public final String toString() {
        return C0073e.m209i(C0072d.m201h("ObjectKey{object="), this.f8101b, '}');
    }
}
