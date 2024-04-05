package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import com.google.android.datatransport.runtime.backends.C6525a;
import com.google.android.datatransport.runtime.backends.C6529d;
import com.google.android.datatransport.runtime.backends.C6535i;
import p029bh.C3508b;

@Keep
public class CctBackendFactory implements C6525a {
    public C6535i create(C6529d dVar) {
        return new C3508b(dVar.getApplicationContext(), dVar.getWallClock(), dVar.getMonotonicClock());
    }
}
