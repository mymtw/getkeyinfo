package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.p015ui.input.pointer.C1652w;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

public final class TextSelectionMouseDetectorKt {
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public static final java.lang.Object m2059a(androidx.compose.p015ui.input.pointer.C1631c r10, kotlin.coroutines.C19340c r11) {
        /*
            boolean r0 = r11 instanceof androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1 r0 = (androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1 r0 = new androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1
            r0.<init>(r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r10 = r0.L$0
            androidx.compose.ui.input.pointer.c r10 = (androidx.compose.p015ui.input.pointer.C1631c) r10
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            goto L_0x0043
        L_0x002b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0033:
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
        L_0x0036:
            androidx.compose.ui.input.pointer.PointerEventPass r11 = androidx.compose.p015ui.input.pointer.PointerEventPass.Main
            r0.L$0 = r10
            r0.label = r3
            java.lang.Object r11 = r10.mo6568f0(r11, r0)
            if (r11 != r1) goto L_0x0043
            goto L_0x007d
        L_0x0043:
            androidx.compose.ui.input.pointer.l r11 = (androidx.compose.p015ui.input.pointer.C1640l) r11
            int r2 = r11.f3653c
            r2 = r2 & 33
            r4 = 0
            if (r2 == 0) goto L_0x004e
            r2 = r3
            goto L_0x004f
        L_0x004e:
            r2 = r4
        L_0x004f:
            if (r2 == 0) goto L_0x0036
            java.util.List<androidx.compose.ui.input.pointer.p> r2 = r11.f3651a
            int r5 = r2.size()
            r6 = r4
        L_0x0058:
            if (r6 >= r5) goto L_0x0079
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.p r7 = (androidx.compose.p015ui.input.pointer.C1644p) r7
            int r8 = r7.f3663h
            r9 = 2
            if (r8 != r9) goto L_0x0067
            r8 = r3
            goto L_0x0068
        L_0x0067:
            r8 = r4
        L_0x0068:
            if (r8 == 0) goto L_0x0072
            boolean r7 = com.google.android.play.core.appupdate.C15562d.m25203s(r7)
            if (r7 == 0) goto L_0x0072
            r7 = r3
            goto L_0x0073
        L_0x0072:
            r7 = r4
        L_0x0073:
            if (r7 != 0) goto L_0x0076
            goto L_0x007a
        L_0x0076:
            int r6 = r6 + 1
            goto L_0x0058
        L_0x0079:
            r4 = r3
        L_0x007a:
            if (r4 == 0) goto L_0x0036
            r1 = r11
        L_0x007d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt.m2059a(androidx.compose.ui.input.pointer.c, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: b */
    public static final Object m2060b(C1652w wVar, C1008d dVar, C19340c<? super C19394m> cVar) {
        Object b = ForEachGestureKt.m1378b(wVar, new TextSelectionMouseDetectorKt$mouseSelectionDetector$2(dVar, (C19340c<? super TextSelectionMouseDetectorKt$mouseSelectionDetector$2>) null), cVar);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : C19394m.f43287a;
    }
}
