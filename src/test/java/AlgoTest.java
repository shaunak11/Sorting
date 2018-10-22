package test.java;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import main.java.SortAlgos;
import main.java.SortDemoData;

public class AlgoTest {
	SortDemoData data = new SortDemoData();
	
	/*
	 * Node and condition coverage
	 */
	@Test
	public void testStraight() {
		for(int i=0; i< 6; i++) {
			data.initializeArray("23 1 55 8 52 3 67 2 30");
			data.runAlgo(i);
			SortDemoData data2 = new SortDemoData();
		}
	}
	
	/*
	 * Edge coverage and node coverage
	 */
	@Test
	public void testConditions() {
		for(int i=0; i< 6; i++) {
			data.initializeArray("44 30 24 22 13 11 6 4 2 0");
			data.runAlgo(i);
		}
	}
	
	/*
	 * Condition coverage
	 */
	@Test
	public void testHalves() {
		for(int i=0; i< 6; i++) {
			data.initializeArray("44 30 24 22 17 42 37 16 10 5 2");
			data.runAlgo(i);
		}
	}

}
