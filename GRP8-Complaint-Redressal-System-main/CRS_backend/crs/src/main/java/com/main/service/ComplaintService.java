package com.main.service;

import java.util.List;

import com.main.model.Complaints;

public interface ComplaintService {
	List<Complaints> fetchAllComplaints();
	void saveComplaint (Complaints complaint);
	Complaints findComplaintByTicketId(int ticketId);
	void deleteComplaint(Complaints complaint);
	List<Complaints> findComplaintByCustomerEmail(String customerEmail);

}
