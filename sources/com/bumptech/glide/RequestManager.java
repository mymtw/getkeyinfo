package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import com.bumptech.glide.load.engine.C6024j;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.C6124d;
import com.bumptech.glide.request.C6127f;
import com.bumptech.glide.request.C6128g;
import java.io.File;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p036c5.C4426l;
import p260v0.C8184a;
import p273w4.C8232b;
import p273w4.C8234c;
import p273w4.C8235d;
import p273w4.C8236e;
import p273w4.C8239h;
import p273w4.C8240i;
import p273w4.C8241j;
import p273w4.C8242k;
import p273w4.C8243l;
import p273w4.C8250o;
import p302z4.C8441d;
import p302z4.C8448i;

public class RequestManager implements ComponentCallbacks2, C8240i {
    private static final C6128g DECODE_TYPE_BITMAP = ((C6128g) ((C6128g) new C6128g().mo17146d(Bitmap.class)).mo17153l());
    private static final C6128g DECODE_TYPE_GIF = ((C6128g) ((C6128g) new C6128g().mo17146d(GifDrawable.class)).mo17153l());
    private static final C6128g DOWNLOAD_ONLY_OPTIONS = ((C6128g) ((C6128g) C6128g.m12233K(C6024j.f12929b).mo17161u(Priority.LOW)).mo17166z(true));
    private final Runnable addSelfToLifecycle;
    private final C8232b connectivityMonitor;
    public final Context context;
    private final CopyOnWriteArrayList<C6127f<Object>> defaultRequestListeners;
    public final Glide glide;
    public final C8239h lifecycle;
    private boolean pauseAllRequestsOnTrimMemoryModerate;
    private C6128g requestOptions;
    private final C8243l requestTracker;
    private final C8250o targetTracker;
    private final C8242k treeNode;

    /* renamed from: com.bumptech.glide.RequestManager$a */
    public class C5946a implements Runnable {
        public C5946a() {
        }

        public final void run() {
            RequestManager requestManager = RequestManager.this;
            requestManager.lifecycle.mo20843c(requestManager);
        }
    }

    /* renamed from: com.bumptech.glide.RequestManager$b */
    public static class C5947b extends C8441d<View, Object> {
        public C5947b(View view) {
            super(view);
        }

        /* renamed from: b */
        public final void mo16750b(Object obj) {
        }

        /* renamed from: e */
        public final void mo16809e() {
        }

        /* renamed from: i */
        public final void mo16755i(Drawable drawable) {
        }
    }

    /* renamed from: com.bumptech.glide.RequestManager$c */
    public class C5948c implements C8232b.C8233a {

        /* renamed from: a */
        public final C8243l f12736a;

        public C5948c(C8243l lVar) {
            this.f12736a = lVar;
        }

        /* renamed from: a */
        public final void mo16810a(boolean z) {
            if (z) {
                synchronized (RequestManager.this) {
                    this.f12736a.mo20851b();
                }
            }
        }
    }

    public RequestManager(Glide glide2, C8239h hVar, C8242k kVar, Context context2) {
        this(glide2, hVar, kVar, new C8243l(), glide2.getConnectivityMonitorFactory(), context2);
    }

    private void untrackOrDelegate(C8448i<?> iVar) {
        boolean untrack = untrack(iVar);
        C6124d request = iVar.getRequest();
        if (!untrack && !this.glide.removeFromManagers(iVar) && request != null) {
            iVar.mo16753g((C6124d) null);
            request.clear();
        }
    }

    private synchronized void updateRequestOptions(C6128g gVar) {
        this.requestOptions = (C6128g) this.requestOptions.mo16829a(gVar);
    }

    public RequestManager addDefaultRequestListener(C6127f<Object> fVar) {
        this.defaultRequestListeners.add(fVar);
        return this;
    }

    public synchronized RequestManager applyDefaultRequestOptions(C6128g gVar) {
        updateRequestOptions(gVar);
        return this;
    }

    /* renamed from: as */
    public <ResourceType> C5959e<ResourceType> mo16771as(Class<ResourceType> cls) {
        return new C5959e<>(this.glide, this, cls, this.context);
    }

    public C5959e<Bitmap> asBitmap() {
        return mo16771as(Bitmap.class).mo16829a(DECODE_TYPE_BITMAP);
    }

    public C5959e<Drawable> asDrawable() {
        return mo16771as(Drawable.class);
    }

    public C5959e<File> asFile() {
        return mo16771as(File.class).mo16829a(C6128g.m12234L());
    }

    public C5959e<GifDrawable> asGif() {
        return mo16771as(GifDrawable.class).mo16829a(DECODE_TYPE_GIF);
    }

    public void clear(View view) {
        clear((C8448i<?>) new C5947b(view));
    }

    public C5959e<File> download(Object obj) {
        return downloadOnly().mo16824V(obj);
    }

    public C5959e<File> downloadOnly() {
        return mo16771as(File.class).mo16829a(DOWNLOAD_ONLY_OPTIONS);
    }

    public List<C6127f<Object>> getDefaultRequestListeners() {
        return this.defaultRequestListeners;
    }

    public synchronized C6128g getDefaultRequestOptions() {
        return this.requestOptions;
    }

    public <T> C5961f<?, T> getDefaultTransitionOptions(Class<T> cls) {
        return this.glide.getGlideContext().getDefaultTransitionOptions(cls);
    }

    public synchronized boolean isPaused() {
        return this.requestTracker.f18071c;
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public synchronized void onDestroy() {
        this.targetTracker.onDestroy();
        Iterator it = C4426l.m10131e(this.targetTracker.f18085b).iterator();
        while (it.hasNext()) {
            clear((C8448i<?>) (C8448i) it.next());
        }
        this.targetTracker.f18085b.clear();
        C8243l lVar = this.requestTracker;
        Iterator it2 = C4426l.m10131e(lVar.f18069a).iterator();
        while (it2.hasNext()) {
            lVar.mo20850a((C6124d) it2.next());
        }
        lVar.f18070b.clear();
        this.lifecycle.mo20841a(this);
        this.lifecycle.mo20841a(this.connectivityMonitor);
        C4426l.m10132f().removeCallbacks(this.addSelfToLifecycle);
        this.glide.unregisterRequestManager(this);
    }

    public void onLowMemory() {
    }

    public synchronized void onStart() {
        resumeRequests();
        this.targetTracker.onStart();
    }

    public synchronized void onStop() {
        pauseRequests();
        this.targetTracker.onStop();
    }

    public void onTrimMemory(int i) {
        if (i == 60 && this.pauseAllRequestsOnTrimMemoryModerate) {
            pauseAllRequestsRecursive();
        }
    }

    public synchronized void pauseAllRequests() {
        C8243l lVar = this.requestTracker;
        lVar.f18071c = true;
        Iterator it = C4426l.m10131e(lVar.f18069a).iterator();
        while (it.hasNext()) {
            C6124d dVar = (C6124d) it.next();
            if (dVar.isRunning() || dVar.mo17126e()) {
                dVar.clear();
                lVar.f18070b.add(dVar);
            }
        }
    }

    public synchronized void pauseAllRequestsRecursive() {
        pauseAllRequests();
        for (RequestManager pauseAllRequests : this.treeNode.mo17095b()) {
            pauseAllRequests.pauseAllRequests();
        }
    }

    public synchronized void pauseRequests() {
        C8243l lVar = this.requestTracker;
        lVar.f18071c = true;
        Iterator it = C4426l.m10131e(lVar.f18069a).iterator();
        while (it.hasNext()) {
            C6124d dVar = (C6124d) it.next();
            if (dVar.isRunning()) {
                dVar.pause();
                lVar.f18070b.add(dVar);
            }
        }
    }

    public synchronized void pauseRequestsRecursive() {
        pauseRequests();
        for (RequestManager pauseRequests : this.treeNode.mo17095b()) {
            pauseRequests.pauseRequests();
        }
    }

    public synchronized void resumeRequests() {
        C8243l lVar = this.requestTracker;
        lVar.f18071c = false;
        Iterator it = C4426l.m10131e(lVar.f18069a).iterator();
        while (it.hasNext()) {
            C6124d dVar = (C6124d) it.next();
            if (!dVar.mo17126e() && !dVar.isRunning()) {
                dVar.mo17129h();
            }
        }
        lVar.f18070b.clear();
    }

    public synchronized void resumeRequestsRecursive() {
        C4426l.m10127a();
        resumeRequests();
        for (RequestManager resumeRequests : this.treeNode.mo17095b()) {
            resumeRequests.resumeRequests();
        }
    }

    public synchronized RequestManager setDefaultRequestOptions(C6128g gVar) {
        setRequestOptions(gVar);
        return this;
    }

    public void setPauseAllRequestsOnTrimMemoryModerate(boolean z) {
        this.pauseAllRequestsOnTrimMemoryModerate = z;
    }

    public synchronized void setRequestOptions(C6128g gVar) {
        this.requestOptions = (C6128g) ((C6128g) gVar.clone()).mo17145b();
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.requestTracker + ", treeNode=" + this.treeNode + "}";
    }

    public synchronized void track(C8448i<?> iVar, C6124d dVar) {
        this.targetTracker.f18085b.add(iVar);
        C8243l lVar = this.requestTracker;
        lVar.f18069a.add(dVar);
        if (!lVar.f18071c) {
            dVar.mo17129h();
        } else {
            dVar.clear();
            Log.isLoggable("RequestTracker", 2);
            lVar.f18070b.add(dVar);
        }
    }

    public synchronized boolean untrack(C8448i<?> iVar) {
        C6124d request = iVar.getRequest();
        if (request == null) {
            return true;
        }
        if (!this.requestTracker.mo20850a(request)) {
            return false;
        }
        this.targetTracker.f18085b.remove(iVar);
        iVar.mo16753g((C6124d) null);
        return true;
    }

    public void clear(C8448i<?> iVar) {
        if (iVar != null) {
            untrackOrDelegate(iVar);
        }
    }

    public RequestManager(Glide glide2, C8239h hVar, C8242k kVar, C8243l lVar, C8234c cVar, Context context2) {
        C8232b bVar;
        this.targetTracker = new C8250o();
        C5946a aVar = new C5946a();
        this.addSelfToLifecycle = aVar;
        this.glide = glide2;
        this.lifecycle = hVar;
        this.treeNode = kVar;
        this.requestTracker = lVar;
        this.context = context2;
        Context applicationContext = context2.getApplicationContext();
        C5948c cVar2 = new C5948c(lVar);
        ((C8236e) cVar).getClass();
        boolean z = C8184a.m16458a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        if (z) {
            bVar = new C8235d(applicationContext, cVar2);
        } else {
            bVar = new C8241j();
        }
        this.connectivityMonitor = bVar;
        if (C4426l.m10134h()) {
            C4426l.m10132f().post(aVar);
        } else {
            hVar.mo20843c(this);
        }
        hVar.mo20843c(bVar);
        this.defaultRequestListeners = new CopyOnWriteArrayList<>(glide2.getGlideContext().getDefaultRequestListeners());
        setRequestOptions(glide2.getGlideContext().getDefaultRequestOptions());
        glide2.registerRequestManager(this);
    }

    public C5959e<Drawable> load(Bitmap bitmap) {
        return asDrawable().mo16819P(bitmap);
    }

    public C5959e<Drawable> load(Drawable drawable) {
        return asDrawable().mo16820Q(drawable);
    }

    public C5959e<Drawable> load(String str) {
        return asDrawable().mo16825W(str);
    }

    public C5959e<Drawable> load(Uri uri) {
        return asDrawable().mo16821R(uri);
    }

    public C5959e<Drawable> load(File file) {
        return asDrawable().mo16822T(file);
    }

    public C5959e<Drawable> load(Integer num) {
        return asDrawable().mo16823U(num);
    }

    @Deprecated
    public C5959e<Drawable> load(URL url) {
        return asDrawable().mo16826X(url);
    }

    public C5959e<Drawable> load(byte[] bArr) {
        return asDrawable().mo16827Y(bArr);
    }

    public C5959e<Drawable> load(Object obj) {
        return asDrawable().mo16824V(obj);
    }
}
