package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C19383o;

public final class JobCancellationException extends CancellationException {
    public final C19699g1 job;

    public JobCancellationException(String str, Throwable th, C19699g1 g1Var) {
        super(str);
        this.job = g1Var;
        if (th != null) {
            initCause(th);
        }
    }

    public JobCancellationException createCopy() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof JobCancellationException) {
                JobCancellationException jobCancellationException = (JobCancellationException) obj;
                if (!C19383o.m32792b(jobCancellationException.getMessage(), getMessage()) || !C19383o.m32792b(jobCancellationException.job, this.job) || !C19383o.m32792b(jobCancellationException.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        C19383o.m32794d(message);
        int hashCode = (this.job.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause == null ? 0 : cause.hashCode());
    }

    public String toString() {
        return super.toString() + "; job=" + this.job;
    }
}
