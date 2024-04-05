package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.C3419a;

public abstract class Worker extends ListenableWorker {

    /* renamed from: g */
    public C3419a<ListenableWorker.C3367a> f7861g;

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* renamed from: f */
    public final C3419a mo12813f() {
        this.f7861g = new C3419a<>();
        this.f7854c.f7865d.execute(new C3440s(this));
        return this.f7861g;
    }

    /* renamed from: h */
    public abstract ListenableWorker.C3367a mo12834h();
}
