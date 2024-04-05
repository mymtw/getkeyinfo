package com.android.p042dx;

import com.android.dx.rop.code.Rop;
import com.android.dx.rop.code.Rops;
import com.android.dx.rop.type.TypeList;

/* renamed from: com.android.dx.Comparison */
public enum Comparison {
    LT {
        public Rop rop(TypeList typeList) {
            return Rops.opIfLt(typeList);
        }
    },
    LE {
        public Rop rop(TypeList typeList) {
            return Rops.opIfLe(typeList);
        }
    },
    EQ {
        public Rop rop(TypeList typeList) {
            return Rops.opIfEq(typeList);
        }
    },
    GE {
        public Rop rop(TypeList typeList) {
            return Rops.opIfGe(typeList);
        }
    },
    GT {
        public Rop rop(TypeList typeList) {
            return Rops.opIfGt(typeList);
        }
    },
    NE {
        public Rop rop(TypeList typeList) {
            return Rops.opIfNe(typeList);
        }
    };

    public abstract Rop rop(TypeList typeList);
}
