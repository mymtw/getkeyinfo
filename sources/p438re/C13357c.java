package p438re;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.navigation.keys.bottomsheetkeys.DetailsBottomSheetNavigationKey;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p010a9.C0048b;

/* renamed from: re.c */
public abstract class C13357c {

    /* renamed from: re.c$a */
    public static final class C13358a extends C13357c {

        /* renamed from: a */
        public static final C13358a f29286a = new C13358a();
    }

    /* renamed from: re.c$b */
    public static final class C13359b extends C13357c {

        /* renamed from: a */
        public final boolean f29287a;

        public C13359b(boolean z) {
            this.f29287a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13359b) && this.f29287a == ((C13359b) obj).f29287a;
        }

        public final int hashCode() {
            boolean z = this.f29287a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return C0391c.m1058d(C0072d.m201h("Favorite(toFavoriteState="), this.f29287a, ')');
        }
    }

    /* renamed from: re.c$c */
    public static final class C13360c extends C13357c {

        /* renamed from: a */
        public final String f29288a;

        /* renamed from: b */
        public final String f29289b;

        /* renamed from: c */
        public final String f29290c;

        public C13360c(String str, String str2, String str3) {
            C0048b.m167f(str, "title", str2, DetailsBottomSheetNavigationKey.PARAM_BODY, str3, "eventName");
            this.f29288a = str;
            this.f29289b = str2;
            this.f29290c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13360c)) {
                return false;
            }
            C13360c cVar = (C13360c) obj;
            return C19383o.m32792b(this.f29288a, cVar.f29288a) && C19383o.m32792b(this.f29289b, cVar.f29289b) && C19383o.m32792b(this.f29290c, cVar.f29290c);
        }

        public final int hashCode() {
            return this.f29290c.hashCode() + C0023f.m105e(this.f29289b, this.f29288a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("StarSellerBadgeClicked(title=");
            h.append(this.f29288a);
            h.append(", body=");
            h.append(this.f29289b);
            h.append(", eventName=");
            return C0391c.m1057c(h, this.f29290c, ')');
        }
    }
}
