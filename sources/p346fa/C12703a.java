package p346fa;

import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.core.EtsyApplication;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.util.C8890e0;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Random;
import kotlin.jvm.internal.C19383o;
import org.apache.commons.lang3.ClassUtils;
import p340ea.C12673n;

/* renamed from: fa.a */
public final class C12703a {

    /* renamed from: a */
    public final C8890e0 f27991a;

    /* renamed from: b */
    public final C8591a f27992b;

    /* renamed from: c */
    public final C12673n f27993c;

    /* renamed from: d */
    public final C8694h f27994d;

    /* renamed from: e */
    public final Random f27995e;

    public C12703a(EtsyApplication etsyApplication, C8890e0 e0Var, C8591a aVar, C12673n nVar, C8694h hVar, Random random) {
        this.f27991a = e0Var;
        this.f27992b = aVar;
        this.f27993c = nVar;
        this.f27994d = hVar;
        this.f27995e = random;
    }

    /* renamed from: a */
    public final void mo45474a(String str) {
        C19383o.m32797g(str, "metric");
        mo45476c(str, "counter", 1.0d);
    }

    /* renamed from: b */
    public final void mo45475b(String str, double d) {
        C19383o.m32797g(str, "metric");
        boolean z = false;
        if (d > ShadowDrawableWrapper.COS_45 && this.f27995e.nextDouble() <= d) {
            z = true;
        }
        if (z) {
            mo45474a(str);
        }
    }

    /* renamed from: c */
    public final void mo45476c(String str, String str2, double d) {
        boolean z;
        try {
            z = this.f27992b.f18707g;
        } catch (IllegalStateException unused) {
            z = false;
        }
        if (z ? this.f27992b.f18706f.mo21132b(C8592b.f18816o0) : true) {
            DecimalFormat decimalFormat = new DecimalFormat("#");
            decimalFormat.setDecimalFormatSymbols(new DecimalFormatSymbols(Locale.ROOT));
            decimalFormat.setMaximumFractionDigits(6);
            decimalFormat.setMinimumIntegerDigits(1);
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(' ');
            sb.append("native_apps.android.boe");
            sb.append(ClassUtils.PACKAGE_SEPARATOR_CHAR);
            sb.append(str);
            sb.append(' ');
            sb.append(decimalFormat.format(d));
            sb.append(' ');
            this.f27991a.getClass();
            sb.append(decimalFormat.format(((double) System.currentTimeMillis()) / 1000.0d));
            String sb2 = sb.toString();
            this.f27993c.mo45451c("EtsyGraphite", sb2);
            C8694h hVar = this.f27994d;
            hVar.mo21312f("EtsyGraphite" + sb2);
        }
    }

    /* renamed from: d */
    public final void mo45477d(String str, double d) {
        mo45476c(str, "timer", d / ((double) 1000));
    }
}
