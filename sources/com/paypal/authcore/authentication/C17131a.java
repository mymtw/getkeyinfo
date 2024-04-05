package com.paypal.authcore.authentication;

import android.content.Context;
import android.util.Log;
import com.paypal.openid.AuthorizationException;
import com.paypal.openid.C17148a;
import com.paypal.openid.C17149b;
import com.paypal.openid.C17150c;
import com.paypal.openid.C17156f;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import p568fn.C17782b;
import p668ro.C18502a;
import p708wo.C18755a;

/* renamed from: com.paypal.authcore.authentication.a */
public final class C17131a {

    /* renamed from: d */
    public static final AtomicReference<WeakReference<C17131a>> f37471d = new AtomicReference<>(new WeakReference((Object) null));

    /* renamed from: a */
    public final C18502a f37472a;

    /* renamed from: b */
    public final AtomicReference<C17148a> f37473b = new AtomicReference<>();

    /* renamed from: c */
    public C17150c f37474c;

    public C17131a(Context context) {
        this.f37472a = new C18502a(context);
        this.f37474c = new C17150c(context);
    }

    /* renamed from: b */
    public static C17131a m28574b(Context context) {
        AtomicReference<WeakReference<C17131a>> atomicReference = f37471d;
        C17131a aVar = (C17131a) atomicReference.get().get();
        if (aVar != null) {
            return aVar;
        }
        C17131a aVar2 = new C17131a(context.getApplicationContext());
        atomicReference.set(new WeakReference(aVar2));
        return aVar2;
    }

    /* renamed from: a */
    public final C17148a mo61649a() {
        C17148a aVar;
        boolean z;
        if (this.f37473b.get() == null) {
            C18502a aVar2 = this.f37472a;
            aVar2.f40743e.lock();
            try {
                String b = aVar2.mo70009b("state");
                aVar = b == null ? new C17148a() : C17148a.m28604b(b);
            } catch (JSONException unused) {
                Log.w("AuthStatePreferences", "Failed to deserialize stored auth state - discarding");
                aVar = new C17148a();
            } catch (Throwable th) {
                aVar2.f40743e.unlock();
                throw th;
            }
            aVar2.f40743e.unlock();
            AtomicReference<C17148a> atomicReference = this.f37473b;
            while (true) {
                if (!atomicReference.compareAndSet((Object) null, aVar)) {
                    if (atomicReference.get() != null) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                return aVar;
            }
        }
        return this.f37473b.get();
    }

    /* renamed from: c */
    public final void mo61650c(C17148a aVar) {
        C18502a aVar2 = this.f37472a;
        aVar2.f40743e.lock();
        try {
            aVar2.mo70010c("state", aVar.mo62550c());
            aVar2.f40743e.unlock();
            this.f37473b.set(aVar);
        } catch (Exception e) {
            throw new IllegalStateException("Failed to write state to shared prefs", e);
        } catch (Throwable th) {
            aVar2.f40743e.unlock();
            throw th;
        }
    }

    /* renamed from: d */
    public final void mo61651d(C17149b bVar, AuthorizationException authorizationException) {
        C17148a a = mo61649a();
        a.getClass();
        boolean z = true;
        boolean z2 = bVar != null;
        if (authorizationException == null) {
            z = false;
        }
        C17782b.m29832B(z ^ z2, "exactly one of authResponse or authException should be non-null");
        if (authorizationException != null) {
            a.f37562g = authorizationException;
        } else {
            a.f37559d = bVar;
            a.f37558c = null;
            a.f37560e = null;
            a.f37556a = null;
            a.f37562g = null;
            String str = bVar.f37571h;
            if (str == null) {
                str = bVar.f37564a.f40883i;
            }
            a.f37557b = str;
        }
        mo61650c(a);
    }

    /* renamed from: e */
    public final void mo61652e(C17156f fVar, AuthorizationException authorizationException) {
        C17148a a = mo61649a();
        a.getClass();
        C17782b.m29832B((fVar != null) ^ (authorizationException != null), "exactly one of tokenResponse or authException should be non-null");
        AuthorizationException authorizationException2 = a.f37562g;
        if (authorizationException2 != null) {
            C18755a.m31631b().mo70245c(5, (Exception) null, "AuthState.update should not be called in an error state (%s), call updatewith the result of the fresh authorization response first", authorizationException2);
            a.f37562g = null;
        }
        if (authorizationException == null) {
            a.f37560e = fVar;
            String str = fVar.f37618g;
            if (str != null) {
                a.f37557b = str;
            }
            String str2 = fVar.f37617f;
            if (str2 != null) {
                a.f37556a = str2;
            }
        } else if (authorizationException.type == 2) {
            a.f37562g = authorizationException;
        }
        mo61650c(a);
    }
}
