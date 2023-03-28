package com.parkit.parkingsystem.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class InputReaderUtilTest {
	
	@Mock
    private static InputReaderUtil inputReaderUtil;
	
	@Test
    public void readSelectionTest() {
		when(inputReaderUtil.readSelection()).thenReturn(1);		
		assertEquals(1, inputReaderUtil.readSelection());
    }
	
	@Test
    public void readVehicleRegistrationNumberTest() throws Exception{
		when(inputReaderUtil.readVehicleRegistrationNumber()).thenReturn("TESTOK");
		assertEquals("TESTOK", inputReaderUtil.readVehicleRegistrationNumber());
    }

}
