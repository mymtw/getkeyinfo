package net.yslibrary.android.keyboardvisibilityevent;

import android.app.Activity;
import p733ar.C18976c;

public final class KeyboardVisibilityEvent$setEventListener$2 extends AutoActivityLifecycleCallback {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ C18976c $unregistrar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeyboardVisibilityEvent$setEventListener$2(C18976c cVar, Activity activity, Activity activity2) {
        super(activity2);
        this.$unregistrar = cVar;
        this.$activity = activity;
    }

    public void onTargetActivityDestroyed() {
        this.$unregistrar.mo70412a();
    }
}
