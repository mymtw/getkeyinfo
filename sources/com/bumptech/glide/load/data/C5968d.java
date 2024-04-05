package com.bumptech.glide.load.data;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

/* renamed from: com.bumptech.glide.load.data.d */
public interface C5968d<T> {

    /* renamed from: com.bumptech.glide.load.data.d$a */
    public interface C5969a<T> {
        /* renamed from: c */
        void mo16862c(Exception exc);

        /* renamed from: f */
        void mo16863f(T t);
    }

    /* renamed from: a */
    Class<T> mo16848a();

    /* renamed from: b */
    void mo16851b();

    void cancel();

    /* renamed from: d */
    DataSource mo16854d();

    /* renamed from: e */
    void mo16855e(Priority priority, C5969a<? super T> aVar);
}
