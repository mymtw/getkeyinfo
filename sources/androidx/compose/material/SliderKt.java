package androidx.compose.material;

import android.support.p013v4.media.session.C0087d;
import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.core.C0433j0;
import androidx.compose.animation.core.C0448r;
import androidx.compose.foundation.C0870o;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0733f;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ripple.C1244j;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.draw.C1448j;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.semantics.SemanticsModifierKt;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1345l1;
import androidx.compose.runtime.C1415u;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.ArrayList;
import java.util.List;
import kotlin.C19394m;
import kotlin.collections.EmptyList;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19543e0;
import p001a0.C0005b;
import p174m0.C7282b;
import p202p.C7644f;
import p202p.C7645g;
import p504ai.C13983i;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;
import p764pq.C20053e;

public final class SliderKt {

    /* renamed from: a */
    public static final float f2258a = ((float) 10);

    /* renamed from: b */
    public static final float f2259b = ((float) 24);

    /* renamed from: c */
    public static final float f2260c = ((float) 1);

    /* renamed from: d */
    public static final float f2261d = ((float) 6);

    /* renamed from: e */
    public static final float f2262e = ((float) 4);

    /* renamed from: f */
    public static final C1436d f2263f = SizeKt.m1489i(SizeKt.m1496p(C1436d.C1437a.f3125b, (float) 144, 0.0f, 2), 0.0f, (float) 48, 1);

    /* renamed from: g */
    public static final C0433j0<Float> f2264g = new C0433j0<>(100, (C0448r) null, 6);

    /* renamed from: a */
    public static final void m2212a(C0733f fVar, C1436d dVar, float f, C0640j jVar, C1228r1 r1Var, boolean z, float f2, C1302d dVar2, int i) {
        int i2;
        C0733f fVar2 = fVar;
        C1436d dVar3 = dVar;
        C0640j jVar2 = jVar;
        C1228r1 r1Var2 = r1Var;
        boolean z2 = z;
        float f3 = f2;
        int i3 = i;
        ComposerImpl h = dVar2.mo5440h(428907178);
        if ((i3 & 14) == 0) {
            i2 = (h.mo5408I(fVar2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= h.mo5408I(dVar3) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i2 |= h.mo5428b(f) ? 256 : 128;
        } else {
            float f4 = f;
        }
        if ((i3 & 7168) == 0) {
            i2 |= h.mo5408I(jVar2) ? RecyclerView.C3084b0.FLAG_MOVED : RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE;
        }
        if ((57344 & i3) == 0) {
            i2 |= h.mo5408I(r1Var2) ? PrimitiveArrayBuilder.SMALL_CHUNK_SIZE : 8192;
        }
        if ((458752 & i3) == 0) {
            i2 |= h.mo5427a(z2) ? 131072 : 65536;
        }
        if ((3670016 & i3) == 0) {
            i2 |= h.mo5428b(f3) ? 1048576 : 524288;
        }
        if ((i2 & 2995931) != 599186 || !h.mo5442i()) {
            C1436d g = fVar2.mo4116g(C15588c1.m25287J0(C1436d.C1437a.f3125b, f, 0.0f, 0.0f, 0.0f, 14), C1428a.C1429a.f3107c);
            h.mo5465u(733328855);
            C1711v c = BoxKt.m1457c(C1428a.C1429a.f3105a, false, h);
            h.mo5465u(-1323940314);
            C7282b bVar = (C7282b) h.mo5410J(CompositionLocalsKt.f4019e);
            LayoutDirection layoutDirection = (LayoutDirection) h.mo5410J(CompositionLocalsKt.f4025k);
            C1843j1 j1Var = (C1843j1) h.mo5410J(CompositionLocalsKt.f4029o);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a = C1700o.m3617a(g);
            if (h.f2715a instanceof C1299c) {
                h.mo5392A();
                if (h.f2702K) {
                    h.mo5450m(aVar);
                } else {
                    h.mo5452n();
                }
                h.f2738x = false;
                Updater.m2571b(h, c, ComposeUiNode.Companion.f3781e);
                Updater.m2571b(h, bVar, ComposeUiNode.Companion.f3780d);
                Updater.m2571b(h, layoutDirection, ComposeUiNode.Companion.f3782f);
                C0326j.m868m(0, a, C13983i.m21490i(h, j1Var, ComposeUiNode.Companion.f3783g, h), h, 2058660585, -2137368960);
                h.mo5465u(-587645648);
                h.mo5465u(-492369756);
                Object c0 = h.mo5431c0();
                C1302d.C1303a.C1304a aVar2 = C1302d.C1303a.f2828a;
                if (c0 == aVar2) {
                    c0 = new SnapshotStateList();
                    h.mo5407H0(c0);
                }
                h.mo5418R(false);
                SnapshotStateList snapshotStateList = (SnapshotStateList) c0;
                h.mo5465u(511388516);
                boolean I = h.mo5408I(jVar2) | h.mo5408I(snapshotStateList);
                Object c02 = h.mo5431c0();
                if (I || c02 == aVar2) {
                    c02 = new SliderKt$SliderThumb$1$1$1(jVar2, snapshotStateList, (C19340c<? super SliderKt$SliderThumb$1$1$1>) null);
                    h.mo5407H0(c02);
                }
                h.mo5418R(false);
                C1415u.m3031e(jVar2, (C19861p) c02, h);
                float f5 = snapshotStateList.isEmpty() ^ true ? f2261d : f2260c;
                C1436d a2 = C0870o.m1926a(jVar2, IndicationKt.m1310a(SizeKt.m1493m(dVar3, f3, f3), jVar2, C1244j.m2369a(false, f2259b, 0, h, 54, 4)), true);
                if (!z2) {
                    f5 = (float) 0;
                }
                C7644f fVar3 = C7645g.f16941a;
                C15588c1.m25324f(C0761x.m1655A(C1448j.m3094a(a2, f5, fVar3, 24), ((C1545s) r1Var2.mo5246b(z2, h).getValue()).f3366a, fVar3), h, 0);
                h.mo5418R(false);
                h.mo5418R(false);
                h.mo5418R(false);
                h.mo5418R(true);
                h.mo5418R(false);
                h.mo5418R(false);
            } else {
                C0005b.m45j0();
                throw null;
            }
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new SliderKt$SliderThumb$2(fVar, dVar, f, jVar, r1Var, z, f2, i);
        }
    }

    /* renamed from: b */
    public static final void m2213b(C1436d dVar, C1228r1 r1Var, boolean z, float f, float f2, List<Float> list, float f3, float f4, C1302d dVar2, int i) {
        C1228r1 r1Var2 = r1Var;
        boolean z2 = z;
        ComposerImpl h = dVar2.mo5440h(1833126050);
        C1436d dVar3 = dVar;
        CanvasKt.m1294a(dVar, new SliderKt$Track$1(f3, r1Var.mo5245a(z2, false, h), f4, f2, f, r1Var.mo5245a(z2, true, h), list, r1Var.mo5247c(z2, false, h), r1Var.mo5247c(z2, true, h)), h, i & 14);
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new SliderKt$Track$2(dVar, r1Var, z, f, f2, list, f3, f4, i);
        }
    }

    /* renamed from: c */
    public static final void m2214c(C19857l lVar, C20053e eVar, C20053e eVar2, C1338j0 j0Var, float f, C1302d dVar, int i) {
        int i2;
        C19857l lVar2 = lVar;
        C20053e eVar3 = eVar;
        C20053e eVar4 = eVar2;
        C1338j0 j0Var2 = j0Var;
        int i3 = i;
        ComposerImpl h = dVar.mo5440h(-743965752);
        if ((i3 & 14) == 0) {
            i2 = (h.mo5408I(lVar) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= h.mo5408I(eVar3) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i2 |= h.mo5408I(eVar4) ? 256 : 128;
        }
        if ((i3 & 7168) == 0) {
            i2 |= h.mo5408I(j0Var2) ? RecyclerView.C3084b0.FLAG_MOVED : RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE;
        }
        float f2 = f;
        if ((57344 & i3) == 0) {
            i2 |= h.mo5428b(f2) ? PrimitiveArrayBuilder.SMALL_CHUNK_SIZE : 8192;
        }
        if ((i2 & 46811) != 9362 || !h.mo5442i()) {
            Object[] objArr = {eVar3, lVar2, Float.valueOf(f), j0Var2, eVar4};
            h.mo5465u(-568225417);
            boolean z = false;
            for (int i4 = 0; i4 < 5; i4++) {
                z |= h.mo5408I(objArr[i4]);
            }
            Object c0 = h.mo5431c0();
            if (z || c0 == C1302d.C1303a.f2828a) {
                SliderKt$CorrectValueSideEffect$1$1 sliderKt$CorrectValueSideEffect$1$1 = new SliderKt$CorrectValueSideEffect$1$1(eVar, lVar, f, j0Var, eVar2);
                h.mo5407H0(sliderKt$CorrectValueSideEffect$1$1);
                c0 = sliderKt$CorrectValueSideEffect$1$1;
            }
            h.mo5418R(false);
            C1415u.m3033g((C19846a) c0, h);
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new SliderKt$CorrectValueSideEffect$2(lVar, eVar, eVar2, j0Var, f, i);
        }
    }

    /* renamed from: d */
    public static final void m2215d(boolean z, float f, float f2, List list, C1228r1 r1Var, float f3, C0640j jVar, C0640j jVar2, C1436d dVar, C1436d dVar2, C1436d dVar3, C1302d dVar4, int i, int i2) {
        ComposerImpl h = dVar4.mo5440h(-278895713);
        String K = C1993m.m4350K(5, h);
        String K2 = C1993m.m4350K(6, h);
        C1436d i0 = dVar.mo6148i0(f2263f);
        h.mo5465u(733328855);
        C1711v c = BoxKt.m1457c(C1428a.C1429a.f3105a, false, h);
        h.mo5465u(-1323940314);
        C1345l1 l1Var = CompositionLocalsKt.f4019e;
        C7282b bVar = (C7282b) h.mo5410J(l1Var);
        LayoutDirection layoutDirection = (LayoutDirection) h.mo5410J(CompositionLocalsKt.f4025k);
        C1843j1 j1Var = (C1843j1) h.mo5410J(CompositionLocalsKt.f4029o);
        ComposeUiNode.f3776c0.getClass();
        C19846a<ComposeUiNode> aVar = ComposeUiNode.Companion.f3778b;
        ComposableLambdaImpl a = C1700o.m3617a(i0);
        if (h.f2715a instanceof C1299c) {
            h.mo5392A();
            if (h.f2702K) {
                h.mo5450m(aVar);
            } else {
                h.mo5452n();
            }
            h.f2738x = false;
            Updater.m2571b(h, c, ComposeUiNode.Companion.f3781e);
            Updater.m2571b(h, bVar, ComposeUiNode.Companion.f3780d);
            Updater.m2571b(h, layoutDirection, ComposeUiNode.Companion.f3782f);
            C0326j.m868m(0, a, C13983i.m21490i(h, j1Var, ComposeUiNode.Companion.f3783g, h), h, 2058660585, -2137368960);
            C19543e0 e0Var = C19543e0.f43489b;
            h.mo5465u(2044256857);
            C7282b bVar2 = (C7282b) h.mo5410J(l1Var);
            float B0 = bVar2.mo3789B0(f2262e);
            float f4 = f2258a;
            float B02 = bVar2.mo3789B0(f4);
            float q = bVar2.mo3798q(f3);
            C19394m mVar = C19394m.f43287a;
            float f5 = f4 * ((float) 2);
            float f6 = q * f;
            float f7 = q * f2;
            C1436d.C1437a aVar2 = C1436d.C1437a.f3125b;
            int i3 = i >> 9;
            int i4 = i << 6;
            int i5 = i3;
            C1436d.C1437a aVar3 = aVar2;
            m2213b(SizeKt.m1486f(e0Var.mo4116g(aVar2, C1428a.C1429a.f3107c)), r1Var, z, f, f2, list, B02, B0, h, 262144 | (i3 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344));
            h.mo5465u(1157296644);
            boolean I = h.mo5408I(K);
            Object c0 = h.mo5431c0();
            if (I || c0 == C1302d.C1303a.f2828a) {
                c0 = new SliderKt$RangeSliderImpl$1$2$1(K);
                h.mo5407H0(c0);
            }
            h.mo5418R(false);
            C1436d.C1437a aVar4 = aVar3;
            int i6 = i & 57344;
            int i7 = (i << 15) & 458752;
            C1436d.C1437a aVar5 = aVar4;
            m2212a(e0Var, FocusableKt.m1305b(jVar, SemanticsModifierKt.m4174a(aVar4, true, (C19857l) c0), true).mo6148i0(dVar2), f6, jVar, r1Var, z, f5, h, (i5 & 7168) | 1572870 | i6 | i7);
            h.mo5465u(1157296644);
            boolean I2 = h.mo5408I(K2);
            Object c02 = h.mo5431c0();
            if (I2 || c02 == C1302d.C1303a.f2828a) {
                c02 = new SliderKt$RangeSliderImpl$1$3$1(K2);
                h.mo5407H0(c02);
            }
            h.mo5418R(false);
            C0640j jVar3 = jVar2;
            m2212a(e0Var, FocusableKt.m1305b(jVar3, SemanticsModifierKt.m4174a(aVar5, true, (C19857l) c02), true).mo6148i0(dVar3), f7, jVar2, r1Var, z, f5, h, 1572870 | ((i >> 12) & 7168) | i6 | i7);
            C0087d.m238h(h, false, false, false, true);
            h.mo5418R(false);
            h.mo5418R(false);
            C1418v0 U = h.mo5421U();
            if (U != null) {
                U.f3081d = new SliderKt$RangeSliderImpl$2(z, f, f2, list, r1Var, f3, jVar, jVar2, dVar, dVar2, dVar3, i, i2);
                return;
            }
            return;
        }
        C0005b.m45j0();
        throw null;
    }

    /* renamed from: e */
    public static final void m2216e(boolean z, float f, List list, C1228r1 r1Var, float f2, C0640j jVar, C1436d dVar, C1302d dVar2, int i) {
        ComposerImpl h = dVar2.mo5440h(1679682785);
        C1436d i0 = dVar.mo6148i0(f2263f);
        h.mo5465u(733328855);
        C1711v c = BoxKt.m1457c(C1428a.C1429a.f3105a, false, h);
        h.mo5465u(-1323940314);
        C1345l1 l1Var = CompositionLocalsKt.f4019e;
        C7282b bVar = (C7282b) h.mo5410J(l1Var);
        LayoutDirection layoutDirection = (LayoutDirection) h.mo5410J(CompositionLocalsKt.f4025k);
        C1843j1 j1Var = (C1843j1) h.mo5410J(CompositionLocalsKt.f4029o);
        ComposeUiNode.f3776c0.getClass();
        C19846a<ComposeUiNode> aVar = ComposeUiNode.Companion.f3778b;
        ComposableLambdaImpl a = C1700o.m3617a(i0);
        if (h.f2715a instanceof C1299c) {
            h.mo5392A();
            if (h.f2702K) {
                h.mo5450m(aVar);
            } else {
                h.mo5452n();
            }
            h.f2738x = false;
            Updater.m2571b(h, c, ComposeUiNode.Companion.f3781e);
            Updater.m2571b(h, bVar, ComposeUiNode.Companion.f3780d);
            Updater.m2571b(h, layoutDirection, ComposeUiNode.Companion.f3782f);
            C0326j.m868m(0, a, C13983i.m21490i(h, j1Var, ComposeUiNode.Companion.f3783g, h), h, 2058660585, -2137368960);
            C19543e0 e0Var = C19543e0.f43489b;
            h.mo5465u(231316251);
            C7282b bVar2 = (C7282b) h.mo5410J(l1Var);
            float B0 = bVar2.mo3789B0(f2262e);
            float f3 = f2258a;
            float B02 = bVar2.mo3789B0(f3);
            float q = bVar2.mo3798q(f2) * f;
            C1436d.C1437a aVar2 = C1436d.C1437a.f3125b;
            int i2 = i >> 6;
            m2213b(SizeKt.m1486f(aVar2), r1Var, z, 0.0f, f, list, B02, B0, h, 265222 | (i2 & 112) | ((i << 6) & 896) | ((i << 9) & 57344));
            m2212a(e0Var, aVar2, q, jVar, r1Var, z, f3 * ((float) 2), h, 1572918 | (i2 & 7168) | ((i << 3) & 57344) | (458752 & (i << 15)));
            C0087d.m238h(h, false, false, false, true);
            h.mo5418R(false);
            h.mo5418R(false);
            C1418v0 U = h.mo5421U();
            if (U != null) {
                U.f3081d = new SliderKt$SliderImpl$2(z, f, list, r1Var, f2, jVar, dVar, i);
                return;
            }
            return;
        }
        C0005b.m45j0();
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.Serializable m2217f(androidx.compose.p015ui.input.pointer.C1631c r8, long r9, int r11, kotlin.coroutines.C19340c r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.material.SliderKt$awaitSlop$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.compose.material.SliderKt$awaitSlop$1 r0 = (androidx.compose.material.SliderKt$awaitSlop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.SliderKt$awaitSlop$1 r0 = new androidx.compose.material.SliderKt$awaitSlop$1
            r0.<init>(r12)
        L_0x0018:
            r6 = r0
            java.lang.Object r12 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L_0x0034
            if (r1 != r2) goto L_0x002c
            java.lang.Object r8 = r6.L$0
            kotlin.jvm.internal.Ref$FloatRef r8 = (kotlin.jvm.internal.Ref$FloatRef) r8
            androidx.compose.foundation.layout.C0761x.m1684O0(r12)
            goto L_0x0052
        L_0x002c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0034:
            androidx.compose.foundation.layout.C0761x.m1684O0(r12)
            kotlin.jvm.internal.Ref$FloatRef r12 = new kotlin.jvm.internal.Ref$FloatRef
            r12.<init>()
            androidx.compose.material.SliderKt$awaitSlop$postPointerSlop$1 r5 = new androidx.compose.material.SliderKt$awaitSlop$postPointerSlop$1
            r5.<init>(r12)
            r6.L$0 = r12
            r6.label = r2
            r1 = r8
            r2 = r9
            r4 = r11
            java.lang.Object r8 = androidx.compose.material.DragGestureDetectorCopyKt.m2177a(r1, r2, r4, r5, r6)
            if (r8 != r0) goto L_0x004f
            goto L_0x0065
        L_0x004f:
            r7 = r12
            r12 = r8
            r8 = r7
        L_0x0052:
            androidx.compose.ui.input.pointer.p r12 = (androidx.compose.p015ui.input.pointer.C1644p) r12
            if (r12 == 0) goto L_0x0063
            float r8 = r8.element
            java.lang.Float r9 = new java.lang.Float
            r9.<init>(r8)
            kotlin.Pair r8 = new kotlin.Pair
            r8.<init>(r12, r9)
            goto L_0x0064
        L_0x0063:
            r8 = 0
        L_0x0064:
            r0 = r8
        L_0x0065:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.m2217f(androidx.compose.ui.input.pointer.c, long, int, kotlin.coroutines.c):java.io.Serializable");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Number} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final float m2218g(float r5, java.util.List r6, float r7, float r8) {
        /*
            java.util.Iterator r6 = r6.iterator()
            boolean r0 = r6.hasNext()
            if (r0 != 0) goto L_0x000c
            r6 = 0
            goto L_0x004b
        L_0x000c:
            java.lang.Object r0 = r6.next()
            boolean r1 = r6.hasNext()
            if (r1 != 0) goto L_0x0018
        L_0x0016:
            r6 = r0
            goto L_0x004b
        L_0x0018:
            r1 = r0
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r1 = com.google.android.play.core.assetpacks.C15588c1.m25354w0(r7, r8, r1)
            float r1 = r1 - r5
            float r1 = java.lang.Math.abs(r1)
        L_0x0028:
            java.lang.Object r2 = r6.next()
            r3 = r2
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            float r3 = com.google.android.play.core.assetpacks.C15588c1.m25354w0(r7, r8, r3)
            float r3 = r3 - r5
            float r3 = java.lang.Math.abs(r3)
            int r4 = java.lang.Float.compare(r1, r3)
            if (r4 <= 0) goto L_0x0044
            r0 = r2
            r1 = r3
        L_0x0044:
            boolean r2 = r6.hasNext()
            if (r2 != 0) goto L_0x0028
            goto L_0x0016
        L_0x004b:
            java.lang.Float r6 = (java.lang.Float) r6
            if (r6 == 0) goto L_0x0057
            float r5 = r6.floatValue()
            float r5 = com.google.android.play.core.assetpacks.C15588c1.m25354w0(r7, r8, r5)
        L_0x0057:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.m2218g(float, java.util.List, float, float):float");
    }

    /* renamed from: h */
    public static final float m2219h(float f, float f2, float f3) {
        float f4 = f2 - f;
        return C19388s.m32831L((f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1)) == 0 ? 0.0f : (f3 - f) / f4, 0.0f, 1.0f);
    }

    /* renamed from: i */
    public static final float m2220i(float f, float f2, float f3, float f4, float f5) {
        return C15588c1.m25354w0(f4, f5, m2219h(f, f2, f3));
    }

    /* renamed from: j */
    public static final C1436d m2221j(C1436d dVar, float f, List<Float> list, boolean z, C19857l<? super Float, C19394m> lVar, C20053e<Float> eVar, int i) {
        return ProgressSemanticsKt.m1314b(SemanticsModifierKt.m4174a(dVar, false, new SliderKt$sliderSemantics$1(z, eVar, i, list, C19388s.m32831L(f, eVar.mo74309c().floatValue(), eVar.mo74311g().floatValue()), lVar)), f, eVar, i);
    }

    /* renamed from: k */
    public static final List<Float> m2222k(int i) {
        if (i == 0) {
            return EmptyList.INSTANCE;
        }
        int i2 = i + 2;
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(Float.valueOf(((float) i3) / ((float) (i + 1))));
        }
        return arrayList;
    }
}
