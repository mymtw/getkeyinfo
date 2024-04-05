package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import kotlin.jvm.internal.C19388s;

/* renamed from: com.google.android.gms.internal.measurement.w */
public abstract class C14849w {

    /* renamed from: a */
    public final ArrayList f33140a = new ArrayList();

    /* renamed from: a */
    public abstract C14763p mo50377a(String str, C14598c3 c3Var, ArrayList arrayList);

    /* renamed from: b */
    public final void mo50946b(String str) {
        if (this.f33140a.contains(C19388s.m32834M0(str))) {
            String valueOf = String.valueOf(str);
            throw new UnsupportedOperationException(valueOf.length() != 0 ? "Command not implemented: ".concat(valueOf) : new String("Command not implemented: "));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
