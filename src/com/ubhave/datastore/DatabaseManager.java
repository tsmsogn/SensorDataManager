package com.ubhave.datastore;

import android.content.Context;

import com.ubhave.datahandler.ESDataManager;
import com.ubhave.datahandler.except.DataHandlerException;
import com.ubhave.datastore.db.DBDataStorage;
import com.ubhave.sensormanager.ESException;

public class DatabaseManager extends ESDataManager
{
	public DatabaseManager(final Context context) throws ESException, DataHandlerException
	{
		super(context);
	}
	
	@Override
	protected DataStorageInterface getStorage()
	{
		return new DBDataStorage(context);
	}
}
