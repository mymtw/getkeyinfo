package p756lr;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19459m;

/* renamed from: lr.r */
public final class C19906r {
    /* renamed from: a */
    public static final C19912w m33997a(C19882a0 a0Var) {
        C19383o.m32797g(a0Var, "$this$buffer");
        return new C19912w(a0Var);
    }

    /* renamed from: b */
    public static final C19913x m33998b(C19888c0 c0Var) {
        C19383o.m32797g(c0Var, "$this$buffer");
        return new C19913x(c0Var);
    }

    /* renamed from: c */
    public static final boolean m33999c(AssertionError assertionError) {
        Logger logger = C19907s.f43901a;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? C19459m.m33036e1(message, "getsockname failed", false) : false;
    }

    /* renamed from: d */
    public static final C19887c m34000d(Socket socket) throws IOException {
        Logger logger = C19907s.f43901a;
        C19886b0 b0Var = new C19886b0(socket);
        OutputStream outputStream = socket.getOutputStream();
        C19383o.m32796f(outputStream, "getOutputStream()");
        return new C19887c(b0Var, new C19910u(outputStream, b0Var));
    }

    /* renamed from: e */
    public static final C19889d m34001e(Socket socket) throws IOException {
        Logger logger = C19907s.f43901a;
        C19886b0 b0Var = new C19886b0(socket);
        InputStream inputStream = socket.getInputStream();
        C19383o.m32796f(inputStream, "getInputStream()");
        return new C19889d(b0Var, new C19905q(inputStream, b0Var));
    }

    /* renamed from: f */
    public static final C19905q m34002f(InputStream inputStream) {
        Logger logger = C19907s.f43901a;
        C19383o.m32797g(inputStream, "$this$source");
        return new C19905q(inputStream, new C19890d0());
    }
}
