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

package com.clover.sdk.v3.pay;

import com.clover.sdk.GenericClient;

@SuppressWarnings("all")
public final class PaymentRequest implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

 /**
  * Unique identifier
  */
  public java.lang.String getId() {
    return genClient.cacheGet(CacheKey.id);
  }
 /**
  * Unique identifier of the order with which this payment is associated
  */
  public java.lang.String getOrderId() {
    return genClient.cacheGet(CacheKey.orderId);
  }
 /**
  * Request timestamp
  */
  public java.lang.Long getTimestamp() {
    return genClient.cacheGet(CacheKey.timestamp);
  }
 /**
  * The tender type associated with this payment, e.g. credit card, cash, etc.
  */
  public com.clover.sdk.v3.base.Tender getTender() {
    return genClient.cacheGet(CacheKey.tender);
  }
 /**
  * Total amount paid
  */
  public java.lang.Long getAmount() {
    return genClient.cacheGet(CacheKey.amount);
  }
 /**
  * Amount paid in tips
  */
  public java.lang.Long getTipAmount() {
    return genClient.cacheGet(CacheKey.tipAmount);
  }
 /**
  * Amount paid in tax (TBD: sales tax only?)
  */
  public java.lang.Long getTaxAmount() {
    return genClient.cacheGet(CacheKey.taxAmount);
  }
  public java.lang.Long getCashBackAmount() {
    return genClient.cacheGet(CacheKey.cashBackAmount);
  }
 /**
  * Cash tendered
  */
  public java.lang.Long getCashTendered() {
    return genClient.cacheGet(CacheKey.cashTendered);
  }
 /**
  * Employee ID
  */
  public java.lang.String getEmployeeId() {
    return genClient.cacheGet(CacheKey.employeeId);
  }
 /**
  * Employee name
  */
  public java.lang.String getEmployeeName() {
    return genClient.cacheGet(CacheKey.employeeName);
  }
 /**
  * Used for voice authorization for credit cards
  */
  public java.lang.String getAuthorizationCode() {
    return genClient.cacheGet(CacheKey.authorizationCode);
  }
 /**
  * External payment ID when using custom tender
  */
  public java.lang.String getExternalPaymentId() {
    return genClient.cacheGet(CacheKey.externalPaymentId);
  }
  public com.clover.sdk.v3.payments.ServiceChargeAmount getServiceChargeAmount() {
    return genClient.cacheGet(CacheKey.serviceChargeAmount);
  }
  public java.util.List<com.clover.sdk.v3.payments.TaxableAmountRate> getTaxableAmountRates() {
    return genClient.cacheGet(CacheKey.taxableAmountRates);
  }
 /**
  * Payments that were made for this line item
  */
  public java.util.List<com.clover.sdk.v3.payments.LineItemPayment> getLineItems() {
    return genClient.cacheGet(CacheKey.lineItems);
  }
  public com.clover.sdk.v3.pay.PaymentRequestCardDetails getCard() {
    return genClient.cacheGet(CacheKey.card);
  }


  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<PaymentRequest> {
    id {
      @Override
      public Object extractValue(PaymentRequest instance) {
        return instance.genClient.extractOther("id", java.lang.String.class);
      }
    },
    orderId {
      @Override
      public Object extractValue(PaymentRequest instance) {
        return instance.genClient.extractOther("orderId", java.lang.String.class);
      }
    },
    timestamp {
      @Override
      public Object extractValue(PaymentRequest instance) {
        return instance.genClient.extractOther("timestamp", java.lang.Long.class);
      }
    },
    tender {
      @Override
      public Object extractValue(PaymentRequest instance) {
        return instance.genClient.extractRecord("tender", com.clover.sdk.v3.base.Tender.JSON_CREATOR);
      }
    },
    amount {
      @Override
      public Object extractValue(PaymentRequest instance) {
        return instance.genClient.extractOther("amount", java.lang.Long.class);
      }
    },
    tipAmount {
      @Override
      public Object extractValue(PaymentRequest instance) {
        return instance.genClient.extractOther("tipAmount", java.lang.Long.class);
      }
    },
    taxAmount {
      @Override
      public Object extractValue(PaymentRequest instance) {
        return instance.genClient.extractOther("taxAmount", java.lang.Long.class);
      }
    },
    cashBackAmount {
      @Override
      public Object extractValue(PaymentRequest instance) {
        return instance.genClient.extractOther("cashBackAmount", java.lang.Long.class);
      }
    },
    cashTendered {
      @Override
      public Object extractValue(PaymentRequest instance) {
        return instance.genClient.extractOther("cashTendered", java.lang.Long.class);
      }
    },
    employeeId {
      @Override
      public Object extractValue(PaymentRequest instance) {
        return instance.genClient.extractOther("employeeId", java.lang.String.class);
      }
    },
    employeeName {
      @Override
      public Object extractValue(PaymentRequest instance) {
        return instance.genClient.extractOther("employeeName", java.lang.String.class);
      }
    },
    authorizationCode {
      @Override
      public Object extractValue(PaymentRequest instance) {
        return instance.genClient.extractOther("authorizationCode", java.lang.String.class);
      }
    },
    externalPaymentId {
      @Override
      public Object extractValue(PaymentRequest instance) {
        return instance.genClient.extractOther("externalPaymentId", java.lang.String.class);
      }
    },
    serviceChargeAmount {
      @Override
      public Object extractValue(PaymentRequest instance) {
        return instance.genClient.extractRecord("serviceChargeAmount", com.clover.sdk.v3.payments.ServiceChargeAmount.JSON_CREATOR);
      }
    },
    taxableAmountRates {
      @Override
      public Object extractValue(PaymentRequest instance) {
        return instance.genClient.extractListRecord("taxableAmountRates", com.clover.sdk.v3.payments.TaxableAmountRate.JSON_CREATOR);
      }
    },
    lineItems {
      @Override
      public Object extractValue(PaymentRequest instance) {
        return instance.genClient.extractListRecord("lineItems", com.clover.sdk.v3.payments.LineItemPayment.JSON_CREATOR);
      }
    },
    card {
      @Override
      public Object extractValue(PaymentRequest instance) {
        return instance.genClient.extractRecord("card", com.clover.sdk.v3.pay.PaymentRequestCardDetails.JSON_CREATOR);
      }
    },
    ;
  }

  private GenericClient<PaymentRequest> genClient = new GenericClient<PaymentRequest>(this);

  /**
   * Constructs a new empty instance.
   */
  public PaymentRequest() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public PaymentRequest(String json) throws IllegalArgumentException {
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
  public PaymentRequest(org.json.JSONObject jsonObject) {
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public PaymentRequest(PaymentRequest src) {
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
    genClient.validateLength(getId(), 13);

    genClient.validateLength(getOrderId(), 13);

    genClient.validateLength(getEmployeeId(), 13);

    genClient.validateLength(getEmployeeName(), 127);

    genClient.validateLength(getExternalPaymentId(), 32);
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'orderId' field is set and is not null */
  public boolean isNotNullOrderId() {
    return genClient.cacheValueIsNotNull(CacheKey.orderId);
  }

  /** Checks whether the 'timestamp' field is set and is not null */
  public boolean isNotNullTimestamp() {
    return genClient.cacheValueIsNotNull(CacheKey.timestamp);
  }

  /** Checks whether the 'tender' field is set and is not null */
  public boolean isNotNullTender() {
    return genClient.cacheValueIsNotNull(CacheKey.tender);
  }

  /** Checks whether the 'amount' field is set and is not null */
  public boolean isNotNullAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.amount);
  }

  /** Checks whether the 'tipAmount' field is set and is not null */
  public boolean isNotNullTipAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.tipAmount);
  }

  /** Checks whether the 'taxAmount' field is set and is not null */
  public boolean isNotNullTaxAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.taxAmount);
  }

  /** Checks whether the 'cashBackAmount' field is set and is not null */
  public boolean isNotNullCashBackAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.cashBackAmount);
  }

  /** Checks whether the 'cashTendered' field is set and is not null */
  public boolean isNotNullCashTendered() {
    return genClient.cacheValueIsNotNull(CacheKey.cashTendered);
  }

  /** Checks whether the 'employeeId' field is set and is not null */
  public boolean isNotNullEmployeeId() {
    return genClient.cacheValueIsNotNull(CacheKey.employeeId);
  }

  /** Checks whether the 'employeeName' field is set and is not null */
  public boolean isNotNullEmployeeName() {
    return genClient.cacheValueIsNotNull(CacheKey.employeeName);
  }

  /** Checks whether the 'authorizationCode' field is set and is not null */
  public boolean isNotNullAuthorizationCode() {
    return genClient.cacheValueIsNotNull(CacheKey.authorizationCode);
  }

  /** Checks whether the 'externalPaymentId' field is set and is not null */
  public boolean isNotNullExternalPaymentId() {
    return genClient.cacheValueIsNotNull(CacheKey.externalPaymentId);
  }

  /** Checks whether the 'serviceChargeAmount' field is set and is not null */
  public boolean isNotNullServiceChargeAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.serviceChargeAmount);
  }

  /** Checks whether the 'taxableAmountRates' field is set and is not null */
  public boolean isNotNullTaxableAmountRates() {
    return genClient.cacheValueIsNotNull(CacheKey.taxableAmountRates);
  }

  /** Checks whether the 'taxableAmountRates' field is set and is not null and is not empty */
  public boolean isNotEmptyTaxableAmountRates() { return isNotNullTaxableAmountRates() && !getTaxableAmountRates().isEmpty(); }

  /** Checks whether the 'lineItems' field is set and is not null */
  public boolean isNotNullLineItems() {
    return genClient.cacheValueIsNotNull(CacheKey.lineItems);
  }

  /** Checks whether the 'lineItems' field is set and is not null and is not empty */
  public boolean isNotEmptyLineItems() { return isNotNullLineItems() && !getLineItems().isEmpty(); }

  /** Checks whether the 'card' field is set and is not null */
  public boolean isNotNullCard() {
    return genClient.cacheValueIsNotNull(CacheKey.card);
  }


  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'orderId' field has been set, however the value could be null */
  public boolean hasOrderId() {
    return genClient.cacheHasKey(CacheKey.orderId);
  }

  /** Checks whether the 'timestamp' field has been set, however the value could be null */
  public boolean hasTimestamp() {
    return genClient.cacheHasKey(CacheKey.timestamp);
  }

  /** Checks whether the 'tender' field has been set, however the value could be null */
  public boolean hasTender() {
    return genClient.cacheHasKey(CacheKey.tender);
  }

  /** Checks whether the 'amount' field has been set, however the value could be null */
  public boolean hasAmount() {
    return genClient.cacheHasKey(CacheKey.amount);
  }

  /** Checks whether the 'tipAmount' field has been set, however the value could be null */
  public boolean hasTipAmount() {
    return genClient.cacheHasKey(CacheKey.tipAmount);
  }

  /** Checks whether the 'taxAmount' field has been set, however the value could be null */
  public boolean hasTaxAmount() {
    return genClient.cacheHasKey(CacheKey.taxAmount);
  }

  /** Checks whether the 'cashBackAmount' field has been set, however the value could be null */
  public boolean hasCashBackAmount() {
    return genClient.cacheHasKey(CacheKey.cashBackAmount);
  }

  /** Checks whether the 'cashTendered' field has been set, however the value could be null */
  public boolean hasCashTendered() {
    return genClient.cacheHasKey(CacheKey.cashTendered);
  }

  /** Checks whether the 'employeeId' field has been set, however the value could be null */
  public boolean hasEmployeeId() {
    return genClient.cacheHasKey(CacheKey.employeeId);
  }

  /** Checks whether the 'employeeName' field has been set, however the value could be null */
  public boolean hasEmployeeName() {
    return genClient.cacheHasKey(CacheKey.employeeName);
  }

  /** Checks whether the 'authorizationCode' field has been set, however the value could be null */
  public boolean hasAuthorizationCode() {
    return genClient.cacheHasKey(CacheKey.authorizationCode);
  }

  /** Checks whether the 'externalPaymentId' field has been set, however the value could be null */
  public boolean hasExternalPaymentId() {
    return genClient.cacheHasKey(CacheKey.externalPaymentId);
  }

  /** Checks whether the 'serviceChargeAmount' field has been set, however the value could be null */
  public boolean hasServiceChargeAmount() {
    return genClient.cacheHasKey(CacheKey.serviceChargeAmount);
  }

  /** Checks whether the 'taxableAmountRates' field has been set, however the value could be null */
  public boolean hasTaxableAmountRates() {
    return genClient.cacheHasKey(CacheKey.taxableAmountRates);
  }

  /** Checks whether the 'lineItems' field has been set, however the value could be null */
  public boolean hasLineItems() {
    return genClient.cacheHasKey(CacheKey.lineItems);
  }

  /** Checks whether the 'card' field has been set, however the value could be null */
  public boolean hasCard() {
    return genClient.cacheHasKey(CacheKey.card);
  }


  /**
   * Sets the field 'id'.
   */
  public PaymentRequest setId(java.lang.String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'orderId'.
   */
  public PaymentRequest setOrderId(java.lang.String orderId) {
    return genClient.setOther(orderId, CacheKey.orderId);
  }

  /**
   * Sets the field 'timestamp'.
   */
  public PaymentRequest setTimestamp(java.lang.Long timestamp) {
    return genClient.setOther(timestamp, CacheKey.timestamp);
  }

  /**
   * Sets the field 'tender'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public PaymentRequest setTender(com.clover.sdk.v3.base.Tender tender) {
    return genClient.setRecord(tender, CacheKey.tender);
  }

  /**
   * Sets the field 'amount'.
   */
  public PaymentRequest setAmount(java.lang.Long amount) {
    return genClient.setOther(amount, CacheKey.amount);
  }

  /**
   * Sets the field 'tipAmount'.
   */
  public PaymentRequest setTipAmount(java.lang.Long tipAmount) {
    return genClient.setOther(tipAmount, CacheKey.tipAmount);
  }

  /**
   * Sets the field 'taxAmount'.
   */
  public PaymentRequest setTaxAmount(java.lang.Long taxAmount) {
    return genClient.setOther(taxAmount, CacheKey.taxAmount);
  }

  /**
   * Sets the field 'cashBackAmount'.
   */
  public PaymentRequest setCashBackAmount(java.lang.Long cashBackAmount) {
    return genClient.setOther(cashBackAmount, CacheKey.cashBackAmount);
  }

  /**
   * Sets the field 'cashTendered'.
   */
  public PaymentRequest setCashTendered(java.lang.Long cashTendered) {
    return genClient.setOther(cashTendered, CacheKey.cashTendered);
  }

  /**
   * Sets the field 'employeeId'.
   */
  public PaymentRequest setEmployeeId(java.lang.String employeeId) {
    return genClient.setOther(employeeId, CacheKey.employeeId);
  }

  /**
   * Sets the field 'employeeName'.
   */
  public PaymentRequest setEmployeeName(java.lang.String employeeName) {
    return genClient.setOther(employeeName, CacheKey.employeeName);
  }

  /**
   * Sets the field 'authorizationCode'.
   */
  public PaymentRequest setAuthorizationCode(java.lang.String authorizationCode) {
    return genClient.setOther(authorizationCode, CacheKey.authorizationCode);
  }

  /**
   * Sets the field 'externalPaymentId'.
   */
  public PaymentRequest setExternalPaymentId(java.lang.String externalPaymentId) {
    return genClient.setOther(externalPaymentId, CacheKey.externalPaymentId);
  }

  /**
   * Sets the field 'serviceChargeAmount'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public PaymentRequest setServiceChargeAmount(com.clover.sdk.v3.payments.ServiceChargeAmount serviceChargeAmount) {
    return genClient.setRecord(serviceChargeAmount, CacheKey.serviceChargeAmount);
  }

  /**
   * Sets the field 'taxableAmountRates'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public PaymentRequest setTaxableAmountRates(java.util.List<com.clover.sdk.v3.payments.TaxableAmountRate> taxableAmountRates) {
    return genClient.setArrayRecord(taxableAmountRates, CacheKey.taxableAmountRates);
  }

  /**
   * Sets the field 'lineItems'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public PaymentRequest setLineItems(java.util.List<com.clover.sdk.v3.payments.LineItemPayment> lineItems) {
    return genClient.setArrayRecord(lineItems, CacheKey.lineItems);
  }

  /**
   * Sets the field 'card'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public PaymentRequest setCard(com.clover.sdk.v3.pay.PaymentRequestCardDetails card) {
    return genClient.setRecord(card, CacheKey.card);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'orderId' field, the 'has' method for this field will now return false */
  public void clearOrderId() {
    genClient.clear(CacheKey.orderId);
  }
  /** Clears the 'timestamp' field, the 'has' method for this field will now return false */
  public void clearTimestamp() {
    genClient.clear(CacheKey.timestamp);
  }
  /** Clears the 'tender' field, the 'has' method for this field will now return false */
  public void clearTender() {
    genClient.clear(CacheKey.tender);
  }
  /** Clears the 'amount' field, the 'has' method for this field will now return false */
  public void clearAmount() {
    genClient.clear(CacheKey.amount);
  }
  /** Clears the 'tipAmount' field, the 'has' method for this field will now return false */
  public void clearTipAmount() {
    genClient.clear(CacheKey.tipAmount);
  }
  /** Clears the 'taxAmount' field, the 'has' method for this field will now return false */
  public void clearTaxAmount() {
    genClient.clear(CacheKey.taxAmount);
  }
  /** Clears the 'cashBackAmount' field, the 'has' method for this field will now return false */
  public void clearCashBackAmount() {
    genClient.clear(CacheKey.cashBackAmount);
  }
  /** Clears the 'cashTendered' field, the 'has' method for this field will now return false */
  public void clearCashTendered() {
    genClient.clear(CacheKey.cashTendered);
  }
  /** Clears the 'employeeId' field, the 'has' method for this field will now return false */
  public void clearEmployeeId() {
    genClient.clear(CacheKey.employeeId);
  }
  /** Clears the 'employeeName' field, the 'has' method for this field will now return false */
  public void clearEmployeeName() {
    genClient.clear(CacheKey.employeeName);
  }
  /** Clears the 'authorizationCode' field, the 'has' method for this field will now return false */
  public void clearAuthorizationCode() {
    genClient.clear(CacheKey.authorizationCode);
  }
  /** Clears the 'externalPaymentId' field, the 'has' method for this field will now return false */
  public void clearExternalPaymentId() {
    genClient.clear(CacheKey.externalPaymentId);
  }
  /** Clears the 'serviceChargeAmount' field, the 'has' method for this field will now return false */
  public void clearServiceChargeAmount() {
    genClient.clear(CacheKey.serviceChargeAmount);
  }
  /** Clears the 'taxableAmountRates' field, the 'has' method for this field will now return false */
  public void clearTaxableAmountRates() {
    genClient.clear(CacheKey.taxableAmountRates);
  }
  /** Clears the 'lineItems' field, the 'has' method for this field will now return false */
  public void clearLineItems() {
    genClient.clear(CacheKey.lineItems);
  }
  /** Clears the 'card' field, the 'has' method for this field will now return false */
  public void clearCard() {
    genClient.clear(CacheKey.card);
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
  public PaymentRequest copyChanges() {
    PaymentRequest copy = new PaymentRequest();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(PaymentRequest src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new PaymentRequest(src).getJSONObject(), src.genClient);
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

  public static final android.os.Parcelable.Creator<PaymentRequest> CREATOR = new android.os.Parcelable.Creator<PaymentRequest>() {
    @Override
    public PaymentRequest createFromParcel(android.os.Parcel in) {
      PaymentRequest instance = new PaymentRequest(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public PaymentRequest[] newArray(int size) {
      return new PaymentRequest[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<PaymentRequest> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<PaymentRequest>() {
    @Override
    public PaymentRequest create(org.json.JSONObject jsonObject) {
      return new PaymentRequest(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;

    public static final boolean ORDERID_IS_REQUIRED = false;
    public static final long ORDERID_MAX_LEN = 13;

    public static final boolean TIMESTAMP_IS_REQUIRED = false;

    public static final boolean TENDER_IS_REQUIRED = false;

    public static final boolean AMOUNT_IS_REQUIRED = false;

    public static final boolean TIPAMOUNT_IS_REQUIRED = false;

    public static final boolean TAXAMOUNT_IS_REQUIRED = false;

    public static final boolean CASHBACKAMOUNT_IS_REQUIRED = false;

    public static final boolean CASHTENDERED_IS_REQUIRED = false;

    public static final boolean EMPLOYEEID_IS_REQUIRED = false;
    public static final long EMPLOYEEID_MAX_LEN = 13;

    public static final boolean EMPLOYEENAME_IS_REQUIRED = false;
    public static final long EMPLOYEENAME_MAX_LEN = 127;

    public static final boolean AUTHORIZATIONCODE_IS_REQUIRED = false;

    public static final boolean EXTERNALPAYMENTID_IS_REQUIRED = false;
    public static final long EXTERNALPAYMENTID_MAX_LEN = 32;

    public static final boolean SERVICECHARGEAMOUNT_IS_REQUIRED = false;

    public static final boolean TAXABLEAMOUNTRATES_IS_REQUIRED = false;

    public static final boolean LINEITEMS_IS_REQUIRED = false;

    public static final boolean CARD_IS_REQUIRED = false;

  }

}
