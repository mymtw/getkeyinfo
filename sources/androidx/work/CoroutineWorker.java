package androidx.work;

import android.content.Context;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.AbstractFuture;
import androidx.work.impl.utils.futures.C3419a;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.common.util.concurrent.C16388l;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19707i1;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.internal.C19721f;
import p090e3.C6713b;
import p768rq.C20153b;

public abstract class CoroutineWorker extends ListenableWorker {

    /* renamed from: g */
    public final C19707i1 f7849g = C1993m.m4368l();

    /* renamed from: h */
    public final C3419a<ListenableWorker.C3367a> f7850h;

    /* renamed from: i */
    public final C20153b f7851i;

    /* renamed from: androidx.work.CoroutineWorker$a */
    public static final class C3366a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ CoroutineWorker f7852b;

        public C3366a(CoroutineWorker coroutineWorker) {
            this.f7852b = coroutineWorker;
        }

        public final void run() {
            if (this.f7852b.f7850h.f7992b instanceof AbstractFuture.C3413b) {
                this.f7852b.f7849g.mo72134a((CancellationException) null);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C19383o.m32797g(context, "appContext");
        C19383o.m32797g(workerParameters, ResponseConstants.PARAMS);
        C3419a<ListenableWorker.C3367a> aVar = new C3419a<>();
        this.f7850h = aVar;
        aVar.mo7981e(new C3366a(this), ((C6713b) this.f7854c.f7866e).f14803a);
        this.f7851i = C19760n0.f43719a;
    }

    /* renamed from: a */
    public final C16388l<C3382f> mo12811a() {
        C19707i1 l = C1993m.m4368l();
        C19721f a = C19697g.m33463a(this.f7851i.plus(l));
        C3420j jVar = new C3420j(l);
        C19697g.m33468f(a, (CoroutineContext) null, (CoroutineStart) null, new CoroutineWorker$getForegroundInfoAsync$1(jVar, this, (C19340c<? super CoroutineWorker$getForegroundInfoAsync$1>) null), 3);
        return jVar;
    }

    /* renamed from: d */
    public final void mo12812d() {
        this.f7850h.cancel(false);
    }

    /* renamed from: f */
    public final C3419a mo12813f() {
        C19697g.m33468f(C19697g.m33463a(this.f7851i.plus(this.f7849g)), (CoroutineContext) null, (CoroutineStart) null, new CoroutineWorker$startWork$1(this, (C19340c<? super CoroutineWorker$startWork$1>) null), 3);
        return this.f7850h;
    }

    /* renamed from: h */
    public abstract Object mo12814h();
}
