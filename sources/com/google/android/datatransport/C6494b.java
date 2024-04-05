package com.google.android.datatransport;

import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.google.android.datatransport.b */
public abstract class C6494b<T> {
    public static <T> C6494b<T> ofData(int i, T t) {
        return new AutoValue_Event(Integer.valueOf(i), t, Priority.DEFAULT);
    }

    public static <T> C6494b<T> ofTelemetry(int i, T t) {
        return new AutoValue_Event(Integer.valueOf(i), t, Priority.VERY_LOW);
    }

    public static <T> C6494b<T> ofUrgent(int i, T t) {
        return new AutoValue_Event(Integer.valueOf(i), t, Priority.HIGHEST);
    }

    public abstract Integer getCode();

    public abstract T getPayload();

    public abstract Priority getPriority();

    public static <T> C6494b<T> ofData(T t) {
        return new AutoValue_Event((Integer) null, t, Priority.DEFAULT);
    }

    public static <T> C6494b<T> ofTelemetry(T t) {
        return new AutoValue_Event((Integer) null, t, Priority.VERY_LOW);
    }

    public static <T> C6494b<T> ofUrgent(T t) {
        return new AutoValue_Event((Integer) null, t, Priority.HIGHEST);
    }
}
