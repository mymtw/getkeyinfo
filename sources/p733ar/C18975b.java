package p733ar;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.fragment.app.FragmentActivity;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C19383o;
import net.yslibrary.android.keyboardvisibilityevent.KeyboardVisibilityEvent$registerEventListener$layoutListener$1;

/* renamed from: ar.b */
public final class C18975b implements C18976c {

    /* renamed from: a */
    public final WeakReference<Activity> f42296a;

    /* renamed from: b */
    public final WeakReference<ViewTreeObserver.OnGlobalLayoutListener> f42297b;

    public C18975b(FragmentActivity fragmentActivity, KeyboardVisibilityEvent$registerEventListener$layoutListener$1 keyboardVisibilityEvent$registerEventListener$layoutListener$1) {
        C19383o.m32797g(fragmentActivity, "activity");
        this.f42296a = new WeakReference<>(fragmentActivity);
        this.f42297b = new WeakReference<>(keyboardVisibilityEvent$registerEventListener$layoutListener$1);
    }

    /* renamed from: a */
    public final void mo70412a() {
        Activity activity = this.f42296a.get();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f42297b.get();
        if (!(activity == null || onGlobalLayoutListener == null)) {
            View findViewById = activity.findViewById(16908290);
            C19383o.m32796f(findViewById, "activity.findViewById(android.R.id.content)");
            View rootView = ((ViewGroup) findViewById).getRootView();
            C19383o.m32796f(rootView, "getContentRoot(activity).rootView");
            rootView.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
        this.f42296a.clear();
        this.f42297b.clear();
    }
}
