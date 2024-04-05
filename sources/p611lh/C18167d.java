package p611lh;

import android.media.AudioAttributes;
import p513bj.C14049b0;

/* renamed from: lh.d */
public final class C18167d {

    /* renamed from: f */
    public static final C18167d f39738f = new C18167d();

    /* renamed from: a */
    public final int f39739a = 0;

    /* renamed from: b */
    public final int f39740b = 0;

    /* renamed from: c */
    public final int f39741c = 1;

    /* renamed from: d */
    public final int f39742d = 1;

    /* renamed from: e */
    public AudioAttributes f39743e;

    /* renamed from: a */
    public final AudioAttributes mo69707a() {
        if (this.f39743e == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f39739a).setFlags(this.f39740b).setUsage(this.f39741c);
            if (C14049b0.f30913a >= 29) {
                usage.setAllowedCapturePolicy(this.f39742d);
            }
            this.f39743e = usage.build();
        }
        return this.f39743e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18167d.class != obj.getClass()) {
            return false;
        }
        C18167d dVar = (C18167d) obj;
        return this.f39739a == dVar.f39739a && this.f39740b == dVar.f39740b && this.f39741c == dVar.f39741c && this.f39742d == dVar.f39742d;
    }

    public final int hashCode() {
        return ((((((527 + this.f39739a) * 31) + this.f39740b) * 31) + this.f39741c) * 31) + this.f39742d;
    }
}
