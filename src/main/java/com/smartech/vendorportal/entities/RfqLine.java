package com.smartech.vendorportal.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "rfq_line")
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "id")
public class RfqLine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String rfqlinenum;
	private String itemnum;
	private String description;
	private double orderqty;
	private String orderunit;
	private double unitcost;
	private double linecost;
	private double quotationqty;
	@Temporal(TemporalType.DATE)
	private Date quoteStartDate;
	@Temporal(TemporalType.DATE)
	private Date quoteEndDate;
	@Temporal(TemporalType.DATE)
	private Date delivryDate;
	
	@ManyToOne
	@JoinColumn(name = "rfq_id")
	private Rfq rfq;
	
	
	public RfqLine(Long id, String rfqlinenum, String itemnum, String description, double orderqty, String orderunit,
			double unitcost, double linecost, double quotationqty, Date quoteStartDate, Date quoteEndDate,
			Date delivryDate, Rfq rfq) {
		super();
		this.id = id;
		this.rfqlinenum = rfqlinenum;
		this.itemnum = itemnum;
		this.description = description;
		this.orderqty = orderqty;
		this.orderunit = orderunit;
		this.unitcost = unitcost;
		this.linecost = linecost;
		this.quotationqty = quotationqty;
		this.quoteStartDate = quoteStartDate;
		this.quoteEndDate = quoteEndDate;
		this.delivryDate = delivryDate;
		this.rfq = rfq;
	}
	public RfqLine() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRfqlinenum() {
		return rfqlinenum;
	}
	public void setRfqlinenum(String rfqlinenum) {
		this.rfqlinenum = rfqlinenum;
	}
	public String getItemnum() {
		return itemnum;
	}
	public void setItemnum(String itemnum) {
		this.itemnum = itemnum;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getOrderqty() {
		return orderqty;
	}
	public void setOrderqty(double orderqty) {
		this.orderqty = orderqty;
	}
	public String getOrderunit() {
		return orderunit;
	}
	public void setOrderunit(String orderunit) {
		this.orderunit = orderunit;
	}
	public double getUnitcost() {
		return unitcost;
	}
	public void setUnitcost(double unitcost) {
		this.unitcost = unitcost;
	}
	public double getLinecost() {
		return linecost;
	}
	public void setLinecost(double linecost) {
		this.linecost = linecost;
	}
	public double getQuotationqty() {
		return quotationqty;
	}
	public void setQuotationqty(double quotationqty) {
		this.quotationqty = quotationqty;
	}
	public Date getQuoteStartDate() {
		return quoteStartDate;
	}
	public void setQuoteStartDate(Date quoteStartDate) {
		this.quoteStartDate = quoteStartDate;
	}
	public Date getQuoteEndDate() {
		return quoteEndDate;
	}
	public void setQuoteEndDate(Date quoteEndDate) {
		this.quoteEndDate = quoteEndDate;
	}
	public Date getDelivryDate() {
		return delivryDate;
	}
	public void setDelivryDate(Date delivryDate) {
		this.delivryDate = delivryDate;
	}
	public Rfq getRfq() {
		return rfq;
	}
	public void setRfq(Rfq rfq) {
		this.rfq = rfq;
	}
	
	

}
