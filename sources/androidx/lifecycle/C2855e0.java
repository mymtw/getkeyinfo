package androidx.lifecycle;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;

/* renamed from: androidx.lifecycle.e0 */
public final class C2855e0 extends C2867j {
    public final /* synthetic */ C2851d0 this$0;

    /* renamed from: androidx.lifecycle.e0$a */
    public class C2856a extends C2867j {
        public C2856a() {
        }

        public void onActivityPostResumed(Activity activity) {
            C2855e0.this.this$0.mo10807a();
        }

        public void onActivityPostStarted(Activity activity) {
            C2851d0 d0Var = C2855e0.this.this$0;
            int i = d0Var.f6470b + 1;
            d0Var.f6470b = i;
            if (i == 1 && d0Var.f6473e) {
                d0Var.f6475g.mo10837f(Lifecycle.Event.ON_START);
                d0Var.f6473e = false;
            }
        }
    }

    public C2855e0(C2851d0 d0Var) {
        this.this$0 = d0Var;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            ReportFragment.get(activity).setProcessListener(this.this$0.f6477i);
        }
    }

    public void onActivityPaused(Activity activity) {
        C2851d0 d0Var = this.this$0;
        int i = d0Var.f6471c - 1;
        d0Var.f6471c = i;
        if (i == 0) {
            d0Var.f6474f.postDelayed(d0Var.f6476h, 700);
        }
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.registerActivityLifecycleCallbacks(new C2856a());
    }

    public void onActivityStopped(Activity activity) {
        C2851d0 d0Var = this.this$0;
        int i = d0Var.f6470b - 1;
        d0Var.f6470b = i;
        if (i == 0 && d0Var.f6472d) {
            d0Var.f6475g.mo10837f(Lifecycle.Event.ON_STOP);
            d0Var.f6473e = true;
        }
    }
}
