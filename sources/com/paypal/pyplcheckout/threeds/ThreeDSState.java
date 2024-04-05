package com.paypal.pyplcheckout.threeds;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class ThreeDSState {
    private final ThreeDSSource source;

    public static final class Error extends ThreeDSState {
        private final ThreeDSSource source;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Error(ThreeDSSource threeDSSource) {
            super(threeDSSource, (DefaultConstructorMarker) null);
            C19383o.m32797g(threeDSSource, "source");
            this.source = threeDSSource;
        }

        public static /* synthetic */ Error copy$default(Error error, ThreeDSSource threeDSSource, int i, Object obj) {
            if ((i & 1) != 0) {
                threeDSSource = error.getSource();
            }
            return error.copy(threeDSSource);
        }

        public final ThreeDSSource component1() {
            return getSource();
        }

        public final Error copy(ThreeDSSource threeDSSource) {
            C19383o.m32797g(threeDSSource, "source");
            return new Error(threeDSSource);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && getSource() == ((Error) obj).getSource();
        }

        public ThreeDSSource getSource() {
            return this.source;
        }

        public int hashCode() {
            return getSource().hashCode();
        }

        public String toString() {
            ThreeDSSource source2 = getSource();
            return "Error(source=" + source2 + ")";
        }
    }

    public static final class Finished extends ThreeDSState {
        private final ThreeDSSource source;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Finished(ThreeDSSource threeDSSource) {
            super(threeDSSource, (DefaultConstructorMarker) null);
            C19383o.m32797g(threeDSSource, "source");
            this.source = threeDSSource;
        }

        public static /* synthetic */ Finished copy$default(Finished finished, ThreeDSSource threeDSSource, int i, Object obj) {
            if ((i & 1) != 0) {
                threeDSSource = finished.getSource();
            }
            return finished.copy(threeDSSource);
        }

        public final ThreeDSSource component1() {
            return getSource();
        }

        public final Finished copy(ThreeDSSource threeDSSource) {
            C19383o.m32797g(threeDSSource, "source");
            return new Finished(threeDSSource);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Finished) && getSource() == ((Finished) obj).getSource();
        }

        public ThreeDSSource getSource() {
            return this.source;
        }

        public int hashCode() {
            return getSource().hashCode();
        }

        public String toString() {
            ThreeDSSource source2 = getSource();
            return "Finished(source=" + source2 + ")";
        }
    }

    public static final class Loading extends ThreeDSState {
        private final ThreeDSSource source;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Loading(ThreeDSSource threeDSSource) {
            super(threeDSSource, (DefaultConstructorMarker) null);
            C19383o.m32797g(threeDSSource, "source");
            this.source = threeDSSource;
        }

        public static /* synthetic */ Loading copy$default(Loading loading, ThreeDSSource threeDSSource, int i, Object obj) {
            if ((i & 1) != 0) {
                threeDSSource = loading.getSource();
            }
            return loading.copy(threeDSSource);
        }

        public final ThreeDSSource component1() {
            return getSource();
        }

        public final Loading copy(ThreeDSSource threeDSSource) {
            C19383o.m32797g(threeDSSource, "source");
            return new Loading(threeDSSource);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && getSource() == ((Loading) obj).getSource();
        }

        public ThreeDSSource getSource() {
            return this.source;
        }

        public int hashCode() {
            return getSource().hashCode();
        }

        public String toString() {
            ThreeDSSource source2 = getSource();
            return "Loading(source=" + source2 + ")";
        }
    }

    public static final class None extends ThreeDSState {
        public static final None INSTANCE = new None();

        private None() {
            super(ThreeDSSource.NONE, (DefaultConstructorMarker) null);
        }
    }

    public static final class Started extends ThreeDSState {
        private final ThreeDSSource source;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Started(ThreeDSSource threeDSSource) {
            super(threeDSSource, (DefaultConstructorMarker) null);
            C19383o.m32797g(threeDSSource, "source");
            this.source = threeDSSource;
        }

        public static /* synthetic */ Started copy$default(Started started, ThreeDSSource threeDSSource, int i, Object obj) {
            if ((i & 1) != 0) {
                threeDSSource = started.getSource();
            }
            return started.copy(threeDSSource);
        }

        public final ThreeDSSource component1() {
            return getSource();
        }

        public final Started copy(ThreeDSSource threeDSSource) {
            C19383o.m32797g(threeDSSource, "source");
            return new Started(threeDSSource);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Started) && getSource() == ((Started) obj).getSource();
        }

        public ThreeDSSource getSource() {
            return this.source;
        }

        public int hashCode() {
            return getSource().hashCode();
        }

        public String toString() {
            ThreeDSSource source2 = getSource();
            return "Started(source=" + source2 + ")";
        }
    }

    private ThreeDSState(ThreeDSSource threeDSSource) {
        this.source = threeDSSource;
    }

    public /* synthetic */ ThreeDSState(ThreeDSSource threeDSSource, DefaultConstructorMarker defaultConstructorMarker) {
        this(threeDSSource);
    }

    public ThreeDSSource getSource() {
        return this.source;
    }
}
