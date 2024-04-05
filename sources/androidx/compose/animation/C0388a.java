package androidx.compose.animation;

import android.content.Context;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import androidx.preference.Preference;
import com.etsy.android.config.ConfigPreferencesHelper;
import com.google.firebase.platforminfo.C16685e;
import com.paypal.pyplcheckout.interfaces.Progression;
import com.paypal.pyplcheckout.interfaces.SDKInterceptFinishListener;
import com.paypal.pyplcheckout.interfaces.SDKInterceptor;
import com.paypal.pyplcheckout.interfaces.Status;
import java.util.Arrays;
import kotlin.jvm.internal.C19383o;
import p030bo.app.C3977n1;
import p112g2.C6838e;
import p146j.C7096a;
import p594jh.C17909f;
import p605kk.C18120d;

/* renamed from: androidx.compose.animation.a */
public final /* synthetic */ class C0388a implements C7096a, Preference.C3010d, C17909f, C16685e.C16686a, SDKInterceptor, C18120d {
    /* renamed from: b */
    public static C1338j0 m1047b(long j, C1302d dVar) {
        C1338j0 E0 = C0761x.m1664E0(new C1545s(j), dVar);
        dVar.mo5406H();
        return E0;
    }

    /* renamed from: d */
    public static String m1048d(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    /* renamed from: e */
    public static String m1049e(Object[] objArr, int i, String str, String str2) {
        String format = String.format(str, Arrays.copyOf(objArr, i));
        C19383o.m32796f(format, str2);
        return format;
    }

    /* renamed from: f */
    public static StringBuilder m1050f(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    /* renamed from: a */
    public void mo414a(Exception exc) {
        C3977n1.m9202a(exc);
    }

    public Object apply(Object obj) {
        return Integer.valueOf(((C6838e) obj).mo18972s());
    }

    /* renamed from: c */
    public String mo3367c(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
    }

    /* renamed from: g */
    public boolean mo412g(Preference preference) {
        return ConfigPreferencesHelper.m34846setUpTestAnrReportingPreference$lambda13(preference);
    }

    public void intercept(Progression progression, SDKInterceptFinishListener sDKInterceptFinishListener) {
        sDKInterceptFinishListener.onSDKInterceptComplete(Status.SUCCESS);
    }
}
