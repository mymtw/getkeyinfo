package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C5968d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.l */
public abstract class C5982l<T> implements C5968d<T> {

    /* renamed from: b */
    public final Uri f12795b;

    /* renamed from: c */
    public final ContentResolver f12796c;

    /* renamed from: d */
    public T f12797d;

    public C5982l(ContentResolver contentResolver, Uri uri) {
        this.f12796c = contentResolver;
        this.f12795b = uri;
    }

    /* renamed from: b */
    public final void mo16851b() {
        T t = this.f12797d;
        if (t != null) {
            try {
                mo16849c(t);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    public abstract void mo16849c(T t) throws IOException;

    public final void cancel() {
    }

    /* renamed from: d */
    public final DataSource mo16854d() {
        return DataSource.LOCAL;
    }

    /* renamed from: e */
    public final void mo16855e(Priority priority, C5968d.C5969a<? super T> aVar) {
        try {
            T f = mo16850f(this.f12796c, this.f12795b);
            this.f12797d = f;
            aVar.mo16863f(f);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            aVar.mo16862c(e);
        }
    }

    /* renamed from: f */
    public abstract Object mo16850f(ContentResolver contentResolver, Uri uri) throws FileNotFoundException;
}
