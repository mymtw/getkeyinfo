package com.usebutton.merchant;

import android.content.Intent;
import com.braze.C5380a;
import com.usebutton.merchant.exception.ApplicationIdNotFoundException;

/* renamed from: com.usebutton.merchant.d */
public final class C17478d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C5380a f38235b;

    public C17478d(C5380a aVar) {
        this.f38235b = aVar;
    }

    public final void run() {
        this.f38235b.mo15806b((Intent) null, new ApplicationIdNotFoundException());
    }
}
