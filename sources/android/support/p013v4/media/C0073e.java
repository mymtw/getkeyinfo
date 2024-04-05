package android.support.p013v4.media;

import android.net.Uri;
import android.widget.EditText;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.runtime.C1295a1;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.Updater;
import androidx.preference.EditTextPreference;
import com.etsy.android.config.ConfigPreferencesHelper;
import com.fasterxml.jackson.core.JsonParser;
import com.google.android.datatransport.C6495c;
import com.google.firebase.perf.p530v1.C16669g;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19842z;
import kotlinx.coroutines.android.AndroidExceptionPreHandler;
import p030bo.app.C3977n1;
import p244t5.C7959a;
import p563fi.C17734a;
import p594jh.C17909f;
import p605kk.C18120d;
import p693vh.C18639d;
import p753kq.C19861p;

/* renamed from: android.support.v4.media.e */
public final /* synthetic */ class C0073e implements C18120d, C17734a.C17735a, EditTextPreference.C2997a, C17909f, C6495c {
    /* renamed from: d */
    public static C1295a1 m204d(C1302d dVar, C1843j1 j1Var, C19861p pVar, C1302d dVar2) {
        Updater.m2571b(dVar, j1Var, pVar);
        dVar.mo5430c();
        return new C1295a1(dVar2);
    }

    /* renamed from: e */
    public static String m205e(String str, long j) {
        return str + j;
    }

    /* renamed from: f */
    public static String m206f(String str, Uri uri) {
        return str + uri;
    }

    /* renamed from: g */
    public static String m207g(String str, Type type) {
        return str + type;
    }

    /* renamed from: h */
    public static String m208h(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    /* renamed from: i */
    public static String m209i(StringBuilder sb, Object obj, char c) {
        sb.append(obj);
        sb.append(c);
        return sb.toString();
    }

    /* renamed from: j */
    public static String m210j(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    /* renamed from: k */
    public static StringBuilder m211k(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    /* renamed from: l */
    public static /* synthetic */ Iterator m212l() {
        try {
            return Arrays.asList(new C19842z[]{new AndroidExceptionPreHandler()}).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    /* renamed from: m */
    public static void m213m(C7959a aVar, String str, String str2, String str3, String str4) {
        aVar.mo20512z(str);
        aVar.mo20512z(str2);
        aVar.mo20512z(str3);
        aVar.mo20512z(str4);
    }

    /* renamed from: n */
    public static boolean m214n(JsonParser jsonParser, String str, String str2, String str3, String str4, String str5) {
        C19383o.m32797g(jsonParser, str);
        C19383o.m32797g(str2, str3);
        return C19383o.m32792b(str4, str5);
    }

    /* renamed from: a */
    public void mo414a(Exception exc) {
        C3977n1.m9207b(exc);
    }

    public Object apply(Object obj) {
        return ((C16669g) obj).mo59827c();
    }

    /* renamed from: b */
    public boolean mo90b(int i, int i2, int i3, int i4, int i5) {
        C0073e eVar = C18639d.f41161u;
        return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
    }

    /* renamed from: c */
    public void mo37c(EditText editText) {
        ConfigPreferencesHelper.m34838setUpFeaturesDateOverridePreference$lambda3(editText);
    }
}
