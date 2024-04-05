package kotlinx.coroutines.reactive;

enum Mode {
    FIRST("awaitFirst"),
    FIRST_OR_DEFAULT("awaitFirstOrDefault"),
    LAST("awaitLast"),
    SINGLE("awaitSingle"),
    SINGLE_OR_DEFAULT("awaitSingleOrDefault");
    

    /* renamed from: s */
    private final String f43735s;

    private Mode(String str) {
        this.f43735s = str;
    }

    public final String getS() {
        return this.f43735s;
    }

    public String toString() {
        return this.f43735s;
    }
}
