package p302z4;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.C6124d;
import p036c5.C4426l;

/* renamed from: z4.c */
public abstract class C8440c<T> implements C8448i<T> {

    /* renamed from: b */
    public final int f18455b;

    /* renamed from: c */
    public final int f18456c;

    /* renamed from: d */
    public C6124d f18457d;

    public C8440c() {
        if (C4426l.m10135i(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            this.f18455b = Integer.MIN_VALUE;
            this.f18456c = Integer.MIN_VALUE;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
    }

    /* renamed from: a */
    public final void mo16749a(C8447h hVar) {
        hVar.mo17122b(this.f18455b, this.f18456c);
    }

    /* renamed from: c */
    public final void mo16751c(Drawable drawable) {
    }

    /* renamed from: g */
    public final void mo16753g(C6124d dVar) {
        this.f18457d = dVar;
    }

    public final C6124d getRequest() {
        return this.f18457d;
    }

    /* renamed from: i */
    public final void mo16755i(Drawable drawable) {
    }

    /* renamed from: j */
    public final void mo16756j(C8447h hVar) {
    }

    public final void onDestroy() {
    }

    public final void onStart() {
    }

    public final void onStop() {
    }
}
