package androidx.work;

import android.net.Uri;
import java.util.HashSet;

/* renamed from: androidx.work.d */
public final class C3378d {

    /* renamed from: a */
    public final HashSet f7894a = new HashSet();

    /* renamed from: androidx.work.d$a */
    public static final class C3379a {

        /* renamed from: a */
        public final Uri f7895a;

        /* renamed from: b */
        public final boolean f7896b;

        public C3379a(boolean z, Uri uri) {
            this.f7895a = uri;
            this.f7896b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C3379a.class != obj.getClass()) {
                return false;
            }
            C3379a aVar = (C3379a) obj;
            return this.f7896b == aVar.f7896b && this.f7895a.equals(aVar.f7895a);
        }

        public final int hashCode() {
            return (this.f7895a.hashCode() * 31) + (this.f7896b ? 1 : 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3378d.class != obj.getClass()) {
            return false;
        }
        return this.f7894a.equals(((C3378d) obj).f7894a);
    }

    public final int hashCode() {
        return this.f7894a.hashCode();
    }
}
