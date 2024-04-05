package androidx.compose.p015ui.platform;

import androidx.compose.p015ui.node.C1750p;
import androidx.compose.p015ui.text.font.C1950f;
import androidx.compose.p015ui.text.font.C1952g;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1345l1;
import androidx.compose.runtime.C1412t0;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.platform.CompositionLocalsKt */
public final class CompositionLocalsKt {

    /* renamed from: a */
    public static final C1345l1 f4015a = CompositionLocalKt.m2532c(CompositionLocalsKt$LocalAccessibilityManager$1.INSTANCE);

    /* renamed from: b */
    public static final C1345l1 f4016b = CompositionLocalKt.m2532c(CompositionLocalsKt$LocalAutofill$1.INSTANCE);

    /* renamed from: c */
    public static final C1345l1 f4017c = CompositionLocalKt.m2532c(CompositionLocalsKt$LocalAutofillTree$1.INSTANCE);

    /* renamed from: d */
    public static final C1345l1 f4018d = CompositionLocalKt.m2532c(CompositionLocalsKt$LocalClipboardManager$1.INSTANCE);

    /* renamed from: e */
    public static final C1345l1 f4019e = CompositionLocalKt.m2532c(CompositionLocalsKt$LocalDensity$1.INSTANCE);

    /* renamed from: f */
    public static final C1345l1 f4020f = CompositionLocalKt.m2532c(CompositionLocalsKt$LocalFocusManager$1.INSTANCE);

    /* renamed from: g */
    public static final C1345l1 f4021g = CompositionLocalKt.m2532c(CompositionLocalsKt$LocalFontLoader$1.INSTANCE);

    /* renamed from: h */
    public static final C1345l1 f4022h = CompositionLocalKt.m2532c(CompositionLocalsKt$LocalFontFamilyResolver$1.INSTANCE);

    /* renamed from: i */
    public static final C1345l1 f4023i = CompositionLocalKt.m2532c(CompositionLocalsKt$LocalHapticFeedback$1.INSTANCE);

    /* renamed from: j */
    public static final C1345l1 f4024j = CompositionLocalKt.m2532c(CompositionLocalsKt$LocalInputModeManager$1.INSTANCE);

    /* renamed from: k */
    public static final C1345l1 f4025k = CompositionLocalKt.m2532c(CompositionLocalsKt$LocalLayoutDirection$1.INSTANCE);

    /* renamed from: l */
    public static final C1345l1 f4026l = CompositionLocalKt.m2532c(CompositionLocalsKt$LocalTextInputService$1.INSTANCE);

    /* renamed from: m */
    public static final C1345l1 f4027m = CompositionLocalKt.m2532c(CompositionLocalsKt$LocalTextToolbar$1.INSTANCE);

    /* renamed from: n */
    public static final C1345l1 f4028n = CompositionLocalKt.m2532c(CompositionLocalsKt$LocalUriHandler$1.INSTANCE);

    /* renamed from: o */
    public static final C1345l1 f4029o = CompositionLocalKt.m2532c(CompositionLocalsKt$LocalViewConfiguration$1.INSTANCE);

    /* renamed from: p */
    public static final C1345l1 f4030p = CompositionLocalKt.m2532c(CompositionLocalsKt$LocalWindowInfo$1.INSTANCE);

    /* renamed from: q */
    public static final C1345l1 f4031q = CompositionLocalKt.m2532c(CompositionLocalsKt$LocalPointerIconService$1.INSTANCE);

    /* renamed from: a */
    public static final void m3939a(C1750p pVar, C1828e1 e1Var, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, C1302d dVar, int i) {
        int i2;
        C19383o.m32797g(pVar, ResponseConstants.OWNER);
        C19383o.m32797g(e1Var, "uriHandler");
        C19383o.m32797g(pVar2, ResponseConstants.CONTENT);
        ComposerImpl h = dVar.mo5440h(874662829);
        if ((i & 14) == 0) {
            i2 = (h.mo5408I(pVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= h.mo5408I(e1Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.mo5408I(pVar2) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !h.mo5442i()) {
            C1345l1 l1Var = f4021g;
            C1950f.C1951a fontLoader = pVar.getFontLoader();
            l1Var.getClass();
            C1345l1 l1Var2 = f4022h;
            C1952g.C1953a fontFamilyResolver = pVar.getFontFamilyResolver();
            l1Var2.getClass();
            CompositionLocalKt.m2530a(new C1412t0[]{f4015a.mo5908b(pVar.getAccessibilityManager()), f4016b.mo5908b(pVar.getAutofill()), f4017c.mo5908b(pVar.getAutofillTree()), f4018d.mo5908b(pVar.getClipboardManager()), f4019e.mo5908b(pVar.getDensity()), f4020f.mo5908b(pVar.getFocusManager()), new C1412t0(l1Var, fontLoader, false), new C1412t0(l1Var2, fontFamilyResolver, false), f4023i.mo5908b(pVar.getHapticFeedBack()), f4024j.mo5908b(pVar.getInputModeManager()), f4025k.mo5908b(pVar.getLayoutDirection()), f4026l.mo5908b(pVar.getTextInputService()), f4027m.mo5908b(pVar.getTextToolbar()), f4028n.mo5908b(e1Var), f4029o.mo5908b(pVar.getViewConfiguration()), f4030p.mo5908b(pVar.getWindowInfo()), f4031q.mo5908b(pVar.getPointerIconService())}, pVar2, h, ((i2 >> 3) & 112) | 8);
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new CompositionLocalsKt$ProvideCommonCompositionLocals$1(pVar, e1Var, pVar2, i);
        }
    }

    /* renamed from: b */
    public static final void m3940b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    /* renamed from: c */
    public static final C1345l1 m3941c() {
        return f4019e;
    }

    /* renamed from: d */
    public static final C1345l1 m3942d() {
        return f4025k;
    }

    /* renamed from: e */
    public static final C1345l1 m3943e() {
        return f4029o;
    }
}
