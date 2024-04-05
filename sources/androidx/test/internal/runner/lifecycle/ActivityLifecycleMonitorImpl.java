package androidx.test.internal.runner.lifecycle;

import android.app.Activity;
import android.os.Looper;
import android.util.Log;
import androidx.test.internal.platform.ThreadChecker;
import androidx.test.internal.util.Checks;
import androidx.test.runner.lifecycle.ActivityLifecycleCallback;
import androidx.test.runner.lifecycle.Stage;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public final class ActivityLifecycleMonitorImpl {

    /* renamed from: a */
    public final boolean f7683a = false;

    /* renamed from: b */
    public final ArrayList f7684b = new ArrayList();

    /* renamed from: c */
    public ArrayList f7685c = new ArrayList();

    public static class ActivityStatus {

        /* renamed from: a */
        public final WeakReference<Activity> f7686a;

        /* renamed from: b */
        public Stage f7687b;

        public ActivityStatus(Activity activity, Stage stage) {
            ThreadChecker threadChecker = Checks.f7689a;
            activity.getClass();
            this.f7686a = new WeakReference<>(activity);
            stage.getClass();
            this.f7687b = stage;
        }
    }

    /* renamed from: a */
    public final ArrayList mo12358a(Stage stage) {
        if (!this.f7683a && !Thread.currentThread().equals(Looper.getMainLooper().getThread())) {
            throw new IllegalStateException("Querying activity state off main thread is not allowed.");
        }
        ThreadChecker threadChecker = Checks.f7689a;
        stage.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f7685c.iterator();
        while (it.hasNext()) {
            ActivityStatus activityStatus = (ActivityStatus) it.next();
            Activity activity = activityStatus.f7686a.get();
            if (activity == null) {
                it.remove();
            } else if (stage == activityStatus.f7687b) {
                arrayList.add(activity);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo12359b(Activity activity, Stage stage) {
        String valueOf = String.valueOf(activity);
        String valueOf2 = String.valueOf(stage);
        StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 30);
        sb.append("Lifecycle status change: ");
        sb.append(valueOf);
        sb.append(" in: ");
        sb.append(valueOf2);
        Log.d("LifecycleMonitor", sb.toString());
        Iterator it = this.f7685c.iterator();
        boolean z = true;
        while (it.hasNext()) {
            ActivityStatus activityStatus = (ActivityStatus) it.next();
            Activity activity2 = activityStatus.f7686a.get();
            if (activity2 == null) {
                it.remove();
            } else if (activity == activity2) {
                activityStatus.f7687b = stage;
                z = false;
            }
        }
        if (z) {
            this.f7685c.add(new ActivityStatus(activity, stage));
        }
        synchronized (this.f7684b) {
            Iterator it2 = this.f7684b.iterator();
            while (it2.hasNext()) {
                ActivityLifecycleCallback activityLifecycleCallback = (ActivityLifecycleCallback) ((WeakReference) it2.next()).get();
                if (activityLifecycleCallback == null) {
                    it2.remove();
                } else {
                    try {
                        activityLifecycleCallback.mo12413a();
                    } catch (RuntimeException e) {
                        Log.e("LifecycleMonitor", String.format("Callback threw exception! (callback: %s activity: %s stage: %s)", new Object[]{activityLifecycleCallback, activity, stage}), e);
                    }
                }
            }
        }
    }
}
