package androidx.compose.p015ui.focus;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.ComposedModifierKt;
import androidx.compose.p015ui.platform.InspectableValueKt;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p098f0.C6765c;
import p098f0.C6767e;

/* renamed from: androidx.compose.ui.focus.FocusModifierKt */
public final class FocusModifierKt {

    /* renamed from: a */
    public static final C6767e<FocusModifier> f3166a = C19543e0.m33309b0(FocusModifierKt$ModifierLocalParentFocusModifier$1.INSTANCE);

    /* renamed from: b */
    public static final C1436d f3167b = new C1456a().mo6148i0(new C1457b()).mo6148i0(new C1458c());

    /* renamed from: androidx.compose.ui.focus.FocusModifierKt$a */
    public static final class C1456a implements C6765c<C1477k> {
        public final C6767e<C1477k> getKey() {
            return FocusPropertiesKt.f3168a;
        }

        public final /* bridge */ /* synthetic */ Object getValue() {
            return null;
        }
    }

    /* renamed from: androidx.compose.ui.focus.FocusModifierKt$b */
    public static final class C1457b implements C6765c<C1467c> {
        public final C6767e<C1467c> getKey() {
            return FocusEventModifierKt.f3145a;
        }

        public final /* bridge */ /* synthetic */ Object getValue() {
            return null;
        }
    }

    /* renamed from: androidx.compose.ui.focus.FocusModifierKt$c */
    public static final class C1458c implements C6765c<C1480n> {
        public final C6767e<C1480n> getKey() {
            return FocusRequesterModifierKt.f3169a;
        }

        public final /* bridge */ /* synthetic */ Object getValue() {
            return null;
        }
    }

    static {
        int i = C1436d.f3124a0;
        C1436d.C1437a aVar = C1436d.C1437a.f3125b;
    }

    /* renamed from: a */
    public static final C1436d m3102a(C1436d dVar) {
        C19383o.m32797g(dVar, "<this>");
        return ComposedModifierKt.m3049a(dVar, InspectableValueKt.f4032a, FocusModifierKt$focusTarget$2.INSTANCE);
    }

    /* renamed from: b */
    public static final C1436d m3103b(C1436d dVar, FocusModifier focusModifier) {
        C19383o.m32797g(dVar, "<this>");
        C19383o.m32797g(focusModifier, "focusModifier");
        return dVar.mo6148i0(focusModifier).mo6148i0(f3167b);
    }
}
