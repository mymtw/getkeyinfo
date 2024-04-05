package kotlin.random;

import java.io.Serializable;
import java.util.Random;
import kotlin.jvm.internal.C19383o;

final class PlatformRandom extends C19395a implements Serializable {
    @Deprecated
    private static final long serialVersionUID = 0;
    private final Random impl;

    public PlatformRandom(Random random) {
        C19383o.m32797g(random, "impl");
        this.impl = random;
    }

    public Random getImpl() {
        return this.impl;
    }
}
