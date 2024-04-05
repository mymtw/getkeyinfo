package androidx.test.internal.runner.lifecycle;

import android.app.Application;
import android.util.Log;
import androidx.test.runner.lifecycle.ApplicationLifecycleCallback;
import androidx.test.runner.lifecycle.ApplicationStage;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class ApplicationLifecycleMonitorImpl {

    /* renamed from: a */
    public final ArrayList f7688a = new ArrayList();

    /* renamed from: a */
    public final void mo12360a(Application application, ApplicationStage applicationStage) {
        synchronized (this.f7688a) {
            Iterator it = this.f7688a.iterator();
            while (it.hasNext()) {
                ApplicationLifecycleCallback applicationLifecycleCallback = (ApplicationLifecycleCallback) ((WeakReference) it.next()).get();
                if (applicationLifecycleCallback == null) {
                    it.remove();
                } else {
                    try {
                        String valueOf = String.valueOf(applicationLifecycleCallback);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 18);
                        sb.append("running callback: ");
                        sb.append(valueOf);
                        Log.d("ApplicationLifecycleMonitorImpl", sb.toString());
                        applicationLifecycleCallback.mo12414a();
                        String valueOf2 = String.valueOf(applicationLifecycleCallback);
                        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 20);
                        sb2.append("callback completes: ");
                        sb2.append(valueOf2);
                        Log.d("ApplicationLifecycleMonitorImpl", sb2.toString());
                    } catch (RuntimeException e) {
                        Log.e("ApplicationLifecycleMonitorImpl", String.format("Callback threw exception! (callback: %s stage: %s)", new Object[]{applicationLifecycleCallback, applicationStage}), e);
                    }
                }
            }
        }
    }
}
