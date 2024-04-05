package com.google.android.gms.maps;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
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
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import p514bk.C14089b;
import p521ck.C14167a;
import p621mj.C18233a;
import p621mj.C18235b;
import p621mj.C18236c;
import p621mj.C18237d;

@TargetApi(11)
public class MapFragment extends Fragment {
    private final C14899b zzaz = new C14899b(this);

    @VisibleForTesting
    /* renamed from: com.google.android.gms.maps.MapFragment$a */
    public static class C14898a implements C18235b {

        /* renamed from: a */
        public final Fragment f33203a;

        /* renamed from: b */
        public final IMapFragmentDelegate f33204b;

        public C14898a(Fragment fragment, IMapFragmentDelegate iMapFragmentDelegate) {
            this.f33204b = (IMapFragmentDelegate) Preconditions.checkNotNull(iMapFragmentDelegate);
            this.f33203a = (Fragment) Preconditions.checkNotNull(fragment);
        }

        /* renamed from: a */
        public final void mo51361a(Activity activity, Bundle bundle, Bundle bundle2) {
            GoogleMapOptions googleMapOptions = (GoogleMapOptions) bundle.getParcelable("MapOptions");
            try {
                Bundle bundle3 = new Bundle();
                C14167a.m21955b(bundle2, bundle3);
                this.f33204b.onInflate(ObjectWrapper.wrap(activity), googleMapOptions, bundle3);
                C14167a.m21955b(bundle3, bundle2);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: b */
        public final View mo51362b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                C14167a.m21955b(bundle, bundle2);
                IObjectWrapper onCreateView = this.f33204b.onCreateView(ObjectWrapper.wrap(layoutInflater), ObjectWrapper.wrap(viewGroup), bundle2);
                C14167a.m21955b(bundle2, bundle);
                return (View) ObjectWrapper.unwrap(onCreateView);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onCreate(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                C14167a.m21955b(bundle, bundle2);
                Bundle arguments = this.f33203a.getArguments();
                if (arguments != null && arguments.containsKey("MapOptions")) {
                    C14167a.m21956c(bundle2, "MapOptions", arguments.getParcelable("MapOptions"));
                }
                this.f33204b.onCreate(bundle2);
                C14167a.m21955b(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onDestroy() {
            try {
                this.f33204b.onDestroy();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onDestroyView() {
            try {
                this.f33204b.onDestroyView();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onLowMemory() {
            try {
                this.f33204b.onLowMemory();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onPause() {
            try {
                this.f33204b.onPause();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onResume() {
            try {
                this.f33204b.onResume();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onSaveInstanceState(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                C14167a.m21955b(bundle, bundle2);
                this.f33204b.onSaveInstanceState(bundle2);
                C14167a.m21955b(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onStart() {
            try {
                this.f33204b.onStart();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onStop() {
            try {
                this.f33204b.onStop();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    @VisibleForTesting
    /* renamed from: com.google.android.gms.maps.MapFragment$b */
    public static class C14899b extends C18233a<C14898a> {

        /* renamed from: f */
        public final Fragment f33205f;

        /* renamed from: g */
        public C18236c<C14898a> f33206g;

        /* renamed from: h */
        public Activity f33207h;

        /* renamed from: i */
        public final ArrayList f33208i = new ArrayList();

        @VisibleForTesting
        public C14899b(Fragment fragment) {
            this.f33205f = fragment;
        }

        /* renamed from: a */
        public final void mo51372a(C18237d dVar) {
            this.f33206g = dVar;
            mo51373q();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[ExcHandler: GooglePlayServicesNotAvailableException (unused com.google.android.gms.common.GooglePlayServicesNotAvailableException), SYNTHETIC, Splitter:B:6:0x000c] */
        /* renamed from: q */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo51373q() {
            /*
                r4 = this;
                android.app.Activity r0 = r4.f33207h
                if (r0 == 0) goto L_0x0068
                mj.c<com.google.android.gms.maps.MapFragment$a> r1 = r4.f33206g
                if (r1 == 0) goto L_0x0068
                T r1 = r4.f39975b
                if (r1 != 0) goto L_0x0068
                p514bk.C14088a.m21787p(r0)     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                android.app.Activity r0 = r4.f33207h     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                com.google.android.gms.maps.internal.zze r0 = p521ck.C14168b.m21957a(r0)     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                android.app.Activity r1 = r4.f33207h     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r1)     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                com.google.android.gms.maps.internal.IMapFragmentDelegate r0 = r0.zzc(r1)     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                if (r0 != 0) goto L_0x0022
                return
            L_0x0022:
                mj.c<com.google.android.gms.maps.MapFragment$a> r1 = r4.f33206g     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                com.google.android.gms.maps.MapFragment$a r2 = new com.google.android.gms.maps.MapFragment$a     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                android.app.Fragment r3 = r4.f33205f     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                r2.<init>(r3, r0)     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                mj.d r1 = (p621mj.C18237d) r1     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                r1.mo69788a(r2)     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                java.util.ArrayList r0 = r4.f33208i     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
            L_0x0036:
                boolean r1 = r0.hasNext()     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                if (r1 == 0) goto L_0x005b
                java.lang.Object r1 = r0.next()     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                bk.b r1 = (p514bk.C14089b) r1     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                T r2 = r4.f39975b     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                com.google.android.gms.maps.MapFragment$a r2 = (com.google.android.gms.maps.MapFragment.C14898a) r2     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                r2.getClass()     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                com.google.android.gms.maps.internal.IMapFragmentDelegate r2 = r2.f33204b     // Catch:{ RemoteException -> 0x0054, GooglePlayServicesNotAvailableException -> 0x0068 }
                com.google.android.gms.maps.a r3 = new com.google.android.gms.maps.a     // Catch:{ RemoteException -> 0x0054, GooglePlayServicesNotAvailableException -> 0x0068 }
                r3.<init>(r1)     // Catch:{ RemoteException -> 0x0054, GooglePlayServicesNotAvailableException -> 0x0068 }
                r2.getMapAsync(r3)     // Catch:{ RemoteException -> 0x0054, GooglePlayServicesNotAvailableException -> 0x0068 }
                goto L_0x0036
            L_0x0054:
                r0 = move-exception
                com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                r1.<init>(r0)     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                throw r1     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
            L_0x005b:
                java.util.ArrayList r0 = r4.f33208i     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                r0.clear()     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                return
            L_0x0061:
                r0 = move-exception
                com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
                r1.<init>(r0)
                throw r1
            L_0x0068:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.MapFragment.C14899b.mo51373q():void");
        }
    }

    public static MapFragment newInstance() {
        return new MapFragment();
    }

    public void getMapAsync(C14089b bVar) {
        Preconditions.checkMainThread("getMapAsync must be called on the main thread.");
        C14899b bVar2 = this.zzaz;
        T t = bVar2.f39975b;
        if (t != null) {
            try {
                ((C14898a) t).f33204b.getMapAsync(new C14910a(bVar));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            bVar2.f33208i.add(bVar);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MapFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        C14899b bVar = this.zzaz;
        bVar.f33207h = activity;
        bVar.mo51373q();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.zzaz.mo69775c(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout d = this.zzaz.mo69776d(layoutInflater, viewGroup, bundle);
        d.setClickable(true);
        return d;
    }

    public void onDestroy() {
        this.zzaz.mo69777e();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.zzaz.mo69778f();
        super.onDestroyView();
    }

    public final void onEnterAmbient(Bundle bundle) {
        Preconditions.checkMainThread("onEnterAmbient must be called on the main thread.");
        T t = this.zzaz.f39975b;
        if (t != null) {
            C14898a aVar = (C14898a) t;
            aVar.getClass();
            try {
                Bundle bundle2 = new Bundle();
                C14167a.m21955b(bundle, bundle2);
                aVar.f33204b.onEnterAmbient(bundle2);
                C14167a.m21955b(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    public final void onExitAmbient() {
        Preconditions.checkMainThread("onExitAmbient must be called on the main thread.");
        T t = this.zzaz.f39975b;
        if (t != null) {
            C14898a aVar = (C14898a) t;
            aVar.getClass();
            try {
                aVar.f33204b.onExitAmbient();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            C14899b bVar = this.zzaz;
            bVar.f33207h = activity;
            bVar.mo51373q();
            GoogleMapOptions createFromAttributes = GoogleMapOptions.createFromAttributes(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", createFromAttributes);
            this.zzaz.mo69779g(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onLowMemory() {
        this.zzaz.mo69780h();
        super.onLowMemory();
    }

    public void onPause() {
        this.zzaz.mo69781i();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.zzaz.mo69782j();
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MapFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.zzaz.mo69783k(bundle);
    }

    public void onStart() {
        super.onStart();
        this.zzaz.mo69784l();
    }

    public void onStop() {
        this.zzaz.mo69785m();
        super.onStop();
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }

    public static MapFragment newInstance(GoogleMapOptions googleMapOptions) {
        MapFragment mapFragment = new MapFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", googleMapOptions);
        mapFragment.setArguments(bundle);
        return mapFragment;
    }
}
