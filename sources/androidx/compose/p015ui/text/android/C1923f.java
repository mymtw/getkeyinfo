package androidx.compose.p015ui.text.android;

import android.os.Build;
import android.text.StaticLayout;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.text.android.f */
public final class C1923f implements C1927j {
    /* renamed from: a */
    public StaticLayout mo7421a(C1928k kVar) {
        C19383o.m32797g(kVar, ResponseConstants.PARAMS);
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(kVar.f4330a, kVar.f4331b, kVar.f4332c, kVar.f4333d, kVar.f4334e);
        obtain.setTextDirection(kVar.f4335f);
        obtain.setAlignment(kVar.f4336g);
        obtain.setMaxLines(kVar.f4337h);
        obtain.setEllipsize(kVar.f4338i);
        obtain.setEllipsizedWidth(kVar.f4339j);
        obtain.setLineSpacing(kVar.f4341l, kVar.f4340k);
        obtain.setIncludePad(kVar.f4343n);
        obtain.setBreakStrategy(kVar.f4345p);
        obtain.setHyphenationFrequency(kVar.f4346q);
        obtain.setIndents(kVar.f4347r, kVar.f4348s);
        int i = Build.VERSION.SDK_INT;
        C1924g.f4328a.mo7422a(obtain, kVar.f4342m);
        if (i >= 28) {
            C1926i.f4329a.mo7423a(obtain, kVar.f4344o);
        }
        StaticLayout build = obtain.build();
        C19383o.m32796f(build, "obtain(params.text, para…  }\n            }.build()");
        return build;
    }
}
