package p520cj;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import com.etsy.android.lib.models.apiv3.search.QueryReformulation;
import p513bj.C14049b0;

/* renamed from: cj.i */
public final class C14155i {

    /* renamed from: a */
    public final C14146c f31225a = new C14146c();

    /* renamed from: b */
    public final WindowManager f31226b;

    /* renamed from: c */
    public final C14157b f31227c;

    /* renamed from: d */
    public final C14156a f31228d;

    /* renamed from: e */
    public boolean f31229e;

    /* renamed from: f */
    public Surface f31230f;

    /* renamed from: g */
    public float f31231g;

    /* renamed from: h */
    public float f31232h;

    /* renamed from: i */
    public float f31233i;

    /* renamed from: j */
    public float f31234j;

    /* renamed from: k */
    public long f31235k;

    /* renamed from: l */
    public long f31236l;

    /* renamed from: m */
    public long f31237m;

    /* renamed from: n */
    public long f31238n;

    /* renamed from: o */
    public long f31239o;

    /* renamed from: p */
    public long f31240p;

    /* renamed from: q */
    public long f31241q;

    /* renamed from: cj.i$a */
    public final class C14156a implements DisplayManager.DisplayListener {

        /* renamed from: a */
        public final DisplayManager f31242a;

        public C14156a(DisplayManager displayManager) {
            this.f31242a = displayManager;
        }

        public final void onDisplayAdded(int i) {
        }

        public final void onDisplayChanged(int i) {
            if (i == 0) {
                C14155i.this.mo47087a();
            }
        }

        public final void onDisplayRemoved(int i) {
        }
    }

    /* renamed from: cj.i$b */
    public static final class C14157b implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: f */
        public static final C14157b f31244f = new C14157b();

        /* renamed from: b */
        public volatile long f31245b = -9223372036854775807L;

        /* renamed from: c */
        public final Handler f31246c;

        /* renamed from: d */
        public Choreographer f31247d;

        /* renamed from: e */
        public int f31248e;

        public C14157b() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            handlerThread.start();
            Looper looper = handlerThread.getLooper();
            int i = C14049b0.f30913a;
            Handler handler = new Handler(looper, this);
            this.f31246c = handler;
            handler.sendEmptyMessage(0);
        }

        public final void doFrame(long j) {
            this.f31245b = j;
            Choreographer choreographer = this.f31247d;
            choreographer.getClass();
            choreographer.postFrameCallbackDelayed(this, 500);
        }

        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                this.f31247d = Choreographer.getInstance();
                return true;
            } else if (i == 1) {
                int i2 = this.f31248e + 1;
                this.f31248e = i2;
                if (i2 == 1) {
                    Choreographer choreographer = this.f31247d;
                    choreographer.getClass();
                    choreographer.postFrameCallback(this);
                }
                return true;
            } else if (i != 2) {
                return false;
            } else {
                int i3 = this.f31248e - 1;
                this.f31248e = i3;
                if (i3 == 0) {
                    Choreographer choreographer2 = this.f31247d;
                    choreographer2.getClass();
                    choreographer2.removeFrameCallback(this);
                    this.f31245b = -9223372036854775807L;
                }
                return true;
            }
        }
    }

    public C14155i(Context context) {
        C14156a aVar = null;
        if (context != null) {
            context = context.getApplicationContext();
            this.f31226b = (WindowManager) context.getSystemService("window");
        } else {
            this.f31226b = null;
        }
        if (this.f31226b != null) {
            if (C14049b0.f30913a >= 17) {
                context.getClass();
                DisplayManager displayManager = (DisplayManager) context.getSystemService(QueryReformulation.DISPLAY);
                if (displayManager != null) {
                    aVar = new C14156a(displayManager);
                }
            }
            this.f31228d = aVar;
            this.f31227c = C14157b.f31244f;
        } else {
            this.f31228d = null;
            this.f31227c = null;
        }
        this.f31235k = -9223372036854775807L;
        this.f31236l = -9223372036854775807L;
        this.f31231g = -1.0f;
        this.f31234j = 1.0f;
    }

    /* renamed from: a */
    public final void mo47087a() {
        WindowManager windowManager = this.f31226b;
        windowManager.getClass();
        Display defaultDisplay = windowManager.getDefaultDisplay();
        if (defaultDisplay != null) {
            long refreshRate = (long) (1.0E9d / ((double) defaultDisplay.getRefreshRate()));
            this.f31235k = refreshRate;
            this.f31236l = (refreshRate * 80) / 100;
            return;
        }
        Log.w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        this.f31235k = -9223372036854775807L;
        this.f31236l = -9223372036854775807L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0082, code lost:
        if (java.lang.Math.abs(r0 - r10.f31232h) < (!r1 ? 0.02f : 1.0f)) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008c, code lost:
        if (r10.f31225a.f31170e >= 30) goto L_0x0090;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47088b() {
        /*
            r10 = this;
            int r0 = p513bj.C14049b0.f30913a
            r1 = 30
            if (r0 < r1) goto L_0x0097
            android.view.Surface r0 = r10.f31230f
            if (r0 != 0) goto L_0x000c
            goto L_0x0097
        L_0x000c:
            cj.c r0 = r10.f31225a
            boolean r0 = r0.mo47039a()
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 == 0) goto L_0x0037
            cj.c r0 = r10.f31225a
            boolean r3 = r0.mo47039a()
            if (r3 == 0) goto L_0x0035
            r3 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            cj.c$a r0 = r0.f31166a
            long r5 = r0.f31175e
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x002e
            goto L_0x0031
        L_0x002e:
            long r7 = r0.f31176f
            long r7 = r7 / r5
        L_0x0031:
            double r5 = (double) r7
            double r3 = r3 / r5
            float r0 = (float) r3
            goto L_0x0039
        L_0x0035:
            r0 = r2
            goto L_0x0039
        L_0x0037:
            float r0 = r10.f31231g
        L_0x0039:
            float r3 = r10.f31232h
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 != 0) goto L_0x0040
            return
        L_0x0040:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x0085
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0085
            cj.c r1 = r10.f31225a
            boolean r1 = r1.mo47039a()
            if (r1 == 0) goto L_0x006f
            cj.c r1 = r10.f31225a
            boolean r2 = r1.mo47039a()
            if (r2 == 0) goto L_0x005f
            cj.c$a r1 = r1.f31166a
            long r1 = r1.f31176f
            goto L_0x0064
        L_0x005f:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0064:
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L_0x006f
            r1 = r6
            goto L_0x0070
        L_0x006f:
            r1 = r5
        L_0x0070:
            if (r1 == 0) goto L_0x0076
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            goto L_0x0078
        L_0x0076:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0078:
            float r2 = r10.f31232h
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x008f
            goto L_0x0090
        L_0x0085:
            if (r4 == 0) goto L_0x0088
            goto L_0x0090
        L_0x0088:
            cj.c r2 = r10.f31225a
            int r2 = r2.f31170e
            if (r2 < r1) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r6 = r5
        L_0x0090:
            if (r6 == 0) goto L_0x0097
            r10.f31232h = r0
            r10.mo47089c(r5)
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p520cj.C14155i.mo47088b():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0026  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47089c(boolean r5) {
        /*
            r4 = this;
            int r0 = p513bj.C14049b0.f30913a
            r1 = 30
            if (r0 < r1) goto L_0x003b
            android.view.Surface r0 = r4.f31230f
            if (r0 != 0) goto L_0x000b
            goto L_0x003b
        L_0x000b:
            boolean r1 = r4.f31229e
            r2 = 0
            if (r1 == 0) goto L_0x001c
            float r1 = r4.f31232h
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x001c
            float r3 = r4.f31234j
            float r3 = r3 * r1
            goto L_0x001d
        L_0x001c:
            r3 = r2
        L_0x001d:
            if (r5 != 0) goto L_0x0026
            float r5 = r4.f31233i
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0026
            return
        L_0x0026:
            r4.f31233i = r3
            int r5 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x002e
            r5 = 0
            goto L_0x002f
        L_0x002e:
            r5 = 1
        L_0x002f:
            r0.setFrameRate(r3, r5)     // Catch:{ IllegalStateException -> 0x0033 }
            goto L_0x003b
        L_0x0033:
            r5 = move-exception
            java.lang.String r0 = "VideoFrameReleaseHelper"
            java.lang.String r1 = "Failed to call Surface.setFrameRate"
            p513bj.C14075p.m21698j(r0, r1, r5)
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p520cj.C14155i.mo47089c(boolean):void");
    }
}
