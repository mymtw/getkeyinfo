package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Set;

final class AutoValue_SchedulerConfig_ConfigValue extends SchedulerConfig.C6563b {
    private final long delta;
    private final Set<SchedulerConfig.Flag> flags;
    private final long maxAllowedDelay;

    public static final class Builder extends SchedulerConfig.C6563b.C6564a {
        private Long delta;
        private Set<SchedulerConfig.Flag> flags;
        private Long maxAllowedDelay;

        public SchedulerConfig.C6563b build() {
            String str = this.delta == null ? " delta" : "";
            if (this.maxAllowedDelay == null) {
                str = C0326j.m864i(str, " maxAllowedDelay");
            }
            if (this.flags == null) {
                str = C0326j.m864i(str, " flags");
            }
            if (str.isEmpty()) {
                return new AutoValue_SchedulerConfig_ConfigValue(this.delta.longValue(), this.maxAllowedDelay.longValue(), this.flags);
            }
            throw new IllegalStateException(C0326j.m864i("Missing required properties:", str));
        }

        public SchedulerConfig.C6563b.C6564a setDelta(long j) {
            this.delta = Long.valueOf(j);
            return this;
        }

        public SchedulerConfig.C6563b.C6564a setFlags(Set<SchedulerConfig.Flag> set) {
            if (set != null) {
                this.flags = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        public SchedulerConfig.C6563b.C6564a setMaxAllowedDelay(long j) {
            this.maxAllowedDelay = Long.valueOf(j);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig.C6563b)) {
            return false;
        }
        SchedulerConfig.C6563b bVar = (SchedulerConfig.C6563b) obj;
        return this.delta == bVar.getDelta() && this.maxAllowedDelay == bVar.getMaxAllowedDelay() && this.flags.equals(bVar.getFlags());
    }

    public long getDelta() {
        return this.delta;
    }

    public Set<SchedulerConfig.Flag> getFlags() {
        return this.flags;
    }

    public long getMaxAllowedDelay() {
        return this.maxAllowedDelay;
    }

    public int hashCode() {
        long j = this.delta;
        long j2 = this.maxAllowedDelay;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.flags.hashCode();
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ConfigValue{delta=");
        h.append(this.delta);
        h.append(", maxAllowedDelay=");
        h.append(this.maxAllowedDelay);
        h.append(", flags=");
        h.append(this.flags);
        h.append("}");
        return h.toString();
    }

    private AutoValue_SchedulerConfig_ConfigValue(long j, long j2, Set<SchedulerConfig.Flag> set) {
        this.delta = j;
        this.maxAllowedDelay = j2;
        this.flags = set;
    }
}
