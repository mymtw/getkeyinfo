package androidx.appcompat.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.C1295a1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.core.view.C2325q;
import androidx.core.view.C2348w0;
import com.etsy.android.lib.config.BuildTarget;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.SingleSubscribeOn;
import p287xp.C8335c;
import p456ua.C13461f;
import p644ph.C18349h;
import p644ph.C18353k;
import p717yh.C18841c;

/* renamed from: androidx.appcompat.widget.j */
public final /* synthetic */ class C0326j implements C2325q, C8335c, C18353k {
    /* renamed from: c */
    public static View m859c(ViewGroup viewGroup, int i, ViewGroup viewGroup2, boolean z) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup2, z);
    }

    /* renamed from: e */
    public static SingleSubscribeOn m860e(C13461f fVar, C19208j jVar) {
        fVar.getClass();
        return jVar.mo20660i(C13461f.m21235b());
    }

    /* renamed from: f */
    public static String m861f(Context context, String str, String str2, int i, String str3, String str4) {
        C19383o.m32797g(context, str);
        return context.getSharedPreferences(str2, i).getString(str3, str4);
    }

    /* renamed from: g */
    public static String m862g(Class cls, StringBuilder sb) {
        sb.append(cls.getName());
        return sb.toString();
    }

    /* renamed from: h */
    public static String m863h(Class cls, StringBuilder sb, String str) {
        sb.append(cls.getName());
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: i */
    public static String m864i(String str, String str2) {
        return str + str2;
    }

    /* renamed from: j */
    public static String m865j(StringBuilder sb, List list, String str) {
        sb.append(list);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: k */
    public static StringBuilder m866k(char c) {
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        return sb;
    }

    /* renamed from: l */
    public static void m867l() {
        new Hashtable();
        new Vector();
    }

    /* renamed from: m */
    public static void m868m(int i, ComposableLambdaImpl composableLambdaImpl, C1295a1 a1Var, ComposerImpl composerImpl, int i2, int i3) {
        composableLambdaImpl.invoke(a1Var, composerImpl, Integer.valueOf(i));
        composerImpl.mo5465u(i2);
        composerImpl.mo5465u(i3);
    }

    /* renamed from: n */
    public static boolean m869n(BuildTarget.C8590a aVar) {
        aVar.getClass();
        return BuildTarget.audience.isInternal();
    }

    public Object apply(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        C19383o.m32797g(bool, "t1");
        C19383o.m32797g(bool2, "t2");
        return Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
    }

    /* renamed from: b */
    public C2348w0 mo1389b(View view, C2348w0 w0Var) {
        C19383o.m32796f(view, "view");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), w0Var.mo8944d());
        return w0Var;
    }

    /* renamed from: d */
    public C18349h[] mo38d() {
        return new C18349h[]{new C18841c()};
    }
}
