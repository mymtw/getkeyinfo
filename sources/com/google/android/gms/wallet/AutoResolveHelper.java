package com.google.android.gms.wallet;

import android.app.Activity;
import android.app.Fragment;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.wallet.zze;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p605kk.C18119c;
import p605kk.C18123g;
import p613lk.C18191a;

public final class AutoResolveHelper {

    /* renamed from: a */
    public static final long f34049a = TimeUnit.MINUTES.toMillis(10);

    /* renamed from: b */
    public static long f34050b = SystemClock.elapsedRealtime();

    /* renamed from: c */
    public static final /* synthetic */ int f34051c = 0;

    /* renamed from: com.google.android.gms.wallet.AutoResolveHelper$a */
    public static class C15147a<TResult extends C18191a> implements C18119c<TResult>, Runnable {

        /* renamed from: e */
        public static final zze f34052e = new zze(Looper.getMainLooper());

        /* renamed from: f */
        public static final SparseArray<C15147a<?>> f34053f = new SparseArray<>(2);

        /* renamed from: g */
        public static final AtomicInteger f34054g = new AtomicInteger();

        /* renamed from: b */
        public int f34055b;

        /* renamed from: c */
        public zzb f34056c;

        /* renamed from: d */
        public C18123g<TResult> f34057d;

        public final void onComplete(C18123g<TResult> gVar) {
            this.f34057d = gVar;
            if (gVar != null && this.f34056c != null) {
                f34053f.delete(this.f34055b);
                f34052e.removeCallbacks(this);
                this.f34056c.zzb(this.f34057d);
            }
        }

        public final void run() {
            f34053f.delete(this.f34055b);
        }
    }

    public static class zzb extends Fragment {
        private static String zzaa = "delivered";
        private static String zzx = "resolveCallId";
        private static String zzy = "requestCode";
        private static String zzz = "initializationElapsedRealtime";
        private int zzab;
        private C15147a<?> zzac;
        private boolean zzad;

        /* access modifiers changed from: private */
        public static Fragment zza(int i, int i2) {
            Bundle bundle = new Bundle();
            bundle.putInt(zzx, i);
            bundle.putInt(zzy, i2);
            bundle.putLong(zzz, AutoResolveHelper.f34050b);
            zzb zzb = new zzb();
            zzb.setArguments(bundle);
            return zzb;
        }

        /* access modifiers changed from: private */
        public final void zzb(C18123g<? extends C18191a> gVar) {
            if (!this.zzad) {
                int i = 1;
                this.zzad = true;
                Activity activity = getActivity();
                activity.getFragmentManager().beginTransaction().remove(this).commit();
                if (gVar != null) {
                    int i2 = this.zzab;
                    int i3 = AutoResolveHelper.f34051c;
                    if (activity.isFinishing()) {
                        if (Log.isLoggable("AutoResolveHelper", 3)) {
                            Log.d("AutoResolveHelper", "Ignoring task result for, Activity is finishing.");
                        }
                    } else if (gVar.mo69663j() instanceof ResolvableApiException) {
                        try {
                            ((ResolvableApiException) gVar.mo69663j()).startResolutionForResult(activity, i2);
                        } catch (IntentSender.SendIntentException e) {
                            if (Log.isLoggable("AutoResolveHelper", 6)) {
                                Log.e("AutoResolveHelper", "Error starting pending intent!", e);
                            }
                        }
                    } else {
                        Intent intent = new Intent();
                        if (gVar.mo69668o()) {
                            i = -1;
                            ((C18191a) gVar.mo69664k()).putIntoIntent(intent);
                        } else if (gVar.mo69663j() instanceof ApiException) {
                            ApiException apiException = (ApiException) gVar.mo69663j();
                            intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", new Status(apiException.getStatusCode(), apiException.getMessage(), (PendingIntent) null));
                        } else {
                            if (Log.isLoggable("AutoResolveHelper", 6)) {
                                Log.e("AutoResolveHelper", "Unexpected non API exception!", gVar.mo69663j());
                            }
                            intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", new Status(8, "Unexpected non API exception when trying to deliver the task result to an activity!"));
                        }
                        AutoResolveHelper.m24722a(i2, i, activity, intent);
                    }
                } else {
                    AutoResolveHelper.m24722a(this.zzab, 0, activity, new Intent());
                }
            }
        }

        private final void zzc() {
            C15147a<?> aVar = this.zzac;
            if (aVar != null && aVar.f34056c == this) {
                aVar.f34056c = null;
            }
        }

        public final void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            this.zzab = getArguments().getInt(zzy);
            if (AutoResolveHelper.f34050b != getArguments().getLong(zzz)) {
                this.zzac = null;
            } else {
                this.zzac = C15147a.f34053f.get(getArguments().getInt(zzx));
            }
            this.zzad = bundle != null && bundle.getBoolean(zzaa);
        }

        public final void onPause() {
            super.onPause();
            zzc();
        }

        public final void onResume() {
            super.onResume();
            C15147a<?> aVar = this.zzac;
            if (aVar != null) {
                aVar.f34056c = this;
                if (aVar.f34057d != null) {
                    C15147a.f34053f.delete(aVar.f34055b);
                    C15147a.f34052e.removeCallbacks(aVar);
                    aVar.f34056c.zzb(aVar.f34057d);
                    return;
                }
                return;
            }
            if (Log.isLoggable("AutoResolveHelper", 5)) {
                Log.w("AutoResolveHelper", "Sending canceled result for garbage collected task!");
            }
            zzb((C18123g<? extends C18191a>) null);
        }

        public final void onSaveInstanceState(Bundle bundle) {
            super.onSaveInstanceState(bundle);
            bundle.putBoolean(zzaa, this.zzad);
            zzc();
        }
    }

    /* renamed from: a */
    public static void m24722a(int i, int i2, Activity activity, Intent intent) {
        PendingIntent createPendingResult = activity.createPendingResult(i, intent, 1073741824);
        if (createPendingResult != null) {
            try {
                createPendingResult.send(i2);
            } catch (PendingIntent.CanceledException e) {
                if (Log.isLoggable("AutoResolveHelper", 6)) {
                    Log.e("AutoResolveHelper", "Exception sending pending result", e);
                }
            }
        } else if (Log.isLoggable("AutoResolveHelper", 5)) {
            Log.w("AutoResolveHelper", "Null pending result returned when trying to deliver task result!");
        }
    }
}
