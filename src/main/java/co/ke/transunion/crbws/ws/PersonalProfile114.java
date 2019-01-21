/**
 * PersonalProfile114.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.ke.transunion.crbws.ws;

public class PersonalProfile114  implements java.io.Serializable {
    private String alienID;

    private Integer crn;

    private java.util.Calendar dateOfBirth;

    private String drivingLicenseNo;

    private String fullName;

    private String nationalID;

    private String otherNames;

    private String passportNo;

    private String salutation;

    private String serviceID;

    private String surname;

    public PersonalProfile114() {
    }

    public PersonalProfile114(
           String alienID,
           Integer crn,
           java.util.Calendar dateOfBirth,
           String drivingLicenseNo,
           String fullName,
           String nationalID,
           String otherNames,
           String passportNo,
           String salutation,
           String serviceID,
           String surname) {
           this.alienID = alienID;
           this.crn = crn;
           this.dateOfBirth = dateOfBirth;
           this.drivingLicenseNo = drivingLicenseNo;
           this.fullName = fullName;
           this.nationalID = nationalID;
           this.otherNames = otherNames;
           this.passportNo = passportNo;
           this.salutation = salutation;
           this.serviceID = serviceID;
           this.surname = surname;
    }


    /**
     * Gets the alienID value for this PersonalProfile114.
     * 
     * @return alienID
     */
    public String getAlienID() {
        return alienID;
    }


    /**
     * Sets the alienID value for this PersonalProfile114.
     * 
     * @param alienID
     */
    public void setAlienID(String alienID) {
        this.alienID = alienID;
    }


    /**
     * Gets the crn value for this PersonalProfile114.
     * 
     * @return crn
     */
    public Integer getCrn() {
        return crn;
    }


    /**
     * Sets the crn value for this PersonalProfile114.
     * 
     * @param crn
     */
    public void setCrn(Integer crn) {
        this.crn = crn;
    }


    /**
     * Gets the dateOfBirth value for this PersonalProfile114.
     * 
     * @return dateOfBirth
     */
    public java.util.Calendar getDateOfBirth() {
        return dateOfBirth;
    }


    /**
     * Sets the dateOfBirth value for this PersonalProfile114.
     * 
     * @param dateOfBirth
     */
    public void setDateOfBirth(java.util.Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    /**
     * Gets the drivingLicenseNo value for this PersonalProfile114.
     * 
     * @return drivingLicenseNo
     */
    public String getDrivingLicenseNo() {
        return drivingLicenseNo;
    }


    /**
     * Sets the drivingLicenseNo value for this PersonalProfile114.
     * 
     * @param drivingLicenseNo
     */
    public void setDrivingLicenseNo(String drivingLicenseNo) {
        this.drivingLicenseNo = drivingLicenseNo;
    }


    /**
     * Gets the fullName value for this PersonalProfile114.
     * 
     * @return fullName
     */
    public String getFullName() {
        return fullName;
    }


    /**
     * Sets the fullName value for this PersonalProfile114.
     * 
     * @param fullName
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    /**
     * Gets the nationalID value for this PersonalProfile114.
     * 
     * @return nationalID
     */
    public String getNationalID() {
        return nationalID;
    }


    /**
     * Sets the nationalID value for this PersonalProfile114.
     * 
     * @param nationalID
     */
    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }


    /**
     * Gets the otherNames value for this PersonalProfile114.
     * 
     * @return otherNames
     */
    public String getOtherNames() {
        return otherNames;
    }


    /**
     * Sets the otherNames value for this PersonalProfile114.
     * 
     * @param otherNames
     */
    public void setOtherNames(String otherNames) {
        this.otherNames = otherNames;
    }


    /**
     * Gets the passportNo value for this PersonalProfile114.
     * 
     * @return passportNo
     */
    public String getPassportNo() {
        return passportNo;
    }


    /**
     * Sets the passportNo value for this PersonalProfile114.
     * 
     * @param passportNo
     */
    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }


    /**
     * Gets the salutation value for this PersonalProfile114.
     * 
     * @return salutation
     */
    public String getSalutation() {
        return salutation;
    }


    /**
     * Sets the salutation value for this PersonalProfile114.
     * 
     * @param salutation
     */
    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }


    /**
     * Gets the serviceID value for this PersonalProfile114.
     * 
     * @return serviceID
     */
    public String getServiceID() {
        return serviceID;
    }


    /**
     * Sets the serviceID value for this PersonalProfile114.
     * 
     * @param serviceID
     */
    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }


    /**
     * Gets the surname value for this PersonalProfile114.
     * 
     * @return surname
     */
    public String getSurname() {
        return surname;
    }


    /**
     * Sets the surname value for this PersonalProfile114.
     * 
     * @param surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PersonalProfile114)) return false;
        PersonalProfile114 other = (PersonalProfile114) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.alienID==null && other.getAlienID()==null) || 
             (this.alienID!=null &&
              this.alienID.equals(other.getAlienID()))) &&
            ((this.crn==null && other.getCrn()==null) || 
             (this.crn!=null &&
              this.crn.equals(other.getCrn()))) &&
            ((this.dateOfBirth==null && other.getDateOfBirth()==null) || 
             (this.dateOfBirth!=null &&
              this.dateOfBirth.equals(other.getDateOfBirth()))) &&
            ((this.drivingLicenseNo==null && other.getDrivingLicenseNo()==null) || 
             (this.drivingLicenseNo!=null &&
              this.drivingLicenseNo.equals(other.getDrivingLicenseNo()))) &&
            ((this.fullName==null && other.getFullName()==null) || 
             (this.fullName!=null &&
              this.fullName.equals(other.getFullName()))) &&
            ((this.nationalID==null && other.getNationalID()==null) || 
             (this.nationalID!=null &&
              this.nationalID.equals(other.getNationalID()))) &&
            ((this.otherNames==null && other.getOtherNames()==null) || 
             (this.otherNames!=null &&
              this.otherNames.equals(other.getOtherNames()))) &&
            ((this.passportNo==null && other.getPassportNo()==null) || 
             (this.passportNo!=null &&
              this.passportNo.equals(other.getPassportNo()))) &&
            ((this.salutation==null && other.getSalutation()==null) || 
             (this.salutation!=null &&
              this.salutation.equals(other.getSalutation()))) &&
            ((this.serviceID==null && other.getServiceID()==null) || 
             (this.serviceID!=null &&
              this.serviceID.equals(other.getServiceID()))) &&
            ((this.surname==null && other.getSurname()==null) || 
             (this.surname!=null &&
              this.surname.equals(other.getSurname())));
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
        if (getAlienID() != null) {
            _hashCode += getAlienID().hashCode();
        }
        if (getCrn() != null) {
            _hashCode += getCrn().hashCode();
        }
        if (getDateOfBirth() != null) {
            _hashCode += getDateOfBirth().hashCode();
        }
        if (getDrivingLicenseNo() != null) {
            _hashCode += getDrivingLicenseNo().hashCode();
        }
        if (getFullName() != null) {
            _hashCode += getFullName().hashCode();
        }
        if (getNationalID() != null) {
            _hashCode += getNationalID().hashCode();
        }
        if (getOtherNames() != null) {
            _hashCode += getOtherNames().hashCode();
        }
        if (getPassportNo() != null) {
            _hashCode += getPassportNo().hashCode();
        }
        if (getSalutation() != null) {
            _hashCode += getSalutation().hashCode();
        }
        if (getServiceID() != null) {
            _hashCode += getServiceID().hashCode();
        }
        if (getSurname() != null) {
            _hashCode += getSurname().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersonalProfile114.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "personalProfile114"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alienID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alienID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateOfBirth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drivingLicenseNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "drivingLicenseNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("nationalID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nationalID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherNames");
        elemField.setXmlName(new javax.xml.namespace.QName("", "otherNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passportNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "passportNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salutation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "salutation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "surname"));
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
