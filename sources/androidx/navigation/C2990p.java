package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.C2964h;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* renamed from: androidx.navigation.p */
public abstract class C2990p<D extends C2964h> {

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.navigation.p$a */
    public @interface C2991a {
        String value();
    }

    /* renamed from: a */
    public abstract D mo10951a();

    /* renamed from: b */
    public abstract C2964h mo10952b(C2964h hVar, Bundle bundle, C2971m mVar);

    /* renamed from: c */
    public void mo10961c(Bundle bundle) {
    }

    /* renamed from: d */
    public Bundle mo10962d() {
        return null;
    }

    /* renamed from: e */
    public abstract boolean mo10953e();
}
