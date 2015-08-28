/**
 * Copyright (C) 2015 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2013 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.sdk.v3.payments;

import com.clover.sdk.GenericClient;

@SuppressWarnings("all")
public final class Transaction implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

 /**
  * The time when the transaction was recorded on the server
  */
  public java.lang.Long getCreatedTime() {
    return genClient.cacheGet(CacheKey.createdTime);
  }
 /**
  * The time when the transaction was recorded on the client
  */
  public java.lang.Long getClientCreatedTime() {
    return genClient.cacheGet(CacheKey.clientCreatedTime);
  }
  public com.clover.sdk.v3.payments.Payment getPayment() {
    return genClient.cacheGet(CacheKey.payment);
  }
  public com.clover.sdk.v3.payments.Refund getRefund() {
    return genClient.cacheGet(CacheKey.refund);
  }
  public com.clover.sdk.v3.payments.Credit getCredit() {
    return genClient.cacheGet(CacheKey.credit);
  }


  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<Transaction> {
    createdTime {
      @Override
      public Object extractValue(Transaction instance) {
        return instance.genClient.extractOther("createdTime", java.lang.Long.class);
      }
    },
    clientCreatedTime {
      @Override
      public Object extractValue(Transaction instance) {
        return instance.genClient.extractOther("clientCreatedTime", java.lang.Long.class);
      }
    },
    payment {
      @Override
      public Object extractValue(Transaction instance) {
        return instance.genClient.extractRecord("payment", com.clover.sdk.v3.payments.Payment.JSON_CREATOR);
      }
    },
    refund {
      @Override
      public Object extractValue(Transaction instance) {
        return instance.genClient.extractRecord("refund", com.clover.sdk.v3.payments.Refund.JSON_CREATOR);
      }
    },
    credit {
      @Override
      public Object extractValue(Transaction instance) {
        return instance.genClient.extractRecord("credit", com.clover.sdk.v3.payments.Credit.JSON_CREATOR);
      }
    },
    ;
  }

  private GenericClient<Transaction> genClient = new GenericClient<Transaction>(this);

  /**
   * Constructs a new empty instance.
   */
  public Transaction() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public Transaction(String json) throws IllegalArgumentException {
    try {
      genClient.setJsonObject(new org.json.JSONObject(json));
    } catch (org.json.JSONException e) {
      throw new IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public Transaction(org.json.JSONObject jsonObject) {
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public Transaction(Transaction src) {
    if (src.genClient.getJsonObject() != null) {
      genClient.setJsonObject(com.clover.sdk.v3.JsonHelper.deepCopy(src.genClient.getJSONObject()));
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    return genClient.getJSONObject();
  }


  @Override
  public void validate() {
  }

  /** Checks whether the 'createdTime' field is set and is not null */
  public boolean isNotNullCreatedTime() {
    return genClient.cacheValueIsNotNull(CacheKey.createdTime);
  }

  /** Checks whether the 'clientCreatedTime' field is set and is not null */
  public boolean isNotNullClientCreatedTime() {
    return genClient.cacheValueIsNotNull(CacheKey.clientCreatedTime);
  }

  /** Checks whether the 'payment' field is set and is not null */
  public boolean isNotNullPayment() {
    return genClient.cacheValueIsNotNull(CacheKey.payment);
  }

  /** Checks whether the 'refund' field is set and is not null */
  public boolean isNotNullRefund() {
    return genClient.cacheValueIsNotNull(CacheKey.refund);
  }

  /** Checks whether the 'credit' field is set and is not null */
  public boolean isNotNullCredit() {
    return genClient.cacheValueIsNotNull(CacheKey.credit);
  }


  /** Checks whether the 'createdTime' field has been set, however the value could be null */
  public boolean hasCreatedTime() {
    return genClient.cacheHasKey(CacheKey.createdTime);
  }

  /** Checks whether the 'clientCreatedTime' field has been set, however the value could be null */
  public boolean hasClientCreatedTime() {
    return genClient.cacheHasKey(CacheKey.clientCreatedTime);
  }

  /** Checks whether the 'payment' field has been set, however the value could be null */
  public boolean hasPayment() {
    return genClient.cacheHasKey(CacheKey.payment);
  }

  /** Checks whether the 'refund' field has been set, however the value could be null */
  public boolean hasRefund() {
    return genClient.cacheHasKey(CacheKey.refund);
  }

  /** Checks whether the 'credit' field has been set, however the value could be null */
  public boolean hasCredit() {
    return genClient.cacheHasKey(CacheKey.credit);
  }


  /**
   * Sets the field 'createdTime'.
   */
  public Transaction setCreatedTime(java.lang.Long createdTime) {
    return genClient.setOther(createdTime, CacheKey.createdTime);
  }

  /**
   * Sets the field 'clientCreatedTime'.
   */
  public Transaction setClientCreatedTime(java.lang.Long clientCreatedTime) {
    return genClient.setOther(clientCreatedTime, CacheKey.clientCreatedTime);
  }

  /**
   * Sets the field 'payment'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public Transaction setPayment(com.clover.sdk.v3.payments.Payment payment) {
    return genClient.setRecord(payment, CacheKey.payment);
  }

  /**
   * Sets the field 'refund'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public Transaction setRefund(com.clover.sdk.v3.payments.Refund refund) {
    return genClient.setRecord(refund, CacheKey.refund);
  }

  /**
   * Sets the field 'credit'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public Transaction setCredit(com.clover.sdk.v3.payments.Credit credit) {
    return genClient.setRecord(credit, CacheKey.credit);
  }


  /** Clears the 'createdTime' field, the 'has' method for this field will now return false */
  public void clearCreatedTime() {
    genClient.clear(CacheKey.createdTime);
  }
  /** Clears the 'clientCreatedTime' field, the 'has' method for this field will now return false */
  public void clearClientCreatedTime() {
    genClient.clear(CacheKey.clientCreatedTime);
  }
  /** Clears the 'payment' field, the 'has' method for this field will now return false */
  public void clearPayment() {
    genClient.clear(CacheKey.payment);
  }
  /** Clears the 'refund' field, the 'has' method for this field will now return false */
  public void clearRefund() {
    genClient.clear(CacheKey.refund);
  }
  /** Clears the 'credit' field, the 'has' method for this field will now return false */
  public void clearCredit() {
    genClient.clear(CacheKey.credit);
  }


  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return genClient.containsChanges();
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    genClient.resetChangeLog();
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public Transaction copyChanges() {
    Transaction copy = new Transaction();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(Transaction src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new Transaction(src).getJSONObject(), src.genClient);
    }
  }

  /**
   * Gets a Bundle which can be used to get and set data attached to this instance. The attached Bundle will be
   * parcelled but not jsonified.
   */
  public android.os.Bundle getBundle() {
    return genClient.getBundle();
  }

  @Override
  public String toString() {
    return genClient.toString();
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(android.os.Parcel dest, int flags) {
    genClient.writeToParcel(dest, flags);
  }

  public static final android.os.Parcelable.Creator<Transaction> CREATOR = new android.os.Parcelable.Creator<Transaction>() {
    @Override
    public Transaction createFromParcel(android.os.Parcel in) {
      Transaction instance = new Transaction(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public Transaction[] newArray(int size) {
      return new Transaction[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<Transaction> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<Transaction>() {
    @Override
    public Transaction create(org.json.JSONObject jsonObject) {
      return new Transaction(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean CREATEDTIME_IS_REQUIRED = false;

    public static final boolean CLIENTCREATEDTIME_IS_REQUIRED = false;

    public static final boolean PAYMENT_IS_REQUIRED = false;

    public static final boolean REFUND_IS_REQUIRED = false;

    public static final boolean CREDIT_IS_REQUIRED = false;

  }

}
