package com.google.android.gms.wallet.fragment;

import android.app.Activity;
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
import androidx.fragment.app.C2740a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.SupportFragmentWrapper;
import com.google.android.gms.internal.wallet.zzn;
import com.google.android.gms.internal.wallet.zzr;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
import p621mj.C18233a;
import p621mj.C18235b;
import p621mj.C18237d;
import p727zj.C18935d;

public final class SupportWalletFragment extends Fragment {
    /* access modifiers changed from: private */
    public final Fragment fragment = this;
    /* access modifiers changed from: private */
    public C15165c zzfd;
    /* access modifiers changed from: private */
    public boolean zzfe = false;
    /* access modifiers changed from: private */
    public final SupportFragmentWrapper zzff = SupportFragmentWrapper.wrap(this);
    private final C15166d zzfg = new C15166d();
    /* access modifiers changed from: private */
    public C15164b zzfh = new C15164b(this);
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

    /* renamed from: com.google.android.gms.wallet.fragment.SupportWalletFragment$a */
    public interface C15163a {
        /* renamed from: a */
        void mo52685a();
    }

    /* renamed from: com.google.android.gms.wallet.fragment.SupportWalletFragment$b */
    public static class C15164b extends zzr {
        public C15164b(SupportWalletFragment supportWalletFragment) {
        }

        public final void zza(int i, int i2, Bundle bundle) {
        }
    }

    /* renamed from: com.google.android.gms.wallet.fragment.SupportWalletFragment$c */
    public static class C15165c implements C18235b {

        /* renamed from: a */
        public final zzn f34060a;

        public C15165c(zzn zzn) {
            this.f34060a = zzn;
        }

        /* renamed from: a */
        public final void mo51361a(Activity activity, Bundle bundle, Bundle bundle2) {
            try {
                this.f34060a.zza(ObjectWrapper.wrap(activity), (WalletFragmentOptions) bundle.getParcelable("extraWalletFragmentOptions"), bundle2);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        /* renamed from: b */
        public final View mo51362b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            try {
                return (View) ObjectWrapper.unwrap(this.f34060a.onCreateView(ObjectWrapper.wrap(layoutInflater), ObjectWrapper.wrap(viewGroup), bundle));
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        public final void onCreate(Bundle bundle) {
            try {
                this.f34060a.onCreate(bundle);
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
                this.f34060a.onPause();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        public final void onResume() {
            try {
                this.f34060a.onResume();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        public final void onSaveInstanceState(Bundle bundle) {
            try {
                this.f34060a.onSaveInstanceState(bundle);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        public final void onStart() {
            try {
                this.f34060a.onStart();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        public final void onStop() {
            try {
                this.f34060a.onStop();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: com.google.android.gms.wallet.fragment.SupportWalletFragment$d */
    public class C15166d extends C18233a<C15165c> implements View.OnClickListener {
        public C15166d() {
        }

        /* renamed from: a */
        public final void mo51372a(C18237d dVar) {
            FragmentActivity activity = SupportWalletFragment.this.fragment.getActivity();
            if (SupportWalletFragment.this.zzfd == null && SupportWalletFragment.this.zzfe && activity != null) {
                try {
                    C15165c unused = SupportWalletFragment.this.zzfd = new C15165c(C18935d.m32027a(activity, SupportWalletFragment.this.zzff, SupportWalletFragment.this.zzfi, SupportWalletFragment.this.zzfh));
                    WalletFragmentOptions unused2 = SupportWalletFragment.this.zzfi = null;
                    dVar.mo69788a(SupportWalletFragment.this.zzfd);
                    if (SupportWalletFragment.this.zzfj != null) {
                        C15165c zzb = SupportWalletFragment.this.zzfd;
                        WalletFragmentInitParams zzg = SupportWalletFragment.this.zzfj;
                        zzb.getClass();
                        try {
                            zzb.f34060a.initialize(zzg);
                            WalletFragmentInitParams unused3 = SupportWalletFragment.this.zzfj = null;
                        } catch (RemoteException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    if (SupportWalletFragment.this.zzfk != null) {
                        C15165c zzb2 = SupportWalletFragment.this.zzfd;
                        MaskedWalletRequest zzh = SupportWalletFragment.this.zzfk;
                        zzb2.getClass();
                        try {
                            zzb2.f34060a.updateMaskedWalletRequest(zzh);
                            MaskedWalletRequest unused4 = SupportWalletFragment.this.zzfk = null;
                        } catch (RemoteException e2) {
                            throw new RuntimeException(e2);
                        }
                    }
                    if (SupportWalletFragment.this.zzfl != null) {
                        C15165c zzb3 = SupportWalletFragment.this.zzfd;
                        MaskedWallet zzi = SupportWalletFragment.this.zzfl;
                        zzb3.getClass();
                        try {
                            zzb3.f34060a.updateMaskedWallet(zzi);
                            MaskedWallet unused5 = SupportWalletFragment.this.zzfl = null;
                        } catch (RemoteException e3) {
                            throw new RuntimeException(e3);
                        }
                    }
                    if (SupportWalletFragment.this.zzfm != null) {
                        C15165c zzb4 = SupportWalletFragment.this.zzfd;
                        boolean booleanValue = SupportWalletFragment.this.zzfm.booleanValue();
                        zzb4.getClass();
                        try {
                            zzb4.f34060a.setEnabled(booleanValue);
                            Boolean unused6 = SupportWalletFragment.this.zzfm = null;
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
            Button button = new Button(SupportWalletFragment.this.fragment.getActivity());
            button.setText(R.string.wallet_buy_button_place_holder);
            int i = -2;
            int i2 = -1;
            if (!(SupportWalletFragment.this.zzfi == null || (fragmentStyle = SupportWalletFragment.this.zzfi.getFragmentStyle()) == null)) {
                DisplayMetrics displayMetrics = SupportWalletFragment.this.fragment.getResources().getDisplayMetrics();
                i2 = fragmentStyle.zza("buyButtonWidth", displayMetrics, -1);
                i = fragmentStyle.zza("buyButtonHeight", displayMetrics, -2);
            }
            button.setLayoutParams(new ViewGroup.LayoutParams(i2, i));
            button.setOnClickListener(this);
            frameLayout.addView(button);
        }

        public final void onClick(View view) {
            FragmentActivity activity = SupportWalletFragment.this.fragment.getActivity();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(activity, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE), activity, -1);
        }
    }

    public static SupportWalletFragment newInstance(WalletFragmentOptions walletFragmentOptions) {
        SupportWalletFragment supportWalletFragment = new SupportWalletFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extraWalletFragmentOptions", walletFragmentOptions);
        supportWalletFragment.fragment.setArguments(bundle);
        return supportWalletFragment;
    }

    public final int getState() {
        C15165c cVar = this.zzfd;
        if (cVar == null) {
            return 0;
        }
        cVar.getClass();
        try {
            return cVar.f34060a.getState();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void initialize(WalletFragmentInitParams walletFragmentInitParams) {
        C15165c cVar = this.zzfd;
        if (cVar != null) {
            try {
                cVar.f34060a.initialize(walletFragmentInitParams);
                this.zzfj = null;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } else if (this.zzfj == null) {
            this.zzfj = walletFragmentInitParams;
            if (this.zzfk != null) {
                Log.w("SupportWalletFragment", "updateMaskedWalletRequest() was called before initialize()");
            }
            if (this.zzfl != null) {
                Log.w("SupportWalletFragment", "updateMaskedWallet() was called before initialize()");
            }
        } else {
            Log.w("SupportWalletFragment", "initialize(WalletFragmentInitParams) was called more than once. Ignoring.");
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C15165c cVar = this.zzfd;
        if (cVar != null) {
            cVar.getClass();
            try {
                cVar.f34060a.onActivityResult(i, i2, intent);
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
                    Log.w("SupportWalletFragment", "initialize(WalletFragmentInitParams) was called more than once.Ignoring.");
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
        } else if (!(this.fragment.getArguments() == null || (walletFragmentOptions = (WalletFragmentOptions) this.fragment.getArguments().getParcelable("extraWalletFragmentOptions")) == null)) {
            walletFragmentOptions.zza(this.fragment.getActivity());
            this.zzfi = walletFragmentOptions;
        }
        this.zzfe = true;
        this.zzfg.mo69775c(bundle);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.zzfg.mo69776d(layoutInflater, viewGroup, bundle);
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
        this.zzfg.mo69779g(activity, bundle2, bundle);
    }

    public final void onPause() {
        super.onPause();
        this.zzfg.mo69781i();
    }

    public final void onResume() {
        super.onResume();
        this.zzfg.mo69782j();
        FragmentManager supportFragmentManager = this.fragment.getActivity().getSupportFragmentManager();
        Fragment C = supportFragmentManager.mo10353C(GooglePlayServicesUtil.GMS_ERROR_DIALOG);
        if (C != null) {
            C2740a aVar = new C2740a(supportFragmentManager);
            aVar.mo10490n(C);
            aVar.mo10483d();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(this.fragment.getActivity(), GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE), this.fragment.getActivity(), -1);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.setClassLoader(WalletFragmentOptions.class.getClassLoader());
        this.zzfg.mo69783k(bundle);
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
        this.zzfg.mo69784l();
    }

    public final void onStop() {
        super.onStop();
        this.zzfg.mo69785m();
    }

    public final void setEnabled(boolean z) {
        C15165c cVar = this.zzfd;
        if (cVar != null) {
            try {
                cVar.f34060a.setEnabled(z);
                this.zzfm = null;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } else {
            this.zzfm = Boolean.valueOf(z);
        }
    }

    public final void setOnStateChangedListener(C15163a aVar) {
        this.zzfh.getClass();
    }

    public final void updateMaskedWallet(MaskedWallet maskedWallet) {
        C15165c cVar = this.zzfd;
        if (cVar != null) {
            try {
                cVar.f34060a.updateMaskedWallet(maskedWallet);
                this.zzfl = null;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } else {
            this.zzfl = maskedWallet;
        }
    }

    public final void updateMaskedWalletRequest(MaskedWalletRequest maskedWalletRequest) {
        C15165c cVar = this.zzfd;
        if (cVar != null) {
            try {
                cVar.f34060a.updateMaskedWalletRequest(maskedWalletRequest);
                this.zzfk = null;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } else {
            this.zzfk = maskedWalletRequest;
        }
    }
}
