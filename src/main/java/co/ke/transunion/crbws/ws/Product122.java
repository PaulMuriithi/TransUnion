/**
 * Product122.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.ke.transunion.crbws.ws;

public class Product122  implements java.io.Serializable {
    private Account122[] accountList;

    private Header122 header;

    private co.ke.transunion.crbws.ws.PersonalProfile122 personalProfile;

    private Integer responseCode;

    private co.ke.transunion.crbws.ws.ScoreOutput122 scoreOutput;

    private co.ke.transunion.crbws.ws.Summary122 summary;

    public Product122() {
    }

    public Product122(
           Account122[] accountList,
           Header122 header,
           co.ke.transunion.crbws.ws.PersonalProfile122 personalProfile,
           Integer responseCode,
           co.ke.transunion.crbws.ws.ScoreOutput122 scoreOutput,
           co.ke.transunion.crbws.ws.Summary122 summary) {
           this.accountList = accountList;
           this.header = header;
           this.personalProfile = personalProfile;
           this.responseCode = responseCode;
           this.scoreOutput = scoreOutput;
           this.summary = summary;
    }


    /**
     * Gets the accountList value for this Product122.
     * 
     * @return accountList
     */
    public Account122[] getAccountList() {
        return accountList;
    }


    /**
     * Sets the accountList value for this Product122.
     * 
     * @param accountList
     */
    public void setAccountList(Account122[] accountList) {
        this.accountList = accountList;
    }

    public Account122 getAccountList(int i) {
        return this.accountList[i];
    }

    public void setAccountList(int i, Account122 _value) {
        this.accountList[i] = _value;
    }


    /**
     * Gets the header value for this Product122.
     * 
     * @return header
     */
    public Header122 getHeader() {
        return header;
    }


    /**
     * Sets the header value for this Product122.
     * 
     * @param header
     */
    public void setHeader(Header122 header) {
        this.header = header;
    }


    /**
     * Gets the personalProfile value for this Product122.
     * 
     * @return personalProfile
     */
    public co.ke.transunion.crbws.ws.PersonalProfile122 getPersonalProfile() {
        return personalProfile;
    }


    /**
     * Sets the personalProfile value for this Product122.
     * 
     * @param personalProfile
     */
    public void setPersonalProfile(co.ke.transunion.crbws.ws.PersonalProfile122 personalProfile) {
        this.personalProfile = personalProfile;
    }


    /**
     * Gets the responseCode value for this Product122.
     * 
     * @return responseCode
     */
    public Integer getResponseCode() {
        return responseCode;
    }


    /**
     * Sets the responseCode value for this Product122.
     * 
     * @param responseCode
     */
    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }


    /**
     * Gets the scoreOutput value for this Product122.
     * 
     * @return scoreOutput
     */
    public co.ke.transunion.crbws.ws.ScoreOutput122 getScoreOutput() {
        return scoreOutput;
    }


    /**
     * Sets the scoreOutput value for this Product122.
     * 
     * @param scoreOutput
     */
    public void setScoreOutput(co.ke.transunion.crbws.ws.ScoreOutput122 scoreOutput) {
        this.scoreOutput = scoreOutput;
    }


    /**
     * Gets the summary value for this Product122.
     * 
     * @return summary
     */
    public co.ke.transunion.crbws.ws.Summary122 getSummary() {
        return summary;
    }


    /**
     * Sets the summary value for this Product122.
     * 
     * @param summary
     */
    public void setSummary(co.ke.transunion.crbws.ws.Summary122 summary) {
        this.summary = summary;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Product122)) return false;
        Product122 other = (Product122) obj;
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
            ((this.header==null && other.getHeader()==null) || 
             (this.header!=null &&
              this.header.equals(other.getHeader()))) &&
            ((this.personalProfile==null && other.getPersonalProfile()==null) || 
             (this.personalProfile!=null &&
              this.personalProfile.equals(other.getPersonalProfile()))) &&
            ((this.responseCode==null && other.getResponseCode()==null) || 
             (this.responseCode!=null &&
              this.responseCode.equals(other.getResponseCode()))) &&
            ((this.scoreOutput==null && other.getScoreOutput()==null) || 
             (this.scoreOutput!=null &&
              this.scoreOutput.equals(other.getScoreOutput()))) &&
            ((this.summary==null && other.getSummary()==null) || 
             (this.summary!=null &&
              this.summary.equals(other.getSummary())));
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
        if (getHeader() != null) {
            _hashCode += getHeader().hashCode();
        }
        if (getPersonalProfile() != null) {
            _hashCode += getPersonalProfile().hashCode();
        }
        if (getResponseCode() != null) {
            _hashCode += getResponseCode().hashCode();
        }
        if (getScoreOutput() != null) {
            _hashCode += getScoreOutput().hashCode();
        }
        if (getSummary() != null) {
            _hashCode += getSummary().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Product122.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "product122"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "account122"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("header");
        elemField.setXmlName(new javax.xml.namespace.QName("", "header"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "header122"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "personalProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "personalProfile122"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scoreOutput");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scoreOutput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "scoreOutput122"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "summary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "summary122"));
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
