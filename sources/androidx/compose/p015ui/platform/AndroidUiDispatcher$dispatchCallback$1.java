package androidx.compose.p015ui.platform;

import android.view.Choreographer;
import kotlin.C19394m;

/* renamed from: androidx.compose.ui.platform.AndroidUiDispatcher$dispatchCallback$1 */
public final class AndroidUiDispatcher$dispatchCallback$1 implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ AndroidUiDispatcher this$0;

    public AndroidUiDispatcher$dispatchCallback$1(AndroidUiDispatcher androidUiDispatcher) {
        this.this$0 = androidUiDispatcher;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        r0 = r3.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r2 >= r0) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r3.get(r2).doFrame(r6);
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        r3.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void doFrame(long r6) {
        /*
            r5 = this;
            androidx.compose.ui.platform.AndroidUiDispatcher r0 = r5.this$0
            android.os.Handler r0 = r0.f4002d
            r0.removeCallbacks(r5)
            androidx.compose.ui.platform.AndroidUiDispatcher r0 = r5.this$0
            androidx.compose.p015ui.platform.AndroidUiDispatcher.m3936E0(r0)
            androidx.compose.ui.platform.AndroidUiDispatcher r0 = r5.this$0
            java.lang.Object r1 = r0.f4003e
            monitor-enter(r1)
            boolean r2 = r0.f4008j     // Catch:{ all -> 0x0039 }
            if (r2 != 0) goto L_0x0017
            monitor-exit(r1)
            goto L_0x0038
        L_0x0017:
            r2 = 0
            r0.f4008j = r2     // Catch:{ all -> 0x0039 }
            java.util.List<android.view.Choreographer$FrameCallback> r3 = r0.f4005g     // Catch:{ all -> 0x0039 }
            java.util.List<android.view.Choreographer$FrameCallback> r4 = r0.f4006h     // Catch:{ all -> 0x0039 }
            r0.f4005g = r4     // Catch:{ all -> 0x0039 }
            r0.f4006h = r3     // Catch:{ all -> 0x0039 }
            monitor-exit(r1)
            int r0 = r3.size()
        L_0x0027:
            if (r2 >= r0) goto L_0x0035
            java.lang.Object r1 = r3.get(r2)
            android.view.Choreographer$FrameCallback r1 = (android.view.Choreographer.FrameCallback) r1
            r1.doFrame(r6)
            int r2 = r2 + 1
            goto L_0x0027
        L_0x0035:
            r3.clear()
        L_0x0038:
            return
        L_0x0039:
            r6 = move-exception
            monitor-exit(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.platform.AndroidUiDispatcher$dispatchCallback$1.doFrame(long):void");
    }

    public void run() {
        AndroidUiDispatcher.m3936E0(this.this$0);
        AndroidUiDispatcher androidUiDispatcher = this.this$0;
        synchronized (androidUiDispatcher.f4003e) {
            if (androidUiDispatcher.f4005g.isEmpty()) {
                androidUiDispatcher.f4001c.removeFrameCallback(this);
                androidUiDispatcher.f4008j = false;
            }
            C19394m mVar = C19394m.f43287a;
        }
    }
}
