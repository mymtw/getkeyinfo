package p003a2;

import android.content.Context;
import android.util.Log;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1295a1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.Updater;
import com.etsy.android.lib.models.apiv3.filters.AttributeValue;
import com.etsy.android.lib.models.apiv3.filters.SearchFiltersV2Type;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C10993f;
import com.google.firebase.heartbeatinfo.C16552c;
import com.google.firebase.heartbeatinfo.C16553d;
import java.util.HashSet;
import kotlin.jvm.internal.C19383o;
import p174m0.C7282b;
import p287xp.C8335c;
import p644ph.C18349h;
import p644ph.C18353k;
import p649pm.C18400e;
import p649pm.C18415r;
import p701wh.C18685h;
import p753kq.C19861p;

/* renamed from: a2.f */
public final /* synthetic */ class C0023f implements C18400e, C8335c, C18353k {
    /* renamed from: b */
    public static float m103b(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    /* renamed from: c */
    public static int m104c(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    /* renamed from: e */
    public static int m105e(String str, int i, int i2) {
        return (str.hashCode() + i) * i2;
    }

    /* renamed from: g */
    public static C1295a1 m106g(ComposerImpl composerImpl, C1711v vVar, C19861p pVar, ComposerImpl composerImpl2, C7282b bVar, C19861p pVar2, ComposerImpl composerImpl3, LayoutDirection layoutDirection, C19861p pVar3, ComposerImpl composerImpl4, C1843j1 j1Var, C19861p pVar4, ComposerImpl composerImpl5) {
        Updater.m2571b(composerImpl, vVar, pVar);
        Updater.m2571b(composerImpl2, bVar, pVar2);
        Updater.m2571b(composerImpl3, layoutDirection, pVar3);
        Updater.m2571b(composerImpl4, j1Var, pVar4);
        composerImpl.mo5430c();
        return new C1295a1(composerImpl5);
    }

    /* renamed from: h */
    public static String m107h(int i, String str, int i2, String str2, int i3) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i3);
        return sb.toString();
    }

    /* renamed from: i */
    public static String m108i(Object obj, StringBuilder sb) {
        sb.append(obj.getClass().getName());
        return sb.toString();
    }

    /* renamed from: j */
    public static String m109j(StringBuilder sb, Integer num, char c) {
        sb.append(num);
        sb.append(c);
        return sb.toString();
    }

    /* renamed from: k */
    public static String m110k(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: l */
    public static StringBuilder m111l(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    /* renamed from: m */
    public static void m112m(int i, String str, int i2, String str2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(i2);
        Log.w(str2, sb.toString());
    }

    /* renamed from: n */
    public static void m113n(C10993f fVar, Integer num, AttributeValue attributeValue, SearchFiltersV2Type searchFiltersV2Type) {
        attributeValue.setName(fVar.mo36550a(num));
        attributeValue.setFilterType(searchFiltersV2Type);
    }

    /* renamed from: o */
    public static /* synthetic */ void m114o(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    /* renamed from: p */
    public static void m115p(HashSet hashSet, String str, String str2, String str3, String str4) {
        hashSet.add(str);
        hashSet.add(str2);
        hashSet.add(str3);
        hashSet.add(str4);
    }

    public Object apply(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        C19383o.m32797g(bool, "t1");
        C19383o.m32797g(bool2, "t2");
        return Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
    }

    /* renamed from: d */
    public C18349h[] mo38d() {
        return new C18349h[]{new C18685h()};
    }

    /* renamed from: f */
    public Object mo56f(C18415r rVar) {
        return new C16552c((Context) rVar.get(Context.class), rVar.mo11180c(C16553d.class));
    }
}
