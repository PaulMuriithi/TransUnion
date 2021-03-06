/**
 * PersonalProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.ke.transunion.crbws.ws;

public class PersonalProfile  implements java.io.Serializable {
    private String alienID;

    private Integer crn;

    private java.util.Calendar dateOfBirth;

    private java.util.Calendar dateOfDeath;

    private String drivingLicenseNo;

    private String fullName;

    private String gender;

    private String healthInsuranceNo;

    private String maritalStatus;

    private String nationalID;

    private String nationality;

    private String otherNames;

    private String passportNo;

    private String pin;

    private String salutation;

    private String serviceID;

    private String socialSecurityNo;

    private String surname;

    public PersonalProfile() {
    }

    public PersonalProfile(
           String alienID,
           Integer crn,
           java.util.Calendar dateOfBirth,
           java.util.Calendar dateOfDeath,
           String drivingLicenseNo,
           String fullName,
           String gender,
           String healthInsuranceNo,
           String maritalStatus,
           String nationalID,
           String nationality,
           String otherNames,
           String passportNo,
           String pin,
           String salutation,
           String serviceID,
           String socialSecurityNo,
           String surname) {
           this.alienID = alienID;
           this.crn = crn;
           this.dateOfBirth = dateOfBirth;
           this.dateOfDeath = dateOfDeath;
           this.drivingLicenseNo = drivingLicenseNo;
           this.fullName = fullName;
           this.gender = gender;
           this.healthInsuranceNo = healthInsuranceNo;
           this.maritalStatus = maritalStatus;
           this.nationalID = nationalID;
           this.nationality = nationality;
           this.otherNames = otherNames;
           this.passportNo = passportNo;
           this.pin = pin;
           this.salutation = salutation;
           this.serviceID = serviceID;
           this.socialSecurityNo = socialSecurityNo;
           this.surname = surname;
    }


    /**
     * Gets the alienID value for this PersonalProfile.
     * 
     * @return alienID
     */
    public String getAlienID() {
        return alienID;
    }


    /**
     * Sets the alienID value for this PersonalProfile.
     * 
     * @param alienID
     */
    public void setAlienID(String alienID) {
        this.alienID = alienID;
    }


    /**
     * Gets the crn value for this PersonalProfile.
     * 
     * @return crn
     */
    public Integer getCrn() {
        return crn;
    }


    /**
     * Sets the crn value for this PersonalProfile.
     * 
     * @param crn
     */
    public void setCrn(Integer crn) {
        this.crn = crn;
    }


    /**
     * Gets the dateOfBirth value for this PersonalProfile.
     * 
     * @return dateOfBirth
     */
    public java.util.Calendar getDateOfBirth() {
        return dateOfBirth;
    }


    /**
     * Sets the dateOfBirth value for this PersonalProfile.
     * 
     * @param dateOfBirth
     */
    public void setDateOfBirth(java.util.Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    /**
     * Gets the dateOfDeath value for this PersonalProfile.
     * 
     * @return dateOfDeath
     */
    public java.util.Calendar getDateOfDeath() {
        return dateOfDeath;
    }


    /**
     * Sets the dateOfDeath value for this PersonalProfile.
     * 
     * @param dateOfDeath
     */
    public void setDateOfDeath(java.util.Calendar dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }


    /**
     * Gets the drivingLicenseNo value for this PersonalProfile.
     * 
     * @return drivingLicenseNo
     */
    public String getDrivingLicenseNo() {
        return drivingLicenseNo;
    }


    /**
     * Sets the drivingLicenseNo value for this PersonalProfile.
     * 
     * @param drivingLicenseNo
     */
    public void setDrivingLicenseNo(String drivingLicenseNo) {
        this.drivingLicenseNo = drivingLicenseNo;
    }


    /**
     * Gets the fullName value for this PersonalProfile.
     * 
     * @return fullName
     */
    public String getFullName() {
        return fullName;
    }


    /**
     * Sets the fullName value for this PersonalProfile.
     * 
     * @param fullName
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    /**
     * Gets the gender value for this PersonalProfile.
     * 
     * @return gender
     */
    public String getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this PersonalProfile.
     * 
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }


    /**
     * Gets the healthInsuranceNo value for this PersonalProfile.
     * 
     * @return healthInsuranceNo
     */
    public String getHealthInsuranceNo() {
        return healthInsuranceNo;
    }


    /**
     * Sets the healthInsuranceNo value for this PersonalProfile.
     * 
     * @param healthInsuranceNo
     */
    public void setHealthInsuranceNo(String healthInsuranceNo) {
        this.healthInsuranceNo = healthInsuranceNo;
    }


    /**
     * Gets the maritalStatus value for this PersonalProfile.
     * 
     * @return maritalStatus
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }


    /**
     * Sets the maritalStatus value for this PersonalProfile.
     * 
     * @param maritalStatus
     */
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }


    /**
     * Gets the nationalID value for this PersonalProfile.
     * 
     * @return nationalID
     */
    public String getNationalID() {
        return nationalID;
    }


    /**
     * Sets the nationalID value for this PersonalProfile.
     * 
     * @param nationalID
     */
    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }


    /**
     * Gets the nationality value for this PersonalProfile.
     * 
     * @return nationality
     */
    public String getNationality() {
        return nationality;
    }


    /**
     * Sets the nationality value for this PersonalProfile.
     * 
     * @param nationality
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }


    /**
     * Gets the otherNames value for this PersonalProfile.
     * 
     * @return otherNames
     */
    public String getOtherNames() {
        return otherNames;
    }


    /**
     * Sets the otherNames value for this PersonalProfile.
     * 
     * @param otherNames
     */
    public void setOtherNames(String otherNames) {
        this.otherNames = otherNames;
    }


    /**
     * Gets the passportNo value for this PersonalProfile.
     * 
     * @return passportNo
     */
    public String getPassportNo() {
        return passportNo;
    }


    /**
     * Sets the passportNo value for this PersonalProfile.
     * 
     * @param passportNo
     */
    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }


    /**
     * Gets the pin value for this PersonalProfile.
     * 
     * @return pin
     */
    public String getPin() {
        return pin;
    }


    /**
     * Sets the pin value for this PersonalProfile.
     * 
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }


    /**
     * Gets the salutation value for this PersonalProfile.
     * 
     * @return salutation
     */
    public String getSalutation() {
        return salutation;
    }


    /**
     * Sets the salutation value for this PersonalProfile.
     * 
     * @param salutation
     */
    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }


    /**
     * Gets the serviceID value for this PersonalProfile.
     * 
     * @return serviceID
     */
    public String getServiceID() {
        return serviceID;
    }


    /**
     * Sets the serviceID value for this PersonalProfile.
     * 
     * @param serviceID
     */
    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }


    /**
     * Gets the socialSecurityNo value for this PersonalProfile.
     * 
     * @return socialSecurityNo
     */
    public String getSocialSecurityNo() {
        return socialSecurityNo;
    }


    /**
     * Sets the socialSecurityNo value for this PersonalProfile.
     * 
     * @param socialSecurityNo
     */
    public void setSocialSecurityNo(String socialSecurityNo) {
        this.socialSecurityNo = socialSecurityNo;
    }


    /**
     * Gets the surname value for this PersonalProfile.
     * 
     * @return surname
     */
    public String getSurname() {
        return surname;
    }


    /**
     * Sets the surname value for this PersonalProfile.
     * 
     * @param surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PersonalProfile)) return false;
        PersonalProfile other = (PersonalProfile) obj;
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
            ((this.dateOfDeath==null && other.getDateOfDeath()==null) || 
             (this.dateOfDeath!=null &&
              this.dateOfDeath.equals(other.getDateOfDeath()))) &&
            ((this.drivingLicenseNo==null && other.getDrivingLicenseNo()==null) || 
             (this.drivingLicenseNo!=null &&
              this.drivingLicenseNo.equals(other.getDrivingLicenseNo()))) &&
            ((this.fullName==null && other.getFullName()==null) || 
             (this.fullName!=null &&
              this.fullName.equals(other.getFullName()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.healthInsuranceNo==null && other.getHealthInsuranceNo()==null) || 
             (this.healthInsuranceNo!=null &&
              this.healthInsuranceNo.equals(other.getHealthInsuranceNo()))) &&
            ((this.maritalStatus==null && other.getMaritalStatus()==null) || 
             (this.maritalStatus!=null &&
              this.maritalStatus.equals(other.getMaritalStatus()))) &&
            ((this.nationalID==null && other.getNationalID()==null) || 
             (this.nationalID!=null &&
              this.nationalID.equals(other.getNationalID()))) &&
            ((this.nationality==null && other.getNationality()==null) || 
             (this.nationality!=null &&
              this.nationality.equals(other.getNationality()))) &&
            ((this.otherNames==null && other.getOtherNames()==null) || 
             (this.otherNames!=null &&
              this.otherNames.equals(other.getOtherNames()))) &&
            ((this.passportNo==null && other.getPassportNo()==null) || 
             (this.passportNo!=null &&
              this.passportNo.equals(other.getPassportNo()))) &&
            ((this.pin==null && other.getPin()==null) || 
             (this.pin!=null &&
              this.pin.equals(other.getPin()))) &&
            ((this.salutation==null && other.getSalutation()==null) || 
             (this.salutation!=null &&
              this.salutation.equals(other.getSalutation()))) &&
            ((this.serviceID==null && other.getServiceID()==null) || 
             (this.serviceID!=null &&
              this.serviceID.equals(other.getServiceID()))) &&
            ((this.socialSecurityNo==null && other.getSocialSecurityNo()==null) || 
             (this.socialSecurityNo!=null &&
              this.socialSecurityNo.equals(other.getSocialSecurityNo()))) &&
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
        if (getDateOfDeath() != null) {
            _hashCode += getDateOfDeath().hashCode();
        }
        if (getDrivingLicenseNo() != null) {
            _hashCode += getDrivingLicenseNo().hashCode();
        }
        if (getFullName() != null) {
            _hashCode += getFullName().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getHealthInsuranceNo() != null) {
            _hashCode += getHealthInsuranceNo().hashCode();
        }
        if (getMaritalStatus() != null) {
            _hashCode += getMaritalStatus().hashCode();
        }
        if (getNationalID() != null) {
            _hashCode += getNationalID().hashCode();
        }
        if (getNationality() != null) {
            _hashCode += getNationality().hashCode();
        }
        if (getOtherNames() != null) {
            _hashCode += getOtherNames().hashCode();
        }
        if (getPassportNo() != null) {
            _hashCode += getPassportNo().hashCode();
        }
        if (getPin() != null) {
            _hashCode += getPin().hashCode();
        }
        if (getSalutation() != null) {
            _hashCode += getSalutation().hashCode();
        }
        if (getServiceID() != null) {
            _hashCode += getServiceID().hashCode();
        }
        if (getSocialSecurityNo() != null) {
            _hashCode += getSocialSecurityNo().hashCode();
        }
        if (getSurname() != null) {
            _hashCode += getSurname().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersonalProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "personalProfile"));
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
        elemField.setFieldName("dateOfDeath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateOfDeath"));
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
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("healthInsuranceNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "healthInsuranceNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maritalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maritalStatus"));
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
        elemField.setFieldName("nationality");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nationality"));
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
        elemField.setFieldName("pin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pin"));
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
        elemField.setFieldName("socialSecurityNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "socialSecurityNo"));
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
