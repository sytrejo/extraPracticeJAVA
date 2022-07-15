package tddPractice;

import java.util.Map;

public class GroupController implements GroupControllerService{
	
	DatabaseReader databaseReader;
	DatabaseWriter databaseWriter;
	
	
	public GroupController(DatabaseWriter mockWriter, DatabaseReader mockReader) {
		databaseReader = mockReader;
		databaseWriter = mockWriter;
	}

	public Map<String, Trainee> getAllTrainees() {
		return databaseReader.readGroup();
	}

	public void addTrainee(Trainee mockTrainee) {
		databaseWriter.addTrainee(mockTrainee);
	}

	public void removeTraineeByUsername(String string) {
		databaseWriter.deleteTraineeByUsername(string);
	}


}
