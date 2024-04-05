package com.etsy.android.p327ui.home.editorspicks;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.finds.FindsPage;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.home.editorspicks.e */
public abstract class C9930e {

    /* renamed from: com.etsy.android.ui.home.editorspicks.e$a */
    public static final class C9931a extends C9930e {

        /* renamed from: a */
        public static final C9931a f21886a = new C9931a();
    }

    /* renamed from: com.etsy.android.ui.home.editorspicks.e$b */
    public static final class C9932b extends C9930e {

        /* renamed from: a */
        public final List<Integer> f21887a;

        public C9932b(List<Integer> list) {
            C19383o.m32797g(list, "itemPositions");
            this.f21887a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9932b) && C19383o.m32792b(this.f21887a, ((C9932b) obj).f21887a);
        }

        public final int hashCode() {
            return this.f21887a.hashCode();
        }

        public final String toString() {
            return C0070b.m186i(C0072d.m201h("NotifyItemUpdates(itemPositions="), this.f21887a, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.home.editorspicks.e$c */
    public static final class C9933c extends C9930e {

        /* renamed from: a */
        public static final C9933c f21888a = new C9933c();
    }

    /* renamed from: com.etsy.android.ui.home.editorspicks.e$d */
    public static final class C9934d extends C9930e {

        /* renamed from: a */
        public final FindsPage f21889a;

        public C9934d(FindsPage findsPage) {
            C19383o.m32797g(findsPage, "findsPage");
            this.f21889a = findsPage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9934d) && C19383o.m32792b(this.f21889a, ((C9934d) obj).f21889a);
        }

        public final int hashCode() {
            return this.f21889a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("PageLoadedSuccess(findsPage=");
            h.append(this.f21889a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.home.editorspicks.e$e */
    public static final class C9935e extends C9930e {

        /* renamed from: a */
        public final String f21890a;

        public C9935e(String str) {
            this.f21890a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9935e) && C19383o.m32792b(this.f21890a, ((C9935e) obj).f21890a);
        }

        public final int hashCode() {
            return this.f21890a.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("ScrollToSection(section="), this.f21890a, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.home.editorspicks.e$f */
    public static final class C9936f extends C9930e {

        /* renamed from: a */
        public final String f21891a;

        /* renamed from: b */
        public final String f21892b;

        public C9936f(String str, String str2) {
            C19383o.m32797g(str, "shareUrl");
            this.f21891a = str;
            this.f21892b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9936f)) {
                return false;
            }
            C9936f fVar = (C9936f) obj;
            return C19383o.m32792b(this.f21891a, fVar.f21891a) && C19383o.m32792b(this.f21892b, fVar.f21892b);
        }

        public final int hashCode() {
            int hashCode = this.f21891a.hashCode() * 31;
            String str = this.f21892b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Share(shareUrl=");
            h.append(this.f21891a);
            h.append(", shareImageUrl=");
            return C0391c.m1057c(h, this.f21892b, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.home.editorspicks.e$g */
    public static final class C9937g extends C9930e {

        /* renamed from: a */
        public final EtsyId f21893a;

        /* renamed from: b */
        public final EtsyId f21894b;

        public C9937g(EtsyId etsyId, EtsyId etsyId2) {
            this.f21893a = etsyId;
            this.f21894b = etsyId2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9937g)) {
                return false;
            }
            C9937g gVar = (C9937g) obj;
            return C19383o.m32792b(this.f21893a, gVar.f21893a) && C19383o.m32792b(this.f21894b, gVar.f21894b);
        }

        public final int hashCode() {
            EtsyId etsyId = this.f21893a;
            int i = 0;
            int hashCode = (etsyId == null ? 0 : etsyId.hashCode()) * 31;
            EtsyId etsyId2 = this.f21894b;
            if (etsyId2 != null) {
                i = etsyId2.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("TrackScrollToBottom(findsPageId=");
            h.append(this.f21893a);
            h.append(", findsPagePublishedId=");
            h.append(this.f21894b);
            h.append(')');
            return h.toString();
        }
    }
}
