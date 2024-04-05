package com.paypal.pyplcheckout.events;

import androidx.lifecycle.C2843a0;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.C2895z;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.conversation.list.ccm.C9580d;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class SingleLiveEvent<T> extends C2895z<T> {
    private final ObserversWrapper<T> foreverObservers = new ObserversWrapper<>((Set) null, (AtomicBoolean) null, 3, (DefaultConstructorMarker) null);
    private final Map<C2887s, ObserversWrapper<T>> lifecycleObservers = new LinkedHashMap();

    private final void addLifecycleObserver(C2887s sVar, C2843a0<? super T> a0Var) {
        Set observers;
        if (!this.lifecycleObservers.containsKey(sVar)) {
            this.lifecycleObservers.put(sVar, new ObserversWrapper((Set) null, (AtomicBoolean) null, 3, (DefaultConstructorMarker) null));
        }
        ObserversWrapper observersWrapper = this.lifecycleObservers.get(sVar);
        if (observersWrapper != null && (observers = observersWrapper.getObservers()) != null) {
            observers.add(a0Var);
        }
    }

    private final void notify(ObserversWrapper<T> observersWrapper, T t) {
        if (observersWrapper.getAlreadyNotified().compareAndSet(false, true)) {
            for (C2843a0 onChanged : observersWrapper.getObservers()) {
                onChanged.onChanged(t);
            }
        }
    }

    private final synchronized void notifyNewValue() {
        this.foreverObservers.getAlreadyNotified().set(false);
        for (ObserversWrapper alreadyNotified : this.lifecycleObservers.values()) {
            alreadyNotified.getAlreadyNotified().set(false);
        }
    }

    private final void notifyObservers(C2887s sVar, T t) {
        ObserversWrapper observersWrapper;
        notify(this.foreverObservers, t);
        if (sVar != null && (observersWrapper = this.lifecycleObservers.get(sVar)) != null) {
            notify(observersWrapper, t);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observe$lambda-1  reason: not valid java name */
    public static final void m35252observe$lambda1(SingleLiveEvent singleLiveEvent, C2887s sVar, Object obj) {
        C19383o.m32797g(singleLiveEvent, "this$0");
        C19383o.m32797g(sVar, "$owner");
        singleLiveEvent.notifyObservers(sVar, obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: observeForever$lambda-2  reason: not valid java name */
    public static final void m35253observeForever$lambda2(SingleLiveEvent singleLiveEvent, Object obj) {
        C19383o.m32797g(singleLiveEvent, "this$0");
        singleLiveEvent.notifyObservers((C2887s) null, obj);
    }

    public void observe(C2887s sVar, C2843a0<? super T> a0Var) {
        C19383o.m32797g(sVar, ResponseConstants.OWNER);
        C19383o.m32797g(a0Var, "observer");
        addLifecycleObserver(sVar, a0Var);
        super.observe(sVar, new C17218a(this, sVar));
    }

    public void observeForever(C2843a0<? super T> a0Var) {
        C19383o.m32797g(a0Var, "observer");
        this.foreverObservers.getObservers().add(a0Var);
        super.observeForever(new C9580d(this, 4));
    }

    public void postValue(T t) {
        notifyNewValue();
        super.postValue(t);
    }

    public void removeObserver(C2843a0<? super T> a0Var) {
        C19383o.m32797g(a0Var, "observer");
        super.removeObserver(a0Var);
        this.foreverObservers.getObservers().remove(a0Var);
        for (ObserversWrapper observers : this.lifecycleObservers.values()) {
            observers.getObservers().remove(a0Var);
        }
    }

    public void removeObservers(C2887s sVar) {
        C19383o.m32797g(sVar, ResponseConstants.OWNER);
        super.removeObservers(sVar);
        this.lifecycleObservers.remove(sVar);
    }

    public void setValue(T t) {
        notifyNewValue();
        super.setValue(t);
    }
}
