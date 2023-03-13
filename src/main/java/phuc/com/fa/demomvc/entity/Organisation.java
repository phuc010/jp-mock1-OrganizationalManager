package phuc.com.fa.demomvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/* class Organization declare the required information of an organization */
@Entity
public class Organisation {	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long stt;
    @Column(columnDefinition = "nvarchar(255)")
    private String organisationName;
    @Column(columnDefinition = "nvarchar(255)")
    private String orShortDecription;
    @Column(columnDefinition = "nvarchar(255)")
    private String contact;
    @Column(columnDefinition = "nvarchar(255)")
    private String addressLine1;
    @Column(columnDefinition = "nvarchar(255)")
    private String postCode;
    @Column(columnDefinition = "nvarchar(255)")
    private String typeOfBusiness;
    @Column(columnDefinition = "nvarchar(255)")
    private String phone;
    @Column(columnDefinition = "nvarchar(255)")
    private String active;

    //constructor
    public Organisation() {
        super();
    }    
    public Organisation(long stt, String organisationName, String orShortDecription, String contact, String addressLine1,
			String postCode, String typeOfBusiness, String phone, String active) {
		super();
		this.stt = stt;
		this.organisationName = organisationName;
		this.orShortDecription = orShortDecription;
		this.contact = contact;
		this.addressLine1 = addressLine1;
		this.postCode = postCode;
		this.typeOfBusiness = typeOfBusiness;
		this.phone = phone;
		this.active = "No";
	}

	// getter and setter
    
    public String getOrganisationName() {
        return organisationName;
    }

	public long getStt() {
		return stt;
	}
	public void setStt(long stt) {
		this.stt = stt;
	}
	public void setOrganisationName(String organisationName) {
        this.organisationName = organisationName;
    }

    public String getOrShortDecription() {
        return orShortDecription;
    }

    public void setOrShortDecription(String orShortDecription) {
        this.orShortDecription = orShortDecription;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getTypeOfBusiness() {
        return typeOfBusiness;
    }

    public void setTypeOfBusiness(String typeOfBusiness) {
        this.typeOfBusiness = typeOfBusiness;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }
	@Override
	public String toString() {
		return "Organisation [stt=" + stt + ", organisationName=" + organisationName + ", orShortDecription="
				+ orShortDecription + ", contact=" + contact + ", addressLine1=" + addressLine1 + ", postCode="
				+ postCode + ", typeOfBusiness=" + typeOfBusiness + ", phone=" + phone + ", active=" + active + "]";
	}
}
