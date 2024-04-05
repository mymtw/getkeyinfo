package com.etsy.android.p327ui.home.home;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.cardviewelement.Page;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.home.home.f */
public interface C9995f {

    /* renamed from: com.etsy.android.ui.home.home.f$a */
    public static final class C9996a implements C9995f {

        /* renamed from: a */
        public final Throwable f21998a;

        /* renamed from: b */
        public final String f21999b;

        public C9996a(String str, RuntimeException runtimeException) {
            this.f21998a = runtimeException;
            this.f21999b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9996a)) {
                return false;
            }
            C9996a aVar = (C9996a) obj;
            return C19383o.m32792b(this.f21998a, aVar.f21998a) && C19383o.m32792b(this.f21999b, aVar.f21999b);
        }

        public final int hashCode() {
            int hashCode = this.f21998a.hashCode() * 31;
            String str = this.f21999b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Failure(error=");
            h.append(this.f21998a);
            h.append(", message=");
            return C0391c.m1057c(h, this.f21999b, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.home.home.f$b */
    public static final class C9997b implements C9995f {

        /* renamed from: a */
        public final Page f22000a;

        /* renamed from: b */
        public final String f22001b;

        public C9997b(Page page, String str) {
            this.f22000a = page;
            this.f22001b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9997b)) {
                return false;
            }
            C9997b bVar = (C9997b) obj;
            return C19383o.m32792b(this.f22000a, bVar.f22000a) && C19383o.m32792b(this.f22001b, bVar.f22001b);
        }

        public final int hashCode() {
            int hashCode = this.f22000a.hashCode() * 31;
            String str = this.f22001b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Success(page=");
            h.append(this.f22000a);
            h.append(", nextPageUrl=");
            return C0391c.m1057c(h, this.f22001b, ')');
        }
    }
}
