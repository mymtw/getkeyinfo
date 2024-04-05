package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.text.C2022r;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.saveable.C1365a;
import androidx.compose.runtime.saveable.C1374h;
import kotlin.jvm.internal.C19383o;
import p288y.C8345d;

public final class TextFieldScrollerPosition {

    /* renamed from: f */
    public static final C1374h f1938f = C1365a.m2862a(TextFieldScrollerPosition$Companion$Saver$1.INSTANCE, TextFieldScrollerPosition$Companion$Saver$2.INSTANCE);

    /* renamed from: a */
    public final ParcelableSnapshotMutableState f1939a;

    /* renamed from: b */
    public final ParcelableSnapshotMutableState f1940b;

    /* renamed from: c */
    public C8345d f1941c;

    /* renamed from: d */
    public long f1942d;

    /* renamed from: e */
    public final ParcelableSnapshotMutableState f1943e;

    public TextFieldScrollerPosition(float f, Orientation orientation) {
        C19383o.m32797g(orientation, "initialOrientation");
        this.f1939a = C0761x.m1751w0(Float.valueOf(f), C1351n1.f2948a);
        this.f1940b = C0761x.m1751w0(Float.valueOf(0.0f), C1351n1.f2948a);
        this.f1941c = C8345d.f18300e;
        this.f1942d = C2022r.f4595b;
        this.f1943e = C0761x.m1751w0(orientation, C1351n1.f2948a);
    }

    /* renamed from: a */
    public final float mo4553a() {
        return ((Number) this.f1939a.getValue()).floatValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        if ((r8.f18302b == r1.f18302b) == false) goto L_0x002f;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4554b(androidx.compose.foundation.gestures.Orientation r7, p288y.C8345d r8, int r9, int r10) {
        /*
            r6 = this;
            java.lang.String r0 = "orientation"
            kotlin.jvm.internal.C19383o.m32797g(r7, r0)
            int r10 = r10 - r9
            float r10 = (float) r10
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = r6.f1940b
            java.lang.Float r1 = java.lang.Float.valueOf(r10)
            r0.setValue(r1)
            float r0 = r8.f18301a
            y.d r1 = r6.f1941c
            float r2 = r1.f18301a
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x001e
            r2 = r3
            goto L_0x001f
        L_0x001e:
            r2 = r4
        L_0x001f:
            r5 = 0
            if (r2 == 0) goto L_0x002f
            float r2 = r8.f18302b
            float r1 = r1.f18302b
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x002c
            r1 = r3
            goto L_0x002d
        L_0x002c:
            r1 = r4
        L_0x002d:
            if (r1 != 0) goto L_0x0073
        L_0x002f:
            androidx.compose.foundation.gestures.Orientation r1 = androidx.compose.foundation.gestures.Orientation.Vertical
            if (r7 != r1) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r3 = r4
        L_0x0035:
            if (r3 == 0) goto L_0x0039
            float r0 = r8.f18302b
        L_0x0039:
            if (r3 == 0) goto L_0x003e
            float r7 = r8.f18304d
            goto L_0x0040
        L_0x003e:
            float r7 = r8.f18303c
        L_0x0040:
            float r1 = r6.mo4553a()
            float r9 = (float) r9
            float r2 = r1 + r9
            int r3 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x004c
            goto L_0x0056
        L_0x004c:
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x0058
            float r4 = r7 - r0
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 <= 0) goto L_0x0058
        L_0x0056:
            float r7 = r7 - r2
            goto L_0x0063
        L_0x0058:
            if (r3 >= 0) goto L_0x0062
            float r7 = r7 - r0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 > 0) goto L_0x0062
            float r7 = r0 - r1
            goto L_0x0063
        L_0x0062:
            r7 = r5
        L_0x0063:
            float r9 = r6.mo4553a()
            float r9 = r9 + r7
            androidx.compose.runtime.ParcelableSnapshotMutableState r7 = r6.f1939a
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            r7.setValue(r9)
            r6.f1941c = r8
        L_0x0073:
            float r7 = r6.mo4553a()
            float r7 = kotlin.jvm.internal.C19388s.m32831L(r7, r5, r10)
            androidx.compose.runtime.ParcelableSnapshotMutableState r8 = r6.f1939a
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r8.setValue(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldScrollerPosition.mo4554b(androidx.compose.foundation.gestures.Orientation, y.d, int, int):void");
    }

    public TextFieldScrollerPosition() {
        this(0.0f, Orientation.Vertical);
    }
}
