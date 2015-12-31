package tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//See readme.txt
public class Tasks {
	
	private Set<Task> tasks = new HashSet<Task>();

	public Set<Task> getTasks(){
		return this.tasks;
	}

	public Set<Task> giveTasksStartedBeforeOfType(TaskType taskType, Date executionStartDate) {
		Set<Task> result = new HashSet<Task>();
		for (Task task : tasks) {
			if (task.getType().equals(taskType)) {
				if (task.getExecutionPeriod() != null) {
					if (task.getExecutionPeriod().getStart().before(executionStartDate)) {
						result.add(task);
					}
				}
			}
		}
		return result;
	}

	public List<Task> giveExecutedTasksSortedByExecutionPeriodOfType(TaskType taskType) {
		List<Task> result = new ArrayList<Task>();
		for(Task task : tasks) {
			if (task.getType().equals(taskType)) {
				if (task.getExecutionPeriod() != null && task.getExecutionPeriod().getEnd() != null) {
					result.add(task);
				}
			}
		}
		Collections.sort(result, new Comparator<Task>() {

			@Override
			public int compare(Task task1, Task task2) {
				return new Long(task1.getExecutionPeriod().getEnd().getTime()
						- task1.getExecutionPeriod().getStart().getTime())
						.compareTo(task2.getExecutionPeriod().getEnd().getTime()
								- task2.getExecutionPeriod().getStart().getTime());
			}
		});
		return result;
	}

	public Set<Task> getTasksInExecutionOfType(TaskType taskType) {
		Set<Task> result = new HashSet<Task>();
		for(Task task : tasks) {
			if (taskType.equals(task.getType())) {
				if (task.getExecutionPeriod() != null) {
					result.add(task);
				}
			}
		}
		return result;
	}

}
