/**
 * Product402.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.ke.transunion.crbws.ws;

public class Product402  implements java.io.Serializable {
    private Account402[] accountList;

    private Integer responseCode;

    public Product402() {
    }

    public Product402(
           Account402[] accountList,
           Integer responseCode) {
           this.accountList = accountList;
           this.responseCode = responseCode;
    }


    /**
     * Gets the accountList value for this Product402.
     * 
     * @return accountList
     */
    public Account402[] getAccountList() {
        return accountList;
    }


    /**
     * Sets the accountList value for this Product402.
     * 
     * @param accountList
     */
    public void setAccountList(Account402[] accountList) {
        this.accountList = accountList;
    }

    public Account402 getAccountList(int i) {
        return this.accountList[i];
    }

    public void setAccountList(int i, Account402 _value) {
        this.accountList[i] = _value;
    }


    /**
     * Gets the responseCode value for this Product402.
     * 
     * @return responseCode
     */
    public Integer getResponseCode() {
        return responseCode;
    }


    /**
     * Sets the responseCode value for this Product402.
     * 
     * @param responseCode
     */
    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Product402)) return false;
        Product402 other = (Product402) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountList==null && other.getAccountList()==null) || 
             (this.accountList!=null &&
              java.util.Arrays.equals(this.accountList, other.getAccountList()))) &&
            ((this.responseCode==null && other.getResponseCode()==null) || 
             (this.responseCode!=null &&
              this.responseCode.equals(other.getResponseCode())));
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
        if (getAccountList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAccountList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResponseCode() != null) {
            _hashCode += getResponseCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Product402.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "product402"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "account402"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
