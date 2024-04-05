package p367ib;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.cart.SavedCart;
import kotlin.jvm.internal.C19383o;

/* renamed from: ib.b */
public abstract class C12924b {

    /* renamed from: ib.b$a */
    public static final class C12925a extends C12924b {

        /* renamed from: a */
        public final SavedCart f28489a;

        public C12925a(SavedCart savedCart) {
            C19383o.m32797g(savedCart, "savedCartItem");
            this.f28489a = savedCart;
        }

        /* renamed from: a */
        public final SavedCart mo45691a() {
            return this.f28489a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12925a) && C19383o.m32792b(this.f28489a, ((C12925a) obj).f28489a);
        }

        public final int hashCode() {
            return this.f28489a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("MoveToCart(savedCartItem=");
            h.append(this.f28489a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: ib.b$b */
    public static final class C12926b extends C12924b {

        /* renamed from: a */
        public final SavedCart f28490a;

        public C12926b(SavedCart savedCart) {
            C19383o.m32797g(savedCart, "savedCartItem");
            this.f28490a = savedCart;
        }

        /* renamed from: a */
        public final SavedCart mo45691a() {
            return this.f28490a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12926b) && C19383o.m32792b(this.f28490a, ((C12926b) obj).f28490a);
        }

        public final int hashCode() {
            return this.f28490a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("MoveToFavorites(savedCartItem=");
            h.append(this.f28490a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: ib.b$c */
    public static final class C12927c extends C12924b {

        /* renamed from: a */
        public final SavedCart f28491a;

        public C12927c(SavedCart savedCart) {
            C19383o.m32797g(savedCart, "savedCartItem");
            this.f28491a = savedCart;
        }

        /* renamed from: a */
        public final SavedCart mo45691a() {
            return this.f28491a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12927c) && C19383o.m32792b(this.f28491a, ((C12927c) obj).f28491a);
        }

        public final int hashCode() {
            return this.f28491a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Remove(savedCartItem=");
            h.append(this.f28491a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: a */
    public abstract SavedCart mo45691a();
}
