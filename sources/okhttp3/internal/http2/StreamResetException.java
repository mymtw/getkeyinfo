package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.jvm.internal.C19383o;

public final class StreamResetException extends IOException {
    public final ErrorCode errorCode;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StreamResetException(ErrorCode errorCode2) {
        super("stream was reset: " + errorCode2);
        C19383o.m32797g(errorCode2, "errorCode");
        this.errorCode = errorCode2;
    }
}
