package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C2887s;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import java.lang.reflect.Modifier;
import p230s1.C7796a;
import p230s1.C7798b;
import p588ij.C17843b;
import p588ij.C17852k;

@KeepName
public class SignInHubActivity extends FragmentActivity {
    private static boolean zzbt = false;
    private boolean zzbu = false;
    private SignInConfiguration zzbv;
    private boolean zzbw;
    /* access modifiers changed from: private */
    public int zzbx;
    /* access modifiers changed from: private */
    public Intent zzby;

    /* renamed from: com.google.android.gms.auth.api.signin.internal.SignInHubActivity$a */
    public class C14450a implements C7796a.C7797a<Void> {
        public C14450a() {
        }
    }

    private final void zzc(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        zzbt = false;
    }

    /* JADX INFO: finally extract failed */
    private final void zzn() {
        C7796a supportLoaderManager = getSupportLoaderManager();
        C14450a aVar = new C14450a();
        C7798b bVar = (C7798b) supportLoaderManager;
        if (bVar.f17238b.f17249c) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            C7798b.C7799a aVar2 = (C7798b.C7799a) bVar.f17238b.f17248b.mo19993f(0, (Integer) null);
            if (aVar2 == null) {
                Class<C17843b> cls = C17843b.class;
                try {
                    bVar.f17238b.f17249c = true;
                    C17843b bVar2 = new C17843b(this, GoogleApiClient.getAllClients());
                    if (cls.isMemberClass()) {
                        if (!Modifier.isStatic(cls.getModifiers())) {
                            throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + bVar2);
                        }
                    }
                    C7798b.C7799a aVar3 = new C7798b.C7799a(bVar2);
                    bVar.f17238b.f17248b.mo19994h(0, aVar3);
                    bVar.f17238b.f17249c = false;
                    C2887s sVar = bVar.f17237a;
                    C7798b.C7800b<D> bVar3 = new C7798b.C7800b<>(aVar3.f17241c, aVar);
                    aVar3.observe(sVar, bVar3);
                    C7798b.C7800b<D> bVar4 = aVar3.f17243e;
                    if (bVar4 != null) {
                        aVar3.removeObserver(bVar4);
                    }
                    aVar3.f17242d = sVar;
                    aVar3.f17243e = bVar3;
                } catch (Throwable th) {
                    bVar.f17238b.f17249c = false;
                    throw th;
                }
            } else {
                C2887s sVar2 = bVar.f17237a;
                C7798b.C7800b<D> bVar5 = new C7798b.C7800b<>(aVar2.f17241c, aVar);
                aVar2.observe(sVar2, bVar5);
                C7798b.C7800b<D> bVar6 = aVar2.f17243e;
                if (bVar6 != null) {
                    aVar2.removeObserver(bVar6);
                }
                aVar2.f17242d = sVar2;
                aVar2.f17243e = bVar5;
            }
            zzbt = false;
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.zzbu) {
            setResult(0);
            if (i == 40962) {
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                    if (signInAccount != null && signInAccount.getGoogleSignInAccount() != null) {
                        GoogleSignInAccount googleSignInAccount = signInAccount.getGoogleSignInAccount();
                        C17852k b = C17852k.m29975b(this);
                        GoogleSignInOptions zzm = this.zzbv.zzm();
                        synchronized (b) {
                            b.f38764a.mo69078d(googleSignInAccount, zzm);
                        }
                        intent.removeExtra("signInAccount");
                        intent.putExtra("googleSignInAccount", googleSignInAccount);
                        this.zzbw = true;
                        this.zzbx = i2;
                        this.zzby = intent;
                        zzn();
                        return;
                    } else if (intent.hasExtra("errorCode")) {
                        int intExtra = intent.getIntExtra("errorCode", 8);
                        if (intExtra == 13) {
                            intExtra = 12501;
                        }
                        zzc(intExtra);
                        return;
                    }
                }
                zzc(8);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            zzc(12500);
        } else if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            SignInConfiguration signInConfiguration = (SignInConfiguration) intent.getBundleExtra("config").getParcelable("config");
            this.zzbv = signInConfiguration;
            if (signInConfiguration == null) {
                Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                setResult(0);
                finish();
                return;
            }
            if (!(bundle == null)) {
                boolean z = bundle.getBoolean("signingInGoogleApiClients");
                this.zzbw = z;
                if (z) {
                    this.zzbx = bundle.getInt("signInResultCode");
                    this.zzby = (Intent) bundle.getParcelable("signInResultData");
                    zzn();
                }
            } else if (zzbt) {
                setResult(0);
                zzc(12502);
            } else {
                zzbt = true;
                Intent intent2 = new Intent(action);
                if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                    intent2.setPackage("com.google.android.gms");
                } else {
                    intent2.setPackage(getPackageName());
                }
                intent2.putExtra("config", this.zzbv);
                try {
                    startActivityForResult(intent2, 40962);
                } catch (ActivityNotFoundException unused) {
                    this.zzbu = true;
                    Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                    zzc(17);
                }
            }
        } else {
            String valueOf = String.valueOf(intent.getAction());
            Log.e("AuthSignInClient", valueOf.length() != 0 ? "Unknown action: ".concat(valueOf) : new String("Unknown action: "));
            finish();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.zzbw);
        if (this.zzbw) {
            bundle.putInt("signInResultCode", this.zzbx);
            bundle.putParcelable("signInResultData", this.zzby);
        }
    }
}
