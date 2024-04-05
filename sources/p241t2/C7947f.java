package p241t2;

import android.content.Context;
import com.google.android.play.core.appupdate.C15564f;
import com.google.android.play.core.appupdate.C15568j;
import com.google.android.play.core.assetpacks.C15588c1;
import com.google.android.play.core.internal.C15686c0;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import p760nr.C19921a;

/* renamed from: t2.f */
public final class C7947f implements C7946e, C15686c0 {

    /* renamed from: b */
    public Object f17416b;

    public /* synthetic */ C7947f(Object obj) {
        this.f17416b = obj;
    }

    /* renamed from: a */
    public final String[] mo20481a() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f17416b).getSupportedFeatures();
    }

    public final WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) C19921a.m34065a(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f17416b).getWebkitToCompatConverter());
    }

    public final Object zza() {
        Context context = (Context) ((C15568j) ((C15686c0) this.f17416b)).f35038b.f35037c;
        C15588c1.m25311V0(context);
        return new C15564f(context);
    }
}
