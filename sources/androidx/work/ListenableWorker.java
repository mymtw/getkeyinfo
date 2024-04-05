package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.p013v4.media.C0072d;
import androidx.annotation.Keep;
import androidx.work.impl.utils.futures.C3419a;
import com.google.common.util.concurrent.C16388l;

public abstract class ListenableWorker {

    /* renamed from: b */
    public Context f7853b;

    /* renamed from: c */
    public WorkerParameters f7854c;

    /* renamed from: d */
    public volatile boolean f7855d;

    /* renamed from: e */
    public boolean f7856e;

    /* renamed from: f */
    public boolean f7857f;

    /* renamed from: androidx.work.ListenableWorker$a */
    public static abstract class C3367a {

        /* renamed from: androidx.work.ListenableWorker$a$a */
        public static final class C3368a extends C3367a {

            /* renamed from: a */
            public final C3380e f7858a = C3380e.f7898c;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C3368a.class != obj.getClass()) {
                    return false;
                }
                return this.f7858a.equals(((C3368a) obj).f7858a);
            }

            public final int hashCode() {
                return this.f7858a.hashCode() + (C3368a.class.getName().hashCode() * 31);
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("Failure {mOutputData=");
                h.append(this.f7858a);
                h.append('}');
                return h.toString();
            }
        }

        /* renamed from: androidx.work.ListenableWorker$a$b */
        public static final class C3369b extends C3367a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && C3369b.class == obj.getClass();
            }

            public final int hashCode() {
                return C3369b.class.getName().hashCode();
            }

            public final String toString() {
                return "Retry";
            }
        }

        /* renamed from: androidx.work.ListenableWorker$a$c */
        public static final class C3370c extends C3367a {

            /* renamed from: a */
            public final C3380e f7859a;

            public C3370c() {
                this(C3380e.f7898c);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C3370c.class != obj.getClass()) {
                    return false;
                }
                return this.f7859a.equals(((C3370c) obj).f7859a);
            }

            public final int hashCode() {
                return this.f7859a.hashCode() + (C3370c.class.getName().hashCode() * 31);
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("Success {mOutputData=");
                h.append(this.f7859a);
                h.append('}');
                return h.toString();
            }

            public C3370c(C3380e eVar) {
                this.f7859a = eVar;
            }
        }
    }

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.f7853b = context;
            this.f7854c = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    /* renamed from: a */
    public C16388l<C3382f> mo12811a() {
        C3419a aVar = new C3419a();
        aVar.mo12918j(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return aVar;
    }

    /* renamed from: c */
    public boolean mo12822c() {
        return this.f7857f;
    }

    /* renamed from: d */
    public void mo12812d() {
    }

    /* renamed from: f */
    public abstract C3419a mo12813f();

    /* renamed from: g */
    public final void mo12823g() {
        this.f7855d = true;
        mo12812d();
    }
}
