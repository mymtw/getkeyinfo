package androidx.compose.p015ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.p015ui.input.pointer.PointerInteropFilter;
import androidx.compose.p015ui.layout.C1689j;
import java.util.List;
import kotlin.jvm.internal.C19382n;
import p288y.C8343c;

/* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1 */
public final class PointerInteropFilter$pointerInputFilter$1 extends C1650u {

    /* renamed from: d */
    public PointerInteropFilter.DispatchToViewState f3605d = PointerInteropFilter.DispatchToViewState.Unknown;

    /* renamed from: e */
    public final /* synthetic */ PointerInteropFilter f3606e;

    public PointerInteropFilter$pointerInputFilter$1(PointerInteropFilter pointerInteropFilter) {
        this.f3606e = pointerInteropFilter;
    }

    /* renamed from: S0 */
    public final void mo6548S0() {
        if (this.f3605d == PointerInteropFilter.DispatchToViewState.Dispatching) {
            long uptimeMillis = SystemClock.uptimeMillis();
            PointerInteropFilter$pointerInputFilter$1$onCancel$1 pointerInteropFilter$pointerInputFilter$1$onCancel$1 = new PointerInteropFilter$pointerInputFilter$1$onCancel$1(this.f3606e);
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            obtain.setSource(0);
            pointerInteropFilter$pointerInputFilter$1$onCancel$1.invoke(obtain);
            obtain.recycle();
            this.f3605d = PointerInteropFilter.DispatchToViewState.Unknown;
            this.f3606e.f3603d = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* renamed from: T0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6549T0(androidx.compose.p015ui.input.pointer.C1640l r6, androidx.compose.p015ui.input.pointer.PointerEventPass r7, long r8) {
        /*
            r5 = this;
            java.lang.String r8 = "pass"
            kotlin.jvm.internal.C19383o.m32797g(r7, r8)
            java.util.List<androidx.compose.ui.input.pointer.p> r8 = r6.f3651a
            androidx.compose.ui.input.pointer.PointerInteropFilter r9 = r5.f3606e
            boolean r9 = r9.f3603d
            r0 = 0
            r1 = 1
            if (r9 != 0) goto L_0x0039
            int r9 = r8.size()
            r2 = r0
        L_0x0014:
            if (r2 >= r9) goto L_0x0033
            java.lang.Object r3 = r8.get(r2)
            androidx.compose.ui.input.pointer.p r3 = (androidx.compose.p015ui.input.pointer.C1644p) r3
            boolean r4 = com.google.android.play.core.appupdate.C15562d.m25204t(r3)
            if (r4 != 0) goto L_0x002b
            boolean r3 = com.google.android.play.core.appupdate.C15562d.m25206v(r3)
            if (r3 == 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r3 = r0
            goto L_0x002c
        L_0x002b:
            r3 = r1
        L_0x002c:
            if (r3 == 0) goto L_0x0030
            r9 = r1
            goto L_0x0034
        L_0x0030:
            int r2 = r2 + 1
            goto L_0x0014
        L_0x0033:
            r9 = r0
        L_0x0034:
            if (r9 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r9 = r0
            goto L_0x003a
        L_0x0039:
            r9 = r1
        L_0x003a:
            androidx.compose.ui.input.pointer.PointerInteropFilter$DispatchToViewState r2 = r5.f3605d
            androidx.compose.ui.input.pointer.PointerInteropFilter$DispatchToViewState r3 = androidx.compose.p015ui.input.pointer.PointerInteropFilter.DispatchToViewState.NotDispatching
            if (r2 == r3) goto L_0x0052
            androidx.compose.ui.input.pointer.PointerEventPass r2 = androidx.compose.p015ui.input.pointer.PointerEventPass.Initial
            if (r7 != r2) goto L_0x0049
            if (r9 == 0) goto L_0x0049
            r5.mo6550U0(r6)
        L_0x0049:
            androidx.compose.ui.input.pointer.PointerEventPass r2 = androidx.compose.p015ui.input.pointer.PointerEventPass.Final
            if (r7 != r2) goto L_0x0052
            if (r9 != 0) goto L_0x0052
            r5.mo6550U0(r6)
        L_0x0052:
            androidx.compose.ui.input.pointer.PointerEventPass r6 = androidx.compose.p015ui.input.pointer.PointerEventPass.Final
            if (r7 != r6) goto L_0x0078
            int r6 = r8.size()
            r7 = r0
        L_0x005b:
            if (r7 >= r6) goto L_0x006e
            java.lang.Object r9 = r8.get(r7)
            androidx.compose.ui.input.pointer.p r9 = (androidx.compose.p015ui.input.pointer.C1644p) r9
            boolean r9 = com.google.android.play.core.appupdate.C15562d.m25206v(r9)
            if (r9 != 0) goto L_0x006b
            r1 = r0
            goto L_0x006e
        L_0x006b:
            int r7 = r7 + 1
            goto L_0x005b
        L_0x006e:
            if (r1 == 0) goto L_0x0078
            androidx.compose.ui.input.pointer.PointerInteropFilter$DispatchToViewState r6 = androidx.compose.p015ui.input.pointer.PointerInteropFilter.DispatchToViewState.Unknown
            r5.f3605d = r6
            androidx.compose.ui.input.pointer.PointerInteropFilter r6 = r5.f3606e
            r6.f3603d = r0
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.input.pointer.PointerInteropFilter$pointerInputFilter$1.mo6549T0(androidx.compose.ui.input.pointer.l, androidx.compose.ui.input.pointer.PointerEventPass, long):void");
    }

    /* renamed from: U0 */
    public final void mo6550U0(C1640l lVar) {
        boolean z;
        List<C1644p> list = lVar.f3651a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = false;
                break;
            } else if (list.get(i).mo6615b()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            if (this.f3605d == PointerInteropFilter.DispatchToViewState.Dispatching) {
                C1689j jVar = this.f3687b;
                if (jVar != null) {
                    C19382n.m32710G0(lVar, jVar.mo6683P(C8343c.f18295b), new PointerInteropFilter$pointerInputFilter$1$dispatchToView$2(this.f3606e), true);
                } else {
                    throw new IllegalStateException("layoutCoordinates not set".toString());
                }
            }
            this.f3605d = PointerInteropFilter.DispatchToViewState.NotDispatching;
            return;
        }
        C1689j jVar2 = this.f3687b;
        if (jVar2 != null) {
            C19382n.m32710G0(lVar, jVar2.mo6683P(C8343c.f18295b), new PointerInteropFilter$pointerInputFilter$1$dispatchToView$3(this, this.f3606e), false);
            if (this.f3605d == PointerInteropFilter.DispatchToViewState.Dispatching) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    list.get(i2).mo6614a();
                }
                C1635g gVar = lVar.f3652b;
                if (gVar != null) {
                    gVar.f3634c = !this.f3606e.f3603d;
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("layoutCoordinates not set".toString());
    }
}
