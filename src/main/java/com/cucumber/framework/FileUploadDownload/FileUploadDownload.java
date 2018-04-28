package com.cucumber.framework.FileUploadDownload;

import java.io.IOException;

import com.cucumber.framework.helper.ConfigSettings.ConfigurationReader;
import com.cucumber.framework.helper.ConfigSettings.PropFileReading;

public class FileUploadDownload {
	ConfigurationReader obj=new PropFileReading();
	
	public void FileUploading() throws Exception
	{
		Runtime.getRuntime().exec(obj.getAutoItExeFileUploadPath());
	}
	
	public void FileDownloading() throws Exception
	{
		Runtime.getRuntime().exec(obj.getAutoItExeFileDownloadPath());
	}

}
