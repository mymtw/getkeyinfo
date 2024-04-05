package androidx.activity.result;

import androidx.activity.result.C0123f;
import androidx.lifecycle.C2885q;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;
import p019b.C3443a;

class ActivityResultRegistry$1 implements C2885q {

    /* renamed from: b */
    public final /* synthetic */ String f189b;

    /* renamed from: c */
    public final /* synthetic */ C0118a f190c;

    /* renamed from: d */
    public final /* synthetic */ C3443a f191d;

    /* renamed from: e */
    public final /* synthetic */ C0123f f192e;

    public ActivityResultRegistry$1(C0123f fVar, String str, C0118a aVar, C3443a aVar2) {
        this.f192e = fVar;
        this.f189b = str;
        this.f190c = aVar;
        this.f191d = aVar2;
    }

    public final void onStateChanged(C2887s sVar, Lifecycle.Event event) {
        if (Lifecycle.Event.ON_START.equals(event)) {
            this.f192e.f206f.put(this.f189b, new C0123f.C0124a(this.f191d, this.f190c));
            if (this.f192e.f207g.containsKey(this.f189b)) {
                Object obj = this.f192e.f207g.get(this.f189b);
                this.f192e.f207g.remove(this.f189b);
                this.f190c.mo413a(obj);
            }
            ActivityResult activityResult = (ActivityResult) this.f192e.f208h.getParcelable(this.f189b);
            if (activityResult != null) {
                this.f192e.f208h.remove(this.f189b);
                this.f190c.mo413a(this.f191d.mo1147c(activityResult.getResultCode(), activityResult.getData()));
            }
        } else if (Lifecycle.Event.ON_STOP.equals(event)) {
            this.f192e.f206f.remove(this.f189b);
        } else if (Lifecycle.Event.ON_DESTROY.equals(event)) {
            this.f192e.mo1163f(this.f189b);
        }
    }
}
