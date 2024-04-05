package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

abstract class ImmutableAsList<E> extends ImmutableList<E> {

    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        public final ImmutableCollection<?> collection;

        public SerializedForm(ImmutableCollection<?> immutableCollection) {
            this.collection = immutableCollection;
        }

        public Object readResolve() {
            return this.collection.asList();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public boolean contains(Object obj) {
        return delegateCollection().contains(obj);
    }

    public abstract ImmutableCollection<E> delegateCollection();

    public boolean isEmpty() {
        return delegateCollection().isEmpty();
    }

    public boolean isPartialView() {
        return delegateCollection().isPartialView();
    }

    public int size() {
        return delegateCollection().size();
    }

    public Object writeReplace() {
        return new SerializedForm(delegateCollection());
    }
}
