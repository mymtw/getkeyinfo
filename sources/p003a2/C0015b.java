package p003a2;

import android.media.UnsupportedSchemeException;
import android.util.Log;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.preference.EditTextPreference;
import com.etsy.android.config.ConfigPreferencesHelper;
import com.etsy.android.lib.util.NotificationType;
import com.google.android.exoplayer2.drm.C14216b;
import com.google.android.exoplayer2.drm.C14222d;
import com.google.android.exoplayer2.drm.C14224f;
import com.google.android.exoplayer2.drm.C14229g;
import com.google.android.exoplayer2.drm.UnsupportedDrmException;
import com.google.firebase.remoteconfig.internal.C16688a;
import com.paypal.pyplcheckout.home.view.customviews.PayPalSnappingRecyclerView;
import com.paypal.pyplcheckout.interfaces.HeartListener;
import java.util.HashMap;
import java.util.UUID;
import kotlin.jvm.internal.C19383o;
import p287xp.C8335c;
import p287xp.C8340h;
import p426qa.C13277c;
import p513bj.C14052d;
import p513bj.C14055g;
import p513bj.C14060k;
import p602kh.C18089v0;
import p605kk.C18122f;
import p605kk.C18123g;
import p605kk.C18126j;
import p644ph.C18349h;
import p644ph.C18353k;

/* renamed from: a2.b */
public final /* synthetic */ class C0015b implements C8335c, C14060k.C14062b, HeartListener, C14224f.C14227c, C18353k, EditTextPreference.C2997a, C8340h, C14052d, C18122f {
    /* renamed from: f */
    public static Integer m87f(HashMap hashMap, Integer num, String str, int i, String str2) {
        hashMap.put(num, str);
        Integer valueOf = Integer.valueOf(i);
        hashMap.put(valueOf, str2);
        return valueOf;
    }

    /* renamed from: g */
    public static String m88g(String str, int i) {
        return str + i;
    }

    /* renamed from: h */
    public static String m89h(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    /* renamed from: i */
    public static String m90i(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    /* renamed from: j */
    public static String m91j(StringBuilder sb, long j, char c) {
        sb.append(j);
        sb.append(c);
        return sb.toString();
    }

    /* renamed from: k */
    public static StringBuilder m92k(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    public void accept(Object obj) {
        ((C14216b.C14217a) obj).mo47330b();
    }

    public Object apply(Object obj, Object obj2) {
        int intValue = ((Integer) obj2).intValue();
        C19383o.m32797g((Throwable) obj, "<anonymous parameter 0>");
        return Integer.valueOf(intValue);
    }

    /* renamed from: b */
    public void mo36b(Object obj, C14055g gVar) {
        C18089v0 v0Var = (C18089v0) obj;
    }

    /* renamed from: c */
    public void mo37c(EditText editText) {
        ConfigPreferencesHelper.m34841setUpFeaturesOverridePreference$lambda0(editText);
    }

    /* renamed from: d */
    public C18349h[] mo38d() {
        return new C18349h[0];
    }

    /* renamed from: e */
    public C14224f mo39e(UUID uuid) {
        try {
            return new C14229g(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new UnsupportedDrmException(1, e);
        } catch (Exception e2) {
            throw new UnsupportedDrmException(2, e2);
        } catch (UnsupportedDrmException unused) {
            String valueOf = String.valueOf(uuid);
            StringBuilder sb = new StringBuilder(valueOf.length() + 53);
            sb.append("Failed to instantiate a FrameworkMediaDrm for uuid: ");
            sb.append(valueOf);
            sb.append(".");
            Log.e("FrameworkMediaDrm", sb.toString());
            return new C14222d();
        }
    }

    public void onTaskCompleted() {
        PayPalSnappingRecyclerView.m35351_init_$lambda5();
    }

    public boolean test(Object obj) {
        C13277c cVar = (C13277c) obj;
        C19383o.m32797g(cVar, "data");
        NotificationType.C8877a aVar = NotificationType.Companion;
        String str = cVar.f29181a;
        aVar.getClass();
        return NotificationType.C8877a.m17313a(str) == NotificationType.CONVERSATION;
    }

    public C18123g then(Object obj) {
        C16688a.C16689a aVar = (C16688a.C16689a) obj;
        return C18126j.m30617e((Object) null);
    }
}
