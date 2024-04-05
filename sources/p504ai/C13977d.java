package p504ai;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import p504ai.C13978e;

/* renamed from: ai.d */
public final class C13977d extends Handler {

    /* renamed from: a */
    public final /* synthetic */ C13978e f30713a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13977d(C13978e eVar, Looper looper) {
        super(looper);
        this.f30713a = eVar;
    }

    public final void handleMessage(Message message) {
        C13978e.C13979a aVar;
        C13978e eVar = this.f30713a;
        eVar.getClass();
        int i = message.what;
        if (i == 0) {
            aVar = (C13978e.C13979a) message.obj;
            try {
                eVar.f30716a.queueInputBuffer(aVar.f30723a, aVar.f30724b, aVar.f30725c, aVar.f30727e, aVar.f30728f);
            } catch (RuntimeException e) {
                eVar.f30719d.set(e);
            }
        } else if (i != 1) {
            if (i != 2) {
                eVar.f30719d.set(new IllegalStateException(String.valueOf(message.what)));
            } else {
                eVar.f30720e.mo46870a();
            }
            aVar = null;
        } else {
            aVar = (C13978e.C13979a) message.obj;
            int i2 = aVar.f30723a;
            int i3 = aVar.f30724b;
            MediaCodec.CryptoInfo cryptoInfo = aVar.f30726d;
            long j = aVar.f30727e;
            int i4 = aVar.f30728f;
            try {
                if (eVar.f30721f) {
                    synchronized (C13978e.f30715i) {
                        eVar.f30716a.queueSecureInputBuffer(i2, i3, cryptoInfo, j, i4);
                    }
                } else {
                    eVar.f30716a.queueSecureInputBuffer(i2, i3, cryptoInfo, j, i4);
                }
            } catch (RuntimeException e2) {
                eVar.f30719d.set(e2);
            }
        }
        if (aVar != null) {
            ArrayDeque<C13978e.C13979a> arrayDeque = C13978e.f30714h;
            synchronized (arrayDeque) {
                arrayDeque.add(aVar);
            }
        }
    }
}
