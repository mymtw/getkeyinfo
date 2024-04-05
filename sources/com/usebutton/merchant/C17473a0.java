package com.usebutton.merchant;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.usebutton.merchant.a0 */
public final class C17473a0 implements Executor {

    /* renamed from: b */
    public final Handler f38230b = new Handler(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f38230b.post(runnable);
    }
}
