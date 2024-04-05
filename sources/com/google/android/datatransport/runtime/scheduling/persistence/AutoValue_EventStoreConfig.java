package com.google.android.datatransport.runtime.scheduling.persistence;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.google.android.datatransport.runtime.scheduling.persistence.C6581c;

final class AutoValue_EventStoreConfig extends C6581c {
    private final int criticalSectionEnterTimeoutMs;
    private final long eventCleanUpAge;
    private final int loadBatchSize;
    private final int maxBlobByteSizePerRow;
    private final long maxStorageSizeInBytes;

    public static final class Builder extends C6581c.C6582a {
        private Integer criticalSectionEnterTimeoutMs;
        private Long eventCleanUpAge;
        private Integer loadBatchSize;
        private Integer maxBlobByteSizePerRow;
        private Long maxStorageSizeInBytes;

        public C6581c build() {
            String str = this.maxStorageSizeInBytes == null ? " maxStorageSizeInBytes" : "";
            if (this.loadBatchSize == null) {
                str = C0326j.m864i(str, " loadBatchSize");
            }
            if (this.criticalSectionEnterTimeoutMs == null) {
                str = C0326j.m864i(str, " criticalSectionEnterTimeoutMs");
            }
            if (this.eventCleanUpAge == null) {
                str = C0326j.m864i(str, " eventCleanUpAge");
            }
            if (this.maxBlobByteSizePerRow == null) {
                str = C0326j.m864i(str, " maxBlobByteSizePerRow");
            }
            if (str.isEmpty()) {
                return new AutoValue_EventStoreConfig(this.maxStorageSizeInBytes.longValue(), this.loadBatchSize.intValue(), this.criticalSectionEnterTimeoutMs.intValue(), this.eventCleanUpAge.longValue(), this.maxBlobByteSizePerRow.intValue());
            }
            throw new IllegalStateException(C0326j.m864i("Missing required properties:", str));
        }

        public C6581c.C6582a setCriticalSectionEnterTimeoutMs(int i) {
            this.criticalSectionEnterTimeoutMs = Integer.valueOf(i);
            return this;
        }

        public C6581c.C6582a setEventCleanUpAge(long j) {
            this.eventCleanUpAge = Long.valueOf(j);
            return this;
        }

        public C6581c.C6582a setLoadBatchSize(int i) {
            this.loadBatchSize = Integer.valueOf(i);
            return this;
        }

        public C6581c.C6582a setMaxBlobByteSizePerRow(int i) {
            this.maxBlobByteSizePerRow = Integer.valueOf(i);
            return this;
        }

        public C6581c.C6582a setMaxStorageSizeInBytes(long j) {
            this.maxStorageSizeInBytes = Long.valueOf(j);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6581c)) {
            return false;
        }
        C6581c cVar = (C6581c) obj;
        return this.maxStorageSizeInBytes == cVar.getMaxStorageSizeInBytes() && this.loadBatchSize == cVar.getLoadBatchSize() && this.criticalSectionEnterTimeoutMs == cVar.getCriticalSectionEnterTimeoutMs() && this.eventCleanUpAge == cVar.getEventCleanUpAge() && this.maxBlobByteSizePerRow == cVar.getMaxBlobByteSizePerRow();
    }

    public int getCriticalSectionEnterTimeoutMs() {
        return this.criticalSectionEnterTimeoutMs;
    }

    public long getEventCleanUpAge() {
        return this.eventCleanUpAge;
    }

    public int getLoadBatchSize() {
        return this.loadBatchSize;
    }

    public int getMaxBlobByteSizePerRow() {
        return this.maxBlobByteSizePerRow;
    }

    public long getMaxStorageSizeInBytes() {
        return this.maxStorageSizeInBytes;
    }

    public int hashCode() {
        long j = this.maxStorageSizeInBytes;
        long j2 = this.eventCleanUpAge;
        return ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.loadBatchSize) * 1000003) ^ this.criticalSectionEnterTimeoutMs) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.maxBlobByteSizePerRow;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("EventStoreConfig{maxStorageSizeInBytes=");
        h.append(this.maxStorageSizeInBytes);
        h.append(", loadBatchSize=");
        h.append(this.loadBatchSize);
        h.append(", criticalSectionEnterTimeoutMs=");
        h.append(this.criticalSectionEnterTimeoutMs);
        h.append(", eventCleanUpAge=");
        h.append(this.eventCleanUpAge);
        h.append(", maxBlobByteSizePerRow=");
        return C0071c.m191c(h, this.maxBlobByteSizePerRow, "}");
    }

    private AutoValue_EventStoreConfig(long j, int i, int i2, long j2, int i3) {
        this.maxStorageSizeInBytes = j;
        this.loadBatchSize = i;
        this.criticalSectionEnterTimeoutMs = i2;
        this.eventCleanUpAge = j2;
        this.maxBlobByteSizePerRow = i3;
    }
}
