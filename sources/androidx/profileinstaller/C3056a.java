package androidx.profileinstaller;

import java.io.Serializable;

/* renamed from: androidx.profileinstaller.a */
public final /* synthetic */ class C3056a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C3057b f6955b;

    /* renamed from: c */
    public final /* synthetic */ int f6956c;

    /* renamed from: d */
    public final /* synthetic */ Object f6957d;

    public /* synthetic */ C3056a(C3057b bVar, int i, Serializable serializable) {
        this.f6955b = bVar;
        this.f6956c = i;
        this.f6957d = serializable;
    }

    public final void run() {
        C3057b bVar = this.f6955b;
        bVar.f6960c.mo11216a(this.f6956c, this.f6957d);
    }
}
