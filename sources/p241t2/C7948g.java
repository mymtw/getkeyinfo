package p241t2;

import android.webkit.WebViewRenderProcess;
import androidx.datastore.preferences.protobuf.C2606m;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: t2.g */
public final class C7948g extends C2606m {

    /* renamed from: a */
    public static WeakHashMap<WebViewRenderProcess, C7948g> f17417a = new WeakHashMap<>();

    public C7948g(WebViewRenderProcess webViewRenderProcess) {
        new WeakReference(webViewRenderProcess);
    }
}
