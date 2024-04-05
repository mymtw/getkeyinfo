package net.yslibrary.android.keyboardvisibilityevent;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.C19383o;
import p733ar.C18974a;

public final class KeyboardVisibilityEvent$registerEventListener$layoutListener$1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ C18974a $listener;
    private boolean wasOpened;

    public KeyboardVisibilityEvent$registerEventListener$layoutListener$1(Activity activity, C18974a aVar) {
        this.$activity = activity;
        this.$listener = aVar;
    }

    public void onGlobalLayout() {
        Activity activity = this.$activity;
        C19383o.m32797g(activity, "activity");
        Rect rect = new Rect();
        View findViewById = activity.findViewById(16908290);
        C19383o.m32796f(findViewById, "activity.findViewById(android.R.id.content)");
        View rootView = ((ViewGroup) findViewById).getRootView();
        C19383o.m32796f(rootView, "getContentRoot(activity).rootView");
        rootView.getWindowVisibleDisplayFrame(rect);
        int[] iArr = new int[2];
        View findViewById2 = activity.findViewById(16908290);
        C19383o.m32796f(findViewById2, "activity.findViewById(android.R.id.content)");
        ((ViewGroup) findViewById2).getLocationOnScreen(iArr);
        View rootView2 = rootView.getRootView();
        C19383o.m32796f(rootView2, "activityRoot.rootView");
        int height = rootView2.getHeight();
        boolean z = true;
        if (((double) ((height - rect.height()) - iArr[1])) <= ((double) height) * 0.15d) {
            z = false;
        }
        if (z != this.wasOpened) {
            this.wasOpened = z;
            this.$listener.mo31997a(z);
        }
    }
}
