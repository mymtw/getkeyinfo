package retrofit2;

import java.util.Objects;
import okhttp3.C20018z;

public class HttpException extends RuntimeException {

    /* renamed from: b */
    public final transient C20145v<?> f44458b;
    private final int code;
    private final String message;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HttpException(C20145v<?> vVar) {
        super("HTTP " + vVar.f44614a.f44365f + " " + vVar.f44614a.f44364e);
        Objects.requireNonNull(vVar, "response == null");
        C20018z zVar = vVar.f44614a;
        this.code = zVar.f44365f;
        this.message = zVar.f44364e;
        this.f44458b = vVar;
    }

    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    public C20145v<?> response() {
        return this.f44458b;
    }
}
