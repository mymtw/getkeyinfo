package com.google.android.play.core.assetpacks;

import android.util.Log;
import com.google.firebase.messaging.C16588c;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: com.google.android.play.core.assetpacks.v1 */
public final /* synthetic */ class C15664v1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f35376b;

    /* renamed from: c */
    public /* synthetic */ Object f35377c;

    public /* synthetic */ C15664v1(Object obj, int i) {
        this.f35376b = i;
        this.f35377c = obj;
    }

    public final void run() {
        switch (this.f35376b) {
            case 0:
                C15583b0 b0Var = (C15583b0) this.f35377c;
                Iterator it = b0Var.mo55379e().iterator();
                while (it.hasNext()) {
                    File file = (File) it.next();
                    if (file.listFiles() != null) {
                        C15583b0.m25255f(file);
                        long b = C15583b0.m25254b(file, false);
                        if (((long) b0Var.f35068b.mo55388a()) != b) {
                            try {
                                new File(new File(file, String.valueOf(b)), "stale.tmp").createNewFile();
                            } catch (IOException unused) {
                                C15583b0.f35066c.mo52243c("Could not write staleness marker.", new Object[0]);
                            }
                        }
                        for (File f : file.listFiles()) {
                            C15583b0.m25255f(f);
                        }
                    }
                }
                return;
            case 1:
                ((FirebaseMessaging) this.f35377c).m35114lambda$new$0$comgooglefirebasemessagingFirebaseMessaging();
                return;
            default:
                C16588c.C16589a aVar = (C16588c.C16589a) this.f35377c;
                String action = aVar.f36807a.getAction();
                StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
                sb.append("Service took too long to process intent: ");
                sb.append(action);
                sb.append(" App may get closed.");
                Log.w("FirebaseMessaging", sb.toString());
                aVar.f36808b.mo69680d(null);
                return;
        }
    }
}
