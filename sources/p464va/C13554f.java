package p464va;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.cardviewelement.Page;
import com.etsy.android.lib.network.NetworkException;
import kotlin.jvm.internal.C19383o;

/* renamed from: va.f */
public abstract class C13554f {

    /* renamed from: va.f$a */
    public static final class C13555a extends C13554f {

        /* renamed from: a */
        public final NetworkException f29638a;

        /* renamed from: b */
        public final String f29639b;

        public C13555a(NetworkException networkException, String str) {
            this.f29638a = networkException;
            this.f29639b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13555a)) {
                return false;
            }
            C13555a aVar = (C13555a) obj;
            return C19383o.m32792b(this.f29638a, aVar.f29638a) && C19383o.m32792b(this.f29639b, aVar.f29639b);
        }

        public final int hashCode() {
            int hashCode = this.f29638a.hashCode() * 31;
            String str = this.f29639b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Failure(error=");
            h.append(this.f29638a);
            h.append(", message=");
            return C0391c.m1057c(h, this.f29639b, ')');
        }
    }

    /* renamed from: va.f$b */
    public static final class C13556b extends C13554f {

        /* renamed from: a */
        public final Page f29640a;

        /* renamed from: b */
        public final int f29641b;

        /* renamed from: c */
        public final String f29642c;

        public C13556b(Page page, int i, String str) {
            this.f29640a = page;
            this.f29641b = i;
            this.f29642c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13556b)) {
                return false;
            }
            C13556b bVar = (C13556b) obj;
            return C19383o.m32792b(this.f29640a, bVar.f29640a) && this.f29641b == bVar.f29641b && C19383o.m32792b(this.f29642c, bVar.f29642c);
        }

        public final int hashCode() {
            Page page = this.f29640a;
            int i = 0;
            int a = C0069a.m170a(this.f29641b, (page == null ? 0 : page.hashCode()) * 31, 31);
            String str = this.f29642c;
            if (str != null) {
                i = str.hashCode();
            }
            return a + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Success(page=");
            h.append(this.f29640a);
            h.append(", maxCount=");
            h.append(this.f29641b);
            h.append(", nextLink=");
            return C0391c.m1057c(h, this.f29642c, ')');
        }
    }
}
