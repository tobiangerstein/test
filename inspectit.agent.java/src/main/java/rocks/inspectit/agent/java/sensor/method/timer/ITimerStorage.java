package rocks.inspectit.agent.java.sensor.method.timer;

import rocks.inspectit.agent.java.core.IObjectStorage;

/**
 * A {@link ITimerStorage} just accepts time data through {@link #addData(double, double)}.
 *
 * @author Patrice Bouillet
 *
 */
public interface ITimerStorage extends IObjectStorage {

	/**
	 * The only method, which is used to process the new time and cpu time value.
	 *
	 * @param time
	 *            The time value.
	 * @param cpuTime
	 *            The cpu time value.
	 */
	void addData(double time, double cpuTime);

}
