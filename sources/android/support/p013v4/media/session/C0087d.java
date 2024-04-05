package android.support.p013v4.media.session;

import android.os.Parcel;
import android.view.View;
import androidx.compose.runtime.ComposerImpl;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Locale;
import kotlin.jvm.internal.C19383o;
import p644ph.C18349h;
import p644ph.C18353k;
import p653qh.C18449a;

/* renamed from: android.support.v4.media.session.d */
public final /* synthetic */ class C0087d implements C18353k {
    /* renamed from: b */
    public static int m233b(View view, int i) {
        return view.getContext().getResources().getDimensionPixelSize(i);
    }

    /* renamed from: c */
    public static IObjectWrapper m234c(Parcel parcel) {
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        parcel.recycle();
        return asInterface;
    }

    /* renamed from: e */
    public static String m235e(String str, int i, String str2, int i2) {
        return str + i + str2 + i2;
    }

    /* renamed from: f */
    public static String m236f(StringBuilder sb, long j, String str) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: g */
    public static String m237g(Locale locale, String str, String str2, Locale locale2, String str3) {
        C19383o.m32796f(locale, str);
        String lowerCase = str2.toLowerCase(locale2);
        C19383o.m32796f(lowerCase, str3);
        return lowerCase;
    }

    /* renamed from: h */
    public static void m238h(ComposerImpl composerImpl, boolean z, boolean z2, boolean z3, boolean z4) {
        composerImpl.mo5418R(z);
        composerImpl.mo5418R(z2);
        composerImpl.mo5418R(z3);
        composerImpl.mo5418R(z4);
    }

    /* renamed from: d */
    public C18349h[] mo38d() {
        return new C18349h[]{new C18449a()};
    }
}
