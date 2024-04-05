package p580hj;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* renamed from: hj.c */
public final class C17817c implements Result {

    /* renamed from: b */
    public Status f38724b;

    /* renamed from: c */
    public GoogleSignInAccount f38725c;

    public C17817c(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f38725c = googleSignInAccount;
        this.f38724b = status;
    }

    public final Status getStatus() {
        return this.f38724b;
    }
}
