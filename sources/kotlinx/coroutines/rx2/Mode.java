package kotlinx.coroutines.rx2;

enum Mode {
    FIRST("awaitFirst"),
    FIRST_OR_DEFAULT("awaitFirstOrDefault"),
    LAST("awaitLast"),
    SINGLE("awaitSingle");
    

    /* renamed from: s */
    private final String f43751s;

    private Mode(String str) {
        this.f43751s = str;
    }

    public final String getS() {
        return this.f43751s;
    }

    public String toString() {
        return this.f43751s;
    }
}
