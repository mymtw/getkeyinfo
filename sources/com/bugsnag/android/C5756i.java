package com.bugsnag.android;

import com.bugsnag.android.internal.C5771f;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;

/* renamed from: com.bugsnag.android.i */
public class C5756i {
    private final CopyOnWriteArrayList<C5771f> observers = new CopyOnWriteArrayList<>();

    public final void addObserver(C5771f fVar) {
        C19383o.m32798h(fVar, "observer");
        this.observers.addIfAbsent(fVar);
    }

    public final CopyOnWriteArrayList<C5771f> getObservers$bugsnag_android_core_release() {
        return this.observers;
    }

    public final void removeObserver(C5771f fVar) {
        C19383o.m32798h(fVar, "observer");
        this.observers.remove(fVar);
    }

    public final void updateState(C5780k2 k2Var) {
        C19383o.m32798h(k2Var, "event");
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            for (C5771f onStateChange : getObservers$bugsnag_android_core_release()) {
                onStateChange.onStateChange(k2Var);
            }
        }
    }

    public final void updateState$bugsnag_android_core_release(C19846a<? extends C5780k2> aVar) {
        C19383o.m32798h(aVar, "provider");
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            C5780k2 k2Var = (C5780k2) aVar.invoke();
            for (C5771f onStateChange : getObservers$bugsnag_android_core_release()) {
                onStateChange.onStateChange(k2Var);
            }
        }
    }
}
