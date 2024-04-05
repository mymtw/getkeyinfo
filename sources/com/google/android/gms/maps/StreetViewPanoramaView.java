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
import com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import p514bk.C14090c;
import p521ck.C14167a;
import p621mj.C18233a;
import p621mj.C18235b;
import p621mj.C18236c;

public class StreetViewPanoramaView extends FrameLayout {
    private final C14905b zzcd;

    @VisibleForTesting
    /* renamed from: com.google.android.gms.maps.StreetViewPanoramaView$a */
    public static class C14904a implements C18235b {

        /* renamed from: a */
        public final ViewGroup f33223a;

        /* renamed from: b */
        public final IStreetViewPanoramaViewDelegate f33224b;

        /* renamed from: c */
        public View f33225c;

        public C14904a(ViewGroup viewGroup, IStreetViewPanoramaViewDelegate iStreetViewPanoramaViewDelegate) {
            this.f33224b = (IStreetViewPanoramaViewDelegate) Preconditions.checkNotNull(iStreetViewPanoramaViewDelegate);
            this.f33223a = (ViewGroup) Preconditions.checkNotNull(viewGroup);
        }

        /* renamed from: a */
        public final void mo51361a(Activity activity, Bundle bundle, Bundle bundle2) {
            throw new UnsupportedOperationException("onInflate not allowed on StreetViewPanoramaViewDelegate");
        }

        /* renamed from: b */
        public final View mo51362b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            throw new UnsupportedOperationException("onCreateView not allowed on StreetViewPanoramaViewDelegate");
        }

        public final void onCreate(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                C14167a.m21955b(bundle, bundle2);
                this.f33224b.onCreate(bundle2);
                C14167a.m21955b(bundle2, bundle);
                this.f33225c = (View) ObjectWrapper.unwrap(this.f33224b.getView());
                this.f33223a.removeAllViews();
                this.f33223a.addView(this.f33225c);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onDestroy() {
            try {
                this.f33224b.onDestroy();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onDestroyView() {
            throw new UnsupportedOperationException("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
        }

        public final void onLowMemory() {
            try {
                this.f33224b.onLowMemory();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onPause() {
            try {
                this.f33224b.onPause();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onResume() {
            try {
                this.f33224b.onResume();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onSaveInstanceState(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                C14167a.m21955b(bundle, bundle2);
                this.f33224b.onSaveInstanceState(bundle2);
                C14167a.m21955b(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onStart() {
            try {
                this.f33224b.onStart();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onStop() {
            try {
                this.f33224b.onStop();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    @VisibleForTesting
    /* renamed from: com.google.android.gms.maps.StreetViewPanoramaView$b */
    public static class C14905b extends C18233a<C14904a> {

        /* renamed from: f */
        public final ViewGroup f33226f;

        /* renamed from: g */
        public final Context f33227g;

        /* renamed from: h */
        public C18236c<C14904a> f33228h;

        /* renamed from: i */
        public final StreetViewPanoramaOptions f33229i;

        /* renamed from: j */
        public final ArrayList f33230j = new ArrayList();

        @VisibleForTesting
        public C14905b(ViewGroup viewGroup, Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
            this.f33226f = viewGroup;
            this.f33227g = context;
            this.f33229i = streetViewPanoramaOptions;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            return;
         */
        /* JADX WARNING: Removed duplicated region for block: B:20:? A[ExcHandler: GooglePlayServicesNotAvailableException (unused com.google.android.gms.common.GooglePlayServicesNotAvailableException), SYNTHETIC, Splitter:B:4:0x0008] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo51372a(p621mj.C18237d r4) {
            /*
                r3 = this;
                r3.f33228h = r4
                if (r4 == 0) goto L_0x0065
                T r4 = r3.f39975b
                if (r4 != 0) goto L_0x0065
                android.content.Context r4 = r3.f33227g     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                p514bk.C14088a.m21787p(r4)     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                android.content.Context r4 = r3.f33227g     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                com.google.android.gms.maps.internal.zze r4 = p521ck.C14168b.m21957a(r4)     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                android.content.Context r0 = r3.f33227g     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                com.google.android.gms.maps.StreetViewPanoramaOptions r1 = r3.f33229i     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate r4 = r4.zza((com.google.android.gms.dynamic.IObjectWrapper) r0, (com.google.android.gms.maps.StreetViewPanoramaOptions) r1)     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                mj.c<com.google.android.gms.maps.StreetViewPanoramaView$a> r0 = r3.f33228h     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                com.google.android.gms.maps.StreetViewPanoramaView$a r1 = new com.google.android.gms.maps.StreetViewPanoramaView$a     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                android.view.ViewGroup r2 = r3.f33226f     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                r1.<init>(r2, r4)     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                mj.d r0 = (p621mj.C18237d) r0     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                r0.mo69788a(r1)     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                java.util.ArrayList r4 = r3.f33230j     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                java.util.Iterator r4 = r4.iterator()     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
            L_0x0033:
                boolean r0 = r4.hasNext()     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                if (r0 == 0) goto L_0x0058
                java.lang.Object r0 = r4.next()     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                bk.c r0 = (p514bk.C14090c) r0     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                T r1 = r3.f39975b     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                com.google.android.gms.maps.StreetViewPanoramaView$a r1 = (com.google.android.gms.maps.StreetViewPanoramaView.C14904a) r1     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                r1.getClass()     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate r1 = r1.f33224b     // Catch:{ RemoteException -> 0x0051, GooglePlayServicesNotAvailableException -> 0x0065 }
                com.google.android.gms.maps.d r2 = new com.google.android.gms.maps.d     // Catch:{ RemoteException -> 0x0051, GooglePlayServicesNotAvailableException -> 0x0065 }
                r2.<init>(r0)     // Catch:{ RemoteException -> 0x0051, GooglePlayServicesNotAvailableException -> 0x0065 }
                r1.getStreetViewPanoramaAsync(r2)     // Catch:{ RemoteException -> 0x0051, GooglePlayServicesNotAvailableException -> 0x0065 }
                goto L_0x0033
            L_0x0051:
                r4 = move-exception
                com.google.android.gms.maps.model.RuntimeRemoteException r0 = new com.google.android.gms.maps.model.RuntimeRemoteException     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                r0.<init>(r4)     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                throw r0     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
            L_0x0058:
                java.util.ArrayList r4 = r3.f33230j     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                r4.clear()     // Catch:{ RemoteException -> 0x005e, GooglePlayServicesNotAvailableException -> 0x0065 }
                return
            L_0x005e:
                r4 = move-exception
                com.google.android.gms.maps.model.RuntimeRemoteException r0 = new com.google.android.gms.maps.model.RuntimeRemoteException
                r0.<init>(r4)
                throw r0
            L_0x0065:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.StreetViewPanoramaView.C14905b.mo51372a(mj.d):void");
        }
    }

    public StreetViewPanoramaView(Context context) {
        super(context);
        this.zzcd = new C14905b(this, context, (StreetViewPanoramaOptions) null);
    }

    public void getStreetViewPanoramaAsync(C14090c cVar) {
        Preconditions.checkMainThread("getStreetViewPanoramaAsync() must be called on the main thread");
        C14905b bVar = this.zzcd;
        T t = bVar.f39975b;
        if (t != null) {
            try {
                ((C14904a) t).f33224b.getStreetViewPanoramaAsync(new C14913d(cVar));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            bVar.f33230j.add(cVar);
        }
    }

    public final void onCreate(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.zzcd.mo69775c(bundle);
            if (this.zzcd.f39975b == null) {
                C18233a.m30754n(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onDestroy() {
        this.zzcd.mo69777e();
    }

    public final void onLowMemory() {
        this.zzcd.mo69780h();
    }

    public final void onPause() {
        this.zzcd.mo69781i();
    }

    public void onResume() {
        this.zzcd.mo69782j();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.zzcd.mo69783k(bundle);
    }

    public void onStart() {
        this.zzcd.mo69784l();
    }

    public void onStop() {
        this.zzcd.mo69785m();
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zzcd = new C14905b(this, context, (StreetViewPanoramaOptions) null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zzcd = new C14905b(this, context, (StreetViewPanoramaOptions) null);
    }

    public StreetViewPanoramaView(Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        super(context);
        this.zzcd = new C14905b(this, context, streetViewPanoramaOptions);
    }
}
