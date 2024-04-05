package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.bumptech.glide.load.engine.v */
public final class C6054v {

    /* renamed from: a */
    public boolean f13033a;

    /* renamed from: b */
    public final Handler f13034b = new Handler(Looper.getMainLooper(), new C6055a());

    /* renamed from: com.bumptech.glide.load.engine.v$a */
    public static final class C6055a implements Handler.Callback {
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((C6051s) message.obj).mo16990b();
            return true;
        }
    }

    /* renamed from: a */
    public final synchronized void mo17001a(C6051s<?> sVar, boolean z) {
        if (!this.f13033a) {
            if (!z) {
                this.f13033a = true;
                sVar.mo16990b();
                this.f13033a = false;
            }
        }
        this.f13034b.obtainMessage(1, sVar).sendToTarget();
    }
}
