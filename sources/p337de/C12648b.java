package p337de;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.user.review.CreateReviewActivity;
import kotlin.jvm.internal.C19383o;
import p019b.C3443a;
import p370ie.C12942b;

/* renamed from: de.b */
public final class C12648b extends C3443a<C12942b, C12647a> {
    /* renamed from: a */
    public final Intent mo1146a(ComponentActivity componentActivity, Object obj) {
        C12942b bVar = (C12942b) obj;
        C19383o.m32797g(componentActivity, ResponseConstants.CONTEXT);
        C19383o.m32797g(bVar, "key");
        Intent intent = new Intent(componentActivity, CreateReviewActivity.class);
        intent.putExtras(bVar.getNavigationParams().mo45608a());
        return intent;
    }

    /* renamed from: c */
    public final Object mo1147c(int i, Intent intent) {
        return new C12647a(i, intent);
    }
}
