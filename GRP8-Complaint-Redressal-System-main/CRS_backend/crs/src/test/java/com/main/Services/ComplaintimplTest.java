package com.main.Services;


import static org.junit.jupiter.api.Assertions.assertNotNull;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;

import com.main.model.Complaints;
import com.main.repository.ComplaintRepository;


@SpringBootTest
public class ComplaintimplTest {

	@Autowired
	private ComplaintRepository ComplaintRepo;


	@Test
	public void returnUserFromName() {
		Complaints testComplaint = new Complaints();
		testComplaint.setTicketId(101);
		testComplaint.setStatus("Raised");
		testComplaint.setPincode("474011");
		testComplaint.setCustomerEmail("max12@example.com");
		testComplaint.setComplaint("Broadband Services Not Working Properly");
		
		ComplaintRepo.save(testComplaint);
		assertNotNull(ComplaintRepo.findById(1));
	}

}
