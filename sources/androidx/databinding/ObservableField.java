package androidx.databinding;

import java.io.Serializable;

public class ObservableField<T> extends C2440b implements Serializable {
    public static final long serialVersionUID = 1;
    private T mValue;

    public ObservableField(T t) {
        this.mValue = t;
    }

    public T get() {
        return this.mValue;
    }

    public void set(T t) {
        if (t != this.mValue) {
            this.mValue = t;
            notifyChange();
        }
    }

    public ObservableField() {
    }

    public ObservableField(C2451i... iVarArr) {
        super(iVarArr);
    }
}
