/**
 * PhysicalAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.ke.transunion.crbws.ws;

public class PhysicalAddress  implements java.io.Serializable {
    private String address;

    private String cell;

    private String constituency;

    private String country;

    private String county;

    private java.util.Calendar createDate;

    private String district;

    private Integer durationInMonths;

    private Integer durationInYears;

    private String plotNo;

    private String province;

    private String residenceType;

    private String sector;

    private String town;

    private String village;

    public PhysicalAddress() {
    }

    public PhysicalAddress(
           String address,
           String cell,
           String constituency,
           String country,
           String county,
           java.util.Calendar createDate,
           String district,
           Integer durationInMonths,
           Integer durationInYears,
           String plotNo,
           String province,
           String residenceType,
           String sector,
           String town,
           String village) {
           this.address = address;
           this.cell = cell;
           this.constituency = constituency;
           this.country = country;
           this.county = county;
           this.createDate = createDate;
           this.district = district;
           this.durationInMonths = durationInMonths;
           this.durationInYears = durationInYears;
           this.plotNo = plotNo;
           this.province = province;
           this.residenceType = residenceType;
           this.sector = sector;
           this.town = town;
           this.village = village;
    }


    /**
     * Gets the address value for this PhysicalAddress.
     * 
     * @return address
     */
    public String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this PhysicalAddress.
     * 
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }


    /**
     * Gets the cell value for this PhysicalAddress.
     * 
     * @return cell
     */
    public String getCell() {
        return cell;
    }


    /**
     * Sets the cell value for this PhysicalAddress.
     * 
     * @param cell
     */
    public void setCell(String cell) {
        this.cell = cell;
    }


    /**
     * Gets the constituency value for this PhysicalAddress.
     * 
     * @return constituency
     */
    public String getConstituency() {
        return constituency;
    }


    /**
     * Sets the constituency value for this PhysicalAddress.
     * 
     * @param constituency
     */
    public void setConstituency(String constituency) {
        this.constituency = constituency;
    }


    /**
     * Gets the country value for this PhysicalAddress.
     * 
     * @return country
     */
    public String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this PhysicalAddress.
     * 
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }


    /**
     * Gets the county value for this PhysicalAddress.
     * 
     * @return county
     */
    public String getCounty() {
        return county;
    }


    /**
     * Sets the county value for this PhysicalAddress.
     * 
     * @param county
     */
    public void setCounty(String county) {
        this.county = county;
    }


    /**
     * Gets the createDate value for this PhysicalAddress.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this PhysicalAddress.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the district value for this PhysicalAddress.
     * 
     * @return district
     */
    public String getDistrict() {
        return district;
    }


    /**
     * Sets the district value for this PhysicalAddress.
     * 
     * @param district
     */
    public void setDistrict(String district) {
        this.district = district;
    }


    /**
     * Gets the durationInMonths value for this PhysicalAddress.
     * 
     * @return durationInMonths
     */
    public Integer getDurationInMonths() {
        return durationInMonths;
    }


    /**
     * Sets the durationInMonths value for this PhysicalAddress.
     * 
     * @param durationInMonths
     */
    public void setDurationInMonths(Integer durationInMonths) {
        this.durationInMonths = durationInMonths;
    }


    /**
     * Gets the durationInYears value for this PhysicalAddress.
     * 
     * @return durationInYears
     */
    public Integer getDurationInYears() {
        return durationInYears;
    }


    /**
     * Sets the durationInYears value for this PhysicalAddress.
     * 
     * @param durationInYears
     */
    public void setDurationInYears(Integer durationInYears) {
        this.durationInYears = durationInYears;
    }


    /**
     * Gets the plotNo value for this PhysicalAddress.
     * 
     * @return plotNo
     */
    public String getPlotNo() {
        return plotNo;
    }


    /**
     * Sets the plotNo value for this PhysicalAddress.
     * 
     * @param plotNo
     */
    public void setPlotNo(String plotNo) {
        this.plotNo = plotNo;
    }


    /**
     * Gets the province value for this PhysicalAddress.
     * 
     * @return province
     */
    public String getProvince() {
        return province;
    }


    /**
     * Sets the province value for this PhysicalAddress.
     * 
     * @param province
     */
    public void setProvince(String province) {
        this.province = province;
    }


    /**
     * Gets the residenceType value for this PhysicalAddress.
     * 
     * @return residenceType
     */
    public String getResidenceType() {
        return residenceType;
    }


    /**
     * Sets the residenceType value for this PhysicalAddress.
     * 
     * @param residenceType
     */
    public void setResidenceType(String residenceType) {
        this.residenceType = residenceType;
    }


    /**
     * Gets the sector value for this PhysicalAddress.
     * 
     * @return sector
     */
    public String getSector() {
        return sector;
    }


    /**
     * Sets the sector value for this PhysicalAddress.
     * 
     * @param sector
     */
    public void setSector(String sector) {
        this.sector = sector;
    }


    /**
     * Gets the town value for this PhysicalAddress.
     * 
     * @return town
     */
    public String getTown() {
        return town;
    }


    /**
     * Sets the town value for this PhysicalAddress.
     * 
     * @param town
     */
    public void setTown(String town) {
        this.town = town;
    }


    /**
     * Gets the village value for this PhysicalAddress.
     * 
     * @return village
     */
    public String getVillage() {
        return village;
    }


    /**
     * Sets the village value for this PhysicalAddress.
     * 
     * @param village
     */
    public void setVillage(String village) {
        this.village = village;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PhysicalAddress)) return false;
        PhysicalAddress other = (PhysicalAddress) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.cell==null && other.getCell()==null) || 
             (this.cell!=null &&
              this.cell.equals(other.getCell()))) &&
            ((this.constituency==null && other.getConstituency()==null) || 
             (this.constituency!=null &&
              this.constituency.equals(other.getConstituency()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.county==null && other.getCounty()==null) || 
             (this.county!=null &&
              this.county.equals(other.getCounty()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.district==null && other.getDistrict()==null) || 
             (this.district!=null &&
              this.district.equals(other.getDistrict()))) &&
            ((this.durationInMonths==null && other.getDurationInMonths()==null) || 
             (this.durationInMonths!=null &&
              this.durationInMonths.equals(other.getDurationInMonths()))) &&
            ((this.durationInYears==null && other.getDurationInYears()==null) || 
             (this.durationInYears!=null &&
              this.durationInYears.equals(other.getDurationInYears()))) &&
            ((this.plotNo==null && other.getPlotNo()==null) || 
             (this.plotNo!=null &&
              this.plotNo.equals(other.getPlotNo()))) &&
            ((this.province==null && other.getProvince()==null) || 
             (this.province!=null &&
              this.province.equals(other.getProvince()))) &&
            ((this.residenceType==null && other.getResidenceType()==null) || 
             (this.residenceType!=null &&
              this.residenceType.equals(other.getResidenceType()))) &&
            ((this.sector==null && other.getSector()==null) || 
             (this.sector!=null &&
              this.sector.equals(other.getSector()))) &&
            ((this.town==null && other.getTown()==null) || 
             (this.town!=null &&
              this.town.equals(other.getTown()))) &&
            ((this.village==null && other.getVillage()==null) || 
             (this.village!=null &&
              this.village.equals(other.getVillage())));
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getCell() != null) {
            _hashCode += getCell().hashCode();
        }
        if (getConstituency() != null) {
            _hashCode += getConstituency().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getCounty() != null) {
            _hashCode += getCounty().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getDistrict() != null) {
            _hashCode += getDistrict().hashCode();
        }
        if (getDurationInMonths() != null) {
            _hashCode += getDurationInMonths().hashCode();
        }
        if (getDurationInYears() != null) {
            _hashCode += getDurationInYears().hashCode();
        }
        if (getPlotNo() != null) {
            _hashCode += getPlotNo().hashCode();
        }
        if (getProvince() != null) {
            _hashCode += getProvince().hashCode();
        }
        if (getResidenceType() != null) {
            _hashCode += getResidenceType().hashCode();
        }
        if (getSector() != null) {
            _hashCode += getSector().hashCode();
        }
        if (getTown() != null) {
            _hashCode += getTown().hashCode();
        }
        if (getVillage() != null) {
            _hashCode += getVillage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PhysicalAddress.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "physicalAddress"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cell");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cell"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("constituency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "constituency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("county");
        elemField.setXmlName(new javax.xml.namespace.QName("", "county"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("district");
        elemField.setXmlName(new javax.xml.namespace.QName("", "district"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("durationInMonths");
        elemField.setXmlName(new javax.xml.namespace.QName("", "durationInMonths"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("durationInYears");
        elemField.setXmlName(new javax.xml.namespace.QName("", "durationInYears"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plotNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "plotNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("province");
        elemField.setXmlName(new javax.xml.namespace.QName("", "province"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residenceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "residenceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sector");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("town");
        elemField.setXmlName(new javax.xml.namespace.QName("", "town"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("village");
        elemField.setXmlName(new javax.xml.namespace.QName("", "village"));
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
