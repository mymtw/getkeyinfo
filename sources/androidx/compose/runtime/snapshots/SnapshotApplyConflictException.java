package androidx.compose.runtime.snapshots;

import kotlin.jvm.internal.C19383o;

public final class SnapshotApplyConflictException extends Exception {
    public static final int $stable = 8;
    private final C1385f snapshot;

    public SnapshotApplyConflictException(C1385f fVar) {
        C19383o.m32797g(fVar, "snapshot");
        this.snapshot = fVar;
    }

    public final C1385f getSnapshot() {
        return this.snapshot;
    }
}
