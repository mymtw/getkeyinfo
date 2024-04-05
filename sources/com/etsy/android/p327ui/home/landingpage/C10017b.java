package com.etsy.android.p327ui.home.landingpage;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.apiv3.ListingCard;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.home.landingpage.b */
public interface C10017b {

    /* renamed from: com.etsy.android.ui.home.landingpage.b$a */
    public static final class C10018a implements C10017b {

        /* renamed from: a */
        public static final C10018a f22062a = new C10018a();
    }

    /* renamed from: com.etsy.android.ui.home.landingpage.b$b */
    public static final class C10019b implements C10017b {

        /* renamed from: a */
        public final String f22063a;

        /* renamed from: b */
        public final int f22064b;

        /* renamed from: c */
        public final Throwable f22065c;

        public C10019b(String str, int i, Throwable th) {
            this.f22063a = str;
            this.f22064b = i;
            this.f22065c = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10019b)) {
                return false;
            }
            C10019b bVar = (C10019b) obj;
            return C19383o.m32792b(this.f22063a, bVar.f22063a) && this.f22064b == bVar.f22064b && C19383o.m32792b(this.f22065c, bVar.f22065c);
        }

        public final int hashCode() {
            String str = this.f22063a;
            int i = 0;
            int a = C0069a.m170a(this.f22064b, (str == null ? 0 : str.hashCode()) * 31, 31);
            Throwable th = this.f22065c;
            if (th != null) {
                i = th.hashCode();
            }
            return a + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Error(errorMessage=");
            h.append(this.f22063a);
            h.append(", code=");
            h.append(this.f22064b);
            h.append(", error=");
            return C0070b.m185h(h, this.f22065c, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.home.landingpage.b$c */
    public static final class C10020c implements C10017b {

        /* renamed from: a */
        public final List<ListingCard> f22066a;

        /* renamed from: b */
        public final Integer f22067b;

        /* renamed from: c */
        public final String f22068c;

        public C10020c(String str, List list, Integer num) {
            C19383o.m32797g(list, "listingCards");
            this.f22066a = list;
            this.f22067b = num;
            this.f22068c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10020c)) {
                return false;
            }
            C10020c cVar = (C10020c) obj;
            return C19383o.m32792b(this.f22066a, cVar.f22066a) && C19383o.m32792b(this.f22067b, cVar.f22067b) && C19383o.m32792b(this.f22068c, cVar.f22068c);
        }

        public final int hashCode() {
            int hashCode = this.f22066a.hashCode() * 31;
            Integer num = this.f22067b;
            int i = 0;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.f22068c;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ListingCardContent(listingCards=");
            h.append(this.f22066a);
            h.append(", maxCount=");
            h.append(this.f22067b);
            h.append(", nextPageUrl=");
            return C0391c.m1057c(h, this.f22068c, ')');
        }
    }
}
