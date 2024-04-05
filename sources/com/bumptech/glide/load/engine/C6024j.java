package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* renamed from: com.bumptech.glide.load.engine.j */
public abstract class C6024j {

    /* renamed from: a */
    public static final C6026b f12928a = new C6026b();

    /* renamed from: b */
    public static final C6027c f12929b = new C6027c();

    /* renamed from: c */
    public static final C6029e f12930c = new C6029e();

    /* renamed from: com.bumptech.glide.load.engine.j$a */
    public class C6025a extends C6024j {
        /* renamed from: a */
        public final boolean mo16965a() {
            return true;
        }

        /* renamed from: b */
        public final boolean mo16966b() {
            return true;
        }

        /* renamed from: c */
        public final boolean mo16967c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        /* renamed from: d */
        public final boolean mo16968d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.j$b */
    public class C6026b extends C6024j {
        /* renamed from: a */
        public final boolean mo16965a() {
            return false;
        }

        /* renamed from: b */
        public final boolean mo16966b() {
            return false;
        }

        /* renamed from: c */
        public final boolean mo16967c(DataSource dataSource) {
            return false;
        }

        /* renamed from: d */
        public final boolean mo16968d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.j$c */
    public class C6027c extends C6024j {
        /* renamed from: a */
        public final boolean mo16965a() {
            return true;
        }

        /* renamed from: b */
        public final boolean mo16966b() {
            return false;
        }

        /* renamed from: c */
        public final boolean mo16967c(DataSource dataSource) {
            return (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }

        /* renamed from: d */
        public final boolean mo16968d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.j$d */
    public class C6028d extends C6024j {
        /* renamed from: a */
        public final boolean mo16965a() {
            return false;
        }

        /* renamed from: b */
        public final boolean mo16966b() {
            return true;
        }

        /* renamed from: c */
        public final boolean mo16967c(DataSource dataSource) {
            return false;
        }

        /* renamed from: d */
        public final boolean mo16968d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.j$e */
    public class C6029e extends C6024j {
        /* renamed from: a */
        public final boolean mo16965a() {
            return true;
        }

        /* renamed from: b */
        public final boolean mo16966b() {
            return true;
        }

        /* renamed from: c */
        public final boolean mo16967c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        /* renamed from: d */
        public final boolean mo16968d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return ((z && dataSource == DataSource.DATA_DISK_CACHE) || dataSource == DataSource.LOCAL) && encodeStrategy == EncodeStrategy.TRANSFORMED;
        }
    }

    static {
        new C6025a();
        new C6028d();
    }

    /* renamed from: a */
    public abstract boolean mo16965a();

    /* renamed from: b */
    public abstract boolean mo16966b();

    /* renamed from: c */
    public abstract boolean mo16967c(DataSource dataSource);

    /* renamed from: d */
    public abstract boolean mo16968d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy);
}
