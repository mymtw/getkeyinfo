package androidx.constraintlayout.solver.state;

import android.support.p013v4.media.C0072d;
import java.util.ArrayList;

public final class ConstraintReference {

    public class IncorrectConstraintException extends Exception {
        private final ArrayList<String> mErrors;
        public final /* synthetic */ ConstraintReference this$0;

        public IncorrectConstraintException(ConstraintReference constraintReference, ArrayList<String> arrayList) {
            this.mErrors = arrayList;
        }

        public ArrayList<String> getErrors() {
            return this.mErrors;
        }

        public String toString() {
            StringBuilder h = C0072d.m201h("IncorrectConstraintException: ");
            h.append(this.mErrors.toString());
            return h.toString();
        }
    }
}
