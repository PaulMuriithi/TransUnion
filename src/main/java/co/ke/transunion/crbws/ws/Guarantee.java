/**
 * Guarantee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.ke.transunion.crbws.ws;

public class Guarantee  implements java.io.Serializable {
    private String currency;

    private String disputed;

    private String guaranteeAccountType;

    private Integer guaranteeCrn;

    private Double guaranteeLimit;

    private String guaranteeType;

    private String loanStatus;

    private Double principalAmount;

    public Guarantee() {
    }

    public Guarantee(
           String currency,
           String disputed,
           String guaranteeAccountType,
           Integer guaranteeCrn,
           Double guaranteeLimit,
           String guaranteeType,
           String loanStatus,
           Double principalAmount) {
           this.currency = currency;
           this.disputed = disputed;
           this.guaranteeAccountType = guaranteeAccountType;
           this.guaranteeCrn = guaranteeCrn;
           this.guaranteeLimit = guaranteeLimit;
           this.guaranteeType = guaranteeType;
           this.loanStatus = loanStatus;
           this.principalAmount = principalAmount;
    }


    /**
     * Gets the currency value for this Guarantee.
     * 
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this Guarantee.
     * 
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }


    /**
     * Gets the disputed value for this Guarantee.
     * 
     * @return disputed
     */
    public String getDisputed() {
        return disputed;
    }


    /**
     * Sets the disputed value for this Guarantee.
     * 
     * @param disputed
     */
    public void setDisputed(String disputed) {
        this.disputed = disputed;
    }


    /**
     * Gets the guaranteeAccountType value for this Guarantee.
     * 
     * @return guaranteeAccountType
     */
    public String getGuaranteeAccountType() {
        return guaranteeAccountType;
    }


    /**
     * Sets the guaranteeAccountType value for this Guarantee.
     * 
     * @param guaranteeAccountType
     */
    public void setGuaranteeAccountType(String guaranteeAccountType) {
        this.guaranteeAccountType = guaranteeAccountType;
    }


    /**
     * Gets the guaranteeCrn value for this Guarantee.
     * 
     * @return guaranteeCrn
     */
    public Integer getGuaranteeCrn() {
        return guaranteeCrn;
    }


    /**
     * Sets the guaranteeCrn value for this Guarantee.
     * 
     * @param guaranteeCrn
     */
    public void setGuaranteeCrn(Integer guaranteeCrn) {
        this.guaranteeCrn = guaranteeCrn;
    }


    /**
     * Gets the guaranteeLimit value for this Guarantee.
     * 
     * @return guaranteeLimit
     */
    public Double getGuaranteeLimit() {
        return guaranteeLimit;
    }


    /**
     * Sets the guaranteeLimit value for this Guarantee.
     * 
     * @param guaranteeLimit
     */
    public void setGuaranteeLimit(Double guaranteeLimit) {
        this.guaranteeLimit = guaranteeLimit;
    }


    /**
     * Gets the guaranteeType value for this Guarantee.
     * 
     * @return guaranteeType
     */
    public String getGuaranteeType() {
        return guaranteeType;
    }


    /**
     * Sets the guaranteeType value for this Guarantee.
     * 
     * @param guaranteeType
     */
    public void setGuaranteeType(String guaranteeType) {
        this.guaranteeType = guaranteeType;
    }


    /**
     * Gets the loanStatus value for this Guarantee.
     * 
     * @return loanStatus
     */
    public String getLoanStatus() {
        return loanStatus;
    }


    /**
     * Sets the loanStatus value for this Guarantee.
     * 
     * @param loanStatus
     */
    public void setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
    }


    /**
     * Gets the principalAmount value for this Guarantee.
     * 
     * @return principalAmount
     */
    public Double getPrincipalAmount() {
        return principalAmount;
    }


    /**
     * Sets the principalAmount value for this Guarantee.
     * 
     * @param principalAmount
     */
    public void setPrincipalAmount(Double principalAmount) {
        this.principalAmount = principalAmount;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Guarantee)) return false;
        Guarantee other = (Guarantee) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.disputed==null && other.getDisputed()==null) || 
             (this.disputed!=null &&
              this.disputed.equals(other.getDisputed()))) &&
            ((this.guaranteeAccountType==null && other.getGuaranteeAccountType()==null) || 
             (this.guaranteeAccountType!=null &&
              this.guaranteeAccountType.equals(other.getGuaranteeAccountType()))) &&
            ((this.guaranteeCrn==null && other.getGuaranteeCrn()==null) || 
             (this.guaranteeCrn!=null &&
              this.guaranteeCrn.equals(other.getGuaranteeCrn()))) &&
            ((this.guaranteeLimit==null && other.getGuaranteeLimit()==null) || 
             (this.guaranteeLimit!=null &&
              this.guaranteeLimit.equals(other.getGuaranteeLimit()))) &&
            ((this.guaranteeType==null && other.getGuaranteeType()==null) || 
             (this.guaranteeType!=null &&
              this.guaranteeType.equals(other.getGuaranteeType()))) &&
            ((this.loanStatus==null && other.getLoanStatus()==null) || 
             (this.loanStatus!=null &&
              this.loanStatus.equals(other.getLoanStatus()))) &&
            ((this.principalAmount==null && other.getPrincipalAmount()==null) || 
             (this.principalAmount!=null &&
              this.principalAmount.equals(other.getPrincipalAmount())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getDisputed() != null) {
            _hashCode += getDisputed().hashCode();
        }
        if (getGuaranteeAccountType() != null) {
            _hashCode += getGuaranteeAccountType().hashCode();
        }
        if (getGuaranteeCrn() != null) {
            _hashCode += getGuaranteeCrn().hashCode();
        }
        if (getGuaranteeLimit() != null) {
            _hashCode += getGuaranteeLimit().hashCode();
        }
        if (getGuaranteeType() != null) {
            _hashCode += getGuaranteeType().hashCode();
        }
        if (getLoanStatus() != null) {
            _hashCode += getLoanStatus().hashCode();
        }
        if (getPrincipalAmount() != null) {
            _hashCode += getPrincipalAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Guarantee.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "guarantee"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disputed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disputed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guaranteeAccountType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "guaranteeAccountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guaranteeCrn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "guaranteeCrn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guaranteeLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "guaranteeLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guaranteeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "guaranteeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loanStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loanStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("principalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "principalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
