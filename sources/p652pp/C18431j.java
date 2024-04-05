package p652pp;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.play.core.assetpacks.C15588c1;

/* renamed from: pp.j */
public final class C18431j extends Handler {

    /* renamed from: a */
    public final /* synthetic */ C18432k f40525a;

    public C18431j(C18432k kVar) {
        this.f40525a = kVar;
    }

    public final void handleMessage(Message message) {
        Object obj = message.obj;
        if (obj instanceof C18445w) {
            C18445w wVar = (C18445w) obj;
            C15588c1 c1Var = this.f40525a.f40539m;
            if (c1Var != null) {
                c1Var.mo21278B0(wVar.f40553m);
                return;
            }
            int i = C18432k.f40526o;
            Log.d("pp.k", "could not call onTextMessage() .. handler already NULL");
        } else if (obj instanceof C18443u) {
            C18443u uVar = (C18443u) obj;
            if (this.f40525a.f40539m != null) {
                byte[] bArr = uVar.f40552m;
                return;
            }
            int i2 = C18432k.f40526o;
            Log.d("pp.k", "could not call onRawTextMessage() .. handler already NULL");
        } else if (obj instanceof C18434l) {
            C18434l lVar = (C18434l) obj;
            if (this.f40525a.f40539m != null) {
                byte[] bArr2 = lVar.f40542m;
                return;
            }
            int i3 = C18432k.f40526o;
            Log.d("pp.k", "could not call onBinaryMessage() .. handler already NULL");
        } else if (obj instanceof C18439q) {
            int i4 = C18432k.f40526o;
            Log.d("pp.k", "WebSockets Ping received");
            C18440r rVar = new C18440r();
            rVar.f40551m = ((C18439q) obj).f40550m;
            this.f40525a.f40529c.forward(rVar);
        } else if (obj instanceof C18440r) {
            C18440r rVar2 = (C18440r) obj;
            int i5 = C18432k.f40526o;
            Log.d("pp.k", "WebSockets Pong received");
        } else if (obj instanceof C18436n) {
            C18436n nVar = (C18436n) obj;
            int i6 = C18432k.f40526o;
            Log.d("pp.k", "WebSockets Close received (" + nVar.f40547m + " - " + nVar.f40548n + ")");
            this.f40525a.f40529c.forward(new C18436n(0));
        } else if (obj instanceof C18444v) {
            C18444v vVar = (C18444v) obj;
            int i7 = C18432k.f40526o;
            Log.d("pp.k", "opening handshake received");
            if (this.f40525a.f40539m == null) {
                Log.d("pp.k", "could not call onOpen() .. handler already NULL");
            }
        } else if (obj instanceof C18437o) {
            C18437o oVar = (C18437o) obj;
            C18432k.m31130a(this.f40525a, 3, "WebSockets connection lost");
        } else if (obj instanceof C18441s) {
            C18441s sVar = (C18441s) obj;
            C18432k.m31130a(this.f40525a, 4, "WebSockets protocol violation");
        } else if (obj instanceof C18438p) {
            C18432k kVar = this.f40525a;
            C18432k.m31130a(kVar, 5, "WebSockets internal error (" + ((C18438p) obj).f40549m.toString() + ")");
        } else {
            this.f40525a.getClass();
        }
    }
}
