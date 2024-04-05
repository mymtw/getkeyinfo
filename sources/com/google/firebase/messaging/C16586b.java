package com.google.firebase.messaging;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import androidx.compose.runtime.C1353o0;
import com.google.firebase.messaging.C16588c;
import com.google.firebase.messaging.EnhancedIntentService;
import p517bn.C14116g0;

/* renamed from: com.google.firebase.messaging.b */
public final class C16586b extends Binder {

    /* renamed from: b */
    public static final /* synthetic */ int f36799b = 0;

    /* renamed from: a */
    public final C16587a f36800a;

    /* renamed from: com.google.firebase.messaging.b$a */
    public interface C16587a {
    }

    public C16586b(EnhancedIntentService.C16581a aVar) {
        this.f36800a = aVar;
    }

    /* renamed from: a */
    public final void mo59202a(C16588c.C16589a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            C16587a aVar2 = this.f36800a;
            EnhancedIntentService.this.processIntent(aVar.f36807a).mo69655b(C14116g0.f31101b, new C1353o0((Object) aVar));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
