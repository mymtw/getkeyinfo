package p145io.branch.referral;

import android.content.Context;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p145io.branch.referral.C7072q;
import p145io.branch.referral.C7074q0;

/* renamed from: io.branch.referral.HuaweiOAIDFetchTask */
public class HuaweiOAIDFetchTask extends BranchAsyncTask<Void, Void, Void> {
    private static final int OAID_FETCH_TIME_OUT = 1500;
    private final C7074q0.C7075a callback_;
    /* access modifiers changed from: private */
    public WeakReference<Context> contextRef_;

    /* renamed from: io.branch.referral.HuaweiOAIDFetchTask$a */
    public class C7022a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ CountDownLatch f15612b;

        public C7022a(CountDownLatch countDownLatch) {
            this.f15612b = countDownLatch;
        }

        public final void run() {
            Context context = (Context) HuaweiOAIDFetchTask.this.contextRef_.get();
            if (context != null) {
                HuaweiOAIDFetchTask.this.setOAID(context);
            }
            this.f15612b.countDown();
        }
    }

    public HuaweiOAIDFetchTask(Context context, C7074q0.C7075a aVar) {
        this.contextRef_ = new WeakReference<>(context);
        this.callback_ = aVar;
    }

    /* access modifiers changed from: private */
    public void setOAID(Context context) {
        try {
            int i = 1;
            Object invoke = Class.forName("com.huawei.hms.ads.identifier.AdvertisingIdClient").getDeclaredMethod("getAdvertisingIdInfo", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
            String obj = invoke.getClass().getDeclaredMethod("getId", new Class[0]).invoke(invoke, new Object[0]).toString();
            Boolean bool = (Boolean) invoke.getClass().getDeclaredMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(invoke, new Object[0]);
            C7072q c = C7072q.m13663c();
            if (c == null) {
                c = new C7072q(context);
            }
            C7072q.C7073a aVar = c.f15748a;
            aVar.f15750a = obj;
            if (!bool.booleanValue()) {
                i = 0;
            }
            aVar.f15751b = i;
            if (TextUtils.isEmpty(obj) || obj.equals("00000000-0000-0000-0000-000000000000") || bool.booleanValue()) {
                aVar.f15750a = null;
            }
        } catch (Exception e) {
            C7077r.m13675a("failed to retrieve OAID, error = " + e);
        }
    }

    public Void doInBackground(Void... voidArr) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new C7022a(countDownLatch)).start();
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
