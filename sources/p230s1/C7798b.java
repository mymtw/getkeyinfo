package p230s1;

import android.os.Bundle;
import android.support.p013v4.media.C0069a;
import androidx.appcompat.widget.C0326j;
import androidx.lifecycle.C2843a0;
import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2870k0;
import androidx.lifecycle.C2878l0;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.C2895z;
import androidx.loader.content.Loader;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.io.PrintWriter;
import p193o.C7507j;
import p230s1.C7796a;
import p240t1.C7938a;
import p588ij.C17843b;
import p628nj.C18263b;

/* renamed from: s1.b */
public final class C7798b extends C7796a {

    /* renamed from: a */
    public final C2887s f17237a;

    /* renamed from: b */
    public final C7801c f17238b;

    /* renamed from: s1.b$a */
    public static class C7799a<D> extends C2895z<D> implements Loader.C2896a<D> {

        /* renamed from: a */
        public final int f17239a = 0;

        /* renamed from: b */
        public final Bundle f17240b = null;

        /* renamed from: c */
        public final Loader<D> f17241c;

        /* renamed from: d */
        public C2887s f17242d;

        /* renamed from: e */
        public C7800b<D> f17243e;

        /* renamed from: f */
        public Loader<D> f17244f;

        public C7799a(C17843b bVar) {
            this.f17241c = bVar;
            this.f17244f = null;
            if (bVar.f6529b == null) {
                bVar.f6529b = this;
                bVar.f6528a = 0;
                return;
            }
            throw new IllegalStateException("There is already a listener registered");
        }

        /* renamed from: a */
        public final void mo20343a() {
            C2887s sVar = this.f17242d;
            C7800b<D> bVar = this.f17243e;
            if (sVar != null && bVar != null) {
                super.removeObserver(bVar);
                observe(sVar, bVar);
            }
        }

        public final void onActive() {
            Loader<D> loader = this.f17241c;
            loader.f6530c = true;
            loader.f6532e = false;
            loader.f6531d = false;
            C17843b bVar = (C17843b) loader;
            bVar.f38757j.drainPermits();
            bVar.mo10843a();
            bVar.f17406h = new C7938a.C7939a();
            bVar.mo20477b();
        }

        public final void onInactive() {
            this.f17241c.f6530c = false;
        }

        public final void removeObserver(C2843a0<? super D> a0Var) {
            super.removeObserver(a0Var);
            this.f17242d = null;
            this.f17243e = null;
        }

        public final void setValue(D d) {
            super.setValue(d);
            Loader<D> loader = this.f17244f;
            if (loader != null) {
                loader.f6532e = true;
                loader.f6530c = false;
                loader.f6531d = false;
                loader.f6533f = false;
                this.f17244f = null;
            }
        }

        public final String toString() {
            StringBuilder g = C0069a.m176g(64, "LoaderInfo{");
            g.append(Integer.toHexString(System.identityHashCode(this)));
            g.append(" #");
            g.append(this.f17239a);
            g.append(" : ");
            C18263b.m30874w(this.f17241c, g);
            g.append("}}");
            return g.toString();
        }
    }

    /* renamed from: s1.b$b */
    public static class C7800b<D> implements C2843a0<D> {

        /* renamed from: b */
        public final C7796a.C7797a<D> f17245b;

        /* renamed from: c */
        public boolean f17246c = false;

        public C7800b(Loader loader, SignInHubActivity.C14450a aVar) {
            this.f17245b = aVar;
        }

        public final void onChanged(D d) {
            SignInHubActivity.C14450a aVar = (SignInHubActivity.C14450a) this.f17245b;
            SignInHubActivity signInHubActivity = SignInHubActivity.this;
            signInHubActivity.setResult(signInHubActivity.zzbx, SignInHubActivity.this.zzby);
            SignInHubActivity.this.finish();
            this.f17246c = true;
        }

        public final String toString() {
            return this.f17245b.toString();
        }
    }

    /* renamed from: s1.b$c */
    public static class C7801c extends C2866i0 {

        /* renamed from: d */
        public static final C7802a f17247d = new C7802a();

        /* renamed from: b */
        public C7507j<C7799a> f17248b = new C7507j<>();

        /* renamed from: c */
        public boolean f17249c = false;

        /* renamed from: s1.b$c$a */
        public static class C7802a implements C2870k0.C2872b {
            public final <T extends C2866i0> T create(Class<T> cls) {
                return new C7801c();
            }
        }

        public final void onCleared() {
            super.onCleared();
            int i = this.f17248b.mo19995i();
            int i2 = 0;
            while (i2 < i) {
                C7799a j = this.f17248b.mo19996j(i2);
                j.f17241c.mo10843a();
                j.f17241c.f6531d = true;
                C7800b<D> bVar = j.f17243e;
                if (bVar != null) {
                    j.removeObserver(bVar);
                    if (bVar.f17246c) {
                        bVar.f17245b.getClass();
                    }
                }
                Loader<D> loader = j.f17241c;
                Loader.C2896a<D> aVar = loader.f6529b;
                if (aVar == null) {
                    throw new IllegalStateException("No listener register");
                } else if (aVar == j) {
                    loader.f6529b = null;
                    loader.f6532e = true;
                    loader.f6530c = false;
                    loader.f6531d = false;
                    loader.f6533f = false;
                    i2++;
                } else {
                    throw new IllegalArgumentException("Attempting to unregister the wrong listener");
                }
            }
            C7507j<C7799a> jVar = this.f17248b;
            int i3 = jVar.f16750e;
            Object[] objArr = jVar.f16749d;
            for (int i4 = 0; i4 < i3; i4++) {
                objArr[i4] = null;
            }
            jVar.f16750e = 0;
            jVar.f16747b = false;
        }
    }

    public C7798b(C2887s sVar, C2878l0 l0Var) {
        this.f17237a = sVar;
        this.f17238b = (C7801c) new C2870k0(l0Var, (C2870k0.C2872b) C7801c.f17247d).mo10829a(C7801c.class);
    }

    @Deprecated
    /* renamed from: b */
    public final void mo20341b(String str, PrintWriter printWriter) {
        C7801c cVar = this.f17238b;
        if (cVar.f17248b.mo19995i() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < cVar.f17248b.mo19995i(); i++) {
                C7799a j = cVar.f17248b.mo19996j(i);
                printWriter.print(str);
                printWriter.print("  #");
                C7507j<C7799a> jVar = cVar.f17248b;
                if (jVar.f16747b) {
                    jVar.mo19992d();
                }
                printWriter.print(jVar.f16748c[i]);
                printWriter.print(": ");
                printWriter.println(j.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(j.f17239a);
                printWriter.print(" mArgs=");
                printWriter.println(j.f17240b);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(j.f17241c);
                Loader<D> loader = j.f17241c;
                String i2 = C0326j.m864i(str2, "  ");
                C7938a aVar = (C7938a) loader;
                aVar.getClass();
                printWriter.print(i2);
                printWriter.print("mId=");
                printWriter.print(aVar.f6528a);
                printWriter.print(" mListener=");
                printWriter.println(aVar.f6529b);
                if (aVar.f6530c || aVar.f6533f) {
                    printWriter.print(i2);
                    printWriter.print("mStarted=");
                    printWriter.print(aVar.f6530c);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(aVar.f6533f);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (aVar.f6531d || aVar.f6532e) {
                    printWriter.print(i2);
                    printWriter.print("mAbandoned=");
                    printWriter.print(aVar.f6531d);
                    printWriter.print(" mReset=");
                    printWriter.println(aVar.f6532e);
                }
                if (aVar.f17406h != null) {
                    printWriter.print(i2);
                    printWriter.print("mTask=");
                    printWriter.print(aVar.f17406h);
                    printWriter.print(" waiting=");
                    aVar.f17406h.getClass();
                    printWriter.println(false);
                }
                if (aVar.f17407i != null) {
                    printWriter.print(i2);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(aVar.f17407i);
                    printWriter.print(" waiting=");
                    aVar.f17407i.getClass();
                    printWriter.println(false);
                }
                if (j.f17243e != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(j.f17243e);
                    C7800b<D> bVar = j.f17243e;
                    bVar.getClass();
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(bVar.f17246c);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                Loader<D> loader2 = j.f17241c;
                Object value = j.getValue();
                loader2.getClass();
                StringBuilder sb = new StringBuilder(64);
                C18263b.m30874w(value, sb);
                sb.append("}");
                printWriter.println(sb.toString());
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(j.hasActiveObservers());
            }
        }
    }

    public final String toString() {
        StringBuilder g = C0069a.m176g(128, "LoaderManager{");
        g.append(Integer.toHexString(System.identityHashCode(this)));
        g.append(" in ");
        C18263b.m30874w(this.f17237a, g);
        g.append("}}");
        return g.toString();
    }
}
