package com.appsflyer.internal;

import android.net.TrafficStats;
import com.appsflyer.AFLogger;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.appsflyer.internal.l */
public final class C5097l {
    public static C5097l AFInAppEventType;
    public Executor AFInAppEventParameterName;
    public ScheduledExecutorService AFKeystoreWrapper;
    public final ThreadFactory valueOf = new ThreadFactory() {
        public final Thread newThread(final Runnable runnable) {
            return new Thread(new Runnable() {
                public final void run() {
                    TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
                    runnable.run();
                }
            });
        }
    };
    public ScheduledExecutorService values;

    public final ScheduledThreadPoolExecutor AFInAppEventType() {
        ScheduledExecutorService scheduledExecutorService = this.values;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown() || this.values.isTerminated()) {
            this.values = Executors.newScheduledThreadPool(2, this.valueOf);
        }
        return (ScheduledThreadPoolExecutor) this.values;
    }

    public final Executor valueOf() {
        Executor executor = this.AFInAppEventParameterName;
        if (executor == null || ((executor instanceof ThreadPoolExecutor) && (((ThreadPoolExecutor) executor).isShutdown() || ((ThreadPoolExecutor) this.AFInAppEventParameterName).isTerminated() || ((ThreadPoolExecutor) this.AFInAppEventParameterName).isTerminating()))) {
            this.AFInAppEventParameterName = Executors.newFixedThreadPool(2, this.valueOf);
        }
        return this.AFInAppEventParameterName;
    }

    public static void AFInAppEventType(ExecutorService executorService) {
        try {
            AFLogger.AFKeystoreWrapper("shut downing executor ...");
            executorService.shutdown();
            executorService.awaitTermination(10, TimeUnit.SECONDS);
            if (!executorService.isTerminated()) {
                AFLogger.AFKeystoreWrapper("killing non-finished tasks");
            }
            executorService.shutdownNow();
        } catch (InterruptedException unused) {
            AFLogger.AFKeystoreWrapper("InterruptedException!!!");
            if (!executorService.isTerminated()) {
                AFLogger.AFKeystoreWrapper("killing non-finished tasks");
            }
            executorService.shutdownNow();
        } catch (Throwable th) {
            if (!executorService.isTerminated()) {
                AFLogger.AFKeystoreWrapper("killing non-finished tasks");
            }
            executorService.shutdownNow();
            throw th;
        }
    }
}
