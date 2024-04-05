package p594jh;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import p594jh.C17921i1;

/* renamed from: jh.b */
public final class C17890b {

    /* renamed from: a */
    public final Context f38852a;

    /* renamed from: b */
    public final C17891a f38853b;

    /* renamed from: c */
    public boolean f38854c;

    /* renamed from: jh.b$a */
    public final class C17891a extends BroadcastReceiver implements Runnable {

        /* renamed from: b */
        public final C17892b f38855b;

        /* renamed from: c */
        public final Handler f38856c;

        public C17891a(Handler handler, C17921i1.C17923b bVar) {
            this.f38856c = handler;
            this.f38855b = bVar;
        }

        public final void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f38856c.post(this);
            }
        }

        public final void run() {
            if (C17890b.this.f38854c) {
                C17921i1.this.mo69405X(-1, 3, false);
            }
        }
    }

    /* renamed from: jh.b$b */
    public interface C17892b {
    }

    public C17890b(Context context, Handler handler, C17921i1.C17923b bVar) {
        this.f38852a = context.getApplicationContext();
        this.f38853b = new C17891a(handler, bVar);
    }

    /* renamed from: a */
    public final void mo69357a() {
        if (this.f38854c) {
            this.f38852a.unregisterReceiver(this.f38853b);
            this.f38854c = false;
        }
    }
}
