/**
 * ScoreOutput115.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.ke.transunion.crbws.ws;

public class ScoreOutput115  implements java.io.Serializable {
    private String country;

    private String grade;

    private String positiveScore;

    private String probability;

    private String reasonCodeAARC1;

    private String reasonCodeAARC2;

    private String reasonCodeAARC3;

    private String reasonCodeAARC4;

    public ScoreOutput115() {
    }

    public ScoreOutput115(
           String country,
           String grade,
           String positiveScore,
           String probability,
           String reasonCodeAARC1,
           String reasonCodeAARC2,
           String reasonCodeAARC3,
           String reasonCodeAARC4) {
           this.country = country;
           this.grade = grade;
           this.positiveScore = positiveScore;
           this.probability = probability;
           this.reasonCodeAARC1 = reasonCodeAARC1;
           this.reasonCodeAARC2 = reasonCodeAARC2;
           this.reasonCodeAARC3 = reasonCodeAARC3;
           this.reasonCodeAARC4 = reasonCodeAARC4;
    }


    /**
     * Gets the country value for this ScoreOutput115.
     * 
     * @return country
     */
    public String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this ScoreOutput115.
     * 
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }


    /**
     * Gets the grade value for this ScoreOutput115.
     * 
     * @return grade
     */
    public String getGrade() {
        return grade;
    }


    /**
     * Sets the grade value for this ScoreOutput115.
     * 
     * @param grade
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }


    /**
     * Gets the positiveScore value for this ScoreOutput115.
     * 
     * @return positiveScore
     */
    public String getPositiveScore() {
        return positiveScore;
    }


    /**
     * Sets the positiveScore value for this ScoreOutput115.
     * 
     * @param positiveScore
     */
    public void setPositiveScore(String positiveScore) {
        this.positiveScore = positiveScore;
    }


    /**
     * Gets the probability value for this ScoreOutput115.
     * 
     * @return probability
     */
    public String getProbability() {
        return probability;
    }


    /**
     * Sets the probability value for this ScoreOutput115.
     * 
     * @param probability
     */
    public void setProbability(String probability) {
        this.probability = probability;
    }


    /**
     * Gets the reasonCodeAARC1 value for this ScoreOutput115.
     * 
     * @return reasonCodeAARC1
     */
    public String getReasonCodeAARC1() {
        return reasonCodeAARC1;
    }


    /**
     * Sets the reasonCodeAARC1 value for this ScoreOutput115.
     * 
     * @param reasonCodeAARC1
     */
    public void setReasonCodeAARC1(String reasonCodeAARC1) {
        this.reasonCodeAARC1 = reasonCodeAARC1;
    }


    /**
     * Gets the reasonCodeAARC2 value for this ScoreOutput115.
     * 
     * @return reasonCodeAARC2
     */
    public String getReasonCodeAARC2() {
        return reasonCodeAARC2;
    }


    /**
     * Sets the reasonCodeAARC2 value for this ScoreOutput115.
     * 
     * @param reasonCodeAARC2
     */
    public void setReasonCodeAARC2(String reasonCodeAARC2) {
        this.reasonCodeAARC2 = reasonCodeAARC2;
    }


    /**
     * Gets the reasonCodeAARC3 value for this ScoreOutput115.
     * 
     * @return reasonCodeAARC3
     */
    public String getReasonCodeAARC3() {
        return reasonCodeAARC3;
    }


    /**
     * Sets the reasonCodeAARC3 value for this ScoreOutput115.
     * 
     * @param reasonCodeAARC3
     */
    public void setReasonCodeAARC3(String reasonCodeAARC3) {
        this.reasonCodeAARC3 = reasonCodeAARC3;
    }


    /**
     * Gets the reasonCodeAARC4 value for this ScoreOutput115.
     * 
     * @return reasonCodeAARC4
     */
    public String getReasonCodeAARC4() {
        return reasonCodeAARC4;
    }


    /**
     * Sets the reasonCodeAARC4 value for this ScoreOutput115.
     * 
     * @param reasonCodeAARC4
     */
    public void setReasonCodeAARC4(String reasonCodeAARC4) {
        this.reasonCodeAARC4 = reasonCodeAARC4;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ScoreOutput115)) return false;
        ScoreOutput115 other = (ScoreOutput115) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.grade==null && other.getGrade()==null) || 
             (this.grade!=null &&
              this.grade.equals(other.getGrade()))) &&
            ((this.positiveScore==null && other.getPositiveScore()==null) || 
             (this.positiveScore!=null &&
              this.positiveScore.equals(other.getPositiveScore()))) &&
            ((this.probability==null && other.getProbability()==null) || 
             (this.probability!=null &&
              this.probability.equals(other.getProbability()))) &&
            ((this.reasonCodeAARC1==null && other.getReasonCodeAARC1()==null) || 
             (this.reasonCodeAARC1!=null &&
              this.reasonCodeAARC1.equals(other.getReasonCodeAARC1()))) &&
            ((this.reasonCodeAARC2==null && other.getReasonCodeAARC2()==null) || 
             (this.reasonCodeAARC2!=null &&
              this.reasonCodeAARC2.equals(other.getReasonCodeAARC2()))) &&
            ((this.reasonCodeAARC3==null && other.getReasonCodeAARC3()==null) || 
             (this.reasonCodeAARC3!=null &&
              this.reasonCodeAARC3.equals(other.getReasonCodeAARC3()))) &&
            ((this.reasonCodeAARC4==null && other.getReasonCodeAARC4()==null) || 
             (this.reasonCodeAARC4!=null &&
              this.reasonCodeAARC4.equals(other.getReasonCodeAARC4())));
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
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getGrade() != null) {
            _hashCode += getGrade().hashCode();
        }
        if (getPositiveScore() != null) {
            _hashCode += getPositiveScore().hashCode();
        }
        if (getProbability() != null) {
            _hashCode += getProbability().hashCode();
        }
        if (getReasonCodeAARC1() != null) {
            _hashCode += getReasonCodeAARC1().hashCode();
        }
        if (getReasonCodeAARC2() != null) {
            _hashCode += getReasonCodeAARC2().hashCode();
        }
        if (getReasonCodeAARC3() != null) {
            _hashCode += getReasonCodeAARC3().hashCode();
        }
        if (getReasonCodeAARC4() != null) {
            _hashCode += getReasonCodeAARC4().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScoreOutput115.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "scoreOutput115"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "grade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("positiveScore");
        elemField.setXmlName(new javax.xml.namespace.QName("", "positiveScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("probability");
        elemField.setXmlName(new javax.xml.namespace.QName("", "probability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonCodeAARC1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reasonCodeAARC1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonCodeAARC2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reasonCodeAARC2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonCodeAARC3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reasonCodeAARC3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonCodeAARC4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reasonCodeAARC4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
