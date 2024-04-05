package com.google.firebase.components;

import java.util.List;
import p649pm.C18396b;

public class DependencyCycleException extends DependencyException {
    private final List<C18396b<?>> componentsInCycle;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DependencyCycleException(java.util.List<p649pm.C18396b<?>> r3) {
        /*
            r2 = this;
            java.lang.String r0 = "Dependency cycle detected: "
            java.lang.StringBuilder r0 = android.support.p013v4.media.C0072d.m201h(r0)
            java.lang.Object[] r1 = r3.toArray()
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            r2.componentsInCycle = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.DependencyCycleException.<init>(java.util.List):void");
    }

    public List<C18396b<?>> getComponentsInCycle() {
        return this.componentsInCycle;
    }
}
