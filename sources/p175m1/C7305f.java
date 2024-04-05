package p175m1;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.emoji2.text.C2665e;

/* renamed from: m1.f */
public final class C7305f {

    /* renamed from: a */
    public final C7307b f16193a;

    /* renamed from: m1.f$a */
    public static class C7306a extends C7307b {

        /* renamed from: a */
        public final TextView f16194a;

        /* renamed from: b */
        public final C7301d f16195b;

        /* renamed from: c */
        public boolean f16196c = true;

        public C7306a(TextView textView) {
            this.f16194a = textView;
            this.f16195b = new C7301d(textView);
        }

        /* renamed from: a */
        public final InputFilter[] mo19573a(InputFilter[] inputFilterArr) {
            if (!this.f16196c) {
                SparseArray sparseArray = new SparseArray(1);
                for (int i = 0; i < inputFilterArr.length; i++) {
                    InputFilter inputFilter = inputFilterArr[i];
                    if (inputFilter instanceof C7301d) {
                        sparseArray.put(i, inputFilter);
                    }
                }
                if (sparseArray.size() == 0) {
                    return inputFilterArr;
                }
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length - sparseArray.size())];
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    if (sparseArray.indexOfKey(i3) < 0) {
                        inputFilterArr2[i2] = inputFilterArr[i3];
                        i2++;
                    }
                }
                return inputFilterArr2;
            }
            for (C7301d dVar : inputFilterArr) {
                if (dVar == this.f16195b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr3 = new InputFilter[(inputFilterArr.length + 1)];
            System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, r0);
            inputFilterArr3[r0] = this.f16195b;
            return inputFilterArr3;
        }

        /* renamed from: b */
        public final boolean mo19574b() {
            return this.f16196c;
        }

        /* renamed from: c */
        public final void mo19575c(boolean z) {
            if (z) {
                this.f16194a.setTransformationMethod(mo19577e(this.f16194a.getTransformationMethod()));
            }
        }

        /* renamed from: d */
        public final void mo19576d(boolean z) {
            this.f16196c = z;
            this.f16194a.setTransformationMethod(mo19577e(this.f16194a.getTransformationMethod()));
            this.f16194a.setFilters(mo19573a(this.f16194a.getFilters()));
        }

        /* renamed from: e */
        public final TransformationMethod mo19577e(TransformationMethod transformationMethod) {
            return this.f16196c ? (!(transformationMethod instanceof C7311h) && !(transformationMethod instanceof PasswordTransformationMethod)) ? new C7311h(transformationMethod) : transformationMethod : transformationMethod instanceof C7311h ? ((C7311h) transformationMethod).f16203b : transformationMethod;
        }
    }

    /* renamed from: m1.f$b */
    public static class C7307b {
        /* renamed from: a */
        public InputFilter[] mo19573a(InputFilter[] inputFilterArr) {
            throw null;
        }

        /* renamed from: b */
        public boolean mo19574b() {
            throw null;
        }

        /* renamed from: c */
        public void mo19575c(boolean z) {
            throw null;
        }

        /* renamed from: d */
        public void mo19576d(boolean z) {
            throw null;
        }

        /* renamed from: e */
        public TransformationMethod mo19577e(TransformationMethod transformationMethod) {
            throw null;
        }
    }

    /* renamed from: m1.f$c */
    public static class C7308c extends C7307b {

        /* renamed from: a */
        public final C7306a f16197a;

        public C7308c(TextView textView) {
            this.f16197a = new C7306a(textView);
        }

        /* renamed from: a */
        public final InputFilter[] mo19573a(InputFilter[] inputFilterArr) {
            return (C2665e.f6004k != null) ^ true ? inputFilterArr : this.f16197a.mo19573a(inputFilterArr);
        }

        /* renamed from: b */
        public final boolean mo19574b() {
            return this.f16197a.f16196c;
        }

        /* renamed from: c */
        public final void mo19575c(boolean z) {
            if (!(!(C2665e.f6004k != null))) {
                this.f16197a.mo19575c(z);
            }
        }

        /* renamed from: d */
        public final void mo19576d(boolean z) {
            if (!(C2665e.f6004k != null)) {
                this.f16197a.f16196c = z;
            } else {
                this.f16197a.mo19576d(z);
            }
        }

        /* renamed from: e */
        public final TransformationMethod mo19577e(TransformationMethod transformationMethod) {
            return (C2665e.f6004k != null) ^ true ? transformationMethod : this.f16197a.mo19577e(transformationMethod);
        }
    }

    public C7305f(TextView textView) {
        if (textView != null) {
            this.f16193a = new C7308c(textView);
            return;
        }
        throw new NullPointerException("textView cannot be null");
    }
}
