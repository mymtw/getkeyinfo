package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_EventStoreConfig;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.c */
public abstract class C6581c {
    public static final C6581c DEFAULT = builder().setMaxStorageSizeInBytes(MAX_DB_STORAGE_SIZE_IN_BYTES).setLoadBatchSize(200).setCriticalSectionEnterTimeoutMs(10000).setEventCleanUpAge(DURATION_ONE_WEEK_MS).setMaxBlobByteSizePerRow(MAX_BLOB_BYTE_SIZE_PER_ROW).build();
    private static final long DURATION_ONE_WEEK_MS = 604800000;
    private static final int LOAD_BATCH_SIZE = 200;
    private static final int LOCK_TIME_OUT_MS = 10000;
    private static final int MAX_BLOB_BYTE_SIZE_PER_ROW = 81920;
    private static final long MAX_DB_STORAGE_SIZE_IN_BYTES = 10485760;

    @AutoValue.Builder
    /* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.c$a */
    public static abstract class C6582a {
        public abstract C6581c build();

        public abstract C6582a setCriticalSectionEnterTimeoutMs(int i);

        public abstract C6582a setEventCleanUpAge(long j);

        public abstract C6582a setLoadBatchSize(int i);

        public abstract C6582a setMaxBlobByteSizePerRow(int i);

        public abstract C6582a setMaxStorageSizeInBytes(long j);
    }

    public static C6582a builder() {
        return new AutoValue_EventStoreConfig.Builder();
    }

    public abstract int getCriticalSectionEnterTimeoutMs();

    public abstract long getEventCleanUpAge();

    public abstract int getLoadBatchSize();

    public abstract int getMaxBlobByteSizePerRow();

    public abstract long getMaxStorageSizeInBytes();

    public C6582a toBuilder() {
        return builder().setMaxStorageSizeInBytes(getMaxStorageSizeInBytes()).setLoadBatchSize(getLoadBatchSize()).setCriticalSectionEnterTimeoutMs(getCriticalSectionEnterTimeoutMs()).setEventCleanUpAge(getEventCleanUpAge()).setMaxBlobByteSizePerRow(getMaxBlobByteSizePerRow());
    }
}
