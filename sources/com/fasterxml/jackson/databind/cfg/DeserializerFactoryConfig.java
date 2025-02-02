package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.deser.KeyDeserializers;
import com.fasterxml.jackson.databind.deser.ValueInstantiators;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ArrayIterator;
import java.io.Serializable;

public class DeserializerFactoryConfig implements Serializable {
    public static final KeyDeserializers[] DEFAULT_KEY_DESERIALIZERS = {new StdKeyDeserializers()};
    public static final AbstractTypeResolver[] NO_ABSTRACT_TYPE_RESOLVERS = new AbstractTypeResolver[0];
    public static final Deserializers[] NO_DESERIALIZERS = new Deserializers[0];
    public static final BeanDeserializerModifier[] NO_MODIFIERS = new BeanDeserializerModifier[0];
    public static final ValueInstantiators[] NO_VALUE_INSTANTIATORS = new ValueInstantiators[0];
    private static final long serialVersionUID = 1;
    public final AbstractTypeResolver[] _abstractTypeResolvers;
    public final Deserializers[] _additionalDeserializers;
    public final KeyDeserializers[] _additionalKeyDeserializers;
    public final BeanDeserializerModifier[] _modifiers;
    public final ValueInstantiators[] _valueInstantiators;

    public DeserializerFactoryConfig() {
        this((Deserializers[]) null, (KeyDeserializers[]) null, (BeanDeserializerModifier[]) null, (AbstractTypeResolver[]) null, (ValueInstantiators[]) null);
    }

    public Iterable<AbstractTypeResolver> abstractTypeResolvers() {
        return new ArrayIterator(this._abstractTypeResolvers);
    }

    public Iterable<BeanDeserializerModifier> deserializerModifiers() {
        return new ArrayIterator(this._modifiers);
    }

    public Iterable<Deserializers> deserializers() {
        return new ArrayIterator(this._additionalDeserializers);
    }

    public boolean hasAbstractTypeResolvers() {
        return this._abstractTypeResolvers.length > 0;
    }

    public boolean hasDeserializerModifiers() {
        return this._modifiers.length > 0;
    }

    public boolean hasDeserializers() {
        return this._additionalDeserializers.length > 0;
    }

    public boolean hasKeyDeserializers() {
        return this._additionalKeyDeserializers.length > 0;
    }

    public boolean hasValueInstantiators() {
        return this._valueInstantiators.length > 0;
    }

    public Iterable<KeyDeserializers> keyDeserializers() {
        return new ArrayIterator(this._additionalKeyDeserializers);
    }

    public Iterable<ValueInstantiators> valueInstantiators() {
        return new ArrayIterator(this._valueInstantiators);
    }

    public DeserializerFactoryConfig withAbstractTypeResolver(AbstractTypeResolver abstractTypeResolver) {
        if (abstractTypeResolver != null) {
            return new DeserializerFactoryConfig(this._additionalDeserializers, this._additionalKeyDeserializers, this._modifiers, (AbstractTypeResolver[]) ArrayBuilders.insertInListNoDup(this._abstractTypeResolvers, abstractTypeResolver), this._valueInstantiators);
        }
        throw new IllegalArgumentException("Cannot pass null resolver");
    }

    public DeserializerFactoryConfig withAdditionalDeserializers(Deserializers deserializers) {
        if (deserializers != null) {
            return new DeserializerFactoryConfig((Deserializers[]) ArrayBuilders.insertInListNoDup(this._additionalDeserializers, deserializers), this._additionalKeyDeserializers, this._modifiers, this._abstractTypeResolvers, this._valueInstantiators);
        }
        throw new IllegalArgumentException("Cannot pass null Deserializers");
    }

    public DeserializerFactoryConfig withAdditionalKeyDeserializers(KeyDeserializers keyDeserializers) {
        if (keyDeserializers != null) {
            return new DeserializerFactoryConfig(this._additionalDeserializers, (KeyDeserializers[]) ArrayBuilders.insertInListNoDup(this._additionalKeyDeserializers, keyDeserializers), this._modifiers, this._abstractTypeResolvers, this._valueInstantiators);
        }
        throw new IllegalArgumentException("Cannot pass null KeyDeserializers");
    }

    public DeserializerFactoryConfig withDeserializerModifier(BeanDeserializerModifier beanDeserializerModifier) {
        if (beanDeserializerModifier != null) {
            return new DeserializerFactoryConfig(this._additionalDeserializers, this._additionalKeyDeserializers, (BeanDeserializerModifier[]) ArrayBuilders.insertInListNoDup(this._modifiers, beanDeserializerModifier), this._abstractTypeResolvers, this._valueInstantiators);
        }
        throw new IllegalArgumentException("Cannot pass null modifier");
    }

    public DeserializerFactoryConfig withValueInstantiators(ValueInstantiators valueInstantiators) {
        if (valueInstantiators != null) {
            return new DeserializerFactoryConfig(this._additionalDeserializers, this._additionalKeyDeserializers, this._modifiers, this._abstractTypeResolvers, (ValueInstantiators[]) ArrayBuilders.insertInListNoDup(this._valueInstantiators, valueInstantiators));
        }
        throw new IllegalArgumentException("Cannot pass null resolver");
    }

    public DeserializerFactoryConfig(Deserializers[] deserializersArr, KeyDeserializers[] keyDeserializersArr, BeanDeserializerModifier[] beanDeserializerModifierArr, AbstractTypeResolver[] abstractTypeResolverArr, ValueInstantiators[] valueInstantiatorsArr) {
        this._additionalDeserializers = deserializersArr == null ? NO_DESERIALIZERS : deserializersArr;
        this._additionalKeyDeserializers = keyDeserializersArr == null ? DEFAULT_KEY_DESERIALIZERS : keyDeserializersArr;
        this._modifiers = beanDeserializerModifierArr == null ? NO_MODIFIERS : beanDeserializerModifierArr;
        this._abstractTypeResolvers = abstractTypeResolverArr == null ? NO_ABSTRACT_TYPE_RESOLVERS : abstractTypeResolverArr;
        this._valueInstantiators = valueInstantiatorsArr == null ? NO_VALUE_INSTANTIATORS : valueInstantiatorsArr;
    }
}
