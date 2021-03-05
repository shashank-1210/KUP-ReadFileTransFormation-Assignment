package ReadFIleAssignment;

import static org.junit.Assert.*;


import java.util.Map;

import org.junit.Test;



public class FileTransformationTest {
	
	
	FileTransformation f= new FileTransformation();
	Map<String,Integer> k=	f.fileTransform();
	
	@Test
	public void test1() {
    assert(k.containsKey("Shashank"));
	}
	
	
	@Test
	public void test2() {
  
		assertEquals(k.get("Shashank"),Integer.valueOf(3));

	}
	
	@Test
	public void test3() {
  
		assert(!k.isEmpty());
	}

}
