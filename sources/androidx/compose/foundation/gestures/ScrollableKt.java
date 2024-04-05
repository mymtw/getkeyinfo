package androidx.compose.foundation.gestures;

import androidx.compose.foundation.C1030w;
import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.ComposedModifierKt;
import androidx.compose.p015ui.platform.InspectableValueKt;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p098f0.C6767e;

public final class ScrollableKt {

    /* renamed from: a */
    public static final C0580a f1340a = new C0580a();

    /* renamed from: b */
    public static final C6767e<Boolean> f1341b = C19543e0.m33309b0(ScrollableKt$ModifierLocalScrollableContainer$1.INSTANCE);

    /* renamed from: androidx.compose.foundation.gestures.ScrollableKt$a */
    public static final class C0580a implements C0614l {
        /* renamed from: a */
        public final float mo3737a(float f) {
            return f;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public static final java.lang.Object m1397a(androidx.compose.p015ui.input.pointer.C1631c r5, kotlin.coroutines.C19340c r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1 r0 = (androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1 r0 = new androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.input.pointer.c r5 = (androidx.compose.p015ui.input.pointer.C1631c) r5
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            goto L_0x0041
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
        L_0x0036:
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r5.mo6568f0(androidx.compose.p015ui.input.pointer.PointerEventPass.Main, r0)
            if (r6 != r1) goto L_0x0041
            goto L_0x004e
        L_0x0041:
            androidx.compose.ui.input.pointer.l r6 = (androidx.compose.p015ui.input.pointer.C1640l) r6
            int r2 = r6.f3654d
            r4 = 6
            if (r2 != r4) goto L_0x004a
            r2 = r3
            goto L_0x004b
        L_0x004a:
            r2 = 0
        L_0x004b:
            if (r2 == 0) goto L_0x0036
            r1 = r6
        L_0x004e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt.m1397a(androidx.compose.ui.input.pointer.c, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: b */
    public static final C1436d m1398b(C1436d dVar, C0615m mVar, Orientation orientation, C1030w wVar, boolean z, boolean z2, C0608f fVar, C0640j jVar) {
        C1436d dVar2 = dVar;
        C19383o.m32797g(dVar, "<this>");
        C0615m mVar2 = mVar;
        C19383o.m32797g(mVar, "state");
        Orientation orientation2 = orientation;
        C19383o.m32797g(orientation, "orientation");
        return ComposedModifierKt.m3049a(dVar, InspectableValueKt.f4032a, new ScrollableKt$scrollable$2(orientation, mVar, z2, jVar, fVar, wVar, z));
    }
}
