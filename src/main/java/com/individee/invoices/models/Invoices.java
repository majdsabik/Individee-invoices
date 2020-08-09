package com.individee.invoices.models;

import org.bson.types.Binary;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

public class Invoices {
    @Id
    private ObjectId _id;
    private String primaryType;
    private Date date;
    @Field("new")
    private boolean isNew;
    private int amount;
    private Date endDate;
    private int vat;
    private String ipAddress;
    private int signUpOrigin;
    private Binary file;
    private boolean paid;
    private int invoiceNumber;
    private String currency;
    private String[] items;
    private Date startDate;

    public Invoices() {}

    public Invoices(ObjectId _id, String primaryType, Date date, boolean isNew, int amount, Date endDate, int vat, String ipAddress, int signUpOrigin, Binary file, boolean paid, int invoiceNumber, String currency, String[] items, Date startDate) {
        this._id = _id;
        this.primaryType = primaryType;
        this.date = date;
        this.isNew = isNew;
        this.amount = amount;
        this.endDate = endDate;
        this.vat = vat;
        this.ipAddress = ipAddress;
        this.signUpOrigin = signUpOrigin;
        this.file = file;
        this.paid = paid;
        this.invoiceNumber = invoiceNumber;
        this.currency = currency;
        this.items = items;
        this.startDate = startDate;
    }

    public String get_id() { return _id.toHexString(); }
    public void set_id(ObjectId _id) { this._id = _id; }

    public String getPrimaryType() { return primaryType; }
    public void setPrimaryType(String primaryType) { this.primaryType = primaryType; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public int getAmount() { return amount; }
    public void setAmount(int amount) { this.amount = amount; }

    public byte[] getFile() { return file.getData(); }
    public void setFile(Binary file) { this.file = file; }

    public boolean isNew() { return isNew; }
    public void setNew(boolean aNew) { isNew = aNew; }

    public Date getEndDate() { return endDate; }
    public void setEndDate(Date endDate) { this.endDate = endDate; }

    public int getVat() { return vat; }
    public void setVat(int vat) { this.vat = vat; }

    public String getIpAddress() { return ipAddress; }
    public void setIpAddress(String ipAddress) { this.ipAddress = ipAddress; }

    public int getSignUpOrigin() { return signUpOrigin; }
    public void setSignUpOrigin(int signUpOrigin) { this.signUpOrigin = signUpOrigin; }

    public boolean isPaid() { return paid; }
    public void setPaid(boolean paid) { this.paid = paid; }

    public int getInvoiceNumber() { return invoiceNumber; }
    public void setInvoiceNumber(int invoiceNumber) { this.invoiceNumber = invoiceNumber; }

    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }

    public String[] getItems() { return items; }
    public void setItems(String[] items) { this.items = items; }

    public Date getStartDate() { return startDate; }
    public void setStartDate(Date startDate) { this.startDate = startDate; }
}
