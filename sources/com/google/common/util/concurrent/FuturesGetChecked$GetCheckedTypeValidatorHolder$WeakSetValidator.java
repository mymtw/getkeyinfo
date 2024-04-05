package com.google.common.util.concurrent;

import com.google.common.base.C15794l;
import com.google.common.collect.Ordering;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

enum FuturesGetChecked$GetCheckedTypeValidatorHolder$WeakSetValidator {
    INSTANCE;
    
    private static final Set<WeakReference<Class<? extends Exception>>> validClasses = null;

    /* access modifiers changed from: public */
    static {
        validClasses = new CopyOnWriteArraySet();
    }

    public void validateClass(Class<? extends Exception> cls) {
        for (WeakReference<Class<? extends Exception>> weakReference : validClasses) {
            if (cls.equals(weakReference.get())) {
                return;
            }
        }
        Ordering<Constructor<?>> ordering = C16382i.f36495a;
        boolean z = true;
        C15794l.m25612f(cls, "Futures.getChecked exception type (%s) must not be a RuntimeException", !RuntimeException.class.isAssignableFrom(cls));
        try {
            C16382i.m26509a(cls, new Exception());
        } catch (Exception unused) {
            z = false;
        }
        C15794l.m25612f(cls, "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable", z);
        Set<WeakReference<Class<? extends Exception>>> set = validClasses;
        if (set.size() > 1000) {
            set.clear();
        }
        set.add(new WeakReference(cls));
    }
}
