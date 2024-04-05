package androidx.emoji2.text;

import java.util.concurrent.ThreadFactory;

/* renamed from: androidx.emoji2.text.a */
public final /* synthetic */ class C2658a implements ThreadFactory {

    /* renamed from: b */
    public final /* synthetic */ String f6001b;

    public /* synthetic */ C2658a(String str) {
        this.f6001b = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f6001b);
        thread.setPriority(10);
        return thread;
    }
}
