package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;

public class ReportFragment extends Fragment {
    private static final String REPORT_FRAGMENT_TAG = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";
    private C2836a mProcessListener;

    /* renamed from: androidx.lifecycle.ReportFragment$a */
    public interface C2836a {
    }

    /* renamed from: androidx.lifecycle.ReportFragment$b */
    public static class C2837b implements Application.ActivityLifecycleCallbacks {
        public static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new C2837b());
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            ReportFragment.dispatch(activity, Lifecycle.Event.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            ReportFragment.dispatch(activity, Lifecycle.Event.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            ReportFragment.dispatch(activity, Lifecycle.Event.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            ReportFragment.dispatch(activity, Lifecycle.Event.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            ReportFragment.dispatch(activity, Lifecycle.Event.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            ReportFragment.dispatch(activity, Lifecycle.Event.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    public static void dispatch(Activity activity, Lifecycle.Event event) {
        if (activity instanceof C2890u) {
            ((C2890u) activity).getLifecycle().mo10837f(event);
        } else if (activity instanceof C2887s) {
            Lifecycle lifecycle = ((C2887s) activity).getLifecycle();
            if (lifecycle instanceof C2888t) {
                ((C2888t) lifecycle).mo10837f(event);
            }
        }
    }

    private void dispatchCreate(C2836a aVar) {
    }

    private void dispatchResume(C2836a aVar) {
        if (aVar != null) {
            C2851d0.this.mo10807a();
        }
    }

    private void dispatchStart(C2836a aVar) {
        if (aVar != null) {
            C2851d0 d0Var = C2851d0.this;
            int i = d0Var.f6470b + 1;
            d0Var.f6470b = i;
            if (i == 1 && d0Var.f6473e) {
                d0Var.f6475g.mo10837f(Lifecycle.Event.ON_START);
                d0Var.f6473e = false;
            }
        }
    }

    public static ReportFragment get(Activity activity) {
        return (ReportFragment) activity.getFragmentManager().findFragmentByTag(REPORT_FRAGMENT_TAG);
    }

    public static void injectIfNeededIn(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            C2837b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag(REPORT_FRAGMENT_TAG) == null) {
            fragmentManager.beginTransaction().add(new ReportFragment(), REPORT_FRAGMENT_TAG).commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        dispatchCreate(this.mProcessListener);
        dispatch(Lifecycle.Event.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        dispatch(Lifecycle.Event.ON_DESTROY);
        this.mProcessListener = null;
    }

    public void onPause() {
        super.onPause();
        dispatch(Lifecycle.Event.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        dispatchResume(this.mProcessListener);
        dispatch(Lifecycle.Event.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        dispatchStart(this.mProcessListener);
        dispatch(Lifecycle.Event.ON_START);
    }

    public void onStop() {
        super.onStop();
        dispatch(Lifecycle.Event.ON_STOP);
    }

    public void setProcessListener(C2836a aVar) {
        this.mProcessListener = aVar;
    }

    private void dispatch(Lifecycle.Event event) {
        if (Build.VERSION.SDK_INT < 29) {
            dispatch(getActivity(), event);
        }
    }
}
