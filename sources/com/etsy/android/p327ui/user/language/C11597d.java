package com.etsy.android.p327ui.user.language;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.language.d */
public abstract class C11597d {

    /* renamed from: com.etsy.android.ui.user.language.d$a */
    public static final class C11598a extends C11597d {

        /* renamed from: a */
        public static final C11598a f25686a = new C11598a();
    }

    /* renamed from: com.etsy.android.ui.user.language.d$b */
    public static final class C11599b extends C11597d {

        /* renamed from: a */
        public static final C11599b f25687a = new C11599b();
    }

    /* renamed from: com.etsy.android.ui.user.language.d$c */
    public static final class C11600c extends C11597d {

        /* renamed from: a */
        public static final C11600c f25688a = new C11600c();
    }

    /* renamed from: com.etsy.android.ui.user.language.d$d */
    public static final class C11601d extends C11597d {

        /* renamed from: a */
        public static final C11601d f25689a = new C11601d();
    }

    /* renamed from: com.etsy.android.ui.user.language.d$e */
    public static final class C11602e extends C11597d {

        /* renamed from: a */
        public final List<C11609i> f25690a;

        public C11602e(ArrayList arrayList) {
            this.f25690a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11602e) && C19383o.m32792b(this.f25690a, ((C11602e) obj).f25690a);
        }

        public final int hashCode() {
            return this.f25690a.hashCode();
        }

        public final String toString() {
            return C0070b.m186i(C0072d.m201h("Success(languageList="), this.f25690a, ')');
        }
    }
}
