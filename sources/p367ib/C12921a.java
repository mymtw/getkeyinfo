package p367ib;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.apiv3.cart.CartPage;
import kotlin.jvm.internal.C19383o;
import retrofit2.HttpException;

/* renamed from: ib.a */
public interface C12921a {

    /* renamed from: ib.a$a */
    public static final class C12922a implements C12921a {

        /* renamed from: a */
        public final Throwable f28486a;

        /* renamed from: b */
        public final String f28487b;

        public C12922a(String str, HttpException httpException) {
            this.f28486a = httpException;
            this.f28487b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12922a)) {
                return false;
            }
            C12922a aVar = (C12922a) obj;
            return C19383o.m32792b(this.f28486a, aVar.f28486a) && C19383o.m32792b(this.f28487b, aVar.f28487b);
        }

        public final int hashCode() {
            Throwable th = this.f28486a;
            int i = 0;
            int hashCode = (th == null ? 0 : th.hashCode()) * 31;
            String str = this.f28487b;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Failure(throwable=");
            h.append(this.f28486a);
            h.append(", message=");
            return C0391c.m1057c(h, this.f28487b, ')');
        }
    }

    /* renamed from: ib.a$b */
    public static final class C12923b implements C12921a {

        /* renamed from: a */
        public final CartPage f28488a;

        public C12923b(CartPage cartPage) {
            this.f28488a = cartPage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12923b) && C19383o.m32792b(this.f28488a, ((C12923b) obj).f28488a);
        }

        public final int hashCode() {
            CartPage cartPage = this.f28488a;
            if (cartPage == null) {
                return 0;
            }
            return cartPage.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Success(cartPage=");
            h.append(this.f28488a);
            h.append(')');
            return h.toString();
        }
    }
}
