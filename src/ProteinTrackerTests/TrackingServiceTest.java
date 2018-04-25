package ProteinTrackerTests;

import org.junit.jupiter.api.Test;

import com.simpleprogrammer.proteintracker.TrackingService;
import static org.junit.Assert.*;

public class TrackingServiceTest {

	@Test
	public void TotalZero()
	{
		TrackingService service = new TrackingService();
		assertEquals("Tracking service total was not zero", 0, service.getTotal());	
	}
	
}
