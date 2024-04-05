package p156k;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import kotlin.reflect.C19421p;

/* renamed from: k.c */
public final class C7161c extends ICustomTabsCallback.Stub {

    /* renamed from: a */
    public Handler f15927a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final /* synthetic */ C19421p f15928b = null;

    /* renamed from: k.c$a */
    public class C7162a implements Runnable {
        public C7162a(int i, Bundle bundle) {
        }

        public final void run() {
            C7161c.this.f15928b.mo71973Y();
            throw null;
        }
    }

    /* renamed from: k.c$b */
    public class C7163b implements Runnable {
        public C7163b(String str, Bundle bundle) {
        }

        public final void run() {
            C7161c.this.f15928b.mo71970G();
            throw null;
        }
    }

    /* renamed from: k.c$c */
    public class C7164c implements Runnable {
        public C7164c(Bundle bundle) {
        }

        public final void run() {
            C7161c.this.f15928b.mo71972X();
            throw null;
        }
    }

    /* renamed from: k.c$d */
    public class C7165d implements Runnable {
        public C7165d(String str, Bundle bundle) {
        }

        public final void run() {
            C7161c.this.f15928b.mo71974Z();
            throw null;
        }
    }

    /* renamed from: k.c$e */
    public class C7166e implements Runnable {
        public C7166e(int i, Uri uri, boolean z, Bundle bundle) {
        }

        public final void run() {
            C7161c.this.f15928b.mo71975a0();
            throw null;
        }
    }

    public final void extraCallback(String str, Bundle bundle) throws RemoteException {
        if (this.f15928b != null) {
            this.f15927a.post(new C7163b(str, bundle));
        }
    }

    public final Bundle extraCallbackWithResult(String str, Bundle bundle) throws RemoteException {
        C19421p pVar = this.f15928b;
        if (pVar == null) {
            return null;
        }
        pVar.mo71971H();
        throw null;
    }

    public final void onMessageChannelReady(Bundle bundle) throws RemoteException {
        if (this.f15928b != null) {
            this.f15927a.post(new C7164c(bundle));
        }
    }

    public final void onNavigationEvent(int i, Bundle bundle) {
        if (this.f15928b != null) {
            this.f15927a.post(new C7162a(i, bundle));
        }
    }

    public final void onPostMessage(String str, Bundle bundle) throws RemoteException {
        if (this.f15928b != null) {
            this.f15927a.post(new C7165d(str, bundle));
        }
    }

    public final void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException {
        if (this.f15928b != null) {
            this.f15927a.post(new C7166e(i, uri, z, bundle));
        }
    }
}
