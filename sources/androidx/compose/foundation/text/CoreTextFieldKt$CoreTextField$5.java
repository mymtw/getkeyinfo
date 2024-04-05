package androidx.compose.foundation.text;

import android.support.p013v4.media.C0073e;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.relocation.C0882d;
import androidx.compose.foundation.text.C0962p;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.ComposedModifierKt;
import androidx.compose.p015ui.layout.AlignmentLineKt;
import androidx.compose.p015ui.layout.C1689j;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.node.LayoutNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.p015ui.text.C1913a;
import androidx.compose.p015ui.text.C2021q;
import androidx.compose.p015ui.text.C2022r;
import androidx.compose.p015ui.text.C2023s;
import androidx.compose.p015ui.text.MultiParagraphIntrinsics;
import androidx.compose.p015ui.text.input.C1994n;
import androidx.compose.p015ui.text.input.C2005w;
import androidx.compose.p015ui.text.input.C2006x;
import androidx.compose.p015ui.text.input.TextFieldValue;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.C1385f;
import androidx.compose.runtime.snapshots.SnapshotKt;
import java.util.List;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19543e0;
import p001a0.C0005b;
import p173m.C7279a;
import p174m0.C7282b;
import p174m0.C7290i;
import p628nj.C18263b;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19862q;

public final class CoreTextFieldKt$CoreTextField$5 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty1;
    public final /* synthetic */ C0882d $bringIntoViewRequester;
    public final /* synthetic */ C1436d $cursorModifier;
    public final /* synthetic */ C19862q<C19861p<? super C1302d, ? super Integer, C19394m>, C1302d, Integer, C19394m> $decorationBox;
    public final /* synthetic */ C1436d $drawModifier;
    public final /* synthetic */ C1436d $magnifierModifier;
    public final /* synthetic */ TextFieldSelectionManager $manager;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ C1436d $onPositionedModifier;
    public final /* synthetic */ C19857l<C2021q, C19394m> $onTextLayout;
    public final /* synthetic */ boolean $readOnly;
    public final /* synthetic */ TextFieldScrollerPosition $scrollerPosition;
    public final /* synthetic */ boolean $showHandleAndMagnifier;
    public final /* synthetic */ TextFieldState $state;
    public final /* synthetic */ C2023s $textStyle;
    public final /* synthetic */ TextFieldValue $value;
    public final /* synthetic */ C2006x $visualTransformation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$5(C19862q<? super C19861p<? super C1302d, ? super Integer, C19394m>, ? super C1302d, ? super Integer, C19394m> qVar, int i, int i2, C2023s sVar, TextFieldScrollerPosition textFieldScrollerPosition, TextFieldValue textFieldValue, C2006x xVar, C1436d dVar, C1436d dVar2, C1436d dVar3, C1436d dVar4, C0882d dVar5, TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, boolean z, boolean z2, C19857l<? super C2021q, C19394m> lVar) {
        super(2);
        this.$decorationBox = qVar;
        this.$$dirty1 = i;
        this.$maxLines = i2;
        this.$textStyle = sVar;
        this.$scrollerPosition = textFieldScrollerPosition;
        this.$value = textFieldValue;
        this.$visualTransformation = xVar;
        this.$cursorModifier = dVar;
        this.$drawModifier = dVar2;
        this.$onPositionedModifier = dVar3;
        this.$magnifierModifier = dVar4;
        this.$bringIntoViewRequester = dVar5;
        this.$state = textFieldState;
        this.$manager = textFieldSelectionManager;
        this.$showHandleAndMagnifier = z;
        this.$readOnly = z2;
        this.$onTextLayout = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C1302d dVar2 = dVar;
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C19862q<C19861p<? super C1302d, ? super Integer, C19394m>, C1302d, Integer, C19394m> qVar = this.$decorationBox;
            final int i2 = this.$maxLines;
            final C2023s sVar = this.$textStyle;
            final TextFieldScrollerPosition textFieldScrollerPosition = this.$scrollerPosition;
            final TextFieldValue textFieldValue = this.$value;
            final C2006x xVar = this.$visualTransformation;
            final C1436d dVar3 = this.$cursorModifier;
            final C1436d dVar4 = this.$drawModifier;
            final C1436d dVar5 = this.$onPositionedModifier;
            final C1436d dVar6 = this.$magnifierModifier;
            final C0882d dVar7 = this.$bringIntoViewRequester;
            final TextFieldState textFieldState = this.$state;
            TextFieldSelectionManager textFieldSelectionManager = this.$manager;
            C19862q<C19861p<? super C1302d, ? super Integer, C19394m>, C1302d, Integer, C19394m> qVar2 = qVar;
            boolean z = this.$showHandleAndMagnifier;
            final boolean z2 = this.$readOnly;
            C19857l<C2021q, C19394m> lVar = this.$onTextLayout;
            C09011 r0 = r3;
            final TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
            final boolean z3 = z;
            final C19857l<C2021q, C19394m> lVar2 = lVar;
            C09011 r3 = new C19861p<C1302d, Integer, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1302d) obj, ((Number) obj2).intValue());
                    return C19394m.f43287a;
                }

                public final void invoke(C1302d dVar, int i) {
                    C1436d dVar2;
                    if ((i & 11) != 2 || !dVar.mo5442i()) {
                        C1436d.C1437a aVar = C1436d.C1437a.f3125b;
                        int i2 = i2;
                        C2023s sVar = sVar;
                        C19383o.m32797g(sVar, "textStyle");
                        C1436d a = ComposedModifierKt.m3049a(aVar, InspectableValueKt.f4032a, new MaxLinesHeightModifierKt$maxLinesHeight$2(i2, sVar));
                        TextFieldScrollerPosition textFieldScrollerPosition = textFieldScrollerPosition;
                        TextFieldValue textFieldValue = textFieldValue;
                        C2006x xVar = xVar;
                        CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1 coreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1 = new CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1(textFieldState);
                        C19383o.m32797g(a, "<this>");
                        C19383o.m32797g(textFieldScrollerPosition, "scrollerPosition");
                        C19383o.m32797g(textFieldValue, "textFieldValue");
                        C19383o.m32797g(xVar, "visualTransformation");
                        Orientation orientation = (Orientation) textFieldScrollerPosition.f1943e.getValue();
                        long j = textFieldValue.f4449b;
                        int i3 = C2022r.f4596c;
                        int i4 = (int) (j >> 32);
                        if (i4 == ((int) (textFieldScrollerPosition.f1942d >> 32))) {
                            if (C2022r.m4464c(j) != C2022r.m4464c(textFieldScrollerPosition.f1942d)) {
                                i4 = C2022r.m4464c(j);
                            } else {
                                i4 = C2022r.m4466e(j);
                            }
                        }
                        textFieldScrollerPosition.f1942d = textFieldValue.f4449b;
                        C1913a aVar2 = textFieldValue.f4448a;
                        C19383o.m32797g(aVar2, "text");
                        C2005w wVar = new C2005w(aVar2, C1994n.C1995a.f4512a);
                        int i5 = C0962p.C0963a.f2035a[orientation.ordinal()];
                        if (i5 == 1) {
                            dVar2 = new VerticalScrollLayoutModifier(textFieldScrollerPosition, i4, wVar, coreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1);
                        } else if (i5 == 2) {
                            dVar2 = new HorizontalScrollLayoutModifier(textFieldScrollerPosition, i4, wVar, coreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1);
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        C1436d i0 = C19543e0.m33287C(a).mo6148i0(dVar2).mo6148i0(dVar3).mo6148i0(dVar4);
                        C2023s sVar2 = sVar;
                        C19383o.m32797g(i0, "<this>");
                        C19383o.m32797g(sVar2, "style");
                        C1436d a2 = BringIntoViewRequesterKt.m1931a(ComposedModifierKt.m3049a(i0, InspectableValueKt.f4032a, new TextFieldSizeKt$textFieldMinSize$1(sVar2)).mo6148i0(dVar5).mo6148i0(dVar6), dVar7);
                        final TextFieldSelectionManager textFieldSelectionManager = textFieldSelectionManager2;
                        final TextFieldState textFieldState = textFieldState;
                        final boolean z = z3;
                        final boolean z2 = z2;
                        final C19857l<C2021q, C19394m> lVar = lVar2;
                        SimpleLayoutKt.m2034a(a2, C18263b.m30805A(dVar, 19580180, new C19861p<C1302d, Integer, C19394m>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((C1302d) obj, ((Number) obj2).intValue());
                                return C19394m.f43287a;
                            }

                            public final void invoke(C1302d dVar, int i) {
                                C1689j jVar;
                                if ((i & 11) != 2 || !dVar.mo5442i()) {
                                    final TextFieldState textFieldState = textFieldState;
                                    final C19857l<C2021q, C19394m> lVar = lVar;
                                    C09032 r8 = new C1711v() {
                                        /* renamed from: a */
                                        public final int mo3259a(LayoutNode.C1725f fVar, List list, int i) {
                                            C19383o.m32797g(fVar, "<this>");
                                            textFieldState.f1944a.mo4576b(fVar.f3844b.f3834s);
                                            MultiParagraphIntrinsics multiParagraphIntrinsics = textFieldState.f1944a.f2021i;
                                            if (multiParagraphIntrinsics != null) {
                                                return (int) ((float) Math.ceil((double) multiParagraphIntrinsics.mo7364b()));
                                            }
                                            throw new IllegalStateException("layoutIntrinsics must be called first");
                                        }

                                        /* renamed from: b */
                                        public final C1712w mo3260b(C1713x xVar, List<? extends C1710u> list, long j) {
                                            C1385f i;
                                            C19383o.m32797g(xVar, "$this$measure");
                                            C19383o.m32797g(list, "measurables");
                                            TextFieldState textFieldState = textFieldState;
                                            C2021q qVar = null;
                                            C1385f g = SnapshotKt.m2908g((C1385f) SnapshotKt.f2988b.mo5886c(), (C19857l<Object, C19394m>) null, false);
                                            try {
                                                i = g.mo6001i();
                                                C0965r c = textFieldState.mo4562c();
                                                if (c != null) {
                                                    qVar = c.f2042a;
                                                }
                                                C1385f.m2974o(i);
                                                g.mo5930c();
                                                C0957k kVar = textFieldState.f1944a;
                                                LayoutDirection layoutDirection = xVar.getLayoutDirection();
                                                C19383o.m32797g(kVar, "textDelegate");
                                                C19383o.m32797g(layoutDirection, "layoutDirection");
                                                C2021q a = kVar.mo4575a(j, layoutDirection, qVar);
                                                Triple triple = new Triple(Integer.valueOf((int) (a.f4591c >> 32)), Integer.valueOf(C7290i.m13995b(a.f4591c)), a);
                                                int intValue = ((Number) triple.component1()).intValue();
                                                int intValue2 = ((Number) triple.component2()).intValue();
                                                C2021q qVar2 = (C2021q) triple.component3();
                                                if (!C19383o.m32792b(qVar, qVar2)) {
                                                    TextFieldState textFieldState2 = textFieldState;
                                                    textFieldState2.f1950g.setValue(new C0965r(qVar2));
                                                    lVar.invoke(qVar2);
                                                }
                                                return xVar.mo4387Z(intValue, intValue2, C19294b0.m32562s0(new Pair(AlignmentLineKt.f3694a, Integer.valueOf(C7279a.m13954l(qVar2.f4592d))), new Pair(AlignmentLineKt.f3695b, Integer.valueOf(C7279a.m13954l(qVar2.f4593e)))), CoreTextFieldKt$CoreTextField$5$1$1$2$measure$1.INSTANCE);
                                            } catch (Throwable th) {
                                                g.mo5930c();
                                                throw th;
                                            }
                                        }
                                    };
                                    dVar.mo5465u(-1323940314);
                                    C1436d.C1437a aVar = C1436d.C1437a.f3125b;
                                    C7282b bVar = (C7282b) dVar.mo5410J(CompositionLocalsKt.f4019e);
                                    LayoutDirection layoutDirection = (LayoutDirection) dVar.mo5410J(CompositionLocalsKt.f4025k);
                                    C1843j1 j1Var = (C1843j1) dVar.mo5410J(CompositionLocalsKt.f4029o);
                                    ComposeUiNode.f3776c0.getClass();
                                    C19846a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f3778b;
                                    ComposableLambdaImpl a = C1700o.m3617a(aVar);
                                    if (dVar.mo5446k() instanceof C1299c) {
                                        dVar.mo5392A();
                                        if (dVar.mo5436f()) {
                                            dVar.mo5450m(aVar2);
                                        } else {
                                            dVar.mo5452n();
                                        }
                                        dVar.mo5394B();
                                        Updater.m2571b(dVar, r8, ComposeUiNode.Companion.f3781e);
                                        Updater.m2571b(dVar, bVar, ComposeUiNode.Companion.f3780d);
                                        Updater.m2571b(dVar, layoutDirection, ComposeUiNode.Companion.f3782f);
                                        boolean z = false;
                                        a.invoke(C0073e.m204d(dVar, j1Var, ComposeUiNode.Companion.f3783g, dVar), dVar, 0);
                                        dVar.mo5465u(2058660585);
                                        dVar.mo5465u(1714611517);
                                        dVar.mo5406H();
                                        dVar.mo5406H();
                                        dVar.mo5456p();
                                        dVar.mo5406H();
                                        TextFieldSelectionManager textFieldSelectionManager = textFieldSelectionManager;
                                        if (textFieldState.mo4560a() == HandleState.Selection && (jVar = textFieldState.f1949f) != null && jVar.mo6685c() && z) {
                                            z = true;
                                        }
                                        CoreTextFieldKt.m1960d(textFieldSelectionManager, z, dVar, 8);
                                        if (textFieldState.mo4560a() == HandleState.Cursor && !z2 && z) {
                                            CoreTextFieldKt.m1959c(textFieldSelectionManager, dVar, 8);
                                            return;
                                        }
                                        return;
                                    }
                                    C0005b.m45j0();
                                    throw null;
                                }
                                dVar.mo5396C();
                            }
                        }), dVar, 48, 0);
                        return;
                    }
                    dVar.mo5396C();
                }
            };
            C1302d dVar8 = dVar;
            qVar2.invoke(C18263b.m30805A(dVar8, 207445534, r0), dVar8, Integer.valueOf(((this.$$dirty1 >> 9) & 112) | 6));
            return;
        }
        dVar.mo5396C();
    }
}
