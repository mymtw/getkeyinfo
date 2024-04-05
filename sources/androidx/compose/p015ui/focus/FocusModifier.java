package androidx.compose.p015ui.focus;

import androidx.compose.p015ui.input.key.C1614d;
import androidx.compose.p015ui.input.key.KeyInputModifierKt;
import androidx.compose.p015ui.input.rotary.C1658a;
import androidx.compose.p015ui.input.rotary.RotaryInputModifierKt;
import androidx.compose.p015ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.p015ui.layout.C1667b;
import androidx.compose.p015ui.layout.C1678e0;
import androidx.compose.p015ui.layout.C1689j;
import androidx.compose.p015ui.node.C1750p;
import androidx.compose.p015ui.node.C1752q;
import androidx.compose.p015ui.node.LayoutNode;
import androidx.compose.p015ui.node.LayoutNodeWrapper;
import androidx.compose.p015ui.platform.C1862p0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p076d0.C6616b;
import p098f0.C6764b;
import p098f0.C6765c;
import p098f0.C6766d;
import p098f0.C6767e;
import p219r.C7734e;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.focus.FocusModifier */
public final class FocusModifier extends C1862p0 implements C6764b, C6765c<FocusModifier>, C1752q, C1678e0 {

    /* renamed from: q */
    public static final C19857l<FocusModifier, C19394m> f3150q = FocusModifier$Companion$RefreshFocusProperties$1.INSTANCE;

    /* renamed from: c */
    public FocusModifier f3151c;

    /* renamed from: d */
    public final C7734e<FocusModifier> f3152d;

    /* renamed from: e */
    public FocusStateImpl f3153e;

    /* renamed from: f */
    public FocusModifier f3154f;

    /* renamed from: g */
    public C1467c f3155g;

    /* renamed from: h */
    public C6616b<C1658a> f3156h;

    /* renamed from: i */
    public C1667b f3157i;

    /* renamed from: j */
    public C1477k f3158j;

    /* renamed from: k */
    public final C1476j f3159k;

    /* renamed from: l */
    public C1480n f3160l;

    /* renamed from: m */
    public LayoutNodeWrapper f3161m;

    /* renamed from: n */
    public boolean f3162n;

    /* renamed from: o */
    public C1614d f3163o;

    /* renamed from: p */
    public final C7734e<C1614d> f3164p;

    /* renamed from: androidx.compose.ui.focus.FocusModifier$a */
    public /* synthetic */ class C1455a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3165a;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.Captured.ordinal()] = 2;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            f3165a = iArr;
        }
    }

    public FocusModifier() {
        throw null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FocusModifier(androidx.compose.p015ui.focus.FocusStateImpl r4) {
        /*
            r3 = this;
            kq.l<androidx.compose.ui.platform.o0, kotlin.m> r0 = androidx.compose.p015ui.platform.InspectableValueKt.f4032a
            java.lang.String r1 = "initialFocus"
            kotlin.jvm.internal.C19383o.m32797g(r4, r1)
            java.lang.String r1 = "inspectorInfo"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            r3.<init>(r0)
            r.e r0 = new r.e
            r1 = 16
            androidx.compose.ui.focus.FocusModifier[] r2 = new androidx.compose.p015ui.focus.FocusModifier[r1]
            r0.<init>(r2)
            r3.f3152d = r0
            r3.f3153e = r4
            androidx.compose.ui.focus.j r4 = new androidx.compose.ui.focus.j
            r4.<init>()
            r3.f3159k = r4
            r.e r4 = new r.e
            androidx.compose.ui.input.key.d[] r0 = new androidx.compose.p015ui.input.key.C1614d[r1]
            r4.<init>(r0)
            r3.f3164p = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.focus.FocusModifier.<init>(androidx.compose.ui.focus.FocusStateImpl):void");
    }

    /* renamed from: D */
    public final void mo3725D(C1689j jVar) {
        C19383o.m32797g(jVar, "coordinates");
        boolean z = this.f3161m == null;
        this.f3161m = (LayoutNodeWrapper) jVar;
        if (z) {
            FocusPropertiesKt.m3104a(this);
        }
        if (this.f3162n) {
            this.f3162n = false;
            C1482p.m3148f(this);
        }
    }

    /* renamed from: M */
    public final void mo3622M(C6766d dVar) {
        C7734e<FocusModifier> eVar;
        C7734e<FocusModifier> eVar2;
        LayoutNodeWrapper layoutNodeWrapper;
        LayoutNode layoutNode;
        C1750p pVar;
        C1469d focusManager;
        C19383o.m32797g(dVar, "scope");
        FocusModifier focusModifier = (FocusModifier) dVar.mo6818a(FocusModifierKt.f3166a);
        if (!C19383o.m32792b(focusModifier, this.f3151c)) {
            if (focusModifier == null) {
                int i = C1455a.f3165a[this.f3153e.ordinal()];
                if (!((i != 1 && i != 2) || (layoutNodeWrapper = this.f3161m) == null || (layoutNode = layoutNodeWrapper.f3850f) == null || (pVar = layoutNode.f3823h) == null || (focusManager = pVar.getFocusManager()) == null)) {
                    focusManager.mo6185b(true);
                }
            }
            FocusModifier focusModifier2 = this.f3151c;
            if (!(focusModifier2 == null || (eVar2 = focusModifier2.f3152d) == null)) {
                eVar2.mo20241o(this);
            }
            if (!(focusModifier == null || (eVar = focusModifier.f3152d) == null)) {
                eVar.mo20232c(this);
            }
        }
        this.f3151c = focusModifier;
        C1467c cVar = (C1467c) dVar.mo6818a(FocusEventModifierKt.f3145a);
        if (!C19383o.m32792b(cVar, this.f3155g)) {
            C1467c cVar2 = this.f3155g;
            if (cVar2 != null) {
                cVar2.mo6210e(this);
            }
            if (cVar != null) {
                cVar.mo6207a(this);
            }
        }
        this.f3155g = cVar;
        C1480n nVar = (C1480n) dVar.mo6818a(FocusRequesterModifierKt.f3169a);
        if (!C19383o.m32792b(nVar, this.f3160l)) {
            C1480n nVar2 = this.f3160l;
            if (nVar2 != null) {
                nVar2.mo6222d(this);
            }
            if (nVar != null) {
                nVar.mo6220a(this);
            }
        }
        this.f3160l = nVar;
        this.f3156h = (C6616b) dVar.mo6818a(RotaryInputModifierKt.f3690a);
        this.f3157i = (C1667b) dVar.mo6818a(BeyondBoundsLayoutKt.f3696a);
        this.f3163o = (C1614d) dVar.mo6818a(KeyInputModifierKt.f3575a);
        this.f3158j = (C1477k) dVar.mo6818a(FocusPropertiesKt.f3168a);
        FocusPropertiesKt.m3104a(this);
    }

    /* renamed from: b */
    public final void mo6187b(FocusStateImpl focusStateImpl) {
        C19383o.m32797g(focusStateImpl, "value");
        this.f3153e = focusStateImpl;
        C1482p.m3151i(this);
    }

    public final C6767e<FocusModifier> getKey() {
        return FocusModifierKt.f3166a;
    }

    public final Object getValue() {
        return this;
    }

    public final boolean isValid() {
        return this.f3151c != null;
    }
}
