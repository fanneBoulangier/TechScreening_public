package tasks;

// See readme.txt
public class Task {
	private TaskType type;
	private String description;
	private Period executionPeriod;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public TaskType getType() {
		return type;
	}

	public void setType(TaskType type) {
		this.type = type;
	}

	public Period getExecutionPeriod() {
		return executionPeriod;
	}

	public void setExecutionPeriod(Period executionPeriod) {
		this.executionPeriod = executionPeriod;
	}

	@Override
	public String toString() {
		return "Task [type=" + type + ", description=" + description
				+ ", executionPeriod=" + executionPeriod + "]";
	}
	
	

}
