/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.groupon.messagebus.thrift.api;
/*
 * Copyright (c) 2013, Groupon, Inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 *
 * Neither the name of GROUPON nor the names of its contributors may be
 * used to endorse or promote products derived from this software without
 * specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED
 * TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

public class MessageInternal implements TBase<MessageInternal, MessageInternal._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("MessageInternal");

  private static final TField MESSAGE_ID_FIELD_DESC = new TField("messageId", TType.STRING, (short)1);
  private static final TField PAYLOAD_FIELD_DESC = new TField("payload", TType.STRUCT, (short)2);
  private static final TField PROPERTIES_FIELD_DESC = new TField("properties", TType.MAP, (short)3);

  public String messageId;
  public MessagePayload payload;
  public Map<String,String> properties;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    MESSAGE_ID((short)1, "messageId"),
    PAYLOAD((short)2, "payload"),
    PROPERTIES((short)3, "properties");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // MESSAGE_ID
          return MESSAGE_ID;
        case 2: // PAYLOAD
          return PAYLOAD;
        case 3: // PROPERTIES
          return PROPERTIES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MESSAGE_ID, new FieldMetaData("messageId", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.PAYLOAD, new FieldMetaData("payload", TFieldRequirementType.REQUIRED, 
        new StructMetaData(TType.STRUCT, MessagePayload.class)));
    tmpMap.put(_Fields.PROPERTIES, new FieldMetaData("properties", TFieldRequirementType.OPTIONAL, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.STRING), 
            new FieldValueMetaData(TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(MessageInternal.class, metaDataMap);
  }

  public MessageInternal() {
  }

  public MessageInternal(
    String messageId,
    MessagePayload payload)
  {
    this();
    this.messageId = messageId;
    this.payload = payload;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MessageInternal(MessageInternal other) {
    if (other.isSetMessageId()) {
      this.messageId = other.messageId;
    }
    if (other.isSetPayload()) {
      this.payload = new MessagePayload(other.payload);
    }
    if (other.isSetProperties()) {
      Map<String,String> __this__properties = new HashMap<String,String>();
      for (Map.Entry<String, String> other_element : other.properties.entrySet()) {

        String other_element_key = other_element.getKey();
        String other_element_value = other_element.getValue();

        String __this__properties_copy_key = other_element_key;

        String __this__properties_copy_value = other_element_value;

        __this__properties.put(__this__properties_copy_key, __this__properties_copy_value);
      }
      this.properties = __this__properties;
    }
  }

  public MessageInternal deepCopy() {
    return new MessageInternal(this);
  }

  @Override
  public void clear() {
    this.messageId = null;
    this.payload = null;
    this.properties = null;
  }

  public String getMessageId() {
    return this.messageId;
  }

  public MessageInternal setMessageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

  public void unsetMessageId() {
    this.messageId = null;
  }

  /** Returns true if field messageId is set (has been asigned a value) and false otherwise */
  public boolean isSetMessageId() {
    return this.messageId != null;
  }

  public void setMessageIdIsSet(boolean value) {
    if (!value) {
      this.messageId = null;
    }
  }

  public MessagePayload getPayload() {
    return this.payload;
  }

  public MessageInternal setPayload(MessagePayload payload) {
    this.payload = payload;
    return this;
  }

  public void unsetPayload() {
    this.payload = null;
  }

  /** Returns true if field payload is set (has been asigned a value) and false otherwise */
  public boolean isSetPayload() {
    return this.payload != null;
  }

  public void setPayloadIsSet(boolean value) {
    if (!value) {
      this.payload = null;
    }
  }

  public int getPropertiesSize() {
    return (this.properties == null) ? 0 : this.properties.size();
  }

  public void putToProperties(String key, String val) {
    if (this.properties == null) {
      this.properties = new HashMap<String,String>();
    }
    this.properties.put(key, val);
  }

  public Map<String,String> getProperties() {
    return this.properties;
  }

  public MessageInternal setProperties(Map<String,String> properties) {
    this.properties = properties;
    return this;
  }

  public void unsetProperties() {
    this.properties = null;
  }

  /** Returns true if field properties is set (has been asigned a value) and false otherwise */
  public boolean isSetProperties() {
    return this.properties != null;
  }

  public void setPropertiesIsSet(boolean value) {
    if (!value) {
      this.properties = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MESSAGE_ID:
      if (value == null) {
        unsetMessageId();
      } else {
        setMessageId((String)value);
      }
      break;

    case PAYLOAD:
      if (value == null) {
        unsetPayload();
      } else {
        setPayload((MessagePayload)value);
      }
      break;

    case PROPERTIES:
      if (value == null) {
        unsetProperties();
      } else {
        setProperties((Map<String,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MESSAGE_ID:
      return getMessageId();

    case PAYLOAD:
      return getPayload();

    case PROPERTIES:
      return getProperties();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MESSAGE_ID:
      return isSetMessageId();
    case PAYLOAD:
      return isSetPayload();
    case PROPERTIES:
      return isSetProperties();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MessageInternal)
      return this.equals((MessageInternal)that);
    return false;
  }

  public boolean equals(MessageInternal that) {
    if (that == null)
      return false;

    boolean this_present_messageId = true && this.isSetMessageId();
    boolean that_present_messageId = true && that.isSetMessageId();
    if (this_present_messageId || that_present_messageId) {
      if (!(this_present_messageId && that_present_messageId))
        return false;
      if (!this.messageId.equals(that.messageId))
        return false;
    }

    boolean this_present_payload = true && this.isSetPayload();
    boolean that_present_payload = true && that.isSetPayload();
    if (this_present_payload || that_present_payload) {
      if (!(this_present_payload && that_present_payload))
        return false;
      if (!this.payload.equals(that.payload))
        return false;
    }

    boolean this_present_properties = true && this.isSetProperties();
    boolean that_present_properties = true && that.isSetProperties();
    if (this_present_properties || that_present_properties) {
      if (!(this_present_properties && that_present_properties))
        return false;
      if (!this.properties.equals(that.properties))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(MessageInternal other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    MessageInternal typedOther = (MessageInternal)other;

    lastComparison = Boolean.valueOf(isSetMessageId()).compareTo(typedOther.isSetMessageId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageId()) {
      lastComparison = TBaseHelper.compareTo(this.messageId, typedOther.messageId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPayload()).compareTo(typedOther.isSetPayload());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPayload()) {
      lastComparison = TBaseHelper.compareTo(this.payload, typedOther.payload);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetProperties()).compareTo(typedOther.isSetProperties());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProperties()) {
      lastComparison = TBaseHelper.compareTo(this.properties, typedOther.properties);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // MESSAGE_ID
          if (field.type == TType.STRING) {
            this.messageId = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // PAYLOAD
          if (field.type == TType.STRUCT) {
            this.payload = new MessagePayload();
            this.payload.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // PROPERTIES
          if (field.type == TType.MAP) {
            {
              TMap _map0 = iprot.readMapBegin();
              this.properties = new HashMap<String,String>(2*_map0.size);
              for (int _i1 = 0; _i1 < _map0.size; ++_i1)
              {
                String _key2;
                String _val3;
                _key2 = iprot.readString();
                _val3 = iprot.readString();
                this.properties.put(_key2, _val3);
              }
              iprot.readMapEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.messageId != null) {
      oprot.writeFieldBegin(MESSAGE_ID_FIELD_DESC);
      oprot.writeString(this.messageId);
      oprot.writeFieldEnd();
    }
    if (this.payload != null) {
      oprot.writeFieldBegin(PAYLOAD_FIELD_DESC);
      this.payload.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.properties != null) {
      if (isSetProperties()) {
        oprot.writeFieldBegin(PROPERTIES_FIELD_DESC);
        {
          oprot.writeMapBegin(new TMap(TType.STRING, TType.STRING, this.properties.size()));
          for (Map.Entry<String, String> _iter4 : this.properties.entrySet())
          {
            oprot.writeString(_iter4.getKey());
            oprot.writeString(_iter4.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("MessageInternal(");
    boolean first = true;

    sb.append("messageId:");
    if (this.messageId == null) {
      sb.append("null");
    } else {
      sb.append(this.messageId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("payload:");
    if (this.payload == null) {
      sb.append("null");
    } else {
      sb.append(this.payload);
    }
    first = false;
    if (isSetProperties()) {
      if (!first) sb.append(", ");
      sb.append("properties:");
      if (this.properties == null) {
        sb.append("null");
      } else {
        sb.append(this.properties);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (messageId == null) {
      throw new TProtocolException("Required field 'messageId' was not present! Struct: " + toString());
    }
    if (payload == null) {
      throw new TProtocolException("Required field 'payload' was not present! Struct: " + toString());
    }
  }

}

