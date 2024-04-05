package androidx.work;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.C19383o;

public enum DirectExecutor implements Executor {
    INSTANCE;

    public void execute(Runnable runnable) {
        C19383o.m32797g(runnable, "command");
        runnable.run();
    }

    public String toString() {
        return "DirectExecutor";
    }
}
