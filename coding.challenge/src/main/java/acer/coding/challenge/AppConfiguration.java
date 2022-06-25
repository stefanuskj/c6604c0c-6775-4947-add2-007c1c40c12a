/**
 * 
 */
package acer.coding.challenge;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import acer.coding.challenge.beans.json.Properties;
import acer.coding.challenge.exception.MissingPropertiesException;


/**
 * @author stefanuskj
 *
 */
public class AppConfiguration {
	private static final String STUDENT_DATA_FILE_PATH = "student_data_file_path";
	private static final String ASSESSMENT_DATA_FILE_PATH = "assessment_data_file_path";
	private static final String QUESTION_DATA_FILE_PATH = "question_data_file_path";
	private static final String STUDENT_RESPONSE_DATA_FILE_PATH = "student_response_data_file_path";
	private static final String DEFAULT_PROPERTIES_FILE = "./properties/acer.properties";
	
	public static Properties initProperties() throws MissingPropertiesException, FileNotFoundException {
		Properties filePath = new Properties();
		Scanner fileReader = null;
		try {
			File propertiesFile = new File(DEFAULT_PROPERTIES_FILE);
			fileReader = new Scanner(propertiesFile);
			while (fileReader.hasNextLine()) {
				String line = fileReader.nextLine();
				String[] temp = line.split("=");
				String value = temp[1];
				String key = temp[0];
				if (key!=null || !value.equals("")) {
					if (key.equals(STUDENT_DATA_FILE_PATH)) {
						filePath.setStudentDataFilePath(value);
					}
					else if (key.equals(ASSESSMENT_DATA_FILE_PATH)) {
						filePath.setAssessmentDataFilePath(value);
					}
					else if (key.equals(QUESTION_DATA_FILE_PATH)) {
						filePath.setQuestionDataFilePath(value);
					}
					else if (key.equals(STUDENT_RESPONSE_DATA_FILE_PATH)) {
						filePath.setStudentResponseDataFilePath(value);
					}
				}
				else {
					throw new MissingPropertiesException("Missing "+key+" value");
				}
			}
		} finally {
			fileReader.close();
		}
		return filePath;
	}
}
