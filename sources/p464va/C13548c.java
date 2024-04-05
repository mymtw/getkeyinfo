package p464va;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.apiv3.vespa.ListSectionActionResult;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import retrofit2.HttpException;

/* renamed from: va.c */
public abstract class C13548c {

    /* renamed from: va.c$a */
    public static final class C13549a extends C13548c {

        /* renamed from: a */
        public final Throwable f29630a;

        /* renamed from: b */
        public final String f29631b;

        public C13549a(String str, HttpException httpException) {
            this.f29630a = httpException;
            this.f29631b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13549a)) {
                return false;
            }
            C13549a aVar = (C13549a) obj;
            return C19383o.m32792b(this.f29630a, aVar.f29630a) && C19383o.m32792b(this.f29631b, aVar.f29631b);
        }

        public final int hashCode() {
            int hashCode = this.f29630a.hashCode() * 31;
            String str = this.f29631b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Failure(error=");
            h.append(this.f29630a);
            h.append(", message=");
            return C0391c.m1057c(h, this.f29631b, ')');
        }
    }

    /* renamed from: va.c$b */
    public static final class C13550b extends C13548c {

        /* renamed from: a */
        public final List<ListSectionActionResult> f29632a;

        /* renamed from: b */
        public final String f29633b;

        public C13550b(List<? extends ListSectionActionResult> list, String str) {
            C19383o.m32797g(list, "actionResults");
            this.f29632a = list;
            this.f29633b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13550b)) {
                return false;
            }
            C13550b bVar = (C13550b) obj;
            return C19383o.m32792b(this.f29632a, bVar.f29632a) && C19383o.m32792b(this.f29633b, bVar.f29633b);
        }

        public final int hashCode() {
            int hashCode = this.f29632a.hashCode() * 31;
            String str = this.f29633b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Success(actionResults=");
            h.append(this.f29632a);
            h.append(", nextLink=");
            return C0391c.m1057c(h, this.f29633b, ')');
        }

        public C13550b() {
            this(EmptyList.INSTANCE, (String) null);
        }
    }
}
