package com.etsy.android.qualtrics;

import androidx.fragment.app.FragmentActivity;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.qualtrics.C8952d;
import java.util.ArrayList;
import kotlin.jvm.internal.C19383o;
import p486y9.C13888d;
import p568fn.C17782b;

public final class QualtricsConfiguration {
    /* renamed from: a */
    public static void m17374a(FragmentActivity fragmentActivity, C8951c cVar, C13888d dVar, C8952d dVar2) {
        C19383o.m32797g(fragmentActivity, ResponseConstants.CONTEXT);
        C19383o.m32797g(cVar, "qualtricsWrapper");
        C19383o.m32797g(dVar, "currentLocale");
        String locale = dVar.mo46719c().toString();
        C19383o.m32796f(locale, "currentLocale.getSystemLocale().toString()");
        cVar.mo30561a(new ArrayList(C17782b.m29865e0(new C8952d.C8961i(locale, 0), dVar2)));
        cVar.mo30562b(new QualtricsConfiguration$configure$1(fragmentActivity));
    }
}
