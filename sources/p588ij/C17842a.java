package p588ij;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.conversation.MessageDraft;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import p504ai.C13983i;

@KeepForSdk
/* renamed from: ij.a */
public final class C17842a {

    /* renamed from: c */
    public static final ReentrantLock f38753c = new ReentrantLock();

    /* renamed from: d */
    public static C17842a f38754d;

    /* renamed from: a */
    public final ReentrantLock f38755a = new ReentrantLock();

    /* renamed from: b */
    public final SharedPreferences f38756b;

    @VisibleForTesting
    public C17842a(Context context) {
        this.f38756b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @RecentlyNonNull
    @KeepForSdk
    /* renamed from: a */
    public static C17842a m29965a(@RecentlyNonNull Context context) {
        Preconditions.checkNotNull(context);
        ReentrantLock reentrantLock = f38753c;
        reentrantLock.lock();
        try {
            if (f38754d == null) {
                f38754d = new C17842a(context.getApplicationContext());
            }
            C17842a aVar = f38754d;
            reentrantLock.unlock();
            return aVar;
        } catch (Throwable th) {
            f38753c.unlock();
            throw th;
        }
    }

    /* renamed from: f */
    public static String m29966f(String str, String str2) {
        return C13983i.m21492k(C0391c.m1055a(str2, str.length() + 1), str, MessageDraft.IMAGE_DELIMITER, str2);
    }

    @KeepForSdk
    @RecentlyNullable
    /* renamed from: b */
    public final GoogleSignInAccount mo69076b() {
        String g;
        String g2 = mo69080g("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(g2) && (g = mo69080g(m29966f("googleSignInAccount", g2))) != null) {
            try {
                return GoogleSignInAccount.zaa(g);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @KeepForSdk
    @RecentlyNullable
    /* renamed from: c */
    public final GoogleSignInOptions mo69077c() {
        String g;
        String g2 = mo69080g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g2) || (g = mo69080g(m29966f("googleSignInOptions", g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.zaa(g);
        } catch (JSONException unused) {
            return null;
        }
    }

    @KeepForSdk
    /* renamed from: d */
    public final void mo69078d(@RecentlyNonNull GoogleSignInAccount googleSignInAccount, @RecentlyNonNull GoogleSignInOptions googleSignInOptions) {
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        mo69079e("defaultGoogleSignInAccount", googleSignInAccount.zaa());
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        String zaa = googleSignInAccount.zaa();
        mo69079e(m29966f("googleSignInAccount", zaa), googleSignInAccount.zab());
        mo69079e(m29966f("googleSignInOptions", zaa), googleSignInOptions.zaa());
    }

    /* renamed from: e */
    public final void mo69079e(String str, String str2) {
        this.f38755a.lock();
        try {
            this.f38756b.edit().putString(str, str2).apply();
        } finally {
            this.f38755a.unlock();
        }
    }

    /* renamed from: g */
    public final String mo69080g(String str) {
        this.f38755a.lock();
        try {
            return this.f38756b.getString(str, (String) null);
        } finally {
            this.f38755a.unlock();
        }
    }

    /* renamed from: h */
    public final void mo69081h(String str) {
        this.f38755a.lock();
        try {
            this.f38756b.edit().remove(str).apply();
        } finally {
            this.f38755a.unlock();
        }
    }
}
