package androidx.compose.p015ui.semantics;

import androidx.compose.p015ui.state.ToggleableState;
import androidx.compose.p015ui.text.C1913a;
import androidx.compose.p015ui.text.C2022r;
import androidx.compose.p015ui.text.input.C1989i;
import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;
import java.util.List;
import kotlin.C19394m;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.semantics.SemanticsProperties */
public final class SemanticsProperties {

    /* renamed from: A */
    public static final C1909p<C19857l<Object, Integer>> f4189A;

    /* renamed from: a */
    public static final C1909p<List<String>> f4190a = new C1909p<>("ContentDescription", SemanticsProperties$ContentDescription$1.INSTANCE);

    /* renamed from: b */
    public static final C1909p<String> f4191b;

    /* renamed from: c */
    public static final C1909p<C1899f> f4192c;

    /* renamed from: d */
    public static final C1909p<String> f4193d = new C1909p<>("PaneTitle", SemanticsProperties$PaneTitle$1.INSTANCE);

    /* renamed from: e */
    public static final C1909p<C19394m> f4194e;

    /* renamed from: f */
    public static final C1909p<C1895b> f4195f;

    /* renamed from: g */
    public static final C1909p<C1896c> f4196g;

    /* renamed from: h */
    public static final C1909p<C19394m> f4197h;

    /* renamed from: i */
    public static final C1909p<C19394m> f4198i;

    /* renamed from: j */
    public static final C1909p<C1898e> f4199j;

    /* renamed from: k */
    public static final C1909p<Boolean> f4200k;

    /* renamed from: l */
    public static final C1909p<C19394m> f4201l = new C1909p<>("InvisibleToUser", SemanticsProperties$InvisibleToUser$1.INSTANCE);

    /* renamed from: m */
    public static final C1909p<C1901h> f4202m;

    /* renamed from: n */
    public static final C1909p<C1901h> f4203n;

    /* renamed from: o */
    public static final C1909p<C19394m> f4204o = new C1909p<>("IsPopup", SemanticsProperties$IsPopup$1.INSTANCE);

    /* renamed from: p */
    public static final C1909p<C19394m> f4205p = new C1909p<>("IsDialog", SemanticsProperties$IsDialog$1.INSTANCE);

    /* renamed from: q */
    public static final C1909p<C1900g> f4206q = new C1909p<>("Role", SemanticsProperties$Role$1.INSTANCE);

    /* renamed from: r */
    public static final C1909p<String> f4207r = new C1909p<>("TestTag", SemanticsProperties$TestTag$1.INSTANCE);

    /* renamed from: s */
    public static final C1909p<List<C1913a>> f4208s = new C1909p<>("Text", SemanticsProperties$Text$1.INSTANCE);

    /* renamed from: t */
    public static final C1909p<C1913a> f4209t;

    /* renamed from: u */
    public static final C1909p<C2022r> f4210u;

    /* renamed from: v */
    public static final C1909p<C1989i> f4211v;

    /* renamed from: w */
    public static final C1909p<Boolean> f4212w;

    /* renamed from: x */
    public static final C1909p<ToggleableState> f4213x;

    /* renamed from: y */
    public static final C1909p<C19394m> f4214y;

    /* renamed from: z */
    public static final C1909p<String> f4215z;

    static {
        SemanticsPropertyKey$1 semanticsPropertyKey$1 = SemanticsPropertyKey$1.INSTANCE;
        f4191b = new C1909p<>("StateDescription", semanticsPropertyKey$1);
        f4192c = new C1909p<>("ProgressBarRangeInfo", semanticsPropertyKey$1);
        f4194e = new C1909p<>("SelectableGroup", semanticsPropertyKey$1);
        f4195f = new C1909p<>("CollectionInfo", semanticsPropertyKey$1);
        f4196g = new C1909p<>("CollectionItemInfo", semanticsPropertyKey$1);
        f4197h = new C1909p<>("Heading", semanticsPropertyKey$1);
        f4198i = new C1909p<>("Disabled", semanticsPropertyKey$1);
        f4199j = new C1909p<>("LiveRegion", semanticsPropertyKey$1);
        f4200k = new C1909p<>("Focused", semanticsPropertyKey$1);
        f4202m = new C1909p<>("HorizontalScrollAxisRange", semanticsPropertyKey$1);
        f4203n = new C1909p<>("VerticalScrollAxisRange", semanticsPropertyKey$1);
        f4209t = new C1909p<>("EditableText", semanticsPropertyKey$1);
        f4210u = new C1909p<>("TextSelectionRange", semanticsPropertyKey$1);
        f4211v = new C1909p<>("ImeAction", semanticsPropertyKey$1);
        f4212w = new C1909p<>("Selected", semanticsPropertyKey$1);
        f4213x = new C1909p<>("ToggleableState", semanticsPropertyKey$1);
        f4214y = new C1909p<>("Password", semanticsPropertyKey$1);
        f4215z = new C1909p<>(EventsNameKt.GENERIC_ERROR_MESSAGE, semanticsPropertyKey$1);
        f4189A = new C1909p<>("IndexForKey", semanticsPropertyKey$1);
    }
}
