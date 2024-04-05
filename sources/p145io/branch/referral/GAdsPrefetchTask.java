package p145io.branch.referral;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p145io.branch.referral.C7072q;
import p145io.branch.referral.C7074q0;

/* renamed from: io.branch.referral.GAdsPrefetchTask */
public class GAdsPrefetchTask extends BranchAsyncTask<Void, Void, Void> {
    private static final int GAID_FETCH_TIME_OUT = 1500;
    private final C7074q0.C7075a callback_;
    /* access modifiers changed from: private */
    public WeakReference<Context> contextRef_;

    /* renamed from: io.branch.referral.GAdsPrefetchTask$a */
    public class C7021a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ CountDownLatch f15610b;

        public C7021a(CountDownLatch countDownLatch) {
            this.f15610b = countDownLatch;
        }

        public final void run() {
            Context context = (Context) GAdsPrefetchTask.this.contextRef_.get();
            if (context != null) {
                Process.setThreadPriority(-19);
                Object access$100 = GAdsPrefetchTask.this.getAdInfoObject(context);
                C7072q c = C7072q.m13663c();
                if (c == null) {
                    c = new C7072q(context);
                }
                C7072q.C7073a aVar = c.f15748a;
                if (aVar != null) {
                    GAdsPrefetchTask.this.setGoogleLATWithAdvertisingIdClient(aVar, access$100);
                    if (aVar.f15751b == 1) {
                        aVar.f15750a = null;
                    } else {
                        GAdsPrefetchTask.this.setGAIDWithAdvertisingIdClient(aVar, access$100);
                    }
                }
            }
            this.f15610b.countDown();
        }
    }

    public GAdsPrefetchTask(Context context, C7074q0.C7075a aVar) {
        this.contextRef_ = new WeakReference<>(context);
        this.callback_ = aVar;
    }

    /* access modifiers changed from: private */
    public Object getAdInfoObject(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return AdvertisingIdClient.class.getMethod("getAdvertisingIdInfo", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
        } catch (Exception unused) {
            C7077r.m13675a("Either class com.google.android.gms.ads.identifier.AdvertisingIdClient or its method, getAdvertisingIdInfo, was not found");
            return null;
        }
    }

    /* access modifiers changed from: private */
    public void setGAIDWithAdvertisingIdClient(C7074q0 q0Var, Object obj) {
        try {
            q0Var.f15750a = (String) obj.getClass().getMethod("getId", new Class[0]).invoke(obj, new Object[0]);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public void setGoogleLATWithAdvertisingIdClient(C7074q0 q0Var, Object obj) {
        try {
            int i = 0;
            Object invoke = obj.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(obj, new Object[0]);
            if (invoke instanceof Boolean) {
                if (((Boolean) invoke).booleanValue()) {
                    i = 1;
                }
                q0Var.f15751b = i;
            }
        } catch (Exception unused) {
            C7077r.m13675a("isLimitAdTrackingEnabled method not found");
        }
    }

    public Void doInBackground(Void... voidArr) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new C7021a(countDownLatch)).start();
        try {
            countDownLatch.await(1500, TimeUnit.MILLISECONDS);
            return null;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void onPostExecute(Void voidR) {
        super.onPostExecute(voidR);
        C7074q0.C7075a aVar = this.callback_;
        if (aVar != null) {
            ((Branch) aVar).mo19200q();
        }
    }
}
