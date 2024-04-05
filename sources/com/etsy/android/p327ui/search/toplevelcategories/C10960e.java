package com.etsy.android.p327ui.search.toplevelcategories;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.p327ui.search.p330v2.suggestions.C11083w;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.toplevelcategories.e */
public interface C10960e {

    /* renamed from: com.etsy.android.ui.search.toplevelcategories.e$a */
    public static final class C10961a implements C10960e {

        /* renamed from: a */
        public static final C10961a f24308a = new C10961a();
    }

    /* renamed from: com.etsy.android.ui.search.toplevelcategories.e$b */
    public static final class C10962b implements C10960e {

        /* renamed from: a */
        public static final C10962b f24309a = new C10962b();
    }

    /* renamed from: com.etsy.android.ui.search.toplevelcategories.e$c */
    public static final class C10963c implements C10960e {

        /* renamed from: a */
        public static final C10963c f24310a = new C10963c();
    }

    /* renamed from: com.etsy.android.ui.search.toplevelcategories.e$d */
    public static final class C10964d implements C10960e {

        /* renamed from: a */
        public static final C10964d f24311a = new C10964d();
    }

    /* renamed from: com.etsy.android.ui.search.toplevelcategories.e$e */
    public static final class C10965e implements C10960e {

        /* renamed from: a */
        public final List<C11083w> f24312a;

        public C10965e(List<? extends C11083w> list) {
            this.f24312a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10965e) && C19383o.m32792b(this.f24312a, ((C10965e) obj).f24312a);
        }

        public final int hashCode() {
            return this.f24312a.hashCode();
        }

        public final String toString() {
            return C0070b.m186i(C0072d.m201h("ShowSearchSuggestions(suggestions="), this.f24312a, ')');
        }
    }
}
