package com.google.android.exoplayer2.trackselection;

import p513bj.C14065m;
import p718yi.C18886d;
import p718yi.C18887e;

/* renamed from: com.google.android.exoplayer2.trackselection.d */
public final class C14391d {
    /* renamed from: a */
    public static boolean m22799a(C18887e eVar) {
        for (int i = 0; i < eVar.f42063a; i++) {
            C18886d dVar = eVar.f42064b[i];
            if (dVar != null) {
                for (int i2 = 0; i2 < dVar.length(); i2++) {
                    if (C14065m.m21678h(dVar.mo70311c(i2).sampleMimeType) == 2) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }
}
