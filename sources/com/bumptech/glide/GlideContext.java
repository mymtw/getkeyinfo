package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.C5951c;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.C6030k;
import com.bumptech.glide.load.engine.bitmap_recycle.C5996b;
import com.bumptech.glide.request.C6127f;
import com.bumptech.glide.request.C6128g;
import java.util.List;
import java.util.Map;
import p302z4.C8439b;
import p302z4.C8444e;
import p302z4.C8446g;
import p302z4.C8449j;

public class GlideContext extends ContextWrapper {
    public static final C5961f<?, ?> DEFAULT_TRANSITION_OPTIONS = new C5950b();
    private final C5996b arrayPool;
    private final List<C6127f<Object>> defaultRequestListeners;
    private C6128g defaultRequestOptions;
    private final Glide.C5941a defaultRequestOptionsFactory;
    private final Map<Class<?>, C5961f<?, ?>> defaultTransitionOptions;
    private final C6030k engine;
    private final C5957d experiments;
    private final C8446g imageViewTargetFactory;
    private final int logLevel;
    private final Registry registry;

    public GlideContext(Context context, C5996b bVar, Registry registry2, C8446g gVar, Glide.C5941a aVar, Map<Class<?>, C5961f<?, ?>> map, List<C6127f<Object>> list, C6030k kVar, C5957d dVar, int i) {
        super(context.getApplicationContext());
        this.arrayPool = bVar;
        this.registry = registry2;
        this.imageViewTargetFactory = gVar;
        this.defaultRequestOptionsFactory = aVar;
        this.defaultRequestListeners = list;
        this.defaultTransitionOptions = map;
        this.engine = kVar;
        this.experiments = dVar;
        this.logLevel = i;
    }

    public <X> C8449j<ImageView, X> buildImageViewTarget(ImageView imageView, Class<X> cls) {
        this.imageViewTargetFactory.getClass();
        if (Bitmap.class.equals(cls)) {
            return new C8439b(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new C8444e(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }

    public C5996b getArrayPool() {
        return this.arrayPool;
    }

    public List<C6127f<Object>> getDefaultRequestListeners() {
        return this.defaultRequestListeners;
    }

    public synchronized C6128g getDefaultRequestOptions() {
        if (this.defaultRequestOptions == null) {
            ((C5951c.C5952a) this.defaultRequestOptionsFactory).getClass();
            C6128g gVar = new C6128g();
            gVar.f13215u = true;
            this.defaultRequestOptions = gVar;
        }
        return this.defaultRequestOptions;
    }

    public <T> C5961f<?, T> getDefaultTransitionOptions(Class<T> cls) {
        C5961f<?, T> fVar = this.defaultTransitionOptions.get(cls);
        if (fVar == null) {
            for (Map.Entry next : this.defaultTransitionOptions.entrySet()) {
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    fVar = (C5961f) next.getValue();
                }
            }
        }
        return fVar == null ? DEFAULT_TRANSITION_OPTIONS : fVar;
    }

    public C6030k getEngine() {
        return this.engine;
    }

    public C5957d getExperiments() {
        return this.experiments;
    }

    public int getLogLevel() {
        return this.logLevel;
    }

    public Registry getRegistry() {
        return this.registry;
    }
}
