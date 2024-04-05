package com.google.android.gms.common.api.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

final /* synthetic */ class zabc implements Executor {
    private final Handler zaa;

    private zabc(Handler handler) {
        this.zaa = handler;
    }

    public static Executor zaa(Handler handler) {
        return new zabc(handler);
    }

    public final void execute(Runnable runnable) {
        this.zaa.post(runnable);
    }
}
