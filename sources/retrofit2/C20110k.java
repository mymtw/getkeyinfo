package retrofit2;

import androidx.compose.foundation.layout.C0761x;
import com.appboy.Constants;
import com.etsy.android.lib.models.ResponseConstants;
import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import kotlin.Result;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19747k;
import kotlinx.coroutines.C19753l;
import okhttp3.C20011u;
import org.apache.commons.lang3.ClassUtils;

/* renamed from: retrofit2.k */
public final class C20110k implements C20092d<Object> {

    /* renamed from: b */
    public final /* synthetic */ C19747k f44497b;

    public C20110k(C19753l lVar) {
        this.f44497b = lVar;
    }

    /* renamed from: j */
    public final void mo1135j(C20089b<Object> bVar, Throwable th) {
        C19383o.m32798h(bVar, "call");
        C19383o.m32798h(th, Constants.APPBOY_PUSH_TITLE_KEY);
        this.f44497b.resumeWith(Result.m35480constructorimpl(C0761x.m1673J(th)));
    }

    /* renamed from: m */
    public final void mo1137m(C20089b<Object> bVar, C20145v<Object> vVar) {
        C19383o.m32798h(bVar, "call");
        C19383o.m32798h(vVar, ResponseConstants.RESPONSE);
        if (vVar.mo74384a()) {
            T t = vVar.f44615b;
            if (t == null) {
                C20011u g = bVar.mo74366g();
                Class<C20109j> cls = C20109j.class;
                g.getClass();
                C20109j cast = cls.cast(g.f44346f.get(cls));
                if (cast != null) {
                    Method method = cast.f44495a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Response from ");
                    C19383o.m32793c(method, ResponseConstants.METHOD);
                    Class<?> declaringClass = method.getDeclaringClass();
                    C19383o.m32793c(declaringClass, "method.declaringClass");
                    sb.append(declaringClass.getName());
                    sb.append(ClassUtils.PACKAGE_SEPARATOR_CHAR);
                    sb.append(method.getName());
                    sb.append(" was null but response body type was declared as non-null");
                    this.f44497b.resumeWith(Result.m35480constructorimpl(C0761x.m1673J(new KotlinNullPointerException(sb.toString()))));
                    return;
                }
                C19383o.m32803m();
                throw null;
            }
            this.f44497b.resumeWith(Result.m35480constructorimpl(t));
            return;
        }
        this.f44497b.resumeWith(Result.m35480constructorimpl(C0761x.m1673J(new HttpException(vVar))));
    }
}
