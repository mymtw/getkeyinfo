package com.android.p042dx;

import com.android.dx.rop.code.Rop;
import com.android.dx.rop.code.Rops;
import com.android.dx.rop.type.TypeList;

/* renamed from: com.android.dx.BinaryOp */
public enum BinaryOp {
    ADD {
        public Rop rop(TypeList typeList) {
            return Rops.opAdd(typeList);
        }
    },
    SUBTRACT {
        public Rop rop(TypeList typeList) {
            return Rops.opSub(typeList);
        }
    },
    MULTIPLY {
        public Rop rop(TypeList typeList) {
            return Rops.opMul(typeList);
        }
    },
    DIVIDE {
        public Rop rop(TypeList typeList) {
            return Rops.opDiv(typeList);
        }
    },
    REMAINDER {
        public Rop rop(TypeList typeList) {
            return Rops.opRem(typeList);
        }
    },
    AND {
        public Rop rop(TypeList typeList) {
            return Rops.opAnd(typeList);
        }
    },
    OR {
        public Rop rop(TypeList typeList) {
            return Rops.opOr(typeList);
        }
    },
    XOR {
        public Rop rop(TypeList typeList) {
            return Rops.opXor(typeList);
        }
    },
    SHIFT_LEFT {
        public Rop rop(TypeList typeList) {
            return Rops.opShl(typeList);
        }
    },
    SHIFT_RIGHT {
        public Rop rop(TypeList typeList) {
            return Rops.opShr(typeList);
        }
    },
    UNSIGNED_SHIFT_RIGHT {
        public Rop rop(TypeList typeList) {
            return Rops.opUshr(typeList);
        }
    };

    public abstract Rop rop(TypeList typeList);
}
