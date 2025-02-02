package com.google.android.gms.common.providers;

import com.google.android.gms.common.providers.PooledExecutorsProvider;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

final class zza implements PooledExecutorsProvider.PooledExecutorFactory {
    public final ScheduledExecutorService newSingleThreadScheduledExecutor() {
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }
}
