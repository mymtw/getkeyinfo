package okhttp3.internal.http2;

public enum ErrorCode {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);
    
    public static final C19982a Companion = null;
    private final int httpCode;

    /* renamed from: okhttp3.internal.http2.ErrorCode$a */
    public static final class C19982a {
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C19982a();
    }

    private ErrorCode(int i) {
        this.httpCode = i;
    }

    public final int getHttpCode() {
        return this.httpCode;
    }
}
