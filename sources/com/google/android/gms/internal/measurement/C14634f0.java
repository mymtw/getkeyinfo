package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.measurement.f0 */
public final class C14634f0 extends C14849w {
    /* renamed from: a */
    public final C14763p mo50377a(String str, C14598c3 c3Var, ArrayList arrayList) {
        if (str == null || str.isEmpty() || !c3Var.mo50405h(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", new Object[]{str}));
        }
        C14763p e = c3Var.mo50402e(str);
        if (e instanceof C14685j) {
            return ((C14685j) e).mo50553b(c3Var, arrayList);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", new Object[]{str}));
    }
}
