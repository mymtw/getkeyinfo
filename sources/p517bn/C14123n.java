package p517bn;

import com.google.firebase.messaging.FirebaseMessaging;
import p706wm.C18749a;
import p706wm.C18750b;

/* renamed from: bn.n */
public final /* synthetic */ class C14123n implements C18750b {

    /* renamed from: a */
    public /* synthetic */ FirebaseMessaging.C16582a f31110a;

    public /* synthetic */ C14123n(FirebaseMessaging.C16582a aVar) {
        this.f31110a = aVar;
    }

    /* renamed from: a */
    public final void mo47005a(C18749a aVar) {
        boolean booleanValue;
        FirebaseMessaging.C16582a aVar2 = this.f31110a;
        synchronized (aVar2) {
            aVar2.mo59179a();
            Boolean bool = aVar2.f36792d;
            booleanValue = bool != null ? bool.booleanValue() : FirebaseMessaging.this.firebaseApp.mo69025f();
        }
        if (booleanValue) {
            FirebaseMessaging.this.startSyncIfNecessary();
        }
    }
}
