package tddPractice;

import static org.junit.Assert.assertEquals;


import org.junit.*;
import org.mockito.*;
import static org.mockito.Mockito.*;

import java.util.Map;


public class GroupControllerTest {
	
	private GroupController traineeGroupController;
	private Trainee mockTrainee;
	private DatabaseWriter mockWriter;
	private DatabaseReader mockReader;
	private Map<String, Trainee> mockMap;
	
	@Before
	public void setup() {
		mockWriter = mock(DatabaseWriter.class);
		mockReader = mock(DatabaseReader.class);
		mockMap = mock(Map.class);
		when(mockReader.readGroup()).thenReturn(mockMap);
		traineeGroupController = new GroupController(mockWriter, mockReader);
		mockTrainee = mock(Trainee.class);	
	}
	
	@Test
	public void test_GetAllTraineesMethod_CallsReadGroupMethodOfInjectedDatabaseReader_WhenCalled() {
		Map<String, Trainee> allTrainees = traineeGroupController.getAllTrainees();
		assertEquals(mockMap, allTrainees);
	}
	
	

	
	

}
