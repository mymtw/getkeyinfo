package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
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

public class SupportMapFragment extends Fragment {
    private final C14907b zzch = new C14907b(this);

    @VisibleForTesting
    /* renamed from: com.google.android.gms.maps.SupportMapFragment$a */
    public static class C14906a implements C18235b {

        /* renamed from: a */
        public final Fragment f33231a;

        /* renamed from: b */
        public final IMapFragmentDelegate f33232b;

        public C14906a(Fragment fragment, IMapFragmentDelegate iMapFragmentDelegate) {
            this.f33232b = (IMapFragmentDelegate) Preconditions.checkNotNull(iMapFragmentDelegate);
            this.f33231a = (Fragment) Preconditions.checkNotNull(fragment);
        }

        /* renamed from: a */
        public final void mo51361a(Activity activity, Bundle bundle, Bundle bundle2) {
            GoogleMapOptions googleMapOptions = (GoogleMapOptions) bundle.getParcelable("MapOptions");
            try {
                Bundle bundle3 = new Bundle();
                C14167a.m21955b(bundle2, bundle3);
                this.f33232b.onInflate(ObjectWrapper.wrap(activity), googleMapOptions, bundle3);
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
                IObjectWrapper onCreateView = this.f33232b.onCreateView(ObjectWrapper.wrap(layoutInflater), ObjectWrapper.wrap(viewGroup), bundle2);
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
                Bundle arguments = this.f33231a.getArguments();
                if (arguments != null && arguments.containsKey("MapOptions")) {
                    C14167a.m21956c(bundle2, "MapOptions", arguments.getParcelable("MapOptions"));
                }
                this.f33232b.onCreate(bundle2);
                C14167a.m21955b(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onDestroy() {
            try {
                this.f33232b.onDestroy();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onDestroyView() {
            try {
                this.f33232b.onDestroyView();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onLowMemory() {
            try {
                this.f33232b.onLowMemory();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onPause() {
            try {
                this.f33232b.onPause();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onResume() {
            try {
                this.f33232b.onResume();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onSaveInstanceState(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                C14167a.m21955b(bundle, bundle2);
                this.f33232b.onSaveInstanceState(bundle2);
                C14167a.m21955b(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onStart() {
            try {
                this.f33232b.onStart();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onStop() {
            try {
                this.f33232b.onStop();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    @VisibleForTesting
    /* renamed from: com.google.android.gms.maps.SupportMapFragment$b */
    public static class C14907b extends C18233a<C14906a> {

        /* renamed from: f */
        public final Fragment f33233f;

        /* renamed from: g */
        public C18236c<C14906a> f33234g;

        /* renamed from: h */
        public Activity f33235h;

        /* renamed from: i */
        public final ArrayList f33236i = new ArrayList();

        @VisibleForTesting
        public C14907b(Fragment fragment) {
            this.f33233f = fragment;
        }

        /* renamed from: a */
        public final void mo51372a(C18237d dVar) {
            this.f33234g = dVar;
            mo51436q();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[ExcHandler: GooglePlayServicesNotAvailableException (unused com.google.android.gms.common.GooglePlayServicesNotAvailableException), SYNTHETIC, Splitter:B:6:0x000c] */
        /* renamed from: q */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo51436q() {
            /*
                r4 = this;
                android.app.Activity r0 = r4.f33235h
                if (r0 == 0) goto L_0x0068
                mj.c<com.google.android.gms.maps.SupportMapFragment$a> r1 = r4.f33234g
                if (r1 == 0) goto L_0x0068
                T r1 = r4.f39975b
                if (r1 != 0) goto L_0x0068
                p514bk.C14088a.m21787p(r0)     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                android.app.Activity r0 = r4.f33235h     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                com.google.android.gms.maps.internal.zze r0 = p521ck.C14168b.m21957a(r0)     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                android.app.Activity r1 = r4.f33235h     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r1)     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                com.google.android.gms.maps.internal.IMapFragmentDelegate r0 = r0.zzc(r1)     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                if (r0 != 0) goto L_0x0022
                return
            L_0x0022:
                mj.c<com.google.android.gms.maps.SupportMapFragment$a> r1 = r4.f33234g     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                com.google.android.gms.maps.SupportMapFragment$a r2 = new com.google.android.gms.maps.SupportMapFragment$a     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                androidx.fragment.app.Fragment r3 = r4.f33233f     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                r2.<init>(r3, r0)     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                mj.d r1 = (p621mj.C18237d) r1     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                r1.mo69788a(r2)     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                java.util.ArrayList r0 = r4.f33236i     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
            L_0x0036:
                boolean r1 = r0.hasNext()     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                if (r1 == 0) goto L_0x005b
                java.lang.Object r1 = r0.next()     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                bk.b r1 = (p514bk.C14089b) r1     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                T r2 = r4.f39975b     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                com.google.android.gms.maps.SupportMapFragment$a r2 = (com.google.android.gms.maps.SupportMapFragment.C14906a) r2     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                r2.getClass()     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                com.google.android.gms.maps.internal.IMapFragmentDelegate r2 = r2.f33232b     // Catch:{ RemoteException -> 0x0054, GooglePlayServicesNotAvailableException -> 0x0068 }
                com.google.android.gms.maps.e r3 = new com.google.android.gms.maps.e     // Catch:{ RemoteException -> 0x0054, GooglePlayServicesNotAvailableException -> 0x0068 }
                r3.<init>(r1)     // Catch:{ RemoteException -> 0x0054, GooglePlayServicesNotAvailableException -> 0x0068 }
                r2.getMapAsync(r3)     // Catch:{ RemoteException -> 0x0054, GooglePlayServicesNotAvailableException -> 0x0068 }
                goto L_0x0036
            L_0x0054:
                r0 = move-exception
                com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                r1.<init>(r0)     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
                throw r1     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
            L_0x005b:
                java.util.ArrayList r0 = r4.f33236i     // Catch:{ RemoteException -> 0x0061, GooglePlayServicesNotAvailableException -> 0x0068 }
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.SupportMapFragment.C14907b.mo51436q():void");
        }
    }

    public static SupportMapFragment newInstance() {
        return new SupportMapFragment();
    }

    public void getMapAsync(C14089b bVar) {
        Preconditions.checkMainThread("getMapAsync must be called on the main thread.");
        C14907b bVar2 = this.zzch;
        T t = bVar2.f39975b;
        if (t != null) {
            try {
                ((C14906a) t).f33232b.getMapAsync(new C14914e(bVar));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            bVar2.f33236i.add(bVar);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        C14907b bVar = this.zzch;
        bVar.f33235h = activity;
        bVar.mo51436q();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.zzch.mo69775c(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout d = this.zzch.mo69776d(layoutInflater, viewGroup, bundle);
        d.setClickable(true);
        return d;
    }

    public void onDestroy() {
        this.zzch.mo69777e();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.zzch.mo69778f();
        super.onDestroyView();
    }

    public final void onEnterAmbient(Bundle bundle) {
        Preconditions.checkMainThread("onEnterAmbient must be called on the main thread.");
        T t = this.zzch.f39975b;
        if (t != null) {
            C14906a aVar = (C14906a) t;
            aVar.getClass();
            try {
                Bundle bundle2 = new Bundle();
                C14167a.m21955b(bundle, bundle2);
                aVar.f33232b.onEnterAmbient(bundle2);
                C14167a.m21955b(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    public final void onExitAmbient() {
        Preconditions.checkMainThread("onExitAmbient must be called on the main thread.");
        T t = this.zzch.f39975b;
        if (t != null) {
            C14906a aVar = (C14906a) t;
            aVar.getClass();
            try {
                aVar.f33232b.onExitAmbient();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            C14907b bVar = this.zzch;
            bVar.f33235h = activity;
            bVar.mo51436q();
            GoogleMapOptions createFromAttributes = GoogleMapOptions.createFromAttributes(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", createFromAttributes);
            this.zzch.mo69779g(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onLowMemory() {
        this.zzch.mo69780h();
        super.onLowMemory();
    }

    public void onPause() {
        this.zzch.mo69781i();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.zzch.mo69782j();
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.zzch.mo69783k(bundle);
    }

    public void onStart() {
        super.onStart();
        this.zzch.mo69784l();
    }

    public void onStop() {
        this.zzch.mo69785m();
        super.onStop();
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }

    public static SupportMapFragment newInstance(GoogleMapOptions googleMapOptions) {
        SupportMapFragment supportMapFragment = new SupportMapFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", googleMapOptions);
        supportMapFragment.setArguments(bundle);
        return supportMapFragment;
    }
}
