package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.lifecycle.p */
public final class C2883p {

    /* renamed from: a */
    public static AtomicBoolean f6515a = new AtomicBoolean(false);

    /* renamed from: androidx.lifecycle.p$a */
    public static class C2884a extends C2867j {
        public void onActivityCreated(Activity activity, Bundle bundle) {
            ReportFragment.injectIfNeededIn(activity);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }
}
