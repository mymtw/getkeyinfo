package p774vq;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import p770sq.C20169c;
import p775wq.C20218a;

/* renamed from: vq.i */
public final class C20214i extends C20211f {

    /* renamed from: b */
    public Handler f44823b;

    /* renamed from: c */
    public C20206a f44824c = new C20206a();

    /* renamed from: d */
    public C20169c f44825d;

    /* renamed from: e */
    public C20213h f44826e;

    public C20214i(C20213h hVar, C20169c cVar, Handler handler) {
        this.f44823b = handler;
        this.f44826e = hVar;
        this.f44825d = cVar;
        cVar.getClass();
    }

    public final void run() {
        Message message;
        Handler handler;
        if (this.f44823b != null) {
            try {
                this.f44824c.getClass();
                C20218a a = C20206a.m34556a("GET");
                this.f44826e.getClass();
                a.mo74457d(Uri.parse("https://www.paypalobjects.com/digitalassets/c/rda-magnes/magnes_android_rc_v1.json"));
                Handler handler2 = this.f44823b;
                if (handler2 != null) {
                    handler2.sendMessage(Message.obtain(handler2, 50, this.f44826e));
                }
                int a2 = a.mo74454a((byte[]) null);
                String str = new String(a.mo74458e(), "UTF-8");
                if (a2 == 200) {
                    C20213h hVar = this.f44826e;
                    Context context = this.f44825d.f44673b;
                    hVar.getClass();
                    C20213h.m34570a(context, str);
                    handler = this.f44823b;
                    if (handler != null) {
                        message = Message.obtain(handler, 52, str);
                    } else {
                        return;
                    }
                } else {
                    handler = this.f44823b;
                    if (handler != null) {
                        message = Message.obtain(handler, 51, a2 + " : " + str);
                    } else {
                        return;
                    }
                }
                handler.sendMessage(message);
            } catch (Exception e) {
                Handler handler3 = this.f44823b;
                if (handler3 != null) {
                    handler3.sendMessage(Message.obtain(handler3, 51, e));
                }
            }
        }
    }
}
