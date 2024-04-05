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
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import p514bk.C14090c;
import p521ck.C14167a;
import p621mj.C18233a;
import p621mj.C18235b;
import p621mj.C18236c;
import p621mj.C18237d;

@TargetApi(11)
public class StreetViewPanoramaFragment extends Fragment {
    private final C14903b zzbt = new C14903b(this);

    @VisibleForTesting
    /* renamed from: com.google.android.gms.maps.StreetViewPanoramaFragment$a */
    public static class C14902a implements C18235b {

        /* renamed from: a */
        public final Fragment f33217a;

        /* renamed from: b */
        public final IStreetViewPanoramaFragmentDelegate f33218b;

        public C14902a(Fragment fragment, IStreetViewPanoramaFragmentDelegate iStreetViewPanoramaFragmentDelegate) {
            this.f33218b = (IStreetViewPanoramaFragmentDelegate) Preconditions.checkNotNull(iStreetViewPanoramaFragmentDelegate);
            this.f33217a = (Fragment) Preconditions.checkNotNull(fragment);
        }

        /* renamed from: a */
        public final void mo51361a(Activity activity, Bundle bundle, Bundle bundle2) {
            try {
                Bundle bundle3 = new Bundle();
                C14167a.m21955b(bundle2, bundle3);
                this.f33218b.onInflate(ObjectWrapper.wrap(activity), (StreetViewPanoramaOptions) null, bundle3);
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
                IObjectWrapper onCreateView = this.f33218b.onCreateView(ObjectWrapper.wrap(layoutInflater), ObjectWrapper.wrap(viewGroup), bundle2);
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
                Bundle arguments = this.f33217a.getArguments();
                if (arguments != null && arguments.containsKey("StreetViewPanoramaOptions")) {
                    C14167a.m21956c(bundle2, "StreetViewPanoramaOptions", arguments.getParcelable("StreetViewPanoramaOptions"));
                }
                this.f33218b.onCreate(bundle2);
                C14167a.m21955b(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onDestroy() {
            try {
                this.f33218b.onDestroy();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onDestroyView() {
            try {
                this.f33218b.onDestroyView();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onLowMemory() {
            try {
                this.f33218b.onLowMemory();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onPause() {
            try {
                this.f33218b.onPause();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onResume() {
            try {
                this.f33218b.onResume();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onSaveInstanceState(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                C14167a.m21955b(bundle, bundle2);
                this.f33218b.onSaveInstanceState(bundle2);
                C14167a.m21955b(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onStart() {
            try {
                this.f33218b.onStart();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onStop() {
            try {
                this.f33218b.onStop();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    @VisibleForTesting
    /* renamed from: com.google.android.gms.maps.StreetViewPanoramaFragment$b */
    public static class C14903b extends C18233a<C14902a> {

        /* renamed from: f */
        public final Fragment f33219f;

        /* renamed from: g */
        public C18236c<C14902a> f33220g;

        /* renamed from: h */
        public Activity f33221h;

        /* renamed from: i */
        public final ArrayList f33222i = new ArrayList();

        @VisibleForTesting
        public C14903b(Fragment fragment) {
            this.f33219f = fragment;
        }

        /* renamed from: a */
        public final void mo51372a(C18237d dVar) {
            this.f33220g = dVar;
            mo51400q();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            return;
         */
        /* JADX WARNING: Removed duplicated region for block: B:22:? A[ExcHandler: GooglePlayServicesNotAvailableException (unused com.google.android.gms.common.GooglePlayServicesNotAvailableException), SYNTHETIC, Splitter:B:6:0x000c] */
        /* renamed from: q */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo51400q() {
            /*
                r4 = this;
                android.app.Activity r0 = r4.f33221h
                if (r0 == 0) goto L_0x0065
                mj.c<com.google.android.gms.maps.StreetViewPanoramaFragment$a> r1 = r4.f33220g
                if (r1 == 0) goto L_0x0065
                T r1 = r4.f39975b
                if (r1 != 0) goto L_0x0065
                p514bk.C14088a.m21787p(r0)     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                android.app.Activity r0 = r4.f33221h     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                com.google.android.gms.maps.internal.zze r0 = p521ck.C14168b.m21957a(r0)     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                android.app.Activity r1 = r4.f33221h     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r1)     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate r0 = r0.zzd(r1)     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                mj.c<com.google.android.gms.maps.StreetViewPanoramaFragment$a> r1 = r4.f33220g     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                com.google.android.gms.maps.StreetViewPanoramaFragment$a r2 = new com.google.android.gms.maps.StreetViewPanoramaFragment$a     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                android.app.Fragment r3 = r4.f33219f     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                r2.<init>(r3, r0)     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                mj.d r1 = (p621mj.C18237d) r1     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                r1.mo69788a(r2)     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                java.util.ArrayList r0 = r4.f33222i     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
            L_0x0033:
                boolean r1 = r0.hasNext()     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                if (r1 == 0) goto L_0x0058
                java.lang.Object r1 = r0.next()     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                bk.c r1 = (p514bk.C14090c) r1     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                T r2 = r4.f39975b     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                com.google.android.gms.maps.StreetViewPanoramaFragment$a r2 = (com.google.android.gms.maps.StreetViewPanoramaFragment.C14902a) r2     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                r2.getClass()     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate r2 = r2.f33218b     // Catch:{ RemoteException -> 0x0051, GooglePlayServicesNotAvailableException -> 0x0065 }
                com.google.android.gms.maps.c r3 = new com.google.android.gms.maps.c     // Catch:{ RemoteException -> 0x0051, GooglePlayServicesNotAvailableException -> 0x0065 }
                r3.<init>(r1)     // Catch:{ RemoteException -> 0x0051, GooglePlayServicesNotAvailableException -> 0x0065 }
                r2.getStreetViewPanoramaAsync(r3)     // Catch:{ RemoteException -> 0x0051, GooglePlayServicesNotAvailableException -> 0x0065 }
                goto L_0x0033
            L_0x0051:
                r0 = move-exception
                com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                r1.<init>(r0)     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                throw r1     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
            L_0x0058:
                java.util.ArrayList r0 = r4.f33222i     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                r0.clear()     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                return
            L_0x005e:
                r0 = move-exception
                com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
                r1.<init>(r0)
                throw r1
            L_0x0065:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.StreetViewPanoramaFragment.C14903b.mo51400q():void");
        }
    }

    public static StreetViewPanoramaFragment newInstance() {
        return new StreetViewPanoramaFragment();
    }

    public void getStreetViewPanoramaAsync(C14090c cVar) {
        Preconditions.checkMainThread("getStreetViewPanoramaAsync() must be called on the main thread");
        C14903b bVar = this.zzbt;
        T t = bVar.f39975b;
        if (t != null) {
            try {
                ((C14902a) t).f33218b.getStreetViewPanoramaAsync(new C14912c(cVar));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            bVar.f33222i.add(cVar);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(StreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        C14903b bVar = this.zzbt;
        bVar.f33221h = activity;
        bVar.mo51400q();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.zzbt.mo69775c(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.zzbt.mo69776d(layoutInflater, viewGroup, bundle);
    }

    public void onDestroy() {
        this.zzbt.mo69777e();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.zzbt.mo69778f();
        super.onDestroyView();
    }

    @SuppressLint({"NewApi"})
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            C14903b bVar = this.zzbt;
            bVar.f33221h = activity;
            bVar.mo51400q();
            this.zzbt.mo69779g(activity, new Bundle(), bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onLowMemory() {
        this.zzbt.mo69780h();
        super.onLowMemory();
    }

    public void onPause() {
        this.zzbt.mo69781i();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.zzbt.mo69782j();
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(StreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.zzbt.mo69783k(bundle);
    }

    public void onStart() {
        super.onStart();
        this.zzbt.mo69784l();
    }

    public void onStop() {
        this.zzbt.mo69785m();
        super.onStop();
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }

    public static StreetViewPanoramaFragment newInstance(StreetViewPanoramaOptions streetViewPanoramaOptions) {
        StreetViewPanoramaFragment streetViewPanoramaFragment = new StreetViewPanoramaFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("StreetViewPanoramaOptions", streetViewPanoramaOptions);
        streetViewPanoramaFragment.setArguments(bundle);
        return streetViewPanoramaFragment;
    }
}
