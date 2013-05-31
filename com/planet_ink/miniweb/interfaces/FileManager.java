package com.planet_ink.miniweb.interfaces;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
/*
Copyright 2012-2013 Bo Zimmerman

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

	   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
import java.io.FileNotFoundException;

/**
 * Manages File objects
 * @author Bo Zimmerman
 *
 */
public interface FileManager 
{
	/**
	 * Return the appropriate file separator for this fs
	 * @return the file separator string
	 */
	public char getFileSeparator();
	/**
	 * Create a file object from the given local path
	 * @param localPath the path c:\dljl\sdf\ format.
	 * @return a local File object
	 */
	public File createFileFromPath(String localPath);
	/**
	 * Create a file object from the given local path
	 * @param parent the parent path c:\dljl\sdf\ format.
	 * @param localPath the path c:\dljl\sdf\ format.
	 * @return a local File object
	 */
	public File createFileFromPath(File parent, String localPath);
	/**
	 * Read the data out out of the given file
	 * @param file the file to read
	 * @return
	 */
	public byte[] readFile(File file) throws IOException, FileNotFoundException;
	
	/**
	 * Return a readable input stream of the given files data
	 * @param file the file to read
	 * @return an open input stream for reading.
	 */
	public InputStream getFileStream(File file) throws IOException, FileNotFoundException;
	
	/**
	 * Returns whether the given file can be randomly accessed
	 * @return true if it can, or false otherwise
	 */
	public boolean supportsRandomAccess(File file);

	/**
	 * Return a readable input stream of the given files data
	 * @param file the file to read
	 * @return an open input stream for reading.
	 */
	public RandomAccessFile getRandomAccessFile(File file) throws IOException, FileNotFoundException;
}