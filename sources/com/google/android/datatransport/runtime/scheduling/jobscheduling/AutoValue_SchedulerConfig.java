package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.support.p013v4.media.C0072d;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Map;
import p132hh.C6963a;

final class AutoValue_SchedulerConfig extends SchedulerConfig {
    private final C6963a clock;
    private final Map<Priority, SchedulerConfig.C6563b> values;

    public AutoValue_SchedulerConfig(C6963a aVar, Map<Priority, SchedulerConfig.C6563b> map) {
        if (aVar != null) {
            this.clock = aVar;
            if (map != null) {
                this.values = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig)) {
            return false;
        }
        SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
        return this.clock.equals(schedulerConfig.getClock()) && this.values.equals(schedulerConfig.getValues());
    }

    public C6963a getClock() {
        return this.clock;
    }

    public Map<Priority, SchedulerConfig.C6563b> getValues() {
        return this.values;
    }

    public int hashCode() {
        return ((this.clock.hashCode() ^ 1000003) * 1000003) ^ this.values.hashCode();
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("SchedulerConfig{clock=");
        h.append(this.clock);
        h.append(", values=");
        h.append(this.values);
        h.append("}");
        return h.toString();
    }
}
