package p337de;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.user.auth.SignInActivity;
import kotlin.jvm.internal.C19383o;
import p019b.C3443a;
import p370ie.C12948h;

/* renamed from: de.c */
public final class C12649c extends C3443a<C12948h, C12647a> {
    /* renamed from: a */
    public final Intent mo1146a(ComponentActivity componentActivity, Object obj) {
        C12948h hVar = (C12948h) obj;
        C19383o.m32797g(componentActivity, ResponseConstants.CONTEXT);
        C19383o.m32797g(hVar, "key");
        Intent intent = new Intent(componentActivity, SignInActivity.class);
        intent.putExtras(hVar.getNavigationParams().mo45608a());
        return intent;
    }

    /* renamed from: c */
    public final Object mo1147c(int i, Intent intent) {
        return new C12647a(i, intent);
    }
}
