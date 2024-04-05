package p250u0;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: u0.e */
public class C8086e {

    /* renamed from: a */
    public C8087a f17613a = new C8087a();

    /* renamed from: u0.e$a */
    public static class C8087a extends C8089b {

        /* renamed from: e */
        public static HandlerThread f17614e;

        /* renamed from: f */
        public static Handler f17615f;

        /* renamed from: a */
        public int f17616a = 1;

        /* renamed from: b */
        public SparseIntArray[] f17617b = new SparseIntArray[9];

        /* renamed from: c */
        public ArrayList<WeakReference<Activity>> f17618c = new ArrayList<>();

        /* renamed from: d */
        public C8088a f17619d = new C8088a();

        /* renamed from: u0.e$a$a */
        public class C8088a implements Window.OnFrameMetricsAvailableListener {
            public C8088a() {
            }

            public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                C8087a aVar = C8087a.this;
                if ((aVar.f17616a & 1) != 0) {
                    C8087a.m16269a(aVar.f17617b[0], frameMetrics.getMetric(8));
                }
                C8087a aVar2 = C8087a.this;
                if ((aVar2.f17616a & 2) != 0) {
                    C8087a.m16269a(aVar2.f17617b[1], frameMetrics.getMetric(1));
                }
                C8087a aVar3 = C8087a.this;
                if ((aVar3.f17616a & 4) != 0) {
                    C8087a.m16269a(aVar3.f17617b[2], frameMetrics.getMetric(3));
                }
                C8087a aVar4 = C8087a.this;
                if ((aVar4.f17616a & 8) != 0) {
                    C8087a.m16269a(aVar4.f17617b[3], frameMetrics.getMetric(4));
                }
                C8087a aVar5 = C8087a.this;
                if ((aVar5.f17616a & 16) != 0) {
                    C8087a.m16269a(aVar5.f17617b[4], frameMetrics.getMetric(5));
                }
                C8087a aVar6 = C8087a.this;
                if ((aVar6.f17616a & 64) != 0) {
                    C8087a.m16269a(aVar6.f17617b[6], frameMetrics.getMetric(7));
                }
                C8087a aVar7 = C8087a.this;
                if ((aVar7.f17616a & 32) != 0) {
                    C8087a.m16269a(aVar7.f17617b[5], frameMetrics.getMetric(6));
                }
                C8087a aVar8 = C8087a.this;
                if ((aVar8.f17616a & 128) != 0) {
                    C8087a.m16269a(aVar8.f17617b[7], frameMetrics.getMetric(0));
                }
                C8087a aVar9 = C8087a.this;
                if ((aVar9.f17616a & 256) != 0) {
                    C8087a.m16269a(aVar9.f17617b[8], frameMetrics.getMetric(2));
                }
            }
        }

        /* renamed from: a */
        public static void m16269a(SparseIntArray sparseIntArray, long j) {
            if (sparseIntArray != null) {
                int i = (int) ((500000 + j) / 1000000);
                if (j >= 0) {
                    sparseIntArray.put(i, sparseIntArray.get(i) + 1);
                }
            }
        }
    }

    /* renamed from: u0.e$b */
    public static class C8089b {
    }

    /* renamed from: a */
    public final void mo20679a(Activity activity) {
        C8087a aVar = this.f17613a;
        aVar.getClass();
        if (C8087a.f17614e == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            C8087a.f17614e = handlerThread;
            handlerThread.start();
            C8087a.f17615f = new Handler(C8087a.f17614e.getLooper());
        }
        for (int i = 0; i <= 8; i++) {
            SparseIntArray[] sparseIntArrayArr = aVar.f17617b;
            if (sparseIntArrayArr[i] == null && (aVar.f17616a & (1 << i)) != 0) {
                sparseIntArrayArr[i] = new SparseIntArray();
            }
        }
        activity.getWindow().addOnFrameMetricsAvailableListener(aVar.f17619d, C8087a.f17615f);
        aVar.f17618c.add(new WeakReference(activity));
    }
}
