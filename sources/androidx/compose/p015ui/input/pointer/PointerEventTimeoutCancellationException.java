package androidx.compose.p015ui.input.pointer;

import java.util.concurrent.CancellationException;

/* renamed from: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException */
public final class PointerEventTimeoutCancellationException extends CancellationException {
    public static final int $stable = 0;

    public PointerEventTimeoutCancellationException(long j) {
        super("Timed out waiting for " + j + " ms");
    }
}
