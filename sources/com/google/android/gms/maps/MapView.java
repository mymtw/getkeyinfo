package com.google.android.gms.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import p514bk.C14089b;
import p521ck.C14167a;
import p621mj.C18233a;
import p621mj.C18235b;
import p621mj.C18236c;

public class MapView extends FrameLayout {
    private final C14901b zzbg;

    @VisibleForTesting
    /* renamed from: com.google.android.gms.maps.MapView$a */
    public static class C14900a implements C18235b {

        /* renamed from: a */
        public final ViewGroup f33209a;

        /* renamed from: b */
        public final IMapViewDelegate f33210b;

        /* renamed from: c */
        public View f33211c;

        public C14900a(ViewGroup viewGroup, IMapViewDelegate iMapViewDelegate) {
            this.f33210b = (IMapViewDelegate) Preconditions.checkNotNull(iMapViewDelegate);
            this.f33209a = (ViewGroup) Preconditions.checkNotNull(viewGroup);
        }

        /* renamed from: a */
        public final void mo51361a(Activity activity, Bundle bundle, Bundle bundle2) {
            throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
        }

        /* renamed from: b */
        public final View mo51362b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
        }

        public final void onCreate(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                C14167a.m21955b(bundle, bundle2);
                this.f33210b.onCreate(bundle2);
                C14167a.m21955b(bundle2, bundle);
                this.f33211c = (View) ObjectWrapper.unwrap(this.f33210b.getView());
                this.f33209a.removeAllViews();
                this.f33209a.addView(this.f33211c);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onDestroy() {
            try {
                this.f33210b.onDestroy();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onDestroyView() {
            throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
        }

        public final void onLowMemory() {
            try {
                this.f33210b.onLowMemory();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onPause() {
            try {
                this.f33210b.onPause();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onResume() {
            try {
                this.f33210b.onResume();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onSaveInstanceState(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                C14167a.m21955b(bundle, bundle2);
                this.f33210b.onSaveInstanceState(bundle2);
                C14167a.m21955b(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onStart() {
            try {
                this.f33210b.onStart();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onStop() {
            try {
                this.f33210b.onStop();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    @VisibleForTesting
    /* renamed from: com.google.android.gms.maps.MapView$b */
    public static class C14901b extends C18233a<C14900a> {

        /* renamed from: f */
        public final ViewGroup f33212f;

        /* renamed from: g */
        public final Context f33213g;

        /* renamed from: h */
        public C18236c<C14900a> f33214h;

        /* renamed from: i */
        public final GoogleMapOptions f33215i;

        /* renamed from: j */
        public final ArrayList f33216j = new ArrayList();

        @VisibleForTesting
        public C14901b(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
            this.f33212f = viewGroup;
            this.f33213g = context;
            this.f33215i = googleMapOptions;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            return;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:? A[ExcHandler: GooglePlayServicesNotAvailableException (unused com.google.android.gms.common.GooglePlayServicesNotAvailableException), SYNTHETIC, Splitter:B:4:0x0008] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo51372a(p621mj.C18237d r4) {
            /*
                r3 = this;
                r3.f33214h = r4
                if (r4 == 0) goto L_0x0068
                T r4 = r3.f39975b
                if (r4 != 0) goto L_0x0068
                android.content.Context r4 = r3.f33213g     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                p514bk.C14088a.m21787p(r4)     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                android.content.Context r4 = r3.f33213g     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                com.google.android.gms.maps.internal.zze r4 = p521ck.C14168b.m21957a(r4)     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                android.content.Context r0 = r3.f33213g     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                com.google.android.gms.maps.GoogleMapOptions r1 = r3.f33215i     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                com.google.android.gms.maps.internal.IMapViewDelegate r4 = r4.zza((com.google.android.gms.dynamic.IObjectWrapper) r0, (com.google.android.gms.maps.GoogleMapOptions) r1)     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                if (r4 != 0) goto L_0x0022
                return
            L_0x0022:
                mj.c<com.google.android.gms.maps.MapView$a> r0 = r3.f33214h     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                com.google.android.gms.maps.MapView$a r1 = new com.google.android.gms.maps.MapView$a     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                android.view.ViewGroup r2 = r3.f33212f     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                r1.<init>(r2, r4)     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                mj.d r0 = (p621mj.C18237d) r0     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                r0.mo69788a(r1)     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                java.util.ArrayList r4 = r3.f33216j     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                java.util.Iterator r4 = r4.iterator()     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
            L_0x0036:
                boolean r0 = r4.hasNext()     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                if (r0 == 0) goto L_0x005b
                java.lang.Object r0 = r4.next()     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                bk.b r0 = (p514bk.C14089b) r0     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                T r1 = r3.f39975b     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                com.google.android.gms.maps.MapView$a r1 = (com.google.android.gms.maps.MapView.C14900a) r1     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                r1.getClass()     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                com.google.android.gms.maps.internal.IMapViewDelegate r1 = r1.f33210b     // Catch:{ RemoteException -> 0x0054, GooglePlayServicesNotAvailableException -> 0x0068 }
                com.google.android.gms.maps.b r2 = new com.google.android.gms.maps.b     // Catch:{ RemoteException -> 0x0054, GooglePlayServicesNotAvailableException -> 0x0068 }
                r2.<init>(r0)     // Catch:{ RemoteException -> 0x0054, GooglePlayServicesNotAvailableException -> 0x0068 }
                r1.getMapAsync(r2)     // Catch:{ RemoteException -> 0x0054, GooglePlayServicesNotAvailableException -> 0x0068 }
                goto L_0x0036
            L_0x0054:
                r4 = move-exception
                com.google.android.gms.maps.model.RuntimeRemoteException r0 = new com.google.android.gms.maps.model.RuntimeRemoteException     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                r0.<init>(r4)     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                throw r0     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
            L_0x005b:
                java.util.ArrayList r4 = r3.f33216j     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                r4.clear()     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                return
            L_0x0061:
                r4 = move-exception
                com.google.android.gms.maps.model.RuntimeRemoteException r0 = new com.google.android.gms.maps.model.RuntimeRemoteException
                r0.<init>(r4)
                throw r0
            L_0x0068:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.MapView.C14901b.mo51372a(mj.d):void");
        }
    }

    public MapView(Context context) {
        super(context);
        this.zzbg = new C14901b(this, context, (GoogleMapOptions) null);
        setClickable(true);
    }

    public void getMapAsync(C14089b bVar) {
        Preconditions.checkMainThread("getMapAsync() must be called on the main thread");
        C14901b bVar2 = this.zzbg;
        T t = bVar2.f39975b;
        if (t != null) {
            try {
                ((C14900a) t).f33210b.getMapAsync(new C14911b(bVar));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            bVar2.f33216j.add(bVar);
        }
    }

    public final void onCreate(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.zzbg.mo69775c(bundle);
            if (this.zzbg.f39975b == null) {
                C18233a.m30754n(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final void onDestroy() {
        this.zzbg.mo69777e();
    }

    public final void onEnterAmbient(Bundle bundle) {
        Preconditions.checkMainThread("onEnterAmbient() must be called on the main thread");
        T t = this.zzbg.f39975b;
        if (t != null) {
            C14900a aVar = (C14900a) t;
            aVar.getClass();
            try {
                Bundle bundle2 = new Bundle();
                C14167a.m21955b(bundle, bundle2);
                aVar.f33210b.onEnterAmbient(bundle2);
                C14167a.m21955b(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    public final void onExitAmbient() {
        Preconditions.checkMainThread("onExitAmbient() must be called on the main thread");
        T t = this.zzbg.f39975b;
        if (t != null) {
            C14900a aVar = (C14900a) t;
            aVar.getClass();
            try {
                aVar.f33210b.onExitAmbient();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    public final void onLowMemory() {
        this.zzbg.mo69780h();
    }

    public final void onPause() {
        this.zzbg.mo69781i();
    }

    public final void onResume() {
        this.zzbg.mo69782j();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.zzbg.mo69783k(bundle);
    }

    public final void onStart() {
        this.zzbg.mo69784l();
    }

    public final void onStop() {
        this.zzbg.mo69785m();
    }

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zzbg = new C14901b(this, context, GoogleMapOptions.createFromAttributes(context, attributeSet));
        setClickable(true);
    }

    public MapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zzbg = new C14901b(this, context, GoogleMapOptions.createFromAttributes(context, attributeSet));
        setClickable(true);
    }

    public MapView(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.zzbg = new C14901b(this, context, googleMapOptions);
        setClickable(true);
    }
}
