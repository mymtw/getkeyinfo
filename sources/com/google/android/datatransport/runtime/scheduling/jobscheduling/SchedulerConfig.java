package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AutoValue_SchedulerConfig_ConfigValue;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p132hh.C6963a;

@AutoValue
public abstract class SchedulerConfig {
    private static final long BACKOFF_LOG_BASE = 10000;
    private static final long ONE_SECOND = 1000;
    private static final long THIRTY_SECONDS = 30000;
    private static final long TWENTY_FOUR_HOURS = 86400000;

    public enum Flag {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$a */
    public static class C6562a {

        /* renamed from: a */
        public C6963a f14496a;

        /* renamed from: b */
        public HashMap f14497b = new HashMap();
    }

    @AutoValue
    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$b */
    public static abstract class C6563b {

        @AutoValue.Builder
        /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$b$a */
        public static abstract class C6564a {
            public abstract C6563b build();

            public abstract C6564a setDelta(long j);

            public abstract C6564a setFlags(Set<Flag> set);

            public abstract C6564a setMaxAllowedDelay(long j);
        }

        public static C6564a builder() {
            return new AutoValue_SchedulerConfig_ConfigValue.Builder().setFlags(Collections.emptySet());
        }

        public abstract long getDelta();

        public abstract Set<Flag> getFlags();

        public abstract long getMaxAllowedDelay();
    }

    private long adjustedExponentialBackoff(int i, long j) {
        int i2 = i - 1;
        return (long) (Math.pow(3.0d, (double) i2) * ((double) j) * Math.max(1.0d, Math.log(10000.0d) / Math.log((double) ((j > 1 ? j : 2) * ((long) i2)))));
    }

    public static C6562a builder() {
        return new C6562a();
    }

    public static SchedulerConfig create(C6963a aVar, Map<Priority, C6563b> map) {
        return new AutoValue_SchedulerConfig(aVar, map);
    }

    public static SchedulerConfig getDefault(C6963a aVar) {
        C6562a builder = builder();
        builder.f14497b.put(Priority.DEFAULT, C6563b.builder().setDelta(THIRTY_SECONDS).setMaxAllowedDelay(86400000).build());
        builder.f14497b.put(Priority.HIGHEST, C6563b.builder().setDelta(1000).setMaxAllowedDelay(86400000).build());
        builder.f14497b.put(Priority.VERY_LOW, C6563b.builder().setDelta(86400000).setMaxAllowedDelay(86400000).setFlags(immutableSetOf(Flag.NETWORK_UNMETERED, Flag.DEVICE_IDLE)).build());
        builder.f14496a = aVar;
        if (aVar == null) {
            throw new NullPointerException("missing required property: clock");
        } else if (builder.f14497b.keySet().size() >= Priority.values().length) {
            HashMap hashMap = builder.f14497b;
            builder.f14497b = new HashMap();
            return create(builder.f14496a, hashMap);
        } else {
            throw new IllegalStateException("Not all priorities have been configured");
        }
    }

    private static <T> Set<T> immutableSetOf(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    private void populateFlags(JobInfo.Builder builder, Set<Flag> set) {
        if (set.contains(Flag.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(Flag.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(Flag.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder configureJob(JobInfo.Builder builder, Priority priority, long j, int i) {
        builder.setMinimumLatency(getScheduleDelay(priority, j, i));
        populateFlags(builder, getValues().get(priority).getFlags());
        return builder;
    }

    public abstract C6963a getClock();

    public Set<Flag> getFlags(Priority priority) {
        return getValues().get(priority).getFlags();
    }

    public long getScheduleDelay(Priority priority, long j, int i) {
        long a = j - getClock().mo19124a();
        C6563b bVar = getValues().get(priority);
        return Math.min(Math.max(adjustedExponentialBackoff(i, bVar.getDelta()), a), bVar.getMaxAllowedDelay());
    }

    public abstract Map<Priority, C6563b> getValues();
}
