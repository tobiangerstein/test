package rocks.inspectit.agent.java.connection.impl;

import java.util.List;

import rocks.inspectit.agent.java.connection.AbstractRemoteMethodCall;
import rocks.inspectit.shared.all.cmr.service.IAgentStorageService;
import rocks.inspectit.shared.all.communication.DefaultData;

/**
 * Class which encapsulates the request to the remote object {@link IAgentStorageService}.
 *
 * @author Patrice Bouillet
 *
 */
public class AddDataObjects extends AbstractRemoteMethodCall<IAgentStorageService, Void> {

	/**
	 * A list containing our measurements we want to send.
	 */
	private final List<? extends DefaultData> dataObjects;

	/**
	 * The only constructor for this class accepts 2 attributes. The first one is the remote object,
	 * which will be used to send the data. The second one, a {@link List} of measurements, is the
	 * actual data.
	 *
	 * @param repository
	 *            The remote object.
	 * @param dataObjects
	 *            The {@link List} of data objects to send.
	 */
	public AddDataObjects(IAgentStorageService repository, List<? extends DefaultData> dataObjects) {
		super(repository);
		this.dataObjects = dataObjects;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Void performRemoteCall(IAgentStorageService remoteObject) {
		remoteObject.addDataObjects(dataObjects);
		return null;
	}

}
