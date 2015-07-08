package V2;

import static org.junit.Assert.*;

import org.junit.Test;

public class BuildingTest {
	
	Building Orchids=new Building();

	@Test
	public void testRequestLift() {

		int []from={3,5,2,3,0,3};
		int []to={5,0,5,0,4,2};

		for(int i=0;i<6;i++)
			assertEquals(to[i],Orchids.requestLift(from[i], to[i]) );
		
	}

}

