package com.etsy.android.p327ui.home.landingpage;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.apiv3.ListingCard;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.home.landingpage.a */
public interface C10013a {

    /* renamed from: com.etsy.android.ui.home.landingpage.a$a */
    public static final class C10014a implements C10013a {

        /* renamed from: a */
        public static final C10014a f22055a = new C10014a();
    }

    /* renamed from: com.etsy.android.ui.home.landingpage.a$b */
    public static final class C10015b implements C10013a {

        /* renamed from: a */
        public final String f22056a;

        /* renamed from: b */
        public final int f22057b;

        /* renamed from: c */
        public final Throwable f22058c;

        public C10015b(String str, int i, Throwable th) {
            this.f22056a = str;
            this.f22057b = i;
            this.f22058c = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10015b)) {
                return false;
            }
            C10015b bVar = (C10015b) obj;
            return C19383o.m32792b(this.f22056a, bVar.f22056a) && this.f22057b == bVar.f22057b && C19383o.m32792b(this.f22058c, bVar.f22058c);
        }

        public final int hashCode() {
            String str = this.f22056a;
            int i = 0;
            int a = C0069a.m170a(this.f22057b, (str == null ? 0 : str.hashCode()) * 31, 31);
            Throwable th = this.f22058c;
            if (th != null) {
                i = th.hashCode();
            }
            return a + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Error(errorMessage=");
            h.append(this.f22056a);
            h.append(", code=");
            h.append(this.f22057b);
            h.append(", error=");
            return C0070b.m185h(h, this.f22058c, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.home.landingpage.a$c */
    public static final class C10016c implements C10013a {

        /* renamed from: a */
        public final List<ListingCard> f22059a;

        /* renamed from: b */
        public final Integer f22060b;

        /* renamed from: c */
        public final String f22061c;

        public C10016c(String str, List list, Integer num) {
            this.f22059a = list;
            this.f22060b = num;
            this.f22061c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10016c)) {
                return false;
            }
            C10016c cVar = (C10016c) obj;
            return C19383o.m32792b(this.f22059a, cVar.f22059a) && C19383o.m32792b(this.f22060b, cVar.f22060b) && C19383o.m32792b(this.f22061c, cVar.f22061c);
        }

        public final int hashCode() {
            int hashCode = this.f22059a.hashCode() * 31;
            Integer num = this.f22060b;
            int i = 0;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.f22061c;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ListingCardContent(listingCards=");
            h.append(this.f22059a);
            h.append(", maxCount=");
            h.append(this.f22060b);
            h.append(", nextPageUrl=");
            return C0391c.m1057c(h, this.f22061c, ')');
        }
    }
}
