/**
 * Summary101.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.ke.transunion.crbws.ws;

public class Summary101  implements java.io.Serializable {
    private co.ke.transunion.crbws.ws.CountSector bouncedCheques;

    private co.ke.transunion.crbws.ws.CountSector closedAccounts;

    private co.ke.transunion.crbws.ws.CountSector creditHistory;

    private co.ke.transunion.crbws.ws.CountSector enquiries31To60Days;

    private co.ke.transunion.crbws.ws.CountSector enquiries61To90Days;

    private co.ke.transunion.crbws.ws.CountSector enquiries91Days;

    private co.ke.transunion.crbws.ws.CountSector enquiriesLast30Days;

    private DateSector lastBouncedChequeDate;

    private DateSector lastNPAListingDate;

    private DateSector lastPAListingDate;

    private Integer negativeScore;

    private co.ke.transunion.crbws.ws.CountSector npaAccounts;

    private co.ke.transunion.crbws.ws.MoneySector[] npaTotalValueList;

    private co.ke.transunion.crbws.ws.CountSector openAccounts;

    private co.ke.transunion.crbws.ws.CountSector paAccounts;

    private co.ke.transunion.crbws.ws.CountSector paClosedAccounts;

    private co.ke.transunion.crbws.ws.CountSector paOpenAccounts;

    private co.ke.transunion.crbws.ws.MoneySector[] paTotalValueList;

    private Integer positiveScore;

    public Summary101() {
    }

    public Summary101(
           co.ke.transunion.crbws.ws.CountSector bouncedCheques,
           co.ke.transunion.crbws.ws.CountSector closedAccounts,
           co.ke.transunion.crbws.ws.CountSector creditHistory,
           co.ke.transunion.crbws.ws.CountSector enquiries31To60Days,
           co.ke.transunion.crbws.ws.CountSector enquiries61To90Days,
           co.ke.transunion.crbws.ws.CountSector enquiries91Days,
           co.ke.transunion.crbws.ws.CountSector enquiriesLast30Days,
           DateSector lastBouncedChequeDate,
           DateSector lastNPAListingDate,
           DateSector lastPAListingDate,
           Integer negativeScore,
           co.ke.transunion.crbws.ws.CountSector npaAccounts,
           co.ke.transunion.crbws.ws.MoneySector[] npaTotalValueList,
           co.ke.transunion.crbws.ws.CountSector openAccounts,
           co.ke.transunion.crbws.ws.CountSector paAccounts,
           co.ke.transunion.crbws.ws.CountSector paClosedAccounts,
           co.ke.transunion.crbws.ws.CountSector paOpenAccounts,
           co.ke.transunion.crbws.ws.MoneySector[] paTotalValueList,
           Integer positiveScore) {
           this.bouncedCheques = bouncedCheques;
           this.closedAccounts = closedAccounts;
           this.creditHistory = creditHistory;
           this.enquiries31To60Days = enquiries31To60Days;
           this.enquiries61To90Days = enquiries61To90Days;
           this.enquiries91Days = enquiries91Days;
           this.enquiriesLast30Days = enquiriesLast30Days;
           this.lastBouncedChequeDate = lastBouncedChequeDate;
           this.lastNPAListingDate = lastNPAListingDate;
           this.lastPAListingDate = lastPAListingDate;
           this.negativeScore = negativeScore;
           this.npaAccounts = npaAccounts;
           this.npaTotalValueList = npaTotalValueList;
           this.openAccounts = openAccounts;
           this.paAccounts = paAccounts;
           this.paClosedAccounts = paClosedAccounts;
           this.paOpenAccounts = paOpenAccounts;
           this.paTotalValueList = paTotalValueList;
           this.positiveScore = positiveScore;
    }


    /**
     * Gets the bouncedCheques value for this Summary101.
     * 
     * @return bouncedCheques
     */
    public co.ke.transunion.crbws.ws.CountSector getBouncedCheques() {
        return bouncedCheques;
    }


    /**
     * Sets the bouncedCheques value for this Summary101.
     * 
     * @param bouncedCheques
     */
    public void setBouncedCheques(co.ke.transunion.crbws.ws.CountSector bouncedCheques) {
        this.bouncedCheques = bouncedCheques;
    }


    /**
     * Gets the closedAccounts value for this Summary101.
     * 
     * @return closedAccounts
     */
    public co.ke.transunion.crbws.ws.CountSector getClosedAccounts() {
        return closedAccounts;
    }


    /**
     * Sets the closedAccounts value for this Summary101.
     * 
     * @param closedAccounts
     */
    public void setClosedAccounts(co.ke.transunion.crbws.ws.CountSector closedAccounts) {
        this.closedAccounts = closedAccounts;
    }


    /**
     * Gets the creditHistory value for this Summary101.
     * 
     * @return creditHistory
     */
    public co.ke.transunion.crbws.ws.CountSector getCreditHistory() {
        return creditHistory;
    }


    /**
     * Sets the creditHistory value for this Summary101.
     * 
     * @param creditHistory
     */
    public void setCreditHistory(co.ke.transunion.crbws.ws.CountSector creditHistory) {
        this.creditHistory = creditHistory;
    }


    /**
     * Gets the enquiries31To60Days value for this Summary101.
     * 
     * @return enquiries31To60Days
     */
    public co.ke.transunion.crbws.ws.CountSector getEnquiries31To60Days() {
        return enquiries31To60Days;
    }


    /**
     * Sets the enquiries31To60Days value for this Summary101.
     * 
     * @param enquiries31To60Days
     */
    public void setEnquiries31To60Days(co.ke.transunion.crbws.ws.CountSector enquiries31To60Days) {
        this.enquiries31To60Days = enquiries31To60Days;
    }


    /**
     * Gets the enquiries61To90Days value for this Summary101.
     * 
     * @return enquiries61To90Days
     */
    public co.ke.transunion.crbws.ws.CountSector getEnquiries61To90Days() {
        return enquiries61To90Days;
    }


    /**
     * Sets the enquiries61To90Days value for this Summary101.
     * 
     * @param enquiries61To90Days
     */
    public void setEnquiries61To90Days(co.ke.transunion.crbws.ws.CountSector enquiries61To90Days) {
        this.enquiries61To90Days = enquiries61To90Days;
    }


    /**
     * Gets the enquiries91Days value for this Summary101.
     * 
     * @return enquiries91Days
     */
    public co.ke.transunion.crbws.ws.CountSector getEnquiries91Days() {
        return enquiries91Days;
    }


    /**
     * Sets the enquiries91Days value for this Summary101.
     * 
     * @param enquiries91Days
     */
    public void setEnquiries91Days(co.ke.transunion.crbws.ws.CountSector enquiries91Days) {
        this.enquiries91Days = enquiries91Days;
    }


    /**
     * Gets the enquiriesLast30Days value for this Summary101.
     * 
     * @return enquiriesLast30Days
     */
    public co.ke.transunion.crbws.ws.CountSector getEnquiriesLast30Days() {
        return enquiriesLast30Days;
    }


    /**
     * Sets the enquiriesLast30Days value for this Summary101.
     * 
     * @param enquiriesLast30Days
     */
    public void setEnquiriesLast30Days(co.ke.transunion.crbws.ws.CountSector enquiriesLast30Days) {
        this.enquiriesLast30Days = enquiriesLast30Days;
    }


    /**
     * Gets the lastBouncedChequeDate value for this Summary101.
     * 
     * @return lastBouncedChequeDate
     */
    public DateSector getLastBouncedChequeDate() {
        return lastBouncedChequeDate;
    }


    /**
     * Sets the lastBouncedChequeDate value for this Summary101.
     * 
     * @param lastBouncedChequeDate
     */
    public void setLastBouncedChequeDate(DateSector lastBouncedChequeDate) {
        this.lastBouncedChequeDate = lastBouncedChequeDate;
    }


    /**
     * Gets the lastNPAListingDate value for this Summary101.
     * 
     * @return lastNPAListingDate
     */
    public DateSector getLastNPAListingDate() {
        return lastNPAListingDate;
    }


    /**
     * Sets the lastNPAListingDate value for this Summary101.
     * 
     * @param lastNPAListingDate
     */
    public void setLastNPAListingDate(DateSector lastNPAListingDate) {
        this.lastNPAListingDate = lastNPAListingDate;
    }


    /**
     * Gets the lastPAListingDate value for this Summary101.
     * 
     * @return lastPAListingDate
     */
    public DateSector getLastPAListingDate() {
        return lastPAListingDate;
    }


    /**
     * Sets the lastPAListingDate value for this Summary101.
     * 
     * @param lastPAListingDate
     */
    public void setLastPAListingDate(DateSector lastPAListingDate) {
        this.lastPAListingDate = lastPAListingDate;
    }


    /**
     * Gets the negativeScore value for this Summary101.
     * 
     * @return negativeScore
     */
    public Integer getNegativeScore() {
        return negativeScore;
    }


    /**
     * Sets the negativeScore value for this Summary101.
     * 
     * @param negativeScore
     */
    public void setNegativeScore(Integer negativeScore) {
        this.negativeScore = negativeScore;
    }


    /**
     * Gets the npaAccounts value for this Summary101.
     * 
     * @return npaAccounts
     */
    public co.ke.transunion.crbws.ws.CountSector getNpaAccounts() {
        return npaAccounts;
    }


    /**
     * Sets the npaAccounts value for this Summary101.
     * 
     * @param npaAccounts
     */
    public void setNpaAccounts(co.ke.transunion.crbws.ws.CountSector npaAccounts) {
        this.npaAccounts = npaAccounts;
    }


    /**
     * Gets the npaTotalValueList value for this Summary101.
     * 
     * @return npaTotalValueList
     */
    public co.ke.transunion.crbws.ws.MoneySector[] getNpaTotalValueList() {
        return npaTotalValueList;
    }


    /**
     * Sets the npaTotalValueList value for this Summary101.
     * 
     * @param npaTotalValueList
     */
    public void setNpaTotalValueList(co.ke.transunion.crbws.ws.MoneySector[] npaTotalValueList) {
        this.npaTotalValueList = npaTotalValueList;
    }

    public co.ke.transunion.crbws.ws.MoneySector getNpaTotalValueList(int i) {
        return this.npaTotalValueList[i];
    }

    public void setNpaTotalValueList(int i, co.ke.transunion.crbws.ws.MoneySector _value) {
        this.npaTotalValueList[i] = _value;
    }


    /**
     * Gets the openAccounts value for this Summary101.
     * 
     * @return openAccounts
     */
    public co.ke.transunion.crbws.ws.CountSector getOpenAccounts() {
        return openAccounts;
    }


    /**
     * Sets the openAccounts value for this Summary101.
     * 
     * @param openAccounts
     */
    public void setOpenAccounts(co.ke.transunion.crbws.ws.CountSector openAccounts) {
        this.openAccounts = openAccounts;
    }


    /**
     * Gets the paAccounts value for this Summary101.
     * 
     * @return paAccounts
     */
    public co.ke.transunion.crbws.ws.CountSector getPaAccounts() {
        return paAccounts;
    }


    /**
     * Sets the paAccounts value for this Summary101.
     * 
     * @param paAccounts
     */
    public void setPaAccounts(co.ke.transunion.crbws.ws.CountSector paAccounts) {
        this.paAccounts = paAccounts;
    }


    /**
     * Gets the paClosedAccounts value for this Summary101.
     * 
     * @return paClosedAccounts
     */
    public co.ke.transunion.crbws.ws.CountSector getPaClosedAccounts() {
        return paClosedAccounts;
    }


    /**
     * Sets the paClosedAccounts value for this Summary101.
     * 
     * @param paClosedAccounts
     */
    public void setPaClosedAccounts(co.ke.transunion.crbws.ws.CountSector paClosedAccounts) {
        this.paClosedAccounts = paClosedAccounts;
    }


    /**
     * Gets the paOpenAccounts value for this Summary101.
     * 
     * @return paOpenAccounts
     */
    public co.ke.transunion.crbws.ws.CountSector getPaOpenAccounts() {
        return paOpenAccounts;
    }


    /**
     * Sets the paOpenAccounts value for this Summary101.
     * 
     * @param paOpenAccounts
     */
    public void setPaOpenAccounts(co.ke.transunion.crbws.ws.CountSector paOpenAccounts) {
        this.paOpenAccounts = paOpenAccounts;
    }


    /**
     * Gets the paTotalValueList value for this Summary101.
     * 
     * @return paTotalValueList
     */
    public co.ke.transunion.crbws.ws.MoneySector[] getPaTotalValueList() {
        return paTotalValueList;
    }


    /**
     * Sets the paTotalValueList value for this Summary101.
     * 
     * @param paTotalValueList
     */
    public void setPaTotalValueList(co.ke.transunion.crbws.ws.MoneySector[] paTotalValueList) {
        this.paTotalValueList = paTotalValueList;
    }

    public co.ke.transunion.crbws.ws.MoneySector getPaTotalValueList(int i) {
        return this.paTotalValueList[i];
    }

    public void setPaTotalValueList(int i, co.ke.transunion.crbws.ws.MoneySector _value) {
        this.paTotalValueList[i] = _value;
    }


    /**
     * Gets the positiveScore value for this Summary101.
     * 
     * @return positiveScore
     */
    public Integer getPositiveScore() {
        return positiveScore;
    }


    /**
     * Sets the positiveScore value for this Summary101.
     * 
     * @param positiveScore
     */
    public void setPositiveScore(Integer positiveScore) {
        this.positiveScore = positiveScore;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Summary101)) return false;
        Summary101 other = (Summary101) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bouncedCheques==null && other.getBouncedCheques()==null) || 
             (this.bouncedCheques!=null &&
              this.bouncedCheques.equals(other.getBouncedCheques()))) &&
            ((this.closedAccounts==null && other.getClosedAccounts()==null) || 
             (this.closedAccounts!=null &&
              this.closedAccounts.equals(other.getClosedAccounts()))) &&
            ((this.creditHistory==null && other.getCreditHistory()==null) || 
             (this.creditHistory!=null &&
              this.creditHistory.equals(other.getCreditHistory()))) &&
            ((this.enquiries31To60Days==null && other.getEnquiries31To60Days()==null) || 
             (this.enquiries31To60Days!=null &&
              this.enquiries31To60Days.equals(other.getEnquiries31To60Days()))) &&
            ((this.enquiries61To90Days==null && other.getEnquiries61To90Days()==null) || 
             (this.enquiries61To90Days!=null &&
              this.enquiries61To90Days.equals(other.getEnquiries61To90Days()))) &&
            ((this.enquiries91Days==null && other.getEnquiries91Days()==null) || 
             (this.enquiries91Days!=null &&
              this.enquiries91Days.equals(other.getEnquiries91Days()))) &&
            ((this.enquiriesLast30Days==null && other.getEnquiriesLast30Days()==null) || 
             (this.enquiriesLast30Days!=null &&
              this.enquiriesLast30Days.equals(other.getEnquiriesLast30Days()))) &&
            ((this.lastBouncedChequeDate==null && other.getLastBouncedChequeDate()==null) || 
             (this.lastBouncedChequeDate!=null &&
              this.lastBouncedChequeDate.equals(other.getLastBouncedChequeDate()))) &&
            ((this.lastNPAListingDate==null && other.getLastNPAListingDate()==null) || 
             (this.lastNPAListingDate!=null &&
              this.lastNPAListingDate.equals(other.getLastNPAListingDate()))) &&
            ((this.lastPAListingDate==null && other.getLastPAListingDate()==null) || 
             (this.lastPAListingDate!=null &&
              this.lastPAListingDate.equals(other.getLastPAListingDate()))) &&
            ((this.negativeScore==null && other.getNegativeScore()==null) || 
             (this.negativeScore!=null &&
              this.negativeScore.equals(other.getNegativeScore()))) &&
            ((this.npaAccounts==null && other.getNpaAccounts()==null) || 
             (this.npaAccounts!=null &&
              this.npaAccounts.equals(other.getNpaAccounts()))) &&
            ((this.npaTotalValueList==null && other.getNpaTotalValueList()==null) || 
             (this.npaTotalValueList!=null &&
              java.util.Arrays.equals(this.npaTotalValueList, other.getNpaTotalValueList()))) &&
            ((this.openAccounts==null && other.getOpenAccounts()==null) || 
             (this.openAccounts!=null &&
              this.openAccounts.equals(other.getOpenAccounts()))) &&
            ((this.paAccounts==null && other.getPaAccounts()==null) || 
             (this.paAccounts!=null &&
              this.paAccounts.equals(other.getPaAccounts()))) &&
            ((this.paClosedAccounts==null && other.getPaClosedAccounts()==null) || 
             (this.paClosedAccounts!=null &&
              this.paClosedAccounts.equals(other.getPaClosedAccounts()))) &&
            ((this.paOpenAccounts==null && other.getPaOpenAccounts()==null) || 
             (this.paOpenAccounts!=null &&
              this.paOpenAccounts.equals(other.getPaOpenAccounts()))) &&
            ((this.paTotalValueList==null && other.getPaTotalValueList()==null) || 
             (this.paTotalValueList!=null &&
              java.util.Arrays.equals(this.paTotalValueList, other.getPaTotalValueList()))) &&
            ((this.positiveScore==null && other.getPositiveScore()==null) || 
             (this.positiveScore!=null &&
              this.positiveScore.equals(other.getPositiveScore())));
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
        if (getBouncedCheques() != null) {
            _hashCode += getBouncedCheques().hashCode();
        }
        if (getClosedAccounts() != null) {
            _hashCode += getClosedAccounts().hashCode();
        }
        if (getCreditHistory() != null) {
            _hashCode += getCreditHistory().hashCode();
        }
        if (getEnquiries31To60Days() != null) {
            _hashCode += getEnquiries31To60Days().hashCode();
        }
        if (getEnquiries61To90Days() != null) {
            _hashCode += getEnquiries61To90Days().hashCode();
        }
        if (getEnquiries91Days() != null) {
            _hashCode += getEnquiries91Days().hashCode();
        }
        if (getEnquiriesLast30Days() != null) {
            _hashCode += getEnquiriesLast30Days().hashCode();
        }
        if (getLastBouncedChequeDate() != null) {
            _hashCode += getLastBouncedChequeDate().hashCode();
        }
        if (getLastNPAListingDate() != null) {
            _hashCode += getLastNPAListingDate().hashCode();
        }
        if (getLastPAListingDate() != null) {
            _hashCode += getLastPAListingDate().hashCode();
        }
        if (getNegativeScore() != null) {
            _hashCode += getNegativeScore().hashCode();
        }
        if (getNpaAccounts() != null) {
            _hashCode += getNpaAccounts().hashCode();
        }
        if (getNpaTotalValueList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNpaTotalValueList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getNpaTotalValueList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOpenAccounts() != null) {
            _hashCode += getOpenAccounts().hashCode();
        }
        if (getPaAccounts() != null) {
            _hashCode += getPaAccounts().hashCode();
        }
        if (getPaClosedAccounts() != null) {
            _hashCode += getPaClosedAccounts().hashCode();
        }
        if (getPaOpenAccounts() != null) {
            _hashCode += getPaOpenAccounts().hashCode();
        }
        if (getPaTotalValueList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaTotalValueList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPaTotalValueList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPositiveScore() != null) {
            _hashCode += getPositiveScore().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Summary101.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "summary101"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bouncedCheques");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bouncedCheques"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closedAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "closedAccounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditHistory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditHistory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enquiries31To60Days");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enquiries31to60Days"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enquiries61To90Days");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enquiries61to90Days"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enquiries91Days");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enquiries91Days"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enquiriesLast30Days");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enquiriesLast30Days"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastBouncedChequeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastBouncedChequeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "dateSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastNPAListingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastNPAListingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "dateSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPAListingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastPAListingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "dateSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("negativeScore");
        elemField.setXmlName(new javax.xml.namespace.QName("", "negativeScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("npaAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "npaAccounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("npaTotalValueList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "npaTotalValueList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "moneySector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "openAccounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paAccounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paClosedAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paClosedAccounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paOpenAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paOpenAccounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "countSector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paTotalValueList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paTotalValueList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.crbws.transunion.ke.co/", "moneySector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("positiveScore");
        elemField.setXmlName(new javax.xml.namespace.QName("", "positiveScore"));
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
