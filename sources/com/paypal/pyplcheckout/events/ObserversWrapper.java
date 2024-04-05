package com.paypal.pyplcheckout.events;

import androidx.lifecycle.C2843a0;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

final class ObserversWrapper<T> {
    private final AtomicBoolean alreadyNotified;
    private final Set<C2843a0<? super T>> observers;

    public ObserversWrapper() {
        this((Set) null, (AtomicBoolean) null, 3, (DefaultConstructorMarker) null);
    }

    public ObserversWrapper(Set<C2843a0<? super T>> set, AtomicBoolean atomicBoolean) {
        C19383o.m32797g(set, "observers");
        C19383o.m32797g(atomicBoolean, "alreadyNotified");
        this.observers = set;
        this.alreadyNotified = atomicBoolean;
    }

    public static /* synthetic */ ObserversWrapper copy$default(ObserversWrapper observersWrapper, Set<C2843a0<? super T>> set, AtomicBoolean atomicBoolean, int i, Object obj) {
        if ((i & 1) != 0) {
            set = observersWrapper.observers;
        }
        if ((i & 2) != 0) {
            atomicBoolean = observersWrapper.alreadyNotified;
        }
        return observersWrapper.copy(set, atomicBoolean);
    }

    public final Set<C2843a0<? super T>> component1() {
        return this.observers;
    }

    public final AtomicBoolean component2() {
        return this.alreadyNotified;
    }

    public final ObserversWrapper<T> copy(Set<C2843a0<? super T>> set, AtomicBoolean atomicBoolean) {
        C19383o.m32797g(set, "observers");
        C19383o.m32797g(atomicBoolean, "alreadyNotified");
        return new ObserversWrapper<>(set, atomicBoolean);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ObserversWrapper)) {
            return false;
        }
        ObserversWrapper observersWrapper = (ObserversWrapper) obj;
        return C19383o.m32792b(this.observers, observersWrapper.observers) && C19383o.m32792b(this.alreadyNotified, observersWrapper.alreadyNotified);
    }

    public final AtomicBoolean getAlreadyNotified() {
        return this.alreadyNotified;
    }

    public final Set<C2843a0<? super T>> getObservers() {
        return this.observers;
    }

    public int hashCode() {
        return this.alreadyNotified.hashCode() + (this.observers.hashCode() * 31);
    }

    public String toString() {
        Set<C2843a0<? super T>> set = this.observers;
        AtomicBoolean atomicBoolean = this.alreadyNotified;
        return "ObserversWrapper(observers=" + set + ", alreadyNotified=" + atomicBoolean + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ObserversWrapper(Set set, AtomicBoolean atomicBoolean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LinkedHashSet() : set, (i & 2) != 0 ? new AtomicBoolean(true) : atomicBoolean);
    }
}
