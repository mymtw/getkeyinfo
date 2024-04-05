package p595ji;

import com.google.android.exoplayer2.source.C14347j;
import java.io.IOException;

/* renamed from: ji.h */
public final /* synthetic */ class C17996h implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C14347j.C14348a f39356b;

    /* renamed from: c */
    public final /* synthetic */ C14347j f39357c;

    /* renamed from: d */
    public final /* synthetic */ C17992d f39358d;

    /* renamed from: e */
    public final /* synthetic */ C17993e f39359e;

    /* renamed from: f */
    public final /* synthetic */ IOException f39360f;

    /* renamed from: g */
    public final /* synthetic */ boolean f39361g;

    public /* synthetic */ C17996h(C14347j.C14348a aVar, C14347j jVar, C17992d dVar, C17993e eVar, IOException iOException, boolean z) {
        this.f39356b = aVar;
        this.f39357c = jVar;
        this.f39358d = dVar;
        this.f39359e = eVar;
        this.f39360f = iOException;
        this.f39361g = z;
    }

    public final void run() {
        C14347j.C14348a aVar = this.f39356b;
        this.f39357c.mo47692z(aVar.f32161a, aVar.f32162b, this.f39358d, this.f39359e, this.f39360f, this.f39361g);
    }
}
