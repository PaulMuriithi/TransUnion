/**
 * Director.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.ke.transunion.crbws.ws;

public class Director  implements java.io.Serializable {
    private Integer directorCrn;

    private String fullName;

    private String title;

    public Director() {
    }

    public Director(
           Integer directorCrn,
           String fullName,
           String title) {
           this.directorCrn = directorCrn;
           this.fullName = fullName;
           this.title = title;
    }


    /**
     * Gets the directorCrn value for this Director.
     * 
     * @return directorCrn
     */
    public Integer getDirectorCrn() {
        return directorCrn;
    }


    /**
     * Sets the directorCrn value for this Director.
     * 
     * @param directorCrn
     */
    public void setDirectorCrn(Integer directorCrn) {
        this.directorCrn = directorCrn;
    }


    /**
     * Gets the fullName value for this Director.
     * 
     * @return fullName
     */
    public String getFullName() {
        return fullName;
    }


    /**
     * Sets the fullName value for this Director.
     * 
     * @param fullName
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    /**
     * Gets the title value for this Director.
     * 
     * @return title
     */
    public String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Director.
     * 
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Director)) return false;
        Director other = (Director) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.directorCrn==null && other.getDirectorCrn()==null) || 
             (this.directorCrn!=null &&
              this.directorCrn.equals(other.getDirectorCrn()))) &&
            ((this.fullName==null && other.getFullName()==null) || 
             (this.fullName!=null &&
              this.fullName.equals(other.getFullName()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle())));
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
        if (getDirectorCrn() != null) {
            _hashCode += getDirectorCrn().hashCode();
        }
        if (getFullName() != null) {
            _hashCode += getFullName().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Director.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "director"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directorCrn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "directorCrn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fullName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
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
