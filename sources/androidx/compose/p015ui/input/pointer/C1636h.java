package androidx.compose.p015ui.input.pointer;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import java.util.ArrayList;

/* renamed from: androidx.compose.ui.input.pointer.h */
public final class C1636h {

    /* renamed from: a */
    public long f3635a;

    /* renamed from: b */
    public final SparseLongArray f3636b = new SparseLongArray();

    /* renamed from: c */
    public final SparseBooleanArray f3637c = new SparseBooleanArray();

    /* renamed from: d */
    public final ArrayList f3638d = new ArrayList();

    /* renamed from: e */
    public int f3639e = -1;

    /* renamed from: f */
    public int f3640f = -1;

    /* JADX WARNING: Removed duplicated region for block: B:68:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01d9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p015ui.input.pointer.C1647r mo6600a(android.view.MotionEvent r35, androidx.compose.p015ui.input.pointer.C1654y r36) {
        /*
            r34 = this;
            r0 = r34
            r1 = r35
            r2 = r36
            java.lang.String r3 = "motionEvent"
            kotlin.jvm.internal.C19383o.m32797g(r1, r3)
            java.lang.String r3 = "positionCalculator"
            kotlin.jvm.internal.C19383o.m32797g(r2, r3)
            int r3 = r35.getActionMasked()
            r4 = 3
            if (r3 != r4) goto L_0x0023
            android.util.SparseLongArray r1 = r0.f3636b
            r1.clear()
            android.util.SparseBooleanArray r1 = r0.f3637c
            r1.clear()
            r1 = 0
            return r1
        L_0x0023:
            int r5 = r35.getPointerCount()
            r6 = 0
            r7 = 1
            if (r5 == r7) goto L_0x002c
            goto L_0x004a
        L_0x002c:
            int r5 = r1.getToolType(r6)
            int r8 = r35.getSource()
            int r9 = r0.f3639e
            if (r5 != r9) goto L_0x003c
            int r9 = r0.f3640f
            if (r8 == r9) goto L_0x004a
        L_0x003c:
            r0.f3639e = r5
            r0.f3640f = r8
            android.util.SparseBooleanArray r5 = r0.f3637c
            r5.clear()
            android.util.SparseLongArray r5 = r0.f3636b
            r5.clear()
        L_0x004a:
            int r5 = r35.getActionMasked()
            r8 = 1
            r10 = 9
            if (r5 == 0) goto L_0x0072
            r11 = 5
            if (r5 == r11) goto L_0x0072
            if (r5 == r10) goto L_0x005a
            goto L_0x0099
        L_0x005a:
            int r5 = r1.getPointerId(r6)
            android.util.SparseLongArray r11 = r0.f3636b
            int r11 = r11.indexOfKey(r5)
            if (r11 >= 0) goto L_0x0099
            android.util.SparseLongArray r11 = r0.f3636b
            long r12 = r0.f3635a
            long r14 = r12 + r8
            r0.f3635a = r14
            r11.put(r5, r12)
            goto L_0x0099
        L_0x0072:
            int r5 = r35.getActionIndex()
            int r11 = r1.getPointerId(r5)
            android.util.SparseLongArray r12 = r0.f3636b
            int r12 = r12.indexOfKey(r11)
            if (r12 >= 0) goto L_0x0099
            android.util.SparseLongArray r12 = r0.f3636b
            long r13 = r0.f3635a
            long r6 = r8 + r13
            r0.f3635a = r6
            r12.put(r11, r13)
            int r5 = r1.getToolType(r5)
            if (r5 != r4) goto L_0x0099
            android.util.SparseBooleanArray r5 = r0.f3637c
            r6 = 1
            r5.put(r11, r6)
        L_0x0099:
            r5 = 10
            if (r3 == r5) goto L_0x00a5
            r6 = 7
            if (r3 == r6) goto L_0x00a5
            if (r3 != r10) goto L_0x00a3
            goto L_0x00a5
        L_0x00a3:
            r6 = 0
            goto L_0x00a6
        L_0x00a5:
            r6 = 1
        L_0x00a6:
            r7 = 8
            if (r3 != r7) goto L_0x00ac
            r11 = 1
            goto L_0x00ad
        L_0x00ac:
            r11 = 0
        L_0x00ad:
            if (r6 == 0) goto L_0x00be
            int r12 = r35.getActionIndex()
            int r12 = r1.getPointerId(r12)
            android.util.SparseBooleanArray r13 = r0.f3637c
            r14 = 1
            r13.put(r12, r14)
            goto L_0x00bf
        L_0x00be:
            r14 = 1
        L_0x00bf:
            r12 = 6
            if (r3 == r14) goto L_0x00cb
            if (r3 == r12) goto L_0x00c6
            r3 = -1
            goto L_0x00cc
        L_0x00c6:
            int r3 = r35.getActionIndex()
            goto L_0x00cc
        L_0x00cb:
            r3 = 0
        L_0x00cc:
            java.util.ArrayList r14 = r0.f3638d
            r14.clear()
            int r14 = r35.getPointerCount()
            r15 = 0
        L_0x00d6:
            if (r15 >= r14) goto L_0x020a
            java.util.ArrayList r13 = r0.f3638d
            if (r6 != 0) goto L_0x00e9
            if (r15 == r3) goto L_0x00e9
            if (r11 == 0) goto L_0x00e6
            int r16 = r35.getButtonState()
            if (r16 == 0) goto L_0x00e9
        L_0x00e6:
            r26 = 1
            goto L_0x00eb
        L_0x00e9:
            r26 = 0
        L_0x00eb:
            int r12 = r1.getPointerId(r15)
            android.util.SparseLongArray r10 = r0.f3636b
            int r10 = r10.indexOfKey(r12)
            if (r10 < 0) goto L_0x0104
            android.util.SparseLongArray r12 = r0.f3636b
            long r17 = r12.valueAt(r10)
            r32 = r6
            r33 = r11
            r18 = r17
            goto L_0x0115
        L_0x0104:
            r32 = r6
            long r5 = r0.f3635a
            r33 = r11
            long r10 = r5 + r8
            r0.f3635a = r10
            android.util.SparseLongArray r10 = r0.f3636b
            r10.put(r12, r5)
            r18 = r5
        L_0x0115:
            float r5 = r1.getX(r15)
            float r6 = r1.getY(r15)
            long r5 = kotlin.reflect.C19421p.m32952q(r5, r6)
            if (r15 != 0) goto L_0x0134
            float r5 = r35.getRawX()
            float r6 = r35.getRawY()
            long r5 = kotlin.reflect.C19421p.m32952q(r5, r6)
            long r10 = r2.m34775screenToLocalMKHz9U(r5)
            goto L_0x0144
        L_0x0134:
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 29
            if (r10 < r11) goto L_0x0149
            androidx.compose.ui.input.pointer.i r5 = androidx.compose.p015ui.input.pointer.C1637i.f3641a
            long r5 = r5.mo6601a(r1, r15)
            long r10 = r2.m34775screenToLocalMKHz9U(r5)
        L_0x0144:
            r22 = r5
            r24 = r10
            goto L_0x0151
        L_0x0149:
            long r10 = r2.m34774localToScreenMKHz9U(r5)
            r24 = r5
            r22 = r10
        L_0x0151:
            int r5 = r1.getToolType(r15)
            r6 = 4
            r10 = 2
            if (r5 == 0) goto L_0x016f
            r11 = 1
            if (r5 == r11) goto L_0x016c
            if (r5 == r10) goto L_0x0169
            if (r5 == r4) goto L_0x0166
            if (r5 == r6) goto L_0x0163
            goto L_0x016f
        L_0x0163:
            r27 = r6
            goto L_0x0171
        L_0x0166:
            r27 = r10
            goto L_0x0171
        L_0x0169:
            r27 = r4
            goto L_0x0171
        L_0x016c:
            r27 = 1
            goto L_0x0171
        L_0x016f:
            r27 = 0
        L_0x0171:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r6 = r35.getHistorySize()
            r10 = 0
        L_0x017b:
            if (r10 >= r6) goto L_0x01c1
            float r11 = r1.getHistoricalX(r15, r10)
            float r12 = r1.getHistoricalY(r15, r10)
            boolean r20 = java.lang.Float.isInfinite(r11)
            if (r20 != 0) goto L_0x0194
            boolean r20 = java.lang.Float.isNaN(r11)
            if (r20 != 0) goto L_0x0194
            r20 = 1
            goto L_0x0196
        L_0x0194:
            r20 = 0
        L_0x0196:
            if (r20 == 0) goto L_0x01bb
            boolean r20 = java.lang.Float.isInfinite(r12)
            if (r20 != 0) goto L_0x01a7
            boolean r20 = java.lang.Float.isNaN(r12)
            if (r20 != 0) goto L_0x01a7
            r20 = 1
            goto L_0x01a9
        L_0x01a7:
            r20 = 0
        L_0x01a9:
            if (r20 == 0) goto L_0x01bb
            androidx.compose.ui.input.pointer.e r4 = new androidx.compose.ui.input.pointer.e
            long r8 = r1.getHistoricalEventTime(r10)
            long r11 = kotlin.reflect.C19421p.m32952q(r11, r12)
            r4.<init>(r8, r11)
            r5.add(r4)
        L_0x01bb:
            int r10 = r10 + 1
            r4 = 3
            r8 = 1
            goto L_0x017b
        L_0x01c1:
            int r4 = r35.getActionMasked()
            if (r4 != r7) goto L_0x01d9
            r4 = 10
            float r6 = r1.getAxisValue(r4)
            r8 = 9
            float r9 = r1.getAxisValue(r8)
            float r9 = -r9
            long r9 = kotlin.reflect.C19421p.m32952q(r6, r9)
            goto L_0x01df
        L_0x01d9:
            r4 = 10
            r8 = 9
            long r9 = p288y.C8343c.f18295b
        L_0x01df:
            r30 = r9
            android.util.SparseBooleanArray r6 = r0.f3637c
            int r9 = r1.getPointerId(r15)
            r10 = 0
            boolean r28 = r6.get(r9, r10)
            androidx.compose.ui.input.pointer.s r9 = new androidx.compose.ui.input.pointer.s
            long r20 = r35.getEventTime()
            r17 = r9
            r29 = r5
            r17.<init>(r18, r20, r22, r24, r26, r27, r28, r29, r30)
            r13.add(r9)
            int r15 = r15 + 1
            r5 = r4
            r10 = r8
            r6 = r32
            r11 = r33
            r4 = 3
            r8 = 1
            r12 = 6
            goto L_0x00d6
        L_0x020a:
            int r2 = r35.getActionMasked()
            r3 = 1
            if (r2 == r3) goto L_0x0216
            r3 = 6
            if (r2 == r3) goto L_0x0216
            r6 = 0
            goto L_0x0231
        L_0x0216:
            int r2 = r35.getActionIndex()
            int r2 = r1.getPointerId(r2)
            android.util.SparseBooleanArray r3 = r0.f3637c
            r6 = 0
            boolean r3 = r3.get(r2, r6)
            if (r3 != 0) goto L_0x0231
            android.util.SparseLongArray r3 = r0.f3636b
            r3.delete(r2)
            android.util.SparseBooleanArray r3 = r0.f3637c
            r3.delete(r2)
        L_0x0231:
            android.util.SparseLongArray r2 = r0.f3636b
            int r2 = r2.size()
            int r3 = r35.getPointerCount()
            if (r2 <= r3) goto L_0x0270
            android.util.SparseLongArray r2 = r0.f3636b
            int r2 = r2.size()
            r3 = 1
            int r2 = r2 - r3
            r4 = -1
        L_0x0246:
            if (r4 >= r2) goto L_0x0270
            android.util.SparseLongArray r5 = r0.f3636b
            int r5 = r5.keyAt(r2)
            int r7 = r35.getPointerCount()
            r8 = r6
        L_0x0253:
            if (r8 >= r7) goto L_0x0260
            int r9 = r1.getPointerId(r8)
            if (r9 != r5) goto L_0x025d
            r7 = r3
            goto L_0x0261
        L_0x025d:
            int r8 = r8 + 1
            goto L_0x0253
        L_0x0260:
            r7 = r6
        L_0x0261:
            if (r7 != 0) goto L_0x026d
            android.util.SparseLongArray r7 = r0.f3636b
            r7.removeAt(r2)
            android.util.SparseBooleanArray r7 = r0.f3637c
            r7.delete(r5)
        L_0x026d:
            int r2 = r2 + -1
            goto L_0x0246
        L_0x0270:
            androidx.compose.ui.input.pointer.r r2 = new androidx.compose.ui.input.pointer.r
            r35.getEventTime()
            java.util.ArrayList r3 = r0.f3638d
            r2.<init>(r3, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.input.pointer.C1636h.mo6600a(android.view.MotionEvent, androidx.compose.ui.input.pointer.y):androidx.compose.ui.input.pointer.r");
    }
}
