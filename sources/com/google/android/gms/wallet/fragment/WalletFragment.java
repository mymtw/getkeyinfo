package com.google.android.gms.wallet.fragment;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamic.FragmentWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.wallet.zzn;
import com.google.android.gms.internal.wallet.zzr;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
import p621mj.C18233a;
import p621mj.C18235b;
import p621mj.C18237d;
import p727zj.C18935d;

@TargetApi(12)
public final class WalletFragment extends Fragment {
    /* access modifiers changed from: private */
    public boolean zzfe = false;
    /* access modifiers changed from: private */
    public WalletFragmentOptions zzfi;
    /* access modifiers changed from: private */
    public WalletFragmentInitParams zzfj;
    /* access modifiers changed from: private */
    public MaskedWalletRequest zzfk;
    /* access modifiers changed from: private */
    public MaskedWallet zzfl;
    /* access modifiers changed from: private */
    public Boolean zzfm;
    /* access modifiers changed from: private */
    public C15169c zzfr;
    /* access modifiers changed from: private */
    public final FragmentWrapper zzfs = FragmentWrapper.wrap(this);
    private final C15170d zzft = new C15170d();
    /* access modifiers changed from: private */
    public C15168b zzfu = new C15168b(this);
    /* access modifiers changed from: private */
    public final Fragment zzfv = this;

    /* renamed from: com.google.android.gms.wallet.fragment.WalletFragment$a */
    public interface C15167a {
        /* renamed from: a */
        void mo52704a();
    }

    /* renamed from: com.google.android.gms.wallet.fragment.WalletFragment$b */
    public static class C15168b extends zzr {
        public C15168b(WalletFragment walletFragment) {
        }

        public final void zza(int i, int i2, Bundle bundle) {
        }
    }

    /* renamed from: com.google.android.gms.wallet.fragment.WalletFragment$c */
    public static class C15169c implements C18235b {

        /* renamed from: a */
        public final zzn f34062a;

        public C15169c(zzn zzn) {
            this.f34062a = zzn;
        }

        /* renamed from: a */
        public final void mo51361a(Activity activity, Bundle bundle, Bundle bundle2) {
            try {
                this.f34062a.zza(ObjectWrapper.wrap(activity), (WalletFragmentOptions) bundle.getParcelable("extraWalletFragmentOptions"), bundle2);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        /* renamed from: b */
        public final View mo51362b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            try {
                return (View) ObjectWrapper.unwrap(this.f34062a.onCreateView(ObjectWrapper.wrap(layoutInflater), ObjectWrapper.wrap(viewGroup), bundle));
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        public final void onCreate(Bundle bundle) {
            try {
                this.f34062a.onCreate(bundle);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        public final void onDestroy() {
        }

        public final void onDestroyView() {
        }

        public final void onLowMemory() {
        }

        public final void onPause() {
            try {
                this.f34062a.onPause();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        public final void onResume() {
            try {
                this.f34062a.onResume();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        public final void onSaveInstanceState(Bundle bundle) {
            try {
                this.f34062a.onSaveInstanceState(bundle);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        public final void onStart() {
            try {
                this.f34062a.onStart();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        public final void onStop() {
            try {
                this.f34062a.onStop();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: com.google.android.gms.wallet.fragment.WalletFragment$d */
    public class C15170d extends C18233a<C15169c> implements View.OnClickListener {
        public C15170d() {
        }

        /* renamed from: a */
        public final void mo51372a(C18237d dVar) {
            Activity activity = WalletFragment.this.zzfv.getActivity();
            if (WalletFragment.this.zzfr == null && WalletFragment.this.zzfe && activity != null) {
                try {
                    C15169c unused = WalletFragment.this.zzfr = new C15169c(C18935d.m32027a(activity, WalletFragment.this.zzfs, WalletFragment.this.zzfi, WalletFragment.this.zzfu));
                    WalletFragmentOptions unused2 = WalletFragment.this.zzfi = null;
                    dVar.mo69788a(WalletFragment.this.zzfr);
                    if (WalletFragment.this.zzfj != null) {
                        C15169c zzb = WalletFragment.this.zzfr;
                        WalletFragmentInitParams zzg = WalletFragment.this.zzfj;
                        zzb.getClass();
                        try {
                            zzb.f34062a.initialize(zzg);
                            WalletFragmentInitParams unused3 = WalletFragment.this.zzfj = null;
                        } catch (RemoteException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    if (WalletFragment.this.zzfk != null) {
                        C15169c zzb2 = WalletFragment.this.zzfr;
                        MaskedWalletRequest zzh = WalletFragment.this.zzfk;
                        zzb2.getClass();
                        try {
                            zzb2.f34062a.updateMaskedWalletRequest(zzh);
                            MaskedWalletRequest unused4 = WalletFragment.this.zzfk = null;
                        } catch (RemoteException e2) {
                            throw new RuntimeException(e2);
                        }
                    }
                    if (WalletFragment.this.zzfl != null) {
                        C15169c zzb3 = WalletFragment.this.zzfr;
                        MaskedWallet zzi = WalletFragment.this.zzfl;
                        zzb3.getClass();
                        try {
                            zzb3.f34062a.updateMaskedWallet(zzi);
                            MaskedWallet unused5 = WalletFragment.this.zzfl = null;
                        } catch (RemoteException e3) {
                            throw new RuntimeException(e3);
                        }
                    }
                    if (WalletFragment.this.zzfm != null) {
                        C15169c zzb4 = WalletFragment.this.zzfr;
                        boolean booleanValue = WalletFragment.this.zzfm.booleanValue();
                        zzb4.getClass();
                        try {
                            zzb4.f34062a.setEnabled(booleanValue);
                            Boolean unused6 = WalletFragment.this.zzfm = null;
                        } catch (RemoteException e4) {
                            throw new RuntimeException(e4);
                        }
                    }
                } catch (GooglePlayServicesNotAvailableException unused7) {
                }
            }
        }

        /* renamed from: b */
        public final void mo52686b(FrameLayout frameLayout) {
            WalletFragmentStyle fragmentStyle;
            Button button = new Button(WalletFragment.this.zzfv.getActivity());
            button.setText(R.string.wallet_buy_button_place_holder);
            int i = -2;
            int i2 = -1;
            if (!(WalletFragment.this.zzfi == null || (fragmentStyle = WalletFragment.this.zzfi.getFragmentStyle()) == null)) {
                DisplayMetrics displayMetrics = WalletFragment.this.zzfv.getResources().getDisplayMetrics();
                i2 = fragmentStyle.zza("buyButtonWidth", displayMetrics, -1);
                i = fragmentStyle.zza("buyButtonHeight", displayMetrics, -2);
            }
            button.setLayoutParams(new ViewGroup.LayoutParams(i2, i));
            button.setOnClickListener(this);
            frameLayout.addView(button);
        }

        public final void onClick(View view) {
            Activity activity = WalletFragment.this.zzfv.getActivity();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(activity, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE), activity, -1);
        }
    }

    public static WalletFragment newInstance(WalletFragmentOptions walletFragmentOptions) {
        WalletFragment walletFragment = new WalletFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extraWalletFragmentOptions", walletFragmentOptions);
        walletFragment.zzfv.setArguments(bundle);
        return walletFragment;
    }

    public final int getState() {
        C15169c cVar = this.zzfr;
        if (cVar == null) {
            return 0;
        }
        cVar.getClass();
        try {
            return cVar.f34062a.getState();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void initialize(WalletFragmentInitParams walletFragmentInitParams) {
        C15169c cVar = this.zzfr;
        if (cVar != null) {
            try {
                cVar.f34062a.initialize(walletFragmentInitParams);
                this.zzfj = null;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } else if (this.zzfj == null) {
            this.zzfj = walletFragmentInitParams;
            if (this.zzfk != null) {
                Log.w("WalletFragment", "updateMaskedWalletRequest() was called before initialize()");
            }
            if (this.zzfl != null) {
                Log.w("WalletFragment", "updateMaskedWallet() was called before initialize()");
            }
        } else {
            Log.w("WalletFragment", "initialize(WalletFragmentInitParams) was called more than once. Ignoring.");
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C15169c cVar = this.zzfr;
        if (cVar != null) {
            cVar.getClass();
            try {
                cVar.f34062a.onActivityResult(i, i2, intent);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        WalletFragmentOptions walletFragmentOptions;
        super.onCreate(bundle);
        if (bundle != null) {
            bundle.setClassLoader(WalletFragmentOptions.class.getClassLoader());
            WalletFragmentInitParams walletFragmentInitParams = (WalletFragmentInitParams) bundle.getParcelable("walletFragmentInitParams");
            if (walletFragmentInitParams != null) {
                if (this.zzfj != null) {
                    Log.w("WalletFragment", "initialize(WalletFragmentInitParams) was called more than once.Ignoring.");
                }
                this.zzfj = walletFragmentInitParams;
            }
            if (this.zzfk == null) {
                this.zzfk = (MaskedWalletRequest) bundle.getParcelable("maskedWalletRequest");
            }
            if (this.zzfl == null) {
                this.zzfl = (MaskedWallet) bundle.getParcelable("maskedWallet");
            }
            if (bundle.containsKey("walletFragmentOptions")) {
                this.zzfi = (WalletFragmentOptions) bundle.getParcelable("walletFragmentOptions");
            }
            if (bundle.containsKey(ResponseConstants.ENABLED)) {
                this.zzfm = Boolean.valueOf(bundle.getBoolean(ResponseConstants.ENABLED));
            }
        } else if (!(this.zzfv.getArguments() == null || (walletFragmentOptions = (WalletFragmentOptions) this.zzfv.getArguments().getParcelable("extraWalletFragmentOptions")) == null)) {
            walletFragmentOptions.zza(this.zzfv.getActivity());
            this.zzfi = walletFragmentOptions;
        }
        this.zzfe = true;
        this.zzft.mo69775c(bundle);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.zzft.mo69776d(layoutInflater, viewGroup, bundle);
    }

    public final void onDestroy() {
        super.onDestroy();
        this.zzfe = false;
    }

    public final void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(activity, attributeSet, bundle);
        if (this.zzfi == null) {
            this.zzfi = WalletFragmentOptions.zza((Context) activity, attributeSet);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("attrKeyWalletFragmentOptions", this.zzfi);
        this.zzft.mo69779g(activity, bundle2, bundle);
    }

    public final void onPause() {
        super.onPause();
        this.zzft.mo69781i();
    }

    public final void onResume() {
        super.onResume();
        this.zzft.mo69782j();
        FragmentManager fragmentManager = this.zzfv.getActivity().getFragmentManager();
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag(GooglePlayServicesUtil.GMS_ERROR_DIALOG);
        if (findFragmentByTag != null) {
            fragmentManager.beginTransaction().remove(findFragmentByTag).commit();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(this.zzfv.getActivity(), GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE), this.zzfv.getActivity(), -1);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.setClassLoader(WalletFragmentOptions.class.getClassLoader());
        this.zzft.mo69783k(bundle);
        WalletFragmentInitParams walletFragmentInitParams = this.zzfj;
        if (walletFragmentInitParams != null) {
            bundle.putParcelable("walletFragmentInitParams", walletFragmentInitParams);
            this.zzfj = null;
        }
        MaskedWalletRequest maskedWalletRequest = this.zzfk;
        if (maskedWalletRequest != null) {
            bundle.putParcelable("maskedWalletRequest", maskedWalletRequest);
            this.zzfk = null;
        }
        MaskedWallet maskedWallet = this.zzfl;
        if (maskedWallet != null) {
            bundle.putParcelable("maskedWallet", maskedWallet);
            this.zzfl = null;
        }
        WalletFragmentOptions walletFragmentOptions = this.zzfi;
        if (walletFragmentOptions != null) {
            bundle.putParcelable("walletFragmentOptions", walletFragmentOptions);
            this.zzfi = null;
        }
        Boolean bool = this.zzfm;
        if (bool != null) {
            bundle.putBoolean(ResponseConstants.ENABLED, bool.booleanValue());
            this.zzfm = null;
        }
    }

    public final void onStart() {
        super.onStart();
        this.zzft.mo69784l();
    }

    public final void onStop() {
        super.onStop();
        this.zzft.mo69785m();
    }

    public final void setEnabled(boolean z) {
        C15169c cVar = this.zzfr;
        if (cVar != null) {
            try {
                cVar.f34062a.setEnabled(z);
                this.zzfm = null;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } else {
            this.zzfm = Boolean.valueOf(z);
        }
    }

    public final void setOnStateChangedListener(C15167a aVar) {
        this.zzfu.getClass();
    }

    public final void updateMaskedWallet(MaskedWallet maskedWallet) {
        C15169c cVar = this.zzfr;
        if (cVar != null) {
            try {
                cVar.f34062a.updateMaskedWallet(maskedWallet);
                this.zzfl = null;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } else {
            this.zzfl = maskedWallet;
        }
    }

    public final void updateMaskedWalletRequest(MaskedWalletRequest maskedWalletRequest) {
        C15169c cVar = this.zzfr;
        if (cVar != null) {
            try {
                cVar.f34062a.updateMaskedWalletRequest(maskedWalletRequest);
                this.zzfk = null;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } else {
            this.zzfk = maskedWalletRequest;
        }
    }
}
