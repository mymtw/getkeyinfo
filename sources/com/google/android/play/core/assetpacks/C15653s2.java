package com.google.android.play.core.assetpacks;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.play.core.assetpacks.s2 */
public final /* synthetic */ class C15653s2 implements ThreadFactory {

    /* renamed from: b */
    public static final /* synthetic */ C15653s2 f35332b = new C15653s2();

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AssetPackBackgroundExecutor");
    }
}
