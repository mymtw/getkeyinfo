package com.google.android.play.core.assetpacks;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.play.core.assetpacks.t2 */
public final /* synthetic */ class C15657t2 implements ThreadFactory {

    /* renamed from: b */
    public static final /* synthetic */ C15657t2 f35340b = new C15657t2();

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "UpdateListenerExecutor");
    }
}
