package p774vq;

import android.os.Handler;
import android.os.Message;
import java.io.IOException;
import org.json.JSONObject;
import p773uq.C20205a;

/* renamed from: vq.k */
public final class C20216k extends C20211f {

    /* renamed from: b */
    public Handler f44833b;

    /* renamed from: c */
    public C20215j f44834c;

    public C20216k(Handler handler, C20215j jVar) {
        this.f44833b = handler;
        this.f44834c = jVar;
    }

    public final void run() {
        C20205a.m34554a("entering LoadRemoteConfigRequest.", 0, C20216k.class);
        Handler handler = this.f44833b;
        if (handler != null) {
            try {
                handler.sendMessage(Message.obtain(handler, 10, "https://www.paypalobjects.com/digitalassets/c/rda-magnes/magnes_config_android_v4.json"));
                this.f44834c.getClass();
                String a = C20215j.m34573a();
                if (!a.isEmpty()) {
                    JSONObject jSONObject = new JSONObject(a);
                    this.f44834c.mo74462b(a);
                    C20215j jVar = this.f44834c;
                    jVar.f44829c = jSONObject;
                    jVar.mo74468i();
                    if (jSONObject.optJSONArray("nc") != null) {
                        this.f44834c.f44831e = true;
                    }
                    Handler handler2 = this.f44833b;
                    handler2.sendMessage(Message.obtain(handler2, 12, a));
                    C20205a.m34554a("leaving LoadRemoteConfigRequest.", 0, C20216k.class);
                    return;
                }
                throw new IOException("no valid remote config found!");
            } catch (Exception e) {
                C20205a.m34555b(e, C20216k.class);
                Handler handler3 = this.f44833b;
                handler3.sendMessage(Message.obtain(handler3, 11, e));
            }
        }
    }
}
