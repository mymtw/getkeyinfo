package androidx.loader.content;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.support.p013v4.media.C0071c;
import p240t1.C7938a;
import p628nj.C18263b;

public class Loader<D> {

    /* renamed from: a */
    public int f6528a;

    /* renamed from: b */
    public C2896a<D> f6529b;

    /* renamed from: c */
    public boolean f6530c = false;

    /* renamed from: d */
    public boolean f6531d = false;

    /* renamed from: e */
    public boolean f6532e = true;

    /* renamed from: f */
    public boolean f6533f = false;

    public final class ForceLoadContentObserver extends ContentObserver {
        public ForceLoadContentObserver() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            Loader loader = Loader.this;
            if (loader.f6530c) {
                C7938a aVar = (C7938a) loader;
                aVar.mo10843a();
                aVar.f17406h = new C7938a.C7939a();
                aVar.mo20477b();
                return;
            }
            loader.f6533f = true;
        }
    }

    /* renamed from: androidx.loader.content.Loader$a */
    public interface C2896a<D> {
    }

    public Loader(Context context) {
        context.getApplicationContext();
    }

    /* renamed from: a */
    public final void mo10843a() {
        C7938a aVar = (C7938a) this;
        if (aVar.f17406h != null) {
            if (!aVar.f6530c) {
                aVar.f6533f = true;
            }
            if (aVar.f17407i != null) {
                aVar.f17406h.getClass();
                aVar.f17406h = null;
                return;
            }
            aVar.f17406h.getClass();
            C7938a<D>.a aVar2 = aVar.f17406h;
            aVar2.f6539e.set(true);
            if (aVar2.f6537c.cancel(false)) {
                aVar.f17407i = aVar.f17406h;
            }
            aVar.f17406h = null;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        C18263b.m30874w(this, sb);
        sb.append(" id=");
        return C0071c.m191c(sb, this.f6528a, "}");
    }
}
