package com.squareup.moshi;

import java.io.IOException;
import p756lr.C19882a0;
import p756lr.C19890d0;
import p756lr.C19893f;

/* renamed from: com.squareup.moshi.r */
public final class C17406r implements C19882a0 {

    /* renamed from: b */
    public final /* synthetic */ C17407s f37985b;

    public C17406r(C17407s sVar) {
        this.f37985b = sVar;
    }

    /* renamed from: O */
    public final void mo68512O(C19893f fVar, long j) throws IOException {
        this.f37985b.f37987k.mo68512O(fVar, j);
    }

    public final void close() {
        if (this.f37985b.mo68554j() == 9) {
            C17407s sVar = this.f37985b;
            int i = sVar.f38010b - 1;
            sVar.f38010b = i;
            int[] iArr = sVar.f38013e;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new AssertionError();
    }

    public final void flush() throws IOException {
        this.f37985b.f37987k.flush();
    }

    /* renamed from: m */
    public final C19890d0 mo68515m() {
        return C19890d0.f43871d;
    }
}
