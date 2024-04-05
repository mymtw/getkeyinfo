package com.etsy.android.p327ui.favorites.add;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.CheckableListingCollection;
import java.util.Set;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.favorites.add.c */
public abstract class C9754c {

    /* renamed from: com.etsy.android.ui.favorites.add.c$a */
    public static final class C9755a extends C9754c {

        /* renamed from: a */
        public final CheckableListingCollection f21586a;

        /* renamed from: b */
        public final Set<CheckableListingCollection> f21587b;

        public C9755a(CheckableListingCollection checkableListingCollection, Set<? extends CheckableListingCollection> set) {
            C19383o.m32797g(checkableListingCollection, "item");
            C19383o.m32797g(set, "selectedLists");
            this.f21586a = checkableListingCollection;
            this.f21587b = set;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9755a)) {
                return false;
            }
            C9755a aVar = (C9755a) obj;
            return C19383o.m32792b(this.f21586a, aVar.f21586a) && C19383o.m32792b(this.f21587b, aVar.f21587b);
        }

        public final int hashCode() {
            return this.f21587b.hashCode() + (this.f21586a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ItemDeselected(item=");
            h.append(this.f21586a);
            h.append(", selectedLists=");
            h.append(this.f21587b);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.favorites.add.c$b */
    public static final class C9756b extends C9754c {

        /* renamed from: a */
        public final CheckableListingCollection f21588a;

        /* renamed from: b */
        public final Set<CheckableListingCollection> f21589b;

        public C9756b(CheckableListingCollection checkableListingCollection, Set<? extends CheckableListingCollection> set) {
            C19383o.m32797g(checkableListingCollection, "item");
            C19383o.m32797g(set, "selectedLists");
            this.f21588a = checkableListingCollection;
            this.f21589b = set;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9756b)) {
                return false;
            }
            C9756b bVar = (C9756b) obj;
            return C19383o.m32792b(this.f21588a, bVar.f21588a) && C19383o.m32792b(this.f21589b, bVar.f21589b);
        }

        public final int hashCode() {
            return this.f21589b.hashCode() + (this.f21588a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ItemSelected(item=");
            h.append(this.f21588a);
            h.append(", selectedLists=");
            h.append(this.f21589b);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.favorites.add.c$c */
    public static final class C9757c extends C9754c {

        /* renamed from: a */
        public final Set<CheckableListingCollection> f21590a;

        public C9757c(Set<? extends CheckableListingCollection> set) {
            C19383o.m32797g(set, "selectedLists");
            this.f21590a = set;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9757c) && C19383o.m32792b(this.f21590a, ((C9757c) obj).f21590a);
        }

        public final int hashCode() {
            return this.f21590a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("NewListClick(selectedLists=");
            h.append(this.f21590a);
            h.append(')');
            return h.toString();
        }
    }
}
