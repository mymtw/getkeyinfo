package p010a9;

import android.database.sqlite.SQLiteDatabase;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.text.input.C2006x;
import androidx.compose.runtime.C1302d;
import androidx.preference.Preference;
import com.etsy.android.config.nativeflags.NativeConfigFlagsFragment;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.util.CrashUtil;
import com.google.android.datatransport.C6493a;
import com.google.android.datatransport.runtime.scheduling.persistence.C6599q;
import com.google.android.exoplayer2.drm.C14219c;
import com.paypal.pyplcheckout.home.view.customviews.PayPalSnappingRecyclerView;
import com.paypal.pyplcheckout.utils.DialogMaker;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p287xp.C8335c;
import p306z8.C8481h;
import p563fi.C17734a;
import p594jh.C17909f;

/* renamed from: a9.b */
public final /* synthetic */ class C0048b implements Preference.C3009c, C6599q.C6600a, C17909f, C17734a.C17735a, DialogMaker.NegativeClickListener, C2006x, C14219c.C14221b, C8335c {
    /* renamed from: a */
    public static String m163a(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* renamed from: c */
    public static String m164c(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    /* renamed from: d */
    public static void m165d(long j, StringBuilder sb, String str) {
        sb.append(C1545s.m3363i(j));
        sb.append(str);
    }

    /* renamed from: e */
    public static void m166e(C1302d dVar) {
        dVar.mo5406H();
        dVar.mo5406H();
        dVar.mo5456p();
        dVar.mo5406H();
        dVar.mo5406H();
    }

    /* renamed from: f */
    public static void m167f(String str, String str2, String str3, String str4, String str5, String str6) {
        C19383o.m32797g(str, str2);
        C19383o.m32797g(str3, str4);
        C19383o.m32797g(str5, str6);
    }

    public Object apply(Object obj, Object obj2) {
        Throwable th = (Throwable) obj;
        int intValue = ((Integer) obj2).intValue();
        C19383o.m32797g(th, "error");
        CrashUtil.m17307a().mo30458c(new Throwable("Problem uploading push notification token - apiV3", th), C8592b.C8595c.f18858b);
        return Integer.valueOf(intValue);
    }

    /* renamed from: b */
    public boolean mo90b(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    public void onNegativeClick(DialogMaker dialogMaker) {
        PayPalSnappingRecyclerView.m35365onAddCardClicked$lambda22(dialogMaker);
    }

    public boolean onPreferenceChange(Preference preference, Object obj) {
        return NativeConfigFlagsFragment.lambda$createListPreference$1(preference, obj);
    }

    public void release() {
    }

    public Object apply(Object obj) {
        C6493a aVar = C6599q.f14568g;
        return (List) C6599q.m12957j(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new C8481h());
    }
}
