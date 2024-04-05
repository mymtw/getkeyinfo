package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class CombineContinuationsWorker extends Worker {
    public CombineContinuationsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* renamed from: h */
    public final ListenableWorker.C3367a mo12834h() {
        return new ListenableWorker.C3367a.C3370c(this.f7854c.f7863b);
    }
}
