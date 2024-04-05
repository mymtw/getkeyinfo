package com.etsy.android.p327ui.user.addresses;

import com.etsy.android.lib.models.ResponseConstants;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.addresses.n */
public abstract class C11430n {

    /* renamed from: com.etsy.android.ui.user.addresses.n$a */
    public static final class C11431a extends C11430n {

        /* renamed from: a */
        public static final C11431a f25237a = new C11431a();
    }

    /* renamed from: com.etsy.android.ui.user.addresses.n$b */
    public static final class C11432b extends C11430n {

        /* renamed from: a */
        public final List<C11396e> f25238a;

        public C11432b(List<? extends C11396e> list) {
            C19383o.m32797g(list, "addressDetails");
            this.f25238a = list;
        }
    }

    /* renamed from: com.etsy.android.ui.user.addresses.n$c */
    public static final class C11433c extends C11430n {

        /* renamed from: a */
        public final C11396e f25239a;

        /* renamed from: b */
        public final boolean f25240b;

        public C11433c(C11396e eVar, boolean z) {
            C19383o.m32797g(eVar, "item");
            this.f25239a = eVar;
            this.f25240b = z;
        }
    }

    /* renamed from: com.etsy.android.ui.user.addresses.n$d */
    public static final class C11434d extends C11430n {

        /* renamed from: a */
        public final PostalCodeSuggestion f25241a;

        /* renamed from: b */
        public final List<C11396e> f25242b;

        public C11434d(PostalCodeSuggestion postalCodeSuggestion, List<? extends C11396e> list) {
            C19383o.m32797g(postalCodeSuggestion, ResponseConstants.SUGGESTION);
            C19383o.m32797g(list, "addressDetails");
            this.f25241a = postalCodeSuggestion;
            this.f25242b = list;
        }
    }

    /* renamed from: com.etsy.android.ui.user.addresses.n$e */
    public static final class C11435e extends C11430n {

        /* renamed from: a */
        public static final C11435e f25243a = new C11435e();
    }

    /* renamed from: com.etsy.android.ui.user.addresses.n$f */
    public static final class C11436f extends C11430n {

        /* renamed from: a */
        public final C11396e f25244a;

        /* renamed from: b */
        public final int f25245b;

        public C11436f(C11396e eVar, int i) {
            this.f25244a = eVar;
            this.f25245b = i;
        }
    }

    /* renamed from: com.etsy.android.ui.user.addresses.n$g */
    public static final class C11437g extends C11430n {

        /* renamed from: a */
        public final C11396e f25246a;

        /* renamed from: b */
        public final String f25247b;

        public C11437g(C11396e eVar, String str) {
            C19383o.m32797g(eVar, "item");
            C19383o.m32797g(str, "value");
            this.f25246a = eVar;
            this.f25247b = str;
        }
    }
}
