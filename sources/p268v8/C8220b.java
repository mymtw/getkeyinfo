package p268v8;

import com.cardinalcommerce.shared.p065cs.p067b.C6269d;
import com.google.firebase.messaging.C16584a;
import com.google.firebase.messaging.FirebaseMessaging;
import p605kk.C18122f;
import p605kk.C18123g;

/* renamed from: v8.b */
public final class C8220b implements C18122f {

    /* renamed from: b */
    public String f18046b;

    /* renamed from: c */
    public Object f18047c;

    /* renamed from: d */
    public Object f18048d;

    public /* synthetic */ C8220b(FirebaseMessaging firebaseMessaging, String str, C16584a.C16585a aVar) {
        this.f18047c = firebaseMessaging;
        this.f18046b = str;
        this.f18048d = aVar;
    }

    public /* synthetic */ C8220b(String str, String str2, C6269d dVar) {
        this.f18046b = str;
        this.f18047c = str2;
        this.f18048d = dVar;
    }

    public final C18123g then(Object obj) {
        return ((FirebaseMessaging) this.f18047c).mo59162xa7f5779b(this.f18046b, (C16584a.C16585a) this.f18048d, (String) obj);
    }
}
