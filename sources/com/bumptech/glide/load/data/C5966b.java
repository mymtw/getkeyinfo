package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C5968d;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.b */
public abstract class C5966b<T> implements C5968d<T> {

    /* renamed from: b */
    public final String f12774b;

    /* renamed from: c */
    public final AssetManager f12775c;

    /* renamed from: d */
    public T f12776d;

    public C5966b(AssetManager assetManager, String str) {
        this.f12775c = assetManager;
        this.f12774b = str;
    }

    /* renamed from: b */
    public final void mo16851b() {
        T t = this.f12776d;
        if (t != null) {
            try {
                mo16852c(t);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    public abstract void mo16852c(T t) throws IOException;

    public final void cancel() {
    }

    /* renamed from: d */
    public final DataSource mo16854d() {
        return DataSource.LOCAL;
    }

    /* renamed from: e */
    public final void mo16855e(Priority priority, C5968d.C5969a<? super T> aVar) {
        try {
            T f = mo16856f(this.f12775c, this.f12774b);
            this.f12776d = f;
            aVar.mo16863f(f);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            aVar.mo16862c(e);
        }
    }

    /* renamed from: f */
    public abstract T mo16856f(AssetManager assetManager, String str) throws IOException;
}
