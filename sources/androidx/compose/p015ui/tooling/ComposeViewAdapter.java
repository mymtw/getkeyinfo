package androidx.compose.p015ui.tooling;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.FrameLayout;
import androidx.activity.C0113g;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.compose.LocalActivityResultRegistryOwner;
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner;
import androidx.activity.result.C0123f;
import androidx.activity.result.C0126g;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.platform.ComposeView;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.tooling.animation.C2052c;
import androidx.compose.p015ui.tooling.data.C2060c;
import androidx.compose.p015ui.tooling.data.C2065h;
import androidx.compose.p015ui.tooling.data.C2067j;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1320f;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1345l1;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.C1411t;
import androidx.compose.runtime.C1412t0;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.tooling.C1413a;
import androidx.lifecycle.C2878l0;
import androidx.lifecycle.C2880m0;
import androidx.lifecycle.C2888t;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.savedstate.C3265b;
import androidx.savedstate.C3268c;
import androidx.savedstate.C3269d;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.play.core.assetpacks.C15588c1;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.C19394m;
import kotlin.collections.C19322o;
import kotlin.collections.C19324q;
import kotlin.collections.C19327t;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19457k;
import kotlin.text.C19459m;
import p019b.C3443a;
import p165l0.C7211a;
import p174m0.C7289h;
import p568fn.C17782b;
import p628nj.C18263b;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.tooling.ComposeViewAdapter */
public final class ComposeViewAdapter extends FrameLayout {
    private final C2038a FakeActivityResultRegistryOwner;
    private final C2040b FakeOnBackPressedDispatcherOwner;
    /* access modifiers changed from: private */
    @SuppressLint({"VisibleForTests"})
    public final C2041c FakeSavedStateRegistryOwner;
    private final C2042d FakeViewModelStoreOwner;
    private final String TAG = "ComposeViewAdapter";
    public C2052c clock;
    private String composableName;
    private final ComposeView composeView;
    private C1320f composition;
    private final C1338j0<C19861p<C1302d, Integer, C19394m>> content;
    private final Paint debugBoundsPaint;
    private boolean debugPaintBounds;
    private boolean debugViewInfos;
    /* access modifiers changed from: private */
    public final C2057d delayedException;
    private List<String> designInfoList;
    private String designInfoProvidersArgument;
    private boolean forceCompositionInvalidation;
    private boolean hasAnimations;
    private boolean lookForDesignInfoProviders;
    private C19846a<C19394m> onDraw;
    private C19861p<? super C1302d, ? super Integer, C19394m> previewComposition;
    /* access modifiers changed from: private */
    public final C2055b slotTableRecord;
    private List<C2069e> viewInfos;

    /* renamed from: androidx.compose.ui.tooling.ComposeViewAdapter$a */
    public static final class C2038a implements C0126g {

        /* renamed from: b */
        public final C2039a f4629b = new C2039a();

        /* renamed from: androidx.compose.ui.tooling.ComposeViewAdapter$a$a */
        public static final class C2039a extends C0123f {
            /* renamed from: b */
            public final void mo1103b(int i, C3443a aVar, Object obj) {
                C19383o.m32797g(aVar, "contract");
                throw new IllegalStateException("Calling launch() is not supported in Preview");
            }
        }

        public final C0123f getActivityResultRegistry() {
            return this.f4629b;
        }
    }

    /* renamed from: androidx.compose.ui.tooling.ComposeViewAdapter$b */
    public static final class C2040b implements C0113g {

        /* renamed from: b */
        public final OnBackPressedDispatcher f4630b = new OnBackPressedDispatcher((ComponentActivity.C0093a) null);

        /* renamed from: c */
        public final /* synthetic */ ComposeViewAdapter f4631c;

        public C2040b(ComposeViewAdapter composeViewAdapter) {
            this.f4631c = composeViewAdapter;
        }

        public final Lifecycle getLifecycle() {
            return this.f4631c.FakeSavedStateRegistryOwner.f4632b;
        }

        public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return this.f4630b;
        }
    }

    /* renamed from: androidx.compose.ui.tooling.ComposeViewAdapter$c */
    public static final class C2041c implements C3269d {

        /* renamed from: b */
        public final C2888t f4632b;

        /* renamed from: c */
        public final C3268c f4633c;

        public C2041c() {
            C2888t tVar = new C2888t(this, false);
            this.f4632b = tVar;
            C3268c cVar = new C3268c(this);
            cVar.mo12063a(new Bundle());
            this.f4633c = cVar;
            tVar.mo10839h(Lifecycle.State.RESUMED);
        }

        public final Lifecycle getLifecycle() {
            return this.f4632b;
        }

        public final C3265b getSavedStateRegistry() {
            return this.f4633c.f7591b;
        }
    }

    /* renamed from: androidx.compose.ui.tooling.ComposeViewAdapter$d */
    public static final class C2042d implements C2880m0 {

        /* renamed from: b */
        public final C2878l0 f4634b = new C2878l0();

        public final C2878l0 getViewModelStore() {
            return this.f4634b;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposeViewAdapter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(attributeSet, "attrs");
        Context context2 = getContext();
        C19383o.m32796f(context2, ResponseConstants.CONTEXT);
        this.composeView = new ComposeView(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        EmptyList emptyList = EmptyList.INSTANCE;
        this.viewInfos = emptyList;
        this.designInfoList = emptyList;
        this.slotTableRecord = new C2056c();
        this.composableName = "";
        this.delayedException = new C2057d();
        this.previewComposition = ComposableSingletons$ComposeViewAdapterKt.f4626b;
        this.content = C0761x.m1751w0(C2049a.f4635a, C1351n1.f2948a);
        this.designInfoProvidersArgument = "";
        this.onDraw = ComposeViewAdapter$onDraw$1.INSTANCE;
        Paint paint = new Paint();
        paint.setPathEffect(new DashPathEffect(new float[]{5.0f, 10.0f, 15.0f, 20.0f}, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(C18263b.m30859o0(C1545s.f3359d));
        this.debugBoundsPaint = paint;
        this.FakeSavedStateRegistryOwner = new C2041c();
        this.FakeViewModelStoreOwner = new C2042d();
        this.FakeOnBackPressedDispatcherOwner = new C2040b(this);
        this.FakeActivityResultRegistryOwner = new C2038a();
        init(attributeSet);
    }

    /* access modifiers changed from: private */
    public final void WrapPreview(C19861p<? super C1302d, ? super Integer, C19394m> pVar, C1302d dVar, int i) {
        ComposerImpl h = dVar.mo5440h(493526445);
        C1345l1 l1Var = CompositionLocalsKt.f4021g;
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        C1345l1 l1Var2 = CompositionLocalsKt.f4022h;
        Context context2 = getContext();
        C19383o.m32796f(context2, ResponseConstants.CONTEXT);
        C1411t tVar = LocalOnBackPressedDispatcherOwner.f154a;
        C2040b bVar = this.FakeOnBackPressedDispatcherOwner;
        C19383o.m32797g(bVar, "dispatcherOwner");
        C1411t tVar2 = LocalActivityResultRegistryOwner.f153a;
        C2038a aVar = this.FakeActivityResultRegistryOwner;
        C19383o.m32797g(aVar, "registryOwner");
        CompositionLocalKt.m2530a(new C1412t0[]{l1Var.mo5908b(new C19388s(context)), l1Var2.mo5908b(C15588c1.m25304S(context2)), LocalOnBackPressedDispatcherOwner.f154a.mo5908b(bVar), LocalActivityResultRegistryOwner.f153a.mo5908b(aVar)}, C18263b.m30805A(h, -1966112531, new ComposeViewAdapter$WrapPreview$1(this, pVar, i)), h, 56);
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new ComposeViewAdapter$WrapPreview$2(this, pVar, i);
        }
    }

    private final List<C2060c> findAll(C2060c cVar, C19857l<? super C2060c, Boolean> lVar) {
        return findGroupsThatMatchPredicate$default(this, cVar, lVar, false, 4, (Object) null);
    }

    private final void findAndTrackTransitions() {
        T t;
        Set<C1413a> a = this.slotTableRecord.mo7836a();
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(a));
        for (C1413a b : a) {
            arrayList.add(C2065h.m4492b(b));
        }
        LinkedHashSet<Transition> linkedHashSet = new LinkedHashSet<>();
        LinkedHashSet<Transition> linkedHashSet2 = new LinkedHashSet<>();
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C2060c cVar = (C2060c) it.next();
            linkedHashSet.addAll(findAndTrackTransitions$findTransitionObjects(findAll(cVar, ComposeViewAdapter$findAndTrackTransitions$1$1.INSTANCE), this));
            List<C2060c> findAll = findAll(cVar, ComposeViewAdapter$findAndTrackTransitions$1$2.INSTANCE);
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = findAll.iterator();
            while (true) {
                T t2 = null;
                if (!it2.hasNext()) {
                    break;
                }
                Iterator<T> it3 = ((C2060c) it2.next()).f4659g.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    T next = it3.next();
                    if (C19383o.m32792b(((C2060c) next).f4654b, "updateTransition")) {
                        t2 = next;
                        break;
                    }
                }
                C2060c cVar2 = (C2060c) t2;
                if (cVar2 != null) {
                    arrayList2.add(cVar2);
                }
            }
            linkedHashSet2.addAll(findAndTrackTransitions$findTransitionObjects(arrayList2, this));
            List<C2060c> findAll2 = findAll(cVar, ComposeViewAdapter$findAndTrackTransitions$1$4.INSTANCE);
            ArrayList arrayList3 = new ArrayList();
            for (C2060c cVar3 : findAll2) {
                Iterator<T> it4 = cVar3.f4659g.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it4.next();
                    if (C19383o.m32792b(((C2060c) t).f4654b, "updateTransition")) {
                        break;
                    }
                }
                C2060c cVar4 = (C2060c) t;
                if (cVar4 != null) {
                    arrayList3.add(cVar4);
                }
            }
            linkedHashSet3.addAll(findAndTrackTransitions$findTransitionObjects(arrayList3, this));
            linkedHashSet.removeAll(linkedHashSet2);
            linkedHashSet.removeAll(linkedHashSet3);
        }
        boolean z = true;
        if (!(!linkedHashSet.isEmpty()) && !(!linkedHashSet2.isEmpty())) {
            z = false;
        }
        this.hasAnimations = z;
        if (this.clock != null) {
            for (Transition c : linkedHashSet) {
                getClock$ui_tooling_release().mo7832c(c);
            }
            for (Transition b2 : linkedHashSet2) {
                getClock$ui_tooling_release().mo7831b(b2, new ComposeViewAdapter$findAndTrackTransitions$4$1(this));
            }
        }
    }

    private static final List<Transition<Object>> findAndTrackTransitions$findTransitionObjects(List<? extends C2060c> list, ComposeViewAdapter composeViewAdapter) {
        Transition transition;
        T t;
        ArrayList<C2060c> arrayList = new ArrayList<>();
        for (C2060c firstOrNull : list) {
            C2060c firstOrNull2 = composeViewAdapter.firstOrNull(firstOrNull, C2043x42291c05.INSTANCE);
            if (firstOrNull2 != null) {
                arrayList.add(firstOrNull2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C2060c cVar : arrayList) {
            Iterator<T> it = cVar.f4658f.iterator();
            while (true) {
                transition = null;
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (t instanceof Transition) {
                    break;
                }
            }
            if (t instanceof Transition) {
                transition = (Transition) t;
            }
            if (transition != null) {
                arrayList2.add(transition);
            }
        }
        return arrayList2;
    }

    private final void findDesignInfoProviders() {
        String str;
        Method method;
        Set<C1413a> a = this.slotTableRecord.mo7836a();
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(a));
        for (C1413a b : a) {
            arrayList.add(C2065h.m4492b(b));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List<C2060c> findAll = findAll((C2060c) it.next(), new ComposeViewAdapter$findDesignInfoProviders$1$1(this));
            ArrayList arrayList3 = new ArrayList();
            for (C2060c cVar : findAll) {
                Iterator<T> it2 = cVar.f4659g.iterator();
                while (true) {
                    str = null;
                    if (!it2.hasNext()) {
                        break;
                    }
                    Iterator<T> it3 = ((C2060c) it2.next()).f4658f.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            T next = it3.next();
                            if (next != null) {
                                method = getDesignInfoMethodOrNull(next);
                                continue;
                            } else {
                                method = null;
                                continue;
                            }
                            if (method != null) {
                                C7289h hVar = cVar.f4657e;
                                str = invokeGetDesignInfo(next, hVar.f16167a, hVar.f16168b);
                                break;
                            }
                        }
                    }
                }
                if (str != null) {
                    arrayList3.add(str);
                }
            }
            C19324q.m32628J0(arrayList3, arrayList2);
        }
        this.designInfoList = arrayList2;
    }

    private final List<C2060c> findGroupsThatMatchPredicate(C2060c cVar, C19857l<? super C2060c, Boolean> lVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList f0 = C17782b.m29866f0(cVar);
        while (!f0.isEmpty()) {
            C2060c cVar2 = (C2060c) C19324q.m32632N0(f0);
            if (lVar.invoke(cVar2).booleanValue()) {
                if (z) {
                    return C17782b.m29864d0(cVar2);
                }
                arrayList.add(cVar2);
            }
            f0.addAll(cVar2.f4659g);
        }
        return arrayList;
    }

    public static /* synthetic */ List findGroupsThatMatchPredicate$default(ComposeViewAdapter composeViewAdapter, C2060c cVar, C19857l lVar, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return composeViewAdapter.findGroupsThatMatchPredicate(cVar, lVar, z);
    }

    private final C2060c firstOrNull(C2060c cVar, C19857l<? super C2060c, Boolean> lVar) {
        return (C2060c) C19327t.m32640V0(findGroupsThatMatchPredicate(cVar, lVar, true));
    }

    public static /* synthetic */ void getClock$ui_tooling_release$annotations() {
    }

    private static /* synthetic */ void getContent$annotations() {
    }

    /* access modifiers changed from: private */
    public final Method getDesignInfoMethodOrNull(Object obj) {
        try {
            Class<?> cls = obj.getClass();
            Class cls2 = Integer.TYPE;
            return cls.getDeclaredMethod("getDesignInfo", new Class[]{cls2, cls2, String.class});
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r1.f4685d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String getFileName(androidx.compose.p015ui.tooling.data.C2060c r1) {
        /*
            r0 = this;
            androidx.compose.ui.tooling.data.j r1 = r1.f4655c
            if (r1 == 0) goto L_0x0008
            java.lang.String r1 = r1.f4685d
            if (r1 != 0) goto L_0x000a
        L_0x0008:
            java.lang.String r1 = ""
        L_0x000a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.tooling.ComposeViewAdapter.getFileName(androidx.compose.ui.tooling.data.c):java.lang.String");
    }

    private final int getLineNumber(C2060c cVar) {
        C2067j jVar = cVar.f4655c;
        if (jVar != null) {
            return jVar.f4682a;
        }
        return -1;
    }

    private final boolean hasNullSourcePosition(C2060c cVar) {
        return (getFileName(cVar).length() == 0) && getLineNumber(cVar) == -1;
    }

    private final void init(AttributeSet attributeSet) {
        long j;
        AttributeSet attributeSet2 = attributeSet;
        setTag(R.id.view_tree_lifecycle_owner, this.FakeSavedStateRegistryOwner);
        ViewTreeSavedStateRegistryOwner.m7917b(this, this.FakeSavedStateRegistryOwner);
        setTag(R.id.view_tree_view_model_store_owner, this.FakeViewModelStoreOwner);
        addView(this.composeView);
        String attributeValue = attributeSet2.getAttributeValue("http://schemas.android.com/tools", "composableName");
        if (attributeValue != null) {
            Class cls = null;
            String G1 = C19459m.m33034G1(attributeValue);
            String D1 = C19459m.m33031D1(attributeValue, attributeValue);
            int attributeIntValue = attributeSet2.getAttributeIntValue("http://schemas.android.com/tools", "parameterProviderIndex", 0);
            String attributeValue2 = attributeSet2.getAttributeValue("http://schemas.android.com/tools", "parameterProviderClass");
            if (attributeValue2 != null) {
                cls = C18263b.m30862q(attributeValue2);
            }
            try {
                String attributeValue3 = attributeSet2.getAttributeValue("http://schemas.android.com/tools", "animationClockStartTime");
                C19383o.m32796f(attributeValue3, "attrs.getAttributeValue(…animationClockStartTime\")");
                j = Long.parseLong(attributeValue3);
            } catch (Exception unused) {
                j = -1;
            }
            boolean attributeBooleanValue = attributeSet2.getAttributeBooleanValue("http://schemas.android.com/tools", "forceCompositionInvalidation", false);
            init$ui_tooling_release$default(this, G1, D1, cls, attributeIntValue, attributeSet2.getAttributeBooleanValue("http://schemas.android.com/tools", "paintBounds", this.debugPaintBounds), attributeSet2.getAttributeBooleanValue("http://schemas.android.com/tools", "printViewInfos", this.debugViewInfos), j, attributeBooleanValue, attributeSet2.getAttributeBooleanValue("http://schemas.android.com/tools", "findDesignInfoProviders", this.lookForDesignInfoProviders), attributeSet2.getAttributeValue("http://schemas.android.com/tools", "designInfoProvidersArgument"), (C19846a) null, (C19846a) null, 3072, (Object) null);
        }
    }

    public static /* synthetic */ void init$ui_tooling_release$default(ComposeViewAdapter composeViewAdapter, String str, String str2, Class cls, int i, boolean z, boolean z2, long j, boolean z3, boolean z4, String str3, C19846a aVar, C19846a aVar2, int i2, Object obj) {
        int i3 = i2;
        composeViewAdapter.init$ui_tooling_release(str, str2, (i3 & 4) != 0 ? null : cls, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? false : z, (i3 & 32) != 0 ? false : z2, (i3 & 64) != 0 ? -1 : j, (i3 & 128) != 0 ? false : z3, (i3 & 256) != 0 ? false : z4, (i3 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? null : str3, (i3 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? ComposeViewAdapter$init$1.INSTANCE : aVar, (i3 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? ComposeViewAdapter$init$2.INSTANCE : aVar2);
    }

    private final void invalidateComposition() {
        this.content.setValue(ComposableSingletons$ComposeViewAdapterKt.f4627c);
        this.content.setValue(this.previewComposition);
        invalidate();
    }

    private final String invokeGetDesignInfo(Object obj, int i, int i2) {
        Method designInfoMethodOrNull = getDesignInfoMethodOrNull(obj);
        if (designInfoMethodOrNull == null) {
            return null;
        }
        try {
            boolean z = false;
            Object invoke = designInfoMethodOrNull.invoke(obj, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), this.designInfoProvidersArgument});
            if (invoke != null) {
                String str = (String) invoke;
                if (str.length() == 0) {
                    z = true;
                }
                if (z) {
                    return null;
                }
                return str;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Exception unused) {
            return null;
        }
    }

    private final boolean isNullGroup(C2060c cVar) {
        return hasNullSourcePosition(cVar) && cVar.f4659g.isEmpty();
    }

    private final void processViewInfos() {
        Set<C1413a> a = this.slotTableRecord.mo7836a();
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(a));
        for (C1413a b : a) {
            arrayList.add(C2065h.m4492b(b));
        }
        ArrayList arrayList2 = new ArrayList(C19322o.m32624F0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(toViewInfo((C2060c) it.next()));
        }
        List<C2069e> p1 = C19327t.m32660p1(arrayList2);
        this.viewInfos = p1;
        if (this.debugViewInfos) {
            for (C2069e walkTable$default : p1) {
                walkTable$default(this, walkTable$default, 0, 2, (Object) null);
            }
        }
    }

    private final C2069e toViewInfo(C2060c cVar) {
        String str;
        if (cVar.f4659g.size() == 1 && hasNullSourcePosition(cVar)) {
            return toViewInfo((C2060c) C19327t.m32654j1(cVar.f4659g));
        }
        Collection<C2060c> collection = cVar.f4659g;
        ArrayList arrayList = new ArrayList();
        for (T next : collection) {
            if (!isNullGroup((C2060c) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C19322o.m32624F0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(toViewInfo((C2060c) it.next()));
        }
        C2067j jVar = cVar.f4655c;
        if (jVar == null || (str = jVar.f4685d) == null) {
            str = "";
        }
        return new C2069e(str, jVar != null ? jVar.f4682a : -1, cVar.f4657e, jVar, arrayList2);
    }

    private final void walkTable(C2069e eVar, int i) {
        String str = this.TAG;
        Log.d(str, C19457k.m33022Z0(i, "|  ") + "|-" + eVar);
        for (C2069e walkTable : eVar.f4694e) {
            walkTable(walkTable, i + 1);
        }
    }

    public static /* synthetic */ void walkTable$default(ComposeViewAdapter composeViewAdapter, C2069e eVar, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        composeViewAdapter.walkTable(eVar, i);
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.forceCompositionInvalidation) {
            invalidateComposition();
        }
        this.onDraw.invoke();
        if (this.debugPaintBounds) {
            List<C2069e> list = this.viewInfos;
            ArrayList arrayList = new ArrayList();
            for (C2069e eVar : list) {
                C19324q.m32628J0(C19327t.m32650f1(eVar.mo7844a(), C17782b.m29864d0(eVar)), arrayList);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C2069e eVar2 = (C2069e) it.next();
                C7289h hVar = eVar2.f4692c;
                if (((hVar.f16170d == 0 || hVar.f16169c == 0) ? false : true) && canvas != null) {
                    C7289h hVar2 = eVar2.f4692c;
                    canvas.drawRect(new Rect(hVar2.f16167a, hVar2.f16168b, hVar2.f16169c, hVar2.f16170d), this.debugBoundsPaint);
                }
            }
        }
    }

    public final void dispose$ui_tooling_release() {
        this.composeView.disposeComposition();
        if (this.clock != null) {
            getClock$ui_tooling_release().mo7830a();
        }
        this.FakeViewModelStoreOwner.f4634b.mo10831a();
    }

    public final C2052c getClock$ui_tooling_release() {
        C2052c cVar = this.clock;
        if (cVar != null) {
            return cVar;
        }
        C19383o.m32805o("clock");
        throw null;
    }

    public final List<String> getDesignInfoList$ui_tooling_release() {
        return this.designInfoList;
    }

    public final List<C2069e> getViewInfos$ui_tooling_release() {
        return this.viewInfos;
    }

    public final boolean hasAnimations() {
        return this.hasAnimations;
    }

    public final void init$ui_tooling_release(String str, String str2, Class<? extends C7211a<?>> cls, int i, boolean z, boolean z2, long j, boolean z3, boolean z4, String str3, C19846a<C19394m> aVar, C19846a<C19394m> aVar2) {
        C19846a<C19394m> aVar3 = aVar2;
        String str4 = str;
        C19383o.m32797g(str, "className");
        C19383o.m32797g(str2, "methodName");
        C19383o.m32797g(aVar, "onCommit");
        C19383o.m32797g(aVar3, "onDraw");
        this.debugPaintBounds = z;
        this.debugViewInfos = z2;
        this.composableName = str2;
        this.forceCompositionInvalidation = z3;
        this.lookForDesignInfoProviders = z4;
        this.designInfoProvidersArgument = str3 == null ? "" : str3;
        this.onDraw = aVar3;
        ComposableLambdaImpl B = C18263b.m30807B(new ComposeViewAdapter$init$3(aVar, this, j, str, str2, cls, i), -1704541905, true);
        this.previewComposition = B;
        this.composeView.setContent(B);
        invalidate();
    }

    public void onAttachedToWindow() {
        C15588c1.m25297O0(this.composeView.getRootView(), this.FakeSavedStateRegistryOwner);
        super.onAttachedToWindow();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C2057d dVar = this.delayedException;
        synchronized (dVar.f4650b) {
            Throwable th = dVar.f4649a;
            if (th != null) {
                dVar.f4649a = null;
                throw th;
            }
        }
        processViewInfos();
        if (this.composableName.length() > 0) {
            findAndTrackTransitions();
            if (this.lookForDesignInfoProviders) {
                findDesignInfoProviders();
            }
        }
    }

    public final void setClock$ui_tooling_release(C2052c cVar) {
        C19383o.m32797g(cVar, "<set-?>");
        this.clock = cVar;
    }

    public final void setDesignInfoList$ui_tooling_release(List<String> list) {
        C19383o.m32797g(list, "<set-?>");
        this.designInfoList = list;
    }

    public final void setViewInfos$ui_tooling_release(List<C2069e> list) {
        C19383o.m32797g(list, "<set-?>");
        this.viewInfos = list;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposeViewAdapter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(attributeSet, "attrs");
        Context context2 = getContext();
        C19383o.m32796f(context2, ResponseConstants.CONTEXT);
        this.composeView = new ComposeView(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        EmptyList emptyList = EmptyList.INSTANCE;
        this.viewInfos = emptyList;
        this.designInfoList = emptyList;
        this.slotTableRecord = new C2056c();
        this.composableName = "";
        this.delayedException = new C2057d();
        this.previewComposition = ComposableSingletons$ComposeViewAdapterKt.f4626b;
        this.content = C0761x.m1751w0(C2049a.f4635a, C1351n1.f2948a);
        this.designInfoProvidersArgument = "";
        this.onDraw = ComposeViewAdapter$onDraw$1.INSTANCE;
        Paint paint = new Paint();
        paint.setPathEffect(new DashPathEffect(new float[]{5.0f, 10.0f, 15.0f, 20.0f}, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(C18263b.m30859o0(C1545s.f3359d));
        this.debugBoundsPaint = paint;
        this.FakeSavedStateRegistryOwner = new C2041c();
        this.FakeViewModelStoreOwner = new C2042d();
        this.FakeOnBackPressedDispatcherOwner = new C2040b(this);
        this.FakeActivityResultRegistryOwner = new C2038a();
        init(attributeSet);
    }
}
