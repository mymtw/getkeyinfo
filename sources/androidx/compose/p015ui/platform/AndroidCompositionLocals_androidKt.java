package androidx.compose.p015ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.platform.AndroidComposeView;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1341k0;
import androidx.compose.runtime.C1345l1;
import androidx.compose.runtime.C1411t;
import androidx.compose.runtime.C1412t0;
import androidx.compose.runtime.C1415u;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.saveable.C1369e;
import androidx.compose.runtime.saveable.C1371f;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.savedstate.C3265b;
import androidx.savedstate.C3269d;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Ref$ObjectRef;
import p122h0.C6906b;
import p628nj.C18263b;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt */
public final class AndroidCompositionLocals_androidKt {

    /* renamed from: a */
    public static final C1411t f3986a;

    /* renamed from: b */
    public static final C1345l1 f3987b = CompositionLocalKt.m2532c(AndroidCompositionLocals_androidKt$LocalContext$1.INSTANCE);

    /* renamed from: c */
    public static final C1345l1 f3988c = CompositionLocalKt.m2532c(AndroidCompositionLocals_androidKt$LocalImageVectorCache$1.INSTANCE);

    /* renamed from: d */
    public static final C1345l1 f3989d = CompositionLocalKt.m2532c(AndroidCompositionLocals_androidKt$LocalLifecycleOwner$1.INSTANCE);

    /* renamed from: e */
    public static final C1345l1 f3990e = CompositionLocalKt.m2532c(C1776x7efe3756.INSTANCE);

    /* renamed from: f */
    public static final C1345l1 f3991f = CompositionLocalKt.m2532c(AndroidCompositionLocals_androidKt$LocalView$1.INSTANCE);

    static {
        C1341k0 k0Var = C1341k0.f2935a;
        AndroidCompositionLocals_androidKt$LocalConfiguration$1 androidCompositionLocals_androidKt$LocalConfiguration$1 = AndroidCompositionLocals_androidKt$LocalConfiguration$1.INSTANCE;
        C19383o.m32797g(androidCompositionLocals_androidKt$LocalConfiguration$1, "defaultFactory");
        f3986a = new C1411t(k0Var, androidCompositionLocals_androidKt$LocalConfiguration$1);
    }

    /* renamed from: a */
    public static final void m3932a(AndroidComposeView androidComposeView, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C1302d dVar, int i) {
        LinkedHashMap linkedHashMap;
        boolean z;
        AndroidComposeView androidComposeView2 = androidComposeView;
        C19861p<? super C1302d, ? super Integer, C19394m> pVar2 = pVar;
        int i2 = i;
        C19383o.m32797g(androidComposeView2, ResponseConstants.OWNER);
        C19383o.m32797g(pVar2, ResponseConstants.CONTENT);
        ComposerImpl h = dVar.mo5440h(1396852028);
        Context context = androidComposeView.getContext();
        h.mo5465u(-492369756);
        Object c0 = h.mo5431c0();
        C1302d.C1303a.C1304a aVar = C1302d.C1303a.f2828a;
        if (c0 == aVar) {
            c0 = C0761x.m1751w0(context.getResources().getConfiguration(), C1341k0.f2935a);
            h.mo5407H0(c0);
        }
        h.mo5418R(false);
        C1338j0 j0Var = (C1338j0) c0;
        h.mo5465u(1157296644);
        boolean I = h.mo5408I(j0Var);
        Object c02 = h.mo5431c0();
        if (I || c02 == aVar) {
            c02 = new C1777x68d8e1f6(j0Var);
            h.mo5407H0(c02);
        }
        h.mo5418R(false);
        androidComposeView2.setConfigurationChangeObserver((C19857l) c02);
        h.mo5465u(-492369756);
        Object c03 = h.mo5431c0();
        if (c03 == aVar) {
            C19383o.m32796f(context, ResponseConstants.CONTEXT);
            c03 = new C1889y(context);
            h.mo5407H0(c03);
        }
        h.mo5418R(false);
        C1889y yVar = (C1889y) c03;
        AndroidComposeView.C1759b viewTreeOwners = androidComposeView.getViewTreeOwners();
        if (viewTreeOwners != null) {
            h.mo5465u(-492369756);
            Object c04 = h.mo5431c0();
            if (c04 == aVar) {
                C3269d dVar2 = viewTreeOwners.f3947b;
                Class<? extends Object>[] clsArr = C1845k0.f4102a;
                C19383o.m32797g(dVar2, ResponseConstants.OWNER);
                ViewParent parent = androidComposeView.getParent();
                if (parent != null) {
                    View view = (View) parent;
                    Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                    String str = tag instanceof String ? (String) tag : null;
                    if (str == null) {
                        str = String.valueOf(view.getId());
                    }
                    C19383o.m32797g(str, "id");
                    String str2 = C1369e.class.getSimpleName() + ':' + str;
                    C3265b savedStateRegistry = dVar2.getSavedStateRegistry();
                    Bundle a = savedStateRegistry.mo12060a(str2);
                    if (a != null) {
                        linkedHashMap = new LinkedHashMap();
                        Set<String> keySet = a.keySet();
                        C19383o.m32796f(keySet, "this.keySet()");
                        Iterator<T> it = keySet.iterator();
                        while (it.hasNext()) {
                            String str3 = (String) it.next();
                            ArrayList parcelableArrayList = a.getParcelableArrayList(str3);
                            if (parcelableArrayList != null) {
                                C19383o.m32796f(str3, "key");
                                linkedHashMap.put(str3, parcelableArrayList);
                                it = it;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                            }
                        }
                    } else {
                        linkedHashMap = null;
                    }
                    C1787xcceb09c3 disposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1 = C1787xcceb09c3.INSTANCE;
                    C1345l1 l1Var = SaveableStateRegistryKt.f2970a;
                    C19383o.m32797g(disposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1, "canBeSaved");
                    C1371f fVar = new C1371f(linkedHashMap, disposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1);
                    try {
                        savedStateRegistry.mo12061b(str2, new C1842j0(fVar));
                        z = true;
                    } catch (IllegalArgumentException unused) {
                        z = false;
                    }
                    c04 = new C1839i0(fVar, new C1786xec1ea390(z, savedStateRegistry, str2));
                    h.mo5407H0(c04);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                }
            }
            h.mo5418R(false);
            C1839i0 i0Var = (C1839i0) c04;
            C1415u.m3028b(C19394m.f43287a, new C1778x611323aa(i0Var), h);
            C19383o.m32796f(context, ResponseConstants.CONTEXT);
            T t = (Configuration) j0Var.getValue();
            h.mo5465u(-485908294);
            h.mo5465u(-492369756);
            T c05 = h.mo5431c0();
            T t2 = C1302d.C1303a.f2828a;
            if (c05 == t2) {
                c05 = new C6906b();
                h.mo5407H0(c05);
            }
            h.mo5418R(false);
            C6906b bVar = (C6906b) c05;
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            h.mo5465u(-492369756);
            T c06 = h.mo5431c0();
            if (c06 == t2) {
                h.mo5407H0(t);
            } else {
                t = c06;
            }
            h.mo5418R(false);
            ref$ObjectRef.element = t;
            h.mo5465u(-492369756);
            T c07 = h.mo5431c0();
            if (c07 == t2) {
                c07 = new C1783x477bcb35(ref$ObjectRef, bVar);
                h.mo5407H0(c07);
            }
            h.mo5418R(false);
            C1415u.m3028b(bVar, new AndroidCompositionLocals_androidKt$obtainImageVectorCache$1(context, (C1783x477bcb35) c07), h);
            h.mo5418R(false);
            C1411t tVar = f3986a;
            Configuration configuration = (Configuration) j0Var.getValue();
            C19383o.m32796f(configuration, "configuration");
            CompositionLocalKt.m2530a(new C1412t0[]{tVar.mo5908b(configuration), f3987b.mo5908b(context), f3989d.mo5908b(viewTreeOwners.f3946a), f3990e.mo5908b(viewTreeOwners.f3947b), SaveableStateRegistryKt.f2970a.mo5908b(i0Var), f3991f.mo5908b(androidComposeView.getView()), f3988c.mo5908b(bVar)}, C18263b.m30805A(h, 1471621628, new C1780x611323ab(androidComposeView2, yVar, pVar2, i2)), h, 56);
            C1418v0 U = h.mo5421U();
            if (U != null) {
                U.f3081d = new C1781x611323ac(androidComposeView2, pVar2, i2);
                return;
            }
            return;
        }
        throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
    }

    /* renamed from: b */
    public static final void m3933b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
