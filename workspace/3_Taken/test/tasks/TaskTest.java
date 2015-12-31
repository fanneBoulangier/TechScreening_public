package tasks;

import static java.util.Collections.singleton;
import static java.util.Collections.singletonList;
import static junit.framework.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

//See readme.txt
public class TaskTest {

	@Test
	public void giveTasksStartedBeforeOfType_onlyReturnsTasksBeforeDate() {
		Tasks tasks = new Tasks();
		Task taskStartedTheDayBeforeYesterday = new Task();
		taskStartedTheDayBeforeYesterday.setType(TaskType.FEED_DOG);
		taskStartedTheDayBeforeYesterday
				.setDescription("voeder de honden, vergeet het water niet");
		taskStartedTheDayBeforeYesterday.setExecutionPeriod(new Period(dayBeforeYesterday(), null));

		Task taskStartedYesterday = new Task();
		taskStartedYesterday.setType(TaskType.FEED_DOG);
		taskStartedYesterday
				.setDescription("voeder de honden, vergeet het water niet");
		taskStartedYesterday.setExecutionPeriod(new Period(yesterday(), null));

		Task taskStartedToday = new Task();
		taskStartedToday.setType(TaskType.FEED_DOG);
		taskStartedToday
				.setDescription("voeder de honden, vergeet het water niet");
		taskStartedToday.setExecutionPeriod(new Period(today(), null));

		Task taskNotStarted = new Task();
		taskNotStarted.setType(TaskType.FEED_DOG);
		taskNotStarted
				.setDescription("voeder de honden, vergeet het water niet");
		taskNotStarted.setExecutionPeriod(null);

		tasks.getTasks().add(taskStartedTheDayBeforeYesterday);
		tasks.getTasks().add(taskStartedYesterday);
		tasks.getTasks().add(taskStartedToday);
		tasks.getTasks().add(taskNotStarted);

		Set<Task> result = tasks.giveTasksStartedBeforeOfType(
				TaskType.FEED_DOG, yesterday());
		assertEquals(Collections.singleton(taskStartedTheDayBeforeYesterday), result);
	}

	@Test
	public void giveTasksStartedBeforeOfType_returnsOnlyTasksOfCorrectType() {
		Tasks tasks = new Tasks();
		Task taskCorrectType = new Task();
		taskCorrectType.setType(TaskType.FEED_DOG);
		taskCorrectType
				.setDescription("voeder de honden, vergeet het water niet");
		taskCorrectType.setExecutionPeriod(new Period(dayBeforeYesterday(), null));

		Task taskOfWrongType = new Task();
		taskOfWrongType.setType(TaskType.MOW_LAWN);
		taskOfWrongType.setDescription("maai het gras, niet te laag");
		taskOfWrongType.setExecutionPeriod(new Period(dayBeforeYesterday(), null));

		tasks.getTasks().add(taskCorrectType);
		tasks.getTasks().add(taskOfWrongType);

		Set<Task> result = tasks.giveTasksStartedBeforeOfType(
				TaskType.FEED_DOG, yesterday());
		assertEquals(Collections.singleton(taskCorrectType), result);
	}

	@Test
	public void giveExecutedTasksSortedByExecutionPeriodOfType_returnsSortedExecutedTasks() {
		Tasks tasks = new Tasks();
		Task taskWithShortExecutionPeriod = new Task();
		taskWithShortExecutionPeriod.setType(TaskType.FEED_DOG);
		taskWithShortExecutionPeriod
				.setDescription("voeder de honden, vergeet het water niet");
		taskWithShortExecutionPeriod.setExecutionPeriod(new Period(dayBeforeYesterday(),
				yesterday()));

		Task taskWithMediumExecutionPeriod = new Task();
		taskWithMediumExecutionPeriod.setType(TaskType.FEED_DOG);
		taskWithMediumExecutionPeriod
				.setDescription("voeder de honden, vergeet het water niet");
		taskWithMediumExecutionPeriod.setExecutionPeriod(new Period(pastWeek(),
				yesterday()));

		Task taskWithLongExecutionPeriod = new Task();
		taskWithLongExecutionPeriod.setType(TaskType.FEED_DOG);
		taskWithLongExecutionPeriod
				.setDescription("voeder de honden, vergeet het water niet");
		taskWithLongExecutionPeriod.setExecutionPeriod(new Period(lastMonth(),
				today()));

		Task taskStartedButNotFinished = new Task();
		taskStartedButNotFinished.setType(TaskType.FEED_DOG);
		taskStartedButNotFinished
				.setDescription("voeder de honden, vergeet het water niet");
		taskStartedButNotFinished.setExecutionPeriod(new Period(dayBeforeYesterday(),
				null));

		Task taskNotstarted = new Task();
		taskNotstarted.setType(TaskType.FEED_DOG);
		taskNotstarted
				.setDescription("voeder de honden, vergeet het water niet");
		taskNotstarted.setExecutionPeriod(null);

		tasks.getTasks().add(taskWithShortExecutionPeriod);
		tasks.getTasks().add(taskWithMediumExecutionPeriod);
		tasks.getTasks().add(taskWithLongExecutionPeriod);
		tasks.getTasks().add(taskStartedButNotFinished);
		tasks.getTasks().add(taskNotstarted);

		List<Task> result = tasks
				.giveExecutedTasksSortedByExecutionPeriodOfType(TaskType.FEED_DOG);
		List<Task> expected = new ArrayList<Task>();
		expected.add(taskWithShortExecutionPeriod);
		expected.add(taskWithMediumExecutionPeriod);
		expected.add(taskWithLongExecutionPeriod);
		assertEquals(expected, result);
	}

	@Test
	public void giveExecutedTasksSortedByExecutionPeriodOfType_returnsTasksOfTheCorrectType() {
		Tasks tasks = new Tasks();
		Task taskOfCorrectType = new Task();
		taskOfCorrectType.setType(TaskType.FEED_DOG);
		taskOfCorrectType
				.setDescription("voeder de honden, vergeet het water niet");
		taskOfCorrectType.setExecutionPeriod(new Period(dayBeforeYesterday(), yesterday()));

		Task taskOfIncorrectType = new Task();
		taskOfIncorrectType.setType(TaskType.FEED_CAT);
		taskOfIncorrectType.setDescription("voed de kat");
		taskOfIncorrectType
				.setExecutionPeriod(new Period(pastWeek(), yesterday()));

		tasks.getTasks().add(taskOfCorrectType);
		tasks.getTasks().add(taskOfIncorrectType);

		List<Task> result = tasks
				.giveExecutedTasksSortedByExecutionPeriodOfType(TaskType.FEED_DOG);
		assertEquals(singletonList(taskOfCorrectType), result);
	}
	
	@Test
	public void getTasksInExecutionOfType_returnsOnlyTasksThatAreStarted() {
		Tasks tasks = new Tasks();
		Task startedTask = new Task();
		startedTask.setType(TaskType.FEED_DOG);
		startedTask.setDescription("voeder de honden, vergeet het water niet");
		startedTask.setExecutionPeriod(new Period(yesterday(), null));
		
		Task solvedTask = new Task();
		solvedTask.setType(TaskType.FEED_DOG);
		solvedTask.setDescription("voeder de honden, vergeet het water niet");
		solvedTask.setExecutionPeriod(new Period(yesterday(), today()));
		
		Task taskToStart = new Task();
		taskToStart.setType(TaskType.FEED_DOG);
		taskToStart.setDescription("voeder de honden, vergeet het water niet");
		taskToStart.setExecutionPeriod(null);
		
		tasks.getTasks().add(startedTask);
		tasks.getTasks().add(solvedTask);
		tasks.getTasks().add(taskToStart);
		
		Set<Task> result = tasks.getTasksInExecutionOfType(TaskType.FEED_DOG);
		Set<Task> expected = new HashSet<Task>();
		expected.add(startedTask);
		expected.add(solvedTask);
		
		assertEquals(expected, result);
	}
	
	@Test
	public void getTasksInExecutionOfType_returnsOnlyTasksOfCorrectType() {
		Tasks tasks = new Tasks();
		Task taskOfCorrectType = new Task();
		taskOfCorrectType.setType(TaskType.FEED_DOG);
		taskOfCorrectType.setDescription("voeder de honden, vergeet het water niet");
		taskOfCorrectType.setExecutionPeriod(new Period(yesterday(), null));
		
		Task taskOfIncorrectType = new Task();
		taskOfIncorrectType.setType(TaskType.CUT_HEDGE);
		taskOfIncorrectType.setDescription("Scheer de haag, kuis alle takken op en probeer deze te hakselen");
		taskOfIncorrectType.setExecutionPeriod(new Period(yesterday(), null));
		
		tasks.getTasks().add(taskOfCorrectType);
		tasks.getTasks().add(taskOfIncorrectType);
		
		Set<Task> result = tasks.getTasksInExecutionOfType(TaskType.FEED_DOG);
		assertEquals(singleton(taskOfCorrectType), result);
	}

	private Date lastMonth() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(today());
		calendar.add(Calendar.MONTH, -1);
		return new Date(calendar.getTimeInMillis());
	}

	private Date pastWeek() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(today());
		calendar.add(Calendar.DAY_OF_MONTH, -7);
		return new Date(calendar.getTimeInMillis());
	}

	private Date dayBeforeYesterday() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(today());
		calendar.add(Calendar.DAY_OF_MONTH, -2);
		return new Date(calendar.getTimeInMillis());
	}

	private Date yesterday() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(today());
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		return new Date(calendar.getTimeInMillis());
	}

	private Date today() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return new Date(calendar.getTimeInMillis());
	}

}
