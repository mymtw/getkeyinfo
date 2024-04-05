package p145io.branch.referral;

import android.os.AsyncTask;

/* renamed from: io.branch.referral.BranchAsyncTask */
public abstract class BranchAsyncTask<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> {
    public final AsyncTask<Params, Progress, Result> executeTask(Params... paramsArr) {
        try {
            return executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, paramsArr);
        } catch (Exception unused) {
            return execute(paramsArr);
        }
    }
}
