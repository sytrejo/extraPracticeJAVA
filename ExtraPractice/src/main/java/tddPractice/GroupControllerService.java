package tddPractice;

import java.util.Map;

public interface GroupControllerService {
	
	public Map<String, Trainee> getAllTrainees();

	public void addTrainee(Trainee mockTrainee);

	public void removeTraineeByUsername(String string);

}
