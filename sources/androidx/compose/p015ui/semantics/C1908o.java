package androidx.compose.p015ui.semantics;

import androidx.compose.p015ui.text.C2021q;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.C19387r;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.C19410j;
import p568fn.C17782b;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.semantics.o */
public final class C1908o {

    /* renamed from: a */
    public static final /* synthetic */ C19410j<Object>[] f4253a;

    /* renamed from: b */
    public static final C1909p f4254b = SemanticsProperties.f4192c;

    /* renamed from: c */
    public static final C1909p f4255c = SemanticsProperties.f4193d;

    /* renamed from: d */
    public static final C1909p f4256d = SemanticsProperties.f4199j;

    /* renamed from: e */
    public static final C1909p f4257e = SemanticsProperties.f4200k;

    /* renamed from: f */
    public static final C1909p f4258f = SemanticsProperties.f4202m;

    /* renamed from: g */
    public static final C1909p f4259g = SemanticsProperties.f4203n;

    /* renamed from: h */
    public static final C1909p f4260h = SemanticsProperties.f4206q;

    /* renamed from: i */
    public static final C1909p f4261i = SemanticsProperties.f4207r;

    /* renamed from: j */
    public static final C1909p f4262j = SemanticsProperties.f4209t;

    /* renamed from: k */
    public static final C1909p f4263k = SemanticsProperties.f4210u;

    /* renamed from: l */
    public static final C1909p f4264l = SemanticsProperties.f4211v;

    /* renamed from: m */
    public static final C1909p f4265m = SemanticsProperties.f4212w;

    /* renamed from: n */
    public static final C1909p f4266n = SemanticsProperties.f4195f;

    /* renamed from: o */
    public static final C1909p f4267o = SemanticsProperties.f4213x;

    static {
        Class<C1908o> cls = C1908o.class;
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(cls, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1);
        C19387r rVar = C19386q.f43269a;
        rVar.getClass();
        MutablePropertyReference1Impl mutablePropertyReference1Impl2 = new MutablePropertyReference1Impl(cls, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1);
        rVar.getClass();
        MutablePropertyReference1Impl mutablePropertyReference1Impl3 = new MutablePropertyReference1Impl(cls, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1);
        rVar.getClass();
        MutablePropertyReference1Impl mutablePropertyReference1Impl4 = new MutablePropertyReference1Impl(cls, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1);
        rVar.getClass();
        MutablePropertyReference1Impl mutablePropertyReference1Impl5 = new MutablePropertyReference1Impl(cls, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1);
        rVar.getClass();
        MutablePropertyReference1Impl mutablePropertyReference1Impl6 = new MutablePropertyReference1Impl(cls, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1);
        rVar.getClass();
        MutablePropertyReference1Impl mutablePropertyReference1Impl7 = new MutablePropertyReference1Impl(cls, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1);
        rVar.getClass();
        MutablePropertyReference1Impl mutablePropertyReference1Impl8 = new MutablePropertyReference1Impl(cls, ResponseConstants.ROLE, "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1);
        rVar.getClass();
        MutablePropertyReference1Impl mutablePropertyReference1Impl9 = new MutablePropertyReference1Impl(cls, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1);
        rVar.getClass();
        MutablePropertyReference1Impl mutablePropertyReference1Impl10 = new MutablePropertyReference1Impl(cls, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1);
        rVar.getClass();
        MutablePropertyReference1Impl mutablePropertyReference1Impl11 = new MutablePropertyReference1Impl(cls, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1);
        rVar.getClass();
        MutablePropertyReference1Impl mutablePropertyReference1Impl12 = new MutablePropertyReference1Impl(cls, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1);
        rVar.getClass();
        MutablePropertyReference1Impl mutablePropertyReference1Impl13 = new MutablePropertyReference1Impl(cls, ResponseConstants.SELECTED, "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1);
        rVar.getClass();
        MutablePropertyReference1Impl mutablePropertyReference1Impl14 = new MutablePropertyReference1Impl(cls, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1);
        rVar.getClass();
        MutablePropertyReference1Impl mutablePropertyReference1Impl15 = new MutablePropertyReference1Impl(cls, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1);
        rVar.getClass();
        MutablePropertyReference1Impl mutablePropertyReference1Impl16 = new MutablePropertyReference1Impl(cls, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1);
        rVar.getClass();
        MutablePropertyReference1Impl mutablePropertyReference1Impl17 = new MutablePropertyReference1Impl(cls, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1);
        rVar.getClass();
        f4253a = new C19410j[]{mutablePropertyReference1Impl, mutablePropertyReference1Impl2, mutablePropertyReference1Impl3, mutablePropertyReference1Impl4, mutablePropertyReference1Impl5, mutablePropertyReference1Impl6, mutablePropertyReference1Impl7, mutablePropertyReference1Impl8, mutablePropertyReference1Impl9, mutablePropertyReference1Impl10, mutablePropertyReference1Impl11, mutablePropertyReference1Impl12, mutablePropertyReference1Impl13, mutablePropertyReference1Impl14, mutablePropertyReference1Impl15, mutablePropertyReference1Impl16, mutablePropertyReference1Impl17};
        C1909p<List<String>> pVar = SemanticsProperties.f4190a;
        C1909p<C1894a<C19857l<List<C2021q>, Boolean>>> pVar2 = C1902i.f4230a;
    }

    /* renamed from: a */
    public static void m4194a(C1910q qVar, C19846a aVar) {
        C19383o.m32797g(qVar, "<this>");
        qVar.mo7342a(C1902i.f4242m, new C1894a((String) null, aVar));
    }

    /* renamed from: b */
    public static final void m4195b(C1910q qVar) {
        C19383o.m32797g(qVar, "<this>");
        C1909p<List<String>> pVar = SemanticsProperties.f4190a;
        qVar.mo7342a(SemanticsProperties.f4198i, C19394m.f43287a);
    }

    /* renamed from: c */
    public static void m4196c(C1910q qVar, C19846a aVar) {
        C19383o.m32797g(qVar, "<this>");
        qVar.mo7342a(C1902i.f4243n, new C1894a((String) null, aVar));
    }

    /* renamed from: d */
    public static void m4197d(C1910q qVar, C19846a aVar) {
        C19383o.m32797g(qVar, "<this>");
        qVar.mo7342a(C1902i.f4241l, new C1894a((String) null, aVar));
    }

    /* renamed from: e */
    public static final void m4198e(C1910q qVar, String str, C19846a<Boolean> aVar) {
        C19383o.m32797g(qVar, "<this>");
        qVar.mo7342a(C1902i.f4231b, new C1894a(str, aVar));
    }

    /* renamed from: f */
    public static void m4199f(C1910q qVar, C19861p pVar) {
        C19383o.m32797g(qVar, "<this>");
        qVar.mo7342a(C1902i.f4233d, new C1894a((String) null, pVar));
    }

    /* renamed from: g */
    public static final void m4200g(C1910q qVar, String str) {
        C19383o.m32797g(qVar, "<this>");
        C19383o.m32797g(str, "value");
        C1909p<List<String>> pVar = SemanticsProperties.f4190a;
        qVar.mo7342a(SemanticsProperties.f4190a, C17782b.m29864d0(str));
    }

    /* renamed from: h */
    public static final void m4201h(C1910q qVar, C1901h hVar) {
        C19383o.m32797g(qVar, "<this>");
        C19383o.m32797g(hVar, "<set-?>");
        f4258f.mo7356a(qVar, f4253a[5], hVar);
    }

    /* renamed from: i */
    public static final void m4202i(C1910q qVar, int i) {
        C19383o.m32797g(qVar, "$this$role");
        f4260h.mo7356a(qVar, f4253a[7], new C1900g(i));
    }

    /* renamed from: j */
    public static final void m4203j(C1910q qVar, C1901h hVar) {
        C19383o.m32797g(qVar, "<this>");
        C19383o.m32797g(hVar, "<set-?>");
        f4259g.mo7356a(qVar, f4253a[6], hVar);
    }
}
