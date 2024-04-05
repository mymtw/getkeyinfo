package com.google.android.gms.common.api.internal;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public final class zaa extends ActivityLifecycleObserver {
    private final WeakReference<C20231zaa> zaa;

    /* renamed from: com.google.android.gms.common.api.internal.zaa$zaa  reason: collision with other inner class name */
    public static class C20231zaa extends LifecycleCallback {
        private List<Runnable> zaa = new ArrayList();

        private C20231zaa(LifecycleFragment lifecycleFragment) {
            super(lifecycleFragment);
            this.mLifecycleFragment.addCallback("LifecycleObserverOnStop", this);
        }

        /* access modifiers changed from: private */
        public final synchronized void zaa(Runnable runnable) {
            this.zaa.add(runnable);
        }

        /* access modifiers changed from: private */
        public static C20231zaa zab(Activity activity) {
            C20231zaa zaa2;
            synchronized (activity) {
                LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
                zaa2 = (C20231zaa) fragment.getCallbackOrNull("LifecycleObserverOnStop", C20231zaa.class);
                if (zaa2 == null) {
                    zaa2 = new C20231zaa(fragment);
                }
            }
            return zaa2;
        }

        public void onStop() {
            List<Runnable> list;
            synchronized (this) {
                list = this.zaa;
                this.zaa = new ArrayList();
            }
            for (Runnable run : list) {
                run.run();
            }
        }
    }

    public zaa(Activity activity) {
        this(C20231zaa.zab(activity));
    }

    public final ActivityLifecycleObserver onStopCallOnce(Runnable runnable) {
        C20231zaa zaa2 = this.zaa.get();
        if (zaa2 != null) {
            zaa2.zaa(runnable);
            return this;
        }
        throw new IllegalStateException("The target activity has already been GC'd");
    }

    private zaa(C20231zaa zaa2) {
        this.zaa = new WeakReference<>(zaa2);
    }
}
